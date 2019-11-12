package com.zy.springmvc.domain;

/**
 * @Author zhangy
 * @Date 9:38 2019/11/8
 * 模块、用户、权限关系表
 **/
public class ModulePermissionUserRelation {

    private String id;
    private String moduleUrl;
    private String moduleName;
    private String parentModule;
    private String username;
    private String entityName;
    private String sysRoleId;
    private String sysPermissionId;
    private String code;
    private String moduleIcon;
    private String isOk;

    public String getIsOk() {
        return isOk;
    }

    public void setIsOk(String isOk) {
        this.isOk = isOk;
    }

    public String getModuleIcon() {
        return moduleIcon;
    }

    public void setModuleIcon(String moduleIcon) {
        this.moduleIcon = moduleIcon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    public String getSysPermissionId() {
        return sysPermissionId;
    }

    public void setSysPermissionId(String sysPermissionId) {
        this.sysPermissionId = sysPermissionId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentModule() {
        return parentModule;
    }

    public void setParentModule(String parentModule) {
        this.parentModule = parentModule;
    }

    @Override
    public String toString() {
        return "ModulePermissionUserRelation{" +
                "id='" + id + '\'' +
                ", moduleUrl='" + moduleUrl + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", parentModule='" + parentModule + '\'' +
                ", username='" + username + '\'' +
                ", entityName='" + entityName + '\'' +
                ", sysRoleId='" + sysRoleId + '\'' +
                ", sysPermissionId='" + sysPermissionId + '\'' +
                ", code='" + code + '\'' +
                ", moduleIcon='" + moduleIcon + '\'' +
                '}';
    }
}
