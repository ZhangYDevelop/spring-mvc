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

    List<ModulePermissionUserRelation> getAllSysModule(String username);
}
