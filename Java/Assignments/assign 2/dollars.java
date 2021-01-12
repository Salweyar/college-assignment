/**
 * ClassName:  dollars.
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
import java.text.NumberFormat;

public class dollars
 {
 	public static void main( String [ ] args )
 	{

		//create the Scanner method
 		Scanner scan = new Scanner( System.in );

 		//ask for the user input to enter quarter
 		System.out.print( "Enter a quarter " );
		int quarter = scan.nextInt();

		//ask for the user input to enter dimes
		System.out.print( "Enter a dimes " );
		int dimes = scan.nextInt();

		//ask for the user input to enter nickel
		System.out.print( "Enter a nickel " );
		int nickel = scan.nextInt();

		// convert quarter, dimes, nickel into dollars values
		double dollar =  quarter*0.25 +  dimes*0.10 +  nickel*0.05 ;

		NumberFormat myformat = NumberFormat.getCurrencyInstance();
		// this print the dollars values with 2 decimal
		System.out.printf( "Enter a dollar " + "%.2f", dollar );
		System.out.println("Money: "+ myformat.format(dollar));
	}
}