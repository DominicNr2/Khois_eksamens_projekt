package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomescreenController {

    @FXML
    private void switchToDaily() throws IOException {
        App.setRoot("DailyTasks");
    }

    @FXML
    private void switchToImportant() throws IOException {
        App.setRoot("ImportantTasks");
    }

    @FXML
    private void switchToSettings() throws IOException {
        App.setRoot("Settings");
    }
}
