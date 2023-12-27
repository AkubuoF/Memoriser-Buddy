package com.akubuof.memorizerbuddy.fxmlcontrollers.components;

import com.akubuof.memorizerbuddy.AppManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class MBQuestionSelector extends VBox {
    @FXML
    private GridPane gridPane;
    @FXML
    private Button button;
    private int row = 0;
    private final ArrayList<Node> nodes = new ArrayList<>();

    public MBQuestionSelector() {
        AppManager.setAsController(AppManager.getResource("fxml/components/question-selector.fxml"), this);
    }

    public void addNode(Node node) {
        AnchorPane anchorPane = new AnchorPane(node);
        anchorPane.setPrefSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);
        AnchorPane.setLeftAnchor(node, 0.0);
        AnchorPane.setRightAnchor(node, 0.0);
        gridPane.addRow(row++, anchorPane);

        nodes.add(node);
    }

    public void setButtonAction(EventHandler<ActionEvent> action) {
        button.setOnAction(action);
    }

    public Node getNode(int index) {
        return nodes.get(index);
    }
}
