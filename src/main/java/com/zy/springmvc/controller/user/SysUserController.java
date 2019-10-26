package com.zy.springmvc.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.domain.Result;
import com.zy.springmvc.domain.User;
import com.zy.springmvc.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @AUTHOR zhangy
 * 2019-06-16  23:26
 */
@Controller
@RequestMapping("/api/user")
public class SysUserController {

    private UserMapper userMapper;

    @RequestMapping("/userList")
    public ModelAndView getUserList() {
        return new ModelAndView("platform/user/userlist");
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addUser(@RequestParam Map map) {
        //userMapper.addUser(user);
        Result result  = new Result();
        result.setSuccess(true);
        return JSONObject.toJSON(result).toString();
    }
}
