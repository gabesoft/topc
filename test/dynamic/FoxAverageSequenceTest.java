package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FoxAverageSequenceTest {
  FoxAverageSequence foxaveragesequence = new FoxAverageSequence();

  @Test
  public void case1() {
    int[] seq = { 3, -1 };
    assertEquals(4, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case2() {
    int[] seq = { 5, 3, -1 };
    assertEquals(2, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case3() {
    int[] seq = { -1, 0, 40 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case4() {
    int[] seq = { -1, 40, -1, -1, -1, 10, -1, -1, -1, 21, -1 };
    assertEquals(579347890, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case5() {
    int[] seq = { -1, 12, 25, 0, 18, -1 };
    assertEquals(58, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case6() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(267941432, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case7() {
    int[] seq = { -1, 8, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 2, -1, -1, 40, -1, -1, -1, -1, 40 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case8() {
    int[] seq = { -1 };
    assertEquals(41, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case9() {
    int[] seq = { 0 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case10() {
    int[] seq = { 40 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case11() {
    int[] seq = { 0, 1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case12() {
    int[] seq = { 1, 0 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case13() {
    int[] seq = { -1, -1, -1 };
    assertEquals(7211, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case14() {
    int[] seq = { -1, -1, -1, -1 };
    assertEquals(129592, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case15() {
    int[] seq = { 40, 39, -1, 40, 39, -1, 40, 39, -1, 40, 39, -1, 40, 39, -1, 40, 39, -1, 40, 39, -1, 40, 39, -1, 40, 39, -1, 40, 39, -1, 40, 39, -1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case16() {
    int[] seq = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case17() {
    int[] seq = { 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case18() {
    int[] seq = { 40, 39, -1, 37, 36, -1, 34, 33, -1, 31, 30, -1, 28, 27, -1, 25, 24, -1, 22, 21, -1, 19, 18, -1, 16, 15, -1, 13, 12, -1, 10, 9, -1, 7, 6, -1, 4, 3, -1, 1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case19() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(703358751, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case20() {
    int[] seq = { 40, -1, 39, -1, 38, -1, 37, -1, 36, -1, 35, -1, 34, -1, 33, -1, 32, -1, 31, -1, 30, -1, 29, -1, 28, -1, 27, -1, 26, -1, 25, -1, 24, -1, 23, -1, 22, -1, 21, -1 };
    assertEquals(397909681, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case21() {
    int[] seq = { -1, 40, -1, -1, 39, -1, -1, -1, 38, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, 35 };
    assertEquals(441649240, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case22() {
    int[] seq = { 7, 7, 7, 3, -1, -1, -1, 3, 1, 4, 1, 2, 1, 1, -1, 0, 3, -1, 3, 1, -1, 3, 2, 3, 3, 3, 2, 2, 3, 1, 3, 1, 1, 0, 1, -1, 0, 2, 2, 0 };
    assertEquals(3, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case23() {
    int[] seq = { 38, 17, 21, 15, 17, 11, 13, 1, 6, 1, -1, 1, 7, 12, 1, 7, 9, 1, 4, 0, 9, 6, 7, 7, 6, -1, 6, 9, 4, 6, 5, -1, 7, 2, 6, 8, -1, 4, 8, 8 };
    assertEquals(90, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case24() {
    int[] seq = { 36, 18, 23, 5, 5, 3, 4, 8, 10, 10, 11, 6, 11, 10, 10, 7, -1, 3, 5, -1, 4, 0, 7, 8, 0, 8, 1, 7, 1, 3, 0, 4, 4, 1, 4, 1, 7, 0, 3, 1 };
    assertEquals(3, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case25() {
    int[] seq = { 15, 8, 8, 8, 0, 4, 3, -1, 5, 4, -1, 3, -1, 3, 3, 3, 3, 4, 0, 0, 2, -1, -1, 2, 2, 2, 4, -1, -1, 2, 4, 3, 3, -1, 3, 1, 1, 3, -1, -1 };
    assertEquals(52, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case26() {
    int[] seq = { 25, 17, 17, 8, 8, 10, 3, -1, 10, 5, 5, 6, 8, 10, 1, 2, 7, 7, 8, 0, 0, 0, 4, -1, 5, 5, 5, 0, 0, 1, 2, 3, 5, 5, 5, 4, 6, 0, 3, 0 };
    assertEquals(6, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case27() {
    int[] seq = { 39, 12, -1, 19, 13, 20, 19, -1, 18, 19, 6, 8, 11, 17, 16, 16, 12, 12, 7, -1, 14, 2, 5, 7, 2, 8, 11, 6, 8, 9, 2, 12, 7, 10, 10, 4, 5, 0, -1, 9 };
    assertEquals(384, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case28() {
    int[] seq = { 2, -1, -1, -1, 2, 0, 0, -1, -1, 0, -1, 0, 1, -1, -1, -1, 0, 0, -1, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, -1, 0, -1, 0, -1, 0, 0, -1, 0, 0 };
    assertEquals(19, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case29() {
    int[] seq = { 25, 23, 23, 22, 23, 14, -1, 10, 18, 12, 15, 10, 18, 6, 6, -1, 6, 6, 10, 1, 3, 9, 10, 3, 9, 9, 12, 3, 12, 10, 10, 8, 8, 5, 10, 4, 8, 9, 8, 8 };
    assertEquals(8, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case30() {
    int[] seq = { 35, 9, 20, 0, 8, 8, 6, 12, 9, 10, 3, 4, 4, 0, 3, 8, 1, 6, 0, 6, 1, -1, 7, 6, -1, -1, 3, 6, 5, 5, 1, -1, 5, 5, 0, -1, 3, 2, 5, 4 };
    assertEquals(1680, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case31() {
    int[] seq = { 33, 9, 21, 13, 16, 4, 11, 0, 5, 12, 1, 10, 9, 11, 10, 11, 6, 9, 4, 8, 8, 7, 8, 7, -1, 9, 8, -1, 2, 6, 6, 7, 4, 8, 3, 4, 2, 2, 6, 2 };
    assertEquals(6, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case32() {
    int[] seq = { 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case33() {
    int[] seq = { 40, 40, 40, 39, 39, 39, 38, 38, 38, 37, 37, 37, -1, -1, -1, 36, 36, 36 };
    assertEquals(4261, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case34() {
    int[] seq = { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case35() {
    int[] seq = { -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0 };
    assertEquals(612510940, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case36() {
    int[] seq = { 40, 30, 20, 10, 0 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case37() {
    int[] seq = { 40, 20, 30, 10, 20, 0 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case38() {
    int[] seq = { 40, 39, 38, -1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case39() {
    int[] seq = { 40, -1, 30, 20 };
    assertEquals(11, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case40() {
    int[] seq = { -1, 40, 0 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case41() {
    int[] seq = { -1, 40, 40, 40, 40, -1, -1, 40, -1, 40, 40, 40, 40, 40, -1, -1, -1, 40, 40, 40, 40, -1, -1, -1, -1, -1, -1, 40, -1 };
    assertEquals(41, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case42() {
    int[] seq = { 40, -1, -1, 40, 40, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, 40, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case43() {
    int[] seq = { -1, 40, -1, 40, 40, 40, -1, -1, -1, -1, -1, -1, 40, 40, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(788660206, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case44() {
    int[] seq = { 0, -1, 0 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case45() {
    int[] seq = { -1, -1 };
    assertEquals(861, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case46() {
    int[] seq = { -1, -1, -1 };
    assertEquals(7211, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case47() {
    int[] seq = { -1, -1, -1, -1 };
    assertEquals(129592, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case48() {
    int[] seq = { -1, -1, -1, -1, -1 };
    assertEquals(1598699, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case49() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(838510501, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case50() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(459130692, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case51() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(98994514, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case52() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(961088040, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case53() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(673484864, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case54() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(575204879, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case55() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(696632287, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case56() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(42972282, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case57() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(743891827, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case58() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(395309916, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case59() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(703358751, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case60() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, 30, 30 };
    assertEquals(201985156, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case61() {
    int[] seq = { 30, 30, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(577921466, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case62() {
    int[] seq = { 34, 3, -1, -1 };
    assertEquals(264, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case63() {
    int[] seq = { -1, -1, -1, 32, -1, -1, 14, -1, -1 };
    assertEquals(35483216, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case64() {
    int[] seq = { 25, 6, 8, 5, 4, -1, -1, -1, 1, -1, -1, -1, -1, 17 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case65() {
    int[] seq = { -1, 26, -1, 4, -1, -1, 29, 23, -1, -1, 2, -1, 3, -1, -1, 7, -1, 20, -1, 23, 13, -1, -1, 34, -1, -1, 33, -1, -1, -1, -1, -1, -1, 17, -1, -1, -1, -1, -1, 29 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case66() {
    int[] seq = { 39, -1, -1, -1, -1, -1, 31, -1, 29, 29, 29, 28, 28, 28, -1, -1, -1, -1, -1, 20, -1, -1, 17, -1, -1, -1, 11, -1, 9, 6, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(986495159, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case67() {
    int[] seq = { -1, -1, -1, -1, -1, 0, -1, 39, -1, -1, 22, -1, -1, 21, -1, -1, 23, 25, 4, 11, -1, 10, -1, 34, -1, -1, 32, -1, -1, -1, -1, 13 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case68() {
    int[] seq = { -1, 34, -1, -1, -1, -1, 26, -1, 24, 18, -1, 8, -1, -1, -1, 4, -1, -1 };
    assertEquals(75292263, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case69() {
    int[] seq = { 35, -1, 8, -1, -1, -1, 33, -1, 15, 29, 37, 29, -1, -1, -1, -1, -1, -1, 23, -1, 0, -1, -1, -1, 16, -1, -1, -1, -1, -1, 18, -1, -1, -1, 18, 3, -1, -1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case70() {
    int[] seq = { 36, -1, -1, 35, -1, 32, -1, 29, -1, 25, -1, 23, -1, 21, -1, -1, -1, 17, 16, 16, -1, -1, -1, -1, -1, -1, 10, -1, -1, 7, -1, -1, -1, -1, -1, 3, -1 };
    assertEquals(748986884, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case71() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, 29, -1, 28, -1, -1, -1, 20, -1, 14, -1, -1, 9, -1, 5, -1, -1, 4, -1, 3, -1, 0 };
    assertEquals(860535696, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case72() {
    int[] seq = { -1, 34, -1, 31, 29, -1, 25, -1, 22, -1, -1, -1, 19, -1, 17, -1, 14, -1, -1, -1, 9, -1, -1, -1 };
    assertEquals(531007964, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case73() {
    int[] seq = { 32, -1, -1, 29, -1, -1, -1 };
    assertEquals(134198, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case74() {
    int[] seq = { -1, 40, 38, -1, -1, -1, 37, 36, -1, 33, 33, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, 22, -1, 18, -1, 14, 13, 12, 10, -1, -1, 6, -1, 5, -1, -1, -1, -1, 1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case75() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, 8, -1, -1, -1, -1, 19, -1, -1, -1, -1 };
    assertEquals(701002637, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case76() {
    int[] seq = { -1, -1, -1, -1, -1, 20, -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, 37, -1, -1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case77() {
    int[] seq = { -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, -1, -1, -1, -1, -1, -1, -1, 31, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(404842759, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case78() {
    int[] seq = { -1, 40, 40, -1, -1, -1, -1, -1, 24, -1, 15, -1, -1, -1, 6, 3 };
    assertEquals(796619688, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case79() {
    int[] seq = { 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(648303212, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case80() {
    int[] seq = { -1, 38, -1, 36, -1, -1, -1, 31, 31, 29, 28, -1, -1, -1, 24, -1, -1, 23, -1, -1, 20, -1, 14, 13, 13, -1, 12, -1, -1, 9, -1, -1, 1, -1, -1, 0 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case81() {
    int[] seq = { -1, -1, -1, -1, -1, 19, 17, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case82() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, 17, -1, 15, -1, -1, 7, 2 };
    assertEquals(477054397, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case83() {
    int[] seq = { -1, -1, -1, -1, -1, 31, -1, -1, -1, 28, -1, 23, 18, -1, -1, -1, 15, -1, 12, -1, -1, 9, -1, 7, -1, -1, 2, -1, -1, -1 };
    assertEquals(694943475, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case84() {
    int[] seq = { -1, -1, -1, -1, -1, -1, 7, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, 27, 13 };
    assertEquals(388001586, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case85() {
    int[] seq = { -1, 25, -1 };
    assertEquals(97, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case86() {
    int[] seq = { -1, 6, 6, 5, 5, 4, 4, -1 };
    assertEquals(285, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case87() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 9, 8, 8, 7, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, 10, 10, 9, -1, -1, -1, -1 };
    assertEquals(614266738, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case88() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, 6, 7, -1, -1, -1, -1, -1, -1, -1, -1, 8, 9, 10, -1, -1, -1 };
    assertEquals(519587288, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case89() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, 6, -1, -1, -1, -1, -1, -1, 7, -1, -1, -1, -1, -1, -1, 8, 9, -1, -1, 10, -1, 11 };
    assertEquals(104067206, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case90() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 5, -1, -1, -1, -1, 10, -1, -1, -1, -1, 15, -1, -1, -1, 20, -1, -1, 25, -1, 30 };
    assertEquals(657717067, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case91() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, 10, -1, -1, -1, -1, 15, -1, -1, -1, 20, -1, -1, 25, -1, 30, -1, 35 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case92() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals(134443575, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case93() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, 16, 6, -1, -1, -1, -1, 25, -1 };
    assertEquals(715242038, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case94() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, -1 };
    assertEquals(273280855, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case95() {
    int[] seq = { 40, 39, -1, -1, -1, 30, 29, -1, -1, -1, 20, 19, -1, -1, -1, 10, 9, -1, -1, -1, 0 };
    assertEquals(779270002, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case96() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 7, -1, -1, -1, -1 };
    assertEquals(673586947, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case97() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, 9, -1, -1, -1 };
    assertEquals(730137188, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case98() {
    int[] seq = { 39, -1, 37, -1, -1, 32, -1, -1, 29, 28, -1, 27, -1, -1, 23, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, 10, -1, 10, 10, -1, 8, -1, -1, -1, -1, -1, 3, -1, 1, -1 };
    assertEquals(918989368, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case99() {
    int[] seq = { 25, -1, -1, -1, -1, 10, -1, -1, -1, 14, -1, -1, 16, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1, -1 };
    assertEquals(284469968, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case100() {
    int[] seq = { -1, -1, 37, -1, -1, 35, 33, -1, -1, -1, -1, -1, 23, -1, 22, 22, -1, 19, -1, -1, -1, 18, -1, -1, 12, -1, -1, -1, 9, -1, -1, -1, -1, 5, 4, -1, -1, 2, -1, -1 };
    assertEquals(102127777, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case101() {
    int[] seq = { 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, 15, -1, -1, -1, 1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(749912847, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case102() {
    int[] seq = { -1, -1, -1, 36, 34, -1, 30, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, 11, -1, 9, -1, -1, -1, -1, 3, 3, 3, -1, -1, 2, 2, 1, -1, -1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case103() {
    int[] seq = { 40, 39, -1, -1, 30, 29, -1, -1, 20, 19, -1, -1, 10, 9, -1, -1, 0 };
    assertEquals(28273987, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case104() {
    int[] seq = { 40, -1, -1, -1, -1, -1, 30, 30, -1, -1, -1, 27, -1, 26, 25, -1, 24, -1, -1, -1, -1, -1, -1, -1, 18, -1, -1, -1, 12, -1, -1, -1, -1, -1, 5, 5, 4, 4, 0, -1 };
    assertEquals(348551227, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case105() {
    int[] seq = { 40, -1, 39, -1, -1, 36, 35, -1, -1, -1, 29, 28, -1, -1, -1, -1, -1, 24, -1, -1, 22, -1, -1, 22, -1, 20, -1, -1, -1, 16, 12, -1, -1, 8, -1, 7, 5, -1, -1, 3 };
    assertEquals(886971463, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case106() {
    int[] seq = { 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case107() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case108() {
    int[] seq = { 39, -1, -1, 36, 36, 34, -1, 33, -1, -1, -1, -1, -1, 26, -1, 23, 22, -1, 21, -1, -1, 17, 16, -1, -1, -1, -1, -1, -1, -1, -1, 7, 7, 6, -1, -1, 4, -1, -1, -1 };
    assertEquals(597797416, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case109() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(729412036, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case110() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, 27, -1, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(405836133, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case111() {
    int[] seq = { -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, 29, -1, 24, -1, 22, 22, -1, 21, -1, 19, 17, -1, -1, 14, -1, 13, -1, -1, -1, -1, -1, -1, -1, 1, -1, 0, -1, -1, -1, 0 };
    assertEquals(995089448, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case112() {
    int[] seq = { -1, 0, 40 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case113() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(267941432, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case114() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(64097294, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case115() {
    int[] seq = { -1, -1, -1, 1 };
    assertEquals(6466, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case116() {
    int[] seq = { 5, 6, 3, 2, 1, 7, 8, 9 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case117() {
    int[] seq = { 5, 3, -1 };
    assertEquals(2, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case118() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(596799287, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case119() {
    int[] seq = { -1, 40, -1, 0, -1, 10, -1, -1, -1, 39, -1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case120() {
    int[] seq = { 39, 38, -1, -1 };
    assertEquals(39, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case121() {
    int[] seq = { -1, 40, -1, -1, -1, 10, -1, -1, -1, 21, -1 };
    assertEquals(579347890, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case122() {
    int[] seq = { -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(1655672, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case123() {
    int[] seq = { -1, -1 };
    assertEquals(861, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case124() {
    int[] seq = { 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(754565817, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case125() {
    int[] seq = { -1, 12, 25, 0, 18, -1 };
    assertEquals(58, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case126() {
    int[] seq = { 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(821868185, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case127() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    assertEquals(703358751, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case128() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40 };
    assertEquals(1, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case129() {
    int[] seq = { -1, -1, -1, -1, -1, 0, 40, 23, -1, -1, 39, 34, -1, -1, 40, -1, -1, 0, -1, -1, 2, 1, -1, -1, -1, 23, -1, -1, -1, 34, -1, -1, 40, -1, -1, 0, -1, -1 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case130() {
    int[] seq = { 1, 5 };
    assertEquals(0, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case131() {
    int[] seq = { -1 };
    assertEquals(41, foxaveragesequence.theCount(seq));
  }

  @Test
  public void case132() {
    int[] seq = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1 };
    assertEquals(768038214, foxaveragesequence.theCount(seq));
  }

}
