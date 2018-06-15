package com.springbootspringmvcmybatis.dao;

import com.springbootspringmvcmybatis.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    //添加
    void insert(User user);
    //查询用户
    List<User> selectUserAll();
    //根据ID查询
    User findUserById(Integer id);
    //修改
    void updateUser(User user);
    //删除
    void deleteUserById(Integer id);
}
