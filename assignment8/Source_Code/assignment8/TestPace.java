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
 *
 * *Possible distances:
 *5k = 3.10686 miles
 *5m = 5 miles
 *10k = 6.21371 miles
 *half marathon = 13.1 miles
 */
public class TestPace {
	private Pace pace = new Pace();

	@Test
	public void testCase1() {
		double time = 0.18; // 10 minutes, 48 seconds
		double distance = 3.10686; // 5k = 3.10686 miles
		double expectedResult = 0.05793;
		double actualResult = pace.calculate(time, distance);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase2() {
		double time = 0.43; // 25 minutes, 48 seconds
		double distance = 5.0; // 5 miles
		double expectedResult = .086; // 7:55.8
		double actualResult = pace.calculate(time, distance);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase3() {
		double time = 43.49666; // Reverse of item 3
		double distance = 6.2; // 10k
		double expectedResult = 7.0; // Reverse of item 3
		double actualResult = pace.calculate(time, distance);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase4() {
		double time = 2.5; // 2 hours, 30 minutes
		double distance = 13.1; // Half-marathon = 13.1 miles
		double expectedResult = 0.1908;
		double actualResult = pace.calculate(time, distance);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase5() {
		double time = 1.0; // 1 hour
		double distance = 13.1; // Half- marathon = 13.1 miles
		double expectedResult = 0.0763;
		double actualResult = pace.calculate(time, distance);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase6() {
		double time = 0.81; // 48 minutes, 36 seconds
		double distance = 5.0; // 5 miles
		double expectedResult = 0.162;
		double actualResult = pace.calculate(time, distance);

		assertEquals(expectedResult, actualResult, 0.1);
	}

	@Test
	public void testCase7() {
		double time = 2.91; // 2 hours, 54 minutes, 36 seconds
		double distance = 30.0;
		double expectedResult = 0.097;
		double actualResult = pace.calculate(time, distance);

		assertEquals(expectedResult, actualResult, 0.1);
	}
}
