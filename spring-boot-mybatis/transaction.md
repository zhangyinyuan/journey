# Spring事务的传播行为
> REQUIRED(0)
1) 在事务中执行.如果存在事务就在当前事务执行;如果不存在事务就创建新的事务
2) ServiceA中methodA调用ServiceB中的methodB,如果两个方法都使用REQUIRED,methodB出现异常但是自己捕获了,methodA会正常提交,methodB ???
3) 继1),如果methodB出现异常,没有捕获,则异常会传递到methodA

```
//假设cityService 中调用 userService.insertSelective
//如果 userService.insertSelective 没有异常,那么这个事务会正常提交
//如果 userService.insertSelective 方法内出现了异常并且userService.insertSelective方法内部并没有try...catch,userService.insertSelective也会回滚,因为userService.insertSelective这个方法是个事务级别的方法,不是普通方法,这时,需要注意cityService的方法和userService的方法是不是同一个事务,如果是同一个事务,那么cityService和userService同时回滚,如果是不同的事务,那么只回滚userService.
try {
    int insertSelective = userService.insertSelective(user);
    "".substring(10);
} catch (Exception e) {
    e.printStackTrace();
}
```

> SUPPORTS(1)
- 有事务则在事务中执行,没有事务则以非事务方式执行
> MANDATORY(2)
- 只能在事务中执行,如果当前没有事务,则抛出异常 
> REQUIRES_NEW(3)
- 总是在创建新的事务
> NOT_SUPPORTED(4)
- 非事务方式执行.如果当前存在事务,则挂起当前事务
> NEVER(5)
- 非事务方式执行.存在事务,则抛出异常
> NESTED(6)
- Nested 潜套事务是外部事务的一部分,只有外部事务结束后它才会被提交。假设父事务最后回滚,他也要回滚的。

---

> *** 手动回滚当前事务,Spring内部使用异常处理.不会传递异常到外层的事务
```
TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
``` 

====
 ---
# 事务的隔离级别




- [Spring事务的一些特性](https://www.cnblogs.com/think-in-java/p/7763443.html)

- [Spring事务传播级别隔离级别以及高并发下的应用经验](https://dylanxu.iteye.com/blog/1403038)