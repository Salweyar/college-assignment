public class Sorter
{
	public static void selectionSort( int [ ] temperature )
	{
		int temp;
		int max;

		for ( int i = 0; i < temperature.length - 1; i++ )
		{
			max = indexOfLargestElement( temperature, temperature.length - i );

			temp = temperature[max];
			temperature[max] = temperature[temperature.length - i - 1];
			temperature[temperature.length - i - 1] = temp;
		}
	}

	private static int indexOfLargestElement( int [ ] temperature, int size )
	{
		int index = 0;
		for ( int i = 1; i < size; i ++ )
		{
			if ( temperature[i] > temperature[index] )
				index = i;
		}

		return index;
	}
}