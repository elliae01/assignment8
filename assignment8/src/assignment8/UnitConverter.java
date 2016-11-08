package assignment8;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class UnitConverter {

	private DecimalFormat df = new DecimalFormat("0");
	private DecimalFormat df2 = new DecimalFormat("#.#");

	public UnitConverter() {

	}

	public String asHours(double hours) {
		hours = hours / .1;
		hours = hours * 6;
		hours = hours / 60;
		df.setRoundingMode(RoundingMode.DOWN);
		String time = df.format(hours);
		return time;
	}

	public String asMinutes(double minutes) {
		minutes = minutes * 6;
        minutes = minutes *10;
		if(minutes>60){
			minutes=minutes%60;
		}
		
		//df.setRoundingMode(RoundingMode.HALF_EVEN);
		String time = df.format(minutes);
		return time;
	}

	public String asSeconds(double seconds) {
	    seconds = seconds * 6;
		if(seconds<1){
			seconds = seconds * 6;
			seconds = seconds * 100;
		}

		if(seconds>60){
			seconds=seconds%60;
		}
		df2.setRoundingMode(RoundingMode.DOWN);
		
		String time = df2.format(seconds);
		return time;
	}
}
