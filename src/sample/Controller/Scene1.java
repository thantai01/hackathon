package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Path;

import java.awt.image.ImageObserver;
import java.nio.file.Paths;

public class Scene1 {

    @FXML
    private TextField tfAnswerBox;

    @FXML
    private Label lbQuestiionNums;

    @FXML
    private Label lbQuestiionNums1;

    @FXML
    private Button btnNext;

    @FXML
    private ImageView imageView;

    public void initialize() {


    }
    public void setBtnNext(ActionEvent actionEvent) {
        imageView.getImage();
        imageView.setSmooth(true);
        imageView.requestFocus();
    }
}

