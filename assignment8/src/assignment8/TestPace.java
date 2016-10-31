package assignment8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPace {
	private Pace pace = new Pace();
	
	@Test
	public void test() {
		double time = 2.73;
		double distance = 15.0;
		double expectedResult = 5.49;
		double actualResult = pace.calculate(time, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_2() {
		double time = 5.12;
		double distance = 25.0;
		double expectedResult = 4.88;
		double actualResult = pace.calculate(time, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_3() {
		double time = 0.81;
		double distance = 5.0;
		double expectedResult = 6.17;
		double actualResult = pace.calculate(time, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_4() {
		double time = 2.91;
		double distance = 30.0;
		double expectedResult = 10.3;
		double actualResult = pace.calculate(time, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
}
