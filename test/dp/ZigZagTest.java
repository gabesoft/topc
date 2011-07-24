package topc.test.dp;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dp.*;

public class ZigZagTest {
  ZigZag _calc = new ZigZag();

  @Test 
  public void case1() {
    int[] data = { 1, 7, 4, 9, 2, 5 };
    assertEquals(6, _calc.longestZigZag(data));
  }

  @Test 
  public void case2() {
    int[] data = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
    assertEquals(7, _calc.longestZigZag(data));
  }

  @Test 
  public void case3() {
    int[] data = { 44 };
    assertEquals(1, _calc.longestZigZag(data));
  }

  @Test 
  public void case4() {
    int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals(2, _calc.longestZigZag(data));
  }

  @Test 
  public void case5() {
    int[] data = { 70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100, 19, 7, 5, 5, 5, 1000, 32, 32 };
    assertEquals(8, _calc.longestZigZag(data));
  }

  @Test 
  public void case6() {
    int[] data = { 
      374, 40, 854, 203, 203, 156, 362, 279, 812, 955, 
      600, 947, 978, 46, 100, 953, 670, 862, 568, 188, 
      67, 669, 810, 704, 52, 861, 49, 640, 370, 908, 
      477, 245, 413, 109, 659, 401, 483, 308, 609, 120, 
      249, 22, 176, 279, 23, 22, 617, 462, 459, 244 };
    assertEquals(36, _calc.longestZigZag(data));
  }
}
