package com.zy.springmvc.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author zhangy
 * @Date 20:19 2019/10/10
 **/
public class UrlEntryPoint  implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        String targetUrl = null;
        String url = httpServletRequest.getRequestURI();

        if(url.indexOf("admin") != -1){
            //未登录而访问后台受控资源时，跳转到后台登录页面
            targetUrl = "/admin/usercontroller.do";
        }else{
            //未登录而访问前台受控资源时，跳转到前台登录页面
            targetUrl = "/api/platform/usercontroller";
        }

        targetUrl = httpServletRequest.getContextPath() + targetUrl;
        httpServletResponse.sendRedirect(targetUrl);
    }
}
