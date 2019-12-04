package view;

import java.awt.GraphicsEnvironment;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import applications.IPLookup;
import applications.PortScanner;
import applications.ShowProperties;
import applications.SlowLoris;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import testFiles.OpenCommandPrompt;
import testFiles.*;


public class JFX extends Application{
	
	String FIPTextInString;
	
	@Override
	public void start(Stage primaryStage)
	{
		
		//Creates the Pane for the GUI
				StackPane pane = new StackPane();
				
				
				
				
				//Create texts and clear button
				Text outputText = new Text();
				outputText.setText("JaVuls");
				Button clearButton = new Button("Clear Text");
				
				
				//Create labels
				Label localInformation = new Label("Local Information Gathering");
				Label FInformation = new Label("Foreign IP Scanning Tools");
				Label threadLabel = new Label("Number of threads");
				Label portLabel = new Label("Port to attack");
				Label timeLabel = new Label("Time for attack");
				Label windowsToolsLabel = new Label("Windows Tools");
				Label linuxToolsLabel = new Label("Linux Tools");
				
				//Strings needed to make life easier
				String newLine = "\n";
				
				
				
				
				
				
				
				
				//Add image view for animations
				ImageView statusImage = new ImageView();
					//add heigh and width of image view
					statusImage.setFitHeight(200); 
					statusImage.setFitWidth(200); 
			      
					//Setting the preserve ratio of the image view 
					statusImage.setPreserveRatio(true);
				
					
				//set the default image
					Image defaultImage = new Image("jparkhack2.gif");
					Image hackerImageJPark = new Image("jparkhack.gif");
					Image hackerImageCat = new Image("catHacker.gif");
					Image hackerImageCat2 = new Image("cat2.gif");
					statusImage.setImage(defaultImage);
				

					
					
					
					
					
					
					
					
					
					
				//create buttons for local machine
				Button localOSButton = new Button("System OS");
				Button localInfoButton = new Button("System Information");
				Button localIPButton = new Button("Check Local IP");
				Button publicIPButton = new Button("Check Public IP");
				Button localArchButton = new Button("System Architecture");
				Button localPortScannerButton = new Button("Local Port Scanner");
				Button localARPButton = new Button("Local ARP Scan");
				Button localConsoleButton = new Button("Open Console");
				Button localFileExplorerButton = new Button("File Expolorer");
				
				//Create textfield for foreign IP
				TextField FIP = new TextField();
				FIP.setText("Input IP or URL here");

				String FIPtext = FIP.getText();
				
				
				//Create textfield for number of threads allowed
				TextField threadsAllowed = new TextField();
				threadsAllowed.setText("0");
				
				//create textfield for port number
				TextField portSpecified = new TextField();
				portSpecified.setText("80");
				
				//create text field for the time allowed to attack
				
				TextField timeAllowed = new TextField();
				timeAllowed.setText("0");
				
				//create buttons for foreign machines
				Button FPortScannerButton = new Button("IP Port Scanner");
				Button SlowLorisButton = new Button("Slow Loris Attack");
				
				
				
				//Create a scrollable view for output text
				final ScrollPane textScroll = new ScrollPane();
				textScroll.setPrefSize(512, 360);
				textScroll.setContent(outputText);
				
				
				
				
				//Create new HBOX for forgein tools underneath ip addresss bar
				HBox HBoxFTools = new HBox();
				HBoxFTools.setSpacing(10);
				ObservableList FToolsList = HBoxFTools.getChildren(); //retrieving the observable list of the VBox 
				FToolsList.addAll(FPortScannerButton, SlowLorisButton);
				
				//create vbox for threads and thread label
				VBox VBoxThreads = new VBox();
				VBoxThreads.setSpacing(8);
				ObservableList VBoxThreadsList = VBoxThreads.getChildren();
				VBoxThreadsList.addAll(threadLabel, threadsAllowed);
				
				//create vbox for port number and label
				VBox VBoxPort = new VBox();
				VBoxPort.setSpacing(8);
				ObservableList VBoxPortList = VBoxThreads.getChildren();
				VBoxPortList.addAll(portLabel, portSpecified);
				
				//create vbox for time allowed
				VBox VBoxTime = new VBox();
				VBoxTime.setSpacing(8);
				ObservableList VBoxTimeList = VBoxTime.getChildren();
				VBoxTimeList.addAll(timeLabel, timeAllowed);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//create hbox for labels
				HBox HBoxFToolsLabels = new HBox();
				HBoxFToolsLabels.setSpacing(5);
				ObservableList FToolsLabelList = HBoxFToolsLabels.getChildren();
				FToolsLabelList.addAll(VBoxThreads,VBoxTime, VBoxPort, statusImage);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//create new VBox || for system info buttons
				VBox VBoxFSysInfoButtons = new VBox();
				VBoxFSysInfoButtons.setSpacing(10);//Amount of space inbetween each node in the vbox
				ObservableList list = VBoxFSysInfoButtons.getChildren(); //retrieving the observable list of the VBox 
				list.addAll(FInformation, FIP, HBoxFTools, HBoxFToolsLabels);
				
				//create VBox for text space and the clear button
				VBox VBoxTextAndClear = new VBox();
				VBoxFSysInfoButtons.setSpacing(10);//Amount of space inbetween each node in the vbox
				ObservableList list3 = VBoxTextAndClear.getChildren(); //retrieving the observable list of the VBox 
				list.addAll(textScroll, clearButton);
				// outputText.setWrappingWidth(VBoxTextAndClear.getWidth());
				
				
					//create new VBox || for system info buttons
					VBox VBoxSysInfoButtons = new VBox();
					VBoxSysInfoButtons.setSpacing(10);//Amount of space inbetween each node in the vbox
					ObservableList list2 = VBoxSysInfoButtons.getChildren(); //retrieving the observable list of the VBox 
					list2.addAll(localInformation, localOSButton, localInfoButton, localIPButton, publicIPButton, localArchButton, localPortScannerButton, localARPButton, windowsToolsLabel, localConsoleButton, localFileExplorerButton, linuxToolsLabel);//Adding all the nodes to the observable list 

					      
					    //Create an HBox to hold multiple vboxes
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
				
				localIPButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				    	try {
							outputText.setText(outputText.getText() + newLine + YourIPLookup.getLocalIP() + newLine);
						} catch (UnknownHostException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				    }
				});
				
				publicIPButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				    	try {
							outputText.setText(outputText.getText() + newLine + IPLookup.yourPublicIP() + newLine);
						} catch (UnknownHostException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				    }
				});
				
				localArchButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				        outputText.setText(outputText.getText() + newLine + ShowProperties.getOperatingSystemArchitecture() + newLine + "Check console output for more clear text");
				    }
				});
				
				localARPButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				        outputText.setText(outputText.getText() + newLine + WindowsCommandLineIPandPing.windowsARP() + newLine + "Check console output");
				    }
				});
				
				localPortScannerButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	
				    	statusImage.setImage(hackerImageJPark);
				    	outputText.setText(outputText.getText());
				    	outputText.setText(outputText.getText() + "This part of the program functions best when the threads allowed is set to 0. This will let the computer make threads until it no longer needs them and is the optimal way to save memory and still have the best speed. Having too many threads will cause a memory leakage while having too little will cause a slow scan.");
				        try {
							outputText.setText(outputText.getText() + newLine + PortScanner.localPortScan(threadsAllowed.getText()) + newLine);
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
				
				
				
				localConsoleButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	
				    	try
				        {  
				         // We are running "dir" and "ping" command on cmd
				    		String back = "cd \"";
				    		String directory = "cd C:/Windows/System32";
				    		String command = "arp -a";
				         Runtime.getRuntime().exec(new String[] {"cmd.exe", "/k", "start" }); 
				        } 
				        catch (Exception e1) 
				        { 
				            System.out.println("Something broke bud"); 
				            e1.printStackTrace(); 
				        } 
				        
				    }
				});
				
				localFileExplorerButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	
				    	try
				        {  
				         // We are running "dir" and "ping" command on cmd
				    		String back = "..\"";
				    		String command = "arp -a";
				         Runtime.getRuntime().exec(new String[] {"cmd.exe", "/k", "start", back}); 
				        } 
				        catch (Exception e1) 
				        { 
				            System.out.println("Something broke bud"); 
				            e1.printStackTrace(); 
				        } 
				    }
				});
				
				FPortScannerButton.setOnAction(new EventHandler<ActionEvent>() {
					
				    @Override public void handle(ActionEvent e) {
				    	/*
				    	outputText.setText(outputText.getText());
				    	int threads = Integer.parseInt(threadsAllowed.getText());
				    	ExecutorService ex = Executors.newFixedThreadPool(threads);
				    	
				    	Thread t = new Thread(new MyRunnable(FIP.getText()));
				    	t.start();
						//ex.submit(task2);
				    	
				    	
				    	
				    	
					    outputText.setText(outputText.getText() + newLine + WebIPPortScanner.WebIPPortScannerTest(FIP.getText()));
					    t.stop();
					    }
					    */
					
				    	statusImage.setImage(hackerImageJPark);
				    	JOptionPane.showMessageDialog(null, "THIS TOOL IS ONLY TO BE USED ON MACHINES AND APPLICATIONS WITH PERMISSION! Port scanning can be noisey");
					outputText.setText(outputText.getText());
			    	outputText.setText(outputText.getText() + "This part of the program functions best when the threads allowed is set to 0. This will let the computer make threads until it no longer needs them and is the optimal way to save memory and still have the best speed. Having too many threads will cause a memory leakage while having too little will cause a slow scan.");
			        try {
						outputText.setText(outputText.getText() + newLine + PortScanner.foreignPortScan(FIP.getText(), threadsAllowed.getText()) + newLine);
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
				
				
				SlowLorisButton.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    	outputText.setText(outputText.getText());
				    	JOptionPane.showMessageDialog(null, "THIS TOOL IS ONLY TO BE USED ON MACHINES AND APPLICATIONS WITH PERMISSION");
				        outputText.setText(outputText.getText() + "Running slow loris attack on " + FIP.getText() + " on port " + portSpecified.getText() + " with " + threadsAllowed.getText() + " threads for " + timeAllowed.getText() + " time. Please use responsibly and with permission from the owner.");
				        SlowLoris.slowLorisRun(FIP.getText(), portSpecified.getText(), threadsAllowed.getText(), timeAllowed.getText());
				    }
				});
				
				
				
				
		
		
	
	
	
	
	}
	
	
	
	
	/*
	Runnable task2 = new Runnable() {
		@Override
		public void run() {
			StringBuilder str = new StringBuilder("Open Ports on " + FIPTextInString + ":");
			
			for( int current = 78; current <= 81; current++ ) {
				try {
					Socket s = new Socket();
					s.connect( new InetSocketAddress( FIPTextInString, current )); //attempt a connection
					s.close();
					
					//System.out.println(( "Open port: " + current + System.lineSeparator() ));
					str.append(current + System.lineSeparator());
				}
				catch( IOException ioe ) { //connection failed
					System.out.println("connection failed");
					}
				}
			
			String stringFinal = str.toString();
			
		}
};
	*/
	
	
	public static void main(String[] args)
	{
		launch(args);
	}

}



/*

class MyRunnable implements Runnable {
    private String x;
    public MyRunnable(String x) {
       this.x = x;
    }

    public void run() {
    	StringBuilder str = new StringBuilder("Open Ports on " + x + ":");
		
    	for( int current = 0; current <= 20; current++ ) {
    		try {
    			Socket s = new Socket();
    			s.connect( new InetSocketAddress( x, current )); //attempt a connection
    			s.close();
    			
    			//System.out.println(( "Open port: " + current + System.lineSeparator() ));
    			str.append(current + System.lineSeparator());
    		}
    		catch( IOException ioe ) { //connection failed
    			System.out.println("connection failed on " + current);
    			}
    		}
    	
    	String stringFinal = str.toString();
    	
    	
    }
 }


// Thread t = new Thread(new MyRunnable(x));
// t.start();
// }
// }
*/


