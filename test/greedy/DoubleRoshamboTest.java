package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class DoubleRoshamboTest {
  DoubleRoshambo doubleroshambo = new DoubleRoshambo();

  @Test
  public void case1() {
    String[] A = { "RR" };
    String[] E = { "SS" };
    assertEquals(2, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case2() {
    String[] A = { "SR", "PP" };
    String[] E = { "PR", "RS" };
    assertEquals(1, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case3() {
    String[] A = { "PP", "PP", "PP", "PP" };
    String[] E = { "RR", "PR", "SS", "SP" };
    assertEquals(3, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case4() {
    String[] A = { "PS", "RS", "PP", "SP", "RR", "SS", "SP" };
    String[] E = { "RP", "SP", "RR", "SR", "RS", "SP", "SS" };
    assertEquals(10, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case5() {
    String[] A = { "RS" };
    String[] E = { "RS" };
    assertEquals(0, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case6() {
    String[] A = { "RR" };
    String[] E = { "SS" };
    assertEquals(2, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case7() {
    String[] A = { "PR" };
    String[] E = { "PS" };
    assertEquals(1, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case8() {
    String[] A = { "RS", "PS" };
    String[] E = { "RP", "PS" };
    assertEquals(2, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case9() {
    String[] A = { "PS", "RS" };
    String[] E = { "PS", "RP" };
    assertEquals(2, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case10() {
    String[] A = { "RR", "RP", "RS", "PR", "PP", "PS", "SR", "SP", "SS" };
    String[] E = { "SS", "SR", "SP", "RS", "RR", "RP", "PS", "PR", "PP" };
    assertEquals(18, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case11() {
    String[] A = { "RR", "PP", "SS" };
    String[] E = { "RS", "PR", "SP" };
    assertEquals(3, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case12() {
    String[] A = { "RR", "RS", "RP", "SR", "SS", "SP" };
    String[] E = { "RS", "RP", "RR", "SS", "SP", "SR" };
    assertEquals(6, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case13() {
    String[] A = { "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS" };
    String[] E = { "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP", "PP" };
    assertEquals(100, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case14() {
    String[] A = { "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP" };
    String[] E = { "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR" };
    assertEquals(50, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case15() {
    String[] A = { "PP", "SP", "PP", "SR", "RR", "SP", "PR", "SS", "SS", "SS", "PS", "PS" };
    String[] E = { "PR", "RR", "PP", "RS", "PR", "RP", "PS", "RP", "SP", "SR", "RS", "SR" };
    assertEquals(18, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case16() {
    String[] A = { "SR", "RR", "SS", "PS", "RP", "SP", "RR", "PP", "PP", "PP", "RS", "SR", "PS", "RP", "SP", "PP", "RS", "PR", "PS", "RS", "RR", "RS", "PP", "SS", "RP", "SR", "SP", "RS", "SR", "RR", "SP", "PP", "RS", "RR", "RR", "PP", "SS", "PS", "RP", "RR", "PP", "PP", "RR", "SR", "PR", "SS", "PP", "RS", "SP", "PS" };
    String[] E = { "SR", "RR", "PS", "RS", "PR", "PP", "SP", "PR", "PS", "RR", "SR", "SP", "PP", "PS", "PS", "RS", "RS", "RS", "SR", "SP", "SP", "SP", "SR", "SS", "PR", "PR", "PP", "PR", "RP", "PP", "RS", "RR", "PS", "SS", "RP", "SP", "SR", "PR", "RS", "RR", "SP", "RS", "PP", "SR", "PP", "RP", "RP", "SR", "RR", "PS" };
    assertEquals(83, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case17() {
    String[] A = { "SP", "SS", "RR", "PP", "RP", "PS", "PP", "SR", "RS", "PR", "RR", "SS", "RS", "SR", "SP", "RS", "SP", "SS", "RR", "SR", "PP", "PS", "SR", "SR", "RP", "RS", "RR", "RR", "PR", "PP", "RP", "SR", "PP", "RS", "PR", "PS" };
    String[] E = { "PP", "RS", "RR", "RP", "RS", "SR", "SP", "SS", "RP", "PP", "RS", "RP", "PP", "PR", "PR", "SR", "RP", "PS", "RP", "RP", "RR", "SS", "RS", "SS", "SP", "RP", "SS", "PR", "SP", "RR", "PP", "SR", "PR", "PP", "RR", "SP" };
    assertEquals(59, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case18() {
    String[] A = { "SS", "PP", "SS", "RR", "PP", "PS", "RP", "PS", "SS", "SP", "RR", "SP", "PS", "PP", "PS", "RP", "PR", "RP", "SS", "SP", "RR", "PP", "SP", "SS", "PR", "SP", "SP", "RP", "SR", "SR", "PP", "PR", "PR", "RR", "PP", "PS" };
    String[] E = { "PP", "SS", "PP", "SR", "RP", "PR", "SR", "SR", "PS", "PR", "PP", "RP", "RS", "PR", "RR", "RS", "SR", "RS", "RP", "PR", "PR", "RS", "RR", "SR", "PS", "RP", "PP", "PR", "PS", "RP", "SR", "SP", "PR", "RS", "PS", "PR" };
    assertEquals(60, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case19() {
    String[] A = { "RR", "PP", "RR", "RR", "SP", "RS", "RP", "SR", "RP", "SS", "SP", "SS", "PS", "PR", "PP", "SS", "SP", "RP", "RP", "RS", "RR", "SR", "SS", "PS", "SP", "PR" };
    String[] E = { "PR", "SS", "SS", "PS", "RR", "RS", "PR", "SR", "PS", "SP", "SR", "SS", "RP", "RP", "PP", "PP", "RP", "SS", "RR", "SR", "PP", "RP", "RP", "SP", "PS", "PR" };
    assertEquals(45, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case20() {
    String[] A = { "RS", "PS", "PR", "PS", "PP", "SR", "RR", "PP", "SR" };
    String[] E = { "RS", "PR", "PS", "SS", "RR", "PS", "PR", "RR", "RP" };
    assertEquals(14, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case21() {
    String[] A = { "RP", "SS", "RR", "PS", "SP", "SR", "SS", "RR", "RR", "PS", "SP", "RS", "PP", "SR", "RS", "RR", "PP", "RR", "SS", "PS", "PR", "RS", "SS", "RP", "SS", "PP", "RS", "SS", "RP", "SR", "RP", "PR", "RP", "SR", "SR", "PS", "PR", "SR" };
    String[] E = { "SP", "SP", "RS", "PS", "SS", "SR", "SS", "RR", "PS", "SR", "PP", "PP", "PS", "RS", "SS", "RS", "SS", "RS", "PP", "PS", "RS", "RP", "RS", "SP", "SP", "SR", "SR", "PP", "PP", "RP", "PP", "PS", "RS", "RR", "RR", "SP", "PS", "RR" };
    assertEquals(66, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case22() {
    String[] A = { "SS", "PS", "RP", "SR", "SP", "PP", "PR", "PR", "SP", "SS", "RP", "PP", "PR", "PR", "SP", "PS", "RR", "SS" };
    String[] E = { "PS", "SR", "RR", "PS", "SS", "RS", "SR", "SP", "SR", "RR", "SR", "RS", "RP", "SS", "PR", "PP", "SS", "SS" };
    assertEquals(26, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case23() {
    String[] A = { "PS", "PS", "SP", "PS", "SS", "RR", "RR", "PS", "PR", "SS", "SS", "SS", "RR", "RR", "PR", "SR", "RR", "RR", "SP", "SP", "SP", "SS", "SR", "RP", "SP", "SS", "PP", "SR", "RS", "RP", "RR", "RS", "SS", "PR", "SR", "RR", "SP", "SP", "RP", "RP", "SP", "PR", "SS", "RS" };
    String[] E = { "RS", "RS", "SP", "PP", "PR", "PR", "SS", "SP", "PS", "RS", "PS", "RR", "PR", "SS", "SR", "SR", "RS", "PS", "PS", "PP", "SP", "PS", "RS", "SS", "SP", "SR", "SP", "RS", "PS", "PS", "SR", "SP", "RR", "SP", "RP", "RS", "SS", "PP", "RR", "SR", "RP", "RR", "SS", "SS" };
    assertEquals(67, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case24() {
    String[] A = { "RS", "PP", "PS", "PS", "PP", "RR", "RS", "RS", "RP", "SS", "SR", "PP", "SP", "PP", "PS", "SS", "SS", "RS", "RS", "SR", "SP", "RS", "RR", "SP", "SS", "SP", "RS", "RP", "PS" };
    String[] E = { "PP", "SS", "PR", "PS", "RP", "PP", "RS", "SS", "PP", "SS", "PS", "SP", "PS", "SR", "PP", "PS", "RP", "RS", "SS", "SP", "SR", "RR", "PP", "SS", "SR", "PR", "RR", "RR", "SR" };
    assertEquals(41, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case25() {
    String[] A = { "RR", "PR", "SP", "SS", "SP", "PS", "PR", "PS", "RR", "RR", "PS", "PP", "SR", "SS", "SS", "RR", "RS", "PR", "SP", "SR", "PS", "RR", "PR", "SS", "RS", "RP", "RP", "SR", "SR", "PP", "SR", "PR", "SR", "SP", "SR", "SS", "PR", "SP", "RS", "SP", "RS", "RR", "RP", "RS", "SS", "RS", "RR", "PR" };
    String[] E = { "SS", "PS", "PS", "SS", "PS", "PS", "RS", "RS", "SP", "SS", "SR", "SS", "PS", "PS", "PR", "SS", "PP", "SP", "RR", "PS", "RS", "SR", "PR", "PR", "SR", "SP", "PR", "SS", "PR", "SR", "PP", "SS", "SR", "PP", "RS", "RR", "SS", "SR", "SR", "RS", "SR", "PR", "PS", "SP", "SR", "PP", "SR", "SR" };
    assertEquals(77, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case26() {
    String[] A = { "SS", "SR", "SS", "PS", "RS", "PS", "PS", "RR", "SR", "PP", "PP", "RR", "PR", "SS", "PS", "SS", "PP", "PS", "SS", "SR" };
    String[] E = { "RR", "RS", "PP", "PS", "RR", "SP", "SS", "PR", "PR", "RR", "RR", "SS", "PP", "SP", "PP", "PS", "PR", "RP", "RP", "SS" };
    assertEquals(30, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case27() {
    String[] A = { "RS", "PP", "PP", "SR", "RR", "RP", "PP", "RS", "SP", "PR" };
    String[] E = { "SR", "SS", "SP", "SS", "SR", "RP", "RR", "SR", "RR", "RS" };
    assertEquals(15, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case28() {
    String[] A = { "SR", "RP", "PS", "RP", "SR", "RS", "PP", "SR", "SR", "RP", "PP", "SR", "RS", "PR", "RS", "SP", "SP", "RP", "PP", "PR", "RR", "RP", "PR", "RS", "RS", "RS", "RS", "PR", "SP", "PS", "RR", "SP", "RR", "SS", "SP" };
    String[] E = { "PP", "RS", "SP", "RS", "RR", "PP", "RS", "RP", "PS", "RP", "RR", "PS", "RP", "RS", "PR", "SS", "SR", "PR", "RR", "SS", "PR", "PR", "SS", "RR", "PR", "SP", "SR", "PP", "SR", "RP", "PR", "PS", "SP", "RS", "RR" };
    assertEquals(58, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case29() {
    String[] A = { "SR", "PR", "SP", "RR", "PP", "PS", "PR", "PS", "SS", "RS", "SP", "PR", "RP", "RR", "SP", "PP", "RS", "RR", "SP", "PR", "SS", "PR", "RR", "SP", "SP", "RS", "RP", "SP", "PS", "PS", "PP", "PR", "PP", "RR", "RP", "PR", "RR", "RR", "PR", "PS", "PR", "PR", "RR", "PP" };
    String[] E = { "PR", "SP", "RS", "PS", "RP", "RS", "RS", "SR", "RR", "SP", "PR", "PR", "RP", "PR", "SP", "RS", "SP", "SP", "SP", "PR", "SP", "RP", "SP", "SR", "SP", "PP", "SR", "RS", "SR", "PR", "SP", "PP", "PR", "RS", "RS", "SS", "SP", "SP", "PS", "SS", "PS", "RS", "RR", "SR" };
    assertEquals(64, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case30() {
    String[] A = { "SP", "SS", "RS", "SP", "RS" };
    String[] E = { "SP", "PS", "PP", "PR", "RP" };
    assertEquals(7, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case31() {
    String[] A = { "PP", "RS", "SP", "PR", "PR", "RP", "RS", "SR", "RS", "SP", "SR", "SR", "PS", "SS", "RP", "RP", "RR", "RP", "RP", "SP", "SS", "SR", "RR", "PS", "PP", "SP", "SR", "RP", "RP", "RP", "PS", "PP", "RP", "PR", "SR", "RS", "SR", "SR", "RS", "PP" };
    String[] E = { "RS", "PP", "RR", "RP", "SS", "SR", "RS", "PR", "RP", "SR", "PS", "RS", "SS", "RR", "RR", "SR", "RP", "SS", "RS", "RS", "SR", "RS", "PR", "RR", "PR", "SS", "RS", "RP", "SP", "RR", "RR", "SR", "PP", "RR", "SS", "SR", "SS", "PP", "RS", "PP" };
    assertEquals(58, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case32() {
    String[] A = { "RS", "SP", "RS", "PR", "SP", "SR", "PP", "SS", "RS" };
    String[] E = { "PR", "PP", "SS", "RP", "RS", "SP", "RP", "SS", "SS" };
    assertEquals(11, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case33() {
    String[] A = { "RS", "SS", "SP", "RP", "PS", "RR", "SS", "PP", "RS" };
    String[] E = { "SS", "SS", "PS", "SP", "PS", "SS", "RP", "RP", "PP" };
    assertEquals(9, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case34() {
    String[] A = { "RP", "PR", "SS", "SP", "SP", "PS", "RS", "SS", "RP", "RR", "RR", "SP", "RP" };
    String[] E = { "RR", "SP", "SP", "PS", "RR", "RR", "PP", "SS", "PP", "SR", "PP", "SR", "SS" };
    assertEquals(17, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case35() {
    String[] A = { "RS", "PR", "RR", "SR", "RP", "PP", "RP", "RR", "PS", "RR", "PP", "PR", "RS", "SS", "SS", "PS", "PS", "RP", "RR", "PR", "PR", "PS", "SP", "PR" };
    String[] E = { "SS", "PR", "RS", "SR", "PS", "SR", "PP", "RP", "PS", "RS", "PP", "RP", "SP", "SR", "SR", "SS", "SP", "SR", "SP", "RP", "PS", "PP", "SR", "PR" };
    assertEquals(36, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case36() {
    String[] A = { "PR", "RS", "SP", "PS", "RP", "RR", "SS", "RP", "SP", "PP", "SR", "SP" };
    String[] E = { "SR", "PS", "PR", "PR", "RS", "PS", "SR", "PP", "PS", "SR", "PR", "RS" };
    assertEquals(17, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case37() {
    String[] A = { "RP", "PR", "RS", "SR", "PR", "RS", "SR", "SR", "PR", "PR", "PR", "SS", "RS", "PP", "RS", "PR", "PP", "PR", "SR", "RS", "RP", "PR", "RP", "RS", "RS", "PR" };
    String[] E = { "RP", "PP", "RP", "SR", "RR", "SP", "PS", "SR", "RS", "RP", "SP", "SP", "PR", "PR", "PS", "RP", "PP", "SR", "RR", "SP", "PP", "PS", "RR", "RS", "SR", "PP" };
    assertEquals(33, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case38() {
    String[] A = { "RP", "PR", "PP", "PP", "SP", "RR", "SP" };
    String[] E = { "RR", "PP", "SR", "SP", "PS", "PR", "SP" };
    assertEquals(7, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case39() {
    String[] A = { "SP", "PR", "RS", "RR", "SP", "PP", "PS", "PR", "SR", "RP", "PS", "SR", "PP", "RS", "SS", "PR", "PS", "RR", "PR", "SP", "RP" };
    String[] E = { "SP", "SR", "SP", "RP", "RP", "SS", "PS", "SP", "PR", "RS", "SR", "RS", "RP", "PS", "SP", "PP", "PS", "SR", "RR", "SS", "RR" };
    assertEquals(36, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case40() {
    String[] A = { "SR", "SS", "PR", "RS", "PP", "RP", "PP", "SR", "SS", "RS", "SS", "RP", "SS", "RS", "RP", "PP", "SR", "RR", "RS", "PP", "RR", "SS", "PR", "PP", "SS", "RS", "RR", "RS" };
    String[] E = { "SR", "PR", "RR", "PS", "SS", "SR", "RR", "RR", "PS", "RP", "SP", "PS", "RR", "SP", "RR", "SR", "RP", "RP", "RS", "PP", "PR", "PP", "PS", "RR", "PP", "SS", "RP", "SS" };
    assertEquals(45, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case41() {
    String[] A = { "RS", "RP", "RR", "RR", "PS", "SS", "RS", "PS", "RS", "SP", "PR", "SP", "PS", "SR", "PS", "SS", "SS", "RP", "PS", "SR", "SS", "PS" };
    String[] E = { "PS", "PR", "SP", "SS", "SS", "PS", "PR", "PS", "RR", "SS", "PS", "PS", "PP", "SP", "PR", "SP", "SP", "SR", "RS", "SS", "PS", "RP" };
    assertEquals(28, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case42() {
    String[] A = { "SS", "RR", "RP", "SS", "PR", "RP", "SS", "PR", "PS", "RR", "RP", "SP", "RS", "RP", "RP", "PR" };
    String[] E = { "PS", "SP", "SR", "SR", "PP", "SP", "SS", "PR", "RS", "PP", "SP", "RP", "SP", "PS", "RR", "RR" };
    assertEquals(23, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case43() {
    String[] A = { "RS", "PP", "PP", "RS", "RP" };
    String[] E = { "PS", "SS", "RR", "RR", "SS" };
    assertEquals(4, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case44() {
    String[] A = { "SP", "RR", "RS", "PR", "SR", "PR", "RR", "RS", "PR", "SR", "SR", "RR", "SP", "SR", "SR", "PR" };
    String[] E = { "RS", "RP", "RP", "RS", "RS", "SS", "RS", "SS", "PP", "SR", "PR", "PS", "SP", "PS", "PS", "RS" };
    assertEquals(25, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case45() {
    String[] A = { "RP", "SS", "SP", "SR", "PP", "SP", "SR", "SS", "RP", "SP", "RP", "PR", "SP", "PR", "RR", "RR", "SP", "RS", "SP", "PR", "RP", "PS", "RP", "SR", "SR", "SP", "PP", "PR", "PR", "PP", "RP", "PP", "SS", "RR", "RS", "PP" };
    String[] E = { "PR", "RS", "RP", "RR", "PR", "SP", "PP", "RP", "PR", "PP", "RP", "SR", "SR", "PR", "PS", "RS", "SR", "PR", "SP", "RR", "SS", "SP", "RS", "RS", "RS", "PS", "SS", "RR", "SR", "PP", "RS", "SR", "PP", "SR", "RP", "PP" };
    assertEquals(59, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case46() {
    String[] A = { "RP", "RP", "PS", "SP", "SR", "RR", "PS", "SP", "PR", "RP", "PP", "PP", "SP", "SP", "PR", "SR", "SP", "PP", "PS", "RS", "PP", "SR", "RP", "RP", "PP" };
    String[] E = { "RR", "RP", "RP", "SP", "PP", "PR", "RP", "RS", "RR", "PS", "SP", "SR", "RP", "SS", "RR", "RS", "PS", "PR", "RR", "RS", "RR", "SP", "PP", "PP", "RR" };
    assertEquals(35, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case47() {
    String[] A = { "SR", "PP", "PP", "SS", "SP", "SR", "SP", "RS" };
    String[] E = { "SS", "RP", "PR", "RS", "SS", "RR", "RP", "RP" };
    assertEquals(7, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case48() {
    String[] A = { "PR", "SS", "RS", "PP", "SP", "SR", "PR", "SR", "RR", "PR", "PS", "SS", "RR", "RP", "SP", "SP", "RS", "SP", "RP", "PR", "PR", "RR", "PS", "PS", "RS", "PP", "RS", "RP", "SP", "RS", "PR", "PS", "PS", "SP", "RP", "PS", "RR", "SS", "SR", "SR", "RP" };
    String[] E = { "RP", "PS", "PS", "PR", "PR", "RR", "SR", "RR", "SS", "RP", "PS", "PS", "SP", "RP", "RS", "RP", "SP", "RS", "RR", "RR", "RR", "SR", "PS", "PR", "SS", "SP", "RS", "RS", "RS", "PS", "RR", "PS", "RP", "SP", "SS", "PP", "PR", "PR", "RS", "SS", "RP" };
    assertEquals(71, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case49() {
    String[] A = { "RP", "SR", "SS", "PP", "PR", "SS", "SS", "RS", "RP", "SP", "RP", "RR", "SR", "SS", "RS", "SS", "RR", "PP", "SR" };
    String[] E = { "RP", "RS", "RR", "PR", "RS", "SR", "RR", "PP", "RP", "PR", "SS", "RS", "PR", "PR", "SS", "RS", "SR", "SP", "SR" };
    assertEquals(23, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case50() {
    String[] A = { "SP", "RR", "PS", "SR", "SS", "PS", "SP" };
    String[] E = { "SS", "PP", "RR", "SP", "SP", "RS", "PR" };
    assertEquals(6, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case51() {
    String[] A = { "RR", "PR", "PR", "SR", "SS", "SP", "RS", "SP", "RR", "RP", "SS", "SS", "RR", "RP", "RS", "RP", "RS", "SS", "RP", "RS" };
    String[] E = { "RR", "SP", "SR", "RP", "PP", "RP", "RS", "PR", "PP", "PP", "RP", "PP", "SR", "RR", "RS", "RP", "PP", "PR", "PR", "SP" };
    assertEquals(28, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case52() {
    String[] A = { "RR", "SS", "PP", "RR", "RS", "SR", "RP", "RS", "RR", "SS", "RP", "RS", "SR", "PS", "SR", "PP", "RP", "PS", "RP", "RS", "SR", "PR", "SP", "PS", "PR", "SS", "PR", "RR", "RS", "PP", "PR", "RS", "SP", "SP", "RP", "SS", "SR", "SR", "PR", "RP", "PS", "RR", "SS", "PP", "RR", "SP", "PR", "SS", "PS" };
    String[] E = { "SS", "RR", "RR", "SP", "PP", "PR", "RP", "SS", "RR", "RS", "SP", "SR", "PP", "SP", "RS", "PS", "RP", "PP", "PP", "RP", "SS", "SS", "PR", "SS", "PP", "PS", "RR", "SP", "PR", "SS", "SR", "PS", "SR", "SR", "RR", "SP", "RR", "PP", "RS", "SR", "SS", "SR", "SP", "RP", "SR", "PR", "SS", "SS", "PP" };
    assertEquals(88, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case53() {
    String[] A = { "PP", "RP", "SS", "PS", "PP", "PR", "RP", "RR", "SS", "RP" };
    String[] E = { "PP", "RR", "RP", "PP", "SP", "RP", "RS", "SP", "SP", "RR" };
    assertEquals(12, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case54() {
    String[] A = { "PS", "RS", "PS", "SR", "PP", "PR", "RS", "SR", "SS", "SP", "RS", "PP", "SP", "RS", "RS", "RS", "RR", "PS", "PR", "PP", "PP", "PR", "SR", "SS", "SR", "RR", "PR", "RS", "PS", "SR", "SR", "PP", "RP", "RR", "RP", "SS", "PS", "RR", "SP", "SR", "PP", "RS", "SP", "SS", "SP", "SP", "RP" };
    String[] E = { "SR", "RR", "SS", "SS", "RP", "SR", "PR", "PR", "SS", "PS", "SP", "PR", "PR", "PS", "PR", "SP", "PP", "PS", "PR", "PS", "PS", "PS", "SP", "SR", "SP", "SS", "PP", "RP", "PS", "PS", "SR", "PP", "SP", "PR", "RS", "PP", "RR", "RS", "SS", "PP", "PP", "SP", "PP", "PR", "PP", "RS", "RR" };
    assertEquals(82, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case55() {
    String[] A = { "RP", "PP", "RR", "RP", "RR", "RS", "SP", "SP", "PP", "PS", "SS", "RR" };
    String[] E = { "SP", "PP", "PP", "PP", "RS", "RP", "RP", "PR", "PR", "RS", "SP", "RR" };
    assertEquals(14, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case56() {
    String[] A = { "RS", "SR", "SP", "RS", "SS", "PP", "SR", "RS", "SS", "PP", "RR", "RS", "RP", "RR", "PR" };
    String[] E = { "SP", "RP", "PP", "SR", "PP", "RS", "SR", "SR", "PR", "SP", "PS", "RP", "PR", "SP", "RR" };
    assertEquals(22, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case57() {
    String[] A = { "PR", "SR" };
    String[] E = { "SS", "PP" };
    assertEquals(1, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case58() {
    String[] A = { "SS", "RP", "RR", "RP", "RR", "SS", "PR", "PS", "SP", "PP", "RP", "PS", "PP", "PS", "RS", "SS", "PP", "SS", "RS", "PS", "SR", "SP", "SR" };
    String[] E = { "PS", "SS", "PR", "PP", "RP", "SR", "PP", "PR", "SP", "RR", "PP", "RS", "PS", "RP", "SS", "RS", "SP", "RS", "SP", "RR", "PP", "RR", "PR" };
    assertEquals(38, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case59() {
    String[] A = { "PS", "SP", "RP", "SS", "PS", "SP", "PP", "PR", "SS", "RP", "RS" };
    String[] E = { "RP", "PR", "RS", "PR", "RS", "SR", "SR", "PP", "RR", "RP", "SS" };
    assertEquals(18, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case60() {
    String[] A = { "RR", "RR", "SR", "SS", "SP", "SR", "RR", "SP", "RP", "SS", "PR", "RR", "RS", "SP", "RR", "SR", "SS", "SR", "RR", "PR", "PP", "SP", "PS", "PP", "PP", "PR", "PS", "SS" };
    String[] E = { "SR", "SP", "PP", "SS", "SS", "RP", "SP", "RP", "RR", "SP", "PR", "PS", "RR", "PP", "PP", "RR", "PP", "PP", "PS", "SP", "SP", "RS", "PR", "SR", "RP", "PS", "RP", "SP" };
    assertEquals(39, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case61() {
    String[] A = { "SR", "SS", "SP", "SS", "PR", "RR", "PP", "RS", "PP", "SS", "SP", "RR", "PS", "RS", "PR", "PS", "SS", "SP", "SS", "SP", "SR", "SS", "RS", "PS", "RS", "RP", "PP", "SP", "PR", "RS", "SR", "RS", "RR", "RP", "RS", "SS", "PR", "SS", "SR" };
    String[] E = { "RR", "RR", "SR", "RS", "PR", "SP", "SR", "PR", "PR", "SP", "PP", "SR", "PR", "SR", "RP", "SP", "RS", "SR", "PS", "PR", "PS", "RS", "RP", "PP", "RS", "RR", "SS", "SP", "SP", "PP", "SP", "SR", "SS", "SP", "SR", "SS", "SP", "PR", "RS" };
    assertEquals(63, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case62() {
    String[] A = { "RR", "PS", "SP", "PS", "PS", "SR", "SS", "RP", "RP", "PS", "RR" };
    String[] E = { "PS", "SP", "PP", "SR", "RS", "RR", "PR", "PS", "SP", "SS", "RS" };
    assertEquals(12, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case63() {
    String[] A = { "SS", "PS", "SP", "RP", "PR", "SP", "RP", "PS", "SR", "RS", "PP", "PS", "SP", "PP", "PR", "PR", "RP", "SP", "RR", "SS", "RR", "PR", "SS", "SR", "RS", "RP", "PR", "PS", "SR", "PR", "PS", "SS", "PP", "PR", "RR", "PP", "SS" };
    String[] E = { "PR", "SS", "PR", "RS", "PP", "RP", "RS", "PS", "SP", "SR", "PS", "SS", "PR", "PP", "SR", "RP", "SS", "SR", "SR", "RP", "SR", "RP", "SR", "PR", "SR", "SR", "PP", "SS", "RR", "SP", "SR", "SR", "PP", "RS", "RS", "RR", "SP" };
    assertEquals(60, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case64() {
    String[] A = { "PS", "PR", "PP", "SS", "RP", "PR", "SP", "RS", "SR", "PR", "SS", "PP" };
    String[] E = { "RS", "RR", "RR", "SS", "RP", "SP", "RP", "SR", "SR", "RP", "SR", "RS" };
    assertEquals(16, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case65() {
    String[] A = { "RR" };
    String[] E = { "SS" };
    assertEquals(2, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case66() {
    String[] A = { "PP", "PP", "PP", "PP" };
    String[] E = { "RR", "PR", "SS", "SP" };
    assertEquals(3, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case67() {
    String[] A = { "PS", "RS", "PP", "SP", "RR", "SS", "SP" };
    String[] E = { "RP", "SP", "RR", "SR", "RS", "SP", "SS" };
    assertEquals(10, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case68() {
    String[] A = { "SS", "PR", "RP", "SP", "SP", "SP", "RR", "SS", "PS", "PP", "RS", "RS", "RR", "RS", "PP", "RP", "SR", "PP", "PS", "PR", "RP", "SS", "RR", "PR", "PS", "SR", "PS", "RP", "PR", "RR", "SS", "RP", "PR", "SP", "PP", "PR", "SS", "RR", "PP", "RP", "PS", "SP", "RS", "RS", "SP", "SP", "SS", "RR", "RP", "PR" };
    String[] E = { "PR", "RR", "PR", "RP", "RS", "PP", "SP", "SS", "SR", "RR", "RP", "SP", "PP", "RS", "SS", "SS", "PS", "PP", "RR", "SR", "SP", "SR", "PR", "PR", "PR", "RS", "PS", "PP", "SR", "RP", "SR", "SR", "SP", "PS", "PP", "PS", "RP", "PP", "PS", "RS", "PP", "PP", "RS", "RS", "SP", "SS", "SR", "SS", "PR", "RS" };
    assertEquals(91, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case69() {
    String[] A = { "SR", "PP" };
    String[] E = { "PR", "RS" };
    assertEquals(1, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case70() {
    String[] A = { "RR", "PP", "SS" };
    String[] E = { "RR", "RP", "PP" };
    assertEquals(4, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case71() {
    String[] A = { "SR", "PR", "SS", "SP" };
    String[] E = { "PS", "PR", "SP", "SS" };
    assertEquals(5, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case72() {
    String[] A = { "SR", "RP", "RR", "PS", "PR", "SP", "SS", "RP", "RP", "SS", "SS", "PS", "SR", "PS", "RS", "SS", "RS", "RR", "SP", "PR", "RR", "RS", "PS", "RP", "RR", "PR", "PS", "PR", "RR", "PP", "RR", "PR", "SR", "RS", "RP", "PP", "PP", "RR", "RS", "RS", "SS", "PP", "PR", "PR", "PR", "PR", "RS", "PR", "PP", "PP" };
    String[] E = { "PS", "RR", "PS", "SS", "PP", "SR", "RS", "RS", "RS", "PS", "SR", "SR", "PS", "SR", "PR", "PP", "PP", "PS", "RS", "RP", "SS", "PS", "PR", "PS", "SR", "PS", "RS", "RP", "RP", "SP", "PR", "RP", "SP", "SR", "SR", "RS", "SS", "SR", "RP", "SP", "SS", "RS", "SS", "RP", "RR", "SP", "SS", "RP", "SR", "SP" };
    assertEquals(82, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case73() {
    String[] A = { "RR", "SS" };
    String[] E = { "PP", "SS" };
    assertEquals(4, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case74() {
    String[] A = { "PS", "RS", "PP", "SP", "RR", "SS", "SP", "PP", "SS", "RR" };
    String[] E = { "RP", "SP", "RR", "SR", "RS", "SP", "SS", "PR", "PP", "SS" };
    assertEquals(16, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case75() {
    String[] A = { "RP", "PR", "RS", "SR", "RS", "SS", "PP", "RP", "SP", "SP", "RP", "RS", "RP", "SP", "SS", "SP", "SR", "SP", "RP", "SR", "PS", "SR", "RP", "SS", "PR", "PR", "RS", "SR", "SP", "SS", "SR", "RS", "SR", "SR", "PR", "RP", "SS", "RR", "PR", "RP", "PS", "RR", "RR", "SR", "SP", "RR", "SS", "SR", "SR", "PR" };
    String[] E = { "SP", "PP", "PS", "SR", "RR", "SS", "SR", "PP", "SS", "RS", "RS", "RR", "SP", "PR", "PP", "RR", "RS", "PS", "PR", "SS", "SR", "RS", "RS", "RP", "SR", "RP", "PR", "SS", "RP", "PR", "SP", "PP", "SP", "SP", "RR", "SR", "PP", "RR", "PP", "PS", "SP", "RS", "PP", "SR", "PP", "PR", "PS", "RP", "RP", "SS" };
    assertEquals(81, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case76() {
    String[] A = { "PP", "PP", "PP", "PP", "PP" };
    String[] E = { "RR", "RR", "RR", "RR", "RR" };
    assertEquals(10, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case77() {
    String[] A = { "RS", "SR", "PS", "PR", "PS" };
    String[] E = { "RS", "PR", "PS", "RP", "PS" };
    assertEquals(6, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case78() {
    String[] A = { "SS", "RS", "RP", "PP", "SP", "PS", "SR", "PR", "RR", "SS", "PP" };
    String[] E = { "SP", "RS", "RR", "SS", "PP", "SP", "PR", "RP", "PS", "SP", "RS" };
    assertEquals(17, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case79() {
    String[] A = { "PR", "PS", "SS", "RS", "PS", "PR", "RP", "PS", "SP", "SS", "RS", "SR", "PR", "PS", "PR", "PR", "RS", "PP", "RR", "SP", "PS", "RS", "PR", "SS", "RR", "RS", "SR", "PP", "RS", "PS" };
    String[] E = { "PR", "PP", "SS", "RS", "PS", "PR", "RP", "PS", "SP", "SS", "RS", "SR", "PR", "PS", "PR", "PR", "RS", "PP", "RR", "SP", "PS", "RS", "PR", "SS", "RP", "SR", "PP", "SR", "PR", "RP" };
    assertEquals(43, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case80() {
    String[] A = { "PS", "RS", "PP", "SP", "RR", "SS", "SP", "RP", "SP", "RR", "SR", "RS", "SP", "SS", "PS", "RS", "PP", "SP", "RR", "SS", "SP", "RP", "SP", "RR", "SR", "RS", "SP", "SS", "PS", "RS", "PP", "SP", "RR", "SS", "SP", "RP", "SP", "RR", "SR", "RS", "SP", "SS", "PS", "RS", "PP", "SP", "RR", "SS", "SP", "RP" };
    String[] E = { "RP", "SP", "RR", "SR", "RS", "SP", "SS", "PS", "RS", "PP", "SP", "RR", "SS", "SP", "RP", "SP", "RR", "SR", "RS", "SP", "SS", "PS", "RS", "PP", "SP", "RR", "SS", "SP", "RP", "SP", "RR", "SR", "RS", "SP", "SS", "PS", "RS", "PP", "SP", "RR", "SS", "SP", "RP", "SP", "RR", "SR", "RS", "SP", "SS", "PS" };
    assertEquals(68, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case81() {
    String[] A = { "RR" };
    String[] E = { "SR" };
    assertEquals(0, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case82() {
    String[] A = { "PR", "RP", "PR", "RP", "RP", "SR", "SP", "PR", "RP", "PR", "RP", "RP", "SR", "SP", "PR", "RP", "PR", "RP", "RP", "SR", "SP", "PR", "RP", "PR", "RP", "RP", "SR", "SP", "PR", "RP", "PR", "RP", "RP", "SR", "SP", "PR", "RP", "PR", "RP", "RP", "SR", "SP", "PR", "RP", "PR", "RP", "RP", "SR", "SP" };
    String[] E = { "RR", "PP", "SS", "SP", "PS", "RR", "RS", "RS", "RP", "SS", "RS", "RS", "SR", "RR", "PP", "SS", "SP", "PS", "SR", "RS", "RS", "SP", "SS", "RS", "RS", "SR", "RR", "PP", "SS", "SP", "PS", "SR", "PS", "RS", "SP", "RS", "RS", "RS", "SR", "RR", "PP", "SS", "SP", "PS", "SR", "RS", "RS", "SP", "RR" };
    assertEquals(58, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case83() {
    String[] A = { "RS" };
    String[] E = { "SS" };
    assertEquals(0, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case84() {
    String[] A = { "RR", "RR", "RR", "RR", "RR", "RP", "RP", "RP", "RP", "RP", "RS", "RS", "RS", "RS", "RS", "PR", "PR", "PR", "PR", "PR", "PP", "PP", "PP", "PP", "PP", "PS", "PS", "PS", "PS", "PS", "SR", "SR", "SR", "SR", "SR", "SP", "SP", "SP", "SP", "SP", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS" };
    String[] E = { "RR", "RR", "RR", "RR", "RR", "RP", "RP", "RP", "RP", "RP", "RS", "RS", "RS", "RS", "RS", "PR", "PR", "PR", "PR", "PR", "PP", "PP", "PP", "PP", "PP", "PS", "PS", "PS", "PS", "PS", "SR", "SR", "SR", "SR", "SR", "SP", "SP", "SP", "SP", "SP", "SS", "SS", "SS", "SS", "SS", "SS", "SR", "SP", "RR", "RP" };
    assertEquals(91, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case85() {
    String[] A = { "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS" };
    String[] E = { "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR" };
    assertEquals(0, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case86() {
    String[] A = { "PS", "SR" };
    String[] E = { "PS", "PP" };
    assertEquals(3, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case87() {
    String[] A = { "RP", "PR", "PS", "PR", "SP", "SR", "RS", "SP", "PR", "PR", "PP", "RR", "SS", "SR", "RS", "SR", "SS", "PR", "RP", "SP", "RS", "RS", "SR", "PS", "SP", "SP", "SS", "SS", "RR", "PP", "PP", "PP", "SS", "SR", "RP", "RS", "SP", "RS", "RS", "SR", "RP", "PS", "SR", "RR", "PP", "RS", "SP", "PR", "RP", "PP" };
    String[] E = { "RR", "SS", "SP", "PS", "RS", "SP", "RP", "PR", "PS", "SP", "SR", "RS", "PS", "RP", "PP", "RR", "SS", "SR", "PS", "PS", "SR", "SP", "PS", "PR", "PR", "PR", "PS", "RP", "SP", "RP", "SS", "SP", "RS", "RP", "PS", "RR", "SS", "PS", "PR", "RP", "RS", "SP", "PS", "RS", "RP", "RS", "SS", "RR", "PP", "SP" };
    assertEquals(82, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case88() {
    String[] A = { "RS", "RP", "SP", "PP", "SR", "SS", "RR", "PS", "SR", "PS", "RS", "PS", "RR", "SR", "PR", "PP", "SS", "RR", "PS", "SP", "RP", "PR", "SP", "PR", "SS", "RR", "PS", "SS", "PP", "RR", "PR", "RP", "SS", "PS", "SP", "RR", "PS", "RP", "SP", "RP", "RR", "RR", "RR", "RR", "SS", "SS", "SS", "RS", "SR", "RS" };
    String[] E = { "RP", "SR", "RP", "SS", "PR", "RP", "PP", "RR", "SS", "SP", "PR", "SR", "RS", "PR", "RP", "SS", "PP", "SS", "PP", "SP", "RP", "PR", "SP", "PS", "RP", "PS", "RP", "SP", "RP", "SP", "PR", "SP", "PR", "SP", "PR", "RR", "PR", "SP", "PR", "SP", "RR", "SS", "RR", "SS", "RS", "SR", "RR", "SS", "RR", "SS" };
    assertEquals(81, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case89() {
    String[] A = { "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS", "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS", "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS", "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS", "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS" };
    String[] E = { "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS", "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS", "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS", "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS", "RR", "RS", "PR", "RP", "SR", "RP", "SS", "RR", "PP", "SS" };
    assertEquals(70, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case90() {
    String[] A = { "PP", "SP" };
    String[] E = { "PR", "PP" };
    assertEquals(2, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case91() {
    String[] A = { "RR", "RP", "RS", "RP", "RP", "RP", "RP", "RP", "RS", "RR", "RR", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "SS", "RP", "RP", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SS", "SS", "SS", "RR", "SR", "RS", "SR", "RS", "PP", "PP", "PP", "PP" };
    String[] E = { "RR", "RR", "RR", "RR", "RR", "RR", "RR", "SS", "SS", "SS", "SR", "RS", "SR", "RS", "SR", "RP", "PR", "PR", "PR", "SP", "PR", "PR", "SP", "SS", "RS", "SR", "SS", "SS", "SS", "SS", "SS", "RR", "PP", "PP", "PP", "PP", "PR", "SS", "SS", "SR", "SP", "SP", "PS", "PS", "SS", "SS", "SP", "RR", "SS", "SS" };
    assertEquals(61, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case92() {
    String[] A = { "RR", "RR", "RP" };
    String[] E = { "SS", "SR", "RP" };
    assertEquals(4, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case93() {
    String[] A = { "PS", "RS", "PR" };
    String[] E = { "RS", "PS", "RR" };
    assertEquals(2, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case94() {
    String[] A = { "RS" };
    String[] E = { "SP" };
    assertEquals(2, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case95() {
    String[] A = { "PS", "RS", "PP", "SP", "RR", "SS", "SP", "RP", "SP", "RR", "SR", "PS", "RS", "SS", "SR", "SP", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "SR", "RP", "RP", "RP", "RP", "RP", "RP", "RP", "RP", "RP", "RP", "RP", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "SP" };
    String[] E = { "RP", "SP", "RR", "SR", "RS", "SP", "SS", "PS", "PS", "PS", "PS", "PS", "PS", "PS", "PS", "PS", "SR", "RR", "SP", "RS", "RP", "SP", "RP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "RP", "RP", "RP", "RP", "RP", "RP", "RP", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "PR", "PR" };
    assertEquals(51, doubleroshambo.maxScore(A, E));
  }

  @Test
  public void case96() {
    String[] A = { "RS", "RS" };
    String[] E = { "RP", "RP" };
    assertEquals(2, doubleroshambo.maxScore(A, E));
  }

}
