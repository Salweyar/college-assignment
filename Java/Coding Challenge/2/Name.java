/**
 * ClassName:  Name.
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

import java.util.Scanner; // import scanner class to get user input

public class Name
{
	public static void main(String [] args)
	{
		// declare Scanner class
		Scanner scan = new Scanner(System.in);

		//this code will ask for the user input as string
		System.out.print("Please enter your first and last name : ");
		String name = scan.nextLine();
		int initialName = name.indexOf(' '); // it will store index whitespace give by the user so we can manipulate and get first and last name

		// this code will give you first and last name initials
		String initials = name.substring(0,1);
		String lastName = name.substring(initialName,initialName+2);
		System.out.println("Your Initial are : " + initials.toUpperCase() + "." + lastName.toUpperCase() + "."); // this will print and capatilize your initials

	}
}