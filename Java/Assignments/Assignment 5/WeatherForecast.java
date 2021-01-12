/*
 * ClassName:  WeatherForecast
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
 public class WeatherForecast
 {
	 // declare variables
	 private int tempuarture;
	// enum Condition { snowy, cloudy, rainy, sunny};
	 private String skyCondition;

	 /** default constructor and constructor with parameter
	 		already have 70 for tempuarture and skyCondition is sunny

	 		allows us to give two values in constructor
	 		set those value to tempuarture and skyCondition
	*/
	 public WeatherForecast()
	 {
		 tempuarture = 70;
		 skyCondition = "sunny";
	 }

	 public WeatherForecast(int t, String sky)
	 {
		 tempuarture = t;
		 skyCondition = sky;
	 }

	 /** Accesser method get
		 	getTempuarture method return tempuarture
		 	getSkyCondition method return skyCondition
	 */
	 public int getTempuarture()
	 {
		 return tempuarture;
	 }

	 public String getSkyCondition()
	 {
		 return skyCondition;
	 }

	 // declar mutator method
	 public void setTempuarture(int temp)
	 {
		 if(temp > -50 && temp < 150)
		  {
		    	tempuarture = temp;
		  }
	 }

	 public void setSkyCondition(String sc)
	 {
		  	skyCondition = sc;
	 }

	 // declare celsiusConversion method
	 public int celsiusConversion(int tempuarture)
	 {
		 if(tempuarture > -50 && tempuarture < 150)
		 {
			 tempuarture = (tempuarture - 32) * 5/9 ;
			 return tempuarture;
		 }
		 else
		 {
			 System.out.println("please enter valid range of temp : ");
			 return 0;
		 }
	 }

	public boolean consistent()
	{
		if((tempuarture < 32 && skyCondition.equals("rainy")) || (tempuarture > 32 && skyCondition.equals("snowy")))
		{
			return false;
		}
		else
		{
			return true;
	    }
	}

	 // declare toString method
	 public String toString()
	 {
	 	 return "Tempurature: " + tempuarture + "skycondition : " +  skyCondition;
	 }

	 // declare equals method
	 public boolean equals(Object o)
	 	{
	 		if(!(o instanceof WeatherForecast ))
	 		{
	 			return false;
	 		}
	 		else
	 		{
	 			WeatherForecast objWeaf = (WeatherForecast) o;
	 			if(tempuarture == objWeaf.tempuarture && skyCondition.equals(objWeaf.skyCondition) )
	 				return true;
	 			else
	 				return false;
	 		}
	   }

}