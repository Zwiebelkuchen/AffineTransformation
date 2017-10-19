package frameworks;

import javafx.collections.FXCollections;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;

public class ChartBuilder {

    private NumberAxis createYaxis() {
        final NumberAxis axis = new NumberAxis(-20 ,20, 1);
        return axis;
    }

    public BubbleChart<Number, Number> createBubbleChart(Matriz33 matriz33) {
        int[][] array = matriz33.getMatriz33();
        int  x1= array[0][0];
        int  y1= array[0][1];
        int  x2= array[1][0];
        int  y2= array[1][1];
        final BubbleChart<Number, Number> chart = new BubbleChart<Number, Number>(createYaxis(), createYaxis());
        setDefaultChartProperties(chart);
        chart.getStylesheets().add(getClass().getClassLoader().getResource("view/BubbleChart.css").toExternalForm());
        chart.getData().addAll(
                new XYChart.Series(
                        FXCollections.observableArrayList(
                                new XYChart.Data(x1, y1, x2)

                        )
                )
        );
        return chart;
    }

    public LineChart<Number, Number> createLineChartX(Matriz33 matriz33) {
        int[][] array = matriz33.getMatriz33();
        int  x1= array[0][0];
        int  y1= array[0][1];
        int  x2= array[1][0];
        int  y2= array[1][1];
        final LineChart<Number, Number> chart = new LineChart<Number, Number>(createYaxis(), createYaxis());
        setDefaultChartProperties(chart);
        chart.getStylesheets().addAll(getClass().getClassLoader().getResource("view/LineChart1.css").toExternalForm());

        chart.getData().addAll(
                new XYChart.Series(
                        FXCollections.observableArrayList(
                                new XYChart.Data(x1, y1),
                                new XYChart.Data(x2, y2)

                        )
                )
        );
        return chart;
    }
    public LineChart<Number, Number> createLineChartY(Matriz33 matriz33) {
        int[][] array = matriz33.getMatriz33();
        int  x1= array[0][0];
        int  y1= array[0][1];
        int  x2= array[1][0];
        int  y2= array[1][1];
        final LineChart<Number, Number> chart = new LineChart<Number, Number>(createYaxis(), createYaxis());
        setDefaultChartProperties(chart);
        chart.getStylesheets().addAll(getClass().getClassLoader().getResource("view/LineChart.css").toExternalForm());

        chart.getData().addAll(
                new XYChart.Series(
                        FXCollections.observableArrayList(
                                new XYChart.Data(x1, y1),
                                new XYChart.Data(x2, y2)

                        )
                )
        );
        return chart;
    }


    private void setDefaultChartProperties(final XYChart<Number, Number> chart) {
        chart.setLegendVisible(false);
        chart.setAnimated(false);
    }

//    public StackPane layerCharts(final XYChart<Number, Number> ... charts) {
//        for (int i = 1; i < charts.length; i++) {
//            configureOverlayChart(charts[i]);
//        }
//        StackPane stackpane = new StackPane();
//        stackpane.getChildren().addAll(charts);
//        return stackpane;
//    }

    public void configureOverlayChart(final XYChart<Number, Number> chart) {
        chart.setAlternativeRowFillVisible(false);
        chart.setAlternativeColumnFillVisible(false);
        chart.setHorizontalGridLinesVisible(false);
        chart.setVerticalGridLinesVisible(false);
        chart.getXAxis().setVisible(false);
        chart.getYAxis().setVisible(false);
        chart.setAlternativeColumnFillVisible(false );
    }
}
