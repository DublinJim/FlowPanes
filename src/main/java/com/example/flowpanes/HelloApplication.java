package com.example.flowpanes;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
            HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 100, 275);
/*
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root,100,175);*/

        stage.setTitle("Flow-panes");
        stage.setScene(scene);
        stage.show();
    }


}