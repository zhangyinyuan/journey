package com.yuan.ngu.spring.boot.ule.test.kafka;

import com.ule.tools.client.kafka.core.config.KafkaClientsConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

public class KafkaClientsConfigFactoryBean implements FactoryBean<KafkaClientsConfig>, InitializingBean {
	private KafkaClientsConfig kafkaClientsConfig;
	private Resource configLocation;

	public void setConfigLocation(Resource configLocation) {
		this.configLocation = configLocation;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
			
		System.setProperty("zookeeper.sasl.client", "false");
		System.setProperty("zookeeper.connectiontimeout.ms", "15000");
		kafkaClientsConfig = new KafkaClientsConfig(configLocation.getInputStream());
	}

	@Override
	public KafkaClientsConfig getObject() throws Exception {
		return kafkaClientsConfig;
	}

	@Override
	public Class<?> getObjectType() {
		return this.kafkaClientsConfig == null ? KafkaClientsConfig.class : this.kafkaClientsConfig.getClass();
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
