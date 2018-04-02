package lab1;

import java.util.Scanner;

public class MathLesson {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		//Switch menu to chose type of problem
		System.out.print("Choose your math problem! \n"
				+ "For addition enter 1 \n"
				+ "For Subtraction enter 2 \n"
				+ "For Multiplication enter 3 \n"
				+ "For Division enter 4 \n"
				+ "To exit enter 5");
		int menu = input.nextInt();
		
		int number1 = (int) (Math.random()*9+1);
		int number2 = (int) (Math.random()*9+1);
		int temp = 0;
		
		switch (menu) {
		
		
		case 1: // Addition 
		System.out.println(number1 + " + " + number2 + " = ");
		int userInput1 = input.nextInt();
		if (userInput1 == (number1+number2)) {
			System.out.println("Correct!");
		}else 
			System.out.println("Incorrect. The correct answer is " + (number1+number2) + ".");
		break;
		
		case 2: //Subtraction
		if (number1<number2) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		System.out.println(number1 + " - " + number2 + " = ");
		int userInput2 = input.nextInt();
		if (userInput2 == (number1-number2)) {
			System.out.println("Correct!");
		}else 
			System.out.println("Incorrect. The correct answer is " + (number1-number2) + ".");
		break;
		
		case 3: //Multiplication
		System.out.println(number1 + " * " + number2 + " = ");
		int userInput3 = input.nextInt();
		if (userInput3 == (number1*number2)) {
			System.out.println("Correct!");
		}else 
			System.out.println("Incorrect. The correct answer is " + (number1*number2) + ".");
		break;
			
		case 4: //Division
		if (number2 > number1) {
			temp = number1; 
			number1 = number2; 
			number2 = temp;
		}
		System.out.println(number1 + " / " + number2 + " = ");
		int userInput4 = input.nextInt();
		if (userInput4 == (number1/number2)) {
			System.out.println("Correct!");
		}else 
			System.out.println("Incorrect. The correct answer is " + (number1/number2) + ".");
		break;
		
		case 5: //Exit
			System.out.println("Goodbye!");
		break;
		
		default:
			System.out.println("Invalid selection.");
		
		
		}
	}
}



