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

    public BubbleChart<Number, Number> bubbleChart() {
        final BubbleChart<Number, Number> chart = new BubbleChart<Number, Number>(createYaxis(), createYaxis());
        setDefaultChartProperties(chart);
        chart.getStylesheets().add(getClass().getClassLoader().getResource("view/BubbleChart.css").toExternalForm());

        chart.getData().addAll(
                new XYChart.Series(
                        FXCollections.observableArrayList(
                                new XYChart.Data(0, 0,2)

                        )
                )
        );
        return chart;
    }

    public LineChart<Number, Number> createLineChart() {
        final LineChart<Number, Number> chart = new LineChart<Number, Number>(createYaxis(), createYaxis());
        setDefaultChartProperties(chart);
        chart.getStylesheets().addAll(getClass().getClassLoader().getResource("view/LineChart1.css").toExternalForm());

        chart.getData().addAll(
                new XYChart.Series(
                        FXCollections.observableArrayList(
                                new XYChart.Data(5, 1),
                                new XYChart.Data(0, 1)

                        )
                )
        );
        return chart;
    }
    public LineChart<Number, Number> createLineChart2() {
        final LineChart<Number, Number> chart = new LineChart<Number, Number>(createYaxis(), createYaxis());
        setDefaultChartProperties(chart);
        chart.getStylesheets().addAll(getClass().getClassLoader().getResource("view/LineChart.css").toExternalForm());

        chart.getData().addAll(
                new XYChart.Series(
                        FXCollections.observableArrayList(
                                new XYChart.Data(3, 10),
                                new XYChart.Data(3, 5)

                        )
                )
        );
        return chart;
    }


    private void setDefaultChartProperties(final XYChart<Number, Number> chart) {
        chart.setLegendVisible(false);
        chart.setAnimated(false);
    }

    public StackPane layerCharts(final XYChart<Number, Number> ... charts) {
        for (int i = 1; i < charts.length; i++) {
            configureOverlayChart(charts[i]);
        }

        StackPane stackpane = new StackPane();
        stackpane.getChildren().addAll(charts);

        return stackpane;
    }

    public void configureOverlayChart(final XYChart<Number, Number> chart) {
        chart.setAlternativeRowFillVisible(false);
        chart.setAlternativeColumnFillVisible(false);
        chart.setHorizontalGridLinesVisible(false);
        chart.setVerticalGridLinesVisible(false);
        chart.getXAxis().setVisible(false);
        chart.getYAxis().setVisible(false);
        chart.setAlternativeColumnFillVisible(false );

//       chart.getStylesheets().addAll(getClass().getResource("lineChart.css").toExternalForm());
    }
}
