package com.alanchen.mapper;

import com.alanchen.pojo.Order;
import org.springframework.stereotype.Repository;

/**
 * @author Alan Chen
 * @description
 * @date 2020/10/15
 */
@Repository
public class OrderMapper {

    public void insert(Order order){
        System.out.println("订单插入数据库成功");
    }
}
