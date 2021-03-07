package com.yuan.demo1;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        SeeHouse();
        hetong();
        fare();

    }

    public void SeeHouse() {
        System.out.println("看房子");
    }
    public void hetong() {
        System.out.println("合同");
    }
    public void fare() {
        System.out.println("收取中介费");
    }
}
