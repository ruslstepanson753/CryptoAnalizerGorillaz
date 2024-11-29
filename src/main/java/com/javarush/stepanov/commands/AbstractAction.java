package com.javarush.stepanov.commands;

import static com.javarush.stepanov.constant.Constant.*;

abstract class AbstractAction implements Action {

    public char getEncoderedChar(char currentChar, int key) {
        if (ALPHABET.contains(String.valueOf(currentChar))){
            int indOfCurrentChar = ALPHABET.indexOf(currentChar);
            int indOfDecoderedChar = (indOfCurrentChar+key)%ALPHABET.length();
            return ALPHABET.charAt(indOfDecoderedChar);
        }else {
            return currentChar;
        }

    }

    public char getDecoderedChar(char currentChar, int key) {
        if (ALPHABET.contains(String.valueOf(currentChar))){
            int indOfCurrentChar = ALPHABET.indexOf(currentChar);
            int indOfDecoderedChar = indOfCurrentChar-key;
            if (indOfDecoderedChar < 0){
                indOfDecoderedChar += ALPHABET.length();
            }
            return ALPHABET.charAt(indOfDecoderedChar);

        }else {
            return currentChar;
        }
    }
}
