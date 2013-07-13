package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class QueenInterferenceTest {
  QueenInterference queeninterference = new QueenInterference();

  @Test
  public void case1() {
    int n = 4;
    assertEquals(34, queeninterference.numSteps(n));
  }

  @Test
  public void case2() {
    int n = 5;
    assertEquals(4, queeninterference.numSteps(n));
  }

  @Test
  public void case3() {
    int n = 6;
    assertEquals(340, queeninterference.numSteps(n));
  }

  @Test
  public void case4() {
    int n = 7;
    assertEquals(6, queeninterference.numSteps(n));
  }

  @Test
  public void case5() {
    int n = 66;
    assertEquals(89, queeninterference.numSteps(n));
  }

  @Test
  public void case6() {
    int n = 19;
    assertEquals(475, queeninterference.numSteps(n));
  }

  @Test
  public void case7() {
    int n = 20;
    assertEquals(90, queeninterference.numSteps(n));
  }

  @Test
  public void case8() {
    int n = 30;
    assertEquals(53, queeninterference.numSteps(n));
  }

  @Test
  public void case9() {
    int n = 40;
    assertEquals(60, queeninterference.numSteps(n));
  }

  @Test
  public void case10() {
    int n = 50;
    assertEquals(79, queeninterference.numSteps(n));
  }

  @Test
  public void case11() {
    int n = 15;
    assertEquals(38, queeninterference.numSteps(n));
  }

  @Test
  public void case12() {
    int n = 14;
    assertEquals(32, queeninterference.numSteps(n));
  }

  @Test
  public void case13() {
    int n = 55;
    assertEquals(41, queeninterference.numSteps(n));
  }

  @Test
  public void case14() {
    int n = 9;
    assertEquals(8, queeninterference.numSteps(n));
  }

  @Test
  public void case15() {
    int n = 10;
    assertEquals(17, queeninterference.numSteps(n));
  }

  @Test
  public void case16() {
    int n = 100;
    assertEquals(148, queeninterference.numSteps(n));
  }

  @Test
  public void case17() {
    int n = 6;
    assertEquals(340, queeninterference.numSteps(n));
  }

  @Test
  public void case18() {
    int n = 8;
    assertEquals(101, queeninterference.numSteps(n));
  }

  @Test
  public void case19() {
    int n = 11;
    assertEquals(254, queeninterference.numSteps(n));
  }

  @Test
  public void case20() {
    int n = 16;
    assertEquals(146, queeninterference.numSteps(n));
  }

  @Test
  public void case21() {
    int n = 19;
    assertEquals(475, queeninterference.numSteps(n));
  }

  @Test
  public void case22() {
    int n = 25;
    assertEquals(101, queeninterference.numSteps(n));
  }

  @Test
  public void case23() {
    int n = 27;
    assertEquals(304, queeninterference.numSteps(n));
  }

  @Test
  public void case24() {
    int n = 29;
    assertEquals(120, queeninterference.numSteps(n));
  }

  @Test
  public void case25() {
    int n = 31;
    assertEquals(127, queeninterference.numSteps(n));
  }

  @Test
  public void case26() {
    int n = 32;
    assertEquals(108, queeninterference.numSteps(n));
  }

  @Test
  public void case27() {
    int n = 33;
    assertEquals(156, queeninterference.numSteps(n));
  }

  @Test
  public void case28() {
    int n = 35;
    assertEquals(105, queeninterference.numSteps(n));
  }

  @Test
  public void case29() {
    int n = 45;
    assertEquals(132, queeninterference.numSteps(n));
  }

  @Test
  public void case30() {
    int n = 47;
    assertEquals(122, queeninterference.numSteps(n));
  }

  @Test
  public void case31() {
    int n = 49;
    assertEquals(147, queeninterference.numSteps(n));
  }

  @Test
  public void case32() {
    int n = 51;
    assertEquals(136, queeninterference.numSteps(n));
  }

  @Test
  public void case33() {
    int n = 53;
    assertEquals(122, queeninterference.numSteps(n));
  }

  @Test
  public void case34() {
    int n = 56;
    assertEquals(121, queeninterference.numSteps(n));
  }

  @Test
  public void case35() {
    int n = 62;
    assertEquals(149, queeninterference.numSteps(n));
  }

  @Test
  public void case36() {
    int n = 65;
    assertEquals(177, queeninterference.numSteps(n));
  }

  @Test
  public void case37() {
    int n = 69;
    assertEquals(129, queeninterference.numSteps(n));
  }

  @Test
  public void case38() {
    int n = 70;
    assertEquals(163, queeninterference.numSteps(n));
  }

  @Test
  public void case39() {
    int n = 72;
    assertEquals(163, queeninterference.numSteps(n));
  }

  @Test
  public void case40() {
    int n = 73;
    assertEquals(106, queeninterference.numSteps(n));
  }

  @Test
  public void case41() {
    int n = 74;
    assertEquals(127, queeninterference.numSteps(n));
  }

  @Test
  public void case42() {
    int n = 75;
    assertEquals(161, queeninterference.numSteps(n));
  }

  @Test
  public void case43() {
    int n = 76;
    assertEquals(101, queeninterference.numSteps(n));
  }

  @Test
  public void case44() {
    int n = 77;
    assertEquals(112, queeninterference.numSteps(n));
  }

  @Test
  public void case45() {
    int n = 79;
    assertEquals(126, queeninterference.numSteps(n));
  }

  @Test
  public void case46() {
    int n = 80;
    assertEquals(155, queeninterference.numSteps(n));
  }

  @Test
  public void case47() {
    int n = 81;
    assertEquals(190, queeninterference.numSteps(n));
  }

  @Test
  public void case48() {
    int n = 83;
    assertEquals(123, queeninterference.numSteps(n));
  }

  @Test
  public void case49() {
    int n = 84;
    assertEquals(170, queeninterference.numSteps(n));
  }

  @Test
  public void case50() {
    int n = 85;
    assertEquals(137, queeninterference.numSteps(n));
  }

  @Test
  public void case51() {
    int n = 86;
    assertEquals(115, queeninterference.numSteps(n));
  }

  @Test
  public void case52() {
    int n = 87;
    assertEquals(138, queeninterference.numSteps(n));
  }

  @Test
  public void case53() {
    int n = 88;
    assertEquals(173, queeninterference.numSteps(n));
  }

  @Test
  public void case54() {
    int n = 89;
    assertEquals(127, queeninterference.numSteps(n));
  }

  @Test
  public void case55() {
    int n = 90;
    assertEquals(102, queeninterference.numSteps(n));
  }

  @Test
  public void case56() {
    int n = 91;
    assertEquals(103, queeninterference.numSteps(n));
  }

  @Test
  public void case57() {
    int n = 92;
    assertEquals(116, queeninterference.numSteps(n));
  }

  @Test
  public void case58() {
    int n = 93;
    assertEquals(152, queeninterference.numSteps(n));
  }

  @Test
  public void case59() {
    int n = 94;
    assertEquals(169, queeninterference.numSteps(n));
  }

  @Test
  public void case60() {
    int n = 95;
    assertEquals(146, queeninterference.numSteps(n));
  }

  @Test
  public void case61() {
    int n = 96;
    assertEquals(102, queeninterference.numSteps(n));
  }

  @Test
  public void case62() {
    int n = 97;
    assertEquals(150, queeninterference.numSteps(n));
  }

  @Test
  public void case63() {
    int n = 98;
    assertEquals(141, queeninterference.numSteps(n));
  }

  @Test
  public void case64() {
    int n = 99;
    assertEquals(136, queeninterference.numSteps(n));
  }

  @Test
  public void case65() {
    int n = 100;
    assertEquals(148, queeninterference.numSteps(n));
  }

  @Test
  public void case66() {
    int n = 7;
    assertEquals(6, queeninterference.numSteps(n));
  }

  @Test
  public void case67() {
    int n = 19;
    assertEquals(475, queeninterference.numSteps(n));
  }

  @Test
  public void case68() {
    int n = 100;
    assertEquals(148, queeninterference.numSteps(n));
  }

}
