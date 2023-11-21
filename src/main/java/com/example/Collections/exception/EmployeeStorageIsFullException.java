package com.example.Collections.exception;


public class EmployeeStorageIsFullException extends RuntimeException {

    public EmployeeStorageIsFullException(String  message) {
        super(message);
    }
}