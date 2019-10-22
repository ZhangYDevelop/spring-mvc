package com.zy.springmvc.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @AUTHOR zhangy
 * 2019-06-08  10:08
 */
public class User implements UserDetails {
    private  Integer id  ;
    private  String username ;
    private  String realname ;
    private  String password ;
    private  Date last_login_time ;
    private  boolean enabled;
    private  boolean account_non_expired ;
    private  boolean account_non_locked ;
    private  boolean credentials_non_expired ;
    private  Date create_time ;
    private  String create_user_id ;

    private List<GrantedAuthority> authorities = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return account_non_expired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return account_non_locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentials_non_expired;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAccount_non_expired() {
        return account_non_expired;
    }

    public void setAccount_non_expired(boolean account_non_expired) {
        this.account_non_expired = account_non_expired;
    }

    public boolean isAccount_non_locked() {
        return account_non_locked;
    }

    public void setAccount_non_locked(boolean account_non_locked) {
        this.account_non_locked = account_non_locked;
    }

    public boolean isCredentials_non_expired() {
        return credentials_non_expired;
    }

    public void setCredentials_non_expired(boolean credentials_non_expired) {
        this.credentials_non_expired = credentials_non_expired;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(String create_user_id) {
        this.create_user_id = create_user_id;
    }

    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", last_login_time=" + last_login_time +
                ", enabled=" + enabled +
                ", account_non_expired=" + account_non_expired +
                ", account_non_locked=" + account_non_locked +
                ", credentials_non_expired=" + credentials_non_expired +
                ", create_time=" + create_time +
                ", create_user_id='" + create_user_id + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
