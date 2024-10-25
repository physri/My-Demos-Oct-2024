package com.example.customexceptionhandling.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class UserNameNotFoundException extends RuntimeException {
    private final String errorCode;
    private final String message;
    private final HttpStatus httpStatus;
}
