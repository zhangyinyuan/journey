package com.yuan.ngu.spring.boot.rocketmq;

import com.alibaba.fastjson.JSON;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;

/**
 * @Author 18011618
 * @Date 10:31 2018/7/18
 * @Function 模拟用户消息发送
 */
@Component
public class UserProducer {
    /**
     * 生产者的组名
     */
    @Value("my-producter-group")
    private String producerGroup;

    /**
     * NameServer 地址
     */
    @Value("localhost:9876")
    private String namesrvAddr;

    @PostConstruct
    public void produder() {
        DefaultMQProducer producer = new DefaultMQProducer(producerGroup);
        producer.setNamesrvAddr(namesrvAddr);
        try {
            producer.start();
            for (int i = 0; i < 100; i++) {
                UserContent userContent = new UserContent(String.valueOf(i),"abc"+i);
                String jsonstr = JSON.toJSONString(userContent);
                System.out.println("发送消息:"+jsonstr);
                Message message = new Message("user-topic", "user-tag", jsonstr.getBytes(RemotingHelper.DEFAULT_CHARSET));
                SendResult result = producer.send(message);
                System.err.println("发送响应：MsgId:" + result.getMsgId() + "，发送状态:" + result.getSendStatus());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            producer.shutdown();
        }
    }

    private class UserContent implements Serializable {
        String filed1,filed2;
        public UserContent(String filed1, String filed2) {
            this.filed1 = filed1;
            this.filed2 = filed2;
        }

        public String getFiled1() {
            return filed1;
        }

        public void setFiled1(String filed1) {
            this.filed1 = filed1;
        }

        public String getFiled2() {
            return filed2;
        }

        public void setFiled2(String filed2) {
            this.filed2 = filed2;
        }
    }
}
