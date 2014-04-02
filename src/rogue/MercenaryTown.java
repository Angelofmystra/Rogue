package rogue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

class MercenaryTown {
    public Stage primaryStage;
    public String buttonstyle;
    
    MercenaryTown(Stage stage, String style){
        this.primaryStage = stage;
        this.buttonstyle = style;
        BorderPane gamestack = new BorderPane();
        Scene mercenaryTown = new Scene(gamestack, 800,600);
        String image = CharacterCreation.class.getResource("bg5.jpg").toExternalForm();
        gamestack.setStyle("-fx-background-image: url('" + image + "'); -fx-background-position: center center; -fx-background-repeat: stretch;");          		        
        
        GameGrid gameGrid = new GameGrid();
        Label label = new Label("See you in Hell");
        label.setTextFill(Color.web("#ffffff"));
        label.setAlignment(Pos.CENTER);
        label.setStyle("-fx-font: 100px Tahoma;");
        gamestack.setCenter(label);
        
        Button statsScreenButton = new Button("Stats Screen");
        gamestack.setBottom(statsScreenButton);
        
        statsScreenButton.setOnAction(new EventHandler<ActionEvent>() {
            
        @Override
        public void handle(ActionEvent event) {
                StatsScreen statsScreen = new StatsScreen(primaryStage, buttonstyle);               
            }
        });
        
        stage.setScene(mercenaryTown);    
    }
        
}
