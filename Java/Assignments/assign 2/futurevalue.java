/**
 * ClassName:  futurevalue.
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: 3
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 16 - 01 - 2019
 * Last Updated: 16 - 01 - 2019
 */

// this is allows you to use scannar class from java util library
import java.util.Scanner;

public class futurevalue
{
	public static void main (String [] args)
	{

	//create the Scanner method
	Scanner scan = new Scanner(System.in);

	// this will ask for the user input to enter the invesment
	System.out.print("Enter the investment : ");
	int investment = scan.nextInt();

	//this will ask for the user input to enter the intrest rate
	System.out.print("Enter the interest rate : ");
	float intrestRate = scan.nextFloat();

	// this will gives you the future value for when it's 5 years
	double futureValue = Math.pow( (1 + intrestRate),1);
	double result = futureValue * investment;
	System.out.println(result);

	// this will gives you the future value for when it's 10 years
	double fv = Math.pow( (1 + intrestRate),10);
	double answer = fv * investment;
	System.out.println(answer);

	// this will gives you the future value for when it's 20 years
	double fvalue = Math.pow( (1 + intrestRate),20);
	double total = fvalue * investment;
	System.out.println(total);
	}
}