package com.example.messageListener;

import com.example.channel.ConsumerChannel;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author sudhir
 *         Date:25/11/16
 *         Time:1:14 PM
 *         Project:spring-cloud-stream-rabbitmq-consumer
 */
@Component
public class SalesListener {
    @Autowired
    private Logger logger;
    @StreamListener(ConsumerChannel.SALES_CHANNEL)
    public void handleSalesMessage(String salesMessage){
        logger.info("Message Received from Sales Channel:{0}",salesMessage);
    }
}
