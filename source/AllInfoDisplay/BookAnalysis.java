package InformationDisplay;

import FilePackage.DateTimeWriter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene;

import java.io.IOException;

public class BookAnalysis extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        String clsName = this.getClass().getSimpName();
 
        Parent parent = FXMLLoader.load(getClass().getResource("file.fxml"));
        primaryStage.setScene(new Scene(parent, 1500, 600));
        primaryStage.show();
    }
}
