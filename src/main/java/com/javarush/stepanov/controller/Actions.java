package com.javarush.stepanov.controller;

import com.javarush.stepanov.commands.*;
import com.javarush.stepanov.exceptions.AppException;

import static com.javarush.stepanov.constant.Constant.EXCEPTION_ILLEGAL_COMMAND;

public enum Actions {
    DECODE(new Decode()),
    ENCODE(new Encode ()),
    BRUDEFORCE(new BrudeForce());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        try {
            Actions actions = Actions.valueOf(actionName.toUpperCase());
            return actions.action;

        }catch (IllegalArgumentException e) {
            throw new AppException(EXCEPTION_ILLEGAL_COMMAND+actionName,e);
        }
    }
}
