package com.springbootspringmvcmybatis.service.impl;

import com.springbootspringmvcmybatis.dao.UserMapper;
import com.springbootspringmvcmybatis.pojo.User;
import com.springbootspringmvcmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        this.userMapper.insert(user);
    }

    @Override
    public List<User> selectUserAll() {
        List<User> list = userMapper.selectUserAll();
        return list;
    }

    @Override
    public User findUserById(Integer id) {
        return this.userMapper.findUserById(id);
    }

    @Override
    public void updateUser(User user) {
        this.userMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        this.userMapper.deleteUserById(id);
    }
}
