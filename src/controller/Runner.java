package controller;


import testFiles.BruteCrack;
import view.*;

public class Runner{
	public static void main(String[] args)
	{

		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("a");
		String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
		//String crackboi = BruteCrack.test(stringlad);
		//System.out.println(crackboi);
		
		JFX app = new JFX();
		app.main(args);
	}

	

}
