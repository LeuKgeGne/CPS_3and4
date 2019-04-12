package bsuir.epam.lab4.start;

import bsuir.epam.lab4.start.Constants;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;


public class Initialization {
    private GridPane gridPane;
    private Insets insets;
    private Button createThread;
    private Scene scene;

    public Initialization() {
        scene = new Scene(getGridPane(), Constants.APP_WIDTH, Constants.APP_HEIGHT);
        gridPane = new GridPane();
        insets = new Insets(Constants.INSETS_TOP, Constants.INSETS_RIGHT,
                Constants.INSETS_BOTTOM, Constants.INSETS_LEFT);
        createThread = new Button(Constants.CREATE_BUTTON_TEXT);

        //Create our window
        gridPane.setPadding(insets);
        gridPane.setVgap(Constants.SET_V_GAP);
        gridPane.setHgap(Constants.SET_H_GAP);

        gridPane.add(createThread, Constants.X_COR_POS, Constants.Y_COR_POS);
    }

    public GridPane getGridPane() {
        return this.gridPane;
    }

    public Button getCreateThread() {
        return this.createThread;
    }

    public Scene getScene() {
        return this.scene;
    }
}
