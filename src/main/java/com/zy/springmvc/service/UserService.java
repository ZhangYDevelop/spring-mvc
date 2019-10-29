package com.zy.springmvc.service;

import com.zy.springmvc.common.Consts;
import com.zy.springmvc.domain.Permission;
import com.zy.springmvc.domain.User;
import com.zy.springmvc.domain.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author zhangy
 * @Date 20:05 2019/10/10
 **/
public interface UserService {
    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    User getUserByName(String userName);

    /**
     * 根据用户查询用户对应的权限集合
     * @param UserName
     * @return
     */
    List<Permission> getUserPermissionByUserName(String UserName);

    /**
     * 修改密码
     * @param user
     */
    void updateUser(User user);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
