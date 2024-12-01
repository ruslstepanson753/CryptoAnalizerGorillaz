package com.javarush.stepanov.view.console;

import com.javarush.stepanov.model.Result;

import java.util.Scanner;

import static com.javarush.stepanov.constant.Constant.*;

public class Menu {
    private Scanner scanner;
    private String fileResultName;

    public Menu(Scanner scanner) {
        this.scanner = scanner;

    }

    public String[] getArgs() {
        String command = getCommand();
        String[] argsWithoutCommand = switch (command) {
            case "encode" -> getEnArgs();
            case "decode" -> getDeArgs();
            case "brudeforce" -> getBrArgs();
            default -> throw new IllegalStateException(EXCEPTION_ILLEGAL_COMMAND+ command);
        };
        String[] args = new String[argsWithoutCommand.length + 1];
        args[0] = command;
        System.arraycopy(argsWithoutCommand, 0, args, 1, argsWithoutCommand.length);
        return args;
    }

    private String[] getBrArgs() {
        String[] args= new String[2];
        System.out.println(CONSOLE_ENCRYPTED_SOURCE_HELP);
        args[0] = scanner.nextLine();
        System.out.println(CONSOLE_TO_DECRYPT_SOURCE_HELP);
        args[1] = scanner.nextLine();
        fileResultName = args[1];
        return args;
    }

    private String[] getDeArgs() {
        String[] args= new String[3];
        System.out.println(CONSOLE_ENCRYPTED_SOURCE_HELP);
        args[0] = scanner.nextLine();
        System.out.println(CONSOLE_TO_DECRYPT_SOURCE_HELP);
        args[1] = scanner.nextLine();
        System.out.println(CONSOLE_KEY_HELP);
        args[2] = scanner.nextLine();
        fileResultName = args[1];
        return args;
    }

    private String getCommand() {
        System.out.printf("%s\n%s\n%s\n%s\n",
                CONSOLE_SPECIFY_A_SUBCOMMAND,
                CONSOLE_ENCODE_HELP,
                CONSOLE_DECODE_HELP,
                CONSOLE_BRUTEFORCE_HELP
        );
        return scanner.nextLine();
    }

    private String[] getEnArgs() {
        String[] args= new String[3];
        System.out.println(CONSOLE_DECRYPTED_SOURCE_HELP);
        args[0] = scanner.nextLine();
        System.out.println(CONSOLE_TO_ENCRYPT_SOURCE_HELP);
        args[1] = scanner.nextLine();
        System.out.println(CONSOLE_KEY_HELP);
        args[2] = scanner.nextLine();
        fileResultName = args[1];
        return args;
    }

    public void viewResult(Result result) {
        System.out.printf("%s\n%s\n%s",
                result.toString(),
                CONSOLE_RESULT_HELP,
                fileResultName
        );

    }

}
