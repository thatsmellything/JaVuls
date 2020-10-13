package controller;


import java.util.concurrent.ThreadLocalRandom;

import testFiles.*;
import view.*;

public class Runner{
	public static void main(String[] args)
	{
		Thread startGUI = new Thread(new Runnable() {
			public void run() {
				JFX app = new JFX();
				app.main(args);
			}
		});
		System.out.println("How far will it copy?");
		startGUI.start();
		
		
		//int unboundedRandomValue = ThreadLocalRandom.current().nextInt();
		//System.out.println(unboundedRandomValue);
		//testBruteForce();
		
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
		Thread test2 = new Thread(new Runnable() {
			public void run() {
				String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
				String crackboi = BruteCrack.test(stringlad);
				System.out.println(crackboi);
			}
		});
		test2.start();
		Thread test3 = new Thread(new Runnable() {
			public void run() {
				String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
				String crackboi = BruteCrack.test(stringlad);
				System.out.println(crackboi);
			}
		});
		test3.start();
		Thread test4 = new Thread(new Runnable() {
			public void run() {
				String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
				String crackboi = BruteCrack.test(stringlad);
				System.out.println(crackboi);
			}
		});
		test4.start();
		Thread test5 = new Thread(new Runnable() {
			public void run() {
				String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
				String crackboi = BruteCrack.test(stringlad);
				System.out.println(crackboi);
			}
		});
		test5.start();
		Thread test6 = new Thread(new Runnable() {
			public void run() {
				String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
				String crackboi = BruteCrack.test(stringlad);
				System.out.println(crackboi);
			}
		});
		test6.start();
		Thread test7 = new Thread(new Runnable() {
			public void run() {
				String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
				String crackboi = BruteCrack.test(stringlad);
				System.out.println(crackboi);
			}
		});
		test7.start();

		
		
		
		
	}
	public static void testHttpServer()
	{
		
		//BasicHttpServerExample.main(args);
	}

	

}
