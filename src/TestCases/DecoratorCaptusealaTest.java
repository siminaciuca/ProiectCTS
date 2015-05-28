package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import DesignPatterns.DecoratorCaptuseala;
import DesignPatterns.DesignPatterns;


public class DecoratorCaptusealaTest {

	@Test
	public void test() {
		DesignPatterns dp = new DesignPatterns();
		assertTrue(dp.GenerateAndDecorate("Camasa", false, false, true, false) instanceof DecoratorCaptuseala);
	}

}
