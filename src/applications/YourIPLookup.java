package applications;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class YourIPLookup {
	
	  
	    public static String getLocalIP() throws UnknownHostException
	    {
	        InetAddress inetAddress = InetAddress.getLocalHost();
	        System.out.println("IP Address:- " + inetAddress.getHostAddress());
	        System.out.println("Host Name:- " + inetAddress.getHostName());
	        return inetAddress.toString();
	    }
	    
	    
	    
	    private static String getIpAddress(byte[] rawBytes) {
	        int i = 4;
	        StringBuilder ipAddress = new StringBuilder();
	        for (byte raw : rawBytes) {
	            ipAddress.append(raw & 0xFF);
	            if (--i > 0) {
	                ipAddress.append(".");
	            }
	        }
	        return ipAddress.toString();
	    }
	    

	    public static void main (String[] args) throws UnknownHostException {
			getLocalIP();
		}
	    
}
