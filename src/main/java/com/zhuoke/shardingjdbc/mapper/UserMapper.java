package com.zhuoke.shardingjdbc.mapper;
import com.zhuoke.shardingjdbc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {


    @Insert("insert into user(nickname,password,sex,birthday,age) values(#{nickname},#{password},#{sex},#{birthday},#{age})")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    void addUser(User user);


    @Select("select * from user")
    List<User> findUsers();
}