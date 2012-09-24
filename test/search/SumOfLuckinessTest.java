package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class SumOfLuckinessTest {
  SumOfLuckiness sumofluckiness = new SumOfLuckiness();

  @Test
  public void case1() {
    int A = 1;
    int B = 10;
    assertEquals(2L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case2() {
    int A = 40;
    int B = 47;
    assertEquals(8L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case3() {
    int A = 58;
    int B = 526;
    assertEquals(231L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case4() {
    int A = 4444;
    int B = 7777;
    assertEquals(2338L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case5() {
    int A = 585858585;
    int B = 858585858;
    assertEquals(287481025L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case6() {
    int A = 1;
    int B = 1;
    assertEquals(0L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case7() {
    int A = 1;
    int B = 2000000000;
    assertEquals(2008249560L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case8() {
    int A = 2000000000;
    int B = 2000000000;
    assertEquals(0L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case9() {
    int A = 7;
    int B = 7;
    assertEquals(1L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case10() {
    int A = 4;
    int B = 4;
    assertEquals(1L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case11() {
    int A = 4;
    int B = 7;
    assertEquals(2L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case12() {
    int A = 4;
    int B = 1000;
    assertEquals(492L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case13() {
    int A = 12345;
    int B = 1234567890;
    assertEquals(1221528868L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case14() {
    int A = 2000000;
    int B = 2000000000;
    assertEquals(2006673768L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case15() {
    int A = 1819245736;
    int B = 2000000000;
    assertEquals(170834843L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case16() {
    int A = 100;
    int B = 526;
    assertEquals(215L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case17() {
    int A = 777777777;
    int B = 1777777777;
    assertEquals(1004124789L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case18() {
    int A = 444444444;
    int B = 1444444444;
    assertEquals(1004124789L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case19() {
    int A = 444444444;
    int B = 777777777;
    assertEquals(353825136L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case20() {
    int A = 893274;
    int B = 1324238943;
    assertEquals(1305462848L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case21() {
    int A = 23;
    int B = 433;
    assertEquals(174L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case22() {
    int A = 333333333;
    int B = 999999999;
    assertEquals(694239930L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case23() {
    int A = 184382;
    int B = 323462173;
    assertEquals(301221058L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case24() {
    int A = 111111;
    int B = 444444;
    assertEquals(256884L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case25() {
    int A = 44;
    int B = 44;
    assertEquals(2L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case26() {
    int A = 77;
    int B = 77;
    assertEquals(2L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case27() {
    int A = 777777777;
    int B = 877777777;
    assertEquals(102846195L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case28() {
    int A = 444444444;
    int B = 544444444;
    assertEquals(108830474L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case29() {
    int A = 100;
    int B = 156;
    assertEquals(19L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case30() {
    int A = 45634;
    int B = 23456443;
    assertEquals(20005740L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case31() {
    int A = 99;
    int B = 9999;
    assertEquals(6004L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case32() {
    int A = 3467;
    int B = 24567918;
    assertEquals(21209422L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case33() {
    int A = 7;
    int B = 9;
    assertEquals(1L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case34() {
    int A = 927388;
    int B = 937354;
    assertEquals(5996L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case35() {
    int A = 934345834;
    int B = 962817335;
    assertEquals(28249479L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case36() {
    int A = 8712;
    int B = 923473;
    assertEquals(726150L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case37() {
    int A = 188888;
    int B = 818394;
    assertEquals(525145L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case38() {
    int A = 1;
    int B = 2;
    assertEquals(0L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case39() {
    int A = 1;
    int B = 1999999996;
    assertEquals(2008249559L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case40() {
    int A = 3;
    int B = 2000000000;
    assertEquals(2008249560L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case41() {
    int A = 1;
    int B = 1999999997;
    assertEquals(2008249560L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case42() {
    int A = 2;
    int B = 1999999999;
    assertEquals(2008249560L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case43() {
    int A = 13;
    int B = 100000000;
    assertEquals(93769774L, sumofluckiness.theSum(A, B));
  }

  @Test
  public void case44() {
    int A = 1;
    int B = 199999999;
    assertEquals(187539552L, sumofluckiness.theSum(A, B));
  }

}
