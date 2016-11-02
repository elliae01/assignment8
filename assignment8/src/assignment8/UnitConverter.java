package assignment8;

import java.text.DecimalFormat;

public class UnitConverter {
	
	DecimalFormat df = new DecimalFormat("0");
	DecimalFormat df2 = new DecimalFormat("0.0");
	
	public UnitConverter()
	{
		
	}

	public String asHours(double hours)
	{
		String time = df.format(hours);
		double sub=0;
		if(Double.parseDouble(time)>hours){
			sub=Double.parseDouble(time)-1;
		}
		else{
			sub=Double.parseDouble(time);
		}
		//sub=Math.round(sub*1)/D;
		time=df.format(sub);
		return time;
	}
	
	public String asMinutes(double minutes)
	{
		String time = df.format(minutes);
		
		double sub=0;
		if(Double.parseDouble(time)>minutes){
			sub=Double.parseDouble(time)-1;
		}
		else{
			sub=Double.parseDouble(time);
		}
		time=Double.toString(sub);
		if(Double.parseDouble(time)>minutes){
			minutes=Double.parseDouble(time)-minutes;
		}
		if(Double.parseDouble(time)<=minutes){
			minutes=minutes-Double.parseDouble(time);
		}
		
		minutes=Math.round(minutes/.1*6);
		
		time = df.format(minutes);
		return time;
	}
	
	public String asSeconds(double seconds)
	{
		String time = df.format(seconds);
		double sub=0;
		if(Double.parseDouble(time)>seconds){
			sub=Double.parseDouble(time)-1;
		}
		else{
			sub=Double.parseDouble(time);
		}
		time=Double.toString(sub);
		
		if(Double.parseDouble(time)>seconds){
		seconds=Double.parseDouble(time)-seconds;
		}
		if(Double.parseDouble(time)<=seconds){
		seconds=seconds-Double.parseDouble(time);
		}
		seconds=seconds/.1*6*60;
		//time = df2.format(seconds);
		if(seconds>=60){
			seconds=seconds%60;
			seconds=Math.round(seconds*100)/100D;
			//seconds=seconds%60;
		}
		return Double.toString(seconds);
	}
}

