package com.zy.springmvc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


/**
 * @AUTHOR zhangy
 * 2019-05-26  09:48
 */

@Controller
@RequestMapping(value = "/platform")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

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

    @RequestMapping("/add")
    @ResponseBody
    public String addUser(@RequestParam Map map) {
//        //userMapper.addUser(user);
//        Result result  = new Result();
//        result.setSuccess(true);
//        return JSONObject.toJSON(result).toString();
        return  null;
    }
}