package BookDataBaseFX;

/*****************************************************************\
 IN THE NAME OF ALLAH, MOST GRACIOUS AND MOST MERCIFUL

 |     Author     : Irfanul Haque Nabil
 |     Email      : irfanul2515@student.nstu.edu.bd
 |     Department : Department of Software Engineering,
 Institute of Information Technology(IIT)
 |     University : Noakhali Science and Technology University,Bangladesh


 \*****************************************************************/


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassesOfBook extends Application {

    @Override
    public void start(Stage primaryStage) {
        String className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);
        Font font = new Font(14);
        Font font1 = new Font(47);
        Font font2 = new Font(26);

        Button bar_chart = new Button("Bar Chart");
        Button pie_chart = new Button("Pie Chart");
        Button analyticChart = new Button("Analytic Chart");
        InfoBarChart infoBarChartObject = new InfoBarChart();
        InfoPieChart infoPieChartObject = new InfoPieChart();
        AnalyticChart analyticChart1Object = new AnalyticChart();

        bar_chart.setOnAction(actionEvent -> {
            try {
                infoBarChartObject.startClassBook(primaryStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        pie_chart.setOnAction(actionEvent -> {
            try {
                infoPieChartObject.startClassBook(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        analyticChart.setOnAction(actionEvent -> {
            try {
                analyticChart1Object.startCLassBook(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
       

    public Button setStyle(Button button) {
        button.setStyle("-fx-background-color: \n" +
                "        #090a0c,\n" +
                "                linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" +
                "        linear-gradient(#20262b, #191d22),\n" +
                "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" +
                "        -fx-background-radius: 5,4,3,5;\n" +
                "        -fx-background-insets: 0,1,2,0;\n" +
                "        -fx-text-fill: white;\n" +
                "        -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" +
                "        -fx-font-family: \"Arial\";\n" +
                "        -fx-text-fill: linear-gradient(white, #d0d0d0);\n" +
                "        -fx-font-size: 1.5em;\n" +
                "        -fx-padding: 10 20 10 20;");
        return button;
    }

}
/**Created:
 Alhamdulillah
 Happy Coding!
 To be continued.......**/