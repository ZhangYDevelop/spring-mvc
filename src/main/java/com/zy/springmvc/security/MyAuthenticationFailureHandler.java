package com.zy.springmvc.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @Author zhangy
 * @Date 16:19 2019/10/11
 **/
public class MyAuthenticationFailureHandler   implements AuthenticationFailureHandler {

    private Log logger = LogFactory.getLog(MyAuthenticationFailureHandler.class);

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        logger.info("登录失败！");
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/api/platform/login");
    }
}
