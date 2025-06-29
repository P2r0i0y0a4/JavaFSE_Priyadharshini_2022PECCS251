package advanceTest2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.CalculatorFixtureTest;
import com.example.CalculatorTest;
import com.example.test.MySimpleTest;
import com.example.tests.AssertionsTest;

import advancedTesting.EvenCheckerTest;

@RunWith(Suite.class)
@SuiteClasses({
MySimpleTest.class,
CalculatorTest.class,
AssertionsTest.class,
CalculatorFixtureTest.class,
EvenCheckerTest.class
})
public class AllTests {
    // This class remains empty.

}
