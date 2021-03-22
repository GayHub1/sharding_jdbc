package com.zhuoke.shardingjdbc.service;

import com.zhuoke.shardingjdbc.mapper.UserMapper;
import com.zhuoke.shardingjdbc.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserOrderService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserOrderMapper userOrderMapper;



}