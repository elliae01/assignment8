package assignment8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTime {
	Time time = new Time();
	
	@Test
	public void test() {
		double pace = 6.7;
		double distance = 15.0;
		double expectedResult = 2.23;
		double actualResult = time.calculate(pace, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_2() {
		double pace = 10.2;
		double distance = 5.0;
		double expectedResult = 0.49;
		double actualResult = time.calculate(pace, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_3() {
		double pace = 3.2;
		double distance = 25.0;
		double expectedResult = 7.8125;
		double actualResult = time.calculate(pace, distance);

		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_4() {
		double pace = 4.8;
		double distance = 20.0;
		double expectedResult = 4.166;
		double actualResult = time.calculate(pace, distance);	
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
}
