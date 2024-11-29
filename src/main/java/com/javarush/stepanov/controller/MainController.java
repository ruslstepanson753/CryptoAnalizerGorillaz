package com.javarush.stepanov.controller;
import com.javarush.stepanov.commands.Action;
import com.javarush.stepanov.model.Result;

import java.io.IOException;

public class MainController {

    public Result doAction(String actionName, String[] parametrs) {
        Action action = Actions.find(actionName);
        Result result = action.execute(parametrs);
        return result;
    }
}
