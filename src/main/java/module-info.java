module de.kheireddine.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.kheireddine.todolist to javafx.fxml;
    exports de.kheireddine.todolist;
}