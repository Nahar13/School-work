package lab1;

import java.util.Scanner;

/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 1.3 Change
 * This lab will show the coins to be given in as change
 */
public class Change {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt for Change
		System.out.println("Enter Change");
		int Change = input.nextInt();
		int Quarters = (Change/25);
		Change %= 25;
		int Dime = (Change/10);
		Change %= 10;
		int Nickel = (Change/5);
		Change %= 5;
		int Pennies = (Change/1);
		
		System.out.println("Quarters= "+Quarters);
		System.out.println("Dimes= "+Dime);
		System.out.println("Nickels= "+Nickel);
		System.out.println("Pennies= "+Pennies);
	}

}
