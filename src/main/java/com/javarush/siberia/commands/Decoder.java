package com.javarush.siberia.commands;

import com.javarush.siberia.cipher.CaesarCipher;
import com.javarush.siberia.constants.Constants;
import com.javarush.siberia.entity.Result;
import com.javarush.siberia.entity.ResultCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decoder implements Action{

    private final CaesarCipher cipher = new CaesarCipher();

    @Override
    public Result execute(String[] parameters) {

        int shift = Constants.DEFAULT_SHIFT;

        if (parameters.length > 0) {
            try {
                shift = Integer.parseInt(parameters[0]);
            } catch (NumberFormatException e) {
                return new Result("Сдвиг нужно ввести цифрами!", ResultCode.ERROR);
            }
        }

        String text;
        try {
            text = readFile(Constants.ENCODED_FILE);
        } catch (IOException e) {
            return new Result("Не могу прочитать файл", ResultCode.ERROR);
        }

        String decryptedText = cipher.decrypt(text, shift);

        try {
            writeFile(Constants.DECODED_FILE, decryptedText);
        } catch (IOException e) {
            return new Result("Не могу записать в файл", ResultCode.ERROR);
        }

        return new Result(decryptedText, ResultCode.OK);
    }

    private String readFile(String fileName) throws IOException {
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader((new FileReader(fileName)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append(System.lineSeparator());
            }
        }
        return text.toString().trim();
    }

    private void writeFile(String fileName, String content) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        }
    }
}