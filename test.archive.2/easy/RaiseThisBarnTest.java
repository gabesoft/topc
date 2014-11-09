package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class RaiseThisBarnTest {
  RaiseThisBarn raisethisbarn = new RaiseThisBarn();

  @Test
  public void case1() {
    String str = "cc..c.c";
    assertEquals(3, raisethisbarn.calc(str));
  }

  @Test
  public void case2() {
    String str = "c....c....c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case3() {
    String str = "............";
    assertEquals(11, raisethisbarn.calc(str));
  }

  @Test
  public void case4() {
    String str = ".c.c...c..ccc.c..c.c.cc..ccc";
    assertEquals(3, raisethisbarn.calc(str));
  }

  @Test
  public void case5() {
    String str = "..";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case6() {
    String str = "c.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case7() {
    String str = ".c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case8() {
    String str = "cc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case9() {
    String str = "...";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case10() {
    String str = "c..";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case11() {
    String str = ".c.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case12() {
    String str = "cc.";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case13() {
    String str = "..c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case14() {
    String str = "c.c";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case15() {
    String str = ".cc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case16() {
    String str = "ccc";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case17() {
    String str = "....";
    assertEquals(3, raisethisbarn.calc(str));
  }

  @Test
  public void case18() {
    String str = "c...";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case19() {
    String str = ".c..";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case20() {
    String str = "cc..";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case21() {
    String str = "..c.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case22() {
    String str = "c.c.";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case23() {
    String str = ".cc.";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case24() {
    String str = "ccc.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case25() {
    String str = "...c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case26() {
    String str = "c..c";
    assertEquals(3, raisethisbarn.calc(str));
  }

  @Test
  public void case27() {
    String str = ".c.c";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case28() {
    String str = "cc.c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case29() {
    String str = "..cc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case30() {
    String str = "c.cc";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case31() {
    String str = ".ccc";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case32() {
    String str = "cccc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case33() {
    String str = "c.ccc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case34() {
    String str = "c.cccc";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case35() {
    String str = "cc.ccc.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case36() {
    String str = ".c.cccc.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case37() {
    String str = ".cc....c.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case38() {
    String str = ".c..cc.c.c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case39() {
    String str = "......cccc.";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case40() {
    String str = "....c....cc.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case41() {
    String str = "c.cc.ccc...c.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case42() {
    String str = "..cc..c..ccc.c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case43() {
    String str = "c..cc..c..c.c.c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case44() {
    String str = ".cc..c.cc.c.cc..";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case45() {
    String str = "ccccccc.c...c..cc";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case46() {
    String str = "c..c.ccccc.cc.....";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case47() {
    String str = "c.c....ccc.c..c.cc.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case48() {
    String str = "c.c...ccc.c.c...ccc.";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case49() {
    String str = "c...cc....c.c.cccc.c.";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case50() {
    String str = "ccc.ccc.cc..cc.ccc.c..";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case51() {
    String str = "c...cc...cccc.ccccc.cc.";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case52() {
    String str = "........c....cc..cc.c..c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case53() {
    String str = "..ccc.c.c..c.cccc.c...c.c";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case54() {
    String str = "cc...cc.c.c.c.c.cccc......";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case55() {
    String str = ".c.c....cc.c.cc..c..ccc..c.";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case56() {
    String str = "cccc.c..c.cc.....c.c.....cc.";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case57() {
    String str = "cc.cc.cc....c..cc.c.c.c.cc.c.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case58() {
    String str = "ccc....c..c..ccc..c.c.c.cc..c.";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case59() {
    String str = "..c..cc...c...c.ccc..c.ccc..ccc";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case60() {
    String str = ".c..cc.c..c..c.c..ccc...ccc..ccc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case61() {
    String str = "cc.c.cccc.c.c..cc.c.c....c..cccc.";
    assertEquals(3, raisethisbarn.calc(str));
  }

  @Test
  public void case62() {
    String str = "c.....cccc.c..ccc..c.ccc..cc.ccccc";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case63() {
    String str = "..ccc..cc...c.c.....c.c.c....ccc..c";
    assertEquals(6, raisethisbarn.calc(str));
  }

  @Test
  public void case64() {
    String str = "ccccc....cc..c..ccc.....c..cc...c..c";
    assertEquals(3, raisethisbarn.calc(str));
  }

  @Test
  public void case65() {
    String str = "....c.cccc....ccccc.c.ccc..cccccc.ccc";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case66() {
    String str = "..c.c.....c.cccc...c.c..c.....cc.cccc.";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case67() {
    String str = ".c......ccccc...cc...c.c.cccc.ccccc.c..";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case68() {
    String str = "c.cc.c.c.c.c.cccccc.c..c.....c..cc.cc.c.";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case69() {
    String str = "c.cc...c..cc......c.cccc..ccc...c.cc..ccc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case70() {
    String str = "c..cc.c.c...c...c..c.....c.c.cc.ccc.cccc..";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case71() {
    String str = ".cc.ccccc.cccc.cc..cccc....c...cc..c....ccc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case72() {
    String str = "cc....cc..ccc.c...c.ccc.cc.ccc..ccccc.cccc..";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case73() {
    String str = "c.cccccc.cc.c.ccc.ccccc.cc.cccc.....c.c.cc.cc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case74() {
    String str = "c..c...cc.c.c.cc..c..cc.c.c.cc.c.ccc......c...";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case75() {
    String str = ".cccccccc....c....ccc..c.c...c..c..c..ccc.ccc..";
    assertEquals(0, raisethisbarn.calc(str));
  }

  @Test
  public void case76() {
    String str = "ccc...cc.cc.c.cc..c..ccccc.c.c..c.cc..c....c...c";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case77() {
    String str = "c.c.c...cc..cccc....c.cccc....c.c..ccccc.c.c..ccc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case78() {
    String str = ".cccc...........ccc.cc.c.c....c...cc.ccc.cc.cccc.c";
    assertEquals(4, raisethisbarn.calc(str));
  }

  @Test
  public void case79() {
    String str = "..................................................";
    assertEquals(49, raisethisbarn.calc(str));
  }

  @Test
  public void case80() {
    String str = "cccccccccccccccccccccccccccccccccccccccccccccccccc";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case81() {
    String str = "...........";
    assertEquals(10, raisethisbarn.calc(str));
  }

  @Test
  public void case82() {
    String str = "..cc..";
    assertEquals(1, raisethisbarn.calc(str));
  }

  @Test
  public void case83() {
    String str = "c.c.c.c";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case84() {
    String str = "c...c";
    assertEquals(4, raisethisbarn.calc(str));
  }

  @Test
  public void case85() {
    String str = "c.c.................";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case86() {
    String str = "cc.cc";
    assertEquals(2, raisethisbarn.calc(str));
  }

  @Test
  public void case87() {
    String str = "c..c....cc...cccc";
    assertEquals(4, raisethisbarn.calc(str));
  }

}
