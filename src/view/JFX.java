package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JFX extends Application{
	
	
	
	public void start(Stage primaryStage)
	{
		
		
		//Create the gridpane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		
		//Set title for the stage
		primaryStage.setTitle("JaVuls");
		
		//Create the scene
		Scene primaryScene = new Scene(pane, 500, 500);
		
				//Create the buttons needed
				Button IPLookup = new Button("Scan IP Address");
				Button ScanIPPorts = new Button("Scan IP Ports");
					//Add buttons to grid pane
					pane.add(IPLookup, 0, 1, 1, 1);
				
				//Create the textFields needed
				TextField IPAddress = new TextField();
					//add textFields to grid pane
					pane.add(IPAddress, 0, 0, 1, 1);
					
		//Show the stage and jazz
		primaryStage.setScene(primaryScene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
