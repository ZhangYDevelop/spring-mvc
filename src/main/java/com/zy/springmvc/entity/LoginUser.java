package com.zy.springmvc.entity;

/**
 * @AUTHOR zhangy
 * 2019-06-08  10:08
 */
public class LoginUser {
    private  String id;
    private  String userName;
    private  String userAddres;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddres() {
        return userAddres;
    }

    public void setUserAddres(String userAddres) {
        this.userAddres = userAddres;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddres='" + userAddres + '\'' +
                '}';
    }
}
