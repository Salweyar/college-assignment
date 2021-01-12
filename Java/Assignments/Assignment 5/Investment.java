/*
 * ClassName:  Investment
 *
 *  Your Name : Salweyar Patel
 *  Version_number: 11.0.1 java
 *
 * Assignment: Assignment 5
 * Course: ADEV-1003
 * Section: 1
 * Date Created: 12 - 03 - 2019
 * Last Updated: 12 - 03 - 2019
 */


// declare class name
 public class Investment
 {
	 // declare variables
	 private double AmountInvestment;
	 private double RateIntrest;


enum Seasons {winter, spring, summer, fall};
	/** default constructor and constructor with parameter
		already have 0.0 values for AmountInvestment and RateIntrest

		allows us to give two values in constructor
		set those value to AmountInvestment and RateIntrest
	*/
	 public Investment()
	 {
		 AmountInvestment = 0.0;
		 RateIntrest = 0.0;
	 }

	 public Investment(double amt , double rat)
	 {
		 AmountInvestment = amt;
		 RateIntrest = rat;
	 }

	 /** Accesser method get
	 	getInvestmentAmt method return AmountInvestment
	 	getRateIntesret method return RateIntrest
	 */
	 public double getInvestmentAmt()
	 {
		 return AmountInvestment;
	 }

	 public double getRateIntesret()
	 {
		return  RateIntrest;
	 }

	// declar mutator method
	 public void setInvestmentamt(double inv)
	 {
		AmountInvestment = inv;
	 }

	 public void setRateIntrest(double rate)
	 {
		  RateIntrest = rate;
	 }

	// declare futureValue method
	 public double futureValue(int yr)
	 {
		 double futureVal = Math.pow( (1 + RateIntrest), yr);
	     double result = futureVal * AmountInvestment;
		 return result;
	 }

	// declare toString method
	  public String toString()
	 {
	 	return "Investment is: " + AmountInvestment + "Interest Rate is : " +  RateIntrest;
	 }

	// declare equals method
	public boolean equals(Object o)
	{
		if(!(o instanceof Investment ))
		{
			return false;
		}
		else
		{
			Investment objInv = (Investment) o;
			if(AmountInvestment == objInv.AmountInvestment && RateIntrest == objInv.RateIntrest )
				return true;
			else
				return false;
		}
	}

	// class main method for testing
 	public static void main(String [] args)
 	{
		//class calling empty constructor
		Investment inv = new Investment();
		System.out.println("Initial values: "+ "Investment Amount : " + inv.getInvestmentAmt() +" " +  "Interest Rate : " +inv.getRateIntesret());

		//class calling incliding constructor parameter
		Investment in = new Investment(2000,2.5);

		// getter method
		in.getInvestmentAmt();
		in.getRateIntesret();
		System.out.println(" getter values: "+ "Investment Amount : " + in.getInvestmentAmt() +" " +  "Interest Rate : " +in.getRateIntesret());

		// using setter method
		in.setInvestmentamt(2000);
		in.setRateIntrest(0.05);

		System.out.println("Set values: "+ "Investment Amount : " + in.getInvestmentAmt() +" " +  "Interest Rate : " +in.getRateIntesret());

		// using user define method
		System.out.println( "Future Value : " + " " + in.futureValue(2));

		// testing toString method
		System.out.println("Testing toString Method :" + in.toString());

		//Testing equls method
		Investment fv = new Investment(2000,2.5);
		System.out.println(fv);
		if(fv.equals(in))
		{
			System.out.println("this both are equal");
		}
		else
		{
			System.out.println("this both are not equal");
		}

		//Testing equls method
		Investment fval = new Investment(3000,0.25);
		System.out.println(fval);
		if(fval.equals(in))
		{
			System.out.println("this both are equal");
		}
		else
		{
			System.out.println("this both are not equal");
		}


System.out.println(Seasons.fall.ordinal());

	}
}