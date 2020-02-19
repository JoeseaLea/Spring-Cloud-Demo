package com.joesea.common.persistence.result;

import com.joesea.common.persistence.result.enums.JsonResultEnum;

import java.io.Serializable;

/**
 * <p>@author : Joesea Lea</p>
 * <p>@date : 2020/2/18</p>
 * <p>@description : </p>
 */
public class JsonResult implements Serializable {

    private static final long serialVersionUID = -3940838648175277131L;
    
    private Integer status;
    private String msg;
    private Integer type;
    private Object data;

    public JsonResult() {

    }

    public JsonResult(Integer status) {
        this.status = status;
    }

    public JsonResult(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public JsonResult(Object data) {
        this.status = JsonResultEnum.SUCCESS.getStatus();
        this.msg = JsonResultEnum.SUCCESS.getMsg();
        this.data = data;
    }

    public JsonResult(Integer status, String msg, Integer type, Object data) {
        this.status = status;
        this.msg = msg;
        this.type = type;
        this.data = data;
    }

    public void success() {
        this.status = JsonResultEnum.SUCCESS.getStatus();
        this.msg = JsonResultEnum.SUCCESS.getMsg();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
