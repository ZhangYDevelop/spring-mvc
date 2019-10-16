package com.zy.springmvc.service;

import com.zy.springmvc.common.Consts;
import com.zy.springmvc.domain.User;
import com.zy.springmvc.domain.Result;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author zhangy
 * @Date 20:05 2019/10/10
 **/
@Service
public class UserService {
    public Result updateForlogin(HttpServletRequest request, HttpServletResponse response, String userName, String userPwd) {
      Result result = new Result();
       // 将用户信息存入session
        HttpSession session = request.getSession();
        User loginUser = getUserById("admin");
        loginUser.setId(10);
        //loginUser.setUserName(userName);
        // 获取所有操作和模块组成的菜单
        result.setSuccess(true);
        session.setAttribute(Consts.LOGIN_USER_SESSION, loginUser);
        return result;
    }

    public User getUserById(String userId) {
        return  null;
    }
    public User getUserByUserName(String userId) {
        return  null;
    }
}
