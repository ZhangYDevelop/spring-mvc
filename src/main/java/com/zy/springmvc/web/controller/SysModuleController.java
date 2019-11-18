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
import java.util.*;
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
        List<SysModule> sysModulesList =  sysModuleService.getAllSysModule();
        return JSONObject.toJSON(sysModulesList).toString() ;
    }

    @RequestMapping("/sysmodule/getAllSysModuleJson")
    @ResponseBody
    public String getSysModuleJson() {
        List<SysModule> sysModulesList =  sysModuleService.getAllSysModule();
        List<SysModule> parentList = sysModulesList.stream().filter(item -> "0".equals(item.getParentModule())).collect(Collectors.toList());
        List<Map<String, Object>> retList = new ArrayList<>();
        for (SysModule item : parentList) {
             Map<String, Object> map = new HashMap<>();
             map.put("moduleName", item.getModuleName());
             map.put("id", item.getId());
             List<SysModule> children = new ArrayList<>();
             children = sysModulesList.stream().filter(data -> data.getParentModule().equals(item.getId())).collect(Collectors.toList());
             map.put("childern", children);
             retList.add(map);
        }
        return JSONObject.toJSON(retList).toString() ;
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
    public String addModel(@RequestParam Map map) {
        try {
            SysModule sysUser  = MapUtils.map2bean(map, SysModule.class);
            sysUser.setId(UUID.randomUUID().toString());
            sysModuleService.insert(sysUser);
            Result result= new Result();
            result.setSuccess(true);
            result.setData(sysUser);
            return JSONObject.toJSON(result).toString() ;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return  null;
    }

    /**
     * 新增模块
     * @return
     */
    @RequestMapping("/sysmodule/delModel")
    @ResponseBody
    public String delSysModule(@RequestParam Map map) {
       String id = (String)map.get("id");
       sysModuleService.deleteByPrimaryKey(id);
        Result result= new Result();
        result.setSuccess(true);
        return JSONObject.toJSON(result).toString() ;
    }

}
