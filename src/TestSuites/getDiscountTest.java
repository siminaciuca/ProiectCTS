package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TestCases.getDiscountStrategyTest1;
import TestCases.getDiscountStrategyTest2;
import TestCases.getDiscountStrategyTest3;


@RunWith(Suite.class)
@SuiteClasses({ getDiscountStrategyTest1.class, getDiscountStrategyTest2.class,
		getDiscountStrategyTest3.class })
public class getDiscountTest {

}
