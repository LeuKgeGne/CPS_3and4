package bsuir.epam.lab4.model;

import bsuir.epam.lab4.controller.Controller;
import bsuir.epam.lab4.start.Constants;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SubThread extends Thread{
    private double number1;
    private double number2;
    private int threadNumber;
    private double result;

    public SubThread(double _number1, double _number2, int _threadNumber) {
        this.number1 = _number1;
        this.number2 = _number2;
        this.threadNumber = _threadNumber;
    }

    @Override
    public void run() {
        try {
            this.result = Controller.countResult(number1, number2);
            /*makeANewWindow();*/
            workWithIEx();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public double getResult() {
        return this.result;
    }

    private void workWithIEx() throws InterruptedException{
        SubThread.sleep(Constants.INT_EX_TIMEOUT);
    }

    public int getThreadNumber() {
        return this.threadNumber;
    }

/*    private void makeANewWindow() {
        Stage newStage = new Stage();
        GridPane newGP = new GridPane();
        Insets insets = new Insets(Constants.INSETS_TOP, Constants.INSETS_RIGHT,
                Constants.INSETS_BOTTOM, Constants.INSETS_LEFT);
        newGP.setPadding(insets);
        Scene newScene = new Scene(newGP, 200,250);
        newStage.setScene(newScene);
        newStage.show();
    }*/
}
