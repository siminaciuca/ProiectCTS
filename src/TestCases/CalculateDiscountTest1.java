package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import DesignPatterns.DesignPatterns;


public class CalculateDiscountTest1 {

	@Test
	public void testCalculateDiscount() {
		DesignPatterns dp = new DesignPatterns();
		assertEquals(100, dp.CalculateDiscount(100, "nodiscount"));
	}

}
