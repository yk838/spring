package com.yk.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author yk
 * @date 2021/6/30  21:09
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断什么情况下，登入
        //1.登入页面也会放行
        HttpSession session = request.getSession();
        if(request.getRequestURI().contains("goLogin")){
            return true;
        }
        //2.能获得到Session信息 userInfo（username password）
        if (session.getAttribute("userLoginInfo")!=null){
            return true;
        }
        //3.第一次登入，也是没有session的
        if(request.getRequestURI().contains("login")){
            return true;
        }
        //判断什么情况下没有登入
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}