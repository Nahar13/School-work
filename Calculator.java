package lab1;

import java.util.Scanner;

public class Calculator {
/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 1.1 Run the numbers
 * This lab will add, subtract, multiply and divide
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt for X
		System.out.println("Enter X value ");
		double X = input.nextDouble();
		//Prompt for Y
		System.out.println("Enter Y value ");
		double Y = input.nextDouble();
		// Addition code
		double Add = (X+Y);
		System.out.println("Sum= "+Add);
		// Subtraction code
		double Subtraction = (X-Y);
		System.out.println("Subtraction= " +Subtraction);
		// Multiplication code
		double Multiply = (X*Y);
		System.out.println("Multiplcation= "+Multiply);
		// Average code
		double Avg = (X/Y);
		System.out.println("Average= "+Avg);
	}

}
