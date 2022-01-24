package com.yk.demo4;

import com.yk.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //被代理 的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到的代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理实质，就是使用反射机制实现
        Object result = method.invoke(target, args);
        return result;
    }
}