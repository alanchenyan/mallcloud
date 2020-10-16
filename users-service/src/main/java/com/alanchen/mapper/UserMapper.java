package com.alanchen.mapper;

import com.alanchen.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author Alan Chen
 * @description
 * @date 2020/10/15
 */
@Repository
public class UserMapper {

    public User get(String id){
        User user = new User();
        user.setId("1");
        user.setUserName("AC");

        return user;
    }
}
