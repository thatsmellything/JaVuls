package view;

import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;

import applications.PortScanner;
import applications.ShowProperties;
import applications.WindowsCommandLineIPandPing;
import applications.YourIPLookup;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
				
				//Create texts and clear button
				Text outputText = new Text();
				outputText.setText("JaVuls");
				Button clearButton = new Button("Clear Text");
				
				//Create labels
				Label localInformation = new Label("Local Information Gathering");
				Label FInformation = new Label("Foreign IP Scanning Tools");
				
				
				//Strings needed to make life easier
				String newLine = "\n";
				
				
				
				//create buttons for local machine
				Button localOSButton = new Button("System OS");
				Button localInfoButton = new Button("System Information");
				Button localArchButton = new Button("System Architecture");
				Button localPortScannerButton = new Button("Local Port Scanner");
				Button localARPButton = new Button("Local ARP Scan");
				
				//Create textfield for foreign IP
				TextField FIP = new TextField();
				FIP.setText("Input IP or URL here");
				
				
				//create buttons for foreign machines
				Button FPortScannerButton = new Button("IP Port Scanner");
				
				
				
				
				//Create a scrollable view for output text
				final ScrollPane textScroll = new ScrollPane();
				textScroll.setPrefSize(512, 360);
				textScroll.setContent(outputText);
				
				
				//create new VBox || for system info buttons
				VBox VBoxFSysInfoButtons = new VBox();
				VBoxFSysInfoButtons.setSpacing(10);//Amount of space inbetween each node in the vbox
				ObservableList list = VBoxFSysInfoButtons.getChildren(); //retrieving the observable list of the VBox 
				list.addAll(FInformation, FIP, FPortScannerButton);
				
				//create VBox for text space and the clear button
				VBox VBoxTextAndClear = new VBox();
				VBoxFSysInfoButtons.setSpacing(10);//Amount of space inbetween each node in the vbox
				ObservableList list3 = VBoxTextAndClear.getChildren(); //retrieving the observable list of the VBox 
				list.addAll(textScroll, clearButton);
				
				
					//create new VBox || for system info buttons
					VBox VBoxSysInfoButtons = new VBox();
					VBoxSysInfoButtons.setSpacing(10);//Amount of space inbetween each node in the vbox
					ObservableList list2 = VBoxSysInfoButtons.getChildren(); //retrieving the observable list of the VBox 
					list2.addAll(localInformation, localOSButton, localInfoButton, localArchButton, localPortScannerButton, localARPButton);//Adding all the nodes to the observable list 

					      
					    //Cretae an HBox to hold multiple vboxes
							HBox HBoxSurround = new HBox();
							HBoxSurround.setSpacing(10);
							ObservableList listH = HBoxSurround.getChildren();
							listH.addAll(VBoxFSysInfoButtons, VBoxSysInfoButtons, VBoxTextAndClear);
							
							
					//create a group so you can center it in the screen
					Group group = new Group(HBoxSurround);
				
				//Add it to the pane and boom gottem	
				pane.getChildren().addAll(group);
				
				//Sets the scene and the title 
				//(which is the little thing that shows up at the top of applications)
				Scene scene = new Scene(pane, 1024, 720);
				primaryStage.setTitle("JaVuls");
				primaryStage.setScene(scene);
				
				//Makes the stage and GUI actually show up on the screen
				primaryStage.show();
		
				
				//create listeners for buttons
				clearButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	
				    	outputText.setText(outputText.getText());
				        outputText.setText("Cleared Text");
				    }
				});
				
				localOSButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	
				    	outputText.setText(outputText.getText());
				        outputText.setText(outputText.getText()  + newLine + ShowProperties.getOperatingSystem() + newLine);
				    }
				});
		
				
				localInfoButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				        outputText.setText(outputText.getText() + newLine + ShowProperties.getSystemInformation() + newLine);
				    }
				});
				
				localArchButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				        outputText.setText(outputText.getText() + newLine + ShowProperties.getOperatingSystemArchitecture() + newLine);
				    }
				});
				
				localARPButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				        outputText.setText(outputText.getText() + newLine + WindowsCommandLineIPandPing.windowsARP() + newLine);
				    }
				});
				
				localPortScannerButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				        try {
							outputText.setText(outputText.getText() + newLine + PortScanner.localPortScan() + newLine);
						} catch (UnknownHostException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ExecutionException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				    }
				});
				
				FPortScannerButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				        try {
							outputText.setText(outputText.getText() + newLine + PortScanner.foreignPortScan(FIP.getText()) + newLine);
						} catch (UnknownHostException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ExecutionException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				    }
				});
				
				
		
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
