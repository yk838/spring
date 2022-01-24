package com.yk.demo03;

public class Client {
    public static void main(String[] args) {
        //真是角色
        Host host = new Host();
        
        //代理角色 ；现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理我们要调用的接口对象！
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}