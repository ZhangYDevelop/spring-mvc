package com.zy.springmvc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author zhangy
 * @Date 20:12 2019/11/21
 **/
@Controller
@RequestMapping(value = "/platform")
public class MainController {

    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/personal/main", method = RequestMethod.GET)
    @Description("个人中心")
    public String submit() {
        return "/platform/personmain/personalCenter";
    }
}
