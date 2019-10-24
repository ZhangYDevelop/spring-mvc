package com.zy.springmvc.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author zhangy
 * @Date 10:16 2019/10/24
 *  登录验证码处理
 **/
public class ImageCodeAuthencationFilter extends OncePerRequestFilter {

    private  MyAuthenticationFailureHandler myAuthenticationFailureHandler;

    private  boolean isOpenImageCodeCheck;

    public void setOpenImageCodeCheck(boolean openImageCodeCheck) {
        isOpenImageCodeCheck = openImageCodeCheck;
    }

    public void setMyAuthenticationFailureHandler(MyAuthenticationFailureHandler myAuthenticationFailureHandler) {
        this.myAuthenticationFailureHandler = myAuthenticationFailureHandler;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if(request.getRequestURI().contains("/login") && request.getMethod().equals("POST") && isOpenImageCodeCheck) {
            try{
                String imageCode = request.getParameter("userCode");
                String key = (String) request.getSession().getAttribute("randCheckCode");
                if (StringUtils.isEmpty(imageCode)) {
                    throw new ImageCodeAuthencationException("请输入验证码");
                }
                if(!key.trim().equals(imageCode)) {
                    throw new ImageCodeAuthencationException("验证码错误");
                }
            }catch (AuthenticationException e) {
                myAuthenticationFailureHandler.onAuthenticationFailure(request,response,e);
                return;
            }
        }
        filterChain.doFilter(request,response);
    }
}
