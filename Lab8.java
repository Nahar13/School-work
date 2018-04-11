package lab1;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//variables
		String name;
		String highName;
		int score = 0;
		int highScore = 0;
		
		//Loop for entering student names and score for comparison. Exit with "alldone"
		do {
			System.out.println("Enter student name");
			name = input.next();
			if (name.equals("alldone")) {
				
			}else System.out.println("Enter student score");
				score = input.nextInt();
			if (score > highScore) {
			}	highScore = score;
				highName = name;
			
			}while (!name.equals("alldone") );

		System.out.println("test");
	}

}
