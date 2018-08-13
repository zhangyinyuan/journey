package com.yuan.ngu.kafka;

public class Main {

	private static final String TOPIC = "KAFKA_ULEWALLET_ULEWALLET_ADDMONEY_NOTIFY";

	private static final String GROUP = "PCS_COMMISSION_GRANT_ASK";

	public static void main(final String[] args) throws InterruptedException {
		final Consumer consumer1 = new Consumer(TOPIC, GROUP, "Con1");
		final Thread consumer1Thread = new Thread(consumer1);
		consumer1Thread.start();
	}
}