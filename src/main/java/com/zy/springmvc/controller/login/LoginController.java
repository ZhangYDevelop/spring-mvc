package com.zy.springmvc.controller.login;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zy.springmvc.common.SessionUitl;
import com.zy.springmvc.entity.LoginUser;
import com.zy.springmvc.service.UserService;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * @AUTHOR zhangy
 * 2019-05-26  09:48
 */

@Controller
@RequestMapping(value = "/api/platform")
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

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
    //@ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @RequestParam Map map) throws IOException {
        String userName = (String) map.get("userName");
        String userPwd = (String) map.get("userPwd");
        String userCode = (String) map.get("userCode");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(this.userService.updateForlogin(request, response, userName, userPwd, userCode));
        return modelAndView;
    }

    @RequestMapping(value = "/main")
    @Description("访问系统首页")
    public ModelAndView main(HttpServletRequest req, HttpServletResponse resp) {
        ModelAndView mv = new ModelAndView("main");
        return mv;
    }


    @RequestMapping({"/logout"})
    @Description("系统退出")
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();

        while (session.getAttributeNames().hasMoreElements()) {
            String name = (String) session.getAttributeNames().nextElement();
            session.removeAttribute(name);
        }
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0L);
        session = request.getSession(true);
        session.invalidate();
        return new ModelAndView("redirect:login");

    }


}