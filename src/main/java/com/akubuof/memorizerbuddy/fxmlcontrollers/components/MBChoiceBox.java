package com.akubuof.memorizerbuddy.fxmlcontrollers.components;

import com.akubuof.memorizerbuddy.AppManager;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class MBChoiceBox extends HBox {
    @FXML
    private Label textLabel;
    @FXML
    private ChoiceBox<String> choiceBox;

    public MBChoiceBox() {
        AppManager.setAsController(AppManager.getResource("fxml/components/choicebox.fxml"), this);
        HBox.setHgrow(this, Priority.ALWAYS);
        configureChoiceBox();
    }

    public String getText() {
        return textLabel.getText();
    }

    public void setText(String text) {
        textLabel.setText(text);
    }

    public String[] getChoices() {
        return (String[]) choiceBox.getItems().toArray();
    }

    public void setChoices(String[] choices) {
        choiceBox.getItems().addAll(choices);
    }

    private void configureChoiceBox() {
        choiceBox.setStyle("-fx-font-family: Tahoma; -fx-font-style: normal; -fx-font-size: 16");
    }

    public String getChoice() {
        return choiceBox.getValue();
    }

}
