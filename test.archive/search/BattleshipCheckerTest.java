package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class BattleshipCheckerTest {
  BattleshipChecker battleshipchecker = new BattleshipChecker();

  @Test
  public void case1() {
    String[] board = { "......X...", ".XXX..X...", "......X...", "X.X...X...", "X.........", "...XX.X...", "......X...", ".XX...X...", "..........", ".X.X..X..." };
    assertEquals("ACCEPTED, 5 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case2() {
    String[] board = { "X.X.X.X...", "......X...", ".XX...X...", "......X...", "......X..X", "...X..X...", "...X..X...", "......X...", "..XX..X...", "......X..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case3() {
    String[] board = { ".....XX...", ".XX.......", "..........", ".X....XXX.", ".X........", ".....X....", "..X..X....", ".....X....", "...X......", "X.....XXXX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case4() {
    String[] board = { ".....XX..X", ".XX......X", "..........", ".X....XXX.", ".X........", ".....X..X.", "..X..X....", ".....X....", "...X......", "X.....XXXX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case5() {
    String[] board = { ".....XX..X", ".XX......X", "..........", "......XXX.", "..........", ".....X..X.", "..X..X....", ".....X....", "...X......", "X.....XXXX" };
    assertEquals("ACCEPTED, 3 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case6() {
    String[] board = { "X.......X.", "...XXXX...", ".X......X.", "....XX....", ".........X", ".........X", ".....XXX..", ".........X", "..X......X", "..X......X" };
    assertEquals("ACCEPTED, 0 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case7() {
    String[] board = { "X.......X.", "...XXXX...", ".X......X.", "....XX....", "...X.....X", "...X.....X", ".....XXX..", ".........X", ".........X", ".........X" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case8() {
    String[] board = { "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case9() {
    String[] board = { "X........X", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "X........X" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case10() {
    String[] board = { "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case11() {
    String[] board = { ".XXXXXXXX.", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXX.XXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", "XXXXXXXXXX", ".XXXXXXXX." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case12() {
    String[] board = { "....XXX..X", "XXXXX.XXXX", "XXXXXXXXXX", "XX.XX.XXXX", "XX.XXXX...", "XX.XX.XXXX", "XXXXXXXXXX", "XXXXX.XXXX", "XXXXXXXXXX", "X..XXX..XX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case13() {
    String[] board = { "XXXX...XXX", "..........", "....XXX...", ".XX.......", ".....X....", ".......XX.", "..X.......", "....XX....", ".......X..", ".....X...." };
    assertEquals("ACCEPTED, 1 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case14() {
    String[] board = { "XXXX...XXX", "..........", "....XXX...", ".XX.......", ".....X....", ".......XX.", "...X......", "....XX....", ".......X..", ".....X...." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case15() {
    String[] board = { "XXXX...XXX", "..........", "....XXX...", ".XX.......", ".....X....", ".......XX.", "..........", "...XXX....", ".......X..", ".....X...." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case16() {
    String[] board = { "XXXX...XXX", "..........", "....XXX...", ".XX.......", ".....X....", ".XX....XX.", "..........", "...XXX....", ".X.....X..", ".....X...." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case17() {
    String[] board = { "XXXX......", "..........", ".......X..", ".XX.......", ".....X....", ".XX....XX.", "..........", "...XXX....", ".......X..", ".....X...." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case18() {
    String[] board = { "...X.X.X.X", "...X.X....", "...X...X.X", "...X.X....", ".....X....", "...X......", "...X.X....", "...X.X....", "..........", "...XXX...." };
    assertEquals("ACCEPTED, 6 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case19() {
    String[] board = { "..XXXX....", "..........", "......X..X", "......X...", "..XX......", "......XXX.", "...XX.....", ".........X", ".X...X...X", "....X....X" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case20() {
    String[] board = { "..XXXX....", "..........", "......X..X", "......X.X.", "..XX......", "......XXX.", "...XX.....", ".........X", ".X...X...X", ".........X" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case21() {
    String[] board = { "..XXXX....", "..........", "......X..X", "......X...", "..XX......", "......XXX.", "...XX.....", ".........X", ".X...X...X", "..X......X" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case22() {
    String[] board = { "..........", "..X...X...", "..........", ".X.XXXX.X.", "........X.", ".X.XXX....", "........X.", ".XXX.XX.X.", "..........", ".........." };
    assertEquals("ACCEPTED, 7 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case23() {
    String[] board = { "XXXX..X..X", "..........", "X........X", ".........X", "X........X", "X.........", "..........", "X........X", ".........X", "XXX..XX..." };
    assertEquals("ACCEPTED, 5 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case24() {
    String[] board = { "XXXX..X..X", "..........", "X........X", ".........X", "X........X", "X.........", ".X........", "X........X", ".........X", "XXX..XX..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case25() {
    String[] board = { "XXXX..X...", ".....X....", "X........X", ".........X", "X........X", "X.........", "..........", "X........X", ".........X", "XXX..XX..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case26() {
    String[] board = { "XXXX..X..X", "..........", ".........X", ".........X", "X........X", "X.........", "........X.", "X........X", ".........X", "XXX..XX..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case27() {
    String[] board = { "X....XX...", "...X......", "........X.", ".X..X.....", ".X..X...XX", ".X..X.....", "....X...XX", "..........", ".X......XX", "...XXX...." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case28() {
    String[] board = { "X.....X...", "...X......", "........X.", ".X..X.....", ".X..X...XX", ".X..X.....", "....X...XX", "..........", ".X......XX", "...XXX...." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case29() {
    String[] board = { "X.........", "...X......", "........X.", ".X..X.....", ".X..X..X..", ".X..X..X..", "....X...XX", "..........", ".X......XX", "...XXX...." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case30() {
    String[] board = { "X.........", "...X......", "........XX", ".X..X.....", ".X..X..X..", ".X..X..X..", ".........X", "..........", ".X......XX", "..XXXX...." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case31() {
    String[] board = { "X.........", "...X......", "........XX", ".X..X.....", ".X..X..X..", ".X..X..X..", ".........X", "..........", "X.......XX", "..XXXX...." };
    assertEquals("ACCEPTED, 2 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case32() {
    String[] board = { "X.........", ".X........", "........XX", ".X..X.....", ".X..X..X..", ".X..X..X..", ".........X", "..........", "X.......XX", "..XXXX...." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case33() {
    String[] board = { "X.........", "..........", "........XX", ".X..X.....", ".X..X..X..", ".X..X..X..", ".........X", "X.........", "X.......X.", "..XXXX...X" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case34() {
    String[] board = { ".........X", ".X......X.", ".X....X...", "......X...", ".XXX..X...", "......X...", ".X......X.", "....XX..X.", "..X.......", ".......XXX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case35() {
    String[] board = { "....X....X", ".X......X.", ".X....X...", "......X...", ".XXX..X...", "......X...", ".X......X.", "....XX....", "..X.......", ".......XXX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case36() {
    String[] board = { "....X....X", ".X........", ".X....X...", "......X...", ".XXX..X...", "......X...", "........X.", "....XX..X.", "..........", "X......XXX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case37() {
    String[] board = { "....X....X", ".X........", ".X....X...", "......X...", ".XXX..X...", "......X...", "........X.", ".X..XX..X.", "..........", "X......XXX" };
    assertEquals("ACCEPTED, 1 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case38() {
    String[] board = { "...X......", "X..X......", "...X......", "X..X......", ".....XXX..", "X.........", "....X.....", "X...X.....", "..........", ".XXX.XX.XX" };
    assertEquals("ACCEPTED, 1 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case39() {
    String[] board = { "...X......", "X..X......", "...X......", "X..X......", "...XXX....", "X.........", "....X.....", "X...X.....", "..........", ".XXX.XX.XX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case40() {
    String[] board = { "...X......", "X..X......", "...X......", "X..X......", "....XXX...", "X.........", "....X.....", "X...X.....", "..........", ".XXX.XX.XX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case41() {
    String[] board = { "...X......", "X..X......", "...X......", "X..XXX....", "..........", "X.........", "....X.....", "X...X.....", "..........", ".XXX.XX.XX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case42() {
    String[] board = { "XXXXXXXXXX", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "XXXXXXXXXX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case43() {
    String[] board = { "XXXXXXXXXX", "X........X", "X........X", "X........X", "X........X", "X........X", "X........X", "X........X", "X........X", "XXXXXXXXXX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case44() {
    String[] board = { "..........", "..........", "...XXXXXX.", "...X....X.", "...X....X.", "...X....X.", "...X....X.", "...XXXXXX.", "..........", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case45() {
    String[] board = { "XXXX.X....", "..........", "XXX.XX....", "..........", "XXX.XX....", "..........", "X.XX.X....", "..........", "..........", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case46() {
    String[] board = { "XXXX.X.X..", "..........", "XXX..XX...", "..........", "XXX..XX...", "..........", "XX.X.X....", "..........", "..........", ".........." };
    assertEquals("ACCEPTED, 9 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case47() {
    String[] board = { "X..XX...X.", "........X.", "..XX....X.", "..........", "...XXXX...", "........X.", ".X........", "......X..X", "XXX...X...", ".........." };
    assertEquals("ACCEPTED, 3 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case48() {
    String[] board = { "X.......X.", "........X.", "..XX....X.", "..........", "...XXXX...", "........X.", ".X........", "......X..X", "XXX...X...", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case49() {
    String[] board = { "X..XX...X.", "........X.", "..XX....X.", "..........", "...XXXX...", "........X.", ".X........", "......X..X", "XXX...X...", "........XX" };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case50() {
    String[] board = { "...XX...X.", "........X.", "..XX....X.", "..........", "...XXXX...", "........X.", ".X........", "......X..X", "XXX...X...", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case51() {
    String[] board = { "X..XX...X.", "........X.", "..XX....X.", "..........", "...XXXX...", "........X.", ".X........", "......X..X", "XXX...X...", "....X....." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case52() {
    String[] board = { "X..XX...X.", "........X.", "..XX....X.", "..........", "...XXXX...", "........X.", ".X........", "......X..X", "......X...", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case53() {
    String[] board = { "X..XX...X.", "........X.", "X.XX....X.", "X.........", "X..XXXX...", "........X.", ".X........", "......X..X", "XXX...X...", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case54() {
    String[] board = { "X..XX...X.", "........X.", "..XX....X.", "..........", "..........", "........X.", ".X........", "......X..X", "XXX...X...", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case55() {
    String[] board = { "X..XX...X.", "........X.", "X.XX....X.", "X.........", "X..XXXX...", "X.......X.", "..X.......", "......X..X", "XXX...X...", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case56() {
    String[] board = { "X..XX...X.", "........X.", "..XX....X.", "..........", "..XX.XX...", "........X.", ".X........", "......X..X", "XXX...X...", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case57() {
    String[] board = { "X........X", "...XXX....", "X........X", ".........X", "X..XXXX...", "..........", "..XXX.....", "........X.", "........X.", ".....XX..." };
    assertEquals("ACCEPTED, 3 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case58() {
    String[] board = { "X........X", "...XXX....", "X........X", ".........X", "X..XXXX...", "..........", "..XX.X....", "........X.", "........X.", ".....XX..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case59() {
    String[] board = { "X........X", "...XXX....", "X........X", ".........X", "X..XXXX...", "..........", "..XXX...X.", "..........", "........X.", ".....XX..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case60() {
    String[] board = { "X........X", "...XXX....", "X........X", ".........X", "X..XXXX...", "..........", "..XXX.....", ".......X..", "........X.", ".....XX..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case61() {
    String[] board = { "...XXXX...", "........X.", "..X.XX....", "..X....X..", "....XX....", "..X.......", "....XXX...", "..........", "...XXX.X..", ".........." };
    assertEquals("ACCEPTED, 5 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case62() {
    String[] board = { "...XXXX...", "........X.", "..X.XX....", "..X.......", "....XX....", "..X.......", "....XXX...", "..........", "...XXX.X..", "........X." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case63() {
    String[] board = { "...XXXX...", ".......X..", "..X.XX....", "..X....X..", "....XX....", "..X.......", "....XXX...", "..........", "...XXX.X..", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case64() {
    String[] board = { "...XXX....", ".X......X.", ".X..X.....", ".X..X...XX", "....X.....", "....X.....", "..........", "..XX..XX..", ".........X", "....X.X..." };
    assertEquals("ACCEPTED, 2 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case65() {
    String[] board = { "...XXX....", ".X......X.", ".X..X.....", ".X..X...XX", "....X.....", "X...X.....", "X.........", "X.XX..XX..", "X........X", "X...X.X..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case66() {
    String[] board = { "...XXX....", ".X......X.", ".X..X.....", ".X..X...XX", "....X.....", "....X.....", "....X.....", ".XX...XX..", "..........", "....X.X..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case67() {
    String[] board = { "...XXX....", ".X......X.", ".X..X.....", ".X..X...XX", "....X.....", "....X.....", "....X.....", ".XX...XX..", "..........", ".X..X.X..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case68() {
    String[] board = { "...XXX....", ".X......X.", ".X........", ".X..X...XX", "....X.....", "....X.....", "....X.....", ".XX...XX..", "..........", "X...X.X..." };
    assertEquals("ACCEPTED, 1 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case69() {
    String[] board = { "X..X..X..X", "..........", "XX..XX..XX", "..........", "XX..XX....", "X...X.....", "..........", "XX........", "XX........", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case70() {
    String[] board = { "......X..X", ".XXX..X..X", "......X..X", "X.X...X..X", "X........X", "...XX.X...", "......X...", ".XX...X...", "..........", ".X.X..X..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case71() {
    String[] board = { "X..XXXX.X.", "..........", ".X......X.", "....XX....", ".........X", ".........X", ".....XXX..", ".........X", "..X......X", "..X......X" };
    assertEquals("ACCEPTED, 1 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case72() {
    String[] board = { "X.X.X.X.XX", "..........", "XX.XX..XXX", "..........", "XXXX...XXX", "..........", ".....XXXXX", "..........", "..........", ".........." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case73() {
    String[] board = { "XXXX......", "..........", "X.X.X.X.XX", "..........", "XX.XXX.XXX", "..........", "........XX", "..........", "..........", ".........." };
    assertEquals("ACCEPTED, 6 POINTS", battleshipchecker.checkBoard(board));
  }

  @Test
  public void case74() {
    String[] board = { "..........", ".XXX..X...", "......X...", "X.X...X...", "X.........", "..XXX.X...", "......X...", ".XX...X...", "..........", ".X.X..X..." };
    assertEquals("REJECTED", battleshipchecker.checkBoard(board));
  }

}
