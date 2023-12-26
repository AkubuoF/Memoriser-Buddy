package com.akubuof.memorizerbuddy.fxmlcontrollers.components;

import com.akubuof.memorizerbuddy.AppManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MBHeader extends HBox {
    @FXML
    private Label titleLabel;
    @FXML
    private Button backButton;
    @FXML
    private ImageView backButtonImage;

    private EventHandler<ActionEvent> navigateAction;
    public MBHeader() {
        FXMLLoader fxmlLoader = new FXMLLoader(AppManager.getResource("fxml/components/header.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setNavigateAction(EventHandler<ActionEvent> action) {
        backButton.setOnAction(action);
    }

    public void setTitle(String title) {
        titleLabel.setText(title);
    }

    public String getTitle() {
        return titleLabel.getText();
    }

    public void setBackButtonImage(URL path) {
        Image image = new Image(path.getFile());
        backButtonImage.setImage(image);
    }

    public URL getBackButtonImage() {
        try {
            return new URL(backButtonImage.getImage().getUrl());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void removeBackButton() {
        this.getChildren().remove(backButton);
    }
}
