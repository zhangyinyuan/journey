package com.yuan.ngu.springbootmybatis.model;

import java.io.Serializable;

public class Demo implements Serializable {
    private static final long serialVersionUID = -8418018251159928593L;
    private Integer demoId;
    private String demoRemark;

    public Demo() {
    }

    public Integer getDemoId() {
        return demoId;
    }

    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    public String getDemoRemark() {
        return demoRemark;
    }

    public void setDemoRemark(String demoRemark) {
        this.demoRemark = demoRemark;
    }
}
