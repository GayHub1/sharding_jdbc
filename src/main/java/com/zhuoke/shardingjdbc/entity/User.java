package com.zhuoke.shardingjdbc.entity;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    // 主键
    private Long id;
    // 昵称
    private String nickname;
    // 密码
    private String password;
    // 性别
    private Integer sex;
    // 年龄
    private Integer age;
    // 生日
    private Date birthday;
}