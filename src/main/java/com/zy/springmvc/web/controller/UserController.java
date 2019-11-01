package com.zy.springmvc.web.controller;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.common.MapUtils;
import com.zy.springmvc.domain.Result;
import com.zy.springmvc.domain.SysUser;
import com.zy.springmvc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.UUID;


/**
 * @AUTHOR zhangy
 * 2019-05-26  09:48
 */

@Controller
@RequestMapping(value = "/platform")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @Description("访问登陆页面")
    public String submit() {
        return "login";
    }


    /**
     * @throws IOException
     * @Controller和@RestController区别：
     * @Controller 是视图解析器的，即Return返回的是视图，即jsp或者html页面的。
     * 如果返回数据json、xml等，需要在对应的方法上加上@ResponseBody注解。
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, @RequestParam Map map) throws IOException {
//        String userName = (String) map.get("username");
//        String userPwd = (String) map.get("password");
//
//        Result result = userService.updateForlogin(request, response, userName, userPwd);
        return null;
    }

    @RequestMapping(value = "/main")
    @Description("访问系统首页")
    public ModelAndView main(HttpServletRequest req, HttpServletResponse resp) {
        ModelAndView mv = new ModelAndView("main");
        return mv;
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    @Description("访问登陆页面")
    public String error() {
        return "error";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    @Description("访问登陆页面")
    public String unAutnecation() {
        return "403";
    }



    @RequestMapping("/userList")
    public ModelAndView getUserList() {
        return new ModelAndView("platform/user/userlist");
    }

    @RequestMapping("/user/add")
    @ResponseBody
    public String addUser(@RequestParam Map map) throws Exception {
        SysUser sysUser  = MapUtils.map2bean(map, SysUser.class);
        // 判断是否用户存在
        SysUser exitUser =   userService.getSysUserByUserName(sysUser.getUsername());
        Result result = new Result();

        if (exitUser == null)  {
            sysUser.setId(UUID.randomUUID().toString());
            sysUser.setAccountNonExpired(true);
            sysUser.setAccountNonLocked(true);
            sysUser.setEnabled(true);
            sysUser.setCredentialsNonExpired(true);
            sysUser.setCreated_time(new Date());
            userService.insert(sysUser);
            result.setSuccess(true);
            result.setData(sysUser);
        } else {
            result.setSuccess(false);
            result.setMessage("用户已存在");
        }
        return  JSONObject.toJSON(result).toString();
    }
}