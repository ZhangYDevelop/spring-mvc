package com.zy.springmvc.security;

import com.zy.springmvc.service.UserService;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author zhangy
 * @Date 16:07 2019/10/11
 *
 * 用户密码验证
 **/
public class UserNamePasswarkAuthenticationFilter  extends UsernamePasswordAuthenticationFilter {

//    @Autowired
//    private UserService userService;

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        String username = obtainUsername(request);
        String password = obtainPassword(request);
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
        setDetails(request, authRequest);//允许子类设置详细属性
        return this.getAuthenticationManager().authenticate(authRequest);
    }
}
