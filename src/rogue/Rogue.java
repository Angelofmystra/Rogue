package rogue;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Rogue extends Application {
    String buttonStyle = "-fx-padding: 12 30 12 30; -fx-focus-color: firebrick;";
    Stage stage;
    @Override
    public void start(Stage primaryStage) {
        
        stage = primaryStage;
        Button newGameButton = new Button();
        newGameButton.setText("New Game");
        newGameButton.setStyle(buttonStyle);
        
        Button loadGameButton = new Button();
        loadGameButton.setText("Load Game");
        loadGameButton.setStyle(buttonStyle);
        
        Button worldBuilderButton = new Button();
        worldBuilderButton.setText("World Builder");
        worldBuilderButton.setStyle(buttonStyle);
        
        Button optionsButton = new Button();
        optionsButton.setText("Options");
        optionsButton.setStyle(buttonStyle);
        
        Button quitButton = new Button();
        quitButton.setText("Quit");
        quitButton.setStyle(buttonStyle);
            
        optionsButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Options!");
            }
        });        
        newGameButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                CharacterCreation characterCreation = new CharacterCreation(stage, buttonStyle);
                
            }
        });
        loadGameButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Load Game!");
            }
        });
        worldBuilderButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("World Builder!");
            }
        });
        quitButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("There is No Escape!");
            }
        });        

        BorderPane root = new BorderPane();
        String image = Rogue.class.getResource("bg1.jpg").toExternalForm();
        root.setStyle("-fx-background-image: url('" + image + "'); -fx-background-position: center center; -fx-background-repeat: stretch;");          		        
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(newGameButton, loadGameButton, worldBuilderButton, optionsButton, quitButton);

        root.setLeft(vbox);
        Scene scene = new Scene(root, 800, 600);
        
        stage.setTitle("Haeckel Rogue");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
