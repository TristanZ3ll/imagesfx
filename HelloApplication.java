package com.example.fxjavtest;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;


public class HelloApplication extends Application {



    @Override
    public void start(Stage primaryStage) {
        GridPane griddy = new GridPane();
        griddy.setAlignment(Pos.CENTER);

        griddy.setHgap(10);
        griddy.setVgap(10);

       ImageView aFlag = new ImageView(new Image("file:aFlag.png"));
       ImageView cFlag = new ImageView(new Image("file:cFlag.png"));
       ImageView gFlag = new ImageView(new Image("file:gFlag.png"));
       ImageView fFlag = new ImageView(new Image("file:fFlag.png"));

      griddy.add(gFlag,0,0);
       griddy.add(fFlag,1,0);
       griddy.add(cFlag,0,1);
       griddy.add(aFlag,1,1);

        Scene scene= new Scene(griddy);

        primaryStage.setTitle("My Images");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}