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
public class TestTime {
	Time time = new Time();
	
	@Test
	public void test_c1() {
		double pace = 6.92;  //  min/mile
		pace = 1/pace ; //miles/min
		double distance = 3.1;  // miles = 5k
		double expectedResult = 21.5; // min
		double actualResult = time.calculate(pace, distance);  // t=d/p  mi/min/mi
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c2() {
		double pace = 7.93; // min/mile
		pace = 1/pace ; //miles/min
		double distance = 13.1; // half marathon = 21.0975k
		double expectedResult = 103.95; // 1:43:57
		double actualResult = time.calculate(pace, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c3() {
		double pace = 7.0;  // min/mile
		pace = 1/pace ;  //miles/min
		double distance = 6.2; // 10k
		double expectedResult = 43.49666;
		double actualResult = time.calculate(pace, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
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
