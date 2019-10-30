package com.zy.springmvc.service;

import com.zy.springmvc.domain.SysPermission;
import com.zy.springmvc.domain.SysUser;
import com.zy.springmvc.domain.User;

import java.util.List;

/**
 * @Author zhangy
 * @Date 20:05 2019/10/10
 **/
public interface UserService {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}
