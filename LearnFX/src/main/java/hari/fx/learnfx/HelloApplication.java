package hari.fx.learnfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.charset.Charset;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       fxmlLoader.setCharset(Charset.defaultCharset());
       Rectangle2D screenBounds= Screen.getPrimary().getBounds();
        Scene scene = new Scene(fxmlLoader.load(), screenBounds.getHeight(), screenBounds.getWidth());
        //System.out.println(fxmlLoader.getCharset());
        scene.getRoot().setStyle("-fx-font-family:'serif'");
        scene.getStylesheets().add(getClass().getResource( "stylesheet.css").toString());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}