package com.yk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yk
 * @date 2021/6/30  18:04
 */
//测试拦截器的控制器
@Controller
public class InterceptorController {

    @RequestMapping("/interceptor")
    // @ResponseBody将jackson解析的字符串解析成json格式
    @ResponseBody
    public String testFunction() {
        System.out.println("控制器0+中的方法执行了");
        return "hello";
    }
}