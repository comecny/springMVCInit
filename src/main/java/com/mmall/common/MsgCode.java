package com.mmall.common;

public enum MsgCode {
    SUCCESS(true, "成功"),
    FAIL(false, "失败");
    
    private  boolean status;
    private String msg;

    MsgCode(boolean status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }
}
