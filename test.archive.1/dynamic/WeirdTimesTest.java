package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class WeirdTimesTest {
  WeirdTimes weirdtimes = new WeirdTimes();

  @Test
  public void case1() {
    int[] minuteValues = { 22, 11, 33 };
    int K = 3;
    assertArrayEquals(new int[] { 0, 1, 3 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case2() {
    int[] minuteValues = { 10 };
    int K = 2;
    assertArrayEquals(new int[] { 1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case3() {
    int[] minuteValues = { 2, 1 };
    int K = 20;
    assertArrayEquals(new int[] { 0, 20 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case4() {
    int[] minuteValues = { 1, 2 };
    int K = 20;
    assertArrayEquals(new int[] { 0, 19 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case5() {
    int[] minuteValues = { 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 15, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    int K = 1;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case6() {
    int[] minuteValues = { 43, 31, 18, 46, 57, 9, 7, 24, 31, 43, 45, 38, 28, 13, 0, 8, 11, 49, 51, 10, 34 };
    int K = 9660;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 2, 3, 4, 4, 4, 4, 4, 5, 6, 7, 8, 8, 13, 13, 13, 17, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case7() {
    int[] minuteValues = { 52, 34, 29, 45, 43, 0, 34, 30, 31, 37, 10, 15, 25, 46, 23, 25, 36, 55, 27, 52, 54, 58, 48, 7, 36, 46, 5, 39, 18 };
    int K = 1361;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 10, 10, 20, 21, 21, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case8() {
    int[] minuteValues = { 9, 55, 28, 6, 35, 45, 45, 34, 37, 11, 51, 8, 48, 12, 53, 17, 34, 44, 10, 44, 35, 4, 22, 18, 16, 34, 17, 51, 6, 17, 0, 4, 45, 34, 49, 9, 38, 8 };
    int K = 16881;
    assertArrayEquals(new int[] { 0, 0, 1, 2, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 9, 9, 10, 11, 11, 12, 14, 14, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 21, 21, 22, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case9() {
    int[] minuteValues = { 42, 42, 21, 29, 23, 38, 0, 18, 44 };
    int K = 27941;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 7, 8, 10, 10, 14 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case10() {
    int[] minuteValues = { 6, 52, 55, 59, 42, 43, 39, 37, 49, 48, 44, 29, 53, 14, 34, 48, 16, 10, 22, 11, 4, 52, 27, 28, 33, 54, 48, 33, 24, 37, 1, 38, 21, 33 };
    int K = 8661;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 1, 1, 2, 3, 3, 4, 5, 6, 6, 7, 7, 7, 8, 9, 9, 10, 11, 11, 12, 13, 13, 13, 14, 16, 19, 19, 20, 21, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case11() {
    int[] minuteValues = { 8, 11, 7, 16, 44, 39, 58, 55, 47, 51, 41, 9, 17, 17, 37, 36, 16, 52, 46, 56, 21, 42, 7, 16, 41, 39, 52, 46, 37, 37, 13, 59, 49, 54 };
    int K = 26219;
    assertArrayEquals(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 7, 8, 9, 12, 13, 13, 14, 14, 15, 15, 16, 17, 17, 18, 19, 20, 21, 21, 22, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case12() {
    int[] minuteValues = { 35, 31, 5, 18, 30, 6, 31, 55, 53, 7, 31, 30, 10, 14, 20, 55, 50, 11, 49, 42, 31, 34, 34, 37, 55, 49, 56, 20, 15, 36, 8, 1, 16, 4, 33, 44, 21, 59, 7, 12, 45 };
    int K = 30356;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case13() {
    int[] minuteValues = { 38, 34, 23, 33, 19, 10, 14, 48, 37 };
    int K = 11665;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 4, 10, 12, 13, 18 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case14() {
    int[] minuteValues = { 53, 46, 35, 48, 41, 23, 18, 7, 47, 58, 12, 42 };
    int K = 28094;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 3, 4, 6, 9, 10, 13, 15, 18 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case15() {
    int[] minuteValues = { 42, 6, 29, 24, 5, 22, 36, 31, 47, 45, 43 };
    int K = 21492;
    assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 3, 8, 13, 13, 16, 20 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case16() {
    int[] minuteValues = { 26, 8, 1, 52, 4, 17, 44, 13, 23, 28, 53, 50, 20, 38, 15, 6, 23, 24, 44, 34, 16, 19, 43, 9, 29, 49, 23, 17, 36, 40, 47, 24, 30, 8, 44, 7, 31, 28, 18, 50, 52, 58, 44, 53 };
    int K = 7382;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 6, 7, 8, 8, 8, 8, 9, 10, 10, 10, 11, 11, 12, 13, 14, 14, 14, 14, 15, 15, 16, 16, 17, 17, 18, 20, 20, 21, 21, 22, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case17() {
    int[] minuteValues = { 47, 5, 16, 0, 28, 49, 9, 38, 19, 26, 48, 4, 22, 48, 0, 55, 55, 24 };
    int K = 13566;
    assertArrayEquals(new int[] { 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 11, 12, 13, 14, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case18() {
    int[] minuteValues = { 43, 11, 4, 15, 59, 57, 46, 23, 31, 2, 54, 1, 9, 19, 59, 30, 2, 0, 45, 13, 3, 52, 55, 22, 3 };
    int K = 1858;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 2, 3, 4, 5, 5, 6, 6, 7, 7, 7, 7, 8, 9, 10, 10, 11, 16, 18, 20, 21, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case19() {
    int[] minuteValues = { 39, 32, 58, 18, 14, 12, 31, 1, 36, 12, 56, 7, 57, 55, 49, 40, 53, 36, 12, 56, 18, 3 };
    int K = 23672;
    assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 13, 15, 17, 18, 19, 19, 21, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case20() {
    int[] minuteValues = { 11, 3, 19, 29, 45, 48, 25, 43, 52, 19, 24, 21, 52, 51, 11, 52, 32, 49, 17, 37, 18, 35, 47, 32, 13, 12, 0, 23, 8, 43, 30, 14, 47, 46, 28, 12, 23, 33, 27, 18, 41, 16, 1 };
    int K = 7535;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case21() {
    int[] minuteValues = { 35, 28, 59, 33, 50, 54, 10, 28, 34, 32, 21, 40, 45, 14, 3, 54, 18, 26, 37, 5, 10, 40, 32, 47, 59, 58, 26, 23, 58, 34, 13, 39, 33, 0, 36, 39, 25, 6, 12, 12, 10, 17, 30, 53, 28, 6, 3, 57, 28, 9 };
    int K = 23989;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case22() {
    int[] minuteValues = { 44, 45, 39, 15, 19, 51, 26, 18, 57, 59, 35, 24, 21, 9, 23, 35, 16, 4, 54, 23, 25, 5, 47, 32, 5, 46, 25, 51, 33, 13 };
    int K = 5083;
    assertArrayEquals(new int[] { 0, 0, 1, 2, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 8, 9, 10, 10, 11, 12, 13, 13, 14, 15, 15, 17, 18, 20, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case23() {
    int[] minuteValues = { 54, 18, 31, 19, 12, 51, 7, 50, 38, 23, 58, 19, 13, 33, 53, 11, 2, 43, 57, 5, 41, 31, 9, 3, 44 };
    int K = 3914;
    assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 8, 9, 10, 10, 10, 13, 15, 17, 20, 22, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case24() {
    int[] minuteValues = { 34, 57, 12, 27, 44, 39, 45, 30, 35, 14, 41, 5, 39, 32, 3, 28, 0, 34, 30, 19, 13, 28, 32, 12, 28, 42, 27, 21, 11, 44, 31, 54, 26, 55 };
    int K = 10538;
    assertArrayEquals(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 11, 11, 11, 13, 14, 15, 16, 17, 18, 18, 21, 21, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case25() {
    int[] minuteValues = { 11, 12, 37, 14, 6, 8, 50, 56, 33, 24, 34, 28, 39, 47, 24, 31, 54, 14, 30, 22, 22, 11, 14, 29, 4, 6, 8, 58 };
    int K = 28878;
    assertArrayEquals(new int[] { 0, 0, 0, 1, 2, 2, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 9, 11, 14, 16, 18, 19, 21, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case26() {
    int[] minuteValues = { 52, 33, 45, 9, 10, 31, 48, 55, 10, 8 };
    int K = 2435;
    assertArrayEquals(new int[] { 0, 1, 1, 2, 2, 2, 3, 9, 11, 18 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case27() {
    int[] minuteValues = { 56, 34, 49, 24, 25, 58, 35, 44, 57, 17, 8 };
    int K = 11809;
    assertArrayEquals(new int[] { 0, 1, 1, 2, 2, 2, 4, 9, 13, 19, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case28() {
    int[] minuteValues = { 7, 5, 54, 57, 37, 47, 4, 14, 23, 22, 26, 21, 55, 25, 44, 32, 17, 42, 50, 44, 35, 19, 25, 42, 48, 48, 1, 3, 12, 1, 7, 36, 21, 15, 30, 1, 13, 34 };
    int K = 16709;
    assertArrayEquals(new int[] { 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 8, 8, 9, 10, 11, 11, 11, 11, 12, 14, 17, 17, 18, 19, 19, 21, 22, 22, 23, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case29() {
    int[] minuteValues = { 34, 57, 46, 4, 23, 21, 36, 42, 29, 11, 21, 22, 0, 45, 39, 59, 20, 19, 37, 29, 26, 46, 34 };
    int K = 8376;
    assertArrayEquals(new int[] { 0, 0, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 7, 8, 11, 12, 15, 16, 16, 21 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case30() {
    int[] minuteValues = { 16, 2, 4, 22, 41, 46, 4, 32, 26, 44, 51, 37, 56, 11 };
    int K = 5459;
    assertArrayEquals(new int[] { 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 8, 17, 21, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case31() {
    int[] minuteValues = { 9, 29, 39, 45, 30, 8, 26, 14, 54, 44, 46, 1, 59, 55, 28, 2, 25, 30, 33, 14 };
    int K = 22853;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 9, 11, 13, 18, 18, 20 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case32() {
    int[] minuteValues = { 43, 49, 36, 17, 36, 25 };
    int K = 717;
    assertArrayEquals(new int[] { 0, 0, 1, 5, 10, 16 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case33() {
    int[] minuteValues = { 21, 21, 47, 37, 9, 13, 16, 52, 38, 16, 2, 8, 55, 47, 52, 3, 35, 0, 56, 26, 48, 55, 29, 39, 31, 51, 45, 59, 12, 41, 5, 19, 33, 32, 2, 52, 24, 57, 0, 41, 48 };
    int K = 19190;
    assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 3, 3, 3, 4, 5, 6, 6, 6, 7, 7, 8, 8, 10, 10, 11, 11, 12, 13, 13, 14, 14, 15, 15, 17, 17, 18, 18, 18, 20, 21, 21, 22, 22, 23, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case34() {
    int[] minuteValues = { 54, 35, 10, 39, 7, 13, 27, 24, 27, 48, 10, 4, 33, 1, 49, 5, 54, 26, 13, 30, 13, 32, 21, 4, 39, 51, 10, 32, 23, 3, 17, 23, 13, 1, 46, 2, 21, 23, 55, 7, 11, 0, 24, 8, 20, 36, 38, 11 };
    int K = 27856;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case35() {
    int[] minuteValues = { 5, 9, 45, 55, 39, 51, 26, 58, 2 };
    int K = 21806;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 3, 4, 14, 16, 19 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case36() {
    int[] minuteValues = { 59, 59, 41, 49, 14, 37, 46, 42, 5, 27, 43, 10, 53, 7, 1, 55, 2, 29, 52, 44, 21, 54, 35, 20, 27, 31, 47, 28, 22, 0, 13, 24, 45, 42, 15, 45, 48, 59, 9, 16, 5, 41, 36, 53, 12, 46, 20, 44, 46, 19 };
    int K = 3700;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case37() {
    int[] minuteValues = { 4, 27, 37, 50, 2, 53, 53, 8, 19, 7, 4, 51, 37, 17, 44, 38, 46, 49, 59, 0, 8, 25, 22, 43, 37, 16, 24, 26, 44, 24, 23, 20, 50, 12, 2, 7, 12, 28, 3, 44, 24, 1, 35, 27, 59, 11, 50, 28, 22, 40 };
    int K = 27706;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case38() {
    int[] minuteValues = { 43, 10, 19, 14, 6, 4, 49, 21, 7, 37, 54, 3, 34, 21, 45, 50, 2, 1, 38, 43, 18, 25, 56, 19, 10, 48, 35, 37, 36, 22, 9, 5, 6, 1, 8, 40, 19, 38, 0, 49, 40, 37, 35, 24, 45, 7, 52, 57, 24, 11 };
    int K = 27617;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case39() {
    int[] minuteValues = { 25, 23, 46, 16, 42, 57, 2, 8, 38, 14, 44, 10, 52, 4, 14, 14, 41, 2, 51, 50, 34, 0, 25, 54, 11, 18, 14, 22, 13, 18, 50, 53, 52, 0, 0, 15, 13, 44, 7, 52, 49, 57, 50, 37, 42, 17, 35, 44, 28, 29 };
    int K = 5272;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case40() {
    int[] minuteValues = { 34, 47, 2, 10, 27, 48, 7, 42, 38, 47, 13, 32, 36, 19, 32, 33, 4, 52, 5, 26, 20, 9, 40, 12, 56, 8, 49, 2, 27, 46, 1, 10, 8, 25, 45, 24, 37, 55, 35, 40, 42, 33, 52, 7, 53, 8, 45, 41, 10, 46 };
    int K = 6771;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case41() {
    int[] minuteValues = { 17, 39, 30, 12, 0, 59, 37, 5, 20, 35, 39, 41, 42, 20, 29, 23, 7, 32, 47, 38, 9, 37, 6, 36, 26, 41, 53, 32, 6, 56, 4, 52, 50, 26, 6, 48, 37, 7, 49, 58, 39, 13, 8, 54, 8, 5, 44, 46, 2, 36 };
    int K = 29428;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case42() {
    int[] minuteValues = { 14, 23, 9, 29, 57, 20, 44, 0, 21, 15, 23, 59, 1, 46, 4, 26, 10, 37, 58, 52, 19, 40, 53, 44, 51, 45, 49, 30, 0, 56, 50, 30, 0, 14, 4, 9, 48, 18, 19, 21, 39, 22, 43, 8, 48, 57, 14, 48, 42, 3 };
    int K = 19027;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case43() {
    int[] minuteValues = { 51, 10, 48, 42, 21, 44, 43, 13, 17, 41, 49, 30, 56, 22, 32, 30, 23, 46, 3, 3, 6, 48, 14, 30, 29, 5, 39, 40, 57, 15, 47, 27, 24, 18, 32, 30, 51, 59, 32, 41, 52, 42, 10, 44, 33, 48, 55, 6, 59, 4 };
    int K = 27781;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case44() {
    int[] minuteValues = { 30, 9, 18, 23, 0, 57, 19, 7, 0, 33, 23, 56, 37, 1, 17, 2, 59, 28, 3, 48, 2, 8, 34, 42, 28, 27, 15, 38, 16, 9, 22, 14, 0, 42, 17, 37, 50, 30, 29, 45, 51, 11, 16, 45, 55, 6, 47, 31, 25, 46 };
    int K = 26260;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case45() {
    int[] minuteValues = { 10, 17, 53, 50, 4, 55, 6, 50, 37, 56, 18, 14, 40, 38, 22, 17, 11, 7, 51, 18, 57, 23, 8, 33, 58, 37, 9, 40, 52, 34, 14, 38, 33, 39, 16, 10, 23, 45, 26, 9, 51, 6, 18, 55, 53, 49, 21, 39, 30, 4 };
    int K = 19637;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case46() {
    int[] minuteValues = { 17, 55, 45, 35, 31, 12, 8, 36, 31, 17, 20, 35, 49, 51, 31, 34, 23, 38, 21, 52, 16, 21, 46, 4, 54, 48, 27, 43, 23, 59, 55, 21, 52, 0, 38, 55, 57, 11, 10, 40, 33, 13, 10, 45, 45, 19, 35, 29, 31, 53 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case47() {
    int[] minuteValues = { 31, 49, 27, 30, 58, 2, 38, 4, 30, 52, 18, 57, 24, 18, 2, 55, 46, 24, 1, 42, 44, 29, 48, 33, 10, 29, 32, 22, 35, 15, 13, 41, 1, 48, 55, 3, 6, 52, 4, 20, 30, 0, 42, 43, 42, 17, 34, 48, 41, 4 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case48() {
    int[] minuteValues = { 2, 5, 23, 50, 46, 4, 54, 13, 12, 39, 58, 31, 45, 35, 22, 41, 9, 2, 59, 17, 9, 44, 46, 58, 51, 3, 39, 31, 13, 24, 16, 15, 20, 47, 53, 48, 2, 28, 59, 58, 41, 39, 36, 9, 57, 36, 54, 33, 4, 32 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case49() {
    int[] minuteValues = { 33, 41, 48, 11, 22, 19, 55, 12, 10, 42, 58, 13, 52, 58, 38, 58, 21, 39, 26, 46, 7, 21, 1, 50, 45, 34, 42, 34, 4, 28, 58, 46, 33, 54, 38, 22, 27, 50, 37, 57, 9, 8, 41, 14, 47, 54, 5, 16, 33, 11 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case50() {
    int[] minuteValues = { 20, 45, 9, 22, 0, 27, 10, 3, 42, 37, 49, 45, 6, 0, 18, 13, 28, 4, 39, 3, 33, 6, 13, 31, 47, 0, 51, 45, 8, 49, 1, 23, 52, 11, 39, 50, 37, 9, 22, 56, 55, 29, 51, 40, 35, 26, 48, 3, 44, 5 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case51() {
    int[] minuteValues = { 43, 12, 29, 52, 45, 34, 19, 18, 19, 58, 0, 57, 24, 48, 58, 52, 25, 12, 20, 54, 56, 20, 11, 42, 12, 6, 10, 20, 44, 4, 55, 0, 35, 6, 24, 5, 47, 38, 9, 33, 13, 32, 8, 43, 29, 27, 7, 57, 57, 48 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case52() {
    int[] minuteValues = { 43, 43, 0, 20, 40, 42, 56, 57, 11, 54, 36, 36, 28, 25, 43, 9, 21, 24, 9, 3, 23, 26, 54, 21, 29, 49, 31, 59, 55, 22, 10, 49, 47, 31, 7, 45, 48, 32, 56, 41, 26, 3, 25, 0, 30, 11, 0, 2, 54, 54 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case53() {
    int[] minuteValues = { 46, 20, 21, 7, 27, 35, 33, 3, 0, 42, 8, 58, 29, 8, 18, 33, 39, 24, 4, 56, 39, 41, 20, 26, 10, 32, 34, 12, 43, 45, 51, 30, 17, 52, 40, 44, 26, 30, 29, 24, 1, 10, 34, 3, 28, 51, 10, 17, 25, 34 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case54() {
    int[] minuteValues = { 40, 2, 37, 53, 16, 2, 12, 6, 41, 46, 39, 5, 5, 48, 35, 33, 41, 43, 36, 9, 45, 47, 11, 50, 6, 46, 57, 52, 12, 35, 48, 32, 56, 58, 44, 29, 51, 9, 17, 59, 47, 53, 31, 40, 50, 3, 53, 21, 29, 53 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case55() {
    int[] minuteValues = { 16, 19, 52, 49, 2, 6, 12, 41, 48, 41, 26, 24, 17, 35, 16, 11, 42, 38, 10, 42, 24, 47, 8, 8, 2, 14, 59, 50, 40, 37, 5, 13, 47, 33, 39, 24, 35, 0, 37, 6, 29, 29, 13, 48, 12, 33, 23, 35, 14, 58 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case56() {
    int[] minuteValues = { 0 };
    int K = 1000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case57() {
    int[] minuteValues = { 0 };
    int K = 1;
    assertArrayEquals(new int[] { 0 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case58() {
    int[] minuteValues = { 0 };
    int K = 24;
    assertArrayEquals(new int[] { 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case59() {
    int[] minuteValues = { 0 };
    int K = 25;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case60() {
    int[] minuteValues = { 59 };
    int K = 24;
    assertArrayEquals(new int[] { 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case61() {
    int[] minuteValues = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    int K = 1;
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case62() {
    int[] minuteValues = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    int K = 2;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case63() {
    int[] minuteValues = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    int K = 1;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case64() {
    int[] minuteValues = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6 };
    int K = 1;
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case65() {
    int[] minuteValues = { 5, 6, 5, 6, 5, 6, 5, 6, 5, 6, 5, 6, 5, 6, 5, 6, 5, 6, 5, 6, 5, 6, 5, 6, 5 };
    int K = 5551;
    assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 12, 12, 17, 20, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case66() {
    int[] minuteValues = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int K = 1000000000;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 5, 6, 8, 8, 10, 11, 13, 13, 15, 15, 15 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case67() {
    int[] minuteValues = { 45, 12, 0, 3, 2, 7, 4, 9, 23, 6, 17, 33 };
    int K = 12345;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 3, 3, 4, 5, 12, 13, 18, 18 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case68() {
    int[] minuteValues = { 7, 11, 22, 33, 44, 55, 32, 43, 54, 12 };
    int K = 54321;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 7, 8, 9, 12, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case69() {
    int[] minuteValues = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11 };
    int K = 1000000;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 7, 8, 11, 13, 14, 15, 17, 21 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case70() {
    int[] minuteValues = { 50, 49, 48, 47, 46, 45, 43, 42, 41, 40, 31, 32, 33, 34, 35, 36, 37, 38, 39 };
    int K = 1000000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case71() {
    int[] minuteValues = { 44, 7, 11, 35, 48, 5, 37, 43, 0, 3, 48, 2, 38, 20, 56, 36, 37, 26, 14, 18, 36, 13, 42, 7, 59, 37, 52, 8, 41, 13, 35, 56, 15, 11, 46, 24, 16, 24, 19, 16, 1, 17, 2, 46, 23, 42, 2, 32, 27, 50 };
    int K = 900020139;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case72() {
    int[] minuteValues = { 33, 7, 35, 41, 4, 4, 12, 9, 1, 8, 34, 42, 50, 53, 57, 18, 37, 52, 46, 22, 29, 15, 23, 31, 27, 16, 35, 14, 25, 24, 43, 46, 47, 44, 25, 9, 11, 10, 31, 29, 7, 3, 28, 10, 52, 28, 24, 19, 6, 55 };
    int K = 900010439;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case73() {
    int[] minuteValues = { 5, 15, 13, 19, 30, 39, 32, 27, 14, 27, 51, 20, 26, 3, 37, 5, 19, 31, 35, 58, 52, 47, 17, 30, 34, 28, 15, 20, 52, 16, 35, 0, 31, 27, 9, 28, 35, 42, 19, 11, 35, 23, 3, 14, 45, 48, 49, 14, 57, 48 };
    int K = 900000786;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case74() {
    int[] minuteValues = { 8, 51, 57, 24, 4, 46, 59, 56, 2, 48, 49, 16, 47, 11, 40, 15, 55, 45, 14, 26, 27, 52, 39, 36, 53, 44, 47, 35, 21, 36, 10, 18, 2, 40, 56, 25, 57, 29, 2, 49, 9, 57, 16, 45, 32, 1, 33, 31, 17, 9 };
    int K = 900019121;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case75() {
    int[] minuteValues = { 39, 3, 52, 53, 13, 26, 22, 34, 50, 3, 25, 52, 34, 21, 58, 21, 22, 6, 13, 5, 21, 22, 28, 3, 47, 47, 11, 30, 54, 5, 56, 8, 11, 19, 4, 38, 18, 6, 13, 41, 5, 22, 1, 41, 2, 54, 51, 52, 2, 27 };
    int K = 900010738;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case76() {
    int[] minuteValues = { 9, 47, 0, 5, 27, 27, 28, 13, 16, 12, 44, 42, 27, 24, 24, 4, 42, 29, 9, 12, 24, 56, 12, 23, 6, 48, 59, 12, 18, 16, 26, 24, 27, 55, 28, 19, 5, 32, 59, 58, 36, 57, 34, 39, 19, 0, 26, 25, 43, 7 };
    int K = 900013100;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case77() {
    int[] minuteValues = { 44, 11, 15, 20, 7, 32, 11, 2, 12, 24, 53, 42, 22, 22, 25, 6, 1, 40, 44, 22, 39, 30, 55, 32, 42, 53, 8, 18, 41, 56, 9, 56, 57, 54, 28, 11, 46, 52, 46, 7, 22, 24, 28, 52, 49, 15, 48, 38, 26, 19 };
    int K = 900001761;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case78() {
    int[] minuteValues = { 13, 23, 42, 47, 37, 27, 26, 19, 16, 31, 53, 39, 40, 3, 15, 52, 40, 9, 0, 18, 40, 10, 35, 33, 53, 46, 19, 15, 4, 1, 13, 29, 49, 45, 41, 9, 7, 10, 52, 55, 47, 28, 38, 35, 32, 29, 53, 31, 41, 42 };
    int K = 900000951;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case79() {
    int[] minuteValues = { 13, 45, 30, 31, 22, 47, 15, 56, 17, 7, 20, 54, 24, 0, 43, 54, 13, 11, 18, 24, 2, 0, 56, 24, 2, 53, 48, 51, 24, 27, 42, 38, 1, 22, 13, 48, 34, 15, 25, 42, 11, 20, 49, 44, 45, 50, 36, 18, 15, 25 };
    int K = 900007341;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case80() {
    int[] minuteValues = { 15, 25, 43, 25, 58, 41, 13, 42, 57, 13, 22, 42, 46, 39, 56, 5, 28, 13, 7, 57, 58, 36, 49, 32, 49, 9, 40, 8, 20, 45, 10, 36, 35, 42, 43, 24, 3, 56, 13, 10, 14, 47, 36, 37, 1, 35, 27, 50, 22, 45 };
    int K = 900023604;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case81() {
    int[] minuteValues = { 3, 7, 11, 53, 25, 26, 44, 33, 37, 38, 38, 39, 41, 41, 30, 44, 49, 52, 53, 20, 54, 57, 58, 59, 59 };
    int K = 900014122;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 1, 1, 1, 2, 3, 9, 10, 10, 12, 13, 14, 16, 16, 16, 16, 17, 18, 19, 19, 20, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case82() {
    int[] minuteValues = { 1, 3, 6, 7, 11, 13, 20, 58, 21, 21, 38, 24, 38, 55, 31, 34, 35, 36, 52, 23, 24, 37, 40, 54, 54, 54, 54, 28, 58, 20 };
    int K = 900007936;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 5, 5, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 11, 11, 13, 14, 15, 17, 18, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case83() {
    int[] minuteValues = { 10, 18, 20, 20, 39, 49, 25, 25, 25, 28, 33, 35, 40, 39, 21, 40, 36, 43, 44, 45, 45, 49, 58, 50, 23 };
    int K = 900006099;
    assertArrayEquals(new int[] { 0, 0, 0, 1, 4, 4, 6, 8, 9, 9, 9, 9, 10, 11, 12, 12, 13, 13, 13, 14, 15, 15, 20, 21, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case84() {
    int[] minuteValues = { 0, 2, 17, 19, 22, 22, 23, 23, 25, 31, 32, 33, 34, 35, 38, 42, 44, 45, 50, 57 };
    int K = 900000543;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 1, 1, 8, 9, 9, 12, 14, 14, 14, 19, 21, 21, 21, 21, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case85() {
    int[] minuteValues = { 4, 8, 8, 8, 10, 11, 13, 18, 19, 27, 23, 20, 27, 23, 30, 31, 53, 36, 59, 37, 37, 40, 40, 44, 44, 53, 33, 54, 36, 59 };
    int K = 900011126;
    assertArrayEquals(new int[] { 0, 0, 1, 3, 3, 3, 3, 3, 4, 4, 5, 6, 6, 7, 7, 7, 8, 10, 11, 14, 15, 16, 17, 18, 19, 19, 20, 20, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case86() {
    int[] minuteValues = { 0, 2, 2, 3, 4, 8, 10, 11, 14, 15, 16, 34, 20, 21, 24, 24, 26, 26, 32, 17, 36, 38, 39, 43, 47, 48, 54, 55, 56, 57, 57, 59, 59 };
    int K = 900026475;
    assertArrayEquals(new int[] { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 4, 11, 11, 12, 14, 14, 16, 16, 17, 17, 18, 18, 18, 18, 20, 20, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case87() {
    int[] minuteValues = { 0, 1, 28, 36, 36, 21, 22, 3, 30, 30, 31, 29, 34, 35, 7, 36, 3, 41, 57, 53, 53, 53, 58 };
    int K = 900022068;
    assertArrayEquals(new int[] { 0, 0, 3, 3, 5, 7, 7, 8, 8, 9, 10, 11, 11, 13, 14, 14, 15, 17, 17, 18, 22, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case88() {
    int[] minuteValues = { 50, 6, 6, 11, 12, 32, 39, 59, 18, 27, 38, 28, 30, 31, 41, 24, 49, 38, 35, 39, 15, 39, 37, 45, 48, 48, 13, 2, 54, 56, 17 };
    int K = 900001869;
    assertArrayEquals(new int[] { 1, 2, 3, 3, 3, 3, 7, 7, 8, 8, 8, 9, 9, 11, 11, 12, 12, 13, 14, 14, 15, 16, 18, 18, 18, 20, 21, 22, 22, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case89() {
    int[] minuteValues = { 1, 9, 13, 22, 14, 15, 16, 16, 17, 19, 49, 20, 58, 23, 42, 57, 29, 32, 14, 36, 36, 41, 25, 46, 46, 47, 20, 53, 56, 28, 57, 34, 58, 59 };
    int K = 900006574;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 4, 5, 6, 6, 6, 7, 7, 8, 8, 10, 11, 13, 13, 16, 16, 17, 17, 17, 18, 19, 20, 20, 20 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case90() {
    int[] minuteValues = { 1, 3, 6, 6, 6, 14, 18, 22, 30, 30, 31, 31, 33, 35, 39, 40, 41, 41, 46, 50, 51, 52, 56 };
    int K = 900003718;
    assertArrayEquals(new int[] { 0, 0, 0, 1, 2, 2, 2, 2, 5, 6, 7, 8, 8, 8, 10, 11, 11, 13, 14, 14, 14, 19, 19 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case91() {
    int[] minuteValues = { 18, 26, 36, 38, 1, 14, 42, 47, 8, 5, 24, 22, 6, 30, 30, 45, 16, 13, 53, 57, 40, 34, 20, 53, 42, 31, 50, 21 };
    int K = 900019064;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case92() {
    int[] minuteValues = { 2, 11, 43, 8, 9, 2, 0, 37, 17, 55, 24, 25, 25, 30, 35, 36, 21, 41, 12, 14, 45, 52, 44, 56 };
    int K = 900005745;
    assertArrayEquals(new int[] { 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 10, 10, 11, 11, 11, 12, 15, 15, 17, 17, 18, 19, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case93() {
    int[] minuteValues = { 7, 9, 11, 29, 17, 17, 35, 15, 23, 33, 34, 34, 35, 32, 39, 40, 41, 43, 44, 45, 47, 48, 50, 51 };
    int K = 900006779;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 1, 2, 2, 3, 3, 6, 6, 8, 8, 9, 9, 11, 12, 12, 14, 15, 18, 18, 21, 21 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case94() {
    int[] minuteValues = { 3, 56, 59, 33, 27, 28, 47, 35, 28, 53, 55, 45, 49, 19, 59, 47, 50, 15, 54, 35, 30, 57, 45, 5 };
    int K = 900021752;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case95() {
    int[] minuteValues = { 37, 4, 7, 8, 10, 10, 2, 19, 21, 21, 22, 24, 47, 29, 29, 14, 39, 43, 43, 26, 49, 50, 51, 57 };
    int K = 900006830;
    assertArrayEquals(new int[] { 0, 1, 1, 1, 2, 3, 4, 5, 5, 7, 9, 9, 9, 10, 11, 13, 15, 18, 19, 20, 22, 22, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case96() {
    int[] minuteValues = { 0, 1, 3, 4, 5, 7, 41, 9, 10, 10, 13, 13, 13, 14, 15, 15, 17, 18, 19, 20, 20, 22, 25, 27, 28, 30, 31, 32, 33, 33, 33, 34, 36, 38, 38, 40, 8, 41, 41, 42, 44, 47, 48, 49, 50, 51, 52, 52, 53, 55 };
    int K = 900024693;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 8, 9, 10, 10, 10, 10, 11, 11, 13, 15, 16, 16, 17, 18, 18, 20, 20, 20, 21, 22, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case97() {
    int[] minuteValues = { 0, 1, 4, 27, 53, 10, 12, 14, 14, 15, 16, 42, 38, 48, 22, 24, 42, 24, 26, 5, 28, 30, 36, 36, 38, 21, 39, 40, 41, 41, 41, 42, 56, 18, 24, 42, 43, 43, 45, 47, 21, 49, 49, 49, 49, 51, 9, 55, 42, 57 };
    int K = 900027595;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case98() {
    int[] minuteValues = { 27, 46, 0, 2, 5, 6, 9, 12, 12, 13, 19, 20, 21, 21, 38, 23, 24, 22, 25, 27, 27, 2, 56, 33, 35, 35, 38, 24, 39, 40, 40, 41, 43, 56, 44, 44, 57, 45, 46, 1, 48, 49, 52, 53, 29, 43, 56, 45, 57, 57 };
    int K = 900015853;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case99() {
    int[] minuteValues = { 1, 1, 13, 2, 2, 3, 2, 6, 58, 11, 12, 12, 5, 13, 15, 17, 18, 18, 19, 23, 23, 25, 25, 27, 27, 28, 28, 29, 30, 30, 31, 40, 34, 34, 36, 38, 38, 51, 43, 44, 46, 48, 32, 51, 51, 54, 54, 55, 57, 10 };
    int K = 900018960;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case100() {
    int[] minuteValues = { 2, 5, 5, 8, 8, 26, 13, 22, 14, 54, 17, 36, 39, 13, 22, 22, 22, 24, 24, 42, 26, 11, 26, 27, 48, 33, 35, 17, 36, 36, 38, 38, 20, 42, 25, 44, 44, 44, 45, 46, 47, 27, 48, 49, 58, 52, 14, 54, 51, 59 };
    int K = 900028948;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case101() {
    int[] minuteValues = { 2, 2, 2, 4, 5, 6, 13, 14, 17, 18, 18, 18, 19, 19, 21, 23, 24, 24, 26, 27, 28, 28, 29, 30, 30, 30, 32, 33, 33, 33, 38, 41, 43, 44, 44, 45, 47, 49, 49, 50, 51, 51, 51, 51, 53, 54, 56, 56, 58, 58 };
    int K = 900002360;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case102() {
    int[] minuteValues = { 0, 1, 2, 2, 3, 4, 4, 5, 5, 6, 14, 18, 20, 20, 21, 23, 25, 25, 26, 27, 28, 30, 34, 34, 34, 34, 35, 35, 35, 37, 37, 37, 38, 40, 41, 42, 42, 43, 45, 48, 48, 49, 49, 50, 53, 55, 56, 56, 56, 59 };
    int K = 900021250;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case103() {
    int[] minuteValues = { 0, 6, 6, 8, 9, 13, 13, 17, 18, 18, 18, 20, 21, 22, 23, 24, 24, 25, 27, 28, 28, 30, 31, 31, 32, 33, 35, 35, 37, 39, 39, 40, 41, 41, 42, 43, 43, 44, 46, 47, 49, 49, 49, 50, 55, 57, 57, 58, 58, 59 };
    int K = 900012748;
    assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 10, 11, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 17, 17, 17, 17, 17, 19, 20, 20, 20, 20, 21, 22, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case104() {
    int[] minuteValues = { 0, 0, 0, 1, 2, 2, 3, 7, 8, 9, 10, 12, 15, 16, 17, 19, 19, 19, 21, 21, 23, 24, 25, 25, 25, 25, 26, 27, 28, 32, 33, 35, 37, 38, 41, 42, 46, 46, 47, 47, 48, 49, 50, 52, 55, 55, 57, 58, 59, 59 };
    int K = 900020395;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 5, 5, 7, 7, 7, 7, 8, 9, 14, 14, 14, 14, 14, 15, 16, 17, 18, 18, 18, 18, 19, 19, 20, 20, 20, 20, 20, 20, 21, 22, 22, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case105() {
    int[] minuteValues = { 1, 1, 2, 2, 6, 6, 6, 7, 8, 10, 11, 11, 13, 13, 15, 15, 15, 17, 17, 17, 20, 23, 24, 25, 26, 26, 28, 29, 31, 31, 31, 32, 33, 33, 36, 36, 38, 41, 42, 43, 44, 44, 44, 44, 46, 47, 53, 54, 55, 59 };
    int K = 900026949;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case106() {
    int[] minuteValues = { 2, 4, 4, 5, 5, 10, 10, 11, 12, 14, 15, 17, 17, 18, 22, 23, 23, 25, 27, 28, 29, 34, 34, 35, 36, 37, 39, 39, 39, 40, 40, 40, 41, 42, 43, 44, 45, 45, 45, 47, 49, 50, 50, 50, 51, 51, 52, 56, 57, 58 };
    int K = 900014428;
    assertArrayEquals(new int[] { 0, 0, 1, 1, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 7, 8, 9, 10, 11, 11, 12, 15, 15, 16, 17, 17, 17, 17, 17, 17, 18, 19, 20, 20, 20, 21, 22, 22, 23, 23, 23, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case107() {
    int[] minuteValues = { 3, 5, 5, 5, 5, 5, 7, 8, 11, 13, 13, 15, 15, 16, 16, 16, 17, 17, 17, 19, 20, 21, 21, 21, 22, 23, 24, 24, 27, 28, 31, 32, 33, 33, 34, 35, 39, 39, 41, 45, 46, 47, 49, 49, 50, 51, 52, 52, 56, 56 };
    int K = 900021435;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case108() {
    int[] minuteValues = { 2, 3, 5, 5, 8, 8, 8, 9, 9, 11, 11, 12, 13, 14, 14, 16, 19, 20, 21, 22, 22, 24, 26, 28, 28, 29, 30, 31, 32, 33, 34, 37, 39, 39, 40, 40, 40, 42, 44, 44, 45, 49, 50, 50, 51, 52, 54, 59, 59, 59 };
    int K = 900031142;
    assertArrayEquals(new int[] { 0, 0, 0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 9, 9, 9, 11, 12, 12, 12, 12, 12, 13, 13, 14, 14, 15, 15, 16, 18, 18, 18, 20, 20, 20, 20, 21, 21, 21, 21, 21, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case109() {
    int[] minuteValues = { 0, 0, 1, 3, 4, 5, 6, 8, 8, 8, 9, 11, 11, 13, 13, 14, 16, 16, 18, 20, 21, 23, 23, 23, 23, 24, 26, 26, 31, 32, 33, 37, 37, 38, 39, 39, 39, 40, 41, 43, 47, 48, 50, 55, 56, 57, 57, 58, 59, 59 };
    int K = 900007165;
    assertArrayEquals(new int[] { 0, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 8, 8, 8, 8, 9, 11, 13, 13, 13, 15, 15, 15, 15, 15, 16, 16, 16, 17, 18, 20, 20, 20, 20, 20, 20, 20, 20, 20, 22, 22, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case110() {
    int[] minuteValues = { 0, 1, 1, 2, 8, 9, 11, 11, 12, 13, 13, 14, 15, 15, 15, 19, 21, 26, 26, 26, 27, 27, 27, 30, 30, 31, 31, 31, 35, 36, 36, 38, 38, 40, 40, 40, 44, 45, 46, 46, 47, 49, 52, 53, 53, 54, 55, 56, 58, 59 };
    int K = 900028910;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case111() {
    int[] minuteValues = { 1, 2, 2, 3, 4, 5, 6, 6, 8, 10, 11, 11, 11, 12, 12, 12, 12, 15, 16, 17, 17, 18, 20, 20, 20, 22, 25, 25, 27, 28, 29, 29, 31, 35, 38, 41, 41, 41, 42, 42, 42, 44, 44, 46, 48, 51, 55, 57, 57, 59 };
    int K = 900028926;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case112() {
    int[] minuteValues = { 2, 2, 3, 5, 6, 7, 11, 11, 15, 15, 16, 16, 16, 17, 17, 18, 19, 20, 20, 20, 21, 22, 24, 25, 26, 26, 26, 27, 28, 29, 30, 32, 33, 34, 34, 36, 38, 38, 39, 39, 39, 43, 48, 52, 54, 55, 55, 57, 58, 59 };
    int K = 900032244;
    assertArrayEquals(new int[] { 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 7, 7, 9, 10, 10, 10, 10, 12, 12, 13, 14, 14, 15, 15, 15, 15, 15, 15, 16, 16, 16, 18, 18, 20, 21, 21, 21, 21, 21, 21, 22, 23, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case113() {
    int[] minuteValues = { 1, 3, 3, 3, 3, 4, 7, 10, 12, 13, 15, 16, 17, 18, 19, 20, 21, 21, 22, 23, 24, 27, 27, 27, 28, 28, 28, 29, 30, 32, 32, 32, 34, 34, 36, 36, 39, 41, 43, 44, 44, 46, 50, 51, 51, 53, 53, 53, 55, 59 };
    int K = 900015948;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case114() {
    int[] minuteValues = { 0, 1, 2, 4, 4, 8, 10, 12, 14, 14, 15, 16, 16, 18, 19, 21, 21, 22, 22, 23, 23, 24, 28, 29, 31, 32, 32, 33, 33, 36, 37, 38, 42, 42, 43, 43, 47, 49, 50, 50, 51, 51, 51, 52, 52, 53, 54, 54, 55, 59 };
    int K = 900020066;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 7, 7, 8, 8, 8, 10, 10, 10, 11, 11, 12, 12, 12, 12, 12, 13, 13, 14, 14, 14, 14, 15, 18, 19, 20, 20, 22, 22, 22, 23, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case115() {
    int[] minuteValues = { 0, 0, 2, 2, 3, 3, 3, 5, 5, 8, 11, 12, 14, 14, 15, 16, 17, 19, 20, 20, 23, 24, 25, 25, 29, 30, 31, 31, 32, 34, 35, 37, 39, 41, 43, 44, 45, 45, 46, 46, 47, 50, 50, 52, 53, 55, 55, 56, 57, 57 };
    int K = 900032077;
    assertArrayEquals(new int[] { 0, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 5, 5, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 13, 13, 14, 14, 14, 14, 15, 16, 16, 16, 16, 16, 17, 18, 19, 19, 19, 20, 20, 20, 20, 21, 22, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case116() {
    int[] minuteValues = { 2, 2, 2, 20, 6, 6, 7, 9, 10, 32, 12, 12, 13, 13, 15, 16, 17, 18, 6, 21, 26, 22, 23, 46, 21, 27, 27, 32, 12, 34, 34, 35, 36, 38, 39, 40, 42, 43, 44, 45, 45, 26, 46, 48, 48, 53, 56, 57, 58, 59 };
    int K = 1000000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case117() {
    int[] minuteValues = { 0, 0, 0, 1, 1, 2, 2, 4, 4, 4, 7, 18, 7, 7, 11, 12, 12, 13, 53, 59, 13, 18, 7, 20, 21, 23, 24, 24, 25, 26, 27, 28, 29, 40, 40, 41, 43, 44, 46, 46, 47, 49, 50, 51, 13, 54, 58, 58, 59, 13 };
    int K = 1000000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case118() {
    int[] minuteValues = { 1, 7, 11, 12, 12, 18, 29, 15, 17, 17, 18, 14, 21, 22, 23, 25, 26, 37, 27, 27, 28, 29, 14, 31, 33, 33, 34, 35, 26, 37, 38, 40, 41, 43, 44, 47, 47, 47, 48, 50, 50, 51, 52, 52, 52, 53, 54, 55, 56, 59 };
    int K = 1000000000;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 8, 9, 10, 10, 10, 11, 11, 12, 13, 13, 13, 14, 14, 14, 14, 14, 14, 15, 15, 17, 18, 18, 18, 20, 20, 20, 21, 22, 22, 23, 23, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case119() {
    int[] minuteValues = { 0, 1, 2, 2, 3, 4, 4, 5, 5, 6, 8, 8, 8, 11, 13, 14, 16, 16, 17, 18, 19, 20, 21, 21, 22, 22, 22, 23, 24, 26, 31, 32, 35, 35, 38, 38, 39, 40, 41, 43, 44, 45, 46, 47, 48, 48, 49, 51, 53, 55 };
    int K = 1000000000;
    assertArrayEquals(new int[] { 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 8, 8, 10, 11, 11, 11, 13, 14, 14, 14, 17, 17, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 22, 23, 23, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case120() {
    int[] minuteValues = { 0, 2, 3, 3, 4, 9, 10, 14, 15, 23, 17, 18, 15, 25, 25, 26, 26, 28, 29, 59, 34, 34, 39, 42, 43, 43, 43, 43, 43, 44, 55, 45, 46, 46, 48, 49, 50, 50, 50, 55, 45, 55, 56, 56, 56, 57, 57, 57, 59, 33 };
    int K = 1000000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case121() {
    int[] minuteValues = { 2, 5, 5, 9, 10, 11, 11, 13, 13, 15, 16, 17, 18, 19, 21, 21, 22, 22, 31, 23, 24, 25, 26, 26, 27, 29, 29, 31, 31, 22, 35, 35, 36, 37, 38, 38, 39, 40, 40, 42, 42, 46, 47, 49, 52, 52, 53, 55, 59, 59 };
    int K = 1000000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case122() {
    int[] minuteValues = { 0, 2, 2, 5, 5, 5, 9, 11, 12, 14, 15, 17, 18, 20, 21, 22, 23, 23, 25, 26, 28, 29, 29, 32, 33, 34, 36, 36, 36, 37, 37, 37, 40, 40, 40, 43, 44, 45, 46, 50, 50, 52, 53, 54, 57, 58, 58, 59, 59, 59 };
    int K = 1000000000;
    assertArrayEquals(new int[] { 0, 0, 1, 1, 3, 4, 5, 6, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 12, 12, 14, 15, 15, 16, 17, 17, 17, 17, 18, 18, 20, 20, 20, 20, 20, 20, 21, 21, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case123() {
    int[] minuteValues = { 0, 1, 1, 2, 3, 4, 5, 36, 6, 9, 10, 12, 14, 17, 20, 21, 21, 21, 22, 31, 24, 24, 27, 30, 30, 30, 31, 32, 32, 32, 23, 33, 34, 34, 36, 5, 38, 39, 40, 46, 47, 48, 51, 52, 54, 55, 57, 59, 59, 59 };
    int K = 1000000000;
    assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2, 3, 4, 7, 7, 7, 7, 7, 7, 7, 7, 8, 9, 9, 9, 10, 11, 11, 11, 12, 13, 13, 13, 14, 15, 17, 17, 17, 18, 18, 19, 19, 19, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case124() {
    int[] minuteValues = { 2, 2, 3, 3, 40, 5, 7, 7, 8, 9, 10, 10, 12, 14, 15, 15, 17, 22, 22, 22, 24, 25, 26, 28, 28, 28, 29, 30, 31, 32, 33, 33, 38, 4, 40, 42, 42, 43, 43, 44, 44, 45, 48, 49, 50, 53, 55, 58, 58, 59 };
    int K = 1000000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case125() {
    int[] minuteValues = { 1, 2, 2, 3, 4, 4, 4, 6, 7, 9, 9, 14, 36, 15, 16, 16, 19, 19, 20, 21, 23, 24, 28, 30, 30, 32, 33, 33, 35, 15, 39, 41, 43, 43, 43, 43, 44, 44, 49, 49, 49, 49, 51, 52, 52, 53, 54, 55, 56, 58 };
    int K = 1000000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case126() {
    int[] minuteValues = { 43, 58 };
    int K = 318;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case127() {
    int[] minuteValues = { 1, 2, 3 };
    int K = 2600;
    assertArrayEquals(new int[] { 23, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case128() {
    int[] minuteValues = { 1, 2, 3 };
    int K = 2601;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case129() {
    int[] minuteValues = { 4, 3, 2, 2 };
    int K = 20601;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case130() {
    int[] minuteValues = { 4, 3, 2, 2, 20 };
    int K = 20601;
    assertArrayEquals(new int[] { 2, 3, 13, 14, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case131() {
    int[] minuteValues = { 4, 3, 2, 2, 20 };
    int K = 55555;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case132() {
    int[] minuteValues = { 45, 12, 0, 3, 2, 7, 4, 9, 23, 6, 17, 33 };
    int K = 1245;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 3, 3, 4, 4, 4, 16, 22, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case133() {
    int[] minuteValues = { 45, 12, 0, 3, 2, 7, 4, 9, 23, 6, 17, 33 };
    int K = 1000000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case134() {
    int[] minuteValues = { 45, 12, 0, 3, 2, 7, 4, 9, 23, 6, 17, 33 };
    int K = 12345;
    assertArrayEquals(new int[] { 0, 1, 2, 2, 3, 3, 4, 5, 12, 13, 18, 18 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case135() {
    int[] minuteValues = { 0, 1, 4, 7, 2, 45, 59, 21, 34, 44, 49, 50, 10, 12, 19, 21, 36, 42, 53, 52, 51, 35, 47, 54, 31, 35, 38, 42, 48, 52, 1, 23, 31, 35, 37, 39, 45, 52, 59, 1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 1 };
    int K = 987654321;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 11, 11, 12, 12, 13, 13, 13, 17, 18, 19, 19, 19, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case136() {
    int[] minuteValues = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int K = 999999999;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 5, 6, 8, 8, 10, 11, 13, 13, 14, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case137() {
    int[] minuteValues = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int K = 100000000;
    assertArrayEquals(new int[] { -1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case138() {
    int[] minuteValues = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int K = 1000000000;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 5, 6, 8, 8, 10, 11, 13, 13, 15, 15, 15 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case139() {
    int[] minuteValues = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 27, 26 };
    int K = 1;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case140() {
    int[] minuteValues = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int K = 999999999;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 5, 6, 8, 8, 10, 11, 13, 13, 14, 23, 23 }, weirdtimes.hourValues(minuteValues, K));
  }

  @Test
  public void case141() {
    int[] minuteValues = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int K = 100000000;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 3, 4, 13, 17, 18, 21, 21, 22 }, weirdtimes.hourValues(minuteValues, K));
  }

}
