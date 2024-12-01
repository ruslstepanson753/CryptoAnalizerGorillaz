package com.javarush.stepanov;

import com.javarush.stepanov.controller.MainController;
import com.javarush.stepanov.view.console.ConsoleApplication;
import com.javarush.stepanov.view.console.Menu;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        //encode text.txt encode.txt 12
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        MainController mainController = new MainController();
        ConsoleApplication application = new ConsoleApplication(menu, mainController);
        application.run(args);
    }
}
