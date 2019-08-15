package com.yuan.ngu.spring.boot.redis.distributedlock;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

/**
 * redis 方案
 */
@Aspect
@Configuration
@Slf4j
public class LockMethodInterceptor {

    private final RedisTemplate lockRedisTemplate;
    private final CacheKeyGenerator cacheKeyGenerator;

    @Autowired
    public LockMethodInterceptor(RedisTemplate redisTemplate, CacheKeyGenerator cacheKeyGenerator) {
        log.info(".......... LockMethodInterceptor init ..........");
        this.lockRedisTemplate = redisTemplate;
        this.cacheKeyGenerator = cacheKeyGenerator;
    }

    @Around("execution(public * *(..)) && @annotation(com.yuan.ngu.spring.boot.redis.distributedlock.CacheLock)")
    public Object around(ProceedingJoinPoint pjp) {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        CacheLock lock = method.getAnnotation(CacheLock.class);
        if (StringUtils.isEmpty(lock.prefix())) {
            throw new RuntimeException("lock key can't be null...");
        }
        final String lockKey = cacheKeyGenerator.getLockKey(pjp);
        try {
            //key不存在才能设置成功
            //关于redis opsForValue 的方法 https://357029540.iteye.com/blog/2388965
            final Boolean success = lockRedisTemplate.opsForValue().setIfAbsent(lockKey, "");
            if (success) {
                lockRedisTemplate.expire(lockKey, lock.expire(), lock.timeUnit());
            } else {
                //按理来说 我们应该抛出一个自定义的 CacheLockException 异常;
                throw new RuntimeException("请勿重复请求");
            }
            try {
                return pjp.proceed();
            } catch (Throwable throwable) {
                throw new RuntimeException("系统异常");
            }
        } finally {
            //如果演示的话需要注释该代码;实际应该放开
            // lockRedisTemplate.delete(lockKey);
        }
    }
}
