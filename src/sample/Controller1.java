package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Controller1 {

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
    private BorderPane displayScene;

    public void setBtnScene1(ActionEvent action) {
        FxmlLoader loader = new FxmlLoader();
        BorderPane view = (BorderPane)loader.getSceneView("View\\scene1.fxml");
        displayScene.setCenter(view);
    }
    public void setBtnScene2(ActionEvent action) {
        FxmlLoader loader = new FxmlLoader();
        BorderPane view = (BorderPane)loader.getSceneView("View\\scene2.fxml");
        displayScene.setCenter(view);
    }


}
