/*
 * ClassName:  StudentRecord
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: coding challenge 6
 * Course: ADEV-1003
 * Section: 1
 * Date Created:  02- 04 - 2019
 * Last Updated:  02- 04 - 2019
 */

import java.lang.*;
public class StudentRecord
{
	public static void main(String [] args)
	{
		//declare array object and instantiate array to 6 values
		Student [] record = new Student[6];

		//declare class object
		Student r1 = new Student();

		//use mutator method to store values in array
		r1.setStudentNumber(9002918);
		r1.setLastName("Armstrong");
		r1.setGradePointAverage(3.44);

		// store values in array
		record [0] = r1;
		record [1] = new Student(9093891,"Brown",2.55);
		record [2] = new Student(9301879,"Carson",1.11);
		record [3] = new Student(3910880,"Deardon",4.01);
		record [4] = new Student(8891783,"Ellis",2.66);
		record [5] = new Student(3899132,"Fisher",0.55);


	   // record  = {new Student(), new Student(9093891,"Brown",2.55),new Student(9301879,"Carson",1.11),new Student(3910880,"Deardon",4.01),new Student(8891783,"Ellis",2.66),new Student(3899132,"Fisher",0.55) };


		// Insertion sort array in ascending order based on Grade Point Average.
		Student x;
		int j;
		for(int i = 0; i < record.length; i++)
		{
			j=i;
			x = record[i];

			while(j != 0 && Double.compare(x.getGradePointAverage(),record[j-1].getGradePointAverage())<0) //x.getGradePointAverage() > 0 && record[j-1].getGradePointAverage() >0)
			{
				record[j] = record[j-1];
				j--;
			}
			record[j] = x;
		}


		//declare array double and instantiate array to store values
		double [] thersold = {0.00, 1.00, 2.00, 3.70};

		//declare array String and instantiate array to store values
		String [] statuses = {"Suspended", "Probation","Regular","Honours"};


		//Loop array to display all the index coresponding to thersold and statuses using toString method of Student class
		for(int i = 0; i < record.length; i++)
		{
			if(record[i].getGradePointAverage() <= thersold[1] )
			{
			System.out.println( record[i].toString()+ " " + statuses[0] + "\n");
			}

			else if(record[i].getGradePointAverage() <= thersold[2] && record[i].getGradePointAverage() > thersold[1])
			{
				System.out.println( record[i].toString()+ " " + statuses[1] + "\n");
			}

			else if(record[i].getGradePointAverage() <= thersold[3] && record[i].getGradePointAverage() > thersold[2])
			{
				System.out.println( record[i].toString()+ " " + statuses[2] + "\n");
			}
			else
			{
				System.out.println( record[i].toString()+ " " + statuses[3] + "\n");
			}
		}
	}
}