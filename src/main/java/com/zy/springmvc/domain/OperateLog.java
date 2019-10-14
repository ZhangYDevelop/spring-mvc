package com.zy.springmvc.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @AUTHOR zhangy
 * 操作日志
 * 2019-06-02  10:28
 */
public class OperateLog  implements Serializable {

    private String id;
    private String logType;
    private String logUserId;
    private Date logTime;
    private String logModule;
    private String logMethod;
    private String logDesc;
    private String ipAddress;
    private String ipAddressDtl;
    private String orgId;
    private String extField1;
    private String extField2;
    private String extField3;
    private String extField4;
    private String extField5;

    public OperateLog() {
    }

    public OperateLog(String id) {
        this.id = id;
    }

    public OperateLog(String id, String logType, String logUserId, Date logTime, String logModule, String logMethod, String logDesc, String ipAddress, String ipAddressDtl, String orgId, String extField1, String extField2, String extField3, String extField4, String extField5) {
        this.id = id;
        this.logType = logType;
        this.logUserId = logUserId;
        this.logTime = logTime;
        this.logModule = logModule;
        this.logMethod = logMethod;
        this.logDesc = logDesc;
        this.ipAddress = ipAddress;
        this.ipAddressDtl = ipAddressDtl;
        this.orgId = orgId;
        this.extField1 = extField1;
        this.extField2 = extField2;
        this.extField3 = extField3;
        this.extField4 = extField4;
        this.extField5 = extField5;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogUserId() {
        return logUserId;
    }

    public void setLogUserId(String logUserId) {
        this.logUserId = logUserId;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getLogModule() {
        return logModule;
    }

    public void setLogModule(String logModule) {
        this.logModule = logModule;
    }

    public String getLogMethod() {
        return logMethod;
    }

    public void setLogMethod(String logMethod) {
        this.logMethod = logMethod;
    }

    public String getLogDesc() {
        return logDesc;
    }

    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddressDtl() {
        return ipAddressDtl;
    }

    public void setIpAddressDtl(String ipAddressDtl) {
        this.ipAddressDtl = ipAddressDtl;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getExtField1() {
        return extField1;
    }

    public void setExtField1(String extField1) {
        this.extField1 = extField1;
    }

    public String getExtField2() {
        return extField2;
    }

    public void setExtField2(String extField2) {
        this.extField2 = extField2;
    }

    public String getExtField3() {
        return extField3;
    }

    public void setExtField3(String extField3) {
        this.extField3 = extField3;
    }

    public String getExtField4() {
        return extField4;
    }

    public void setExtField4(String extField4) {
        this.extField4 = extField4;
    }

    public String getExtField5() {
        return extField5;
    }

    public void setExtField5(String extField5) {
        this.extField5 = extField5;
    }


}
