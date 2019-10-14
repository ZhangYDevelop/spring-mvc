package com.zy.springmvc.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @AUTHOR zhangy
 * 2019-06-16  23:26
 */
@Controller
@RequestMapping("/api/platform")
public class SysUserController {

    @RequestMapping("/userList")
    public ModelAndView getUserList() {
        return new ModelAndView("platform/user/userlist");
    }

    @RequestMapping("/add")
    public ModelAndView addUser() {
        return new ModelAndView("platform/user/add");
    }
}
