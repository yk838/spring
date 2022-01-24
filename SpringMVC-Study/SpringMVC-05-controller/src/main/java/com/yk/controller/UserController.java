package com.yk.controller;

import com.yk.pojo.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @RequestMapping("getUser")
    public String getUser(User user){
        System.out.println(user);
        return "hello";
    }
    @RequestMapping("/t")
    public String test(@RequestParam("username") String name){
        System.out.println(name);
        return "hello";
    }
}