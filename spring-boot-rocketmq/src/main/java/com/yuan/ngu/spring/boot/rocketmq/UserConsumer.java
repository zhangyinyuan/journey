package com.yuan.ngu.spring.boot.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserConsumer {

    @PostConstruct
    public void init(){
        try {
            DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("test-group");

            consumer.setNamesrvAddr("localhost:9876");
            consumer.setInstanceName("rmq-instance");
            consumer.subscribe("user-topic", "user-tag");

            consumer.registerMessageListener((MessageListenerConcurrently) (msgs, context) -> {
                try {
                    for (MessageExt msg : msgs) {
                        System.out.println("消费者消费数据:"+new String(msg.getBody()));
                    }
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                } catch (Exception e) {
                    return ConsumeConcurrentlyStatus.RECONSUME_LATER;
                }
            });
            consumer.start();
        } catch (MQClientException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
