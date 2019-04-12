package bsuir.epam.lab4.start;

import bsuir.epam.lab4.controller.Controller;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Main extends Application {
    private Initialization init = new Initialization();

    @Override
    public void start(Stage primaryStage) {
        init.getCreateThread().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Controller.createAProcess();
            }
        });

        primaryStage.setScene(/*init.getScene()*/new Scene(init.getGridPane(),
                Constants.APP_WIDTH, Constants.APP_HEIGHT));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
