/**
 * ClassName:  rainfall.
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: 3
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 15 - 01 - 2019
 * Last Updated: 16 - 01 - 2019
 */

public class rainfall
{
	public static void main(String [] args)
	{
	int dayOne = 3; // this is rainfall amount for day 1
	int dayTwo = 6; // this is rainfall amount for day 2
	int dayThree = 5; // this is rainfall amount for day 3
	int rainAthome = 26; // this is rainfall amount when it was at home

	double averageDaycamp =((double) dayOne + (double) dayTwo + (double) dayThree) / 7 ; // this is average value for three in a week days rainfall
	double difference =  (double)rainAthome - averageDaycamp; // this is the value of rainfall when jamie was between camping and his home
	double twice = rainAthome - 2*averageDaycamp; // this is the value of the rainfall when between where Jamie was camping and his home, when the rain fall amounts when camping are doubled.

	System.out.println("Average rain fall while camping:" + averageDaycamp); // this print average rainfall
	System.out.println(" Difference in rain fall:" + difference); // this print rainfall when jamie was between camping and his home
	System.out.println("Difference when doubled:" + twice); // this print this is the value of the rainfall when between where Jamie was camping and his home, when the rain fall amounts when camping are doubled.

	}
}