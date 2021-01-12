/*
 * ClassName:  TestDailyTempurature
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

/** RRCDate class
* Show Set Date, Default Date
*/

public class TestDailyTempurature
{
	public static void main(String[] args) {

			// define arrays
			int [] t1 = {22, 33, 44, 101, 113, 70, 29 };

			// testing constructor
			DailyTempurature tempurature = new DailyTempurature(t1);
			System.out.println( "testing constructor and toString method : " + tempurature.toString() );

			// Testing Accessor method
			int [] t2 = tempurature.getDailytemp();
			for (int y : t2)
			{
				System.out.println("Testing getDailytemp :" + y);
			}

			System.out.println("------------------Nico Testing-------------------");

			System.out.println("t1 - 2:" + t1[2]);
			System.out.println("t2 - 2:" + t2[2]);
			System.out.println("t1 - 2:" + t1[4]);
			System.out.println("t2 - 2:" + t2[6]);
			t2[2] = 100;
			System.out.println("t2 - 2:" + t2[2]);
			System.out.println("t1 - 2:" + t1[2]);



			System.out.println("-------------------------------------------------");

			//Testing mutator method
			t1[0]=55;
			t1[1]=66;
			t1[2]=200;
			tempurature.setDailytemp(t1);
			t2 = tempurature.getDailytemp();
			for (int z : t2)
			{
				System.out.println("Testing setDailytemp : " + z);
			}

			// Testing equals method
			int [] tep = {-1,50,-15,101,141,22,44};
			DailyTempurature tp = new DailyTempurature(tep);

			if(tp.equals(tempurature))
			{
				System.out.println("Testing equals method " +"Arrays are similar");
			}
			else
			{
				System.out.println("Testing equals method " + "Arrays are not similar");
			}

			// testing FreezingTemp method
			System.out.println("testing FreezingTemp method :" + tp.FreezingTemp());

			//testing HighTemp method
			int [] t4 = tp.HighTemp();
			for (int t : t4)
			{
				System.out.println("High temp : " + t);
			}

			//testing largeChangeTemp method
			System.out.println("testing largeChangeTemp method :" + tp.largeChangeTemp());

			System.out.println("---------------------------------------------------");

			//testing descTemp method
			int [] t5 = tp.descTemp();
			for (int tt : t5)
			{
				System.out.println("testing descTemp method : " + tt);
			}
	}
}