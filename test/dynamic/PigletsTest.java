package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PigletsTest {
  Piglets piglets = new Piglets();

  @Test
  public void case1() {
    String trough = "--p--";
    assertEquals(0, piglets.choose(trough));
  }

  @Test
  public void case2() {
    String trough = "p-p-p";
    assertEquals(1, piglets.choose(trough));
  }

  @Test
  public void case3() {
    String trough = "p--p";
    assertEquals(1, piglets.choose(trough));
  }

  @Test
  public void case4() {
    String trough = "p---p";
    assertEquals(2, piglets.choose(trough));
  }

  @Test
  public void case5() {
    String trough = "ppp";
    assertEquals(-1, piglets.choose(trough));
  }

  @Test
  public void case6() {
    String trough = "p----p";
    assertEquals(3, piglets.choose(trough));
  }

  @Test
  public void case7() {
    String trough = "p-------------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case8() {
    String trough = "p---p---------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case9() {
    String trough = "p---------p---p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case10() {
    String trough = "p--p------p---p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case11() {
    String trough = "p-";
    assertEquals(1, piglets.choose(trough));
  }

  @Test
  public void case12() {
    String trough = "p";
    assertEquals(-1, piglets.choose(trough));
  }

  @Test
  public void case13() {
    String trough = "-";
    assertEquals(0, piglets.choose(trough));
  }

  @Test
  public void case14() {
    String trough = "p-------p-----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case15() {
    String trough = "pp---p-------pp";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case16() {
    String trough = "pp-pp---------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case17() {
    String trough = "p------pp-----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case18() {
    String trough = "p--------pp-p-p";
    assertEquals(7, piglets.choose(trough));
  }

  @Test
  public void case19() {
    String trough = "ppp--p-------pp";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case20() {
    String trough = "p------p-----pp";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case21() {
    String trough = "p----------pppp";
    assertEquals(9, piglets.choose(trough));
  }

  @Test
  public void case22() {
    String trough = "p-------p-----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case23() {
    String trough = "p------p-p--p-p";
    assertEquals(10, piglets.choose(trough));
  }

  @Test
  public void case24() {
    String trough = "p-----p--p-p--p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case25() {
    String trough = "p--pp---------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case26() {
    String trough = "p-p-----------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case27() {
    String trough = "p--pp-p---p---p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case28() {
    String trough = "p---p---------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case29() {
    String trough = "p-pp---p---p--p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case30() {
    String trough = "p------pp-p-p-p";
    assertEquals(5, piglets.choose(trough));
  }

  @Test
  public void case31() {
    String trough = "pp----pp-pp---p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case32() {
    String trough = "pp--p---p-----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case33() {
    String trough = "p-p--p-----pp-p";
    assertEquals(9, piglets.choose(trough));
  }

  @Test
  public void case34() {
    String trough = "p-ppp---------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case35() {
    String trough = "pp---p--p-----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case36() {
    String trough = "p-p-----------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case37() {
    String trough = "p-p-p--p-----pp";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case38() {
    String trough = "p-------p-----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case39() {
    String trough = "p----p-p-p----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case40() {
    String trough = "p-p-ppp--p----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case41() {
    String trough = "p--p------p-p-p";
    assertEquals(8, piglets.choose(trough));
  }

  @Test
  public void case42() {
    String trough = "p---------p-p-p";
    assertEquals(8, piglets.choose(trough));
  }

  @Test
  public void case43() {
    String trough = "p---p--p-ppp--p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case44() {
    String trough = "p-----p-pp----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case45() {
    String trough = "p-----p-p-p---p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case46() {
    String trough = "p-p-----p--p--p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case47() {
    String trough = "p----p---p-p--p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case48() {
    String trough = "p------p--p-p-p";
    assertEquals(8, piglets.choose(trough));
  }

  @Test
  public void case49() {
    String trough = "p---pp-p----p-p";
    assertEquals(10, piglets.choose(trough));
  }

  @Test
  public void case50() {
    String trough = "p------------pp";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case51() {
    String trough = "pp---------p--p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case52() {
    String trough = "pp---p-p----p-p";
    assertEquals(10, piglets.choose(trough));
  }

  @Test
  public void case53() {
    String trough = "p------p-p----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case54() {
    String trough = "p-------------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case55() {
    String trough = "-";
    assertEquals(0, piglets.choose(trough));
  }

  @Test
  public void case56() {
    String trough = "--";
    assertEquals(0, piglets.choose(trough));
  }

  @Test
  public void case57() {
    String trough = "p";
    assertEquals(-1, piglets.choose(trough));
  }

  @Test
  public void case58() {
    String trough = "-p";
    assertEquals(0, piglets.choose(trough));
  }

  @Test
  public void case59() {
    String trough = "pp";
    assertEquals(-1, piglets.choose(trough));
  }

  @Test
  public void case60() {
    String trough = "p---p-p--p";
    assertEquals(7, piglets.choose(trough));
  }

  @Test
  public void case61() {
    String trough = "p----p";
    assertEquals(3, piglets.choose(trough));
  }

  @Test
  public void case62() {
    String trough = "p-------------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case63() {
    String trough = "p-----------p-p";
    assertEquals(10, piglets.choose(trough));
  }

  @Test
  public void case64() {
    String trough = "p------p------p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case65() {
    String trough = "p------p";
    assertEquals(5, piglets.choose(trough));
  }

  @Test
  public void case66() {
    String trough = "p-p";
    assertEquals(1, piglets.choose(trough));
  }

  @Test
  public void case67() {
    String trough = "p---p------p---";
    assertEquals(14, piglets.choose(trough));
  }

  @Test
  public void case68() {
    String trough = "p---p------p";
    assertEquals(9, piglets.choose(trough));
  }

  @Test
  public void case69() {
    String trough = "p----p-";
    assertEquals(6, piglets.choose(trough));
  }

  @Test
  public void case70() {
    String trough = "p---pp-p--p";
    assertEquals(8, piglets.choose(trough));
  }

  @Test
  public void case71() {
    String trough = "p-p-p------p";
    assertEquals(9, piglets.choose(trough));
  }

  @Test
  public void case72() {
    String trough = "p----";
    assertEquals(4, piglets.choose(trough));
  }

  @Test
  public void case73() {
    String trough = "p-------p----p";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case74() {
    String trough = "p-----p-----p";
    assertEquals(10, piglets.choose(trough));
  }

  @Test
  public void case75() {
    String trough = "p----p--p";
    assertEquals(6, piglets.choose(trough));
  }

  @Test
  public void case76() {
    String trough = "p-p--p";
    assertEquals(3, piglets.choose(trough));
  }

  @Test
  public void case77() {
    String trough = "p-p-p-p-p-p---p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case78() {
    String trough = "ppp--p";
    assertEquals(3, piglets.choose(trough));
  }

  @Test
  public void case79() {
    String trough = "p---p----p--p";
    assertEquals(10, piglets.choose(trough));
  }

  @Test
  public void case80() {
    String trough = "ppp--------ppp-";
    assertEquals(14, piglets.choose(trough));
  }

  @Test
  public void case81() {
    String trough = "p----pp-pppppp";
    assertEquals(3, piglets.choose(trough));
  }

  @Test
  public void case82() {
    String trough = "p---p--p";
    assertEquals(5, piglets.choose(trough));
  }

  @Test
  public void case83() {
    String trough = "p-p-p-";
    assertEquals(5, piglets.choose(trough));
  }

  @Test
  public void case84() {
    String trough = "p---p----p----p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case85() {
    String trough = "p-----p---p";
    assertEquals(8, piglets.choose(trough));
  }

  @Test
  public void case86() {
    String trough = "p---p----p---p";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case87() {
    String trough = "p----p--p----p";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case88() {
    String trough = "p--p--p";
    assertEquals(4, piglets.choose(trough));
  }

  @Test
  public void case89() {
    String trough = "p---p-p---p";
    assertEquals(8, piglets.choose(trough));
  }

  @Test
  public void case90() {
    String trough = "p----------p--p";
    assertEquals(12, piglets.choose(trough));
  }

  @Test
  public void case91() {
    String trough = "pp---pp--";
    assertEquals(8, piglets.choose(trough));
  }

  @Test
  public void case92() {
    String trough = "p-----p------pp";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case93() {
    String trough = "p---p---p--p";
    assertEquals(9, piglets.choose(trough));
  }

  @Test
  public void case94() {
    String trough = "pp-";
    assertEquals(2, piglets.choose(trough));
  }

  @Test
  public void case95() {
    String trough = "p-----p--p";
    assertEquals(7, piglets.choose(trough));
  }

  @Test
  public void case96() {
    String trough = "pp-----p-";
    assertEquals(8, piglets.choose(trough));
  }

  @Test
  public void case97() {
    String trough = "-p--";
    assertEquals(0, piglets.choose(trough));
  }

  @Test
  public void case98() {
    String trough = "pp---pp--p";
    assertEquals(7, piglets.choose(trough));
  }

  @Test
  public void case99() {
    String trough = "p------------p";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case100() {
    String trough = "-p---p---p---p-";
    assertEquals(0, piglets.choose(trough));
  }

  @Test
  public void case101() {
    String trough = "p--";
    assertEquals(2, piglets.choose(trough));
  }

  @Test
  public void case102() {
    String trough = "p---pp----p--p";
    assertEquals(11, piglets.choose(trough));
  }

  @Test
  public void case103() {
    String trough = "p---pp-";
    assertEquals(6, piglets.choose(trough));
  }

  @Test
  public void case104() {
    String trough = "p";
    assertEquals(-1, piglets.choose(trough));
  }

  @Test
  public void case105() {
    String trough = "p--p-";
    assertEquals(4, piglets.choose(trough));
  }

  @Test
  public void case106() {
    String trough = "p--------";
    assertEquals(8, piglets.choose(trough));
  }

  @Test
  public void case107() {
    String trough = "-p-------------";
    assertEquals(0, piglets.choose(trough));
  }

}
