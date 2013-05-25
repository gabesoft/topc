package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BagsOfGoldTest {
  BagsOfGold bagsofgold = new BagsOfGold();

  @Test
  public void case1() {
    int[] bags = { 7, 2 };
    assertEquals(5, bagsofgold.netGain(bags));
  }

  @Test
  public void case2() {
    int[] bags = { 2, 7, 3 };
    assertEquals(-2, bagsofgold.netGain(bags));
  }

  @Test
  public void case3() {
    int[] bags = { 1000, 1000, 1000, 1000, 1000 };
    assertEquals(1000, bagsofgold.netGain(bags));
  }

  @Test
  public void case4() {
    int[] bags = { 823, 912, 345, 100000, 867, 222, 991, 3, 40000 };
    assertEquals(-58111, bagsofgold.netGain(bags));
  }

  @Test
  public void case5() {
    int[] bags = { 23, 35, 12, 100000, 99234, 86123, 3245 };
    assertEquals(-83644, bagsofgold.netGain(bags));
  }

  @Test
  public void case6() {
    int[] bags = { 23, 35, 12, 100000, 99234, 86123, 3245, 1 };
    assertEquals(83645, bagsofgold.netGain(bags));
  }

  @Test
  public void case7() {
    int[] bags = { 7, 7, 7, 7, 7, 7, 80, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
    assertEquals(-66, bagsofgold.netGain(bags));
  }

  @Test
  public void case8() {
    int[] bags = { 7, 7, 7, 7, 7, 7, 7, 80, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
    assertEquals(73, bagsofgold.netGain(bags));
  }

  @Test
  public void case9() {
    int[] bags = { 91, 56, 23, 45, 87, 65, 45, 45, 78, 23, 20, 41, 17, 54, 51, 51, 94, 62, 74, 42, 76, 76 };
    assertEquals(96, bagsofgold.netGain(bags));
  }

  @Test
  public void case10() {
    int[] bags = { 92834, 95461, 15911, 56189, 6369, 80545, 31811, 51263, 30076, 68867, 36905, 32499, 59799, 334, 82991, 46636, 98741, 66601 };
    assertEquals(42958, bagsofgold.netGain(bags));
  }

  @Test
  public void case11() {
    int[] bags = { 129 };
    assertEquals(129, bagsofgold.netGain(bags));
  }

  @Test
  public void case12() {
    int[] bags = { 35463, 88121, 4362, 94457, 86235, 83680, 72686, 6003, 93069, 2015, 10436, 2139, 93162, 30380, 19067, 76335, 78941, 48620, 55887, 15679 };
    assertEquals(101879, bagsofgold.netGain(bags));
  }

  @Test
  public void case13() {
    int[] bags = { 19335, 97643, 11468, 86267, 79718, 59584, 12129, 52642, 86575, 62307, 11545, 52658, 72377, 39986, 74850, 1992, 86928 };
    assertEquals(1846, bagsofgold.netGain(bags));
  }

  @Test
  public void case14() {
    int[] bags = { 91883, 97793, 54567, 64714, 98624 };
    assertEquals(82567, bagsofgold.netGain(bags));
  }

  @Test
  public void case15() {
    int[] bags = { 98473, 41866, 71129, 65936, 42626, 9194, 46718, 96921, 45613, 47677, 8763, 54634, 47259, 71448, 9918, 22666, 32711, 21692, 40207, 2017, 23040, 86083, 77809, 15472, 30718, 39085, 87911, 54827, 41686, 28354, 37203, 6548, 74184, 3043, 43961, 95189, 1238, 22002, 93507, 63546, 32527, 42778, 31614 };
    assertEquals(-14953, bagsofgold.netGain(bags));
  }

  @Test
  public void case16() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(25, bagsofgold.netGain(bags));
  }

  @Test
  public void case17() {
    int[] bags = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0, bagsofgold.netGain(bags));
  }

  @Test
  public void case18() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 11, 11, 11, 11, 111, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 112, 312, 312, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 231, 31, 312 };
    assertEquals(316, bagsofgold.netGain(bags));
  }

  @Test
  public void case19() {
    int[] bags = { 1234, 1233, 12, 312, 32, 23, 434, 12, 312, 45, 1234, 1233, 12, 312, 32, 23, 434, 12, 312, 45, 1234, 1233, 12, 312, 32, 23, 434, 12, 312, 45, 1234, 1233, 12, 312, 32, 23, 434, 12, 312, 45, 1234, 1233, 12, 312, 32, 23, 434, 12, 312, 45 };
    assertEquals(1995, bagsofgold.netGain(bags));
  }

  @Test
  public void case20() {
    int[] bags = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    assertEquals(1, bagsofgold.netGain(bags));
  }

  @Test
  public void case21() {
    int[] bags = { 9, 100, 1, 8 };
    assertEquals(98, bagsofgold.netGain(bags));
  }

  @Test
  public void case22() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 66, 5, 4, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 6, 5, 4, 5, 6, 3, 4, 4, 5, 6, 3, 4, 5, 6, 3, 4, 5, 6, 3, 4, 5, 6, 3, 4, 5, 6 };
    assertEquals(68, bagsofgold.netGain(bags));
  }

  @Test
  public void case23() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 1, 2, 3, 4, 65, 67, 2, 3, 4, 7, 2, 3, 4, 6, 6, 7, 2, 3, 4, 7, 78, 8, 82, 2, 3, 4, 7, 2, 2, 34, 4, 6, 7, 3, 2 };
    assertEquals(128, bagsofgold.netGain(bags));
  }

  @Test
  public void case24() {
    int[] bags = { 100, 10, 10 };
    assertEquals(100, bagsofgold.netGain(bags));
  }

  @Test
  public void case25() {
    int[] bags = { 1 };
    assertEquals(1, bagsofgold.netGain(bags));
  }

  @Test
  public void case26() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 3, 5, 4, 6, 7, 5, 6, 10, 2, 5, 4, 3, 4, 5, 6, 7, 9, 10 };
    assertEquals(28, bagsofgold.netGain(bags));
  }

  @Test
  public void case27() {
    int[] bags = { 6, 4, 3, 5, 8, 8 };
    assertEquals(2, bagsofgold.netGain(bags));
  }

  @Test
  public void case28() {
    int[] bags = { 1, 5, 20, 2, 1 };
    assertEquals(-13, bagsofgold.netGain(bags));
  }

  @Test
  public void case29() {
    int[] bags = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 767, 765, 111, 76576, 5, 64, 654, 64, 7, 7657, 76575, 64, 65, 6454, 64, 654, 65464, 7, 5435, 65, 746, 7, 546, 7, 654, 7, 5435, 547, 6, 6, 7, 6547, 7654, 6, 754, 54353, 65, 7, 8 };
    assertEquals(118231, bagsofgold.netGain(bags));
  }

}
