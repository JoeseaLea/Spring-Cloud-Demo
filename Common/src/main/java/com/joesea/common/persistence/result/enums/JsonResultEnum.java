package com.joesea.common.persistence.result.enums;

/**
 * <p>@author : Joesea Lea</p>
 * <p>@date : 2020/1/15</p>
 * <p>@description : </p>
 */
public enum JsonResultEnum {
    SUCCESS(0, "SUCCESS"),
    FAIL(1, "FAIL")
    ;

    private int status;
    private String msg;

    private JsonResultEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
