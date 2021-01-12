/**
 * ClassName:  WebsiteCount
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Assignment 4
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 12 - 02 - 2019
 * Last Updated: 13 - 02 - 2019
 */

 import java.util.Scanner; // this allows user to user scanner class

 public class WebsiteCount
 {
 	public static void main(String [] args)
 	{
		// prompt the user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter website name : ");
		int web = 0; // set variable to the initial
		String terminate = "stop"; // use string to stop program
		String websiteName = scan.nextLine();

		//loop the user response to ask for website name
		while (!(websiteName.equals(terminate)))
		{
			//if website name ends with com then it record it
			if(websiteName.endsWith("com"))
			{
				web++;
				System.out.print("Enter website name : ");
		        websiteName = scan.nextLine();
			}

			// if the user resopnse doesn't not ends with com then it will not record
			else if (!(websiteName.endsWith("com")))
			{
				System.out.print("Enter website name : ");
		        websiteName = scan.nextLine();
			}
	    }
	    	// print the user input which ends with com
			System.out.println("commercial website are : " + web);
 	}

}