/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rogue;

import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author bertrandbrompton
 */
class StatsScreen {
    Stage primaryStage;
    String buttonstyle;
    
    StatsScreen(Stage stage, String style){
        this.primaryStage = stage;
        this.buttonstyle = style;
        AnchorPane gamestack = new AnchorPane();
        Scene screen = new Scene(gamestack, 800,600);
        String image = CharacterCreation.class.getResource("bg6.jpg").toExternalForm();
        gamestack.setStyle("-fx-background-image: url('" + image + "'); -fx-background-position: center center; -fx-background-repeat: stretch;");          		        
        
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final StackedBarChart<String,Number> bc = new StackedBarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Kill Summary");
        xAxis.setLabel("Mobs");
        xAxis.setCategories(FXCollections.<String>observableArrayList(
                Arrays.asList("orc", "goblin", "human", "zombie", "kobold")));
        
        XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        series1.setName("level 1");       
        series1.getData().add(new XYChart.Data<String, Number>("orc", 100));
        series1.getData().add(new XYChart.Data<String, Number>("goblin", 300));
        series1.getData().add(new XYChart.Data<String, Number>("human", 30));
        series1.getData().add(new XYChart.Data<String, Number>("zombie", 80));
        series1.getData().add(new XYChart.Data<String, Number>("kobold", 240));

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        series2.setName("level 2");       
        series2.getData().add(new XYChart.Data<String, Number>("orc", 100));
        series2.getData().add(new XYChart.Data<String, Number>("goblin", 300));
        series2.getData().add(new XYChart.Data<String, Number>("human", 30));
        series2.getData().add(new XYChart.Data<String, Number>("zombie", 80));
        series2.getData().add(new XYChart.Data<String, Number>("kobold", 240));
    // @TODO: modify bars such that the corners are no longer rounded in the center (at the top might be ok) since it looks shabby    
        XYChart.Series<String, Number> series3 = new XYChart.Series<String, Number>();
        series3.setName("level 3");       
        series3.getData().add(new XYChart.Data<String, Number>("orc", 100));
        series3.getData().add(new XYChart.Data<String, Number>("goblin", 300));
        series3.getData().add(new XYChart.Data<String, Number>("human", 30));
        series3.getData().add(new XYChart.Data<String, Number>("zombie", 80));
        series3.getData().add(new XYChart.Data<String, Number>("kobold", 240));        
        
        bc.getData().addAll(series1, series2, series3);
        //bc.setStyle("-fx-text-fill: #4682b4;");
        HBox hbox = new HBox();
        hbox.getChildren().add(bc);
        hbox.setStyle("-fx-background-color: grey");
        gamestack.getChildren().add(hbox);
        
        Button scatterScreenButton = new Button("Stats Screen");
        gamestack.getChildren().add(scatterScreenButton);
        
        scatterScreenButton.setOnAction(new EventHandler<ActionEvent>() {
            
        @Override
        public void handle(ActionEvent event) {
                ScatterChartScreen scatterChartScreen = new ScatterChartScreen(primaryStage, buttonstyle);               
            }
        });
        
        stage.setScene(screen);    
    }     
}
