package com.javarush.stepanov.commands;

import com.javarush.stepanov.exceptions.AppException;
import com.javarush.stepanov.model.Result;
import com.javarush.stepanov.model.ResultCode;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;

import static com.javarush.stepanov.constant.Constant.*;

public class Analize extends AbstractAction{


    @Override
    public Result execute(String[] parametrs) {
        String pathOfDict = TXT_FOLDER+parametrs[1];
        String textFilePath = TXT_FOLDER+ parametrs[0];
        char encodedSpaceCharacter;

        SortedMap<Character, Integer> countOfSimbolsInEncodedText = getMapAlphabet();
        String textOfEncodingFilePath = TXT_FOLDER+parametrs[0];
        toCountTheNumberOfCharacters(textOfEncodingFilePath, countOfSimbolsInEncodedText);
        encodedSpaceCharacter = getEncodedSpaceCharacter(countOfSimbolsInEncodedText);



        return new Result(RESULT_ANALIZE_OK_MESSAGE, ResultCode.OK);
    }





        public String creatRandomAlphabet(){
            List<Character> characters = new ArrayList<>();
            for (char c : ALPHABET.toCharArray()) {
                characters.add(c);
            }
            // Перемешиваем список
            Collections.shuffle(characters);
            // Собираем строку обратно
            StringBuilder shuffledString = new StringBuilder();
            for (char c : characters) {
                shuffledString.append(c);
            }
            return shuffledString.toString();
        }
    }
