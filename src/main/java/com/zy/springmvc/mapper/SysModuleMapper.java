package com.zy.springmvc.mapper;

import com.zy.springmvc.domain.SysModule;

public interface SysModuleMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysModule record);

    int insertSelective(SysModule record);

    SysModule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysModule record);

    int updateByPrimaryKey(SysModule record);
}