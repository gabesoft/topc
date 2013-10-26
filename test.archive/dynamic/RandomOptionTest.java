package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RandomOptionTest {
  double DELTA = 1.0e-09;
  RandomOption randomoption = new RandomOption();

  @Test
  public void case1() {
    int keyCount = 5;
    int[] badLane1 = { 0 };
    int[] badLane2 = { 3 };
    assertEquals(0.6, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.6);
  }

  @Test
  public void case2() {
    int keyCount = 5;
    int[] badLane1 = { 0, 1, 2 };
    int[] badLane2 = { 1, 2, 0 };
    assertEquals(0.1, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.1);
  }

  @Test
  public void case3() {
    int keyCount = 5;
    int[] badLane1 = { 2, 2, 2, 2 };
    int[] badLane2 = { 0, 1, 3, 4 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case4() {
    int keyCount = 7;
    int[] badLane1 = { 0, 1, 2 };
    int[] badLane2 = { 6, 5, 4 };
    assertEquals(0.3904761904761904, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.3904761904761904);
  }

  @Test
  public void case5() {
    int keyCount = 7;
    int[] badLane1 = { 3, 5, 1, 0, 2, 6, 4 };
    int[] badLane2 = { 0, 2, 4, 6, 1, 5, 3 };
    assertEquals(0.09166666666666667, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.09166666666666667);
  }

  @Test
  public void case6() {
    int keyCount = 7;
    int[] badLane1 = { 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3 };
    int[] badLane2 = { 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case7() {
    int keyCount = 6;
    int[] badLane1 = { 5 };
    int[] badLane2 = { 3 };
    assertEquals(0.6666666666666666, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.6666666666666666);
  }

  @Test
  public void case8() {
    int keyCount = 8;
    int[] badLane1 = { 0 };
    int[] badLane2 = { 7 };
    assertEquals(0.75, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.75);
  }

  @Test
  public void case9() {
    int keyCount = 9;
    int[] badLane1 = { 2 };
    int[] badLane2 = { 4 };
    assertEquals(0.7777777777777778, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.7777777777777778);
  }

  @Test
  public void case10() {
    int keyCount = 10;
    int[] badLane1 = { 5, 8 };
    int[] badLane2 = { 3, 6 };
    assertEquals(0.6444444444444445, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.6444444444444445);
  }

  @Test
  public void case11() {
    int keyCount = 11;
    int[] badLane1 = { 5, 8, 10 };
    int[] badLane2 = { 8, 7, 8 };
    assertEquals(0.509090909090909, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.509090909090909);
  }

  @Test
  public void case12() {
    int keyCount = 12;
    int[] badLane1 = { 1, 9, 11 };
    int[] badLane2 = { 6, 8, 6 };
    assertEquals(0.5727272727272726, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.5727272727272726);
  }

  @Test
  public void case13() {
    int keyCount = 13;
    int[] badLane1 = { 8, 10, 9 };
    int[] badLane2 = { 6, 6, 12 };
    assertEquals(0.6002331002331003, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.6002331002331003);
  }

  @Test
  public void case14() {
    int keyCount = 5;
    int[] badLane1 = { 1, 0, 1, 1, 3, 4, 1, 4, 3 };
    int[] badLane2 = { 0, 2, 2, 3, 2, 0, 4, 2, 4 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case15() {
    int keyCount = 6;
    int[] badLane1 = { 0, 3, 1, 2, 4, 2, 3, 0, 1, 5, 3, 4 };
    int[] badLane2 = { 2, 0, 3, 3, 1, 4, 4, 5, 5, 2, 5, 5 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case16() {
    int keyCount = 7;
    int[] badLane1 = { 1, 0, 0, 1, 2, 4, 4, 4, 4, 5, 1, 5, 3, 4, 6, 6, 5 };
    int[] badLane2 = { 0, 2, 3, 3, 3, 0, 1, 2, 3, 0, 5, 2, 5, 5, 0, 3, 6 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case17() {
    int keyCount = 8;
    int[] badLane1 = { 1, 2, 2, 0, 3, 3, 4, 4, 3, 1, 2, 5, 5, 0, 6, 2, 4, 5, 0, 1, 7, 7, 7, 7 };
    int[] badLane2 = { 0, 0, 1, 3, 1, 2, 1, 2, 4, 5, 5, 3, 4, 6, 1, 6, 6, 6, 7, 7, 2, 3, 5, 6 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case18() {
    int keyCount = 9;
    int[] badLane1 = { 1, 0, 1, 0, 1, 4, 4, 3, 0, 5, 5, 4, 0, 1, 2, 6, 4, 6, 0, 1, 2, 3, 4, 5, 6, 8, 2, 8, 8, 8, 8, 7 };
    int[] badLane2 = { 0, 2, 2, 3, 3, 0, 2, 4, 5, 1, 2, 5, 6, 6, 6, 3, 6, 5, 7, 7, 7, 7, 7, 7, 7, 1, 8, 3, 4, 5, 6, 8 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case19() {
    int keyCount = 10;
    int[] badLane1 = { 1, 0, 1, 0, 2, 0, 4, 4, 5, 2, 3, 5, 0, 6, 6, 6, 0, 7, 2, 7, 4, 7, 7, 0, 1, 2, 3, 4, 6, 8, 0, 9, 9, 9, 9, 9, 7, 8 };
    int[] badLane2 = { 0, 2, 2, 3, 3, 4, 2, 3, 0, 5, 5, 4, 6, 1, 2, 3, 7, 1, 7, 3, 7, 5, 6, 8, 8, 8, 8, 8, 8, 7, 9, 1, 2, 4, 5, 6, 9, 9 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case20() {
    int keyCount = 11;
    int[] badLane1 = { 1, 2, 2, 3, 1, 2, 0, 4, 4, 3, 5, 5, 5, 0, 6, 2, 3, 6, 6, 0, 7, 2, 7, 7, 7, 1, 3, 8, 8, 7, 9, 2, 9, 9, 8, 10, 1, 10, 4, 5, 10, 10, 9 };
    int[] badLane2 = { 0, 0, 1, 0, 3, 3, 4, 1, 2, 4, 1, 2, 3, 6, 1, 6, 6, 4, 5, 7, 1, 7, 3, 4, 6, 8, 8, 5, 6, 8, 1, 9, 3, 7, 9, 0, 10, 3, 10, 10, 6, 8, 10 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case21() {
    int keyCount = 12;
    int[] badLane1 = { 1, 2, 1, 0, 4, 5, 5, 2, 3, 4, 5, 7, 7, 4, 5, 6, 0, 1, 8, 8, 8, 0, 1, 9, 9, 4, 9, 6, 9, 8, 0, 10, 3, 5, 6, 7, 8, 9, 11, 3, 11, 5, 7, 11, 10 };
    int[] badLane2 = { 0, 1, 3, 4, 2, 0, 3, 6, 6, 6, 6, 1, 3, 7, 7, 7, 8, 8, 5, 6, 7, 9, 9, 2, 3, 9, 5, 9, 7, 9, 10, 2, 10, 10, 10, 10, 10, 10, 1, 11, 4, 11, 11, 8, 11 };
    assertEquals(4.5928865373309814e-08, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 4.5928865373309814e-08);
  }

  @Test
  public void case22() {
    int keyCount = 13;
    int[] badLane1 = { 3, 1, 2, 2, 0, 5, 5, 5, 6, 6, 3, 6, 0, 2, 7, 7, 8, 2, 3, 4, 5, 6, 9, 9, 9, 9, 10, 3, 10, 10, 11, 11, 3, 11, 5, 11, 11, 0, 1, 2, 3, 4, 12, 12, 12, 12 };
    int[] badLane2 = { 0, 3, 3, 4, 5, 1, 3, 4, 1, 2, 6, 5, 7, 7, 3, 4, 0, 8, 8, 8, 8, 8, 1, 2, 6, 7, 2, 10, 4, 6, 0, 1, 11, 4, 11, 8, 9, 12, 12, 12, 12, 12, 5, 8, 9, 11 };
    assertEquals(3.171661157772269e-06, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 3.171661157772269e-06);
  }

  @Test
  public void case23() {
    int keyCount = 14;
    int[] badLane1 = { 1, 3, 2, 0, 4, 5, 1, 5, 4, 6, 3, 6, 5, 7, 2, 7, 1, 8, 8, 8, 8, 9, 9, 10, 10, 10, 10, 10, 1, 6, 9, 11, 12, 1, 7, 12, 13, 1, 2, 3, 4, 13, 13, 7, 13, 10, 13 };
    int[] badLane2 = { 0, 0, 3, 4, 3, 0, 5, 2, 5, 2, 6, 4, 6, 1, 7, 3, 8, 4, 5, 6, 7, 3, 4, 1, 4, 6, 8, 9, 11, 11, 11, 10, 0, 12, 12, 9, 0, 13, 13, 13, 13, 5, 6, 13, 8, 13, 12 };
    assertEquals(1.3503797605980147e-05, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 1.3503797605980147e-05);
  }

  @Test
  public void case24() {
    int keyCount = 8;
    int[] badLane1 = { 0, 3, 3, 4, 1, 4, 0, 5, 2, 5, 5, 6, 6, 6, 6, 7, 7, 4 };
    int[] badLane2 = { 1, 1, 2, 0, 4, 2, 5, 1, 5, 3, 4, 1, 2, 4, 5, 0, 1, 7 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case25() {
    int keyCount = 9;
    int[] badLane1 = { 2, 0, 1, 4, 2, 5, 4, 6, 5, 7, 3, 7, 0, 2, 8, 8 };
    int[] badLane2 = { 1, 3, 3, 3, 5, 3, 5, 1, 6, 0, 7, 5, 8, 8, 6, 7 };
    assertEquals(0.00642636684303351, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.00642636684303351);
  }

  @Test
  public void case26() {
    int keyCount = 10;
    int[] badLane1 = { 1, 3, 0, 0, 5, 5, 1, 0, 7, 7, 8, 8, 8, 8, 5 };
    int[] badLane2 = { 0, 2, 4, 5, 3, 4, 6, 7, 4, 6, 1, 2, 4, 6, 9 };
    assertEquals(0.020188492063492065, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.020188492063492065);
  }

  @Test
  public void case27() {
    int keyCount = 11;
    int[] badLane1 = { 0, 2, 1, 5, 6, 6, 4, 7, 7, 7, 8, 1, 5, 6, 0, 10 };
    int[] badLane2 = { 1, 0, 2, 2, 1, 2, 6, 2, 3, 5, 0, 9, 9, 9, 10, 7 };
    assertEquals(0.020668590668590666, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.020668590668590666);
  }

  @Test
  public void case28() {
    int keyCount = 12;
    int[] badLane1 = { 0, 0, 5, 5, 6, 0, 8, 8, 8, 9, 10, 9, 11, 11, 11, 10 };
    int[] badLane2 = { 2, 5, 2, 4, 4, 8, 2, 3, 4, 5, 2, 10, 2, 3, 6, 11 };
    assertEquals(0.03171173540965208, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.03171173540965208);
  }

  @Test
  public void case29() {
    int keyCount = 14;
    int[] badLane1 = { 3, 4, 4, 9, 9, 10, 0, 8, 7, 12 };
    int[] badLane2 = { 2, 1, 6, 4, 8, 2, 11, 11, 13, 13 };
    assertEquals(0.2097807175188128, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.2097807175188128);
  }

  @Test
  public void case30() {
    int keyCount = 14;
    int[] badLane1 = { 1, 6, 5, 8, 4, 6, 8, 5, 7, 2, 12, 4 };
    int[] badLane2 = { 0, 4, 6, 0, 9, 9, 9, 10, 10, 12, 9, 13 };
    assertEquals(0.13830171812314668, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.13830171812314668);
  }

  @Test
  public void case31() {
    int keyCount = 14;
    int[] badLane1 = { 3, 4, 6, 7, 9, 7, 10, 2, 3, 5, 11, 6, 13, 13, 13 };
    int[] badLane2 = { 1, 5, 4, 2, 2, 9, 5, 11, 11, 11, 8, 12, 4, 9, 12 };
    assertEquals(0.08506623405804954, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.08506623405804954);
  }

  @Test
  public void case32() {
    int keyCount = 14;
    int[] badLane1 = { 3, 0, 5, 3, 6, 7, 8, 6, 0, 6, 10, 10, 8, 11, 4, 13, 7 };
    int[] badLane2 = { 4, 5, 2, 6, 5, 1, 0, 8, 9, 9, 3, 7, 10, 3, 11, 3, 13 };
    assertEquals(0.056225506746340075, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.056225506746340075);
  }

  @Test
  public void case33() {
    int keyCount = 14;
    int[] badLane1 = { 1, 3, 2, 6, 5, 0, 8, 6, 9, 9, 8, 1, 11, 8, 12, 11, 0, 13, 13, 9 };
    int[] badLane2 = { 3, 2, 6, 4, 7, 8, 4, 8, 3, 4, 9, 10, 7, 11, 6, 12, 13, 6, 8, 13 };
    assertEquals(0.028468120834192263, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.028468120834192263);
  }

  @Test
  public void case34() {
    int keyCount = 8;
    int[] badLane1 = { 1, 6 };
    int[] badLane2 = { 2, 5 };
    assertEquals(0.5714285714285714, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.5714285714285714);
  }

  @Test
  public void case35() {
    int keyCount = 9;
    int[] badLane1 = { 1, 4, 5, 8 };
    int[] badLane2 = { 2, 3, 1, 0 };
    assertEquals(0.3716931216931217, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.3716931216931217);
  }

  @Test
  public void case36() {
    int keyCount = 10;
    int[] badLane1 = { 1, 2, 7, 6 };
    int[] badLane2 = { 3, 5, 5, 8 };
    assertEquals(0.41269841269841273, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.41269841269841273);
  }

  @Test
  public void case37() {
    int keyCount = 11;
    int[] badLane1 = { 4, 3, 7, 10, 10 };
    int[] badLane2 = { 2, 7, 6, 7, 9 };
    assertEquals(0.3434343434343434, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.3434343434343434);
  }

  @Test
  public void case38() {
    int keyCount = 12;
    int[] badLane1 = { 3, 4, 4, 6, 5, 3 };
    int[] badLane2 = { 1, 0, 5, 2, 8, 11 };
    assertEquals(0.33195646945646945, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.33195646945646945);
  }

  @Test
  public void case39() {
    int keyCount = 14;
    int[] badLane1 = { 3, 1, 2, 4, 4, 2, 5, 1, 2, 6, 6, 6, 7, 7, 7, 8, 8, 2, 9, 1, 9, 10, 1, 10, 11, 1, 11, 0, 1, 2, 13, 2 };
    int[] badLane2 = { 0, 3, 3, 0, 1, 4, 0, 5, 5, 0, 1, 2, 0, 1, 2, 0, 1, 8, 0, 9, 2, 0, 10, 2, 0, 11, 2, 12, 12, 12, 0, 13 };
    assertEquals(0.0001665001665001665, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.0001665001665001665);
  }

  @Test
  public void case40() {
    int keyCount = 14;
    int[] badLane1 = { 4, 1, 4, 3, 0, 1, 5, 5, 6, 6, 2, 6, 0, 7, 2, 7, 8, 1, 2, 3, 9, 1, 9, 10, 10, 2, 3, 11, 11, 11, 11, 0, 12, 12, 3, 13, 1, 2, 13 };
    int[] badLane2 = { 0, 4, 2, 4, 5, 5, 2, 3, 0, 1, 6, 3, 7, 1, 7, 3, 0, 8, 8, 8, 0, 9, 3, 0, 1, 10, 10, 0, 1, 2, 3, 12, 1, 2, 12, 0, 13, 13, 3 };
    assertEquals(4.995004995004995e-05, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 4.995004995004995e-05);
  }

  @Test
  public void case41() {
    int keyCount = 14;
    int[] badLane1 = { 0, 5, 5, 3, 4, 0, 6, 2, 3, 4, 7, 7, 7, 3, 4, 8, 8, 8, 3, 8, 9, 9, 2, 9, 10, 10, 10, 3, 10, 11, 11, 2, 11, 11, 12, 12, 12, 12, 12, 0, 13, 13, 13, 13 };
    int[] badLane2 = { 5, 1, 2, 5, 5, 6, 1, 6, 6, 6, 0, 1, 2, 7, 7, 0, 1, 2, 8, 4, 0, 1, 9, 3, 0, 1, 2, 10, 4, 0, 1, 11, 3, 4, 0, 1, 2, 3, 4, 13, 1, 2, 3, 4 };
    assertEquals(2.22000222000222e-05, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 2.22000222000222e-05);
  }

  @Test
  public void case42() {
    int keyCount = 14;
    int[] badLane1 = { 0, 6, 2, 6, 4, 5, 7, 1, 7, 7, 4, 7, 8, 8, 3, 4, 5, 9, 1, 9, 3, 4, 5, 0, 1, 2, 3, 10, 10, 0, 1, 11, 11, 11, 11, 0, 1, 12, 12, 4, 12, 13, 1, 13, 3, 13, 5 };
    int[] badLane2 = { 6, 1, 6, 3, 6, 6, 0, 7, 2, 3, 7, 5, 0, 1, 8, 8, 8, 0, 9, 2, 9, 9, 9, 10, 10, 10, 10, 4, 5, 11, 11, 2, 3, 4, 5, 12, 12, 2, 3, 12, 5, 0, 13, 2, 13, 4, 13 };
    assertEquals(1.3875013875013877e-05, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 1.3875013875013877e-05);
  }

  @Test
  public void case43() {
    int keyCount = 14;
    int[] badLane1 = { 7, 1, 2, 3, 4, 7, 7, 0, 8, 2, 3, 4, 5, 8, 9, 1, 2, 3, 4, 5, 9, 10, 10, 10, 3, 10, 10, 10, 0, 11, 2, 11, 4, 5, 6, 0, 1, 12, 12, 12, 12, 13, 13, 13, 13, 4, 5, 6 };
    int[] badLane2 = { 0, 7, 7, 7, 7, 5, 6, 8, 1, 8, 8, 8, 8, 6, 0, 9, 9, 9, 9, 9, 6, 0, 1, 2, 10, 4, 5, 6, 11, 1, 11, 3, 11, 11, 11, 12, 12, 3, 4, 5, 6, 0, 1, 2, 3, 13, 13, 13 };
    assertEquals(1.1892869035726179e-05, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 1.1892869035726179e-05);
  }

  @Test
  public void case44() {
    int keyCount = 14;
    int[] badLane1 = { 0 };
    int[] badLane2 = { 1 };
    assertEquals(0.8571428571428571, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.8571428571428571);
  }

  @Test
  public void case45() {
    int keyCount = 5;
    int[] badLane1 = { 0 };
    int[] badLane2 = { 3 };
    assertEquals(0.6, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.6);
  }

  @Test
  public void case46() {
    int keyCount = 7;
    int[] badLane1 = { 0, 0, 0, 0, 0, 0, 1 };
    int[] badLane2 = { 1, 2, 3, 4, 5, 6, 2 };
    assertEquals(0.0, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA);
  }

  @Test
  public void case47() {
    int keyCount = 14;
    int[] badLane1 = { 0, 6, 9, 4 };
    int[] badLane2 = { 5, 7, 8, 3 };
    assertEquals(0.5464535464535464, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.5464535464535464);
  }

  @Test
  public void case48() {
    int keyCount = 14;
    int[] badLane1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] badLane2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    assertEquals(0.2039461915950011, randomoption.getProbability(keyCount, badLane1, badLane2), DELTA * 0.2039461915950011);
  }

}
