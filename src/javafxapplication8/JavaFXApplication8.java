/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication8;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class JavaFXApplication8 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root=new BorderPane();
        TableView tableView=new TableView();
        TableColumn firstNameColumn=new TableColumn("First Name");
        TableColumn lastNameColumn=new TableColumn("Last Name");
        TableColumn emailColumn=new TableColumn("Email");
        emailColumn.setMinWidth(200);
        tableView.getColumns().addAll(firstNameColumn, lastNameColumn, emailColumn);
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        ObservableList list=FXCollections.observableArrayList(
                new Person("Lendle", "Tseng", "xxx@com.tw", "123"),
                new Person("person2", "LastName", "xxx@com.tw", "456")
        );
        tableView.setItems(list);
        VBox vbox=new VBox();
        Label labelFirstName=new Label("First Name:");
        Label labelLastName=new Label("Last Name:");
        Label labelEmail=new Label("Email:");
        Label labelMobile=new Label("Mobile:");
        TextField textFirstName=new TextField();
        TextField textLastName=new TextField();
        TextField textEmail=new TextField();
        TextField textMobile=new TextField();
        vbox.getChildren().addAll(
                new HBox(labelFirstName, textFirstName),
                new HBox(labelLastName, textLastName),
                new HBox(labelEmail, textEmail),
                new HBox(labelMobile, textMobile)
        );
        root.setCenter(vbox);
        root.setLeft(tableView);
        Scene scene = new Scene(root, 800, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
