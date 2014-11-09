package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class RegionsTest {
  Regions regions = new Regions();

  @Test
  public void case1() {
    int[] row = { 4, 2, 3 };
    int[] col = { 4, 2, 6 };
    assertEquals(7, regions.numTaxes(row, col));
  }

  @Test
  public void case2() {
    int[] row = { 0, 1000000000, 0 };
    int[] col = { 0, 1000000000, 0 };
    assertEquals(2000000000, regions.numTaxes(row, col));
  }

  @Test
  public void case3() {
    int[] row = { 0, 10, 10 };
    int[] col = { 0, 2, 2 };
    assertEquals(10, regions.numTaxes(row, col));
  }

  @Test
  public void case4() {
    int[] row = { 9, 0 };
    int[] col = { 0, 9 };
    assertEquals(9, regions.numTaxes(row, col));
  }

  @Test
  public void case5() {
    int[] row = { 0, 9 };
    int[] col = { 0, 9 };
    assertEquals(9, regions.numTaxes(row, col));
  }

  @Test
  public void case6() {
    int[] row = { 0, 9 };
    int[] col = { 0, 1 };
    assertEquals(9, regions.numTaxes(row, col));
  }

  @Test
  public void case7() {
    int[] row = { 0, 1000000000, 6 };
    int[] col = { 0, 999999999, 18 };
    assertEquals(-1, regions.numTaxes(row, col));
  }

  @Test
  public void case8() {
    int[] row = { 1000, 100000, 100000 };
    int[] col = { 0, 100000, 1000000000 };
    assertEquals(1000099000, regions.numTaxes(row, col));
  }

  @Test
  public void case9() {
    int[] row = { 1000, 100000, 100000 };
    int[] col = { 0, 101000, 1000000000 };
    assertEquals(1000098000, regions.numTaxes(row, col));
  }

  @Test
  public void case10() {
    int[] row = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 7 };
    int[] col = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 900, 900, 901 };
    assertEquals(811, regions.numTaxes(row, col));
  }

  @Test
  public void case11() {
    int[] row = { 1000, 100000, 100000 };
    int[] col = { 0, 100999, 1000000000 };
    assertEquals(1000099000, regions.numTaxes(row, col));
  }

  @Test
  public void case12() {
    int[] row = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 7 };
    int[] col = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 900, 900, 900 };
    assertEquals(810, regions.numTaxes(row, col));
  }

  @Test
  public void case13() {
    int[] row = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 900, 900, 900 };
    int[] col = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 7 };
    assertEquals(810, regions.numTaxes(row, col));
  }

  @Test
  public void case14() {
    int[] row = { 1, 1, 1 };
    int[] col = { 999999999, 999999999, 999999999 };
    assertEquals(0, regions.numTaxes(row, col));
  }

  @Test
  public void case15() {
    int[] row = { 1, 1, 1 };
    int[] col = { 999999999, 1, 999999999 };
    assertEquals(1999999996, regions.numTaxes(row, col));
  }

  @Test
  public void case16() {
    int[] row = { 1, 1, 1, 1 };
    int[] col = { 999999999, 1, 999999999, 2 };
    assertEquals(-1, regions.numTaxes(row, col));
  }

  @Test
  public void case17() {
    int[] row = { 999999999, 1, 999999999, 999999999 };
    int[] col = { 1, 1, 1, 5 };
    assertEquals(2000000000, regions.numTaxes(row, col));
  }

  @Test
  public void case18() {
    int[] row = { 999999999, 1, 999999999, 999999999 };
    int[] col = { 1, 1, 1, 6 };
    assertEquals(-1, regions.numTaxes(row, col));
  }

  @Test
  public void case19() {
    int[] row = { 345111111, 100234567, 123456, 654321 };
    int[] col = { 251435123, 412345123, 341235643, 123123123 };
    assertEquals(795650520, regions.numTaxes(row, col));
  }

  @Test
  public void case20() {
    int[] row = { 0, 1000000000, 6 };
    int[] col = { 0, 999999999, 18 };
    assertEquals(-1, regions.numTaxes(row, col));
  }

  @Test
  public void case21() {
    int[] row = { 4, 2, 3 };
    int[] col = { 4, 2, 6 };
    assertEquals(7, regions.numTaxes(row, col));
  }

  @Test
  public void case22() {
    int[] row = { 0, 10, 10 };
    int[] col = { 0, 2, 2 };
    assertEquals(10, regions.numTaxes(row, col));
  }

  @Test
  public void case23() {
    int[] row = { 55, 455, 86, 500, 500, 333, 444, 5, 834, 5, 999, 55, 455, 86, 500, 500, 333, 444, 5, 834, 5, 999, 5, 834, 5, 999, 55, 455, 500, 444, 456, 19, 300, 55, 89, 33, 100, 1, 2, 3, 4, 5, 6, 7, 866, 56, 111, 48, 444 };
    int[] col = { 43, 9, 86, 500, 500, 333, 333, 994, 934, 22, 82, 55, 455, 86, 500, 500, 333, 444, 5, 834, 5, 999, 4, 934, 22, 82, 55, 455, 99, 1000, 1, 2, 3, 4, 5, 99, 455, 333, 698, 453, 756, 243, 567, 44, 12, 15, 16, 88, 1000 };
    assertEquals(29428, regions.numTaxes(row, col));
  }

  @Test
  public void case24() {
    int[] row = { 0, 2, 0, 1, 1, 3 };
    int[] col = { 0, 2, 2, 0, 1, 30000 };
    assertEquals(30009, regions.numTaxes(row, col));
  }

  @Test
  public void case25() {
    int[] row = { 5, 9 };
    int[] col = { 6, 10 };
    assertEquals(4, regions.numTaxes(row, col));
  }

  @Test
  public void case26() {
    int[] row = { 0, 2 };
    int[] col = { 0, 10 };
    assertEquals(10, regions.numTaxes(row, col));
  }

  @Test
  public void case27() {
    int[] row = { 0, 100000000 };
    int[] col = { 0, 100000000 };
    assertEquals(100000000, regions.numTaxes(row, col));
  }

  @Test
  public void case28() {
    int[] row = { 0, 50 };
    int[] col = { 0, 38 };
    assertEquals(86, regions.numTaxes(row, col));
  }

  @Test
  public void case29() {
    int[] row = { 321654987, 326598741, 1354689, 321654987, 12326547, 6546313, 6587313, 513847, 1681, 654987333, 1, 2 };
    int[] col = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 2, 321654 };
    assertEquals(-1, regions.numTaxes(row, col));
  }

  @Test
  public void case30() {
    int[] row = { 0, 3 };
    int[] col = { 0, 5 };
    assertEquals(7, regions.numTaxes(row, col));
  }

  @Test
  public void case31() {
    int[] row = { 0, 4 };
    int[] col = { 0, 6 };
    assertEquals(10, regions.numTaxes(row, col));
  }

  @Test
  public void case32() {
    int[] row = { 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000 };
    int[] col = { 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000 };
    assertEquals(-1, regions.numTaxes(row, col));
  }

  @Test
  public void case33() {
    int[] row = { 321, 3, 21, 18, 4, 7, 11, 13, 16, 79 };
    int[] col = { 0, 2, 7, 11115, 12, 14, 19, 1, 7, 6 };
    assertEquals(22673, regions.numTaxes(row, col));
  }

  @Test
  public void case34() {
    int[] row = { 1, 2 };
    int[] col = { 1, 6 };
    assertEquals(5, regions.numTaxes(row, col));
  }

  @Test
  public void case35() {
    int[] row = { 0, 6 };
    int[] col = { 0, 20 };
    assertEquals(26, regions.numTaxes(row, col));
  }

  @Test
  public void case36() {
    int[] row = { 0, 1, 2, 3, 4, 5, 34543, 4343, 345345, 6747, 7436, 436, 34 };
    int[] col = { 0, 2, 5, 9, 14, 20, 23478, 3245, 765, 64250, 64250, 3245, 34 };
    assertEquals(926322, regions.numTaxes(row, col));
  }

  @Test
  public void case37() {
    int[] row = { 4, 2, 3, 0, 10, 10 };
    int[] col = { 4, 2, 6, 0, 2, 2 };
    assertEquals(26, regions.numTaxes(row, col));
  }

  @Test
  public void case38() {
    int[] row = { 0, 2, 777777700 };
    int[] col = { 0, 4, 777777700 };
    assertEquals(1555555400, regions.numTaxes(row, col));
  }

  @Test
  public void case39() {
    int[] row = { 0, 65536 };
    int[] col = { 0, 65536 };
    assertEquals(65536, regions.numTaxes(row, col));
  }

  @Test
  public void case40() {
    int[] row = { 0, 1 };
    int[] col = { 0, 1 };
    assertEquals(1, regions.numTaxes(row, col));
  }

  @Test
  public void case41() {
    int[] row = { 0, 1000000000, 0, 100000000, 0, 100000000, 0, 9999999, 0, 99999992, 3, 99999994, 9873, 5186, 1873, 18438, 112 };
    int[] col = { 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 6548, 153, 4831, 13, 23, 4 };
    assertEquals(-1, regions.numTaxes(row, col));
  }

  @Test
  public void case42() {
    int[] row = { 0, 4 };
    int[] col = { 0, 2 };
    assertEquals(6, regions.numTaxes(row, col));
  }

  @Test
  public void case43() {
    int[] row = { 0, 5 };
    int[] col = { 0, 7 };
    assertEquals(11, regions.numTaxes(row, col));
  }

  @Test
  public void case44() {
    int[] row = { 42, 532553, 42424 };
    int[] col = { 242424, 525, 777 };
    assertEquals(1264784, regions.numTaxes(row, col));
  }

  @Test
  public void case45() {
    int[] row = { 0, 2 };
    int[] col = { 0, 4 };
    assertEquals(6, regions.numTaxes(row, col));
  }

  @Test
  public void case46() {
    int[] row = { 99999999, 0 };
    int[] col = { 99999997, 0 };
    assertEquals(199999995, regions.numTaxes(row, col));
  }

}
