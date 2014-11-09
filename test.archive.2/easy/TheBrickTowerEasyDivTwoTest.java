package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TheBrickTowerEasyDivTwoTest {
  TheBrickTowerEasyDivTwo thebricktowereasydivtwo = new TheBrickTowerEasyDivTwo();

  @Test
  public void case1() {
    int redCount = 1;
    int redHeight = 2;
    int blueCount = 3;
    int blueHeight = 4;
    assertEquals(4, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case2() {
    int redCount = 4;
    int redHeight = 4;
    int blueCount = 4;
    int blueHeight = 7;
    assertEquals(12, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case3() {
    int redCount = 7;
    int redHeight = 7;
    int blueCount = 4;
    int blueHeight = 4;
    assertEquals(13, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case4() {
    int redCount = 47;
    int redHeight = 47;
    int blueCount = 47;
    int blueHeight = 47;
    assertEquals(94, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case5() {
    int redCount = 1;
    int redHeight = 1;
    int blueCount = 1;
    int blueHeight = 1;
    assertEquals(2, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case6() {
    int redCount = 1;
    int redHeight = 41;
    int blueCount = 1;
    int blueHeight = 1;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case7() {
    int redCount = 1;
    int redHeight = 4;
    int blueCount = 2;
    int blueHeight = 4;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case8() {
    int redCount = 1;
    int redHeight = 1;
    int blueCount = 2;
    int blueHeight = 1;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case9() {
    int redCount = 1;
    int redHeight = 3;
    int blueCount = 3;
    int blueHeight = 3;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case10() {
    int redCount = 1;
    int redHeight = 38;
    int blueCount = 3;
    int blueHeight = 1;
    assertEquals(4, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case11() {
    int redCount = 2;
    int redHeight = 34;
    int blueCount = 1;
    int blueHeight = 34;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case12() {
    int redCount = 2;
    int redHeight = 14;
    int blueCount = 1;
    int blueHeight = 4;
    assertEquals(4, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case13() {
    int redCount = 2;
    int redHeight = 4;
    int blueCount = 2;
    int blueHeight = 4;
    assertEquals(4, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case14() {
    int redCount = 2;
    int redHeight = 33;
    int blueCount = 2;
    int blueHeight = 46;
    assertEquals(6, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case15() {
    int redCount = 2;
    int redHeight = 26;
    int blueCount = 3;
    int blueHeight = 26;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case16() {
    int redCount = 2;
    int redHeight = 40;
    int blueCount = 3;
    int blueHeight = 1;
    assertEquals(7, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case17() {
    int redCount = 3;
    int redHeight = 8;
    int blueCount = 1;
    int blueHeight = 8;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case18() {
    int redCount = 3;
    int redHeight = 43;
    int blueCount = 1;
    int blueHeight = 46;
    assertEquals(4, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case19() {
    int redCount = 3;
    int redHeight = 47;
    int blueCount = 2;
    int blueHeight = 47;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case20() {
    int redCount = 3;
    int redHeight = 3;
    int blueCount = 2;
    int blueHeight = 41;
    assertEquals(7, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case21() {
    int redCount = 3;
    int redHeight = 35;
    int blueCount = 3;
    int blueHeight = 35;
    assertEquals(6, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case22() {
    int redCount = 3;
    int redHeight = 47;
    int blueCount = 3;
    int blueHeight = 11;
    assertEquals(9, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case23() {
    int redCount = 47;
    int redHeight = 24;
    int blueCount = 47;
    int blueHeight = 8;
    assertEquals(141, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case24() {
    int redCount = 1;
    int redHeight = 13;
    int blueCount = 1;
    int blueHeight = 1;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case25() {
    int redCount = 8;
    int redHeight = 46;
    int blueCount = 9;
    int blueHeight = 6;
    assertEquals(25, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case26() {
    int redCount = 47;
    int redHeight = 38;
    int blueCount = 47;
    int blueHeight = 38;
    assertEquals(94, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case27() {
    int redCount = 45;
    int redHeight = 10;
    int blueCount = 45;
    int blueHeight = 4;
    assertEquals(135, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case28() {
    int redCount = 34;
    int redHeight = 5;
    int blueCount = 33;
    int blueHeight = 5;
    assertEquals(67, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case29() {
    int redCount = 31;
    int redHeight = 45;
    int blueCount = 30;
    int blueHeight = 45;
    assertEquals(61, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case30() {
    int redCount = 34;
    int redHeight = 21;
    int blueCount = 33;
    int blueHeight = 47;
    assertEquals(100, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case31() {
    int redCount = 10;
    int redHeight = 47;
    int blueCount = 47;
    int blueHeight = 47;
    assertEquals(21, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case32() {
    int redCount = 2;
    int redHeight = 47;
    int blueCount = 2;
    int blueHeight = 47;
    assertEquals(4, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case33() {
    int redCount = 1;
    int redHeight = 1;
    int blueCount = 2;
    int blueHeight = 47;
    assertEquals(4, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case34() {
    int redCount = 1;
    int redHeight = 47;
    int blueCount = 46;
    int blueHeight = 1;
    assertEquals(4, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case35() {
    int redCount = 32;
    int redHeight = 4;
    int blueCount = 31;
    int blueHeight = 4;
    assertEquals(63, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case36() {
    int redCount = 47;
    int redHeight = 45;
    int blueCount = 40;
    int blueHeight = 3;
    assertEquals(121, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case37() {
    int redCount = 3;
    int redHeight = 46;
    int blueCount = 4;
    int blueHeight = 46;
    assertEquals(7, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case38() {
    int redCount = 18;
    int redHeight = 16;
    int blueCount = 47;
    int blueHeight = 1;
    assertEquals(55, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case39() {
    int redCount = 47;
    int redHeight = 46;
    int blueCount = 31;
    int blueHeight = 46;
    assertEquals(63, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case40() {
    int redCount = 22;
    int redHeight = 47;
    int blueCount = 21;
    int blueHeight = 47;
    assertEquals(43, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case41() {
    int redCount = 35;
    int redHeight = 46;
    int blueCount = 1;
    int blueHeight = 46;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case42() {
    int redCount = 2;
    int redHeight = 1;
    int blueCount = 3;
    int blueHeight = 1;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case43() {
    int redCount = 42;
    int redHeight = 47;
    int blueCount = 19;
    int blueHeight = 47;
    assertEquals(39, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case44() {
    int redCount = 14;
    int redHeight = 2;
    int blueCount = 2;
    int blueHeight = 2;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case45() {
    int redCount = 37;
    int redHeight = 1;
    int blueCount = 4;
    int blueHeight = 1;
    assertEquals(9, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case46() {
    int redCount = 39;
    int redHeight = 2;
    int blueCount = 2;
    int blueHeight = 2;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case47() {
    int redCount = 5;
    int redHeight = 10;
    int blueCount = 6;
    int blueHeight = 9;
    assertEquals(16, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case48() {
    int redCount = 20;
    int redHeight = 1;
    int blueCount = 20;
    int blueHeight = 1;
    assertEquals(40, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case49() {
    int redCount = 47;
    int redHeight = 47;
    int blueCount = 46;
    int blueHeight = 46;
    assertEquals(139, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case50() {
    int redCount = 46;
    int redHeight = 44;
    int blueCount = 26;
    int blueHeight = 47;
    assertEquals(79, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case51() {
    int redCount = 1;
    int redHeight = 2;
    int blueCount = 1;
    int blueHeight = 2;
    assertEquals(2, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case52() {
    int redCount = 1;
    int redHeight = 3;
    int blueCount = 2;
    int blueHeight = 4;
    assertEquals(4, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case53() {
    int redCount = 40;
    int redHeight = 2;
    int blueCount = 2;
    int blueHeight = 2;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case54() {
    int redCount = 4;
    int redHeight = 5;
    int blueCount = 2;
    int blueHeight = 5;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case55() {
    int redCount = 1;
    int redHeight = 4;
    int blueCount = 3;
    int blueHeight = 4;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case56() {
    int redCount = 3;
    int redHeight = 4;
    int blueCount = 4;
    int blueHeight = 4;
    assertEquals(7, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case57() {
    int redCount = 2;
    int redHeight = 2;
    int blueCount = 1;
    int blueHeight = 2;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case58() {
    int redCount = 7;
    int redHeight = 1;
    int blueCount = 2;
    int blueHeight = 1;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case59() {
    int redCount = 10;
    int redHeight = 10;
    int blueCount = 9;
    int blueHeight = 10;
    assertEquals(19, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case60() {
    int redCount = 2;
    int redHeight = 1;
    int blueCount = 6;
    int blueHeight = 1;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case61() {
    int redCount = 10;
    int redHeight = 10;
    int blueCount = 1;
    int blueHeight = 10;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case62() {
    int redCount = 1;
    int redHeight = 5;
    int blueCount = 10;
    int blueHeight = 5;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case63() {
    int redCount = 3;
    int redHeight = 5;
    int blueCount = 5;
    int blueHeight = 5;
    assertEquals(7, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case64() {
    int redCount = 1;
    int redHeight = 1;
    int blueCount = 10;
    int blueHeight = 1;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case65() {
    int redCount = 3;
    int redHeight = 1;
    int blueCount = 2;
    int blueHeight = 1;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case66() {
    int redCount = 1;
    int redHeight = 2;
    int blueCount = 2;
    int blueHeight = 2;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case67() {
    int redCount = 5;
    int redHeight = 4;
    int blueCount = 3;
    int blueHeight = 4;
    assertEquals(7, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case68() {
    int redCount = 1;
    int redHeight = 47;
    int blueCount = 47;
    int blueHeight = 47;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case69() {
    int redCount = 2;
    int redHeight = 3;
    int blueCount = 4;
    int blueHeight = 3;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case70() {
    int redCount = 42;
    int redHeight = 43;
    int blueCount = 47;
    int blueHeight = 43;
    assertEquals(85, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case71() {
    int redCount = 2;
    int redHeight = 3;
    int blueCount = 4;
    int blueHeight = 4;
    assertEquals(7, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case72() {
    int redCount = 47;
    int redHeight = 1;
    int blueCount = 1;
    int blueHeight = 1;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case73() {
    int redCount = 2;
    int redHeight = 5;
    int blueCount = 40;
    int blueHeight = 5;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case74() {
    int redCount = 2;
    int redHeight = 2;
    int blueCount = 3;
    int blueHeight = 2;
    assertEquals(5, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case75() {
    int redCount = 1;
    int redHeight = 1;
    int blueCount = 1;
    int blueHeight = 3;
    assertEquals(3, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case76() {
    int redCount = 3;
    int redHeight = 10;
    int blueCount = 4;
    int blueHeight = 10;
    assertEquals(7, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

  @Test
  public void case77() {
    int redCount = 4;
    int redHeight = 47;
    int blueCount = 8;
    int blueHeight = 47;
    assertEquals(9, thebricktowereasydivtwo.find(redCount, redHeight, blueCount, blueHeight));
  }

}
