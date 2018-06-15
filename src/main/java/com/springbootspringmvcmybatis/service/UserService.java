package com.springbootspringmvcmybatis.service;

import com.springbootspringmvcmybatis.pojo.User;

import java.util.List;

public interface UserService {
    void add(User user);
    //查询用户
    List<User> selectUserAll();
    //根据ID查询
    User findUserById(Integer id);
    //修改
    void updateUser(User user);
    //删除
    void deleteUserById(Integer id);
}
