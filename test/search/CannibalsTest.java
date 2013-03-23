package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class CannibalsTest {
  Cannibals cannibals = new Cannibals();

  @Test
  public void case1() {
    int M = 3;
    int C = 3;
    int R = 2;
    assertEquals(11, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case2() {
    int M = 4;
    int C = 4;
    int R = 2;
    assertEquals(-1, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case3() {
    int M = 10;
    int C = 8;
    int R = 3;
    assertEquals(17, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case4() {
    int M = 100;
    int C = 100;
    int R = 20;
    assertEquals(21, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case5() {
    int M = 100;
    int C = 99;
    int R = 2;
    assertEquals(395, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case6() {
    int M = 100;
    int C = 100;
    int R = 100;
    assertEquals(5, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case7() {
    int M = 100;
    int C = 100;
    int R = 99;
    assertEquals(5, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case8() {
    int M = 100;
    int C = 100;
    int R = 60;
    assertEquals(7, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case9() {
    int M = 100;
    int C = 99;
    int R = 4;
    assertEquals(131, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case10() {
    int M = 50;
    int C = 50;
    int R = 100;
    assertEquals(1, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case11() {
    int M = 23;
    int C = 7;
    int R = 10;
    assertEquals(7, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case12() {
    int M = 84;
    int C = 17;
    int R = 26;
    assertEquals(7, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case13() {
    int M = 77;
    int C = 21;
    int R = 30;
    assertEquals(7, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case14() {
    int M = 48;
    int C = 15;
    int R = 9;
    assertEquals(15, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case15() {
    int M = 35;
    int C = 18;
    int R = 8;
    assertEquals(15, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case16() {
    int M = 36;
    int C = 27;
    int R = 10;
    assertEquals(13, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case17() {
    int M = 65;
    int C = 11;
    int R = 35;
    assertEquals(5, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case18() {
    int M = 55;
    int C = 35;
    int R = 44;
    assertEquals(5, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case19() {
    int M = 59;
    int C = 57;
    int R = 8;
    assertEquals(33, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case20() {
    int M = 76;
    int C = 46;
    int R = 31;
    assertEquals(9, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case21() {
    int M = 99;
    int C = 21;
    int R = 6;
    assertEquals(47, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case22() {
    int M = 95;
    int C = 63;
    int R = 28;
    assertEquals(11, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case23() {
    int M = 93;
    int C = 19;
    int R = 5;
    assertEquals(55, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case24() {
    int M = 90;
    int C = 43;
    int R = 22;
    assertEquals(13, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case25() {
    int M = 74;
    int C = 16;
    int R = 49;
    assertEquals(3, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case26() {
    int M = 39;
    int C = 37;
    int R = 17;
    assertEquals(9, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case27() {
    int M = 16;
    int C = 9;
    int R = 3;
    assertEquals(23, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case28() {
    int M = 98;
    int C = 51;
    int R = 19;
    assertEquals(17, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case29() {
    int M = 43;
    int C = 9;
    int R = 11;
    assertEquals(11, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case30() {
    int M = 57;
    int C = 48;
    int R = 12;
    assertEquals(19, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case31() {
    int M = 41;
    int C = 40;
    int R = 39;
    assertEquals(5, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case32() {
    int M = 14;
    int C = 2;
    int R = 2;
    assertEquals(29, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case33() {
    int M = 38;
    int C = 8;
    int R = 24;
    assertEquals(3, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case34() {
    int M = 95;
    int C = 74;
    int R = 8;
    assertEquals(47, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case35() {
    int M = 52;
    int C = 9;
    int R = 8;
    assertEquals(17, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case36() {
    int M = 68;
    int C = 59;
    int R = 40;
    assertEquals(7, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case37() {
    int M = 96;
    int C = 24;
    int R = 3;
    assertEquals(119, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case38() {
    int M = 83;
    int C = 39;
    int R = 47;
    assertEquals(5, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case39() {
    int M = 28;
    int C = 11;
    int R = 6;
    assertEquals(15, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case40() {
    int M = 77;
    int C = 47;
    int R = 22;
    assertEquals(11, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case41() {
    int M = 9;
    int C = 2;
    int R = 4;
    assertEquals(7, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case42() {
    int M = 88;
    int C = 72;
    int R = 28;
    assertEquals(11, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case43() {
    int M = 61;
    int C = 23;
    int R = 11;
    assertEquals(17, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case44() {
    int M = 18;
    int C = 15;
    int R = 14;
    assertEquals(5, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case45() {
    int M = 93;
    int C = 59;
    int R = 100;
    assertEquals(3, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case46() {
    int M = 19;
    int C = 4;
    int R = 4;
    assertEquals(15, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case47() {
    int M = 55;
    int C = 2;
    int R = 12;
    assertEquals(11, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case48() {
    int M = 62;
    int C = 52;
    int R = 3;
    assertEquals(113, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case49() {
    int M = 98;
    int C = 52;
    int R = 35;
    assertEquals(9, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case50() {
    int M = 5;
    int C = 4;
    int R = 2;
    assertEquals(15, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case51() {
    int M = 14;
    int C = 5;
    int R = 4;
    assertEquals(11, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case52() {
    int M = 74;
    int C = 72;
    int R = 4;
    assertEquals(97, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case53() {
    int M = 50;
    int C = 11;
    int R = 14;
    assertEquals(9, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case54() {
    int M = 85;
    int C = 60;
    int R = 8;
    assertEquals(41, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case55() {
    int M = 9;
    int C = 7;
    int R = 7;
    assertEquals(5, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case56() {
    int M = 97;
    int C = 48;
    int R = 10;
    assertEquals(31, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case57() {
    int M = 60;
    int C = 27;
    int R = 34;
    assertEquals(5, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case58() {
    int M = 73;
    int C = 14;
    int R = 44;
    assertEquals(3, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case59() {
    int M = 80;
    int C = 73;
    int R = 42;
    assertEquals(7, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case60() {
    int M = 53;
    int C = 14;
    int R = 40;
    assertEquals(3, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case61() {
    int M = 5;
    int C = 5;
    int R = 3;
    assertEquals(11, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case62() {
    int M = 6;
    int C = 6;
    int R = 3;
    assertEquals(-1, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case63() {
    int M = 100;
    int C = 100;
    int R = 4;
    assertEquals(197, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case64() {
    int M = 17;
    int C = 17;
    int R = 2;
    assertEquals(-1, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case65() {
    int M = 63;
    int C = 63;
    int R = 3;
    assertEquals(-1, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case66() {
    int M = 99;
    int C = 99;
    int R = 23;
    assertEquals(19, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case67() {
    int M = 100;
    int C = 25;
    int R = 13;
    assertEquals(21, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case68() {
    int M = 99;
    int C = 99;
    int R = 23;
    assertEquals(19, cannibals.minCrossings(M, C, R));
  }

  @Test
  public void case69() {
    int M = 100;
    int C = 25;
    int R = 13;
    assertEquals(21, cannibals.minCrossings(M, C, R));
  }

}
