package testFiles;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class WebIPPortScanner 
{
	public static void WebIPPortScannerTest(String ipOfSearch)
	{
		
	for( int current = 79; current <= 65500; current++ ) {
		try {
			Socket s = new Socket();
			s.connect( new InetSocketAddress( ipOfSearch, current )); //attempt a connection
			s.close();
			
			System.out.println(( "Open port: " + current + System.lineSeparator() ));
		}
		catch( IOException ioe ) { //connection failed
			System.out.println("connection failed");
			}
		}
	}
	
}
