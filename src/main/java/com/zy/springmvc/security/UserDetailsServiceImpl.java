package com.zy.springmvc.security;

import com.zy.springmvc.domain.Permission;
import com.zy.springmvc.domain.User;
import com.zy.springmvc.mapper.UserMapper;
import com.zy.springmvc.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.*;

/**
 * @Author zhangy
 * @Date 16:31 2019/10/11
 **/
public class UserDetailsServiceImpl implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(MyAuthenticationFailureHandler.class);

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // 查询用户
        User user = userService.getUserByName(userName);
        if (null != user) {
            // 查询用户拥有的权限标志符
            List<Permission> permissionList = userService.getUserPermissionByUserName(userName);
            Set<GrantedAuthority> grantedAuthorityList = new HashSet<>();
//            for (Permission permission : permissionList) {
//                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getPerm_tag());
//                grantedAuthorityList.add(grantedAuthority);
//            }
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority ("USER_ROLE2");
            grantedAuthorityList.add(grantedAuthority);
            user.setAuthorities(grantedAuthorityList);
            logger.info("登录用户： "  + user);
            return user;
        } else {
            throw new MyAuthencationException("用户不存在");
        }
    }
}
