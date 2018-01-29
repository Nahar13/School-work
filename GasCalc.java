package lab1;

import java.util.Scanner;

public class GasCalc {
/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 1.2 Gas tank
 * This lab will show Gas tank size, use and trip capacity
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt for Gas capacity
		System.out.println("Enter gas capacity");
		double GasCap = input.nextDouble();
		//Prompt for Gas remaining
		System.out.println("Enter gas remaining?");
		double GasLeft = input.nextDouble();
		//Prompt for Miles driven
		System.out.println("Miles driven?");
		double MilesDriven = input.nextDouble();
		/*GasCap-GasLeft gives GasUsed
		 *MilesDriven divided by GasUsed gives MPG
		 *MPG times GasCap gives Range
		 */
		double GasUsed = (GasCap-GasLeft);
		double Mpg = (MilesDriven/GasUsed);
		double Range = (Mpg*GasCap);
		System.out.println("This vehicle gets " +Mpg+ " miles per gallon");
		System.out.println("This vehicle can go " +Range+ " miles");
	}

}
