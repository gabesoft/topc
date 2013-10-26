package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class RaceManagementTest {
  double DELTA = 1.0e-09;
  RaceManagement racemanagement = new RaceManagement();

  @Test
  public void case1() {
    int[] probability = { 30 };
    int[] amounts = { 100 };
    int minimumMoney = 10;
    assertEquals(2.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 2.0);
  }

  @Test
  public void case2() {
    int[] probability = { 50, 40 };
    int[] amounts = { 300, 200 };
    int minimumMoney = 100;
    assertEquals(2.076923076923077, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 2.076923076923077);
  }

  @Test
  public void case3() {
    int[] probability = { 10, 10, 10 };
    int[] amounts = { 100, 100, 100 };
    int minimumMoney = 12;
    assertEquals(10.851851851851851, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 10.851851851851851);
  }

  @Test
  public void case4() {
    int[] probability = { 30, 20, 10 };
    int[] amounts = { 100, 200, 300 };
    int minimumMoney = 100;
    assertEquals(6.861635220125786, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 6.861635220125786);
  }

  @Test
  public void case5() {
    int[] probability = { 50 };
    int[] amounts = { 100 };
    int minimumMoney = 1000;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case6() {
    int[] probability = { 0 };
    int[] amounts = { 100 };
    int minimumMoney = 100;
    assertEquals(-2.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -2.0);
  }

  @Test
  public void case7() {
    int[] probability = { 0 };
    int[] amounts = { 100 };
    int minimumMoney = 200;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case8() {
    int[] probability = { 100 };
    int[] amounts = { 100 };
    int minimumMoney = 100;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case9() {
    int[] probability = { 100 };
    int[] amounts = { 0 };
    int minimumMoney = 100;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case10() {
    int[] probability = { 100 };
    int[] amounts = { 100 };
    int minimumMoney = 10;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case11() {
    int[] probability = { 49, 31, 3, 3 };
    int[] amounts = { 637, 361, 549, 601 };
    int minimumMoney = 388;
    assertEquals(5.5642566807308, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 5.5642566807308);
  }

  @Test
  public void case12() {
    int[] probability = { 91, 9, 0, 0, 0 };
    int[] amounts = { 745, 811, 481, 941, 903 };
    int minimumMoney = 181;
    assertEquals(4.93420791796551, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 4.93420791796551);
  }

  @Test
  public void case13() {
    int[] probability = { 34, 65, 0 };
    int[] amounts = { 621, 729, 86 };
    int minimumMoney = 188;
    assertEquals(2.2278088144009933, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 2.2278088144009933);
  }

  @Test
  public void case14() {
    int[] probability = { 56, 14, 29, 1, 0 };
    int[] amounts = { 604, 548, 839, 764, 236 };
    int minimumMoney = 817;
    assertEquals(5.764322718740284, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 5.764322718740284);
  }

  @Test
  public void case15() {
    int[] probability = { 37, 30, 28, 4, 1 };
    int[] amounts = { 863, 188, 796, 614, 96 };
    int minimumMoney = 511;
    assertEquals(6.341439206765301, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 6.341439206765301);
  }

  @Test
  public void case16() {
    int[] probability = { 21, 59 };
    int[] amounts = { 105, 660 };
    int minimumMoney = 287;
    assertEquals(0.5094744786707782, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 0.5094744786707782);
  }

  @Test
  public void case17() {
    int[] probability = { 91, 9 };
    int[] amounts = { 241, 655 };
    int minimumMoney = 147;
    assertEquals(2.655841341366748, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 2.655841341366748);
  }

  @Test
  public void case18() {
    int[] probability = { 80, 12, 1, 7, 0 };
    int[] amounts = { 315, 363, 215, 46, 702 };
    int minimumMoney = 310;
    assertEquals(5.245643792496961, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 5.245643792496961);
  }

  @Test
  public void case19() {
    int[] probability = { 97, 0, 2, 0, 1 };
    int[] amounts = { 641, 55, 827, 299, 840 };
    int minimumMoney = 349;
    assertEquals(2.8296004811766347, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 2.8296004811766347);
  }

  @Test
  public void case20() {
    int[] probability = { 9, 18, 29, 18, 4 };
    int[] amounts = { 323, 5, 157, 256, 690 };
    int minimumMoney = 209;
    assertEquals(15.088961223920425, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 15.088961223920425);
  }

  @Test
  public void case21() {
    int[] probability = { 52, 38, 5, 2, 1 };
    int[] amounts = { 874, 739, 312, 65, 707 };
    int minimumMoney = 325;
    assertEquals(5.069966826773921, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 5.069966826773921);
  }

  @Test
  public void case22() {
    int[] probability = { 0, 0, 0, 0 };
    int[] amounts = { 100, 100, 100, 100 };
    int minimumMoney = 350;
    assertEquals(-2.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -2.0);
  }

  @Test
  public void case23() {
    int[] probability = { 20, 20, 20, 20, 20 };
    int[] amounts = { 10, 10, 10, 10, 10 };
    int minimumMoney = 1000;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case24() {
    int[] probability = { 50, 50 };
    int[] amounts = { 10, 10 };
    int minimumMoney = 500;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case25() {
    int[] probability = { 1, 1, 1, 1, 1 };
    int[] amounts = { 500, 500, 500, 500, 500 };
    int minimumMoney = 750;
    assertEquals(71.87142489796517, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 71.87142489796517);
  }

  @Test
  public void case26() {
    int[] probability = { 0, 100, 0, 0 };
    int[] amounts = { 100, 0, 200, 500 };
    int minimumMoney = 450;
    assertEquals(-2.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -2.0);
  }

  @Test
  public void case27() {
    int[] probability = { 0, 50, 0, 0, 50 };
    int[] amounts = { 10, 0, 20, 70, 0 };
    int minimumMoney = 370;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case28() {
    int[] probability = { 0, 0, 100, 0, 0 };
    int[] amounts = { 0, 0, 180, 0, 0 };
    int minimumMoney = 950;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case29() {
    int[] probability = { 0, 0, 30, 0, 50 };
    int[] amounts = { 0, 0, 70, 0, 80 };
    int minimumMoney = 100;
    assertEquals(0.2987012987012987, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 0.2987012987012987);
  }

  @Test
  public void case30() {
    int[] probability = { 0, 0, 0, 0, 100 };
    int[] amounts = { 0, 0, 0, 0, 40 };
    int minimumMoney = 50;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case31() {
    int[] probability = { 20, 20, 1, 20, 1 };
    int[] amounts = { 10, 500, 10, 10, 500 };
    int minimumMoney = 70;
    assertEquals(13.155002944240612, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 13.155002944240612);
  }

  @Test
  public void case32() {
    int[] probability = { 100 };
    int[] amounts = { 20 };
    int minimumMoney = 100;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case33() {
    int[] probability = { 100 };
    int[] amounts = { 0 };
    int minimumMoney = 50;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case34() {
    int[] probability = { 0 };
    int[] amounts = { 0 };
    int minimumMoney = 60;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case35() {
    int[] probability = { 0 };
    int[] amounts = { 170 };
    int minimumMoney = 50;
    assertEquals(-2.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -2.0);
  }

  @Test
  public void case36() {
    int[] probability = { 0 };
    int[] amounts = { 890 };
    int minimumMoney = 420;
    assertEquals(-2.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -2.0);
  }

  @Test
  public void case37() {
    int[] probability = { 50, 40 };
    int[] amounts = { 300, 200 };
    int minimumMoney = 100;
    assertEquals(2.076923076923077, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 2.076923076923077);
  }

  @Test
  public void case38() {
    int[] probability = { 20, 18, 14, 32, 12 };
    int[] amounts = { 140, 200, 180, 120, 320 };
    int minimumMoney = 294;
    assertEquals(8.47036366123654, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 8.47036366123654);
  }

  @Test
  public void case39() {
    int[] probability = { 15, 16, 17, 18, 19 };
    int[] amounts = { 29, 28, 27, 26, 25 };
    int minimumMoney = 50;
    assertEquals(6.837560730100021, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 6.837560730100021);
  }

  @Test
  public void case40() {
    int[] probability = { 100 };
    int[] amounts = { 0 };
    int minimumMoney = 101;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case41() {
    int[] probability = { 10, 50, 5, 15, 19 };
    int[] amounts = { 60, 100, 25, 75, 105 };
    int minimumMoney = 50;
    assertEquals(6.337901176815901, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 6.337901176815901);
  }

  @Test
  public void case42() {
    int[] probability = { 0 };
    int[] amounts = { 100 };
    int minimumMoney = 120;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case43() {
    int[] probability = { 0, 10, 30, 20 };
    int[] amounts = { 0, 0, 0, 0 };
    int minimumMoney = 10;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case44() {
    int[] probability = { 0 };
    int[] amounts = { 100 };
    int minimumMoney = 101;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case45() {
    int[] probability = { 25, 24, 23, 12, 10 };
    int[] amounts = { 111, 222, 333, 444, 555 };
    int minimumMoney = 987;
    assertEquals(4.9323538208695, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 4.9323538208695);
  }

  @Test
  public void case46() {
    int[] probability = { 10, 10, 33, 44, 1 };
    int[] amounts = { 166, 266, 366, 466, 566 };
    int minimumMoney = 666;
    assertEquals(5.44652321557496, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 5.44652321557496);
  }

  @Test
  public void case47() {
    int[] probability = { 20, 30, 40 };
    int[] amounts = { 100, 100, 100 };
    int minimumMoney = 100;
    assertEquals(3.424778761061947, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 3.424778761061947);
  }

  @Test
  public void case48() {
    int[] probability = { 30, 20, 15, 35 };
    int[] amounts = { 100, 50, 20, 60 };
    int minimumMoney = 10;
    assertEquals(6.79713278162712, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 6.79713278162712);
  }

  @Test
  public void case49() {
    int[] probability = { 34, 12, 22, 11 };
    int[] amounts = { 100, 333, 222, 11 };
    int minimumMoney = 15;
    assertEquals(9.034966967256441, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 9.034966967256441);
  }

  @Test
  public void case50() {
    int[] probability = { 0 };
    int[] amounts = { 50 };
    int minimumMoney = 100;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case51() {
    int[] probability = { 30, 13, 35, 2, 3 };
    int[] amounts = { 0, 0, 1, 1, 999 };
    int minimumMoney = 133;
    assertEquals(72.33154747359897, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 72.33154747359897);
  }

  @Test
  public void case52() {
    int[] probability = { 0 };
    int[] amounts = { 100 };
    int minimumMoney = 100;
    assertEquals(-2.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -2.0);
  }

  @Test
  public void case53() {
    int[] probability = { 0 };
    int[] amounts = { 100 };
    int minimumMoney = 110;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case54() {
    int[] probability = { 0 };
    int[] amounts = { 0 };
    int minimumMoney = 1;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case55() {
    int[] probability = { 50 };
    int[] amounts = { 100 };
    int minimumMoney = 1000;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case56() {
    int[] probability = { 0, 0 };
    int[] amounts = { 0, 0 };
    int minimumMoney = 1;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case57() {
    int[] probability = { 0, 100 };
    int[] amounts = { 20, 20 };
    int minimumMoney = 10;
    assertEquals(0.5, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 0.5);
  }

  @Test
  public void case58() {
    int[] probability = { 10, 50, 5, 10, 10 };
    int[] amounts = { 100, 200, 300, 400, 500 };
    int minimumMoney = 250;
    assertEquals(10.04264670156143, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 10.04264670156143);
  }

  @Test
  public void case59() {
    int[] probability = { 0, 0, 0 };
    int[] amounts = { 10, 10, 10 };
    int minimumMoney = 1000;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case60() {
    int[] probability = { 30, 20, 10, 20, 6 };
    int[] amounts = { 300, 800, 250, 30, 150 };
    int minimumMoney = 900;
    assertEquals(3.451335457162043, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * 3.451335457162043);
  }

  @Test
  public void case61() {
    int[] probability = { 0, 100 };
    int[] amounts = { 100, 0 };
    int minimumMoney = 200;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case62() {
    int[] probability = { 0 };
    int[] amounts = { 10 };
    int minimumMoney = 100;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case63() {
    int[] probability = { 0 };
    int[] amounts = { 100 };
    int minimumMoney = 1000;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

  @Test
  public void case64() {
    int[] probability = { 100 };
    int[] amounts = { 0 };
    int minimumMoney = 1000;
    assertEquals(-1.0, racemanagement.getPayoutFactor(probability, amounts, minimumMoney), DELTA * -1.0);
  }

}
