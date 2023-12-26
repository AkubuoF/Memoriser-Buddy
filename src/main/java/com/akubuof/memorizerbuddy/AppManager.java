package com.akubuof.memorizerbuddy;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppManager {
    private AppManager(){}

    public static URL getResource(String name) {
        return AppManager.class.getResource(name);
    }

    public static Scene getScene(URL sceneURL) {
        FXMLLoader fxmlLoader = new FXMLLoader(sceneURL);
        try {
            return new Scene(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Stage getStageFrom(Node node) {
        if (node.getScene() == null) {
            getStageFrom(node.getParent());
        }
        return (Stage) node.getScene().getWindow();
    }

    public static void changeScene(URL sceneURL, Node node) {
        Scene scene = AppManager.getScene(sceneURL);
        Stage stage = getStageFrom(node);
        stage.setScene(scene);
    }
}
