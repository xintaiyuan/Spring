package com.yuan.demo1;

public class Client {
    public static void main(String[] args) {
        //Host host = new Host();
        Proxy proxy = new Proxy(new Host());
        proxy.rent();

    }
}
