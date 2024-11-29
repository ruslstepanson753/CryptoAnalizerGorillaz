package com.javarush.stepanov.controller;

import com.javarush.stepanov.commands.Action;
import com.javarush.stepanov.commands.Decode;
import com.javarush.stepanov.commands.Encode;
import com.javarush.stepanov.exceptions.AppException;

import static com.javarush.stepanov.constant.Constant.EXCEPTION_ILLEGAL_COMMAND;

public enum Actions {
    DECODE(new Decode()),
    ENCODE(new Encode ());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String value) {
        try {
            Actions actions = Actions.valueOf(value.toUpperCase());
            return actions.action;

        }catch (IllegalArgumentException e) {
            throw new AppException(EXCEPTION_ILLEGAL_COMMAND);
        }
    }
}
