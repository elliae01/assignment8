package assignment8;

public class Distance {

	static double dDistance;
	
	public Distance() {
		dDistance=0;
	}

	/**
	 * This procedure is to return a basic physics distance over time * time
	 * @param dPace as meters per second
	 * @param dTime as seconds
	 * @return distance in meters
	 */
	public double CalculateDistance(double dPace, double dTime){
		double dDist;
		dDist=dTime/dPace;
		return dDist;
	}
}
