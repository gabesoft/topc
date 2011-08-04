package topc.test.dp;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dp.*;

public class QuickSumsTest {
  QuickSums _calc = new QuickSums();

  @Test 
  public void case1() {
    assertEquals(1, _calc.minSums("303", 6));
  }

  @Test 
  public void case2() {
    assertEquals(4, _calc.minSums("99999", 45));
  }

  @Test 
  public void case3() {
    assertEquals(3, _calc.minSums("1110", 3));
  }

  @Test 
  public void case4() {
    assertEquals(8, _calc.minSums("0123456789", 45));
  }

  @Test 
  public void case5() {
    assertEquals(-1, _calc.minSums("99999", 100));
  }

  @Test 
  public void case6() {
    assertEquals(2, _calc.minSums("382834", 100));
  }

  @Test 
  public void case7() {
    assertEquals(4, _calc.minSums("9230560001", 71));
  }

  @Test 
  public void case8() {
    assertEquals(1, _calc.minSums("9601", 610));
  }

  @Test 
  public void case9() {
    assertEquals(1, _calc.minSums("9600", 609));
  }

  @Test 
  public void case10() {
    assertEquals(3, _calc.minSums("9106201", 73));
  }

  @Test 
  public void case11() {
    assertEquals(2, _calc.minSums("16201", 64));
  }

  @Test
  public void case12() {
    assertEquals(2, _calc.minSums("111", 3));
  }

  @Test
  public void case13() {
    assertEquals(9, _calc.minSums("1111111111", 10));
  }

  @Test
  public void case14() {
    assertEquals(9, _calc.minSums("1212121212", 15));
  }

  @Test
  public void case15() {
    assertEquals(9, _calc.minSums("1213121712", 21));
  }

  @Test
  public void case150() {
    assertEquals(6, _calc.minSums("0123456789", 81));
  }

  @Test
  public void case151() {
    assertEquals(-1, _calc.minSums("8833614925", 100));
  }

  @Test
  public void case16() {
    assertEquals(-1, _calc.minSums("0525222922", 93));
  }

  @Test
  public void case17() {
    assertEquals(-1, _calc.minSums("3769558148", 99));
  }

  @Test
  public void case18() {
    assertEquals(-1, _calc.minSums("1210102121", 100));
  }

  @Test
  public void case19() {
    assertEquals(4, _calc.minSums("0220120200", 63));
  }

  @Test
  public void case20() {
    assertEquals(0, _calc.minSums("0000000001", 1));
  }

  @Test
  public void case21() {
    assertEquals(1, _calc.minSums("1000000000", 1));
  }

  @Test
  public void case22() {
    assertEquals(1, _calc.minSums("1000000001", 2));
  }

  @Test
  public void case23() {
    assertEquals(1, _calc.minSums("1000000001", 11));
  }

  @Test
  public void case24() {
    assertEquals(2, _calc.minSums("1001098", 100));
  }

  @Test
  public void case25() {
    assertEquals(-1, _calc.minSums("99999", 100));
  }

  @Test
  public void case26() {
    assertEquals(2, _calc.minSums("382834", 100));
  }

  @Test
  public void case27() {
    assertEquals(3, _calc.minSums("1110", 3));
  }

  @Test
  public void case28() {
    assertEquals(0, _calc.minSums("1", 1));
  }
}
