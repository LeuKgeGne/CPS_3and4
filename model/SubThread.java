package bsuir.epam.lab4.model;

import bsuir.epam.lab4.controller.Controller;
import bsuir.epam.lab4.start.Constants;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SubThread extends Thread{
    private double number1;
    private double number2;
    private int threadNumber;
    private double result;

    public SubThread(double _number1, double _number2, int _theardNumber) {
        this.number1 = _number1;
        this.number2 = _number2;
        this.threadNumber = _theardNumber;
    }

    @Override
    public void run() {
        try {
            this.result = Controller.countResult(number1, number2);
            workWithIEx();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public double getResult() {
        return this.result;
    }

    private void workWithIEx() throws InterruptedException{
        SubThread.sleep(1000);
    }

    public int getThreadNumber() {
        return this.threadNumber;
    }

//    private void createANewWindow() {
//        GridPane gridPane = new GridPane();
//        Stage stage = new Stage(new Scene(gridPane, Constants.APP_WIDTH, Constants.APP_HEIGHT))
//    }
}
