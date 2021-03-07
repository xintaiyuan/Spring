package com.yuan.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy Proxy = new UserServiceProxy();
        Proxy.setUserService(userService);
        Proxy.add();
    }
}
