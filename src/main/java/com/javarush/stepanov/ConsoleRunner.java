package com.javarush.stepanov;

import com.javarush.stepanov.controller.MainController;
import com.javarush.stepanov.view.console.ConsoleApplication;
import com.javarush.stepanov.view.console.Menu;

import java.util.Scanner;

/*
the structure was copied
code was written independently
__________________________________________________________________
commands for entering into the console:

encode
text.txt
encrypted.txt
10

decode
encrypted.txt
decrypted.txt
10

brudeforce
encrypted.txt
brudeforce.txt
__________________________________________________________________
commands for String[]args:

decode encrypted.txt decrypted.txt 2
encode text.txt encrypted.txt 2
brudeforce encrypted.txt brudeforce.txt
__________________________________________________________________
*/

public class ConsoleRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        MainController mainController = new MainController();
        ConsoleApplication application = new ConsoleApplication(menu, mainController);
        application.run(args);
    }
}
