package com.zy.springmvc.web.intercerpter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Description;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.UrlPathHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @AUTHOR zhangy
 * 系统操作日志
 * 2019-06-16  12:33
 */
public class SysLogOperate  extends HandlerInterceptorAdapter {

    private Log logger = LogFactory.getLog(this.getClass());
    private UrlPathHelper urlPathHelper = new UrlPathHelper();
//    @Autowired
//    private LogOperService logOperService;

    public SysLogOperate() {
    }


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            String sUrl = this.urlPathHelper.getLookupPathForRequest(request);
            HandlerMethod method = (HandlerMethod)handler;
            Description classdesc = (Description) AnnotationUtils.findAnnotation(method.getBeanType(), Description.class);
            Description methoddesc = (Description)method.getMethodAnnotation(Description.class);
//            LogOper logOper = new LogOper();
//            logOper.setLogUserId(ManagerFactory.getUserManager().getLoginUserId());
//            logOper.setLogTime(DateUtils.getCurrentTime());
//            logOper.setLogDesc(sUrl);
//            logOper.setLogModule(classdesc == null ? "" : classdesc.value());
//            logOper.setLogMethod(methoddesc == null ? "" : methoddesc.value());
//            logOper.setIpAddress(IpUtils.getIpAddrByRequest(request));
//            this.logOperService.save(logOper);
        }

        return true;
    }
}
