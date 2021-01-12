/**
 * ClassName: TestScore
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Coding Challenge 3
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 11 - 02 - 2019
 * Last Updated: 11 - 0 - 2019
 */

  import java.util.Scanner; // this allows user to user scanner class
  import java.text.NumberFormat; // this allows user to user scanner class

  public class TestScore
  {
  	public static void main(String [] args)
  	{
		//This take 2 user input as test number and test score
  		Scanner scan = new Scanner(System.in);
  		NumberFormat ans = NumberFormat.getPercentInstance();
  		System.out.print("Enter the test number (1 - 6): ");


  		int testNum = scan.nextInt();

  		if (testNum<=0 || testNum>=7)
		{
				System.out.println("Invalid test number");
				System.exit(0);
		}

  		System.out.print("Enter the test score (0 - 100): ");
  		int testScore = scan.nextInt();
  	    if (testScore<0 || testScore>100)
		{
				System.out.println("Invalid test score");
				System.exit(0);
		}

  		double result;

		//this evaluate the result wheather user input is vaild or not. if it is valid it will print result

	    if (testNum==1)
		{
			result =  testScore * .001 ;
			System.out.println("The weight earned is " + ans.format(result));
		}
		else if (testNum==2)
		{
			result =  testScore * .0015 ;
			System.out.println("The weight earned is " + ans.format(result));
		}
		else if (testNum==3)
				{
					result =  testScore * .0020 ;
					System.out.println("The weight earned is " + ans.format(result));
		}
		else if (testNum==4)
				{
					result =  testScore * .0015 ;
					System.out.println("The weight earned is " + ans.format(result));
		}
		else if (testNum==5)
				{
					result =  testScore * .0020 ;
					System.out.println("The weight earned is " + ans.format(result));
		}
		else if (testNum==6)
				{
					result =  testScore * .0020 ;
					System.out.println("The weight earned is " + ans.format(result));
		}
  	}

}