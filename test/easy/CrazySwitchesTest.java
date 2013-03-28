package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CrazySwitchesTest {
  CrazySwitches crazyswitches = new CrazySwitches();

  @Test
  public void case1() {
    int[] switches = { 1, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case2() {
    int[] switches = { 0, 1 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case3() {
    int[] switches = { 1, 2, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case4() {
    int[] switches = { 4, 4, 3, 0, 5, 2 };
    assertEquals(7, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case5() {
    int[] switches = { 7, 11, 1, 12, 6, 3, 0, 2, 6, 0, 0, 5, 9 };
    assertEquals(15, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case6() {
    int[] switches = { 15, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
    assertEquals(29, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case7() {
    int[] switches = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case8() {
    int[] switches = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0 };
    assertEquals(29, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case9() {
    int[] switches = { 6, 0, 3, 0, 0, 1, 5 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case10() {
    int[] switches = { 8, 0, 1, 1, 8, 4, 2, 6, 1 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case11() {
    int[] switches = { 2, 4, 4, 4, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case12() {
    int[] switches = { 1, 3, 0, 2 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case13() {
    int[] switches = { 2, 2, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case14() {
    int[] switches = { 2, 0, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case15() {
    int[] switches = { 7, 5, 6, 6, 0, 0, 0, 6 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case16() {
    int[] switches = { 4, 0, 0, 0, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case17() {
    int[] switches = { 3, 3, 3, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case18() {
    int[] switches = { 2, 4, 7, 12, 0, 4, 9, 12, 0, 0, 0, 4, 4 };
    assertEquals(7, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case19() {
    int[] switches = { 1, 6, 5, 0, 6, 0, 7, 0 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case20() {
    int[] switches = { 3, 2, 3, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case21() {
    int[] switches = { 11, 0, 10, 0, 10, 9, 4, 6, 11, 4, 5, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case22() {
    int[] switches = { 2, 0, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case23() {
    int[] switches = { 3, 0, 1, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case24() {
    int[] switches = { 5, 0, 5, 0, 1, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case25() {
    int[] switches = { 5, 2, 5, 4, 2, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case26() {
    int[] switches = { 4, 3, 4, 0, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case27() {
    int[] switches = { 3, 0, 1, 4, 2 };
    assertEquals(7, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case28() {
    int[] switches = { 2, 0, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case29() {
    int[] switches = { 1, 14, 3, 6, 7, 7, 7, 5, 4, 4, 0, 10, 14, 4, 11 };
    assertEquals(7, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case30() {
    int[] switches = { 1, 3, 1, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case31() {
    int[] switches = { 1, 13, 13, 5, 7, 0, 0, 1, 7, 10, 7, 4, 13, 5 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case32() {
    int[] switches = { 5, 2, 0, 0, 1, 1 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case33() {
    int[] switches = { 11, 10, 0, 0, 10, 8, 0, 1, 1, 8, 3, 5 };
    assertEquals(11, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case34() {
    int[] switches = { 4, 4, 3, 1, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case35() {
    int[] switches = { 1, 4, 0, 0, 5, 3 };
    assertEquals(7, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case36() {
    int[] switches = { 2, 2, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case37() {
    int[] switches = { 6, 2, 6, 5, 0, 4, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case38() {
    int[] switches = { 5, 4, 4, 0, 5, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case39() {
    int[] switches = { 6, 0, 5, 0, 5, 1, 5 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case40() {
    int[] switches = { 8, 2, 3, 0, 7, 10, 0, 0, 10, 1, 7 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case41() {
    int[] switches = { 9, 6, 5, 0, 3, 9, 0, 0, 5, 4 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case42() {
    int[] switches = { 6, 6, 6, 5, 0, 4, 3 };
    assertEquals(7, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case43() {
    int[] switches = { 5, 5, 0, 1, 0, 4 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case44() {
    int[] switches = { 4, 3, 4, 4, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case45() {
    int[] switches = { 4, 2, 4, 2, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case46() {
    int[] switches = { 11, 9, 11, 0, 10, 9, 9, 3, 2, 3, 7, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case47() {
    int[] switches = { 8, 12, 0, 12, 12, 0, 12, 10, 12, 0, 0, 12, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case48() {
    int[] switches = { 4, 2, 4, 4, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case49() {
    int[] switches = { 7, 9, 0, 0, 7, 10, 3, 13, 9, 13, 5, 1, 6, 2 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case50() {
    int[] switches = { 6, 0, 0, 1, 1, 4, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case51() {
    int[] switches = { 4, 0, 4, 0, 1 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case52() {
    int[] switches = { 9, 9, 7, 2, 5, 7, 0, 0, 3, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case53() {
    int[] switches = { 7, 4, 3, 0, 9, 7, 2, 10, 6, 0, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case54() {
    int[] switches = { 8, 4, 7, 8, 0, 0, 4, 8, 1 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case55() {
    int[] switches = { 1, 3, 0, 5, 2, 0 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case56() {
    int[] switches = { 5, 0, 5, 0, 0, 4 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case57() {
    int[] switches = { 1, 3, 0, 2 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case58() {
    int[] switches = { 6, 7, 11, 2, 9, 6, 2, 0, 0, 5, 11, 1 };
    assertEquals(9, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case59() {
    int[] switches = { 5, 8, 1, 1, 8, 8, 1, 4, 2 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case60() {
    int[] switches = { 1, 5, 6, 8, 3, 0, 8, 0, 1 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case61() {
    int[] switches = { 2, 0, 5, 4, 0, 6, 2 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case62() {
    int[] switches = { 2, 3, 4, 5, 11, 7, 11, 0, 1, 6, 11, 7 };
    assertEquals(7, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case63() {
    int[] switches = { 3, 5, 3, 0, 0, 0 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case64() {
    int[] switches = { 8, 0, 7, 10, 3, 1, 1, 2, 4, 0, 2, 4, 4 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case65() {
    int[] switches = { 8, 0, 1, 6, 10, 8, 3, 3, 1, 4, 3, 5 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case66() {
    int[] switches = { 3, 3, 9, 9, 6, 4, 7, 5, 2, 2 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case67() {
    int[] switches = { 13, 10, 1, 8, 1, 12, 4, 0, 7, 12, 6, 13, 10, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case68() {
    int[] switches = { 9, 2, 13, 0, 2, 12, 2, 0, 0, 6, 12, 13, 8, 14, 9 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case69() {
    int[] switches = { 1, 3, 0, 1 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case70() {
    int[] switches = { 5, 5, 5, 5, 0, 2 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case71() {
    int[] switches = { 2, 2, 1, 0 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case72() {
    int[] switches = { 6, 7, 5, 11, 5, 1, 3, 1, 1, 7, 0, 0 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case73() {
    int[] switches = { 10, 4, 1, 11, 2, 0, 0, 9, 5, 11, 1, 3 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case74() {
    int[] switches = { 2, 2, 1 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case75() {
    int[] switches = { 12, 14, 9, 4, 5, 0, 0, 11, 9, 11, 7, 4, 9, 4, 11, 4 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case76() {
    int[] switches = { 2, 5, 1, 5, 3, 0 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case77() {
    int[] switches = { 4, 5, 5, 5, 3, 3 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case78() {
    int[] switches = { 4, 5, 5, 5, 6, 2, 3 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case79() {
    int[] switches = { 13, 8, 11, 9, 9, 10, 9, 3, 9, 0, 0, 0, 11, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case80() {
    int[] switches = { 13, 9, 4, 11, 13, 0, 1, 0, 3, 7, 0, 6, 3, 11 };
    assertEquals(11, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case81() {
    int[] switches = { 13, 0, 0, 0, 0, 0, 0, 2, 5, 6, 6, 9, 4, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case82() {
    int[] switches = { 9, 12, 0, 12, 11, 0, 11, 3, 9, 12, 12, 2, 2 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case83() {
    int[] switches = { 9, 10, 0, 5, 6, 6, 2, 6, 12, 13, 6, 9, 1, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case84() {
    int[] switches = { 12, 11, 8, 11, 2, 6, 8, 4, 0, 2, 12, 0, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case85() {
    int[] switches = { 14, 12, 13, 14, 8, 0, 12, 11, 12, 3, 5, 2, 0, 14, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case86() {
    int[] switches = { 8, 0, 11, 2, 1, 10, 8, 0, 13, 4, 9, 13, 9, 9 };
    assertEquals(9, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case87() {
    int[] switches = { 1, 13, 0, 0, 0, 4, 4, 11, 13, 13, 2, 0, 13, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case88() {
    int[] switches = { 4, 0, 6, 14, 3, 13, 14, 12, 9, 12, 1, 8, 4, 7, 0 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case89() {
    int[] switches = { 13, 9, 12, 8, 0, 4, 14, 13, 12, 3, 8, 5, 6, 6, 5 };
    assertEquals(9, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case90() {
    int[] switches = { 8, 3, 0, 12, 6, 3, 7, 5, 12, 7, 7, 2, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case91() {
    int[] switches = { 13, 0, 5, 4, 13, 8, 13, 6, 10, 0, 12, 5, 6, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case92() {
    int[] switches = { 13, 6, 0, 5, 8, 12, 5, 2, 3, 5, 2, 13, 7, 8 };
    assertEquals(13, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case93() {
    int[] switches = { 8, 6, 3, 4, 0, 7, 13, 9, 14, 0, 0, 14, 4, 2, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case94() {
    int[] switches = { 8, 13, 12, 0, 9, 2, 1, 1, 13, 0, 0, 12, 13, 14, 4 };
    assertEquals(9, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case95() {
    int[] switches = { 7, 9, 1, 0, 14, 2, 1, 1, 5, 14, 1, 4, 3, 5, 3 };
    assertEquals(9, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case96() {
    int[] switches = { 2, 8, 14, 12, 5, 7, 1, 0, 10, 4, 9, 12, 7, 9, 11 };
    assertEquals(9, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case97() {
    int[] switches = { 4, 14, 14, 11, 14, 14, 14, 0, 6, 0, 6, 13, 0, 3, 9 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case98() {
    int[] switches = { 2, 3, 3, 13, 13, 8, 2, 0, 7, 5, 13, 7, 13, 11 };
    assertEquals(9, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case99() {
    int[] switches = { 7, 11, 1, 12, 6, 3, 0, 2, 6, 0, 0, 5, 9 };
    assertEquals(15, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case100() {
    int[] switches = { 4, 4, 3, 0, 5, 2 };
    assertEquals(7, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case101() {
    int[] switches = { 13, 2, 12, 10, 14, 15, 7, 8, 11, 4, 5, 3, 6, 9, 1, 0 };
    assertEquals(29, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case102() {
    int[] switches = { 0, 0 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case103() {
    int[] switches = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0 };
    assertEquals(29, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case104() {
    int[] switches = { 2, 1, 0 };
    assertEquals(1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case105() {
    int[] switches = { 7, 8, 9, 12, 5, 0, 11, 3, 6, 13, 1, 2, 10, 14, 15, 4 };
    assertEquals(29, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case106() {
    int[] switches = { 3, 0, 1, 2 };
    assertEquals(5, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case107() {
    int[] switches = { 7, 0, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case108() {
    int[] switches = { 1, 1, 2 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case109() {
    int[] switches = { 0, 2, 0 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case110() {
    int[] switches = { 1, 2, 1 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case111() {
    int[] switches = { 0, 1, 2, 1 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case112() {
    int[] switches = { 1, 2, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case113() {
    int[] switches = { 2, 2, 1, 3 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case114() {
    int[] switches = { 1, 0, 3, 2 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case115() {
    int[] switches = { 1, 1, 0 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case116() {
    int[] switches = { 1, 2, 3, 4, 5, 2 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case117() {
    int[] switches = { 1, 0, 1 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case118() {
    int[] switches = { 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0 };
    assertEquals(3, crazyswitches.minimumActions(switches));
  }

  @Test
  public void case119() {
    int[] switches = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals(-1, crazyswitches.minimumActions(switches));
  }

}
