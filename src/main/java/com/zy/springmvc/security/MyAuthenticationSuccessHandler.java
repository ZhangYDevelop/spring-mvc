package com.zy.springmvc.security;

import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.domain.Result;

import com.zy.springmvc.domain.User;
import org.apache.ibatis.ognl.Ognl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.RememberMeAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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

    private Logger logger = LoggerFactory.getLogger(MyAuthenticationFailureHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        logger.info("登录验证成功：");
        logger.info("权限点：" + JSONObject.toJSONString(authentication));
        Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(object instanceof User) {
            User user = (User)object;
            logger.info(user.toString());
        }
        // 验证成功返回JSON数据到前端
        Result result = new Result();
        result.setSuccess(true);
        // 将用户信息写入session
        httpServletRequest.getSession().setAttribute("access_token", JSONObject.toJSONString(authentication));
        httpServletResponse.setContentType("text/json;charset=UTF-8");
        if (authentication instanceof RememberMeAuthenticationToken) { // 记住我功能，在Spring security 认证成功后，在重定向到主页面
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/api/platform/main");
        } else {
            httpServletResponse.getWriter().write(JSONObject.toJSONString(result));
        }
    }
}
