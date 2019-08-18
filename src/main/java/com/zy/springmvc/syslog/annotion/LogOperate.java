package com.zy.springmvc.syslog.annotion;

import java.lang.annotation.*;

/**
 * @AUTHOR zhangy
 * 2019-05-26  15:16
 * 自定义日志操作接口
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogOperate {
    /**
     * 操作类型描述
     * @return
     */
    String operateTypeDesc() default "";


    /**
     * 模块编码
     * @return
     */
    String moudleCode() default "M30";

    /**
     * 模块名称
     * @return
     */
    String moudleName() default "XX模块";



}
