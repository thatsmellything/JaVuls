package JavulsOriginal;

public class YourIPLookup {
	// static String LocalIP = getIpAddress(null);
	  
	   /* public static String getLocalIP() throws UnknownHostException
	    {
	        InetAddress inetAddress = InetAddress.getLocalHost();
	        System.out.println("IP Address:- " + inetAddress.getHostAddress());
	        System.out.println("Host Name:- " + inetAddress.getHostName());
	        return LocalIP;
	    }
	    */
	    
	    
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
	    

}
