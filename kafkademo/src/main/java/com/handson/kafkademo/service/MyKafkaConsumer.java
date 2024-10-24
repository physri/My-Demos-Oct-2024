package com.handson.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;

import org.springframework.stereotype.Service;

@Service
public class MyKafkaConsumer {
    @KafkaListener(topics = "my_topic1", groupId = "cons_grp_001")
    public void getMsgsFromMyTopic(String receivedMsg) {
        System.out.println("you hav a msg from the topic ==> " + receivedMsg);
    }
}
