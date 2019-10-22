package com.zy.springmvc.security;

import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.domain.Result;
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

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        logger.info("登录验证成功：");
        // 验证成功返回JSON数据到前端
        Result result = new Result();
        result.setSuccess(true);
        httpServletResponse.getWriter().write(JSONObject.toJSONString(result));
    }
}
