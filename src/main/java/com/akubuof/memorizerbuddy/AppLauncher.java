package com.akubuof.memorizerbuddy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(AppManager.getResource("fxml/scenes/home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Debugging...");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
