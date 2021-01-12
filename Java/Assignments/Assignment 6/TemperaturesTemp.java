public class TemperaturesTemp
{
	private int [] temperature;

	// Default constructor
	public Temperatures()
	{
		temperature = new int [7];
	}

	// Overloaded
	public Temperatures ( int [] startTemperature )
	{
		this.temperature = new int [temperature.length]
	}
	// Accessor
	public int [] getTemperature()
	{
		int [] temp = new int [temperature.length];

		for ( int i = 0; i < temperature.length; i++ )
			temp[i] = temperature[i];

		return temp;
	}

	// Mutator
	public Temperatures setTemperature( int [] temperature  )
	{
		for ( int i = 0; i < temperature.length; i++ )
			this.temperature[i] = temperature[i];
			return this;
	}

	// Data manupilation

	public String freezingWeather ()
	{
		int countFreezing = 0;
		for ( int i = 0; i < temperature.length; i++ )
		{
			if ( temperature[i] < 32 )
			{
				countFreezing++;

			}

		} return  "Number of below freezing weather :" + countFreezing ;
	}

	public int [] above100 ()
	{
		int countAbove100 = 0;
		int [] tempAbove100;
		for ( int i = 1; i < temperature.length; i++ )
		{
			if ( temperature[i] > 100 )
			{
				countAbove100++;
			}

		}
		tempAbove100 = new int [countAbove100];
		int j = 0;
		for ( int i = 1; i < temperature.length; i++ )
		{
			if ( temperature[i] > 100 )
			{
				tempAbove100[j] = temperature[i];
				j++;
			}
		}
		return tempAbove100;
	}
	public int  temperatureChange ()
	{
		int largestTempChange = Math.abs(temperature[0] - temperature[1]);
		for ( int i = 0; i < temperature.length - 1 ; i++)
		{
			if ( Math.abs( temperature[i] - temperature[i+1] ) > largestTempChange )
			{
				largestTempChange = Math.abs( temperature[i] - temperature[i+1] );
			}
		}
		return largestTempChange;
	}
	public int [] descendTemperature ()
	{
		int temp;
		int j;
		for( int i = 1; i <= temperature.length - 1; i++ )
		{
			j = i;
			temp = temperature[i];
			while ( ( j!= 0 ) && ( temp <=  temperature[j - 1]))
			{
				temperature[j] = temperature[j - 1];
				j--;
			}
			temperature[j] = temp;
		}
		return temperature;
	}
	@Override
	public String toString()
	{
		String returnValue = temperature + "n";
		for ( int i = 0; i < temperature.length; i++ )
		{
			returnValue += temperature[i];
		}
		return returnValue;
	}

	@Override
	public boolean equals( Object c )
	{
		if ( !( c instanceof Temperatures ) )
			return false;
		else
		{
			Temperatures objTemp = ( Temperatures ) c;
			if ( !(temperature == objTemp.temperature ) )
				return false;
			if ( temperature.length != objTemp.temperature.length )
				return false;
			for ( int i = 0; i < temperature.length; i++ )
			{
				if( temperature[i] != objTemp.temperature[i] )
					return false;
			}
		}
		return true;
	}
}




