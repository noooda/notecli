package io.github.noooda.notecli.presentation.cli;

import java.util.Scanner;

public class Controller {
    final private String WELCOME_MESSAGE = "NoteCLI started.";

    public void start() {
        System.out.println(WELCOME_MESSAGE);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] inputs = scanner.nextLine().split("\\s"); 

            boolean continuable = this.executeCommand(inputs);

            if (continuable) break;

            break;
        }

        scanner.close();
    }

    public boolean executeCommand(String[] inputs) {
        switch (inputs[0]) {
            case "exit":
                return false;
            default:
                return true;
        }
    }
}
