package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TheEasyChaseTest {
  TheEasyChase theeasychase = new TheEasyChase();

  @Test
  public void case1() {
    int n = 2;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 2;
    int colBlack = 2;
    assertEquals("BLACK 2", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case2() {
    int n = 2;
    int rowWhite = 2;
    int colWhite = 2;
    int rowBlack = 1;
    int colBlack = 2;
    assertEquals("WHITE 1", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case3() {
    int n = 3;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 3;
    int colBlack = 3;
    assertEquals("BLACK 6", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case4() {
    int n = 3;
    int rowWhite = 3;
    int colWhite = 2;
    int rowBlack = 1;
    int colBlack = 1;
    assertEquals("BLACK 8", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case5() {
    int n = 3;
    int rowWhite = 1;
    int colWhite = 2;
    int rowBlack = 3;
    int colBlack = 1;
    assertEquals("BLACK 8", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case6() {
    int n = 3;
    int rowWhite = 2;
    int colWhite = 2;
    int rowBlack = 3;
    int colBlack = 1;
    assertEquals("BLACK 6", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case7() {
    int n = 8;
    int rowWhite = 5;
    int colWhite = 4;
    int rowBlack = 1;
    int colBlack = 1;
    assertEquals("BLACK 22", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case8() {
    int n = 8;
    int rowWhite = 5;
    int colWhite = 1;
    int rowBlack = 7;
    int colBlack = 3;
    assertEquals("BLACK 14", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case9() {
    int n = 8;
    int rowWhite = 6;
    int colWhite = 4;
    int rowBlack = 6;
    int colBlack = 5;
    assertEquals("WHITE 1", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case10() {
    int n = 4;
    int rowWhite = 3;
    int colWhite = 2;
    int rowBlack = 1;
    int colBlack = 3;
    assertEquals("BLACK 8", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case11() {
    int n = 16;
    int rowWhite = 9;
    int colWhite = 13;
    int rowBlack = 5;
    int colBlack = 1;
    assertEquals("BLACK 42", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case12() {
    int n = 15;
    int rowWhite = 13;
    int colWhite = 12;
    int rowBlack = 6;
    int colBlack = 13;
    assertEquals("BLACK 36", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case13() {
    int n = 15;
    int rowWhite = 7;
    int colWhite = 5;
    int rowBlack = 7;
    int colBlack = 11;
    assertEquals("BLACK 30", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case14() {
    int n = 12;
    int rowWhite = 7;
    int colWhite = 1;
    int rowBlack = 6;
    int colBlack = 7;
    assertEquals("BLACK 20", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case15() {
    int n = 16;
    int rowWhite = 3;
    int colWhite = 9;
    int rowBlack = 12;
    int colBlack = 5;
    assertEquals("BLACK 36", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case16() {
    int n = 15;
    int rowWhite = 10;
    int colWhite = 4;
    int rowBlack = 4;
    int colBlack = 8;
    assertEquals("BLACK 30", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case17() {
    int n = 14;
    int rowWhite = 1;
    int colWhite = 7;
    int rowBlack = 3;
    int colBlack = 1;
    assertEquals("BLACK 28", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case18() {
    int n = 11;
    int rowWhite = 5;
    int colWhite = 4;
    int rowBlack = 9;
    int colBlack = 4;
    assertEquals("BLACK 24", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case19() {
    int n = 18;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 9;
    int colBlack = 9;
    assertEquals("BLACK 30", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case20() {
    int n = 10;
    int rowWhite = 9;
    int colWhite = 7;
    int rowBlack = 7;
    int colBlack = 10;
    assertEquals("BLACK 20", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case21() {
    int n = 17;
    int rowWhite = 2;
    int colWhite = 2;
    int rowBlack = 1;
    int colBlack = 1;
    assertEquals("BLACK 34", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case22() {
    int n = 15;
    int rowWhite = 2;
    int colWhite = 2;
    int rowBlack = 1;
    int colBlack = 1;
    assertEquals("BLACK 30", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case23() {
    int n = 19;
    int rowWhite = 2;
    int colWhite = 2;
    int rowBlack = 1;
    int colBlack = 1;
    assertEquals("BLACK 38", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case24() {
    int n = 20;
    int rowWhite = 19;
    int colWhite = 2;
    int rowBlack = 20;
    int colBlack = 1;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case25() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 20;
    int rowBlack = 20;
    int colBlack = 1;
    assertEquals("BLACK 56", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case26() {
    int n = 19;
    int rowWhite = 1;
    int colWhite = 19;
    int rowBlack = 19;
    int colBlack = 1;
    assertEquals("BLACK 54", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case27() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 19;
    int colBlack = 20;
    assertEquals("BLACK 56", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case28() {
    int n = 20;
    int rowWhite = 11;
    int colWhite = 11;
    int rowBlack = 1;
    int colBlack = 1;
    assertEquals("BLACK 58", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case29() {
    int n = 20;
    int rowWhite = 20;
    int colWhite = 19;
    int rowBlack = 1;
    int colBlack = 1;
    assertEquals("BLACK 58", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case30() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 17;
    int rowBlack = 5;
    int colBlack = 9;
    assertEquals("BLACK 46", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case31() {
    int n = 20;
    int rowWhite = 8;
    int colWhite = 12;
    int rowBlack = 11;
    int colBlack = 13;
    assertEquals("BLACK 42", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case32() {
    int n = 20;
    int rowWhite = 7;
    int colWhite = 5;
    int rowBlack = 17;
    int colBlack = 11;
    assertEquals("BLACK 46", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case33() {
    int n = 20;
    int rowWhite = 19;
    int colWhite = 9;
    int rowBlack = 14;
    int colBlack = 11;
    assertEquals("BLACK 28", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case34() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 2;
    int rowBlack = 1;
    int colBlack = 20;
    assertEquals("BLACK 58", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case35() {
    int n = 19;
    int rowWhite = 1;
    int colWhite = 2;
    int rowBlack = 19;
    int colBlack = 19;
    assertEquals("BLACK 56", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case36() {
    int n = 18;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 1;
    int colBlack = 18;
    assertEquals("BLACK 52", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case37() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 10;
    int colBlack = 10;
    assertEquals("BLACK 34", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case38() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 20;
    int colBlack = 20;
    assertEquals("BLACK 56", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case39() {
    int n = 20;
    int rowWhite = 7;
    int colWhite = 14;
    int rowBlack = 19;
    int colBlack = 2;
    assertEquals("BLACK 54", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case40() {
    int n = 5;
    int rowWhite = 5;
    int colWhite = 5;
    int rowBlack = 4;
    int colBlack = 4;
    assertEquals("BLACK 2", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case41() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 20;
    int colBlack = 19;
    assertEquals("BLACK 56", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case42() {
    int n = 19;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 17;
    int colBlack = 18;
    assertEquals("BLACK 50", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case43() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 2;
    int rowBlack = 20;
    int colBlack = 18;
    assertEquals("BLACK 54", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case44() {
    int n = 19;
    int rowWhite = 2;
    int colWhite = 9;
    int rowBlack = 19;
    int colBlack = 1;
    assertEquals("BLACK 56", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case45() {
    int n = 20;
    int rowWhite = 5;
    int colWhite = 7;
    int rowBlack = 17;
    int colBlack = 19;
    assertEquals("BLACK 54", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case46() {
    int n = 19;
    int rowWhite = 1;
    int colWhite = 3;
    int rowBlack = 17;
    int colBlack = 17;
    assertEquals("BLACK 50", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case47() {
    int n = 20;
    int rowWhite = 2;
    int colWhite = 2;
    int rowBlack = 4;
    int colBlack = 3;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case48() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 20;
    int rowBlack = 1;
    int colBlack = 2;
    assertEquals("BLACK 56", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case49() {
    int n = 20;
    int rowWhite = 10;
    int colWhite = 10;
    int rowBlack = 10;
    int colBlack = 12;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case50() {
    int n = 20;
    int rowWhite = 2;
    int colWhite = 5;
    int rowBlack = 11;
    int colBlack = 17;
    assertEquals("BLACK 44", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case51() {
    int n = 19;
    int rowWhite = 2;
    int colWhite = 5;
    int rowBlack = 5;
    int colBlack = 7;
    assertEquals("BLACK 36", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case52() {
    int n = 20;
    int rowWhite = 2;
    int colWhite = 3;
    int rowBlack = 20;
    int colBlack = 20;
    assertEquals("BLACK 58", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case53() {
    int n = 20;
    int rowWhite = 18;
    int colWhite = 19;
    int rowBlack = 2;
    int colBlack = 1;
    assertEquals("BLACK 56", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case54() {
    int n = 5;
    int rowWhite = 2;
    int colWhite = 1;
    int rowBlack = 5;
    int colBlack = 3;
    assertEquals("BLACK 8", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case55() {
    int n = 10;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 3;
    int colBlack = 2;
    assertEquals("BLACK 20", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case56() {
    int n = 6;
    int rowWhite = 6;
    int colWhite = 3;
    int rowBlack = 2;
    int colBlack = 2;
    assertEquals("BLACK 12", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case57() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 19;
    int colBlack = 17;
    assertEquals("BLACK 54", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case58() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 10;
    int colBlack = 20;
    assertEquals("BLACK 48", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case59() {
    int n = 20;
    int rowWhite = 4;
    int colWhite = 7;
    int rowBlack = 18;
    int colBlack = 17;
    assertEquals("BLACK 52", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case60() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 2;
    int colBlack = 3;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case61() {
    int n = 20;
    int rowWhite = 5;
    int colWhite = 6;
    int rowBlack = 3;
    int colBlack = 4;
    assertEquals("BLACK 46", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case62() {
    int n = 19;
    int rowWhite = 3;
    int colWhite = 4;
    int rowBlack = 19;
    int colBlack = 18;
    assertEquals("BLACK 52", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case63() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 2;
    int colBlack = 4;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case64() {
    int n = 20;
    int rowWhite = 2;
    int colWhite = 2;
    int rowBlack = 1;
    int colBlack = 1;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case65() {
    int n = 6;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 5;
    int colBlack = 6;
    assertEquals("BLACK 14", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case66() {
    int n = 20;
    int rowWhite = 19;
    int colWhite = 20;
    int rowBlack = 1;
    int colBlack = 1;
    assertEquals("BLACK 58", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case67() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 10;
    int colBlack = 19;
    assertEquals("BLACK 48", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case68() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 17;
    int colBlack = 19;
    assertEquals("BLACK 54", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case69() {
    int n = 3;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 3;
    int colBlack = 2;
    assertEquals("BLACK 6", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case70() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 1;
    int colBlack = 4;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case71() {
    int n = 20;
    int rowWhite = 20;
    int colWhite = 20;
    int rowBlack = 17;
    int colBlack = 18;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case72() {
    int n = 19;
    int rowWhite = 1;
    int colWhite = 8;
    int rowBlack = 10;
    int colBlack = 17;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case73() {
    int n = 20;
    int rowWhite = 2;
    int colWhite = 20;
    int rowBlack = 20;
    int colBlack = 19;
    assertEquals("BLACK 54", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case74() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 3;
    int colBlack = 2;
    assertEquals("BLACK 40", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case75() {
    int n = 20;
    int rowWhite = 2;
    int colWhite = 6;
    int rowBlack = 11;
    int colBlack = 19;
    assertEquals("BLACK 46", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case76() {
    int n = 20;
    int rowWhite = 2;
    int colWhite = 3;
    int rowBlack = 18;
    int colBlack = 17;
    assertEquals("BLACK 52", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case77() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 19;
    int colBlack = 18;
    assertEquals("BLACK 54", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case78() {
    int n = 20;
    int rowWhite = 4;
    int colWhite = 15;
    int rowBlack = 4;
    int colBlack = 5;
    assertEquals("BLACK 48", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case79() {
    int n = 20;
    int rowWhite = 17;
    int colWhite = 3;
    int rowBlack = 1;
    int colBlack = 8;
    assertEquals("BLACK 50", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case80() {
    int n = 20;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 3;
    int colBlack = 3;
    assertEquals("BLACK 6", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case81() {
    int n = 20;
    int rowWhite = 20;
    int colWhite = 20;
    int rowBlack = 20;
    int colBlack = 19;
    assertEquals("WHITE 1", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case82() {
    int n = 9;
    int rowWhite = 4;
    int colWhite = 4;
    int rowBlack = 6;
    int colBlack = 4;
    assertEquals("BLACK 18", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case83() {
    int n = 20;
    int rowWhite = 2;
    int colWhite = 3;
    int rowBlack = 13;
    int colBlack = 19;
    assertEquals("BLACK 48", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case84() {
    int n = 20;
    int rowWhite = 2;
    int colWhite = 3;
    int rowBlack = 19;
    int colBlack = 20;
    assertEquals("BLACK 56", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

  @Test
  public void case85() {
    int n = 3;
    int rowWhite = 1;
    int colWhite = 1;
    int rowBlack = 2;
    int colBlack = 3;
    assertEquals("BLACK 6", theeasychase.winner(n, rowWhite, colWhite, rowBlack, colBlack));
  }

}
