/*
 * TemperaturesClient: This is the temperature client class
 *
 * @author Duy Anh Nguyen Tran
 * @version 1.0
 *
 * Assignment: 6
 * Course: ADEV-1003
 * Section: 1
 * Date Created: November 22nd, 2018
 * Last Updated: November 26th, 2018
 */
public class TemperaturesClient
{
	public static void main( String[] args )
	{
		int [] temperature = new int [7];
		temperature[0] = 35;
		temperature[1] = 30;
		temperature[2] = 12;
		temperature[3] = 75;
		temperature[4] = 100;
		temperature[5] = 120;
		temperature[6] = 90;

		Temperatures firstWeek = new Temperatures(temperature);

		Temperatures secondWeek = new Temperatures();
		System.out.println("Daily temperature of week 1: \n");
		for(int i = 1; i <= temperature.length ; i++)
		{
			System.out.println("Day " + i + ": " + temperature[i-1] );
		}
		System.out.println();

		System.out.println(firstWeek.freezingWeather ());
		System.out.print("\nTemperatures that went above 100 degrees: ");
		for(int i=0; i < firstWeek.above100().length; i++)
		{
			System.out.print(firstWeek.above100()[i] + "\t");
		}
		System.out.println("\n\nLargest change in temperature between any two consecutive days is: " + firstWeek.temperatureChange());

		Temperatures.selectionSort(temperature);
		System.out.println("\nDaily temperature of week 1 sorted in descending order:");
		for(int i = 1; i <= temperature.length; i++)
		{
			System.out.println("Day " + i + ": " + temperature[i-1] );
		}

		System.out.println("\nDaily temperature of week 2:");
		System.out.println(secondWeek.toString());
		System.out.println("Are the weather from week 1 equals to week 2?: " + secondWeek.equals(temperature));




	}
}