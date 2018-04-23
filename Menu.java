package lab1;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//Array for Item names
		String [] itemname = {"Soup", "Wings", "Burger","Chicken sandwich", "Fries", "Pie", "Ice cream", "Soft drink", "Coffee"};
		//Array for Item Prices
		double [] itemprice = {2.50, .15, 4.95, 5.95, 1.99, 2.95, 2.99, 1.50, 1.00};
		
		//Initialize variables personTotal, gradTotal, and partySize
		double personTotal;
		double grandTotal = 0;
		int partySize = 0;
		
		//Party size input
		System.out.println("How many people are in the party?");
		partySize = input.nextInt();
		
		//Loop to get everyones total
		for (int i = 0; i < partySize; i++) {
			
			//Select discount type here
			System.out.print("Which age group is the customer in? \n"
					+"5 years old or younger? Enter 1 \n"
					+"13 to 18 years old? Enter 2 \n"
					+"65 or older? Enter 3 \n"
					+"Not any previous group? Enter 4 \n");
			int discountType = input.nextInt();
			//reset personTotal
			personTotal = 0;
			
				
				//For loop to get individual orders
				for (int x = 1; x < 4; x++) {
					System.out.println("Item ordered number" + x);
					System.out.print("For " + itemname[0] + " enter 1 \n"
							+"For " + itemname[1] + " enter 2 \n"
							+"For " + itemname[2] + " enter 3 \n"
							+"For " + itemname[3] + " enter 4 \n"
							+"For " + itemname[4] + " enter 5 \n"
							+"For " + itemname[5] + " enter 6 \n"
							+"For " + itemname[6] + " enter 7 \n"
							+"For " + itemname[7] + " enter 8 \n"
							+"For " + itemname[8] + " enter 9 \n");
					int menu = input.nextInt();
					
					//Menu item switch
					switch (menu) {
					
					case 1://soup
						personTotal = (personTotal + itemprice[0]);	
					break;
					
					case 2://wings. need to ask how many
						System.out.println("How many?");
						int wingNumber =input.nextInt();
						personTotal = (personTotal + (itemprice[1] * wingNumber));
					break;
					
					case 3://burger
						personTotal = (personTotal + itemprice[2]);
					break;
					
					case 4://chicken sandwich
						personTotal = (personTotal + itemprice[3]);
					break;
					
					case 5://Fries
						personTotal = (personTotal + itemprice[4]);
					break;
					
					case 6://Pie
						personTotal = (personTotal + itemprice[5]);
					break;
					
					case 7://Ice cream
						personTotal = (personTotal + itemprice[6]);
					break;
					
					case 8://Soft drink
						personTotal = (personTotal + itemprice[7]);
					break;
					
					case 9://coffee
						personTotal = (personTotal + itemprice[8]);
					break;
					
					default:
						System.out.println("Invalid selection.");
						x--;
					break;
					
					}		
				}
				switch (discountType) {
				
				case 1:// 5 or under
					personTotal = 0;
				break;
				
				case 2://teen. 25% off, no tax
					personTotal = (personTotal * .75);
				break;
				
				case 3://senior citizen. 25% off, no tax
					personTotal = (personTotal * .75);
				break;
				
				case 4://regular customer. 5% tax
					personTotal = (personTotal + (personTotal * .05));
				break;
				
				}
				grandTotal = grandTotal + personTotal;
				System.out.println(String.format("This person's total is $" + "%.2f", personTotal ));
				System.out.println("----------------------------");
		}
		System.out.println(String.format("The final total is $" + "%2.2f" + grandTotal));
	}
}

