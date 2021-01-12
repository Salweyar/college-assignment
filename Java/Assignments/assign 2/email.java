/**
 * ClassName:  email.
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

public class email
{
	public static void main (String [] args)
	{

	//create the Scanner method
	Scanner scan = new Scanner(System.in);

	// ask user input for email address
	System.out.println("Enter your email address : ");
	 String mail = scan.nextLine(); // this is a email address as a string

	// this part of code is for positioning the @ so later you can make the difference in printing username and domain name
	int read = mail.indexOf('@');

	// it read and print the user name
	String username = mail.substring(0,read);
	System.out.println("the username is :" + username);

	//it read and print the domain name
	String domainname = mail.substring(read+1);
	System.out.println("domain name is :" + domainname);
	}
}