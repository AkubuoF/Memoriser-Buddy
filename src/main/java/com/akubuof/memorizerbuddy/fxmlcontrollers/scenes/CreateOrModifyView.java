package com.akubuof.memorizerbuddy.fxmlcontrollers.scenes;

import com.akubuof.memorizerbuddy.fxmlcontrollers.components.MBChoiceBox;
import com.akubuof.memorizerbuddy.fxmlcontrollers.components.MBQuestionSelector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateOrModifyView implements Initializable {
    @FXML
    private Label label;
    @FXML
    private MBQuestionSelector questionSelector;

    public void displayText(String text) {
        label.setText(text);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        MBChoiceBox choiceBox1 = new MBChoiceBox();
        String[] choices1 = {"FlashCard", "Multiple Choice"};
        choiceBox1.setChoices(choices1);
        choiceBox1.setText("Question Type");
        questionSelector.addNode(choiceBox1);

        MBChoiceBox choiceBox2 = new MBChoiceBox();
        String[] choices2 = {"Calculus", "Computer Architecture", "Physics", "Systems and Networking"};
        choiceBox2.setChoices(choices2);
        choiceBox2.setText("Subject");
        questionSelector.addNode(choiceBox2);
    }
}
