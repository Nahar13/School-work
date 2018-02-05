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
	System.out.println("Enter your Height in inches >");
	double Height = input.nextDouble();
	//Prompt for Weight
	System.out.println("Enter your Weight in pounds >");
	double Weight = input.nextDouble();
	
	//Convert to Metric
	double Meters = (Height*.0254);
	double Kilograms = (Weight*.45359237);
	//Calculate BMI
	double Bmi= (Kilograms/(Meters*Meters));
	System.out.println("Your BMI is "+Bmi);
	
	}

}
