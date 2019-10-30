package com.zy.springmvc.domain;

public class SysPermission {
    private String id;

    private String code;

    private String url;

    private String method;

    private String description;

    private String isOk;

    private Integer orderNum;

    private String sysModuleId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getIsOk() {
        return isOk;
    }

    public void setIsOk(String isOk) {
        this.isOk = isOk == null ? null : isOk.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getSysModuleId() {
        return sysModuleId;
    }

    public void setSysModuleId(String sysModuleId) {
        this.sysModuleId = sysModuleId == null ? null : sysModuleId.trim();
    }
}