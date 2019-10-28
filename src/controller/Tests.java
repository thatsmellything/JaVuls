package controller;

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
			}
		
	}
}
