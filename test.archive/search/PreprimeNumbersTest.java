package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class PreprimeNumbersTest {
  PreprimeNumbers preprimenumbers = new PreprimeNumbers();

  @Test
  public void case1() {
    int n = 2;
    assertEquals(8, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case2() {
    int n = 4;
    assertEquals(14, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case3() {
    int n = 24;
    assertEquals(77, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case4() {
    int n = 43765;
    assertEquals(193539, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case5() {
    int n = 1;
    assertEquals(6, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case6() {
    int n = 2;
    assertEquals(8, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case7() {
    int n = 3;
    assertEquals(10, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case8() {
    int n = 4;
    assertEquals(14, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case9() {
    int n = 5;
    assertEquals(15, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case10() {
    int n = 6;
    assertEquals(21, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case11() {
    int n = 7;
    assertEquals(22, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case12() {
    int n = 8;
    assertEquals(26, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case13() {
    int n = 9;
    assertEquals(27, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case14() {
    int n = 10;
    assertEquals(33, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case15() {
    int n = 11;
    assertEquals(34, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case16() {
    int n = 12;
    assertEquals(35, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case17() {
    int n = 13;
    assertEquals(38, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case18() {
    int n = 14;
    assertEquals(39, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case19() {
    int n = 15;
    assertEquals(46, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case20() {
    int n = 16;
    assertEquals(51, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case21() {
    int n = 17;
    assertEquals(55, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case22() {
    int n = 18;
    assertEquals(57, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case23() {
    int n = 19;
    assertEquals(58, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case24() {
    int n = 20;
    assertEquals(62, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case25() {
    int n = 436472;
    assertEquals(2151109, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case26() {
    int n = 373964;
    assertEquals(1829787, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case27() {
    int n = 112934;
    assertEquals(523027, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case28() {
    int n = 284400;
    assertEquals(1374419, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case29() {
    int n = 236747;
    assertEquals(1134723, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case30() {
    int n = 75652;
    assertEquals(343747, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case31() {
    int n = 29484;
    assertEquals(127741, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case32() {
    int n = 557000;
    assertEquals(2774578, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case33() {
    int n = 779955;
    assertEquals(3943781, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case34() {
    int n = 287497;
    assertEquals(1390163, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case35() {
    int n = 577875;
    assertEquals(2883721, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case36() {
    int n = 111503;
    assertEquals(515855, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case37() {
    int n = 754527;
    assertEquals(3809129, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case38() {
    int n = 73017;
    assertEquals(331199, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case39() {
    int n = 223366;
    assertEquals(1067033, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case40() {
    int n = 103448;
    assertEquals(476939, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case41() {
    int n = 866949;
    assertEquals(4402573, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case42() {
    int n = 877603;
    assertEquals(4459943, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case43() {
    int n = 292424;
    assertEquals(1415091, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case44() {
    int n = 357207;
    assertEquals(1743974, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case45() {
    int n = 999991;
    assertEquals(5111398, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case46() {
    int n = 999992;
    assertEquals(5111411, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case47() {
    int n = 999993;
    assertEquals(5111417, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case48() {
    int n = 999994;
    assertEquals(5111422, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case49() {
    int n = 999995;
    assertEquals(5111427, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case50() {
    int n = 999996;
    assertEquals(5111429, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case51() {
    int n = 999997;
    assertEquals(5111431, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case52() {
    int n = 999998;
    assertEquals(5111437, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case53() {
    int n = 999999;
    assertEquals(5111441, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case54() {
    int n = 1000000;
    assertEquals(5111443, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case55() {
    int n = 1000000;
    assertEquals(5111443, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case56() {
    int n = 999983;
    assertEquals(5111357, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case57() {
    int n = 500000;
    assertEquals(2478478, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case58() {
    int n = 43765;
    assertEquals(193539, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case59() {
    int n = 999999;
    assertEquals(5111441, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case60() {
    int n = 100000;
    assertEquals(460011, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case61() {
    int n = 990008;
    assertEquals(5058439, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case62() {
    int n = 10000;
    assertEquals(41037, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case63() {
    int n = 888888;
    assertEquals(4519839, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case64() {
    int n = 4;
    assertEquals(14, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case65() {
    int n = 999997;
    assertEquals(5111431, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case66() {
    int n = 987654;
    assertEquals(5045882, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case67() {
    int n = 1000000;
    assertEquals(5111443, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case68() {
    int n = 999983;
    assertEquals(5111357, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case69() {
    int n = 500000;
    assertEquals(2478478, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case70() {
    int n = 43765;
    assertEquals(193539, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case71() {
    int n = 999999;
    assertEquals(5111441, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case72() {
    int n = 100000;
    assertEquals(460011, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case73() {
    int n = 990008;
    assertEquals(5058439, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case74() {
    int n = 10000;
    assertEquals(41037, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case75() {
    int n = 888888;
    assertEquals(4519839, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case76() {
    int n = 4;
    assertEquals(14, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case77() {
    int n = 999997;
    assertEquals(5111431, preprimenumbers.nthNumber(n));
  }

  @Test
  public void case78() {
    int n = 987654;
    assertEquals(5045882, preprimenumbers.nthNumber(n));
  }

}
