package com.atl.spring.exception;


import org.springframework.http.HttpStatus;

public class StudentNotFoundException extends BaseException {
    public StudentNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }

    public StudentNotFoundException() {
      super("Student not found", HttpStatus.NOT_FOUND);
    }
}