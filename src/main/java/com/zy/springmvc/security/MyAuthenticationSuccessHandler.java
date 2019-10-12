package com.zy.springmvc.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author zhangy
 * @Date 16:19 2019/10/11
 **/
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private Log logger = LogFactory.getLog(MyAuthenticationSuccessHandler.class);
    //登录验证成功后需要跳转的url
    private String url;

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        logger.info("登录验证成功："+httpServletRequest.getContextPath()+url);
        //response.sendRedirect(request.getContextPath()+url);
        httpServletRequest.getRequestDispatcher(url).forward(httpServletRequest, httpServletResponse);
    }
}
