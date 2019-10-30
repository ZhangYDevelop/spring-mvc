package com.zy.springmvc;

import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.domain.Permission;
import com.zy.springmvc.domain.SysModel;
import com.zy.springmvc.domain.User;
import com.zy.springmvc.mapper.SysModelMapper;
import com.zy.springmvc.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author zhangy
 * @Date 11:58 2019/10/16
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SysModelMapper sysModelMapper;

    @Test
    public void testUserMapper() {
        User user = userMapper.getUserByName("zhangyu");
        System.out.println(JSONObject.toJSON(user));
    }

    @Test
    public void tesgetUserPermissionByUserName() {
        List<Permission> user = userMapper.getUserPermissionByUserName("zhangyu");
        System.out.println(user.toString());
    }
    @Test
    public void tesupdateUser() {
        User user = new User();
        user.setUsername("admin");
        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
        user.setPassword(md5PasswordEncoder.encodePassword("admin", null));
        userMapper.updateUser(user);
    }

    @Test
    public void  testgetsysModelMapper() {
       SysModel sysModel =  sysModelMapper.selectByPrimaryKey("0026c983-c96d-482b-97d6-fe18f23b0fd6");
       System.out.println(sysModel);
    }
}
