package com.akubuof.memorizerbuddy.fxmlcontrollers.scenes;

import com.akubuof.memorizerbuddy.AppManager;
import com.akubuof.memorizerbuddy.fxmlcontrollers.components.MBHeader;
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
        configureCreateOrModifyButton();
    }

    private void configureHeader () {
        header.removeBackButton();
    }

    private void configureCreateOrModifyButton() {
        URL sceneURL = AppManager.getResource("fxml/scenes/create_or_modify-view.fxml");
        createOrModifyButton.setOnAction(e -> AppManager.changeScene(sceneURL, createOrModifyButton, this::configureScene));
    }
    private void configureScene(Object sceneController) {
        CreateOrModifyView controller = (CreateOrModifyView) sceneController;
        controller.displayText("is this working?");
    }

}
