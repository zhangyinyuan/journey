package com.yuan.ngu.spring.boot.ule.test.kafka;

import com.ule.tools.client.kafka.core.config.KafkaClientsConfig;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class ConsumerStartReceive implements InitializingBean {
	private KafkaClientsConfig kafkaClientsConfig;
	private List<String> ids;

	public void setKafkaClientsConfig(KafkaClientsConfig kafkaClientsConfig) {
		this.kafkaClientsConfig = kafkaClientsConfig;
	}
	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		for(String id : ids) {
			kafkaClientsConfig.newConsumer(id).startReceive();
		}
	}
}