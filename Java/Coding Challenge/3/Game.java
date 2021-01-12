/**
 * ClassName:  Game
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment:Coding Challenge 3
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 11 - 02 - 2019
 * Last Updated: 11 - 0 - 2019
 */

  import java.util.Scanner;// this allows user to user scanner class
  import java.util.Random; // random class to choose random values

  public class Game
  {
  	public static void main(String [] args)
  	{
		// this ask user input for int
  		Scanner scan = new Scanner(System.in);
  		System.out.print("Enter your choice (1 - Rock, 2 - Paper or 3 - Scissors): ");
  		int player = scan.nextInt();
  		if(player<=0 || player>=4)
  		{
			String error = (player<=0 || player>=4)? " Invalid choice!" : "keep playing";
			System.out.println(error);
			System.exit(0);
		}


		// this code will generate 1 to 3 automatic number for computer
  		Random num = new Random();
		int computer = num.nextInt(3);
  		computer +=1;

		// this conditions are for computer to show what it choose
  		switch (computer)
		  		{
					case 1 : System.out.println("Computer chose Rock");
					break;
					case 2 : System.out.println("Computer chose paper");
					break;
					case 3 : System.out.println("Computer chose Scissors");
					break;
		}

		// this part of code tells tells who win on whome
		if(computer == player)
		{
			System.out.println(" The round is a draw");
		}
		else if(player == 1)
		{
			if(computer == 3)
			{
				System.out.println("Rock beats Scissors , Player Wins!");
			}
			else if(computer == 2)
			{
				System.out.println("paper beats rock , Computer Wins!");
			}
		}
		else if(player == 2)
		{
			if(computer == 3)
			{
					System.out.println("Scissors beats Paper , Computer Wins!");
			}
			else if(computer == 1)
			{
					System.out.println(" paper beats rock, Player Wins!");
			}
		}
		else if (player == 3)
		{
			if(computer == 1)
			{
				System.out.println(" rock beats Scissors, Computer Wins!");
			}
			else if(computer == 2)
			{
				System.out.println(" Scissors beats paper, Player Wins! ");
			}
		}
  	}

}