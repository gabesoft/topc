package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FoxAndGomokuTest {
  FoxAndGomoku foxandgomoku = new FoxAndGomoku();

  @Test
  public void case1() {
    String[] board = { "....o.", "...o..", "..o...", ".o....", "o.....", "......" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case2() {
    String[] board = { "oooo.", ".oooo", "oooo.", ".oooo", "....." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case3() {
    String[] board = { "oooo.", ".oooo", "oooo.", ".oooo", "....o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case4() {
    String[] board = { "..........", "..........", "..oooooo..", "..o.......", "..o.......", "..oooooo..", ".......o..", ".......o..", "..oooooo..", ".........." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case5() {
    String[] board = { "..........", "..........", "..oooo.o..", "..o.......", "..o.......", "..o.oooo..", ".......o..", ".......o..", "..oooo.o..", ".........." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case6() {
    String[] board = { "ooooo", "ooooo", "ooooo", "ooooo", "ooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case7() {
    String[] board = { ".....", ".....", ".....", ".....", "....." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case8() {
    String[] board = { "o.....", ".o....", "..o...", "...o..", "....o.", "......" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case9() {
    String[] board = { "...o..oooo", "....oo..oo", "oo.o.o....", "o......o..", "....ooo..o", ".ooo.oo...", ".o.o...o..", ".o...o.ooo", ".o.oo...o.", "o.......o." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case10() {
    String[] board = { "ooo..oooo", "o.ooo.ooo", ".oo..oo.o", ".oooooo.o", "oooo.oooo", "oo.o.oooo", "o.o.oooo.", ".oo.oo..o", "oooooo.oo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case11() {
    String[] board = { "...........", "...........", "......o..o.", "..........o", "o.o........", "...........", ".......o...", "...........", "...........", "...........", "..........." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case12() {
    String[] board = { "oooo.oo", "o.oo.o.", "ooooo..", "..ooooo", ".ooo.oo", "o..o.oo", "oo.oooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case13() {
    String[] board = { ".............", "........o....", "....oo..o.oo.", "...o..o...o..", "oo.....o.....", ".....o.oo....", "..o.o......o.", "o............", ".oo.oo.o....o", "....o...oo...", "o......o.....", ".o.o.o.o.....", "o...o.o......" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case14() {
    String[] board = { "oooo..oooo", "ooo..oo.oo", "oo.ooooooo", "o...o.oooo", "o.oo.oo.oo", "ooooooo.oo", "oooo..o.oo", "o.oo.ooooo", "o..ooo.oo.", "oooo.oooo." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case15() {
    String[] board = { "oo.oo", "...o.", "oo.o.", ".o..o", ".oo.o" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case16() {
    String[] board = { "o.o...ooo.o..", "o.ooo....o..o", "oo...ooooo...", "..oooo......o", "o.o.oo.o...o.", "..o..oo....oo", "o.o..o..o.ooo", "ooooo..o.o.o.", "..o.o........", "...o..o.o.o..", ".....oo..o.o.", ".oo.o.oo...oo", ".o.o..o.oooo." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case17() {
    String[] board = { "oooooo..o.o", "oo.oooo.oo.", "o.o..o.o.oo", "ooooooooo.o", "ooooooooo.o", "ooooooo.ooo", "o.oo.oo.ooo", "oo.ooo..ooo", ".oo.oo.o.oo", "o.o.o.oooo.", "oooooo.oo.o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case18() {
    String[] board = { ".ooooooo..oo.", "..o.oo.oo...o", ".o.o..oo.o...", "oo.ooooo..o.o", "oo..o.ooo....", ".oo.oooo.....", ".o..oo.o...oo", "o..o..o.o...o", "o.o..o.ooo.o.", "oo..o.o.o....", "..oo.........", "...oooo.o...o", ".o..ooo.oo..o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case19() {
    String[] board = { ".............", ".............", ".............", ".............", ".............", ".............", ".............", ".............", ".............", "............o", "..........o..", ".............", "...o........." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case20() {
    String[] board = { "........o.o...", "o......ooo...o", "o.oo...o....o.", "o..oo.oo...o.o", "o...o..oo.o..o", "oo.oooo...oo..", "..ooo....oo..o", "oooo.ooooooo.o", "o.o.....oo...o", "..oo..oo..oo..", ".o.o.o.o.o.ooo", "..oo...o.....o", "oo..o..o.oo...", "oo.oooo.ooo.o." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case21() {
    String[] board = { "o....o.o.oooo.", "ooo.ooo.oo.oo.", "o.o.o.oo...o.o", "o.o.oo...oo..o", "o....o.oo..o..", ".oo.oooo...ooo", "oo...o.o.o..o.", "..o..o..o....o", ".o.o.o..o....o", "o...ooooooooo.", ".o.oo..oo...o.", "oo.ooooooo.o..", "oo..o.o...o.oo", ".......o..o..o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case22() {
    String[] board = { ".o.oo..oooo.ooo", "ooooooo.ooo.ooo", "oo.oo.ooo.oooo.", "oo.ooo.oo.ooo..", "..oooo.oo.oooo.", ".ooo.o.o....ooo", ".o...o.ooo.oooo", "oo.ooo.o.oooo.o", ".o.oooooo.o..oo", "o.o.o.ooo.ooooo", "oooooooooooo.o.", "oooo..o.ooooooo", "..ooooooo.ooo..", "ooo.oooooooo..o", "ooo.o..oooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case23() {
    String[] board = { "ooooooooooooo", "ooooooooooooo", "oooooooo.oooo", "ooooooooooooo", ".oooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo", "ooooooooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case24() {
    String[] board = { "o..ooo.o..o", ".o..o..oo.o", "...o.ooooo.", "...o..oo..o", "oo..oooooo.", "...oo..o.o.", ".ooooo..o.o", "o.oo.oo.o..", "o.o..oooooo", ".ooooo.o..o", "oo.o.o..o.o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case25() {
    String[] board = { "..o.oo.oo.oo", "o.ooo...oooo", "ooo.ooo.oo.o", "ooo...oo.oo.", ".o.oooo.oo..", "o...oo.o.oo.", "oooooo.....o", "...o.o..ooo.", "oo...ooo.o..", ".ooo.oooo...", ".o..o....o..", "..ooooo.o.o." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case26() {
    String[] board = { "oooooo", "oooooo", "oooooo", "oooooo", "oooooo", "oooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case27() {
    String[] board = { "oo.ooooo", "ooooo.oo", "oooooo.o", "oooo.ooo", "ooo.oooo", "oooooooo", ".o.oooo.", "ooooo.oo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case28() {
    String[] board = { "...oo.o.....o", ".....o.o..o..", "..o......o...", "..o.........o", "..o...o.o..o.", "oo.o....o....", "...o.........", ".......o.....", "ooo........oo", "...o.......o.", "..o.....o....", ".........o...", "o....o.....o." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case29() {
    String[] board = { ".o.......", "o..o..o.o", ".......o.", "..o....o.", "...o.....", "o....oo..", "...o.....", "......o..", "........." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case30() {
    String[] board = { ".....o....", "..........", "..........", "...o...o..", "..........", ".......o..", "...o......", "....o....o", "..........", "..o.o....." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case31() {
    String[] board = { "............", ".........o..", ".......o....", "....oo......", "...o...o.oo.", "...o...o....", "........o...", "...oo..o....", ".o..........", "o...o..oo...", "..........o.", "..o.....oo.." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case32() {
    String[] board = { "ooooooo", "ooo.ooo", "oooooo.", "ooooooo", "..ooo.o", "oo.oo.o", "oooo..o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case33() {
    String[] board = { "......", "......", "......", "......", "....o.", ".o...." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case34() {
    String[] board = { "..o.oo..ooo", "o..o.oo.oo.", "ooo.o......", "oo..oo.....", "o.o..oooo.o", "o..o....o.o", "ooo.o..oooo", "oo.ooo.o.oo", ".o...ooo...", "o.oooo.o..o", "ooo..oo.o.o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case35() {
    String[] board = { "ooo..ooooooooo", "oo..oooooooooo", "oooooooooooo.o", "ooooo..ooo.ooo", "ooo.oo.o.oo..o", "ooooooooooo.o.", "ooooooo.o..ooo", "ooooo.oooooooo", "ooo.oooo.ooooo", "ooo.ooooo..ooo", "oooooooo.oooo.", "oooooooooooooo", "ooooooooo.oooo", "oo.oooooooooo." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case36() {
    String[] board = { "oooooo.ooo", "o.oo.ooooo", "oooooooooo", "o.oooooooo", "ooo.oooooo", "ooo.oooooo", "oooooooooo", "oooooooo.o", "ooo.oooooo", "o.oooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case37() {
    String[] board = { "......o....o...", ".......o.......", ".............o.", "..o............", ".o..oo........o", "...o...........", "o.........o....", "...............", "...........o...", "........o......", "...............", "....oo...o.....", "..........o...o", "...........o...", ".......o......o" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case38() {
    String[] board = { "..o...o..", "o.ooo....", "...o.o...", "ooo...oo.", ".oooo...o", "o.oo..o.o", "...oo.o..", "..o.o....", "o..o....." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case39() {
    String[] board = { ".........", ".........", ".........", ".........", ".........", ".........", ".........", ".........", "........." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case40() {
    String[] board = { "..oo.oo...", "........o.", "o..o.o.ooo", "...oo...o.", "o.ooo...o.", ".o.o..oo..", "...oo.oo..", "...o.oooo.", ".o..oo..oo", ".o.o.oo..o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case41() {
    String[] board = { "o.o.oo.oo..o.oo", ".oo.ooooooooo..", "..oooooooooooo.", ".oo.o...oo..oo.", "ooooooooo......", "...ooo.o.oooo.o", "oo.ooo.oo.....o", "oo.ooooooo.oooo", "o..oooo..o.oooo", "ooo..oo.o..ooo.", "oo.oooooooooo.o", "o.o.o.oooo.o.oo", "oo.oo.oo.oooooo", ".ooooo.o.o.oo..", ".oo...ooooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case42() {
    String[] board = { "oooooo.ooo", "oooooooooo", "ooooooo.oo", "oooooooo.o", "oooooooooo", "oooooo.ooo", ".ooo.ooo.o", "o.ooooo.o.", "ooooooooo.", "oooooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case43() {
    String[] board = { "..............", "..............", "..............", "..............", "..............", "..............", "..............", "..............", "..............", "....o.........", "..............", "..............", "..............", "...........o.." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case44() {
    String[] board = { ".ooo.o...o.o", "o..oo....oo.", "o...oo.oo..o", "o...oo.o.ooo", "ooooo.....o.", "oo...ooo...o", "ooo.o.o..ooo", "oo...oo.....", "....o..o....", "o.o..oo....o", "o....oo.oo.o", "o..o..oooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case45() {
    String[] board = { "ooooooooooo", "o.ooooooooo", "ooooooo.ooo", "o.ooooooooo", "ooooooooooo", "ooooooooooo", "ooo.o.o.ooo", "ooooooooooo", "ooooooooooo", "ooooooooooo", "ooooooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case46() {
    String[] board = { "oo.o.oo.", "o..o.ooo", "o..o..o.", "..ooo.o.", "oo..oooo", "oooo.oo.", "..o.o..o", "o..ooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case47() {
    String[] board = { "o...oo.o..ooo.", "o.oo.o.oo.o..o", ".o.oo.ooooo..o", "o.o....oooo.oo", "ooo.o..o.oooo.", "o...ooo.ooo.o.", "..o.oooooo.oo.", "...o..oooo..o.", "o.o..oo.oooo.o", ".o....ooo.oo..", "..oo.o.oo..oo.", "o.oo.oo..oooo.", ".ooo..ooo.o.oo", "oo.o.o.oo.oo.." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case48() {
    String[] board = { "oo..o.oo.", "oo..oo..o", "oo.oooooo", ".oo.ooooo", "oo.o.oooo", "..ooo..oo", ".o..o.ooo", "o.ooo..oo", "oooooo.oo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case49() {
    String[] board = { "......o.", "......o.", "........", "........", "........", "...o....", "........", "........" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case50() {
    String[] board = { "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", ".........." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case51() {
    String[] board = { "..o.oo", ".o.ooo", ".oo..o", "o..ooo", "o..o.o", "oo...o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case52() {
    String[] board = { "oo.o.o.......", "..o.o.oo....o", ".oo.....o...o", "o....oo....o.", ".......o.....", ".o.o....o.o..", ".....o....o..", ".............", ".o........ooo", "o......o..o..", "o..........o.", "o..o...o....o", ".o.oo.o.o...o" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case53() {
    String[] board = { "ooooo.ooooooooo", "ooooo.ooo.oo.oo", "o.o.ooooooooooo", "oo.oooooo.ooooo", "..oooooo.o.ooo.", ".oooo.ooooo.oo.", "o.oo.oooooooooo", "o.ooooo.ooo.ooo", "ooooo.ooo.ooooo", "o.o.oooo.o.oooo", "ooo.oooooo.oooo", ".oo.oooo.o.oooo", "..oo.o.oooooo.o", "oo.ooooooo.o.oo", "oooooooooo.o.oo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case54() {
    String[] board = { "o.ooooo", "ooo.ooo", "ooo.ooo", "oooooo.", "ooooooo", "o.ooooo", "ooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case55() {
    String[] board = { "..o.ooo.o.", "o.......o.", "..o.oo...o", ".o......o.", "ooo.oo.o..", "o...oo..oo", "o...o..o.o", "..o.o..oo.", "...ooo...o", "..o..oo.o." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case56() {
    String[] board = { "ooooooooooo..", ".ooo.oooooooo", "ooooooooooooo", "ooooo.ooooooo", "oooooo..ooooo", "ooooooooooooo", "oooooo.oooooo", "ooooooo.ooooo", "ooooooooooooo", "ooooooo.ooooo", "ooooooo.ooooo", "oo.oooooooo.o", "oooooooo.ooo." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case57() {
    String[] board = { ".oooo.oo.ooooo", "o.ooo..oooooo.", "oooo.ooooooo.o", "ooo.oooooo.ooo", "oooooooooooooo", "..ooo.oo.ooooo", "ooo.ooo.ooo.oo", "oo.ooooooooooo", ".ooooooooo.o.o", "oooo.ooo.o.oo.", "ooooooooooo..o", "oooooooooooooo", "o.o..ooooooooo", "o.oo.ooooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case58() {
    String[] board = { "o....", "o.o..", "o.o.o", "o.o..", "o...." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case59() {
    String[] board = { "....o.", "...o..", "..o...", ".o....", "o.....", "......" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case60() {
    String[] board = { "oooo.", ".oooo", "oooo.", ".oooo", "....." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case61() {
    String[] board = { "oooo.", ".oooo", "oooo.", ".oooo", "....o" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case62() {
    String[] board = { "o.....", ".o....", "..o...", "...o..", "....o.", "......" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case63() {
    String[] board = { "....o", "...o.", "..o..", ".o...", "o...." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case64() {
    String[] board = { "..........", "..........", "..oo.ooo..", "..o.......", "..o.......", "..oo.ooo..", ".......o..", ".......o..", "..oo.ooo..", ".........." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case65() {
    String[] board = { "o....", ".o...", "..o..", "...o.", "....." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case66() {
    String[] board = { "oo.ooo", "......", "......", "......", "......", "......" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case67() {
    String[] board = { "oooo.oooo", ".........", ".........", ".........", ".........", ".........", ".........", ".........", "........." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case68() {
    String[] board = { "o..oooooo", ".........", ".........", ".........", ".........", ".........", ".........", ".........", "........." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case69() {
    String[] board = { "ooo.oo", "......", "..o...", ".o....", "o.....", "......" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case70() {
    String[] board = { "oooooooo", "oooooooo", "oooooooo", "oooooooo", "oooooooo", "oooooooo", "oooooooo", "oooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case71() {
    String[] board = { "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "oooooooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case72() {
    String[] board = { "oo....", ".oo...", "..oo..", "...oo.", ".....o", "......" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case73() {
    String[] board = { "..........", "..........", "..oooooo..", "..o.......", "..o.......", "..oooooo..", ".......o..", ".......o..", "..oooooo..", ".........." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case74() {
    String[] board = { ".....", ".....", ".....", ".....", "ooooo" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case75() {
    String[] board = { ".....", ".....", ".....", ".....", "o...." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case76() {
    String[] board = { ".....", ".o...", "..o..", "...o.", "....o" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case77() {
    String[] board = { "o.....", ".o....", "..o...", "...o..", "......", "oo.ooo" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case78() {
    String[] board = { ".ooooo", "..oooo", ".oooo.", "..oooo", "......", "......" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case79() {
    String[] board = { "......", ".....o", "....o.", "...o..", "..o...", ".o...." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case80() {
    String[] board = { ".ooooo", "......", "......", "......", "......", "......" };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case81() {
    String[] board = { "o....", "o.o..", "o.o.o", "o.o..", "o...." };
    assertEquals("found", foxandgomoku.win(board));
  }

  @Test
  public void case82() {
    String[] board = { "o....o", "....o.", "...o..", "..o...", "......", "......" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case83() {
    String[] board = { "..........", "..........", "..ooo.oo..", "..o.......", "..o.......", "..oo.ooo..", ".......o..", ".......o..", "..oo.ooo..", ".........." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case84() {
    String[] board = { ".....", ".....", ".....", ".....", "....o" };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case85() {
    String[] board = { ".....", ".....", ".....", ".....", "....." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case86() {
    String[] board = { ".....", "o....", "o....", "o....", "o...." };
    assertEquals("not found", foxandgomoku.win(board));
  }

  @Test
  public void case87() {
    String[] board = {
      ".ooo.",
      ".oooo",
      "oooo.",
      ".oooo",
      "....o" };
    assertEquals("not found", foxandgomoku.win(board));
  }

}
