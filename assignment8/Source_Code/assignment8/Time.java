package assignment8;

public class Time {

	private double time = 0.0;

	public Time() {

	}

	/**
	 * Note d=rt, r=d/t, t=d/r
	 * pace = 1/rate  (i.e. min/mile or t/d)
	 * @param pace as any unit 
	 * @param distance as same unit used in pace
	 * @return time as same time unit in pace
	 */
	public double calculate(double pace, double distance) {
		time = distance * pace;

		return time;
	}
}
