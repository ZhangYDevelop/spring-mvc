package com.zy.springmvc.security;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author zhangy
 * @Date 10:34 2019/10/24
 * 自定义authencation 异常
 **/
public class MyAuthencationException extends AuthenticationException {
    public MyAuthencationException(String msg, Throwable t) {
        super(msg, t);
    }
    public MyAuthencationException(String msg) {
        super(msg);
    }
}
