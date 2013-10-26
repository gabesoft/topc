package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SmallBricks31Test {
  SmallBricks31 smallbricks31 = new SmallBricks31();

  @Test
  public void case1() {
    int w = 1;
    int h = 1;
    assertEquals(2, smallbricks31.countWays(w, h));
  }

  @Test
  public void case2() {
    int w = 1;
    int h = 2;
    assertEquals(3, smallbricks31.countWays(w, h));
  }

  @Test
  public void case3() {
    int w = 1;
    int h = 3;
    assertEquals(4, smallbricks31.countWays(w, h));
  }

  @Test
  public void case4() {
    int w = 1;
    int h = 3;
    assertEquals(4, smallbricks31.countWays(w, h));
  }

  @Test
  public void case5() {
    int w = 1;
    int h = 5;
    assertEquals(6, smallbricks31.countWays(w, h));
  }

  @Test
  public void case6() {
    int w = 1;
    int h = 6;
    assertEquals(7, smallbricks31.countWays(w, h));
  }

  @Test
  public void case7() {
    int w = 1;
    int h = 7;
    assertEquals(8, smallbricks31.countWays(w, h));
  }

  @Test
  public void case8() {
    int w = 1;
    int h = 8;
    assertEquals(9, smallbricks31.countWays(w, h));
  }

  @Test
  public void case9() {
    int w = 1;
    int h = 9;
    assertEquals(10, smallbricks31.countWays(w, h));
  }

  @Test
  public void case10() {
    int w = 1;
    int h = 10;
    assertEquals(11, smallbricks31.countWays(w, h));
  }

  @Test
  public void case11() {
    int w = 2;
    int h = 1;
    assertEquals(5, smallbricks31.countWays(w, h));
  }

  @Test
  public void case12() {
    int w = 2;
    int h = 2;
    assertEquals(15, smallbricks31.countWays(w, h));
  }

  @Test
  public void case13() {
    int w = 2;
    int h = 3;
    assertEquals(37, smallbricks31.countWays(w, h));
  }

  @Test
  public void case14() {
    int w = 2;
    int h = 4;
    assertEquals(83, smallbricks31.countWays(w, h));
  }

  @Test
  public void case15() {
    int w = 2;
    int h = 5;
    assertEquals(177, smallbricks31.countWays(w, h));
  }

  @Test
  public void case16() {
    int w = 2;
    int h = 6;
    assertEquals(367, smallbricks31.countWays(w, h));
  }

  @Test
  public void case17() {
    int w = 2;
    int h = 7;
    assertEquals(749, smallbricks31.countWays(w, h));
  }

  @Test
  public void case18() {
    int w = 2;
    int h = 8;
    assertEquals(1515, smallbricks31.countWays(w, h));
  }

  @Test
  public void case19() {
    int w = 2;
    int h = 9;
    assertEquals(3049, smallbricks31.countWays(w, h));
  }

  @Test
  public void case20() {
    int w = 2;
    int h = 10;
    assertEquals(6119, smallbricks31.countWays(w, h));
  }

  @Test
  public void case21() {
    int w = 3;
    int h = 1;
    assertEquals(13, smallbricks31.countWays(w, h));
  }

  @Test
  public void case22() {
    int w = 3;
    int h = 2;
    assertEquals(84, smallbricks31.countWays(w, h));
  }

  @Test
  public void case23() {
    int w = 3;
    int h = 3;
    assertEquals(429, smallbricks31.countWays(w, h));
  }

  @Test
  public void case24() {
    int w = 3;
    int h = 4;
    assertEquals(1991, smallbricks31.countWays(w, h));
  }

  @Test
  public void case25() {
    int w = 3;
    int h = 5;
    assertEquals(8864, smallbricks31.countWays(w, h));
  }

  @Test
  public void case26() {
    int w = 3;
    int h = 6;
    assertEquals(38737, smallbricks31.countWays(w, h));
  }

  @Test
  public void case27() {
    int w = 3;
    int h = 7;
    assertEquals(167869, smallbricks31.countWays(w, h));
  }

  @Test
  public void case28() {
    int w = 3;
    int h = 8;
    assertEquals(724680, smallbricks31.countWays(w, h));
  }

  @Test
  public void case29() {
    int w = 3;
    int h = 9;
    assertEquals(3122877, smallbricks31.countWays(w, h));
  }

  @Test
  public void case30() {
    int w = 3;
    int h = 10;
    assertEquals(13446503, smallbricks31.countWays(w, h));
  }

  @Test
  public void case31() {
    int w = 4;
    int h = 1;
    assertEquals(33, smallbricks31.countWays(w, h));
  }

  @Test
  public void case32() {
    int w = 4;
    int h = 2;
    assertEquals(436, smallbricks31.countWays(w, h));
  }

  @Test
  public void case33() {
    int w = 4;
    int h = 3;
    assertEquals(4266, smallbricks31.countWays(w, h));
  }

  @Test
  public void case34() {
    int w = 4;
    int h = 4;
    assertEquals(36913, smallbricks31.countWays(w, h));
  }

  @Test
  public void case35() {
    int w = 4;
    int h = 5;
    assertEquals(301887, smallbricks31.countWays(w, h));
  }

  @Test
  public void case36() {
    int w = 4;
    int h = 6;
    assertEquals(2400844, smallbricks31.countWays(w, h));
  }

  @Test
  public void case37() {
    int w = 4;
    int h = 7;
    assertEquals(18816786, smallbricks31.countWays(w, h));
  }

  @Test
  public void case38() {
    int w = 4;
    int h = 8;
    assertEquals(146324359, smallbricks31.countWays(w, h));
  }

  @Test
  public void case39() {
    int w = 4;
    int h = 9;
    assertEquals(132976888, smallbricks31.countWays(w, h));
  }

  @Test
  public void case40() {
    int w = 4;
    int h = 10;
    assertEquals(751733376, smallbricks31.countWays(w, h));
  }

  @Test
  public void case41() {
    int w = 5;
    int h = 1;
    assertEquals(84, smallbricks31.countWays(w, h));
  }

  @Test
  public void case42() {
    int w = 5;
    int h = 2;
    assertEquals(2300, smallbricks31.countWays(w, h));
  }

  @Test
  public void case43() {
    int w = 5;
    int h = 3;
    assertEquals(44157, smallbricks31.countWays(w, h));
  }

  @Test
  public void case44() {
    int w = 5;
    int h = 4;
    assertEquals(739194, smallbricks31.countWays(w, h));
  }

  @Test
  public void case45() {
    int w = 5;
    int h = 5;
    assertEquals(11676046, smallbricks31.countWays(w, h));
  }

  @Test
  public void case46() {
    int w = 5;
    int h = 6;
    assertEquals(179653089, smallbricks31.countWays(w, h));
  }

  @Test
  public void case47() {
    int w = 5;
    int h = 7;
    assertEquals(730115178, smallbricks31.countWays(w, h));
  }

  @Test
  public void case48() {
    int w = 5;
    int h = 8;
    assertEquals(237973525, smallbricks31.countWays(w, h));
  }

  @Test
  public void case49() {
    int w = 5;
    int h = 9;
    assertEquals(21034400, smallbricks31.countWays(w, h));
  }

  @Test
  public void case50() {
    int w = 5;
    int h = 10;
    assertEquals(82403180, smallbricks31.countWays(w, h));
  }

  @Test
  public void case51() {
    int w = 6;
    int h = 1;
    assertEquals(214, smallbricks31.countWays(w, h));
  }

  @Test
  public void case52() {
    int w = 6;
    int h = 2;
    assertEquals(12152, smallbricks31.countWays(w, h));
  }

  @Test
  public void case53() {
    int w = 6;
    int h = 3;
    assertEquals(457949, smallbricks31.countWays(w, h));
  }

  @Test
  public void case54() {
    int w = 6;
    int h = 4;
    assertEquals(14817059, smallbricks31.countWays(w, h));
  }

  @Test
  public void case55() {
    int w = 6;
    int h = 5;
    assertEquals(450472846, smallbricks31.countWays(w, h));
  }

  @Test
  public void case56() {
    int w = 6;
    int h = 6;
    assertEquals(324032071, smallbricks31.countWays(w, h));
  }

  @Test
  public void case57() {
    int w = 6;
    int h = 7;
    assertEquals(24861902, smallbricks31.countWays(w, h));
  }

  @Test
  public void case58() {
    int w = 6;
    int h = 8;
    assertEquals(170708663, smallbricks31.countWays(w, h));
  }

  @Test
  public void case59() {
    int w = 6;
    int h = 9;
    assertEquals(587048789, smallbricks31.countWays(w, h));
  }

  @Test
  public void case60() {
    int w = 6;
    int h = 10;
    assertEquals(81051310, smallbricks31.countWays(w, h));
  }

  @Test
  public void case61() {
    int w = 7;
    int h = 1;
    assertEquals(545, smallbricks31.countWays(w, h));
  }

  @Test
  public void case62() {
    int w = 7;
    int h = 2;
    assertEquals(64063, smallbricks31.countWays(w, h));
  }

  @Test
  public void case63() {
    int w = 7;
    int h = 3;
    assertEquals(4723781, smallbricks31.countWays(w, h));
  }

  @Test
  public void case64() {
    int w = 7;
    int h = 4;
    assertEquals(294027079, smallbricks31.countWays(w, h));
  }

  @Test
  public void case65() {
    int w = 7;
    int h = 5;
    assertEquals(107928446, smallbricks31.countWays(w, h));
  }

  @Test
  public void case66() {
    int w = 7;
    int h = 6;
    assertEquals(839339396, smallbricks31.countWays(w, h));
  }

  @Test
  public void case67() {
    int w = 7;
    int h = 7;
    assertEquals(761082424, smallbricks31.countWays(w, h));
  }

  @Test
  public void case68() {
    int w = 7;
    int h = 8;
    assertEquals(728312256, smallbricks31.countWays(w, h));
  }

  @Test
  public void case69() {
    int w = 7;
    int h = 9;
    assertEquals(9546377, smallbricks31.countWays(w, h));
  }

  @Test
  public void case70() {
    int w = 7;
    int h = 10;
    assertEquals(648669217, smallbricks31.countWays(w, h));
  }

  @Test
  public void case71() {
    int w = 8;
    int h = 1;
    assertEquals(1388, smallbricks31.countWays(w, h));
  }

  @Test
  public void case72() {
    int w = 8;
    int h = 2;
    assertEquals(337944, smallbricks31.countWays(w, h));
  }

  @Test
  public void case73() {
    int w = 8;
    int h = 3;
    assertEquals(48819580, smallbricks31.countWays(w, h));
  }

  @Test
  public void case74() {
    int w = 8;
    int h = 4;
    assertEquals(858831727, smallbricks31.countWays(w, h));
  }

  @Test
  public void case75() {
    int w = 8;
    int h = 5;
    assertEquals(504677840, smallbricks31.countWays(w, h));
  }

  @Test
  public void case76() {
    int w = 8;
    int h = 6;
    assertEquals(381017248, smallbricks31.countWays(w, h));
  }

  @Test
  public void case77() {
    int w = 8;
    int h = 7;
    assertEquals(831713243, smallbricks31.countWays(w, h));
  }

  @Test
  public void case78() {
    int w = 8;
    int h = 8;
    assertEquals(583941925, smallbricks31.countWays(w, h));
  }

  @Test
  public void case79() {
    int w = 8;
    int h = 9;
    assertEquals(536794181, smallbricks31.countWays(w, h));
  }

  @Test
  public void case80() {
    int w = 8;
    int h = 10;
    assertEquals(933406633, smallbricks31.countWays(w, h));
  }

  @Test
  public void case81() {
    int w = 9;
    int h = 1;
    assertEquals(3535, smallbricks31.countWays(w, h));
  }

  @Test
  public void case82() {
    int w = 9;
    int h = 2;
    assertEquals(1782740, smallbricks31.countWays(w, h));
  }

  @Test
  public void case83() {
    int w = 9;
    int h = 3;
    assertEquals(504494117, smallbricks31.countWays(w, h));
  }

  @Test
  public void case84() {
    int w = 9;
    int h = 4;
    assertEquals(697109537, smallbricks31.countWays(w, h));
  }

  @Test
  public void case85() {
    int w = 9;
    int h = 5;
    assertEquals(868971794, smallbricks31.countWays(w, h));
  }

  @Test
  public void case86() {
    int w = 9;
    int h = 6;
    assertEquals(379952655, smallbricks31.countWays(w, h));
  }

  @Test
  public void case87() {
    int w = 9;
    int h = 7;
    assertEquals(791371725, smallbricks31.countWays(w, h));
  }

  @Test
  public void case88() {
    int w = 9;
    int h = 8;
    assertEquals(365989229, smallbricks31.countWays(w, h));
  }

  @Test
  public void case89() {
    int w = 9;
    int h = 9;
    assertEquals(82390183, smallbricks31.countWays(w, h));
  }

  @Test
  public void case90() {
    int w = 9;
    int h = 10;
    assertEquals(281959639, smallbricks31.countWays(w, h));
  }

  @Test
  public void case91() {
    int w = 10;
    int h = 1;
    assertEquals(9003, smallbricks31.countWays(w, h));
  }

  @Test
  public void case92() {
    int w = 10;
    int h = 2;
    assertEquals(9403676, smallbricks31.countWays(w, h));
  }

  @Test
  public void case93() {
    int w = 10;
    int h = 3;
    assertEquals(212349446, smallbricks31.countWays(w, h));
  }

  @Test
  public void case94() {
    int w = 10;
    int h = 4;
    assertEquals(517627099, smallbricks31.countWays(w, h));
  }

  @Test
  public void case95() {
    int w = 10;
    int h = 5;
    assertEquals(951030965, smallbricks31.countWays(w, h));
  }

  @Test
  public void case96() {
    int w = 10;
    int h = 6;
    assertEquals(147316164, smallbricks31.countWays(w, h));
  }

  @Test
  public void case97() {
    int w = 10;
    int h = 7;
    assertEquals(468172153, smallbricks31.countWays(w, h));
  }

  @Test
  public void case98() {
    int w = 10;
    int h = 8;
    assertEquals(554967316, smallbricks31.countWays(w, h));
  }

  @Test
  public void case99() {
    int w = 10;
    int h = 9;
    assertEquals(28066586, smallbricks31.countWays(w, h));
  }

  @Test
  public void case100() {
    int w = 10;
    int h = 10;
    assertEquals(951846687, smallbricks31.countWays(w, h));
  }

}
