package com.javarush.stepanov;

import com.javarush.stepanov.model.Result;

public class ConsoleRunner {

    public static void main(String[] args) {
        Application application = new Application();
        Result result = application.run(args);
    }
}
