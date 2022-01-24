package com.yk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author yk
 * @date 2021/6/30  18:34
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/goLogin")
    public String login(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        //把用户信息绑定session中
        session.setAttribute("userLoginInfo", username);
        model.addAttribute("username", username);
        return "main";
    }
    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        //把用户信息绑定session中移除
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}