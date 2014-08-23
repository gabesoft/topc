package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class VocaloidsAndSongsTest {
  VocaloidsAndSongs vocaloidsandsongs = new VocaloidsAndSongs();

  @Test
  public void case1() {
    int S = 3;
    int gumi = 1;
    int ia = 1;
    int mayu = 1;
    assertEquals(6, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case2() {
    int S = 50;
    int gumi = 10;
    int ia = 10;
    int mayu = 10;
    assertEquals(0, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case3() {
    int S = 18;
    int gumi = 12;
    int ia = 8;
    int mayu = 9;
    assertEquals(81451692, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case4() {
    int S = 50;
    int gumi = 25;
    int ia = 25;
    int mayu = 25;
    assertEquals(198591037, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case5() {
    int S = 3;
    int gumi = 3;
    int ia = 1;
    int mayu = 1;
    assertEquals(9, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case6() {
    int S = 2;
    int gumi = 1;
    int ia = 1;
    int mayu = 1;
    assertEquals(6, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case7() {
    int S = 2;
    int gumi = 2;
    int ia = 2;
    int mayu = 1;
    assertEquals(2, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case8() {
    int S = 3;
    int gumi = 2;
    int ia = 2;
    int mayu = 1;
    assertEquals(21, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case9() {
    int S = 3;
    int gumi = 2;
    int ia = 2;
    int mayu = 2;
    assertEquals(24, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case10() {
    int S = 3;
    int gumi = 3;
    int ia = 2;
    int mayu = 2;
    assertEquals(9, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case11() {
    int S = 3;
    int gumi = 3;
    int ia = 3;
    int mayu = 3;
    assertEquals(1, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case12() {
    int S = 4;
    int gumi = 1;
    int ia = 1;
    int mayu = 1;
    assertEquals(0, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case13() {
    int S = 4;
    int gumi = 2;
    int ia = 2;
    int mayu = 1;
    assertEquals(48, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case14() {
    int S = 4;
    int gumi = 3;
    int ia = 1;
    int mayu = 1;
    assertEquals(28, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case15() {
    int S = 4;
    int gumi = 3;
    int ia = 2;
    int mayu = 1;
    assertEquals(60, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case16() {
    int S = 4;
    int gumi = 3;
    int ia = 2;
    int mayu = 2;
    assertEquals(108, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case17() {
    int S = 4;
    int gumi = 3;
    int ia = 3;
    int mayu = 1;
    assertEquals(52, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case18() {
    int S = 4;
    int gumi = 3;
    int ia = 3;
    int mayu = 2;
    assertEquals(84, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case19() {
    int S = 4;
    int gumi = 3;
    int ia = 3;
    int mayu = 3;
    assertEquals(60, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case20() {
    int S = 4;
    int gumi = 4;
    int ia = 2;
    int mayu = 2;
    assertEquals(36, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case21() {
    int S = 4;
    int gumi = 4;
    int ia = 3;
    int mayu = 1;
    assertEquals(16, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case22() {
    int S = 4;
    int gumi = 4;
    int ia = 3;
    int mayu = 2;
    assertEquals(24, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case23() {
    int S = 4;
    int gumi = 4;
    int ia = 3;
    int mayu = 3;
    assertEquals(16, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case24() {
    int S = 4;
    int gumi = 4;
    int ia = 4;
    int mayu = 1;
    assertEquals(4, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case25() {
    int S = 4;
    int gumi = 4;
    int ia = 4;
    int mayu = 2;
    assertEquals(6, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case26() {
    int S = 4;
    int gumi = 4;
    int ia = 4;
    int mayu = 3;
    assertEquals(4, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case27() {
    int S = 4;
    int gumi = 4;
    int ia = 4;
    int mayu = 4;
    assertEquals(1, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case28() {
    int S = 41;
    int gumi = 29;
    int ia = 4;
    int mayu = 38;
    assertEquals(369692696, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case29() {
    int S = 36;
    int gumi = 20;
    int ia = 2;
    int mayu = 33;
    assertEquals(192664730, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case30() {
    int S = 28;
    int gumi = 5;
    int ia = 10;
    int mayu = 4;
    assertEquals(0, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case31() {
    int S = 14;
    int gumi = 6;
    int ia = 7;
    int mayu = 10;
    assertEquals(336213866, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case32() {
    int S = 44;
    int gumi = 14;
    int ia = 14;
    int mayu = 18;
    assertEquals(745566248, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case33() {
    int S = 32;
    int gumi = 17;
    int ia = 23;
    int mayu = 9;
    assertEquals(566625093, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case34() {
    int S = 26;
    int gumi = 1;
    int ia = 26;
    int mayu = 7;
    assertEquals(17102800, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case35() {
    int S = 37;
    int gumi = 17;
    int ia = 25;
    int mayu = 31;
    assertEquals(745634133, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case36() {
    int S = 32;
    int gumi = 9;
    int ia = 19;
    int mayu = 23;
    assertEquals(377232929, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case37() {
    int S = 41;
    int gumi = 22;
    int ia = 8;
    int mayu = 8;
    assertEquals(0, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case38() {
    int S = 36;
    int gumi = 7;
    int ia = 7;
    int mayu = 19;
    assertEquals(0, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case39() {
    int S = 44;
    int gumi = 4;
    int ia = 37;
    int mayu = 20;
    assertEquals(827379536, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case40() {
    int S = 11;
    int gumi = 11;
    int ia = 1;
    int mayu = 10;
    assertEquals(121, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case41() {
    int S = 45;
    int gumi = 18;
    int ia = 1;
    int mayu = 26;
    assertEquals(881039084, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case42() {
    int S = 30;
    int gumi = 5;
    int ia = 24;
    int mayu = 16;
    assertEquals(75352941, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case43() {
    int S = 3;
    int gumi = 3;
    int ia = 2;
    int mayu = 2;
    assertEquals(9, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case44() {
    int S = 38;
    int gumi = 14;
    int ia = 5;
    int mayu = 13;
    assertEquals(0, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case45() {
    int S = 16;
    int gumi = 9;
    int ia = 2;
    int mayu = 3;
    assertEquals(0, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case46() {
    int S = 7;
    int gumi = 2;
    int ia = 1;
    int mayu = 7;
    assertEquals(147, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case47() {
    int S = 18;
    int gumi = 14;
    int ia = 2;
    int mayu = 14;
    assertEquals(546060060, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case48() {
    int S = 50;
    int gumi = 35;
    int ia = 13;
    int mayu = 35;
    assertEquals(34125268, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case49() {
    int S = 50;
    int gumi = 44;
    int ia = 41;
    int mayu = 6;
    assertEquals(299345062, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case50() {
    int S = 50;
    int gumi = 40;
    int ia = 32;
    int mayu = 25;
    assertEquals(966179195, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case51() {
    int S = 50;
    int gumi = 22;
    int ia = 22;
    int mayu = 28;
    assertEquals(772146954, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case52() {
    int S = 50;
    int gumi = 32;
    int ia = 32;
    int mayu = 42;
    assertEquals(379364574, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case53() {
    int S = 50;
    int gumi = 9;
    int ia = 17;
    int mayu = 5;
    assertEquals(0, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case54() {
    int S = 50;
    int gumi = 35;
    int ia = 37;
    int mayu = 34;
    assertEquals(598448803, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case55() {
    int S = 50;
    int gumi = 46;
    int ia = 17;
    int mayu = 8;
    assertEquals(926765926, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case56() {
    int S = 50;
    int gumi = 44;
    int ia = 13;
    int mayu = 13;
    assertEquals(719726720, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case57() {
    int S = 50;
    int gumi = 9;
    int ia = 50;
    int mayu = 47;
    assertEquals(500176258, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case58() {
    int S = 50;
    int gumi = 23;
    int ia = 23;
    int mayu = 26;
    assertEquals(921345188, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case59() {
    int S = 48;
    int gumi = 48;
    int ia = 1;
    int mayu = 1;
    assertEquals(2304, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case60() {
    int S = 10;
    int gumi = 5;
    int ia = 6;
    int mayu = 7;
    assertEquals(3087000, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case61() {
    int S = 50;
    int gumi = 30;
    int ia = 30;
    int mayu = 30;
    assertEquals(828008844, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case62() {
    int S = 34;
    int gumi = 33;
    int ia = 32;
    int mayu = 31;
    assertEquals(113546400, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case63() {
    int S = 50;
    int gumi = 17;
    int ia = 23;
    int mayu = 35;
    assertEquals(265230684, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case64() {
    int S = 50;
    int gumi = 25;
    int ia = 47;
    int mayu = 32;
    assertEquals(761655492, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case65() {
    int S = 3;
    int gumi = 2;
    int ia = 1;
    int mayu = 1;
    assertEquals(15, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case66() {
    int S = 50;
    int gumi = 20;
    int ia = 1;
    int mayu = 49;
    assertEquals(271477184, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case67() {
    int S = 50;
    int gumi = 25;
    int ia = 24;
    int mayu = 1;
    assertEquals(138821945, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case68() {
    int S = 50;
    int gumi = 13;
    int ia = 23;
    int mayu = 34;
    assertEquals(732797345, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case69() {
    int S = 50;
    int gumi = 27;
    int ia = 22;
    int mayu = 34;
    assertEquals(219559533, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

  @Test
  public void case70() {
    int S = 50;
    int gumi = 25;
    int ia = 24;
    int mayu = 25;
    assertEquals(697128534, vocaloidsandsongs.count(S, gumi, ia, mayu));
  }

}
