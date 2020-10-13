package controller;


import java.io.IOException;
import java.net.*;
import java.util.concurrent.ThreadLocalRandom;

import testFiles.*;
import view.*;
import applications.*;

public class Runner{
	public static void main(String[] args) throws UnknownHostException, MalformedURLException
	{
		Thread startGUI = new Thread(new Runnable() {
			public void run() {
				JFX app = new JFX();
				app.main(args);
			}
		});
		startGUI.start();
		
		
		//JFX app = new JFX();
		//app.main(args);
	}
	public static void testBruteForce()
	{
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("a");
		String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
		String crackboi = BruteCrack.test(stringlad);
		System.out.println(crackboi);
		
		
		Thread test1 = new Thread(new Runnable() {
			public void run() {
				String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
				String crackboi = BruteCrack.test(stringlad);
				System.out.println(crackboi);
			}
		});
		test1.start();
	}
	public static void testHttpServer()
	{
		
		//BasicHttpServerExample.main(args);
	}
	public static void testPing() throws UnknownHostException, MalformedURLException
	{
		
		String url = "http://judkinscustomtaxidermy.com";
        
        
        InetAddress address = InetAddress.getByName(new URL(url).getHost());
        String ip = address.getHostAddress();
        System.out.println(ip);
		
		HttpURLConnection connection = null;

	    try {

	        URL u = new URL("http://www.google.com/");
	        

	        connection = (HttpURLConnection) u.openConnection();

	        connection.setRequestMethod("HEAD");

	        int code = connection.getResponseCode();
	        System.out.println(connection.getURL());
	        System.out.println(connection.getRequestProperties());

	        System.out.println("" + code);

	        // You can determine on HTTP return code received. 200 is success.

	    } catch (MalformedURLException e) {

	        // TODO Auto-generated catch block

	        e.printStackTrace();

	    } catch (IOException e) {

	        // TODO Auto-generated catch block

	        e.printStackTrace();

	    } finally {

	        if (connection != null) {

	            connection.disconnect();

	        }

	    }
	}

	

}
