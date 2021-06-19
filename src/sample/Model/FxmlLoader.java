package sample.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import sample.Main;

import java.net.URL;
import java.util.Objects;

public class FxmlLoader {
    private Pane sceneView;

    public Pane getSceneView(String path) {
        try {
            URL fileURL = Main.class.getResource(path);
            if(fileURL==null) {
                throw new java.io.FileNotFoundException("FXML has not been found");
            }
            sceneView = FXMLLoader.load(fileURL);
    } catch (Exception exception) {
            System.out.println("No scene, check again");
        }
        return sceneView;
    }


}
