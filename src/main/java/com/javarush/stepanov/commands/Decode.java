package com.javarush.stepanov.commands;

import com.javarush.stepanov.model.Result;
import com.javarush.stepanov.model.ResultCode;

import static com.javarush.stepanov.constant.Constant.*;

public class Decode extends AbstractAction {
    @Override
    public Result execute(String[] parametrs) {
        writeToFileByKey(parametrs);
        return new Result(RESULT_DECODE_OK_MESSAGE, ResultCode.OK);
    }
}
