package com.alanchen.service.impl;

import com.alanchen.mapper.UserMapper;
import com.alanchen.pojo.User;
import com.alanchen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Alan Chen
 * @description
 * @date 2020/10/15
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    public User getUser(String id) {
        return userMapper.get(id);
    }
}
