package controller;

import java.util.concurrent.TimeUnit;

public class AddABreak {
	public void addFive()
	{
		try {
		    
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}
	
	public static void addBreak(int s)
	{
		try {
		    
			TimeUnit.SECONDS.sleep(s);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}
	
	

}
