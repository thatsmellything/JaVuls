package controller;

import java.util.concurrent.TimeUnit;

public class AddABreak {
	public void addFive()
	{
		try {
			System.out.println("Taking 5 second break just you hold up! :)");
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}
	
	public static void addBreak(int s)
	{
		try {
			System.out.println("Taking " + s + "second break just you hold up! :)");
			TimeUnit.SECONDS.sleep(s);
			
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}
	
	

}
