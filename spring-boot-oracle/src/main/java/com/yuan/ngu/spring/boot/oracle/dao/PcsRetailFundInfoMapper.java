package com.yuan.ngu.spring.boot.oracle.dao;


import com.yuan.ngu.spring.boot.oracle.pojo.po.PcsRetailFundInfo;

import java.math.BigDecimal;

public interface PcsRetailFundInfoMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(PcsRetailFundInfo record);

    int insertSelective(PcsRetailFundInfo record);

    PcsRetailFundInfo selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(PcsRetailFundInfo record);

    int updateByPrimaryKey(PcsRetailFundInfo record);
}