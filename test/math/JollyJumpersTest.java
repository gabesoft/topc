package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class JollyJumpersTest {
  JollyJumpers jollyjumpers = new JollyJumpers();

  @Test
  public void case1() {
    String[] layout = { 
        "....", 
        ".#..", 
        "..#.", 
        "...." };
    assertEquals(1, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case2() {
    String[] layout = { "....", "....", "....", "...." };
    assertEquals(0, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case3() {
    String[] layout = { 
        ".#..", 
        ".#..", 
        "..#.", 
        "...#" };
    assertEquals(4, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case4() {
    String[] layout = { "####", "####", "####", "####" };
    assertEquals(0, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case5() {
    String[] layout = { "#...", ".##.", "...#", "...." };
    assertEquals(3, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case6() {
    String[] layout = { "#...", ".##.", "...#", ".##." };
    assertEquals(7, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case7() {
    String[] layout = { ".###", "####", "####", "####" };
    assertEquals(22, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case8() {
    String[] layout = { "##..", "##..", "###.", "###." };
    assertEquals(14, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case9() {
    String[] layout = { "####", "####", "####", "#.##" };
    assertEquals(22, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case10() {
    String[] layout = { "####", "##.#", "####", "#.##" };
    assertEquals(21, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case11() {
    String[] layout = { ".###", "##.#", "##.#", "#.##" };
    assertEquals(17, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case12() {
    String[] layout = { "####", "#...", "#...", "#..." };
    assertEquals(5, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case13() {
    String[] layout = { "####", "#...", "#...", "#..#" };
    assertEquals(7, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case14() {
    String[] layout = { ".###", "#...", "#...", "#.#." };
    assertEquals(6, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case15() {
    String[] layout = { "##.#", "....", "....", "####" };
    assertEquals(0, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case16() {
    String[] layout = { "###.", "....", "....", "####" };
    assertEquals(0, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case17() {
    String[] layout = { "#..#", "....", "....", "####" };
    assertEquals(0, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case18() {
    String[] layout = { "##.#", "..#.", ".#..", "#..#" };
    assertEquals(7, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case19() {
    String[] layout = { ".##.", "#..#", "#..#", "####" };
    assertEquals(13, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case20() {
    String[] layout = { ".##.", "#..#", "#..#", ".##." };
    assertEquals(9, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case21() {
    String[] layout = { "##.#", ".#.#", "..##", "####" };
    assertEquals(15, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case22() {
    String[] layout = { "##.#", "##..", "####", "####" };
    assertEquals(19, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case23() {
    String[] layout = { "####", "####", "#..#", "####" };
    assertEquals(20, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case24() {
    String[] layout = { "####", "####", "##.#", "####" };
    assertEquals(22, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case25() {
    String[] layout = { "####", "####", "###.", "####" };
    assertEquals(22, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case26() {
    String[] layout = { "#.#.", "#...", "....", ".#.#" };
    assertEquals(5, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case27() {
    String[] layout = { "#...", "...#", "....", "...." };
    assertEquals(0, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case28() {
    String[] layout = { "#.#.", "....", ".#.#", "...." };
    assertEquals(0, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case29() {
    String[] layout = { "#...", "...#", "#...", "...#" };
    assertEquals(1, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case30() {
    String[] layout = { "#.##", ".#.#", ".#..", "#..#" };
    assertEquals(11, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case31() {
    String[] layout = { "#.##", "##.#", ".#.#", "#..." };
    assertEquals(12, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case32() {
    String[] layout = { "#...", "#.##", "####", "####" };
    assertEquals(18, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case33() {
    String[] layout = { "##.#", "#.##", "..##", "..#." };
    assertEquals(12, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case34() {
    String[] layout = { "#..#", ".#.#", "#.#.", ".#.." };
    assertEquals(8, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case35() {
    String[] layout = { "...#", "#.##", ".###", ".###" };
    assertEquals(14, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case36() {
    String[] layout = { ".###", "#.#.", "####", "#..." };
    assertEquals(12, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case37() {
    String[] layout = { "#.#.", ".#.#", "#.#.", ".#.#" };
    assertEquals(8, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case38() {
    String[] layout = { "#..#", ".#.#", "#.#.", ".#.#" };
    assertEquals(9, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case39() {
    String[] layout = { "#.##", "##.#", "####", "####" };
    assertEquals(21, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case40() {
    String[] layout = { "####", "####", "####", "###." };
    assertEquals(22, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case41() {
    String[] layout = { "#..#", ".##.", ".#.#", "##.." };
    assertEquals(9, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case42() {
    String[] layout = { "###.", "####", "##.#", "####" };
    assertEquals(21, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case43() {
    String[] layout = { "#...", "##..", "#...", "...." };
    assertEquals(5, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case44() {
    String[] layout = { "...#", "....", "..##", "#..." };
    assertEquals(1, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case45() {
    String[] layout = { "##.#", "####", "#.##", "####" };
    assertEquals(21, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case46() {
    String[] layout = { "##..", "....", "....", "...." };
    assertEquals(0, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case47() {
    String[] layout = { "##..", "##..", "##..", "##.." };
    assertEquals(9, jollyjumpers.maxScore(layout));
  }

  @Test
  public void case48() {
    String[] layout = { "#.#.", ".#.#", "#..#", "##.." };
    assertEquals(10, jollyjumpers.maxScore(layout));
  }

}
