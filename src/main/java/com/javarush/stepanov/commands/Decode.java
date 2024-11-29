package com.javarush.stepanov.commands;

import com.javarush.stepanov.model.Result;
import com.javarush.stepanov.model.ResultCode;

import static com.javarush.stepanov.constant.Constant.RESULT_DECODE_OK_MESSAGE;
import static com.javarush.stepanov.constant.Constant.RESULT_ENCODE_OK_MESSAGE;

public class Decode implements Action{
    @Override
    public Result execute(String[] parametrs) {

        return new Result(RESULT_DECODE_OK_MESSAGE, ResultCode.OK);
    }
}
