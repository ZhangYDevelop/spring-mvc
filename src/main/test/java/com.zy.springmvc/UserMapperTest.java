package com.zy.springmvc;

import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.domain.SysModel;
import com.zy.springmvc.domain.SysUser;
import com.zy.springmvc.domain.User;
import com.zy.springmvc.mapper.SysModelMapper;
import com.zy.springmvc.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author zhangy
 * @Date 11:58 2019/10/16
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class UserMapperTest {



    @Autowired
    private SysModelMapper sysModelMapper;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void testUserMapper() {
        SysUser user = sysUserMapper.selectByPrimaryKey("004cc465-b060-4dc8-8988-4685e331b905");
        System.out.println(JSONObject.toJSON(user));
    }


    @Test
    public void tesgetUserPermissionByUserName() {
//        List<Permission> user = userMapper.getUserPermissionByUserName("zhangyu");
//        System.out.println(user.toString());
    }
    @Test
    public void tesupdateUser() {
        User user = new User();
        user.setUsername("admin");
        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
        user.setPassword(md5PasswordEncoder.encodePassword("admin", null));
       // userMapper.updateUser(user);
    }

    @Test
    public void  testgetsysModelMapper() {
       SysModel sysModel =  sysModelMapper.selectByPrimaryKey("0026c983-c96d-482b-97d6-fe18f23b0fd6");
       System.out.println(sysModel);
    }
}
