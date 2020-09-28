package JavulsOriginal;

import java.awt.Dimension;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class javaFXTester extends Application
{

	@Override
	public void start(Stage primaryStage)
	{
		
		//Create pane
		GridPane pane = new GridPane();
		//pane.setAlignment(Pos.CENTER);
		
		pane.setHgap(5);
		pane.setVgap(5);
		Button test1 = new Button("test1");
		Button test2 = new Button("test2");
		pane.add(test1, 5, 5);
		pane.add(test2, 0, 1);
		
		
		//Create scene
		Scene scene = new Scene(pane, 1024, 768);
		
		
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		System.out.println("HI");
		launch(args);
	}

}
