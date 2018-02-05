package lab1;
/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 2.2
 * This lab will sum the digits of an integer between 0 and 999
 */

import java.util.Scanner;

public class SumTheInteger {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Prompt for Integer
	System.out.println("Give Integer Between 0 and 999");
	int Number = input.nextInt();
		int Number2 = (Number%10);
		int Number3 = (Number/10);
		int Number4 = (Number3%10);
		int Number5 = (Number/100);
		
		System.out.println(Number2+Number4+Number5);
	}

}
