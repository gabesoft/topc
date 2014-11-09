package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BlackBoxDiv2Test {
  BlackBoxDiv2 blackboxdiv2 = new BlackBoxDiv2();

  @Test
  public void case1() {
    String front = "BB";
    String side = "BB";
    assertEquals(7, blackboxdiv2.count(front, side));
  }

  @Test
  public void case2() {
    String front = "...";
    String side = ".....";
    assertEquals(1, blackboxdiv2.count(front, side));
  }

  @Test
  public void case3() {
    String front = "...";
    String side = "BBB";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case4() {
    String front = "...BB.B....";
    String side = "B.B.B.B.B";
    assertEquals(16081, blackboxdiv2.count(front, side));
  }

  @Test
  public void case5() {
    String front = "BBBBB.BBBBBBBBB.BBBBBBB.BBBB.B.BB..BB.B.BBBBBBBBBB";
    String side = ".B.BBB..BBBBBB.BBBB.B...BBBB.BB.BBBBBBBBBB.....BBB";
    assertEquals(771030153, blackboxdiv2.count(front, side));
  }

  @Test
  public void case6() {
    String front = ".";
    String side = "B";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case7() {
    String front = "..";
    String side = "..";
    assertEquals(1, blackboxdiv2.count(front, side));
  }

  @Test
  public void case8() {
    String front = ".BB";
    String side = "BBB";
    assertEquals(25, blackboxdiv2.count(front, side));
  }

  @Test
  public void case9() {
    String front = "BB.B";
    String side = "BBBB";
    assertEquals(2161, blackboxdiv2.count(front, side));
  }

  @Test
  public void case10() {
    String front = "....B";
    String side = ".....";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case11() {
    String front = ".BBBBB";
    String side = "BB.B.B";
    assertEquals(693601, blackboxdiv2.count(front, side));
  }

  @Test
  public void case12() {
    String front = "..B.B.B";
    String side = "B......";
    assertEquals(1, blackboxdiv2.count(front, side));
  }

  @Test
  public void case13() {
    String front = "..BB....";
    String side = "..BBB.BB";
    assertEquals(241, blackboxdiv2.count(front, side));
  }

  @Test
  public void case14() {
    String front = "BBBBBBBBB";
    String side = "...B.BBBB";
    assertEquals(808519312, blackboxdiv2.count(front, side));
  }

  @Test
  public void case15() {
    String front = "BBBBB.BBB.";
    String side = "..BBBB....";
    assertEquals(539870769, blackboxdiv2.count(front, side));
  }

  @Test
  public void case16() {
    String front = "BBBBBBBBBBB";
    String side = "BBBBBBBBBBB";
    assertEquals(937136493, blackboxdiv2.count(front, side));
  }

  @Test
  public void case17() {
    String front = ".B.B..BBBBBB..BB.BB.BBBBBBB.B..BBBBBBBBBB.BBBBBBBB";
    String side = "BB...BBBBBB.BB.......B..B.B..BBBBB.BBBB.B.B...B..B";
    assertEquals(129281486, blackboxdiv2.count(front, side));
  }

  @Test
  public void case18() {
    String front = "BBBBBBBBBBB..B..BBB.B.B.BB.B..BB..BBBBBB...BBB..BB";
    String side = "BBBBBB.B..BBBBBB.BBBBB.BBBBBBBBBBBBBBBBBBBBBBB.BBB";
    assertEquals(198164562, blackboxdiv2.count(front, side));
  }

  @Test
  public void case19() {
    String front = "BB.BBBBBBB.B.BBBBBBBBBBBBBBB.BB.BBBBBBB.BB.B.BBB..";
    String side = "....B......B.BBB....B.B...B..B.B....B.B..BB...BBB.";
    assertEquals(117336016, blackboxdiv2.count(front, side));
  }

  @Test
  public void case20() {
    String front = "B..BB....B...B..BBB..B.B..B..BB..B.BB.BB..B..B.BBB";
    String side = "B.BBBBBBBBB.B..B.B..BBB.BB...B.B.BBBBBBBB...B.BBBB";
    assertEquals(592918405, blackboxdiv2.count(front, side));
  }

  @Test
  public void case21() {
    String front = "B.B..BB..B...B..B.B.B........B...BB.B.B....BB.....";
    String side = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(707684650, blackboxdiv2.count(front, side));
  }

  @Test
  public void case22() {
    String front = "B.B.BBBB.BB.BB.BBB.BBBBB..BBBB..BBBBB.BB.B.BBB...B";
    String side = "..................................................";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case23() {
    String front = "B.B...BB.BBB..BBB.B.B......B..B....BBBBB.B.B.BBB..";
    String side = ".BBBBBBBBBBB.BB.B.BBBB.BBBBBB.BBBBB.BB..BBBBB.B.B.";
    assertEquals(253997808, blackboxdiv2.count(front, side));
  }

  @Test
  public void case24() {
    String front = "...B..BB...BB.B.BBB.B.B.BBBB..B.BB.B.BBBB.B.B.....";
    String side = "B...B.BBBBBB.BB.B.BBB.BBBBB.B..BBBBB.B.BB.BBB.BBBB";
    assertEquals(982649837, blackboxdiv2.count(front, side));
  }

  @Test
  public void case25() {
    String front = "BBB.BBBBBBBBBB.BBBB.BBBBBBBBBBBBBBBBBBB.BBBBBBBBBB";
    String side = "...BB......B.B...B.......B.B.....B..BB...B.....B..";
    assertEquals(114981542, blackboxdiv2.count(front, side));
  }

  @Test
  public void case26() {
    String front = "..................................................";
    String side = "...............................................";
    assertEquals(1, blackboxdiv2.count(front, side));
  }

  @Test
  public void case27() {
    String front = "................B.........B..B.......B.....B...";
    String side = "..B.B..BBBBB.BBB.BBBB.BBBBBBBBB..BBBBBBBBBBBBBBBBB";
    assertEquals(368743830, blackboxdiv2.count(front, side));
  }

  @Test
  public void case28() {
    String front = "..........B.B......BBB...B....BB....B.....BBBB.BB.";
    String side = "B.B.B.B.B..B.BB.BBBB.BBBBB.B.BBBB.BBBBBBBB.B.BBBBB";
    assertEquals(914702785, blackboxdiv2.count(front, side));
  }

  @Test
  public void case29() {
    String front = "...BB.B.BB.B..BB.B.B..BBBB.B.B.BBBBBB.BB.BB.BBBB";
    String side = "......................................B.........";
    assertEquals(1, blackboxdiv2.count(front, side));
  }

  @Test
  public void case30() {
    String front = ".........B...................B..........B.....";
    String side = "......B.............B.........B....B..B.B..B.B..B";
    assertEquals(40294561, blackboxdiv2.count(front, side));
  }

  @Test
  public void case31() {
    String front = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    String side = ".................................................";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case32() {
    String front = ".B.BBBBB.BB.B..B..B.B.B.B..BB..BB.BBBB.....B.BBB..";
    String side = ".BBBB.BB..B.BBBBB.BBB.BBBBBBBBB..B.BBBBBBB.BBBB.BB";
    assertEquals(129281486, blackboxdiv2.count(front, side));
  }

  @Test
  public void case33() {
    String front = "BBBBBBBBBBBB.BBBBBBBBBBBBBBB.BBBBBBBBBBBBBBBBBB";
    String side = ".B...BB...B.BB..B.....BBBBB...B.BB..BBBB.BBBB.";
    assertEquals(587037358, blackboxdiv2.count(front, side));
  }

  @Test
  public void case34() {
    String front = "BB...BB....BB.B.B..B..B..B...BBBB.B.......B..BB.";
    String side = "B.BBBBBBBBBBBBBBBBBBBBB.BBBBBBBBBBBBBBB.BBBBBBBBBB";
    assertEquals(964511516, blackboxdiv2.count(front, side));
  }

  @Test
  public void case35() {
    String front = "...B......BB..B..BB.B.B......BBB..BB.......B...";
    String side = "BB.BB.BBBBBBBBB.BBB.BBBBBB.BB.B....BBBB.BB.BBB..";
    assertEquals(644091315, blackboxdiv2.count(front, side));
  }

  @Test
  public void case36() {
    String front = ".................................................";
    String side = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case37() {
    String front = "BBBBBBB.B.B.BBBBBBBBBBBBBB.BBBBB.BBBBBBBBBBB.B.B";
    String side = ".......B.B........B.........B......BB.BB.BB....BB.";
    assertEquals(62120195, blackboxdiv2.count(front, side));
  }

  @Test
  public void case38() {
    String front = "BBBBBBBBBBB.BB..BBBBB..BBBBB.BBBBBBB..BBBBB.BB";
    String side = "....BBBB.BB...B..B.B.B...B.B.....B.........BB....";
    assertEquals(712765117, blackboxdiv2.count(front, side));
  }

  @Test
  public void case39() {
    String front = "BBBBB.BBB.BBB.BBBBBBBBBBBBBBB..B.B.BBBBBBBBBBBBBB";
    String side = "BB.BBBBBBBBBBBBBB.BBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(983817538, blackboxdiv2.count(front, side));
  }

  @Test
  public void case40() {
    String front = "BBBBBBBBBBBBBBBBBBBB.BBBBB.BBBBBBBBBBBBBBB.BBBBBB";
    String side = "BBB....BB..BBB..B.B.....B.BB..B...BB.BB.B...BB";
    assertEquals(700085142, blackboxdiv2.count(front, side));
  }

  @Test
  public void case41() {
    String front = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    String side = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(514424726, blackboxdiv2.count(front, side));
  }

  @Test
  public void case42() {
    String front = "B...BBB.B.B.B.BBBB....B.BBB..B..BBBBBBBB.B.BB.";
    String side = ".B.B...BB...B...B.......B...BB.B.BBB........BB";
    assertEquals(859561642, blackboxdiv2.count(front, side));
  }

  @Test
  public void case43() {
    String front = "B.B..B..BB..........BB.B.......BB.BB....BB.B.BB..";
    String side = "BBBBBBBBBBBBBBBBBBBBBB.BBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(239531839, blackboxdiv2.count(front, side));
  }

  @Test
  public void case44() {
    String front = "BBBB...BB.BBB.BBBBBB.BBBB..BB.BB..BBBB.BBBBBBB..B.";
    String side = "BBBBBBBBBBBBBBBBBBBBBBBBBBB..BBBBBBBBBBBBBBB.BBBB";
    assertEquals(795333334, blackboxdiv2.count(front, side));
  }

  @Test
  public void case45() {
    String front = "B..BB.B....B..B....B........B........B..BB.B.B";
    String side = ".......B..BBBBB.B..B...............B...B.....B.B.";
    assertEquals(648612683, blackboxdiv2.count(front, side));
  }

  @Test
  public void case46() {
    String front = ".................................................";
    String side = ".BBBBB.B..BB.BBBBBB..B.BB.BBBBBBBBB.BBBBBBBBBBB";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case47() {
    String front = "BBB.B.B..B.BBBBB.BBB.B.B.B.B..BBBB..BB.BBBBB..BBB";
    String side = "BBBB..BB..BBBBBBBBBB..B..BB.B.BBB...B.BBBBBBBBBBB";
    assertEquals(463192063, blackboxdiv2.count(front, side));
  }

  @Test
  public void case48() {
    String front = "BBBB.BBBBBBBBBBBB.BB.BBBBBBBBBBBBBBBB.BBBBBBBB.";
    String side = "BBBBBBB.BBBBBBBBBBBBBBBBBBB.BBBBBBBBBBBBBBBBBBBB.";
    assertEquals(599207480, blackboxdiv2.count(front, side));
  }

  @Test
  public void case49() {
    String front = "BBBBBBBBBB.B.BBBBBBBBBBBBBBBBBBBBBBBBB.BB.BBBB";
    String side = ".BB.....BB...B.BBB.....B.BBB....B....BB.B.B.....";
    assertEquals(493833081, blackboxdiv2.count(front, side));
  }

  @Test
  public void case50() {
    String front = "...BBBBBB...BBB..B...B.BBBBBB.B..B.B.B..B.B.BBBB.B";
    String side = "......B.BB..B.....B.B.....BBB.B.B..BB..........";
    assertEquals(626962625, blackboxdiv2.count(front, side));
  }

  @Test
  public void case51() {
    String front = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    String side = ".BBBBBBBBBBBBB.BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(514424726, blackboxdiv2.count(front, side));
  }

  @Test
  public void case52() {
    String front = "BB..B...B.BBBBBBBBBBBB.BBBBBBBBB.B.B....B..BBBB.B.";
    String side = ".BB.B.BBBBB.BBBBBBBBBBBBBBBBBBBBBBBBB.BBBBBBBB";
    assertEquals(960773581, blackboxdiv2.count(front, side));
  }

  @Test
  public void case53() {
    String front = ".B...B.BB...B.....BBBBBB..BB.B...........B....B";
    String side = "..............................................";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case54() {
    String front = "B.BBBBBBBBB.B..BBBB.BBBB.BBB.B.BBBBB.BBBB.BBBB.";
    String side = "B.BB..B..B.....B.....B.BB.......B..B...B......B.";
    assertEquals(478856627, blackboxdiv2.count(front, side));
  }

  @Test
  public void case55() {
    String front = ".......B.......BB................................B";
    String side = ".B....BB.B..BB.BBB...BB.BB...B..BB.B..B.BB....";
    assertEquals(357570322, blackboxdiv2.count(front, side));
  }

  @Test
  public void case56() {
    String front = ".";
    String side = ".";
    assertEquals(1, blackboxdiv2.count(front, side));
  }

  @Test
  public void case57() {
    String front = ".";
    String side = "B";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case58() {
    String front = "B";
    String side = ".";
    assertEquals(0, blackboxdiv2.count(front, side));
  }

  @Test
  public void case59() {
    String front = "B";
    String side = "B";
    assertEquals(1, blackboxdiv2.count(front, side));
  }

  @Test
  public void case60() {
    String front = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    String side = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(676170171, blackboxdiv2.count(front, side));
  }

  @Test
  public void case61() {
    String front = ".B.BB.B...B..B..B.B..B.B..BBBB....B..B.BBBBB.B...B";
    String side = "B.B.BB.B.B........B....B..BB.BB....B..B.B.B..BBB..";
    assertEquals(262836496, blackboxdiv2.count(front, side));
  }

  @Test
  public void case62() {
    String front = "..BBB.B.B...BB.BBB.....BB.B..B...B.B....BBB..BB";
    String side = "..B.B.B.B...BB......BB.B..B..B.B....BB..B.BB";
    assertEquals(882771881, blackboxdiv2.count(front, side));
  }

  @Test
  public void case63() {
    String front = "BB.BBBBBBBBBBBBBBBBB......BBBBBBBBBBB";
    String side = "..........BBB.......BBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(584526190, blackboxdiv2.count(front, side));
  }

}
