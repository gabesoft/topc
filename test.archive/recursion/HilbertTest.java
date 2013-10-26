package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class HilbertTest {
  Hilbert hilbert = new Hilbert();

  @Test
  public void case1() {
    int k = 3;
    int x = 2;
    int y = 3;
    assertEquals(13, hilbert.steps(k, x, y));
  }

  @Test
  public void case2() {
    int k = 5;
    int x = 1;
    int y = 1;
    assertEquals(0, hilbert.steps(k, x, y));
  }

  @Test
  public void case3() {
    int k = 15;
    int x = 32768;
    int y = 1;
    assertEquals(1073741823, hilbert.steps(k, x, y));
  }

  @Test
  public void case4() {
    int k = 1;
    int x = 2;
    int y = 2;
    assertEquals(2, hilbert.steps(k, x, y));
  }

  @Test
  public void case5() {
    int k = 10;
    int x = 546;
    int y = 109;
    assertEquals(955129, hilbert.steps(k, x, y));
  }

  @Test
  public void case6() {
    int k = 15;
    int x = 30000;
    int y = 30000;
    assertEquals(706873514, hilbert.steps(k, x, y));
  }

  @Test
  public void case7() {
    int k = 1;
    int x = 1;
    int y = 1;
    assertEquals(0, hilbert.steps(k, x, y));
  }

  @Test
  public void case8() {
    int k = 2;
    int x = 3;
    int y = 1;
    assertEquals(14, hilbert.steps(k, x, y));
  }

  @Test
  public void case9() {
    int k = 2;
    int x = 3;
    int y = 2;
    assertEquals(13, hilbert.steps(k, x, y));
  }

  @Test
  public void case10() {
    int k = 3;
    int x = 6;
    int y = 7;
    assertEquals(39, hilbert.steps(k, x, y));
  }

  @Test
  public void case11() {
    int k = 3;
    int x = 7;
    int y = 2;
    assertEquals(61, hilbert.steps(k, x, y));
  }

  @Test
  public void case12() {
    int k = 4;
    int x = 9;
    int y = 2;
    assertEquals(233, hilbert.steps(k, x, y));
  }

  @Test
  public void case13() {
    int k = 4;
    int x = 8;
    int y = 3;
    assertEquals(25, hilbert.steps(k, x, y));
  }

  @Test
  public void case14() {
    int k = 5;
    int x = 21;
    int y = 21;
    assertEquals(544, hilbert.steps(k, x, y));
  }

  @Test
  public void case15() {
    int k = 5;
    int x = 18;
    int y = 23;
    assertEquals(573, hilbert.steps(k, x, y));
  }

  @Test
  public void case16() {
    int k = 7;
    int x = 52;
    int y = 87;
    assertEquals(7353, hilbert.steps(k, x, y));
  }

  @Test
  public void case17() {
    int k = 10;
    int x = 17;
    int y = 47;
    assertEquals(1878, hilbert.steps(k, x, y));
  }

  @Test
  public void case18() {
    int k = 6;
    int x = 20;
    int y = 12;
    assertEquals(480, hilbert.steps(k, x, y));
  }

  @Test
  public void case19() {
    int k = 8;
    int x = 92;
    int y = 186;
    assertEquals(29742, hilbert.steps(k, x, y));
  }

  @Test
  public void case20() {
    int k = 6;
    int x = 12;
    int y = 11;
    assertEquals(137, hilbert.steps(k, x, y));
  }

  @Test
  public void case21() {
    int k = 7;
    int x = 5;
    int y = 108;
    assertEquals(5343, hilbert.steps(k, x, y));
  }

  @Test
  public void case22() {
    int k = 7;
    int x = 52;
    int y = 72;
    assertEquals(7984, hilbert.steps(k, x, y));
  }

  @Test
  public void case23() {
    int k = 8;
    int x = 162;
    int y = 162;
    assertEquals(34818, hilbert.steps(k, x, y));
  }

  @Test
  public void case24() {
    int k = 9;
    int x = 492;
    int y = 143;
    assertEquals(202257, hilbert.steps(k, x, y));
  }

  @Test
  public void case25() {
    int k = 8;
    int x = 78;
    int y = 114;
    assertEquals(12114, hilbert.steps(k, x, y));
  }

  @Test
  public void case26() {
    int k = 6;
    int x = 21;
    int y = 2;
    assertEquals(313, hilbert.steps(k, x, y));
  }

  @Test
  public void case27() {
    int k = 10;
    int x = 777;
    int y = 476;
    assertEquals(850821, hilbert.steps(k, x, y));
  }

  @Test
  public void case28() {
    int k = 7;
    int x = 82;
    int y = 19;
    assertEquals(14509, hilbert.steps(k, x, y));
  }

  @Test
  public void case29() {
    int k = 10;
    int x = 574;
    int y = 264;
    assertEquals(896998, hilbert.steps(k, x, y));
  }

  @Test
  public void case30() {
    int k = 9;
    int x = 321;
    int y = 290;
    assertEquals(138923, hilbert.steps(k, x, y));
  }

  @Test
  public void case31() {
    int k = 8;
    int x = 33;
    int y = 28;
    assertEquals(3429, hilbert.steps(k, x, y));
  }

  @Test
  public void case32() {
    int k = 10;
    int x = 319;
    int y = 712;
    assertEquals(483305, hilbert.steps(k, x, y));
  }

  @Test
  public void case33() {
    int k = 6;
    int x = 22;
    int y = 56;
    assertEquals(1580, hilbert.steps(k, x, y));
  }

  @Test
  public void case34() {
    int k = 6;
    int x = 25;
    int y = 2;
    assertEquals(323, hilbert.steps(k, x, y));
  }

  @Test
  public void case35() {
    int k = 7;
    int x = 14;
    int y = 40;
    assertEquals(3652, hilbert.steps(k, x, y));
  }

  @Test
  public void case36() {
    int k = 8;
    int x = 71;
    int y = 219;
    assertEquals(25560, hilbert.steps(k, x, y));
  }

  @Test
  public void case37() {
    int k = 9;
    int x = 265;
    int y = 506;
    assertEquals(152961, hilbert.steps(k, x, y));
  }

  @Test
  public void case38() {
    int k = 7;
    int x = 104;
    int y = 45;
    assertEquals(13029, hilbert.steps(k, x, y));
  }

  @Test
  public void case39() {
    int k = 10;
    int x = 587;
    int y = 64;
    assertEquals(963993, hilbert.steps(k, x, y));
  }

  @Test
  public void case40() {
    int k = 8;
    int x = 115;
    int y = 12;
    assertEquals(5601, hilbert.steps(k, x, y));
  }

  @Test
  public void case41() {
    int k = 6;
    int x = 60;
    int y = 31;
    assertEquals(3089, hilbert.steps(k, x, y));
  }

  @Test
  public void case42() {
    int k = 10;
    int x = 417;
    int y = 709;
    assertEquals(472122, hilbert.steps(k, x, y));
  }

  @Test
  public void case43() {
    int k = 9;
    int x = 415;
    int y = 292;
    assertEquals(190457, hilbert.steps(k, x, y));
  }

  @Test
  public void case44() {
    int k = 10;
    int x = 747;
    int y = 873;
    assertEquals(639526, hilbert.steps(k, x, y));
  }

  @Test
  public void case45() {
    int k = 8;
    int x = 69;
    int y = 120;
    assertEquals(12069, hilbert.steps(k, x, y));
  }

  @Test
  public void case46() {
    int k = 9;
    int x = 444;
    int y = 393;
    assertEquals(165263, hilbert.steps(k, x, y));
  }

  @Test
  public void case47() {
    int k = 6;
    int x = 13;
    int y = 9;
    assertEquals(186, hilbert.steps(k, x, y));
  }

  @Test
  public void case48() {
    int k = 9;
    int x = 3;
    int y = 390;
    assertEquals(81949, hilbert.steps(k, x, y));
  }

  @Test
  public void case49() {
    int k = 10;
    int x = 951;
    int y = 765;
    assertEquals(735948, hilbert.steps(k, x, y));
  }

  @Test
  public void case50() {
    int k = 7;
    int x = 120;
    int y = 100;
    assertEquals(11194, hilbert.steps(k, x, y));
  }

  @Test
  public void case51() {
    int k = 8;
    int x = 5;
    int y = 241;
    assertEquals(21776, hilbert.steps(k, x, y));
  }

  @Test
  public void case52() {
    int k = 8;
    int x = 167;
    int y = 100;
    assertEquals(53905, hilbert.steps(k, x, y));
  }

  @Test
  public void case53() {
    int k = 7;
    int x = 46;
    int y = 21;
    assertEquals(1867, hilbert.steps(k, x, y));
  }

  @Test
  public void case54() {
    int k = 6;
    int x = 52;
    int y = 26;
    assertEquals(3276, hilbert.steps(k, x, y));
  }

  @Test
  public void case55() {
    int k = 7;
    int x = 54;
    int y = 20;
    assertEquals(1588, hilbert.steps(k, x, y));
  }

  @Test
  public void case56() {
    int k = 11;
    int x = 123;
    int y = 1976;
    assertEquals(1405145, hilbert.steps(k, x, y));
  }

  @Test
  public void case57() {
    int k = 12;
    int x = 4000;
    int y = 2561;
    assertEquals(11626837, hilbert.steps(k, x, y));
  }

  @Test
  public void case58() {
    int k = 13;
    int x = 6217;
    int y = 3122;
    assertEquals(53491137, hilbert.steps(k, x, y));
  }

  @Test
  public void case59() {
    int k = 14;
    int x = 455;
    int y = 15555;
    assertEquals(89235506, hilbert.steps(k, x, y));
  }

  @Test
  public void case60() {
    int k = 15;
    int x = 15678;
    int y = 9871;
    assertEquals(158191527, hilbert.steps(k, x, y));
  }

  @Test
  public void case61() {
    int k = 15;
    int x = 32767;
    int y = 17011;
    assertEquals(805038840, hilbert.steps(k, x, y));
  }

  @Test
  public void case62() {
    int k = 5;
    int x = 1;
    int y = 1;
    assertEquals(0, hilbert.steps(k, x, y));
  }

  @Test
  public void case63() {
    int k = 15;
    int x = 30000;
    int y = 30000;
    assertEquals(706873514, hilbert.steps(k, x, y));
  }

  @Test
  public void case64() {
    int k = 10;
    int x = 546;
    int y = 109;
    assertEquals(955129, hilbert.steps(k, x, y));
  }

  @Test
  public void case65() {
    int k = 15;
    int x = 666;
    int y = 666;
    assertEquals(557698, hilbert.steps(k, x, y));
  }

  @Test
  public void case66() {
    int k = 15;
    int x = 2000;
    int y = 3000;
    assertEquals(13645248, hilbert.steps(k, x, y));
  }

}
