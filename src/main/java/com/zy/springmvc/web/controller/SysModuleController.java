package com.zy.springmvc.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.common.MapUtils;
import com.zy.springmvc.domain.ModulePermissionUserRelation;
import com.zy.springmvc.domain.Result;
import com.zy.springmvc.domain.SysModule;
import com.zy.springmvc.domain.SysUser;
import com.zy.springmvc.service.SysModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @Author zhangy
 * @Date 19:01 2019/11/7
 **/
@Controller
@RequestMapping(value = "/platform")
public class SysModuleController {

    @Autowired
    private SysModuleService sysModuleService;

    @RequestMapping("/sysmodule/getAllSysModule")
    @ResponseBody
    public String getSysModule() {
        //SysUser sysUser = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<ModulePermissionUserRelation> sysModulesList =  sysModuleService.getAllSysModule();
        return JSONObject.toJSON(sysModulesList).toString() ;
    }

    /**
     * 用户列表
     * @return
     */
    @RequestMapping("/module/list")
    public ModelAndView userList() {
        return new ModelAndView("/platform/module/moduleList");
    }

    /**
     * 新增模块
     * @return
     */
    @RequestMapping("/sysmodule/addModel")
    @ResponseBody
    public String getSysModule(@RequestParam Map map) {
        try {
            SysModule sysUser  = MapUtils.map2bean(map, SysModule.class);
            sysUser.setId(UUID.randomUUID().toString());
            sysModuleService.insert(sysUser);
            Result result= new Result();
            result.setSuccess(true);
            result.setData(sysUser);
            return JSONObject.toJSON(sysUser).toString() ;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return  null;
    }

}
