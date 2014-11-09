package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class NumberSplitTest {
  NumberSplit numbersplit = new NumberSplit();

  @Test
  public void case1() {
    int start = 6;
    assertEquals(1, numbersplit.longestSequence(start));
  }

  @Test
  public void case2() {
    int start = 97;
    assertEquals(4, numbersplit.longestSequence(start));
  }

  @Test
  public void case3() {
    int start = 234;
    assertEquals(5, numbersplit.longestSequence(start));
  }

  @Test
  public void case4() {
    int start = 876;
    assertEquals(7, numbersplit.longestSequence(start));
  }

  @Test
  public void case5() {
    int start = 99999;
    assertEquals(29, numbersplit.longestSequence(start));
  }

  @Test
  public void case6() {
    int start = 10;
    assertEquals(2, numbersplit.longestSequence(start));
  }

  @Test
  public void case7() {
    int start = 32;
    assertEquals(2, numbersplit.longestSequence(start));
  }

  @Test
  public void case8() {
    int start = 99;
    assertEquals(3, numbersplit.longestSequence(start));
  }

  @Test
  public void case9() {
    int start = 102;
    assertEquals(3, numbersplit.longestSequence(start));
  }

  @Test
  public void case10() {
    int start = 60009;
    assertEquals(4, numbersplit.longestSequence(start));
  }

  @Test
  public void case11() {
    int start = 39;
    assertEquals(4, numbersplit.longestSequence(start));
  }

  @Test
  public void case12() {
    int start = 77;
    assertEquals(5, numbersplit.longestSequence(start));
  }

  @Test
  public void case13() {
    int start = 117;
    assertEquals(6, numbersplit.longestSequence(start));
  }

  @Test
  public void case14() {
    int start = 139;
    assertEquals(7, numbersplit.longestSequence(start));
  }

  @Test
  public void case15() {
    int start = 419;
    assertEquals(8, numbersplit.longestSequence(start));
  }

  @Test
  public void case16() {
    int start = 619;
    assertEquals(9, numbersplit.longestSequence(start));
  }

  @Test
  public void case17() {
    int start = 777;
    assertEquals(10, numbersplit.longestSequence(start));
  }

  @Test
  public void case18() {
    int start = 4;
    assertEquals(1, numbersplit.longestSequence(start));
  }

  @Test
  public void case19() {
    int start = 300;
    assertEquals(2, numbersplit.longestSequence(start));
  }

  @Test
  public void case20() {
    int start = 109;
    assertEquals(3, numbersplit.longestSequence(start));
  }

  @Test
  public void case21() {
    int start = 950;
    assertEquals(4, numbersplit.longestSequence(start));
  }

  @Test
  public void case22() {
    int start = 1604;
    assertEquals(5, numbersplit.longestSequence(start));
  }

  @Test
  public void case23() {
    int start = 841;
    assertEquals(6, numbersplit.longestSequence(start));
  }

  @Test
  public void case24() {
    int start = 776;
    assertEquals(7, numbersplit.longestSequence(start));
  }

  @Test
  public void case25() {
    int start = 796;
    assertEquals(8, numbersplit.longestSequence(start));
  }

  @Test
  public void case26() {
    int start = 4212;
    assertEquals(9, numbersplit.longestSequence(start));
  }

  @Test
  public void case27() {
    int start = 22071;
    assertEquals(10, numbersplit.longestSequence(start));
  }

  @Test
  public void case28() {
    int start = 44255;
    assertEquals(11, numbersplit.longestSequence(start));
  }

  @Test
  public void case29() {
    int start = 33145;
    assertEquals(12, numbersplit.longestSequence(start));
  }

  @Test
  public void case30() {
    int start = 22222;
    assertEquals(13, numbersplit.longestSequence(start));
  }

  @Test
  public void case31() {
    int start = 6896;
    assertEquals(14, numbersplit.longestSequence(start));
  }

  @Test
  public void case32() {
    int start = 90542;
    assertEquals(15, numbersplit.longestSequence(start));
  }

  @Test
  public void case33() {
    int start = 31723;
    assertEquals(16, numbersplit.longestSequence(start));
  }

  @Test
  public void case34() {
    int start = 77875;
    assertEquals(17, numbersplit.longestSequence(start));
  }

  @Test
  public void case35() {
    int start = 29551;
    assertEquals(18, numbersplit.longestSequence(start));
  }

  @Test
  public void case36() {
    int start = 28856;
    assertEquals(19, numbersplit.longestSequence(start));
  }

  @Test
  public void case37() {
    int start = 63526;
    assertEquals(20, numbersplit.longestSequence(start));
  }

  @Test
  public void case38() {
    int start = 41821;
    assertEquals(21, numbersplit.longestSequence(start));
  }

  @Test
  public void case39() {
    int start = 34718;
    assertEquals(22, numbersplit.longestSequence(start));
  }

  @Test
  public void case40() {
    int start = 68606;
    assertEquals(23, numbersplit.longestSequence(start));
  }

  @Test
  public void case41() {
    int start = 89174;
    assertEquals(24, numbersplit.longestSequence(start));
  }

  @Test
  public void case42() {
    int start = 69178;
    assertEquals(25, numbersplit.longestSequence(start));
  }

  @Test
  public void case43() {
    int start = 94816;
    assertEquals(26, numbersplit.longestSequence(start));
  }

  @Test
  public void case44() {
    int start = 99774;
    assertEquals(27, numbersplit.longestSequence(start));
  }

  @Test
  public void case45() {
    int start = 89924;
    assertEquals(28, numbersplit.longestSequence(start));
  }

  @Test
  public void case46() {
    int start = 98994;
    assertEquals(29, numbersplit.longestSequence(start));
  }

  @Test
  public void case47() {
    int start = 99991;
    assertEquals(30, numbersplit.longestSequence(start));
  }

  @Test
  public void case48() {
    int start = 94389;
    assertEquals(31, numbersplit.longestSequence(start));
  }

  @Test
  public void case49() {
    int start = 100000;
    assertEquals(2, numbersplit.longestSequence(start));
  }

  @Test
  public void case50() {
    int start = 97;
    assertEquals(4, numbersplit.longestSequence(start));
  }

  @Test
  public void case51() {
    int start = 9998;
    assertEquals(18, numbersplit.longestSequence(start));
  }

  @Test
  public void case52() {
    int start = 100000;
    assertEquals(2, numbersplit.longestSequence(start));
  }

  @Test
  public void case53() {
    int start = 234;
    assertEquals(5, numbersplit.longestSequence(start));
  }

  @Test
  public void case54() {
    int start = 23579;
    assertEquals(19, numbersplit.longestSequence(start));
  }

  @Test
  public void case55() {
    int start = 99999;
    assertEquals(29, numbersplit.longestSequence(start));
  }

  @Test
  public void case56() {
    int start = 876;
    assertEquals(7, numbersplit.longestSequence(start));
  }

}
