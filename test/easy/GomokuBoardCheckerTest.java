package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class GomokuBoardCheckerTest {
  GomokuBoardChecker gomokuboardchecker = new GomokuBoardChecker();

  @Test
  public void case1() {
    String[] board = {
        "O.X..",
        ".OX..",
        "X.O..",
        "X..O.",
        "....O" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case2() {
    String[] board = { "O.X..", ".OX..", "X.O..", "X..O.", "...XO" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case3() {
    String[] board = { "OOOOO", "OOOOO", "OOOOO", "OOOOO", "OOOOX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case4() {
    String[] board = { "O...", "...X", "....", "...." };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case5() {
    String[] board = {
        "O.X.O.",
        ".OX.O.",
        "X.O.O.",
        "X..OO.",
        "..XXOX",
        "XXXXOO" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case6() {
    String[] board = { "O.XX.O", ".OX..O", "X.O..O", "X..O.O", "..XXOO", "XXXX.O" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case7() {
    String[] board = { "XXXXO", "OOOOX", "XXXXO", "OOOOX", "XOXOX" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case8() {
    String[] board = { "." };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case9() {
    String[] board = { "X" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case10() {
    String[] board = { "O" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case11() {
    String[] board = { "XXXXOOOOO" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case12() {
    String[] board = { "XXXXXOOOO" };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case13() {
    String[] board = { "XXXXX.OOOOO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case14() {
    String[] board = { "XOXOXOXOXOXOXOX" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case15() {
    String[] board = { "X", "X", "X", "O", "O", "O", "O", "O", "X" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case16() {
    String[] board = { "XXX", "OOO", "X.O" };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case17() {
    String[] board = {
        "XXXX.",
        "XXXX.",
        "OOOOO",
        "OOOOO",
        "..X.." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case18() {
    String[] board = { "OXXXO...O", ".O..OXXOX", "XXOXO.O..", "...OOOXXX", "...XO....", "...OOOXXX", "XXOXO.O..", ".O.XOX.OX", "OXX.O..XO" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case19() {
    String[] board = { "OXXXO...O", ".O..OXXO.", "XXOXO.O..", "...OOOXXX", "...XO....", "...OOOXXX", "XXOXO.O..", ".O.XOX.OX", "OXX.O..XO" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case20() {
    String[] board = { "O.XXO...O", ".O..OXXO.", "XXOXO.O..", "...OOOXXX", "...XO....", "...OOOXXX", "XXOXO.O..", ".O.XOX.OX", "OXX.O..XO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case21() {
    String[] board = { "OOOOO", "XXX..", "XXX..", ".....", "....." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case22() {
    String[] board = { "OOOO.OOOO", "XXXXXXXXX" };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case23() {
    String[] board = { "OOOO.OOOO.", "XXXXXXXXXX", "O........." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case24() {
    String[] board = { "XO" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case25() {
    String[] board = { "X.O" };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case26() {
    String[] board = { "XX." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case27() {
    String[] board = { ".OO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case28() {
    String[] board = { "OO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case29() {
    String[] board = { "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case30() {
    String[] board = { "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "...............", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX" };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case31() {
    String[] board = { "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "OOOOXXXXOOOOXXX", "XXXXOOOOXXXXOOO", "XXXX.........O.", "OOOOXXXXOOOOOXX", "XXXXOOOOXXXOOOO", "OOOOXXXXOOOOXXX" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case32() {
    String[] board = { "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "..............." };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case33() {
    String[] board = { "XXXXX", "XXOO.", "XOXO.", "XOOX.", "XOOOX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case34() {
    String[] board = { "XXXXX", "XXOOO", "XOXOO", "XOOXO", "XOOOX" };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case35() {
    String[] board = { "XXXXX", "XXOO.", "XOXO.", "XOOX.", "XOOOX", ".....", "OOO.." };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case36() {
    String[] board = { "XXXXX", "XXOOX", "XOXOX", "XOOXX", "XOOOX", ".....", "OOO..", "OOO.." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case37() {
    String[] board = { "OOOO.XXXX.OOOO.", "OOOO.XXXX.OOOO.", "OOOO.XXXX.OOOO.", "OOOO.XXXX.OOOO.", "...............", "XXXX.OOOO.XXXX.", "XXXX.OOOO.XXXX.", "XXXX.OOOO.XXXX.", "XXXX.OOOO.XXXX.", "...............", "XXXX.OOOO.XOXOX", "XXXX.OOOO.XOXOX", "XXXX.OOOO.OXOXO", "XXXX.OOOO.OXOXO", "..........XOXOX" };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case38() {
    String[] board = { "OOOO.", "....O", "XXXXX" };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case39() {
    String[] board = { "XXXX.", "....X", "OOOOO" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case40() {
    String[] board = { "O...", "...X", "....", "...." };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case41() {
    String[] board = { "O.X..", ".OX..", "X.O..", "X..O.", "....O" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case42() {
    String[] board = { "XXXXO", "OOOOX", "XXXXO", "OOOOX", "XOXOX" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case43() {
    String[] board = { "O.XX.O", ".OX..O", "X.O..O", "X..O.O", "..XXOO", "XXXX.O" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case44() {
    String[] board = { "O.X.O.", ".OX.O.", "X.O.O.", "X..OO.", "..XXOX", "XXXXOO" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case45() {
    String[] board = { "XXXXXX", "OOOOOO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case46() {
    String[] board = { "XXXXX", "OOO..", "OOO.." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case47() {
    String[] board = { "OOOOO", "XXXXX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case48() {
    String[] board = { "XXXXXX", "OOOO..", "......", "OOO...", "......" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case49() {
    String[] board = { "XXXXX", "XOOOO", "XOOOO", "XO...", "X...." };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case50() {
    String[] board = { "XOOOO", "XXOOO", "X.XOO", "X.OXO", "XXXXX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case51() {
    String[] board = { "XXXXOXXXXX", "OOOO..XX..", "OOOO......", "OOOO....OO", "XXXX......" };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case52() {
    String[] board = { "XXX..O", "X.X..O", "X.X..O", "XXX..O", "OOOOOO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case53() {
    String[] board = { ".X.O..", ".OX...", "O..X..", "O...X.", ".O...X" };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case54() {
    String[] board = { ".....", ".....", ".....", ".....", "....." };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case55() {
    String[] board = { "OOOXOOO.OO", "O..X.OO..X", "O..X....X.", "O..X...X..", "XXXXXXX...", "O..X.XO...", "O..X..O...", "O..X......" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case56() {
    String[] board = { "XXXXX", "OOXOO", "XOOOO", "OOOOX", "XXXXX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case57() {
    String[] board = { "OXXXXX", "OOOOXX", "XXXXOO", "OOOOOO", "XOXXXO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case58() {
    String[] board = { "XXXXO", "...O.", "..O..", ".O...", "O...." };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case59() {
    String[] board = { "XXXXXX", "OOOO.." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case60() {
    String[] board = { "O.O.O", "XO.O.", ".X...", "..X..", "...X.", "XXX.X" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case61() {
    String[] board = { "XXXXX", "OOO..", "OOO..", ".....", "....." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case62() {
    String[] board = { "....X", "...X.", "..X..", ".X...", "X....", "OOOO." };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case63() {
    String[] board = { "XX....", "....OO" };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case64() {
    String[] board = { "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "OOOOOOOOOOOOOOO", "XXXXXXXXXXXXXXX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case65() {
    String[] board = { "X" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case66() {
    String[] board = { "OOOOOO", "OXXOXX", "XXXXOO", "OXOOXO", "XOXXXX", "......" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case67() {
    String[] board = { "......", "XXXXX.", ".O.O.O", "O.O.O.", "......", "......" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case68() {
    String[] board = { "XXXXXXXXXX", "OOOO.OOOO.", "OO........" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case69() {
    String[] board = { "O...", "...X", "....", "...." };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case70() {
    String[] board = { "O.X..", ".OX..", "X.O..", "X..O.", "....O" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case71() {
    String[] board = { "XXXXO", "OOOOX", "XXXXO", "OOOOX", "XOXOX" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case72() {
    String[] board = { "O.XX.O", ".OX..O", "X.O..O", "X..O.O", "..XXOO", "XXXX.O" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case73() {
    String[] board = { "O.X.O.", ".OX.O.", "X.O.O.", "X..OO.", "..XXOX", "XXXXOO" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case74() {
    String[] board = { "XXXXXX", "OOOOOO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case75() {
    String[] board = { "XXXXX", "OOO..", "OOO.." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case76() {
    String[] board = { "OOOOO", "XXXXX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case77() {
    String[] board = { "XXXXXX", "OOOO..", "......", "OOO...", "......" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case78() {
    String[] board = { "XXXXX", "XOOOO", "XOOOO", "XO...", "X...." };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case79() {
    String[] board = { "XOOOO", "XXOOO", "X.XOO", "X.OXO", "XXXXX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case80() {
    String[] board = { "XXXXOXXXXX", "OOOO..XX..", "OOOO......", "OOOO....OO", "XXXX......" };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case81() {
    String[] board = { "XXX..O", "X.X..O", "X.X..O", "XXX..O", "OOOOOO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case82() {
    String[] board = { ".X.O..", ".OX...", "O..X..", "O...X.", ".O...X" };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case83() {
    String[] board = { ".....", ".....", ".....", ".....", "....." };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case84() {
    String[] board = { "OOOXOOO.OO", "O..X.OO..X", "O..X....X.", "O..X...X..", "XXXXXXX...", "O..X.XO...", "O..X..O...", "O..X......" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case85() {
    String[] board = { "XXXXX", "OOXOO", "XOOOO", "OOOOX", "XXXXX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case86() {
    String[] board = { "OXXXXX", "OOOOXX", "XXXXOO", "OOOOOO", "XOXXXO" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case87() {
    String[] board = { "XXXXO", "...O.", "..O..", ".O...", "O...." };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case88() {
    String[] board = { "XXXXXX", "OOOO.." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case89() {
    String[] board = { "O.O.O", "XO.O.", ".X...", "..X..", "...X.", "XXX.X" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case90() {
    String[] board = { 
        "XXXXX", 
        "OOO..", 
        "OOO..", 
        ".....", 
        "....." };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case91() {
    String[] board = { "....X", "...X.", "..X..", ".X...", "X....", "OOOO." };
    assertEquals("X WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case92() {
    String[] board = { "XX....", "....OO" };
    assertEquals("IN PROGRESS", gomokuboardchecker.check(board));
  }

  @Test
  public void case93() {
    String[] board = { "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "...............", "OOOOOOOOOOOOOOO", "XXXXXXXXXXXXXXX" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case94() {
    String[] board = { "X" };
    assertEquals("DRAW", gomokuboardchecker.check(board));
  }

  @Test
  public void case95() {
    String[] board = {
        "OOOOOO",
        "OXXOXX",
        "XXXXOO",
        "OXOOXO",
        "XOXXXX",
        "......" };
    assertEquals("O WON", gomokuboardchecker.check(board));
  }

  @Test
  public void case96() {
    String[] board = {
        "......",
        "XXXXX.",
        ".O.O.O",
        "O.O.O.",
        "......",
        "......" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

  @Test
  public void case97() {
    String[] board = {
        "XXXXXXXXXX",
        "OOOO.OOOO.",
        "OO........" };
    assertEquals("INVALID", gomokuboardchecker.check(board));
  }

}
