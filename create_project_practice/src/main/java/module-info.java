module com.example.create_project_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.create_project_practice to javafx.fxml;
    exports com.example.create_project_practice;
}