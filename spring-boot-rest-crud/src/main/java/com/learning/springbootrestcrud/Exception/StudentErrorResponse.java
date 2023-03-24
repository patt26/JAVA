package com.learning.springbootrestcrud.Exception;

public class StudentErrorResponse {

    private int statusCode;
    private String msg;
    private long time;

    public StudentErrorResponse() {
    }

    public StudentErrorResponse(int statusCode, String msg, long time) {
        this.statusCode = statusCode;
        this.msg = msg;
        this.time = time;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
