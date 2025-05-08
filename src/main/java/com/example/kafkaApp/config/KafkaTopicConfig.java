package com.example.kafkaApp.config;


import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@Slf4j
public class KafkaTopicConfig {
    @Bean
    public NewTopic notificationTopic(){
        log.info("creating notifcation topic");
        return TopicBuilder.name("notfications")
                .partitions(1)
                .replicas(1)
                .build();
    }

}
