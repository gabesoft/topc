package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class TVTowerTest {
  double DELTA = 1.0e-09;
  TVTower tvtower = new TVTower();

  @Test
  public void case1() {
    int[] x = { 1, 0, -1, 0 };
    int[] y = { 0, 1, 0, -1 };
    assertEquals(1.0, tvtower.minRadius(x, y), DELTA * 1.0);
  }

  @Test
  public void case2() {
    int[] x = { 3 };
    int[] y = { 299 };
    assertEquals(0.0, tvtower.minRadius(x, y), DELTA);
  }

  @Test
  public void case3() {
    int[] x = { 1000, 1000, 1000, 1000, 999 };
    int[] y = { 500, 1000, -300, -989, -300 };
    assertEquals(994.5, tvtower.minRadius(x, y), DELTA * 994.5);
  }

  @Test
  public void case4() {
    int[] x = { 5, 3, -4, 2 };
    int[] y = { 0, 4, 3, 2 };
    assertEquals(4.743416490252569, tvtower.minRadius(x, y), DELTA * 4.743416490252569);
  }

  @Test
  public void case5() {
    int[] x = { 5, -3, -4 };
    int[] y = { 0, 4, -3 };
    assertEquals(5.0, tvtower.minRadius(x, y), DELTA * 5.0);
  }

  @Test
  public void case6() {
    int[] x = { 52, -28, -38 };
    int[] y = { 7, 47, -23 };
    assertEquals(50.0, tvtower.minRadius(x, y), DELTA * 50.0);
  }

  @Test
  public void case7() {
    int[] x = { -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000 };
    int[] y = { -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000 };
    assertEquals(0.0, tvtower.minRadius(x, y), DELTA);
  }

  @Test
  public void case8() {
    int[] x = { -1000, -1000, 100, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000 };
    int[] y = { -1000, 500, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000 };
    assertEquals(930.0537618869137, tvtower.minRadius(x, y), DELTA * 930.0537618869137);
  }

  @Test
  public void case9() {
    int[] x = { 1, 11 };
    int[] y = { 1, 9 };
    assertEquals(6.4031242374328485, tvtower.minRadius(x, y), DELTA * 6.4031242374328485);
  }

  @Test
  public void case10() {
    int[] x = { 1, 0, 11 };
    int[] y = { 1, 2, 9 };
    assertEquals(6.519202405202649, tvtower.minRadius(x, y), DELTA * 6.519202405202649);
  }

  @Test
  public void case11() {
    int[] x = { 1, 0, 11 };
    int[] y = { 1, 3, 9 };
    assertEquals(6.4031242374328485, tvtower.minRadius(x, y), DELTA * 6.4031242374328485);
  }

  @Test
  public void case12() {
    int[] x = { 9, 3, -12, -17 };
    int[] y = { 3, -12, -17, 9 };
    assertEquals(15.857491600939305, tvtower.minRadius(x, y), DELTA * 15.857491600939305);
  }

  @Test
  public void case13() {
    int[] x = { -976, 435, 812, -666, 234, 845, 123, -123 };
    int[] y = { 772, -976, 435, 812, -666, 234, 845, 123 };
    assertEquals(1126.3615357770154, tvtower.minRadius(x, y), DELTA * 1126.3615357770154);
  }

  @Test
  public void case14() {
    int[] x = { -1000, 0, 1000, 921 };
    int[] y = { 1000, 0, -1000, 543 };
    assertEquals(1414.213562373095, tvtower.minRadius(x, y), DELTA * 1414.213562373095);
  }

  @Test
  public void case15() {
    int[] x = { 3, 121, 5, 92 };
    int[] y = { 7, 243, 11, 185 };
    assertEquals(131.9280106724876, tvtower.minRadius(x, y), DELTA * 131.9280106724876);
  }

  @Test
  public void case16() {
    int[] x = { 0, 7, 0 };
    int[] y = { 0, 5, 10 };
    assertEquals(5.285714285714286, tvtower.minRadius(x, y), DELTA * 5.285714285714286);
  }

  @Test
  public void case17() {
    int[] x = { 0, 0, -5, 5 };
    int[] y = { -3, 7, 0, 0 };
    assertEquals(5.285714285714286, tvtower.minRadius(x, y), DELTA * 5.285714285714286);
  }

  @Test
  public void case18() {
    int[] x = { 0, 500, 1000 };
    int[] y = { 0, 866, 0 };
    assertEquals(577.3418013856813, tvtower.minRadius(x, y), DELTA * 577.3418013856813);
  }

  @Test
  public void case19() {
    int[] x = { 0, -5, 5, 1 };
    int[] y = { 5, -5, -5, 1 };
    assertEquals(6.25, tvtower.minRadius(x, y), DELTA * 6.25);
  }

  @Test
  public void case20() {
    int[] x = { -1000, 0, 1000, -500, 500, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900, 900 };
    int[] y = { -1000, 732, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000 };
    assertEquals(1154.6836027713628, tvtower.minRadius(x, y), DELTA * 1154.6836027713628);
  }

  @Test
  public void case21() {
    int[] x = { 0, 3, 6 };
    int[] y = { 0, 10, 0 };
    assertEquals(5.45, tvtower.minRadius(x, y), DELTA * 5.45);
  }

  @Test
  public void case22() {
    int[] x = { 0, 3, 6 };
    int[] y = { 0, 4, 0 };
    assertEquals(3.125, tvtower.minRadius(x, y), DELTA * 3.125);
  }

  @Test
  public void case23() {
    int[] x = { -5, 1, 2, 3, 4 };
    int[] y = { 10, 5, 3, 5, 7 };
    assertEquals(5.0, tvtower.minRadius(x, y), DELTA * 5.0);
  }

  @Test
  public void case24() {
    int[] x = { 690, 633, -649, -975, 409, -678, 624, -976, -460, -102, -983, 120, 202, 75, 826, -339, -709, 620, 204, -666, 718, -299, 290, 383, 634, 235, 571, -651, -984, -99, 448, 263, -466, 356, -155, 500, 678, -531, 81, -783, -76, 98, -106, -875, 730, -723, -656, -980, 454, 548 };
    int[] y = { 913, 171, 807, 202, -446, 440, 994, 682, 789, 567, -418, 236, -170, 116, -851, 232, -828, 827, 258, 253, 602, 740, 908, -505, 865, 638, -671, 766, 215, 784, -129, -316, -46, -323, 886, 65, 674, 880, -254, 462, 446, 329, -746, 833, -999, -597, -378, -826, 788, 880 };
    assertEquals(1227.4930366680005, tvtower.minRadius(x, y), DELTA * 1227.4930366680005);
  }

  @Test
  public void case25() {
    int[] x = { 0, 1, -1 };
    int[] y = { 6, 0, 0 };
    assertEquals(3.0833333333333335, tvtower.minRadius(x, y), DELTA * 3.0833333333333335);
  }

  @Test
  public void case26() {
    int[] x = { 0, 10, -1 };
    int[] y = { 10, 0, -1 };
    assertEquals(7.188918942063233, tvtower.minRadius(x, y), DELTA * 7.188918942063233);
  }

  @Test
  public void case27() {
    int[] x = { 0, 0, 7, -3 };
    int[] y = { 5, 5, 0, 0 };
    assertEquals(5.015974481593781, tvtower.minRadius(x, y), DELTA * 5.015974481593781);
  }

  @Test
  public void case28() {
    int[] x = { 0, 0, 8 };
    int[] y = { 5, -5, 0 };
    assertEquals(5.5625, tvtower.minRadius(x, y), DELTA * 5.5625);
  }

  @Test
  public void case29() {
    int[] x = { 1, 0, -1 };
    int[] y = { 0, 2, 0 };
    assertEquals(1.25, tvtower.minRadius(x, y), DELTA * 1.25);
  }

  @Test
  public void case30() {
    int[] x = { -1000, 0, 1000 };
    int[] y = { -866, 866, -866 };
    assertEquals(1154.6836027713628, tvtower.minRadius(x, y), DELTA * 1154.6836027713628);
  }

  @Test
  public void case31() {
    int[] x = { 0, 0, 7, 3 };
    int[] y = { 5, -5, 0, 0 };
    assertEquals(5.285714285714286, tvtower.minRadius(x, y), DELTA * 5.285714285714286);
  }

  @Test
  public void case32() {
    int[] x = { 0, 1000, 500 };
    int[] y = { 0, 0, 866 };
    assertEquals(577.3418013856813, tvtower.minRadius(x, y), DELTA * 577.3418013856813);
  }

  @Test
  public void case33() {
    int[] x = { 0, 2, 1 };
    int[] y = { 0, 0, 2 };
    assertEquals(1.25, tvtower.minRadius(x, y), DELTA * 1.25);
  }

  @Test
  public void case34() {
    int[] x = { 0, 5, 10 };
    int[] y = { 0, 10, 0 };
    assertEquals(6.25, tvtower.minRadius(x, y), DELTA * 6.25);
  }

  @Test
  public void case35() {
    int[] x = { 0, 4, 2 };
    int[] y = { 0, 0, 3 };
    assertEquals(2.166666666666667, tvtower.minRadius(x, y), DELTA * 2.166666666666667);
  }

  @Test
  public void case36() {
    int[] x = { 1, 2 };
    int[] y = { 1, 2 };
    assertEquals(0.7071067811865476, tvtower.minRadius(x, y), DELTA * 0.7071067811865476);
  }

  @Test
  public void case37() {
    int[] x = { 0, 6, 3 };
    int[] y = { 0, 0, 4 };
    assertEquals(3.125, tvtower.minRadius(x, y), DELTA * 3.125);
  }

  @Test
  public void case38() {
    int[] x = { 0, 10, 5 };
    int[] y = { 0, 0, 8 };
    assertEquals(5.5625, tvtower.minRadius(x, y), DELTA * 5.5625);
  }

  @Test
  public void case39() {
    int[] x = { 0, 1, 2 };
    int[] y = { 0, 0, 0 };
    assertEquals(1.0, tvtower.minRadius(x, y), DELTA * 1.0);
  }

  @Test
  public void case40() {
    int[] x = { 0, 5, 10 };
    int[] y = { 0, 8, 0 };
    assertEquals(5.5625, tvtower.minRadius(x, y), DELTA * 5.5625);
  }

  @Test
  public void case41() {
    int[] x = { -10, 10, 0 };
    int[] y = { 10, 10, -15 };
    assertEquals(14.5, tvtower.minRadius(x, y), DELTA * 14.5);
  }

  @Test
  public void case42() {
    int[] x = { 1, 0 };
    int[] y = { 1, 0 };
    assertEquals(0.7071067811865476, tvtower.minRadius(x, y), DELTA * 0.7071067811865476);
  }

  @Test
  public void case43() {
    int[] x = { 4, 4, 0, 0 };
    int[] y = { 4, 0, 0, 4 };
    assertEquals(2.8284271247461903, tvtower.minRadius(x, y), DELTA * 2.8284271247461903);
  }

  @Test
  public void case44() {
    int[] x = { -500, 500, 0, 0 };
    int[] y = { 500, 500, -366, 640 };
    assertEquals(577.3418013856814, tvtower.minRadius(x, y), DELTA * 577.3418013856814);
  }

  @Test
  public void case45() {
    int[] x = { 0, 1 };
    int[] y = { 0, 1 };
    assertEquals(0.7071067811865476, tvtower.minRadius(x, y), DELTA * 0.7071067811865476);
  }

  @Test
  public void case46() {
    int[] x = { 933, 743, 262, 529, 700, 508, 752, 256, 256, 119, 711, 351, 843, 705, 108, 393, 330, 366, 169, 932, 917, 847, 972, 868, 980, 223, 549, 592, 164, 169, 551, 427, 190, 624, 635, 920, 944, 310, 862, 484, 363, 301, 710, 236, 876, 431, 929, 397, 675, 491 };
    int[] y = { 190, 344, 134, 425, 629, 30, 727, 126, 743, 334, 104, 760, 749, 620, 256, 932, 572, 613, 490, 509, 119, 405, 695, 49, 327, 719, 497, 824, 596, 649, 356, 184, 93, 245, 7, 306, 509, 754, 352, 665, 783, 738, 801, 690, 330, 337, 195, 656, 963, 11 };
    assertEquals(517.1671916738641, tvtower.minRadius(x, y), DELTA * 517.1671916738641);
  }

  @Test
  public void case47() {
    int[] x = { 0, 0, 15, 15 };
    int[] y = { 0, 20, 8, 12 };
    assertEquals(10.885311203635842, tvtower.minRadius(x, y), DELTA * 10.885311203635842);
  }

}
