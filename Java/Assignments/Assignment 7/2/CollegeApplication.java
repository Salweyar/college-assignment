/*
 * ClassName:  CollegeApplication
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

 //abstract class
 public abstract class CollegeApplication
 {
	 //instance variable
 	private String applicationName, collegeName;

 	//constructor with parameter
 	public CollegeApplication(String appName, String calName)
 	{
 		this.applicationName = appName;
 		this.collegeName = calName;
 	}

 	//Assessor method for applicationName
 	public String getApplicationName()
 	{
 		return applicationName;
 	}

 	//Assessor method for collegeName
 	public String getCollegeName()
 	{
 		return collegeName;
 	}
 }
