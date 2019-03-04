package com.yuan.ngu.spring.boot.oracle.pojo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DailyCheckRecordDto implements Serializable {
    private static final long serialVersionUID = -234609310903254944L;
    //对账时间
    private String createTime;
    //支付应推发数
    private BigDecimal totalpushNumWithPay;
    //支付实推发数
    private BigDecimal actualpushNumWithPay;
    //支付落地
    private BigDecimal successNumWithPay;
    //签收应推发数
    private BigDecimal totalpushNumWithSignFor;
    //签收实推发数
    private BigDecimal actualpushNumWithSignFor;
    //签收落地
    private BigDecimal successNumWithSignFor;
    //退款应推发数
    private BigDecimal totalpushNumWithRefund;
    //退款实推发数
    private BigDecimal actualpushNumWithRefund;
    //退款落地
    private BigDecimal successNumWithRefund;
    //monitor 销售支付完成(数据落地)
    private BigDecimal payDoneNum;
    //销售入账完成
    private BigDecimal payInAccountDoneNum;
    //退款完成
    private BigDecimal refundDoneNum;
    //退款入账完成
    private BigDecimal refundInAccountDoneNum;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getTotalpushNumWithPay() {
        return totalpushNumWithPay;
    }

    public void setTotalpushNumWithPay(BigDecimal totalpushNumWithPay) {
        this.totalpushNumWithPay = totalpushNumWithPay;
    }

    public BigDecimal getActualpushNumWithPay() {
        return actualpushNumWithPay;
    }

    public void setActualpushNumWithPay(BigDecimal actualpushNumWithPay) {
        this.actualpushNumWithPay = actualpushNumWithPay;
    }

    public BigDecimal getSuccessNumWithPay() {
        return successNumWithPay;
    }

    public void setSuccessNumWithPay(BigDecimal successNumWithPay) {
        this.successNumWithPay = successNumWithPay;
    }

    public BigDecimal getTotalpushNumWithSignFor() {
        return totalpushNumWithSignFor;
    }

    public void setTotalpushNumWithSignFor(BigDecimal totalpushNumWithSignFor) {
        this.totalpushNumWithSignFor = totalpushNumWithSignFor;
    }

    public BigDecimal getActualpushNumWithSignFor() {
        return actualpushNumWithSignFor;
    }

    public void setActualpushNumWithSignFor(BigDecimal actualpushNumWithSignFor) {
        this.actualpushNumWithSignFor = actualpushNumWithSignFor;
    }

    public BigDecimal getSuccessNumWithSignFor() {
        return successNumWithSignFor;
    }

    public void setSuccessNumWithSignFor(BigDecimal successNumWithSignFor) {
        this.successNumWithSignFor = successNumWithSignFor;
    }

    public BigDecimal getTotalpushNumWithRefund() {
        return totalpushNumWithRefund;
    }

    public void setTotalpushNumWithRefund(BigDecimal totalpushNumWithRefund) {
        this.totalpushNumWithRefund = totalpushNumWithRefund;
    }

    public BigDecimal getActualpushNumWithRefund() {
        return actualpushNumWithRefund;
    }

    public void setActualpushNumWithRefund(BigDecimal actualpushNumWithRefund) {
        this.actualpushNumWithRefund = actualpushNumWithRefund;
    }

    public BigDecimal getSuccessNumWithRefund() {
        return successNumWithRefund;
    }

    public void setSuccessNumWithRefund(BigDecimal successNumWithRefund) {
        this.successNumWithRefund = successNumWithRefund;
    }

    public BigDecimal getPayDoneNum() {
        return payDoneNum;
    }

    public void setPayDoneNum(BigDecimal payDoneNum) {
        this.payDoneNum = payDoneNum;
    }

    public BigDecimal getPayInAccountDoneNum() {
        return payInAccountDoneNum;
    }

    public void setPayInAccountDoneNum(BigDecimal payInAccountDoneNum) {
        this.payInAccountDoneNum = payInAccountDoneNum;
    }

    public BigDecimal getRefundDoneNum() {
        return refundDoneNum;
    }

    public void setRefundDoneNum(BigDecimal refundDoneNum) {
        this.refundDoneNum = refundDoneNum;
    }

    public BigDecimal getRefundInAccountDoneNum() {
        return refundInAccountDoneNum;
    }

    public void setRefundInAccountDoneNum(BigDecimal refundInAccountDoneNum) {
        this.refundInAccountDoneNum = refundInAccountDoneNum;
    }
}
