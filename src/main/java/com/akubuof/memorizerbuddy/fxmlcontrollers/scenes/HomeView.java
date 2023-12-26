package com.akubuof.memorizerbuddy.fxmlcontrollers.scenes;

import com.akubuof.memorizerbuddy.fxmlcontrollers.components.MBHeader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeView implements Initializable {
    @FXML
    private MBHeader header;
    @FXML
    private Button createOrModifyButton;
    @FXML
    private Button reviseButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        configureHeader();
    }

    public void configureHeader () {
        header.removeBackButton();
    }

}
