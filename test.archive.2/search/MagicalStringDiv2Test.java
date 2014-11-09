package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class MagicalStringDiv2Test {
  MagicalStringDiv2 magicalstringdiv2 = new MagicalStringDiv2();

  @Test
  public void case1() {
    String S = ">><<><";
    assertEquals(2, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case2() {
    String S = ">>>><<<<";
    assertEquals(0, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case3() {
    String S = "<<>>";
    assertEquals(4, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case4() {
    String S = "<><<<>>>>><<>>>>><>><<<>><><><><<><<<<<><<>>><><><";
    assertEquals(20, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case5() {
    String S = "><";
    assertEquals(0, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case6() {
    String S = "<<";
    assertEquals(1, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case7() {
    String S = "<><>";
    assertEquals(2, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case8() {
    String S = "<<<<";
    assertEquals(2, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case9() {
    String S = "<><>>>";
    assertEquals(5, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case10() {
    String S = ">>>><<";
    assertEquals(1, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case11() {
    String S = "<<><>><<";
    assertEquals(5, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case12() {
    String S = "<<<>><>>";
    assertEquals(6, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case13() {
    String S = ">><>>>>><>";
    assertEquals(5, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case14() {
    String S = ">>>><<><><";
    assertEquals(3, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case15() {
    String S = "<><>>>>>>>>>";
    assertEquals(8, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case16() {
    String S = "<>><>><<><><";
    assertEquals(4, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case17() {
    String S = "><><<<>>";
    assertEquals(4, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case18() {
    String S = ">>>>><><><>><>>>><><<<";
    assertEquals(9, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case19() {
    String S = ">><<<>><<>><";
    assertEquals(6, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case20() {
    String S = "><><<><<<<><><<>><";
    assertEquals(10, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case21() {
    String S = "<<<>><><>><<>>><><>>><<>>>><>>><<<";
    assertEquals(18, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case22() {
    String S = "<<>>><>><>>>><<<<>><<<<><<><<<<<><<<<>>>>><><<";
    assertEquals(21, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case23() {
    String S = "><<><>><>>><><>>><<><>><<><<><>>>><>><";
    assertEquals(19, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case24() {
    String S = "<><>><><><<<<<>>><<><>><><<>><><<<>>>><>><><>><><>";
    assertEquals(27, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case25() {
    String S = "><<<><<>><><<<<<><>>><<>><>><<>><<><<><>>><<><><<>";
    assertEquals(26, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case26() {
    String S = "<<>>><>><>>>>>>>><<><>><<<><>><<";
    assertEquals(11, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case27() {
    String S = "<<<<<<<<<<<<<<>>>>>>>>>>>>>>";
    assertEquals(28, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case28() {
    String S = "<<<>><><<>><><<>";
    assertEquals(9, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case29() {
    String S = "<<<<<>>>>>";
    assertEquals(10, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case30() {
    String S = "><<<><<><<<<<<";
    assertEquals(6, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case31() {
    String S = "<<><<<<>><<<<<<><>>><><><>";
    assertEquals(17, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case32() {
    String S = "><<<><>><><><<<>><>><<";
    assertEquals(11, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case33() {
    String S = "<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>";
    assertEquals(48, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case34() {
    String S = ">>><>>>>><><><<<<><>><<<><";
    assertEquals(7, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case35() {
    String S = "<>>><<<<<<>><<><><><<><<";
    assertEquals(11, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case36() {
    String S = ">>>>>>>>><<>";
    assertEquals(4, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case37() {
    String S = ">><<>><<><<<<<>>>>><>>><><<><<<<<<<><>";
    assertEquals(16, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case38() {
    String S = "<<<>><<<";
    assertEquals(4, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case39() {
    String S = "><>><<><<><<<>><<<>>><<<<>><<<><<>>><<";
    assertEquals(19, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case40() {
    String S = "<><<<><>>>><<<<><>><";
    assertEquals(9, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case41() {
    String S = "<<<>>>><<<>>>>><><><<<<<<>><<>><<<>>><><>><><>><><";
    assertEquals(28, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case42() {
    String S = ">><>><<<>><><><>>><<>><<<<>><<>>><><<<>>>><<<><<>>";
    assertEquals(25, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case43() {
    String S = "<>>>>>><<<<<><><><><<><>>><<><<<>><<>><<<>>><<<><<";
    assertEquals(22, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case44() {
    String S = "<><<>>><<><><><><<<><>>><<>><<<><<>><><<>>><<>><<<";
    assertEquals(24, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case45() {
    String S = ">>><<>><><<><<<<><<<<<<>><>><><<<<<>><<<<><<><><<>";
    assertEquals(24, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case46() {
    String S = "<<<<<><<<<<><>><<<><<>><<<><><><><><>><><><<><<><>";
    assertEquals(30, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case47() {
    String S = "<><><<><><<><><>><<><<><<<><>><<><<<>><<<<><<<><<>";
    assertEquals(24, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case48() {
    String S = ">><<><><>>><<<<<>><><<<<><<><><<<><><><>><<>>>><<<";
    assertEquals(25, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case49() {
    String S = "><<><<><><<<<<>>>>><><><<><<>>><><>><><><>><<<<>>>";
    assertEquals(28, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case50() {
    String S = "<>><<><><><<><><<>><><<>><<><><<<<<<<>>><<><<><<>>";
    assertEquals(22, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case51() {
    String S = "<><><><<><><<><<><<<>><<><<><>><<<>><><>><<>><<<<>";
    assertEquals(26, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case52() {
    String S = ">>><<<><><<>>>>><<<><><>><<>><<<><><><<>><<><><<<>";
    assertEquals(21, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case53() {
    String S = "<>>><<<><><>>><>>>>><>><<><<<><><<>><>><<><>>><><>";
    assertEquals(23, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case54() {
    String S = ">><><>><<><><<<<>>>><><>>>>>>>>><><<<<>><>><<><<><";
    assertEquals(25, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case55() {
    String S = "><>>><>><<><>>>><><>>>><<<<<<<><<<><<>>><>>>><<<<<";
    assertEquals(18, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case56() {
    String S = "<<<<>>>><><>>>><><<><<<>>>><><<>><<><<<<<<><<>>>><";
    assertEquals(23, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case57() {
    String S = ">>";
    assertEquals(1, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case58() {
    String S = ">>>>";
    assertEquals(2, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case59() {
    String S = ">>><";
    assertEquals(1, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case60() {
    String S = ">>>>>>>>";
    assertEquals(4, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case61() {
    String S = "<<<>>>";
    assertEquals(6, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case62() {
    String S = "><<>>>";
    assertEquals(5, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case63() {
    String S = "<><><>";
    assertEquals(4, magicalstringdiv2.minimalMoves(S));
  }

  @Test
  public void case64() {
    String S = "<<<<<<<>>>>>>>";
    assertEquals(14, magicalstringdiv2.minimalMoves(S));
  }

}
