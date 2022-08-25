package com.example.flowpanes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class flowView implements Initializable {


    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    @FXML
    private FlowPane flowpane1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn1.setText("One");
        btn2.setText("Two");
        btn3.setText("Three");
        btn4.setText("Four");
        btn5.setText("Five");

        flowpane1.setOrientation(Orientation.VERTICAL);
        flowpane1.setHgap(10);
        flowpane1.setVgap(20);
    }


}
