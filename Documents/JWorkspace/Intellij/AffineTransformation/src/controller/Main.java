package controller;

import frameworks.Matriz2D;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    final private int[][] lineChartX = new int[][]{{3,9},{2,2},{1,1}};
    final private int[][] lineChartY = new int[][]{{2,2},{3,9},{1,1}};
    final private int[][] bubbleChart = new int[][]{{0,},{0,0},{1,1}};



    private void dataOriginSet()
    {
        Matriz2D matriz1 = new Matriz2D(lineChartX);
        DataOriginLineX.getInstance().setMatriz2D(matriz1);
        DataFlexibleLineX.getInstance().setMatriz2D(matriz1);
        Matriz2D matriz2 = new Matriz2D(lineChartY);
        DataOriginLineY.getInstance().setMatriz2D(matriz2);
        DataFlexibleLineY.getInstance().setMatriz2D(matriz2);
        Matriz2D matriz3 = new Matriz2D(bubbleChart);
        DataOriginBubble.getInstance().setMatriz2D(matriz3);
        DataFlexibleBubble.getInstance().setMatriz2D(matriz3);
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
