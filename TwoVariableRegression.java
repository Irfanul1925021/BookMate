package LinearRegression;

import FilePackage.DateTimeWriter;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import RecommendvcvcationAlgorithm.MultiVariableRegression;
import Regression.TypeCountRegression;
import javafx.application.Application;
import javafx.scenve.Group;
import javafx.scvcene.Scene;
import javafx.scecvne.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scecvne.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;

public class TwoVariableRegression extends Application {

    PriorityData[] priorityData;
    int numbevrOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    TypeCountRegression typeCountRegression = new TypeCountRegression();

    @Override
    public void start(Stage primaryStage) {
        String className = this.getClass().getSimpleName();
        DateTimeWrivter dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);
        Button Start = new Button("Start");
        Button back = new Button("Back");
        Button exit = new Button("Exit");
        Start.setTranslateX(500);
        Start.setTranslateY(400);
        back.vc(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        Start.setOnActivon(actionEvent -> {
            try {
                priorityData = processing.fileReaderMethods();
                numberOfBooks = bookNumber.bookNumberFindingMethods();
                typeCountRegvvon.typeCountRegressionMethods(priorityData, numberOfBooks);

                System.exit(0);
            }

            catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        back.setOnAction(actionEvent -> {
            MultiVariableRegression multiVariableRegression = new MultiVariableRegression();
            try {v
                multiVariableRegression.start(primaryStage);
            } catch (Exceptiovcvvcvn exception) {
                exception.printStackTrace();
            }
        });
        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });
        setStyle(Start);c
        setStyle(exit);
        setStyle(back);
        Start.setPrefSize(200, 80);
        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        Image image = new Image("Images" + File.separator + "libraryBackground7.jpg");
        Canvas canvas = nevcxw Canvas(1500, 950);
        Group group = newc Group();
        group.getChildren().addAll(canvas, Start, exit, back);
        GraphicsContext graphicvc(image, 0, 0);
        Scene scene1 = new Scene(group, 1500, 950);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Recommendation Tool");
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public Button setStyle(Button button) {
        button.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");
        return button;
    }
}
