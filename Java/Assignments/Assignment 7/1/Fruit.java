/*
 * ClassName:  Fruit
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

 //abstract sub class entended from SomeFood
 public class Fruit extends SomeFood {

 	//instance variable
 	private String season;

 	 //class parameter constructor
 	public Fruit(String description, int caloriesPerServing, String sea) {
 		super(description, caloriesPerServing);
 		this.season = sea;
 	}

 	//Accessor method for season variable
 	public String getSeason()
 	{
 		return season;
 	}

 	 //method extended from SomeFood
 	@Override
 	public int calories(int serving) {
 		return getcal()*serving;
 	}

 }
