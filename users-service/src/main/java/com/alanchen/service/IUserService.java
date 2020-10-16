package com.alanchen.service;

import com.alanchen.pojo.User;

/**
 * @author Alan Chen
 * @description
 * @date 2020/10/15
 */
public interface IUserService {

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    User getUser(String id);
}
