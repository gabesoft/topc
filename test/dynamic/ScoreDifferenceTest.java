package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class ScoreDifferenceTest {
  ScoreDifference scoredifference = new ScoreDifference();

  @Test
  public void case1() {
    String[] board = { 
        "12 4 5 13",
        "3 14 16 9", 
        "11 6 15 8", 
        "2 1 7 10" };
    assertEquals(2, scoredifference.maximize(board));
  }

  @Test
  public void case35() {
    String[] board = { "11 4 5 13", "3 14 15 9", "12 8 16 6", "2 1 7 10" };
    assertEquals(2, scoredifference.maximize(board));
  }

  @Test
  public void case2() {
    String[] board = { "15 16 11 12", "10 13 4 7", "1 2 8 6", "9 5 3 14" };
    assertEquals(6, scoredifference.maximize(board));
  }

  @Test
  public void case3() {
    String[] board = { "6 8 1 16", "10 15 9 3", "2 5 7 14", "13 12 11 4" };
    assertEquals(10, scoredifference.maximize(board));
  }

  @Test
  public void case4() {
    String[] board = { "9 8 3 1", "10 6 15 5", "12 7 4 11", "14 13 16 2" };
    assertEquals(16, scoredifference.maximize(board));
  }

  @Test
  public void case5() {
    String[] board = { "12 8 6 5", "2 11 9 15", "13 10 14 7", "1 16 4 3" };
    assertEquals(4, scoredifference.maximize(board));
  }

  @Test
  public void case6() {
    String[] board = { "7 2 8 4", "3 16 10 12", "9 6 14 11", "15 13 1 5" };
    assertEquals(8, scoredifference.maximize(board));
  }

  @Test
  public void case7() {
    String[] board = { "4 10 14 3", "2 7 15 6", "11 1 13 9", "5 8 16 12" };
    assertEquals(10, scoredifference.maximize(board));
  }

  @Test
  public void case8() {
    String[] board = { "9 6 2 10", "5 11 3 8", "16 1 12 13", "14 15 7 4" };
    assertEquals(12, scoredifference.maximize(board));
  }

  @Test
  public void case9() {
    String[] board = { "15 10 12 11", "6 3 4 13", "14 5 16 1", "9 8 7 2" };
    assertEquals(16, scoredifference.maximize(board));
  }

  @Test
  public void case10() {
    String[] board = { "11 9 3 4", "1 16 8 13", "14 10 6 5", "7 15 12 2" };
    assertEquals(14, scoredifference.maximize(board));
  }

  @Test
  public void case11() {
    String[] board = { "7 3 13 12", "1 5 2 15", "8 4 6 14", "9 16 11 10" };
    assertEquals(10, scoredifference.maximize(board));
  }

  @Test
  public void case12() {
    String[] board = { "3 11 7 15", "14 4 16 2", "8 13 1 6", "10 12 5 9" };
    assertEquals(14, scoredifference.maximize(board));
  }

  @Test
  public void case13() {
    String[] board = { "7 14 6 16", "9 11 5 4", "2 12 8 3", "15 1 13 10" };
    assertEquals(6, scoredifference.maximize(board));
  }

  @Test
  public void case14() {
    String[] board = { "8 6 1 4", "3 7 16 2", "11 15 5 9", "14 10 13 12" };
    assertEquals(12, scoredifference.maximize(board));
  }

  @Test
  public void case15() {
    String[] board = { "13 8 7 15", "6 14 10 1", "11 9 12 5", "2 3 4 16" };
    assertEquals(6, scoredifference.maximize(board));
  }

  @Test
  public void case16() {
    String[] board = { "5 9 15 6", "2 8 3 12", "14 16 11 1", "13 7 4 10" };
    assertEquals(8, scoredifference.maximize(board));
  }

  @Test
  public void case17() {
    String[] board = { "7 2 6 5", "1 13 3 11", "16 4 9 10", "14 8 12 15" };
    assertEquals(18, scoredifference.maximize(board));
  }

  @Test
  public void case18() {
    String[] board = { "14 10 8 7", "16 2 12 4", "15 6 3 9", "1 5 13 11" };
    assertEquals(8, scoredifference.maximize(board));
  }

  @Test
  public void case19() {
    String[] board = { "6 15 16 7", "14 5 12 13", "1 11 2 9", "3 4 10 8" };
    assertEquals(12, scoredifference.maximize(board));
  }

  @Test
  public void case20() {
    String[] board = { "15 11 7 12", "2 3 8 14", "16 13 9 6", "4 5 1 10" };
    assertEquals(8, scoredifference.maximize(board));
  }

  @Test
  public void case21() {
    String[] board = { "11 8 13 12", "1 14 9 6", "7 10 4 3", "5 2 16 15" };
    assertEquals(12, scoredifference.maximize(board));
  }

  @Test
  public void case22() {
    String[] board = { "13 12 1 4", "2 7 9 6", "11 5 8 15", "3 16 14 10" };
    assertEquals(10, scoredifference.maximize(board));
  }

  @Test
  public void case23() {
    String[] board = { "2 3 12 7", "6 16 5 15", "14 4 9 8", "13 10 11 1" };
    assertEquals(16, scoredifference.maximize(board));
  }

  @Test
  public void case24() {
    String[] board = { "9 11 14 3", "5 6 2 4", "12 13 16 7", "1 15 8 10" };
    assertEquals(6, scoredifference.maximize(board));
  }

  @Test
  public void case25() {
    String[] board = { "7 10 13 8", "16 12 5 4", "14 3 15 2", "11 6 9 1" };
    assertEquals(10, scoredifference.maximize(board));
  }

  @Test
  public void case26() {
    String[] board = { "9 3 6 13", "1 14 2 4", "7 5 11 10", "8 12 16 15" };
    assertEquals(16, scoredifference.maximize(board));
  }

  @Test
  public void case27() {
    String[] board = { "14 5 16 13", "8 9 3 11", "7 1 12 4", "2 10 6 15" };
    assertEquals(12, scoredifference.maximize(board));
  }

  @Test
  public void case28() {
    String[] board = { "2 15 10 6", "13 5 1 16", "11 8 3 4", "7 14 12 9" };
    assertEquals(8, scoredifference.maximize(board));
  }

  @Test
  public void case29() {
    String[] board = { "9 4 11 10", "2 12 3 13", "6 1 16 15", "8 5 7 14" };
    assertEquals(14, scoredifference.maximize(board));
  }

  @Test
  public void case30() {
    String[] board = { "11 16 9 13", "1 2 4 12", "7 10 6 5", "8 3 15 14" };
    assertEquals(6, scoredifference.maximize(board));
  }

  @Test
  public void case31() {
    String[] board = { "13 6 3 12", "16 4 14 5", "11 7 1 10", "8 15 9 2" };
    assertEquals(14, scoredifference.maximize(board));
  }

  @Test
  public void case32() {
    String[] board = { "6 5 15 4", "10 14 2 8", "3 7 12 9", "11 16 13 1" };
    assertEquals(8, scoredifference.maximize(board));
  }

  @Test
  public void case33() {
    String[] board = { "10 12 9 7", "13 11 6 8", "16 1 14 4", "3 15 5 2" };
    assertEquals(16, scoredifference.maximize(board));
  }

  @Test
  public void case34() {
    String[] board = { "2 9 13 1", "8 15 5 11", "16 12 3 14", "6 4 7 10" };
    assertEquals(10, scoredifference.maximize(board));
  }

  @Test
  public void case36() {
    String[] board = { "4 10 3 11", "14 2 15 7", "16 13 5 6", "1 8 9 12" };
    assertEquals(12, scoredifference.maximize(board));
  }

  @Test
  public void case37() {
    String[] board = { "10 9 1 5", "12 11 4 13", "14 8 7 16", "3 2 15 6" };
    assertEquals(8, scoredifference.maximize(board));
  }

  @Test
  public void case38() {
    String[] board = { "10 3 8 4", "14 7 16 1", "11 12 6 5", "15 9 13 2" };
    assertEquals(16, scoredifference.maximize(board));
  }

  @Test
  public void case39() {
    String[] board = { "7 3 8 10", "9 4 16 6", "12 11 1 14", "13 15 5 2" };
    assertEquals(14, scoredifference.maximize(board));
  }

  @Test
  public void case40() {
    String[] board = { "12 13 8 4", "5 3 14 9", "2 6 7 16", "10 1 11 15" };
    assertEquals(4, scoredifference.maximize(board));
  }

  @Test
  public void case41() {
    String[] board = { "4 3 16 13", "6 10 9 7", "11 12 1 15", "2 5 14 8" };
    assertEquals(6, scoredifference.maximize(board));
  }

  @Test
  public void case42() {
    String[] board = { "8 5 14 9", "2 12 7 6", "15 4 13 3", "16 1 11 10" };
    assertEquals(14, scoredifference.maximize(board));
  }

  @Test
  public void case43() {
    String[] board = { "9 8 3 1", "10 6 15 5", "12 7 4 11", "14 13 16 2" };
    assertEquals(16, scoredifference.maximize(board));
  }

  @Test
  public void case44() {
    String[] board = { "15 16 11 12", "10 13 4 7", "1 2 8 6", "9 5 3 14" };
    assertEquals(6, scoredifference.maximize(board));
  }

}
