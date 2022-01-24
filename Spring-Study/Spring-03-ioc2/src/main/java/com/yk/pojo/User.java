package com.yk.pojo;

import javax.naming.Name;
import java.sql.SQLOutput;

public class User {
    private String name;
   /* public User(){
        System.out.println("user无参函数被创建了");
    }*/
    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+name);
    }
}