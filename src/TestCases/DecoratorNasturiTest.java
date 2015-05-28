package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import DesignPatterns.DecoratorNasturi;
import DesignPatterns.DesignPatterns;


public class DecoratorNasturiTest {

	@Test
	public void test() {
		DesignPatterns dp = new DesignPatterns();
		assertTrue(dp.GenerateAndDecorate("Camasa", false, true, false, false) instanceof DecoratorNasturi);
	}

}
