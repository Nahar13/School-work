package lab1;

import java.util.Scanner;

/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 2.1 Temperature Conversion
 * This lab will give Temperature in C based on F entered
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
			double celsius = input.nextDouble();
			
			// Conversion Formula for Celsius to Fahrenheit
			double fahrenheit = ((9.0/5.0) * celsius + 32);
			System.out.println("The temperature is "+ fahrenheit +"degrees fahrenheit.");
			break;
			
		case 2://Prompt for fahrenheit
			System.out.println("Temperature?");
			fahrenheit = input.nextDouble();
			
			//Conversion formula for fahrenheit
			celsius = (5.0/9) *(fahrenheit - 32);
			System.out.println("The tepmerature is "+ celsius + " degrees celsius.");
			break;
			
		default: //Response for invalid input
			System.out.println("Invalid response");
		}		

	}

}
