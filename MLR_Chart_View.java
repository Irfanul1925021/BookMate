package TableViewPackage;

import FilePackage.DateTimeWriter;
import JavFX.Main;
import Layout.ButtonDesign;
import MainPackage.BookNumber;
import MainPackage.Processing;
import MultiVariableRegression.MultipleLinearRegression;
import ObjectOrienvcvted.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import LinearRegression.FourVariableRegression;
import RecommendationAlgorithm.AnalyticHierarchyAlgorithm;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scevne.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafvcx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafxvc.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MLR_Chart_View extends Application {
    ButtonDesign buttonDesign = new ButtonDesign();
    PriorityDatavc[] priorityData;
    AHPcriteriaWeight ahPcriteriaWeight;
    int numbervcOfBooks;
    int iterator;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    MultipleLinearvcxRegression multipleLinearRegression = new MultipleLinearRegression();

    @Override
    public void start(Stage primaryStage) throws IOException {
        String className = this.getClass().getSimpleName();
        DateTimeWriter datvceTimeWriter = new DateTimeWriter();
        dateTimeWrvciter.dateTimeWriterMethods(className);
        Font font = new Font(19);
        Font font1 = new Font(47);
        Font font2 = new Font(26);

        Button scatter_chart = new Button("Scatter Chart");
        Button line_chart = new Button("Line Chart");
        Button stacked_area_chart = new Button("Stacked Area Chart");

        scatter_chart.setPrefSize(410, 230);
        line_chart.setPrefSize(410, 230);
        stacked_area_chart.setPrefSize(410, 230);

        scatter_chart.setFont(font2);
        line_chart.setFont(font2);
        stacked_area_cxvchart.setFont(font2);
        scatter_chart.setTranslateX(30);
        scatter_chart.setTranslateY(35);
        line_chart.setTranslateX(30);
        line_chart.setTranslateY(270);
        stacked_area_chart.setTranslateX(30);
        stacked_area_chart.setTranslateY(505);

        scatter_chart.setContentDisplay(ContentDisplay.TOP);
        line_chart.setContentDisplay(ContentDisplay.TOP);
        stacked_area_chart.setContentDisplay(ContentDisplay.TOP);
        FileInputStream fileInputStream1 = null;
        try {
            fileInputStream1 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "scatter.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image1 = new Image(fileInputStream1);
        scatter_chart.setGraphic(new ImageView(image1));

        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream2 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "line.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image2 = new Image(fileInputStream2);
        line_chart.setGraphic(new ImageView(image2));

        FileInputStream fileInputStream3 = null;
        try {
            fileInputStream3 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "area.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image3 = new Image(fileInputStream3);
        stacked_area_chart.setGraphic(new ImageView(image3));

        scatter_chart.setOnAction(actionEvent -> {
            try {
                startScatterChart(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        Button back = new Button("Back");
        back.setTranslateX(950);
        back.setTranslateY(520);
        back.setPrefSize(375, 30);
        back.setFvcvont(font2);
        back.setContentDisplay(ContentDisplay.LEFT);
        FileInputStream fileInputStream6 = null;
        try {
            fileInputStream6 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "back.png");
        } catch (FileNotFoundException e) {
            e.printStvcackTrace();
        }
        Image image6 = new Image(fileInputStream6);
        back.setGraphic(new ImageView(image6));
        back.setOnAction(actionEvent -> {
            FourVariableRegression fourVariableRegression = new FourVariableRegression();
            try {
                fourVarciableRegression.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Image background = new Image("Images" + File.separator + "framework.jpg");
        Canvas canvas = new Canvas(850, 425);
        canvas.setTranslacvteX(470);
        canvas.setTranslateY(35);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContexvcvt.drawImage(background, 0, 0);
        Group group = new Group();
        group.getChildren().addAll(canvas, scatter_chart,
                line_chart,
                stacked_acvrea_chart, exit, home, text, back);

        Scene scene1 = new Scene(group, 1500, 950);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Recommendation Tool");
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public void startScatterChart(Stage primaryStage) throws IOException {

        String className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter = new DateTimeWriter();
        dateTimeWritvcer.dateTimeWriterMethods(className);
        Font font = new Font(19);
        Font font1 = new Font(47);
        Font font2 = new Font(26);

        Button scatter_chart = new Button("Scatter Chart");
        Button line_chart = new Button("Line Chart");
        Button stacked_area_chart = new Button("Stacked Area Chart");

        scatter_chart.setPrefSize(410, 230);
        line_chart.setPrefcxvSize(410, 230);
        stacked_area_chart.setPrefSize(410, 230);

        scatter_chart.setFont(font2);
        line_chart.setFont(font2);
        stacked_arvcxea_chart.setFont(font2);
        scatter_chart.setTranslateX(30);
        scatter_chart.setTranslateY(35);
        line_chart.setTranslateX(30);
        line_chart.setTranslateY(270);
        stacked_area_chart.setTranslateX(30);
        stacked_area_chart.setTranslateY(505);

        scatter_chart.setContentDisplay(ContentDisplay.TOP);
        line_chart.setContentDisplay(ContentDisplay.TOP);
        stacked_area_chart.setContentDisplay(ContentDisplay.TOP);
        FileInputStream fileInputStream1 = null;
        try {
            fileInputStream1 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "scatter.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image1 = new Image(fileInputStream1);
        scatter_chart.setGraphic(new ImageView(image1));

        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream2 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "line.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image2 = new Image(fileInputStream2);
        line_chart.setGraphic(new ImageView(image2));

        FileInputStream fileInputStream3 = null;
        try {
            fileInputStream3 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "area.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image3 = new Image(fileInputStream3);
        stacked_area_chart.setGraphic(new ImageView(image3));

        scatter_chart.setOnAction(actionEvent -> {
            try {
                startScatterChart(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        stacked_area_chart.setOnAction(actionEvent -> {
            try {
                startStackedAreaChart(primaryStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        line_chart.setOnAction(actionEvent -> {
            try {
                startLineChart(primaryStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Button exit = new Button("Exit");
        exit.setTranslateX(1200);
        exit.setTranslateY(700);
        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });
        FileInputStream fileInputStream4 = null;
        try {
            fileInputStream4 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "exit.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image4 = new Image(fileInputStream4);
        exit.setGraphic(new ImageView(image4));
        exit.setPrefSize(120, 20);
        exit.setContentDisplay(ContentDisplay.LEFT);
        exit.setFont(font);
        Text text = new Text("Multiple Linear Regression");
        text.setTranslateX(520);
        text.setTranslateY(500);
        text.setFont(font1);
        text.setFill(Color.BLACK);
        text.setTextAlignment(TextAlignment.LEFT);
        text.setStyle("-fx-font-weight: bold;");

        Button home = new Button("Home");
        home.setTranslateX(470);
        home.setTranslateY(520);
        home.setPrefSize(375, 30);
        home.setFont(font2);
        home.setContentDisplay(ContentDisplay.LEFT);
        FileInputStream fileInputStream5 = null;
        try {
            fileInputStream5 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "home.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image5 = new Image(fileInputStream5);
        home.setGraphic(new ImageView(image5));
        home.setOnAction(actionEvent -> {
            Main main = new Main();
            try {
                main.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Button back = new Button("Back");
        back.setTranslateX(950);
        back.setTranslateY(520);
        back.setPrefSize(375, 30);
        back.setFont(font2);
        back.setContentDisplay(ContentDisplay.LEFT);
        FileInputStream fileInputStream6 = null;
        try {
            fileInputStream6 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "back.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image6 = new Image(fileInputStream6);
        back.setGraphic(new ImageView(image6));
        back.setOnAction(actionEvent -> {
            try {
                start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        Group group = new Group();
        group.getChildren().addAll(scatter_chart,
                line_chart,
                stacked_area_chart, exit, home, text, back);
        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
        priorityData = multipleLinearRegression.multipleLinearRegressionMethods(priorityData, numberOfBooks);

        Font font3 = Font.font(Font.getFontNames().get(0), FontWeight.BOLD, 10);
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Book Index");
        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setLabel("Book Priority Data");
        categoryAxis.setTickLabelFont(font3);
        numberAxis.setTickLabelFont(font3);

        ScatterChart scatterChart = new ScatterChart(categoryAxis, numberAxis);
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Book Weight Show");
        int positionIndicator = 0;

        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            positionIndicator++;
            series1.getData()
                    .add(new XYChart.Data(String.valueOf(positionIndicator), priorityData[iterator].getRankValue()));
            System.out.println(priorityData[iterator].getRankValue());
        }

        // line chart
        // LineChart lineChart = new LineChart(categoryAxis, numberAxis);
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Book Weight Line");
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            positionIndicator++;
            double yGet = iterator * .9 + 5.6;
            series2.getData().add(new XYChart.Data(String.valueOf(positionIndicator), yGet));
        }
        scatterChart.getData().add(series1);

        // lineChart.getData().add(series2);
        // lineChart.setOpacity(0.35);
        scatterChart = buttonDesign.systemLine(scatterChart, 850, 350, 470, 35);
        // lineChart = buttonDesign.systemLine(lineChart,850,350,470,530);
        group.getChildren().addAll(scatterChart/* ,lineChart */);

        double getWeightAverage = 0.0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            getWeightAverage = getWeightAverage + (priorityData[iterator].getRankValue());

        }
        getWeightAverage = getWeightAverage / numberOfBooks;
        double standardDeviation = 0.0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {

            standardDeviation = standardDeviation
                    + Math.pow(priorityData[iterator].getRankValue() - getWeightAverage, 2);

        }

        standardDeviation /= numberOfBooks;
        standardDeviation = Math.sqrt(standardDeviation);
        Label labelMean = new Label("Mean : " + getWeightAverage);
        Label labelDeviation = new Label("Standard Deviation : " + standardDeviation);
        labelMean = buttonDesign.systemLine(labelMean, 750, 380, 25);
        labelDeviation = buttonDesign.systemLine(labelDeviation, 750, 410, 25);
        group.getChildren().addAll(labelMean, labelDeviation);

        Scene scene1 = new Scene(group, 1500, 950);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Recommendation Tool");
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public void startLineChart(Stage primaryStage) throws IOException {

        String className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);
        Font font = new Font(19);
        Font font1 = new Font(47);
        Font font2 = new Font(26);

        Button scatter_chart = new Button("Scatter Chart");
        Button line_chart = new Button("Line Chart");
        Button stacked_area_chart = new Button("Stacked Area Chart");

        scatter_chart.setPrefSize(410, 230);
        line_chart.setPrefSize(410, 230);
        stacked_area_chart.setPrefSize(410, 230);

        scatter_chart.setFont(font2);
        line_chart.setFont(font2);
        stacked_area_chart.setFont(font2);
        scatter_chart.setTranslateX(30);
        scatter_chart.setTranslateY(35);
        line_chart.setTranslateX(30);
        line_chart.setTranslateY(270);
        stacked_area_chart.setTranslateX(30);
        stacked_area_chart.setTranslateY(505);

        scatter_chart.setContentDisplay(ContentDisplay.TOP);
        line_chart.setContentDisplay(ContentDisplay.TOP);
        stacked_area_chart.setContentDisplay(ContentDisplay.TOP);
        FileInputStream fileInputStream1 = null;
        try {
            fileInputStream1 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "scatter.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image1 = new Image(fileInputStream1);
        scatter_chart.setGraphic(new ImageView(image1));

        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream2 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "line.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image2 = new Image(fileInputStream2);
        line_chart.setGraphic(new ImageView(image2));

        FileInputStream fileInputStream3 = null;
        try {
            fileInputStream3 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "area.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image3 = new Image(fileInputStream3);
        stacked_area_chart.setGraphic(new ImageView(image3));

        scatter_chart.setOnAction(actionEvent -> {
            try {
                startScatterChart(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        stacked_area_chart.setOnAction(actionEvent -> {
            try {
                startStackedAreaChart(primaryStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        line_chart.setOnAction(actionEvent -> {
            try {
                startLineChart(primaryStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Button exit = new Button("Exit");
        exit.setTranslateX(1200);
        exit.setTranslateY(700);
        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });
        FileInputStream fileInputStream4 = null;
        try {
            fileInputStream4 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "exit.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image4 = new Image(fileInputStream4);
        exit.setGraphic(new ImageView(image4));
        exit.setPrefSize(120, 20);
        exit.setContentDisplay(ContentDisplay.LEFT);
        exit.setFont(font);
        Text text = new Text("Multiple Linear Regression");
        text.setTranslateX(520);
        text.setTranslateY(500);
        text.setFont(font1);
        text.setFill(Color.BLACK);
        text.setTextAlignment(TextAlignment.LEFT);
        text.setStyle("-fx-font-weight: bold;");

        Button home = new Button("Home");
        home.setTranslateX(470);
        home.setTranslateY(520);
        home.setPrefSize(375, 30);
        home.setFont(font2);
        home.setContentDisplay(ContentDisplay.LEFT);
        FileInputStream fileInputStream5 = null;
        try {
            fileInputStream5 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "home.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image5 = new Image(fileInputStream5);
        home.setGraphic(new ImageView(image5));
        home.setOnAction(actionEvent -> {
            Main main = new Main();
            try {
                main.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Button back = new Button("Back");
        back.setTranslateX(950);
        back.setTranslateY(520);
        back.setPrefSize(375, 30);
        back.setFont(font2);
        back.setContentDisplay(ContentDisplay.LEFT);
        FileInputStream fileInputStream6 = null;
        try {
            fileInputStream6 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "back.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image6 = new Image(fileInputStream6);
        back.setGraphic(new ImageView(image6));
        back.setOnAction(actionEvent -> {
            try {
                start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        Group group = new Group();
        group.getChildren().addAll(scatter_chart,
                line_chart,
                stacked_area_chart, exit, home, text, back);
        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
        priorityData = multipleLinearRegression.multipleLinearRegressionMethods(priorityData, numberOfBooks);

        Font font3 = Font.font(Font.getFontNames().get(0), FontWeight.BOLD, 10);
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Book Index");
        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setLabel("Book Priority Data");
        categoryAxis.setTickLabelFont(font3);
        numberAxis.setTickLabelFont(font3);

        LineChart lineChart = new LineChart(categoryAxis, numberAxis);
        XYChart.Series series1 = new XYChart.Series();

        series1.setName("Book Weight Show");
        int positionIndicator = 0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            positionIndicator++;
            series1.getData()
                    .add(new XYChart.Data(String.valueOf(positionIndicator), priorityData[iterator].getRankValue()));
        }

        lineChart.getData().add(series1);
        lineChart = buttonDesign.systemLine(lineChart, 850, 350, 470, 35);
        group.getChildren().add(lineChart);
        double getWeightAverage = 0.0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].getAHPweight() < 2.00) {
                getWeightAverage = getWeightAverage + (35.00 * priorityData[iterator].getAHPweight());
            } else {
                getWeightAverage = getWeightAverage + (18.00 * priorityData[iterator].getAHPweight());

            }
        }
        getWeightAverage = getWeightAverage / numberOfBooks;
        double standardDeviation = 0.0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].getAHPweight() < 2.00) {
                standardDeviation = standardDeviation
                        + Math.pow(35.00 * priorityData[iterator].getRankValue() - getWeightAverage, 2);
            } else {
                standardDeviation = standardDeviation
                        + Math.pow(18.00 * priorityData[iterator].getRankValue() - getWeightAverage, 2);
            }
        }

        standardDeviation /= numberOfBooks;
        standardDeviation = Math.sqrt(standardDeviation);
        Label labelMean = new Label("Mean : " + getWeightAverage);
        Label labelDeviation = new Label("Standard Deviation : " + standardDeviation);
        labelMean = buttonDesign.systemLine(labelMean, 750, 380, 25);
        labelDeviation = buttonDesign.systemLine(labelDeviation, 750, 410, 25);

        Scene scene1 = new Scene(group, 1500, 950);
        scene1.getStylesheets().add("LineChart.css");
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Recommendation Tool");
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public void startStackedAreaChart(Stage primaryStage) throws IOException {

        String className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);
        Font font = new Font(19);
        Font font1 = new Font(47);
        Font font2 = new Font(26);

        Button scatter_chart = new Button("Scatter Chart");
        Button line_chart = new Button("Line Chart");
        Button stacked_area_chart = new Button("Stacked Area Chart");

        scatter_chart.setPrefSize(410, 230);
        line_chart.setPrefSize(410, 230);
        stacked_area_chart.setPrefSize(410, 230);

        scatter_chart.setFont(font2);
        line_chart.setFont(font2);
        stacked_area_chart.setFont(font2);
        scatter_chart.setTranslateX(30);
        scatter_chart.setTranslateY(35);
        line_chart.setTranslateX(30);
        line_chart.setTranslateY(270);
        stacked_area_chart.setTranslateX(30);
        stacked_area_chart.setTranslateY(505);

        scatter_chart.setContentDisplay(ContentDisplay.TOP);
        line_chart.setContentDisplay(ContentDisplay.TOP);
        stacked_area_chart.setContentDisplay(ContentDisplay.TOP);
        FileInputStream fileInputStream1 = null;
        try {
            fileInputStream1 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "scatter.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image1 = new Image(fileInputStream1);
        scatter_chart.setGraphic(new ImageView(image1));

        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream2 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "line.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image2 = new Image(fileInputStream2);
        line_chart.setGraphic(new ImageView(image2));

        FileInputStream fileInputStream3 = null;
        try {
            fileInputStream3 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "area.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image3 = new Image(fileInputStream3);
        stacked_area_chart.setGraphic(new ImageView(image3));

        scatter_chart.setOnAction(actionEvent -> {
            try {
                startScatterChart(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        stacked_area_chart.setOnAction(actionEvent -> {
            try {
                startStackedAreaChart(primaryStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        line_chart.setOnAction(actionEvent -> {
            try {
                startLineChart(primaryStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Button exit = new Button("Exit");
        exit.setTranslateX(1200);
        exit.setTranslateY(700);
        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });
        FileInputStream fileInputStream4 = null;
        try {
            fileInputStream4 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "exit.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image4 = new Image(fileInputStream4);
        exit.setGraphic(new ImageView(image4));
        exit.setPrefSize(120, 20);
        exit.setContentDisplay(ContentDisplay.LEFT);
        exit.setFont(font);
        Text text = new Text("Multiple Linear Regression");
        text.setTranslateX(520);
        text.setTranslateY(500);
        text.setFont(font1);
        text.setFill(Color.BLACK);
        text.setTextAlignment(TextAlignment.LEFT);
        text.setStyle("-fx-font-weight: bold;");

        Button home = new Button("Home");
        home.setTranslateX(470);
        home.setTranslateY(520);
        home.setPrefSize(375, 30);
        home.setFont(font2);
        home.setContentDisplay(ContentDisplay.LEFT);
        FileInputStream fileInputStream5 = null;
        try {
            fileInputStream5 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "home.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image5 = new Image(fileInputStream5);
        home.setGraphic(new ImageView(image5));
        home.setOnAction(actionEvent -> {
            Main main = new Main();
            try {
                main.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Button back = new Button("Back");
        back.setTranslateX(950);
        back.setTranslateY(520);
        back.setPrefSize(375, 30);
        back.setFont(font2);
        back.setContentDisplay(ContentDisplay.LEFT);
        FileInputStream fileInputStream6 = null;
        try {
            fileInputStream6 = new FileInputStream(
                    "src" + File.separator + "Images" + File.separator + "back.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image6 = new Image(fileInputStream6);
        back.setGraphic(new ImageView(image6));
        back.setOnAction(actionEvent -> {
            try {
                start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        Group group = new Group();
        group.getChildren().addAll(scatter_chart,
                line_chart,
                stacked_area_chart, exit, home, text, back);
        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
        priorityData = multipleLinearRegression.multipleLinearRegressionMethods(priorityData, numberOfBooks);
        Font font3 = Font.font(Font.getFontNames().get(0), FontWeight.BOLD, 10);
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Book Index");
        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setLabel("Book Priority Data");
        categoryAxis.setTickLabelFont(font3);
        numberAxis.setTickLabelFont(font3);

        StackedAreaChart stackedAreaChart = new StackedAreaChart(categoryAxis, numberAxis);
        XYChart.Series series1 = new XYChart.Series();

        series1.setName("Book Weight Show");
        int positionIndicator = 0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            positionIndicator++;
            series1.getData()
                    .add(new XYChart.Data(String.valueOf(positionIndicator), priorityData[iterator].getRankValue()));
        }

        stackedAreaChart.getData().add(series1);
        stackedAreaChart = buttonDesign.systemLine(stackedAreaChart, 850, 350, 470, 35);
        group.getChildren().add(stackedAreaChart);
        double getWeightAverage = 0.0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].getAHPweight() < 2.00) {
                getWeightAverage = getWeightAverage + (35.00 * priorityData[iterator].getAHPweight());
            } else {
                getWeightAverage = getWeightAverage + (18.00 * priorityData[iterator].getAHPweight());

            }
        }
        getWeightAverage = getWeightAverage / numberOfBooks;
        double standardDeviation = 0.0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].getAHPweight() < 2.00) {
                standardDeviation = standardDeviation
                        + Math.pow(35.00 * priorityData[iterator].getRankValue() - getWeightAverage, 2);
            } else {
                standardDeviation = standardDeviation
                        + Math.pow(18.00 * priorityData[iterator].getRankValue() - getWeightAverage, 2);
            }
        }

        standardDeviation /= numberOfBooks;
        standardDeviation = Math.sqrt(standardDeviation);
        Label labelMean = new Label("Mean : " + getWeightAverage);
        Label labelDeviation = new Label("Standard Deviation : " + standardDeviation);
        labelMean = buttonDesign.systemLine(labelMean, 750, 380, 25);
        labelDeviation = buttonDesign.systemLine(labelDeviation, 750, 410, 25);

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

    public Button setStyle2(Button button) {
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
                "    -fx-font-size: 1.1em;");
        return button;
    }
}
