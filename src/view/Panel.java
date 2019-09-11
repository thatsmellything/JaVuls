package view;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

import controller.Controller;
import controller.IOController;


public class Panel extends JPanel
{

	//Text fields
	private JTextField IPInput;
	private JTextField URLInput;
	private JTextField NickName;
	
	
	//Buttons
	private JButton PortScanner;
	private JButton Pinger;
	private JButton GeoLocator;
	private JButton ArpScan;
	
	
	//Text Areas
	private JTextArea Notes;
	
	//Button Panels
	private JPanel buttonPanelLeft;
	
	//Controllers and panels
	private Controller appController;
	private SpringLayout appLayout;
	
	
	public Panel(Controller appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		
		
		
		
		
		setupLayout();
		setupPanel();
		setupScrollPane();
		setupListeners();
		setupButtonPanelLeft();
	}
	
	public void setupButtonPanelLeft()
	{
		buttonPanelLeft.add(PortScanner);
		buttonPanelLeft.add(Pinger);
		buttonPanelLeft.add(GeoLocator);
		buttonPanelLeft.add(ArpScan);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1024, 768));
	}
	
	private void setupListeners()
	{
		PortScanner.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	
	
	
	
	
	
}
