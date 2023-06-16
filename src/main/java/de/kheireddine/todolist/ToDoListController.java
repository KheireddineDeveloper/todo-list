package de.kheireddine.todolist;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ToDoListController {
    @FXML
    private Label startText;

    @FXML
    protected void onHelloButtonClick() {

        startText.setText("Welcome to your Todo-List! Press again 'start'!");
    }
}