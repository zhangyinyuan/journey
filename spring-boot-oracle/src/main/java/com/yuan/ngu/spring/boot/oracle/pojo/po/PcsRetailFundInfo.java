package com.yuan.ngu.spring.boot.oracle.pojo.po;

import java.util.Date;

public class PcsRetailFundInfo {
	private String id;

	private String merchantId;

	private String merchantName;

	private String orgProvinceId;

	private String orgProvinceName;

	private String orderNo;

	private String amount;

	private Date dataHandleTime;

	private Integer dataFlag;

	private Integer orderType;

	private Integer busiType;

	private String recordDate;

	private Date createTime;

	private String remark;

	private Short validFlag;

	private String dataRemark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOrgProvinceId() {
		return orgProvinceId;
	}

	public void setOrgProvinceId(String orgProvinceId) {
		this.orgProvinceId = orgProvinceId;
	}

	public String getOrgProvinceName() {
		return orgProvinceName;
	}

	public void setOrgProvinceName(String orgProvinceName) {
		this.orgProvinceName = orgProvinceName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getDataHandleTime() {
		return dataHandleTime;
	}

	public void setDataHandleTime(Date dataHandleTime) {
		this.dataHandleTime = dataHandleTime;
	}

	public Integer getDataFlag() {
		return dataFlag;
	}

	public void setDataFlag(Integer dataFlag) {
		this.dataFlag = dataFlag;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getBusiType() {
		return busiType;
	}

	public void setBusiType(Integer busiType) {
		this.busiType = busiType;
	}

	public String getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
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

	public Short getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Short validFlag) {
		this.validFlag = validFlag;
	}

	public String getDataRemark() {
		return dataRemark;
	}

	public void setDataRemark(String dataRemark) {
		this.dataRemark = dataRemark;
	}
}