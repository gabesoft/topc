package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class WinterAndCandiesTest {
  WinterAndCandies winterandcandies = new WinterAndCandies();

  @Test
  public void case1() {
    int[] type = { 1, 3, 2 };
    assertEquals(3, winterandcandies.getNumber(type));
  }

  @Test
  public void case2() {
    int[] type = { 1, 1, 2 };
    assertEquals(4, winterandcandies.getNumber(type));
  }

  @Test
  public void case3() {
    int[] type = { 1, 3, 2, 5, 7, 4, 5, 4 };
    assertEquals(9, winterandcandies.getNumber(type));
  }

  @Test
  public void case4() {
    int[] type = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
    assertEquals(62, winterandcandies.getNumber(type));
  }

  @Test
  public void case5() {
    int[] type = { 2 };
    assertEquals(0, winterandcandies.getNumber(type));
  }

  @Test
  public void case6() {
    int[] type = { 18, 35, 1, 20, 25, 29, 9, 13, 15, 6, 46, 32, 28, 12, 42, 46, 43, 28, 37, 42, 5, 3, 4, 43, 33, 22, 17, 19, 46, 48, 27, 22, 39, 20, 13, 18, 50, 36, 45, 4, 12, 23 };
    assertEquals(1, winterandcandies.getNumber(type));
  }

  @Test
  public void case7() {
    int[] type = { 24, 15, 42, 12, 4, 19, 48, 45, 13, 8, 38, 10, 24, 42, 30, 29, 17, 36, 41, 43, 39, 7, 41, 43, 15, 49, 47, 6, 41, 30, 21, 1, 7, 2 };
    assertEquals(2, winterandcandies.getNumber(type));
  }

  @Test
  public void case8() {
    int[] type = { 49, 30, 24, 35, 5, 7, 41, 17, 27, 32, 9, 45, 40, 27, 24, 38, 39, 19, 33, 30, 42, 34, 16, 40, 9, 5, 31, 28, 7, 24, 37, 22, 46, 25, 23, 21, 30, 28, 24, 48, 13, 37, 41, 12 };
    assertEquals(0, winterandcandies.getNumber(type));
  }

  @Test
  public void case9() {
    int[] type = { 6, 18, 6, 25, 32, 3, 1, 1, 42, 25, 17, 31, 8, 42, 8, 38, 8, 38, 4, 34, 46, 10, 10, 9, 22, 39, 23, 47, 7, 31, 14, 19, 1, 42, 13, 6, 11 };
    assertEquals(3, winterandcandies.getNumber(type));
  }

  @Test
  public void case10() {
    int[] type = { 25, 38, 49, 34, 46, 42, 3, 1, 42, 37 };
    assertEquals(1, winterandcandies.getNumber(type));
  }

  @Test
  public void case11() {
    int[] type = { 21, 47, 22, 49, 50, 19, 35, 32, 35, 4, 50, 19, 39, 1, 39, 28, 18, 29, 44, 49, 34, 8, 22, 11, 18, 14, 15, 10, 17, 36, 2, 1, 50, 20, 7, 49, 4, 25, 9, 45, 10, 40, 3, 46, 36, 44, 44, 24, 38, 15 };
    assertEquals(10, winterandcandies.getNumber(type));
  }

  @Test
  public void case12() {
    int[] type = { 49, 1, 9, 19, 31, 47, 49, 32, 40, 49, 10, 8, 23, 23, 39, 43, 39, 30, 41, 8, 9, 42, 16, 39, 7, 12, 3, 35, 23, 6, 29, 47, 13, 37, 26, 34, 20, 43, 45, 17, 32, 49, 23, 2, 22, 50, 8, 27, 43, 40 };
    assertEquals(3, winterandcandies.getNumber(type));
  }

  @Test
  public void case13() {
    int[] type = { 13, 1, 11, 4, 20, 12, 39, 2, 40, 6, 24, 3, 36, 33, 36, 39, 27, 18, 8, 33, 33, 20, 5, 22, 40, 27, 30, 19, 43, 26, 6, 35, 50, 42, 13, 46, 11, 19, 4, 40, 24, 30, 47, 38, 30, 50, 38, 17, 50, 44 };
    assertEquals(11, winterandcandies.getNumber(type));
  }

  @Test
  public void case14() {
    int[] type = { 48, 17, 37, 6, 39, 33, 6, 35, 15, 2, 17, 22, 37, 14, 14, 6, 36, 4, 13, 9, 33, 46, 14, 7, 22, 9, 47, 33, 32, 45, 47, 23, 30, 12, 36, 1, 24, 17, 45, 10, 43, 40, 4, 25, 5, 11, 46, 50, 37, 14 };
    assertEquals(2, winterandcandies.getNumber(type));
  }

  @Test
  public void case15() {
    int[] type = { 23, 19, 19, 38, 6, 9, 42, 3, 26, 28, 15, 15, 25, 35, 25, 23, 10, 34, 21, 38, 48, 19, 28, 24, 21, 14, 19, 43, 36, 3, 31, 14, 28, 3, 50, 28, 26, 44, 25, 24, 23, 12, 32, 4, 33, 6, 44, 26, 32, 43 };
    assertEquals(0, winterandcandies.getNumber(type));
  }

  @Test
  public void case16() {
    int[] type = { 3, 7, 5, 1, 8, 1, 14, 15, 11, 11, 16, 14, 12, 1, 17, 8, 6, 11, 1, 15, 16, 5, 20, 6, 17, 15, 19, 3, 12, 7, 19, 14, 12, 5, 19, 5, 20, 13, 1, 8, 1, 7, 11, 18, 11, 16, 17, 8, 4, 19 };
    assertEquals(6, winterandcandies.getNumber(type));
  }

  @Test
  public void case17() {
    int[] type = { 10, 3, 7, 6, 8, 18, 15, 6, 8, 10, 9, 4, 1, 3, 3, 4, 17, 18, 2, 16, 6, 5, 1, 3, 17, 11, 7, 12, 12, 12, 8, 14, 1, 11, 5, 9, 4, 1, 12, 3, 10, 1, 14, 19, 19, 6, 8, 18, 1, 19 };
    assertEquals(399912, winterandcandies.getNumber(type));
  }

  @Test
  public void case18() {
    int[] type = { 4, 1, 18, 5, 18, 9, 14, 8, 2, 11, 1, 9, 14, 5, 6, 1, 12, 5, 16, 17, 13, 11, 4, 6, 17, 17, 7, 18, 7, 18, 18, 12, 10, 2, 17, 3, 18, 13, 18, 17, 6, 2, 4, 10, 10, 6, 20, 13, 17, 16 };
    assertEquals(170229, winterandcandies.getNumber(type));
  }

  @Test
  public void case19() {
    int[] type = { 3, 5, 15, 15, 13, 18, 10, 13, 4, 8, 4, 12, 16, 8, 9, 16, 19, 4, 3, 15, 12, 2, 16, 20, 6, 2, 11, 7, 15, 6, 4, 11, 19, 20, 2, 14, 15, 18, 15, 17, 14, 17, 6, 3, 9, 2, 1, 14, 2, 16 };
    assertEquals(12989661, winterandcandies.getNumber(type));
  }

  @Test
  public void case20() {
    int[] type = { 3, 3, 12, 18, 5, 19, 13, 4, 17, 14, 1, 14, 16, 13, 19, 11, 18, 13, 13, 16, 10, 12, 1, 9, 6, 11, 18, 10, 11, 6, 14, 15, 12, 1, 5, 19, 16, 20, 13, 6, 5, 2, 4, 10, 16, 9, 13, 18, 10, 17 };
    assertEquals(168, winterandcandies.getNumber(type));
  }

  @Test
  public void case21() {
    int[] type = { 8, 8, 2, 10, 1, 4, 5, 2, 8, 6, 4, 4, 3, 5, 2, 3, 10, 1, 9, 8, 5, 6, 7, 9, 1, 8, 8, 5, 4, 2, 4, 7, 4, 1, 2, 10, 1, 5, 3, 10, 4, 2, 5, 9, 3, 1, 6, 6, 10, 4 };
    assertEquals(6394938, winterandcandies.getNumber(type));
  }

  @Test
  public void case22() {
    int[] type = { 9, 8, 5, 9, 2, 5, 4, 6, 6, 3, 7, 9, 10, 3, 10, 6, 10, 5, 6, 1, 6, 9, 9, 1, 2, 4, 3, 3, 3, 8, 1, 4, 2, 4, 4, 8, 1, 10, 6, 6, 9, 4, 8, 9, 4, 8, 10, 4, 10, 2 };
    assertEquals(3389540, winterandcandies.getNumber(type));
  }

  @Test
  public void case23() {
    int[] type = { 3, 9, 1, 2, 9, 5, 9, 7, 1, 10, 4, 1, 1, 9, 8, 7, 4, 6, 7, 6, 9, 4, 10, 5, 9, 4, 10, 8, 7, 5, 6, 9, 7, 2, 6, 6, 2, 10, 7, 5, 6, 5, 3, 6, 4, 3, 7, 9, 3, 7 };
    assertEquals(5587504, winterandcandies.getNumber(type));
  }

  @Test
  public void case24() {
    int[] type = { 4, 10, 5, 6, 7, 3, 6, 4, 6, 7, 7, 2, 5, 5, 7, 3, 7, 9, 3, 6, 6, 2, 1, 2, 6, 2, 8, 7, 1, 1, 3, 5, 4, 4, 7, 3, 9, 3, 4, 5, 4, 5, 4, 7, 9, 5, 8, 4, 10, 9 };
    assertEquals(5254359, winterandcandies.getNumber(type));
  }

  @Test
  public void case25() {
    int[] type = { 1, 9, 9, 1, 6, 2, 5, 4, 7, 4, 10, 3, 2, 10, 9, 3, 4, 5, 1, 3, 4, 2, 10, 9, 10, 9, 10, 2, 4, 6, 2, 5, 3, 6, 4, 9, 10, 3, 9, 8, 1, 2, 5, 9, 2, 10, 4, 6, 10, 8 };
    assertEquals(2325712, winterandcandies.getNumber(type));
  }

  @Test
  public void case26() {
    int[] type = { 4, 1, 2, 5, 3, 1, 1, 1, 1, 5, 3, 4, 3, 5, 1, 1, 5, 5, 1, 1, 2, 2, 1, 5, 1, 4, 4, 4, 3, 3, 2, 5, 4, 4, 2, 1, 4, 4, 4, 5, 4, 1, 2, 1, 5, 2, 4, 3, 4, 1 };
    assertEquals(82650, winterandcandies.getNumber(type));
  }

  @Test
  public void case27() {
    int[] type = { 1, 2, 5, 1, 4, 5, 4, 2, 1, 2, 5, 3, 4, 5, 5, 2, 1, 2, 2, 2, 2, 2, 3, 2, 5, 1, 2, 2, 3, 2, 5, 5, 1, 3, 4, 5, 2, 1, 3, 4, 2, 2, 4, 4, 3, 3, 3, 2, 3, 2 };
    assertEquals(80647, winterandcandies.getNumber(type));
  }

  @Test
  public void case28() {
    int[] type = { 5, 5, 5, 2, 1, 4, 2, 3, 5, 1, 4, 4, 2, 3, 2, 5, 5, 4, 3, 5, 1, 3, 5, 5, 4, 4, 4, 2, 5, 4, 2, 2, 3, 4, 4, 3, 2, 3, 3, 1, 3, 4, 3, 3, 4, 1, 3, 1, 4, 5 };
    assertEquals(90486, winterandcandies.getNumber(type));
  }

  @Test
  public void case29() {
    int[] type = { 4, 3, 1, 1, 1, 3, 3, 2, 3, 4, 3, 4, 2, 2, 1, 5, 1, 4, 5, 1, 1, 1, 3, 3, 1, 1, 3, 2, 5, 4, 2, 5, 2, 4, 5, 4, 4, 1, 1, 2, 1, 1, 4, 5, 1, 1, 5, 3, 3, 2 };
    assertEquals(93584, winterandcandies.getNumber(type));
  }

  @Test
  public void case30() {
    int[] type = { 5, 5, 1, 4, 1, 4, 1, 1, 3, 2, 3, 4, 4, 2, 5, 5, 2, 5, 1, 1, 3, 5, 3, 4, 5, 1, 4, 4, 2, 1, 3, 4, 3, 5, 2, 2, 2, 3, 5, 1, 5, 5, 4, 2, 2, 5, 5, 1, 1, 1 };
    assertEquals(96132, winterandcandies.getNumber(type));
  }

  @Test
  public void case31() {
    int[] type = { 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 1, 2, 1, 1 };
    assertEquals(638, winterandcandies.getNumber(type));
  }

  @Test
  public void case32() {
    int[] type = { 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1 };
    assertEquals(630, winterandcandies.getNumber(type));
  }

  @Test
  public void case33() {
    int[] type = { 24, 11, 8, 49, 29, 33, 7, 12, 6, 32, 15, 42, 46, 5, 3, 39, 37, 22, 47, 21, 28, 40, 36, 4, 17, 18, 9, 45, 16, 41, 48, 43, 2, 34, 38, 14, 26, 50, 27, 10, 30, 25, 1, 31, 13, 19, 35, 44, 20, 23 };
    assertEquals(50, winterandcandies.getNumber(type));
  }

  @Test
  public void case34() {
    int[] type = { 12, 19, 8, 14, 17, 19, 10, 6, 11, 14, 25, 20, 11, 23, 9, 4, 3, 17, 1, 24, 23, 5, 18, 10, 2, 16, 16, 5, 7, 1, 13, 22, 13, 3, 21, 4, 20, 2, 8, 9, 6, 15, 25, 15, 21, 7, 18, 12, 24, 22 };
    assertEquals(67108862, winterandcandies.getNumber(type));
  }

  @Test
  public void case35() {
    int[] type = { 5, 15, 13, 10, 1, 4, 5, 13, 17, 8, 3, 14, 10, 6, 15, 5, 3, 14, 16, 16, 4, 8, 2, 12, 16, 10, 11, 1, 7, 11, 14, 6, 11, 7, 3, 6, 12, 2, 8, 4, 17, 9, 9, 7, 15, 12, 2, 13, 9, 1 };
    assertEquals(150663522, winterandcandies.getNumber(type));
  }

  @Test
  public void case36() {
    int[] type = { 11, 6, 2, 10, 6, 7, 5, 13, 2, 11, 4, 4, 8, 5, 3, 3, 1, 11, 3, 7, 9, 7, 12, 12, 1, 8, 6, 5, 7, 1, 2, 10, 2, 13, 4, 9, 11, 6, 12, 3, 10, 8, 12, 5, 1, 8, 10, 9, 9, 4 };
    assertEquals(55924052, winterandcandies.getNumber(type));
  }

  @Test
  public void case37() {
    int[] type = { 5, 1, 2, 7, 1, 6, 2, 10, 9, 10, 10, 3, 2, 8, 9, 8, 3, 7, 3, 4, 6, 8, 4, 6, 7, 10, 9, 5, 8, 4, 9, 7, 2, 4, 6, 4, 1, 3, 1, 9, 5, 5, 5, 7, 8, 1, 3, 2, 6, 10 };
    assertEquals(12207030, winterandcandies.getNumber(type));
  }

  @Test
  public void case38() {
    int[] type = { 7, 5, 3, 2, 3, 2, 9, 1, 2, 8, 3, 8, 7, 5, 5, 8, 4, 7, 4, 5, 2, 8, 4, 4, 1, 6, 7, 3, 4, 1, 6, 6, 1, 3, 5, 2, 6, 8, 8, 3, 7, 1, 6, 6, 9, 4, 2, 7, 5, 1 };
    assertEquals(5374770, winterandcandies.getNumber(type));
  }

  @Test
  public void case39() {
    int[] type = { 3, 6, 7, 2, 5, 7, 2, 5, 6, 5, 5, 6, 3, 3, 8, 1, 6, 2, 4, 7, 7, 6, 2, 3, 4, 6, 7, 1, 1, 5, 2, 5, 4, 4, 4, 2, 3, 1, 1, 3, 1, 4, 5, 4, 7, 3, 6, 7, 1, 2 };
    assertEquals(1784342, winterandcandies.getNumber(type));
  }

  @Test
  public void case40() {
    int[] type = { 6, 6, 5, 6, 3, 7, 5, 6, 1, 4, 1, 3, 4, 6, 3, 5, 1, 3, 1, 1, 5, 2, 5, 2, 7, 2, 3, 1, 5, 1, 1, 2, 2, 6, 3, 4, 4, 3, 4, 6, 3, 2, 4, 2, 5, 2, 5, 4, 4, 6 };
    assertEquals(823880, winterandcandies.getNumber(type));
  }

  @Test
  public void case41() {
    int[] type = { 6, 2, 4, 4, 1, 4, 3, 5, 3, 2, 5, 1, 3, 5, 5, 1, 4, 1, 6, 1, 6, 6, 1, 3, 4, 5, 5, 1, 6, 5, 4, 2, 1, 3, 3, 2, 4, 3, 3, 5, 3, 5, 4, 2, 2, 2, 2, 1, 2, 4 };
    assertEquals(361674, winterandcandies.getNumber(type));
  }

  @Test
  public void case42() {
    int[] type = { 4, 1, 3, 3, 5, 2, 1, 4, 2, 5, 5, 2, 2, 5, 4, 3, 5, 4, 1, 3, 5, 2, 2, 5, 5, 1, 4, 4, 4, 3, 4, 2, 2, 3, 5, 4, 1, 3, 1, 2, 3, 5, 3, 2, 1, 1, 1, 3, 4, 1 };
    assertEquals(111110, winterandcandies.getNumber(type));
  }

  @Test
  public void case43() {
    int[] type = { 2, 1, 1, 2, 3, 3, 3, 1, 1, 2, 1, 1, 3, 2, 1, 3, 2, 2, 2, 2, 3, 3, 1, 3, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 3, 2, 2, 1, 2, 3, 2, 1, 2 };
    assertEquals(4420, winterandcandies.getNumber(type));
  }

  @Test
  public void case44() {
    int[] type = { 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2 };
    assertEquals(630, winterandcandies.getNumber(type));
  }

  @Test
  public void case45() {
    int[] type = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(50, winterandcandies.getNumber(type));
  }

  @Test
  public void case46() {
    int[] type = { 10, 46, 16, 34, 13, 23, 27, 3, 20, 50, 47, 34, 43, 9, 17, 13, 23, 10, 15, 25, 3, 4, 25, 24, 27, 49, 20, 46, 49, 39, 18, 21, 19, 26, 39, 20, 36, 11, 38, 22, 27, 32, 19, 40, 31, 48, 47, 45 };
    assertEquals(0, winterandcandies.getNumber(type));
  }

  @Test
  public void case47() {
    int[] type = { 48, 30, 31, 40, 27, 25, 23, 30, 9, 5, 23, 49, 48, 12, 48, 47, 41, 31, 8, 5, 35, 30, 47, 39, 8, 18, 3, 32, 8, 25, 49, 13, 12, 24, 26, 19, 19, 34, 23, 39, 4, 21, 17, 21, 48, 11, 13, 9, 41 };
    assertEquals(0, winterandcandies.getNumber(type));
  }

  @Test
  public void case48() {
    int[] type = { 38, 36, 4, 40, 28, 22, 48, 31, 19, 45, 8, 35, 9, 2, 45, 47, 22, 19, 30, 17, 6, 29, 13, 38, 33, 41, 7, 46, 26, 32, 3, 17, 23, 18, 12, 23, 22, 16, 32, 38, 9, 13, 4, 34, 10, 19, 34, 41, 36, 14 };
    assertEquals(0, winterandcandies.getNumber(type));
  }

  @Test
  public void case49() {
    int[] type = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23, 24, 24, 25, 25 };
    assertEquals(67108862, winterandcandies.getNumber(type));
  }

  @Test
  public void case50() {
    int[] type = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 17, 17, 18 };
    assertEquals(165012429, winterandcandies.getNumber(type));
  }

  @Test
  public void case51() {
    int[] type = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
    assertEquals(62, winterandcandies.getNumber(type));
  }

  @Test
  public void case52() {
    int[] type = { 4, 3, 4, 3, 7, 7, 4, 2, 1, 4, 5, 8, 1, 10, 3, 5, 1, 1, 1, 2, 5, 4, 9, 2, 8, 8, 9, 5, 4, 2, 9, 7, 10, 2, 2, 1, 1, 7, 1, 9, 5, 5, 1, 2, 6, 7, 3, 4, 7, 9 };
    assertEquals(3134952, winterandcandies.getNumber(type));
  }

  @Test
  public void case53() {
    int[] type = { 1, 1, 1, 2, 2, 2, 3, 3 };
    assertEquals(30, winterandcandies.getNumber(type));
  }

  @Test
  public void case54() {
    int[] type = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    assertEquals(111110, winterandcandies.getNumber(type));
  }

  @Test
  public void case55() {
    int[] type = { 2, 1 };
    assertEquals(2, winterandcandies.getNumber(type));
  }

  @Test
  public void case56() {
    int[] type = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(50, winterandcandies.getNumber(type));
  }

  @Test
  public void case57() {
    int[] type = { 1, 2, 1, 2, 3, 3, 4, 4, 5, 5, 12, 1, 2, 3, 1 };
    assertEquals(268, winterandcandies.getNumber(type));
  }

  @Test
  public void case58() {
    int[] type = { 1, 3, 4, 34, 2, 3, 4, 5, 23, 4, 3, 2, 3, 2, 3, 2, 34, 5, 4, 2, 3, 2, 32, 23, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 34 };
    assertEquals(2393, winterandcandies.getNumber(type));
  }

  @Test
  public void case59() {
    int[] type = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 48, 50 };
    assertEquals(62, winterandcandies.getNumber(type));
  }

  @Test
  public void case60() {
    int[] type = { 1 };
    assertEquals(1, winterandcandies.getNumber(type));
  }

  @Test
  public void case61() {
    int[] type = { 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 33, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    assertEquals(6169, winterandcandies.getNumber(type));
  }

  @Test
  public void case62() {
    int[] type = { 1, 2, 4, 50 };
    assertEquals(2, winterandcandies.getNumber(type));
  }

  @Test
  public void case63() {
    int[] type = { 1, 1, 1, 1, 2, 2 };
    assertEquals(12, winterandcandies.getNumber(type));
  }

  @Test
  public void case64() {
    int[] type = { 50, 50, 50 };
    assertEquals(0, winterandcandies.getNumber(type));
  }

  @Test
  public void case65() {
    int[] type = { 12, 13, 12 };
    assertEquals(0, winterandcandies.getNumber(type));
  }

  @Test
  public void case66() {
    int[] type = { 1, 1, 2 };
    assertEquals(4, winterandcandies.getNumber(type));
  }

  @Test
  public void case67() {
    int[] type = { 1, 3, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(144, winterandcandies.getNumber(type));
  }

  @Test
  public void case68() {
    int[] type = { 1, 3, 2, 5, 7, 4, 5, 4 };
    assertEquals(9, winterandcandies.getNumber(type));
  }

  @Test
  public void case69() {
    int[] type = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22 };
    assertEquals(8388606, winterandcandies.getNumber(type));
  }

  @Test
  public void case70() {
    int[] type = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 11, 12, 14, 14, 14, 15, 19, 19, 20, 21 };
    assertEquals(7410, winterandcandies.getNumber(type));
  }

  @Test
  public void case71() {
    int[] type = { 1, 1, 2, 2, 2 };
    assertEquals(8, winterandcandies.getNumber(type));
  }

}
