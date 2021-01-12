/*
 * ClassName:  Graduate
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
 public class Graduate extends CollegeApplication  {

 	private String collegeOfOrigin;

 	//constructor with parameter
 	public Graduate(String applicationName,String collegeName, String or) {
 		super(applicationName, collegeName);
 		setCollegeOfOrigin(or);
 	}

 	//mutator method
 	public void setCollegeOfOrigin(String org)
 	{
 		collegeOfOrigin = org;
 	}

 	//Accessor method
 	public String getCollegeOfOrigin()
 	{
 		return collegeOfOrigin;
 	}

 	//check method
 	public String checkCollege()
 	{
 		if(collegeOfOrigin.equals(getCollegeName()))
 		{
 			return "from inside";
 		}
 		else
 		{
 			return "from outside";
 		}
 	}




 }
