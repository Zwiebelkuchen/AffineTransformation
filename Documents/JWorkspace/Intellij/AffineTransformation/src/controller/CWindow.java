package controller;

import frameworks.ChartBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CWindow implements  Initializable {
    private ChartBuilder chartbuilder = new ChartBuilder();



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stacki.getChildren().addAll(layerCharts(chartbuilder.createLineChart(), chartbuilder.createLineChart2(), chartbuilder.bubbleChart()));


    }

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
        stacki.getChildren().addAll(layerCharts(chartbuilder.createLineChart(), chartbuilder.createLineChart2(), chartbuilder.bubbleChart()));
        System.out.println("lustig");
    }

@FXML
protected void bResetAction(ActionEvent event){

}


    public   XYChart<Number, Number>[] layerCharts(final XYChart<Number, Number>... charts) {
        for (int i = 1; i < charts.length; i++) {
            chartbuilder.configureOverlayChart(charts[i]);
        }
        return charts;
    }
}