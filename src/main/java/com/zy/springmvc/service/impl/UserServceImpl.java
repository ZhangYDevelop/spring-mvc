package com.zy.springmvc.service.impl;

import com.zy.springmvc.domain.Permission;
import com.zy.springmvc.domain.User;
import com.zy.springmvc.mapper.UserMapper;
import com.zy.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhangy
 * @Date 21:17 2019/10/29
 **/

@Service
public class UserServceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    @Override
    public List<Permission> getUserPermissionByUserName(String UserName) {
        return userMapper.getUserPermissionByUserName(UserName);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
