/**
 * ClassName:  Seasons.
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Assignment 3
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 29 - 01 - 2019
 * Last Updated: 30 - 01 - 2019
 */

import java.util.Scanner; // this allows user to user scanner class

public class Seasons
{
	public static void main(String [] args)
	{
		// declare scanner class
		Scanner scan = new Scanner(System.in);

		//get the user input to type tempurature
		System.out.print("Enter temperature " );
		int tempurature = scan.nextInt();

		//check the conditions and respond according to user input
		 if(tempurature>110 || tempurature<-5)
		{
			System.out.println("the temperature entered is outside the valid range."); // if enter tem greater than 110 and less then -5 it display this response
		}
		else if(tempurature>=90)
		{
			System.out.println("it is probably summer."); //if enter tem greater than 90 and less it display this response
		}
		else if(tempurature>=70 && tempurature<90 )
		{
			System.out.println(" it is probably spring.");//if enter tem greater than 70 and less 90 it display this response
		}
		else if(tempurature>=50 && tempurature<70)
		{
			System.out.println("it is probably fall."); //if enter tem greater than equal to 50 and less 70 it display this response
		}
		else if(tempurature<50)
		{
			System.out.println("it is probably winter.");//if enter tem less 50 it display this response
		}

		else
		{
			System.out.println(" "); // if enter something different it display this
		}
	}

}