package view;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

import controller.Controller;
import controller.IOController;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.event.*;
import javax.swing.GroupLayout.*;

import javax.swing.*;

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
		
		//adding things to the panel
		this.add(buttonPanelLeft);
		this.add(URLInput);
		this.add(IPInput);
		this.add(NickName);
		
		//making those things have some structure
		
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
