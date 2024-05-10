package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class ImportantTasksController {
    @FXML
    private void switchToHomescreen() throws IOException {
        App.setRoot("Homescreen");
    }
}
