package com.alanchen.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author Alan Chen
 * @description
 * @date 2020/10/15
 */
@Data
public class Order {

    private String id;

    private String orderNumber;

    private Double price;

    private String img;

    private Date createTime;

    private String userId;

    private String userName;

    private String productId;
}
