package topc.test.dp;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dp.*;

public class AvoidRoadsTest {
  AvoidRoads _calc = new AvoidRoads();

  @Test 
  public void case1() {
    String[] bad = {"0 0 0 1","6 6 5 6"};
    assertEquals(252, _calc.numWays(6, 6, bad));
  }

  @Test 
  public void case2() {
    String[] bad = {};
    assertEquals(2, _calc.numWays(1, 1, bad));
  }

  @Test 
  public void case3() {
    String[] bad = {};
    assertEquals(6406484391866534976L, _calc.numWays(35, 31, bad));
  }

  @Test 
  public void case4() {
    String[] bad = {"0 0 1 0", "1 2 2 2", "1 1 2 1"};
    assertEquals(0, _calc.numWays(2, 2, bad));
  }
}
