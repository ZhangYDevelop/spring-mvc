package com.zy.springmvc.domain;

/**
 * @Author zhangy
 * @Date 11:22 2019/10/16
 **/
public class Permission {


    private int id  ;
    private String perm_name ;
    private String perm_tag ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPerm_name() {
        return perm_name;
    }

    public void setPerm_name(String perm_name) {
        this.perm_name = perm_name;
    }

    public String getPerm_tag() {
        return perm_tag;
    }

    public void setPerm_tag(String perm_tag) {
        this.perm_tag = perm_tag;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", perm_name='" + perm_name + '\'' +
                ", perm_tag='" + perm_tag + '\'' +
                '}';
    }
}
