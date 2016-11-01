package assignment8;

public class Time {

	double dTime = 0.0;

	public Time() {

	}

	public double calculate(double pace, double distance) {
		dTime = distance * pace;

		return dTime;
	}
}
