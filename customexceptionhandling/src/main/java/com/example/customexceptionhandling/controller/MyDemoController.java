package com.example.customexceptionhandling.controller;

import com.example.customexceptionhandling.service.MyDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDemoController {
    @Autowired
    MyDemoService myDemoService;
    @GetMapping("/test123")
    public ResponseEntity<?> justAQuickCheck(@RequestParam String name) throws Exception {
        return ResponseEntity.ok(myDemoService.processData(name));
    }
}
