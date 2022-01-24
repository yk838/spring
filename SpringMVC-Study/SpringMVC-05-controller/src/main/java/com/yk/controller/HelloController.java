package com.yk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HelloController")
public class HelloController {
    @RequestMapping("/t1")
    public String test(Model model){
        model.addAttribute("msg","yangkai");
        return "hello";
    }
    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg","yangkai2");
        return "hello";
    }
}