package org.asdfjkl.jfxchess.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jfxtras.styles.jmetro.JMetro;

public class LoadingDialog {

    private Stage stage;
    private JMetro jMetro;
    private Scene scene;
    private Label lblScanPgn;
    private ProgressBar progressBar;
    private VBox vbox;

    public void showLoadingDialog(String message) {
        stage = createStage();
        scene = createScene(message);
        
        jMetro = new JMetro();
        jMetro.setScene(scene);
        
        stage.setScene(scene);
        stage.show();
    }

    private Stage createStage() {
        Stage newStage = new Stage();
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.initStyle(StageStyle.UNDECORATED);
        return newStage;
    }

    private Scene createScene(String message) {
        lblScanPgn = new Label(message);
        progressBar = new ProgressBar();

        vbox = new VBox(10, lblScanPgn, progressBar);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));

        return new Scene(vbox, 400, 200);
    }

    public void close() {
        if (stage != null) {
            stage.close();
        }
    }

    public Stage getStage() {
        return stage;
    }

    public JMetro getjMetro() {
        return jMetro;
    }

    public Scene getScene() {
        return scene;
    }

    public Label getLblScanPgn() {
        return lblScanPgn;
    }

    public ProgressBar getProgressBar() {
        return progressBar;
    }

    public VBox getVbox() {
        return vbox;
    }

}
