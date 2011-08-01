package topc.test.easy;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.easy.*;

public class FibTest {
  Fib _calc = new Fib();

  @Test 
  public void case1() {
    assertEquals(8, _calc.calc(6));
  }

  @Test 
  public void case2() {
    assertEquals(12586269025L, _calc.calc(50));
  }
}
