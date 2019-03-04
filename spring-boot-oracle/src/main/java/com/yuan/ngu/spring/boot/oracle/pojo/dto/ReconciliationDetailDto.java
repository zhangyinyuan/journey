package com.yuan.ngu.spring.boot.oracle.pojo.dto;

import java.io.Serializable;

public class ReconciliationDetailDto implements Serializable {
    private static final long serialVersionUID = 1167348087704784715L;
    private String escOrderId;
    private String VERSION;
    private String remark;

    public String getEscOrderId() {
        return escOrderId;
    }

    public void setEscOrderId(String escOrderId) {
        this.escOrderId = escOrderId;
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
