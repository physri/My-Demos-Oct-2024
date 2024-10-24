package com.handson.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyKafkaProducer {
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    public void sendMsgToMyTopic(String message){
        kafkaTemplate.send("my_topic1", message);
    }
}
