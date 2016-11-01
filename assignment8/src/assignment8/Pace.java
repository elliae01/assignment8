package assignment8;

public class Pace {
	double pace = 0.0;

	public Pace() {

	}

	/**
	 * Note
	 * d=rt
	 * t=d/r
	 * r = d / t  (i.e. mile/min)
	 * pace = 1/r  (i.e. min/mile or t/d)
	 * @param time as any time unit 
	 * @param distance as any distance unit
	 * @return pace as units provided in both parameters
	 */
	public double calculate(double time, double distance) {
		pace = time/distance;

		return pace;
	}
}
