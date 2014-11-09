package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class DivisibleByDigitsTest {
  DivisibleByDigits divisiblebydigits = new DivisibleByDigits();

  @Test
  public void case1() {
    int n = 13;
    assertEquals(132L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case2() {
    int n = 648;
    assertEquals(648L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case3() {
    int n = 566;
    assertEquals(56610L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case4() {
    int n = 308;
    assertEquals(30816L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case5() {
    int n = 191;
    assertEquals(1917L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case6() {
    int n = 1000000000;
    assertEquals(1000000000L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case7() {
    int n = 64348557;
    assertEquals(64348557000L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case8() {
    int n = 987654321;
    assertEquals(987654321360L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case9() {
    int n = 123456789;
    assertEquals(1234567890360L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case10() {
    int n = 1;
    assertEquals(1L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case11() {
    int n = 2;
    assertEquals(2L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case12() {
    int n = 9;
    assertEquals(9L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case13() {
    int n = 10;
    assertEquals(10L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case14() {
    int n = 12;
    assertEquals(12L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case15() {
    int n = 14;
    assertEquals(140L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case16() {
    int n = 17;
    assertEquals(175L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case17() {
    int n = 74;
    assertEquals(7420L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case18() {
    int n = 98;
    assertEquals(9864L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case19() {
    int n = 108;
    assertEquals(1080L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case20() {
    int n = 345;
    assertEquals(34500L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case21() {
    int n = 397;
    assertEquals(39753L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case22() {
    int n = 491;
    assertEquals(49104L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case23() {
    int n = 777;
    assertEquals(777L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case24() {
    int n = 1078;
    assertEquals(107800L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case25() {
    int n = 1245;
    assertEquals(124500L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case26() {
    int n = 1279;
    assertEquals(1279026L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case27() {
    int n = 1583;
    assertEquals(1583040L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case28() {
    int n = 1759;
    assertEquals(1759275L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case29() {
    int n = 1765;
    assertEquals(1765050L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case30() {
    int n = 7185;
    assertEquals(7185080L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case31() {
    int n = 7298;
    assertEquals(7298424L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case32() {
    int n = 23497;
    assertEquals(23497236L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case33() {
    int n = 47259;
    assertEquals(472590720L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case34() {
    int n = 5789;
    assertEquals(57891960L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case35() {
    int n = 7589;
    assertEquals(75892320L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case36() {
    int n = 19758;
    assertEquals(197580600L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case37() {
    int n = 28759;
    assertEquals(287592480L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case38() {
    int n = 44957;
    assertEquals(449570520L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case39() {
    int n = 200508709;
    assertEquals(2005087092120L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case40() {
    int n = 314159265;
    assertEquals(31415926500L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case41() {
    int n = 314167958;
    assertEquals(3141679582440L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case42() {
    int n = 314169578;
    assertEquals(3141695781000L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case43() {
    int n = 464597508;
    assertEquals(4645975080600L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case44() {
    int n = 464597517;
    assertEquals(4645975170060L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case45() {
    int n = 504604188;
    assertEquals(5046041880L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case46() {
    int n = 604070913;
    assertEquals(6040709136L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case47() {
    int n = 704060432;
    assertEquals(70406043204L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case48() {
    int n = 774378549;
    assertEquals(774378549000L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case49() {
    int n = 812341512;
    assertEquals(8123415120L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case50() {
    int n = 825473880;
    assertEquals(825473880L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case51() {
    int n = 833330001;
    assertEquals(8333300016L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case52() {
    int n = 833333759;
    assertEquals(8333337592440L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case53() {
    int n = 844444597;
    assertEquals(8444445972480L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case54() {
    int n = 931394757;
    assertEquals(9313947570060L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case55() {
    int n = 934330293;
    assertEquals(93433029300L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case56() {
    int n = 999252999;
    assertEquals(9992529990L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case57() {
    int n = 999585999;
    assertEquals(999585999000L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case58() {
    int n = 999909999;
    assertEquals(999909999L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case59() {
    int n = 999999991;
    assertEquals(9999999918L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case60() {
    int n = 999999992;
    assertEquals(99999999216L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case61() {
    int n = 999999997;
    assertEquals(99999999729L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case62() {
    int n = 999999999;
    assertEquals(999999999L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case63() {
    int n = 83;
    assertEquals(8304L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case64() {
    int n = 346258971;
    assertEquals(3462589710720L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case65() {
    int n = 907678453;
    assertEquals(9076784532480L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case66() {
    int n = 56789;
    assertEquals(567892080L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case67() {
    int n = 147;
    assertEquals(14700L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case68() {
    int n = 950030021;
    assertEquals(95003002170L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case69() {
    int n = 782343;
    assertEquals(782343072L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case70() {
    int n = 999999750;
    assertEquals(999999750015L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case71() {
    int n = 310;
    assertEquals(3102L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case72() {
    int n = 234567890;
    assertEquals(2345678901720L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case73() {
    int n = 21;
    assertEquals(210L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case74() {
    int n = 19;
    assertEquals(198L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case75() {
    int n = 6214;
    assertEquals(62148L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case76() {
    int n = 27;
    assertEquals(2702L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case77() {
    int n = 999000587;
    assertEquals(9990005870880L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case78() {
    int n = 9010;
    assertEquals(90108L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case79() {
    int n = 77996611;
    assertEquals(7799661198L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case80() {
    int n = 19783465;
    assertEquals(197834651280L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case81() {
    int n = 25;
    assertEquals(250L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case82() {
    int n = 987577770;
    assertEquals(9875777700600L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case83() {
    int n = 334;
    assertEquals(3348L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case84() {
    int n = 927316845;
    assertEquals(927316845000L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case85() {
    int n = 58;
    assertEquals(5800L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case86() {
    int n = 46;
    assertEquals(468L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case87() {
    int n = 925483158;
    assertEquals(92548315800L, divisiblebydigits.getContinuation(n));
  }

  @Test
  public void case88() {
    int n = 752752752;
    assertEquals(75275275250L, divisiblebydigits.getContinuation(n));
  }

}
