/*
 * ClassName:  Employee
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: coding challenge 7
 * Course: ADEV-1003
 * Section: 1
 * Date Created:  09- 04 - 2019
 * Last Updated:  09- 04 - 2019
 */

 //Super Abstract class
 public abstract class Employee
 {
	 //Instance variables for super class
	 private String id;
	 private String name;

	 //constructor for super class
	 public Employee(String id, String name)
	 {
		 this.id = id;
		 this.name = name;
	 }

	 //Accesstor method
	 public String getID()
	 {
		 return id;
	 }

	 //Accesstor method
	 public String getName()
	 {
		 return name;
	 }

	//Abstract method
	 public abstract double getPay();

	 // tostring method
	 @Override
	 public String toString()
	 {
		 return "ID:" + id + "\n" + "Name:" + name + "\n" + "Pay:" + getPay();
	 }

 }
