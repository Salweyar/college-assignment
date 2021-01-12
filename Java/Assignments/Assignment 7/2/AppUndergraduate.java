/*
 * ClassName:  AppUndergraduate
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

 //subclass
 public class AppUndergraduate extends CollegeApplication
 {
 	private int satScore;
 	private double gpaScore;

 	//constructor
 	public AppUndergraduate(String appName, String calName, int sat, double gpa) {

 		super(appName,calName);
 		setSatScore(sat);
 		setGpaScore(gpa);
 	}

 	//mutotar method
 	public void setSatScore(int st)
 	{
 		satScore = st;
 	}

 	public void setGpaScore(double GPA)
 	{
 		gpaScore = GPA;
 	}

 	//Accessor method
 	public int getSatScore()
 	{
 		return satScore;
 	}

 	public double getGpaScore()
 	{
 		return gpaScore;
 	}

 }
