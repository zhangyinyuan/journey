package com.yuan.ngu.test.jdk18;

import java.io.Serializable;

public class JsonPo implements Serializable {
    private static final long serialVersionUID = -645413612097167854L;

    private String escOrderId;
    private String remark;

    public JsonPo(String escOrderId, String remark) {
        this.escOrderId = escOrderId;
        this.remark = remark;
    }

    public String getEscOrderId() {
        return escOrderId;
    }

    public void setEscOrderId(String escOrderId) {
        this.escOrderId = escOrderId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "JsonPo{" +
                "escOrderId='" + escOrderId + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
