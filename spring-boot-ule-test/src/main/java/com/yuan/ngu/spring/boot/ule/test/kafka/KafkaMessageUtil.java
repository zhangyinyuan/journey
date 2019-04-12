package com.yuan.ngu.spring.boot.ule.test.kafka;

import com.ule.tools.client.kafka.core.config.KafkaClientsConfig;
import com.ule.tools.client.kafka.producer.Producer;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * Mq消息接收类
 */
public class KafkaMessageUtil {

    private static Logger log = Logger.getLogger(KafkaMessageUtil.class);

    /**
     * 启动配置的所有KAFKA接收器
     */
	/*public static void startAllConsumers() {
		System.out.println("---11");
		// 获取默认路径下的kafka-clients-cfg.xml
		KafkaClientsConfig config = KafkaClientsConfig.DEFAULT_INSTANCE;
		Map<String, ConsumerCfg<?>> allConsumerCfgs = config.getConsumers();
		for (Entry<String, ConsumerCfg<?>> consumerCfgEntry : allConsumerCfgs.entrySet()) {
			// 由于基础服务组Consumer在new的时候就会去连接服务器，所以不支持在xml配置文件中将url配置为1，
			// 然后从properties文件中获取Kafka服务器url，再setZookeeperConnect来替换。
			// 而且基础服务组封装的类中属性皆为final，亦不能修改，
			// 故自行扩展子类，开放setZookeeperConnect方法，赶在newConsumer之前替换掉url
			String zookeeperConnect = PcsVoDasConstant.get(PcsVoDasConstant.KAFKA_ZOOKEEPER_URL
			        + consumerCfgEntry.getValue().getZookeeperConnect());
			@SuppressWarnings({ "unchecked", "rawtypes" })
			ConsumerCfg<?> consumerCfg = new SoConsumerCfg(consumerCfgEntry.getValue(),zookeeperConnect);
			allConsumerCfgs.put(consumerCfgEntry.getKey(), consumerCfg);
			log.info("prepare to start consumer[" + consumerCfg.getTopic() + "]");
			// 参数为配置文件中Consumer的id内容
			try {
				// Kafka服务器
				Consumer<?> consumer = config.newConsumer(consumerCfg.getId());
				log.info("consumer[" + consumerCfg.getTopic() + "] zookeeperConnect:"
				        + consumer.getZookeeperConnect());
				// 参数为启动时间,单位为Seconds,如果<0，则一直开下去，直到结束
				consumer.startReceive();
			} catch (Exception e) {
				log.error("start kafka consumer failed, topic:" + consumerCfg.getTopic(), e);
			}
		}
	}*/

    /**
     * 初始化所有Producers
     */
	/*public static void initAllProducers() {
		// 获取默认路径下的kafka-clients-cfg.xml
		KafkaClientsConfig config = KafkaClientsConfig.DEFAULT_INSTANCE;
		Map<String, ProducerCfg<?>> allProducerCfgs = config.getProducers();
		for (Entry<String, ProducerCfg<?>> producerCfgEntry : allProducerCfgs.entrySet()) {
			// 由于基础服务组Producer在new的时候就会去连接服务器，所以不支持在xml配置文件中将url配置为1，
			// 然后从properties文件中获取Kafka服务器url，再setKafkaBrokers来替换。
			// 而且基础服务组封装的类中属性皆为final，亦不能修改，
			// 故自行扩展子类，开放setKafkaBrokers方法，赶在newProducer之前替换掉url
			String kafkaBrokers = PcsVoDasConstant.get(PcsVoDasConstant.KAFKA_BROKER_URL
			        + producerCfgEntry.getValue().getKafkaBrokers());
			@SuppressWarnings({ "unchecked", "rawtypes" })
			ProducerCfg<?> producerCfg = new SoProducerCfg(producerCfgEntry.getValue(),
			        kafkaBrokers);
			allProducerCfgs.put(producerCfgEntry.getKey(), producerCfg);
		}
	}*/

    /**
     * 生产一条kafka消息，json格式
     *
     * @param producerId
     * @param data
     */
    public static void produceMsg(String key, String producerId, Serializable data) {
        log.info("produceMsg called with: key = " + key + ", producerId = " + producerId + ", data = " + data + "");
        try {
            // 获取默认路径下的kafka-clients-cfg.xml
            KafkaClientsConfig config = KafkaClientsConfig.DEFAULT_INSTANCE;
            Producer<Serializable> producer = (Producer<Serializable>) config.getOrCreateProducer(producerId);
            producer.send(key, data);
        } catch (Exception e) {
            log.error("produce message failed, id:" + producerId + ", data:" + data, e);
        }
    }

    /**
     * 批量生产kafka消息，json格式
     *
     * @param producerId
     * @param data
     */
    public static void produceMsgByBatch(String producerId, List<HashMap<String, String>> data) {
		/*try {
			// 获取默认路径下的kafka-clients-cfg.xml
			KafkaClientsConfig config = KafkaClientsConfig.DEFAULT_INSTANCE;

			// 参数为配置文件中Producer的id内容
			// Version:0.0.3-RELEASE之后使用该方法获取Producer
			@SuppressWarnings("unchecked")
			Producer<String> producer = (Producer<String>) config.getOrCreateProducer(producerId);
			// 该方法在0.0.3-RELEASE后弃用
			// (Producer<TestObj>)config.newProducer("testObjProducer");

			// 批量生产的方法，比单个生产速度要快很多
			List<Message<String>> messages = new ArrayList<Message<String>>();
			for (HashMap<String, String> data1 : data) {
				//String jsonData = JsonUtil.toJson(data1);
				//messages.add(new Message<String>(null, jsonData));
			}
			producer.batchSend(messages);

			// producer.close(); Version:0.0.3-RELEASE之后无须手动close,程序会在程序结束的时候自动关闭producer
		} catch (Exception e) {
			log.error("produce message failed, id:" + producerId + ", data:" + data, e);
		}*/
    }
}
