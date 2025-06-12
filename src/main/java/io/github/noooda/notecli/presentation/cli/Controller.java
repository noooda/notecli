package io.github.noooda.notecli.presentation.cli;

import java.util.Scanner;
import io.github.noooda.notecli.application.usecases.GetNote;

public class Controller {
    private static final String START_MESSAGE = """
        NoteCLI started.
        --------------------""";

    private final GetNote getNote;

    public Controller(GetNote getNote) {
        this.getNote = getNote;
    }

    public void start() {
        System.out.println(START_MESSAGE);

        printNoteNames();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("File name (or exit): ");
                String inputLine = scanner.nextLine().trim();

                if (inputLine.isEmpty()) continue;

                String[] inputs = inputLine.split("\\s+");

                if (!executeCommand(inputs)) break;
            }
        }
    }

    private void printNoteNames() {
        String[] noteNames = getNote.GetAllNoteNames();
        for (String noteName : noteNames) {
            System.out.println(noteName);
        }
        System.out.println();
    }

    public boolean executeCommand(String[] inputs) {
        if (inputs.length == 0) {
            return true;
        }

        if ("exit".equalsIgnoreCase(inputs[0])) {
            return false;
        }

        System.out.println("Unknown command: " + inputs[0]);
        return true;
    }
}
