package com.example.kafkaApp.service;

import com.example.kafkaApp.Model.Notification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {
    private static final String TOPIC = "notifications";

    private final KafkaTemplate<String, Notification> kafkaTemplate;

    public void sendNotification(Notification notification) {
        log.info("Sending notification : {} ", notification);
        kafkaTemplate.send(TOPIC,notification);
        log.info("Notification sent successfully");
    }
}
