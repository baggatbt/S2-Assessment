package bbaggatta.c195.model;

import bbaggatta.c195.helper.JDBC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**C195 Project Author: Brandon Baggatta
 *
 */

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        JDBC.openConnection();

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/bbaggatta/c195/View/loginForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

        JDBC.closeConnection();
    }

    public static void main(String[] args) {
        launch();
    }
}