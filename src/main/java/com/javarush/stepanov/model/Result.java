package com.javarush.stepanov.model;

public class Result {

    private String message;
    private final ResultCode resultCode;

    public Result(String message, ResultCode resultCode) {
        this.message = message;
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return
                "message = " + message + "\n" +
                "resultCode = " + resultCode
                ;
    }
}
