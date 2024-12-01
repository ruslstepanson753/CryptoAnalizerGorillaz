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

    public static final String CONSOLE_ENCODE_HELP = "encode : to encrypt from file to file using key";
    public static final String CONSOLE_DECODE_HELP = "decode : to decrypt from file to file using key";
    public static final String CONSOLE_BRUTEFORCE_HELP = "brudeforce : to decrypt from file to file using brute force";

    public static final String CONSOLE_ENCRYPTED_SOURCE_HELP = "enter full path of encrypted text";
    public static final String CONSOLE_TO_ENCRYPT_SOURCE_HELP = "enter full path of text file to encrypt";
    public static final String CONSOLE_TO_DECRYPT_SOURCE_HELP = "enter full path of text file to decrypt";
    public static final String CONSOLE_DECRYPTED_SOURCE_HELP = "enter full path of decrypted text";
    public static final String CONSOLE_KEY_HELP = "enter key for encryption";

    public static final String CONSOLE_RESULT_HELP = "result file name:";

    public static final String CONSOLE_SPECIFY_A_SUBCOMMAND = "enter specify a subcommand:\n----------------------------------------------------";

    public static final String TXT_FOLDER = System.getProperty("user.dir")+ File.separator+"text"+File.separator;

}
