module com.akubuof.memorizerbuddy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.akubuof.memorizerbuddy to javafx.fxml;
    opens com.akubuof.memorizerbuddy.fxmlcontrollers.components to javafx.fxml;
    opens com.akubuof.memorizerbuddy.fxmlcontrollers.scenes to javafx.fxml;
    exports com.akubuof.memorizerbuddy;
    exports com.akubuof.memorizerbuddy.fxmlcontrollers.components;
    exports com.akubuof.memorizerbuddy.fxmlcontrollers.scenes;
}