package com.zy.springmvc.domain;

import java.util.Date;

public class SysModel {
    private String id;

    private String moduleName;

    private String moduleCode;

    private String parentModule;

    private String moduleType;

    private String moduleUrl;

    private String moduleIcon;

    private String moduleEngDesc;

    private String isRunWorkFlow;

    private String isModify;

    private String isOk;

    private Integer orderNum;

    private String isDisplayFront;

    private String isTopMenu;

    private String isSideMenu;

    private String creator;

    private Date createdTime;

    private String modifier;

    private Date modifiedTime;

    private String extField1;

    private String extField2;

    private String extField3;

    private String extField4;

    private String extField5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    public String getParentModule() {
        return parentModule;
    }

    public void setParentModule(String parentModule) {
        this.parentModule = parentModule == null ? null : parentModule.trim();
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType == null ? null : moduleType.trim();
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl == null ? null : moduleUrl.trim();
    }

    public String getModuleIcon() {
        return moduleIcon;
    }

    public void setModuleIcon(String moduleIcon) {
        this.moduleIcon = moduleIcon == null ? null : moduleIcon.trim();
    }

    public String getModuleEngDesc() {
        return moduleEngDesc;
    }

    public void setModuleEngDesc(String moduleEngDesc) {
        this.moduleEngDesc = moduleEngDesc == null ? null : moduleEngDesc.trim();
    }

    public String getIsRunWorkFlow() {
        return isRunWorkFlow;
    }

    public void setIsRunWorkFlow(String isRunWorkFlow) {
        this.isRunWorkFlow = isRunWorkFlow == null ? null : isRunWorkFlow.trim();
    }

    public String getIsModify() {
        return isModify;
    }

    public void setIsModify(String isModify) {
        this.isModify = isModify == null ? null : isModify.trim();
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

    public String getIsDisplayFront() {
        return isDisplayFront;
    }

    public void setIsDisplayFront(String isDisplayFront) {
        this.isDisplayFront = isDisplayFront == null ? null : isDisplayFront.trim();
    }

    public String getIsTopMenu() {
        return isTopMenu;
    }

    public void setIsTopMenu(String isTopMenu) {
        this.isTopMenu = isTopMenu == null ? null : isTopMenu.trim();
    }

    public String getIsSideMenu() {
        return isSideMenu;
    }

    public void setIsSideMenu(String isSideMenu) {
        this.isSideMenu = isSideMenu == null ? null : isSideMenu.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getExtField1() {
        return extField1;
    }

    public void setExtField1(String extField1) {
        this.extField1 = extField1 == null ? null : extField1.trim();
    }

    public String getExtField2() {
        return extField2;
    }

    public void setExtField2(String extField2) {
        this.extField2 = extField2 == null ? null : extField2.trim();
    }

    public String getExtField3() {
        return extField3;
    }

    public void setExtField3(String extField3) {
        this.extField3 = extField3 == null ? null : extField3.trim();
    }

    public String getExtField4() {
        return extField4;
    }

    public void setExtField4(String extField4) {
        this.extField4 = extField4 == null ? null : extField4.trim();
    }

    public String getExtField5() {
        return extField5;
    }

    public void setExtField5(String extField5) {
        this.extField5 = extField5 == null ? null : extField5.trim();
    }
}