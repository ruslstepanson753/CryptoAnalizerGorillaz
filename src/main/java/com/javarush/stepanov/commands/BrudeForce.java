package com.javarush.stepanov.commands;

import com.javarush.stepanov.model.Result;
import com.javarush.stepanov.model.ResultCode;

import static com.javarush.stepanov.constant.Constant.RESULT_BRUDEFORCE_OK_MESSAGE;
import static com.javarush.stepanov.constant.Constant.RESULT_DECODE_OK_MESSAGE;

public class BrudeForce extends AbstractAction{
    @Override
    public Result execute(String[] parametrs) {

        return new Result(RESULT_BRUDEFORCE_OK_MESSAGE, ResultCode.OK);
    }
}
