package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheLuckyBasesDivTwoTest {
  TheLuckyBasesDivTwo theluckybasesdivtwo = new TheLuckyBasesDivTwo();

  @Test
  public void case1() {
    long n = 255L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case2() {
    long n = 4L;
    assertEquals(-1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case3() {
    long n = 13L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case4() {
    long n = 60L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case5() {
    long n = 17L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case6() {
    long n = 23L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case7() {
    long n = 52L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case8() {
    long n = 347723696L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case9() {
    long n = 925643275L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case10() {
    long n = 65038986L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case11() {
    long n = 644199585L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case12() {
    long n = 333393417L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case13() {
    long n = 255248223L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case14() {
    long n = 683104052L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case15() {
    long n = 517788483L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case16() {
    long n = 434727064L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case17() {
    long n = 610370488L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case18() {
    long n = 454765462L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case19() {
    long n = 643862778L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case20() {
    long n = 852497597L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case21() {
    long n = 619347723696L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case22() {
    long n = 257925643275L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case23() {
    long n = 120065038986L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case24() {
    long n = 914644199585L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case25() {
    long n = 912333393417L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case26() {
    long n = 215255248223L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case27() {
    long n = 191683104052L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case28() {
    long n = 164517788483L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case29() {
    long n = 493434727064L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case30() {
    long n = 728610370488L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case31() {
    long n = 919089952699L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case32() {
    long n = 957759064442L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case33() {
    long n = 919834457824L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case34() {
    long n = 914618803015L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case35() {
    long n = 912188536477L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case36() {
    long n = 1000000000000L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case37() {
    long n = 1L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case38() {
    long n = 474747477747L;
    assertEquals(3L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case39() {
    long n = 747477474774L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case40() {
    long n = 999999999048L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case41() {
    long n = 999999999541L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case42() {
    long n = 999999999973L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case43() {
    long n = 999999999234L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case44() {
    long n = 999999999667L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case45() {
    long n = 999999999561L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case46() {
    long n = 999999999245L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case47() {
    long n = 999999999321L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case48() {
    long n = 762939453124L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case49() {
    long n = 141214768240L;
    assertEquals(3L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case50() {
    long n = 314146179364L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case51() {
    long n = 854645986252L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case52() {
    long n = 236663697847L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case53() {
    long n = 549352360252L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case54() {
    long n = 2044801603L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case55() {
    long n = 254911373669L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case56() {
    long n = 358759972685L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case57() {
    long n = 99801488981L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case58() {
    long n = 48853923508L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case59() {
    long n = 920885238805L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case60() {
    long n = 5695231426L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case61() {
    long n = 156915327850L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case62() {
    long n = 248176054407L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case63() {
    long n = 60471954180L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case64() {
    long n = 479064391809L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case65() {
    long n = 124999994016L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case66() {
    long n = 278013940L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case67() {
    long n = 253706887L;
    assertEquals(3L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case68() {
    long n = 392716078000L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case69() {
    long n = 468305010L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case70() {
    long n = 123079338204L;
    assertEquals(3L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case71() {
    long n = 35016046314L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case72() {
    long n = 34312041063L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case73() {
    long n = 2782467538L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case74() {
    long n = 26689021741L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case75() {
    long n = 999998000004L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case76() {
    long n = 9999887898L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case77() {
    long n = 999999999999L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case78() {
    long n = 44444444451L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case79() {
    long n = 4000000004L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case80() {
    long n = 99999999999L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case81() {
    long n = 100000000000L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case82() {
    long n = 99798999447L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case83() {
    long n = 1000000000L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case84() {
    long n = 2760721L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case85() {
    long n = 47L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case86() {
    long n = 4747L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case87() {
    long n = 44L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case88() {
    long n = 9999999019L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case89() {
    long n = 156464699494L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case90() {
    long n = 8L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case91() {
    long n = 63L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case92() {
    long n = 1684L;
    assertEquals(4L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case93() {
    long n = 532L;
    assertEquals(3L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case94() {
    long n = 744L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case95() {
    long n = 100000000007L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case96() {
    long n = 17048794L;
    assertEquals(2L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case97() {
    long n = 12345678901L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case98() {
    long n = 14L;
    assertEquals(0L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case99() {
    long n = 77L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

  @Test
  public void case100() {
    long n = 4000008L;
    assertEquals(1L, theluckybasesdivtwo.find(n));
  }

}
