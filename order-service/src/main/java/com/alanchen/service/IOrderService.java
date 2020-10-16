package com.alanchen.service;

import com.alanchen.pojo.Order;

/**
 * @author Alan Chen
 * @description
 * @date 2020/10/15
 */
public interface IOrderService {

    /**
     * 下单
     * @param productId
     * @param userId
     */
    Order makeOrder(String productId, String userId);
}
