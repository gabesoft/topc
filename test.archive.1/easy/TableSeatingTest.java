package topc.test.easy;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.easy.*;

public class TableSeatingTest  {
  final static double DELTA = 1e-9;
  private TableSeating _calc = new TableSeating();

  @Test
  public void testCase1() {
    int n = 4;
    int[] probs = { 100 };
    assertEquals(4.0, _calc.getExpected(n, probs), DELTA);
  }

  @Test
  public void testCase3() {
    int n = 12;
    int[] probs = { 9,9,9,9,9,9,9,9,9,9,10 };
    assertEquals(7.871087929710551, _calc.getExpected(n, probs), DELTA);
  }

  @Test
  public void testCase4() {
    int n = 2;
    int[] probs = { 25,75 };
    assertEquals(1.8125, _calc.getExpected(n, probs), DELTA);
  }

  @Test
  public void testCase5() {
    int n = 3;
    int[] probs = { 15,50,35 };
    assertEquals(2.4008749999999996, _calc.getExpected(n, probs), DELTA);
  }

  @Test
  public void testShouldGetBits() {
    assertArrayEquals(new int[] { 0,1,1 }, _calc.getBits(3, 3));
    assertArrayEquals(new int[] { 1,0,1,0,0,0,0,0,1 }, _calc.getBits(321, 9));
  }
}
