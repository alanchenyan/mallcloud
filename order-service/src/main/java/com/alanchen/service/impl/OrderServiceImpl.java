package com.alanchen.service.impl;

import com.alanchen.dto.UserDto;
import com.alanchen.mapper.OrderMapper;
import com.alanchen.pojo.Order;
import com.alanchen.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.UUID;

/**
 * @author Alan Chen
 * @description
 * @date 2020/10/15
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Order makeOrder(String productId, String userId) {

        /**
         * RestTemplate是java创造出来的，在java能够访问到网络资源的包是java.net.URLConnenction/Socket
         * RestTemplate是对URLConnenction的封装
         * apache--HttpClient 也是对URLConnenction/HttpURLConnenction的封装
         * oKHttp 也封装了URLConnenction
         * netty/rpc/grpc/thirt/tomcat
         */

        // 1、根据用户ID调用用户服务接口数据，查询用户的名字
        String userServiceURL = "http://127.0.0.1:8082/users/{userId}";
        UserDto userDto = restTemplate.getForObject(userServiceURL,UserDto.class,userId);
        String userName=userDto.getUserName();

        // 2、生成订单
        Order order = new Order();
        order.setId("100");
        order.setCreateTime(new Date());
        order.setPrice(16.8);
        order.setUserId(userId);
        order.setUserName(userName);
        order.setProductId(productId);
        order.setOrderNumber(UUID.randomUUID().toString());

        // 3、保存数据库
        orderMapper.insert(order);

        return order;
    }
}
