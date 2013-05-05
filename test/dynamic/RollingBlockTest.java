package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RollingBlockTest {
  RollingBlock rollingblock = new RollingBlock();

  @Test
  public void case1() {
    int rows = 4;
    int cols = 5;
    int[] start = { 3, 0 };
    int[] target = { 2, 4 };
    assertEquals(3, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case2() {
    int rows = 5;
    int cols = 5;
    int[] start = { 2, 2 };
    int[] target = { 4, 0 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case3() {
    int rows = 4;
    int cols = 4;
    int[] start = { 3, 0 };
    int[] target = { 3, 3 };
    assertEquals(5, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case4() {
    int rows = 4;
    int cols = 4;
    int[] start = { 3, 0 };
    int[] target = { 0, 3 };
    assertEquals(10, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case5() {
    int rows = 100;
    int cols = 100;
    int[] start = { 4, 5 };
    int[] target = { 5, 97 };
    assertEquals(47, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case6() {
    int rows = 1;
    int cols = 1;
    int[] start = { 0, 0 };
    int[] target = { 0, 0 };
    assertEquals(0, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case7() {
    int rows = 1;
    int cols = 2;
    int[] start = { 0, 0 };
    int[] target = { 0, 1 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case8() {
    int rows = 100;
    int cols = 1;
    int[] start = { 1, 0 };
    int[] target = { 97, 0 };
    assertEquals(48, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case9() {
    int rows = 100;
    int cols = 1;
    int[] start = { 2, 0 };
    int[] target = { 96, 0 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case10() {
    int rows = 1;
    int cols = 100;
    int[] start = { 0, 2 };
    int[] target = { 0, 97 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case11() {
    int rows = 4;
    int cols = 100;
    int[] start = { 0, 2 };
    int[] target = { 0, 97 };
    assertEquals(51, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case12() {
    int rows = 100;
    int cols = 4;
    int[] start = { 3, 1 };
    int[] target = { 92, 2 };
    assertEquals(50, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case13() {
    int rows = 100;
    int cols = 4;
    int[] start = { 3, 1 };
    int[] target = { 91, 2 };
    assertEquals(45, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case14() {
    int rows = 100;
    int cols = 100;
    int[] start = { 50, 50 };
    int[] target = { 50, 50 };
    assertEquals(0, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case15() {
    int rows = 100;
    int cols = 100;
    int[] start = { 0, 99 };
    int[] target = { 99, 0 };
    assertEquals(102, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case16() {
    int rows = 96;
    int cols = 57;
    int[] start = { 56, 51 };
    int[] target = { 6, 40 };
    assertEquals(33, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case17() {
    int rows = 48;
    int cols = 99;
    int[] start = { 47, 13 };
    int[] target = { 3, 81 };
    assertEquals(56, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case18() {
    int rows = 50;
    int cols = 28;
    int[] start = { 31, 3 };
    int[] target = { 14, 5 };
    assertEquals(13, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case19() {
    int rows = 91;
    int cols = 9;
    int[] start = { 42, 1 };
    int[] target = { 5, 5 };
    assertEquals(21, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case20() {
    int rows = 97;
    int cols = 34;
    int[] start = { 74, 20 };
    int[] target = { 71, 6 };
    assertEquals(11, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case21() {
    int rows = 97;
    int cols = 51;
    int[] start = { 64, 4 };
    int[] target = { 41, 49 };
    assertEquals(36, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case22() {
    int rows = 38;
    int cols = 65;
    int[] start = { 11, 44 };
    int[] target = { 1, 41 };
    assertEquals(9, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case23() {
    int rows = 40;
    int cols = 46;
    int[] start = { 2, 26 };
    int[] target = { 10, 30 };
    assertEquals(6, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case24() {
    int rows = 65;
    int cols = 84;
    int[] start = { 3, 44 };
    int[] target = { 45, 10 };
    assertEquals(40, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case25() {
    int rows = 52;
    int cols = 14;
    int[] start = { 4, 9 };
    int[] target = { 30, 5 };
    assertEquals(16, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case26() {
    int rows = 50;
    int cols = 96;
    int[] start = { 8, 87 };
    int[] target = { 2, 35 };
    assertEquals(30, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case27() {
    int rows = 70;
    int cols = 78;
    int[] start = { 13, 0 };
    int[] target = { 55, 21 };
    assertEquals(33, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case28() {
    int rows = 81;
    int cols = 28;
    int[] start = { 1, 16 };
    int[] target = { 4, 12 };
    assertEquals(5, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case29() {
    int rows = 47;
    int cols = 90;
    int[] start = { 37, 59 };
    int[] target = { 6, 61 };
    assertEquals(21, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case30() {
    int rows = 79;
    int cols = 24;
    int[] start = { 13, 9 };
    int[] target = { 59, 23 };
    assertEquals(32, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case31() {
    int rows = 11;
    int cols = 54;
    int[] start = { 6, 37 };
    int[] target = { 4, 29 };
    assertEquals(6, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case32() {
    int rows = 32;
    int cols = 55;
    int[] start = { 11, 31 };
    int[] target = { 13, 1 };
    assertEquals(20, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case33() {
    int rows = 81;
    int cols = 41;
    int[] start = { 32, 26 };
    int[] target = { 19, 4 };
    assertEquals(19, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case34() {
    int rows = 45;
    int cols = 83;
    int[] start = { 20, 69 };
    int[] target = { 25, 51 };
    assertEquals(13, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case35() {
    int rows = 19;
    int cols = 11;
    int[] start = { 2, 10 };
    int[] target = { 2, 8 };
    assertEquals(4, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case36() {
    int rows = 25;
    int cols = 3;
    int[] start = { 6, 2 };
    int[] target = { 15, 1 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case37() {
    int rows = 3;
    int cols = 88;
    int[] start = { 1, 83 };
    int[] target = { 1, 56 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case38() {
    int rows = 81;
    int cols = 4;
    int[] start = { 52, 2 };
    int[] target = { 78, 0 };
    assertEquals(18, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case39() {
    int rows = 66;
    int cols = 48;
    int[] start = { 13, 13 };
    int[] target = { 3, 1 };
    assertEquals(12, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case40() {
    int rows = 23;
    int cols = 20;
    int[] start = { 18, 7 };
    int[] target = { 1, 7 };
    assertEquals(11, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case41() {
    int rows = 13;
    int cols = 13;
    int[] start = { 11, 3 };
    int[] target = { 10, 1 };
    assertEquals(7, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case42() {
    int rows = 65;
    int cols = 15;
    int[] start = { 3, 1 };
    int[] target = { 25, 5 };
    assertEquals(14, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case43() {
    int rows = 50;
    int cols = 65;
    int[] start = { 27, 20 };
    int[] target = { 34, 39 };
    assertEquals(16, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case44() {
    int rows = 46;
    int cols = 32;
    int[] start = { 36, 5 };
    int[] target = { 36, 15 };
    assertEquals(8, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case45() {
    int rows = 29;
    int cols = 54;
    int[] start = { 21, 52 };
    int[] target = { 12, 33 };
    assertEquals(16, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case46() {
    int rows = 69;
    int cols = 65;
    int[] start = { 42, 45 };
    int[] target = { 31, 34 };
    assertEquals(14, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case47() {
    int rows = 64;
    int cols = 31;
    int[] start = { 2, 7 };
    int[] target = { 56, 24 };
    assertEquals(37, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case48() {
    int rows = 30;
    int cols = 92;
    int[] start = { 0, 60 };
    int[] target = { 8, 40 };
    assertEquals(14, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case49() {
    int rows = 21;
    int cols = 71;
    int[] start = { 14, 40 };
    int[] target = { 17, 4 };
    assertEquals(21, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case50() {
    int rows = 75;
    int cols = 9;
    int[] start = { 39, 3 };
    int[] target = { 3, 2 };
    assertEquals(19, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case51() {
    int rows = 67;
    int cols = 54;
    int[] start = { 19, 53 };
    int[] target = { 54, 40 };
    assertEquals(26, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case52() {
    int rows = 15;
    int cols = 29;
    int[] start = { 5, 26 };
    int[] target = { 12, 7 };
    assertEquals(16, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case53() {
    int rows = 8;
    int cols = 33;
    int[] start = { 7, 25 };
    int[] target = { 1, 30 };
    assertEquals(7, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case54() {
    int rows = 22;
    int cols = 73;
    int[] start = { 9, 16 };
    int[] target = { 9, 54 };
    assertEquals(22, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case55() {
    int rows = 82;
    int cols = 44;
    int[] start = { 76, 13 };
    int[] target = { 49, 40 };
    assertEquals(30, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case56() {
    int rows = 20;
    int cols = 20;
    int[] start = { 7, 9 };
    int[] target = { 7, 9 };
    assertEquals(0, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case57() {
    int rows = 100;
    int cols = 100;
    int[] start = { 4, 5 };
    int[] target = { 5, 97 };
    assertEquals(47, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case58() {
    int rows = 4;
    int cols = 4;
    int[] start = { 3, 0 };
    int[] target = { 0, 3 };
    assertEquals(10, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case59() {
    int rows = 4;
    int cols = 5;
    int[] start = { 3, 0 };
    int[] target = { 2, 4 };
    assertEquals(3, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case60() {
    int rows = 100;
    int cols = 100;
    int[] start = { 4, 5 };
    int[] target = { 99, 97 };
    assertEquals(95, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case61() {
    int rows = 2;
    int cols = 2;
    int[] start = { 0, 0 };
    int[] target = { 1, 1 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case62() {
    int rows = 80;
    int cols = 30;
    int[] start = { 9, 5 };
    int[] target = { 7, 9 };
    assertEquals(4, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case63() {
    int rows = 100;
    int cols = 100;
    int[] start = { 0, 0 };
    int[] target = { 99, 99 };
    assertEquals(102, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case64() {
    int rows = 8;
    int cols = 8;
    int[] start = { 4, 4 };
    int[] target = { 7, 7 };
    assertEquals(8, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case65() {
    int rows = 4;
    int cols = 4;
    int[] start = { 0, 0 };
    int[] target = { 1, 1 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case66() {
    int rows = 11;
    int cols = 12;
    int[] start = { 10, 10 };
    int[] target = { 3, 2 };
    assertEquals(9, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case67() {
    int rows = 6;
    int cols = 4;
    int[] start = { 1, 1 };
    int[] target = { 2, 2 };
    assertEquals(10, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case68() {
    int rows = 5;
    int cols = 4;
    int[] start = { 3, 0 };
    int[] target = { 0, 3 };
    assertEquals(8, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case69() {
    int rows = 1;
    int cols = 50;
    int[] start = { 0, 1 };
    int[] target = { 0, 43 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case70() {
    int rows = 56;
    int cols = 70;
    int[] start = { 0, 67 };
    int[] target = { 14, 2 };
    assertEquals(41, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case71() {
    int rows = 2;
    int cols = 99;
    int[] start = { 0, 0 };
    int[] target = { 1, 1 };
    assertEquals(-1, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case72() {
    int rows = 6;
    int cols = 6;
    int[] start = { 0, 0 };
    int[] target = { 1, 1 };
    assertEquals(6, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case73() {
    int rows = 4;
    int cols = 4;
    int[] start = { 0, 1 };
    int[] target = { 3, 2 };
    assertEquals(12, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case74() {
    int rows = 100;
    int cols = 100;
    int[] start = { 98, 99 };
    int[] target = { 99, 98 };
    assertEquals(6, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case75() {
    int rows = 100;
    int cols = 100;
    int[] start = { 3, 0 };
    int[] target = { 4, 1 };
    assertEquals(6, rollingblock.minMoves(rows, cols, start, target));
  }

  @Test
  public void case76() {
    int rows = 7;
    int cols = 6;
    int[] start = { 6, 1 };
    int[] target = { 0, 4 };
    assertEquals(7, rollingblock.minMoves(rows, cols, start, target));
  }

}
