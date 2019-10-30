package com.zy.springmvc.service.impl;

import com.zy.springmvc.domain.SysPermission;
import com.zy.springmvc.domain.SysUser;
import com.zy.springmvc.domain.User;
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


    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(SysUser record) {
        return 0;
    }

    @Override
    public int insertSelective(SysUser record) {
        return 0;
    }

    @Override
    public SysUser selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return 0;
    }
}
