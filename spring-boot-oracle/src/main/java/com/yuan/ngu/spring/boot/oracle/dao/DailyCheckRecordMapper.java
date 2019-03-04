package com.yuan.ngu.spring.boot.oracle.dao;

import com.yuan.ngu.spring.boot.oracle.pojo.dto.DailyCheckRecordDto;
import com.yuan.ngu.spring.boot.oracle.pojo.dto.ReconciliationDetailDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 *
 */
public interface DailyCheckRecordMapper {
    List<DailyCheckRecordDto> selectReconciliationList(@Param("reconciliationBeginDate") String reconciliationBeginDate, @Param("reconciliationEnd") String reconciliationEnd);

    List<ReconciliationDetailDto> selectReconciliationDetail(@Param("reconciliationDate") String reconciliationDate, @Param("versionList") List<String> versionList);

    Map<String, Object> selectTodayExcAcountInfo(@Param("reconciliationDate") String reconciliationDate, @Param("versionList") List<String> versionList);

    String selectDiffactutalsets(@Param("reconciliationDate") String reconciliationDate, @Param("type") String type);

    List<ReconciliationDetailDto> selectDetailListByEscOderIds(List<String> escOrderIdList);

    List<String> selectUnusualOrderList(String reconciliationDate);

    List<ReconciliationDetailDto> selectDetailListByUnusualOrders(List<String> unusualOrderList, Integer unusualOrderType);

    List<ReconciliationDetailDto> selectInAccountDoneList(@Param("reconciliationDate") String reconciliationDate, @Param("status") Integer status);

    Set<String> selectLandingAnomaly(@Param("synchTime") String synchTime, @Param("version") int version, @Param("createUser") String createUser);

}
