package com.yuan.Service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查找了一个用户");
    }
}
