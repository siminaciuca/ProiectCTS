package TestCases;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import DesignPatterns.DecoratorStofa;
import DesignPatterns.DesignPatterns;


public class DecoratorStofaTest {

	@Test
	public void testGenerateAndDecorate() {
		DesignPatterns dp = new DesignPatterns();
		assertTrue(dp.GenerateAndDecorate("Camasa", true, false, false, false) instanceof DecoratorStofa);
	}

}
