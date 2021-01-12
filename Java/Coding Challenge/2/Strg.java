/**
 * ClassName:  Strg.
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



public class Strg
{
	public static void main(String [] args)
	{

		//used string constructor to declare string
		String telephone = new String("5554545");

		// manipulate string to get the telephone formate
		String tPh = telephone.substring(0,3);
		String teleP = telephone.substring(3);



		// here it prints out string in form of integer
		System.out.println("Telephone Number : " + Integer.parseInt(tPh) + "-" + Integer.parseInt(teleP) );
		int result = Integer.parseInt(telephone);

		//this code declare string and display its lenght of the caracters
		String initialStringValue = "A String is an array of characters";
		System.out.println("InitialStringValue length is: " + initialStringValue.length());

		// this code concat or join to string together and display as one whole string
		initialStringValue = initialStringValue.concat(", with some built in methods");
		System.out.println("Concatenated: " + initialStringValue);

		//this print out length of the concat string
		System.out.println("Concatenated length is: " + initialStringValue.length());

		// this part of code check wheather string ends with "ods" or not and return boolean value
		System.out.println(" moreInformation ends with ods : " +  initialStringValue.contains("ods"));

		// this part of code replace string character and set a new string character and display whole new form of string
		System.out.println("Replaced text:" + initialStringValue.replaceAll("ar","X-") );


	}
}