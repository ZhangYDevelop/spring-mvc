package com.zy.springmvc.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.domain.ModulePermissionUserRelation;
import com.zy.springmvc.domain.SysModule;
import com.zy.springmvc.domain.SysUser;
import com.zy.springmvc.service.SysModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author zhangy
 * @Date 19:01 2019/11/7
 **/
@Controller
@RequestMapping(value = "/platform")
public class SysMenueController {

    @Autowired
    private SysModuleService sysModuleService;

    @RequestMapping("/sysmodule/getAllSysModule")
    @ResponseBody
    public String getSysModule() {
        //SysUser sysUser = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<ModulePermissionUserRelation> sysModulesList =  sysModuleService.getAllSysModule(null);
        return JSONObject.toJSON(sysModulesList).toString() ;
    }
}
