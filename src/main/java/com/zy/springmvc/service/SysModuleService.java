package com.zy.springmvc.service;

import com.zy.springmvc.domain.SysModule;

import java.util.List;

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

    List<SysModule> getAllSysModule(String username);
}
