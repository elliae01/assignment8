package assignment8;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDistance {
	static Distance myDist;

	@BeforeClass 
	public static void setupBeforeClass()
	{
		 myDist = new Distance();
	}

	@Test
	public void testCalculateDistance1() {
		
		assertEquals(0,myDist.CalculateDistance(0, 0),0);
	}

	@Test
	public void testCalculateDistance2() {
		
		assertEquals(10,myDist.CalculateDistance(1, 10),0);
	}

}
