package com.zhuoke.shardingjdbc.controller;
import com.zhuoke.shardingjdbc.entity.User;
import com.zhuoke.shardingjdbc.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Api
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserMapper userMapper;


    // 写
    @GetMapping("/save")
    public String insert() {
        User user = new User();
        user.setNickname("zhangsan"+ new Random().nextInt());
        user.setPassword("1234567");
        user.setSex(1);
        user.setBirthday(new Date());
        userMapper.addUser(user);
        return "success";
    }


    // 读 -- Random
    @ApiOperation(value = "用户查询",notes = "获取所有的用户")
    @GetMapping("/listuser")
    public List<User> listuser() {
        return userMapper.findUsers();
    }
}