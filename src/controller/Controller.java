package controller;

import view.*;

import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import applications.BruteCrack;
import applications.YourIPLookup;




public class Controller {

	private Frame appFrame;
	
	public Controller()
	{
		appFrame = new Frame(this);
	}
	
	public void start()
	{
		
	
		
	}
	
	private void close()
	{
		System.exit(0);
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public Frame getAppFrame()
	{
		return appFrame;
	}
}
