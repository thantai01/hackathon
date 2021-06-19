package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import sample.Model.FxmlLoader;

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
