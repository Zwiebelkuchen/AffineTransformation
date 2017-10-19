package controller;

import frameworks.Matriz33;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    final private int[][] lineChartX =new int[][] {{3,2,0},{9,2,0},{0,0,1}};
    final private int[][] lineChartY = new int[][]{{2,3,0},{2,9,0},{0,0,1}};
    final private int[][] bubbleChart = new int[][]{{0,0,0},{2,0,0},{0,0,1}};



    private void dataOriginSet()
    {
        Matriz33 matriz1 = new Matriz33(lineChartX);
        DataOriginLineX.getInstance().setMatriz33(matriz1);
        DataFlexibleLineX.getInstance().setMatriz33(matriz1);
        Matriz33 matriz2 = new Matriz33(lineChartY);
        DataOriginLineY.getInstance().setMatriz33(matriz2);
        DataFlexibleLineY.getInstance().setMatriz33(matriz2);
        Matriz33 matriz3 = new Matriz33(bubbleChart);
        DataOriginBubble.getInstance().setMatriz33(matriz3);
        DataFlexibleBubble.getInstance().setMatriz33(matriz3);
    }



    @Override
    public void start(Stage primaryStage) throws IOException {
        dataOriginSet();
        final URL fxmlUrl = getClass().getClassLoader().getResource("view/Window.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader( fxmlUrl);
        fxmlLoader.setController( new CWindow());
        final Parent root = fxmlLoader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
