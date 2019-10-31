package com.zy.springmvc.security;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import java.util.*;

/**
 * @Author zhangy
 * @Date 17:15 2019/10/11
 **/
public class MySecurityMetadataSource implements
        FilterInvocationSecurityMetadataSource {
    private static Map<String, Collection<ConfigAttribute>> resourceMap = null;

    public MySecurityMetadataSource(){
        loadResourceDefine();
    }

    //加载所有资源与权限的关系
    private void loadResourceDefine() {
        if(resourceMap == null) {
            resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
           /* List<Resources> resources = this.resourcesDao.findAll();
            for (Resources resource : resources) {
                Collection<ConfigAttribute> configAttributes = new ArrayList<ConfigAttribute>();
                //以权限名封装为Spring的security Object
                ConfigAttribute configAttribute = new SecurityConfig(resource.getName());
                configAttributes.add(configAttribute);
                resourceMap.put(resource.getUrl(), configAttributes);
            } */
            Collection<ConfigAttribute> configAttributes = new ArrayList<ConfigAttribute>();
            //以权限名封装为Spring的security Object
            ConfigAttribute configAttribute = new SecurityConfig("USER_ROLE2");
            configAttributes.add(configAttribute);
            resourceMap.put("/api/platform/main", configAttributes);

            configAttributes = new ArrayList<ConfigAttribute>();
            configAttribute = new SecurityConfig("USER_ROLE3");
            configAttributes.add(configAttribute);
            resourceMap.put("/api/platform/error", configAttributes);
        }

        Set<Map.Entry<String, Collection<ConfigAttribute>>> resourceSet = resourceMap.entrySet();
        Iterator<Map.Entry<String, Collection<ConfigAttribute>>> iterator = resourceSet.iterator();
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
