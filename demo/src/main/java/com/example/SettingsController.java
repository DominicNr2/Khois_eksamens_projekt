package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class SettingsController {
    @FXML
    private void switchToHomescreen() throws IOException {
        App.setRoot("Homescreen");
    }
}
