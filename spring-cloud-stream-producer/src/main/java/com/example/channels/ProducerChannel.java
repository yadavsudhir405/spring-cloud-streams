package com.example.channels;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author sudhir
 *         Date:11/11/16
 *         Time:12:25 AM
 *         Project:spring-cloud-stream-rabbitmq
 */
public interface ProducerChannel {
    String GREETING_CHANNEL="greeting";
    String SALES_CHANNEL="sales";

    @Output(ProducerChannel.GREETING_CHANNEL)
    MessageChannel consumer();

    @Output(ProducerChannel.SALES_CHANNEL)
    MessageChannel salesService();
}
