package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PowerGameTest {
  PowerGame powergame = new PowerGame();

  @Test
  public void case1() {
    int size0 = 10000;
    int size1 = 10000;
    assertEquals("Alan will win after 1 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case2() {
    int size0 = 4;
    int size1 = 9;
    assertEquals("Alan will win after 1 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case3() {
    int size0 = 4;
    int size1 = 3;
    assertEquals("Alan will win after 1 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case4() {
    int size0 = 2;
    int size1 = 3;
    assertEquals("Bob will win after 2 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case5() {
    int size0 = 7;
    int size1 = 13;
    assertEquals("Bob will win after 4 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case6() {
    int size0 = 2136;
    int size1 = 1244;
    assertEquals("Alan will win after 7 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case7() {
    int size0 = 3;
    int size1 = 5;
    assertEquals("Bob will win after 2 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case8() {
    int size0 = 1;
    int size1 = 1;
    assertEquals("Alan will win after 1 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case9() {
    int size0 = 1;
    int size1 = 10000;
    assertEquals("Alan will win after 1 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case10() {
    int size0 = 28;
    int size1 = 17;
    assertEquals("Alan will win after 7 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case11() {
    int size0 = 884;
    int size1 = 5521;
    assertEquals("Alan will win after 15 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case12() {
    int size0 = 9113;
    int size1 = 2842;
    assertEquals("Alan will win after 23 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case13() {
    int size0 = 6673;
    int size1 = 8111;
    assertEquals("Alan will win after 25 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case14() {
    int size0 = 24;
    int size1 = 9019;
    assertEquals("Alan will win after 5 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case15() {
    int size0 = 502;
    int size1 = 213;
    assertEquals("Alan will win after 9 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case16() {
    int size0 = 9999;
    int size1 = 9999;
    assertEquals("Alan will win after 31 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case17() {
    int size0 = 9112;
    int size1 = 9112;
    assertEquals("Alan will win after 21 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case18() {
    int size0 = 7172;
    int size1 = 42;
    assertEquals("Alan will win after 9 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case19() {
    int size0 = 8806;
    int size1 = 9753;
    assertEquals("Alan will win after 31 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case20() {
    int size0 = 2224;
    int size1 = 5813;
    assertEquals("Alan will win after 5 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case21() {
    int size0 = 8444;
    int size1 = 8444;
    assertEquals("Alan will win after 35 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case22() {
    int size0 = 9013;
    int size1 = 9017;
    assertEquals("Alan will win after 15 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case23() {
    int size0 = 46;
    int size1 = 47;
    assertEquals("Alan will win after 5 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case24() {
    int size0 = 883;
    int size1 = 7721;
    assertEquals("Alan will win after 17 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case25() {
    int size0 = 2;
    int size1 = 2;
    assertEquals("Bob will win after 2 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case26() {
    int size0 = 3;
    int size1 = 3;
    assertEquals("Alan will win after 3 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case27() {
    int size0 = 4;
    int size1 = 4;
    assertEquals("Alan will win after 1 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case28() {
    int size0 = 5;
    int size1 = 5;
    assertEquals("Bob will win after 2 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case29() {
    int size0 = 99;
    int size1 = 99;
    assertEquals("Alan will win after 13 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case30() {
    int size0 = 4234;
    int size1 = 3852;
    assertEquals("Alan will win after 17 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case31() {
    int size0 = 515;
    int size1 = 61;
    assertEquals("Alan will win after 7 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case32() {
    int size0 = 8;
    int size1 = 8887;
    assertEquals("Alan will win after 5 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case33() {
    int size0 = 6642;
    int size1 = 6642;
    assertEquals("Bob will win after 40 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case34() {
    int size0 = 4009;
    int size1 = 4009;
    assertEquals("Alan will win after 29 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case35() {
    int size0 = 4567;
    int size1 = 8671;
    assertEquals("Alan will win after 9 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case36() {
    int size0 = 8999;
    int size1 = 9999;
    assertEquals("Alan will win after 19 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case37() {
    int size0 = 4563;
    int size1 = 2314;
    assertEquals("Alan will win after 5 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case38() {
    int size0 = 3454;
    int size1 = 4456;
    assertEquals("Alan will win after 31 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case39() {
    int size0 = 9563;
    int size1 = 8914;
    assertEquals("Alan will win after 25 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case40() {
    int size0 = 9000;
    int size1 = 8999;
    assertEquals("Alan will win after 19 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case41() {
    int size0 = 9876;
    int size1 = 1234;
    assertEquals("Alan will win after 15 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case42() {
    int size0 = 9456;
    int size1 = 8754;
    assertEquals("Alan will win after 21 moves", powergame.winner(size0, size1));
  }

  @Test
  public void case43() {
    int size0 = 10;
    int size1 = 10;
    assertEquals("Bob will win after 4 moves", powergame.winner(size0, size1));
  }

}
