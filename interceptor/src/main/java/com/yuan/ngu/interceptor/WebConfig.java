package com.yuan.ngu.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    public WebConfig() {
        super();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 添加自定义的目录,使得 spring boot 能够直接访问
        // resource下的static目录是spring boot默认的静态资源目录,可以直接访问,所以不需要手动添加.但是访问的时候不需要加 static.如:http://localhost:8080/2.css
        // template是动态资源目录,不能直接访问.访问的时候需要加自定义文件夹名称 .如:http://localhost:8080/custom/custom.html
        registry.addResourceHandler("/custom/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/custom/");
        super.addResourceHandlers(registry);
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/login.html", "/*.css");
        super.addInterceptors(registry);
    }
}
