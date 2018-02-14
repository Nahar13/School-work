package lab1;

import java.util.Scanner;

/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 3.2 Triangle
 * This lab will show the perimeter of a triangle if Valid
 */
public class Triangle {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Prompt for the sides
	System.out.println("Enter Side A");
	double sideA = input.nextDouble();
	System.out.println("Enter Side B");
	double sideB = input.nextDouble();
	System.out.println("Enter Side C");
	double sideC = input.nextDouble();
	
	if (sideA <= (sideB + sideC)) {
		if (sideB <= sideA + sideC) {
			if (sideC <= sideA + sideB) {
				System.out.println((sideA + sideB + sideC));
			}else System.out.println("Invalid");
		}else System.out.println("Invalid");{
		}
	}else System.out.println("Invalid");
	}
}

