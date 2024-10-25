package com.example.customexceptionhandling.service;

import com.example.customexceptionhandling.exception.UserNameNotFoundException;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class MyDemoService {

    public String processData(String name) throws Exception {
        if(!name.equals("Srikumar"))
            throw new UserNameNotFoundException("404", "the specified name doesn't exist", HttpStatus.NOT_FOUND);
        return "processed successfully";
    }
}
