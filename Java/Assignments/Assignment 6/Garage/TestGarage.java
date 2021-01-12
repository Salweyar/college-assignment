/*
 * ClassName:  TestGarage
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

import java.util.*;
public class TestGarage {

	public static void main(String[] args) {

		// defineing Arraylist
		ArrayList<Garage> list = new ArrayList<Garage>();

				// adding into Arraylist
				list.add(new Garage("GC-90", 150 , 50.00));
				list.add(new Garage("G7-67", 220 , 60.00));
				list.add(new Garage("FT-60", 320 , 80.00));
				list.add(new Garage("GC-42", 660 , 110.00));
				list.add(new Garage("F1-A6", 450 , 97.00));


				/*Garage car = new Garage("GC-90", 150 , 50.00);
				Garage car1 = new Garage("G7-67", 220 , 60.00);
				Garage car2 = new Garage("FT-60", 320 , 80.00);
				Garage car3 = new Garage("F1-A6", 450 , 97.00);
				list.add(car);
				list.add(car1);
				list.add(car2);
				list.add(car3);*/

				//looping from arraylist
				for(Garage x : list)
				System.out.println( "Tesing toString : " + x.toString());

				System.out.println("----------------------------------------------");


				//define class GarageList
				GarageList sal = new GarageList(list);
				System.out.println( "Tesing Constructor : " + sal.toString());

				System.out.println("----------------------------------------------");

				// using Accessor method
				System.out.println("Tesing Accessor : " + sal.getList());

				System.out.println("----------------------------------------------");

				//using avgMiles method
				System.out.println( "Tesing avgMiles : " + sal.avgMiles());

				System.out.println("----------------------------------------------");

				//using checkCar method
				System.out.println("Tesing checkCar : " + sal.checkCar());

				System.out.println("----------------------------------------------");

				//using totGallons method
				System.out.println("Tesing totGallons : " + sal.totGallons());
	}

}
