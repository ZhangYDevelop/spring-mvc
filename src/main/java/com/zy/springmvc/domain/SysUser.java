package com.zy.springmvc.domain;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.Set;

public class SysUser implements UserDetails, CredentialsContainer {

    private String id;

    private String username;

    private String entity_id;

    private String entity_type;

    private String entity_name;

    private String application_name;

    private String user_email;

    private String user_phone;

    private String personal_status;

    private String password;

    private String pwd_question;

    private String pwd_answer;

    private Date last_login_date;

    private Date last_pwd_chg_date;

    private String is_online;

    private String is_locked_out;

    private String is_changed_pwd;

    private Integer order_num;

    private String is_ok;

    private String org_id;

    private String remark;

    private String created_by;

    private Date created_date;

    private String last_modified_by;

    private Date last_modified_date;

    private boolean accountNonExpired;

    private boolean accountNonLocked;

    private boolean enabled;

    private boolean credentialsNonExpired;

    private Date created_time;

    private String creator;

    private Date modified_time;

    private String modifier;

    private Set<GrantedAuthority> authorities;

    @Override
    public Set<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEntity_id() {
        return entity_id;
    }

    public void setEntity_id(String entity_id) {
        this.entity_id = entity_id == null ? null : entity_id.trim();
    }

    public String getEntity_type() {
        return entity_type;
    }

    public void setEntity_type(String entity_type) {
        this.entity_type = entity_type == null ? null : entity_type.trim();
    }

    public String getEntity_name() {
        return entity_name;
    }

    public void setEntity_name(String entity_name) {
        this.entity_name = entity_name == null ? null : entity_name.trim();
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name == null ? null : application_name.trim();
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email == null ? null : user_email.trim();
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone == null ? null : user_phone.trim();
    }

    public String getPersonal_status() {
        return personal_status;
    }

    public void setPersonal_status(String personal_status) {
        this.personal_status = personal_status == null ? null : personal_status.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPwd_question() {
        return pwd_question;
    }

    public void setPwd_question(String pwd_question) {
        this.pwd_question = pwd_question == null ? null : pwd_question.trim();
    }

    public String getPwd_answer() {
        return pwd_answer;
    }

    public void setPwd_answer(String pwd_answer) {
        this.pwd_answer = pwd_answer == null ? null : pwd_answer.trim();
    }

    public Date getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(Date last_login_date) {
        this.last_login_date = last_login_date;
    }

    public Date getLast_pwd_chg_date() {
        return last_pwd_chg_date;
    }

    public void setLast_pwd_chg_date(Date last_pwd_chg_date) {
        this.last_pwd_chg_date = last_pwd_chg_date;
    }

    public String getIs_online() {
        return is_online;
    }

    public void setIs_online(String is_online) {
        this.is_online = is_online == null ? null : is_online.trim();
    }

    public String getIs_locked_out() {
        return is_locked_out;
    }

    public void setIs_locked_out(String is_locked_out) {
        this.is_locked_out = is_locked_out == null ? null : is_locked_out.trim();
    }

    public String getIs_changed_pwd() {
        return is_changed_pwd;
    }

    public void setIs_changed_pwd(String is_changed_pwd) {
        this.is_changed_pwd = is_changed_pwd == null ? null : is_changed_pwd.trim();
    }

    public Integer getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Integer order_num) {
        this.order_num = order_num;
    }

    public String getIs_ok() {
        return is_ok;
    }

    public void setIs_ok(String is_ok) {
        this.is_ok = is_ok == null ? null : is_ok.trim();
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id == null ? null : org_id.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by == null ? null : created_by.trim();
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public String getLast_modified_by() {
        return last_modified_by;
    }

    public void setLast_modified_by(String last_modified_by) {
        this.last_modified_by = last_modified_by == null ? null : last_modified_by.trim();
    }

    public Date getLast_modified_date() {
        return last_modified_date;
    }

    public void setLast_modified_date(Date last_modified_date) {
        this.last_modified_date = last_modified_date;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getModified_time() {
        return modified_time;
    }

    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    @Override
    public void eraseCredentials() {

    }
}