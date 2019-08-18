package com.zy.springmvc.service;

import com.alibaba.fastjson.JSON;
import com.zy.springmvc.entity.OperateLog;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR zhangy
 * 2019-06-02  10:25
 */
@Service
public class SysLogServeve {

    public OperateLog saveLog (OperateLog log) {
        System.out.println("日志保存成功");
        System.out.println(JSON.toJSON(log));
        return  log;
    }
}
