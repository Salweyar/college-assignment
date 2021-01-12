/*
 * ClassName:  Client
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
 import java.util.*;

 //Testing class
 public class Client {

 	//dedining getTotalPayForSalariedEmployees to get total for salaries employees
 	public  double getTotalPayForSalariedEmployees(ArrayList<Employee> p)
 	{
 		double total=0.0;

 		for(int x =0; x<p.size(); x++)
 		{
 			if(p.get(x) instanceof SalariedEmployee)
 			{
 			double val = p.get(x).getPay();
 			total += val;
 			}

 		}
 		return total;
 	}

 	//main method
 	public static void main(String[] args) {

 		//define arraylist to get of employee info
 		ArrayList<Employee> ep = new ArrayList<Employee>();

 		NumberFormat z =NumberFormat.getCurrencyInstance();

 		//Storing data for HourlyEmployee and add it to arraylist
 		HourlyEmployee h1 = new HourlyEmployee("001","Salweyar", 75.0, 1000.00);
 		HourlyEmployee h2 = new HourlyEmployee("002","Jack", 69.0, 1500.00);
 		HourlyEmployee h3 = new HourlyEmployee("003","Campbell", 60.0, 2000.00);
 		ep.add(h1);
 		ep.add(h2);
 		ep.add(h3);

 		//Storing data for SalariedEmployee and add it to arraylist
 		SalariedEmployee s1 = new SalariedEmployee("004","Durston", 100000);
 		SalariedEmployee s2 = new SalariedEmployee("005","Edwards", 200000);
 		SalariedEmployee s3 = new SalariedEmployee("006","Folgers", 400000);
 		ep.add(s1);
 		ep.add(s2);
 		ep.add(s3);

 		//Running all the data from arraylist
 		for(Employee x : ep)
 		{
			//using tostring method
 			System.out.println(x.toString());
 		}

 		//defining client class
 		Client c = new Client();

 		//using getTotalPayForSalariedEmployees method to get total pay for SalariedEmployee
 		System.out.println("Total pay for salaried employees is " + z.format((c.getTotalPayForSalariedEmployees(ep))));
 	}

 }
