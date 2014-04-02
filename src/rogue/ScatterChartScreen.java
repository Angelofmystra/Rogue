package rogue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScatterChartScreen {
    private Stage primaryStage;
    private String buttonstyle;
    
    ScatterChartScreen(Stage stage, String style){
        this.primaryStage = stage;
        this.buttonstyle = style;
        stage.setTitle("Kill Comparison between Games");
        final NumberAxis xAxis = new NumberAxis(0, 10, 1);
        final NumberAxis yAxis = new NumberAxis(0, 500, 100);        
        final ScatterChart<Number,Number> sc = new ScatterChart<Number,Number>(xAxis,yAxis);
        xAxis.setLabel("Game");                
        yAxis.setLabel("Kills");
        sc.setTitle("Kill Comparison between Games");
        
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("orcs");
        series1.getData().add(new XYChart.Data(1, 193.2));
        series1.getData().add(new XYChart.Data(2, 33.6));
        series1.getData().add(new XYChart.Data(3, 24.8));
        series1.getData().add(new XYChart.Data(4, 14));
        series1.getData().add(new XYChart.Data(5, 26.4));
        series1.getData().add(new XYChart.Data(6, 114.4));
        series1.getData().add(new XYChart.Data(7, 323));
        series1.getData().add(new XYChart.Data(8, 289.8));
        series1.getData().add(new XYChart.Data(9, 287.1));
        series1.getData().add(new XYChart.Data(10, 90));
        // @TODO: use crosses, hollow circles, hollow triangles, so that data overlap isnt messy. also might want black&white
   
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("goblins");
        series2.getData().add(new XYChart.Data(1, 229.2));
        series2.getData().add(new XYChart.Data(2, 37.6));
        series2.getData().add(new XYChart.Data(3, 49.8));
        series2.getData().add(new XYChart.Data(4, 134));
        series2.getData().add(new XYChart.Data(5, 236.2));
        series2.getData().add(new XYChart.Data(6, 114.1));
        series2.getData().add(new XYChart.Data(7, 323));
        series2.getData().add(new XYChart.Data(8, 29.9));
        series2.getData().add(new XYChart.Data(9, 287.4));
        series2.getData().add(new XYChart.Data(10, 400.4));
 
        
        sc.getData().addAll(series1, series2);
        VBox vbox = new VBox();
        Button stackedAreaGraphScreenButton = new Button("next stat screen");
        stackedAreaGraphScreenButton.setStyle(buttonstyle);
        stackedAreaGraphScreenButton.setOnAction(new EventHandler<ActionEvent>() {            
            @Override
            public void handle(ActionEvent event) {
                StackedAreaGraphScreen stackedAreaGraphScreen = new StackedAreaGraphScreen(primaryStage, buttonstyle);
            }
        });
        vbox.getChildren().addAll(sc, stackedAreaGraphScreenButton);
        Scene scene  = new Scene(vbox, 800, 600);
        stage.setScene(scene);
    }
}
