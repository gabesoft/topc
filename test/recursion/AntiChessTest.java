package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class AntiChessTest {
  AntiChess antichess = new AntiChess();

  @Test
  public void case1() {
    String[] white = { "a2", "c2", "d2", "e3", "h4" };
    String black = "b6";
    assertEquals(5, antichess.sacrifice(white, black));
  }

  @Test
  public void case2() {
    String[] white = { "a2", "h2" };
    String black = "g3";
    assertEquals(0, antichess.sacrifice(white, black));
  }

  @Test
  public void case3() {
    String[] white = { "a2", "e2", "h2" };
    String black = "e6";
    assertEquals(3, antichess.sacrifice(white, black));
  }

  @Test
  public void case4() {
    String[] white = { "a7", "h7" };
    String black = "a8";
    assertEquals(1, antichess.sacrifice(white, black));
  }

  @Test
  public void case5() {
    String[] white = { "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2" };
    String black = "d1";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case6() {
    String[] white = { "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3" };
    String black = "d1";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case7() {
    String[] white = { "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3" };
    String black = "d8";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case8() {
    String[] white = { "a4", "b7", "c2", "e6", "f4", "g2", "h7" };
    String black = "e4";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case9() {
    String[] white = { "a4", "b7", "c2", "e6", "f5", "g2", "h4" };
    String black = "e4";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case10() {
    String[] white = { "a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7" };
    String black = "d1";
    assertEquals(4, antichess.sacrifice(white, black));
  }

  @Test
  public void case11() {
    String[] white = { "e4" };
    String black = "e5";
    assertEquals(0, antichess.sacrifice(white, black));
  }

  @Test
  public void case12() {
    String[] white = { "b2", "c3", "d4", "e5", "f4", "g3", "h2" };
    String black = "e2";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case13() {
    String[] white = { "c5", "h7", "d6", "e7", "b5", "a2", "f5", "g6" };
    String black = "b2";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case14() {
    String[] white = { "h4", "b4", "g7", "a5" };
    String black = "a6";
    assertEquals(3, antichess.sacrifice(white, black));
  }

  @Test
  public void case15() {
    String[] white = { "a2", "b3", "c6", "d5", "e7", "f6", "g7", "h6" };
    String black = "e4";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case16() {
    String[] white = { "a6", "b4", "d3", "e5", "f7", "g4", "h4" };
    String black = "e3";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case17() {
    String[] white = { "a5", "b3", "c2", "d5", "e2", "f3", "h6" };
    String black = "f6";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case18() {
    String[] white = { "a2", "b5", "c7", "d2", "e5", "g5", "h6" };
    String black = "b1";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case19() {
    String[] white = { "a4", "b5", "c5", "d5", "e2", "f6", "g5", "h6" };
    String black = "e8";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case20() {
    String[] white = { "a4", "b4", "c3", "d3", "e3", "f6", "g4", "h3" };
    String black = "e1";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case21() {
    String[] white = { "b2", "c3", "d3", "e6", "f2", "g5", "h5" };
    String black = "g7";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case22() {
    String[] white = { "a3", "b3", "c6", "d4", "e2", "f4", "g5", "h7" };
    String black = "d8";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case23() {
    String[] white = { "a3", "b6", "c5", "d7", "f3", "g6", "h6" };
    String black = "f5";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case24() {
    String[] white = { "a6", "b4", "c4", "d6", "e3", "h2" };
    String black = "c1";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case25() {
    String[] white = { "a4", "b5", "c3", "d4", "e2", "f4", "h6" };
    String black = "e7";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case26() {
    String[] white = { "a7", "b3", "c7", "d3", "e6", "f5", "g6", "h5" };
    String black = "g7";
    assertEquals(1, antichess.sacrifice(white, black));
  }

  @Test
  public void case27() {
    String[] white = { "a2", "b5", "c2", "e2", "g4", "h2" };
    String black = "a5";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case28() {
    String[] white = { "a3", "b4", "c7", "e4", "f3", "g7", "h6" };
    String black = "f7";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case29() {
    String[] white = { "a6", "b3", "c7", "d6", "e6", "f5", "g5", "h5" };
    String black = "e1";
    assertEquals(3, antichess.sacrifice(white, black));
  }

  @Test
  public void case30() {
    String[] white = { "a2", "b2", "c6", "d6", "e7", "f4", "g3", "h4" };
    String black = "e8";
    assertEquals(1, antichess.sacrifice(white, black));
  }

  @Test
  public void case31() {
    String[] white = { "a4", "b6", "d7", "e5", "f5", "g7", "h5" };
    String black = "c5";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case32() {
    String[] white = { "a5", "c4", "d7", "e3", "f2", "g2" };
    String black = "b7";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case33() {
    String[] white = { "a6", "b6", "c5", "d5", "e7", "f4", "g5", "h6" };
    String black = "d3";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case34() {
    String[] white = { "a4", "b5", "c3", "d5", "e4", "f3", "g6", "h2" };
    String black = "h4";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case35() {
    String[] white = { "a4", "b4", "c2", "d2", "e2", "f4", "g5", "h2" };
    String black = "c1";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case36() {
    String[] white = { "a2", "b7", "c5", "d7", "e5", "f2", "g2", "h3" };
    String black = "f7";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case37() {
    String[] white = { "a2", "b7", "c2", "d2", "e7", "f7", "g4", "h4" };
    String black = "e2";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case38() {
    String[] white = { "a4", "b3", "e2", "f7", "g5", "h5" };
    String black = "e5";
    assertEquals(5, antichess.sacrifice(white, black));
  }

  @Test
  public void case39() {
    String[] white = { "a7", "b7", "c4", "d4", "e6", "f7", "g2", "h2" };
    String black = "b1";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case40() {
    String[] white = { "a5", "b5", "c7", "d6", "e6", "f4", "g7", "h7" };
    String black = "f3";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case41() {
    String[] white = { "a7", "b4", "c4", "d6", "e6", "g4", "h3" };
    String black = "a4";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case42() {
    String[] white = { "a4", "b4", "c7", "d3", "e2", "f5", "g6", "h5" };
    String black = "b3";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case43() {
    String[] white = { "a6", "c6", "d5", "e7", "f6", "g5" };
    String black = "a7";
    assertEquals(5, antichess.sacrifice(white, black));
  }

  @Test
  public void case44() {
    String[] white = { "a7", "b4", "c2", "d2", "e3", "f5", "g4", "h4" };
    String black = "a2";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case45() {
    String[] white = { "a5", "b2", "c2", "d5", "e2", "f4", "g6", "h7" };
    String black = "g1";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case46() {
    String[] white = { "a5", "b7", "c7", "d2", "e6", "f7", "g4", "h2" };
    String black = "a7";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case47() {
    String[] white = { "a6", "b6", "c5", "d3", "e4", "f2", "g7" };
    String black = "e5";
    assertEquals(1, antichess.sacrifice(white, black));
  }

  @Test
  public void case48() {
    String[] white = { "a4", "b3", "d7", "e2", "f5", "g4" };
    String black = "g3";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case49() {
    String[] white = { "a7", "b4", "c2", "d4", "e5", "f6", "g4", "h2" };
    String black = "h7";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case50() {
    String[] white = { "a7", "b4", "c4", "f7", "g7", "h6" };
    String black = "f6";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case51() {
    String[] white = { "a2", "b6", "c7", "d7", "e6", "f7", "g2" };
    String black = "g4";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case52() {
    String[] white = { "b7", "c3", "d6", "e5", "f3", "g2", "h3" };
    String black = "a6";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case53() {
    String[] white = { "a5", "b5", "c2", "d3", "e7", "f2", "g2", "h2" };
    String black = "h7";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case54() {
    String[] white = { "a2", "b4", "c6", "d2", "e6", "f3", "g6", "h5" };
    String black = "f4";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case55() {
    String[] white = { "a2", "b7", "c4", "d2", "e4", "f3", "g5", "h5" };
    String black = "f8";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case56() {
    String[] white = { "a7", "b5", "c7", "d2", "e5", "f4", "g2", "h6" };
    String black = "f8";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case57() {
    String[] white = { "d3", "g2" };
    String black = "b7";
    assertEquals(2, antichess.sacrifice(white, black));
  }

  @Test
  public void case58() {
    String[] white = { "d2", "g3", "h5" };
    String black = "d4";
    assertEquals(3, antichess.sacrifice(white, black));
  }

  @Test
  public void case59() {
    String[] white = { "f3", "g6", "h2" };
    String black = "a2";
    assertEquals(2, antichess.sacrifice(white, black));
  }

  @Test
  public void case60() {
    String[] white = { "h6" };
    String black = "f4";
    assertEquals(0, antichess.sacrifice(white, black));
  }

  @Test
  public void case61() {
    String[] white = { "g7", "h2" };
    String black = "a5";
    assertEquals(0, antichess.sacrifice(white, black));
  }

  @Test
  public void case62() {
    String[] white = { "b2", "f4", "g4", "h6" };
    String black = "g8";
    assertEquals(3, antichess.sacrifice(white, black));
  }

  @Test
  public void case63() {
    String[] white = { "a5", "b6", "h7" };
    String black = "h6";
    assertEquals(2, antichess.sacrifice(white, black));
  }

  @Test
  public void case64() {
    String[] white = { "e4", "f5", "g7" };
    String black = "d8";
    assertEquals(2, antichess.sacrifice(white, black));
  }

  @Test
  public void case65() {
    String[] white = { "a4", "f6", "g3" };
    String black = "e3";
    assertEquals(1, antichess.sacrifice(white, black));
  }

  @Test
  public void case66() {
    String[] white = { "a7", "c4", "d4", "e3" };
    String black = "c7";
    assertEquals(3, antichess.sacrifice(white, black));
  }

  @Test
  public void case67() {
    String[] white = { "a3", "b4", "d2", "e4" };
    String black = "h6";
    assertEquals(3, antichess.sacrifice(white, black));
  }

  @Test
  public void case68() {
    String[] white = { "a6", "b6", "c7", "d6", "e7", "f6", "g6", "h7" };
    String black = "b5";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case69() {
    String[] white = { "a6", "b6", "c6", "d7", "e6", "f7", "g6", "h7" };
    String black = "a3";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case70() {
    String[] white = { "a7", "b6", "c6", "d7", "e6", "f7", "g6", "h7" };
    String black = "a6";
    assertEquals(5, antichess.sacrifice(white, black));
  }

  @Test
  public void case71() {
    String[] white = { "b6", "c7", "d7", "e7", "f6", "g7", "h7" };
    String black = "c4";
    assertEquals(5, antichess.sacrifice(white, black));
  }

  @Test
  public void case72() {
    String[] white = { "a6", "b6", "c7", "d6", "e7", "f7", "g7", "h6" };
    String black = "d5";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case73() {
    String[] white = { "a7", "b6", "c6", "d6", "e7", "f7", "g7", "h7" };
    String black = "h6";
    assertEquals(5, antichess.sacrifice(white, black));
  }

  @Test
  public void case74() {
    String[] white = { "a6", "b6", "c6", "d7", "e6", "f7", "g6", "h6" };
    String black = "d6";
    assertEquals(6, antichess.sacrifice(white, black));
  }

  @Test
  public void case75() {
    String[] white = { "a3", "b3", "c2", "d2", "e2", "f3", "g3", "h2" };
    String black = "c1";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case76() {
    String[] white = { "a2", "b2", "c2", "d3", "e3", "f3", "g3", "h3" };
    String black = "f5";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case77() {
    String[] white = { "a2", "b2", "c2", "d2", "f3", "g2", "h3" };
    String black = "d7";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case78() {
    String[] white = { "a2", "b2", "c2", "d2", "e3", "f3", "g3", "h3" };
    String black = "f5";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case79() {
    String[] white = { "a3", "b3", "c2", "d2", "e3", "f2", "g3", "h2" };
    String black = "c5";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case80() {
    String[] white = { "a2", "b3", "c2", "d2", "e3", "f3", "g2", "h2" };
    String black = "a8";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case81() {
    String[] white = { "a3", "b2", "c3", "d2", "e2", "f3", "g3", "h2" };
    String black = "b1";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case82() {
    String[] white = { "a3", "b3", "c2", "d3", "e2", "f3", "g2", "h2" };
    String black = "c6";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case83() {
    String[] white = { "g3" };
    String black = "b4";
    assertEquals(1, antichess.sacrifice(white, black));
  }

  @Test
  public void case84() {
    String[] white = { "b3", "d2", "e2" };
    String black = "h3";
    assertEquals(3, antichess.sacrifice(white, black));
  }

  @Test
  public void case85() {
    String[] white = { "b2" };
    String black = "e6";
    assertEquals(1, antichess.sacrifice(white, black));
  }

  @Test
  public void case86() {
    String[] white = { "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3" };
    String black = "d8";
    assertEquals(7, antichess.sacrifice(white, black));
  }

  @Test
  public void case87() {
    String[] white = { "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2" };
    String black = "d8";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case88() {
    String[] white = { "e6", "g2", "h4" };
    String black = "g3";
    assertEquals(1, antichess.sacrifice(white, black));
  }

  @Test
  public void case89() {
    String[] white = { "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2" };
    String black = "d6";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case90() {
    String[] white = { "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h7" };
    String black = "h8";
    assertEquals(8, antichess.sacrifice(white, black));
  }

  @Test
  public void case91() {
    String[] white = { "a2" };
    String black = "b5";
    assertEquals(1, antichess.sacrifice(white, black));
  }

  @Test
  public void case92() {
    String[] white = { "e6", "b5", "f4" };
    String black = "g4";
    assertEquals(3, antichess.sacrifice(white, black));
  }

  @Test
  public void case93() {
    String[] white = { "a2", "h3" };
    String black = "a1";
    assertEquals(2, antichess.sacrifice(white, black));
  }

}
