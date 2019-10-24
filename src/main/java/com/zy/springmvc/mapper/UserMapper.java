package com.zy.springmvc.mapper;

import com.zy.springmvc.domain.Permission;
import com.zy.springmvc.domain.User;

import java.util.List;

/**
 * @Author zhangy
 * @Date 11:36 2019/10/16
 **/
public interface UserMapper {

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
}
