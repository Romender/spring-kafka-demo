package com.rome.spring.kafka.example.demo;

import com.rome.spring.kafka.example.demo.config.KafkaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Import(KafkaConfiguration.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@KafkaListener(topics = "MyTopic" ,groupId = "MyGroup")
	public void receiveMessage(String message) {
		System.out.println("From the Kafka ----> " +message);
	}
}
