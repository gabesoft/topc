package topc.test.dynamic;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dynamic.*;

public class BadNeighborsTest {
  BadNeighbors _calc = new BadNeighbors();

  @Test 
  public void case0() {
    int[] data = { 10, 3, 2, 5, 7, 8 };
    assertEquals(19, _calc.maxDonations(data));
  }

  @Test 
  public void case1() {
    int[] data = { 1, 10, 3, 2, 5, 7, 8 };
    assertEquals(23, _calc.maxDonations(data));
  }

  @Test 
  public void case2() {
    int[] data = { 11, 15 };
    assertEquals(15, _calc.maxDonations(data));
  }

  @Test 
  public void case3() {
    int[] data = { 7, 7, 7, 7, 7, 7, 7 };
    assertEquals(21, _calc.maxDonations(data));
  }

  @Test 
  public void case4() {
    int[] data = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
    assertEquals(16, _calc.maxDonations(data));
  }

  @Test 
  public void case5() {
    int[] data = { 5, 4, 3, 2, 1, 5, 4, 3, 2, 1 };
    assertEquals(16, _calc.maxDonations(data));
  }

  @Test 
  public void case6() {
    int[] data = { 
      94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61,  
      6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61, 397,
      52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72 };
    assertEquals(2926, _calc.maxDonations(data));
  }
}
