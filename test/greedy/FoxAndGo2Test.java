package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class FoxAndGo2Test {
  FoxAndGo2 foxandgo2 = new FoxAndGo2();

  @Test
  public void case1() {
    String[] board = { "...", ".o.", "..." };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case2() {
    String[] board = { "o.", "oo" };
    assertEquals(3, foxandgo2.maxKill(board));
  }

  @Test
  public void case3() {
    String[] board = { ".o.o.", "o.o.o", ".o.o.", "o.o.o", ".o.o." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case4() {
    String[] board = { ".o.o.", "o.o.o", ".o.o.", "o.o.o", "....." };
    assertEquals(10, foxandgo2.maxKill(board));
  }

  @Test
  public void case5() {
    String[] board = { ".o.o.o.o.o.", "o.ooo.ooo.o", ".o.......o.", "oo.......oo", ".o...o...o.", "o...o.o...o", ".o...o...o.", "oo.......oo", ".o.......o.", "o.ooo.ooo.o", ".o.o.o.o.o." };
    assertEquals(4, foxandgo2.maxKill(board));
  }

  @Test
  public void case6() {
    String[] board = { "...ooo.....", "...o.o.....", ".ooo.ooo...", ".o.....o...", ".ooo.ooo...", "...o.o.....", "...ooo.....", "....o......", "....o...ooo", "....ooooo.o", "........ooo" };
    assertEquals(38, foxandgo2.maxKill(board));
  }

  @Test
  public void case7() {
    String[] board = { "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooo.ooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo", "ooooooooooooooooooo" };
    assertEquals(360, foxandgo2.maxKill(board));
  }

  @Test
  public void case8() {
    String[] board = { "o.o.o.o.o.o.o.o.o..", ".o.o.o.o.o.o.o.o...", "o.o.o.o.o.o.o.o.o..", ".o.o.o.o.o.o.o.o...", "o.o.o.o.o.o.o.o.o..", ".o.o.o.o.o.o.o.o...", "o.o.o.o.o.o.o.o.o..", ".o.o.o.o.o.o.o.o...", "o.o.o.o.o.o.o.o.o..", ".o.o.o.o.o.o.o.o...", "o.o.o.o.o.o.o.o.o..", ".o.o.o.o.o.o.o.o...", "o.o.o.o.o.o.o.o.o..", ".o.o.o.o.o.o.o.o...", "o.o.o.o.o.o.o.o.o..", ".o.o.o.o.o.o.o.o...", "o.o.o.o.o.o.o.o.o..", "...................", "..................." };
    assertEquals(145, foxandgo2.maxKill(board));
  }

  @Test
  public void case9() {
    String[] board = { ".o", ".o" };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case10() {
    String[] board = { ".o", "o." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case11() {
    String[] board = { ".o", "oo" };
    assertEquals(3, foxandgo2.maxKill(board));
  }

  @Test
  public void case12() {
    String[] board = { "oooooo.o..ooooo.", "oo.oooooo..oo.oo", "o.o.ooo.ooo..oo.", "oooooo.o.ooooo.o", "ooooooooooo.oooo", "oooooo....oo.ooo", "ooooo.ooooo.oooo", "oo.o.o.oooo....o", "ooo..oo.ooooooo.", "oo.o..ooo.oo....", "oo.o.o.ooooooooo", "oooo.oooooo..o.o", ".oo.oo.ooo.ooooo", "o.oooo..ooo.oooo", "....ooo.oo.oo..o", "oooo.ooooo.o.o.." };
    assertEquals(6, foxandgo2.maxKill(board));
  }

  @Test
  public void case13() {
    String[] board = { "oooo", "o...", ".o..", ".ooo" };
    assertEquals(9, foxandgo2.maxKill(board));
  }

  @Test
  public void case14() {
    String[] board = { "ooo", "o.o", "..o" };
    assertEquals(6, foxandgo2.maxKill(board));
  }

  @Test
  public void case15() {
    String[] board = { "oo.", "oo.", ".o." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case16() {
    String[] board = { "o.o.ooo.oo.oooo", "ooo.oo.ooooooo.", "oooooooooooo..o", "o.oo.ooo.oo.ooo", "oooo.ooo.oo.ooo", "o.oooo.oo..o.oo", "oo..ooooooooooo", "oooo.oo.oooooo.", "ooo..ooo...oo.o", "ooooo.o.ooooooo", "ooooooo.o.oooo.", "ooooo....o..ooo", "ooo.ooooo.ooooo", ".o..ooo.ooo.ooo", "o.o.ooo.ooooo.o" };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case17() {
    String[] board = { "ooo.o.oooooooo", "ooooo.ooo.ooo.", "oo.ooooooooooo", "ooo.oooooooooo", "ooo..o.ooooo.o", "oooooo.o.ooo.o", ".ooooooo.ooooo", "oooooooo.oo.oo", "oooooo.o..ooo.", "o..o.ooo.oooo.", ".oo.oooooooooo", "ooo.o.oo.ooooo", ".oooo.o.o.oooo", "ooooo...o..o.." };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case18() {
    String[] board = { "o.", "oo" };
    assertEquals(3, foxandgo2.maxKill(board));
  }

  @Test
  public void case19() {
    String[] board = { ".....oo.oo.....o...", "....o......o..o....", "..o..o....o......o.", ".o.oo..o...........", "o...oo........o.oo.", "......o...o.o....o.", "....o....o..ooooo..", "o.....o........o...", "...................", ".............o...o.", "oo........o.o.o....", "...oo..............", "o.....o.o.o.o.oo...", ".o....ooo..o.....oo", "o.......o...o..o...", ".........oo...o....", "o.o..oo...o........", "...o.....o.........", ".............o...o." };
    assertEquals(75, foxandgo2.maxKill(board));
  }

  @Test
  public void case20() {
    String[] board = { ".o.", "o.o", "o.o" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case21() {
    String[] board = { "oo...", ".....", "...o.", ".....", ".o..." };
    assertEquals(4, foxandgo2.maxKill(board));
  }

  @Test
  public void case22() {
    String[] board = { "oo.o.ooo", "oooo..oo", "oooooooo", "ooooo.oo", "ooo.ooo.", "oo..oooo", "oooo...o", "oooo.o.o" };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case23() {
    String[] board = { "o.o.oo..ooooo", "oo.oooooooooo", "oooooooooooo.", "ooooooooooo..", ".ooooooooo..o", "oooooooo...oo", "o.oo.oooooooo", "o..oooooooo.o", "ooo.oooooo.oo", "oooooo.oooooo", ".oooooooooooo", ".oooooooo.ooo", ".oooo..oo.oo." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case24() {
    String[] board = { "o.oooooo.o.oooo", "oo.ooooooo.oo.o", "oooo..oooooooo.", "ooooooooooo.ooo", "oo.ooooooooo.oo", "oo.o.oooo.o.o.o", "ooooooooo.oooo.", "ooooooooooooooo", "ooooooooooo.ooo", ".oo.oooooo.o.oo", "oo.oooo.ooooooo", "oooooo.ooo.oooo", "ooooooooooo.ooo", ".ooooo.ooooo.oo", "oo.oooo..ooo.oo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case25() {
    String[] board = { ".......o...........", "...................", ".o...............o.", "..........o........", "......o............", "...................", "....o...........o..", "...........o.......", "...................", ".........o.........", "........o..........", "....o..............", "o..................", "..o................", "....o......o.......", "...................", "...................", "...................", "..o............o..o" };
    assertEquals(18, foxandgo2.maxKill(board));
  }

  @Test
  public void case26() {
    String[] board = { ".....o.....o...", "....o...o..o...", "...............", ".....o......o..", "......o........", "o.o.........o..", "......o........", "...............", ".....o.........", "....o..........", "..............o", "o....o.........", "...o.o.o.o.o...", ".........oo....", "..............." };
    assertEquals(24, foxandgo2.maxKill(board));
  }

  @Test
  public void case27() {
    String[] board = { "o.ooooo.oo", "oooooooo.o", "oo.ooooooo", "oooo.ooooo", ".o.o.o.ooo", ".o..o.ooo.", "o.....oooo", "oooooo..o.", "ooo.oooooo", "oooo.ooooo" };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case28() {
    String[] board = { "oo..o......oo..o.", "ooo..o....o.oo...", "o.ooo..o...oooooo", "o....oo.ooo..oo..", ".oo.ooo..oooooooo", ".o.o...oo.o.ooooo", "oo..oooo..o.ooooo", ".ooo.ooooo.o..o.o", "oo.oo.....oooo...", "ooo.o.oo...oo...o", "ooo.ooo..o.o...oo", ".oo.o.ooo.oo.oo..", "o...o.oo..oo.....", ".oooooo..oooo..oo", "o.o....o.oo.ooo.o", ".o....ooooo.oooo.", "...oo.oooo.o..oo." };
    assertEquals(36, foxandgo2.maxKill(board));
  }

  @Test
  public void case29() {
    String[] board = { "..oo.", "...o.", ".o.oo", "o.o.o", "oooo." };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case30() {
    String[] board = { "......o..", "..o.o.o..", ".........", "..o...o..", "o........", "...o...o.", ".o.....o.", "........o", "..o......" };
    assertEquals(13, foxandgo2.maxKill(board));
  }

  @Test
  public void case31() {
    String[] board = { "oooo.ooo", "oo..oooo", ".o.o.o..", "oo.oooo.", "oo..o..o", "oo.oo.o.", "ooooo.oo", "oooooo.o" };
    assertEquals(5, foxandgo2.maxKill(board));
  }

  @Test
  public void case32() {
    String[] board = { "oooooo", "o...o.", ".ooo.o", "o....o", "oo.ooo", "oo..oo" };
    assertEquals(23, foxandgo2.maxKill(board));
  }

  @Test
  public void case33() {
    String[] board = { "o......oo.....", "o......ooo....", "o...o.....o...", ".o.o.o.....o..", "o.o...oo......", "o........o..oo", "....o.......oo", ".o.o.o......o.", "oo.....o......", "o.............", "..o.o....o....", ".....o........", "..oo.o........", ".....oooo.oo.." };
    assertEquals(46, foxandgo2.maxKill(board));
  }

  @Test
  public void case34() {
    String[] board = { "oo..ooo.o.ooo.ooooo", "oooo.oooooooooo.o..", "o.oo.oooo.o.ooo..oo", "ooooo.....o.oo...oo", ".o..ooo..o.ooooo.oo", ".......oooo..oooooo", "ooo.ooooooo.o..oooo", "ooo.ooo.o.o.oooo.oo", "o.oooooooo..o.ooo.o", "oo..oo...ooooooooo.", "o.oo.ooooo.o.oo..oo", "ooo.o.o..oooooooo.o", "oo..ooooooo.oo..ooo", "oo.oo.o..o...ooo.oo", ".o..ooooooooooooooo", "oo....oo..o..oo.ooo", "ooo..o.oooo.o..oooo", ".o.oooo.o.o.o.ooo.o", "ooo.o..oo.oo...oo.o" };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case35() {
    String[] board = { "ooooooooooooooo", ".oooo.ooooooooo", ".oooooooooooooo", ".oooooo.oo.oooo", "ooooooooooooooo", ".ooo.oooo.ooooo", "ooo.ooooooo.ooo", ".ooooooo.o.oooo", "o.o...oooooo.oo", "oooo.ooo.ooo.o.", ".oooo.oo.o.oooo", "o.o.ooooooooooo", "ooooooooooooooo", "ooooo.o.ooo.ooo", "oooooooooooooo." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case36() {
    String[] board = { ".oo.o...", "o..o.o.o", "oo....o.", ".oo.o..o", "...o.oo.", ".o.ooooo", "...o..oo", ".oooo..." };
    assertEquals(30, foxandgo2.maxKill(board));
  }

  @Test
  public void case37() {
    String[] board = { "ooooooo.o.oooooo.oo", "oooooo.ooo.ooo.oooo", "oo.o.oooo.ooo.o.ooo", ".oo.oo.ooo.oooooooo", "oooo.o.oooo.o.ooooo", "o.ooooooo.ooooooo.o", "ooooooooooo.ooooooo", ".ooooooooo.ooooo.o.", "ooooooooooooo.ooooo", "..ooooooooooo.ooooo", "oo.oooooooooooooooo", "oo.ooooooo..o.ooooo", "oooo...ooooo..o.ooo", "oo.oooo.ooo.ooooooo", "oo.ooooo.ooo...oooo", "oooooooo.oooo.ooooo", "o.oo.oooo.oooo.oooo", ".oo.ooo.oooooooooo.", ".oooooooooooooooooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case38() {
    String[] board = { "o..oo.......", "...oo....o.o", "o....oo.....", ".o..o.oo....", ".o.o........", ".......o....", ".ooo.o.o....", "o.....oo.o..", ".....o.o..o.", ".o.o....o.o.", "ooo.o..oo...", "o.oo........" };
    assertEquals(42, foxandgo2.maxKill(board));
  }

  @Test
  public void case39() {
    String[] board = { "..o.........", "............", "............", "............", "......o..oo.", ".o..........", "..........o.", "............", "...........o", ".......o....", "..o.........", "............" };
    assertEquals(9, foxandgo2.maxKill(board));
  }

  @Test
  public void case40() {
    String[] board = { "o.ooo.oooo", ".oooo...oo", "o...oooo.o", "o.o.oo..oo", "o..oo...oo", ".oo..o.o.o", "oo.oo.oooo", "oooo.o.o.o", "o.ooooo.oo", "oooooooo.o" };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case41() {
    String[] board = { "oo.oooooooo..oooo.", "ooooooooooo.oooooo", "..oooooooooooooooo", "oooooooooooooooooo", "oooooooooo.ooooooo", "ooooo.oooooooooooo", "oooo..ooooooo.oooo", ".o.ooooooooo.ooooo", "ooo..ooo.oo.o.oooo", ".oooo.ooo.ooo.oooo", "oooo.oooooooo.oooo", "oo.ooooooooo.ooooo", "ooooooooooooooo..o", "oooooooooo.ooo.ooo", ".oooo.oooooo.ooooo", "o.o.o.oooo...ooooo", "oo.oooo.oooooooooo", "o.oooooooooo.oooo." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case42() {
    String[] board = { "...", "...", "..." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case43() {
    String[] board = { "oo.oo.oo.ooooo.", "oo.oooo.ooo..oo", "ooo..ooooo..ooo", ".ooooooooo..oo.", "ooooooooo...ooo", "ooo..oooo.oo.o.", "ooooooooooo..oo", "oooooo.oo...ooo", "oo.ooo.o.ooo..o", "oo.ooo.oo.o.oo.", "o.o.....oooo.oo", ".oooo.oooooooo.", "oo.oooooo..oo.o", ".o.ooo.o..ooooo", "ooooo.ooooooo.o" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case44() {
    String[] board = { "o..o", "oooo", "ooo.", "ooo." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case45() {
    String[] board = { ".....o.o...o..", ".o.o...o..o...", "....oo..o..o.o", "o.o..ooooooo.o", "o.oo..oo......", "o...ooo...o.oo", ".o.....o...o.o", "o.o..ooo....oo", ".ooo.o.o....o.", "oo....oo.o.ooo", "oo......o.oo.o", ".oo.......o..o", "..oo.oooo...oo", ".oo.o....ooo.o" };
    assertEquals(84, foxandgo2.maxKill(board));
  }

  @Test
  public void case46() {
    String[] board = { "o...ooo", "..oo.oo", "ooooo.o", "ooooooo", "oo.oooo", ".oo.ooo", ".oooooo" };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case47() {
    String[] board = { "oo.o", "oo.o", "oooo", "oooo" };
    assertEquals(14, foxandgo2.maxKill(board));
  }

  @Test
  public void case48() {
    String[] board = { "....oo....oo.o.....", ".oo..o...........o.", ".o.o......oo.......", "......o...o...o....", "........o....o.....", "o.o.....o.o.....o..", ".o...oo.o...o..o.o.", "...o....o.......ooo", "o........o..o....oo", "...................", ".oo.........o.o....", "....oooo.o.o.o.....", "..o....oo.....o...o", "..o........o.......", "............o......", "..oo...o...o.......", "o....o..o.o...oo.o.", "........o...o..o.o.", ".oo.......oo...o.oo" };
    assertEquals(81, foxandgo2.maxKill(board));
  }

  @Test
  public void case49() {
    String[] board = { ".....oo...", "o....o..o.", ".o.o.o....", "oo.o.o.o.o", "ooo...oo..", ".oo....o.o", ".ooo..o...", "o...o.oo.o", "..oo...o..", "...o..o.o." };
    assertEquals(38, foxandgo2.maxKill(board));
  }

  @Test
  public void case50() {
    String[] board = { "oo....", "...oo.", "o.ooo.", "....o.", "o.o.o.", ".o..o." };
    assertEquals(14, foxandgo2.maxKill(board));
  }

  @Test
  public void case51() {
    String[] board = { "...................", "............o......", "...................", "......o............", "...................", "................o..", "...................", "......o......o.....", "...................", "...................", "..............o....", ".........o.........", "...................", "........o..........", "...................", "...................", "...................", "......o............", "......o.o....o....." };
    assertEquals(12, foxandgo2.maxKill(board));
  }

  @Test
  public void case52() {
    String[] board = { "oooooo", "oooooo", "ooo.o.", "oooooo", "oooooo", "oooo.." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case53() {
    String[] board = { "..o", "oo.", "ooo" };
    assertEquals(6, foxandgo2.maxKill(board));
  }

  @Test
  public void case54() {
    String[] board = { ".o..o.o....o..", "o.o.oooo.o..oo", "o.oooo.ooo...o", "o.o.o.oooooo..", "oo..oooooo.oo.", "o.ooo....o.oo.", "oooo.ooo.ooo..", "ooooo.o.o...o.", "..o.o.oooo.oo.", "ooo..oo.o...oo", "oo.ooo.o.o...o", "oo.ooo.o.ooooo", "oooooo.ooo.ooo", ".o.o...ooooo.o" };
    assertEquals(5, foxandgo2.maxKill(board));
  }

  @Test
  public void case55() {
    String[] board = { ".o", "oo" };
    assertEquals(3, foxandgo2.maxKill(board));
  }

  @Test
  public void case56() {
    String[] board = { "oooo", "o...", "oo.o", ".ooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case57() {
    String[] board = { "o.ooooo.ooo", "ooooooo..o.", ".oo.o.o.o.o", "ooooooooooo", "o.ooo..oooo", "oooooooooo.", "ooo.oooo.oo", "oo.oo.oo...", "oo.o.oo...o", "ooooo.ooooo", "o.o.ooo.ooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case58() {
    String[] board = { "oooo.o.oo.", "oooooo.o..", "oooooooo..", "oo.o.o.ooo", "oo.ooooooo", ".oo.oo...o", "ooo..ooooo", ".ooo.ooo.o", "ooo.o.oooo", ".oooo..oo." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case59() {
    String[] board = { "...o.ooo.", "oooooo.o.", "o.ooooooo", ".oooo.oo.", ".oo.ooooo", "...o.oooo", "oo.oo.oo.", "o....oooo", "oo...oooo" };
    assertEquals(5, foxandgo2.maxKill(board));
  }

  @Test
  public void case60() {
    String[] board = { ".ooo", "o..o", "..o.", "ooo." };
    assertEquals(9, foxandgo2.maxKill(board));
  }

  @Test
  public void case61() {
    String[] board = { "o...o", ".....", ".oo.o", "..o..", "...o." };
    assertEquals(7, foxandgo2.maxKill(board));
  }

  @Test
  public void case62() {
    String[] board = { "....", "....", "..o.", "...." };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case63() {
    String[] board = { ".o....", ".....o", ".....o", "o.....", ".o...o", "......" };
    assertEquals(6, foxandgo2.maxKill(board));
  }

  @Test
  public void case64() {
    String[] board = { "o.ooo", "..ooo", "o.o..", "o..oo", "ooooo" };
    assertEquals(17, foxandgo2.maxKill(board));
  }

  @Test
  public void case65() {
    String[] board = { "oooooooo.oo.o", ".ooo..oooo..o", "..oo.oo.oooo.", "o.o.ooooooooo", "oooooooo.oooo", "oooooooooooo.", "ooooooo.ooooo", "ooo.ooo.o.ooo", "ooooooooooo.o", "ooooo.o.oooo.", "ooooooooooooo", "o.oo.oooo.ooo", ".o.ooooo..ooo" };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case66() {
    String[] board = { "o.", ".o" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case67() {
    String[] board = { ".....", ".....", ".....", ".....", "o...." };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case68() {
    String[] board = { "oooooooooo", "o.oooooooo", "oo.oooo.oo", "ooo..oooo.", "o..ooooooo", "o..oooo.o.", "ooooooo..o", "oooo...ooo", ".ooooooooo", "oooooooo.o" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case69() {
    String[] board = { ".o", ".o" };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case70() {
    String[] board = { "o.oo.....o..", "..ooo.oo..o.", "....o...o...", "o......oo..o", "o..oo......o", "...o.....o..", "......o....o", "....oo.o.o..", ".o.o.o.o..oo", "....o....o.o", "............", ".o..o......." };
    assertEquals(39, foxandgo2.maxKill(board));
  }

  @Test
  public void case71() {
    String[] board = { "ooo.", "....", "oooo", "oooo" };
    assertEquals(11, foxandgo2.maxKill(board));
  }

  @Test
  public void case72() {
    String[] board = { "o.oo", "oo.o", "oooo", "o..." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case73() {
    String[] board = { "o.o.oooo", "oooo.ooo", ".ooo.ooo", "o.....o.", "ooo.oooo", ".ooo..oo", "ooo.oo.o", "o..o...." };
    assertEquals(3, foxandgo2.maxKill(board));
  }

  @Test
  public void case74() {
    String[] board = { "...o..o.oo...o.o", "..o.oo.o.oo.o..o", "ooo..oo.o.oo..oo", "oo.o.oo.o.ooo.oo", "ooooo..ooooo.o.o", "ooooooo.oo.....o", "ooo.oooo....oo..", "oo....o.ooooo.oo", "ooooooo.o.oooooo", ".o.oo.oooo.ooooo", "...o..oo.oo.oooo", ".oo.o.o.ooo.o.o.", "oooooo...oooo.oo", "oo..oo.o.oooo.o.", "o.oo..ooo.oooooo", "ooooooooooooo..." };
    assertEquals(12, foxandgo2.maxKill(board));
  }

  @Test
  public void case75() {
    String[] board = { "....o....", ".........", "......o..", ".........", "...o.....", ".........", ".........", ".........", ".....o..." };
    assertEquals(4, foxandgo2.maxKill(board));
  }

  @Test
  public void case76() {
    String[] board = { "oooooooooo.ooo", "oooooooooooo..", ".oo.oooooooooo", "oo.ooooooooooo", "ooo.ooo.oooooo", "ooo.ooo.oooooo", "oooooooooooooo", "ooo.oooo.ooooo", ".oooooo.o.oooo", "oooooo.ooooooo", ".oo..ooooooooo", "o.oooooooo.oo.", ".oooooooo.oooo", "..ooo.oooooo.o" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case77() {
    String[] board = { "ooo.oooooooooo.oo.", "oooo.ooooooooooooo", "ooooooooooo.oooooo", "o.oooooo.ooooooooo", "ooo.oooooooooooooo", "oooooooooooooo.ooo", "ooooooooo..ooo.oo.", "oooooooooooooooooo", "ooooooo..ooo..o.oo", "ooooooooooooooooo.", "ooooooooooooooooo.", "ooooooooooo.oo.ooo", "oooooo.oooooooo.oo", "oo.ooooooooooo.ooo", "oooo..oooooooooooo", "o.ooooo.oo.ooooooo", "o.oooo..ooooooo.oo", "oooooooooooooo.oo." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case78() {
    String[] board = { ".ooooo..o...o", "ooo..oooooooo", "oooo.oooooooo", "oo..ooooooooo", "oooooooooo.oo", "ooooooooooooo", "o.ooooo.ooooo", "o.oooo.oooooo", "oo.ooooo.oooo", "oooooo.oooo.o", "oo.oooooooooo", "ooo..oooo.ooo", "ooooooo...oo." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case79() {
    String[] board = { "o......o..oo.", "........o.oo.", "o....o.......", ".o.......oo..", "o.....o......", "...o..o....oo", ".....o.......", "..o........o.", "............o", "....oo......o", "o............", ".o.........o.", ".oo..o......." };
    assertEquals(31, foxandgo2.maxKill(board));
  }

  @Test
  public void case80() {
    String[] board = { ".......o.....o", "o..o..........", "..oo..........", "o.............", "...o......o...", ".o....oo...o..", ".o.........o.o", "o......o......", "..o.ooo.......", "..............", ".........o....", "...ooo........", ".o......o.....", ".....o........" };
    assertEquals(29, foxandgo2.maxKill(board));
  }

  @Test
  public void case81() {
    String[] board = { ".oo.", ".ooo", "oooo", ".ooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case82() {
    String[] board = { "oo..", "....", "....", "o..." };
    assertEquals(3, foxandgo2.maxKill(board));
  }

  @Test
  public void case83() {
    String[] board = { ".o...oo", "o....o.", ".o..ooo", ".o.oo..", "o.oo.o.", "o..o..o", ".oo..oo" };
    assertEquals(23, foxandgo2.maxKill(board));
  }

  @Test
  public void case84() {
    String[] board = { "..o.o.o...o.....o", "..ooo.....o.o..o.", "..o..o.o...o.....", ".o.o.o...ooo..o..", "...........o...o.", "..o...oooo....o.o", "....o....ooo.ooo.", ".oo.ooo.o.....o.o", "...o...oo........", "o.o......oo..oo.o", "...oo....oo....oo", "..o..oo....ooo.oo", "....o.o.oo.o..o..", ".o.....o........o", "o.....o..o.oo....", "oo.o.o.o.oo.o.o..", ".....o..o..o..o.." };
    assertEquals(97, foxandgo2.maxKill(board));
  }

  @Test
  public void case85() {
    String[] board = { "oooooo.o.oo.oooooo", "o.oo.oooooo.oooo.o", "..oo.ooo..o..ooo.o", "oo.ooo.o..o...oooo", "oo.o..ooo.oo.ooooo", "oo...oo.oo.o.o.o.o", "oooooo.ooo.oooo.oo", "ooo...o.ooooo.oooo", "ooooooooo.o.ooo.oo", "o.oooooooooooooooo", "ooooo..ooo.ooo.ooo", "oo..oooooooooooo.o", "oo.oo.oooooo.....o", "ooo.oooooo..oo..oo", "oo.ooooooo.oo.o..o", ".o.oo.oo.ooooooooo", "ooo.oo.ooo.ooooooo", "ooo.oooooooo.o.ooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case86() {
    String[] board = { "ooo.o.", ".o..o.", "o..o..", "....oo", "......", ".o.oo." };
    assertEquals(13, foxandgo2.maxKill(board));
  }

  @Test
  public void case87() {
    String[] board = { "oo...o...o....o....", "........o.oo..o....", "...o............o..", "..o...ooo..oo..oooo", ".o...o.o...o...o.o.", "...o....o.o..o....o", "o.o.ooo..o.o......o", "...o.o.o....o......", "ooo..o......oooo..o", "...oo..oo..o.o...o.", ".o.oooo..oo.......o", "...o........o....o.", "....o...........oo.", "..ooo.o...o.o......", "..o......oo.o.....o", "o.....o....o.oo....", "...o....o......o...", "oo.....o.......o..o", ".......oo..o......o" };
    assertEquals(102, foxandgo2.maxKill(board));
  }

  @Test
  public void case88() {
    String[] board = { "ooooooo..o...ooo", "ooooooooo.ooo.o.", "o.oo..ooooo.oooo", "ooooo..ooo...ooo", ".ooo.o.ooooooooo", "oo.o.ooooooo..o.", "oo.ooo.o..oooo..", ".o..oooo.ooooooo", "ooo.ooo..ooo.o.o", "...ooo.oooooo..o", ".oooooo.oooooooo", "oooooo.ooo.ooooo", "oo.o.oooo.oooooo", "oo.oooooo..ooooo", ".o.o..o...oooooo", "..ooooooo.oooooo" };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case89() {
    String[] board = { "oo.oo.o", "..o.o.o", "o.ooo..", ".o.oo..", "o.o...o", "o.ooo.o", "oooo.oo" };
    assertEquals(29, foxandgo2.maxKill(board));
  }

  @Test
  public void case90() {
    String[] board = { ".o.o.ooooooo...o.o", "..o..oooo.oo.o.ooo", "...ooo.ooo.oo..o.o", ".oooooo..ooo.oo.oo", ".o.oo.oooo.oo.oooo", "o.ooo.o..o.oo.oo.o", ".ooo.ooooo.ooooo..", "oooooo.o.oo..ooo..", "oo.ooo...o.ooo...o", "...oo..o.ooo.ooooo", "oo.oooooo....ooo.o", "ooooooo....oooooo.", "o..oooooo.o.ooo..o", "..oo.oo.ooo.o.oooo", "o.oo.oo.ooo.oo.ooo", "oo.oooo..oo..oo...", "ooo...oooooooo.o.o", "oo..oooooooooo.oo." };
    assertEquals(16, foxandgo2.maxKill(board));
  }

  @Test
  public void case91() {
    String[] board = { "..o", ".o.", "ooo" };
    assertEquals(5, foxandgo2.maxKill(board));
  }

  @Test
  public void case92() {
    String[] board = { "ooo..o.o..oooo.ooo.", ".o.oooo.ooo.ooo.o.o", "oooo..ooo.oo.o...o.", "o...oo.o.o..ooooooo", "ooo.o.ooo.oo.o.oo.o", "o...ooo.o..oo.o...o", "oooooo.oooooo.oo.oo", "oooo.oo.oooooo.oo.o", ".....ooooooo.oo.ooo", ".ooooo.o.ooooooo.oo", ".ooo.oooo.o.o.ooooo", "oo..ooo.oooo....o.o", ".o..ooo.o.o.oooo...", "oo..o...oooo....o.o", "oooo..oooo.o.oo..o.", ".o.oo.oooo..oooo.o.", "oo...oooooooo...o..", "ooooo.o.oo.o...o...", "o..o.ooo.o.oooooooo" };
    assertEquals(9, foxandgo2.maxKill(board));
  }

  @Test
  public void case93() {
    String[] board = { ".ooooo.oo.oo.oo", "ooooooooooo..oo", "oooo.oooooooooo", "oo.oo.ooooooooo", ".ooo.ooooooo..o", "ooo.oooooooo.oo", "oooooooo.oooo.o", "ooooooooooooooo", "oo.oooo..oooo.o", "ooooooooooooooo", "ooooo.ooooooooo", "o.ooooooooo.ooo", "oooo.oooooooooo", "ooo.ooooooooooo", "o.o.o.oooooo.oo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case94() {
    String[] board = { ".ooo", ".o..", "oooo", ".ooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case95() {
    String[] board = { "o..o.ooo", ".....oo.", "..o....o", "...o.o..", "..o.o...", "o..o.o..", ".o...o..", "..o..o.." };
    assertEquals(20, foxandgo2.maxKill(board));
  }

  @Test
  public void case96() {
    String[] board = { "oo..o..", "oooooo.", "oo.oooo", "oooo.oo", "o.ooooo", "oooo..o", "oooo..." };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case97() {
    String[] board = { ".oo.o.", "ooooo.", "....oo", "......", "o.oo.o", "..o..." };
    assertEquals(5, foxandgo2.maxKill(board));
  }

  @Test
  public void case98() {
    String[] board = { ".o.o..o.....o.o...", "...oooooo.o..o.o..", "o......o...o......", ".......o.oo.oo.o..", "..o.oo.ooo...o..oo", "o.....o..oo..o..oo", "...o...ooo..oooo.o", "....o...o...ooo...", "o.o.ooooo......o..", "..o........o..oo..", "oo....oo.o.o.ooo..", "o......oooo.oo....", ".o.o.oo..oo...oo.o", "ooo..oooo.oo..ooo.", "o.oo.o..o.....ooo.", "ooo..o..oo.o...o..", "o.oooo..ooooo.ooo.", ".o.ooo.oooo.o.o.o." };
    assertEquals(101, foxandgo2.maxKill(board));
  }

  @Test
  public void case99() {
    String[] board = { "..............", ".....o........", "............o.", "...o..........", "...o.........o", "..........o...", "..o...........", "....o.........", "...o.......oo.", ".o....ooo.....", ".....o...o....", "..............", "..........o...", "..........o..." };
    assertEquals(19, foxandgo2.maxKill(board));
  }

  @Test
  public void case100() {
    String[] board = { "o.oo.oo.oo....", "ooo..ooo.oooo.", "o.oo.o.....o..", "o..o..ooo.....", "o..o.oo.o.oo..", ".oo...oo...o.o", "o.oo..o..o..oo", "..o..o.ooo..o.", "..o.oo..o.o...", ".o.....o..ooo.", "..oo..oo....o.", ".o..oo.o..o..o", ".o.o...o..o.o.", "oo.o......o.oo" };
    assertEquals(85, foxandgo2.maxKill(board));
  }

  @Test
  public void case101() {
    String[] board = { "oooo.ooo", "oooooooo", "..oo.ooo", "oo.ooooo", "ooo..o..", "oooooooo", "oo.oooo.", "oo.ooooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case102() {
    String[] board = { "ooooo.ooooo.o.o.", "o.oo..oooo..oooo", ".o.oooo..o.ooo.o", "o.o.ooo.oooooo.o", ".oo.ooo...oooo.o", ".ooooo.ooo..o..o", "o..oooooooo.oo..", ".oo.o..o.o.o.o.o", "oooo.oo.o...ooo.", "oooo..oo..o.o.o.", "o.o.o.ooo..oo...", ".ooo.oo.ooooo...", "..oooo.o....oooo", ".ooo.oo.oooo.o.o", ".o.o.ooo...ooo.o", "o.o.oo..o.o.oo.." };
    assertEquals(7, foxandgo2.maxKill(board));
  }

  @Test
  public void case103() {
    String[] board = { "o.o.o.o.o...oo", ".o.oo...oo...o", ".ooooooo.ooooo", "oooooo..oooooo", "oo.o..oo..o.oo", "......o..ooo.o", "ooo.oo..o.ooo.", "o.o..o..ooo..o", "o.oooooo.o.oo.", ".oo...o...oo.o", "o.oo...ooo...o", "o...o..o...o.o", ".o...oo.o...oo", "o....oo.o.o.oo" };
    assertEquals(54, foxandgo2.maxKill(board));
  }

  @Test
  public void case104() {
    String[] board = { "....oo.o..ooo.o..", "oo.o..ooo..o...oo", ".oo.o..ooo.o.o.o.", "o.....o...ooo.oo.", "..o...oo.oo.oo..o", "....o..o.o.ooo.oo", "..o..ooooo..ooo..", "o.ooo.o.o.o.....o", "oo...o.o..o...o.o", ".oo...o.oo.oo.o.o", ".o..o...oo.o...o.", ".ooo.......o.....", "o.o...ooo.ooo..oo", ".oo...oo...ooooo.", ".oo..oooo..oo..oo", ".o...oo....oo.o.o", "o.......o..oo...o" };
    assertEquals(132, foxandgo2.maxKill(board));
  }

  @Test
  public void case105() {
    String[] board = { "ooo.o", "ooo..", "ooo..", "oo.o.", "..ooo" };
    assertEquals(16, foxandgo2.maxKill(board));
  }

  @Test
  public void case106() {
    String[] board = { "oo.ooo.ooo.oo.ooo", "ooo.o.oooo.oo..oo", "oooo.oooooooooooo", "oooooooo..oo.oooo", "ooo.oooooooooo.oo", "o..ooooooooooo.oo", "ooo.oooo.ooooooo.", "ooooo.ooooooooooo", "ooooooooo.oo.oooo", ".oooooo.o.o.oo.oo", ".o.ooooo..o.ooo.o", ".oo.oooooo..oooo.", ".oooo.ooooooooo..", "oo.oooooooo.o.o.o", "o.ooooo.o.oo.oooo", "ooooooooo.ooooo.o", "o.ooooo.oo.oooooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case107() {
    String[] board = { "ooo..ooo.o.o.o....", "ooooooo.o.oo.ooo.o", ".ooo.o.oo..o...ooo", "o...oooooo.o..ooo.", "...o..o..ooooooooo", "o.ooo.ooooooo.ooo.", ".ooo.oooooooo.oooo", "ooo...oooo...ooo.o", "o....oo..ooooooooo", "oooo.o.o.ooo.o.ooo", "ooo.o..oo..ooo.oo.", ".o.oooooooo.o.o.o.", ".oooo.ooo.o..o..o.", "..oooo.oo.oo.oooo.", "..ooo.o.oo.oo.o..o", "o.o.oooooo...o.o.o", ".ooooooooooo.oooo.", ".o.ooo.oooooo..ooo" };
    assertEquals(6, foxandgo2.maxKill(board));
  }

  @Test
  public void case108() {
    String[] board = { "o.o.", "....", "..oo", "o..o" };
    assertEquals(6, foxandgo2.maxKill(board));
  }

  @Test
  public void case109() {
    String[] board = { ".oooooo.o.o.", "..oooooooooo", "o.o.o.oooooo", "oooo.o.ooo.o", "..ooo.oooooo", ".oo.ooooo..o", "ooooo.ooooo.", "ooooo.oo.oo.", ".oooooo.oooo", "oooooooo.o.o", "ooo.o.oo.ooo", "o..o.oo.oooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case110() {
    String[] board = { ".o.oo.oo..", "ooo.oo.oo.", "oooo.o..oo", "...oo.oooo", ".oooooo.o.", ".o...ooo.o", "oo.oo.o.o.", "oooooo.oo.", "....ooo.oo", "oooo.o.ooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case111() {
    String[] board = { "oooooo..o..ooooo..", "oooooooooooo..oo.o", "oooooooooooooo.ooo", "o.oo.o.ooo.o.ooooo", "o.ooooo.o.ooooo.o.", "o.ooo.ooooooooo...", ".o..o.oo.o.o.ooo..", "oooooo.oo..oo.oooo", "..oooo..o..oo.oo.o", "..o..ooo.o.o.oo.oo", "ooo.oooooo.ooooo.o", "ooo.oooo.o.oooo.o.", "oooooo..o.o.o.oo.o", "...ooooooo.o....oo", ".oooooo.o..o.ooo..", ".ooo.o.oo.ooo.ooo.", "o.oo.oo.ooooooo..o", ".o.o.ooooo..o...oo" };
    assertEquals(3, foxandgo2.maxKill(board));
  }

  @Test
  public void case112() {
    String[] board = { ".oooo", "o.oo.", "o.ooo", "ooo.o", "ooo.o" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case113() {
    String[] board = { ".ooooo..ooooooo.o", "oooooo.oo.ooooooo", ".ooo...ooooooooo.", "ooooooo..oooooo..", ".o.oo..oo.oooo..o", "oo.oo.o.oo.oooo..", ".oooooooooooo.ooo", ".o...o.ooooo.o.oo", "o.oooooooo.o.oooo", "..ooooooo..oooooo", "oooooo.ooooooo...", "oo.oooo.o.oooo.oo", "ooooo..o.oo.ooooo", "oooo..o..o.oooooo", "oooooooo.oo...o.o", ".oooooooo.o.oooo.", "ooooo.o.ooooooo.." };
    assertEquals(3, foxandgo2.maxKill(board));
  }

  @Test
  public void case114() {
    String[] board = { "...o.o.......", "...o.......o.", ".o........o.o", "o.oo.........", "oo........o.o", "......o.ooo..", "o......o.....", "..........o..", "oo.......o...", "o.ooooo.o...o", "....o...oo...", "o.....o...o..", ".o..........." };
    assertEquals(39, foxandgo2.maxKill(board));
  }

  @Test
  public void case115() {
    String[] board = { "..o", "...", "o.." };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case116() {
    String[] board = { "ooo.ooo", "oooooo.", "ooo.oo.", "oo.oooo", "o.o.ooo", ".ooo..o", "ooo.o.o" };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case117() {
    String[] board = { ".ooo.o.ooo.....", "o...ooooooooo..", ".o.oooooooo...o", "..oooo.o.oooo..", ".o..ooooo.ooo.o", "ooo.oo..o.o..oo", "..o..o.oooo..oo", "..o.o..o.o..ooo", "ooo.o..ooo.oo.o", ".oo.o.ooo.o.oo.", "oooo.o...oo.o..", ".oo.oo..o..oooo", "o..........o.oo", "ooo..o..o.oo.oo", "o.o..o.o..oo.oo" };
    assertEquals(17, foxandgo2.maxKill(board));
  }

  @Test
  public void case118() {
    String[] board = { "ooo.", "o...", "o.oo", "o..." };
    assertEquals(8, foxandgo2.maxKill(board));
  }

  @Test
  public void case119() {
    String[] board = { "..o.o..oooo.o.o.", "ooooooo.oooooooo", "o..ooo..oooo...o", "ooo....oo.o.o..o", ".oo..oo.ooo.ooo.", ".o.o.oo....oo.oo", "ooo...o..o.o.o..", ".o...ooooooooooo", "ooo.oo.o.o.oo..o", "o..o.oooooo...o.", "o..ooo..oo....oo", ".o..oo.oooo..o.o", "ooo.oo.o.ooo.ooo", "o..o...ooooooooo", "oo...oo.oooooo..", ".oooooo.o.oooooo" };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case120() {
    String[] board = { "..o.......o", "..........o", "...o.o....o", ".......o...", ".o.........", "......o....", "...........", "...........", "...........", "...o......o", "......o...." };
    assertEquals(12, foxandgo2.maxKill(board));
  }

  @Test
  public void case121() {
    String[] board = { "ooooooooo.ooooo", "ooo.o.oooo.oooo", "..oo.o.oo.ooooo", "oooo.ooooo.oo.o", ".oo.ooooooooooo", "ooooo.ooo.ooooo", "oo..ooooo.oo.oo", "ooo.oo.oooooooo", ".o.o.ooo.ooo..o", "ooooooo.oooo.oo", "o.ooo.ooooo.ooo", "ooo.oooooo.oooo", "ooo.o.ooooooooo", ".ooooooooo..ooo", "oooo..ooooooooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case122() {
    String[] board = { "oo..oo.....o..o", ".o..ooooooo....", "ooooo..o...o...", "oooooo......oo.", "oooo..o...ooo..", "oo.o...oo.o.oo.", "..ooo.o..oooo..", "..oo...o.o..o.o", ".ooo...o...o.oo", "o.....ooo......", ".....o...o.oo..", ".o.oo.o.ooo.o..", "oo.oooo.o......", "...oo..o.o.oo.o", "o...oo...oooo.." };
    assertEquals(64, foxandgo2.maxKill(board));
  }

  @Test
  public void case123() {
    String[] board = { ".ooooo.o", "...ooooo", ".ooo..oo", ".o..o..o", "oooooo..", "ooo.o.oo", ".oo.o.oo", "o...oo.o" };
    assertEquals(1, foxandgo2.maxKill(board));
  }

  @Test
  public void case124() {
    String[] board = { "oooooo..o.ooo", "oooooo..o.ooo", "o.o..ooooooo.", "o.o.oooo.oooo", "o.oo.oooooooo", "oooo..o.o..o.", "oooooooo.o.oo", "o.oooo...o.oo", "...o..ooo.oo.", "oooooooo.oooo", "oo.ooo.oo.ooo", "ooo.oo.ooo..o", "o.ooooooooooo" };
    assertEquals(2, foxandgo2.maxKill(board));
  }

  @Test
  public void case125() {
    String[] board = { "o.o.oo..oo.", "oooo.ooo..o", ".ooo....o.o", "ooooooo.o.o", "ooo.oo.o.oo", "..o.oo..o.o", "..oo.ooooo.", "oooooooo..o", "..o.oo...o.", "o..oooo.oo.", "oooooo.oooo" };
    assertEquals(24, foxandgo2.maxKill(board));
  }

  @Test
  public void case126() {
    String[] board = { ".ooo......o", ".ooo..o.o.o", "o.oo.o...o.", "ooo.oooooo.", "oo..o..ooo.", "oooo....oo.", "o.oo..o...o", "oo.oooooooo", "o..ooo.oooo", ".o...oooooo", "o.ooo.o..oo" };
    assertEquals(18, foxandgo2.maxKill(board));
  }

  @Test
  public void case127() {
    String[] board = { "..o...ooo.", "oo..oooo.o", "...oo..o.o", "...oo.o.oo", ".oo.o...oo", ".o..oooo.o", "ooooo.o..o", "o.o.oo....", "..o.oo...o", "ooo.o.ooo." };
    assertEquals(8, foxandgo2.maxKill(board));
  }

  @Test
  public void case128() {
    String[] board = { ".oo..oo.o.oo...", "...o.o..oo.ooo.", "oo.o......o....", "o..oo..o....o..", ".oo.oo..oo.ooo.", "oo......o......", ".ooo.o.o..o.ooo", "o.ooo......o..o", "oo.ooo.ooooo...", ".o...o..o.o..oo", "....o..o..oo.o.", "o..oo.ooo..o...", "ooo...oo.ooo.oo", "ooo...oo.oo.ooo", "..o...o..oo...." };
    assertEquals(84, foxandgo2.maxKill(board));
  }

  @Test
  public void case129() {
    String[] board = { "oooooooooo..oo.", "oo.o..ooo.o.o.o", "oooo..oooo..o.o", ".o.ooo.o.oooooo", "oo.o...oo..oo.o", "oo.o...o...o.o.", "oo..oo.o.oo.o.o", "o.o.o.oooo..oo.", ".ooo.o.ooo..ooo", "o..ooo.oo.o..o.", ".ooo.....oooo..", ".oo..ooo..o.o..", "oooo.o.ooo....o", "o.oo..ooooo.o.o", "o.oo.....oo.oo." };
    assertEquals(28, foxandgo2.maxKill(board));
  }

  @Test
  public void case130() {
    String[] board = { "ooooooooo..ooo", "ooo.ooooo..ooo", "oo.o...o.oo.oo", "ooooooo.ooo.oo", ".oo.o.oo.ooo.o", "oooooo..oooo.o", ".ooo.oo..o.ooo", "o.ooooooo...o.", "..oooo.oo.o..o", "oo.o.o.o..ooo.", "...oooo.oo.o.o", ".oooooo.o...oo", "oooooooo..oooo", "ooooo.ooo.o.oo" };
    assertEquals(6, foxandgo2.maxKill(board));
  }

  @Test
  public void case131() {
    String[] board = { ".oo.o.ooo...", "oo.o.ooo..oo", ".o......oo.o", ".o....o..oo.", "..ooo.oo....", "o.o.........", "ooooo..ooooo", "...oo.....oo", "..oo.ooo.o.o", "...o...ooo.o", "...o..o..o..", ".oo..ooo..oo" };
    assertEquals(65, foxandgo2.maxKill(board));
  }

  @Test
  public void case132() {
    String[] board = { "oo.oooooo..o", ".oo.oo..o.oo", "oo..oooo..o.", ".ooo.o..oooo", "oooooo.o.o.o", "ooo..ooo.o..", ".oo.o.o..o..", "oo.o.ooo.o..", "ooo.o.oo.ooo", "o.o..ooo..o.", "oo.o...oo..o", "o...oo..o..o" };
    assertEquals(22, foxandgo2.maxKill(board));
  }

  @Test
  public void case133() {
    String[] board = { "..oo.oo.oooo", ".o.oo..o.ooo", "...o..oooooo", "ooooo.ooo...", ".o.o..o.....", "o..o...o.o..", "oo.o.ooooo..", "..o....oooo.", "ooo....oo.oo", "o....oooo...", ".oo.ooo..o.o", "o...o..ooo.o" };
    assertEquals(75, foxandgo2.maxKill(board));
  }

  @Test
  public void case134() {
    String[] board = { "oo.o.o.o.", "ooo.ooo..", ".o.ooo.oo", "o.o.ooooo", "oo..oooo.", "..ooo.ooo", "oo..o.ooo", "o...oooo.", ".o.o....." };
    assertEquals(6, foxandgo2.maxKill(board));
  }

  @Test
  public void case135() {
    String[] board = { ".oo..oo", "o..ooo.", "o......", ".oo..o.", "o..oo.o", ".o.....", ".o.o.o." };
    assertEquals(20, foxandgo2.maxKill(board));
  }

  @Test
  public void case136() {
    String[] board = { "oo.oo.oo.o..ooo.o", ".ooo.oooo.oooo..o", "ooo.o..oo.o.oo..o", "oo.o...oo..oooooo", "oo..oo....oo.oooo", "oo.ooo.o.ooo..oo.", "ooo..oo..o..ooo..", "ooooooo.oooo.o...", "ooooo..oo..ooo.oo", "..o.ooooo..oo.o.o", "oo..o..oo.oo..ooo", "....oooo.oo.o...o", "o..ooo...o.ooooo.", "oo..ooooo..o.oo..", "oo..o.o.....oo.oo", "..o.o....o.o...o.", "o......o.oooo..o." };
    assertEquals(42, foxandgo2.maxKill(board));
  }

  @Test
  public void case137() {
    String[] board = { "..........", "o..oooo..o", "o....o.o..", "ooooo..o..", ".o..o..o.o", ".o..oo.oo.", "oo...o..oo", "o.o.oo.oo.", ".o.o.o....", ".o.o.o.oo." };
    assertEquals(43, foxandgo2.maxKill(board));
  }

  @Test
  public void case138() {
    String[] board = { "o.oo......o....", ".ooo...oo.o.o.o", "...oo.ooo.oo.oo", ".......oooooo..", "..o.o...ooo..oo", "...o....o..oo.o", "o..o....o.o....", "o.o...o.oo..o.o", "o...oo.o.oooo..", ".....o.....o.oo", "..oo..oo..o.o..", "..o..oooo.o.oo.", "oo..o..o.o...oo", ".o.oooo.o....o.", ".o..ooo.o..oo.o" };
    assertEquals(98, foxandgo2.maxKill(board));
  }

  @Test
  public void case139() {
    String[] board = { "ooo.o.ooooooooooo", "oo.oooo.oo.ooo.o.", "o.o.o.o..oo..o.oo", "o..o....oo..o.ooo", "oo...ooo.oooo.ooo", ".o..oo.ooo.o..oo.", "...oo.o..oo..oooo", "ooo....o.oo..oooo", "ooo.o.o....oo.oo.", "oo..o.o.o.o.ooo..", ".oo.o.ooo....oo.o", "o.o.oo.ooo..o.oo.", ".oo.o.o..ooo..o..", "o.oooooooo.ooooo.", "o.oo..o..o.o..ooo", "oo.o...o....oo.o.", "o.oo.o.o.o.oooooo" };
    assertEquals(21, foxandgo2.maxKill(board));
  }

  @Test
  public void case140() {
    String[] board = { "o.o.oo....oo.ooo", "oo.ooo.ooo......", "o.....o...oo..oo", ".oooo..o....o...", ".......ooo.ooo.o", "..o.ooooooooo.oo", "ooo...oo.o.oo...", ".o.o.o.o..o..ooo", "oo.o...oo..ooo.o", "....o..o.o......", "o.oooo.oooo.o..o", "..o....o....o.oo", ".oo.oo..o.ooo...", "o.oo...o...oo.oo", "o.oo.ooo...o...o", "o.o.oo.oo......o" };
    assertEquals(123, foxandgo2.maxKill(board));
  }

  @Test
  public void case141() {
    String[] board = { "oo.oo.o.ooooo.ooo", "oo.o.oooooo.ooo.o", "o..oo.oo..o.o.ooo", "o.oo.o.oooo.oo.o.", "oo.ooooo.oooo..o.", "o....ooo.oo.oooo.", "oooo.oooo..oooooo", "o.oooo.ooooooo.oo", "ooooo.o.o.oooo.oo", "ooo.oooo.ooooo.oo", "o..o..oo.oo..oo.o", ".oo.oo...o.oo.o..", "o...ooo.o.ooo.ooo", ".oo.ooooo.o.oo.oo", "o.oooooo.oo..oooo", "o.oooo.oooo.ooooo", "o.oooo.oo..oo.oo." };
    assertEquals(7, foxandgo2.maxKill(board));
  }

  @Test
  public void case142() {
    String[] board = { "oo..oooo..o.o.o.o", "oo.oooooo.o.ooooo", "o.o.oo..oooooo.oo", "..oo...ooo.o.o.o.", "oooo.ooo.o..oooo.", ".ooooooooo.o.oooo", ".ooo..ooo.ooooooo", "ooooooo....ooo..o", ".ooooooooo.ooooo.", "ooo.ooo.oo.oooo.o", "oooooo..oo.o...o.", "..oo.oo.oooo.oo.o", "oo.o..oo..ooo..oo", "oooooooo..ooo.o..", "oooooo..oo.ooooo.", "oo...ooo...ooo.o.", "..oo..oooo..ooo.o" };
    assertEquals(17, foxandgo2.maxKill(board));
  }

  @Test
  public void case143() {
    String[] board = { "ooooo.o.oo....o..", "oooo.o.oo..o.o..o", "..o..oo......o..o", "oo...o..o......oo", "o.o..o.o.o..o.o.o", ".ooo.oo...oo.oo..", "o...o.....oo...o.", "..oo.oooo..o..o.o", "o.oo.....oo.....o", ".oooo.o........oo", "o..o....o..o.oo.o", "o.ooo...oo.oooo..", "o.oo.o.o.ooo.o.oo", "..o.o.oo..o.oo..o", "o.oo..o..o.o.oooo", ".o..oo.o.o.oo....", ".ooo...o.o....oo." };
    assertEquals(107, foxandgo2.maxKill(board));
  }

  @Test
  public void case144() {
    String[] board = { "..o.ooo..o.o..o..", "o.....o..oo..oo..", ".......oo.o....oo", "....o...o..oo..o.", ".....o.o..o.o.oo.", ".....o...o.....oo", ".oo...oo.o.o....o", "o..oooo.o...o....", "....oo..o...ooo..", "..o.........o.o.o", "......oo...o..o..", ".o..oo.oo.o......", "...o.o.o.o.oo....", "...oooo.o....o...", "..o.oo.o...o...oo", ".oo...o.oo..o.o..", "o..o.o.oo......oo" };
    assertEquals(100, foxandgo2.maxKill(board));
  }

  @Test
  public void case145() {
    String[] board = { "o..oo.o..o", "ooooo.....", "...ooo..oo", "ooo..o..oo", "....ooo.oo", "oooooo.o.o", ".oooo.ooo.", ".oooo.oo.o", ".o...o....", "..o.ooo..o" };
    assertEquals(55, foxandgo2.maxKill(board));
  }

  @Test
  public void case146() {
    String[] board = { "o....oo.oo.", "..oo...o...", "oo....o..oo", ".......oooo", "oo..oo.oo..", "o.ooooo..o.", "oo.oo...o.o", "..o..o.o.o.", "o.....o.oo.", "...o.ooo.o.", "oo...o..oo." };
    assertEquals(54, foxandgo2.maxKill(board));
  }

  @Test
  public void case147() {
    String[] board = { ".o..oo.oo.ooo..", "o.ooo.ooo.o..oo", "ooooo...o.o..oo", "..o.ooo.o..o.o.", "..oo.o.o...o..o", "..o.oooo...o..o", "...o...o.......", ".o..o.o......o.", ".o..ooo..oo.o.o", "o.o...o.ooo.o.o", "o.o.ooo..o.o.o.", "...ooo.oo.o.oo.", "..oo.ooo.ooo..o", "..ooo..oo....o.", "o.oo..........o" };
    assertEquals(52, foxandgo2.maxKill(board));
  }

  @Test
  public void case148() {
    String[] board = { "...o.oooooo....", "o.o...oooo..ooo", ".o.oo..o..oo...", "o.o..o...o.ooo.", ".oo.oooo..o.oo.", "oooo....ooooo.o", ".oooo....oooooo", "o.....o...o...o", ".oo..o..oo.o...", "o.o.o.....oo.o.", ".oo...o.o.o.o.o", ".oooo..ooo...oo", "o.o.....oo..o..", "oooooo.oo..oo.o", "oooooo.o...oo.o" };
    assertEquals(94, foxandgo2.maxKill(board));
  }

  @Test
  public void case149() {
    String[] board = { "o.oo....oo.", "....oo.o.o.", "..ooo.....o", "....o.oo.o.", ".o.oooo..oo", "..o....o..o", ".........o.", ".oooooo.o.o", "o.oo.o.o.o.", ".o....o.o..", "ooo.oooo..." };
    assertEquals(52, foxandgo2.maxKill(board));
  }

  @Test
  public void case150() {
    String[] board = { "o.oo....o..", "..oo..oo.o.", ".o.......o.", ".oo....o...", "..o.o..oo..", ".o...oo....", ".oo.o.oo...", "o.oo.o.o..o", ".o..o.o.ooo", "o.o..ooo.oo", ".o.o.oo.o.o" };
    assertEquals(37, foxandgo2.maxKill(board));
  }

  @Test
  public void case151() {
    String[] board = { "ooooooooooo", "o.........o", "o...ooo...o", "o...o.o...o", "o...ooo...o", "o....o....o", "o....oooooo", "o..........", "o.......ooo", "o.......o.o", "ooooooooooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case152() {
    String[] board = { "oo.o.o.o", "..o.o.o.", "oooo.o.o", "...o.o.o", "..o.oo..", "ooooo.oo", "oo.o..o.", "oooo...o" };
    assertEquals(36, foxandgo2.maxKill(board));
  }

  @Test
  public void case153() {
    String[] board = { ".o.ooooo.", "o.oooo..o", "..o...o..", ".ooo.oooo", "o.o.o....", ".o.o.oo..", "o.o.o.ooo", ".o.o.o.oo", "o...o.oo." };
    assertEquals(43, foxandgo2.maxKill(board));
  }

  @Test
  public void case154() {
    String[] board = { "oo.o.ooo.o..o..", "...ooo.o..oo.oo", "o..o.o.ooo.o..o", "oo.......oo.ooo", "..oo.o.o.o.ooo.", "..oo..oo..o.ooo", "oo.o.oo..o.oooo", ".oo.o..ooo.o.oo", "o..o.o.o.o.oo..", ".oo.oo...o....o", "o.o.oo....oo..o", ".o.o..o.oo..ooo", "o.o.o..o..o....", "ooo.oooooooo..o", "o..oo.o..o.ooo." };
    assertEquals(60, foxandgo2.maxKill(board));
  }

  @Test
  public void case155() {
    String[] board = { "ooooooooooo", "o.........o", "o...ooo...o", "o...o.o...o", "o...ooo...o", "o....o....o", "o....oooooo", "o..........", "o.......ooo", "o.......o.o", "ooooooooooo" };
    assertEquals(0, foxandgo2.maxKill(board));
  }

  @Test
  public void case156() {
    String[] board = { "...ooo.....", "...o.o.....", ".ooo.ooo...", ".o.....o...", ".ooo.ooo...", "...o.o.....", "...ooo.....", "....o......", "....o...ooo", "....ooooo.o", "........ooo" };
    assertEquals(38, foxandgo2.maxKill(board));
  }

  @Test
  public void case157() {
    String[] board = { "oo.o.ooo.o..o..", "...ooo.o..oo.oo", "o..o.o.ooo.o..o", "oo.......oo.ooo", "..oo.o.o.o.ooo.", "..oo..oo..o.ooo", "oo.o.oo..o.oooo", ".oo.o..ooo.o.oo", "o..o.o.o.o.oo..", ".oo.oo...o....o", "o.o.oo....oo..o", ".o.o..o.oo..ooo", "o.o.o..o..o....", "ooo.oooooooo..o", "o..oo.o..o.ooo." };
    assertEquals(60, foxandgo2.maxKill(board));
  }

}
