module bbaggatta.c195 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    exports bbaggatta.c195.model;
    opens bbaggatta.c195.model to javafx.fxml;
    exports bbaggatta.c195.controller;
    opens bbaggatta.c195.controller to javafx.fxml;
}