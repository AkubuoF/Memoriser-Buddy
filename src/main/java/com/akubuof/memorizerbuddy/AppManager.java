package com.akubuof.memorizerbuddy;

import com.akubuof.memorizerbuddy.fxmlcontrollers.scenes.CreateOrModifyView;
import com.akubuof.memorizerbuddy.others.ConfigureSceneAction;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
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

    public static void changeScene(URL sceneURL, Node node, ConfigureSceneAction action) {
        FXMLLoader fxmlLoader = new FXMLLoader(sceneURL);
        try {
            Scene scene = new Scene(fxmlLoader.load());
            action.config(fxmlLoader.getController());
            Stage stage = getStageFrom(node);
            stage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> void setAsController(URL fxmlPath, T controller) {
        FXMLLoader fxmlLoader = new FXMLLoader(fxmlPath);
        fxmlLoader.setRoot(controller);
        fxmlLoader.setController(controller);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
