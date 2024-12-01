package com.javarush.stepanov.view.console;

import com.javarush.stepanov.controller.MainController;
import com.javarush.stepanov.model.Result;

import java.util.Arrays;

public class ConsoleApplication {

    private final MainController mainController;
    private final Menu menu;

    public void run(String[] args) {
        if (args.length == 0) {
            args = menu.getArgs();
        }
        String action = args[0];
        String[] parametrs = Arrays.copyOfRange(args, 1, args.length);
        Result result = mainController.doAction(action, parametrs);
        menu.viewResult(result);
    }

    public ConsoleApplication(Menu menu, MainController mainController) {
        this.mainController = mainController;
        this.menu = menu;
    }
}
