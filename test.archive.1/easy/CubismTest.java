package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CubismTest {
  Cubism cubism = new Cubism();

  @Test
  public void case1() {
    String[] lattice = { "BBBBBWWWBWWWBWWW", "BWWWWWWWWWWWWWWW", "BWWWWWWWWWWWWWWW", "BWWWWWWWWWWWWWWW" };
    String color = "black";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case2() {
    String[] lattice = { "BWWWWWWWWWWWWWWW", "WWWWWBWWWWWWWWWW", "WWWWWWWWWWBWWWWW", "WWWWWWWWWWWWWWWB" };
    String color = "black";
    assertEquals(1, cubism.lines(lattice, color));
  }

  @Test
  public void case3() {
    String[] lattice = { "WWWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWWW" };
    String color = "black";
    assertEquals(0, cubism.lines(lattice, color));
  }

  @Test
  public void case4() {
    String[] lattice = { "WWWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWWW" };
    String color = "white";
    assertEquals(76, cubism.lines(lattice, color));
  }

  @Test
  public void case5() {
    String[] lattice = { "WWWWWWWWWBWWWWWW", "WWWBWWWWWWWWWWWW", "WWWWWWWWWWWWBWWW", "WWWBWWWWWWWWWWWW" };
    String color = "white";
    assertEquals(58, cubism.lines(lattice, color));
  }

  @Test
  public void case6() {
    String[] lattice = { "BWBWBWBWBWBWBWBW", "BWBWBWBWBWBWBWBW", "BWBWBWBWBWBWBWBW", "BWBWBWBWBWBWBWBW" };
    String color = "white";
    assertEquals(20, cubism.lines(lattice, color));
  }

  @Test
  public void case7() {
    String[] lattice = { "WBWBBWBWWBWBBBBW", "BWWWWBBBWWBWBBWB", "BBWBBBWBWWWBWBWW", "BBBBWBBWWBWWBWBB" };
    String color = "white";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case8() {
    String[] lattice = { "WWBWBBBBBBWBWBWB", "WWBBBWWBWBWBBBWW", "BBWBBWWWWBBWBBBW", "BWBWBBBWBWBBBWBW" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case9() {
    String[] lattice = { "BWBWWWWWBBBWBWBB", "BBWBBBWBBWWWWWWB", "WBWWBBWBBWWBBWBB", "BWBWBBBBWWBWWBBW" };
    String color = "black";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case10() {
    String[] lattice = { "BBWWBBBWWWWBWBBW", "BWBWWWBWWWBBBWBW", "WWWBWWWWBBBWWBWW", "BBWWWWBWWBBBBWWW" };
    String color = "white";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case11() {
    String[] lattice = { "BWWBWWWWWWBWWBWB", "BBWWWBWWWWWBWWBB", "WBWBBWWWWWBWWWBW", "BBBWBBBBWBBWWBBB" };
    String color = "black";
    assertEquals(5, cubism.lines(lattice, color));
  }

  @Test
  public void case12() {
    String[] lattice = { "BBBWWBBBBWBWWWWW", "BWBWBBWBBWBBBWBW", "WBWBBWBWWWBWBWBW", "WBWWWWWBBWBWWWWB" };
    String color = "white";
    assertEquals(5, cubism.lines(lattice, color));
  }

  @Test
  public void case13() {
    String[] lattice = { "WBWWWBWWBWBBBWBW", "WBWWBBWWWBWBBBWB", "WWBWBWBBWBWBBBWB", "WBWBWWBWBBWWBWBB" };
    String color = "black";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case14() {
    String[] lattice = { "WBBBBWWBBBBWBBWW", "BBWWWWBWWWWWBBWW", "BWWWBWBBWWBBWWBB", "WWWWBWBBBBWWWWWB" };
    String color = "white";
    assertEquals(8, cubism.lines(lattice, color));
  }

  @Test
  public void case15() {
    String[] lattice = { "WBBWWBWWWWWBWBBB", "WBBWWWWBWWWWBWBW", "BWBWBBBWWBBBWBWB", "BBBBWWBBWWWWBWBW" };
    String color = "white";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case16() {
    String[] lattice = { "BWBBBBWWBWWBBWBB", "WWBWBWBWWWBBBBBB", "WWWWBWWBBWBWWBWB", "BBBWBBWBBWWWBWWB" };
    String color = "white";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case17() {
    String[] lattice = { "BWBWBBWWBWWWWBWW", "WBWWWBWWBBBWWWWB", "WBWWWWBBBBWWWBBW", "BBWWWBBBBBBWWBWW" };
    String color = "white";
    assertEquals(8, cubism.lines(lattice, color));
  }

  @Test
  public void case18() {
    String[] lattice = { "BBBWBWWBBBBBWBWB", "BWWBWBWWWBBWWBBW", "BBWBBBBWBBBBWBBB", "WBBWBBWBBBWWBBWB" };
    String color = "white";
    assertEquals(0, cubism.lines(lattice, color));
  }

  @Test
  public void case19() {
    String[] lattice = { "WBWWBWWBWBWBWWBW", "WWWBWWWWBWWWWWBB", "WBWWWBWBBWWWWWBB", "WWWWWBWWBBWBBBWW" };
    String color = "white";
    assertEquals(15, cubism.lines(lattice, color));
  }

  @Test
  public void case20() {
    String[] lattice = { "BWWWWWBBWBBWBBBW", "WBWWWWBBBWBWWBBB", "BWBBWBWBWBBWBBBB", "BWWBBWBBWWBWWBBB" };
    String color = "white";
    assertEquals(1, cubism.lines(lattice, color));
  }

  @Test
  public void case21() {
    String[] lattice = { "WWBBBBBBBWWBBWWW", "BWBWBWWBBBBBWBWW", "BBBWWWBWBWWBBBWB", "WWBBWBBBWWBBWBBW" };
    String color = "black";
    assertEquals(6, cubism.lines(lattice, color));
  }

  @Test
  public void case22() {
    String[] lattice = { "WBWWWWWBWWWWBWBB", "WWBWBWWWBWWWBWWB", "WWWBBBWBBWBBBBWW", "WBWBBWBWWWWWBWBW" };
    String color = "white";
    assertEquals(8, cubism.lines(lattice, color));
  }

  @Test
  public void case23() {
    String[] lattice = { "WWWBWBWBWWBBWBWW", "WBWBBWBWWWBWWBWW", "WWWBBBWWBWBWWWWW", "BBBBWBBWWBWBWBWW" };
    String color = "white";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case24() {
    String[] lattice = { "WWBWBWWWWBBWBBBW", "BWWBWWBBBBWWWBBW", "BBWBWBBWBWBBWBBB", "WWWBBWWBWBWWBWWB" };
    String color = "white";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case25() {
    String[] lattice = { "WWWWBWBBWBWWWWWW", "BBWWWWWWBWBWBBBB", "BWWWWBWWWBBWBWBB", "BWWWWBWWBBBWBBWW" };
    String color = "black";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case26() {
    String[] lattice = { "BBWBWWBBWWBWBWBW", "BBWWBBWWWBBWWBWB", "WWWBBWBBBBBBBWBB", "WWWWBWWBBBWBBBBB" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case27() {
    String[] lattice = { "WWWBBWBBWBBBWWWB", "WBBBWBBBBWWBWWBW", "WBBBWWBBWWBBWBBW", "WBWWBBBBBWBBBWBB" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case28() {
    String[] lattice = { "WWWBWWBWWBBWWWWW", "BBWWBWBBWBBBWBWB", "WWBBWBBWWWBBBBBW", "BWBWWBWWBBWWWWWB" };
    String color = "white";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case29() {
    String[] lattice = { "WWWBBWBWBBWWBBBW", "WBWWWWWBBBWBBWWB", "WWWWBWWWWBWWBWWW", "BWWBBBBWWBBBBWBW" };
    String color = "white";
    assertEquals(8, cubism.lines(lattice, color));
  }

  @Test
  public void case30() {
    String[] lattice = { "WBBBBWWWWBWBWBWW", "WBBWBWWBWWWWWBWB", "BBWWWBWWBWBBWWWB", "WWBWWWBWWWWBBBWW" };
    String color = "white";
    assertEquals(9, cubism.lines(lattice, color));
  }

  @Test
  public void case31() {
    String[] lattice = { "WWWBWBBWWWWWBBBB", "WBWWBWBWWWBBBBWW", "WWBBWWWBBBWBWBWB", "BWWBBBBBBWWBBBWB" };
    String color = "black";
    assertEquals(8, cubism.lines(lattice, color));
  }

  @Test
  public void case32() {
    String[] lattice = { "BBWWWWWWBBWBBWBB", "WWWBWBBBWWWBWBWB", "BWWWWBWBWWWWWBBB", "BWBBBWWWBBWBBBWB" };
    String color = "white";
    assertEquals(5, cubism.lines(lattice, color));
  }

  @Test
  public void case33() {
    String[] lattice = { "WBBWBWWBWBWBWBWW", "WWBBWBBBWBBWBBBW", "WBBWBWWBBBWWWWBB", "BWWBWBBBWBWWWBBW" };
    String color = "white";
    assertEquals(1, cubism.lines(lattice, color));
  }

  @Test
  public void case34() {
    String[] lattice = { "BBWWBWBWBWBWBBBB", "BWWBBBBBBBWWWWBW", "BWWWWWWBWWWWBBBW", "WBWWWBBBWWBBWBBB" };
    String color = "white";
    assertEquals(5, cubism.lines(lattice, color));
  }

  @Test
  public void case35() {
    String[] lattice = { "WBBBBWWWBBBBBBWB", "BWWBWBBBWBWBWBWB", "BWBBBWWBBBWWWWBB", "WWBWWBBBBBBWBWWW" };
    String color = "black";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case36() {
    String[] lattice = { "BBBWBWWWWWBWWWWB", "WBBBWWWWWWBWWBBB", "WBWWBWWWBWBBWBWB", "BWWBBBBWWWWWBWBB" };
    String color = "white";
    assertEquals(8, cubism.lines(lattice, color));
  }

  @Test
  public void case37() {
    String[] lattice = { "WWBBWWWBBBWBWBWB", "BWBWBBBBBWBBWWWB", "WBWWBWBWWWBBBBWB", "WBWBBWBWWBWWWWBW" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case38() {
    String[] lattice = { "BBBWBBWWBBWWWWWB", "BBWBWBBWWBWWBBBW", "WWBWWBBWWWBBBBWB", "BWBBWBBWWBBBWBWB" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case39() {
    String[] lattice = { "WWBWWWWBBBWBWBWB", "WWWWWWBWWWWWWWWB", "BWWBBBBBBBBWBBBW", "BBBBWWBBWWWBBBWW" };
    String color = "black";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case40() {
    String[] lattice = { "WBBBWWWWWWBWWBWB", "BBWWWWWBWBBBBWWW", "BBBBWBBWBBWBWBBB", "BBWWWBWBBBWBWWWB" };
    String color = "black";
    assertEquals(6, cubism.lines(lattice, color));
  }

  @Test
  public void case41() {
    String[] lattice = { "BWWBWWWWWWBBBBBB", "BWWBBBWWBWWBBBBW", "BBWBBBWWWBWWWWBB", "WWWBWBWBWBBWBWWW" };
    String color = "black";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case42() {
    String[] lattice = { "BBWBWWWWWWBWBWBW", "WBBBBBWBBBWBWWBW", "WBBBBWBWWBWBBBBW", "WWWBWWWBWWBWWWBB" };
    String color = "white";
    assertEquals(6, cubism.lines(lattice, color));
  }

  @Test
  public void case43() {
    String[] lattice = { "BWBBWBBWWBWWWWBW", "BBBWWWBBWBWBWWWB", "BBWBBBBBWWWWBBWW", "WWWWWBWWBBBWBWBW" };
    String color = "black";
    assertEquals(1, cubism.lines(lattice, color));
  }

  @Test
  public void case44() {
    String[] lattice = { "WWBBWBBBBWBBWWWB", "BBWWBWWBWBBWBWBB", "WWWBBBWBBWWBWWBW", "BWBWBBBWBBBWWWWB" };
    String color = "white";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case45() {
    String[] lattice = { "BBBBWBBBWWBWBWWB", "WBWBBBWWWWWBBWBB", "BBBWWWWBBWBWWBWB", "BBBBWWWWWBWWBWBB" };
    String color = "black";
    assertEquals(10, cubism.lines(lattice, color));
  }

  @Test
  public void case46() {
    String[] lattice = { "WBBWWBBBWBBWWBWB", "BBBWBBWWBBBWWWBB", "WWBWWWWWWBBBWWBW", "WWBBWBBBWWBWWBBB" };
    String color = "white";
    assertEquals(5, cubism.lines(lattice, color));
  }

  @Test
  public void case47() {
    String[] lattice = { "BBWBWWBWBWBBBBWB", "BBBWBWBBWWBWWBWB", "BBBBBBBBWBBBWWBB", "WWBWWWBBWWBWWWBB" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case48() {
    String[] lattice = { "WWBBWBWBBBBBBBBW", "WBBWBWWBBBWBBWBW", "BWWWBBWBBBWBBWWW", "WBBWBWBBBBWWBWBB" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case49() {
    String[] lattice = { "BWBWWWBBWBWBBWBB", "BBWWBWBBWWWBBBBB", "BWBWBWWBBBWWBBWB", "BBBWWWBWWWBWBWWB" };
    String color = "black";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case50() {
    String[] lattice = { "BBBBBWWWBWBBBBWB", "WBWWBWWBWWBBWBBB", "BWBWBBWBWWBWWWBW", "BWBWWBWBBBWBWWBW" };
    String color = "white";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case51() {
    String[] lattice = { "WBBBBWWWBBBWBWWW", "WBWWWWWBBWWBWBWB", "BWBWBWWBBWWWBWBW", "BBBWWBBWWWBBWWBW" };
    String color = "white";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case52() {
    String[] lattice = { "BWWWWBWWWWBBWBBW", "BBWWBWWWBWBWWWWW", "WBWWWBBWBBBWWBBB", "BWBWBWBBWWBWWWWB" };
    String color = "black";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case53() {
    String[] lattice = { "BBWWWBWBWWBWBWBW", "BWBBBWBBWBBWWBBB", "WBBBWBBBWBWBBWWW", "BBWWBBBBWBWBWWWB" };
    String color = "black";
    assertEquals(5, cubism.lines(lattice, color));
  }

  @Test
  public void case54() {
    String[] lattice = { "BBBBBWBWWWWBWWBB", "BBWWWBWWWBBWWBBW", "WWBBWBWBWBBBWWWW", "BBWBWBBBBBWBBWBB" };
    String color = "white";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case55() {
    String[] lattice = { "WBWBBWWWBWBBWBWB", "WWBBWBBWBWWBBWBB", "BBWWWWWBBBWBBBWW", "WWBWBBBWBWBWWBWB" };
    String color = "white";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case56() {
    String[] lattice = { "BBBWWWBWBWBWBBBB", "WWWWBBWBBWBWWWWB", "BBBBBBBWBBBBBWWW", "WWBBWBBBBBWWBBWW" };
    String color = "black";
    assertEquals(11, cubism.lines(lattice, color));
  }

  @Test
  public void case57() {
    String[] lattice = { "BBWWBWWWWBWBBWBW", "BBBBWBBWBBBBWBBB", "WWWWWBBWBBWWBBBB", "WBBBWWBBWBBWWWWW" };
    String color = "black";
    assertEquals(10, cubism.lines(lattice, color));
  }

  @Test
  public void case58() {
    String[] lattice = { "BBWWWBWWWWBBWBWW", "BBBBWBWWWWWBWBWW", "BBWBBWWWBBWWWWBW", "WWWWBWWBWBBBBBBB" };
    String color = "black";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case59() {
    String[] lattice = { "BWBWBBBWWBWWWBWB", "WBBBBBBWBWWBWWBW", "BWWBBWWBWBWWWWBW", "WBWWBBBWBWWBWBWB" };
    String color = "white";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case60() {
    String[] lattice = { "WWBWBBWWWBWWBBWW", "BWBWBWBWWWWBWWWW", "BBBBWWBWBWBWBWBW", "WBWBBWBBBWWWBWWW" };
    String color = "black";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case61() {
    String[] lattice = { "WBBWWWWWBBBBBBBW", "BWWWWBBWWWBBBWBW", "BWBWBWWBBWWBBBWB", "WWBBWBBBWWWBBBBW" };
    String color = "black";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case62() {
    String[] lattice = { "BBWBWBBBBWWBBWWB", "BWWBWBBWWBBBWWWW", "WWWWWWWWWWBBBWWB", "BBBWBBBWBBBBWWBB" };
    String color = "black";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case63() {
    String[] lattice = { "BWBWBWWBWWBBBBBW", "BBBWBBBWBBWBWWWB", "BWWWBBBBBBWBWWWW", "BWWWWBBWWWBWWWWB" };
    String color = "black";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case64() {
    String[] lattice = { "BWBBBWBBWBWBBWBW", "WWBWBWBBBBWBWBBB", "WWWWWBBBBBBBWBBW", "BBWWWWWBBBBWWWWW" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case65() {
    String[] lattice = { "BBWWWBBWWWWBBBWB", "WWBWBBWBWBWBWWBW", "BWBWBWBWWWBBBWWB", "WWBWWBWWBWBBWWBW" };
    String color = "black";
    assertEquals(1, cubism.lines(lattice, color));
  }

  @Test
  public void case66() {
    String[] lattice = { "BWBWWBBWBBWWBBWB", "BWWBBBBBBWBWBBBB", "BBBBBBWBBBWWWWWB", "WBBWBBBBBBBWBBWW" };
    String color = "black";
    assertEquals(10, cubism.lines(lattice, color));
  }

  @Test
  public void case67() {
    String[] lattice = { "BBWWWWBWBWBWBBWW", "WBWBWWWBBBWWBBBB", "WWBWBBWBBWBBBWWB", "WWWWBBBWWBBWWWBB" };
    String color = "white";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case68() {
    String[] lattice = { "WBBWBWBWWWBWWWBB", "WWWWWBBBWBWWBWWW", "BBWWBBWBWBWBWWWW", "BWWWWWWWBWWBBBBB" };
    String color = "white";
    assertEquals(6, cubism.lines(lattice, color));
  }

  @Test
  public void case69() {
    String[] lattice = { "WBWWWBBBWBWWBWBB", "BWBBWWWBBBBBBBWB", "WWWBBWWWBWBBBWBB", "WBBWWBWBBBBBWWWW" };
    String color = "white";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case70() {
    String[] lattice = { "WBWBWWWBBWWBBBBB", "WBWBWWWBBBBBBBBB", "WBBBWBWBBWBWBBWB", "BWWWWBBBWWBBBBBB" };
    String color = "black";
    assertEquals(14, cubism.lines(lattice, color));
  }

  @Test
  public void case71() {
    String[] lattice = { "WWBBWWWBBWWBBBBW", "WBBWBBWWWWWBBBBB", "WWBWBWBBWWBBBBBW", "BBBWBWWWWBWWWWWW" };
    String color = "black";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case72() {
    String[] lattice = { "BBWWWWBWBBBBBBWW", "BBBBWBWWWWWBBWWW", "BBWWWWWBBBBWBWBW", "WWBBBWBWWWWWBBBB" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case73() {
    String[] lattice = { "BWBWWBBWWBBBBWBB", "WBWWBBBBBBWWWWWB", "WWWWBBBWBWWBBWWW", "BBWWWBBBBWWWBBBW" };
    String color = "black";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case74() {
    String[] lattice = { "WBBBWWBWWBWBBBBB", "WBWBBWBBWWWWWBWW", "WWWWWBWWWBBWWBWB", "BBBWWWWWBWWWWBBW" };
    String color = "white";
    assertEquals(8, cubism.lines(lattice, color));
  }

  @Test
  public void case75() {
    String[] lattice = { "WBWWBBWWBWBWWWWW", "WWWBWBWBBBBBBWWB", "WWWWWWBBBWBBBBWB", "WBBBWBBBWBWBWBBW" };
    String color = "white";
    assertEquals(10, cubism.lines(lattice, color));
  }

  @Test
  public void case76() {
    String[] lattice = { "WWBWWWBBWBWBBWBW", "BWWBWWBWWBBBWBBW", "WBWWWWBBBWWBWBWW", "BWBWBBBWWBWWBWWW" };
    String color = "white";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case77() {
    String[] lattice = { "WBWBWWWBBWBBWWBW", "WBBWWWBBWBBWWWWB", "WWWWWWWWWWBWBBBB", "BWBBBBWBWWBWBBBW" };
    String color = "black";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case78() {
    String[] lattice = { "BWWWBBWWBWWBBWBB", "WWBBBWWWBWWWBBBW", "BBWWBWBWBWBWWBWB", "WBBWWWBBWBWWWWBW" };
    String color = "white";
    assertEquals(7, cubism.lines(lattice, color));
  }

  @Test
  public void case79() {
    String[] lattice = { "BBBWWWBBBBBWBBWB", "BWBBWWWWBWBBWWWB", "BWWWWWWWBWBWWWBB", "WWWBWBBWWBBWBWWB" };
    String color = "black";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case80() {
    String[] lattice = { "WWBWWWBWBWWBBBWW", "BWWWWBBBWBBWWBWB", "WWWWWWBWBWWWBBBB", "WBBWWBBWBBWWWWWW" };
    String color = "black";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case81() {
    String[] lattice = { "BBBWBWBBBWBBWBWB", "BBWBWBBWWWBWBWBW", "WWBWBBWWWBWBWWBB", "BBWWWWBBWBBBWBWB" };
    String color = "white";
    assertEquals(1, cubism.lines(lattice, color));
  }

  @Test
  public void case82() {
    String[] lattice = { "WWBWWBWBWBWBBBWB", "BWBBWWWWWWBBBWBW", "WBWBBBBBBWWWWBBB", "WBBBBWBBBWWWWBBW" };
    String color = "black";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case83() {
    String[] lattice = { "BWBWBWBBWBBWBBBW", "BBBWWBBBBWWBWBWB", "BWWWBWBBBBWBBWBW", "BBWWBWBWBWWWWWBB" };
    String color = "white";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case84() {
    String[] lattice = { "WWWWWBBBWBBWWWWW", "BWBBBBWWBWWBWBWW", "WWWBWWBWWWWWBBBB", "WBBWBWBBWBWBWBBB" };
    String color = "white";
    assertEquals(8, cubism.lines(lattice, color));
  }

  @Test
  public void case85() {
    String[] lattice = { "WWWBWWWBWWWWWWWW", "WWWWWWWWBBBBBBBB", "BBBWWBBWWBBWWBWB", "WBWBBBBWWBBBWWWB" };
    String color = "white";
    assertEquals(9, cubism.lines(lattice, color));
  }

  @Test
  public void case86() {
    String[] lattice = { "BWWWBWBWWWWBBWBW", "BBWWBWWWWWWBWBWB", "WBWWBWBBBBWWWWBB", "BWWBWWBBBWBWWBWB" };
    String color = "black";
    assertEquals(1, cubism.lines(lattice, color));
  }

  @Test
  public void case87() {
    String[] lattice = { "BWWWWWBWBWBWBWWW", "BWWBWBBBBBBBBWBB", "WWWWWBBWWBWBBBWB", "BWWBBBWBBWBWWBBB" };
    String color = "black";
    assertEquals(6, cubism.lines(lattice, color));
  }

  @Test
  public void case88() {
    String[] lattice = { "WWBBWWBBWBWWBWBB", "WWWWBBBBBBWBBWBB", "BWWBWBWBBWWBBWWB", "BWBBWWBWBWWBBWWW" };
    String color = "black";
    assertEquals(5, cubism.lines(lattice, color));
  }

  @Test
  public void case89() {
    String[] lattice = { "WWWBWWWWWBWBBBBW", "WBBBBWBBWWWWBWBW", "WBBWWBWWWBWWWWWW", "BWBWBWWWWWWBBWWW" };
    String color = "white";
    assertEquals(14, cubism.lines(lattice, color));
  }

  @Test
  public void case90() {
    String[] lattice = { "BBWWWBBBWWWBBWBB", "BWBBWWWWWBWBBWWW", "BBBWWBBWBWWWWBWW", "BBWBBWBBWBWBWBBB" };
    String color = "white";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case91() {
    String[] lattice = { "WWWBWBWWBWBBWWWW", "BWBWBBBWBBBWBBWW", "WWBBWWWBBWWWBBBB", "WBWBWBBWWWWBWWBB" };
    String color = "black";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case92() {
    String[] lattice = { "BBBBWWWWWBWWWBWB", "WBWBWBWBWWWWWBWW", "BBBBWWWWWWWWBWWW", "BWWBWWWBBWWWBBWB" };
    String color = "black";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case93() {
    String[] lattice = { "BWBBWBBWWWWWBWWW", "BWBWBBBWWWBWBBWW", "WWWWWWBBWWBBWBBW", "WWWWBBWWBWBBWBWB" };
    String color = "white";
    assertEquals(9, cubism.lines(lattice, color));
  }

  @Test
  public void case94() {
    String[] lattice = { "BWWWBBBBBWBBWBBB", "WWBBWWWBWWBWWBBW", "BWBWWBWWBWBBBBWW", "WWWBWWBBWBBWBWWB" };
    String color = "black";
    assertEquals(5, cubism.lines(lattice, color));
  }

  @Test
  public void case95() {
    String[] lattice = { "BWBBWBBWBBWBBBWB", "BWBBWWWBBWWWWWBB", "BBWBWBBWBBWWBBBB", "WBBBBBBWWBWWBWBB" };
    String color = "white";
    assertEquals(2, cubism.lines(lattice, color));
  }

  @Test
  public void case96() {
    String[] lattice = { "WWBBBBWWWWBBWWBW", "WBWWBWBWBBWBBWBW", "WWWBBBBBBBBWBBBB", "WWBBBBWBBBBWWWWB" };
    String color = "black";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case97() {
    String[] lattice = { "BWWBWWBWWBBWBBBB", "WBBWWWBBBBBWWWBB", "WWBBWBWBBWBBWBBW", "BBBBWBBBWWBWWBBB" };
    String color = "white";
    assertEquals(1, cubism.lines(lattice, color));
  }

  @Test
  public void case98() {
    String[] lattice = { "BWBWBBWWBBBBWBBB", "BWWWBBBWWWWWBBWB", "BBBBBBBBWBWBBBWW", "BBWBWWWWWBWBBBWB" };
    String color = "white";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case99() {
    String[] lattice = { "WBWWWWBWWWWBWBWB", "BWBWBWWBWBBWWBBB", "WWBWWBBWBBBWWWWW", "BBBBBWBWBBBWWWWW" };
    String color = "black";
    assertEquals(4, cubism.lines(lattice, color));
  }

  @Test
  public void case100() {
    String[] lattice = { "WBBWWWBWBBWWBWBW", "WWBBWBBBWBBWWBWB", "BWBWBWBWBWBWWBBW", "BBBWWWBWBWWWBWBB" };
    String color = "black";
    assertEquals(6, cubism.lines(lattice, color));
  }

  @Test
  public void case101() {
    String[] lattice = { "BBBBBWWWBWWWBWWW", "BWWWWWWWWWWWWWWW", "BWWWWWWWWWWWWWWW", "BWWWWWWWWWWWWWWW" };
    String color = "black";
    assertEquals(3, cubism.lines(lattice, color));
  }

  @Test
  public void case102() {
    String[] lattice = { "WWWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWWW", "WWWWWWWWWWWWWWWW" };
    String color = "white";
    assertEquals(76, cubism.lines(lattice, color));
  }

}
