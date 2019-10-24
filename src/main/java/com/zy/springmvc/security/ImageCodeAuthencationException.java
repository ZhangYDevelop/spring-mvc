package com.zy.springmvc.security;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author zhangy
 * @Date 10:34 2019/10/24
 **/
public class ImageCodeAuthencationException extends AuthenticationException {
    public ImageCodeAuthencationException(String msg, Throwable t) {
        super(msg, t);
    }
    public ImageCodeAuthencationException(String msg) {
        super(msg);
    }
}
