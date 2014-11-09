package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CaptureThemAllTest {
  CaptureThemAll capturethemall = new CaptureThemAll();

  @Test
  public void case1() {
    String knight = "a1";
    String rook = "b3";
    String queen = "c5";
    assertEquals(2, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case2() {
    String knight = "b1";
    String rook = "c3";
    String queen = "a3";
    assertEquals(3, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case3() {
    String knight = "a1";
    String rook = "a2";
    String queen = "b2";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case4() {
    String knight = "a1";
    String rook = "h8";
    String queen = "b2";
    assertEquals(8, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case5() {
    String knight = "a1";
    String rook = "h8";
    String queen = "b1";
    assertEquals(8, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case6() {
    String knight = "a1";
    String rook = "a8";
    String queen = "h8";
    assertEquals(10, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case7() {
    String knight = "a5";
    String rook = "b7";
    String queen = "e4";
    assertEquals(3, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case8() {
    String knight = "c8";
    String rook = "g6";
    String queen = "b7";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case9() {
    String knight = "f5";
    String rook = "c1";
    String queen = "a3";
    assertEquals(7, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case10() {
    String knight = "b2";
    String rook = "h4";
    String queen = "a1";
    assertEquals(8, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case11() {
    String knight = "b6";
    String rook = "d3";
    String queen = "a5";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case12() {
    String knight = "g7";
    String rook = "e3";
    String queen = "h6";
    assertEquals(4, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case13() {
    String knight = "h8";
    String rook = "e2";
    String queen = "d2";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case14() {
    String knight = "g2";
    String rook = "g7";
    String queen = "h8";
    assertEquals(7, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case15() {
    String knight = "e4";
    String rook = "c3";
    String queen = "g1";
    assertEquals(3, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case16() {
    String knight = "d1";
    String rook = "f1";
    String queen = "a8";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case17() {
    String knight = "c3";
    String rook = "e6";
    String queen = "g6";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case18() {
    String knight = "d2";
    String rook = "f4";
    String queen = "d8";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case19() {
    String knight = "f1";
    String rook = "e4";
    String queen = "f5";
    assertEquals(4, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case20() {
    String knight = "e3";
    String rook = "b2";
    String queen = "d7";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case21() {
    String knight = "e8";
    String rook = "g3";
    String queen = "b6";
    assertEquals(7, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case22() {
    String knight = "d1";
    String rook = "f5";
    String queen = "b8";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case23() {
    String knight = "b8";
    String rook = "f3";
    String queen = "d1";
    assertEquals(7, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case24() {
    String knight = "h6";
    String rook = "b8";
    String queen = "g5";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case25() {
    String knight = "b2";
    String rook = "g4";
    String queen = "b5";
    assertEquals(7, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case26() {
    String knight = "f4";
    String rook = "c5";
    String queen = "f7";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case27() {
    String knight = "f4";
    String rook = "a3";
    String queen = "g1";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case28() {
    String knight = "e6";
    String rook = "d1";
    String queen = "h8";
    assertEquals(8, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case29() {
    String knight = "e3";
    String rook = "d3";
    String queen = "g3";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case30() {
    String knight = "d3";
    String rook = "h3";
    String queen = "f5";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case31() {
    String knight = "b7";
    String rook = "g4";
    String queen = "e8";
    assertEquals(4, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case32() {
    String knight = "a8";
    String rook = "e1";
    String queen = "e2";
    assertEquals(7, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case33() {
    String knight = "g6";
    String rook = "f2";
    String queen = "g1";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case34() {
    String knight = "a6";
    String rook = "c8";
    String queen = "c3";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case35() {
    String knight = "b6";
    String rook = "g6";
    String queen = "e6";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case36() {
    String knight = "c2";
    String rook = "a1";
    String queen = "g7";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case37() {
    String knight = "b1";
    String rook = "e1";
    String queen = "a4";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case38() {
    String knight = "g6";
    String rook = "e1";
    String queen = "d2";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case39() {
    String knight = "f3";
    String rook = "d2";
    String queen = "e5";
    assertEquals(3, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case40() {
    String knight = "f2";
    String rook = "e8";
    String queen = "f8";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case41() {
    String knight = "b3";
    String rook = "b8";
    String queen = "d8";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case42() {
    String knight = "a6";
    String rook = "a4";
    String queen = "h1";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case43() {
    String knight = "h3";
    String rook = "b7";
    String queen = "d2";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case44() {
    String knight = "f5";
    String rook = "d4";
    String queen = "e6";
    assertEquals(2, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case45() {
    String knight = "g7";
    String rook = "e6";
    String queen = "e4";
    assertEquals(3, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case46() {
    String knight = "b6";
    String rook = "e8";
    String queen = "b2";
    assertEquals(5, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case47() {
    String knight = "e6";
    String rook = "e3";
    String queen = "d1";
    assertEquals(4, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case48() {
    String knight = "f5";
    String rook = "e6";
    String queen = "g2";
    assertEquals(4, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case49() {
    String knight = "h8";
    String rook = "e2";
    String queen = "d2";
    assertEquals(6, capturethemall.fastKnight(knight, rook, queen));
  }

  @Test
  public void case50() {
    String knight = "a1";
    String rook = "h1";
    String queen = "a8";
    assertEquals(11, capturethemall.fastKnight(knight, rook, queen));
  }

}
