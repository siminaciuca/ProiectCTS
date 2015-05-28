package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import DesignPatterns.DesignPatterns;


public class getDiscountStrategyTest1 {

	@Test
	public void test() {
		DesignPatterns dp = new DesignPatterns();
		assertEquals("nodiscount", dp.getStrategy(true, false, false, false));
	}

}
