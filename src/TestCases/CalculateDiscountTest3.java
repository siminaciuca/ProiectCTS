package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import DesignPatterns.DesignPatterns;


public class CalculateDiscountTest3 {

	@Test
	public void test() {
		DesignPatterns dp = new DesignPatterns();
		assertEquals(95, dp.CalculateDiscount(100, "percentdiscount"));
	}

}
