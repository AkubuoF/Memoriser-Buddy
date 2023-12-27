package com.akubuof.memorizerbuddy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AppLauncher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(AppManager.getResource("fxml/scenes/home-view.fxml"));
        BorderPane scene = new BorderPane(fxmlLoader.load());
        stage.setTitle("Debugging...");
        stage.setMinWidth(500);
        stage.setMinHeight(300);
        stage.setScene(new Scene(scene));
        stage.show();
        scene.requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}
