package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class DailyTasksController {
        @FXML
    private void switchToHomescreen() throws IOException {
        App.setRoot("homescreen");
    }
}
