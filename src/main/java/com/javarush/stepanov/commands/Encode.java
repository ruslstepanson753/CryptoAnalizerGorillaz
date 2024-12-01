package com.javarush.stepanov.commands;

import com.javarush.stepanov.model.Result;
import com.javarush.stepanov.model.ResultCode;

import static com.javarush.stepanov.constant.Constant.*;


public class Encode extends AbstractAction {
    @Override
    public Result execute(String[] parametrs) {
        String keyForEncode = "-" + parametrs[2];
        String[] parametrsForEncode = new String[]{parametrs[0], parametrs[1], keyForEncode};
        writeToFileByKey(parametrsForEncode);
        return new Result(RESULT_ENCODE_OK_MESSAGE, ResultCode.OK);
    }
}
