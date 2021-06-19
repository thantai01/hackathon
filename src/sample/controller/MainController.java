package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Model.CloverFXMLLoader;

public class MainController {

    @FXML
    private Button btnScene1;

    @FXML
    private Button btnScene2;

    @FXML
    private Button btnScene3;

    @FXML
    private Button btnScene4;

    @FXML
    private Button btnScene5;

    @FXML
    public Pane displayScene;

    @FXML
    private BorderPane displaySubMenu;

    private CloverFXMLLoader activitiesLoader = CloverFXMLLoader.getLoaderBySceneView("/sample/views/activities-scene.fxml");
    private ActivitiesController activitiesController = activitiesLoader.getController(ActivitiesController.class);

    public void showActivitiesMenu(ActionEvent action) {
        activitiesController.activitiesHeader.setVisible(true);
        BorderPane view = activitiesLoader.getScene(BorderPane.class);
        displayScene.getChildren().clear();
        displaySubMenu.setBottom(view);
    }
    @FXML
    public void showNews(ActionEvent action) {
        CloverFXMLLoader loader = CloverFXMLLoader.getLoaderBySceneView("/sample/views/news-scene.fxml");
        Pane view =  loader.getScene(Pane.class);
        activitiesController.activitiesHeader.setVisible(false);
        activitiesController.getSubSceneView().getChildren().clear();
        displayScene.getChildren().clear();
        displayScene.getChildren().add(view);
    }
    @FXML
    public void showAboutUs(ActionEvent action) {
        CloverFXMLLoader loader = CloverFXMLLoader.getLoaderBySceneView("/sample/views/about-us-scene.fxml");
        Pane view = loader.getScene(Pane.class);
        activitiesController.activitiesHeader.setVisible(false);
        activitiesController.getSubSceneView().getChildren().clear();
        displayScene.getChildren().clear();
        displayScene.getChildren().add(view);
    }
    @FXML
    public void showHelp(ActionEvent action) {
        CloverFXMLLoader loader = CloverFXMLLoader.getLoaderBySceneView("/sample/views/help-scene.fxml");
        Pane view = loader.getScene(Pane.class);
        activitiesController.activitiesHeader.setVisible(false);
        activitiesController.getSubSceneView().getChildren().clear();
        displayScene.getChildren().clear();
        displayScene.getChildren().add(view);
    }
    @FXML
    private AnchorPane mainScene;

    @FXML
    public void exitApp(ActionEvent action) {
        Stage stage = (Stage) mainScene.getScene().getWindow();
        stage.close();
    }
}
