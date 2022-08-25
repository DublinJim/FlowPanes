package com.example.flowpanes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class flowView implements Initializable {


    @FXML
    private FlowPane flowpane1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        flowpane1.setOrientation(Orientation.VERTICAL);
    }


}
