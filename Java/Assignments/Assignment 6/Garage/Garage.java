/*
 * ClassName:  Garage
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

import java.util.ArrayList;
public class Garage {
	// instance variables
	 private String model; // model of a car
	 private int milesDriven; // number of miles driven
	 private double gallonsOfGas; // number of gallons of gas


	// Default constructor:
	// initializes model to "unknown";
	// milesDriven is autoinitialized to 0
	// and gallonsOfGas to 0.0
	public Garage() {
		model = " ";
		milesDriven = 0;
		gallonsOfGas = 0.0;
	}

	// Overloaded constructor:
	// allows client to set beginning values for
	// model, milesDriven, and gallonsOfGas.
	public Garage( String startModel,int startMilesDriven, double startGallonsOfGas )
	 {
		model = startModel;
		setMilesDriven( startMilesDriven );
		setGallonsOfGas( startGallonsOfGas );
	 }

	 // Accessor method:
	 // returns current value of model
	 public String getModel( )
	 {
	 return model;
	 }

	  // Accessor method:
	  // returns current value of milesDriven
	  public int getMilesDriven( )
	  {
	  return milesDriven;
	  }

	  // Accessor method:
	  // returns current value of gallonsOfGas
	  public double getGallonsOfGas( )
	  {
	  return gallonsOfGas;
	  }

	  // Mutator method:
	  // allows client to set model
	  public Garage setModel( String model )
	  {
	  this.model = model;
	  return this;
	  }

	  // Mutator method:
	  // allows client to set value of milesDriven;
	  // if new value is not less than 0
	  public Garage setMilesDriven( int milesDriven )
	  {
	  if ( milesDriven >= 0 )
	  this.milesDriven = milesDriven;
	  return this;
	 }

	// Mutator method:
	   // allows client to set value of gallonsOfGas;
	   // if new value is not less than 0.0
	   public Garage setGallonsOfGas( double gallonsOfGas )
	   {
	   if ( gallonsOfGas >= 0.0 )
	   this.gallonsOfGas = gallonsOfGas;
	   return this;
	   }

	   // Calculates miles per gallon.
	   // if no gallons of gas have been used, returns 0.0;
	   // otherwise, returns miles per gallon
	   // as milesDriven / gallonsOfGas
	   public double milesPerGallon( )
	   {
	   if ( gallonsOfGas >= 0.0001 )
	   return milesDriven / gallonsOfGas;
	   else
	   return 0.0;
	   }

	   // Calculates money spent on gas.
	   // returns price per gallon times gallons of gas
	   public double moneySpentOnGas( double pricePerGallon )
	   {
	   return pricePerGallon * gallonsOfGas;
	  }

	  public String toString()
	  {
		  return "Model : " + model + "milesDriven :" + milesDriven + "gallonsOfGas :" + gallonsOfGas;
	  }

}