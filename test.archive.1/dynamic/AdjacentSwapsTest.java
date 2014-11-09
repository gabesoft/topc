package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class AdjacentSwapsTest {
  AdjacentSwaps adjacentswaps = new AdjacentSwaps();

  @Test
  public void case1() {
    int[] p = { 1, 2, 0 };
    assertEquals(1, adjacentswaps.theCount(p));
  }

  @Test
  public void case2() {
    int[] p = { 0, 1 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case3() {
    int[] p = { 2, 0, 3, 1 };
    assertEquals(2, adjacentswaps.theCount(p));
  }

  @Test
  public void case4() {
    int[] p = { 1, 0, 3, 2 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case5() {
    int[] p = { 1, 3, 0, 5, 2, 7, 4, 8, 10, 6, 12, 9, 14, 11, 16, 13, 18, 15, 19, 17 };
    assertEquals(716743312, adjacentswaps.theCount(p));
  }

  @Test
  public void case6() {
    int[] p = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 0 };
    assertEquals(1, adjacentswaps.theCount(p));
  }

  @Test
  public void case7() {
    int[] p = { 49, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48 };
    assertEquals(1, adjacentswaps.theCount(p));
  }

  @Test
  public void case8() {
    int[] p = { 25, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 24 };
    assertEquals(603457371, adjacentswaps.theCount(p));
  }

  @Test
  public void case9() {
    int[] p = { 1, 3, 0, 5, 2, 7, 4, 9, 6, 11, 8, 13, 10, 15, 12, 17, 14, 19, 16, 21, 18, 23, 20, 25, 22, 27, 24, 29, 26, 31, 28, 33, 30, 35, 32, 37, 34, 39, 36, 41, 38, 43, 40, 45, 42, 47, 44, 49, 46, 48 };
    assertEquals(752033767, adjacentswaps.theCount(p));
  }

  @Test
  public void case10() {
    int[] p = { 2, 0, 4, 1, 7, 3, 5, 8, 10, 6, 12, 9, 14, 11, 18, 13, 15, 16, 19, 20, 21, 23, 17, 24, 26, 22, 28, 25, 30, 27, 32, 29, 35, 31, 33, 38, 34, 36, 42, 37, 39, 40, 45, 41, 43, 46, 48, 44, 49, 47 };
    assertEquals(441399938, adjacentswaps.theCount(p));
  }

  @Test
  public void case11() {
    int[] p = { 2, 0, 5, 1, 3, 7, 4, 10, 6, 8, 12, 9, 13, 15, 11, 16, 17, 19, 14, 20, 22, 18, 24, 21, 27, 23, 25, 28, 30, 26, 32, 29, 35, 31, 33, 36, 37, 39, 34, 43, 38, 40, 41, 45, 42, 46, 48, 44, 49, 47 };
    assertEquals(147827764, adjacentswaps.theCount(p));
  }

  @Test
  public void case12() {
    int[] p = { 1, 3, 0, 7, 2, 4, 5, 8, 11, 6, 9, 12, 13, 15, 10, 17, 14, 19, 16, 20, 22, 18, 24, 21, 26, 23, 30, 25, 27, 28, 32, 29, 33, 37, 31, 34, 35, 39, 36, 40, 42, 38, 44, 41, 46, 43, 48, 45, 49, 47 };
    assertEquals(214963602, adjacentswaps.theCount(p));
  }

  @Test
  public void case13() {
    int[] p = { 1, 4, 0, 2, 6, 3, 10, 5, 7, 8, 13, 9, 11, 14, 15, 16, 18, 12, 21, 17, 19, 23, 20, 24, 25, 27, 22, 29, 26, 31, 28, 34, 30, 32, 36, 33, 38, 35, 40, 37, 43, 39, 41, 46, 42, 44, 47, 49, 45, 48 };
    assertEquals(823011398, adjacentswaps.theCount(p));
  }

  @Test
  public void case14() {
    int[] p = { 1, 4, 0, 2, 7, 3, 5, 8, 10, 6, 11, 12, 15, 9, 13, 16, 17, 19, 14, 21, 18, 22, 24, 20, 26, 23, 27, 28, 30, 25, 32, 29, 34, 31, 37, 33, 35, 40, 36, 38, 41, 43, 39, 44, 46, 42, 47, 49, 45, 48 };
    assertEquals(484244627, adjacentswaps.theCount(p));
  }

  @Test
  public void case15() {
    int[] p = { 1, 2, 5, 0, 3, 6, 7, 10, 4, 8, 11, 14, 9, 12, 15, 17, 13, 18, 20, 16, 22, 19, 23, 26, 21, 24, 27, 28, 29, 32, 25, 30, 34, 31, 33 };
    assertEquals(356272846, adjacentswaps.theCount(p));
  }

  @Test
  public void case16() {
    int[] p = { 1, 2, 3, 6, 0, 4, 7, 9, 5, 11, 8, 12, 14, 10, 15, 17, 13, 18, 20, 16, 21, 19 };
    assertEquals(358651819, adjacentswaps.theCount(p));
  }

  @Test
  public void case17() {
    int[] p = { 1, 2, 3, 5, 0, 6, 8, 4, 11, 7, 9, 10 };
    assertEquals(28755, adjacentswaps.theCount(p));
  }

  @Test
  public void case18() {
    int[] p = { 1, 3, 0, 4, 2 };
    assertEquals(5, adjacentswaps.theCount(p));
  }

  @Test
  public void case19() {
    int[] p = { 2, 0, 4, 1, 6, 3, 7, 9, 5, 11, 8, 13, 10, 12 };
    assertEquals(14253227, adjacentswaps.theCount(p));
  }

  @Test
  public void case20() {
    int[] p = { 13, 6, 27, 7, 44, 9, 43, 11, 34, 25, 10, 17, 37, 45, 41, 22, 18, 26, 49, 0, 19, 20, 8, 40, 36, 3, 29, 33, 2, 31, 35, 16, 39, 15, 47, 38, 42, 46, 14, 12, 30, 23, 21, 28, 48, 24, 5, 32, 4, 1 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case21() {
    int[] p = { 40, 39, 27, 33, 41, 26, 19, 34, 13, 17, 9, 42, 45, 16, 36, 29, 18, 32, 6, 47, 43, 1, 15, 37, 22, 0, 10, 44, 4, 7, 48, 21, 12, 2, 14, 49, 3, 46, 28, 20, 5, 11, 30, 23, 8, 35, 24, 38, 25, 31 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case22() {
    int[] p = { 25, 10, 32, 29, 21, 19, 35, 2, 48, 38, 18, 22, 43, 34, 44, 37, 39, 40, 24, 33, 36, 16, 3, 20, 12, 6, 30, 26, 27, 45, 46, 7, 8, 17, 14, 4, 15, 13, 49, 23, 28, 1, 11, 5, 0, 31, 42, 9, 41, 47 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case23() {
    int[] p = { 37, 38, 20, 2, 31, 0, 7, 6, 24, 17, 15, 48, 33, 25, 42, 35, 18, 28, 10, 1, 27, 47, 21, 14, 46, 12, 26, 39, 36, 32, 29, 45, 16, 43, 11, 9, 49, 19, 41, 30, 23, 34, 44, 5, 40, 13, 4, 22, 3, 8 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case24() {
    int[] p = { 2, 34, 23, 28, 32, 25, 12, 40, 33, 10, 35, 39, 20, 19, 0, 48, 43, 7, 38, 16, 1, 3, 18, 11, 5, 36, 49, 44, 31, 22, 6, 13, 37, 15, 29, 21, 9, 45, 4, 42, 14, 41, 8, 46, 26, 24, 47, 30, 27, 17 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case25() {
    int[] p = { 1, 3, 0, 5, 2, 7, 4, 9, 6, 11, 8, 15, 10, 12, 13, 16, 20, 14, 17, 18, 23, 19, 21, 25, 22, 26, 27, 28, 31, 24, 29, 33, 30, 32, 37, 34, 35, 40, 36, 38, 41, 42, 46, 39, 43, 44, 45, 48, 49, 47 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case26() {
    int[] p = { 2, 0, 3, 5, 1, 6, 8, 4, 11, 7, 9, 13, 10, 12, 15, 18, 14, 16, 20, 17, 21, 24, 19, 22, 25, 26, 29, 23, 27, 32, 28, 30, 34, 31, 36, 33, 37, 38, 35, 40, 41, 42, 43, 45, 39, 47, 44, 49, 46, 48 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case27() {
    int[] p = { 1, 2, 5, 0, 3, 7, 4, 10, 6, 8, 13, 9, 11, 15, 12, 14, 19, 16, 17, 21, 18, 23, 20, 24, 26, 22, 25, 30, 27, 28, 33, 29, 31, 35, 32, 38, 34, 36, 40, 37, 42, 39, 44, 41, 47, 43, 45, 49, 46, 48 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case28() {
    int[] p = { 1, 4, 0, 2, 6, 3, 8, 5, 10, 7, 11, 13, 9, 15, 12, 17, 14, 19, 16, 21, 18, 23, 20, 26, 22, 24, 27, 28, 31, 25, 29, 30, 35, 32, 34, 38, 33, 36, 40, 37, 42, 39, 43, 45, 41, 46, 49, 44, 47, 48 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case29() {
    int[] p = { 1, 3, 0, 5, 2, 9, 4, 6, 7, 10, 12, 8, 14, 11, 18, 13, 16, 15, 20, 17, 21, 23, 19, 27, 22, 24, 25, 29, 26, 31, 28, 33, 30, 37, 32, 34, 35, 40, 36, 38, 43, 39, 41, 45, 42, 44, 47, 48, 49, 46 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case30() {
    int[] p = { 1, 3, 0, 4, 6, 2, 5, 9, 7, 11, 8, 13, 10, 14, 15, 17, 12, 20, 16, 18, 19, 23, 21, 24, 25, 28, 22, 26, 29, 31, 27, 34, 30, 32, 36, 33, 37, 40, 35, 38, 44, 39, 41, 42, 45, 46, 47, 49, 43, 48 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case31() {
    int[] p = { 2, 0, 4, 1, 6, 3, 5, 8, 9, 10, 7, 14, 11, 12, 17, 13, 15, 21, 16, 18, 19, 23, 20, 24, 25, 27, 22, 29, 26, 31, 28, 33, 30, 34, 35, 36, 40, 32, 37, 38, 43, 39, 41, 44, 47, 42, 45, 49, 46, 48 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case32() {
    int[] p = { 1, 2, 3, 5, 0, 7, 8, 4, 10, 6, 12, 9, 17, 11, 13, 14, 15, 20, 16, 18, 21, 24, 19, 22, 25, 28, 23, 26, 34, 27, 29, 30, 31, 32, 36, 33, 35, 38, 41, 37, 39, 44, 40, 42, 46, 43, 48, 45, 49, 47 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case33() {
    int[] p = { 1, 3, 0, 4, 2, 6, 8, 10, 5, 7, 13, 9, 11, 16, 12, 14, 20, 15, 17, 18, 23, 19, 21, 25, 22, 27, 24, 30, 26, 28, 31, 34, 29, 32, 35, 36, 39, 33, 37, 40, 42, 38, 45, 41, 43, 46, 48, 44, 49, 47 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case34() {
    int[] p = { 2, 0, 4, 1, 6, 3, 5, 9, 7, 11, 8, 13, 10, 14, 17, 12, 15, 21, 16, 18, 19, 22, 24, 20, 26, 23, 30, 25, 27, 28, 32, 29, 33, 34, 35, 31, 38, 36, 40, 37, 43, 39, 41, 44, 46, 42, 47, 49, 45, 48 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case35() {
    int[] p = { 1, 11, 4, 2, 0, 8, 6, 5, 7, 10, 3, 9, 12 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case36() {
    int[] p = { 27, 20, 13, 32, 21, 26, 15, 7, 29, 17, 28, 10, 23, 31, 4, 6, 34, 22, 0, 12, 35, 9, 8, 11, 5, 24, 30, 14, 16, 1, 3, 36, 18, 19, 25, 33, 2 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case37() {
    int[] p = { 30, 28, 21, 5, 19, 22, 16, 15, 14, 4, 7, 36, 41, 42, 17, 13, 33, 23, 2, 45, 39, 31, 25, 40, 38, 20, 1, 12, 32, 6, 44, 9, 10, 11, 43, 8, 26, 0, 24, 18, 27, 29, 35, 47, 46, 37, 34, 3 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case38() {
    int[] p = { 2, 0, 3, 1, 5, 6, 4 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case39() {
    int[] p = { 15, 3, 24, 1, 32, 11, 47, 21, 16, 37, 40, 42, 35, 23, 39, 45, 41, 30, 18, 29, 28, 22, 9, 19, 26, 14, 20, 12, 43, 4, 25, 5, 44, 6, 48, 33, 17, 0, 8, 38, 27, 31, 2, 13, 7, 10, 34, 36, 46 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case40() {
    int[] p = { 2, 0, 5, 1, 3, 6, 8, 4, 10, 7, 9, 12, 14, 11, 16, 13, 18, 15, 17, 21, 19, 20 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case41() {
    int[] p = { 3, 0, 1, 5, 2, 4 };
    assertEquals(9, adjacentswaps.theCount(p));
  }

  @Test
  public void case42() {
    int[] p = { 2, 0, 3, 5, 1, 6, 4, 8, 11, 7, 9, 13, 10, 14, 17, 12, 15, 16, 20, 18, 22, 19, 24, 21, 25, 26, 29, 23, 27, 30, 31, 32, 35, 28, 33, 34 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case43() {
    int[] p = { 2, 0, 4, 1, 6, 3, 7, 9, 5, 13, 8, 11, 10, 15, 12, 17, 14, 19, 16, 20, 23, 18, 21, 24, 26, 22, 27, 28, 25, 30, 31, 33, 29, 34, 32 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case44() {
    int[] p = { 1, 3, 0, 6, 2, 4, 7, 9, 5, 11, 8, 12, 10, 15, 13, 17, 14, 19, 16, 20, 22, 18, 24, 23, 26, 21, 27, 29, 25, 31, 28, 37, 30, 32, 33, 34, 35, 40, 36, 38, 43, 39, 41, 44, 45, 42 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case45() {
    int[] p = { 2, 0, 6, 1, 4, 3, 9, 5, 7, 13, 8, 10, 11, 15, 12, 14, 18, 16, 19, 17 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case46() {
    int[] p = { 2, 0, 4, 1, 6, 5, 7, 9, 3, 10, 11, 8, 15, 12, 13, 17, 14, 18, 19, 16 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case47() {
    int[] p = { 1, 2, 4, 0, 9, 3, 5, 6, 7, 11, 8, 12, 13, 14, 10, 16, 18, 15, 19, 21, 17, 22, 24, 20, 26, 23, 28, 25, 30, 27, 29 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case48() {
    int[] p = { 2, 0, 4, 1, 6, 3, 5, 7, 10, 8, 13, 9, 11, 15, 12, 18, 14, 16, 20, 17, 22, 19, 23, 24, 26, 21, 28, 25, 30, 27, 31, 29 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case49() {
    int[] p = { 2, 0, 4, 1, 5, 7, 3, 9, 6, 10, 11, 14, 8, 12, 16, 13, 17, 19, 15, 21, 18, 23, 20, 24, 27, 22, 25, 26, 30, 28, 29 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case50() {
    int[] p = { 1, 3, 0, 5, 2, 6, 7, 9, 4, 11, 8, 13, 10, 15, 12, 17, 14, 19, 16, 21, 18, 23, 20, 25, 22, 26, 28, 24, 31, 27, 29, 33, 30, 35, 32, 37, 34, 39, 36, 41, 38, 43, 40, 45, 42, 47, 44, 49, 46, 48 };
    assertEquals(913578633, adjacentswaps.theCount(p));
  }

  @Test
  public void case51() {
    int[] p = { 2, 0, 4, 1, 6, 3, 8, 5, 10, 7, 11, 12, 14, 9, 16, 13, 18, 15, 20, 17, 22, 19, 24, 21, 26, 23, 28, 25, 30, 27, 33, 29, 31, 35, 32, 37, 34, 39, 36, 41, 38, 43, 40, 45, 42, 47, 44, 49, 46, 48 };
    assertEquals(892361139, adjacentswaps.theCount(p));
  }

  @Test
  public void case52() {
    int[] p = { 2, 0, 4, 1, 6, 3, 8, 5, 10, 7, 12, 9, 15, 11, 13, 17, 14, 19, 16, 21, 18, 23, 20, 25, 22, 27, 24, 29, 26, 31, 28, 33, 30, 36, 32, 34, 38, 35, 40, 37, 42, 39, 44, 41, 46, 43, 48, 45, 49, 47 };
    assertEquals(844914677, adjacentswaps.theCount(p));
  }

  @Test
  public void case53() {
    int[] p = { 1, 3, 0, 5, 2, 7, 4, 9, 6, 11, 8, 13, 10, 15, 12, 17, 14, 19, 16, 21, 18, 23, 20, 25, 22, 27, 24, 29, 26, 31, 28, 33, 30, 35, 32, 37, 34, 39, 36, 41, 38, 43, 40, 45, 42, 48, 44, 46, 49, 47 };
    assertEquals(224476724, adjacentswaps.theCount(p));
  }

  @Test
  public void case54() {
    int[] p = { 2, 0, 4, 1, 6, 3, 8, 5, 10, 7, 12, 9, 14, 11, 16, 13, 18, 15, 20, 17, 22, 19, 24, 21, 26, 23, 28, 25, 30, 27, 32, 29, 34, 31, 36, 33, 38, 35, 40, 37, 42, 39, 44, 41, 46, 43, 48, 45, 49, 47 };
    assertEquals(752033767, adjacentswaps.theCount(p));
  }

  @Test
  public void case55() {
    int[] p = { 49, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48 };
    assertEquals(1, adjacentswaps.theCount(p));
  }

  @Test
  public void case56() {
    int[] p = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 49, 0, 44, 45, 46, 47, 48 };
    assertEquals(1712304, adjacentswaps.theCount(p));
  }

  @Test
  public void case57() {
    int[] p = { 1, 2, 3, 4, 38, 0, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 37 };
    assertEquals(225407879, adjacentswaps.theCount(p));
  }

  @Test
  public void case58() {
    int[] p = { 17, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 41, 16, 39, 42, 43, 44, 45, 46, 47, 48, 49, 40 };
    assertEquals(149362102, adjacentswaps.theCount(p));
  }

  @Test
  public void case59() {
    int[] p = { 7, 0, 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 34, 6, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 35, 36, 37, 38, 49, 33, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48 };
    assertEquals(700807595, adjacentswaps.theCount(p));
  }

  @Test
  public void case60() {
    int[] p = { 3, 0, 1, 5, 2, 7, 4, 9, 6, 12, 8, 10, 13, 16, 11, 14, 18, 15, 21, 17, 19, 23, 20, 26, 22, 24, 27, 29, 25, 31, 28, 32, 34, 30, 36, 33, 38, 35, 40, 37, 42, 39, 43, 45, 41, 48, 44, 46, 49, 47 };
    assertEquals(316948678, adjacentswaps.theCount(p));
  }

  @Test
  public void case61() {
    int[] p = { 1, 2, 3, 11, 0, 4, 5, 6, 7, 8, 9, 12, 21, 10, 13, 14, 15, 16, 17, 18, 19, 22, 23, 24, 25, 26, 27, 28, 36, 20, 29, 30, 31, 32, 33, 34, 41, 35, 37, 38, 39, 48, 40, 42, 43, 44, 45, 46, 49, 47 };
    assertEquals(915507424, adjacentswaps.theCount(p));
  }

  @Test
  public void case62() {
    int[] p = { 2, 0, 5, 1, 3, 7, 4, 10, 6, 8, 14, 9, 11, 12, 17, 13, 15, 18, 20, 16, 22, 19, 24, 21, 26, 23, 28, 25, 30, 27, 31, 33, 29, 34, 37, 32, 35, 39, 36, 40, 41, 45, 38, 42, 43, 47, 44, 48, 49, 46 };
    assertEquals(870443491, adjacentswaps.theCount(p));
  }

  @Test
  public void case63() {
    int[] p = { 1, 2, 3, 5, 0, 7, 4, 8, 9, 10, 11, 12, 15, 6, 13, 16, 18, 14, 19, 21, 17, 22, 24, 20, 25, 28, 23, 26, 29, 31, 27, 33, 30, 36, 32, 34, 40, 35, 37, 38, 42, 39, 43, 44, 49, 41, 45, 46, 47, 48 };
    assertEquals(217330693, adjacentswaps.theCount(p));
  }

  @Test
  public void case64() {
    int[] p = { 1, 5, 0, 2, 3, 6, 7, 8, 9, 11, 4, 12, 14, 10, 20, 13, 15, 16, 17, 18, 21, 22, 27, 19, 23, 24, 25, 28, 29, 32, 26, 30, 34, 31, 35, 36, 37, 38, 39, 40, 41, 42, 43, 46, 33, 44, 47, 49, 45, 48 };
    assertEquals(32191283, adjacentswaps.theCount(p));
  }

  @Test
  public void case65() {
    int[] p = { 1, 4, 0, 2, 6, 3, 8, 5, 9, 11, 7, 13, 10, 15, 12, 17, 14, 19, 16, 21, 18, 24, 20, 22, 26, 23, 28, 25, 30, 27, 32, 29, 35, 31, 33, 37, 34, 38, 40, 36, 41, 43, 39, 45, 42, 47, 44, 49, 46, 48 };
    assertEquals(626640117, adjacentswaps.theCount(p));
  }

  @Test
  public void case66() {
    int[] p = { 21, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 22, 23, 24, 29, 20, 25, 26, 27, 37, 28, 30, 31, 32, 33, 34, 35, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 36 };
    assertEquals(913707956, adjacentswaps.theCount(p));
  }

  @Test
  public void case67() {
    int[] p = { 4, 0, 1, 2, 5, 6, 12, 3, 7, 8, 9, 10, 13, 14, 15, 16, 17, 18, 19, 20, 25, 11, 21, 22, 23, 26, 28, 24, 29, 30, 31, 32, 33, 34, 35, 36, 48, 27, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 49, 47 };
    assertEquals(950674766, adjacentswaps.theCount(p));
  }

  @Test
  public void case68() {
    int[] p = { 1, 3, 0, 5, 2, 7, 4, 8, 10, 6, 11, 12, 14, 9, 16, 13, 17, 18, 20, 15, 22, 19, 24, 21, 26, 23, 29, 25, 27, 31, 28, 33, 30, 35, 32, 36, 38, 34, 40, 37, 42, 39, 44, 41, 46, 43, 48, 45, 49, 47 };
    assertEquals(969365121, adjacentswaps.theCount(p));
  }

  @Test
  public void case69() {
    int[] p = { 2, 0, 4, 1, 7, 3, 5, 8, 9, 11, 6, 13, 10, 15, 12, 17, 14, 19, 16, 21, 18, 23, 20, 26, 22, 24, 28, 25, 30, 27, 32, 29, 34, 31, 35, 39, 33, 36, 37, 40, 42, 38, 44, 41, 45, 48, 43, 46, 49, 47 };
    assertEquals(592218195, adjacentswaps.theCount(p));
  }

  @Test
  public void case70() {
    int[] p = { 4, 0, 1, 2, 6, 3, 8, 5, 11, 7, 9, 14, 10, 12, 15, 17, 13, 18, 20, 16, 23, 19, 21, 25, 22, 26, 28, 24, 31, 27, 29, 32, 33, 35, 30, 37, 34, 40, 36, 38, 41, 42, 45, 39, 43, 44 };
    assertEquals(78053512, adjacentswaps.theCount(p));
  }

  @Test
  public void case71() {
    int[] p = { 2, 0, 4, 1, 6, 3, 8, 5, 10, 7, 12, 9, 14, 11, 16, 13, 18, 15, 20, 17, 22, 19, 24, 21, 26, 23, 28, 25, 30, 27, 32, 29, 34, 31, 33 };
    assertEquals(595888523, adjacentswaps.theCount(p));
  }

  @Test
  public void case72() {
    int[] p = { 1, 10, 0, 2, 3, 4, 5, 6, 7, 8, 13, 9, 11, 14, 18, 12, 15, 16, 19, 20, 21, 17 };
    assertEquals(627488663, adjacentswaps.theCount(p));
  }

  @Test
  public void case73() {
    int[] p = { 2, 0, 4, 1, 6, 3, 8, 5, 7 };
    assertEquals(1385, adjacentswaps.theCount(p));
  }

  @Test
  public void case74() {
    int[] p = { 2, 0, 3, 4, 6, 1, 8, 5, 11, 7, 9, 12, 14, 10, 16, 13, 18, 15, 20, 17, 22, 19, 24, 21, 27, 23, 25, 29, 26, 31, 28, 33, 30, 36, 32, 34, 38, 35, 41, 37, 39, 42, 40 };
    assertEquals(796431253, adjacentswaps.theCount(p));
  }

  @Test
  public void case75() {
    int[] p = { 3, 0, 1, 4, 6, 2, 7, 9, 5, 10, 12, 8, 15, 11, 13, 16, 17, 21, 14, 18, 19, 22, 25, 20, 23, 27, 24, 31, 26, 28, 29, 34, 30, 32, 36, 33, 40, 35, 37, 38, 43, 39, 41, 44, 47, 42, 45, 49, 46, 48 };
    assertEquals(125485734, adjacentswaps.theCount(p));
  }

  @Test
  public void case76() {
    int[] p = { 1, 3, 0, 5, 2, 7, 4, 8, 10, 6, 12, 9, 14, 11, 16, 13, 18, 15, 19, 17 };
    assertEquals(716743312, adjacentswaps.theCount(p));
  }

  @Test
  public void case77() {
    int[] p = { 1, 3, 0, 5, 2, 7, 4, 9, 6, 11, 8, 13, 10, 15, 12, 17, 14, 19, 16, 21, 18, 23, 20, 25, 22, 27, 24, 29, 26, 31, 28, 33, 30, 35, 32, 37, 34, 39, 36, 41, 38, 43, 40, 45, 42, 47, 44, 49, 46, 48 };
    assertEquals(752033767, adjacentswaps.theCount(p));
  }

  @Test
  public void case78() {
    int[] p = { 2, 0, 3, 6, 1, 4, 7, 10, 5, 8, 13, 9, 11, 15, 12, 17, 14, 18, 19, 22, 16, 20, 23, 26, 21, 24, 28, 25, 29, 31, 27, 33, 30, 34, 36, 32, 37, 41, 35, 38, 39, 42, 44, 40, 46, 43, 48, 45, 49, 47 };
    assertEquals(977737667, adjacentswaps.theCount(p));
  }

  @Test
  public void case79() {
    int[] p = { 2, 0, 3, 4, 5, 8, 1, 6, 13, 7, 9, 10, 11, 15, 12, 17, 14, 19, 16, 21, 18, 23, 20, 27, 22, 24, 25, 28, 30, 26, 32, 29, 33, 35, 31, 37, 34, 39, 36, 41, 38, 43, 40, 45, 42, 46, 47, 48, 49, 44 };
    assertEquals(113125603, adjacentswaps.theCount(p));
  }

  @Test
  public void case80() {
    int[] p = { 1, 3, 0, 5, 2, 7, 4, 8, 10, 6, 12, 9, 14, 11, 16, 13, 24, 47, 25, 26, 45, 32, 46, 31, 18, 43, 44, 15, 19, 37, 17, 20, 21, 22, 23, 27, 28, 41, 42, 29, 30, 33, 35, 36, 34, 49, 38, 40, 39, 48 };
    assertEquals(0, adjacentswaps.theCount(p));
  }

  @Test
  public void case81() {
    int[] p = { 2, 0, 4, 1, 6, 3, 8, 5, 9, 11, 7, 13, 10, 15, 12, 16, 18, 14, 20, 17, 24, 19, 21, 22, 25, 28, 23, 26, 29, 30, 32, 27, 33, 34, 36, 31, 39, 35, 37, 40, 42, 38, 44, 41, 45, 48, 43, 46, 49, 47 };
    assertEquals(728792389, adjacentswaps.theCount(p));
  }

  @Test
  public void case82() {
    int[] p = { 2, 0, 4, 1, 6, 3, 8, 5, 10, 7, 12, 9, 14, 11, 16, 13, 18, 15, 20, 17, 22, 19, 24, 21, 26, 23, 28, 25, 30, 27, 32, 29, 34, 31, 36, 33, 38, 35, 40, 37, 42, 39, 44, 41, 46, 43, 48, 45, 49, 47 };
    assertEquals(752033767, adjacentswaps.theCount(p));
  }

}
