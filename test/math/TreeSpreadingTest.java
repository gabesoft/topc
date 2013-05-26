package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TreeSpreadingTest {
  TreeSpreading treespreading = new TreeSpreading();

  @Test
  public void case1() {
    int a = 1;
    int b = 1;
    int c = 0;
    int d = 0;
    assertEquals(2L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case2() {
    int a = 2;
    int b = 2;
    int c = 0;
    int d = 0;
    assertEquals(2L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case3() {
    int a = 1;
    int b = 1;
    int c = 1;
    int d = 1;
    assertEquals(24L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case4() {
    int a = 3;
    int b = 2;
    int c = 1;
    int d = 1;
    assertEquals(96L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case5() {
    int a = 10;
    int b = 10;
    int c = 10;
    int d = 10;
    assertEquals(174702663548149248L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case6() {
    int a = 5;
    int b = 1;
    int c = 1;
    int d = 1;
    assertEquals(0L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case7() {
    int a = 9;
    int b = 10;
    int c = 8;
    int d = 7;
    assertEquals(173887297986990L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case8() {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    assertEquals(1074L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case9() {
    int a = 5;
    int b = 6;
    int c = 7;
    int d = 8;
    assertEquals(33170046582L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case10() {
    int a = 9;
    int b = 10;
    int c = 10;
    int d = 8;
    assertEquals(5475644741386140L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case11() {
    int a = 3;
    int b = 4;
    int c = 7;
    int d = 9;
    assertEquals(71903316L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case12() {
    int a = 7;
    int b = 8;
    int c = 9;
    int d = 10;
    assertEquals(173887297986990L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case13() {
    int a = 9;
    int b = 7;
    int c = 5;
    int d = 4;
    assertEquals(2552333100L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case14() {
    int a = 10;
    int b = 9;
    int c = 7;
    int d = 5;
    assertEquals(2161729439448L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case15() {
    int a = 10;
    int b = 8;
    int c = 7;
    int d = 1;
    assertEquals(78434892L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case16() {
    int a = 9;
    int b = 6;
    int c = 3;
    int d = 0;
    assertEquals(504L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case17() {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    assertEquals(1L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case18() {
    int a = 10;
    int b = 10;
    int c = 10;
    int d = 10;
    assertEquals(174702663548149248L, treespreading.countArrangements(a, b, c, d));
  }

  @Test
  public void case19() {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    assertEquals(1L, treespreading.countArrangements(a, b, c, d));
  }

}
