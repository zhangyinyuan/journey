package com.yuan.ngu.kafka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.ConsumerTimeoutException;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.message.MessageAndMetadata;
import kafka.serializer.StringDecoder;

public class Consumer implements Runnable {
	private final String topic;
	final Properties props = new Properties();
	final String group;
	final String consumerName;

	public Consumer(final String topic, final String group, final String name) {

		this.props.put("zookeeper.connect", "zk01.beta.uledns.com:2181,zk02.beta.uledns.com:2181,zk03.beta.uledns.com:2181");
		this.props.put("group.id", group); // Configure consumer group
		this.props.put("zookeeper.session.timeout.ms", "400");
		this.props.put("zookeeper.sync.time.ms", "200");
		this.props.put("auto.commit.enable", "false");
		this.props.put("consumer.timeout.ms", "1000");
		// this.props.put("auto.commit.interval.ms", "1000");
		// if you create a new group with this it will consume from the beginning
		// this.props.put("auto.offset.reset", "smallest");
		this.topic = topic;
		this.group = group;
		this.consumerName = name;
	}

	@Override
	public void run() {
		// Use the configuration to create the ConsumerConnector
		final ConsumerConfig consumerConfig = new ConsumerConfig(this.props);

		// Create ConsumerConnector with createJavaConsumerConnector
		final ConsumerConnector consumerConnector = kafka.consumer.Consumer.createJavaConsumerConnector(consumerConfig);
		// Create a map of topics we are interested in with the number of
		// streams (usually threads) to service the topic
		final Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
		topicCountMap.put(this.topic, 1);

		// Get the list of streams and configure it to use Strings
		final Map<String, List<KafkaStream<String, String>>> consumerMap = consumerConnector.createMessageStreams(topicCountMap,
						new StringDecoder(null), new StringDecoder(null));

		// Get the stream for the topic we want to consume
		final KafkaStream<String, String> stream = consumerMap.get(this.topic).get(0);

		// Iterate through all of the messages in the stream
		final ConsumerIterator<String, String> it = stream.iterator();

		while (this.hasNext(it)) {
			final MessageAndMetadata<String, String> messageAndMetadata = it.next();

			final String key = messageAndMetadata.key();
			final String value = messageAndMetadata.message();
			final Long offset = messageAndMetadata.offset();

			System.out.println(this.consumerName + ", group.id: " + this.group + ", Key is \"" + key + "\" value is \"" + value + "\", offset: "
							+ offset);
			consumerConnector.commitOffsets();
		}
		try {
			Thread.sleep(1000);
		} catch (final InterruptedException ie) {

		}
		consumerConnector.shutdown(); // Shutdown the connector once we are done with it
	}

	boolean hasNext(final ConsumerIterator<String, String> it) {
		try {
			it.hasNext();
			return true;
		} catch (final ConsumerTimeoutException e) {
			return false;
		}
	}

}
