/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rogue;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author bertrandbrompton
 */
public class StackedAreaGraphScreen {
    public Stage primaryStage;
    public String buttonstyle;
    
    StackedAreaGraphScreen(Stage stage, String buttonstyle){
        this.primaryStage = stage;
        this.buttonstyle = buttonstyle;
        AnchorPane gamestack = new AnchorPane(); // BORDER PANE SUCKS DICK SINCE IT RESIZES CHARTS - no idea why!!
        Scene deathScreen = new Scene(gamestack, 800,600);
        String image = CharacterCreation.class.getResource("bg7.gif").toExternalForm();
        gamestack.setStyle("-fx-background-image: url('" + image + "'); -fx-background-position: center center; -fx-background-repeat: stretch;");          		        
        
        final NumberAxis xAxis = new NumberAxis(1, 10, 1); //min, max, interval, PROBABLY
        final NumberAxis yAxis = new NumberAxis(0, 500, 100);
        final StackedAreaChart<Number, Number> ac = new StackedAreaChart<Number, Number>(xAxis, yAxis);
        ac.setTitle("Are you improving?");
        
        xAxis.setLabel("Game");                
        yAxis.setLabel("Kills");
        
        XYChart.Series<Number, Number> seriesApril = new XYChart.Series<Number, Number>();
        seriesApril.setName("orcs");
        seriesApril.getData().add(new XYChart.Data(1, 40));
        seriesApril.getData().add(new XYChart.Data(2, 100));
        seriesApril.getData().add(new XYChart.Data(3, 150));
        seriesApril.getData().add(new XYChart.Data(4, 80));
        seriesApril.getData().add(new XYChart.Data(5, 50));
        seriesApril.getData().add(new XYChart.Data(6, 180));
        seriesApril.getData().add(new XYChart.Data(7, 150));
        seriesApril.getData().add(new XYChart.Data(8, 130));
        seriesApril.getData().add(new XYChart.Data(9, 190));
        seriesApril.getData().add(new XYChart.Data(10, 210));
        
        XYChart.Series<Number, Number> seriesMay = new XYChart.Series<Number, Number>();
        seriesMay.setName("goblins");
        seriesMay.getData().add(new XYChart.Data(1, 200));
        seriesMay.getData().add(new XYChart.Data(2, 150));
        seriesMay.getData().add(new XYChart.Data(3, 130));
        seriesMay.getData().add(new XYChart.Data(4, 120));
        seriesMay.getData().add(new XYChart.Data(5, 140));
        seriesMay.getData().add(new XYChart.Data(6, 180));
        seriesMay.getData().add(new XYChart.Data(7, 250));
        seriesMay.getData().add(new XYChart.Data(8, 250));
        seriesMay.getData().add(new XYChart.Data(9, 230));
        seriesMay.getData().add(new XYChart.Data(10, 260));
        
        ac.getData().addAll(seriesApril, seriesMay);
        VBox vbox = new VBox();
        vbox.setStyle("-fx-background-color: grey");
        vbox.getChildren().add(ac);
        gamestack.getChildren().add(vbox);
        stage.setScene(deathScreen);    
    }    
}
