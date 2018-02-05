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
		
		//Prompt for Celsius.
		System.out.println("Temperature?");
		double Celsius = input.nextDouble();
		// Conversion Formula
		double Fahrenheit = ((9.0/5.0) * Celsius + 32);
		System.out.println("The temperature is "+Fahrenheit);
		

	}

}
