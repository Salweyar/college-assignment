/**
 * ClassName:  WebAddress.
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

public class WebAddress
{
	public static void main(String [] args)
	{
		// declare scanner class
		Scanner scan = new Scanner(System.in);

		//get the user input to type web address
		System.out.print("Enter your Web address :" );
		String web = scan.nextLine();

		//check the conditions and respond according to user input
		if(web.endsWith("gov"))
		{
			System.out.println("it is a government web address."); // if it web address ends with gov it display this sentense.
		}
		else if(web.endsWith("edu"))
		{
			System.out.println(" it is a university webaddress");// if it web address ends with edu it display this sentense.
		}
		else if(web.endsWith("com"))
		{
			System.out.println("it is a business web address."); // if it web address ends with com it display this sentense.
		}
		else if(web.endsWith("org"))
		{
			System.out.println("it is a organization web address."); // if it web address ends with org it display this sentense.
		}
		else
		{
			System.out.println("it is a web address for another entity"); // if it web address ends with another kind it will display this sentense.
		}

	}

}