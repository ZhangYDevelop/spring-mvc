package com.zy.springmvc;

import com.zy.springmvc.domain.User;
import com.zy.springmvc.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    private UserMapper userMapper;

    @Test
    public void TestUserMapper() {
        User user = userMapper.getUserByName("zhangyu");
        System.out.println(user.toString());
    }
}
