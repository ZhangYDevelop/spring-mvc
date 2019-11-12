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
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        List<ModulePermissionUserRelation> retList = new ArrayList<>();
        List<ModulePermissionUserRelation> sysModulesList =  sysModuleService.getAllSysModule(null);
        List<String> idList = null;
        for (ModulePermissionUserRelation relation : sysModulesList) {
            idList = retList.stream().map(item -> item.getId()).collect(Collectors.toList());
            if (!idList.contains(relation.getId())) {
                retList.add(relation);
            }
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
}
