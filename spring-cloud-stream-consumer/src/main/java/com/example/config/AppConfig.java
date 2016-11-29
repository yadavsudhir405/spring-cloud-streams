package com.example.config;

import com.example.channel.ConsumerChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;


/**
 * @author sudhir
 *         Date:24/11/16
 *         Time:8:20 PM
 *         Project:spring-cloud-stream-rabbitmq-consumer
 */
@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    Logger logger(InjectionPoint injectionPoint){
        return LoggerFactory.getLogger(injectionPoint.getDeclaredType().getName());
    }

    /*@Bean
    IntegrationFlow integrationFlow(ConsumerChannel consumerChannel, Logger logger){
        return IntegrationFlows.from(consumerChannel.producer())
                .handle(String.class,(payload,headers)->{
                    System.out.println(payload);
                    //logger.info("Message Received::"+payload);
                return null;
        }).get();
    }

    @Bean
    IntegrationFlow salesIntegrationFlow(ConsumerChannel consumerChannel1, Logger logger){
        return IntegrationFlows.from(consumerChannel1.sales())
                .handle(String.class,(payload,headers)->{
                    System.out.println(payload);
                    logger.info("Sales Received::"+payload);
                    return null;
                }).get();
    }*/
}
