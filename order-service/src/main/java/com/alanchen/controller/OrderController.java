package com.alanchen.controller;

import com.alanchen.pojo.Order;
import com.alanchen.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Alan Chen
 * @description
 * @date 2020/10/15
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    IOrderService orderServiceImpl;

    @GetMapping("/{productId}/{userId}")
    public Order saveOrder(@PathVariable String productId, @PathVariable String userId){
        return orderServiceImpl.makeOrder(productId,userId);
    }
}
