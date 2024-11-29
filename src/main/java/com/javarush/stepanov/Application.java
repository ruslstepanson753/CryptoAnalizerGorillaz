package com.javarush.stepanov;

import com.javarush.stepanov.controller.MainController;
import com.javarush.stepanov.exceptions.AppException;
import com.javarush.stepanov.model.Result;

import java.util.Arrays;

import static com.javarush.stepanov.constant.Constant.EXCEPTION_NO_ARGS;

public class Application {

   private final MainController mainController;

    public Result run(String[]args){
        if (args.length >0) {
            String action = args[0];
            String[] parametrs = Arrays.copyOfRange(args, 1, args.length);
            Result result = mainController.doAction(action, parametrs);
            return result;
        } else throw new AppException(EXCEPTION_NO_ARGS);
    }

    public Application(){
        mainController = new MainController();
    }
}
