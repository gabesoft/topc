package topc.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import topc.test.easy.*;
import topc.test.math.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({ PrimePolynomTest.class })
public class Runner {
}
