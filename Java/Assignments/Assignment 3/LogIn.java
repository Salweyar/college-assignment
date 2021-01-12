/**
 * ClassName:  LogIn.
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

public class LogIn
{
	public static void main(String [] args)
	{
		// declare scanner class
		Scanner scan = new Scanner(System.in);

		//declare string so we can put the condition
		String username = "admin";
		String  pass = "open";

		//ask the user input to get ID
		System.out.print("Enter your User ID : " );
		String userId = scan.next();

		//ask the user input to get password
		System.out.print("Enter your Password : " );
		String password = scan.next();

		//check the conditions and respond according to user input
		 if((userId.equals(username)) && (password.equals(pass)))
		{
			System.out.println("Wlecome"); // display this message when username and password meet the requirement
		}
		else if((userId.equals(username)) && (!(password.equals(pass))))
		{
			System.out.println("Wrong Password");// display this message when username meet the requirement but password not.
		}
		else if((!(userId.equals(username))) && (password.equals(pass)) )
		{
			System.out.println(" Wrong User ID");// display this message when password meet the requirement but username not.
		}
		else
		{
			System.out.println("Sorry, wrong ID and password"); // // display this message when non of the requirement met.
		}
	}

}