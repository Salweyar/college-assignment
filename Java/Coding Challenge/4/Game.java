/**
 * ClassName:  Game
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment:Coding Challenge 4
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 04 - 03 - 2019
 * Last Updated: 04 - 03 - 2019
 */

  import java.util.Scanner;// this allows user to user scanner class
  import java.util.Random; // random class to choose random values
  import java.text.NumberFormat; // this will convert into percent form


  public class Game
  {
  	public static void main(String [] args)
  	{
		// this ask user input for int
  		Scanner scan = new Scanner(System.in);
  		NumberFormat ans = NumberFormat.getPercentInstance();



  		// add player points if they won
  		int playerPoint =0;

		// this will generate 5 round for player to play the game
		for(int i = 1; i<=5; i++)
		{
			// this code will shows what round it is and ask user input
			System.out.println("Round : " + i);
			System.out.print("Enter your choice (1 - Rock, 2 - Paper or 3 - Scissors): ");
			int player = scan.nextInt();

			// if player enter value out of range then it will display invalide and ask again
		    while (player<=0 || player>=4)
				{
					System.out.print("Invalid choice! (1, 2 or 3): ");
					player = scan.nextInt();
				}

			// this will generate random value for computer
			Random num = new Random();
			int computer = num.nextInt(3);
			computer +=1;

			// this will ask again for user input if the round is tie
			do{
				if (computer == player)
					{
						System.out.println(" The round is a draw");
						System.out.print("Enter your choice (1 - Rock, 2 - Paper or 3 - Scissors): ");
					    player = scan.nextInt();
						computer = num.nextInt(3);
						computer +=1;
					}

			}
			while(computer == player);


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
			if(player == 1)
					{
						if(computer == 3)
								{
									System.out.println("Rock beats Scissors , Player Wins!");
									playerPoint++;
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
									playerPoint++;
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
									playerPoint++;
					}
			}

			// this will show more much round player won
		   System.out.println("You have won " + playerPoint + " of" +i+ "rounds");

		}

		// this will give you the percentage value of player won
		double answer = (double) playerPoint/5;
		System.out.println("Your win percentage is : " + ans.format(answer));

  	}

}