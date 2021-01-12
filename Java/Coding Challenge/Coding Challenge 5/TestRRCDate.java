/*
 * ClassName:  TestRRCDate
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Coding Challenge 5
 * Course: ADEV-1003
 * Section: 1
 * Date Created:  19- 03 - 2019
 * Last Updated: 19 - 03 - 2019
 */

// declare class name
 public class TestRRCDate
 {

	//main method
 	public static void main(String [] args)
 	{
		//call class constructor
		RRCDate dt = new RRCDate();
		System.out.println("Initaial values ; " + "Month : " + dt.getMonth() + "Day : " + dt.getDay() + "Year : " + dt.getYear());

		RRCDate drt = new RRCDate(5, 30 ,1995);
		System.out.println("Constructor values ; " + "Month : " + drt.getMonth() + "Day : " + drt.getDay() + "Year : " + drt.getYear());

		// testing set and get method by setting different values
		drt.setDay(31);
		drt.setYear(1996);
		drt.setMonth(5);
		System.out.println("testing1 getter and setter values ; " + "Month : " + drt.getMonth() + "Day : " + drt.getDay() + "Year : " + drt.getYear());

		//checking condition of set and get method
		drt.setDay(4545);
		drt.setYear(484545);
		drt.setMonth(4498);
		System.out.println("testing2 getter and setter values ; " + "Month : " + drt.getMonth() + "Day : " + drt.getDay() + "Year : " + drt.getYear());

		//testing getLongMonth with different values
		System.out.println("testing getLongMonth method : " + drt.getLongMonth(5));
		System.out.println("testing getLongMonth method : " + drt.getLongMonth(13));

		//testing getLongFormat with invalid value
		System.out.println("testing getLongMonth method : " + drt.getLongMonth(-1));
		System.out.println("testing getLongFormat method : " + drt.getLongFormat());

		//testing toString method
		System.out.println("testing toString method : " + drt.toString());

		//testing getLongFormat with valid value
		System.out.println("testing getLongMonth method : " + drt.getLongMonth(9));
		System.out.println("testing getLongFormat method : " + drt.getLongFormat());

		//Testing equals method with its conditions
		RRCDate dd = new RRCDate(6, 9 ,2000);
		if(dd.equals(drt))
			{
				System.out.println("Checking equals method :" +" both are equal");
			}
		else
			{
				System.out.println("Checking equals method :" +"this both are not equal");
		 	}

		 RRCDate ddt = new RRCDate(10, 1 ,1582);
		 		if(ddt.equals(drt))
		 			{
		 				System.out.println("Checking equals method :" +" both are equal");
		 			}
		 		else
		 			{
		 				System.out.println("Checking equals method :" +"this both are not equal");
		 	}

		//testing static isLeapYear method with different values
		System.out.println("testing isLeapYear method :" + RRCDate.isLeapYear(1900));
		System.out.println("testing isLeapYear method :" + RRCDate.isLeapYear(2000));
		System.out.println("testing isLeapYear method :" + RRCDate.isLeapYear(2045));
		System.out.println("testing isLeapYear method :" + RRCDate.isLeapYear(2255));
	}
}
