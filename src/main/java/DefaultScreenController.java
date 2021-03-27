import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DefaultScreenController {

    @FXML
    private StackPane mainStackpane;

    public DefaultScreenController() throws MalformedURLException {
    }

    @FXML
            public void initialize() {
        loadMenuScreen();
    }

    public void loadMenuScreen() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MainMenu.fxml"));
        Pane pane=  null;
        try {
             pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MenuScreenController menuScreenController = loader.getController();
        menuScreenController.setMainScreenController(this);
        setScreen(pane);
    }

    public void setScreen(Pane pane) {
        mainStackpane.getChildren().clear();
        mainStackpane.getChildren().add(pane);
    }
}
