package com.yk.config;

import com.yk.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //这个也是Spring 容器托管，注册到容器中去，因为它本身就是一个@Component，@@Configuration 代表一个配置类，就和我们之前看的beans.xml
@ComponentScan("com.yk.pojo")
public class YkConfig {
    //注解一个bean,  就相当于之前我们写的一个bean标签
    //这个方法的名字，就相当于bean标签中id属性，
    //这个方法的返回值，就相当于bean标签中class的属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入bean的对象
    }
}
