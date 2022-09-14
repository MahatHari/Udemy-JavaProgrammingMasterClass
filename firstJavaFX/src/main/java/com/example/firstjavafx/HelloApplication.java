package com.example.firstjavafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        GridPane root= new GridPane();
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene = new Scene(root, 320, 240);
        root.setAlignment(Pos.CENTER);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");
        stage.setTitle("Hello!");

        Label greeting= new Label("Welcome to JavaFX");
        greeting.setTextFill(Color.GREEN);

        root.getChildren().add(greeting);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}