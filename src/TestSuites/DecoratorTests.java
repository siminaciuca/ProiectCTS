package TestSuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TestCases.DecoratorAplicatiiTest;
import TestCases.DecoratorCaptusealaTest;
import TestCases.DecoratorNasturiTest;
import TestCases.DecoratorStofaTest;


@RunWith(Suite.class)
@SuiteClasses({ DecoratorAplicatiiTest.class, DecoratorCaptusealaTest.class,
		DecoratorNasturiTest.class, DecoratorStofaTest.class })
public class DecoratorTests {

}
