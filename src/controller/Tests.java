package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;

import applications.*;

public class Tests 
{

	public static void main(String[] args)
	{
		try {
			
			
			
			
			YourIPLookup.getLocalIP();
			YourIPLookup.viewMyIP();
			WindowsCommandLineIPandPing.windowsPing("8.8.8.8");
			PortScanner.main(YourIPLookup.getLocalIP().toString());
			
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
