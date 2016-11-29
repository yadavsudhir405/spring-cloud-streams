package com.example;

import com.example.channels.ProducerChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;


@EnableBinding(ProducerChannel.class)
@SpringBootApplication
public class SpringCloudStreamRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamRabbitmqApplication.class, args);
	}
}
