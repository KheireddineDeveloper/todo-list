package de.kheireddine.todolist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ToDoList extends Application {
    private Stage primaryStage;
    private Scene scene1;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        Group root1 = new Group();
        scene1 = new Scene(root1, 420, 420);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}