package com.example.flowpanes;

import static com.example.flowpanes.HelloApplication.myStage;
import static com.example.flowpanes.HelloApplication.stageWidth;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


public class Flowview implements Initializable {


    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;

    public List<Button> buttonList = new ArrayList<>();
    public Label lbl1;

    @FXML
    private FlowPane flowpane1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn1.setText("One");
        btn2.setText("Two");
        btn3.setText("Three");
        btn4.setText("Four");

        buttonList.add(btn1);
        buttonList.add(btn2);
        buttonList.add(btn3);
        buttonList.add(btn3);
        buttonList.add(btn4);

        btn5.setText("Remove");
        btn6.setText("Add");


        flowpane1.setOrientation(Orientation.VERTICAL);
        flowpane1.setHgap(10);
        flowpane1.setVgap(20);

        /*fxmlLoader.prefWidthProperty().bind(stage.widthProperty());
        flowpane1.prefHeightProperty().bind(stage.heightProperty());*/

//        HelloApplication view = new HelloApplication();

    }

    @FXML
    void removeAButton() {
        flowpane1.getChildren().remove(buttonList.get(0));
        buttonList.remove(0);
        myStage.setHeight(HelloApplication.stageHeight - HelloApplication.stageHeight / buttonList.size());
      /*  HelloApplication.stageHeight = (int) myStage.getHeight();*/
        myStage.setWidth(HelloApplication.stageWidth-20);
    }

    @FXML
    void addAButton() {
        Button newbutton = new Button();
        newbutton.setText("New Button");
        flowpane1.getChildren().add(newbutton);
        buttonList.add(newbutton);
        myStage.setHeight(HelloApplication.stageHeight + HelloApplication.stageHeight / buttonList.size());
        HelloApplication.stageHeight = myStage.getHeight();

        myStage.setWidth(stageWidth=500);
        lbl1.setText("Resized: width = "+stageWidth );

    }


}
