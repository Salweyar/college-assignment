/*
 * ClassName:  SalariedEmployee
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
 public class SalariedEmployee extends Employee {

 	//Instance variables for sub class
 	private final int ANNUAL_PAY_PERIODS = 26;
 	private final double DEDUCTION_RATE = 0.0015;
 	private double annualSalary;
 	NumberFormat n =NumberFormat.getCurrencyInstance();

 	//constructor for sub class
 	public SalariedEmployee(String id, String name, double an) {
 		super(id, name);
 		annualSalary = an;
 	}

 	 //Accesstor method
 	public double getAnnualSalary()
 	{
 		return annualSalary;
 	}

 	//Abstract method override from super class
 	@Override
 	public double getPay()
 	{
 		double a= annualSalary*DEDUCTION_RATE;
 		double b = annualSalary - a;
 		double c = b /ANNUAL_PAY_PERIODS;

 		return c;
 	}

 	// tostring method
 	@Override
 	public  String toString()
 	{
 		return "SALARIED EMPLOYEE" + "\n" + "ID:" + getID() + "\n" + "Name:" + getName() + "\n" + "Pay:" + n.format(getPay())  + "[Annual Salary:" + n.format(getAnnualSalary()) + "]" + "\n";
 	}

 }
