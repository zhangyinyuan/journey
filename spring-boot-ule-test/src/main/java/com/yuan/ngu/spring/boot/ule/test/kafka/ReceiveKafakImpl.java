package com.yuan.ngu.spring.boot.ule.test.kafka;

import com.ule.tools.client.kafka.consumer.handler.AbstractConsumerHandler;
import kafka.utils.VerifiableProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class ReceiveKafakImpl extends AbstractConsumerHandler<HashMap<String, String>> {

    private static final Logger logger = LoggerFactory.getLogger(ReceiveKafakImpl.class);

    public ReceiveKafakImpl(VerifiableProperties props) {
        super(props);
    }

    @Override
    public void handle(String arg0, HashMap<String, String> arg1) {
        logger.info("handle called with arg0 = {} , arg1 = {}", arg0, arg1);
        String invoiceNo = arg1.get("invoiceNo");
        String escOrderid = arg1.get("escOrderid");
        logger.info("invoiceNo = {}, escOrderid = {}", invoiceNo, escOrderid);
        String correctInvoiceNo = arg1.get("correctInvoiceNo") == null ? null : arg1.get("correctInvoiceNo");
        logger.info("correctInvoiceNo = {}", correctInvoiceNo);
    }
}