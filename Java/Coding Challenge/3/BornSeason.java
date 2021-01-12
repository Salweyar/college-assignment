/**
 * ClassName:  BornSeason
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Coding Challenge 3
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 11 - 02 - 2019
 * Last Updated: 11 - 02 - 2019
 */

 import java.util.Scanner; // this allows user to user scanner class

 public class BornSeason
 {
 	public static void main(String [] args)
 	{
		//this part of code will take user input
 		Scanner scan = new Scanner(System.in);
 		System.out.print("Enter the month you were born (1 - 12): ");
 		int month = scan.nextInt();

		//this will decide which month should be display according the user input
 		switch (month)
 			{
				case 1: System.out.println("You were born in Winter");
						break;
				case 2: System.out.println("You were born in  Winter");
						break;
				case 3: System.out.println("You were born in  Spring");
						break;
				case 4: System.out.println("You were born in Spring");
						break;
				case 5: System.out.println("You were born in Spring");
						break;
				case 6: System.out.println("You were born in Summer");
						break;
				case 7: System.out.println("You were born in Summer");
						break;
				case 8: System.out.println("You were born in Summer");
						break;
				case 9: System.out.println("You were born in Autumn");
						break;
				case 10: System.out.println("You were born in Autumn");
						break;
				case 11: System.out.println("You were born in Autumn");
						break;
				case 12: System.out.println("You were born in Winter");
						break;

				default : System.out.println("Invalid month");

			}
 	}

}