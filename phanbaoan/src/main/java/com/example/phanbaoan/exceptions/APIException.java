package com.example.phanbaoan.exceptions;

public class APIException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public APIException() {
        super(); // calls the default constructor of RuntimeException
    }

    public APIException(String message) {
        super(message); // passes the message to the RuntimeException constructor
    }
}
