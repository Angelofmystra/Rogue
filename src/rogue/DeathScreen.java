/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rogue;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author bertrandbrompton
 */
public class DeathScreen {
    Stage primaryStage;
    String buttonstyle;
    
    DeathScreen(Stage stage, String buttonstyle){
        this.primaryStage = stage;
        this.buttonstyle = buttonstyle;
        BorderPane gamestack = new BorderPane();
        Scene deathScreen = new Scene(gamestack, 800,600);
        String image = CharacterCreation.class.getResource("bg4.jpg").toExternalForm();
        gamestack.setStyle("-fx-background-image: url('" + image + "'); -fx-background-position: center center; -fx-background-repeat: stretch;");          		        
        
        Label label = new Label("See you in Hell");
        label.setTextFill(Color.web("#ffffff"));
        label.setAlignment(Pos.CENTER);
        label.setStyle("font-size:250%");
        gamestack.setCenter(label);
        
        stage.setScene(deathScreen);    
    }    
}
