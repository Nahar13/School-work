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
		Integer Change = input.nextInt();
		Integer Quarters = (Change/25);
		Integer Change2 = (Change%25);
		Integer Dime = (Change2/10);
		Integer Change3 = (Change2%10);
		Integer Nickel = (Change3/5);
		Integer Change4 = (Change3%5);
		Integer Pennies = (Change4/1);
		
		System.out.println("Quarters= "+Quarters);
		System.out.println("Dimes= "+Dime);
		System.out.println("Nickels= "+Nickel);
		System.out.println("Pennies= "+Pennies);
	}

}
