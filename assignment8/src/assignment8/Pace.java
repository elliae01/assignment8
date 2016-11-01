package assignment8;

public class Pace {
	double pace = 0.0;

	public Pace() {

	}

	public double calculate(double time, double distance) {
		pace = time/distance;

		return pace;
	}
}
