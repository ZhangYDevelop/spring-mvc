package com.zy.springmvc.security;


import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(MyAuthenticationFailureHandler.class);

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        logger.info("登录失败！");
        // 验证成功返回JSON数据到前端
        Result result = new Result();
        result.setSuccess(false);
        String message = e.getMessage();
        if (message.contains("验证码")) {
             result.setCode("004");
        }
        result.setMessage(e.getMessage());
        httpServletResponse.setContentType("text/json;charset=UTF-8");
        httpServletResponse.getWriter().write(JSONObject.toJSONString(result));
    }
}
