package io.github.noooda.notecli;

import io.github.noooda.notecli.presentation.cli.Controller;

public class NoteCli {
    Controller controller;

    public NoteCli (Controller controller) {
        this.controller = controller;
    }

    public void run() {
        this.controller.start();
    }
}