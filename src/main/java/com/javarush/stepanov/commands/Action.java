package com.javarush.stepanov.commands;

import com.javarush.stepanov.model.Result;

public interface Action {
    public Result execute(String[] parametrs);
}
