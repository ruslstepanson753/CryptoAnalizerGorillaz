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

    public static final String CONSOLE_ENCODE_HELP = "Encrypt from file to file using key";
    public static final String CONSOLE_DECODE_HELP = "Decrypt from file to file using key";
    public static final String CONSOLE_BRUTEFORCE_HELP = "Decrypt from file to file using brute force";
    public static final String CONSOLE_ANALYZE_HELP = "Decrypt from file to file using statistical analysis";

    public static final String CONSOLE_SOURCE_FILE = "<source file>";
    public static final String CONSOLE_DICT_FILE = "<dict file>";
    public static final String CONSOLE_DEST_FILE = "<dest file>";
    public static final String CONSOLE_KEY = "<key>";

    public static final String CONSOLE_SOURCE_HELP = "source file with text to encrypt";
    public static final String CONSOLE_ENCRYPTED_SOURCE_HELP = "source file with encrypted text";
    public static final String CONSOLE_DICT_HELP = "dictionary file with sample test";
    public static final String CONSOLE_DEST_FILE_HELP = "dest file which should have decrypted text";
    public static final String CONSOLE_DEST_ENCRYPTED_FILE_HELP = "dest file which should have encrypted text";
    public static final String CONSOLE_KEY_HELP = "key for encryption";

    public static final String CONSOLE_SPECIFY_A_SUBCOMMAND = "Specify a subcommand";
    public static final String CONSOLE_APP_NAME = "PicocliRunner";
    public static final String CONSOLE_APP_DESCRIPTION = "Example: PicocliRunner command parameters...";

    public static final String TXT_FOLDER = System.getProperty("user.dir")+ File.separator+"text"+File.separator;

}
