package com.cloudurable.kafka.consumer;

import com.cloudurable.kafka.StockAppConstants;

import static com.cloudurable.kafka.consumer.ConsumerUtil.BROKERS;
import static com.cloudurable.kafka.consumer.ConsumerUtil.startConsumers;

public class ConsumerYellowMain {
    public static void main(String... args) throws Exception {
        final int delayMS = 100;
        final int workerCount = 3;
        final String clientId = "yellow";
        final String topic = StockAppConstants.TOPIC_STOCKS;

        startConsumers(BROKERS, delayMS, workerCount, clientId,
                topic);
    }
}
