/* Array of Cell Phone Bills
   Anderson, Franceschi
*/

public class CellBills
{
  public static void main( String [] args )
  {
     // declare and instantiate the array
     double [] cellBills = new double [6];
     double [] billsBackup = new double [6];
     double [] temp = new double [7];
     double [] bills1 = {45.24, 54.6, 42.55};
     double [] bills2 = {45.24, 54.6, 42.55};

     // assign values to array elements
     cellBills[0] = 45.24;
     cellBills[1] = 54.67;
     cellBills[2] = 42.55;
     cellBills[3] = 44.61;
     cellBills[4] = 65.29;
     cellBills[5] = 49.75;

     System.out.println( "The first monthly cell bill is "
                          + cellBills[0] );
     System.out.println( "The last monthly cell bill is "
                          + cellBills[cellBills.length - 1] );

	 double max = cellBills[0];
	 double min = cellBills[0];
	 double total = 0.0;
     System.out.println( "Element\tValue" );
     for( int i = 0; i < cellBills.length; i++ )
     {
		 System.out.println( i + "\t" + cellBills[i] );
		 total += cellBills[i];

		 if ( max > cellBills[i] )
		 	max = cellBills[i];

		 if ( min < cellBills[i] )
		 	min = cellBills[i];

		 billsBackup[i] = cellBills[i];
	 }

	 System.out.println( "Total =\t" + total );
	 System.out.println( "\nThe maximum cell bill is: " + min );
	 System.out.println(   "The minimum cell bill is: " + max );

	 System.out.println();
	 System.out.println("Backup Bills");
	 System.out.println("Element\tvalue");
	 for( int i = 0; i < billsBackup.length; i++ )
	 {
		 System.out.println( i + "\t" + billsBackup[i] );
	 }

	 for ( int i = 0; i < cellBills.length; i++ )
	 {
		 temp[i] = cellBills[i];
	 }
	 temp[6] = 99.99;

	 cellBills = temp;
	 temp = null;

	 System.out.println();
	 System.out.println("More Bills");
	 System.out.println("Element\tvalue");
	 for( int i = 0; i < cellBills.length; i++ )
     {
		 System.out.println( i + "\t" + cellBills[i] );
	 }

	boolean isEqual = true;
	if ( bills1.length != bills2.length )
	{
		isEqual = false;
	}
	else
	{
		for ( int i = 0; i < bills1.length; i++ )
		{
			if ( bills1[i] != bills2[i] )
			{
				isEqual = false;
				System.out.println("bills1[i] = " + bills1[i] );
				System.out.println("bills2[i] = " + bills2[i] );
			}
		}
	}
	System.out.println ( "Bills1 is equal to bills2: " + isEqual );




 }
}