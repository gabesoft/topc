package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class RedBlack2Test {
  RedBlack2 redblack = new RedBlack2();

  @Test
  public void case1() {
    int[] keys = { 1, 2, 3 };
    assertEquals(1, redblack.numTwists(keys));
  }

  @Test
  public void case2() {
    int[] keys = { 1, 2, 3, 4, 5, 6, 7 };
    assertEquals(4, redblack.numTwists(keys));
  }

  @Test
  public void case3() {
    int[] keys = { 7, 1, 4, 6, 3, 5, 2 };
    assertEquals(3, redblack.numTwists(keys));
  }

  @Test
  public void case4() {
    int[] keys = { 2, 1, 3, 4 };
    assertEquals(1, redblack.numTwists(keys));
  }

  @Test
  public void case5() {
    int[] keys = { 1 };
    assertEquals(0, redblack.numTwists(keys));
  }

  @Test
  public void case6() {
    int[] keys = { 5, 10, 15, 14, 3, 4, 11, 2, 1, 12, 6, 9, 7, 13, 8 };
    assertEquals(11, redblack.numTwists(keys));
  }

  @Test
  public void case7() {
    int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(42, redblack.numTwists(keys));
  }

  @Test
  public void case8() {
    int[] keys = { 7, 5, 6, 4, 13, 1, 3, 10, 15, 2, 8, 9, 11, 12, 14 };
    assertEquals(11, redblack.numTwists(keys));
  }

  @Test
  public void case9() {
    int[] keys = { 31, 6, 20, 8, 21, 28, 15, 14, 5, 30, 25, 13, 19, 9, 12, 22, 18, 2, 27, 10, 3, 24, 26, 7, 11, 16, 17, 32, 29, 1, 33, 23, 4 };
    assertEquals(25, redblack.numTwists(keys));
  }

  @Test
  public void case10() {
    int[] keys = { 1, 20, 2, 19, 3, 18, 4, 17, 5, 16, 6, 15, 7, 14, 8, 13, 9, 12, 10, 11 };
    assertEquals(14, redblack.numTwists(keys));
  }

  @Test
  public void case11() {
    int[] keys = { 10, 9, 11, 8, 12, 7, 13, 6, 14, 5, 15, 4, 16, 3, 17, 2, 18, 1, 19 };
    assertEquals(11, redblack.numTwists(keys));
  }

  @Test
  public void case12() {
    int[] keys = { 8, 4, 12, 2, 10, 6, 14, 1, 9, 7, 15, 5, 11, 3, 13 };
    assertEquals(5, redblack.numTwists(keys));
  }

  @Test
  public void case13() {
    int[] keys = { 2, 4, 9, 7, 10, 6, 8, 1, 5, 3 };
    assertEquals(2, redblack.numTwists(keys));
  }

  @Test
  public void case14() {
    int[] keys = { 8, 7, 10, 5, 1, 3, 6, 12, 11, 13, 2, 9, 4 };
    assertEquals(3, redblack.numTwists(keys));
  }

  @Test
  public void case15() {
    int[] keys = { 15, 2, 9, 5, 3, 13, 11, 7, 8, 14, 1, 16, 4, 6, 10, 12 };
    assertEquals(5, redblack.numTwists(keys));
  }

  @Test
  public void case16() {
    int[] keys = { 6, 8, 10, 12, 4, 2, 18, 14, 16, 19, 7, 15, 9, 17, 13, 5, 11, 3, 1 };
    assertEquals(5, redblack.numTwists(keys));
  }

  @Test
  public void case17() {
    int[] keys = { 7, 6, 13, 10, 17, 8, 5, 16, 18, 14, 3, 9, 4, 11, 1, 19, 12, 2, 15 };
    assertEquals(14, redblack.numTwists(keys));
  }

  @Test
  public void case18() {
    int[] keys = { 3, 13, 6, 5, 9, 14, 12, 11, 8, 2, 4, 1, 17, 7, 15, 16, 10 };
    assertEquals(12, redblack.numTwists(keys));
  }

  @Test
  public void case19() {
    int[] keys = { 5, 4, 6, 9, 3, 1, 8, 2, 7 };
    assertEquals(5, redblack.numTwists(keys));
  }

  @Test
  public void case20() {
    int[] keys = { 29, 15, 18, 25, 16, 7, 12, 28, 34, 35, 3, 27, 33, 6, 21, 24, 30, 31, 26, 23, 11, 10, 14, 1, 17, 4, 5, 9, 32, 20, 13, 19, 8, 22, 2 };
    assertEquals(29, redblack.numTwists(keys));
  }

  @Test
  public void case21() {
    int[] keys = { 25, 7, 16, 33, 1, 19, 30, 13, 12, 29, 28, 34, 39, 41, 38, 22, 11, 32, 26, 14, 31, 23, 37, 6, 40, 21, 24, 10, 5, 17, 36, 35, 15, 2, 4, 3, 9, 8, 18, 20, 27 };
    assertEquals(32, redblack.numTwists(keys));
  }

  @Test
  public void case22() {
    int[] keys = { 3, 26, 38, 21, 39, 6, 16, 46, 15, 27, 20, 14, 50, 32, 24, 19, 33, 37, 17, 29, 18, 11, 36, 25, 48, 49, 5, 7, 13, 35, 28, 45, 10, 4, 31, 34, 44, 40, 22, 43, 41, 9, 1, 47, 12, 8, 2, 23, 30, 42 };
    assertEquals(38, redblack.numTwists(keys));
  }

  @Test
  public void case23() {
    int[] keys = { 2, 16, 8, 40, 42, 33, 25, 15, 1, 4, 6, 17, 41, 31, 49, 19, 10, 50, 13, 12, 35, 23, 29, 37, 21, 18, 7, 38, 14, 24, 39, 46, 5, 28, 32, 47, 26, 11, 9, 20, 27, 3, 44, 45, 22, 48, 43, 34, 30, 36 };
    assertEquals(20, redblack.numTwists(keys));
  }

  @Test
  public void case24() {
    int[] keys = { 19, 12, 17, 6, 2, 8, 23, 10, 14, 21, 3, 15, 25, 27, 1, 13, 4, 11, 16, 22, 9, 20, 24, 7, 26, 5, 18 };
    assertEquals(9, redblack.numTwists(keys));
  }

  @Test
  public void case25() {
    int[] keys = { 6, 8, 20, 21, 4, 23, 18, 28, 36, 32, 26, 22, 16, 24, 34, 12, 10, 15, 25, 40, 2, 7, 19, 29, 1, 11, 9, 14, 31, 5, 38, 3, 27, 30, 17, 35, 13, 39, 33, 37 };
    assertEquals(14, redblack.numTwists(keys));
  }

  @Test
  public void case26() {
    int[] keys = { 2, 1, 3 };
    assertEquals(0, redblack.numTwists(keys));
  }

  @Test
  public void case27() {
    int[] keys = { 5, 10, 15, 14, 3, 4, 11, 2, 1, 12, 6, 9, 7, 13, 8, 19, 18, 17, 16, 20, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 21, 22, 23, 24, 25, 26, 27, 28, 29, 41, 43, 45, 47, 49, 50, 48, 46, 44, 42 };
    assertEquals(37, redblack.numTwists(keys));
  }

}
