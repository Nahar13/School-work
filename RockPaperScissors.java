package lab1;

import java.util.Scanner;

/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 5.1 ASCII conversion 
 * This lab will play Rock, Paper, Scissors.
 */
public class RockPaperScissors {

	public static void main(String[] args) {
		// Scanner input
		Scanner input = new Scanner(System.in);
		

        int computerWon = 0;
        int userWon = 0;
        int winner = 0;
         
        while (winner < 2) {
         
            int randomInt = 0 + (int)(Math.random() * ((2 - 0) + 1));
         
                // keep track of random numbers
                     
            System.out.print("scissors (0), rock (1), paper (2): ");
            int userInput = input.nextInt();
         
            switch (userInput) {
           // Scissors input results
            case 0:
                if (userInput == randomInt) {
                    System.out.println("The computer is scissors. You are scissors too. It is a draw.");
                } else if (randomInt == 1) {
                    System.out.println("The computer is rock. You are scissors. Computer won.");
                    computerWon++;
                    userWon = 0;
                    System.out.print("computer won: " + computerWon + " / user won: " + userWon + "\n");
                } else if (randomInt == 2) {
                    System.out.println("The computer is paper. You're scissors. You won.");
                    userWon++;
                    computerWon = 0;
                    System.out.print("computer won: " + computerWon + " / user won: " + userWon + "\n");
                }
                break;
              // Rock input results 
            case 1:
                if (randomInt == 1) {
                    System.out.println("The computer is rock. You are rock. It is a draw.");
                } else if (randomInt == 0) {
                    System.out.println("The computer is scissors. You are rock. You won.");
                    userWon++;
                    computerWon = 0;
                    System.out.print("computer won: " + computerWon + " / user won: " + userWon + "\n");
                } else if (randomInt == 2) {
                    System.out.println("The computer is paper. You are rock. Computer won.");
                    computerWon++;
                    userWon = 0;
                    System.out.print("computer won: " + computerWon + " / user won: " + userWon + "\n");
                }
                break;
               // Paper input results
            case 2:
                if (randomInt == 2) {
                    System.out.println("The computer is paper. You are paper. It is a draw.");
                } else if (randomInt == 0) {
                    System.out.println("The computer is scissors. You are paper. Computer won.");
                    computerWon++;
                    userWon = 0;
                    System.out.print("computer won: " + computerWon + " / user won: " + userWon + "\n");
                } else if (randomInt == 1) {
                    System.out.println("The computer is rock. You are paper. You won.");
                    userWon++;
                    computerWon = 0;
                    System.out.print("computer won: " + computerWon + " / user won: " + userWon + "\n");
                }
                break;
            default:
                System.out.println("Errors: Invalid input.");
                System.exit(0);
            }
         
            if ((computerWon == 2) || (userWon == 2)) {
                winner = 2;
            }
        }
    }
}	