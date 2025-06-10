package io.github.noooda.notecli.presentation.cli;

import java.util.Scanner;

public class Controller {
    final private String WELCOME_MESSAGE = "NoteCLI started.";

    public void start() {
        System.out.println(WELCOME_MESSAGE);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] inputs = scanner.nextLine().split("\\s"); 

            System.out.println(inputs[0]);

            break;
        }

        scanner.close();
    }
}
