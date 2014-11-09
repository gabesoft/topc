package topc.test.easy;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.easy.*;

public class BridgeCrossingTest {
  BridgeCrossing _calc = new BridgeCrossing();

  @Test 
  public void testCase1() {
    int[] data = { 1,2,5,10 };
    assertEquals(17, _calc.minTime(data));
  }

  @Test 
  public void testCase2() {
    int[] data = { 1, 2, 3, 4, 5 };
    assertEquals(16, _calc.minTime(data));
  }

  @Test 
  public void testCase3() {
    int[] data = { 100 };
    assertEquals(100, _calc.minTime(data));
  }

  @Test 
  public void testCase4() {
    int[] data = { 1, 2, 3, 50, 99, 100 };
    assertEquals(162, _calc.minTime(data));
  }
}
