package com.javarush.stepanov.commands;

import com.javarush.stepanov.exceptions.AppException;
import com.javarush.stepanov.model.Result;
import com.javarush.stepanov.model.ResultCode;

import java.io.*;

import static com.javarush.stepanov.constant.Constant.*;
import static com.javarush.stepanov.constant.Constant.EXCEPTION_FILE_READ_WRITE;

public class Decode extends AbstractAction{
    @Override
    public Result execute(String[] parametrs) {

        String textFilePath = TXT_FOLDER+parametrs[0];
        String encryptedFilePath = TXT_FOLDER+parametrs[1];
        int keyOfEncode = Integer.parseInt(parametrs[2]);
//        Files.delete(Path.of(encryptedFilePath));

        try(BufferedReader reader = new BufferedReader(new FileReader(textFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(encryptedFilePath)))
        {
            while (reader.ready()){
                char charToEncode = (char)reader.read();
                char encodedChar = super.getDecoderedChar(charToEncode,keyOfEncode);
                writer.write(encodedChar);
            }

        } catch (FileNotFoundException e) {
            throw new AppException(EXCEPTION_FILE_READ_WRITE,e);
        } catch (IOException e) {
            throw new AppException(EXCEPTION_FILE_READ_WRITE,e);
        }

        return new Result(RESULT_DECODE_OK_MESSAGE, ResultCode.OK);
    }
}
