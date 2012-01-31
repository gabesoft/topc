package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SRMSystemTestPhaseTest {
  SRMSystemTestPhase srmsystemtestphase = new SRMSystemTestPhase();

  @Test
  public void case1() {
    String[] description = { "YYY" };
    assertEquals(27, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case2() {
    String[] description = { "YNN", "NYN" };
    assertEquals(6, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case3() {
    String[] description = { "YNN", "NNN", "NNY" };
    assertEquals(4, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case4() {
    String[] description = { "NNN", "NNN" };
    assertEquals(1, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case5() {
    String[] description = { "YYY", "YNY", "NYY", "YYN", "YYY", "YNN" };
    assertEquals(15176, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case6() {
    String[] description = { "YYY" };
    assertEquals(27, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case7() {
    String[] description = { "NNN" };
    assertEquals(1, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case8() {
    String[] description = { "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY" };
    assertEquals(467894583, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case9() {
    String[] description = { "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN", "NNN" };
    assertEquals(1, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case10() {
    String[] description = { "NNN", "NYN", "NNY" };
    assertEquals(3, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case11() {
    String[] description = { "NNY" };
    assertEquals(3, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case12() {
    String[] description = { "YYY", "YYN" };
    assertEquals(148, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case13() {
    String[] description = { "YYY", "NNY", "YNY" };
    assertEquals(229, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case14() {
    String[] description = { "NYY", "YYY", "NYY", "YYY" };
    assertEquals(4464, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case15() {
    String[] description = { "NNY", "YNN", "YNN", "YNY", "NYY" };
    assertEquals(114, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case16() {
    String[] description = { "NYN", "NNY", "YYN", "YNY", "YNY", "NYN" };
    assertEquals(224, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case17() {
    String[] description = { "NYN", "YYN", "YNY", "YNY", "YNY", "YNY", "YYN" };
    assertEquals(4713, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case18() {
    String[] description = { "NYN", "YNY", "YNY", "NNY", "YNN", "YYY", "YYN", "NNY" };
    assertEquals(1052, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case19() {
    String[] description = { "YYN", "YNY", "NNY", "NNY", "YYY", "NYN", "NNY", "YYN", "YYN" };
    assertEquals(6448, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case20() {
    String[] description = { "NYN", "YNN", "NYN", "YYN", "YYY", "NYN", "YYY", "YNY", "YNY", "NNY" };
    assertEquals(4672, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case21() {
    String[] description = { "YYN", "YNY", "YYY", "NYY", "NYN", "NYY", "NNY", "NYN", "YYY", "NYN", "YYN" };
    assertEquals(75482, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case22() {
    String[] description = { "YNY", "YYN", "NYN", "NNY", "NYY", "YNN", "YYY", "NYN", "YYY", "YYY", "YNN", "NYN" };
    assertEquals(32802, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case23() {
    String[] description = { "NYY", "YNY", "NNY", "YYN", "NYY", "NYY", "YYY", "YYY", "YYY", "YNN", "YYY", "YNY", "YYN" };
    assertEquals(10748994, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case24() {
    String[] description = { "YNN", "YYN", "YYN", "NYY", "NYN", "YYY", "YYY", "YYN", "NNY", "YYN", "YYY", "NYN", "NYN", "YYY" };
    assertEquals(730174, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case25() {
    String[] description = { "YYY", "YYY", "NYN", "YNN", "YYY", "YYN", "YYN", "NNY", "YYN", "NNY", "YNY", "YNN", "YNY", "YNY", "YNY" };
    assertEquals(3986209, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case26() {
    String[] description = { "YYY", "YNY", "NYY", "YNY", "NNY", "NNY", "YNN", "YNY", "NNY", "NYY", "NYY", "YNY", "YYN", "NYY", "NNY", "YYN" };
    assertEquals(2238832, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case27() {
    String[] description = { "NNY", "NYN", "NYN", "YYN", "YNN", "YNY", "YNN", "YYY", "YYN", "YYY", "YNN", "YNN", "YYN", "YYN", "YNN", "YNN", "NYY" };
    assertEquals(115840, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case28() {
    String[] description = { "YYY", "YNY", "NYY", "YYN", "NNY", "YYY", "NYN", "NYN", "YNN", "NYN", "NYY", "YNY", "YNY", "YYY", "YYN", "NYN", "NNY", "YNY" };
    assertEquals(7707040, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case29() {
    String[] description = { "YNN", "NYN", "NYN", "NYN", "YYY", "YNY", "NNY", "NNY", "YYY", "YNY", "YYY", "YNN", "NYN", "YYY", "NYY", "YNN", "NYY", "YNN", "NYY" };
    assertEquals(605039, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case30() {
    String[] description = { "NYN", "YYY", "YYY", "YNN", "NYN", "NNY", "NYN", "YYN", "YNY", "NNY", "NYN", "NYY", "YNN", "YNY", "YYY", "YNN", "NYN", "YYY", "NYY", "NYN" };
    assertEquals(502040, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case31() {
    String[] description = { "YNN", "YNY", "YYY", "YNY", "YYN", "YYN", "YYY", "YYN", "YNY", "YNY", "YYN", "YNN", "NYY", "NNY", "YNY", "YYN", "YNN", "YYY", "NNY", "YNN", "YYY" };
    assertEquals(145368672, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case32() {
    String[] description = { "YNN", "YYY", "YYY", "NYN", "YNY", "YNY", "NYY", "YNN", "YNN", "NNY", "YNN", "NNY", "YNN", "NNY", "YYY", "NNY", "NYY", "YYY", "NNY", "YYY", "YNY", "YYY" };
    assertEquals(17117800, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case33() {
    String[] description = { "YYN", "NNY", "YNN", "NYY", "YYN", "YYN", "YYY", "NYY", "YNN", "YYN", "YNN", "YYN", "YNN", "NYN", "YNY", "NYY", "YYY", "YNY", "NYY", "NYY", "YNN", "YNY", "YNY" };
    assertEquals(91100400, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case34() {
    String[] description = { "YNN", "NYY", "NYN", "YYN", "NNY", "NNY", "YNN", "NYN", "NYN", "NNY", "NYY", "YNN", "NYN", "NYN", "NYY", "NYY", "YYN", "NNY", "YNN", "NYY", "YNN", "YNY", "NYN", "YYY" };
    assertEquals(288176, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case35() {
    String[] description = { "YNY", "NNY", "NYY", "YNN", "NNY", "NYN", "NNY", "YNN", "YNY", "YNY", "NYY", "YNN", "YNN", "NYY", "YYY", "NYN", "YNN", "YYN", "YYY", "YNN", "YYY", "NYN", "YYY", "YNY", "YYN" };
    assertEquals(21755289, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case36() {
    String[] description = { "NNY", "YYN", "YYY", "NYY", "YNN", "YNY", "NYN", "NYY", "YYN", "NYN", "YYN", "YYN", "YYN", "YNN", "YYY", "NYN", "NNY", "NNY", "NYN", "NYN", "YNY", "NNY", "NNY", "NNY", "NYN", "YNN" };
    assertEquals(982872, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case37() {
    String[] description = { "YNY", "YYN", "NYN", "YYN", "YYN", "YNN", "NYN", "YYN", "YNN", "NYY", "YNY", "NYN", "NNY", "YNY", "YYY", "NYY", "NYN", "YNN", "YNN", "NYN", "YYN", "YNY", "NYY", "YYN", "YNY", "YYN", "NYY" };
    assertEquals(140330948, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case38() {
    String[] description = { "NYY", "NYY", "NNY", "NNY", "YYN", "NYN", "NYN", "NNY", "NNY", "NYN", "NNY", "YYN", "YYN", "YYN", "NYY", "YNN", "YNN", "NNY", "NYY", "YNN", "NNY", "YNN", "YYY", "YYN", "NNY", "NYN", "NYY", "YNY" };
    assertEquals(3981027, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case39() {
    String[] description = { "YNY", "YNY", "YNN", "NNY", "YYY", "YYN", "YNN", "YYN", "YYN", "NYN", "YNN", "YNY", "NYY", "YYN", "YYY", "NYY", "YYY", "YNN", "YNN", "YNY", "NYY", "NNY", "NNY", "NYY", "YNY", "NNY", "YYY", "YYN", "YYY" };
    assertEquals(562988566, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case40() {
    String[] description = { "YNN", "YYN", "NYN", "YNY", "NNY", "YYN", "YNY", "NYY", "NYN", "YYN", "NNY", "YNN", "YNY", "YNY", "NYN", "YYN", "NYY", "NYN", "YYN", "YNY", "NNY", "NYN", "YNY", "YNN", "YYY", "NYY", "NYY", "YNN", "NYN", "YNY" };
    assertEquals(54646896, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case41() {
    String[] description = { "NNY", "NNY", "YYY", "YNN", "YYY", "NNY", "NNY", "YNN", "YNY", "NNY", "YNY", "YNY", "YNN", "NYN", "YYY", "NNY", "NNY", "NYY", "YNN", "NYY", "YYN", "NYY", "YNN", "YYY", "NYY", "YYY", "YYN", "NYY", "YYY", "NYN", "NYN" };
    assertEquals(255319452, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case42() {
    String[] description = { "YNN", "YYY", "YNN", "YNY", "YNN", "YNN", "YYN", "NYN", "YNY", "YYY", "YNY", "YNY", "YYN", "NYY", "NYY", "YYN", "NYY", "NYY", "YNY", "NNY", "YNN", "NNY", "NYY", "NNY", "NYN", "NNY", "YYY", "NYN", "YNY", "NYY", "YYY" };
    assertEquals(652443293, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case43() {
    String[] description = { "NYN", "NNY", "NNY", "YNN", "YYN", "NYN", "YNY", "NYY", "YNN", "NYN", "YNY", "YYN", "NYN", "YNY", "YYN", "YYN", "YNN", "YNN", "YYY", "YYN", "YYY", "YYN", "NNY", "YYY", "YYN", "NYY", "YNY", "YNN", "NYY", "NYY", "NNY", "NYY" };
    assertEquals(654583583, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case44() {
    String[] description = { "NNY", "NYY", "YNN", "YNY", "YYN", "YNN", "NYY", "YYN", "YNY", "YYN", "NYY", "NYN", "YYY", "NYN", "NNY", "YYY", "NYY", "YNY", "NYY", "YYY", "YNN", "NYN", "NNY", "NYY", "YNN", "YNY", "YNN", "YNY", "YNY", "NYY", "NYN", "NNY" };
    assertEquals(563701168, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case45() {
    String[] description = { "YNN", "YYY", "YYN", "NYN", "YNY", "NYN", "YNN", "NYY", "YYY", "NYY", "YYY", "YNN", "YYY", "NNY", "YYN", "NYY", "NYN", "NYY", "NYN", "YYN", "NYY", "NYN", "NYN", "YNN", "YNN", "NNY", "NYN", "YNN", "NNY", "NYY", "NYN", "YNN", "NYY" };
    assertEquals(75253040, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case46() {
    String[] description = { "NYN", "NNY", "YYN", "YNN", "YYN", "YNY", "YNN", "YYY", "YYN", "YNN", "YYN", "YNY", "NYY", "YYN", "NYY", "NYN", "YYN", "YNN", "YYN", "YNN", "NNY", "NYN", "YYY", "YNY", "YYN", "NNY", "YYY", "YNY", "YYY", "NNY", "YNY", "NYN", "YYN" };
    assertEquals(21883803, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case47() {
    String[] description = { "NNY", "NYY", "YYY", "YNN", "NYN", "YNY", "NNY", "YYN", "YYY", "YYN", "NNY", "YNN", "YNN", "YYN", "YNN", "YNN", "NNY", "NNY", "NYY", "YYY", "YYY", "YYN", "YYY", "NYY", "NNY", "NNY", "YYN", "NYY", "YYN", "YYN", "YYY", "NYN", "YNN", "YNY" };
    assertEquals(989720572, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case48() {
    String[] description = { "NNY", "YNN", "YNY", "YNY", "YNY", "YYY", "YNN", "YYY", "NYN", "YNN", "NNY", "NYY", "YYN", "YYN", "YNY", "NNY", "NYY", "YYY", "NYY", "NYN", "YYN", "YNN", "YNN", "YNN", "NNY", "NYY", "YNY", "NYN", "NYN", "YNY", "YYY", "NYN", "YYN", "NYN" };
    assertEquals(394260264, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case49() {
    String[] description = { "YYY", "YNY", "YYN", "YYY", "NNY", "YYN", "YNY", "YNY", "NYY", "NNY", "YYN", "YNN", "YNN", "NNY", "YNY", "YYN", "NYN", "NYY", "NNY", "YNY", "NNY", "YYN", "YYN", "YYN", "NNY", "NNY", "NNY", "NNY", "YNY", "NNY", "NNY", "YNN", "YNY", "NYN", "YNY" };
    assertEquals(291252230, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case50() {
    String[] description = { "NYN", "NNY", "NYN", "YNN", "YNY", "NYN", "YYY", "YNY", "NYN", "YYY", "YNY", "NYN", "NYY", "NNY", "NYN", "YNN", "YNN", "NNY", "YNY", "NYN", "NNY", "YNN", "YYY", "YNN", "YNN", "YNN", "YYN", "NYN", "YYN", "YNY", "YNY", "NYN", "YYN", "NYY", "NYY" };
    assertEquals(51689893, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case51() {
    String[] description = { "NYY", "YYN", "YYY", "YNN", "NYY", "NYN", "YYY", "NNY", "YNN", "YNN", "YNY", "YNN", "YNY", "YNY", "NYY", "YNY", "NYN", "NYN", "YYY", "NYN", "NYN", "YYN", "NNY", "NYY", "YNY", "NNY", "YNN", "YNY", "YNY", "YYY", "YNN", "NNY", "NYY", "YNY", "YNY", "YNY" };
    assertEquals(535025296, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case52() {
    String[] description = { "NYN", "YNY", "YNY", "NNY", "YYY", "NYN", "YYY", "YNN", "NYN", "NYY", "YYY", "YNN", "YNY", "YYY", "NYY", "YNY", "NYY", "YNY", "YYN", "NYY", "YYY", "YYY", "NYN", "YNN", "NNY", "NYN", "YYN", "YNN", "YYY", "NNY", "NYN", "NYN", "YYN", "YYY", "YYN", "NYY" };
    assertEquals(642212796, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case53() {
    String[] description = { "YNN", "YNN", "NNY", "NYY", "YNY", "NYY", "NYY", "YNN", "NYN", "NYY", "YYN", "YNN", "YYN", "NYY", "NYY", "YYY", "YNY", "YYY", "YNY", "YYN", "YNN", "YNN", "NYN", "NNY", "YNY", "NNY", "YNN", "YYY", "YNY", "YYY", "YYY", "NYY", "NYN", "NYN", "YNY", "NYN", "NNY" };
    assertEquals(367693696, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case54() {
    String[] description = { "NYY", "YYN", "NYY", "YNN", "YNN", "YNN", "YNN", "YNY", "YNN", "NYY", "NNY", "NNY", "NYY", "NYN", "NYN", "NYY", "NYN", "NNY", "YNY", "NYN", "YNN", "NNY", "YNN", "NYN", "YYY", "YYN", "NYN", "YYY", "NNY", "YNY", "YNY", "YYN", "NYN", "YYY", "NYY", "NYY", "NYN" };
    assertEquals(218693424, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case55() {
    String[] description = { "YYY", "YNY", "YYY", "YNY", "YNY", "NNY", "NNY", "YYN", "YYY", "YYY", "YYY", "NNY", "YNY", "NNY", "YYN", "YNN", "YYY", "NNY", "YNY", "NYN", "YNY", "YNN", "NYY", "YNY", "NYY", "YNN", "YNN", "NYY", "NYN", "YYY", "YYY", "YYY", "YYN", "YNN", "YNY", "NYN", "NNY", "NNY" };
    assertEquals(72824262, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case56() {
    String[] description = { "YNY", "NYY", "NYN", "NNY", "YNN", "YYY", "YNN", "NYY", "YYN", "YNN", "NYY", "YNY", "YNY", "NNY", "NYN", "YYY", "NNY", "NYY", "NNY", "NYY", "YNY", "YYY", "YNY", "YYY", "YNN", "YNN", "YYY", "YYN", "YYY", "YNN", "NYY", "NYN", "NYY", "NYY", "NYY", "NYN", "YNN", "YYY" };
    assertEquals(998000984, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case57() {
    String[] description = { "YNY", "YYN", "NYY", "NNY", "NYN", "YNN", "NYN", "NYN", "NYY", "YYN", "NYY", "NYY", "YYY", "NYY", "YNY", "YYN", "YNN", "YNN", "NNY", "YNY", "YNY", "YYY", "YNY", "YNN", "NNY", "YNN", "YYY", "YNN", "YNN", "YYY", "YNN", "YYN", "YYN", "YNN", "NYN", "YYY", "NYY", "NYY", "NNY" };
    assertEquals(13018360, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case58() {
    String[] description = { "NYN", "NNY", "YNY", "NNY", "NYN", "YNY", "YNN", "YYN", "YNN", "NNY", "YYN", "YNN", "NYN", "YYY", "NYN", "YYN", "YNN", "YNY", "YYN", "YNY", "NYY", "NYY", "YYN", "NYN", "NNY", "NYN", "NNY", "YNY", "NYY", "YYN", "NYY", "NYY", "NNY", "YNN", "YYN", "YNY", "NYN", "YNN", "YYN" };
    assertEquals(724406468, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case59() {
    String[] description = { "NYY", "NNY", "NNY", "YNN", "NYY", "YYN", "YYY", "YNY", "YNY", "NNY", "NYY", "YYY", "YYY", "NNY", "YYY", "NYY", "YNY", "NYN", "YYN", "YYN", "YYN", "YNN", "YNN", "NYN", "YYN", "NYY", "NYN", "NYY", "NYY", "YYY", "NNY", "YNY", "NYY", "YYN", "YNN", "YYY", "YNN", "YNN", "YYN", "YYY" };
    assertEquals(113871105, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case60() {
    String[] description = { "YYN", "YYN", "NYY", "YYY", "YYN", "NNY", "NYY", "YNY", "YNY", "NYY", "NYY", "YYY", "YYY", "YNY", "NYY", "YNY", "NYN", "NNY", "YNY", "NNY", "YYY", "YYY", "NNY", "NYN", "YYN", "NYY", "YNY", "YNN", "YYY", "NYN", "NYY", "NYY", "NNY", "NNY", "YNN", "NYY", "YYY", "NYN", "YYY", "YYY" };
    assertEquals(601443392, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case61() {
    String[] description = { "NNY", "NYN", "YNN", "YNY", "YNY", "YNY", "YNY", "NNY", "NYY", "NYN", "YYN", "YYY", "NNY", "NYN", "YYY", "YNY", "YYY", "NNY", "YNN", "NYY", "YYN", "YYN", "YYN", "YYN", "YYY", "YNN", "YYY", "YNN", "NYY", "NYN", "YYY", "NNY", "YNN", "NYY", "YYY", "YNN", "NYY", "NNY", "NYY", "YYY", "YNY" };
    assertEquals(348472998, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case62() {
    String[] description = { "YNN", "YYY", "YYY", "NNY", "NYN", "NNY", "NYY", "NNY", "YNY", "YNY", "YYN", "NYY", "YNY", "YNN", "YYN", "NYY", "NYN", "YNY", "YYN", "YYY", "YNN", "NYN", "NNY", "YYY", "NYY", "YYY", "YNY", "YYN", "NNY", "NYN", "NNY", "YYY", "YNN", "YNN", "NYY", "NYY", "YYY", "YNN", "YNY", "NNY", "NNY" };
    assertEquals(478503885, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case63() {
    String[] description = { "YYY", "YYY", "NYY", "NYY", "NYY", "NYY", "YNY", "YNY", "YNN", "YYY", "NNY", "YYN", "NNY", "YNN", "YNN", "YYN", "NYN", "YNY", "NNY", "YYY", "NYY", "NNY", "YYY", "YNY", "YNY", "NYY", "NNY", "YYY", "YYY", "YNY", "YNY", "NYY", "NNY", "YYN", "YNY", "NNY", "YYY", "YNY", "YYY", "YYY", "NYN", "YNY" };
    assertEquals(64903710, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case64() {
    String[] description = { "YNY", "NNY", "NYN", "YYY", "YYN", "NYN", "NYN", "YYY", "NNY", "NNY", "YYN", "YNY", "YYY", "YNY", "YNN", "YNN", "YNY", "YNN", "NYN", "NYY", "YNY", "YNN", "YNY", "NYN", "NNY", "YYN", "YYN", "YNN", "NNY", "YNY", "NYN", "NYY", "NYN", "YNY", "YNN", "NYN", "NYY", "YYN", "NYY", "NNY", "NYN", "YYY" };
    assertEquals(797822771, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case65() {
    String[] description = { "NYY", "YYN", "NNY", "YNN", "NYY", "YNY", "NYN", "YYN", "YYY", "NYN", "NYY", "YNN", "NNY", "YNY", "YNY", "NNY", "NYN", "YNY", "NYN", "YNY", "NYN", "YNY", "YYY", "NYY", "NYY", "YNN", "NYN", "YYN", "NYY", "YYN", "YNN", "YNY", "YYY", "YNY", "NYN", "YYN", "YYN", "NYY", "NYN", "NNY", "YYN", "NYN", "YNY" };
    assertEquals(339330038, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case66() {
    String[] description = { "NNY", "NYN", "NNY", "YYY", "YNY", "NYN", "YNY", "NYN", "NNY", "YYY", "NYY", "YYN", "NYN", "YYY", "YNN", "NYN", "NNY", "YYN", "YNY", "YYN", "NNY", "YYY", "YNY", "YNN", "YNY", "YYN", "YNN", "NNY", "NYY", "NYY", "NYY", "YYY", "NYN", "YYY", "YNY", "YNN", "YNY", "NNY", "NYY", "NYN", "NYN", "NNY", "NYY" };
    assertEquals(420038780, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case67() {
    String[] description = { "YNN", "YYN", "YNY", "YNY", "NYN", "YYY", "NYY", "YYN", "YYN", "NNY", "NYY", "NYY", "YYN", "NNY", "YNN", "NNY", "YYY", "YNY", "NYY", "YNY", "NYY", "NNY", "YNY", "YYY", "NNY", "YNN", "NNY", "NYY", "YYY", "NNY", "NYY", "YYN", "YNY", "NNY", "NYY", "YNY", "YNY", "YYN", "NYY", "YNN", "YNY", "YYN", "YNY", "YNY" };
    assertEquals(745409414, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case68() {
    String[] description = { "YNY", "NYN", "YNY", "YYY", "NYN", "NNY", "NYY", "YNN", "NNY", "YNY", "YYY", "YYN", "YYY", "YYY", "YYY", "NNY", "YYY", "NYY", "NNY", "YNN", "YYN", "YNN", "NYN", "YNN", "NNY", "NYN", "NYN", "NYN", "YNY", "YNN", "NYY", "NYN", "YYY", "NYY", "NNY", "YNY", "YNN", "YYY", "NYN", "YNN", "NYY", "NYN", "YYN", "NYN" };
    assertEquals(766793711, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case69() {
    String[] description = { "YYN", "YNN", "NYY", "YYN", "YNN", "YNY", "YYN", "YNN", "YNY", "YYN", "NNY", "NYN", "YNY", "NYY", "NYY", "YYN", "NYY", "YYN", "NYN", "NYN", "YYN", "NYN", "YYN", "YYN", "NNY", "NYN", "NNY", "YYN", "NYY", "YYY", "YYN", "NYN", "NNY", "YYY", "YYY", "NNY", "YYY", "YNY", "YNN", "YYY", "YNN", "YYY", "YYN", "YYN", "NYY" };
    assertEquals(74500160, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case70() {
    String[] description = { "NYY", "YNN", "NYN", "NYY", "YYY", "NYY", "YYN", "NYY", "YYY", "NNY", "YYN", "YYN", "YYN", "YYN", "NYY", "NNY", "YYY", "YYN", "NNY", "YYY", "YNY", "YNN", "YYY", "YYN", "NNY", "YYY", "NYY", "YNN", "NNY", "YYY", "YYN", "YYN", "NNY", "NYN", "YYN", "YYN", "YNY", "YNY", "YYY", "YYY", "NYN", "NYN", "NYY", "YYN", "YYN" };
    assertEquals(575334562, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case71() {
    String[] description = { "NYY", "NYN", "YNN", "YNN", "NYY", "YYY", "NNY", "NNY", "NYN", "YYY", "YNN", "NYY", "YNN", "NYY", "YYY", "YNN", "NYY", "NYN", "YYN", "YYY", "NYN", "YYN", "YNY", "YNY", "NNY", "NNY", "NYY", "NYY", "NNY", "YYY", "YNY", "NYY", "YYY", "NYY", "YNN", "NYN", "YNY", "NNY", "YYN", "YNY", "NYN", "YNN", "YYN", "YYY", "YNN", "YYY" };
    assertEquals(501399748, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case72() {
    String[] description = { "YNY", "YNY", "NYY", "YNY", "NYY", "YYN", "NYY", "NNY", "NNY", "YYN", "YNN", "YYY", "NYN", "YYN", "YYY", "YYY", "YNY", "NYN", "YNN", "YNY", "YNY", "NYN", "YNN", "NNY", "YYY", "NNY", "NNY", "NYY", "NYY", "NNY", "YNY", "YYN", "NYN", "YYY", "YYY", "NNY", "YYN", "NYY", "YYY", "YNY", "YYY", "YYN", "YYY", "NNY", "YYY", "NNY" };
    assertEquals(616450754, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case73() {
    String[] description = { "YYY", "NYY", "YNN", "NYY", "YNY", "YYN", "YNN", "YNY", "NYY", "YYN", "NYN", "NNY", "YNY", "YNY", "NYN", "NNY", "YYY", "YNN", "NNY", "NYN", "NYN", "NNY", "NNY", "YYY", "YYY", "YYN", "YNN", "YYN", "NNY", "NYY", "NNY", "NNY", "YYN", "YNN", "YNY", "YNN", "YNY", "YYN", "NYY", "YYY", "NNY", "YYN", "NYN", "YNN", "NYY", "NYN", "NYY" };
    assertEquals(899599447, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case74() {
    String[] description = { "NYY", "YNN", "NYY", "YYN", "NYY", "YYN", "YYY", "NYY", "YNN", "YNN", "YNN", "YYN", "YYY", "NYN", "YNY", "NYY", "YNY", "NYY", "YYY", "NYN", "NYY", "YYY", "YYN", "YYY", "NYN", "YNY", "YNY", "YNN", "NYY", "YNN", "YNY", "YNY", "YNN", "NYY", "NYY", "YNY", "YNN", "YYN", "YNN", "YYN", "NYN", "YNN", "YYY", "NYY", "YNY", "NNY", "NYY" };
    assertEquals(442597237, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case75() {
    String[] description = { "YYN", "NYN", "YNN", "NYN", "YNN", "YYN", "YYY", "NYN", "YYN", "YYY", "YYY", "YNN", "YNN", "NNY", "YYN", "NNY", "YYY", "YYY", "YYN", "YNN", "NYN", "YYN", "NNY", "NNY", "NYY", "NYN", "YNY", "YYN", "NYN", "YYN", "YYY", "NYY", "NYN", "NNY", "YNY", "YNY", "NNY", "NYY", "YNY", "NYN", "NYY", "NYY", "YNY", "NNY", "YNN", "YYN", "NYN", "NNY" };
    assertEquals(318202788, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case76() {
    String[] description = { "YNN", "NYN", "YNY", "NYN", "YYY", "NYN", "NNY", "YNN", "NYN", "YYY", "YYY", "YNN", "NYY", "YNN", "YNN", "NNY", "YNN", "YNN", "YYY", "YNN", "YYN", "NYN", "NNY", "YYN", "NYN", "YYN", "YYY", "YNY", "NYY", "YNN", "NYN", "NYN", "YYY", "YNY", "NNY", "NYN", "YYN", "YYN", "NYY", "YNY", "YYN", "YNY", "YYY", "NYY", "YYN", "NNY", "YYN", "YNN" };
    assertEquals(564766660, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case77() {
    String[] description = { "YYN", "YNN", "YYN", "YYN", "YNY", "YNY", "YNY", "YYN", "YNN", "NYN", "YNN", "YNY", "NNY", "YNN", "YYY", "NYN", "YYN", "YYN", "NYY", "YYN", "NYY", "NNY", "YYN", "NYN", "NYN", "YYY", "YNN", "NYN", "YNN", "YYY", "NYY", "YNN", "YNY", "NYY", "YNY", "YYY", "NNY", "YYN", "YYN", "YYY", "YNY", "NYN", "YYY", "NNY", "YYN", "NYY", "YNY", "YNY", "YYN" };
    assertEquals(553500915, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case78() {
    String[] description = { "YYY", "NNY", "NNY", "YYN", "YYY", "YYY", "NYN", "YNN", "NYY", "YNY", "NYY", "NYY", "NYN", "YYN", "NNY", "NYY", "YYN", "YYN", "YYY", "NYY", "YYY", "YNN", "YYN", "YYN", "NNY", "YNN", "NYN", "YNN", "YYY", "NYN", "NYY", "YNN", "NNY", "NYN", "YYY", "YYN", "YNN", "NYY", "YNY", "NYN", "NNY", "YYY", "NYY", "NYN", "NYY", "NYN", "YYY", "YYN", "NNY" };
    assertEquals(793587666, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case79() {
    String[] description = { "YNY", "NNY", "YNY", "YNY", "NYY", "YYN", "NYY", "NNY", "YNY", "YYN", "NNY", "YNY", "NYN", "NYY", "YYN", "YYY", "YYN", "YNY", "NNY", "YYY", "YYY", "NYN", "YYN", "NYN", "NYN", "YYN", "NYN", "YNN", "YNY", "YYN", "NYY", "YYY", "YNN", "YNY", "NNY", "NYY", "YNY", "YYY", "NYN", "NYN", "YYN", "YNN", "NNY", "YNN", "NYY", "YNN", "NYN", "YNY", "YNN", "NYN" };
    assertEquals(811657393, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case80() {
    String[] description = { "YNN", "NYN", "NYN", "YYN", "YYY", "YYY", "YYN", "NYN", "YYN", "YYY", "YYY", "YNN", "YYN", "NYY", "YYN", "NYN", "NYN", "NYY", "NNY", "YNY", "NYY", "NYN", "NYY", "YYN", "YNY", "NNY", "YYN", "YNY", "NYN", "NYN", "YYY", "YNY", "YNN", "NNY", "YYN", "YNN", "YNY", "YNN", "YNN", "NYY", "NYY", "YNN", "YYY", "YYY", "YNY", "YNY", "YNN", "YYN", "YNY", "YYY" };
    assertEquals(582864695, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case81() {
    String[] description = { "NYY", "NNN" };
    assertEquals(6, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case82() {
    String[] description = { "YYY", "YNY", "NYY", "YYN", "YYY", "YNN" };
    assertEquals(15176, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case83() {
    String[] description = { "YNN", "NNN", "NYY", "NYN", "YNN", "NYN", "YYY", "YYY", "YNY", "YNN", "YYY", "YYN", "YYY", "YYN", "NYY", "NNN", "NNY", "NYN", "YNY", "YYN", "NNY", "NYN", "YYY", "YYN", "YYN", "NYY", "YNY", "YNY", "NNN", "YNY", "YNY", "NNN", "NYY", "NYN", "YYN", "NYY", "YNY", "YNY", "YYN", "NNN", "NNY", "YNY", "NYY", "NNN", "YNY", "YNN", "YYY", "YYN", "NNN", "NYY" };
    assertEquals(8, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case84() {
    String[] description = { "YYY" };
    assertEquals(27, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case85() {
    String[] description = { "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY", "YYY" };
    assertEquals(467894583, srmsystemtestphase.countWays(description));
  }

  @Test
  public void case86() {
    String[] description = { "YNY", "NYN", "YNY", "YNY", "NNN", "NNN", "YNY", "YYY", "NYN", "YNY", "YNY", "YNY", "YNY", "NNN", "NNN", "NNN", "NYN", "NYN", "NYN", "NNY", "YNY", "NYN", "YNY", "NYN", "NYN", "YNY", "YYY", "NNN", "NNN", "NNN", "NYN", "NYN", "YNY", "NYY", "YNN", "YNY", "NNY", "NNN", "YYY", "NYN", "NYN", "NYY", "NYN", "NYN", "YNY", "NNY", "YNN", "YNN", "YNN" };
    assertEquals(1995, srmsystemtestphase.countWays(description));
  }

}
