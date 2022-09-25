package LibraryFunctionality;

/*****************************************************************\
 IN THE NAME OF ALLAH, MOST GRACIOUS AND MOST MERCIFUL

 |     Author     : Irfanul Haque Nabil
 |     Email      : irfanul2515@student.nstu.edu.bd
 |     Department : Department of Software Engineering,
 Institute of Information Technology(IIT)
 |     University : Noakhali Science and Technology University,Bangladesh


 \*****************************************************************/



import FilePackage.DateTimeWriter;
import Layout.ButtonDesign;
import LinearRegression.FourVariableRegression;
import MainPackage.BookNumber;
import MainPackage.DataParsing;
import MainPackage.Processing;
import Methods.PrintInfo;
import Methods.PrioritySort;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibrUserShowing extends Application {

    private TableView table;
    private ObservableList data;
    private Text actionStatus;
    PriorityData[] priorityData;
 
    LibraryUser[] libraryUsers;
    int numOfBook;
    BookData[] bookData = new BookData[1050];

    DataParsing dataParsing = new DataParsing();
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();
    ReverseSorting soring = new ReverseSorting();



    String labelName = "Top Books";

    public void startstartInUp(Stage primaryStage) throws IOException {
        String className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);

        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setOnAction(actionEvent -> {

        });
        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });

        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);
        table = new TableView();
        data = getInitialTableData();

        TableColumn userId = new TableColumn("User Id");
       
        TableColumn userEducationLevel = new TableColumn("User Education Level");
        userEducationLevel.setCellValueFactory(new PropertyValueFactory("userEducationLevel"));
        TableColumn userClass = new TableColumn("User Class");
        userClass.setCellValueFactory(new PropertyValueFactory("userClass"));

        table.getColumns().setAll(userId, userName, userInstitute, userEducationLevel, userClass);


        Group group = new Group();
        group.getChildren().addAll(canvas, table, label2, exit, back);

        Scene scene = new Scene(group, 1400, 775);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();

        // Select the first row
        table.getSelectionModel().select(0);
        Library library = (Library) table.getSelectionModel().getSelectedItem();
        actionStatus.setText(library.toString());
    }

    public void start(Stage primaryStage) throws IOException {
        String className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);
        // add button desing
        ButtonDesign buttonDesign = new ButtonDesign();

        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setOnAction(actionEvent -> {

        });
        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });

        

        Font font3 = Font.font(Font.getFontNames().get(0), FontWeight.BOLD, 30);

      
        back.setTranslateX(35);
        back.setTranslateY(650);
        exit.setTranslateX(1135);
        exit.setTranslateY(650);
        back.setFont(font3);
        exit.setFont(font3);
        primaryStage.setTitle("JavaFX App");

        FileChooser fileChooser = new FileChooser();

        Button newLibraryData = new Button("Select File");
        newLibraryData.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            Processing processing = new Processing();
            try {
                priorityData = processing.fileChooserMethods(selectedFile);
                numberOfBooks = bookNumber.bookNumberFindingMethods();

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            priorityData = multipleLinearRegression.multipleLinearRegressionMethods(priorityData, numberOfBooks);
            priorityData = prioritySort.PrioritySortingMLRmethods(priorityData, numberOfBooks);

            labelName = "Library's Book Recommendation";
            for (iterator = 0; iterator < numberOfBooks; iterator++) {
                list.add(new Book(priorityData[iterator].bookData.bookName,
                        priorityData[iterator].bookData.writerName,
                        priorityData[iterator].bookData.bookId,
                        priorityData[iterator].bookData.typeName));
                data = FXCollections.observableList(list);

            }
            showInfo(primaryStage, labelName, data);

        });

        newLibraryData = buttonDesign.systemLine(newLibraryData, 150, 60, 666, 333, 25);

        Button enterButton = new Button("MLR");
        enterButton = buttonDesign.systemLine(enterButton, 150, 60, 666, 433, 25);

   
        Group group = new Group();
        group.getChildren().addAll(canvas, newLibraryData, exit, back);

        Scene scene = new Scene(group, 1400, 775);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();

    }

   

    public void showInfo(Stage secondaryStage, String labelName, ObservableList data) {
        String className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);

        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            list.clear();
            try {
                this.start(secondaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });
        // label top of the table
        Font font3 = Font.font(Font.getFontNames().get(0), FontWeight.BOLD, 30);
        Font font4 = Font.font(Font.getFontNames().get(0), FontWeight.BOLD, 40);
        Label label = new Label();
        label.setPrefSize(700, 45);
        label.setTranslateX(454);
        label.setTranslateY(0);
        label.setText(labelName);
        label.setFont(font4);
        // reset buttons position
        back.setTranslateX(35);
        back.setTranslateY(650);
        exit.setTranslateX(1135);
        exit.setTranslateY(650);
        back.setFont(font3);
        exit.setFont(font3);

        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        table = new TableView();
        table.setItems(data);

        TableColumn bookName = new TableColumn("Book Name");
        bookName.setCellValueFactory(new PropertyValueFactory("bookName"));


        table.getColumns().setAll(bookName, writerName, typeName, bookId);
        table.setPrefWidth(1240);
        table.setPrefHeight(560);
        table.setTranslateX(60);
        table.setTranslateY(70);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.getSelectionModel().selectedIndexProperty().addListener(
                new LibraryUserShowing.RowSelectChangeListener());

        
    private ObservableList getInitialTableData() throws IOException {
        String className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);
        List list = new ArrayList();

        priorityData = processing.fileReaderMethods();
        
        for (iterator = 0; iterator < numberOfBooks; iterator++) {

            list.add(new Book(priorityData[genericAlgo[iterator].getIndex()].bookData.bookName,
                    priorityData[genericAlgo[iterator].getIndex()].bookData.writerName,
                    priorityData[genericAlgo[iterator].getIndex()].bookData.bookId));
        }
        ObservableList data = FXCollections.observableList(list);
        return data;
    }

}
