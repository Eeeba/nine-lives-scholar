package com.ninelivesscholar.ninelivesscholar;

import javafx.fxml.FXML;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

    public class HelloController implements Initializable {

        @FXML
        private ProgressBar pgBar;

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

            pgBar.setProgress(0);
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), new KeyValue(pgBar.progressProperty(),1)));
            timeline.setOnFinished(event -> {
                try {
                    mainMenuScene();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            });
            timeline.play();

        }

        public void mainMenuScene() throws IOException {

            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main-menu.fxml")));
            Stage stage = (Stage) pgBar.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        }

    }