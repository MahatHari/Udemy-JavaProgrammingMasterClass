package hari.fx.learnfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;

    @FXML
    public  void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }
    @FXML
    protected void onHelloButtonClick(ActionEvent e) {
        System.out.println(e);
        if (e.getSource().equals(helloButton)){
            welcomeText.setText("Hello, "+ nameField.getText());
            System.out.println("Hello, "+ nameField.getText());
        }
        else if(e.getSource().equals(byeButton)){
            System.out.println("Bye... "+ nameField.getText());
            welcomeText.setText("Bye .... , "+ nameField.getText());
        }
        if(ourCheckBox.isSelected()){
            nameField.clear();
            initialize();
        }

    }
    @FXML
    public  void handleKeyReleased(){
        String text= nameField.getText();
        boolean disableButtons=  text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }
}