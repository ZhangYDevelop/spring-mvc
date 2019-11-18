package com.zy.springmvc.service;

import com.zy.springmvc.domain.ModulePermissionUserRelation;
import com.zy.springmvc.domain.SysModule;

import java.util.List;
import java.util.Map;

/**
 * @AUTHOR zhangy
 * 2019-11-04  21:33
 */
public interface SysModuleService {

    int deleteByPrimaryKey(String id);

    int insert(SysModule record);

    int insertSelective(SysModule record);

    SysModule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysModule record);

    int updateByPrimaryKey(SysModule record);

    /**
     * 根据查询菜单列表
     * @return
     */
    List<SysModule> getAllSysModule();

    /**
     * 根据用户名查询用户拥有的菜单列表
     * @param username
     * @return
     */
    List<ModulePermissionUserRelation> getAllSysModulePermissionByUserName(String username);
}
