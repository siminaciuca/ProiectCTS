package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TestCases.CalculateDiscountTest1;
import TestCases.CalculateDiscountTest2;
import TestCases.CalculateDiscountTest3;


@RunWith(Suite.class)
@SuiteClasses({ CalculateDiscountTest1.class, CalculateDiscountTest2.class,
		CalculateDiscountTest3.class })
public class CalculateTest {

}
