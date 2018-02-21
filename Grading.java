package lab1;
/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 3.4 Middle Value
 * This lab will find the middle value of three non identical variables
 */
import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt for three test scores. Scores must be between 0-100
		System.out.println("Enter test scores. Must be between 0-100");
		System.out.println("Enter test score 1");
		double test1 = input.nextDouble();
		System.out.println("Enter test score 2");
		double test2 = input.nextDouble();
		System.out.println("Enter test score 3");
		double test3 = input.nextDouble();
		//average test scores
		double grade =  (test1 + test2 + test3)/3;
		//Output grade
		if (grade < 60) {
			System.out.println("Your grade is a F");
		}else if (grade >= 60 && grade < 70) {
			System.out.println("Your grade is a D");
		}else if (grade >= 70 && grade < 80) {
			System.out.println("Your grade is a C");
		}else if (grade >= 80 && grade < 90) {
			System.out.println("Your grade is a B");
		}else if (grade >= 90)
			System.out.println("Your grade is a A");
		
		}

}
