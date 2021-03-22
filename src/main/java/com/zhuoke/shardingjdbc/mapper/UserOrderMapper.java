package com.zhuoke.shardingjdbc.mapper;
import com.zhuoke.shardingjdbc.entity.UserOrder;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserOrderMapper {

    @Insert("insert into ksd_user_order(ordernumber,userid,create_time,yearmonth) values(#{ordernumber},#{userid},#{createTime},#{yearmonth})")
    @Options(useGeneratedKeys = true,keyColumn = "orderid",keyProperty = "orderid")
    void addUserOrder(UserOrder userOrder);


    @Select("select * from ksd_user_order limit #{pageNo},10")
    List<UserOrder> finduserOrders(@Param("pageNo")Integer pageNo);


    @Select("select count(1) from ksd_user_order")
    int countuserOrders();
}