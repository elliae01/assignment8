package assignment8;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *Client
 *Item 1 = For a 5K event, I ran a time of 21:30 resulting in a pace of 6:55.2 minutes/mile
 *Item 2 = For a half-marathon event, I ran a time of 1:43:57 resulting in a pace of 7:55.8  minutes/mile .
 *Item 3 = In training for a 10K, I wanted to run a 7:00 minute pace resulting in a time of 43:29.8 minutes.
 *
 *2 examples
 *Pace - 6:55.9, 6:54.6
 *Distance - 5K, 5K
 *Time - 21:32, 21:28
 */
public class TestPace {
	private Pace pace = new Pace();
	
	@Test
	public void test_c1() {
		double time = 21.5;
		double distance = 3.1;
		double expectedResult = 6.92;
		double actualResult = pace.calculate(time, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c2() {
		double time = 103.95; //1:43:57
		double distance = 13.1094; // half marathon = 21.0975k
		double expectedResult =7.92; // 7:55.8
		double actualResult = pace.calculate(time, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c3() {
		double time =  43.49666; // Reverse of item 3
		double distance = 6.2; // 10k
		double expectedResult =7; // Reverse of item 3
		double actualResult = pace.calculate(time, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
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
