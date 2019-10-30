package com.zy.springmvc.service.impl;

import com.zy.springmvc.domain.SysPermission;
import com.zy.springmvc.domain.SysUser;
import com.zy.springmvc.domain.User;
import com.zy.springmvc.mapper.SysUserMapper;
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
    private  SysUserMapper sysUserMapperl;


    @Override
    public int deleteByPrimaryKey(int id) {
        return sysUserMapperl.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUser record) {
        return sysUserMapperl.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        return sysUserMapperl.insert(record);
    }

    @Override
    public SysUser selectByPrimaryKey(int id) {
        return sysUserMapperl.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapperl.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapperl.updateByPrimaryKey(record);
    }

    @Override
    public SysUser getSysUserByUserName(String username) {
        return sysUserMapperl.getSysUserByUserName(username);
    }
}
