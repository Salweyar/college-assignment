/*
 * ClassName:  Testing
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Assignment 5
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 12 - 03 - 2019
 * Last Updated: 12 - 03 - 2019
 */



 // declare class name
 public class Testing
 {

	//main method
 	public static void main(String [] args)
 	{
		//class calling empty constructor
		WeatherForecast Wfc = new WeatherForecast();
		System.out.println("Initial values: "+ "Tempurature in F : " + Wfc.getTempuarture() +" " +  "Sky Condition : " + Wfc.getSkyCondition());

		//class calling including constructor parameter
		WeatherForecast Wf = new WeatherForecast(22,"rainy");

		// getter method
		Wf.getTempuarture();
		Wf.getSkyCondition();
		System.out.println(" getter mathod values: "+ "Tempurature in F : " + Wf.getTempuarture() +" " +  "Sky Condition : " + Wf.getSkyCondition());

		// testing toString method
		System.out.println("Testing toString Method :" + Wf.toString());

		// using setter method
		Wf.setTempuarture(22);
		Wf.setSkyCondition("rainy");

		System.out.println("Set values: "+ "Tempurature in F : " + Wf.getTempuarture() +" " +  "Sky Condition : " + Wf.getSkyCondition());

		// Testing consistent method
		System.out.println("Checking consistent method value :" + Wf.consistent());

		//Testing equls method
		WeatherForecast weaFor = new WeatherForecast();

		// testing celsiusConversion method
		System.out.println("Conversion F to C is :" + weaFor.celsiusConversion(55));

		// testing equals method false
		if(Wf.equals(weaFor))
		 {
			System.out.println("Checking equals method :" +" both are equal");
		 }
		else
		 {
			System.out.println("Checking equals method :" +"this both are not equal");
		 }

		weaFor.setTempuarture(55);
		weaFor.setSkyCondition("rainy");

		// testing equals method true
		if(Wf.equals(weaFor))
		{
			System.out.println("Checking equals method :" + " both are equal");
		}
		else
		{
			System.out.println("Checking equals method :" +"this both are not equal");
		 }
	}
}