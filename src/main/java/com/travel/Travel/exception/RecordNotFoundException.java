package com.travel.Travel.exception;

public class RecordNotFoundException extends RuntimeException{
    private static final long serialVersionUID = -332323232L;
    public RecordNotFoundException(String message) {
        super(message);
    }
}
