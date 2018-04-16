package lab1;

import java.util.Scanner;

/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 2.1 Temperature Conversion
 * This lab will give Temperature in Celsius based on Fahrenheit entered
 * and vice versa
 */

public class TempConversion {

	public static double main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt for Celsius to Fahrenheit or Fahrenheit Celsius
		System.out.print("Enter 1 for Celsius to Fahrenheit or 2 for Fahrenheit Celsius");
		int formula = input.nextInt();
		
		//Switch to determine formula
		switch (formula) {
		case  1://Prompt for Celsius.
			System.out.println("Temperature?");
			double c = input.nextDouble();
			celsius(c);
			
			break;
			
		case 2://Prompt for fahrenheit
			System.out.println("Temperature?");
			double f = input.nextDouble();
			
			//Conversion formula for fahrenheit
			c = (5.0/9) *(f - 32);
			System.out.println("The temperature is "+ c + " degrees celsius.");
			break;
			
		default: //Response for invalid input
			System.out.println("Invalid response");
		}		
		
		//Method for C to F
		public static double celsius (double num1) {
			double f = ((9.0/5.0) * num1 + 32);
			return f;
		}	
		//Method for F to C
		public static double fahrenheit (double num2) {
			double c = (5.0/9) *(num2 - 32);
			return c;
		}
		
	}

}
