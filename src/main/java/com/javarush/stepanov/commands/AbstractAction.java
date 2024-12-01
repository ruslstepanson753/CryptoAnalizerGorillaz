package com.javarush.stepanov.commands;

import com.javarush.stepanov.exceptions.AppException;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static com.javarush.stepanov.constant.Constant.*;

abstract class AbstractAction implements Action {

    protected char correctCharByTheKey(char currentChar, int key) {
        if (ALPHABET.contains(String.valueOf(currentChar))) {
            int indOfCurrentChar = ALPHABET.indexOf(currentChar);
            int indOfDecoderedChar = indOfCurrentChar - key;
            if (indOfDecoderedChar < 0) {
                indOfDecoderedChar += ALPHABET.length();
            }
            if (indOfDecoderedChar >= ALPHABET.length()) {
                indOfDecoderedChar -= ALPHABET.length();
            }
            return ALPHABET.charAt(indOfDecoderedChar);
        } else {
            return currentChar;
        }
    }

    protected void writeToFileByKey(String[] parametrs) {
        String textFilePath = TXT_FOLDER + parametrs[0];
        String encryptedFilePath = TXT_FOLDER + parametrs[1];
        int keyOfEncode = Integer.parseInt(parametrs[2]);
        try (BufferedReader reader = new BufferedReader(new FileReader(textFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(encryptedFilePath))) {
            while (reader.ready()) {
                char charToEncode = (char) reader.read();
                char encodedChar = correctCharByTheKey(charToEncode, keyOfEncode);
                writer.write(encodedChar);
            }
        } catch (FileNotFoundException e) {
            throw new AppException(EXCEPTION_FILE_READ_WRITE, e);
        } catch (IOException e) {
            throw new AppException(EXCEPTION_FILE_READ_WRITE, e);
        }
    }

    protected SortedMap<Character, Integer> getMapAlphabet() {
        SortedMap<Character, Integer> countOfSimbols = new TreeMap<>();
        for (int i = 0; i < ALPHABET.length(); i++) {
            countOfSimbols.put(ALPHABET.charAt(i), 0);
        }
        return countOfSimbols;
    }

    protected @NotNull Map<Character, Integer> getSortedMap(SortedMap<Character, Integer> countOfSimbolsInEncodedText) {
        Map<Character, Integer> sortedMap = countOfSimbolsInEncodedText.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        return sortedMap;
    }

    protected void toCountTheNumberOfCharacters(String textFilePath, SortedMap<Character, Integer> countOfSimbolsInEncodedText) {
        try (BufferedReader reader = new BufferedReader(new FileReader(textFilePath))) {
            while (reader.ready()) {
                char charToEncode = (char) reader.read();
                if (countOfSimbolsInEncodedText.containsKey(charToEncode)) {
                    Integer inte = countOfSimbolsInEncodedText.get(Character.valueOf(charToEncode));
                    inte += 1;
                    countOfSimbolsInEncodedText.put(Character.valueOf(charToEncode), inte);
                }
            }

        } catch (FileNotFoundException e) {
            throw new AppException(EXCEPTION_FILE_READ_WRITE, e);
        } catch (IOException e) {
            throw new AppException(EXCEPTION_FILE_READ_WRITE, e);
        }
    }

    protected char getEncodedSpaceCharacter(SortedMap<Character, Integer> countOfSimbolsInEncodedText) {
        Map<Character, Integer> sortedMap = getSortedMap(countOfSimbolsInEncodedText);
        Map.Entry<Character, Integer> firstEntry = sortedMap.entrySet().iterator().next();
        char encodedSpaceCharacter = firstEntry.getKey();
        return encodedSpaceCharacter;
    }

}
