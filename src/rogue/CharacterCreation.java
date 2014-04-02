package rogue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CharacterCreation {
    public Stage primaryStage;
    public String buttonstyle;
    public TextField textField; // made public so the actionHandler can access it
    
    public CharacterCreation(Stage stage, String style){
        this.primaryStage = stage;
        this.buttonstyle = style;
        BorderPane gamestack = new BorderPane();
        Scene characterCreation = new Scene(gamestack, 800,600);
        String image = CharacterCreation.class.getResource("bg3.jpg").toExternalForm();
        gamestack.setStyle("-fx-background-image: url('" + image + "'); -fx-background-position: center center; -fx-background-repeat: stretch;");          		        
         
        stage.setScene(characterCreation);
        
        final ToggleGroup group1 = new ToggleGroup();
        
        Label text1 = new Label("Class: ");
        text1.setTextFill(Color.web("#ffffff"));
        
        ToggleButton tb1 = new ToggleButton("Fighter");
        tb1.setStyle(buttonstyle);
        tb1.setToggleGroup(group1);
        tb1.setSelected(true);

        ToggleButton tb2 = new ToggleButton("Thief");
        tb2.setStyle(buttonstyle);
        tb2.setToggleGroup(group1);

        ToggleButton tb3 = new ToggleButton("Cleric");
        tb3.setStyle(buttonstyle);
        tb3.setToggleGroup(group1);
        
        ToggleButton tb4 = new ToggleButton("Wizard");
        tb4.setStyle(buttonstyle);
        tb4.setToggleGroup(group1);
        
        ToggleButton tb10 = new ToggleButton("Assassin");
        tb10.setStyle(buttonstyle);
        tb10.setToggleGroup(group1);
        
        ToggleButton tb11 = new ToggleButton("Knight");
        tb11.setStyle(buttonstyle);
        tb11.setToggleGroup(group1);        
               
        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(text1, tb1, tb2, tb3, tb4, tb10, tb11);
        
        
        final ToggleGroup group2 = new ToggleGroup();
        
        Label text2 = new Label("Gender: ");
        text2.setTextFill(Color.web("#ffffff"));
        
        ToggleButton tb5 = new ToggleButton("Male");
        tb5.setStyle(buttonstyle);
        tb5.setToggleGroup(group2);
        tb5.setSelected(true);
        
        ToggleButton tb6 = new ToggleButton("Female");
        tb6.setStyle(buttonstyle);      
        tb6.setToggleGroup(group2);
        
        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(text2, tb5, tb6);
        
        final ToggleGroup group3 = new ToggleGroup();
        
        Label text3 = new Label("Age: ");
        text3.setTextFill(Color.web("#ffffff"));
        
        ToggleButton tb7 = new ToggleButton("Young");
        tb7.setStyle(buttonstyle);
        tb7.setToggleGroup(group3);
        tb7.setSelected(true);
        
        ToggleButton tb8 = new ToggleButton("Adult");
        tb8.setStyle(buttonstyle);      
        tb8.setToggleGroup(group3);
 
        ToggleButton tb9 = new ToggleButton("Old");
        tb9.setStyle(buttonstyle);      
        tb9.setToggleGroup(group3);
        
        HBox hbox3 = new HBox();
        hbox3.getChildren().addAll(text3, tb7, tb8, tb9);       
  
        final ToggleGroup group4 = new ToggleGroup();
        
        Label text5 = new Label("Race: ");
        text5.setTextFill(Color.web("#ffffff"));
        
        ToggleButton tb12 = new ToggleButton("Human");
        tb12.setStyle(buttonstyle);
        tb12.setToggleGroup(group4);
        tb12.setSelected(true);
        
        ToggleButton tb13 = new ToggleButton("Wood Elf");
        tb13.setStyle(buttonstyle);      
        tb13.setToggleGroup(group4);
 
        ToggleButton tb14 = new ToggleButton("Dwarf");
        tb14.setStyle(buttonstyle);      
        tb14.setToggleGroup(group4); 

        ToggleButton tb15 = new ToggleButton("Halfling");
        tb15.setStyle(buttonstyle);      
        tb15.setToggleGroup(group4);

        ToggleButton tb16 = new ToggleButton("Half Elf");
        tb16.setStyle(buttonstyle);      
        tb16.setToggleGroup(group4);        
        
        HBox hbox5 = new HBox();
        hbox5.getChildren().addAll(text5, tb12, tb13, tb14, tb15, tb16);
        
        Label text4 = new Label("Name:");
        textField = new TextField();
        text4.setTextFill(Color.web("#ffffff"));
        
        HBox hbox4 = new HBox();
        hbox4.getChildren().addAll(text4, textField);
        hbox4.setSpacing(10);
        
        
        Button makeCharacterButton = new Button("Make Character!");
        makeCharacterButton.setStyle(buttonstyle);
        makeCharacterButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Time to Die!!");
                if(textField.getText().isEmpty()){
                    textField.setText("Douchebag");
                }
                MercenaryTown mercentaryTown = new MercenaryTown(primaryStage, buttonstyle);
            }
        });
        HBox hbox6 = new HBox();
        hbox6.getChildren().add(makeCharacterButton);
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(hbox1, hbox2, hbox3, hbox5, hbox4, hbox6);
        
        gamestack.setCenter(vbox);
        
    }
}
