package com.management.service;

import com.management.mapper.UserMapper;
import com.management.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;

    public boolean login(User user) {

        return userMapper.login(
                user.getName(),
                user.getPassword()
        ) != null;
    }

    public boolean register(User user) {
        User existingUser = userMapper.getUserByUsername(user.getName());
        if (existingUser == null) {
            userMapper.register(user.getName(),user.getPassword());
            return true;
        }
        return false;
    }

}
