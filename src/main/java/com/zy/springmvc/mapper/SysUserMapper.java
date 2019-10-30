package com.zy.springmvc.mapper;

import com.zy.springmvc.domain.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(int id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser getSysUserByUserName(String username);
}