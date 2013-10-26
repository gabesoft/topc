package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class HoleCakeCutsTest {
  HoleCakeCuts holecakecuts = new HoleCakeCuts();

  @Test
  public void case1() {
    int cakeLength = 5;
    int holeLength = 3;
    int[] horizontalCuts = { 1, -4 };
    int[] verticalCuts = { 1 };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case2() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -2, 2 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case3() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { 1 };
    int[] verticalCuts = { -5, 5 };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case4() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -7, 7 };
    assertEquals(3, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case5() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { 7 };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case6() {
    int cakeLength = 25;
    int holeLength = 15;
    int[] horizontalCuts = { -20 };
    int[] verticalCuts = { 20 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case7() {
    int cakeLength = 25;
    int holeLength = 15;
    int[] horizontalCuts = { -17, 12, 13, 14, 15 };
    int[] verticalCuts = { 20, 24, -1, -20, -22, -9 };
    assertEquals(39, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case8() {
    int cakeLength = 50;
    int holeLength = 5;
    int[] horizontalCuts = { 40, -40 };
    int[] verticalCuts = { 20, -20 };
    assertEquals(9, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case9() {
    int cakeLength = 50;
    int holeLength = 5;
    int[] horizontalCuts = { 40, -40 };
    int[] verticalCuts = { 20, 0, -20 };
    assertEquals(12, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case10() {
    int cakeLength = 2;
    int holeLength = 1;
    int[] horizontalCuts = { -1, 0, 1 };
    int[] verticalCuts = {  };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case11() {
    int cakeLength = 3;
    int holeLength = 2;
    int[] horizontalCuts = { 2 };
    int[] verticalCuts = { -1, -2, 2, 1 };
    assertEquals(10, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case12() {
    int cakeLength = 2;
    int holeLength = 1;
    int[] horizontalCuts = { -1, 1 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case13() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { 0 };
    int[] verticalCuts = { 0 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case14() {
    int cakeLength = 2;
    int holeLength = 1;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case15() {
    int cakeLength = 100;
    int holeLength = 99;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case16() {
    int cakeLength = 100;
    int holeLength = 1;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case17() {
    int cakeLength = 100;
    int holeLength = 99;
    int[] horizontalCuts = { -99 };
    int[] verticalCuts = { 99 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case18() {
    int cakeLength = 100;
    int holeLength = 98;
    int[] horizontalCuts = { -98, 98 };
    int[] verticalCuts = { 98, -98 };
    assertEquals(8, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case19() {
    int cakeLength = 77;
    int holeLength = 33;
    int[] horizontalCuts = { 33 };
    int[] verticalCuts = { 1, 2, 3, 4, 33, -33, 34, -34, 76, 74, 37, -73 };
    assertEquals(26, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case20() {
    int cakeLength = 38;
    int holeLength = 10;
    int[] horizontalCuts = { 1, -1, -5, -9, 7, 33, 27, -27, -37, 37, 12 };
    int[] verticalCuts = { -10, 10 };
    assertEquals(32, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case21() {
    int cakeLength = 50;
    int holeLength = 29;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -29 };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case22() {
    int cakeLength = 58;
    int holeLength = 11;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { 11 };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case23() {
    int cakeLength = 69;
    int holeLength = 13;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -13, 13 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case24() {
    int cakeLength = 71;
    int holeLength = 23;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -24, -29, -70 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case25() {
    int cakeLength = 9;
    int holeLength = 3;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { 4, 5, 6, 7, 8 };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case26() {
    int cakeLength = 21;
    int holeLength = 17;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -17, -18, 19, 20 };
    assertEquals(5, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case27() {
    int cakeLength = 76;
    int holeLength = 23;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -23, 23, -75, 75, -30, 49, 33 };
    assertEquals(9, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case28() {
    int cakeLength = 100;
    int holeLength = 90;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -45 };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case29() {
    int cakeLength = 100;
    int holeLength = 80;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -80, -37, 90 };
    assertEquals(5, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case30() {
    int cakeLength = 25;
    int holeLength = 12;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
    assertEquals(74, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case31() {
    int cakeLength = 25;
    int holeLength = 19;
    int[] horizontalCuts = { -11 };
    int[] verticalCuts = { -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
    assertEquals(100, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case32() {
    int cakeLength = 99;
    int holeLength = 30;
    int[] horizontalCuts = { 98, 77, 31 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case33() {
    int cakeLength = 77;
    int holeLength = 19;
    int[] horizontalCuts = { 20, 23, 76, 32 };
    int[] verticalCuts = {  };
    assertEquals(5, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case34() {
    int cakeLength = 18;
    int holeLength = 3;
    int[] horizontalCuts = { -3 };
    int[] verticalCuts = {  };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case35() {
    int cakeLength = 19;
    int holeLength = 18;
    int[] horizontalCuts = { 18 };
    int[] verticalCuts = {  };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case36() {
    int cakeLength = 37;
    int holeLength = 22;
    int[] horizontalCuts = { -23, -33, -22 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case37() {
    int cakeLength = 44;
    int holeLength = 11;
    int[] horizontalCuts = { 11, 23, 43 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case38() {
    int cakeLength = 6;
    int holeLength = 2;
    int[] horizontalCuts = { 2, -2 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case39() {
    int cakeLength = 30;
    int holeLength = 8;
    int[] horizontalCuts = { -8, 0, 8 };
    int[] verticalCuts = {  };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case40() {
    int cakeLength = 29;
    int holeLength = 21;
    int[] horizontalCuts = { -20, 22, -21, 21, 1, 3, -25 };
    int[] verticalCuts = {  };
    assertEquals(12, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case41() {
    int cakeLength = 25;
    int holeLength = 24;
    int[] horizontalCuts = { -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
    int[] verticalCuts = {  };
    assertEquals(98, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case42() {
    int cakeLength = 25;
    int holeLength = 13;
    int[] horizontalCuts = { -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
    int[] verticalCuts = { 0 };
    assertEquals(100, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case43() {
    int cakeLength = 99;
    int holeLength = 17;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { 23, 33, 13, 44, 32, -14, 0, -7, 7, 3, 2, 1 };
    assertEquals(20, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case44() {
    int cakeLength = 100;
    int holeLength = 2;
    int[] horizontalCuts = { 43, 13, -2, 1, 0, 7, 4, 3, -43, -22 };
    int[] verticalCuts = {  };
    assertEquals(13, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case45() {
    int cakeLength = 37;
    int holeLength = 20;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -20, 20, 0 };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case46() {
    int cakeLength = 34;
    int holeLength = 12;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -10, 7, 9 };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case47() {
    int cakeLength = 40;
    int holeLength = 20;
    int[] horizontalCuts = { -20, 1, 20 };
    int[] verticalCuts = {  };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case48() {
    int cakeLength = 19;
    int holeLength = 3;
    int[] horizontalCuts = { -1, -2, 2 };
    int[] verticalCuts = {  };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case49() {
    int cakeLength = 37;
    int holeLength = 13;
    int[] horizontalCuts = { -24, -22, -16, -28 };
    int[] verticalCuts = { 26 };
    assertEquals(10, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case50() {
    int cakeLength = 83;
    int holeLength = 3;
    int[] horizontalCuts = { -39, -33, -16, -10, -82, -9, -60, -45, -78, 70, -67, -36, 65, -49, 34, 78, -38, 53, 20, -18, 77, 6, -11, 24, 72, -32, 54, 27, -74, -56, 38, -59, -4, 10, 42, 9, 40, 69, -53, -24, 58, 23, 71, 12, -54, 55, -30, -63, 4, -20 };
    int[] verticalCuts = { -63, -56, 51, 77, -51, -40, -77, -9, -64, 63, -35, -71, 49, 79, 81, -37, 47, -49, -61, 36, 61, 25, -60, 78, 54, 52, 73, 40, 72, 82, 70, -62, 46, 9, 13, 17, 59, 34, -33, -25, -68, 6, 22, 60, -42, -23, -66, 28, 24, 55 };
    assertEquals(2601, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case51() {
    int cakeLength = 16;
    int holeLength = 8;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case52() {
    int cakeLength = 23;
    int holeLength = 3;
    int[] horizontalCuts = { -11, 6, -12, 4, -21, 14, -19, 19, -16, -6, -20, -4, 18, 8, 22, 12, -7, -17, 16, -18, -9, 15, 10, 17, 13, -15, 7 };
    int[] verticalCuts = { 14, -20, -11, 22, -16, -18, 16, 10, 15, -10, 19, -9, 17, -14, 20, -21, -6, 11, 5, -13, -5, 8, 7, 9, -22, -15, 12 };
    assertEquals(784, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case53() {
    int cakeLength = 39;
    int holeLength = 21;
    int[] horizontalCuts = { 33, -34, 32 };
    int[] verticalCuts = { 30, -30, -27 };
    assertEquals(16, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case54() {
    int cakeLength = 51;
    int holeLength = 26;
    int[] horizontalCuts = { 31, 44, 37, -34, -32, 27, -48, -41, 47, -45, -44, 34, -39, -43, 46, -46, 50, -28 };
    int[] verticalCuts = { -30, -35, -28, 28, -36, 33, 37, 29, -47, 38, -39, 49, -33, 46, -27, 36, 41, 42, -38, 48, -34, 27, -45, -40, 34, 30 };
    assertEquals(513, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case55() {
    int cakeLength = 57;
    int holeLength = 40;
    int[] horizontalCuts = { 51, 45, -53, 49, -55, 54, 41, -42, -50, 56, 50, -56, -43, 46, 42 };
    int[] verticalCuts = { -51, -43, -45, -53, -54, -49, 45, 49, 53, 43, 52, 55, -42, -55, -48, 48, -46, 44, -56 };
    assertEquals(320, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case56() {
    int cakeLength = 37;
    int holeLength = 20;
    int[] horizontalCuts = { -34, 34, -21, -26, -28, -32, -24, 33, -25, 21, 35, 29, 27, 26, -29, -33, 23, -36, 32, 31, 24, -23, 36, -30, -22, -27, -35 };
    int[] verticalCuts = { -22, 31, -21, 24, 23, 32, -31, 27, 29, -30, -27, -23, -26, 28, 25, -33, 30, 36, -24, 21, 33, 22, -29, 34, -36, -34, 35, -28 };
    assertEquals(812, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case57() {
    int cakeLength = 88;
    int holeLength = 64;
    int[] horizontalCuts = { -72, -85, 81, -84, 79, -81, 80, 71, -66, -78, 74, -82, -75, 78, -71, 72, -87, -67, -74, 66, 73, 75, -65, 77, 87, 84, -83, -70, 69, 67 };
    int[] verticalCuts = { 86, 70, 76, 82, -68, 80, -76, -70, 75, 68, -69, -79, 87, -66, 72, 83, -87, 81, 79, -78, -83, -71, -73, 69, 77, -75, -84, 65, 78, 84 };
    assertEquals(961, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case58() {
    int cakeLength = 15;
    int holeLength = 9;
    int[] horizontalCuts = { -13, -12, 13, 11, 14, -14, 12, 10, -10 };
    int[] verticalCuts = { -12, 10, -14, 13, -11, 14, -10, 11, 12, -13 };
    assertEquals(110, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case59() {
    int cakeLength = 95;
    int holeLength = 53;
    int[] horizontalCuts = { 92, 82, 54 };
    int[] verticalCuts = { 54, -92, 55 };
    assertEquals(16, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case60() {
    int cakeLength = 53;
    int holeLength = 34;
    int[] horizontalCuts = { -34, -37, 41, 52, -36, 34, -50, 49, 45, 37, 43, 48, -43, 42, -38, -41, -47, -48, -52, -49, 44, -35, 50, -51, 46, 51, 38, 35, -46, -44, 36, -39, 47, -42, -40 };
    int[] verticalCuts = { -41, 38, -46, -52, 40, 51, -36, 47, 45, 52, -35, -48, -39, 34, 42, 39, 48, -49, -45, -34, -51, 46, 44, -43, 36, 43, 41, -40, 37, -38, -37, -47, 35 };
    assertEquals(1223, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case61() {
    int cakeLength = 90;
    int holeLength = 9;
    int[] horizontalCuts = { 89, -69, -42, 45, -23, 65, -89, -67, -36, -17, -60, 28, -55, 36, 71, 38, -87, -39, -16, 12, -85, 9, -56, 37, -59, -14, 25, 21, -66, -27, -81, -88, -31, -64, -61, 32, 56, 62, 87, 30, -62, 41, 75, 23, -29, 42, -22, 17, 70, 31 };
    int[] verticalCuts = { 48, 84, -80, 18, 68, -56, 15, -24, -70, -18, 53, -51, 73, -50, 77, -59, 24, 87, 20, -29, 40, -23, -46, -63, -60, -33, -27, 17, 72, 63, -53, -77, -32, 39, 47, -88, 89, -34, -20, 86, -72, -68, 38, 22, 33, -15, 27, 41, -17, 10 };
    assertEquals(2601, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case62() {
    int cakeLength = 96;
    int holeLength = 85;
    int[] horizontalCuts = { 86, -86, -91, 94, -90, 89, 92, 95, 90, 93, -87, 87, 91, 85, -95, -93, -85, -89, -92 };
    int[] verticalCuts = { -87, -93, 90, 94, 85, -90, 88, -94, -91, -95, -88, -86, 92, 91, 95 };
    assertEquals(320, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case63() {
    int cakeLength = 16;
    int holeLength = 12;
    int[] horizontalCuts = { 12, 15, -12, -14, 14 };
    int[] verticalCuts = { 12, 14, -15, 13 };
    assertEquals(30, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case64() {
    int cakeLength = 23;
    int holeLength = 13;
    int[] horizontalCuts = { 22, -17 };
    int[] verticalCuts = { 18, -13, -15, -22 };
    assertEquals(15, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case65() {
    int cakeLength = 80;
    int holeLength = 65;
    int[] horizontalCuts = { 67, 66, 70, 71, 77, -74, 68, -70, 78, -73, 69, -76, -79, 74, 75, -66, -69, 72, -67 };
    int[] verticalCuts = { -76, -74, 65, -79, 75, -73, -66, 68, -71, 72, -68, -70, 77, 67, 74, -72 };
    assertEquals(340, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case66() {
    int cakeLength = 15;
    int holeLength = 9;
    int[] horizontalCuts = { -10, -12, -11, 14, 13, -9, 11 };
    int[] verticalCuts = { 14, 13, 10, -9, 9, -14 };
    assertEquals(56, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case67() {
    int cakeLength = 22;
    int holeLength = 3;
    int[] horizontalCuts = { -7, 20, -11, 10, 13, -4, 15, 5, -16, 17, -3, 6, -9, 18, -15, -5, 21, -19 };
    int[] verticalCuts = { -14, -9, 8, 11, -3, -17, 16, 21, -10, -19, 13, -12, 7, 10, 17, -21, -13, -8 };
    assertEquals(361, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case68() {
    int cakeLength = 97;
    int holeLength = 21;
    int[] horizontalCuts = { -94, 95, -49, 29, -42, 70, 35, -53, 26, -87, 75, 44, -69, -63, -29, -31, -92, -60, 84, 46, 40, -74, 57, -79, 58, -26, -67, 90, 36, 71, -89, -27, 92, -30, 22, -66, -73, -43, -41, -51, 66, -83, -40, -65, -76, 88, 28, -55, -46, -82 };
    int[] verticalCuts = { 27, 30, 64, 29, 96, -84, -92, -77, 22, 65, -78, 35, 69, 28, 53, -95, -82, -64, -66, 78, 61, 67, 74, -63, 90, 70, 47, -23, 45, 82, -47, 54, 50, -67, 88, -83, 77, 23, 66, -86, 55, -68, -72, 26, -41, -60, -29, -36, -40, 42 };
    assertEquals(2601, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case69() {
    int cakeLength = 28;
    int holeLength = 19;
    int[] horizontalCuts = { 17, -15, -11, 0, 14, 8, -9, -12, -8, 13, -16, -3, 1, 2, -5, 18, 3, -13, 16, 19, 9, 7, 10, -1 };
    int[] verticalCuts = { 13, 1, 7, -10, 8, -11, -15, 18, -1, -12, -16, -2, 4, -14, -17, 9, -3, 17, 16, 19, -18, 5, 10, -19, 0 };
    assertEquals(98, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case70() {
    int cakeLength = 28;
    int holeLength = 5;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -1 };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case71() {
    int cakeLength = 90;
    int holeLength = 37;
    int[] horizontalCuts = { -27, 27, 5, -23, -25, -12, 17, -29, 1, -24, 29, -32, -7, 33, 37, 8, -4, 10, -35, -2, -3, -28, 28, 34, -18, 12, 25, 3, -21, 20, -15, 22, 18, -16, -17, -11, -14, 35 };
    int[] verticalCuts = { -12, -3, -26, -11, 34, -22, 17, 23, -33, 31, -19, 10, 18, 7, 25, -27, 1, 14, -4, 35, -2, -8, -10, -7, 28, -28, 26, -15, 24, 4, -35, 12, 6, 37, -31, 8, -25, -6, -14, -36, -29, 22 };
    assertEquals(160, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case72() {
    int cakeLength = 46;
    int holeLength = 2;
    int[] horizontalCuts = { 0, 1, -1, 2 };
    int[] verticalCuts = { -1, 2, 1, 0, -2 };
    assertEquals(18, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case73() {
    int cakeLength = 13;
    int holeLength = 4;
    int[] horizontalCuts = { -4, 0, -2, -3, 3 };
    int[] verticalCuts = { -4, 2, 0, 4 };
    assertEquals(18, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case74() {
    int cakeLength = 39;
    int holeLength = 20;
    int[] horizontalCuts = { -3, 20, -15, -13, -1, 0, 3, -14, 12, 7, 16, -9, 19, -6, -16, 14, -12, -5, 8, -10, 1, -4, 13, -17, 6, 11, 10, -8, -7, 15, 9, -18, 17, -11, 4, -19, 2 };
    int[] verticalCuts = { 15, 10, -11, -8, 1, -7, 7, 0, 6, 11, -15, -20, 17, 19, 9, 4, -1, -10, -17, 8, -4, -5, -19, 12, -12, 3, 16, 5, -18, -13, 20, 13, -3, -9, 14, -16, -6, -2, 2, -14 };
    assertEquals(154, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case75() {
    int cakeLength = 18;
    int holeLength = 14;
    int[] horizontalCuts = { -9, 0, -1, -6, 8, -2, 12, 13 };
    int[] verticalCuts = { 13, -2, 6, -3, -11, -5, 7, -14, 5, -6 };
    assertEquals(36, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case76() {
    int cakeLength = 70;
    int holeLength = 10;
    int[] horizontalCuts = { 8, 3, -9, 7, -10, -2 };
    int[] verticalCuts = { -1, 2, 8, -9, 0 };
    assertEquals(22, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case77() {
    int cakeLength = 86;
    int holeLength = 2;
    int[] horizontalCuts = { 1, 2, -2, -1 };
    int[] verticalCuts = { 2, -2 };
    assertEquals(12, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case78() {
    int cakeLength = 95;
    int holeLength = 6;
    int[] horizontalCuts = { -5, 3, 5, 2, 1, 0, -4, -6, 4 };
    int[] verticalCuts = { -4, -5, -3, 0, 5, -1, -6, -2, 3 };
    assertEquals(36, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case79() {
    int cakeLength = 31;
    int holeLength = 4;
    int[] horizontalCuts = { 3, -3, -2 };
    int[] verticalCuts = { 0, -1, -3, -2 };
    assertEquals(14, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case80() {
    int cakeLength = 11;
    int holeLength = 9;
    int[] horizontalCuts = { -1, 5, -7, 6, -8, 0, 2, 8, -4, 1, -6, 4, 3, -5, -3, -2, 7 };
    int[] verticalCuts = { -2, 0, 2, 3, -3, 6, -4, -5, 5, 4, 8, 7, 1, -7, -8, -6 };
    assertEquals(66, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case81() {
    int cakeLength = 40;
    int holeLength = 16;
    int[] horizontalCuts = { -10, -5, -12, 11, 15, -6, 6, -13, 0, -9, -1, -4, 7, 13, 2, 14, 8, -7, 5, -14, -3, -11, 1, -2, 9, 4 };
    int[] verticalCuts = { -5, 12, 11, 14, -14, -15, 3, -3, -13, 9, -2, 8, 5, 2, -8, -9, 4, 10, -12, 0, -10, 15, -1, -6, -11 };
    assertEquals(102, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case82() {
    int cakeLength = 44;
    int holeLength = 13;
    int[] horizontalCuts = { 1, -4, 7, -8, -1, -6, -3, 0, -12, 2 };
    int[] verticalCuts = { 11, 3, -12, -10, 4, -1, 10, -2, 8, -3, -7 };
    assertEquals(42, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case83() {
    int cakeLength = 24;
    int holeLength = 8;
    int[] horizontalCuts = { -4, 1 };
    int[] verticalCuts = { 5 };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case84() {
    int cakeLength = 60;
    int holeLength = 46;
    int[] horizontalCuts = { -41, 31, -27, -30, 45, -45, -5, -15, -4, 38, 10, 25, 27, -33, 17, 37, 2, 14, 16, -1, 29, 0, 23, -29, 34, -23, 39 };
    int[] verticalCuts = { 40, 7, 24, -7, -44, 16, -40, -35, 12, 2, 34, 45, -2, 26, -21, 44, 35, 42, 29, -13, -39, 8, 14, 31, -28 };
    assertEquals(104, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case85() {
    int cakeLength = 25;
    int holeLength = 9;
    int[] horizontalCuts = { -3, -6, 7 };
    int[] verticalCuts = { -6, -8, -7, 8, -3, -2, -1 };
    assertEquals(20, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case86() {
    int cakeLength = 95;
    int holeLength = 39;
    int[] horizontalCuts = { 1, -7, -24, -23, 5, 29, -10, -17, 38, -25, -37, -22, -30, 30, -35, 33, -14 };
    int[] verticalCuts = { -19, 9, -37, 26, 29, 7, 0, 37, 36, 31, 12, 11, 16, 38, -35, -36, 2, 33, 21, 3 };
    assertEquals(74, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case87() {
    int cakeLength = 71;
    int holeLength = 12;
    int[] horizontalCuts = { -3, 2, 9, 7, 1, -10, -6, -11, 5, -4, -8, -9, -7, 3, 6, 4, 10, -5 };
    int[] verticalCuts = { -11, 9, -6, -7, -1, -2, 3, 7, -4, -3, 10, 4, 11, 0, 5, -5, 6, 1, 8, -8, 2 };
    assertEquals(78, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case88() {
    int cakeLength = 96;
    int holeLength = 58;
    int[] horizontalCuts = { -45, 23, 30, 4, -57, -30, 35, -50 };
    int[] verticalCuts = { -32, 23, 36, 2, -47, 10, 40, 35, 42, 28 };
    assertEquals(36, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case89() {
    int cakeLength = 90;
    int holeLength = 34;
    int[] horizontalCuts = { -50, -86, -83, 1, 57, -24, 81, 58, -65, 40, -46, 86, -49, -60, -71, 10, 33, -61, 43, -73, -29, -62, -76, -74, 13, -87, 16, -17, 12, -66, 83, -32, -40, 66, 63, 64, 69, 53, 35, 76, 67, 73, -30, -42, 56, -54, 80, -80, 38, 21 };
    int[] verticalCuts = { 62, 51, -2, -40, 12, -14, 3, -36, -58, 13, -37, 21, -35, -25, -41, 59, 48, -80, 86, -7, 15, 70, 35, 66, -27, -22, -79, -32, -78, 52, -66, 49, 78, -46, -71, -26, 5, -39, -56, -63, 88, 34, -51, 33, 85, -34, -21, -10, 89, -11 };
    assertEquals(2392, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case90() {
    int cakeLength = 38;
    int holeLength = 20;
    int[] horizontalCuts = { 26, -25, -29, -24, -6, 25, 36, 24, -1 };
    int[] verticalCuts = { -33, 36, -2, 4, -4, -1, 7, -20, 3 };
    assertEquals(94, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case91() {
    int cakeLength = 76;
    int holeLength = 41;
    int[] horizontalCuts = { 30, 70, 33, -19, 25, 50, -55, -16, -47, -59, 23, -23, 34, 42, 60, 13, 72, 66, 61, -46, -66, -13, -68, -3, 11, 64, -48, -18, -12, 39, 38, -61, -4, 59, 28, -43, 31, -30, -62, -8, 29, 62, -70, -20, -17, 46, -54, -21, 21, -60 };
    int[] verticalCuts = { -22, 48, -69, 61, 8, 46, 67, -7, -42, -66, -45, -60, 49, 24, -14, 27, 16, 0, -70, 66, -8, 21, -33, -73, -36, -44, 51, -15, 56, -56, 29, 73, 15, -53, -2, -61, -9, 7, 68, -62, 12, -27, -54, 2, 28, -13, -25, -28, -52, -74 };
    assertEquals(2001, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case92() {
    int cakeLength = 62;
    int holeLength = 23;
    int[] horizontalCuts = { -36, 41, 46, 39, -43, -14, 59, 1, -16, 58, -23, -35, -7, -38, 22, -11, 42, -51, 24, -50, 14, 48, 37, 20, -54, -59, -53, 36, -55, -57, -28, -20, 21, 33, -47, 47, 29, -22, 49, 25, 9, -42, 15, -6, -15, 57, 30, -37, 56, 6 };
    int[] verticalCuts = { -23, 0, 14, 57, -55, 54, 42, 37, -58, -45, -8, 27, -61, -47, 34, 49, -15, 61, 36, 55, 12, 2, -12, -52, 25, -40, -46, 30, 35, 31, -43, -13, 58, -11, -54, -28, -19, 47, -60, -10, 45, 48, -31, 19, 18, 39, 33, 10, -50, -21 };
    assertEquals(2361, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case93() {
    int cakeLength = 57;
    int holeLength = 14;
    int[] horizontalCuts = { -6, 22, -26, 8, 54, -42 };
    int[] verticalCuts = { 21, 51, -48, 46, -5, 20 };
    assertEquals(49, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case94() {
    int cakeLength = 57;
    int holeLength = 2;
    int[] horizontalCuts = { -38, 4, -33, -20, 11, 35, 10, 26, 43, 3, -51, -14, 46, 15, -11, -25, 27, -46, -40, 28, -12, 5, 55, -34, 37, 9, -54, 17, -48, 38, -45, 1, -18, -9, 16, -30, 7, -39, -55, -36 };
    int[] verticalCuts = { -23, 16, -17, -27, -35, -29, 42, 46, -49, 25, 54, 34, 56, -37, 48, -7, -41, -1, -52, -43, -13, 33, -25, 50, 11, -47, -18, 31, -12, 53, 17, 27, -44, 22, 24, 38, -21, 21, 6, 12 };
    assertEquals(1681, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case95() {
    int cakeLength = 83;
    int holeLength = 10;
    int[] horizontalCuts = { -73, -51, 82, 16, -29, -10, 36, 41, -39, 13, -36, -64, -74, -49, 46, 56, -48, 6, 5, -41, -47, 64, -37, 18, 14, 78, -15, 33, -7, 59, 75, 81, 4, -31, -62, -20, 11, -65, -42, 45, -46, -23, 65, -72, 70, -56, 68, 80, 37, 25 };
    int[] verticalCuts = { -2, 81, 78, -62, -77, 11, 22, 68, 29, 31, -8, -35, -1, -52, 4, -32, -18, -48, 62, 76, 63, 45, 5, -28, 16, -57, 30, 27, -72, -60, -81, 49, -64, -75, -4, -46, -68, 7, 33, 18, -10, -74, -27, -43, -26, -61, 77, 47, -45, -36 };
    assertEquals(2573, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case96() {
    int cakeLength = 94;
    int holeLength = 2;
    int[] horizontalCuts = { -70, -36, -43, -86, 78, 75, -73, -54, 80, 27 };
    int[] verticalCuts = { -11, -69, -60, 67, -5, 19, 73, -65, 1, 91 };
    assertEquals(121, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case97() {
    int cakeLength = 73;
    int holeLength = 17;
    int[] horizontalCuts = { -65, -23, -48, 56, -14, -13, -41, 65, -33, -46, -34, -37, 45, -54, 67, -3, 25, -47, -45, -49, 5, -4, -15, -39, 49, 8, 11, 54, 0, 24, -1, 18, -36, 36, -40, 17, -12, 59, -55, 16, -38, 31, -43, -24, 63, 37, -29, 1, -9, -56 };
    int[] verticalCuts = { 46, 47, -31, -60, -13, -3, 72, -52, 7, 70, -23, -19, 34, 21, -36, -41, -14, -67, -64, 13, -37, -58, 48, 65, 32, 42, -7, 1, -9, -21, 26, 23, 67, -68, -59, 58, -28, 51, -48, -45, 18, -47, 54, 28, -27, -16, 30, -70, -62, 11 };
    assertEquals(2475, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case98() {
    int cakeLength = 83;
    int holeLength = 52;
    int[] horizontalCuts = { -24, -37, -28, 46, 61, 54, 58, 77, 59, -11, 74, -38, 2, -68, 60, -65, -80, 44, -35, 15, -74, 12, -71, -3, 10, -62, -15, -22, -31, 3, -44, 8, -36, 66, -2, 35, 34, 13, 41, -48, 22, 24, 1, 5, -43, -1, 69 };
    int[] verticalCuts = { -47, -22, 54, 77, 27, 29, -31, -67, 51, 69, 31, -3, 2, -45, -9, 40, -57, -41, 3, -30, 35, -46, -23, 72, 6, -64, 48, -62, 41, -36, 38, 52, 74, -40, -20, -77, 28, 70, -4, -59, 71, 62, -42, -49, -76, -82, 45 };
    assertEquals(1374, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case99() {
    int cakeLength = 40;
    int holeLength = 22;
    int[] horizontalCuts = { 17, 12, 33, -23, -19, -11, -28, 8, 29, 15, -22, -37, 9, 6, -18, -7, 14, -12, -31, 19, 30, 26, 3, -39, -24, 32, -29, -17, -15, 28, 10, -35, -30, -21, 18, -5, 37, 1, 0, -34, -3, 11, -14, -38, 39 };
    int[] verticalCuts = { -35, -1, -31, -27, -33, 17, -14, 27, -29, -11, 25, -32, 34, 23, 13, 29, -17, -24, 22, 38, 16, 3, 9, 21, -2, -6, 35, 7, 4, 15, -21, -4, -38, 36, 37, 5, -36, 12, 10, -30, 24, 33, 39, -39, -16 };
    assertEquals(1591, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case100() {
    int cakeLength = 66;
    int holeLength = 45;
    int[] horizontalCuts = { -47, 24, 35, 55, 65, -60, -43, -31, -57, 6, -27, 39, 26, 50, 9, -17, -63, -56, 36, -51, -62, -24, 45, -48, 28, 47, -3, 31, -59, -44, 44, -35, -49, 2, 62, 5, -54, 1, 52, 11, -45, 60, -12, 0, -64, -6, 61, 41, -22, -7 };
    int[] verticalCuts = { 16, 28, -11, 51, -23, -33, -17, -14, 59, 37, -28, -13, -37, -38, -10, 12, -53, -46, 42, -42, 60, -52, 15, -9, 41, 34, -54, 38, 45, 54, 5, -50, -57, 31, 1, 24, 29, 65, 17, 35, -25, -15, 19, -12, -36, -3, 33, -35, 56, -7 };
    assertEquals(1528, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case101() {
    int cakeLength = 10;
    int holeLength = 7;
    int[] horizontalCuts = { -7, 6, 4, 5, -3, -2, 0, 3 };
    int[] verticalCuts = { 6, -2, 8, 4, 3, -8, 7, 1 };
    assertEquals(46, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case102() {
    int cakeLength = 33;
    int holeLength = 21;
    int[] horizontalCuts = { 25, 9, 20, 8, 23, 3, -22, 4, -18, 31, 26, 19, -6, -11, -1, -17, -5, 0, -19, 21, -14, -28, 16, -23, -20, 29, 32, 18, -12, 24, 10, 22, -13, -29, -7, -30, -10, -25, 5, 6, 7, -24, 12, 2, -8, 13, -31, -2, 17, -27 };
    int[] verticalCuts = { -23, -14, -21, -12, 19, 15, 32, -28, -25, -22, 12, 10, 29, 25, 23, 0, -1, -10, -18, 2, -6, 31, 24, 30, 1, 7, -5, -15, -24, -26, 13, -20, 8, 26, -32, -3, -13, -17, 5, 21, -19, 18, 16, -4, 9, -11, -30, 20, -7, 6 };
    assertEquals(1545, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case103() {
    int cakeLength = 100;
    int holeLength = 83;
    int[] horizontalCuts = { 14, -19, -57, 12, 88, -47, -50, 74, -51, 20, 99, -99, -96, 71, -42, -76, -13, -9, -62, 11, 66, -86, -12, -84, -16, -72, 8, 21, 60, 13, 53, -23, 44, 50, -69, 5, -85, -14, 49, 37, -81, -67, -2, -26 };
    int[] verticalCuts = { -82, 58, 66, -58, -4, 26, -12, -19, -25, 35, -43, 53, -37, -60, -42, -33, -28, 37, 99, 64, -92, 90, -45, 85, -87, 88, 30, -90, 28, -91, 72, -34, -77, 49, 71, -65, -70, -47, 83, 36, -80, -97, 76, 87 };
    assertEquals(837, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case104() {
    int cakeLength = 59;
    int holeLength = 43;
    int[] horizontalCuts = { 34, 50, -28, 30, -41, -16, 17, 54, 45, 48, 32, -54, 6, -40, -53, 11, -8, 58, 56, 0, -38, -23, -10, -49, 33, 18, -12, -55, 39, -11, -9, -5, -24, 4, 40, 52, -39, 25, -4, -31, 44, -35, 38, 31, -27, -50, -17, -34, 28, 35 };
    int[] verticalCuts = { -39, -13, -27, 30, -37, -58, -38, 25, -10, 11, 28, 53, -45, -49, 35, 22, -53, -23, 12, -1, 57, 32, 5, 4, -4, -35, -36, 40, 43, 13, 16, -14, 24, 39, 2, 52, 49, -24, -33, 26, 21, -16, 9, 7, 10, -20, 50, 34, -44, -51 };
    assertEquals(1233, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case105() {
    int cakeLength = 77;
    int holeLength = 56;
    int[] horizontalCuts = { 4, 8, 59, 32, -71, -69, 51, 7, -31, -12, 36, -29, 16, -47, 54, -38, -57, -9, -75, 20, -35, -32, 17, 74, -8, -11, -16, 56, 0, -48, 47, -17, 11, -73, -43, 37, 58, -2, -56 };
    int[] verticalCuts = { 35, 21, -67, 40, 27, 59, 65, -28, 7, -19, -44, -74, 69, -70, 76, 16, 31, -54, -5, -75, 18, -2, 10, -10, -11, -9, -1, 11, 48, -51, 9, 34, -64, -18, -40, -26, -46, -53, 62 };
    assertEquals(760, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case106() {
    int cakeLength = 27;
    int holeLength = 7;
    int[] horizontalCuts = { -8, -21, -14, -13, 4, 11, -24, -20, 12, 14, 26, -12, 13, -26, -11, 2, -19, -6, -15, 25, -17, 24, 22, -22, 7, -5 };
    int[] verticalCuts = { 4, -9, 6, -20, -22, 0, 1, 25, 16, -2, 26, -25, -12, 2, -10, -5, 20, -16, 18, 17, 12, 22, 9, 21, -23, 13 };
    assertEquals(705, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case107() {
    int cakeLength = 85;
    int holeLength = 55;
    int[] horizontalCuts = { 16, 35, -36, -80, -18, -2, 56, -37 };
    int[] verticalCuts = { 68, -68, 20, 47, 75, 19, -70, -74 };
    assertEquals(71, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case108() {
    int cakeLength = 58;
    int holeLength = 16;
    int[] horizontalCuts = { -31, 40 };
    int[] verticalCuts = { 8, 13 };
    assertEquals(10, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case109() {
    int cakeLength = 57;
    int holeLength = 22;
    int[] horizontalCuts = { -4, 13, 25, -32, -28, 20, 43, -12, 42, -34, 12, -9, 14, -2, -56, 17, -33, 10, 2, -16, -46, 15, -50, 33, 16, 6, 44, -29, 11, 32, -53, -31, -39, -44, 24, -14, -30, 31, 54, 5, 35, 49, 52, 56, 30, -5, -37, 9, 4, 7 };
    int[] verticalCuts = { 42, -27, 55, 51, -23, 21, -1, 26, -49, 3, -4, -22, 33, -17, 31, 9, 18, 17, -24, 52, 25, 35, -45, 45, -25, -56, -6, -29, 53, 37, -7, -41, 5, 14, 41, -16, -3, -18, -48, 0, -20, -44, 49, 48, 56, -10, 7, -36, -33, -46 };
    assertEquals(2202, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case110() {
    int cakeLength = 100;
    int holeLength = 6;
    int[] horizontalCuts = { 92, -66, 76, 24, 66, -87, -8, -85, -89, -88, 18, -74, -91, -97, -15, 73, -46, -13, -38, -70, -20, -61, -65, 83, 43, -83, 68, -35, 74, -96, -63, 59, -81, 39, 46, 90, 82, 25, -54, 56, -12, -4, 9, -2, -75, 75, -53, 57, -84, 85 };
    int[] verticalCuts = { -30, -50, -89, -71, 20, 69, -48, 68, 34, -95, -36, 18, -76, 40, 30, -68, 36, -17, 46, 24, 53, -99, -41, -45, -10, -72, -92, 11, 49, 13, 85, 22, 99, 80, -70, -47, 52, 95, -60, -78, -8, 2, 6, -7, -44, -25, -22, 17, 3, -56 };
    assertEquals(2599, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case111() {
    int cakeLength = 58;
    int holeLength = 22;
    int[] horizontalCuts = { 32, 37, -35, 48, -9, 25, -45, 27, 55, -8, 51, -53, 57, -51, -14, -5, -41, 49, -12, -4, -54, 4, 44, 1, 45, 54, -49, 10, 28, -1, 2, 5, -48, 26, -26, -18, -21, 23, -31, -28, -36, 50, 24, -56, -11, -27, 9, 17, 36, 31 };
    int[] verticalCuts = { 46, 3, -49, -20, 15, 37, -37, -40, -8, -24, 41, -46, 45, -36, -2, 25, 18, -11, -15, 23, -57, 1, 52, 22, 20, 8, 0, 11, 38, -10, 27, 6, -19, -23, -29, -42, 9, 16, -4, -33, -52, 5, -43, -6, -1, 4, 10, 53, -17, 7 };
    assertEquals(2185, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case112() {
    int cakeLength = 29;
    int holeLength = 15;
    int[] horizontalCuts = { -25, 17, -13, -24, 13, 24, 11, -21, 23, 8, -27, -1, 10, -16 };
    int[] verticalCuts = { -15, -25, 16, 15, -10, 5, 25, 11, -1, 3, -27, -28, 8, 21 };
    assertEquals(190, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case113() {
    int cakeLength = 11;
    int holeLength = 9;
    int[] horizontalCuts = { 9, 1, 4, 7 };
    int[] verticalCuts = { -9, 3, -2, 5 };
    assertEquals(16, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case114() {
    int cakeLength = 80;
    int holeLength = 65;
    int[] horizontalCuts = { -14, 33, 48, 72, 16, -72, -17, -39, 54, 49, 57, 77, -54, -34, -7, 0, -23, 56, 67, -49, -13, 19, -9, 68, 74, 23, -78, -37, -65, 63, 41, -19, -36, 60, -48, 47, 34, -15, -76, 31, -59, -3, 59, 32, 15, -20, -77, 52, 43, 6 };
    int[] verticalCuts = { -73, 78, 28, -33, 0, 2, 75, 39, -72, -55, -68, 6, -66, -12, -5, 30, 45, -63, 22, 13, 42, -62, 3, 53, 27, -4, 25, -1, -7, 12, -3, -57, 79, -59, -24, -75, 19, 50, 56, 44, -67, 67, 63, -65, -8, 34, 62, 72, 49, -15 };
    assertEquals(1081, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case115() {
    int cakeLength = 85;
    int holeLength = 41;
    int[] horizontalCuts = { 0, 38, -39, 17, -9, 74, 83, -56, -63, -40, -27, 19, 49, 77, -67, 79, 71, -83, -29, 10, -64, -79, -68, -4, -65, -25, -59, -80, 73, 16, 84, -66, 69, -22, -12, 47, -24, -42, 44, -49, 14, 78, 57, 11, 80, -58, -19, 32, 43, -32 };
    int[] verticalCuts = { 69, -78, -62, 48, -80, -58, -77, -22, -61, 41, 68, -70, -81, 59, 27, 32, -48, -40, -35, 10, -74, 7, -44, 0, -13, -65, 25, 83, 3, 35, 42, -17, 54, 22, -3, -10, -79, -75, -50, -53, 39, 70, 74, 58, -12, -64, 76, -82, 31, -28 };
    assertEquals(2201, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case116() {
    int cakeLength = 30;
    int holeLength = 9;
    int[] horizontalCuts = { 12, -10, -28, 29, -14, -19, -23, -6, 9, 0, 17, 27, 28, 21, 5, -11, 22, 25, 7, -16, -5, -22, -15, 14, 10, -8, -7, -1, 3, 6, -13, -9, 18, 19, -27 };
    int[] verticalCuts = { 12, 9, 23, -11, -18, -15, -13, 4, 15, 3, 21, -22, -1, 19, -4, 1, -8, 6, 27, 11, -24, -9, 28, -3, -16, -5, 17, 7, -21, 10, -25, 20, -17, -28, 24 };
    assertEquals(1175, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case117() {
    int cakeLength = 72;
    int holeLength = 44;
    int[] horizontalCuts = { 25, 37, -21, 6, 8, 10, -52, -48, -53, 31, 48, -35, -17, -64, 19, 65, 57, -67, 39, 46, 58, 23, -28, -30, 49, 41, -20, 54, -23, -18 };
    int[] verticalCuts = { -37, 8, -50, 21, 12, -24, -53, 71, 54, 55, -32, -56, 50, 23, -3, 46, -65, 22, 16, -9, 5, -38, -49, -25, 62, 29, 2, -48, 27, 58 };
    assertEquals(689, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case118() {
    int cakeLength = 50;
    int holeLength = 26;
    int[] horizontalCuts = { -29, 45, 44, 27, -36, -4, 0, -11, -32, 38, -42, 18, -25, 13, -35, -26, -3, -46, -12, 21, -31, 33, 19, 2, -38, 47, -19, -17, 42, 48, -1, -44, 37, 14, -48, -49 };
    int[] verticalCuts = { -43, -14, 42, -42, 12, 32, -13, 6, -2, -35, -37, 31, 44, -40, 5, -15, -25, -48, 13, -21, -23, 40, 14, -24, 3, -7, 9, 29, 2, 11, 27, -27, 33, -28, 15, 23 };
    assertEquals(1084, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case119() {
    int cakeLength = 100;
    int holeLength = 28;
    int[] horizontalCuts = { 71, 19, 73, 70, 74, -45, 97, 50, -14, -61, -77, -94, -6, 16, -26, -52, -80, 98, -40, -54, 63, -20, -84, 72, 67, -99, -50, 4, -38, -71, 42, -41, 68, 92, 60, 13, 8, -4, -79, 32, 69, -31, -23, -72, 84, -88, 56, 62, -1, -73 };
    int[] verticalCuts = { -86, 39, 54, 20, -11, 83, 4, 46, 19, -35, 63, 75, -95, -54, -38, 49, 77, 16, -28, 85, -18, 92, -77, -88, 80, 58, -85, 21, -32, -42, -16, 5, -87, 66, 27, 25, -43, -53, -40, 3, 26, 38, -81, 89, 59, 64, -90, 29, -46, 24 };
    assertEquals(2447, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case120() {
    int cakeLength = 64;
    int holeLength = 48;
    int[] horizontalCuts = { 23, 7, 14, -48, 38, 51, 60, -50, -35, 53, -54, 49, 58, 15, 41, -57, -37, -36, 18, 37, -56, 2, 33, -60, -62, -12, -15, -7, 56, -52, -59, 0, -14, -46, -42, 25, -24, -13, -31, -3, 26, 1, 17, 10, 52, -32, -22, -4, 61, 8 };
    int[] verticalCuts = { -27, -49, 5, 7, 17, 29, -2, 61, 37, -30, -23, 8, -15, 51, -54, 56, 0, -58, -42, -10, -56, -41, -16, 59, -40, -36, 57, -60, -61, -62, 1, 45, -48, 40, 24, -50, -53, 39, 60, -18, 50, -13, -51, -17, -47, -1, -44, 20, 4, -12 };
    assertEquals(1545, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case121() {
    int cakeLength = 85;
    int holeLength = 58;
    int[] horizontalCuts = { -54, -23, -9, 60, 0, 64, 69, -73, -13, -42, 10, 25, -67, 56, 53, -17, -8, -62, 54, -53, 37 };
    int[] verticalCuts = { 30, 44, -27, 1, -47, -58, 82, -71, -55, -30, -37, -51, -43, 14, -84, 18, -79, -22, 60, 57, -67 };
    assertEquals(288, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case122() {
    int cakeLength = 97;
    int holeLength = 56;
    int[] horizontalCuts = { -41, -61, 20, 25, 30, -84, 2, -4, 53, 5, -39, -22, -6, -36, -94, -56, -14, 7, -89, -19, 94, -90, 57, 90, -38, -86, -2, 84, 74, 69, 51, 93, 95, -40, -85, 65, 80, -20, -8, 22, 67, -73, -47, -24, 23, -25, 40, -78, 19, 49 };
    int[] verticalCuts = { -92, 68, 85, -19, -60, -5, 89, -41, -87, -4, -94, 90, -40, 88, -2, -36, 81, 8, 70, 31, -85, 45, -90, 60, 79, 74, -49, 6, 86, 51, -1, 80, 2, 77, 93, -23, -37, 21, 65, -86, -77, 23, -67, 16, -65, -7, -73, 75, -82, 28 };
    assertEquals(1992, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case123() {
    int cakeLength = 95;
    int holeLength = 64;
    int[] horizontalCuts = { -83, 23, -42, 80, -78, -46, 4, 20, 60, 43, 5, -82, 52, 48, -47, 14, 85, -92, 19, 22, 69, -19, 88, 70, 78, -8, 82, -91, -87, 10, -49, 21, 57, -52, 59, -54, -66, -7, -74, 91, 39, -64, -9, -68, 89, -39, -79, -62, 27, 13 };
    int[] verticalCuts = { -63, 8, 19, -38, 38, 21, 52, 93, 31, 60, -85, 13, -53, -88, 59, -75, 30, 68, 28, -36, 53, -94, 3, 12, 4, 77, -59, 80, -49, -37, 81, 56, 79, -70, -74, -91, -50, 71, 15, 24, -79, -54, -18, -12, 29, 51, -20, -19, 58, 88 };
    assertEquals(1611, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case124() {
    int cakeLength = 36;
    int holeLength = 22;
    int[] horizontalCuts = { 3, -19, -12, -11 };
    int[] verticalCuts = { 15, 0, 2, 9 };
    assertEquals(16, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case125() {
    int cakeLength = 43;
    int holeLength = 40;
    int[] horizontalCuts = { -21, -39, 9, 5, 38, -32, -12, 31, 6, -33, 16, 23, -38, -35, -19, 1, -40, -7, 28, -20, 36, -30, 22, -17, -2, 17, 11, 41, -29, -22, -24, 35, -13, 2, -25, 42 };
    int[] verticalCuts = { -29, -31, -10, -18, -26, 33, -24, 16, 30, 17, 5, 39, 22, -13, 7, 8, -38, 24, 4, 0, -42, 34, 42, -14, 35, -9, -16, 11, -34, -5, 32, 19, 41, 23, -17, -33 };
    assertEquals(313, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case126() {
    int cakeLength = 19;
    int holeLength = 3;
    int[] horizontalCuts = { -9, 2, 3, -13 };
    int[] verticalCuts = { -11, 16, 7, 1 };
    assertEquals(25, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case127() {
    int cakeLength = 59;
    int holeLength = 26;
    int[] horizontalCuts = { 30, 56, 9, 42, 36, -55, 35, 19, -47, -52, -13, 29, -44, -15, -31, -24, 14, 23, -38, 57, -20, -21, 48, -19, -41, -45, 37, -17, 50, -46, 5, -54, 49, 1, 17, -56, 6, 51, 27, 21, 22, 7, -42, -35, 24, -14, 3, 47, -58, -18 };
    int[] verticalCuts = { 46, -26, 9, -52, 10, 1, -29, 21, -18, 0, -58, 54, 37, 25, 53, 23, 7, -30, 48, 12, -43, -44, 20, 11, -41, -8, 19, -15, -45, -17, 15, -2, -21, 18, -12, 58, 17, 14, 49, -55, 43, -46, -37, -35, 2, -6, -22, 3, 40, -4 };
    assertEquals(2013, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case128() {
    int cakeLength = 23;
    int holeLength = 16;
    int[] horizontalCuts = { -10, 12, -19, -7, 2, -8, 22, -22, 14, 16, -20, -21, -16, 21, -6, 13, 10, -11, 6, 19 };
    int[] verticalCuts = { -15, 22, -17, -1, 2, -16, 4, 9, 19, -8, 0, -9, 5, 10, -19, 11, 13, -12, 6, 17 };
    assertEquals(273, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case129() {
    int cakeLength = 100;
    int holeLength = 99;
    int[] horizontalCuts = { 99, -99 };
    int[] verticalCuts = { 50 };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case130() {
    int cakeLength = 23;
    int holeLength = 11;
    int[] horizontalCuts = { -11, 11, 5 };
    int[] verticalCuts = { 11, -11 };
    assertEquals(10, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case131() {
    int cakeLength = 50;
    int holeLength = 43;
    int[] horizontalCuts = { 0 };
    int[] verticalCuts = { -43 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case132() {
    int cakeLength = 33;
    int holeLength = 21;
    int[] horizontalCuts = { 21, -21 };
    int[] verticalCuts = { 32, -27 };
    assertEquals(10, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case133() {
    int cakeLength = 89;
    int holeLength = 34;
    int[] horizontalCuts = { 35, -35 };
    int[] verticalCuts = { 77, 0, 34, -33, -76 };
    assertEquals(20, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case134() {
    int cakeLength = 87;
    int holeLength = 35;
    int[] horizontalCuts = { -20, -41, 41, 84, 71, -72, -52, 13, 19, -30, -75, 39, -7, 14, 10, -44, -85, 38, -6, 61, -79, -10, 53, -76, -65, 80, -48, 26, -86, 73, 16, 83, -9, -63, -60, -37, -32, -81, -84, 45, 21, -70, 9, 1, -33, -24, -46, -39, -8, -21 };
    int[] verticalCuts = { -50, -29, 56, -17, -59, 42, -86, 2, -31, 44, -14, 74, -34, -64, 32, -40, 60, 19, 79, -61, 12, -37, -72, -10, -19, 63, 21, 54, -43, 61, -60, -27, 8, 5, 51, -42, 24, 29, 69, 59, 26, -70, 36, -24, 31, 83, 77, -21, -5, 40 };
    assertEquals(2202, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case135() {
    int cakeLength = 12;
    int holeLength = 9;
    int[] horizontalCuts = { 9, 2, -4, 4, -8, -7, 7, 11, -10, 8, 3, -2, 1 };
    int[] verticalCuts = { 5, 1, -2, 11, -8, 6, -9, 4, 10, -7, -6, -1, 0 };
    assertEquals(96, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case136() {
    int cakeLength = 83;
    int holeLength = 66;
    int[] horizontalCuts = { -49, 10, 81, -68, 72, -28, 15, -13, 23, 1, -29, -4, -1, 41, -18, 17, 61, -24, -39, 45, -12, -79, 35, -81, -70, -72, 56, -5, 26, -8, -9, -43, 46, -75, -14, 18, 32, -15, 54, -20, 4, -22, 22, 40, 66, 70, 75, 73, -61, -46 };
    int[] verticalCuts = { -81, 21, -2, 29, -1, 17, 48, 40, -77, 66, 65, 8, 25, -42, 26, 34, -29, 44, -12, 12, -52, 73, -56, -62, -17, 19, 1, -54, -9, -43, -76, -45, 69, -73, 82, -59, -40, -48, 64, -72, -63, 31, -70, -82, -57, -3, 70, -20, 23, 75 };
    assertEquals(1195, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case137() {
    int cakeLength = 53;
    int holeLength = 18;
    int[] horizontalCuts = { -26, -24, 40, -51, 17, 24, 1, -43, 35, 19, -19, 44, -16, -42, 50, -10, 2, 4, -45, -22, -48, 52, 49, 38, -31, 39, 28, 43, 14, -28, -39, -17, -12, 27, 20, 25, -35, 12, 33, 32, -4, 48, -21, 21, -11, -30, -8, -40, -33, -47 };
    int[] verticalCuts = { 51, 27, -26, 18, -16, 13, 19, -4, 10, -38, 47, 11, 28, -41, -39, -36, -30, 7, 0, -5, 6, -22, 43, -48, -24, -29, 5, -13, -12, 3, 45, 17, -28, -44, 44, 1, -8, -20, -51, 36, -46, -11, -40, 48, -37, -10, 24, -18, 2, -19 };
    assertEquals(2361, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case138() {
    int cakeLength = 42;
    int holeLength = 24;
    int[] horizontalCuts = { -39, 18, -9, 6, 37, -5, 29, -16, -23, 39, 27, -10, 8, 10, -37, 21, 19, 23, -19, 13, 30, -32, 25, -18, 2, 40, -24, -15, 33, -14, -41, -28, -2, -29, 14, 3, 17, 41, 7, 9, -40, -27, 12, -34, -21, 24, 20, -4, 34 };
    int[] verticalCuts = { -35, -33, 31, -18, 4, 8, -36, -32, -17, 9, 41, 13, -7, -16, -39, 29, -24, -21, 17, -3, -23, 21, 10, 25, -31, -13, 30, 38, -12, 32, 36, 11, -2, -4, -38, -6, 34, -27, 2, -5, 40, -29, 3, 12, -15, 7, 14, 6, -20 };
    assertEquals(1659, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case139() {
    int cakeLength = 89;
    int holeLength = 76;
    int[] horizontalCuts = { 56, 10, -22, 40, -84, -76, 73, 87, -69, 85, -47, -79, -40, -86, 6, 26, -60, -19, 70, -25, -48, -58, -4, -17, -75, -15, -5, 55, 1, 76, 67, 53, -52, -74, -27, -65, -71, -70, -11, -42, -38, 21, -72, 0, 12, 84, 42, -6, -29, 16 };
    int[] verticalCuts = { -79, 33, 27, -25, -4, 63, 13, 11, 61, -18, -37, 24, -23, 49, 38, -5, -83, 79, -59, -20, -58, -47, -30, -57, 77, 1, -64, 88, -3, 15, -34, -78, 16, 40, -85, 36, -31, -17, -16, -13, 41, -86, 60, 85, -48, -9, 22, -81, -74, -60 };
    assertEquals(924, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case140() {
    int cakeLength = 87;
    int holeLength = 18;
    int[] horizontalCuts = { -19, 13, 29, -21, -83, -36, -71, 5, -64, -84, 14, -67, -70, -76, 1, 32, 30, -79, -40, -86, 18, 76, 21, 9, 35, -38, 71, 63, 45, 54, -80, 27, -4, -5, -7, 65, 48, 11, 73, -45, -72, 82, 41, 69, -30, -54, -59, 68, -16, 42 };
    int[] verticalCuts = { 40, -24, 13, 65, -23, 23, -2, -34, 54, 82, 51, 60, 33, -70, -74, 18, -29, -6, 44, 41, 74, -51, -18, 55, 4, -61, -39, 5, -71, -8, -47, -45, 64, 21, 68, -19, 63, -75, 76, 9, -17, -26, 14, 59, -76, -44, -63, 25, -84, 62 };
    assertEquals(2501, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case141() {
    int cakeLength = 86;
    int holeLength = 45;
    int[] horizontalCuts = { -11, -14, 64, -32, 77, -34, -6, 48, 36, 42, 32, -69, -25, 27, 70, -4, -15, -31, 8, 50, -56, -10, 44, 63, 72, 2, 0, 25, -72, -83, -8, -2, 3, -76, -22, -36, 16, 17, 30, 73, 47, -28, 6, -21, 33, -51, -57, 83, 35, 52 };
    int[] verticalCuts = { -71, -2, 30, 52, 61, 75, -55, 12, -68, -61, 40, 85, 57, -38, -41, 46, -23, -29, 72, 68, 23, -18, -7, -46, 81, 38, 71, -30, -11, 8, -78, -40, 83, 69, -13, -50, 65, 49, 31, -73, 22, -75, -60, -20, -39, 27, -56, -21, 20, -19 };
    assertEquals(1857, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case142() {
    int cakeLength = 81;
    int holeLength = 45;
    int[] horizontalCuts = { 76, 64, -59, 19, 6, -23, -26, -20, 52, 29, -54, 22, 57, -38, 18, 5, 72, 36, -69, -64, 12, -24, -14, 54, 71, 47, 3, -48, -29, 11, 74, 70, -1, 27, -44, -70, -47, -32, -51, 51, 1, 45, 61, -13, 8, 55, 13, -58, -6, 42 };
    int[] verticalCuts = { -34, 64, -55, -73, 61, 42, 38, -77, 48, 57, -47, 43, 3, -62, -50, -69, 16, -33, -53, 65, -35, 70, 41, 77, 60, -3, -48, -51, -23, -26, -5, -30, 21, -49, -59, -28, -41, -80, -79, -10, 66, -9, -58, -29, 12, -32, -8, 23, -65, 11 };
    assertEquals(1953, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case143() {
    int cakeLength = 16;
    int holeLength = 10;
    int[] horizontalCuts = { -12, 14, -8, 0, -15, 8, 7, -14, -4, 10, -5, 11, 13, -7, -1, 4, 9, 15, 3, -11, -10, 1, 6, -2, 5, -3, -6 };
    int[] verticalCuts = { 10, 3, -2, 13, -9, 5, 1, 11, -13, -3, 6, -15, 4, 0, 14, -12, -6, -11, -14, 8, -5, 7, -8, -1, 9, 2, -4 };
    assertEquals(460, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case144() {
    int cakeLength = 83;
    int holeLength = 39;
    int[] horizontalCuts = { 29, -82, -64, 28, -7, 15, -39, 34, -32, 30, 50, 78, 40, 61, 33, 80, -31, 5, 23, -33, 27, -77, -55, 73, 10, -40, -49, -63, 74, -6, 76, 67, 56, -35, 45, -22, -24, -50, 70, -16, -79, 72, -37, -12, -57, 20, 13, -60, -67, -52 };
    int[] verticalCuts = { -66, 5, 16, -18, -60, 22, 26, -8, -21, -44, -34, 39, 29, -50, 6, 4, -1, -74, 69, -26, 31, 80, 82, -4, -69, 10, 35, -72, 7, -56, -10, -48, -40, -9, 62, 68, 49, 60, 15, 24, 75, 52, 34, -61, -14, -16, 63, 56, -29, -77 };
    assertEquals(2003, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case145() {
    int cakeLength = 59;
    int holeLength = 35;
    int[] horizontalCuts = { 21, 14, -35, 19, -28, 34, -23, 49, -58, -33, 40, -44, 24, -34, -21, 47, 13, -37, 28, -56, -32, -9, 56, 8, -50, 27, -43, 33, -13, -1, 29, 46, 7, 30, 18, 15, 50, 44, -48, -55, -15, 53, 54, 11, -11, -14, 41, -18, 45, -26 };
    int[] verticalCuts = { -15, 25, -48, 42, 58, 18, -1, -38, -57, -22, -50, 44, -2, 13, 50, -51, -5, -7, -18, 15, -14, 19, -24, -33, 20, 26, 55, -32, -26, -27, 34, -9, -52, 41, -23, -34, -12, -25, 2, -20, -4, 51, -35, -28, 45, -30, 57, -17, 52, 0 };
    assertEquals(1611, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case146() {
    int cakeLength = 63;
    int holeLength = 54;
    int[] horizontalCuts = { -23, -22, 8, 15, 45, -50, -33 };
    int[] verticalCuts = { -34, 45, 16, 48, 51, -22, -31 };
    assertEquals(28, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case147() {
    int cakeLength = 53;
    int holeLength = 28;
    int[] horizontalCuts = { 1, 44, -38, 42, -16, -51, -34, -7 };
    int[] verticalCuts = { -26, -24, -21, -30, -25, -37, 6, -1 };
    assertEquals(71, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case148() {
    int cakeLength = 60;
    int holeLength = 29;
    int[] horizontalCuts = { 33, 46, 5 };
    int[] verticalCuts = { 49, -51, 33 };
    assertEquals(16, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case149() {
    int cakeLength = 30;
    int holeLength = 3;
    int[] horizontalCuts = { 21, -23, -11, 14, 26, 28, 5, -3, 3, -6, -2, -19, 23, 8, -8, -14, 9, 0, -15, 11, 10, -13, -16, -12, -27, 2, -5, -18, -20 };
    int[] verticalCuts = { 17, 5, 1, -7, -14, 13, 26, 2, 23, -27, -19, 19, -20, -1, 18, -13, 14, 25, -28, 4, -22, 15, 7, -16, 28, 29, 6, -4, -17 };
    assertEquals(892, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case150() {
    int cakeLength = 34;
    int holeLength = 22;
    int[] horizontalCuts = { 1, 12, -6, -10, 19, -15, 7, -23, 16, -28, 4, -4, 17, -14, 14, -13, -21, 6, -18, 24, 10, -31, 11, 25, -7, 2, 9, -1, -16, -12, -25, 31, 0, -26, -3, 22, -32, -24, 15, 29, 13, 3, 28, -33, -27 };
    int[] verticalCuts = { -23, 25, 18, -18, 10, 17, 27, -7, -12, 16, 29, 2, -10, 30, 0, -3, -33, 13, -29, -28, -32, -16, -2, 33, -1, 8, 19, 24, 5, -27, -8, -30, 32, -6, 3, 23, -14, 12, 4, 7, -4, 22, 6, 31, -20 };
    assertEquals(1276, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case151() {
    int cakeLength = 82;
    int holeLength = 62;
    int[] horizontalCuts = { 35, -20, -67, 34, -81, 54, -27, -9, -74, 32, -12, -76, -77, 77, 0, 5, 70, 67, -57, -47, -40, 28, 47, -55, 49, 6, 72, 64, 53, -14, -15, -38, 8, 3, -17, 25, -29, -35, 36, 1, -59, -61, -39, -8, -68, 44, -24, 65, 27, -66 };
    int[] verticalCuts = { 35, 31, 68, 8, 26, -14, 81, -16, -28, -45, 24, -25, 77, -30, 73, 38, 65, 29, -75, -41, -4, 11, 44, -77, 45, -31, -12, 19, -72, -24, 51, 61, -68, -54, -76, 69, -79, 30, 32, -65, 52, 70, 6, 7, 63, 1, -35, -26, 10, -51 };
    assertEquals(1377, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case152() {
    int cakeLength = 24;
    int holeLength = 19;
    int[] horizontalCuts = { 4, -17, 8, -3, -23, -5, -7, 17, 14, -9, -19, -22, -10, -13, 6, 15, 5, -2, 23, -20, 3, 11, 22, 21, -11, 18, -12, -18, 20, 7, 2, -4, -14, -6, 10, -8, 0, -21, 12, -15, 13, 1, 16, 9 };
    int[] verticalCuts = { -2, -19, 10, 14, 21, -4, -7, 1, -13, 9, 6, 19, 13, -3, 12, -20, -12, 18, 7, 11, 5, 16, -9, -21, 3, 22, -22, -14, -6, -1, -5, -18, -23, 17, 0, -10, 4, 8, -17, -15, -16, 15, 2, -11 };
    assertEquals(730, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case153() {
    int cakeLength = 93;
    int holeLength = 78;
    int[] horizontalCuts = { 45, 69, -59, -27, -86, 64, 3, 5, 88, 44, -11, -34, -30, 6, -22, -81, -56, -6, -91, -7, -51, 34, 70, -40, 22, 76, -87, -23, 75, 51, -32, -70, -62, -54, 57, 82, 74, 80, 11, -42, 2, -90, 79, -26, -78, 23, 8, -66, -19, -43 };
    int[] verticalCuts = { 39, 45, 33, -26, 21, 53, -36, -48, 10, 27, -21, 52, 46, -15, -6, -57, -18, -89, 87, 44, -52, 1, 73, -84, 72, -92, -71, -49, 4, -85, -13, -72, -37, 0, 61, 81, -40, -68, -5, 20, -81, 64, -80, 26, 25, -19, 80, -7, 50, -59 };
    assertEquals(1001, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case154() {
    int cakeLength = 68;
    int holeLength = 14;
    int[] horizontalCuts = { 67, -4, 43, 16, 22, 3, -51, 24, 63, -34, -45, 17, 7, 5, 34, -61, 18, -58, -7, 21, 47, 60, -38, 25, 38, -35, 45, -63, 10, 53, -14, -16, 29, -13, 8, -43, 4, -59, -52, -47, 32, 57, 58, -17, -50, -46, 11, 33, 48, 26 };
    int[] verticalCuts = { 3, 43, 54, -49, 20, -9, 31, -2, 23, 10, -5, -4, -35, -58, 58, 36, 50, -45, -57, 56, -54, -43, -13, -11, -3, -47, -42, -19, 18, 0, 67, -1, -29, -46, 55, -27, 61, 17, 12, 32, 15, -39, -53, -60, -38, 24, 57, -66, -41, 5 };
    assertEquals(2481, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case155() {
    int cakeLength = 96;
    int holeLength = 7;
    int[] horizontalCuts = { 71, -20, -42, 13, 57, -56, 54, -54, -52, -61, -90, 37, -28, 19, -43, -14, 85, 88, 30, -62, 36, 25, 69, -22, -53, -41, -34, -12, -8, 47, 95, -71, -25, 42, -44, 89, 61, -38, -39, -80, 0, -64, 16, -3, 41, -46, 5, 9, 2, 34 };
    int[] verticalCuts = { 53, 45, -10, 69, 71, 85, -15, -86, -70, -81, 20, 30, -77, -84, -55, 40, 35, -26, -68, 70, 12, -33, -72, -93, 59, -34, -82, 21, 2, -3, 81, 14, -89, 22, -65, -25, 54, -46, -75, 11, 48, -37, -78, -62, -9, -63, 89, -95, 47, 93 };
    assertEquals(2598, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case156() {
    int cakeLength = 17;
    int holeLength = 10;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case157() {
    int cakeLength = 60;
    int holeLength = 21;
    int[] horizontalCuts = { 23, 31, 15, 48, -34, 1, 46, 0, -27, 24, 56, 7, 13, 5, 10 };
    int[] verticalCuts = { 13, -20, 45, 40, 37, 21, 56, 32, -1, -47, -37, 55, 14, 48, -9 };
    assertEquals(226, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case158() {
    int cakeLength = 31;
    int holeLength = 5;
    int[] horizontalCuts = { 4, -18, 28, -24, -26, -29, 9, 0, 24, -20, 7, 26, 12, 2, -8, 22, -1, -7 };
    int[] verticalCuts = { 17, -25, 3, -9, -11, 7, -27, -2, 12, 11, 1, -15, 4, 9, -24, 18, -30, -18 };
    assertEquals(352, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case159() {
    int cakeLength = 59;
    int holeLength = 54;
    int[] horizontalCuts = { 55, -38, -41, 20, -39, 49, -33, -2, 41, 33, 44, 32, -18, 58, -40, 22, 8, 21, -45, 43, -9, 53, 2, 46, -31, 11, 51, -56, 31, 6, -6, -37, 15, -57, 42, 17, -43, 7, -24, 23, -7, 34, -3, 10, -58, -49, 29 };
    int[] verticalCuts = { 4, -39, -50, 33, 12, 26, -24, 8, -40, 37, -8, 52, -11, -54, 46, 32, 39, -2, 55, -19, 45, -47, -56, 7, 51, -29, -12, -28, 19, 20, -31, -49, 54, 48, 30, -37, -1, -21, 25, -14, 28, 44, -35, 57, 23, -45, 1 };
    assertEquals(541, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case160() {
    int cakeLength = 35;
    int holeLength = 18;
    int[] horizontalCuts = { 22, -10, -22, 13, -13, -27, -21, -14, -12, -24, -9, 14, -15, 12, -7, -4, 25, -8, -1, -32, 2, -3, 20, 23, 31, 32, -26, -20, 34, 24, 28, -23, 6, -5, -33, 16, -29, -16, 19, -25, -34, 17 };
    int[] verticalCuts = { 33, 0, -7, -17, 21, -14, 3, -25, -15, 31, -21, 7, -3, 5, -2, 28, 10, 17, -31, -34, -1, 4, 29, 32, 1, -13, 14, 15, 26, -26, -11, 34, 25, -29, 24, -33, -20, -10, -22, -30, 6, 16 };
    assertEquals(1450, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case161() {
    int cakeLength = 39;
    int holeLength = 21;
    int[] horizontalCuts = { -19, -33, -38, 24, -9, -31, -1, 11, 28, -16, 33, 7, -13, -34, 5, 2, 22, 1, -29, -10, 29, -12, 37, -32, 9, -24, 8, -36, 12, -6, 4, -23, -14, -7, 23, 15, 18, -37, -17, 14, 26, 3, -4, -21, 25, -3 };
    int[] verticalCuts = { -16, 4, -7, -24, 10, -28, -29, 30, 29, 7, 3, -21, 2, 38, -35, 24, 35, -12, 11, -6, 31, -13, -8, -22, -10, -19, -1, -31, 25, -32, -5, -36, 1, -4, 27, -37, -9, 6, -17, -30, 22, -11, -15, -2, 19, -3 };
    assertEquals(1533, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case162() {
    int cakeLength = 77;
    int holeLength = 41;
    int[] horizontalCuts = { 28, -59, 59, 3, 13, 43, -60, 38, 1, -12, 12, -6, 58 };
    int[] verticalCuts = { -69, 50, -70, 2, -50, 45, 30, 32, 57, 37, -67, -51, 17 };
    assertEquals(168, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case163() {
    int cakeLength = 33;
    int holeLength = 31;
    int[] horizontalCuts = { -25, 0, 6, -19, 10, 7, -21, -7, 21, 32, -26, 15, 1, -20, -30, 3, -4, 19, 2, 25, -18, 28 };
    int[] verticalCuts = { 30, 13, -23, -3, 4, 11, 26, -11, -20, 16, 25, 18, -25, -2, -21, 17, -1, 29, 9, 2, -14, -27 };
    assertEquals(109, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case164() {
    int cakeLength = 87;
    int holeLength = 1;
    int[] horizontalCuts = { 1, 0, 63, 72, -24, 29, -42, -17, -68, 31, -63, -55, 11, -70, -75, -77, 33, 3, -79, -48, -22, -54, -53, -85, 57, -8, -47, -25, -10, 16, 65, -44, 39, 46, -36, 13, -74, -16, 75, -29, -35, 78, -72, -56, -34, -46, 5, 6, -33, 58 };
    int[] verticalCuts = { 1, -1, 0, 36, 6, 71, 47, -62, -24, 32, -82, 15, 4, 39, 16, 86, 13, -2, -20, 44, 81, 57, -33, 52, -7, -78, 12, -43, -17, 11, -23, 22, 5, -49, 37, 72, -85, 56, 68, -30, -25, -34, 20, -37, -28, 26, -15, 78, -3, -6 };
    assertEquals(2599, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case165() {
    int cakeLength = 31;
    int holeLength = 1;
    int[] horizontalCuts = { -27, 19, 10, 0, 11, 22, -17, 25, 29, 6 };
    int[] verticalCuts = { -1, 0, 3, -16, -25, 27, 16, -12, 9, 2, 10, 11 };
    assertEquals(143, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case166() {
    int cakeLength = 43;
    int holeLength = 1;
    int[] horizontalCuts = { 4, -22, 5, 17, -28, -25, -39, -30, 14, 37, -9, -13, 32, 8, -17, -21, 3, -26, 34, -38, -7, -2, -5, 6, 30, 40, 18, -11, -36, 35, -40, 38, -32, -15, -20, 33, 15, 7, -41, -14, -31, 42, 26, -6, -34, -1, -18 };
    int[] verticalCuts = { 1, -1, 0, 30, -8, 38, 35, 17, 24, 41, 4, 36, 33, 15, -27, -23, 9, -3, -6, -7, 22, -30, -35, -41, 20, -34, -16, 2, -42, -38, 39, 5, -13, -19, -24, -26, -15, 32, 34, -9, -25, 19, 14, -36, 21, 23, 25, 42 };
    assertEquals(2352, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case167() {
    int cakeLength = 34;
    int holeLength = 1;
    int[] horizontalCuts = { -8, 23, 5, 25, 4 };
    int[] verticalCuts = { 1, -1, 0, 25, -32, 24, -3 };
    assertEquals(50, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case168() {
    int cakeLength = 44;
    int holeLength = 1;
    int[] horizontalCuts = { 1, -1, 0, -27, 29, 15, -3, -28, 27, -6, -5, -18, 40, -41, -10, -23, 31, -13, -15, 25, -43, 6, 2, 10, 39, 7, -31, -2, -8, -17, -30, 37, -14, 13, -36, 42, 22, 19, -39, -12, -40, -19 };
    int[] verticalCuts = { 1, 0, 25, -8, 39, 7, -9, -2, -11, 19, 20, 38, 8, -24, 26, 15, -42, 23, 6, 21, 29, 24, 13, -12, 11, -16, -20, 2, -14, -27, 16, -4, -13, 43, 32, 37, -35, 3, 17, -43, -31, -17 };
    assertEquals(1847, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case169() {
    int cakeLength = 11;
    int holeLength = 1;
    int[] horizontalCuts = { 1, -1, 0, -9, -10, 9, 5, -7, -3, 6, 8, -4, 4, -5 };
    int[] verticalCuts = { -1, 0, -9, 3, -8, -4, -3, 7, -7, 8, -10, 2, 5, 1, 4 };
    assertEquals(236, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case170() {
    int cakeLength = 74;
    int holeLength = 1;
    int[] horizontalCuts = { -66, 48, -51, 59, -17, -2, 12, 7, -42, 18, -69, 56, 51, -53, 14, 70, 35, 62, 21, -25, 34, 50, -29, -39, -52, -19, 11, -63, 24, 23, 9, -70, -28, 8, 25, -14, -35, -61, 65, 39, -73, -48, -11, -54, 33, 0, 66, 32, -44, -68 };
    int[] verticalCuts = { 1, -1, 48, -47, -49, -25, 68, -70, -50, 60, 33, -21, -40, 21, -23, -69, 44, -17, 73, 43, -8, 27, -72, 14, -38, -27, 71, 25, -62, -65, -57, 3, -60, 37, 2, 66, 0, 22, 26, 4, 13, 18, -55, -26, -34, 5, 49, -6, 30, -20 };
    assertEquals(2601, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case171() {
    int cakeLength = 73;
    int holeLength = 1;
    int[] horizontalCuts = { 1, 70, -34 };
    int[] verticalCuts = { 1, -1, 0, 29, 14 };
    assertEquals(24, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case172() {
    int cakeLength = 42;
    int holeLength = 1;
    int[] horizontalCuts = { -1, 0, 22, -8, 24, 28, 3, 18, -3, -40, -17, -29, 26, -36, -4, -27, -35, -18, -7, 17, -9, -5, 32, 36, -15, -28, -38, 33, 8, -13, -30, 4, -6, -24, 19, 30, 9, 34, 7, 5, -10, -31, -33 };
    int[] verticalCuts = { 1, -1, -8, 26, 21, -20, 34, -25, -9, -28, -13, -30, -37, 11, 28, -11, 15, 3, 20, -14, 22, -29, 39, 33, -40, 37, -5, 41, 9, 31, 17, -32, 4, -17, -31, 25, -38, 18, 35, -4, 24, 16 };
    assertEquals(1891, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case173() {
    int cakeLength = 34;
    int holeLength = 1;
    int[] horizontalCuts = { 1, -1, -13, 29, -17, 22, 30, -22, 26, 16, -23, 3, -14, -5, -16, -26, 9, -33, -32, 24, -12, 0, 14, -7, -31, -27, -28, 15, -3, -9, 18, -11, 33, 27, 28, 8, -2, 25 };
    int[] verticalCuts = { -1, -8, -29, 12, 5, -19, -10, 11, 28, -13, 15, -4, -16, 10, -7, -20, -18, -28, -5, 18, 9, -31, -14, -3, 0, -33, 25, 2, 27, 1, 33, -25, 16, 21, 29, -15, -9, 13 };
    assertEquals(1517, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case174() {
    int cakeLength = 10;
    int holeLength = 9;
    int[] horizontalCuts = { 6, 4, 2, -2, -7, 5, -3, 8, -4, -1, 1, -5, 9, -8, 0 };
    int[] verticalCuts = { 9, 2, -1, 0, 7, -6, 4, 8, -2, 5, -3, 3, -5, -8, -4 };
    assertEquals(60, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case175() {
    int cakeLength = 71;
    int holeLength = 70;
    int[] horizontalCuts = { 35, 9, -41, -54, -44, -56, 43, -8, -47, -69, 29, -43, -37, 5, 28, -17, -1, -25, -59, -49, 38, -34, -61, 56, -27 };
    int[] verticalCuts = { -70, 11, 48, 50, -23, 20, -14, -3, 61, 47, -56, -16, 3, 24, 15, 60, -13, -67, -61, 32, -39, -50, -64, -27, -1, -44 };
    assertEquals(102, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case176() {
    int cakeLength = 37;
    int holeLength = 36;
    int[] horizontalCuts = { -36, 36, -8, -16, 2, -32, 15, -31 };
    int[] verticalCuts = { -36, -11, 3, 35, -31, 2, 22, 23 };
    assertEquals(32, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case177() {
    int cakeLength = 54;
    int holeLength = 53;
    int[] horizontalCuts = { -53, 53, -46, 2, -33, 49, -2, -14, -41, 6, -32, 26, 7, 41, -42, -23, -37, 51, 13, -51, 5, 24, -28, -48, -30, 12, 15, 1, -27, -5, -44, -9, 29, 32, 25, -19, 22, -17, 27, -16, -47, -3, -38, 31, -13, 52, -15, -10, -4, 30 };
    int[] verticalCuts = { 53, 50, -10, 16, -7, -19, -27, 21, 5, 39, -14, -48, -37, -52, -22, 24, 8, -1, 51, -39, -21, -4, 19, -32, 13, -51, 41, 40, -2, -8, -46, 4, 47, 42, -36, 2, -49, -34, 34, -26, 48, -3, 49, -53, -12, 45, -25, -24, 25, 33 };
    assertEquals(200, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case178() {
    int cakeLength = 18;
    int holeLength = 17;
    int[] horizontalCuts = { -17, 17, 6, -10, 14, -2, -7, -14, -5, -11, 13 };
    int[] verticalCuts = { -17, 17, 16, 10, 12, 7, 4, -14, 3, -15, -6 };
    assertEquals(44, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case179() {
    int cakeLength = 73;
    int holeLength = 72;
    int[] horizontalCuts = { -72, 60, 69, -71, 2, -30, 68, -8, -38, -19, -65, 49, 8, -3, 70, -14, 0, 14, -61, 1, -6, -35, 45, 54, -15, 63, 64, -23, -48, -42, -24, -58, 39, 22, 35, -16, 56, 16, -33, -37, -28, 66, -44, -45, 46, 55, -34, -59, -17 };
    int[] verticalCuts = { 20, 45, -22, -68, 64, 6, 26, -66, 9, -57, -4, -52, 27, 2, 65, 71, 29, -11, -54, 14, 22, -43, -8, -33, 10, -51, -24, -30, -47, 1, 72, 63, -2, -23, 0, -41, -26, -20, -46, 44, 4, -9, 70, 50, 15, 28, -63, -12 };
    assertEquals(194, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case180() {
    int cakeLength = 56;
    int holeLength = 55;
    int[] horizontalCuts = { -55, 55, 21, -21, -39, -42, 50, -52, -25, -22, 41, -31, -13, -45, -54, -34 };
    int[] verticalCuts = { -55, 55, -29, -1, 10, -40, 30, -14, 47, 44, -21, 5, 23, 31, -47, -48 };
    assertEquals(64, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case181() {
    int cakeLength = 14;
    int holeLength = 13;
    int[] horizontalCuts = { 13, -4, 10, -3, -9, 7, 5, 4, 11, -13, -8, -12, 3, 2, -2, -5 };
    int[] verticalCuts = { 13, -13, 12, -11, 6, -10, -4, -8, -1, -7, 1, 9, 2, 5, -6, 0, 10 };
    assertEquals(66, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case182() {
    int cakeLength = 20;
    int holeLength = 19;
    int[] horizontalCuts = { -19, 9, 5, 8 };
    int[] verticalCuts = { 19, -1, -13, 17 };
    assertEquals(16, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case183() {
    int cakeLength = 40;
    int holeLength = 39;
    int[] horizontalCuts = { 39, -22, 37, -27, 14, -14, 3, -1, 7, 9, -21, -28, 19, -24, -18, 30, -39, 23, -31, 26, -32, -9, 20, -13, -4, -29, 34, -5, 25, 35, -33, -3, 10, 32, 18, 12, 8, -34, -38, 22, -6, -16, -7, 33, -17, -25, 27, 36, 29, 38 };
    int[] verticalCuts = { -39, 6, -18, 1, -33, -10, 38, -9, 25, -30, -37, -5, -38, -8, -15, 24, -12, 23, -7, 9, -19, -4, -23, -17, 30, -14, 11, 7, 8, 5, 13, 10, 28, -13, -27, -35, -3, -34, -16, -36, -2, -11, 19, 16, 20, 2, -25, 34, 4, -29 };
    assertEquals(200, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case184() {
    int cakeLength = 5;
    int holeLength = 3;
    int[] horizontalCuts = { 1, -4 };
    int[] verticalCuts = { 1 };
    assertEquals(6, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case185() {
    int cakeLength = 50;
    int holeLength = 5;
    int[] horizontalCuts = { 40, -40 };
    int[] verticalCuts = { 20, 0, -20 };
    assertEquals(12, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case186() {
    int cakeLength = 2;
    int holeLength = 1;
    int[] horizontalCuts = { -1, 1 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case187() {
    int cakeLength = 50;
    int holeLength = 10;
    int[] horizontalCuts = { 20, -20 };
    int[] verticalCuts = { 10, -10 };
    assertEquals(10, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case188() {
    int cakeLength = 51;
    int holeLength = 4;
    int[] horizontalCuts = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25 };
    int[] verticalCuts = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25 };
    assertEquals(2552, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case189() {
    int cakeLength = 5;
    int holeLength = 2;
    int[] horizontalCuts = { -1, 1 };
    int[] verticalCuts = { -1, 1 };
    assertEquals(8, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case190() {
    int cakeLength = 99;
    int holeLength = 7;
    int[] horizontalCuts = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 0, 97, 98, 43, 23, 12, 76, 45, 75, 22, 24, 25, 26, 27, 44, 55, 66, 77, 88, -11, -23, -24, -1, -98, -97, -96, -2, -7, -8, -55, -3, -58, -21 };
    int[] verticalCuts = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 0, 97, 98, 43, 23, 12, 76, 45, 75, 22, 24, 25, 26, 27, 44, 55, 66, 77, 88, -11, -23, -24, -1, -98, -97, -96, -2, -7, -8, -55, -3, 58, -21 };
    assertEquals(1728, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case191() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { -5, 5, 6 };
    int[] verticalCuts = { -5, 5, 6, 7 };
    assertEquals(19, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case192() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { 5, -5 };
    int[] verticalCuts = { 5, -5 };
    assertEquals(8, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case193() {
    int cakeLength = 100;
    int holeLength = 25;
    int[] horizontalCuts = { -99, 98, 0, -25, -24, 24, -26, 26 };
    int[] verticalCuts = { -98, 99, 25, 0, -26, 26, -24, 24 };
    assertEquals(72, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case194() {
    int cakeLength = 2;
    int holeLength = 1;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case195() {
    int cakeLength = 20;
    int holeLength = 19;
    int[] horizontalCuts = { -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0 };
    int[] verticalCuts = { 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    assertEquals(80, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case196() {
    int cakeLength = 3;
    int holeLength = 1;
    int[] horizontalCuts = { 2, 1, 0 };
    int[] verticalCuts = { 2, 1, 0 };
    assertEquals(15, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case197() {
    int cakeLength = 5;
    int holeLength = 3;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case198() {
    int cakeLength = 100;
    int holeLength = 1;
    int[] horizontalCuts = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] verticalCuts = {  };
    assertEquals(9, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case199() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { 2, 0, -2, -3, 3 };
    int[] verticalCuts = {  };
    assertEquals(10, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case200() {
    int cakeLength = 100;
    int holeLength = 25;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case201() {
    int cakeLength = 20;
    int holeLength = 10;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case202() {
    int cakeLength = 100;
    int holeLength = 1;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { 50, 51, 52 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case203() {
    int cakeLength = 100;
    int holeLength = 80;
    int[] horizontalCuts = { 1, -4, 80, -80, 12, 15, 13, -11, 0, 99, -70, 11, 6 };
    int[] verticalCuts = { 1, -1, -5, 9, 50, 80, 79, -79, -80, -99, 10, 7, 0, -9 };
    assertEquals(78, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case204() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -7, 7 };
    assertEquals(3, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case205() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { -7, -8, -9, -5, 4, 6, 7 };
    int[] verticalCuts = { 7, 8, 9, -6, -8, -9, 4 };
    assertEquals(64, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case206() {
    int cakeLength = 50;
    int holeLength = 5;
    int[] horizontalCuts = { 40, -40, 3, 4, 5 };
    int[] verticalCuts = { 20, 0, -20, 1, 2, 3 };
    assertEquals(36, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case207() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { -5, 5 };
    int[] verticalCuts = { -5, 5 };
    assertEquals(8, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case208() {
    int cakeLength = 100;
    int holeLength = 99;
    int[] horizontalCuts = { 20, 21, 23, 22, 25 };
    int[] verticalCuts = { 55, 33 };
    assertEquals(14, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case209() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case210() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -2, 2 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case211() {
    int cakeLength = 100;
    int holeLength = 50;
    int[] horizontalCuts = { 99, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0, -10, -20, -30, -40, -50, -60, -70, -80, -90, -99 };
    int[] verticalCuts = { 99, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0, -10, -20, -30, -40, -50, -60, -70, -80, -90, -99 };
    assertEquals(384, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case212() {
    int cakeLength = 100;
    int holeLength = 50;
    int[] horizontalCuts = { -1, 90, 89, 87, 65, 54, 34, -34, -24, 12, 15, 17, 14, -14, -50, -47 };
    int[] verticalCuts = { -1, -13, -14, 56, -56, 78, 89, 90, -45, 63, 93, -93 };
    assertEquals(191, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case213() {
    int cakeLength = 100;
    int holeLength = 50;
    int[] horizontalCuts = { -10, 10 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case214() {
    int cakeLength = 3;
    int holeLength = 1;
    int[] horizontalCuts = { -2, 2 };
    int[] verticalCuts = { -2, 2 };
    assertEquals(9, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case215() {
    int cakeLength = 5;
    int holeLength = 4;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case216() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { -2, 2 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case217() {
    int cakeLength = 10;
    int holeLength = 2;
    int[] horizontalCuts = { -2, 2 };
    int[] verticalCuts = { -2, 2 };
    assertEquals(8, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case218() {
    int cakeLength = 100;
    int holeLength = 10;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { 0, 10 };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case219() {
    int cakeLength = 10;
    int holeLength = 3;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case220() {
    int cakeLength = 100;
    int holeLength = 50;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { -75, 75 };
    assertEquals(3, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case221() {
    int cakeLength = 10;
    int holeLength = 2;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case222() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { -2, 1, 2 };
    int[] verticalCuts = { -2, 1, 2 };
    assertEquals(12, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case223() {
    int cakeLength = 50;
    int holeLength = 30;
    int[] horizontalCuts = { -30, -45, -33, 0, 1, 2, 5, 8, 9, 30, 36 };
    int[] verticalCuts = { -45, -33, -40, -30, 0, -23, -2, 4, 6, 8, 30, 35, 33, 45 };
    assertEquals(131, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case224() {
    int cakeLength = 100;
    int holeLength = 50;
    int[] horizontalCuts = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99 };
    int[] verticalCuts = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99 };
    assertEquals(2025, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case225() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { 2, 0, -2 };
    int[] verticalCuts = { 7 };
    assertEquals(10, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case226() {
    int cakeLength = 50;
    int holeLength = 35;
    int[] horizontalCuts = { 40, -40, 12, 11, -10, -9 };
    int[] verticalCuts = { 20, 0, -20, 12, 35, 45, 19, 18 };
    assertEquals(45, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case227() {
    int cakeLength = 20;
    int holeLength = 10;
    int[] horizontalCuts = { -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
    int[] verticalCuts = { -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
    assertEquals(1200, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case228() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { 4, -4 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case229() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { -5, 4 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case230() {
    int cakeLength = 100;
    int holeLength = 55;
    int[] horizontalCuts = { -35, -34, -1, 0, 1, 4, 43, 65, 76, 87, 12, 45, 34 };
    int[] verticalCuts = { 65, 21, -12, -43, -56, 97 };
    assertEquals(80, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case231() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { -9, 9 };
    int[] verticalCuts = { -9, 9 };
    assertEquals(9, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case232() {
    int cakeLength = 5;
    int holeLength = 2;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case233() {
    int cakeLength = 6;
    int holeLength = 3;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case234() {
    int cakeLength = 5;
    int holeLength = 3;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { 4 };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case235() {
    int cakeLength = 5;
    int holeLength = 1;
    int[] horizontalCuts = { -4, -3, -2, -1, 0, 1, 2, 3, 4 };
    int[] verticalCuts = { -4, -3, -2, -1, 0, 1, 2, 3, 4 };
    assertEquals(96, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case236() {
    int cakeLength = 5;
    int holeLength = 3;
    int[] horizontalCuts = { 3, -3 };
    int[] verticalCuts = { -3, 3 };
    assertEquals(8, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case237() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { 7, -7 };
    int[] verticalCuts = {  };
    assertEquals(3, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case238() {
    int cakeLength = 100;
    int holeLength = 1;
    int[] horizontalCuts = {  };
    int[] verticalCuts = {  };
    assertEquals(1, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case239() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = {  };
    int[] verticalCuts = { 0 };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case240() {
    int cakeLength = 5;
    int holeLength = 3;
    int[] horizontalCuts = { -3, 1, 3 };
    int[] verticalCuts = { -4 };
    assertEquals(10, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case241() {
    int cakeLength = 5;
    int holeLength = 3;
    int[] horizontalCuts = { 1, -4, 0 };
    int[] verticalCuts = { -4 };
    assertEquals(9, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case242() {
    int cakeLength = 51;
    int holeLength = 19;
    int[] horizontalCuts = { -46, -31, -28, -22, -23, -50, -10, 25, 50, 39, 36, 46, 32, 19, 2, 12, -13, -44, 24, -40, -32, 6, 31, -9, -37 };
    int[] verticalCuts = { -9, 26, 30, -29, 40, 43, -10, 31, -42, 34, 10, -4, -46, 36, 22, 19, -23, -1, -28, 20, 47, 5, 48 };
    assertEquals(588, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case243() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { 6 };
    int[] verticalCuts = { -1, 1 };
    assertEquals(7, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case244() {
    int cakeLength = 100;
    int holeLength = 99;
    int[] horizontalCuts = { -99, 99 };
    int[] verticalCuts = { -99, 99 };
    assertEquals(8, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case245() {
    int cakeLength = 100;
    int holeLength = 50;
    int[] horizontalCuts = { 20, 12, 23, 5 };
    int[] verticalCuts = { -10, -20, -30, -18 };
    assertEquals(16, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case246() {
    int cakeLength = 50;
    int holeLength = 10;
    int[] horizontalCuts = { 20, -20, 10, 5, 9, 7 };
    int[] verticalCuts = { 10, -10, 40, -40, 30, -30 };
    assertEquals(46, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case247() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { 2, -2 };
    int[] verticalCuts = { -5, 6 };
    assertEquals(9, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case248() {
    int cakeLength = 95;
    int holeLength = 77;
    int[] horizontalCuts = { 16, 93, 67, 33, -45, 84, -53, 14, -36, -31, 53, 50, 64, 62, 27, -34, -9 };
    int[] verticalCuts = { 33, -23, -37, -62, 8, 75, 53, 91, 0, -25, -22, 26, 49, -68, 80, -18, 66, -72, -58, 68, 92, -13, 37, -67, 90, 71, -75, 89, 69, 94, -4, 73, -3, -78, -90 };
    assertEquals(284, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case249() {
    int cakeLength = 100;
    int holeLength = 3;
    int[] horizontalCuts = { 99 };
    int[] verticalCuts = {  };
    assertEquals(2, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case250() {
    int cakeLength = 20;
    int holeLength = 10;
    int[] horizontalCuts = { -15, 15 };
    int[] verticalCuts = { -15, 15 };
    assertEquals(9, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case251() {
    int cakeLength = 55;
    int holeLength = 51;
    int[] horizontalCuts = { 26, -19, -30, -47, -43, 4, 1, 16, -49, -11, 39, 43, -28, -54, 10, 40, 41, 25, -18, 50, -41, 7, 45, -46, 47 };
    int[] verticalCuts = { -34, -25, -32, 28, -6, 26, 9, -20, 43, -36, 8, 49, -22, -17, 39, -51, -27, 40, 47, 34, -39, 48, 30, 36, -2, 27, -38 };
    assertEquals(130, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case252() {
    int cakeLength = 3;
    int holeLength = 1;
    int[] horizontalCuts = { -1, 2 };
    int[] verticalCuts = { -2, 2 };
    assertEquals(9, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case253() {
    int cakeLength = 100;
    int holeLength = 10;
    int[] horizontalCuts = { 5, -5, 20, -20 };
    int[] verticalCuts = { 5, -5, 20, -20 };
    assertEquals(24, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

  @Test
  public void case254() {
    int cakeLength = 10;
    int holeLength = 5;
    int[] horizontalCuts = { -5, 5 };
    int[] verticalCuts = {  };
    assertEquals(4, holecakecuts.cutTheCake(cakeLength, holeLength, horizontalCuts, verticalCuts));
  }

}
