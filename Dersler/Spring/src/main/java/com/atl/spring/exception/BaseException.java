package com.atl.spring.exception;

import org.springframework.http.HttpStatus;

public class BaseException extends RuntimeException{
    private final HttpStatus status;

    public BaseException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public int getStatus() {
        return status.value();
    }
}