/*
 * ClassName:  GarageList
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Assignment 6
 * Course: ADEV-1003
 * Section: 1
 * Date Created:  22- 03 - 2019
 * Last Updated:  27- 03 - 2019
 */

//import ArrayList pacakage
import java.util.ArrayList;

//class
public class GarageList {

	// instance variable as ArrayList
	 private ArrayList<Garage> listOfCar;

	//Empty constructor
	public GarageList()
	{
		listOfCar = new ArrayList<Garage>();
	}

	// constructor with parameters
	public GarageList(ArrayList<Garage> listOfCar)
		{
			this.listOfCar = new ArrayList<Garage>(listOfCar.size());

			for ( Garage currentList : listOfCar )
			{
				this.listOfCar.add( currentList );
			}

	}

	//Accessor method
	public ArrayList<Garage> getList()
		{
			return listOfCar;
	}

	// toString method which
	public String toString( )
	{
		String car = "";
		for( Garage x : listOfCar )
		{
			car += x.toString( ) + "n";
		}
		return car;
	}

	// method to find avg miles
	public double avgMiles ()
	{
		int total = 0;
		Garage listofCars;
		for ( int i = 0; i < listOfCar.size(); i++ )
		{
			listofCars = listOfCar.get(i);
			total += listofCars.getMilesDriven();
		}
		double avg = total / listOfCar.size();
		return avg;
	}

	// method to check condition
	public String checkCar ()
	{
		if ( listOfCar.size() >= 100 )
			return "Full";
		if ( listOfCar.size() < 25 )
			return "Below average";
		else
		return "normal";
	}

	// to which return total gallons use by car
	public double totGallons ()
	{
		double total = 0;
		Garage y;
		for ( int i = 0; i < listOfCar.size(); i++ )
		{
			y = listOfCar.get(i);
			total += y.getGallonsOfGas();
		}
		return total;

	}

}
