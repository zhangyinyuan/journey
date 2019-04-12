package com.yuan.ngu.spring.boot.ule.test.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestKafkaController {
    private Logger logger = LoggerFactory.getLogger(TestKafkaController.class);

    @RequestMapping(path = "/publishKafka")
    public Object publishKafka(Map<String, Object> map) {
        KafkaMessageUtil.produceMsg("sdjflkajdfladfldsf65421981", "producer-OrderStatus-monitor", new HashMap<String, Object>());
        return "publishKafka";
    }
}
