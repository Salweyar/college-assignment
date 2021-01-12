/*
 * ClassName:  DailyTempurature
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Assignment 6
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 22 - 03 - 2019
 * Last Updated:  27- 03 - 2019
 */

// class DailyTempurature
public class DailyTempurature
{

	// Instance variable of class DailyTempurature
	private final int WEEKS = 7;
 	private int [] dailytemp = new int [WEEKS];

	// constructor which take paramener as array
	public DailyTempurature(int [] temp )
 	{

		setDailytemp(temp);
 	}

	// accessor as array method which return array of instance variable
	public int [] getDailytemp()
	{
		 int [] temp = new int [dailytemp.length];

		for(int i = 0; i<dailytemp.length; i++)
		{
			 temp[i]= dailytemp[i] ;
		}
		return temp;
	}

   // method which count temp below freezing point
   public  int FreezingTemp()
   {
	   int tempt =0;
	 	for(int i = 0; i < dailytemp.length; i++)
	 	{
			if(dailytemp[i] < 0)
			{
				tempt++;
			}
		}
		return tempt;
   }

	// method which return array of temp above 100
	public int [] HighTemp()
	{
		int [] tem;
		int count = 0;
		for(int i = 0; i < dailytemp.length; i++)
		{
			if(dailytemp[i] > 100)
			{
				count++;
			}
		}

		tem = new int [count];
		int j = 0;
		for(int i = 0; i < dailytemp.length; i++)
		{
			if(dailytemp[i] > 100)
			{
			tem[j] = dailytemp[i];
			j++;
			}
		}

		return tem;
	}

	// method which state large difference between two consecutive days
	public int largeChangeTemp()
	{
		int change = Math.abs(dailytemp[0] - dailytemp[1]);
		for(int i = 0; i < dailytemp.length-1; i++)
		{
			if(Math.abs(dailytemp[i] - dailytemp[i+1]) > change)
			{
				change = Math.abs(dailytemp[i] - dailytemp[i+1]);
			}
		}
		return change;
	}

	//method which return array in decsending order
	public int [] descTemp()
	{
		int x;
		int j;
		for(int i = 0; i < dailytemp.length; i++)
		{
			x=i;
			j = dailytemp[i];
			while(x !=0 && dailytemp[x-1]> j)
			{
				dailytemp[x] = dailytemp[x-1];
				x--;
			}
			dailytemp[x] = j;
		}

		int last = dailytemp.length - 1;
		int middle = dailytemp.length / 2;
		for (int i = 0; i <= middle; i++) {
			int temp = dailytemp[i];
			dailytemp[i] = dailytemp[last - i];
			dailytemp[last - i] = temp;
		}
		return dailytemp;
	}

	// mutator method which set daily temp
	public void setDailytemp(int [] temp)
	{
		// this.dailytemp = dailytemp;
		dailytemp = new int [temp.length];

		for(int i = 0; i < temp.length; i++)
		{
			dailytemp[i] = temp[i];
		}
	}

	// toString method return string in a fix format
	public String toString()
	{
		String Tem = "";
		for(int i = 0; i < dailytemp.length; i++)
		{
			Tem += "Tempurature " + dailytemp[i] + " " + " Celcius" + "\t";
		}
		return Tem;

	}

	// method which check wheather values object reference are same or not
	public boolean equals(Object t)
		{
		 	if(!(t instanceof DailyTempurature ))
		 		{
		 			return false;
		 		}
		 	else
		 		{
		 			DailyTempurature objTemp = (DailyTempurature) t;
		 			if(dailytemp.length != objTemp.dailytemp.length)
		 				return false;

		 			for(int i =0; i< dailytemp.length; i++)
		 			{
						if(dailytemp[i] != objTemp.dailytemp[i])
							return false;
					}
		 				return true;
		 		}
	   }

}
