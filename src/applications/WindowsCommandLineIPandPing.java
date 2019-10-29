package applications;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WindowsCommandLineIPandPing 
{
	public printOutput getStreamWrapper(InputStream is, String type) 
	{
		return new printOutput(is, type);
	}
	
	
	
	public static void main(String[] args)
	{
		windowsPing();
		

	}
	
	public static void windowsPing()
	{
		Runtime rt = Runtime.getRuntime();
		WindowsCommandLineIPandPing rte = new WindowsCommandLineIPandPing();
		printOutput errorReported, outputMessage;
		
		
		try{
		//Process p = Runtime.getRuntime().exec("ping google.com");
		//Logic that happens with the command line thing in windows
			
		Process proc = rt.exec("ping google.com");
		errorReported = rte.getStreamWrapper(proc.getErrorStream(), "ERROR");
		outputMessage = rte.getStreamWrapper(proc.getInputStream(), "OUTPUT");
		errorReported.start();
		outputMessage.start();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	private class printOutput extends Thread {
		InputStream is = null;
 
		printOutput(InputStream is, String type) {
			this.is = is;
		}
 
		public void run() {
			String s = null;
			try {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(is));
				while ((s = br.readLine()) != null) {
					System.out.println(s);
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
