/*
 * ClassName:  Drinks
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
 public class Drinks extends SomeFood
 {
	 //instance variable
 	 private String viscosity;

 	 //class parameter constructor
 	 public Drinks(String description, int cal, String viscosity)
 	 {
 		 super(description, cal);
 		 this.viscosity = viscosity;

 	 }

 	 //method extended from SomeFood
 	@Override
 	public int calories(int serving) {

 		return getcal()* serving;
 	}

 	//Accessor method for viscosity variable
 	public String getViscosity()
 	{
 		return viscosity;
 	}
 }
