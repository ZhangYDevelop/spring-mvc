package com.zy.springmvc.intercerpter;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @AUTHOR zhangy
 * 2019-06-08  09:54
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    public LoginInterceptor() {
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if (session.getAttribute("LoginUser") == null) {
            response.sendRedirect(request.getContextPath() + "/api/platform/login");
        } else {
            super.preHandle(request,response, handler);
        }

        return  true;
    }
}
