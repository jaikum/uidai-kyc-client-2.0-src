package com.uidai.api.model;

/**
 * Created by Jai on 8/7/17.
 */
public class UserData {

    private String name;
    private String DOB;
    private String sex;
    private ResponseInfo responseInfo;
    private String uid;

    public UserData() {
        this.responseInfo = new ResponseInfo();
    }

    public ResponseInfo getResponseInfo() {
        return responseInfo;
    }

    public void setResponseInfo(ResponseInfo responseInfo) {
        this.responseInfo = responseInfo;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }




}
