package com.zy.springmvc.security;

import com.zy.springmvc.domain.ModulePermissionUserRelation;
import com.zy.springmvc.domain.SysModule;
import com.zy.springmvc.domain.SysUser;
import com.zy.springmvc.service.SysModuleService;
import com.zy.springmvc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @Author zhangy
 * @Date 16:31 2019/10/11
 **/
public class UserDetailsServiceImpl implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(MyAuthenticationFailureHandler.class);

    @Autowired
    private UserService userService;

    @Autowired
    private SysModuleService sysModuleService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // 查询用户
        SysUser user = userService.getSysUserByUserName(userName);
        if (null != user) {
            // 查询用户拥有的权限标志符
            List<ModulePermissionUserRelation> sysModulesList =  sysModuleService.getAllSysModule(user.getUsername());
            Set<GrantedAuthority> grantedAuthorityList = new HashSet<>();
            for (ModulePermissionUserRelation obj : sysModulesList) {
                String permissionCode = obj.getCode();
                if (!StringUtils.isEmpty(permissionCode)) { // 授权代码不能为空，否则报错
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permissionCode);
                    grantedAuthorityList.add(grantedAuthority);
                }
            }
            // 授权
            user.setAuthorities(grantedAuthorityList);
            logger.info("登录用户： "  + user);
            return user;
        } else {
            throw new MyAuthencationException("用户不存在");
        }
    }
}
