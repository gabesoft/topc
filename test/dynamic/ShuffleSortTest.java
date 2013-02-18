package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class ShuffleSortTest {
  double DELTA = 1.0e-09;
  ShuffleSort shufflesort = new ShuffleSort();

  @Test
  public void case1() {
    int[] cards = { 1 };
    assertEquals(1.0, shufflesort.shuffle(cards), DELTA * 1.0);
  }

  @Test
  public void case2() {
    int[] cards = { 1, 2 };
    assertEquals(2.0, shufflesort.shuffle(cards), DELTA * 2.0);
  }

  @Test
  public void case3() {
    int[] cards = { 2, 3, 1 };
    assertEquals(4.0, shufflesort.shuffle(cards), DELTA * 4.0);
  }

  @Test
  public void case4() {
    int[] cards = { 1, 1, 2, 2, 3, 3 };
    assertEquals(10.0, shufflesort.shuffle(cards), DELTA * 10.0);
  }

  @Test
  public void case5() {
    int[] cards = { 1, 2, 2, 2, 2, 3 };
    assertEquals(8.083333333333334, shufflesort.shuffle(cards), DELTA * 8.083333333333334);
  }

  @Test
  public void case6() {
    int[] cards = { 15, 16, 4, 8, 42, 23 };
    assertEquals(16.0, shufflesort.shuffle(cards), DELTA * 16.0);
  }

  @Test
  public void case7() {
    int[] cards = { 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(1.0, shufflesort.shuffle(cards), DELTA * 1.0);
  }

  @Test
  public void case8() {
    int[] cards = { 18, 35, 1, 20, 25, 29, 9, 13, 15, 6, 46, 32, 28, 12, 42, 46, 43, 28, 37, 42, 5, 3, 4, 43, 33, 22, 17, 19, 46, 48, 27, 22, 39, 20, 13, 18, 50, 36, 45, 4, 12 };
    assertEquals(706.6666666666666, shufflesort.shuffle(cards), DELTA * 706.6666666666666);
  }

  @Test
  public void case9() {
    int[] cards = { 34, 24, 15, 42, 12, 4, 19, 48, 45, 13, 8, 38, 10, 24, 42, 30, 29, 17, 36, 41, 43, 39 };
    assertEquals(222.5, shufflesort.shuffle(cards), DELTA * 222.5);
  }

  @Test
  public void case10() {
    int[] cards = { 41, 43, 15, 49, 47, 6 };
    assertEquals(16.0, shufflesort.shuffle(cards), DELTA * 16.0);
  }

  @Test
  public void case11() {
    int[] cards = { 30, 21, 1, 7, 2, 44, 49, 30, 24, 35, 5, 7, 41, 17, 27, 32, 9, 45, 40, 27, 24, 38, 39, 19, 33, 30, 42, 34, 16, 40, 9, 5, 31, 28, 7, 24, 37, 22, 46, 25 };
    assertEquals(637.5000000000001, shufflesort.shuffle(cards), DELTA * 637.5000000000001);
  }

  @Test
  public void case12() {
    int[] cards = { 21, 30, 28, 24, 48, 13, 37, 41, 12, 37, 6, 18, 6, 25, 32, 3, 1, 1, 42, 25, 17, 31 };
    assertEquals(203.5, shufflesort.shuffle(cards), DELTA * 203.5);
  }

  @Test
  public void case13() {
    int[] cards = { 42, 8, 38, 8, 38, 4, 34 };
    assertEquals(17.5, shufflesort.shuffle(cards), DELTA * 17.5);
  }

  @Test
  public void case14() {
    int[] cards = { 10, 10, 9, 22, 39, 23, 47, 7, 31, 14, 19, 1, 42, 13, 6, 11, 10, 25, 38, 49, 34, 46, 42, 3, 1, 42, 37, 25, 21, 47, 22, 49, 50, 19, 35, 32, 35, 4, 50, 19, 39, 1, 39, 28, 18 };
    assertEquals(797.0, shufflesort.shuffle(cards), DELTA * 797.0);
  }

  @Test
  public void case15() {
    int[] cards = { 44, 49, 34, 8, 22, 11, 18, 14, 15, 10, 17, 36, 2, 1, 50, 20, 7, 49, 4, 25, 9, 45, 10, 40, 3, 46, 36, 44 };
    assertEquals(358.5, shufflesort.shuffle(cards), DELTA * 358.5);
  }

  @Test
  public void case16() {
    int[] cards = { 24, 38, 15, 4, 49, 1, 9, 19, 31, 47, 49, 32, 40, 49, 10, 8, 23, 23, 39, 43, 39, 30, 41, 8, 9, 42, 16, 39, 7, 12, 3, 35, 23, 6, 29, 47, 13, 37, 26, 34, 20, 43, 45 };
    assertEquals(810.6666666666666, shufflesort.shuffle(cards), DELTA * 810.6666666666666);
  }

  @Test
  public void case17() {
    int[] cards = { 32, 49, 23, 2, 22, 50, 8, 27, 43, 40, 26, 13, 1, 11, 4, 20 };
    assertEquals(121.0, shufflesort.shuffle(cards), DELTA * 121.0);
  }

  @Test
  public void case18() {
    int[] cards = { 39, 2, 40, 6, 24, 3, 36, 33, 36, 39, 27 };
    assertEquals(52.0, shufflesort.shuffle(cards), DELTA * 52.0);
  }

  @Test
  public void case19() {
    int[] cards = { 8, 33, 33, 20, 5, 22, 40, 27, 30, 19, 43, 26, 6, 35, 50, 42, 13 };
    assertEquals(133.5, shufflesort.shuffle(cards), DELTA * 133.5);
  }

  @Test
  public void case20() {
    int[] cards = { 11, 19, 4, 40, 24, 30, 47, 38, 30, 50, 38, 17, 50, 44, 46, 48, 17, 37, 6, 39, 33, 6, 35, 15, 2, 17, 22, 37, 14, 14, 6, 36, 4, 13, 9, 33, 46, 14, 7, 22, 9, 47, 33, 32, 45 };
    assertEquals(759.4999999999999, shufflesort.shuffle(cards), DELTA * 759.4999999999999);
  }

  @Test
  public void case21() {
    int[] cards = { 23, 30, 12, 36, 1, 24, 17, 45, 10, 43, 40, 4, 25, 5, 11, 46, 50, 37, 14, 25, 23, 19, 19, 38, 6, 9, 42, 3, 26, 28, 15, 15, 25, 35, 25, 23, 10, 34, 21, 38, 48, 19, 28, 24, 21, 14 };
    assertEquals(838.9166666666666, shufflesort.shuffle(cards), DELTA * 838.9166666666666);
  }

  @Test
  public void case22() {
    int[] cards = { 43, 36, 3, 31, 14, 28, 3, 50, 28, 26, 44, 25, 24, 23, 12, 32, 4, 33 };
    assertEquals(140.5, shufflesort.shuffle(cards), DELTA * 140.5);
  }

  @Test
  public void case23() {
    int[] cards = { 44, 26, 32, 43, 43 };
    assertEquals(9.5, shufflesort.shuffle(cards), DELTA * 9.5);
  }

  @Test
  public void case24() {
    int[] cards = { 37, 15, 1, 38, 11, 14, 25, 21, 21, 36, 34, 12, 11, 47, 18, 36, 1, 41, 45, 46, 25, 20 };
    assertEquals(195.0, shufflesort.shuffle(cards), DELTA * 195.0);
  }

  @Test
  public void case25() {
    int[] cards = { 27, 45, 9, 3, 22, 17, 29, 44, 2, 35, 19, 15, 20, 3, 1, 38, 11, 27, 11, 8, 21, 16, 27, 28, 44 };
    assertEquals(267.33333333333337, shufflesort.shuffle(cards), DELTA * 267.33333333333337);
  }

  @Test
  public void case26() {
    int[] cards = { 15, 10, 33, 37, 16, 38, 38, 25 };
    assertEquals(28.0, shufflesort.shuffle(cards), DELTA * 28.0);
  }

  @Test
  public void case27() {
    int[] cards = { 28, 30, 29, 24, 21, 3, 13, 24, 47, 38, 12, 46, 26, 15, 11, 3, 17, 31, 27, 12, 22, 12, 48, 4, 21 };
    assertEquals(251.0, shufflesort.shuffle(cards), DELTA * 251.0);
  }

  @Test
  public void case28() {
    int[] cards = { 25, 39, 14, 41, 2, 13, 30, 1, 14, 9, 29, 16, 8, 28, 1, 9, 40, 4, 11, 8, 25, 28, 9, 14, 38, 2, 1, 11, 29, 44, 35, 6, 41, 12, 5, 36, 7, 23, 1, 24 };
    assertEquals(583.3333333333333, shufflesort.shuffle(cards), DELTA * 583.3333333333333);
  }

  @Test
  public void case29() {
    int[] cards = { 7, 17, 27, 8, 27, 8, 38, 22, 20, 12, 47, 23, 18, 13, 18, 47, 36, 42, 24, 30, 30, 16, 10, 33, 47, 6, 4, 13, 35, 35, 5, 23, 8, 20, 33 };
    assertEquals(492.83333333333337, shufflesort.shuffle(cards), DELTA * 492.83333333333337);
  }

  @Test
  public void case30() {
    int[] cards = { 8, 34, 12, 36, 18, 49, 26, 39, 24, 43, 5, 12, 42 };
    assertEquals(73.5, shufflesort.shuffle(cards), DELTA * 73.5);
  }

  @Test
  public void case31() {
    int[] cards = { 10, 26, 22, 21, 27, 35, 6, 34, 1, 49, 30, 2, 44, 35, 38, 35, 7, 44, 27, 6, 13, 49, 32, 1, 14 };
    assertEquals(259.1666666666667, shufflesort.shuffle(cards), DELTA * 259.1666666666667);
  }

  @Test
  public void case32() {
    int[] cards = { 6, 6, 43, 13, 12, 28, 25, 29, 3, 44, 47, 24, 41, 14, 26, 23, 19, 11, 18, 33, 13, 46, 20, 32, 41, 39, 36, 41, 48, 40, 41, 46, 4, 15, 2, 41, 45, 9, 36, 10, 43 };
    assertEquals(739.7666666666667, shufflesort.shuffle(cards), DELTA * 739.7666666666667);
  }

  @Test
  public void case33() {
    int[] cards = { 15, 32, 4, 30, 26 };
    assertEquals(11.0, shufflesort.shuffle(cards), DELTA * 11.0);
  }

  @Test
  public void case34() {
    int[] cards = { 43, 48, 50, 7, 12, 28, 18, 42 };
    assertEquals(29.0, shufflesort.shuffle(cards), DELTA * 29.0);
  }

  @Test
  public void case35() {
    int[] cards = { 41, 14, 25, 2, 28, 16, 34, 14, 43, 25, 2, 43, 10, 21, 29, 28, 35, 26, 37, 49, 21, 38, 48, 5, 4, 22, 14, 7, 14 };
    assertEquals(325.58333333333337, shufflesort.shuffle(cards), DELTA * 325.58333333333337);
  }

  @Test
  public void case36() {
    int[] cards = { 22, 40, 41, 15, 43, 20, 14, 42, 5, 19 };
    assertEquals(46.0, shufflesort.shuffle(cards), DELTA * 46.0);
  }

  @Test
  public void case37() {
    int[] cards = { 1, 6, 26, 40, 4, 23, 49, 48, 35, 49, 22, 15, 14, 26, 46, 13, 47, 29, 20, 13, 20, 36, 40, 45, 16, 41, 46, 9, 19, 21, 2, 24 };
    assertEquals(456.5, shufflesort.shuffle(cards), DELTA * 456.5);
  }

  @Test
  public void case38() {
    int[] cards = { 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7 };
    assertEquals(296.65476190476187, shufflesort.shuffle(cards), DELTA * 296.65476190476187);
  }

  @Test
  public void case39() {
    int[] cards = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(1.0, shufflesort.shuffle(cards), DELTA * 1.0);
  }

  @Test
  public void case40() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(1226.0, shufflesort.shuffle(cards), DELTA * 1226.0);
  }

  @Test
  public void case41() {
    int[] cards = { 8, 50, 48, 1, 38, 23, 29, 33, 45, 39, 40, 26, 40, 47, 21, 33, 32, 25, 9, 7, 36, 16, 11, 42, 28, 30, 43, 26, 18, 48, 28, 49, 3, 36, 22, 15, 22, 11, 39, 20, 24, 14, 16, 14, 39, 22, 27, 31, 13, 32 };
    assertEquals(1048.6666666666667, shufflesort.shuffle(cards), DELTA * 1048.6666666666667);
  }

  @Test
  public void case42() {
    int[] cards = { 1 };
    assertEquals(1.0, shufflesort.shuffle(cards), DELTA * 1.0);
  }

  @Test
  public void case43() {
    int[] cards = { 15, 16, 4, 8, 42, 23 };
    assertEquals(16.0, shufflesort.shuffle(cards), DELTA * 16.0);
  }

  @Test
  public void case44() {
    int[] cards = { 1, 1, 1, 2, 3, 4, 5 };
    assertEquals(14.333333333333336, shufflesort.shuffle(cards), DELTA * 14.333333333333336);
  }

  @Test
  public void case45() {
    int[] cards = { 2, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(3.5928571428571416, shufflesort.shuffle(cards), DELTA * 3.5928571428571416);
  }

  @Test
  public void case46() {
    int[] cards = { 11, 24, 49, 50, 33, 17, 12, 9, 1, 2, 19, 23, 45, 23, 11, 7, 8, 37, 47, 7, 48, 46, 45, 44, 43, 34, 33, 32, 31, 27, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 25, 24, 48, 49, 30, 31, 32, 20, 50, 39 };
    assertEquals(1006.0, shufflesort.shuffle(cards), DELTA * 1006.0);
  }

  @Test
  public void case47() {
    int[] cards = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2 };
    assertEquals(21.666748983944416, shufflesort.shuffle(cards), DELTA * 21.666748983944416);
  }

  @Test
  public void case48() {
    int[] cards = { 2, 3, 1, 3, 15, 16, 17, 2, 3, 42, 19, 45, 22 };
    assertEquals(61.83333333333334, shufflesort.shuffle(cards), DELTA * 61.83333333333334);
  }

  @Test
  public void case49() {
    int[] cards = { 15, 16, 8, 8, 42, 23 };
    assertEquals(13.0, shufflesort.shuffle(cards), DELTA * 13.0);
  }

  @Test
  public void case50() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 15, 25, 26, 26, 26, 7, 37, 45, 32, 22, 22, 13, 13, 42, 5, 11, 23, 21, 23, 4, 3, 4 };
    assertEquals(408.66666666666663, shufflesort.shuffle(cards), DELTA * 408.66666666666663);
  }

  @Test
  public void case51() {
    int[] cards = { 15, 16, 4, 8, 42, 15, 16, 4, 8, 42, 15, 16, 4, 8, 42, 15, 16, 4, 8, 42, 15, 16, 4, 8, 42, 15, 16, 4, 8, 42, 15, 16, 4, 8, 42, 15, 16, 4, 8, 42, 1, 2, 3, 4, 5, 6, 7 };
    assertEquals(464.4710317460318, shufflesort.shuffle(cards), DELTA * 464.4710317460318);
  }

  @Test
  public void case52() {
    int[] cards = { 32, 38, 33, 8, 42, 34, 26, 26, 4, 46, 38, 20, 32, 18, 35, 11, 7, 5, 7, 50, 2, 2, 12, 35, 45, 50, 24, 36, 43, 27, 8, 19, 17, 38, 3, 33, 37, 34, 4, 21, 2, 5, 1, 27, 28, 13, 11, 17, 48, 16 };
    assertEquals(980.6666666666665, shufflesort.shuffle(cards), DELTA * 980.6666666666665);
  }

  @Test
  public void case53() {
    int[] cards = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 6, 7, 7, 7, 2, 2, 3 };
    assertEquals(110.66666666666669, shufflesort.shuffle(cards), DELTA * 110.66666666666669);
  }

  @Test
  public void case54() {
    int[] cards = { 3, 2, 1, 1, 1, 4, 4, 4 };
    assertEquals(17.166666666666664, shufflesort.shuffle(cards), DELTA * 17.166666666666664);
  }

  @Test
  public void case55() {
    int[] cards = { 1, 1, 1, 1, 1, 1, 1, 1, 34 };
    assertEquals(3.7178571428571416, shufflesort.shuffle(cards), DELTA * 3.7178571428571416);
  }

  @Test
  public void case56() {
    int[] cards = { 1, 1, 1, 1, 1, 1, 1, 1, 22, 33, 22 };
    assertEquals(10.653571428571428, shufflesort.shuffle(cards), DELTA * 10.653571428571428);
  }

  @Test
  public void case57() {
    int[] cards = { 1, 1, 2 };
    assertEquals(2.5, shufflesort.shuffle(cards), DELTA * 2.5);
  }

  @Test
  public void case58() {
    int[] cards = { 1, 2, 1 };
    assertEquals(2.5, shufflesort.shuffle(cards), DELTA * 2.5);
  }

  @Test
  public void case59() {
    int[] cards = { 1, 1, 1, 2 };
    assertEquals(2.833333333333333, shufflesort.shuffle(cards), DELTA * 2.833333333333333);
  }

}
