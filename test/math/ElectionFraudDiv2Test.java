package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ElectionFraudDiv2Test {
  ElectionFraudDiv2 electionfrauddiv2 = new ElectionFraudDiv2();

  @Test
  public void case1() {
    int[] percentages = { 100 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case2() {
    int[] percentages = { 34, 34, 34 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case3() {
    int[] percentages = { 12, 12, 12, 12, 12, 12, 12, 12 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case4() {
    int[] percentages = { 13, 13, 13, 13, 13, 13, 13, 13 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case5() {
    int[] percentages = { 0, 1, 100 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case6() {
    int[] percentages = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case7() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 34, 34, 34 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case8() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case9() {
    int[] percentages = { 51, 51 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case10() {
    int[] percentages = { 28, 38, 33 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case11() {
    int[] percentages = { 40, 0, 33, 28 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case12() {
    int[] percentages = { 30, 26, 21, 25, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case13() {
    int[] percentages = { 30, 0, 24, 0, 29, 19 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case14() {
    int[] percentages = { 34, 33, 29, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case15() {
    int[] percentages = { 22, 20, 0, 0, 14, 20, 21, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case16() {
    int[] percentages = { 23, 0, 17, 17, 24, 0, 21, 0, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case17() {
    int[] percentages = { 0, 11, 16, 13, 14, 11, 0, 15, 13, 12 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case18() {
    int[] percentages = { 0, 20, 12, 0, 0, 16, 0, 0, 13, 18, 15 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case19() {
    int[] percentages = { 14, 0, 9, 0, 0, 14, 10, 17, 6, 13, 9, 12 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case20() {
    int[] percentages = { 0, 17, 0, 0, 0, 0, 28, 22, 0, 0, 0, 17, 18 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case21() {
    int[] percentages = { 12, 0, 17, 0, 0, 13, 0, 0, 17, 17, 15, 0, 0, 13 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case22() {
    int[] percentages = { 6, 6, 0, 7, 8, 13, 12, 10, 5, 6, 7, 7, 8, 7, 6 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case23() {
    int[] percentages = { 6, 4, 0, 0, 7, 9, 4, 8, 9, 7, 4, 9, 5, 4, 7, 9 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case24() {
    int[] percentages = { 0, 21, 0, 0, 24, 0, 26, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case25() {
    int[] percentages = { 8, 0, 9, 12, 0, 4, 8, 0, 0, 12, 13, 0, 0, 8, 0, 0, 10, 8 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case26() {
    int[] percentages = { 0, 0, 7, 11, 13, 0, 0, 0, 0, 0, 15, 0, 0, 10, 13, 16, 14, 5, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case27() {
    int[] percentages = { 2, 0, 7, 5, 8, 8, 9, 7, 8, 0, 7, 8, 0, 0, 6, 0, 9, 5, 2, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case28() {
    int[] percentages = { 5, 0, 3, 7, 6, 9, 4, 6, 7, 0, 4, 5, 6, 6, 8, 5, 2, 4, 10, 6, 7 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case29() {
    int[] percentages = { 0, 4, 3, 7, 3, 6, 0, 4, 2, 4, 5, 3, 8, 5, 6, 4, 4, 5, 6, 5, 5, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case30() {
    int[] percentages = { 2, 0, 7, 8, 2, 7, 6, 5, 11, 0, 3, 0, 4, 3, 4, 0, 2, 0, 6, 0, 4, 8, 7 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case31() {
    int[] percentages = { 0, 0, 2, 0, 8, 0, 6, 10, 13, 0, 6, 11, 3, 0, 0, 5, 0, 5, 0, 8, 5, 0, 7, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case32() {
    int[] percentages = { 0, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 25, 0, 0, 0, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case33() {
    int[] percentages = { 0, 0, 4, 4, 6, 0, 6, 4, 6, 8, 4, 14, 5, 6, 0, 2, 3, 6, 0, 5, 6, 0, 4, 6, 6, 5 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case34() {
    int[] percentages = { 0, 0, 14, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 18, 0, 0, 0, 0, 0, 13, 8, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case35() {
    int[] percentages = { 5, 3, 6, 5, 4, 4, 4, 4, 2, 4, 4, 6, 2, 5, 4, 4, 6, 6, 3, 8, 3, 3, 4, 4, 3, 5, 0, 3 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case36() {
    int[] percentages = { 4, 1, 1, 3, 6, 1, 6, 3, 3, 3, 3, 5, 3, 3, 3, 4, 5, 8, 5, 5, 2, 6, 6, 2, 8, 4, 4, 3, 4 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case37() {
    int[] percentages = { 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 11, 0, 14, 0, 10, 0, 0, 0, 0, 0, 11, 0, 0, 0, 12, 0, 10 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case38() {
    int[] percentages = { 6, 2, 6, 0, 4, 0, 4, 6, 0, 5, 5, 1, 4, 0, 0, 4, 3, 3, 0, 4, 6, 2, 0, 7, 0, 3, 4, 5, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case39() {
    int[] percentages = { 2, 0, 4, 2, 2, 4, 5, 4, 5, 2, 4, 2, 3, 2, 4, 2, 5, 3, 3, 3, 0, 2, 4, 4, 2, 0, 3, 1, 0, 6, 0, 2 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case40() {
    int[] percentages = { 0, 0, 0, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 11, 0, 0, 9, 0, 6, 0, 0, 8, 10, 0, 0, 0, 9, 9 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case41() {
    int[] percentages = { 2, 2, 0, 2, 3, 4, 2, 0, 3, 6, 4, 5, 3, 0, 3, 2, 6, 3, 4, 0, 3, 1, 0, 5, 1, 3, 0, 3, 2, 4, 4, 3, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case42() {
    int[] percentages = { 3, 3, 0, 4, 2, 2, 3, 2, 0, 7, 7, 2, 0, 3, 4, 5, 0, 0, 2, 0, 0, 6, 1, 2, 2, 1, 0, 4, 3, 4, 0, 0, 4, 4, 3 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case43() {
    int[] percentages = { 6, 0, 6, 7, 0, 0, 4, 7, 4, 0, 0, 7, 0, 4, 0, 0, 7, 3, 0, 0, 0, 0, 6, 0, 0, 5, 0, 0, 0, 2, 3, 0, 0, 0, 7, 5 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case44() {
    int[] percentages = { 2, 2, 1, 3, 3, 2, 3, 1, 3, 3, 4, 2, 4, 3, 2, 0, 0, 3, 0, 0, 3, 2, 3, 1, 0, 4, 4, 3, 0, 4, 0, 1, 2, 5, 4, 2, 3 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case45() {
    int[] percentages = { 3, 6, 1, 6, 0, 3, 3, 0, 4, 3, 6, 0, 0, 7, 5, 0, 0, 0, 4, 0, 4, 3, 0, 0, 3, 2, 8, 7, 0, 6, 0, 7, 0, 0, 9, 5, 0, 6 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case46() {
    int[] percentages = { 6, 0, 3, 2, 5, 4, 6, 2, 0, 0, 0, 3, 2, 3, 1, 0, 3, 2, 0, 4, 0, 0, 2, 0, 0, 2, 3, 0, 2, 3, 5, 1, 4, 0, 4, 5, 0, 3, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case47() {
    int[] percentages = { 2, 5, 3, 2, 3, 3, 3, 1, 0, 2, 2, 0, 1, 4, 2, 3, 2, 2, 1, 1, 1, 2, 1, 1, 1, 2, 5, 3, 1, 1, 1, 3, 2, 3, 2, 4, 3, 1, 1, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case48() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0, 0, 0, 0, 0, 0, 0, 0, 11, 25, 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case49() {
    int[] percentages = { 1, 2, 2, 0, 0, 7, 0, 5, 4, 0, 0, 0, 5, 2, 5, 5, 0, 0, 0, 0, 5, 6, 3, 5, 5, 4, 0, 5, 0, 4, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 4, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case50() {
    int[] percentages = { 2, 2, 2, 0, 1, 3, 0, 2, 2, 0, 1, 0, 0, 1, 0, 2, 2, 0, 3, 1, 1, 3, 2, 2, 2, 5, 1, 2, 2, 1, 2, 2, 2, 2, 5, 1, 0, 0, 5, 3, 4, 2, 5 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case51() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 10, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 6, 10, 0, 10, 8, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case52() {
    int[] percentages = { 0, 3, 0, 3, 3, 3, 0, 0, 0, 5, 1, 3, 7, 4, 2, 0, 0, 0, 6, 3, 0, 5, 0, 3, 0, 4, 3, 0, 0, 0, 0, 0, 0, 5, 0, 4, 3, 4, 0, 0, 0, 4, 0, 0, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case53() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 26, 0, 0, 0, 0, 15, 0, 0, 0, 17 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case54() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 16, 15, 0, 0, 0, 0, 0, 8, 0, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case55() {
    int[] percentages = { 0, 11, 0, 0, 0, 0, 0, 16, 0, 0, 0, 13, 7, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 9, 0, 0, 6, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 8, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case56() {
    int[] percentages = { 0, 0, 4, 2, 3, 3, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 8, 0, 6, 2, 0, 0, 1, 0, 0, 2, 0, 0, 5, 0, 4, 0, 0, 2, 0, 0, 4, 0, 3, 0, 10, 0, 5, 3, 1, 0, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case57() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 0, 0, 0, 0, 38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 34, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case58() {
    int[] percentages = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case59() {
    int[] percentages = { 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case60() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case61() {
    int[] percentages = { 97, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case62() {
    int[] percentages = { 0, 1, 1, 100 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case63() {
    int[] percentages = { 0, 0, 0, 1, 1, 100 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case64() {
    int[] percentages = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case65() {
    int[] percentages = { 0, 0, 0, 0, 0, 52, 50 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case66() {
    int[] percentages = { 0, 0, 0, 0, 1, 1, 100 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case67() {
    int[] percentages = { 0, 0, 0, 51, 51 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case68() {
    int[] percentages = { 50, 50, 50 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case69() {
    int[] percentages = { 51, 49 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case70() {
    int[] percentages = { 93 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case71() {
    int[] percentages = { 98, 2, 1, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case72() {
    int[] percentages = { 27, 70 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case73() {
    int[] percentages = { 0, 1 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case74() {
    int[] percentages = { 0, 0, 99 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case75() {
    int[] percentages = { 0, 0, 0, 0, 0, 52, 50, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case76() {
    int[] percentages = { 13, 13, 13, 13, 13, 13, 13, 13 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case77() {
    int[] percentages = { 100, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case78() {
    int[] percentages = { 0, 0, 0, 0, 0, 51, 51, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case79() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 95 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case80() {
    int[] percentages = { 30, 30, 30 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case81() {
    int[] percentages = { 12, 12, 12, 12, 12, 12, 12, 12 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case82() {
    int[] percentages = { 100, 2, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case83() {
    int[] percentages = { 0, 1, 99, 100, 0, 0, 100, 100, 59, 41, 51, 49, 0, 100, 0, 100 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case84() {
    int[] percentages = { 33, 33, 35 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case85() {
    int[] percentages = { 0, 0, 0, 99 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case86() {
    int[] percentages = { 100, 1, 1, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case87() {
    int[] percentages = { 1, 1, 97 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case88() {
    int[] percentages = { 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case89() {
    int[] percentages = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 7, 2, 3, 10 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case90() {
    int[] percentages = { 10, 10 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case91() {
    int[] percentages = { 20, 20, 20, 20, 19 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case92() {
    int[] percentages = { 20, 20, 7, 10, 10, 10 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case93() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 2, 100 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case94() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 25 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case95() {
    int[] percentages = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 91, 0 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case96() {
    int[] percentages = { 100 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case97() {
    int[] percentages = { 49, 50 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case98() {
    int[] percentages = { 0, 0, 0, 0, 100, 1, 1 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case99() {
    int[] percentages = { 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case100() {
    int[] percentages = { 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case101() {
    int[] percentages = { 1, 99 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case102() {
    int[] percentages = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case103() {
    int[] percentages = { 0, 0, 0, 98 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case104() {
    int[] percentages = { 100, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case105() {
    int[] percentages = { 0, 0, 1, 1, 100 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case106() {
    int[] percentages = { 0, 34, 34, 34 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case107() {
    int[] percentages = { 50, 50 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case108() {
    int[] percentages = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 70 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case109() {
    int[] percentages = { 33, 33, 33 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case110() {
    int[] percentages = { 34, 34, 33 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case111() {
    int[] percentages = { 100, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case112() {
    int[] percentages = { 52, 52, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case113() {
    int[] percentages = { 0, 100, 3, 0, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case114() {
    int[] percentages = { 50, 52, 0, 0 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case115() {
    int[] percentages = { 1, 1, 99 };
    assertEquals("NO", electionfrauddiv2.IsFraudulent(percentages));
  }

  @Test
  public void case116() {
    int[] percentages = { 100, 100, 100 };
    assertEquals("YES", electionfrauddiv2.IsFraudulent(percentages));
  }

}
