package com.zy.springmvc.mapper;

import com.zy.springmvc.domain.SysModel;
import com.zy.springmvc.domain.SysModelExample;
import java.util.List;

public interface SysModelMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysModel record);

    int insertSelective(SysModel record);

    List<SysModel> selectByExample(SysModelExample example);

    SysModel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysModel record);

    int updateByPrimaryKey(SysModel record);
}