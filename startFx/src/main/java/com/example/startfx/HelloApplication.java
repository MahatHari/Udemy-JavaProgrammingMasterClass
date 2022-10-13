package com.example.startfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        /** Not Using Fxml file, doing things by code */
      /*  GridPane root= new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);
        Label greeting = new Label("Welcome to Java Fx");
        greeting.setTextFill(Color.GREEN);
        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
        root.getChildren().add(greeting);
        Scene scene = new Scene(root, 700, 240);*/
        /** Using fxml file, */
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        /** Setting Scene and stage same for both*/
        Scene scene= new Scene(fxmlLoader.load(), 700, 240);
        scene.getRoot().setStyle("-fx-font-family: serif");
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}