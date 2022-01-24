package com.yk.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //逻辑代码
        String result = "杨凯真帅";
        modelAndView.addObject("msg", result);
        //视图
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}