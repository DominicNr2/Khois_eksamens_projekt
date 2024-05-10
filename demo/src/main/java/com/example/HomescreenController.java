package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomescreenController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
