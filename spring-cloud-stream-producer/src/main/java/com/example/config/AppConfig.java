package com.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sudhir
 *         Date:24/11/16
 *         Time:7:21 PM
 *         Project:spring-cloud-stream-rabbitmq
 */
@Configuration
public class AppConfig {
    @Bean
    public Logger logger(InjectionPoint injectionPoint){
        return LoggerFactory.getLogger(injectionPoint.getDeclaredType().getName());
    }
}
