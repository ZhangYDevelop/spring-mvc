package com.zy.springmvc.security;

import com.zy.springmvc.domain.ModulePermissionUserRelation;
import com.zy.springmvc.domain.SysModule;
import com.zy.springmvc.service.SysModuleService;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @Author zhangy
 * @Date 17:15 2019/10/11
 **/
public class MySecurityMetadataSource implements
        FilterInvocationSecurityMetadataSource {
    private static Map<String, Collection<ConfigAttribute>> resourceMap = null;

    public MySecurityMetadataSource(SysModuleService sysModuleService){
        this.sysModuleService = sysModuleService;
        loadResourceDefine();
    }
    private final  SysModuleService sysModuleService;

    //加载所有资源与权限的关系
    private void loadResourceDefine() {
        if(resourceMap == null) {
            resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
            // 查询所有的模块下的权限点，将权限点加入到springsecurity权限框架中
            List<ModulePermissionUserRelation> sysModulesList =  sysModuleService.getAllSysModule(null);
            for (ModulePermissionUserRelation obj : sysModulesList) {
                String url = obj.getModuleUrl();
                String permissionCode = obj.getCode();
                if (!StringUtils.isEmpty(url)){
                    Collection<ConfigAttribute> configAttributes = new ArrayList<ConfigAttribute>();
                    //以权限名封装为Spring的security Object
                    ConfigAttribute configAttribute = new SecurityConfig(permissionCode);
                    configAttributes.add(configAttribute);
                    resourceMap.put(url, configAttributes);
                }
            }
        }
    }


    /**
     * 返回所请求资源所需要的权限
     */
    public Collection<ConfigAttribute> getAttributes(Object object)
            throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        // System.out.println("requestUrl is " + requestUrl);
        if(resourceMap == null) {
            loadResourceDefine();
        }
        return resourceMap.get(requestUrl);
    }

    public Collection<ConfigAttribute> getAllConfigAttributes() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean supports(Class<?> clazz) {
        // TODO Auto-generated method stub
        return true;
    }
}
