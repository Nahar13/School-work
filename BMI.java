package lab1;
/*Will Smith
 * CSCI 1301 MW 9AM
 * Lab 2.3
 * This lab will give BMI from input weight and height
 */
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Prompt for Height
	System.out.println("Enter your Height in feet");
	double heightFeet = input.nextDouble();
	
	System.out.println("Enter your Height in inches >");
	double heightInch = input.nextDouble();
	
	//combine heights
	double height = (heightFeet * 12) + heightInch;
	
	//Prompt for Weight
	System.out.println("Enter your Weight in pounds >");
	double weight = input.nextDouble();
	
	//Convert to Metric
	double meters = (height*.0254);
	double kilograms = (weight*.45359237);
	
	//Calculate BMI
	double bmi= (kilograms/(meters*meters));
	System.out.println("Your BMI is "+bmi);
	if (bmi < 18.5) {
		System.out.println("You are underweight");
	}else if (bmi >= 18.5 && bmi < 25) {
		System.out.println("you are at a normal weight");
	}else if (bmi >= 25 && bmi < 30) {
		System.out.println("You are overweight");
	}else if (bmi >= 30) 
		System.out.println("You are obese");
	
	}

}
