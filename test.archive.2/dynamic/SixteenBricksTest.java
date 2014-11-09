package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SixteenBricksTest {
  SixteenBricks sixteenbricks = new SixteenBricks();

  @Test
  public void case1() {
    int[] height = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(32, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case2() {
    int[] height = { 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2 };
    assertEquals(64, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case3() {
    int[] height = { 77, 78, 58, 34, 30, 20, 8, 71, 37, 74, 21, 45, 39, 16, 4, 59 };
    assertEquals(1798, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case4() {
    int[] height = { 28, 70, 37, 74, 88, 6, 81, 96, 71, 87, 61, 17, 28, 66, 56, 82 };
    assertEquals(2222, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case5() {
    int[] height = { 86, 96, 83, 58, 8, 5, 85, 5, 20, 16, 26, 92, 13, 14, 28, 14 };
    assertEquals(2094, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case6() {
    int[] height = { 57, 72, 55, 82, 38, 60, 45, 91, 31, 54, 24, 71, 96, 88, 89, 95 };
    assertEquals(2148, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case7() {
    int[] height = { 27, 26, 26, 27, 27, 27, 28, 29, 27, 28, 29, 27, 28, 29, 27, 26 };
    assertEquals(494, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case8() {
    int[] height = { 51, 21, 16, 36, 38, 55, 16, 54, 72, 14, 65, 73, 30, 82, 30, 52 };
    assertEquals(1718, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case9() {
    int[] height = { 84, 33, 70, 49, 62, 58, 77, 72, 6, 48, 23, 41, 10, 67, 25, 47 };
    assertEquals(1864, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case10() {
    int[] height = { 93, 56, 90, 22, 60, 67, 77, 93, 20, 12, 11, 22, 69, 36, 83, 79 };
    assertEquals(2328, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case11() {
    int[] height = { 97, 97, 98, 98, 98, 98, 97, 98, 98, 98, 98, 98, 97, 98, 97, 97 };
    assertEquals(1600, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case12() {
    int[] height = { 13, 38, 35, 24, 6, 7, 45, 2, 3, 2, 43, 22, 37, 25, 2, 24 };
    assertEquals(1048, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case13() {
    int[] height = { 33, 98, 70, 31, 79, 24, 92, 52, 75, 72, 36, 43, 74, 78, 23, 90 };
    assertEquals(2174, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case14() {
    int[] height = { 4, 3, 3, 3, 4, 3, 4, 4, 3, 4, 4, 4, 3, 3, 3, 4 };
    assertEquals(96, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case15() {
    int[] height = { 8, 8, 5, 5, 6, 8, 2, 5, 6, 8, 4, 6, 3, 4, 7, 8 };
    assertEquals(196, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case16() {
    int[] height = { 83, 92, 81, 73, 76, 94, 61, 63, 60, 63, 89, 58, 91, 76, 59, 62 };
    assertEquals(1784, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case17() {
    int[] height = { 38, 9, 22, 26, 65, 46, 35, 58, 64, 46, 29, 25, 17, 68, 36, 66 };
    assertEquals(1512, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case18() {
    int[] height = { 4, 8, 4, 11, 5, 3, 2, 7, 12, 3, 10, 3, 7, 2, 7, 12 };
    assertEquals(270, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case19() {
    int[] height = { 36, 8, 67, 36, 25, 78, 95, 62, 29, 18, 80, 7, 25, 12, 69, 70 };
    assertEquals(2024, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case20() {
    int[] height = { 20, 80, 26, 11, 5, 33, 13, 87, 51, 33, 73, 70, 51, 56, 77, 37 };
    assertEquals(1948, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case21() {
    int[] height = { 43, 13, 8, 11, 57, 62, 13, 26, 18, 12, 51, 25, 54, 50, 47, 32 };
    assertEquals(1412, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case22() {
    int[] height = { 40, 42, 41, 29, 50, 23, 40, 41, 41, 65, 46, 64, 61, 69, 37, 11 };
    assertEquals(1340, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case23() {
    int[] height = { 76, 76, 49, 49, 56, 7, 2, 71, 89, 83, 46, 57, 70, 90, 82, 92 };
    assertEquals(2216, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case24() {
    int[] height = { 85, 82, 66, 67, 56, 81, 60, 57, 55, 65, 60, 55, 79, 62, 60, 60 };
    assertEquals(1458, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case25() {
    int[] height = { 61, 46, 98, 37, 85, 59, 97, 87, 77, 68, 86, 71, 34, 92, 26, 26 };
    assertEquals(2228, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case26() {
    int[] height = { 6, 25, 74, 59, 62, 38, 20, 42, 6, 59, 20, 38, 65, 47, 69, 17 };
    assertEquals(1712, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case27() {
    int[] height = { 47, 42, 19, 45, 90, 87, 73, 96, 11, 15, 33, 95, 66, 58, 64, 49 };
    assertEquals(2150, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case28() {
    int[] height = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(32, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case29() {
    int[] height = { 21, 36, 61, 82, 73, 21, 81, 23, 30, 78, 5, 35, 83, 20, 35, 45 };
    assertEquals(1882, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case30() {
    int[] height = { 15, 7, 17, 39, 28, 18, 36, 30, 15, 3, 11, 8, 36, 7, 33, 17 };
    assertEquals(842, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case31() {
    int[] height = { 81, 31, 45, 23, 87, 47, 80, 59, 36, 34, 29, 47, 68, 62, 38, 28 };
    assertEquals(1676, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case32() {
    int[] height = { 56, 55, 51, 42, 31, 53, 84, 43, 38, 82, 74, 89, 69, 57, 47, 77 };
    assertEquals(1726, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case33() {
    int[] height = { 81, 50, 27, 90, 70, 67, 75, 40, 44, 85, 80, 83, 67, 44, 80, 62 };
    assertEquals(1924, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case34() {
    int[] height = { 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2 };
    assertEquals(64, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case35() {
    int[] height = { 69, 42, 77, 39, 30, 43, 62, 42, 34, 70, 72, 72, 42, 51, 71, 66 };
    assertEquals(1666, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case36() {
    int[] height = { 25, 32, 17, 44, 45, 50, 11, 66, 38, 12, 49, 42, 15, 62, 40, 24 };
    assertEquals(1354, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case37() {
    int[] height = { 5, 7, 26, 8, 9, 23, 27, 24, 26, 10, 12, 26, 26, 4, 8, 26 };
    assertEquals(732, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case38() {
    int[] height = { 16, 22, 14, 20, 18, 15, 22, 19, 14, 11, 21, 9, 19, 14, 22, 9 };
    assertEquals(490, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case39() {
    int[] height = { 3, 8, 2, 8, 2, 2, 6, 5, 4, 2, 9, 5, 3, 7, 5, 7 };
    assertEquals(200, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case40() {
    int[] height = { 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97 };
    assertEquals(1568, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case41() {
    int[] height = { 99, 93, 75, 80, 93, 84, 95, 86, 94, 76, 99, 77, 82, 78, 92, 85 };
    assertEquals(1782, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case42() {
    int[] height = { 79, 43, 17, 44, 56, 67, 53, 22, 21, 83, 86, 17, 36, 64, 39, 33 };
    assertEquals(1784, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case43() {
    int[] height = { 90, 90, 92, 92, 95, 94, 96, 98, 99, 87, 88, 94, 90, 96, 86, 90 };
    assertEquals(1664, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case44() {
    int[] height = { 59, 95, 94, 21, 43, 25, 23, 79, 87, 82, 48, 40, 40, 76, 26, 22 };
    assertEquals(2096, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case45() {
    int[] height = { 92, 89, 69, 88, 70, 71, 97, 87, 66, 92, 96, 97, 75, 86, 97, 99 };
    assertEquals(1908, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case46() {
    int[] height = { 71, 79, 69, 82, 63, 74, 76, 63, 71, 64, 60, 72, 76, 71, 67, 75 };
    assertEquals(1418, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case47() {
    int[] height = { 30, 87, 95, 21, 72, 86, 31, 69, 60, 92, 66, 56, 51, 60, 9, 96 };
    assertEquals(2212, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case48() {
    int[] height = { 57, 42, 62, 2, 20, 85, 78, 92, 53, 73, 29, 87, 92, 61, 36, 16 };
    assertEquals(2210, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case49() {
    int[] height = { 96, 91, 87, 75, 62, 60, 53, 75, 99, 90, 98, 66, 49, 72, 74, 77 };
    assertEquals(1940, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case50() {
    int[] height = { 16, 56, 68, 41, 37, 45, 90, 33, 68, 15, 13, 31, 94, 88, 21, 86 };
    assertEquals(2082, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case51() {
    int[] height = { 97, 97, 96, 94, 88, 95, 89, 95, 89, 91, 89, 90, 89, 91, 94, 92 };
    assertEquals(1634, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case52() {
    int[] height = { 51, 30, 47, 47, 33, 39, 1, 13, 63, 78, 16, 48, 6, 30, 55, 41 };
    assertEquals(1530, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case53() {
    int[] height = { 100, 99, 100, 100, 100, 100, 100, 100, 99, 100, 100, 100, 99, 100, 99, 99 };
    assertEquals(1630, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case54() {
    int[] height = { 23, 67, 54, 64, 71, 47, 83, 29, 42, 50, 68, 67, 61, 62, 76, 25 };
    assertEquals(1720, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case55() {
    int[] height = { 78, 23, 65, 42, 34, 77, 66, 52, 89, 97, 35, 35, 73, 55, 68, 97 };
    assertEquals(2040, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case56() {
    int[] height = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    assertEquals(1616, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case57() {
    int[] height = { 100, 1, 100, 1, 100, 1, 1, 100, 1, 100, 1, 100, 1, 100, 100, 1 };
    assertEquals(3200, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case58() {
    int[] height = { 77, 78, 58, 34, 30, 20, 8, 71, 37, 74, 21, 45, 39, 16, 4, 59 };
    assertEquals(1798, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case59() {
    int[] height = { 100, 100, 100, 100, 100, 100, 100, 100, 50, 50, 49, 49, 49, 49, 48, 48 };
    assertEquals(2440, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case60() {
    int[] height = { 59, 39, 67, 46, 29, 89, 90, 48, 71, 52, 19, 26, 86, 12, 82, 98 };
    assertEquals(2180, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case61() {
    int[] height = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(32, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case62() {
    int[] height = { 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    assertEquals(64, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case63() {
    int[] height = { 32, 67, 12, 56, 98, 34, 78, 100, 1, 4, 79, 24, 59, 60, 61, 62 };
    assertEquals(2212, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case64() {
    int[] height = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    assertEquals(368, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case65() {
    int[] height = { 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2 };
    assertEquals(64, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case66() {
    int[] height = { 25, 88, 87, 84, 25, 41, 98, 48, 55, 89, 92, 10, 93, 19, 44, 34 };
    assertEquals(2394, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case67() {
    int[] height = { 16, 15, 12, 8, 14, 13, 9, 4, 11, 10, 6, 2, 7, 5, 3, 1 };
    assertEquals(368, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case68() {
    int[] height = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1, 1, 15, 16 };
    assertEquals(212, sixteenbricks.maximumSurface(height));
  }

  @Test
  public void case69() {
    int[] height = { 1, 2, 5, 10, 13, 22, 17, 6, 100, 99, 70, 40, 60, 81, 37, 88 };
    assertEquals(2236, sixteenbricks.maximumSurface(height));
  }

}
