package view;

import applications.ShowProperties;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class JFX extends Application{
	
	
	@Override
	public void start(Stage primaryStage)
	{
		/*
		
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
		
		*/
		//Creates the Pane for the GUI
				StackPane pane = new StackPane();
				
				
				
				//Creates the texts, changes the color and adds the text to the screen
					//Hello portion
				/*	
				Text helloText = new Text();
					helloText.setText("Hello ");
					helloText.setFill(Color.BLUE);
					//World portion
					Text worldText = new Text();
					worldText.setText("World!");
					worldText.setFill(Color.DARKORANGE);
					//Add the texts to the screen
				*/	
				
				//Create texts
				Text outputText = new Text();
				outputText.setText(null);
				
				//create buttons
				Button systemOSButton = new Button("System OS");
				Button systemInfoButton = new Button("System Information");
						
					
				//Create a scrollable view for output text
				final ScrollPane textScroll = new ScrollPane();
				textScroll.setVmax(100);
				textScroll.setHmax(200);
				textScroll.setPrefSize(50, 50);
				textScroll.setContent(outputText);
				
					//create new button flow thingy so that text doesnt puch the buttons
					VBox VBoxAlignment = new VBox();
						//Amount of space inbetween each node in the vbox
						VBoxAlignment.setSpacing(10);

					      
					      //retrieving the observable list of the VBox 
					      ObservableList list = VBoxAlignment.getChildren(); 
					      
					      //Adding all the nodes to the observable list 
					      list.addAll(systemOSButton, systemInfoButton, textScroll);

					//create a group so you can center it in the screen
					Group group = new Group(VBoxAlignment);
				
				//Add it to the pane and boom gottem	
				pane.getChildren().addAll(group);
				
				//Sets the scene and the title 
				//(which is the little thing that shows up at the top of applications)
				Scene scene = new Scene(pane, 600, 400);
				primaryStage.setTitle("JaVuls");
				primaryStage.setScene(scene);
				
				//Makes the stage and GUI actually show up on the screen
				primaryStage.show();
		
				
				//create listeners for buttons
				systemOSButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				        outputText.setText(ShowProperties.getOperatingSystem());
				    }
				});
		
				
				systemInfoButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				        outputText.setText(ShowProperties.getSystemInformation());
				    }
				});
		
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
