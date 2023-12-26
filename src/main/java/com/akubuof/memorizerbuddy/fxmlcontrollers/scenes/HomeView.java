package com.akubuof.memorizerbuddy.fxmlcontrollers.scenes;

import com.akubuof.memorizerbuddy.fxmlcontrollers.components.MBHeader;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeView implements Initializable {
    @FXML
    private MBHeader MBHeader;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        configureHeader();
    }

    public void configureHeader () {
        MBHeader.removeBackButton();
    }
}
