package com.zy.springmvc.domain;

/**
 * @AUTHOR zhangy
 * 2019-06-08  10:08
 */
public class LoginUser {
    private  String id;
    private  String userName;
    private  String passWard;
    private  String userAddres;

    public LoginUser(String id, String userName, String passWard, String userAddres) {
        this.id = id;
        this.userName = userName;
        this.passWard = passWard;
        this.userAddres = userAddres;
    }

    public String getPassWard() {
        return passWard;
    }

    public void setPassWard(String passWard) {
        this.passWard = passWard;
    }

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
                ", passWard='" + passWard + '\'' +
                ", userAddres='" + userAddres + '\'' +
                '}';
    }
}
