package sample.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import sample.Main;

import java.net.URL;

public class CloverFXMLLoader {

    private FXMLLoader fxmlLoader;

    private Pane sceneView;

    private CloverFXMLLoader(FXMLLoader fxmlLoader, Pane sceneView) {
        this.fxmlLoader = fxmlLoader;
        this.sceneView = sceneView;
    }

    public static CloverFXMLLoader getLoaderBySceneView(String path) {
        CloverFXMLLoader cloverFXMLLoader = null;
        try {
            URL fileURL = Main.class.getResource(path);
            if(fileURL==null) {
                throw new java.io.FileNotFoundException("FXML has not been found");
            }
            FXMLLoader fxmlLoader = new FXMLLoader(fileURL);
            Pane sceneView = fxmlLoader.load();
            cloverFXMLLoader = new CloverFXMLLoader(fxmlLoader, sceneView);
        } catch (Exception exception) {
            System.out.println("No scene, check again");
        }
        return cloverFXMLLoader;
    }

    public <T> T getController(Class<T> clazz) {
        return fxmlLoader.getController();
    }

    public <T extends Pane> T getScene(Class<T> clazz) {
        return (T)sceneView;
    }

    public Pane getScene() {
        return sceneView;
    }

}
