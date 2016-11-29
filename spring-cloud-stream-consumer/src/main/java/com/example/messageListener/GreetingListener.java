package com.example.messageListener;

import com.example.channel.ConsumerChannel;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author sudhir
 *         Date:25/11/16
 *         Time:1:11 PM
 *         Project:spring-cloud-stream-rabbitmq-consumer
 */
@Component
public class GreetingListener {
    @Autowired
    private Logger logger;
    @StreamListener(ConsumerChannel.GREETING_CHANNEL)
    public void handleGreetMessage(String greetMessage){
        logger.info("Message Received from Greeting Channel:{0}",greetMessage);
    }
}
