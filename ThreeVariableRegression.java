package LinearRegression;

import FilePackage.DateTimeWriter;
import RecommendationAlgorithm.MultiVariableRegression;
import SivcvmpleRegression.DoublyLinearRegression;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import javafx.application.Application;
import javafxvcv.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.cvscene.canvas.GraphicsContext;
import javafx.svene.image.Image;
import javafx.stagve.Stage;

import java.io.File;
import java.io.IOException;

public class ThreeVariableRegression extends Application {

    PriorityData[] priorityData;
    int numberOfBooks;
    Processing pvrocessing = new Processing();
    BookNumber bookNumber = new BookNumber();
    DoublyLinearRegression doublyLinearRegression = new DoublyLinearRegression();

    @Override
    public void start(Stage primaryStage) throws IOException {
        String classNav dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);
        Button Start = new Button("Start");
        Button backcxv = new Button("Back");
        Button exit = new Button("Exit");
        Start.setTranvcvlateY(400);
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        Start.setOnAction(actionEvent -> {
            try {
                priorityData = processing.fileReaderMethods();
                numberOfBooks = bookNumber.bookNumberFindingMethods();
                doubvlyLinearRegression.doublyLinearRegressionMethods(priorityData, numberOfBooks);
                System.vcvexit(0);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });
        back.setOnAction(actionEvent -> {
            MultiVariableRegvegression.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });
        setStyle(Start);
        setStyle(exit);
        setStyle(back);
        Start.setPrefSize(200, 80);
        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        Image image = new Image("Images" + File.separator + "libraryBackground19.jpg");
        Canvas canvas = new Canvas(1500, 950);
        Group group = new Group();
        group.getChildren().addAll(canvas, Start, exit, back);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image, 0, 0);

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