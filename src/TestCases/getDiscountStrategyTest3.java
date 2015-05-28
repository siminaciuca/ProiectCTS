package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import DesignPatterns.DesignPatterns;


public class getDiscountStrategyTest3 {

	@Test
	public void test() {
		DesignPatterns dp = new DesignPatterns();
		assertEquals("percentdiscount", dp.getStrategy(true, false, true, true));	}

}
