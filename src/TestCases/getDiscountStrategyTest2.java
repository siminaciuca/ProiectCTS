package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import DesignPatterns.DesignPatterns;


public class getDiscountStrategyTest2 {

	@Test
	public void test() {
		DesignPatterns dp = new DesignPatterns();
		assertEquals("fixeddiscount", dp.getStrategy(false, false, true, true));
	}

}
