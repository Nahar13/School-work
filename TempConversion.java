package lab1;

import java.util.Scanner;

/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 2.1 Temperature Conversion
 * This lab will give Temperature in Celsius based on Fahrenheit entered
 * and vice versa
 */

public class TempConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt for Celsius to Fahrenheit or Fahrenheit Celsius
		System.out.print("Enter 1 for Celsius to Fahrenheit or 2 for Fahrenheit Celsius");
		int formula = input.nextInt();
		
		//Switch to determine formula
		switch (formula) {
		case  1://Prompt for Celsius.
			System.out.println("Temperature?");
			double c = input.nextDouble();
			
			// Conversion Formula for Celsius to Fahrenheit
			double f = ((9.0/5.0) * c + 32);
			System.out.println("The temperature is "+ f +"degrees fahrenheit.");
			break;
			
		case 2://Prompt for fahrenheit
			System.out.println("Temperature?");
			f = input.nextDouble();
			
			//Conversion formula for fahrenheit
			c = (5.0/9) *(f - 32);
			System.out.println("The temperature is "+ c + " degrees celsius.");
			break;
			
		default: //Response for invalid input
			System.out.println("Invalid response");
		}		
		
		//Method for C to F
		public static double celsius(double c) {
			double f = ((9.0/5.0) * c + 32);
			System.out.println("The temperature is "+ f +"degrees fahrenheit.");
		}	
		//Method for F to C
		public static double fahrenheit(double f) {
			c = (5.0/9) *(f - 32);
			System.out.println("The temperature is "+ c + " degrees celsius.");
		}
		
	}

}
