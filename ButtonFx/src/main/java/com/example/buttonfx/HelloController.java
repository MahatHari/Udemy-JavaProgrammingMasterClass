package com.example.buttonfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Button clickMeButton;

//    public void initialize() {
//        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("You Clicked me");
//            }
//        });
//    }
    // Using Lambda here
    public  void  initialize(){
        clickMeButton.setOnAction(actionEvent -> System.out.println("You Clicked me "));
    }
}