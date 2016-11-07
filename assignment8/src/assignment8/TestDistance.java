package assignment8;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
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
public class TestDistance {
	private static Distance myDist;

	@BeforeClass
	public static void setupBeforeClass() {
		myDist = new Distance();
	}

	@Test
	public void testCase1() {
		double pace = 6.92; // Reverse of item 3
		double time = 21.5; // 10k
		double expectedResult = 3.1; // Reverse of item 3
		double actualResult = myDist.calculate(pace, time);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase2() {
		double pace = 7.92; // 7:55.8
		double time = 103.95; // 1:43:57
		double expectedResult = 13.1094; // half marathon = 21.0975k
		double actualResult = myDist.calculate(pace, time);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase3() {
		double pace = 7.0;
		double time = 43.49666;
		double expectedResult = 6.2;
		double actualResult = myDist.calculate(pace, time);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase4() {
		double pace = 7.0; // min mile
		double time = 60; // min
		double expectedResult = 8.57;
		double actualResult = myDist.calculate(pace, time);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase5() {
		double pace = 1.0;
		double time = 10;
		double expectedResult = 10;
		double actualResult = myDist.calculate(pace, time);

		assertEquals(expectedResult, actualResult, 0.1);
	}
}
