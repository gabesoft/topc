package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class YahtzeeRollTest {
  double DELTA = 1.0e-09;
  YahtzeeRoll yahtzeeroll = new YahtzeeRoll();

  @Test
  public void case1() {
    int[] dice = { 1, 1, 1, 1, 2 };
    assertEquals(8.333333333333334, yahtzeeroll.bestChoice(dice), DELTA * 8.333333333333334);
  }

  @Test
  public void case2() {
    int[] dice = { 1, 1, 1, 2, 2 };
    assertEquals(25.0, yahtzeeroll.bestChoice(dice), DELTA * 25.0);
  }

  @Test
  public void case3() {
    int[] dice = { 2, 3, 4, 5, 5 };
    assertEquals(33.333333333333336, yahtzeeroll.bestChoice(dice), DELTA * 33.333333333333336);
  }

  @Test
  public void case4() {
    int[] dice = { 2, 2, 3, 4, 4 };
    assertEquals(17.77777777777778, yahtzeeroll.bestChoice(dice), DELTA * 17.77777777777778);
  }

  @Test
  public void case5() {
    int[] dice = { 6, 1, 3, 5, 5 };
    assertEquals(9.722222222222221, yahtzeeroll.bestChoice(dice), DELTA * 9.722222222222221);
  }

  @Test
  public void case6() {
    int[] dice = { 5, 2, 6, 1, 5 };
    assertEquals(5.941358024691358, yahtzeeroll.bestChoice(dice), DELTA * 5.941358024691358);
  }

  @Test
  public void case7() {
    int[] dice = { 2, 6, 5, 3, 1 };
    assertEquals(10.277777777777779, yahtzeeroll.bestChoice(dice), DELTA * 10.277777777777779);
  }

  @Test
  public void case8() {
    int[] dice = { 5, 2, 3, 2, 5 };
    assertEquals(10.277777777777779, yahtzeeroll.bestChoice(dice), DELTA * 10.277777777777779);
  }

  @Test
  public void case9() {
    int[] dice = { 1, 4, 4, 4, 2 };
    assertEquals(9.722222222222221, yahtzeeroll.bestChoice(dice), DELTA * 9.722222222222221);
  }

  @Test
  public void case10() {
    int[] dice = { 3, 4, 6, 3, 2 };
    assertEquals(17.77777777777778, yahtzeeroll.bestChoice(dice), DELTA * 17.77777777777778);
  }

  @Test
  public void case11() {
    int[] dice = { 2, 6, 1, 3, 1 };
    assertEquals(9.722222222222221, yahtzeeroll.bestChoice(dice), DELTA * 9.722222222222221);
  }

  @Test
  public void case12() {
    int[] dice = { 6, 5, 6, 5, 2 };
    assertEquals(8.333333333333334, yahtzeeroll.bestChoice(dice), DELTA * 8.333333333333334);
  }

  @Test
  public void case13() {
    int[] dice = { 1, 1, 2, 4, 1 };
    assertEquals(9.722222222222221, yahtzeeroll.bestChoice(dice), DELTA * 9.722222222222221);
  }

  @Test
  public void case14() {
    int[] dice = { 1, 4, 6, 4, 1 };
    assertEquals(8.333333333333334, yahtzeeroll.bestChoice(dice), DELTA * 8.333333333333334);
  }

  @Test
  public void case15() {
    int[] dice = { 4, 2, 1, 2, 1 };
    assertEquals(9.722222222222221, yahtzeeroll.bestChoice(dice), DELTA * 9.722222222222221);
  }

  @Test
  public void case16() {
    int[] dice = { 5, 5, 2, 6, 2 };
    assertEquals(8.333333333333334, yahtzeeroll.bestChoice(dice), DELTA * 8.333333333333334);
  }

  @Test
  public void case17() {
    int[] dice = { 2, 2, 4, 5, 1 };
    assertEquals(10.277777777777779, yahtzeeroll.bestChoice(dice), DELTA * 10.277777777777779);
  }

  @Test
  public void case18() {
    int[] dice = { 3, 5, 4, 6, 1 };
    assertEquals(31.666666666666668, yahtzeeroll.bestChoice(dice), DELTA * 31.666666666666668);
  }

  @Test
  public void case19() {
    int[] dice = { 4, 2, 1, 2, 3 };
    assertEquals(31.666666666666668, yahtzeeroll.bestChoice(dice), DELTA * 31.666666666666668);
  }

  @Test
  public void case20() {
    int[] dice = { 3, 1, 5, 6, 5 };
    assertEquals(9.722222222222221, yahtzeeroll.bestChoice(dice), DELTA * 9.722222222222221);
  }

  @Test
  public void case21() {
    int[] dice = { 6, 6, 6, 2, 3 };
    assertEquals(8.75, yahtzeeroll.bestChoice(dice), DELTA * 8.75);
  }

  @Test
  public void case22() {
    int[] dice = { 3, 5, 1, 2, 4 };
    assertEquals(40.0, yahtzeeroll.bestChoice(dice), DELTA * 40.0);
  }

  @Test
  public void case23() {
    int[] dice = { 3, 2, 6, 4, 2 };
    assertEquals(17.77777777777778, yahtzeeroll.bestChoice(dice), DELTA * 17.77777777777778);
  }

  @Test
  public void case24() {
    int[] dice = { 2, 5, 6, 6, 4 };
    assertEquals(10.277777777777779, yahtzeeroll.bestChoice(dice), DELTA * 10.277777777777779);
  }

  @Test
  public void case25() {
    int[] dice = { 6, 4, 6, 4, 3 };
    assertEquals(12.083333333333334, yahtzeeroll.bestChoice(dice), DELTA * 12.083333333333334);
  }

  @Test
  public void case26() {
    int[] dice = { 1, 1, 1, 1, 2 };
    assertEquals(8.333333333333334, yahtzeeroll.bestChoice(dice), DELTA * 8.333333333333334);
  }

  @Test
  public void case27() {
    int[] dice = { 1, 1, 1, 1, 1 };
    assertEquals(50.0, yahtzeeroll.bestChoice(dice), DELTA * 50.0);
  }

  @Test
  public void case28() {
    int[] dice = { 2, 2, 3, 4, 4 };
    assertEquals(17.77777777777778, yahtzeeroll.bestChoice(dice), DELTA * 17.77777777777778);
  }

  @Test
  public void case29() {
    int[] dice = { 6, 1, 3, 5, 5 };
    assertEquals(9.722222222222221, yahtzeeroll.bestChoice(dice), DELTA * 9.722222222222221);
  }

  @Test
  public void case30() {
    int[] dice = { 1, 2, 3, 5, 6 };
    assertEquals(10.277777777777779, yahtzeeroll.bestChoice(dice), DELTA * 10.277777777777779);
  }

  @Test
  public void case31() {
    int[] dice = { 1, 2, 5, 6, 6 };
    assertEquals(5.941358024691358, yahtzeeroll.bestChoice(dice), DELTA * 5.941358024691358);
  }

}
