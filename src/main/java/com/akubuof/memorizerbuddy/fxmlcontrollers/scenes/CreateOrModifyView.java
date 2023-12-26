package com.akubuof.memorizerbuddy.fxmlcontrollers.scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CreateOrModifyView {
    @FXML
    private Label label;
    @FXML
    private Button button;
    public void displayHelloWorld(ActionEvent actionEvent) {
        label.setText("HelloWorld");
    }

    public void displayText(String text) {
        label.setText(text);
    }
}
