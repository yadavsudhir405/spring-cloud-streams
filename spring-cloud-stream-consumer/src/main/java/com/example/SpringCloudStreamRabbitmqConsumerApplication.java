package com.example;

import com.example.channel.ConsumerChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ConsumerChannel.class)
public class SpringCloudStreamRabbitmqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamRabbitmqConsumerApplication.class, args);
	}
}
