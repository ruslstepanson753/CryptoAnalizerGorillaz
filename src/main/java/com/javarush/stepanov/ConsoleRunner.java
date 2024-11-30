package com.javarush.stepanov;

import com.javarush.stepanov.controller.MainController;
import com.javarush.stepanov.model.Result;
import com.javarush.stepanov.view.console.ConsoleApplication;
import com.javarush.stepanov.view.console.ConsoleMenu;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        //encode text.txt encode.txt 12
        Scanner scanner = new Scanner(System.in);
        ConsoleMenu menu = new ConsoleMenu(scanner);
        MainController mainController = new MainController();
        ConsoleApplication application = new ConsoleApplication(menu,mainController);
        Result result = application.run(args);
    }
}
