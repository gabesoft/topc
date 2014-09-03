package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LittleElephantAndIntervalsDiv2Test {
  LittleElephantAndIntervalsDiv2 littleelephantandintervalsdiv2 = new LittleElephantAndIntervalsDiv2();

  @Test
  public void case1() {
    int M = 4;
    int[] L = { 1, 2, 3 };
    int[] R = { 1, 2, 3 };
    assertEquals(8, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case2() {
    int M = 3;
    int[] L = { 1, 1, 2 };
    int[] R = { 3, 1, 3 };
    assertEquals(4, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case3() {
    int M = 100;
    int[] L = { 47 };
    int[] R = { 74 };
    assertEquals(2, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case4() {
    int M = 100;
    int[] L = { 10, 20, 50 };
    int[] R = { 20, 50, 100 };
    assertEquals(8, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case5() {
    int M = 1;
    int[] L = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] R = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(2, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case6() {
    int M = 42;
    int[] L = { 5, 23, 4, 1, 15, 2, 22, 26, 13, 16 };
    int[] R = { 30, 41, 17, 1, 21, 6, 28, 30, 15, 19 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case7() {
    int M = 5;
    int[] L = { 1, 2, 1, 4, 1, 1, 3, 2, 1, 4 };
    int[] R = { 3, 3, 2, 4, 3, 2, 5, 3, 1, 4 };
    assertEquals(16, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case8() {
    int M = 23;
    int[] L = { 14, 18, 2, 3, 15, 4, 3, 9, 17, 19 };
    int[] R = { 20, 19, 7, 15, 22, 6, 3, 13, 20, 23 };
    assertEquals(256, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case9() {
    int M = 43;
    int[] L = { 6, 11, 1, 3, 10, 6, 13, 13, 18, 5 };
    int[] R = { 31, 11, 1, 13, 24, 33, 43, 13, 22, 5 };
    assertEquals(128, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case10() {
    int M = 57;
    int[] L = { 11, 12, 17, 1, 28, 19, 21, 10, 50, 19 };
    int[] R = { 42, 24, 32, 7, 38, 50, 31, 12, 51, 19 };
    assertEquals(256, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case11() {
    int M = 91;
    int[] L = { 55, 6, 17, 80, 83, 24, 2, 54, 62, 61 };
    int[] R = { 61, 12, 22, 82, 91, 27, 4, 54, 68, 68 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case12() {
    int M = 96;
    int[] L = { 23, 53, 95, 29, 71, 48, 10, 96, 16, 78 };
    int[] R = { 24, 53, 96, 35, 78, 55, 17, 96, 21, 87 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case13() {
    int M = 99;
    int[] L = { 66, 87, 84, 79, 10, 52, 86, 4, 66, 74 };
    int[] R = { 74, 93, 84, 87, 11, 57, 95, 11, 69, 75 };
    assertEquals(128, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case14() {
    int M = 93;
    int[] L = { 78, 54, 47, 28, 43, 26, 85, 47, 39, 69 };
    int[] R = { 79, 58, 53, 36, 51, 27, 88, 55, 39, 76 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case15() {
    int M = 98;
    int[] L = { 5, 51, 70, 3, 78, 2, 22, 21, 56, 63 };
    int[] R = { 8, 54, 71, 10, 82, 8, 23, 30, 62, 66 };
    assertEquals(256, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case16() {
    int M = 95;
    int[] L = { 84, 25, 23, 61, 94, 68, 4, 26, 64, 37 };
    int[] R = { 88, 34, 28, 64, 95, 72, 12, 34, 64, 45 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case17() {
    int M = 92;
    int[] L = { 86, 42, 49, 47, 59, 67, 47, 36, 21, 11 };
    int[] R = { 92, 49, 51, 49, 68, 74, 48, 44, 22, 15 };
    assertEquals(1024, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case18() {
    int M = 93;
    int[] L = { 61, 48, 51, 69, 55, 22, 7, 52, 27, 19 };
    int[] R = { 69, 50, 56, 78, 59, 23, 9, 53, 34, 21 };
    assertEquals(1024, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case19() {
    int M = 100;
    int[] L = { 76, 1, 4, 62, 2, 56, 3, 83, 89, 18 };
    int[] R = { 78, 1, 13, 70, 11, 59, 8, 88, 95, 25 };
    assertEquals(1024, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case20() {
    int M = 93;
    int[] L = { 57, 16, 78, 82, 49, 47, 89, 27, 19, 34 };
    int[] R = { 66, 17, 84, 90, 54, 51, 90, 32, 27, 43 };
    assertEquals(1024, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case21() {
    int M = 94;
    int[] L = { 18, 50, 84, 33, 6, 8, 87, 49, 48, 67 };
    int[] R = { 23, 56, 84, 39, 10, 12, 92, 49, 50, 71 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case22() {
    int M = 97;
    int[] L = { 11, 42, 9, 72, 42, 91, 15, 62, 47, 71 };
    int[] R = { 15, 43, 9, 74, 47, 92, 21, 62, 52, 76 };
    assertEquals(256, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case23() {
    int M = 93;
    int[] L = { 62, 49, 14, 48, 67, 49, 22, 3, 74, 11 };
    int[] R = { 63, 59, 20, 67, 86, 53, 32, 12, 87, 13 };
    assertEquals(256, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case24() {
    int M = 99;
    int[] L = { 60, 6, 66, 62, 59, 85, 36, 63, 54, 83 };
    int[] R = { 67, 24, 68, 79, 73, 99, 48, 76, 61, 99 };
    assertEquals(128, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case25() {
    int M = 98;
    int[] L = { 36, 98, 43, 65, 10, 1, 50, 74, 48, 28 };
    int[] R = { 46, 98, 48, 65, 17, 20, 55, 78, 60, 29 };
    assertEquals(256, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case26() {
    int M = 94;
    int[] L = { 79, 52, 60, 49, 79, 5, 89, 49, 31, 2 };
    int[] R = { 84, 57, 72, 51, 83, 12, 94, 59, 46, 13 };
    assertEquals(128, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case27() {
    int M = 91;
    int[] L = { 60, 6, 50, 57, 83, 5, 91, 82, 38, 10 };
    int[] R = { 77, 6, 69, 81, 83, 24, 91, 91, 56, 19 };
    assertEquals(32, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case28() {
    int M = 99;
    int[] L = { 52, 86, 70, 46, 6, 21, 33, 88, 61, 59 };
    int[] R = { 71, 86, 80, 56, 26, 22, 51, 99, 68, 74 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case29() {
    int M = 98;
    int[] L = { 80, 78, 44, 42, 43, 26, 14, 4, 89, 29 };
    int[] R = { 98, 80, 47, 62, 55, 47, 25, 4, 98, 45 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case30() {
    int M = 91;
    int[] L = { 34, 14, 68, 45, 1, 15, 13, 89, 60, 16 };
    int[] R = { 45, 25, 71, 60, 14, 30, 25, 89, 68, 31 };
    assertEquals(256, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case31() {
    int M = 98;
    int[] L = { 12, 89, 50, 52, 10, 44, 6, 55, 58, 2 };
    int[] R = { 12, 98, 60, 66, 18, 51, 26, 73, 82, 2 };
    assertEquals(128, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case32() {
    int M = 92;
    int[] L = { 1, 65, 3, 42, 33, 66, 18, 88, 14, 51 };
    int[] R = { 26, 77, 16, 48, 39, 72, 45, 92, 40, 58 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case33() {
    int M = 93;
    int[] L = { 70, 54, 58, 50, 50, 70, 57, 51, 52, 68 };
    int[] R = { 76, 65, 67, 55, 72, 75, 69, 55, 74, 93 };
    assertEquals(16, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case34() {
    int M = 100;
    int[] L = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] R = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertEquals(1024, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case35() {
    int M = 100;
    int[] L = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] R = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    assertEquals(1024, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case36() {
    int M = 100;
    int[] L = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] R = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91 };
    assertEquals(1024, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case37() {
    int M = 100;
    int[] L = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
    int[] R = { 4, 4, 8, 8, 12, 12, 16, 16, 20, 20 };
    assertEquals(1024, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case38() {
    int M = 100;
    int[] L = { 3, 1, 7, 5, 11, 9, 15, 13, 19, 17 };
    int[] R = { 4, 4, 8, 8, 12, 12, 16, 16, 20, 20 };
    assertEquals(32, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case39() {
    int M = 100;
    int[] L = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 };
    int[] R = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 99 };
    assertEquals(2, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case40() {
    int M = 100;
    int[] L = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] R = { 99, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals(1024, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case41() {
    int M = 100;
    int[] L = { 1, 50, 50 };
    int[] R = { 50, 100, 50 };
    assertEquals(8, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case42() {
    int M = 100;
    int[] L = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] R = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    assertEquals(2, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case43() {
    int M = 42;
    int[] L = { 5, 23, 4, 1, 15, 2, 22, 26, 13, 16 };
    int[] R = { 30, 41, 17, 1, 21, 6, 28, 30, 15, 19 };
    assertEquals(512, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case44() {
    int M = 4;
    int[] L = { 1, 1, 3 };
    int[] R = { 3, 2, 3 };
    assertEquals(4, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case45() {
    int M = 3;
    int[] L = { 1, 2 };
    int[] R = { 3, 2 };
    assertEquals(4, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case46() {
    int M = 3;
    int[] L = { 1, 1, 2 };
    int[] R = { 3, 1, 3 };
    assertEquals(4, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case47() {
    int M = 4;
    int[] L = { 1, 1, 1, 1 };
    int[] R = { 4, 4, 4, 4 };
    assertEquals(2, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case48() {
    int M = 10;
    int[] L = { 1, 5, 5 };
    int[] R = { 10, 10, 5 };
    assertEquals(8, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case49() {
    int M = 4;
    int[] L = { 1, 2, 2 };
    int[] R = { 4, 2, 2 };
    assertEquals(4, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case50() {
    int M = 3;
    int[] L = { 1, 3 };
    int[] R = { 3, 3 };
    assertEquals(4, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case51() {
    int M = 1;
    int[] L = { 1, 1, 1 };
    int[] R = { 1, 1, 1 };
    assertEquals(2, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case52() {
    int M = 10;
    int[] L = { 1, 3, 6 };
    int[] R = { 9, 4, 7 };
    assertEquals(8, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case53() {
    int M = 50;
    int[] L = { 1, 3 };
    int[] R = { 10, 6 };
    assertEquals(4, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case54() {
    int M = 100;
    int[] L = { 10, 20, 30, 40, 50 };
    int[] R = { 90, 80, 70, 60, 50 };
    assertEquals(32, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case55() {
    int M = 5;
    int[] L = { 1, 2, 3 };
    int[] R = { 5, 4, 3 };
    assertEquals(8, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case56() {
    int M = 3;
    int[] L = { 1, 1 };
    int[] R = { 3, 3 };
    assertEquals(2, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case57() {
    int M = 6;
    int[] L = { 4, 3 };
    int[] R = { 5, 6 };
    assertEquals(2, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case58() {
    int M = 100;
    int[] L = { 1, 1, 2, 8, 10, 56, 14 };
    int[] R = { 1, 10, 100, 9, 54, 58, 16 };
    assertEquals(64, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case59() {
    int M = 10;
    int[] L = { 1, 2 };
    int[] R = { 6, 5 };
    assertEquals(4, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case60() {
    int M = 100;
    int[] L = { 10, 10, 10 };
    int[] R = { 20, 20, 20 };
    assertEquals(2, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case61() {
    int M = 4;
    int[] L = { 1, 2 };
    int[] R = { 4, 3 };
    assertEquals(4, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

  @Test
  public void case62() {
    int M = 4;
    int[] L = { 1, 3, 4 };
    int[] R = { 1, 3, 4 };
    assertEquals(8, littleelephantandintervalsdiv2.getNumber(M, L, R));
  }

}
