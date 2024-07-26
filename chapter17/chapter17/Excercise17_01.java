package chapter17;

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Excercise17_01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		PrintWriter output = new PrintWriter("Excercise17_01.txt");
		Random rand = new Random();
		
		for (int i = 0; i < 100; i++) {
			
			output.print(rand.nextInt(9) + " ");
			
		}
		
		output.close();
		
	}

}
