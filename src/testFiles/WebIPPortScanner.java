package testFiles;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import view.JFX;

public class WebIPPortScanner implements Runnable
{
	
	public static String WebIPPortScannerTest(String ipOfSearch)
	{
		StringBuilder str = new StringBuilder("Open Ports on " + ipOfSearch + ":");
		
	for( int current = 78; current <= 81; current++ ) {
		try {
			Socket s = new Socket();
			s.connect( new InetSocketAddress( ipOfSearch, current )); //attempt a connection
			s.close();
			
			//System.out.println(( "Open port: " + current + System.lineSeparator() ));
			str.append(current + System.lineSeparator());
		}
		catch( IOException ioe ) { //connection failed
			System.out.println("connection failed");
			}
		}
	
	String stringFinal = str.toString();
	return stringFinal;
	
	
	
	
	}
	@Override
	public void run() {
StringBuilder str = new StringBuilder("Open Ports on " + FIP.getText() + ":");
		
		for( int current = 78; current <= 81; current++ ) {
			try {
				Socket s = new Socket();
				s.connect( new InetSocketAddress( ip, current )); //attempt a connection
				s.close();
				
				//System.out.println(( "Open port: " + current + System.lineSeparator() ));
				str.append(current + System.lineSeparator());
			}
			catch( IOException ioe ) { //connection failed
				System.out.println("connection failed");
				}
			}
		
		String stringFinal = str.toString();
		
		
	}
	
}



	

