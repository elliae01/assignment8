/**
 * 
 */
package assignment8;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Aaron Elliott
 * This test class will do a simple test to see if calculations are correctly
 * for user input. These will be formatted to the nearest whole number and 
 * seconds to the nearest tenth.
 *
 */
public class TestUnitConverter {

	private static UnitConverter units;

	@BeforeClass
	public static void setupBeforeClass() {
		units = new UnitConverter();
	}
	@Test
	public void testAsHours() { 
		double time = 2; //time after utility class
		double expectedResult = 2; //after unit conversion calculation
		double actualResult = Double.parseDouble(units.asHours(time));

		assertEquals(expectedResult, actualResult, 0.1);
	}
	@Test
	public void testAsMinutes() { 
		double time = .4074193548; //time after utility class
		double expectedResult = 24; //after unit conversion calculation
		double actualResult = Double.parseDouble(units.asMinutes(time));

		assertEquals(expectedResult, actualResult, 0.1);
	}
	@Test
	public void testAsSeconds() { 
		double time = .2019489247; //time after utility class
		double expectedResult = 1.2; //after unit conversion calculation
		double actualResult = Double.parseDouble(units.asSeconds(time));

		assertEquals(expectedResult, actualResult, 0.1);
	}

}
