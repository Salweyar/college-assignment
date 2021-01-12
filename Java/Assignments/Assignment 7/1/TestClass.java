/*
 * ClassName:  TestClass
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


 public class TestClass {

 	public static void main(String [] args)
 	{
		//Testing Drink Class and its methods
 		Drinks d1 = new Drinks("coke",255,"thin");
 		System.out.println("Drink type :" + d1.getdesc());
 		System.out.println( "calories :" + d1.calories(5));
 		System.out.println( "Viscosity :" + d1.getViscosity() + "\n");



 		//Testing Fruit class and its methods
 		Fruit f1 = new Fruit("mango",50, "summer");
 		System.out.println( "Fruit type :" + f1.getdesc());
 		System.out.println( "calories :" + f1.calories(4));
 		System.out.println( "Season :" + f1.getSeason());

 	}

}