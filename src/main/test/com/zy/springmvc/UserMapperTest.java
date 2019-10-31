package com.zy.springmvc;

import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.domain.SysUser;
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
    private SysUserMapper sysUserMapper;

    @Test
    public void testUserMapper() {

        SysUser user = sysUserMapper.getSysUserByUserName("admin");
        System.out.println(JSONObject.toJSON(user));
    }


    @Test
    public void tesgetUserPermissionByUserName() {
//        List<Permission> user = userMapper.getUserPermissionByUserName("zhangyu");
//        System.out.println(user.toString());
    }
    @Test
    public void tesupdateUser() {
        SysUser user =  new SysUser();
        user.setUsername("admin");
        user.setId("123");
        user.setEntity_name("管理员");
        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
        user.setPassword(md5PasswordEncoder.encodePassword("admin", null));
        sysUserMapper.updateByPrimaryKey(user);
    }

    @Test
    public void  testgetsysModelMapper() {
//       SysModel sysModel =  new SysModel();
//       sysModel.setId("dfdf");
//       sysModel.setModuleName("lsdflsjf");
//
//       sysModelMapper.insert(sysModel);
//       System.out.println(sysModel);
    }
}
