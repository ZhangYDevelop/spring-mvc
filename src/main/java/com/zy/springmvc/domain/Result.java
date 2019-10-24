package com.zy.springmvc.domain;

import java.util.HashMap;

/**
 * @Author zhangy
 * @Date 19:55 2019/10/10
 **/
public class Result extends HashMap {

    public Result() {
    }

    public void setSuccess(boolean success) {
        this.put("success", success);
    }

    public boolean isSuccess() {
        return !this.containsKey("success") ? false : Boolean.parseBoolean(this.get("success").toString());
    }

    public String getMessage() {
        return (String)this.get("message");
    }

    public void setMessage(String message) {
        this.put("message", message);
    }

    public String getId() {
        return (String) this.get("id");
    }

    public void setId(String id) {
        this.put("id", id);
    }

    public String getThingTitle() {
        return (String)this.get("thingTitle");
    }

    public void setThingTitle(String thingTitle) {
        this.put("thingTitle", thingTitle);
    }

    public Object getData() {
        return this.get("data");
    }

    public void setData(Object data) {
        this.put("data", data);
    }

    public void setCode(String code) {
        this.put("code",code);
    }
    public String getCode () {
        return (String) this.get("code");
    }
}
