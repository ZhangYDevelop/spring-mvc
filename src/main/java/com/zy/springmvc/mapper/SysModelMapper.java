package com.zy.springmvc.mapper;

import com.zy.springmvc.domain.SysModel;

public interface SysModelMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysModel record);

    int insertSelective(SysModel record);

    SysModel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysModel record);

    int updateByPrimaryKey(SysModel record);
}