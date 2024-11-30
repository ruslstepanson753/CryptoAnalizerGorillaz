package com.javarush.stepanov.view.console;

import com.javarush.khmelov.view.console.Menu;
import com.javarush.stepanov.controller.MainController;
import com.javarush.stepanov.exceptions.AppException;
import com.javarush.stepanov.model.Result;

import java.util.Arrays;

import static com.javarush.stepanov.constant.Constant.EXCEPTION_NO_ARGS;

public class ConsoleApplication {

   private final MainController mainController;
   private final ConsoleMenu consoleMenu;

    public Result run(String[]args){
        if (args.length >0) {
            String action = args[0];
            String[] parametrs = Arrays.copyOfRange(args, 1, args.length);
            Result result = mainController.doAction(action, parametrs);
            return result;
        } else
        {
            throw new AppException(EXCEPTION_NO_ARGS);
        }
    }

    public ConsoleApplication(ConsoleMenu menu, MainController mainController) {
        this.mainController = mainController;
        this.consoleMenu = menu;
    }
}
