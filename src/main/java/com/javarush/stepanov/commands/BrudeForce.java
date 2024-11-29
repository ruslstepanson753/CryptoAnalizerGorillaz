package com.javarush.stepanov.commands;

import com.javarush.stepanov.exceptions.AppException;
import com.javarush.stepanov.model.Result;
import com.javarush.stepanov.model.ResultCode;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static com.javarush.stepanov.constant.Constant.*;

public class BrudeForce extends AbstractAction{

    @Override
    public Result execute(String[] parametrs) {
        SortedMap<Character, Integer> countOfSimbolsInEncodedText = getMapAlphabet();
        String textOfEncodingFilePath = TXT_FOLDER+parametrs[0];
        toCountTheNumberOfCharacters(textOfEncodingFilePath, countOfSimbolsInEncodedText);
        int key = getKey(countOfSimbolsInEncodedText);
        String[] parametrsForDecoder = new String[]{parametrs[0], parametrs[1],String.valueOf(key)};
        codingToFileByKey(parametrsForDecoder);
        return new Result(RESULT_BRUDEFORCE_OK_MESSAGE, ResultCode.OK);
    }

    private int getKey(SortedMap<Character, Integer> countOfSimbolsInEncodedText) {
        char encodedSpaceCharacter = getEncodedSpaceCharacter(countOfSimbolsInEncodedText);
        int key = ALPHABET.indexOf(encodedSpaceCharacter)-ALPHABET.indexOf(' ');
        if (key<0) {
            key+=ALPHABET.length();
        }
        return key;
    }




}
