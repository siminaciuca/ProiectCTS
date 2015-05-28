package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import DesignPatterns.DecoratorAplicatii;
import DesignPatterns.DesignPatterns;


public class DecoratorAplicatiiTest {

	@Test
	public void test() {
		DesignPatterns dp = new DesignPatterns();
		assertTrue(dp.GenerateAndDecorate("Camasa", false, false, false, true) instanceof DecoratorAplicatii);
	}

}
