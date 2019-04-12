package bsuir.epam.lab4.controller;

import bsuir.epam.lab4.model.SubThread;
import javafx.scene.layout.GridPane;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class Controller {
    private static int counter = 0;
    public static void createAProcess() {
        try {
            counter++;
            SubThread subThread = new SubThread(randomNumbers(), randomNumbers(), counter);
            subThread.run();
            System.out.println("|Result of: " + subThread.getResult() +
                    " |process: " + subThread.getThreadNumber() + "|");
            dbConn();
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    public static double randomNumbers() {
        return 100 * random(100 - 5);
    }

    public synchronized static double countResult(double number1, double number2) {
        return number1 * number2;
    }

    private static void dbConn() throws InterruptedException{
        SubThread.sleep(1400);
    }

    private static void showResult() {
        GridPane subGP = new GridPane();
      //  Stage localStage = new Stage(new Scene(subGP, ));

    }
}
