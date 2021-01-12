/**
 * ClassName:  Calculation.
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: codding challenge 2
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 28 - 01 - 2019
 * Last Updated: 29 - 01 - 2019
 */

import java.util.Scanner;  // import scanner class to get user input
import java.text.DecimalFormat; // import decimalformat class to get % formate and 2 decimal

public class Calculation
{
	public static void main(String [] args)
	{
		// declare Scanner class and decimalformat class
		Scanner scan = new Scanner(System.in);
		DecimalFormat mark = new DecimalFormat("0.00%");

		// user input for max score in integer
		System.out.print("Enter the test's maximum score: ");
		int testMax = scan.nextInt();

		// user input score for student 1 and it pull out it's marks by dividing it score to max test score
		System.out.print("Enter the first student's score:");
		float firstStudent = scan.nextFloat();
		double firstStudentMark = firstStudent/testMax;

		// user input score for student 2 and it pull out it's marks by dividing it score to max test score
		System.out.print("Enter the second student's score: ");
		float secondStudent = scan.nextFloat();
		double secondStudentMark = secondStudent/testMax;

		// user input score for student 3 and it pull out it's marks by dividing it score to max test score
		System.out.print("Enter the third student's score: ");
		float thirdStudent = scan.nextFloat();
		double thirdStudentMark = thirdStudent/testMax;

		// this part of code will display ave result of class performance
		double avg = (firstStudentMark+secondStudentMark+thirdStudentMark)/3;
		System.out.println("The average mark is: " + mark.format(avg));

		//this will display max result of students
		double max = Math.max(firstStudentMark,secondStudentMark);
		double high = Math.max(max,thirdStudentMark);
		System.out.println("The highest mark is: " + mark.format(high));

		//this will display min result of students
		double min = Math.min(firstStudentMark,secondStudentMark);
		double low = Math.min(min,thirdStudentMark);
		System.out.println("The lowest mark is: " + mark.format(low) );
	}
}