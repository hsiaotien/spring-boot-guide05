package com.dev.guide05.service.impl;

import com.dev.guide05.mapper.UserMapper;
import com.dev.guide05.pojo.User;
import com.dev.guide05.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {

        return userMapper.getUserById(id);
    }

}
