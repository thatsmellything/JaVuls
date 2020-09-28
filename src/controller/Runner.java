package controller;


import testFiles.BruteCrack;
import view.*;

public class Runner{
	public static void main(String[] args)
	{
		
		System.out.println("657F8B8DA628EF83CF69101B6817150A");
		String stringlad =  "657F8B8DA628EF83CF69101B6817150A";
		String crackboi = BruteCrack.test(stringlad);
		System.out.println(crackboi);
		
		JFX app = new JFX();
		app.main(args);
	}

	

}
