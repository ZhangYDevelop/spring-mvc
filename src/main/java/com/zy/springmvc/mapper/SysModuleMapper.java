package com.zy.springmvc.mapper;

import com.zy.springmvc.domain.SysModule;

import java.util.List;

public interface SysModuleMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysModule record);

    int insertSelective(SysModule record);

    SysModule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysModule record);

    int updateByPrimaryKey(SysModule record);

    /**
     * 根据用户名查询用户拥有的菜单列表
     * @param username
     * @return
     */
    List<SysModule> getAllSysModule(String username);
}