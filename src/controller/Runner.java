package controller;


import testFiles.BruteCrack;
import view.*;

public class Runner{
	public static void main(String[] args)
	{
<<<<<<< HEAD

		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("a");
		String stringlad =  "900150983CD24FB0D6963F7D28E17F72";
		//String crackboi = BruteCrack.test(stringlad);
		//System.out.println(crackboi);
=======
		
		System.out.println("657F8B8DA628EF83CF69101B6817150A");
		String stringlad =  "657F8B8DA628EF83CF69101B6817150A";
		String crackboi = BruteCrack.test(stringlad);
		System.out.println(crackboi);
>>>>>>> d0a1ad16adac3f192b395fa86bbe01052e9f99a8
		
		JFX app = new JFX();
		app.main(args);
	}

	

}
