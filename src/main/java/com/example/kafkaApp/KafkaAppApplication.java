package com.example.kafkaApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class KafkaAppApplication {

	public static void main(String[] args) {
		log.info("Starting Notification Service");
		SpringApplication.run(KafkaAppApplication.class, args);

	}

}
