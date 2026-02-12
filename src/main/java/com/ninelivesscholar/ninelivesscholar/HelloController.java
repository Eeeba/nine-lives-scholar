package com.ninelivesscholar.ninelivesscholar;

import javafx.fxml.FXML;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ProgressBar;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ProgressBar pgBar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        pgBar.setProgress(0);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(5),
                        new KeyValue(pgBar.progressProperty(), 1))
        );

        timeline.setOnFinished(event -> onProgressFinished());

        timeline.play();
    }

    private void onProgressFinished() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Finished");
        alert.setHeaderText(null);
        alert.setContentText("Loading Complete!");
        alert.show();
    }
}