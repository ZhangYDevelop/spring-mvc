package com.zy.springmvc.mapper;

import com.zy.springmvc.domain.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}