package com.yuan.ngu.spring.boot.oracle.dao;

import com.yuan.ngu.spring.boot.oracle.pojo.dto.DailyCheckRecordDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 *
 */
public interface DailyCheckRecordMapper {
    List<DailyCheckRecordDto> selectReconciliationList(@Param("reconciliationBeginDate") String reconciliationBeginDate, @Param("reconciliationEnd") String reconciliationEnd);
}
