/*
 * Garage: This is the Garage service class
 *
 * @author Duy Anh Nguyen Tran
 * @version 1.0
 *
 * Assignment: 6
 * Course: ADEV-1003
 * Section: 1
 * Date Created: November 25td, 2018
 * Last Updated: November 26th, 2018
 */
import java.util.ArrayList;

public class Garage
{
	private ArrayList <Automobile> listOfCars;

	// Default
	public Garage ( )
	{
		listOfCars = new ArrayList<Automobile>();
	}

	// Overloaded
	public Garage ( ArrayList <Automobile> listOfCars )
	{
		this.listOfCars = new ArrayList<Automobile>(listOfCars.size() );

		for ( Automobile currentList : listOfCars )
		{
			this.listOfCars.add( currentList );
		}
	}

	// toString
	public String toString( )
	{
		String result = "";
		for( Automobile tempAutomobile : listOfCars )
		{
			result += tempAutomobile.toString( ) + "n";
		}

		return result;
	}

	// Data manupilation
	// Average miles
	public double averageMiles ()
	{
		int total = 0;
		Automobile currentListOfCars;
		for ( int i = 0; i < listOfCars.size(); i++ )
		{
			currentListOfCars = listOfCars.get(i);
			total += currentListOfCars.getMilesDriven();
		}
		double average = total / listOfCars.size();
		return average;
	}

	// Total Gallons
	public double totalGallons ()
	{
		double total = 0;
		Automobile currentListOfCars;
		for ( int i = 0; i < listOfCars.size(); i++ )
		{
			currentListOfCars = listOfCars.get(i);
			total += currentListOfCars.getGallonsOfGas();
		}
		return total;

	}

	// To check garage condition
	public String checkCarsNumbers ()
	{
		if ( listOfCars.size() >= 100 )
			return "Full";
		if ( listOfCars.size() < 25 )
			return "Below average";
		return "normal";
	}
}



