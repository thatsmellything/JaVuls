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
	
	
	
	public static void main(String[] args) throws IOException
	{
	
	
		Process p = Runtime.getRuntime().exec("cmd /c netstat");
		printOutput errorReported, outputMessage;
	
		//Logic that happens with the command line thing in windows
	
		String s;
		System.out.println(p.getOutputStream());
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
		while((s=stdInput.readLine())!=null)
	{
			System.out.println(s);
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
