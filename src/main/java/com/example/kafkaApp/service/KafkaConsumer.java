package com.example.kafkaApp.service;

import com.example.kafkaApp.Model.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "notifications",groupId = "notfications-group")
    public void listen(Notification notification){
        log.info("Received Notification {} ",notification);

    }
}
