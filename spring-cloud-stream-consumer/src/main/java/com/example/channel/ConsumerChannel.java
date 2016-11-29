package com.example.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author sudhir
 *         Date:24/11/16
 *         Time:8:19 PM
 *         Project:spring-cloud-stream-rabbitmq-consumer
 */
public interface ConsumerChannel {
    String GREETING_CHANNEL="greeting";
    String SALES_CHANNEL="sales";

    @Input(ConsumerChannel.GREETING_CHANNEL)
    SubscribableChannel producer();
    @Input(ConsumerChannel.SALES_CHANNEL)
    SubscribableChannel sales();
}
