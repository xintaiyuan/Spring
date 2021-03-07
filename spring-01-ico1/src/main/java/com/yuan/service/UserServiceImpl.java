package com.yuan.service;

import com.yuan.dao.UserDao;

public class UserServiceImpl  implements UserService{


    //利用set进行动态实现值的注入
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
       this.userDao=userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();

    }
}
