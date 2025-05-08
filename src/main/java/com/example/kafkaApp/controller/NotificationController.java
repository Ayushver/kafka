package com.example.kafkaApp.controller;

import com.example.kafkaApp.Model.Notification;
import com.example.kafkaApp.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {
    private final  KafkaProducer producer;

    @PostMapping
    public ResponseEntity<String> sendNotification(@RequestBody Notification notification){

        producer.sendNotification(notification);;
        return  ResponseEntity.ok("Notification sent sucessfulyy");
    }

}
