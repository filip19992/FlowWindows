import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class AppScreenController {

    @FXML
    private Button menu;
    @FXML
    DefaultScreenController defaultScreenController;


    public void setDefaultScreenController(DefaultScreenController defaultScreenController) {
        this.defaultScreenController = defaultScreenController;
    }

    @FXML
    void GoBack(ActionEvent event) {
        defaultScreenController.loadMenuScreen();;
    }

}
