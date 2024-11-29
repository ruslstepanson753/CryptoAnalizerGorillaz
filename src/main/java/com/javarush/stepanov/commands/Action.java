package com.javarush.stepanov.commands;

import com.javarush.stepanov.model.Result;

import java.io.IOException;

public interface Action {
    public Result execute(String[] parametrs);
}
