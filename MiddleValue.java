package lab1;
/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 3.4 Middle Value
 * This lab will find the middle value of three non identical variables
 */

import java.util.Scanner;

public class MiddleValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	//Prompt for three Values
		System.out.println("Enter variable A");
		int varA = input.nextInt();
		System.out.println("Enter Variable B");
		int varB = input.nextInt();
		System.out.println("Enter Variable C");
		int varC = input.nextInt();
		
		//Output the middle value
		if (varA > varB) {
			if (varB > varC) {
				System.out.println(varB + " is the middle value");
				if (varA > varC) {
					System.out.println(varC + " is the middle value");
				
				
					System.out.println(varA + "is the middle value");
			}
				
			}
		}
	}

}
