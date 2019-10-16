package com.zy.springmvc.security;

import com.zy.springmvc.domain.User;
import com.zy.springmvc.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author zhangy
 * @Date 16:31 2019/10/11
 **/
public class UserDetailsServiceImpl implements UserDetailsService {

    private Log logger = LogFactory.getLog(UserDetailsServiceImpl.class);

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
//        org.springframework.security.core.userdetails.User userDetails = null;
//
//        User user = userService.getUserByUserName(account);
//
//        boolean enables = true; //true;
//        boolean accountNonExpired = true;
//        boolean credentialsNonExpired = true;
//        boolean accountNonLocked = true; //true;
//
//        userDetails = new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassWard()
//                .toLowerCase(), enables, accountNonExpired, credentialsNonExpired, accountNonLocked,
//                getGrantedAuthorities(user));
//        return userDetails;

        org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User("zhangyu", "123", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));

        return user;
    }


    /**
     * 根据用户获取该用户拥有的角色
     * @param user 系统用户对象
     * @return
     */
    private Collection<GrantedAuthority> getGrantedAuthorities(User user) {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        /*List<Role> roles = roleMapper.selectByUserId(user.getId());
        if(roles != null) {
            for(Role role : roles) {
                grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
            }
        }*/
        // 所有的用户默认拥有ROLE_USER权限
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        //if(userService.isSuperUser(user.getUserName())){
        if(true){
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN")); //如果是系统管理员则拥有ROLE_ADMIN权限
        }
        return grantedAuthorities;
    }
}
