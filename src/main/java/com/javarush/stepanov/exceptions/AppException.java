package com.javarush.stepanov.exceptions;

public class AppException extends RuntimeException {
    public AppException(String message) {
        super(message);
    }
}
