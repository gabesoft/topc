package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TheTicketsDivTwoTest {
  double DELTA = 1.0e-09;
  TheTicketsDivTwo theticketsdivtwo = new TheTicketsDivTwo();

  @Test
  public void case1() {
    int n = 2;
    int m = 1;
    int k = 1;
    assertEquals(0.16666666666666666, theticketsdivtwo.find(n, m, k), DELTA * 0.16666666666666666);
  }

  @Test
  public void case2() {
    int n = 2;
    int m = 1;
    int k = 2;
    assertEquals(0.5833333333333334, theticketsdivtwo.find(n, m, k), DELTA * 0.5833333333333334);
  }

  @Test
  public void case3() {
    int n = 7;
    int m = 7;
    int k = 4;
    assertEquals(0.0, theticketsdivtwo.find(n, m, k), DELTA);
  }

  @Test
  public void case4() {
    int n = 4;
    int m = 2;
    int k = 10;
    assertEquals(0.25264033564814814, theticketsdivtwo.find(n, m, k), DELTA * 0.25264033564814814);
  }

  @Test
  public void case5() {
    int n = 9;
    int m = 1;
    int k = 4;
    assertEquals(0.16666666666666666, theticketsdivtwo.find(n, m, k), DELTA * 0.16666666666666666);
  }

  @Test
  public void case6() {
    int n = 5;
    int m = 5;
    int k = 6;
    assertEquals(0.12152777777777778, theticketsdivtwo.find(n, m, k), DELTA * 0.12152777777777778);
  }

  @Test
  public void case7() {
    int n = 1;
    int m = 1;
    int k = 10;
    assertEquals(1.0, theticketsdivtwo.find(n, m, k), DELTA * 1.0);
  }

  @Test
  public void case8() {
    int n = 10;
    int m = 1;
    int k = 6;
    assertEquals(0.16666666666666666, theticketsdivtwo.find(n, m, k), DELTA * 0.16666666666666666);
  }

  @Test
  public void case9() {
    int n = 7;
    int m = 2;
    int k = 6;
    assertEquals(0.1388888888888889, theticketsdivtwo.find(n, m, k), DELTA * 0.1388888888888889);
  }

  @Test
  public void case10() {
    int n = 6;
    int m = 3;
    int k = 9;
    assertEquals(0.1586210776748971, theticketsdivtwo.find(n, m, k), DELTA * 0.1586210776748971);
  }

  @Test
  public void case11() {
    int n = 4;
    int m = 1;
    int k = 2;
    assertEquals(0.16666666666666666, theticketsdivtwo.find(n, m, k), DELTA * 0.16666666666666666);
  }

  @Test
  public void case12() {
    int n = 6;
    int m = 1;
    int k = 7;
    assertEquals(0.20187114197530864, theticketsdivtwo.find(n, m, k), DELTA * 0.20187114197530864);
  }

  @Test
  public void case13() {
    int n = 8;
    int m = 2;
    int k = 7;
    assertEquals(0.1388888888888889, theticketsdivtwo.find(n, m, k), DELTA * 0.1388888888888889);
  }

  @Test
  public void case14() {
    int n = 2;
    int m = 1;
    int k = 9;
    assertEquals(0.443359375, theticketsdivtwo.find(n, m, k), DELTA * 0.443359375);
  }

  @Test
  public void case15() {
    int n = 2;
    int m = 2;
    int k = 3;
    assertEquals(0.625, theticketsdivtwo.find(n, m, k), DELTA * 0.625);
  }

  @Test
  public void case16() {
    int n = 9;
    int m = 9;
    int k = 9;
    assertEquals(0.0388883530521262, theticketsdivtwo.find(n, m, k), DELTA * 0.0388883530521262);
  }

  @Test
  public void case17() {
    int n = 8;
    int m = 6;
    int k = 9;
    assertEquals(0.07633887745770462, theticketsdivtwo.find(n, m, k), DELTA * 0.07633887745770462);
  }

  @Test
  public void case18() {
    int n = 7;
    int m = 1;
    int k = 4;
    assertEquals(0.16666666666666666, theticketsdivtwo.find(n, m, k), DELTA * 0.16666666666666666);
  }

  @Test
  public void case19() {
    int n = 3;
    int m = 2;
    int k = 9;
    assertEquals(0.3168402777777778, theticketsdivtwo.find(n, m, k), DELTA * 0.3168402777777778);
  }

  @Test
  public void case20() {
    int n = 9;
    int m = 7;
    int k = 6;
    assertEquals(0.33489797668038407, theticketsdivtwo.find(n, m, k), DELTA * 0.33489797668038407);
  }

  @Test
  public void case21() {
    int n = 6;
    int m = 1;
    int k = 9;
    assertEquals(0.22116126543209877, theticketsdivtwo.find(n, m, k), DELTA * 0.22116126543209877);
  }

  @Test
  public void case22() {
    int n = 3;
    int m = 2;
    int k = 10;
    assertEquals(0.3184678819444444, theticketsdivtwo.find(n, m, k), DELTA * 0.3184678819444444);
  }

  @Test
  public void case23() {
    int n = 5;
    int m = 1;
    int k = 10;
    assertEquals(0.24895109953703703, theticketsdivtwo.find(n, m, k), DELTA * 0.24895109953703703);
  }

  @Test
  public void case24() {
    int n = 7;
    int m = 1;
    int k = 8;
    assertEquals(0.19514639060356653, theticketsdivtwo.find(n, m, k), DELTA * 0.19514639060356653);
  }

  @Test
  public void case25() {
    int n = 6;
    int m = 1;
    int k = 9;
    assertEquals(0.22116126543209877, theticketsdivtwo.find(n, m, k), DELTA * 0.22116126543209877);
  }

  @Test
  public void case26() {
    int n = 1;
    int m = 1;
    int k = 9;
    assertEquals(1.0, theticketsdivtwo.find(n, m, k), DELTA * 1.0);
  }

  @Test
  public void case27() {
    int n = 3;
    int m = 3;
    int k = 10;
    assertEquals(0.3439670138888889, theticketsdivtwo.find(n, m, k), DELTA * 0.3439670138888889);
  }

  @Test
  public void case28() {
    int n = 7;
    int m = 7;
    int k = 8;
    assertEquals(0.06210348079561043, theticketsdivtwo.find(n, m, k), DELTA * 0.06210348079561043);
  }

  @Test
  public void case29() {
    int n = 2;
    int m = 2;
    int k = 10;
    assertEquals(0.5550130208333334, theticketsdivtwo.find(n, m, k), DELTA * 0.5550130208333334);
  }

  @Test
  public void case30() {
    int n = 2;
    int m = 1;
    int k = 10;
    assertEquals(0.4449869791666667, theticketsdivtwo.find(n, m, k), DELTA * 0.4449869791666667);
  }

  @Test
  public void case31() {
    int n = 9;
    int m = 1;
    int k = 10;
    assertEquals(0.18611084319272977, theticketsdivtwo.find(n, m, k), DELTA * 0.18611084319272977);
  }

  @Test
  public void case32() {
    int n = 5;
    int m = 5;
    int k = 10;
    assertEquals(0.16149450231481483, theticketsdivtwo.find(n, m, k), DELTA * 0.16149450231481483);
  }

  @Test
  public void case33() {
    int n = 1;
    int m = 1;
    int k = 10;
    assertEquals(1.0, theticketsdivtwo.find(n, m, k), DELTA * 1.0);
  }

  @Test
  public void case34() {
    int n = 10;
    int m = 1;
    int k = 10;
    assertEquals(0.2635700164005741, theticketsdivtwo.find(n, m, k), DELTA * 0.2635700164005741);
  }

  @Test
  public void case35() {
    int n = 7;
    int m = 2;
    int k = 10;
    assertEquals(0.17257962534293553, theticketsdivtwo.find(n, m, k), DELTA * 0.17257962534293553);
  }

  @Test
  public void case36() {
    int n = 6;
    int m = 3;
    int k = 10;
    assertEquals(0.1668997556584362, theticketsdivtwo.find(n, m, k), DELTA * 0.1668997556584362);
  }

  @Test
  public void case37() {
    int n = 4;
    int m = 1;
    int k = 10;
    assertEquals(0.28313078703703703, theticketsdivtwo.find(n, m, k), DELTA * 0.28313078703703703);
  }

  @Test
  public void case38() {
    int n = 6;
    int m = 1;
    int k = 10;
    assertEquals(0.23161008230452676, theticketsdivtwo.find(n, m, k), DELTA * 0.23161008230452676);
  }

  @Test
  public void case39() {
    int n = 8;
    int m = 2;
    int k = 10;
    assertEquals(0.16096313085848193, theticketsdivtwo.find(n, m, k), DELTA * 0.16096313085848193);
  }

  @Test
  public void case40() {
    int n = 2;
    int m = 1;
    int k = 10;
    assertEquals(0.4449869791666667, theticketsdivtwo.find(n, m, k), DELTA * 0.4449869791666667);
  }

  @Test
  public void case41() {
    int n = 3;
    int m = 1;
    int k = 10;
    assertEquals(0.3375651041666667, theticketsdivtwo.find(n, m, k), DELTA * 0.3375651041666667);
  }

  @Test
  public void case42() {
    int n = 2;
    int m = 2;
    int k = 10;
    assertEquals(0.5550130208333334, theticketsdivtwo.find(n, m, k), DELTA * 0.5550130208333334);
  }

  @Test
  public void case43() {
    int n = 3;
    int m = 3;
    int k = 10;
    assertEquals(0.3439670138888889, theticketsdivtwo.find(n, m, k), DELTA * 0.3439670138888889);
  }

  @Test
  public void case44() {
    int n = 2;
    int m = 1;
    int k = 10;
    assertEquals(0.4449869791666667, theticketsdivtwo.find(n, m, k), DELTA * 0.4449869791666667);
  }

  @Test
  public void case45() {
    int n = 10;
    int m = 10;
    int k = 10;
    assertEquals(0.03234345429749022, theticketsdivtwo.find(n, m, k), DELTA * 0.03234345429749022);
  }

  @Test
  public void case46() {
    int n = 1;
    int m = 1;
    int k = 10;
    assertEquals(1.0, theticketsdivtwo.find(n, m, k), DELTA * 1.0);
  }

  @Test
  public void case47() {
    int n = 4;
    int m = 1;
    int k = 10;
    assertEquals(0.28313078703703703, theticketsdivtwo.find(n, m, k), DELTA * 0.28313078703703703);
  }

  @Test
  public void case48() {
    int n = 10;
    int m = 3;
    int k = 10;
    assertEquals(0.13124527669816594, theticketsdivtwo.find(n, m, k), DELTA * 0.13124527669816594);
  }

  @Test
  public void case49() {
    int n = 10;
    int m = 7;
    int k = 10;
    assertEquals(0.05621324556724076, theticketsdivtwo.find(n, m, k), DELTA * 0.05621324556724076);
  }

  @Test
  public void case50() {
    int n = 9;
    int m = 8;
    int k = 7;
    assertEquals(0.2790816472336534, theticketsdivtwo.find(n, m, k), DELTA * 0.2790816472336534);
  }

  @Test
  public void case51() {
    int n = 10;
    int m = 4;
    int k = 10;
    assertEquals(0.10265243166692069, theticketsdivtwo.find(n, m, k), DELTA * 0.10265243166692069);
  }

  @Test
  public void case52() {
    int n = 6;
    int m = 5;
    int k = 4;
    assertEquals(0.48225308641975306, theticketsdivtwo.find(n, m, k), DELTA * 0.48225308641975306);
  }

  @Test
  public void case53() {
    int n = 5;
    int m = 4;
    int k = 3;
    assertEquals(0.5787037037037037, theticketsdivtwo.find(n, m, k), DELTA * 0.5787037037037037);
  }

  @Test
  public void case54() {
    int n = 3;
    int m = 3;
    int k = 4;
    assertEquals(0.3472222222222222, theticketsdivtwo.find(n, m, k), DELTA * 0.3472222222222222);
  }

  @Test
  public void case55() {
    int n = 10;
    int m = 6;
    int k = 10;
    assertEquals(0.06797188563735203, theticketsdivtwo.find(n, m, k), DELTA * 0.06797188563735203);
  }

  @Test
  public void case56() {
    int n = 10;
    int m = 8;
    int k = 9;
    assertEquals(0.04651360787227557, theticketsdivtwo.find(n, m, k), DELTA * 0.04651360787227557);
  }

  @Test
  public void case57() {
    int n = 10;
    int m = 5;
    int k = 10;
    assertEquals(0.08285624015648022, theticketsdivtwo.find(n, m, k), DELTA * 0.08285624015648022);
  }

  @Test
  public void case58() {
    int n = 5;
    int m = 2;
    int k = 3;
    assertEquals(0.1388888888888889, theticketsdivtwo.find(n, m, k), DELTA * 0.1388888888888889);
  }

  @Test
  public void case59() {
    int n = 9;
    int m = 2;
    int k = 9;
    assertEquals(0.18540249676116446, theticketsdivtwo.find(n, m, k), DELTA * 0.18540249676116446);
  }

  @Test
  public void case60() {
    int n = 4;
    int m = 2;
    int k = 8;
    assertEquals(0.25752314814814814, theticketsdivtwo.find(n, m, k), DELTA * 0.25752314814814814);
  }

  @Test
  public void case61() {
    int n = 2;
    int m = 2;
    int k = 1;
    assertEquals(0.8333333333333334, theticketsdivtwo.find(n, m, k), DELTA * 0.8333333333333334);
  }

  @Test
  public void case62() {
    int n = 5;
    int m = 1;
    int k = 9;
    assertEquals(0.25636574074074076, theticketsdivtwo.find(n, m, k), DELTA * 0.25636574074074076);
  }

  @Test
  public void case63() {
    int n = 7;
    int m = 4;
    int k = 10;
    assertEquals(0.140918370627572, theticketsdivtwo.find(n, m, k), DELTA * 0.140918370627572);
  }

  @Test
  public void case64() {
    int n = 5;
    int m = 2;
    int k = 10;
    assertEquals(0.22075135030864199, theticketsdivtwo.find(n, m, k), DELTA * 0.22075135030864199);
  }

  @Test
  public void case65() {
    int n = 9;
    int m = 7;
    int k = 10;
    assertEquals(0.059531464334705075, theticketsdivtwo.find(n, m, k), DELTA * 0.059531464334705075);
  }

}
