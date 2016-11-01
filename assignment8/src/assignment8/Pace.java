package assignment8;

public class Pace {
	double dPace = 0.0;

	public Pace() {

	}

	public double calculate(double dTime, double dDistance) {
		dPace = dTime/dDistance;

		return dPace;
	}
}
