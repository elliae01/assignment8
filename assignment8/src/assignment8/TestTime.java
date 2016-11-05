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
 *Possible distances:
 *5k = 3.10686 miles
 *5m = 5 miles
 *10k = 6.21371 miles
 *half marathon = 13.1 miles
 */
public class TestTime {
	Time time = new Time();
	
	@Test
	public void test_c1() {
		double pace = 6.92;  // min/mile
		pace = 1/pace ; //miles/min
		double distance = 3.10686;  // 5k = 3.10686 miles
		double expectedResult = 0.4489; // hours
		double actualResult = time.calculate(pace, distance);  // t=d/p  mi/min/mi
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c2() {
		double pace = 7.93; // min/mile
		pace = 1/pace ; //miles/min
		double distance = 5.0; // 5 mile
		double expectedResult = 0.6305; // 1:43:57
		double actualResult = time.calculate(pace, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c3() {
		double pace = 7.0;  // min/mile
		pace = 1/pace ;  //miles/min
		double distance = 6.21371; // 10k = 6.21371 miles
		double expectedResult = 0.8876;
		double actualResult = time.calculate(pace, distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c4()
	{
		double pace = 0.1; // min/mile
		pace = 1 / pace; // miles/min
		double distance = 13.1; // half-marathon = 13.1 miles
		double expectedResult = 131.0;
		double actualResult = time.calculate(pace,  distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c5()
	{
		double pace = 20.0; // min/mile (upper bounds, valid data)
		pace = 1 / pace; // miles/min
		double distance = 5.0; // 5 miles
		double expectedResult = 0.25;
		double actualResult = time.calculate(pace,  distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c6()
	{
		double pace = 10.0; // min/mile
		pace = 1 / pace; // miles/min
		double distance = 13.1; // half marathon = 13.1 miles
		double expectedResult = 1.31;
		double actualResult = time.calculate(pace,  distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
	
	@Test
	public void test_c7()
	{
		double pace = 4.28; // min/mile
		pace = 1 / pace; // miles/min
		double distance = 3.10686; // 5k = 3.10686
		double expectedResult = 0.7259;
		double actualResult = time.calculate(pace,  distance);
		
		assertEquals(expectedResult, actualResult, 0.1);
	}
}

















