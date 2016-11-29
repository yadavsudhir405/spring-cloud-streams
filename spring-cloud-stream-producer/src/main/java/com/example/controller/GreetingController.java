package com.example.controller;


import com.example.channels.ProducerChannel;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sudhir
 *         Date:11/11/16
 *         Time:12:28 AM
 *         Project:spring-cloud-stream-rabbitmq
 */
@RestController
public class GreetingController {
    private final MessageChannel consumer;
    private final MessageChannel salesConsumer;
    @Autowired
    private  Logger logger;
    public GreetingController(ProducerChannel consumer) {
        this.consumer = consumer.consumer();
        this.salesConsumer=consumer.salesService();
    }

    @PostMapping("greet/{name}")
    public void publish(@PathVariable String name){
            String greeting="Hello "+name;
        Message<String> message= MessageBuilder.withPayload(greeting).build();
        consumer.send(message);
        logger.info("Message Sent to RabbitMq");
    }
    @PostMapping("sales/{name}")
    public void sales(@PathVariable String name){
        String greeting="Sales "+name;
        Message<String> message= MessageBuilder.withPayload(greeting).build();
        salesConsumer.send(message);
        logger.info("Message Sent to RabbitMq");
    }
}
