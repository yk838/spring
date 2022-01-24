package com.yk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {
    @RequestMapping("/e/t")
    public String test(String name, Model model) {
        model.addAttribute("msg", name);
        return "hello";
    }
}