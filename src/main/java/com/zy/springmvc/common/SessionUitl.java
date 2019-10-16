package com.zy.springmvc.common;

import com.zy.springmvc.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @AUTHOR zhangy
 * 2019-06-08  12:35
 */
public class SessionUitl {

    private final  static Map sessionMap = new HashMap();

    public  static void addSession(User user){
        synchronized (SessionUitl.class) {
            sessionMap.put("userId" , user.getId());
        }
    }

    private  static  boolean checkUser(String userId) {
        String user = (String) sessionMap.get(userId);
        boolean a = false;
        if (null != user && !"".equals(user)){
            a = true;
        }
        return  a;
    }

}
