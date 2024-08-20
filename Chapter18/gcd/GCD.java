package gcd;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double a = 0, b = 0;
		
		System.out.print("This code shows you the greatest common denomenator of two numbers.\nWhat is your first number? ");
		a = scan.nextDouble();
		
		System.out.print("What is your second number? ");
		b = scan.nextDouble();
		
		System.out.print("The greatest common denomanator between " + a + " and " + b + " is " + gcd(a, b));
		
	}
	
	public static double gcd(double a, double b) {
		
		
		if (a % b == 0) {
			
			return b;
		
		} else {
			
			return gcd(b, a % b);
					
		}
	}

}
