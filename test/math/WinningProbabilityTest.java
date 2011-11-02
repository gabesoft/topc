package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class WinningProbabilityTest {
  double DELTA = 1.0e-09;
  WinningProbability winningprobability = new WinningProbability();

  @Test
  public void case1() {
    int prevWins = 2;
    int prevLosses = 0;
    int gamesLeft = 1;
    int mustWin = 1;
    assertEquals(0.75, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.75);
  }

  @Test
  public void case2() {
    int prevWins = 0;
    int prevLosses = 3;
    int gamesLeft = 4;
    int mustWin = 4;
    assertEquals(0.0142857142857, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.0142857142857);
  }

  @Test
  public void case3() {
    int prevWins = 20;
    int prevLosses = 3;
    int gamesLeft = 5;
    int mustWin = 1;
    assertEquals(0.9995284409077, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.9995284409077);
  }

  @Test
  public void case4() {
    int prevWins = 0;
    int prevLosses = 20;
    int gamesLeft = 1;
    int mustWin = 1;
    assertEquals(0.0454545454545, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.0454545454545);
  }

  @Test
  public void case5() {
    int prevWins = 0;
    int prevLosses = 0;
    int gamesLeft = 1;
    int mustWin = 1;
    assertEquals(0.5, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.5);
  }

  @Test
  public void case6() {
    int prevWins = 100;
    int prevLosses = 99;
    int gamesLeft = 7;
    int mustWin = 4;
    assertEquals(0.5053622927646, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.5053622927646);
  }

  @Test
  public void case7() {
    int prevWins = 0;
    int prevLosses = 100;
    int gamesLeft = 15;
    int mustWin = 1;
    assertEquals(0.1293103448276, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.1293103448276);
  }

  @Test
  public void case8() {
    int prevWins = 20;
    int prevLosses = 20;
    int gamesLeft = 4;
    int mustWin = 2;
    assertEquals(0.6790697674418, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.6790697674418);
  }

  @Test
  public void case9() {
    int prevWins = 78;
    int prevLosses = 54;
    int gamesLeft = 12;
    int mustWin = 3;
    assertEquals(0.9950934183886, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.9950934183886);
  }

  @Test
  public void case10() {
    int prevWins = 100;
    int prevLosses = 77;
    int gamesLeft = 4;
    int mustWin = 4;
    assertEquals(0.1039720508716, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.1039720508716);
  }

  @Test
  public void case11() {
    int prevWins = 90;
    int prevLosses = 80;
    int gamesLeft = 2;
    int mustWin = 2;
    assertEquals(0.2813550208361, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.2813550208361);
  }

  @Test
  public void case12() {
    int prevWins = 41;
    int prevLosses = 25;
    int gamesLeft = 9;
    int mustWin = 7;
    assertEquals(0.2812915191208, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.2812915191208);
  }

  @Test
  public void case13() {
    int prevWins = 49;
    int prevLosses = 6;
    int gamesLeft = 3;
    int mustWin = 2;
    assertEquals(0.9543511027715, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.9543511027715);
  }

  @Test
  public void case14() {
    int prevWins = 47;
    int prevLosses = 74;
    int gamesLeft = 10;
    int mustWin = 6;
    assertEquals(0.1595323998988, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.1595323998988);
  }

  @Test
  public void case15() {
    int prevWins = 96;
    int prevLosses = 41;
    int gamesLeft = 11;
    int mustWin = 7;
    assertEquals(0.7775095151468, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.7775095151468);
  }

  @Test
  public void case16() {
    int prevWins = 50;
    int prevLosses = 99;
    int gamesLeft = 2;
    int mustWin = 2;
    assertEquals(0.1155454862321, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.1155454862321);
  }

  @Test
  public void case17() {
    int prevWins = 53;
    int prevLosses = 41;
    int gamesLeft = 11;
    int mustWin = 7;
    assertEquals(0.43516880005, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.43516880005);
  }

  @Test
  public void case18() {
    int prevWins = 16;
    int prevLosses = 76;
    int gamesLeft = 4;
    int mustWin = 1;
    assertEquals(0.5435344777825, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.5435344777825);
  }

  @Test
  public void case19() {
    int prevWins = 20;
    int prevLosses = 68;
    int gamesLeft = 11;
    int mustWin = 3;
    assertEquals(0.4864983176967, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.4864983176967);
  }

  @Test
  public void case20() {
    int prevWins = 59;
    int prevLosses = 4;
    int gamesLeft = 2;
    int mustWin = 2;
    assertEquals(0.8531468531469, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.8531468531469);
  }

  @Test
  public void case21() {
    int prevWins = 30;
    int prevLosses = 20;
    int gamesLeft = 10;
    int mustWin = 2;
    assertEquals(0.9962239869676, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.9962239869676);
  }

  @Test
  public void case22() {
    int prevWins = 66;
    int prevLosses = 89;
    int gamesLeft = 4;
    int mustWin = 3;
    assertEquals(0.2142039205366, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.2142039205366);
  }

  @Test
  public void case23() {
    int prevWins = 74;
    int prevLosses = 87;
    int gamesLeft = 4;
    int mustWin = 4;
    assertEquals(0.0467559298995, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.0467559298995);
  }

  @Test
  public void case24() {
    int prevWins = 38;
    int prevLosses = 48;
    int gamesLeft = 8;
    int mustWin = 8;
    assertEquals(0.0021466953109, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.0021466953109);
  }

  @Test
  public void case25() {
    int prevWins = 77;
    int prevLosses = 42;
    int gamesLeft = 12;
    int mustWin = 4;
    assertEquals(0.9912607771874, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.9912607771874);
  }

  @Test
  public void case26() {
    int prevWins = 51;
    int prevLosses = 85;
    int gamesLeft = 12;
    int mustWin = 1;
    assertEquals(0.9955060793368, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.9955060793368);
  }

  @Test
  public void case27() {
    int prevWins = 100;
    int prevLosses = 100;
    int gamesLeft = 15;
    int mustWin = 7;
    assertEquals(0.6898945883485, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.6898945883485);
  }

  @Test
  public void case28() {
    int prevWins = 98;
    int prevLosses = 76;
    int gamesLeft = 15;
    int mustWin = 12;
    assertEquals(0.0590339352084, winningprobability.probability(prevWins, prevLosses, gamesLeft, mustWin), DELTA * 0.0590339352084);
  }

}
