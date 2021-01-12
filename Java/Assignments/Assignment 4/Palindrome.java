/**
 * ClassName:  Palindrome
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

 public class Palindrome
 {
 	public static void main(String [] args)
 	{
		// this take the user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter phares or word if it is palindrome or not :");
		String sentence1 = scan.nextLine(); // ask for sentence
		String sentence2 = ""; // store sentence1 later from the loop

		//loop evaluate the sentence from reverse order
		for(int x =sentence1.length()-1; x>=0; x-- )
		{
			// get the word and store in sentence2
			sentence2 = sentence2 + sentence1.charAt(x);


			//System.out.println("x = " + x + "Sentence1 = " + sentence1 + "Sentence2 = " + sentence2); // testing loop
		}
		//if sentence are equal then it will print this or else skip to the next part
		if(sentence1.equals(sentence2))
		{
			System.out.println("It is palindrome sentence  ");
		}
		else
		{
			System.out.println("It not palindrome sentence  ");
		}
 	}

}