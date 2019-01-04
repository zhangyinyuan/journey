package com.yuan.ngu.springbootmybatis.model;

public class Demo {
    private String demoId;

    private String demoRemark;

    public String getDemoId() {
        return demoId;
    }

    public void setDemoId(String demoId) {
        this.demoId = demoId == null ? null : demoId.trim();
    }

    public String getDemoRemark() {
        return demoRemark;
    }

    public void setDemoRemark(String demoRemark) {
        this.demoRemark = demoRemark == null ? null : demoRemark.trim();
    }
}