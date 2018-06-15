package com.springbootspringmvcmybatis.controller;

import com.springbootspringmvcmybatis.pojo.User;
import com.springbootspringmvcmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 页面跳转,访问路径如：http://127.0.0.1:8080/mybatis/users/input
     */
    @RequestMapping(value = "/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    //添加
    @RequestMapping(value = "/add")
    public String add(User user){
        this.userService.add(user);
        return "ok";
    }

    //查询所有
    @RequestMapping(value = "/findAll")
    public String findUserAll(Model m){
        List<User> list = userService.selectUserAll();
        m.addAttribute("list",list);
        return "showUsers";
    }

    //修改时数据回显
    @RequestMapping(value = "/findUserById")
    public String findUserById(Model m,Integer id){
        User user = userService.findUserById(id);
        m.addAttribute("user",user);
        return "updateUsers";
    }
    //修改
    @RequestMapping(value = "/update")
    public String updateUser(User user){
        this.userService.updateUser(user);
        return "ok";
    }
    //删除
    @RequestMapping(value = "/delete")
    public String deleteUser(Integer id){
        this.userService.deleteUserById(id);
        return "redirect:/users/findAll";
    }
}
