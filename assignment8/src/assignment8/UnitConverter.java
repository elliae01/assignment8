package assignment8;

public class UnitConverter {
	
	public UnitConverter()
	{
		
	}

	public double asHours(double hours, double minutes, double seconds)
	{
		double time = hours + (minutes / 60) + (seconds / 3600);
		return time;
	}
	
	public double asMinutes(double hours, double minutes, double seconds)
	{
		double time = (hours * 60) + minutes + (seconds / 60);
		return time;
	}
	
	public double asSeconds(double hours, double minutes, double seconds)
	{
		double time = (hours * 3600) + (minutes * 60) + seconds;
		return time;
	}
}
