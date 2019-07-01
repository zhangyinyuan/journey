package com.yuan.ngu.springbootmybatis.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSourceOne() {
        return DruidDataSourceBuilder.create().build();
    }

//    @Bean
//    @ConfigurationProperties("spring.datasource.druid.two")
//    public DataSource dataSourceTwo() {
//        return DruidDataSourceBuilder.create().build();
//    }
}
