package com.zy.springmvc.domain;

import java.util.Date;

public class SysModel {
    private String id;

    private String module_name;

    private String module_code;

    private String parent_module;

    private String module_type;

    private String module_url;

    private String module_icon;

    private String module_eng_desc;

    private String is_run_work_flow;

    private String is_modify;

    private String is_ok;

    private Integer order_num;

    private String is_display_front;

    private String is_top_menu;

    private String is_side_menu;

    private String creator;

    private Date created_time;

    private String modifier;

    private Date modified_time;

    private String ext_field_1;

    private String ext_field_2;

    private String ext_field_3;

    private String ext_field_4;

    private String ext_field_5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name == null ? null : module_name.trim();
    }

    public String getModule_code() {
        return module_code;
    }

    public void setModule_code(String module_code) {
        this.module_code = module_code == null ? null : module_code.trim();
    }

    public String getParent_module() {
        return parent_module;
    }

    public void setParent_module(String parent_module) {
        this.parent_module = parent_module == null ? null : parent_module.trim();
    }

    public String getModule_type() {
        return module_type;
    }

    public void setModule_type(String module_type) {
        this.module_type = module_type == null ? null : module_type.trim();
    }

    public String getModule_url() {
        return module_url;
    }

    public void setModule_url(String module_url) {
        this.module_url = module_url == null ? null : module_url.trim();
    }

    public String getModule_icon() {
        return module_icon;
    }

    public void setModule_icon(String module_icon) {
        this.module_icon = module_icon == null ? null : module_icon.trim();
    }

    public String getModule_eng_desc() {
        return module_eng_desc;
    }

    public void setModule_eng_desc(String module_eng_desc) {
        this.module_eng_desc = module_eng_desc == null ? null : module_eng_desc.trim();
    }

    public String getIs_run_work_flow() {
        return is_run_work_flow;
    }

    public void setIs_run_work_flow(String is_run_work_flow) {
        this.is_run_work_flow = is_run_work_flow == null ? null : is_run_work_flow.trim();
    }

    public String getIs_modify() {
        return is_modify;
    }

    public void setIs_modify(String is_modify) {
        this.is_modify = is_modify == null ? null : is_modify.trim();
    }

    public String getIs_ok() {
        return is_ok;
    }

    public void setIs_ok(String is_ok) {
        this.is_ok = is_ok == null ? null : is_ok.trim();
    }

    public Integer getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Integer order_num) {
        this.order_num = order_num;
    }

    public String getIs_display_front() {
        return is_display_front;
    }

    public void setIs_display_front(String is_display_front) {
        this.is_display_front = is_display_front == null ? null : is_display_front.trim();
    }

    public String getIs_top_menu() {
        return is_top_menu;
    }

    public void setIs_top_menu(String is_top_menu) {
        this.is_top_menu = is_top_menu == null ? null : is_top_menu.trim();
    }

    public String getIs_side_menu() {
        return is_side_menu;
    }

    public void setIs_side_menu(String is_side_menu) {
        this.is_side_menu = is_side_menu == null ? null : is_side_menu.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModified_time() {
        return modified_time;
    }

    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    public String getExt_field_1() {
        return ext_field_1;
    }

    public void setExt_field_1(String ext_field_1) {
        this.ext_field_1 = ext_field_1 == null ? null : ext_field_1.trim();
    }

    public String getExt_field_2() {
        return ext_field_2;
    }

    public void setExt_field_2(String ext_field_2) {
        this.ext_field_2 = ext_field_2 == null ? null : ext_field_2.trim();
    }

    public String getExt_field_3() {
        return ext_field_3;
    }

    public void setExt_field_3(String ext_field_3) {
        this.ext_field_3 = ext_field_3 == null ? null : ext_field_3.trim();
    }

    public String getExt_field_4() {
        return ext_field_4;
    }

    public void setExt_field_4(String ext_field_4) {
        this.ext_field_4 = ext_field_4 == null ? null : ext_field_4.trim();
    }

    public String getExt_field_5() {
        return ext_field_5;
    }

    public void setExt_field_5(String ext_field_5) {
        this.ext_field_5 = ext_field_5 == null ? null : ext_field_5.trim();
    }

    @Override
    public String toString() {
        return "SysModel{" +
                "id='" + id + '\'' +
                ", module_name='" + module_name + '\'' +
                ", module_code='" + module_code + '\'' +
                ", parent_module='" + parent_module + '\'' +
                ", module_type='" + module_type + '\'' +
                ", module_url='" + module_url + '\'' +
                ", module_icon='" + module_icon + '\'' +
                ", module_eng_desc='" + module_eng_desc + '\'' +
                ", is_run_work_flow='" + is_run_work_flow + '\'' +
                ", is_modify='" + is_modify + '\'' +
                ", is_ok='" + is_ok + '\'' +
                ", order_num=" + order_num +
                ", is_display_front='" + is_display_front + '\'' +
                ", is_top_menu='" + is_top_menu + '\'' +
                ", is_side_menu='" + is_side_menu + '\'' +
                ", creator='" + creator + '\'' +
                ", created_time=" + created_time +
                ", modifier='" + modifier + '\'' +
                ", modified_time=" + modified_time +
                ", ext_field_1='" + ext_field_1 + '\'' +
                ", ext_field_2='" + ext_field_2 + '\'' +
                ", ext_field_3='" + ext_field_3 + '\'' +
                ", ext_field_4='" + ext_field_4 + '\'' +
                ", ext_field_5='" + ext_field_5 + '\'' +
                '}';
    }
}