import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class OptionsScreenController {

    DefaultScreenController defaultScreenController;

    @FXML
    private Button menu2;

    @FXML
    void GoToMenu(ActionEvent event) {
        defaultScreenController.loadMenuScreen();
    }

    public void setDefaultScreenController(DefaultScreenController defaultScreenController) {
        this.defaultScreenController = defaultScreenController;
    }
}
