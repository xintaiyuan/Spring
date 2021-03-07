package com.yuan.demo2;

public class UserServiceProxy implements UserService{

    //真实角色的对象
    private UserServiceImpl userService;
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void update() {
        log("update");
       userService.update();
    }

    @Override
    public void delete() {
        log("delete");
       userService.delete();
    }

    @Override
    public void query() {
        log("query");
      userService.query();
    }

    //生成一个log方法
    public void log(String msg) {
        System.out.println("[debug]使用了" + msg + "方法");
    }
}
