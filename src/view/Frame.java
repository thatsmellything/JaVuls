package view;

import controller.Controller;
import javax.swing.JFrame;

public class Frame extends JFrame{
	
	private Controller appController;
	private Panel appPanel;
	
	
	public Frame(Controller appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new Panel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1024, 768);
		this.setTitle("JaVuls ver 0.0.1");
		this.setResizable(false);
		this.setVisible(true);
	}
	

}
