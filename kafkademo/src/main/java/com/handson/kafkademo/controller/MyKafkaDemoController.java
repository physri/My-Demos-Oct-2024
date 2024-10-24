package com.handson.kafkademo.controller;

import com.handson.kafkademo.service.MyKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/rest")
public class MyKafkaDemoController {
    @Autowired
    MyKafkaProducer producer;
    @GetMapping("/producer/get")
    public void getTheMsgsFrmTopic(@RequestParam("message") String message){
        producer.sendMsgToMyTopic(message);
    }
}
