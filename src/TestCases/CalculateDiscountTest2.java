package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import DesignPatterns.DesignPatterns;


public class CalculateDiscountTest2 {

	@Test
	public void test() {
		DesignPatterns dp = new DesignPatterns();
		assertEquals(1000, dp.CalculateDiscount(1100, "fixeddiscount"));
	}

}
