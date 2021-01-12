/**
 * ClassName:  ExamGrade
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
 import java.lang.*;

 public class ExamGrade
 {
 	public static void main(String [] args)
 	{
		// get the user input
		Scanner scan = new Scanner(System.in);
		double gradeNum = 0; // variable to store user input
		double result = 0; // variable to store total value given by user input
		double maxValue =0; // variable store max value
		double minValue = 100; // variable to store min value

		//loop will ask the user input 10 times
		for(int i=0; i<10; i++)
		{
			// if it withnin this range then it will ask for number
			if(gradeNum>=0 && gradeNum<=100)
			{
				System.out.print("Enter your exam grade (0-100) : ");
			      gradeNum = scan.nextDouble();
			      result = gradeNum + result;// this will store total value in result

			      // this will check max value
			      if(gradeNum > maxValue)
			      {
					  maxValue = gradeNum;
					 // minValue = Math.min(maxValue,minValue);
				  }

				  // this will check min value
				  else if(gradeNum < minValue)
				  {
					  minValue = gradeNum;
				  }
			}
			//if not in range then it will display invalid grade
			else
			{
				System.out.print("Invalid grade : ");
				System.exit(0);
			}
	    }
	    		// this display average
				double ans = result/10;
	        	System.out.println("Average vale is : " + Math.round(ans));

	        	// this display max value
            	System.out.println("Max value is : " + maxValue);

            	// this display min value
            	System.out.println("Min value is : " + minValue);

 	}

}