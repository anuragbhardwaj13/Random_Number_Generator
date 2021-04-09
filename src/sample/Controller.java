package sample;
//Made By Anurag Bhaedwaj
//1914231
//cse 4x

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {


    public Button generateButton;
    @FXML
    private TextField textField;
    @FXML
    private void generateButton(){
        Double num=Math.random()*100;
        textField.setText(String.format("%.0f",num));

    }

}
