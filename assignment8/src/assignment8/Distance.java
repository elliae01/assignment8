package assignment8;

public class Distance {
	double distance=0;
	
	public Distance() {

	}

	/**
	 * This procedure is to return a basic physics distance (d=rt)
	 * rate = distance / time  (i.e. mile/min)
	 * pace = 1/rate  (i.e. min/mile)
	 * @param pace as any unit 
	 * @param time as same time unit as pace
	 * @return distance as unit used in pace
	 */
	public double calculate(double pace, double time){
		distance=time/pace;
		return distance;
	}
}
