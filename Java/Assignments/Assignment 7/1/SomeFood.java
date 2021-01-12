./*
 * ClassName:  SomeFood
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Assignment 7
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 08 - 04 - 2019
 * Last Updated:  08- 04 - 2019
 */

// abstract super class
public abstract class SomeFood {

	//instance variable
	private String description;
	private int caloriesPerServing;

	//class default constructor
	public SomeFood()
	{
		caloriesPerServing = 0;
		description = null;
	}

	//class parameter constructor
	public SomeFood(String dec, int cal)
	{
		description = dec;
		caloriesPerServing = cal;
	}

	//abstract method
	public abstract int calories(int serving);

	//Accessor method for description variable
	public String getdesc()
	{
		return description;
	}

	//Accessor method for caloriesPerServing variable
	public int getcal()
	{
		return caloriesPerServing;
	}


}

