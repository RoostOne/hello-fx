package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

        var button = new Button("Create JSON");

        button.setOnAction(actionEvent -> {
            System.out.println("Der Button wurde gedrückt");
        });
        BorderPane pane = new BorderPane();

        pane.setTop(label);
        pane.setBottom(button);

        var scene = new Scene(pane, 640, 480);

        stage.setScene(scene);
        stage.show();
    }

    public static void readCar(){
        String carAsString = "{" +
                "\"velocity\":100," +
                "\"doors\":5," +
                "\"countGears\":5," +
                "\"topSpeed\":220," +
                "}";
        Gson gson = new Gson();

    }

    public static void main(String[] args) {
        launch();
    }

}