import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuScreenController {

    private DefaultScreenController defaultScreenController;

    @FXML
    private Button Aplikacja;

    @FXML
    private Button Options;

    @FXML
    private Button quit;

    public void setMainScreenController(DefaultScreenController defaultScreenController) {
        this.defaultScreenController = defaultScreenController;
    }

    @FXML
    void GoToApplication(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("AppScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();

        } catch (IOException e) {
            e.printStackTrace();
        }

        AppScreenController appScreenController = loader.getController();
        appScreenController.setDefaultScreenController(defaultScreenController);
        defaultScreenController.setScreen(pane);
    }

    @FXML
    void GoToOptions(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("OptionsScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();

        } catch (IOException e) {
            e.printStackTrace();
        }
        OptionsScreenController optionsScreenController = loader.getController();
        optionsScreenController.setDefaultScreenController(defaultScreenController);
        defaultScreenController.setScreen(pane);
    }

    @FXML
    void Quit() {
        Platform.exit();
    }

}
