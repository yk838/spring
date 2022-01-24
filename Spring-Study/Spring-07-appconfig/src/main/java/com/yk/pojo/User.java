package com.yk.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//这个注解就是说明这个类被Spring接管了，注册到了容器
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("yk")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}