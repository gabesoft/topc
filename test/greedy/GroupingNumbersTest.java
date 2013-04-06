package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class GroupingNumbersTest {
  double DELTA = 1.0e-09;
  GroupingNumbers groupingnumbers = new GroupingNumbers();

  @Test
  public void case1() {
    int[] numbers = { 1, 2, 99, 100 };
    int n = 2;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case2() {
    int[] numbers = { 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    int n = 4;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case3() {
    int[] numbers = { 2, 3, 5, 7, 11, 13 };
    int n = 3;
    assertEquals(0.33333333333333304, groupingnumbers.minRange(numbers, n), DELTA * 0.33333333333333304);
  }

  @Test
  public void case4() {
    int[] numbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
    int n = 6;
    assertEquals(6.0, groupingnumbers.minRange(numbers, n), DELTA * 6.0);
  }

  @Test
  public void case5() {
    int[] numbers = { 2, 3, 7, 7, 11, 13 };
    int n = 3;
    assertEquals(0.25, groupingnumbers.minRange(numbers, n), DELTA * 0.25);
  }

  @Test
  public void case6() {
    int[] numbers = { 1, 2, 2, 998, 667 };
    int n = 2;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case7() {
    int[] numbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
    int n = 5;
    assertEquals(2.333333333333334, groupingnumbers.minRange(numbers, n), DELTA * 2.333333333333334);
  }

  @Test
  public void case8() {
    int[] numbers = { 65, 43, 455 };
    int n = 3;
    assertEquals(412.0, groupingnumbers.minRange(numbers, n), DELTA * 412.0);
  }

  @Test
  public void case9() {
    int[] numbers = { 769, 197, 410, 883, 93 };
    int n = 5;
    assertEquals(790.0, groupingnumbers.minRange(numbers, n), DELTA * 790.0);
  }

  @Test
  public void case10() {
    int[] numbers = { 367, 33 };
    int n = 1;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case11() {
    int[] numbers = { 786, 706, 500, 781, 76 };
    int n = 2;
    assertEquals(55.33333333333337, groupingnumbers.minRange(numbers, n), DELTA * 55.33333333333337);
  }

  @Test
  public void case12() {
    int[] numbers = { 710, 241, 327, 802, 288, 528, 533 };
    int n = 7;
    assertEquals(561.0, groupingnumbers.minRange(numbers, n), DELTA * 561.0);
  }

  @Test
  public void case13() {
    int[] numbers = { 110, 438, 333, 276, 989, 14 };
    int n = 4;
    assertEquals(162.0, groupingnumbers.minRange(numbers, n), DELTA * 162.0);
  }

  @Test
  public void case14() {
    int[] numbers = { 933, 240, 513, 830 };
    int n = 2;
    assertEquals(85.0, groupingnumbers.minRange(numbers, n), DELTA * 85.0);
  }

  @Test
  public void case15() {
    int[] numbers = { 812, 224, 264, 702, 724, 51 };
    int n = 3;
    assertEquals(51.5, groupingnumbers.minRange(numbers, n), DELTA * 51.5);
  }

  @Test
  public void case16() {
    int[] numbers = { 625, 374, 648, 552, 313, 854, 686, 899 };
    int n = 6;
    assertEquals(134.0, groupingnumbers.minRange(numbers, n), DELTA * 134.0);
  }

  @Test
  public void case17() {
    int[] numbers = { 242, 26, 303, 443, 310, 670, 981, 246, 710 };
    int n = 3;
    assertEquals(7.399999999999977, groupingnumbers.minRange(numbers, n), DELTA * 7.399999999999977);
  }

  @Test
  public void case18() {
    int[] numbers = { 242, 26, 303, 443, 310, 670, 981, 246, 710 };
    int n = 9;
    assertEquals(955.0, groupingnumbers.minRange(numbers, n), DELTA * 955.0);
  }

  @Test
  public void case19() {
    int[] numbers = { 242, 26, 303, 443, 310, 670, 981, 246, 710 };
    int n = 1;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case20() {
    int[] numbers = { 21, 461, 239, 952, 149, 933, 370 };
    int n = 4;
    assertEquals(107.0, groupingnumbers.minRange(numbers, n), DELTA * 107.0);
  }

  @Test
  public void case21() {
    int[] numbers = { 746, 716, 516, 508, 776, 184, 434, 511 };
    int n = 4;
    assertEquals(51.66666666666663, groupingnumbers.minRange(numbers, n), DELTA * 51.66666666666663);
  }

  @Test
  public void case22() {
    int[] numbers = { 31, 724, 688, 968, 145, 323, 964, 395 };
    int n = 6;
    assertEquals(401.0, groupingnumbers.minRange(numbers, n), DELTA * 401.0);
  }

  @Test
  public void case23() {
    int[] numbers = { 143, 478, 777, 973, 265 };
    int n = 3;
    assertEquals(80.0, groupingnumbers.minRange(numbers, n), DELTA * 80.0);
  }

  @Test
  public void case24() {
    int[] numbers = { 308, 154, 934, 746 };
    int n = 3;
    assertEquals(438.0, groupingnumbers.minRange(numbers, n), DELTA * 438.0);
  }

  @Test
  public void case25() {
    int[] numbers = { 825 };
    int n = 1;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case26() {
    int[] numbers = { 493, 584, 880, 585, 564, 540, 559, 596, 464 };
    int n = 1;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case27() {
    int[] numbers = { 509, 489, 390, 875, 369, 245, 42 };
    int n = 7;
    assertEquals(833.0, groupingnumbers.minRange(numbers, n), DELTA * 833.0);
  }

  @Test
  public void case28() {
    int[] numbers = { 548, 151, 443, 85 };
    int n = 2;
    assertEquals(19.5, groupingnumbers.minRange(numbers, n), DELTA * 19.5);
  }

  @Test
  public void case29() {
    int[] numbers = { 59, 679, 306, 607, 41, 461, 311 };
    int n = 6;
    assertEquals(548.0, groupingnumbers.minRange(numbers, n), DELTA * 548.0);
  }

  @Test
  public void case30() {
    int[] numbers = { 698, 75, 492, 156, 57, 953, 668, 414 };
    int n = 5;
    assertEquals(118.5, groupingnumbers.minRange(numbers, n), DELTA * 118.5);
  }

  @Test
  public void case31() {
    int[] numbers = { 2, 3, 5, 7, 11, 13 };
    int n = 3;
    assertEquals(0.33333333333333304, groupingnumbers.minRange(numbers, n), DELTA * 0.33333333333333304);
  }

  @Test
  public void case32() {
    int[] numbers = { 1000, 1, 3, 4, 5, 6, 8, 12, 12 };
    int n = 4;
    assertEquals(161.83333333333334, groupingnumbers.minRange(numbers, n), DELTA * 161.83333333333334);
  }

  @Test
  public void case33() {
    int[] numbers = { 1, 4, 6, 7, 3, 2, 99, 108, 106 };
    int n = 3;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case34() {
    int[] numbers = { 9, 9, 8, 8, 7, 7, 6, 345, 54 };
    int n = 8;
    assertEquals(168.5, groupingnumbers.minRange(numbers, n), DELTA * 168.5);
  }

  @Test
  public void case35() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int n = 7;
    assertEquals(4.0, groupingnumbers.minRange(numbers, n), DELTA * 4.0);
  }

  @Test
  public void case36() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int n = 8;
    assertEquals(6.0, groupingnumbers.minRange(numbers, n), DELTA * 6.0);
  }

  @Test
  public void case37() {
    int[] numbers = { 45, 34, 67, 89, 65, 41, 21, 101, 48 };
    int n = 7;
    assertEquals(26.0, groupingnumbers.minRange(numbers, n), DELTA * 26.0);
  }

  @Test
  public void case38() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int n = 4;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case39() {
    int[] numbers = { 1, 10, 100, 1000, 500, 50, 5, 30, 300 };
    int n = 9;
    assertEquals(999.0, groupingnumbers.minRange(numbers, n), DELTA * 999.0);
  }

  @Test
  public void case40() {
    int[] numbers = { 1 };
    int n = 1;
    assertEquals(0.0, groupingnumbers.minRange(numbers, n), DELTA);
  }

  @Test
  public void case41() {
    int[] numbers = { 1, 2, 2, 998, 343, 1, 34, 2, 4 };
    int n = 3;
    assertEquals(138.0, groupingnumbers.minRange(numbers, n), DELTA * 138.0);
  }

  @Test
  public void case42() {
    int[] numbers = { 1, 1, 1, 1, 1, 9, 99 };
    int n = 3;
    assertEquals(19.6, groupingnumbers.minRange(numbers, n), DELTA * 19.6);
  }

  @Test
  public void case43() {
    int[] numbers = { 1, 2, 99, 23, 29, 101, 103, 87, 187 };
    int n = 8;
    assertEquals(101.0, groupingnumbers.minRange(numbers, n), DELTA * 101.0);
  }

  @Test
  public void case44() {
    int[] numbers = { 101, 102, 103, 1, 2, 2 };
    int n = 6;
    assertEquals(102.0, groupingnumbers.minRange(numbers, n), DELTA * 102.0);
  }

  @Test
  public void case45() {
    int[] numbers = { 100, 101, 311, 718, 165, 173, 177, 871, 653 };
    int n = 9;
    assertEquals(771.0, groupingnumbers.minRange(numbers, n), DELTA * 771.0);
  }

  @Test
  public void case46() {
    int[] numbers = { 13, 425, 123, 664, 745, 342, 999, 756, 34 };
    int n = 5;
    assertEquals(111.0, groupingnumbers.minRange(numbers, n), DELTA * 111.0);
  }

  @Test
  public void case47() {
    int[] numbers = { 11, 345, 322, 355, 355, 332, 666, 333, 222 };
    int n = 6;
    assertEquals(34.333333333333314, groupingnumbers.minRange(numbers, n), DELTA * 34.333333333333314);
  }

  @Test
  public void case48() {
    int[] numbers = { 3, 3, 3, 2 };
    int n = 2;
    assertEquals(0.3333333333333335, groupingnumbers.minRange(numbers, n), DELTA * 0.3333333333333335);
  }

  @Test
  public void case49() {
    int[] numbers = { 1, 513, 235, 123, 21, 323, 12, 33, 22 };
    int n = 3;
    assertEquals(15.0, groupingnumbers.minRange(numbers, n), DELTA * 15.0);
  }

}
