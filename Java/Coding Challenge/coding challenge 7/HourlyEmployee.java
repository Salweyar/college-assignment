/*
 * ClassName:  HourlyEmployee
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

 //import number format method to desize number in currency format
 import java.text.NumberFormat;

 //sub class connected to employee class
 public class HourlyEmployee extends Employee {

 	NumberFormat n =NumberFormat.getCurrencyInstance();
 	//Instance variables for sub class
 	private final int MAXIMUM_HOURS_PER_PAY_PERIOD  = 70;
 	private final double OVERTIME_RATE = 1.5;
 	private double hoursWorked;
 	private double wage;

 	//constructor for sub class
 	public HourlyEmployee(String id, String name, double hoursWorked, double wage) {
 		super(id, name);
 		this.hoursWorked = hoursWorked;
 		this.wage = wage;
 	}

 	 //Accesstor method
 	public double getHoursWorked()
 	{
 		return hoursWorked;
 	}

 	 //Accesstor method
 	public double getWage()
 	{
 		return wage;
 	}

 	//Abstract method override from super class
 	@Override
 	public double getPay()
 	{
 		if(hoursWorked > MAXIMUM_HOURS_PER_PAY_PERIOD)
 		{

 			double b = (hoursWorked-MAXIMUM_HOURS_PER_PAY_PERIOD) * OVERTIME_RATE * wage;
 			wage = (wage * MAXIMUM_HOURS_PER_PAY_PERIOD) + b;
 			return wage;
 		}
 		else
 		{
 			return wage * hoursWorked;
 		}
 	}

 	// tostring method
 	@Override
 	public  String toString()
 	{
 		return "HOURLY EMPLOYEE" + "\n" + "ID:" + getID() + "\n" + "Name:" + getName() + "\n" + "Pay:" + n.format(getPay()) + "\n";
 	}
 }
