package controller;


import testFiles.*;
import view.*;

public class Runner{
	public static void main(String[] args)
	{




		


		
		JFX app = new JFX();
		app.main(args);
	}
	public static void testBruteForce()
	{
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("a");
		String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
		String crackboi = BruteCrack.test(stringlad);
		System.out.println(crackboi);
	}
	public static void testHttpServer()
	{
		
		BasicHttpServerExample.main(args);
	}

	

}
