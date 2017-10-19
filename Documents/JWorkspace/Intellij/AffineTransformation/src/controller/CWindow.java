package controller;

import frameworks.ChartBuilder;
import frameworks.Matriz33;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import model.*;

import java.net.URL;
import java.util.ResourceBundle;

public class CWindow implements  Initializable {
    private ChartBuilder chartbuilder = new ChartBuilder();



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        changeStackpane();    }

    @FXML
    TextField m12;

    @FXML
    TextField m11;

    @FXML
    TextField m21;

    @FXML
    TextField m22;

    @FXML
    StackPane stacki;

    @FXML
    protected void bTransformierenAction(ActionEvent event) {
        changeStackpane();
        System.out.println("lustig");
    }

    @FXML
    protected void bResetAction(ActionEvent event){
        originStackpane();
    }

    private void changeStackpane(){
        stacki.getChildren().addAll(layerCharts(chartbuilder.createLineChartX(DataFlexibleLineX.getInstance().getMatriz33()), chartbuilder.createLineChartY(DataFlexibleLineY.getInstance().getMatriz33()), chartbuilder.createBubbleChart(DataFlexibleBubble.getInstance().getMatriz33())));
    }
    private void originStackpane(){
        stacki.getChildren().addAll(layerCharts(chartbuilder.createLineChartX(DataOriginLineX.getInstance().getMatriz33()), chartbuilder.createLineChartY(DataOriginLineY.getInstance().getMatriz33()), chartbuilder.createBubbleChart(DataOriginBubble.getInstance().getMatriz33())));
    }


    //Todo Chartbuilder und Layerchart sind 2 Klassen damit verknüpft!!! Trennen
    private   XYChart<Number, Number>[] layerCharts(final XYChart<Number, Number>... charts) {
        for (int i = 1; i < charts.length; i++) {
            chartbuilder.configureOverlayChart(charts[i]);
        }
        return charts;
    }
}