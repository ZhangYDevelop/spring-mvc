package com.zy.springmvc.mapper;


import com.zy.springmvc.domain.SysUser;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser getSysUserByUserName(String username);

    List<SysUser> getAllUser() ;
}