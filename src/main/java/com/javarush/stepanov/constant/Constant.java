package com.javarush.stepanov.constant;

import java.io.File;

public class Constant {
    private static final String LETTERS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "\n☮.,”’:-!? ";
    public static final String ALPHABET = LETTERS + NUMBERS + SYMBOLS;

    public static final String EXCEPTION_NO_ARGS = "there is no args";
    public static final String EXCEPTION_ILLEGAL_COMMAND = "the command was entered incorrectly";
    public static final String EXCEPTION_FILE_READ_WRITE = "An error occurred while reading or writing the file";

    public static final String RESULT_DECODE_OK_MESSAGE = "decode operation was successful";
    public static final String RESULT_ENCODE_OK_MESSAGE = "encode operation was successful";
    public static final String RESULT_BRUDEFORCE_OK_MESSAGE = "brudeforce operation was successful";
    public static final String RESULT_ANALIZE_OK_MESSAGE = "analize operation was successful";


    public static final String TXT_FOLDER = System.getProperty("user.dir")+ File.separator+"text"+File.separator;

}
