package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import applications.*;

public class Tests 
{

	public static void main(String[] args)
	{
		//creates a string of the operating system for future useage
		String localOS = ShowProperties.getOperatingSystem();
		
		try {
			
			//Grabs the operating system that the program is running on
			ShowProperties.getOperatingSystem();
			//Gets your local machine IP
			YourIPLookup.getLocalIP();
			YourIPLookup.viewMyIP();
			
			//if machine is on windows it will run the windows version of command line tools
			if (localOS.equals("Windows 10"))
			{
				WindowsCommandLineIPandPing.windowsPing("8.8.8.8");
			
				try {
			    
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException ie) {
					Thread.currentThread().interrupt();
				}
			}
			
			
			//Runs the port scanner
			PortScanner.main(YourIPLookup.getLocalIP().toString());
			
			
			// A bunch of catch clauses for all the possible errors
			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
	}
}
