import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class Main extends Application {
    public static void main(String[] args) {
launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("DefaultScreen.fxml"));
        StackPane stackPane = loader.load();

        Scene scene = new Scene(stackPane);
        stage.setScene(scene);
        stage.show();
    }
}
