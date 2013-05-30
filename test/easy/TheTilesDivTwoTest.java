package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TheTilesDivTwoTest {
  TheTilesDivTwo thetilesdivtwo = new TheTilesDivTwo();

  @Test
  public void case1() {
    String[] board = { "X.X", "...", "X.X" };
    assertEquals(1, thetilesdivtwo.find(board));
  }

  @Test
  public void case2a() {
    String[] board = { "...", "...", "...", "..."  };
    assertEquals(2, thetilesdivtwo.find(board));
  }

  @Test
  public void case2() {
    String[] board = { "...", "...", "..." };
    assertEquals(2, thetilesdivtwo.find(board));
  }

  @Test
  public void case3() {
    String[] board = { "......X.X.XXX.X.XX." };
    assertEquals(0, thetilesdivtwo.find(board));
  }

  @Test
  public void case4() {
    String[] board = { 
        "X.....XXX.XX..XXXXXXXXX...X.XX.XX....X", 
        ".XXXX..X..XXXXXXXX....XX.X.X.X.....XXX", 
        "....XX....X.XX..X.X...XX.X..XXXXXXX..X", 
        "XX.XXXXX.X.X..X..XX.XXX..XX...XXX.X..." };
    assertEquals(13, thetilesdivtwo.find(board));
  }

  @Test
  public void case5() {
    String[] board = { "XX..XXXXXXXXX.XXX.XXX...", "...X.XXXXXX.X..X...XX.XX", "X.X.X.X..X.X.XX.X.X...X.", "..X.XXXX..XXX...XX....X." };
    assertEquals(8, thetilesdivtwo.find(board));
  }

  @Test
  public void case6() {
    String[] board = { "...", "XX.", "..X" };
    assertEquals(1, thetilesdivtwo.find(board));
  }

  @Test
  public void case7() {
    String[] board = { ".", "X" };
    assertEquals(0, thetilesdivtwo.find(board));
  }

  @Test
  public void case8() {
    String[] board = { "..X.XX.X.XX..XXXXXXXX.XX.XX...X..X.XX.XX.X.X.X.", "....X.XX...XXXXX.X.XX.X.X.XXXXXX..XX......XX.X.", ".......X.XX.X...XX.X.XX..XX..X...X.......XXXXX.", ".....X.XXXXX.X.XXXXXXXX...XX....XX....XX.XX.XXX" };
    assertEquals(14, thetilesdivtwo.find(board));
  }

  @Test
  public void case9() {
    String[] board = { ".X.XX..XXX.X.", "X.XXX.X..XXXX" };
    assertEquals(0, thetilesdivtwo.find(board));
  }

  @Test
  public void case10() {
    String[] board = { "..XX.XXXXX..X...XX.X.XX..XX.X.X....", ".XX..X..XX.XX.XX.XXX.XX.X..XXXX.X.X", "XX.XX...XXXX...X..X....XXXXX..XXX.X", "..XXX..X........X.........XXXX.X.XX" };
    assertEquals(8, thetilesdivtwo.find(board));
  }

  @Test
  public void case11() {
    String[] board = { ".X...X.X.X.X...X...X.......X.X.X.X.....X...", "X...X.........X.X.X...............X.X...X..", "...X.......X...X.....X...X...X.X.....X...X.", "X.X.X.X...X...X.....X.X...............X...X" };
    assertEquals(18, thetilesdivtwo.find(board));
  }

  @Test
  public void case12() {
    String[] board = { ".X.X.X.......X.X.X...X.......X.X..........", "X.......X.X.X...X...X...X.......X.X.X.....", ".X.X.X.X.X.X.X.X.X.....X.....X.....X.X...X", "X...X.X...X.X.X.X.X.X.X...X.X.X...X.X.X.X." };
    assertEquals(10, thetilesdivtwo.find(board));
  }

  @Test
  public void case13() {
    String[] board = { "...X.....X...X.X.X.....X...X...X.X...X.X.X.X..", "X...X.X.X.X.X.X.....X.X...X.......X.X.X...X...", "...X...X...................X.X.X.X.X...X......", "......X.X.X...X.....X.X.............X.X.X.X..." };
    assertEquals(15, thetilesdivtwo.find(board));
  }

  @Test
  public void case14() {
    String[] board = { ".............X.............X.X.....X.....X...", "X.X.....X.X.....X.......X.X...X.X.X.X.X.X.X..", ".X...X.X.................X.X...........X.X...", "X.X.X.X.....X.X.....X.....X.....X.X.X.....X.." };
    assertEquals(18, thetilesdivtwo.find(board));
  }

  @Test
  public void case15() {
    String[] board = { ".X.....X.X...X.X.X.....X.....X.......X...X.X", "X.X.........X.X...X.X...X.......X.X.X.X...X.", ".X...X...X.............X.....X.X.....X...X..", "........X...X.X.X.X.X.X.X...X.X.X...X.X.X.X." };
    assertEquals(14, thetilesdivtwo.find(board));
  }

  @Test
  public void case16() {
    String[] board = { ".X...X.X.X...X.X.X.X.....X...X.X.X.......", "....X.....X.....X.....X.....X.....X.X.X..", ".X.X.......X...X...X.X.X.X.X...X.....X.X.", "..X.....X.X...X.X.X...X.X...X.X...X.X.X.X" };
    assertEquals(13, thetilesdivtwo.find(board));
  }

  @Test
  public void case17() {
    String[] board = { ".X...X.X.X.X.X...X.............X.X.X...X.X.X.X", "......X.X.X.X...X.X...X...X.....X.X...X.X.X.X.", ".X.X.X.......X...X.X...X.X...........X.....X..", "X.X.X.........X.X...X...X.X...X...X...X.X...X." };
    assertEquals(15, thetilesdivtwo.find(board));
  }

  @Test
  public void case18() {
    String[] board = { ".X.X.X.X.X.X.X.X...X.X.X...X...X.X...X.....X", "X...X.....X...............X.X.......X...X...", "...X...X...X.X...X...X.X...X.......X.X.X.X..", "X.X...X.X...X.X.....X...X.X.X.X.X.X.X...X..." };
    assertEquals(13, thetilesdivtwo.find(board));
  }

  @Test
  public void case19() {
    String[] board = { "...X.X.X.....X...X...X.X...X.X.X.X.....X..", "....X.X...X...X.X.X.......X.X.X.....X.X.X.", "...X...X.....X...X.....X...X.....X.....X..", "..X.....X.X.X.X.......X.X.....X.......X.X." };
    assertEquals(16, thetilesdivtwo.find(board));
  }

  @Test
  public void case20() {
    String[] board = { ".X.....X.X...X.......X.X.........X.X.....X.X.X", "..X...X.X.X...X.X.....X...X.....X.X.X...X.....", ".X.......X.X...X.X...............X.....X.X.X..", "..X.X.X.X...X.....X...X.X.X.X.X...X.X...X.X..." };
    assertEquals(13, thetilesdivtwo.find(board));
  }

  @Test
  public void case21() {
    String[] board = { "...............................................", "...............................................", "...............................................", "..............................................." };
    assertEquals(46, thetilesdivtwo.find(board));
  }

  @Test
  public void case22() {
    String[] board = { "..............................................", "..............................................", "..............................................", ".............................................." };
    assertEquals(46, thetilesdivtwo.find(board));
  }

  @Test
  public void case23() {
    String[] board = { "XX...X.X.XXX..XX..XX.....X.X.X.XXX.X...X...XX.", "X.X.X.X.X.......X.X.X...X...X.XXXX..X.X...X.X.", "...X.X...X.X...XX.XX...X.X..X..X...XXXXX.X.X..", "X....X..X.XX.XX.X.X.X.....X.XX..X.X.XX...XX.X." };
    assertEquals(10, thetilesdivtwo.find(board));
  }

  @Test
  public void case24() {
    String[] board = { ".X.X.X..XX.......X.X...........X.X...XX...XX.", ".XX..X............XXX.......X.XXX.X.X.XXX.XXX", "X....X.....X....XX.X...X.X..X..X...XX...X..X.", "....XXX.....X...X.X...X.X.X..X.XX...X.X.X...." };
    assertEquals(18, thetilesdivtwo.find(board));
  }

  @Test
  public void case25() {
    String[] board = { "X..X..XX.X.X.X.X.X.XX.X..X.XXX...XX..X...X.X...", "....X.....X.XXX.X.X.X.X.X...X...X...X.X.......X", "XX.X.X.XXX..XX..X.X..X.X..X..X...XX..X.X.XX...." };
    assertEquals(8, thetilesdivtwo.find(board));
  }

  @Test
  public void case26() {
    String[] board = { "..X.X..X.X.X.X...XX....X...X.X.X...X.......X", "X.X.X..X..X.....XX..X.X....XX.X...X.XXXX....", ".....X.XXXXXX..X......X...XXX..X.........X..", "..XXX...........X.X...XXXXXXX.....XXXX....XX" };
    assertEquals(15, thetilesdivtwo.find(board));
  }

  @Test
  public void case27() {
    String[] board = { ".XXX.X..X.........XX.X.....X........X...XX..", "..XX....X..XX...XX.XXXXX.XX...X.X...XX..XX.X", "..XX.......X.XXX.X..XX.XXX...X..XX.X...X.X.X", "..XX.XX.X.X..X.XX...XX....X.X.....X.X..XXX.." };
    assertEquals(13, thetilesdivtwo.find(board));
  }

  @Test
  public void case28() {
    String[] board = { ".X...X.XXX...X.X.X.X.X.X....XX.X.X.X...XXX.X..", "..X..XX.X.X......XXX..X.X...X.....XXX..XXX....", "XX...XX.XXXX...XX..X.X.X...X.X.XXX.....X....XX" };
    assertEquals(7, thetilesdivtwo.find(board));
  }

  @Test
  public void case29() {
    String[] board = { ".X.XX..X...X.XX..X...XX.X....XXX.XX....X.XXXX", "X.X.X.X..X.XX..X....XX....X.X.X.X...X.X......", "XXXX....X..X.X.X.X...X.X.X.X.XXX.....XXX...X." };
    assertEquals(8, thetilesdivtwo.find(board));
  }

  @Test
  public void case30() {
    String[] board = { ".X...X.X.XXX..XX..XX.......X.X.X.X.....X...X...", ".....X........................X.X........X.....", "...X...X.....X...X...X.X.....X...X.XXX.X.X...X.", "..X.....X.X...............X...XX..X...X..X....X" };
    assertEquals(20, thetilesdivtwo.find(board));
  }

  @Test
  public void case31() {
    String[] board = { ".X...X.......X.X...........X.X...X.....X...X...", "............X.X.......X.X...X...X.X.X.......X..", "...X.....X.X...X.......X....X......X.....XXX...", "......X.....X...X..X.X....X.X.X.........X...X.." };
    assertEquals(25, thetilesdivtwo.find(board));
  }

  @Test
  public void case32() {
    String[] board = { ".X.X.X.X..X..X.XX....X.......X.X.......X.....X.", "......X.X...........................X.X...X....", ".X..X.X..X.X..........X..X...XX........X.X...X.", "........X........................X....X.....X.." };
    assertEquals(26, thetilesdivtwo.find(board));
  }

  @Test
  public void case33() {
    String[] board = { ".X...X.X.....X.X.....X.......X.X..X..X.X.X.X.X.", "....X...X.X.................XXX...........X.X..", ".X.X.X.X.....X.X.....X.....X.....X.X.X.....X...", "..............X...X......X............X..X..X.." };
    assertEquals(20, thetilesdivtwo.find(board));
  }

  @Test
  public void case34() {
    String[] board = { "...X.X...X...X..XX.X.......X.X.X..X..X...X...X.", "..X.............XX....X.X..X..X.........X......", ".X.X..XXX..XXX.X.X.X.X..............XX...X.XXX.", "......X.......X..X..X.X...........X.....X.....X" };
    assertEquals(20, thetilesdivtwo.find(board));
  }

  @Test
  public void case35() {
    String[] board = { "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" };
    assertEquals(0, thetilesdivtwo.find(board));
  }

  @Test
  public void case36() {
    String[] board = { "X.X......X.X.X.......X...X.X...X.X........X..X.", "....X...X.......X.....X.X...X.....X...........X", ".X.X..XX.X.X.X.X.X.X.X.X.....X.X...X.....X...X.", "....X..........XX...X.X..........XX...X...X...." };
    assertEquals(19, thetilesdivtwo.find(board));
  }

  @Test
  public void case37() {
    String[] board = { "...X...X...X.X...X...X.....X.......X.X.X.X.....", "..........X.X.X...X.......X.X.....X...X.......X", ".X.X.....X...X...X.X...X.X.X.X..X..X...X...X.X.", "X.............X.......X....X..X.....X......X..." };
    assertEquals(20, thetilesdivtwo.find(board));
  }

  @Test
  public void case38() {
    String[] board = { ".X.....X...X.....X.....X.......X.X.........X...", "....................X...............X.......X.X", ".........X.X.....X...X.X........XX...X.X.X.X...", "........X.......X.............X.X...X......X..." };
    assertEquals(27, thetilesdivtwo.find(board));
  }

  @Test
  public void case39() {
    String[] board = { "..X..X.....X.X.X...X.X.X.X.......X.X.X...XXX.X.", ".....X..........X...................X..........", "...X.X..X....X.X.X...X.....X.X.X............XX.", "......X.........X.X.................X.....X...." };
    assertEquals(22, thetilesdivtwo.find(board));
  }

  @Test
  public void case40() {
    String[] board = { ".....X.X.X...........X...............X.........", "..X...X....X....X.X...X.....................XXX", ".....X.....X.X.....X.X.X.X.......X..X...X....X.", "..X.................X...................X......" };
    assertEquals(30, thetilesdivtwo.find(board));
  }

  @Test
  public void case41() {
    String[] board = { "XX..XXXXXXX.X.XX", "..XX.......X.X.X", "XXX.X.X....XX.X.", "....X....X.X.X.." };
    assertEquals(5, thetilesdivtwo.find(board));
  }

  @Test
  public void case42() {
    String[] board = { 
        "X...X...X.XXXX..X.X...X.X...X..X...XX.", 
        "...X...X...X.X.....X...X.XXX.X.X...X..", 
        ".X..X.XX.XX.X.X.X.....X.XX..XXX.XX...X", 
        "..X....X.X.X...X.......X.X...........X" };
    assertEquals(22, thetilesdivtwo.find(board));
  }

  @Test
  public void case43() {
    String[] board = { "...XX.X.XX.", ".X...X...X.", "X.....XXXXX", "........XX." };
    assertEquals(5, thetilesdivtwo.find(board));
  }

  @Test
  public void case44() {
    String[] board = { "...XXXXXX.X...XX....XX....XX.XX.XXX...X.XX..X.X", ".X.X.XXX.X...X.X.X...X.XXX.X......XX.X.X...X...", ".X......X..X..XX..X.X...XX..X.X..XX.X.X.X.X.X..", "...X.X...X..X....X.X.X...X.XX..X.X.........X.X." };
    assertEquals(27, thetilesdivtwo.find(board));
  }

  @Test
  public void case45() {
    String[] board = { "X.X.X.X.X.X.X.XXX.X.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X", "X.X.X.X.X.X.X.X.XXX.X.X.X.X.X.", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X" };
    assertEquals(0, thetilesdivtwo.find(board));
  }

  @Test
  public void case46() {
    String[] board = { ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "......X..............................", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "....X.X.....X.......X.X.X.......X...." };
    assertEquals(0, thetilesdivtwo.find(board));
  }

  @Test
  public void case47() {
    String[] board = { "XX..XXXXXXX.X.XXX.XXX.....X..XX.XXX.X", "XXX.X.XXXXXXXXXXXXXXXXXXXXXXXXX.XXX.X", "X.XXXX..X.X...XXX...X.XX...XX...XXX.X", "XXX.XXXXXXXXXXXXXXXXXXX.XXXXX.X.X.XXX" };
    assertEquals(0, thetilesdivtwo.find(board));
  }

  @Test
  public void case48() {
    String[] board = { "X.....XXX.XX..XXXXXXXXX...X.XX.XX....X", ".XXXX..X..XXXXXXXX....XX.X.X.X.....XXX", "....XX....X.XX..X.X...XX.X..XXXXXXX..X", "XX.XXXXX.X.X..X..XX.XXX..XX...XXX.X..." };
    assertEquals(13, thetilesdivtwo.find(board));
  }

  @Test
  public void case49() {
    String[] board = { "X.....XXX.XX..XXXXXXXXX...X.XX.XX....X", ".XXXX..X..XXXXX.XX....XX.X.X.X.....XXX", "....XX....X.XX..X.X...XX.X..XXXXXXX..X", "XX.XXXXX.X.X..X..XX.XXX..XX.X.XXX.X..." };
    assertEquals(13, thetilesdivtwo.find(board));
  }

  @Test
  public void case50() {
    String[] board = { "...............................................", "...............................................", "...............................................", "..............................................." };
    assertEquals(46, thetilesdivtwo.find(board));
  }

  @Test
  public void case51() {
    String[] board = { "....", "....", "...." };
    assertEquals(2, thetilesdivtwo.find(board));
  }

  @Test
  public void case52() {
    String[] board = { "X.X", "...", "X.X" };
    assertEquals(1, thetilesdivtwo.find(board));
  }

  @Test
  public void case53() {
    String[] board = { "X...", "....", ".X.." };
    assertEquals(2, thetilesdivtwo.find(board));
  }

  @Test
  public void case54() {
    String[] board = { "X.....XXX.XX..X...XXXXX...X.XX.XX....X", ".X..X..X..XXXXX.......XX.X.X.X.....XXX", "....XX....X.XX..X.X...XX.X..XXXXXXX..X", "XX.XXXXX.X.X..X..XX.XXX..XX...XXX.X..." };
    assertEquals(15, thetilesdivtwo.find(board));
  }

  @Test
  public void case55() {
    String[] board = { ".....XXX.....XX...XXXX..X....XX....XXXXXX...X.X", "..X..X.X.....X....XX.X..X....XX.X.......X...XXX", "X..X.X.X.....XX...XX.X..X....XX....XX...X..XX.X", "....XXX......XX...X..X..X....XXXX..X....X...X.X" };
    assertEquals(22, thetilesdivtwo.find(board));
  }

  @Test
  public void case56() {
    String[] board = { "XX..XXX.....X...X.XX.XX....X", "XX....XX....XX.X.X.X.....XXX", "X.XX..X.X......X..XXXXXXX..X", ".X..X..XX......XX.......X..." };
    assertEquals(12, thetilesdivtwo.find(board));
  }

  @Test
  public void case57() {
    String[] board = { "...............", "...............", "...............", "..............." };
    assertEquals(14, thetilesdivtwo.find(board));
  }

  @Test
  public void case58() {
    String[] board = { "..X...X......XX...X....X.X.X.X.X.XXX......XX...", "....XX..X...X.......XX........XXX..X..X..X...XX", "X.X....X.....XX.X.X.X..X..X..X..X..XX......XXXX", "....XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.....XXX" };
    assertEquals(18, thetilesdivtwo.find(board));
  }

  @Test
  public void case59() {
    String[] board = { ".X", "XX" };
    assertEquals(0, thetilesdivtwo.find(board));
  }

  @Test
  public void case60() {
    String[] board = { "X.", ".." };
    assertEquals(1, thetilesdivtwo.find(board));
  }

  @Test
  public void case61() {
    String[] board = { "X..", "X.X" };
    assertEquals(0, thetilesdivtwo.find(board));
  }

}
