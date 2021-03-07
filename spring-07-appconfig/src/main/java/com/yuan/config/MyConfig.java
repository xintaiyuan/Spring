package com.yuan.config;

import com.yuan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //代表这是一个配置类，相当于beans.xml
@ComponentScan("com.yuan.pojo")  //ComponentScan和Component配合使用
public class MyConfig {
    @Bean
    public User getUser() {
        return new User();
    }
}

/*
* 两种方式：1.@ComponentScan和@Component配合使用
*          2.@Bean
*
*
* */
