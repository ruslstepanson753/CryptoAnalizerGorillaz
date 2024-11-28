package com.javarush.stepanov.constant;

public class Constant {
    private static final String LETTERS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "\n☮.,”’:-!? ";
    public static final String ALPHABET = LETTERS + NUMBERS + SYMBOLS;
    public static final char[] ALPHABET_CHAR_ARRAY= ALPHABET.toCharArray();

    public static final String EXCEPTION_NO_ARGS = "there is no args";

}
