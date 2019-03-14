package com.yuan.ngu.spring.boot.oracle.pojo.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 对账记录
 */
public class DailyCheckRecord implements Serializable {
    private static final long serialVersionUID = 1075743518583652003L;
    private BigDecimal id;
    //类型：1支付完成对账，2签收对账3退款对账,4 3101支付完成对账
    private BigDecimal type;
    //对账接口返回的字符串
    private String info;
    //应发数
    private BigDecimal totalpushNum;
    //实发数
    private BigDecimal actualpushNum;
    //落地成功数
    private BigDecimal successNum;
    //因推与实推差异订单数
    private BigDecimal notpushNum;
    //实推与落地差异订单数
    private BigDecimal failesNum;
    //OLD：因推与实推差异订单号，NEW：落地异常订单列表
    private String diffactutalsets;
    //OLD：实推与落地差异订单号，NEW： 补推异常订单列表
    private String failescorders;
    //接收落地数
    private Date updateTime;
    private Date createTime;
    private String remark;
    private BigDecimal validFlag;
    //接收落地数
    private BigDecimal receiveNum;
    //补推数
    private BigDecimal repeatNum;
    //补推落地数
    private BigDecimal repeatrecNum;
    //补推落地成功数
    private BigDecimal repeatrecsuNum;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public BigDecimal getTotalpushNum() {
        return totalpushNum;
    }

    public void setTotalpushNum(BigDecimal totalpushNum) {
        this.totalpushNum = totalpushNum;
    }

    public BigDecimal getActualpushNum() {
        return actualpushNum;
    }

    public void setActualpushNum(BigDecimal actualpushNum) {
        this.actualpushNum = actualpushNum;
    }

    public BigDecimal getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(BigDecimal successNum) {
        this.successNum = successNum;
    }

    public BigDecimal getNotpushNum() {
        return notpushNum;
    }

    public void setNotpushNum(BigDecimal notpushNum) {
        this.notpushNum = notpushNum;
    }

    public BigDecimal getFailesNum() {
        return failesNum;
    }

    public void setFailesNum(BigDecimal failesNum) {
        this.failesNum = failesNum;
    }

    public String getDiffactutalsets() {
        return diffactutalsets;
    }

    public void setDiffactutalsets(String diffactutalsets) {
        this.diffactutalsets = diffactutalsets;
    }

    public String getFailescorders() {
        return failescorders;
    }

    public void setFailescorders(String failescorders) {
        this.failescorders = failescorders;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(BigDecimal receiveNum) {
        this.receiveNum = receiveNum;
    }

    public BigDecimal getRepeatNum() {
        return repeatNum;
    }

    public void setRepeatNum(BigDecimal repeatNum) {
        this.repeatNum = repeatNum;
    }

    public BigDecimal getRepeatrecNum() {
        return repeatrecNum;
    }

    public void setRepeatrecNum(BigDecimal repeatrecNum) {
        this.repeatrecNum = repeatrecNum;
    }

    public BigDecimal getRepeatrecsuNum() {
        return repeatrecsuNum;
    }

    public void setRepeatrecsuNum(BigDecimal repeatrecsuNum) {
        this.repeatrecsuNum = repeatrecsuNum;
    }

    public BigDecimal getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(BigDecimal validFlag) {
        this.validFlag = validFlag;
    }
}
