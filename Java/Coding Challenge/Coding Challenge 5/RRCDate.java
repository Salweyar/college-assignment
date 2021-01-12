/*
 * ClassName:  RRCDate
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

/** RRCDate class
* Show Set Date, Default Date
*/
public class RRCDate
{
	// class attributes
 	 private int year, month, day;
 	 private String newmth;
 	 private final String NEWMTH = "October";
 	 private final int DEFAULTMONTH = 10, DEFAULTYEAR= 1582, DEFAULTDAY =1 ;


	/**
	* This is the empty constructor has value of default date
	*
	*/
 	 public RRCDate()
 	 {
		 year = 1582;
		 month = 10;
		 day = 1;
	 }

	/**
	* This is the constructor has allows you to set parameters newmonth , newday , newyear
	*@param newmonth it sets new moth
	*@param newday it sets new day
	*@param newyear it set new year
	*/
	 public RRCDate(int newmonth, int newday, int newyear)
 	{
		year = newyear;

		if(newmonth >= 1 && newmonth <= 12)
		{
			month = newmonth;
		}
		else
		{
			month = DEFAULTMONTH;
		}


		if(month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12)
		{
			if(newday >=1 && newday <= 31)
			{
				day = newday;
			}
			else
			{
				day = DEFAULTDAY;
			}
		}
		else if(month == 4 && month == 6 && month == 9 && month == 11)
		{
			if(newday >=1 && newday <= 30)
			{
				day = newday;
			}
			else
			{
				day = DEFAULTDAY;
			}
		}
		else if(month == 2)
		{
			if(newday >=1 && newday <= 28)
			{
				day = newday;
			}
			else
			{
				day = DEFAULTDAY;
			}
		}
		else
		{
			day = DEFAULTDAY;
		}

	}

	/**
	* This is accessor method allows you to get year
	*@return year it will year
	*/
	public int getYear()
	{
		return year;
	}

	/**
	* This is accessor method allows you to get month
	*@return month it will month
	*/
	public int getMonth()
	{
		return month;
	}

	/**
	* This is the method allows you to get month as a string
	*@param month it take int argurment
	*@return newmth it will return string as input int parameter
	*/
	public String getLongMonth( int month)
	{
		switch(month)
		{
			case 1: newmth= "January";
			break;
			case 2: newmth= "February";
			break;
			case 3: newmth="March";
			break;
			case 4: newmth="April";
			break;
			case 5: newmth="May";
			break;
			case 6: newmth="June";
			break;
			case 7: newmth="July";
			break;
			case 8: newmth="August";
			break;
			case 9: newmth="September";
			break;
			case 10: newmth="October";
			break;
			case 11: newmth="November";
			break;
			case 12: newmth="December";
			break;
			default: newmth= "Invalid Month";
		}
				return newmth;
	}

	/**
	* This is the method allows you to get long format of date
	*@return newmth it will return string
	*@return day it will return day as int
	*@return year it will return year as int
	*@return NEWMTH it will return default string
	*/
	public String getLongFormat()
	{
		if(!(newmth.equals("Invalid Month")))
		{
			return newmth + " " + day  + " , " + year ;
		}
		else
		{
			return NEWMTH + " " + day  + " , " + year ;
		}
	}

	/**
	* This is accessor method allows you to get day
	*@return day it will day
	*/
	public int getDay()
	{
		return day;
	}

	/**
	* This is the method allows you to set month as a int
	*@param mth it take int argurment within 1 to 12
	*/
	public void setMonth(int mth)
	{
		if(mth >= 1 && mth <= 12)
		{
			month = mth;

		}
		else
		{
		    month = DEFAULTMONTH ;
		}

	}

	/**
	* This is the method allows you to set day as a int
	*@param dy it take int argurment within 1 to 31
	*/
	public void setDay(int dy)
	{
		if(month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12)
		{
			if(dy >=1 && dy <= 31)
			{

				day = dy;
			}
			else
			{
				day = DEFAULTDAY;
			}
		}
		else if(month == 4 && month == 6 && month == 9 && month == 11)
		{
			if(dy >=1 && dy <= 30)
			{

				day = dy;
			}
			else
			{
				day = DEFAULTDAY;
			}
		}
		else if(month == 2)
		{
			if(dy >=1 && dy <= 28)
			{

				day = dy;
			}
			else
			{
				day = DEFAULTDAY;
			}
		}
		else
		{
			day = DEFAULTDAY;
		}
	}

	/**
	* This is the method allows you to set year as a int
	*@param yr it take int argurment only upto 4 character
	*/
	public void setYear(int yr)
	{
		if(yr >= 1581 && yr <= 9999 )
		{
		year = yr;

		}
		else
		{
			year = DEFAULTYEAR;
		}

	}

	/**
	* This is toString method allows you to return string format
	*@return month it will return month as int
	*@return day it will return day as int
	*@return year it will return year as int
	*/
	public String toString()
	{
		return month + "/" + day + "/" + year;
	}

	/**
	*compare the field of two RRCDate objects
	*@param drt another object
	*@return true if object o is RRCDate Object and
	*this  object's field have the same values
	*as o's fields; false, otherwise
	*/
	public boolean equals(Object o)
		{
		 	if(!(o instanceof RRCDate ))
		 		{
		 			return false;
		 		}
		 	else
		 		{
		 			RRCDate objWeaf = (RRCDate) o;
		 			if(year == objWeaf.year && month == objWeaf.month && day == objWeaf.day )
		 				return true;
		 			else
		 				return false;
		 		}
	   }

	/**
	*check wheather it is leap year or not
	*@param year take int as argurment
	*@return false if 4 not divisible by given year or year is divisible by 100
	*true otherwise
	*/
	 public static boolean isLeapYear( int year)
	 {
		if(year % 4 != 0)
		{
			return false;
		}
		else if(year % 400 == 0)
		{
			return true;
		}
		else if(year % 100 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	 }
}