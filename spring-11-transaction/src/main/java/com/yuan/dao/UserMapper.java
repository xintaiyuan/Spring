package com.yuan.dao;

import com.yuan.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    int addUser(User user);

    int deleteUser(int id);
}
