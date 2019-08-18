package com.zy.springmvc.syslog.aspect;

import com.zy.springmvc.entity.OperateLog;
import com.zy.springmvc.service.SysLogServeve;
import com.zy.springmvc.syslog.annotion.LogOperate;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @AUTHOR zhangy
 * 2019-05-26  15:17
 * 自定义日志操作切面类
 */
@Aspect
@Component
public class LogOperateAop {

    //本地异常日志记录对象
    private static final Logger logger = LoggerFactory.getLogger(LogOperateAop.class);


    @Autowired
     private  SysLogServeve sysLogServeve;

    //切入点定义：controller
    @Pointcut("@annotation(com.zy.springmvc.syslog.annotion.LogOperate)")
    public void controllerAspect() { }



    /**
     * controller切入点方法实现
     *
     * @param joinPoint
     */
    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) {
        try {
            OperateLog log  = getControllerMethodDescription(joinPoint);
            sysLogServeve.saveLog(log);
        } catch (Exception e) {
            logger.error("--------------controllerAspect for log fail-----------------------");
            logger.error("exception info : ", e);
        }

    }


    /**
     * 获取方法的描述
     *
     * @param joinPoint
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    private OperateLog getControllerMethodDescription(JoinPoint joinPoint) throws Exception {
        //获取目标类名
        String targetName = joinPoint.getTarget().getClass().getName();
        //获取方法名
        String methodName = joinPoint.getSignature().getName();
        //获取相关参数
        Object[] arguments = joinPoint.getArgs();
        //生成类对象
        Class targetClass = Class.forName(targetName);
        //获取该类中的方法
        Method[] methods = targetClass.getMethods();

        OperateLog log = new OperateLog();

        for(Method method : methods) {
            if(!method.getName().equals(methodName)) {
                continue;
            }
            Class[] clazzs = method.getParameterTypes();
            if(clazzs.length != arguments.length) {
                continue;
            }
//            log.setModuleDescripte( method.getAnnotation(LogOperate.class).operateTypeDesc());
//            log.setModuleName(method.getAnnotation(LogOperate.class).moudleName());
//            log.setLogCode(method.getAnnotation(LogOperate.class).moudleCode());

        }
        return log;
    }



}
