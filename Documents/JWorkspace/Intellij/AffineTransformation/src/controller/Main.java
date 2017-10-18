package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        final URL fxmlUrl = getClass().getClassLoader().getResource("view/Window.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader( fxmlUrl);
        fxmlLoader.setController( new CWindow());
        final Parent root = fxmlLoader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
