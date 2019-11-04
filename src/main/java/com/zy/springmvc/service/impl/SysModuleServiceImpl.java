package com.zy.springmvc.service.impl;

import com.zy.springmvc.domain.SysModule;
import com.zy.springmvc.mapper.SysModuleMapper;
import com.zy.springmvc.service.SysModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @AUTHOR zhangy
 * 2019-11-04  21:34
 */
@Service
public class SysModuleServiceImpl implements SysModuleService {

    @Autowired
    private SysModuleMapper sysModuleMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysModuleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysModule record) {
        return sysModuleMapper.insert(record);
    }

    @Override
    public int insertSelective(SysModule record) {
        return sysModuleMapper.insertSelective(record);
    }

    @Override
    public SysModule selectByPrimaryKey(String id) {
        return sysModuleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysModule record) {
        return sysModuleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysModule record) {
        return sysModuleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SysModule> getAllSysModule() {
        return sysModuleMapper.getAllSysModule();
    }
}
