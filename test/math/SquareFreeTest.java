package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SquareFreeTest {
  SquareFree squarefree = new SquareFree();

  @Test
  public void case1() {
    int n = 1;
    assertEquals(1, squarefree.getNumber(n));
  }

  @Test
  public void case2() {
    int n = 13;
    assertEquals(19, squarefree.getNumber(n));
  }

  @Test
  public void case3() {
    int n = 100;
    assertEquals(163, squarefree.getNumber(n));
  }

  @Test
  public void case4() {
    int n = 1234567;
    assertEquals(2030745, squarefree.getNumber(n));
  }

  @Test
  public void case5() {
    int n = 1000000000;
    assertEquals(1644934081, squarefree.getNumber(n));
  }

  @Test
  public void case6() {
    int n = 90967;
    assertEquals(149622, squarefree.getNumber(n));
  }

  @Test
  public void case7() {
    int n = 11319;
    assertEquals(18611, squarefree.getNumber(n));
  }

  @Test
  public void case8() {
    int n = 513;
    assertEquals(839, squarefree.getNumber(n));
  }

  @Test
  public void case9() {
    int n = 11184;
    assertEquals(18386, squarefree.getNumber(n));
  }

  @Test
  public void case10() {
    int n = 375;
    assertEquals(614, squarefree.getNumber(n));
  }

  @Test
  public void case11() {
    int n = 138167024;
    assertEquals(227275651, squarefree.getNumber(n));
  }

  @Test
  public void case12() {
    int n = 424;
    assertEquals(694, squarefree.getNumber(n));
  }

  @Test
  public void case13() {
    int n = 24528128;
    assertEquals(40347210, squarefree.getNumber(n));
  }

  @Test
  public void case14() {
    int n = 29159607;
    assertEquals(47965587, squarefree.getNumber(n));
  }

  @Test
  public void case15() {
    int n = 1043;
    assertEquals(1713, squarefree.getNumber(n));
  }

  @Test
  public void case16() {
    int n = 239412989;
    assertEquals(393818515, squarefree.getNumber(n));
  }

  @Test
  public void case17() {
    int n = 416543150;
    assertEquals(685186026, squarefree.getNumber(n));
  }

  @Test
  public void case18() {
    int n = 997143;
    assertEquals(1640219, squarefree.getNumber(n));
  }

  @Test
  public void case19() {
    int n = 1168;
    assertEquals(1923, squarefree.getNumber(n));
  }

  @Test
  public void case20() {
    int n = 9777;
    assertEquals(16081, squarefree.getNumber(n));
  }

  @Test
  public void case21() {
    int n = 697611709;
    assertEquals(1147525338, squarefree.getNumber(n));
  }

  @Test
  public void case22() {
    int n = 831293191;
    assertEquals(1367422478, squarefree.getNumber(n));
  }

  @Test
  public void case23() {
    int n = 177;
    assertEquals(287, squarefree.getNumber(n));
  }

  @Test
  public void case24() {
    int n = 191425575;
    assertEquals(314882431, squarefree.getNumber(n));
  }

  @Test
  public void case25() {
    int n = 142779763;
    assertEquals(234863283, squarefree.getNumber(n));
  }

  @Test
  public void case26() {
    int n = 3814502;
    assertEquals(6274610, squarefree.getNumber(n));
  }

  @Test
  public void case27() {
    int n = 33096950;
    assertEquals(54442295, squarefree.getNumber(n));
  }

  @Test
  public void case28() {
    int n = 3884785;
    assertEquals(6390233, squarefree.getNumber(n));
  }

  @Test
  public void case29() {
    int n = 575209214;
    assertEquals(946181155, squarefree.getNumber(n));
  }

  @Test
  public void case30() {
    int n = 63881;
    assertEquals(105073, squarefree.getNumber(n));
  }

  @Test
  public void case31() {
    int n = 57053771;
    assertEquals(93849726, squarefree.getNumber(n));
  }

  @Test
  public void case32() {
    int n = 16973;
    assertEquals(27914, squarefree.getNumber(n));
  }

  @Test
  public void case33() {
    int n = 156221776;
    assertEquals(256974547, squarefree.getNumber(n));
  }

  @Test
  public void case34() {
    int n = 2620340;
    assertEquals(4310274, squarefree.getNumber(n));
  }

  @Test
  public void case35() {
    int n = 539;
    assertEquals(887, squarefree.getNumber(n));
  }

  @Test
  public void case36() {
    int n = 4329180;
    assertEquals(7121201, squarefree.getNumber(n));
  }

  @Test
  public void case37() {
    int n = 11595;
    assertEquals(19066, squarefree.getNumber(n));
  }

  @Test
  public void case38() {
    int n = 277268;
    assertEquals(456099, squarefree.getNumber(n));
  }

  @Test
  public void case39() {
    int n = 652494863;
    assertEquals(1073311086, squarefree.getNumber(n));
  }

  @Test
  public void case40() {
    int n = 844240558;
    assertEquals(1388720037, squarefree.getNumber(n));
  }

  @Test
  public void case41() {
    int n = 103244887;
    assertEquals(169830998, squarefree.getNumber(n));
  }

  @Test
  public void case42() {
    int n = 628220597;
    assertEquals(1033381445, squarefree.getNumber(n));
  }

  @Test
  public void case43() {
    int n = 1403692;
    assertEquals(2309001, squarefree.getNumber(n));
  }

  @Test
  public void case44() {
    int n = 922082415;
    assertEquals(1516764794, squarefree.getNumber(n));
  }

  @Test
  public void case45() {
    int n = 570889576;
    assertEquals(939075653, squarefree.getNumber(n));
  }

  @Test
  public void case46() {
    int n = 4270983;
    assertEquals(7025459, squarefree.getNumber(n));
  }

  @Test
  public void case47() {
    int n = 825196030;
    assertEquals(1357393089, squarefree.getNumber(n));
  }

  @Test
  public void case48() {
    int n = 220;
    assertEquals(362, squarefree.getNumber(n));
  }

  @Test
  public void case49() {
    int n = 162620192;
    assertEquals(267499497, squarefree.getNumber(n));
  }

  @Test
  public void case50() {
    int n = 56092;
    assertEquals(92262, squarefree.getNumber(n));
  }

  @Test
  public void case51() {
    int n = 284351294;
    assertEquals(467739070, squarefree.getNumber(n));
  }

  @Test
  public void case52() {
    int n = 18445;
    assertEquals(30335, squarefree.getNumber(n));
  }

  @Test
  public void case53() {
    int n = 1958283;
    assertEquals(3221258, squarefree.getNumber(n));
  }

  @Test
  public void case54() {
    int n = 117931104;
    assertEquals(193988937, squarefree.getNumber(n));
  }

  @Test
  public void case55() {
    int n = 43767868;
    assertEquals(71995151, squarefree.getNumber(n));
  }

  @Test
  public void case56() {
    int n = 590320058;
    assertEquals(971037565, squarefree.getNumber(n));
  }

  @Test
  public void case57() {
    int n = 78513;
    assertEquals(129138, squarefree.getNumber(n));
  }

  @Test
  public void case58() {
    int n = 966027;
    assertEquals(1589034, squarefree.getNumber(n));
  }

  @Test
  public void case59() {
    int n = 1185;
    assertEquals(1951, squarefree.getNumber(n));
  }

  @Test
  public void case60() {
    int n = 963135434;
    assertEquals(1584294294, squarefree.getNumber(n));
  }

  @Test
  public void case61() {
    int n = 1000000000;
    assertEquals(1644934081, squarefree.getNumber(n));
  }

  @Test
  public void case62() {
    int n = 999999999;
    assertEquals(1644934079, squarefree.getNumber(n));
  }

  @Test
  public void case63() {
    int n = 17;
    assertEquals(26, squarefree.getNumber(n));
  }

}
