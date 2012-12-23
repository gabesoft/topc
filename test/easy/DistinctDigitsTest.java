package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class DistinctDigitsTest {
  DistinctDigits distinctdigits = new DistinctDigits();

  @Test 
  public void case1() {
      int lo = 153697;
      int hi = 154689;
      assertEquals(318, distinctdigits.count(lo, hi));
  }

  @Test 
  public void case2() {
      int lo = 1000;
      int hi = 10000000;
      assertEquals(19159, distinctdigits.count(lo, hi));
  }

  @Test 
  public void case3() {
      int lo = 1;
      int hi = 15000;
      assertEquals(1641, distinctdigits.count(lo, hi));
  }

  @Test 
  public void case4() {
      int lo = 151;
      int hi = 309;
      assertEquals(98, distinctdigits.count(lo, hi));
  }

  @Test 
  public void case5() {
      int lo = 1;
      int hi = 30;
      assertEquals(29, distinctdigits.count(lo, hi));
  }
}
