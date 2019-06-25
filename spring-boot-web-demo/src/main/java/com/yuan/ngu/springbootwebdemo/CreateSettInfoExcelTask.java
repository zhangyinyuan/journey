/**
 * @Title: CreateSettInfoExcelTask.java
 * @Package com.tom.ule.timer
 * @Description: TODO
 * @author zhaolienan@ule.com
 * @date 2019年5月19日 下午5:38:39
 * @version V1.0
 */
package com.yuan.ngu.springbootwebdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Title: CreateSettInfoExcelTask.java
 * @Package com.tom.ule.timer
 * @Description: 定时补 普通结算单和补贴结算单 生成结算单模板
 * @author zhaolienan@ule.com
 * @date 2019年5月19日 下午5:38:39
 * @version V1.0
 */
@Component
public class CreateSettInfoExcelTask {
    private static final Logger log = LoggerFactory.getLogger(CreateSettInfoExcelTask.class);


    @Scheduled(cron = "*/30 * * * * ?")
    public void createSettInfo() {
        log.info("createSettInfo called");
    }

}
