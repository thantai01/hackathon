package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import sample.Model.CloverFXMLLoader;

public class ActivitiesController {

    @FXML
    private Button btnCheckin;

    @FXML
    private Button btnQuizz;

    @FXML
    private Button btnCatchingLetter;

    @FXML
    private Button btnChangePoint;

    @FXML
    private Button btnGiveAway;

    @FXML
    private Pane subSceneView;

    public Pane getSubSceneView() {
        return subSceneView;
    }

    @FXML
    public Pane activitiesHeader;

    public void showQuiz(ActionEvent action) {
        CloverFXMLLoader loader = CloverFXMLLoader.getLoaderBySceneView("/sample/views/quiz-scene.fxml");
        Pane view = loader.getScene();
        subSceneView.getChildren().clear();
        subSceneView.getChildren().add(view);

    }

    @FXML
    void showCheckin(ActionEvent event) {
        CloverFXMLLoader loader = CloverFXMLLoader.getLoaderBySceneView("/sample/views/checkin-scene.fxml");
        Pane view = loader.getScene();
        subSceneView.getChildren().clear();
        subSceneView.getChildren().add(view);
    }

    @FXML
    void showCatchLetter(ActionEvent event) {
        CloverFXMLLoader loader = CloverFXMLLoader.getLoaderBySceneView("/sample/views/catch-letter-scene.fxml");
        Pane view = loader.getScene();
        subSceneView.getChildren().clear();
        subSceneView.getChildren().add(view);
    }
    @FXML
    void showChangePoint(ActionEvent event) {
        CloverFXMLLoader loader = CloverFXMLLoader.getLoaderBySceneView("/sample/views/change-point-scene.fxml");
        Pane view = loader.getScene();
        subSceneView.getChildren().clear();
        subSceneView.getChildren().add(view);
    }
    @FXML
    void showGiveAway(ActionEvent event) {
        CloverFXMLLoader loader = CloverFXMLLoader.getLoaderBySceneView("/sample/views/give-away-scene.fxml");
        Pane view = loader.getScene();
        subSceneView.getChildren().clear();
        subSceneView.getChildren().add(view);
    }




}