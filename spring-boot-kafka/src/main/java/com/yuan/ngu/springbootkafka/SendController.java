package com.yuan.ngu.springbootkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SendController {

    @Autowired
    KafkaSender kafkaSender;

    @RequestMapping("/testSend")
    public Object testSend() {
        kafkaSender.send();
        return System.currentTimeMillis();
    }
}
