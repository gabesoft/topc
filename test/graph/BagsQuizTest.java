package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class BagsQuizTest {
  BagsQuiz bagsquiz = new BagsQuiz();

  @Test
  public void case1() {
    int n = 2;
    String[] actions = { "PUT 1 INSIDE 2" };
    assertEquals(1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case2() {
    int n = 2;
    String[] actions = { "PUT 1 INSIDE 2", "SET 2 LOOSE" };
    assertEquals(2, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case3() {
    int n = 2;
    String[] actions = { "PUT 2 INSIDE 1" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case4() {
    int n = 4;
    String[] actions = { "PUT 3 INSIDE 2", "SWAP 4 WITH 2", "PUT 2 INSIDE 4", "SET 1 LOOSE" };
    assertEquals(2, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case5() {
    int n = 3;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 3 INSIDE 1" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case6() {
    int n = 11;
    String[] actions = { "PUT 2 INSIDE 7", "PUT 4 INSIDE 6", "PUT 1 INSIDE 6", "PUT 5 INSIDE 8", "SWAP 8 WITH 6", "PUT 3 INSIDE 8", "PUT 6 INSIDE 7" };
    assertEquals(5, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case7() {
    int n = 9;
    String[] actions = { "PUT 1 INSIDE 9", "SET 6 LOOSE", "PUT 9 INSIDE 7", "SWAP 8 WITH 7", "PUT 6 INSIDE 8", "PUT 3 INSIDE 7", "SET 2 LOOSE", "PUT 4 INSIDE 7", "PUT 8 INSIDE 2", "PUT 7 INSIDE 2", "PUT 5 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 5", "PUT 5 INSIDE 8", "PUT 7 INSIDE 8", "SET 8 LOOSE" };
    assertEquals(5, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case8() {
    int n = 4;
    String[] actions = { "SET 3 LOOSE" };
    assertEquals(4, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case9() {
    int n = 25;
    String[] actions = { "PUT 1 INSIDE 4", "PUT 2 INSIDE 8", "PUT 13 INSIDE 19", "PUT 18 INSIDE 10", "PUT 3 INSIDE 8", "PUT 24 INSIDE 23", "SET 20 LOOSE", "SET 10 LOOSE", "PUT 23 INSIDE 25", "PUT 9 INSIDE 15", "PUT 7 INSIDE 12", "PUT 14 INSIDE 22", "PUT 17 INSIDE 5", "SWAP 18 WITH 5", "PUT 12 INSIDE 11", "PUT 4 INSIDE 6", "SWAP 15 WITH 5", "SWAP 11 WITH 20", "SWAP 15 WITH 11", "PUT 11 INSIDE 15", "PUT 8 INSIDE 21", "PUT 5 INSIDE 6", "PUT 19 INSIDE 22", "PUT 20 INSIDE 18", "PUT 6 INSIDE 10", "PUT 16 INSIDE 18", "SWAP 22 WITH 18", "SWAP 10 WITH 21", "PUT 10 INSIDE 18", "PUT 18 INSIDE 22", "PUT 15 INSIDE 22", "PUT 21 INSIDE 25", "SET 25 LOOSE", "PUT 21 INSIDE 25", "PUT 25 INSIDE 23", "PUT 22 INSIDE 23", "SET 23 LOOSE", "PUT 22 INSIDE 25", "PUT 25 INSIDE 23", "PUT 24 INSIDE 23", "SET 23 LOOSE" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case10() {
    int n = 18;
    String[] actions = { "SET 15 LOOSE", "PUT 7 INSIDE 9", "PUT 3 INSIDE 10", "PUT 11 INSIDE 15", "PUT 1 INSIDE 2", "SWAP 6 WITH 18", "PUT 17 INSIDE 10", "SWAP 14 WITH 5", "PUT 14 INSIDE 10", "PUT 13 INSIDE 16", "PUT 15 INSIDE 18", "SET 12 LOOSE", "PUT 5 INSIDE 9", "PUT 6 INSIDE 12", "PUT 8 INSIDE 9", "PUT 2 INSIDE 10", "PUT 18 INSIDE 10", "PUT 9 INSIDE 16", "PUT 12 INSIDE 10", "PUT 16 INSIDE 10", "PUT 10 INSIDE 4", "SET 4 LOOSE", "SET 4 LOOSE", "PUT 4 INSIDE 10", "SET 10 LOOSE", "PUT 2 INSIDE 3", "PUT 14 INSIDE 18", "PUT 3 INSIDE 10", "PUT 10 INSIDE 16", "PUT 4 INSIDE 12", "PUT 12 INSIDE 16", "PUT 18 INSIDE 17", "PUT 16 INSIDE 17", "SET 17 LOOSE", "PUT 16 INSIDE 17", "PUT 18 INSIDE 17", "SET 17 LOOSE", "PUT 18 INSIDE 17", "SET 17 LOOSE", "PUT 16 INSIDE 18", "PUT 18 INSIDE 17", "SET 17 LOOSE" };
    assertEquals(2, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case11() {
    int n = 5;
    String[] actions = { "PUT 2 INSIDE 3", "SWAP 4 WITH 5", "PUT 5 INSIDE 4", "PUT 1 INSIDE 3", "SET 3 LOOSE", "PUT 1 INSIDE 4", "PUT 4 INSIDE 2", "SWAP 2 WITH 3", "SET 3 LOOSE", "SET 3 LOOSE", "SET 2 LOOSE", "SET 2 LOOSE", "SWAP 3 WITH 2", "PUT 3 INSIDE 4", "SWAP 4 WITH 2", "PUT 4 INSIDE 2", "SET 2 LOOSE", "PUT 4 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 4", "SET 4 LOOSE", "PUT 5 INSIDE 1", "PUT 1 INSIDE 2", "PUT 2 INSIDE 3", "PUT 3 INSIDE 4", "SET 4 LOOSE", "PUT 3 INSIDE 4", "SET 4 LOOSE", "SET 3 LOOSE", "PUT 4 INSIDE 2", "SWAP 2 WITH 3", "PUT 3 INSIDE 2", "SET 2 LOOSE", "SWAP 3 WITH 1", "PUT 4 INSIDE 3", "SET 1 LOOSE", "PUT 1 INSIDE 3", "PUT 2 INSIDE 3", "SET 3 LOOSE" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case12() {
    int n = 46;
    String[] actions = { "PUT 7 INSIDE 19", "PUT 3 INSIDE 19", "PUT 6 INSIDE 20", "SWAP 8 WITH 33", "SET 18 LOOSE", "PUT 15 INSIDE 23", "PUT 1 INSIDE 12", "SWAP 2 WITH 45", "PUT 5 INSIDE 14", "PUT 20 INSIDE 41", "PUT 4 INSIDE 29", "SET 30 LOOSE", "PUT 25 INSIDE 43", "PUT 16 INSIDE 41", "PUT 10 INSIDE 30", "PUT 26 INSIDE 41", "PUT 8 INSIDE 18", "PUT 18 INSIDE 42", "PUT 2 INSIDE 9", "PUT 27 INSIDE 40", "PUT 31 INSIDE 43", "PUT 13 INSIDE 17", "SWAP 43 WITH 22", "PUT 29 INSIDE 37", "PUT 21 INSIDE 45", "PUT 9 INSIDE 24", "PUT 12 INSIDE 22", "PUT 19 INSIDE 34", "PUT 22 INSIDE 37", "PUT 28 INSIDE 11", "SWAP 40 WITH 23", "SWAP 40 WITH 11", "PUT 23 INSIDE 37", "SWAP 38 WITH 37", "PUT 30 INSIDE 45", "PUT 32 INSIDE 44", "PUT 11 INSIDE 14", "SET 44 LOOSE", "PUT 17 INSIDE 40", "PUT 24 INSIDE 39", "PUT 14 INSIDE 40" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case13() {
    int n = 24;
    String[] actions = { "SET 7 LOOSE", "SET 7 LOOSE", "SWAP 21 WITH 17", "PUT 16 INSIDE 14", "PUT 2 INSIDE 13", "SWAP 11 WITH 21", "PUT 3 INSIDE 13", "PUT 12 INSIDE 19", "PUT 7 INSIDE 10", "PUT 4 INSIDE 13", "PUT 6 INSIDE 9", "PUT 5 INSIDE 13", "PUT 19 INSIDE 21", "PUT 1 INSIDE 8", "PUT 22 INSIDE 20", "SWAP 24 WITH 14", "SWAP 8 WITH 13", "PUT 13 INSIDE 18", "PUT 9 INSIDE 15", "PUT 15 INSIDE 17", "PUT 8 INSIDE 10", "PUT 17 INSIDE 21", "PUT 18 INSIDE 20", "SET 20 LOOSE", "PUT 22 INSIDE 24", "PUT 10 INSIDE 14", "PUT 11 INSIDE 23", "SET 24 LOOSE", "PUT 22 INSIDE 24", "PUT 20 INSIDE 21", "PUT 16 INSIDE 23", "PUT 14 INSIDE 18", "SWAP 18 WITH 23", "SET 24 LOOSE", "PUT 18 INSIDE 21", "PUT 21 INSIDE 22", "PUT 23 INSIDE 24", "PUT 22 INSIDE 24" };
    assertEquals(1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case14() {
    int n = 34;
    String[] actions = { "PUT 4 INSIDE 12", "PUT 5 INSIDE 17", "PUT 1 INSIDE 30", "PUT 3 INSIDE 9", "SET 14 LOOSE", "PUT 2 INSIDE 28" };
    assertEquals(29, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case15() {
    int n = 15;
    String[] actions = { "PUT 1 INSIDE 11", "PUT 3 INSIDE 4", "PUT 2 INSIDE 5", "PUT 7 INSIDE 9", "PUT 10 INSIDE 12", "PUT 14 INSIDE 15", "PUT 5 INSIDE 6", "SWAP 4 WITH 11", "PUT 15 INSIDE 11", "PUT 4 INSIDE 6", "PUT 6 INSIDE 8", "PUT 9 INSIDE 12", "SWAP 13 WITH 11", "SET 12 LOOSE", "PUT 10 INSIDE 12", "PUT 8 INSIDE 9", "PUT 11 INSIDE 12", "PUT 9 INSIDE 12", "PUT 12 INSIDE 13", "SET 13 LOOSE", "PUT 12 INSIDE 13", "PUT 13 INSIDE 15" };
    assertEquals(2, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case16() {
    int n = 16;
    String[] actions = { "PUT 1 INSIDE 5", "SET 4 LOOSE", "SWAP 8 WITH 14", "PUT 10 INSIDE 6", "PUT 2 INSIDE 5", "PUT 14 INSIDE 6", "PUT 13 INSIDE 8", "PUT 12 INSIDE 4", "PUT 16 INSIDE 15", "SET 15 LOOSE", "PUT 15 INSIDE 3", "PUT 5 INSIDE 11", "SWAP 9 WITH 16", "PUT 6 INSIDE 16", "PUT 11 INSIDE 8", "PUT 16 INSIDE 3", "SET 3 LOOSE", "SET 16 LOOSE", "PUT 16 INSIDE 8", "PUT 3 INSIDE 7", "PUT 9 INSIDE 8", "SWAP 6 WITH 4", "SWAP 6 WITH 8", "PUT 4 INSIDE 15", "SET 8 LOOSE", "PUT 15 INSIDE 6", "SET 8 LOOSE", "PUT 8 INSIDE 6", "PUT 7 INSIDE 6", "SET 6 LOOSE" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case17() {
    int n = 5;
    String[] actions = { "PUT 3 INSIDE 1", "PUT 5 INSIDE 1", "PUT 4 INSIDE 2", "PUT 1 INSIDE 2", "SET 2 LOOSE", "SWAP 1 WITH 2", "SET 1 LOOSE", "SWAP 4 WITH 2", "SET 3 LOOSE", "PUT 3 INSIDE 2", "PUT 1 INSIDE 5", "PUT 2 INSIDE 4", "PUT 5 INSIDE 4", "SET 4 LOOSE", "PUT 5 INSIDE 2", "SET 4 LOOSE", "SET 2 LOOSE", "PUT 5 INSIDE 3", "PUT 2 INSIDE 3", "PUT 3 INSIDE 4", "SET 4 LOOSE", "SWAP 4 WITH 3", "PUT 4 INSIDE 3", "SET 3 LOOSE", "SWAP 4 WITH 3", "SET 4 LOOSE", "PUT 2 INSIDE 3", "PUT 4 INSIDE 3", "PUT 5 INSIDE 3", "SET 3 LOOSE", "PUT 4 INSIDE 5", "PUT 2 INSIDE 5", "PUT 5 INSIDE 3", "SET 3 LOOSE", "PUT 3 INSIDE 5", "SET 5 LOOSE", "PUT 3 INSIDE 1", "SET 4 LOOSE", "SWAP 5 WITH 1", "SET 1 LOOSE", "PUT 1 INSIDE 4", "PUT 2 INSIDE 5" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case18() {
    int n = 37;
    String[] actions = { "PUT 6 INSIDE 37", "SWAP 10 WITH 2", "PUT 8 INSIDE 16", "PUT 2 INSIDE 7", "PUT 7 INSIDE 22", "PUT 1 INSIDE 4", "PUT 5 INSIDE 24", "PUT 3 INSIDE 4", "PUT 9 INSIDE 33", "PUT 10 INSIDE 22", "SET 31 LOOSE", "SWAP 31 WITH 17", "PUT 4 INSIDE 26" };
    assertEquals(27, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case19() {
    int n = 3;
    String[] actions = { "SET 1 LOOSE", "PUT 2 INSIDE 1", "PUT 3 INSIDE 1", "SET 1 LOOSE", "PUT 3 INSIDE 1", "SET 2 LOOSE", "SET 2 LOOSE", "SWAP 1 WITH 2", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "SET 1 LOOSE", "SET 2 LOOSE" };
    assertEquals(3, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case20() {
    int n = 24;
    String[] actions = { "PUT 16 INSIDE 18", "SET 5 LOOSE", "PUT 6 INSIDE 10", "PUT 2 INSIDE 10", "PUT 9 INSIDE 12", "PUT 13 INSIDE 21", "SWAP 24 WITH 15", "PUT 24 INSIDE 23", "PUT 4 INSIDE 11", "PUT 3 INSIDE 11", "PUT 11 INSIDE 15", "PUT 20 INSIDE 18", "PUT 12 INSIDE 15", "PUT 19 INSIDE 14", "PUT 8 INSIDE 10", "PUT 1 INSIDE 5", "PUT 5 INSIDE 10", "PUT 7 INSIDE 10", "PUT 21 INSIDE 23", "PUT 10 INSIDE 17", "SWAP 18 WITH 14", "PUT 15 INSIDE 22", "PUT 17 INSIDE 22", "PUT 14 INSIDE 22", "PUT 22 INSIDE 23", "SET 18 LOOSE", "PUT 18 INSIDE 20", "PUT 16 INSIDE 19", "PUT 20 INSIDE 23", "PUT 19 INSIDE 23", "SET 23 LOOSE" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case21() {
    int n = 27;
    String[] actions = { "SWAP 17 WITH 1", "PUT 2 INSIDE 27", "PUT 1 INSIDE 9", "SET 23 LOOSE", "SET 14 LOOSE" };
    assertEquals(25, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case22() {
    int n = 24;
    String[] actions = { "PUT 3 INSIDE 4", "PUT 4 INSIDE 11", "PUT 9 INSIDE 12", "PUT 16 INSIDE 19", "SET 1 LOOSE", "PUT 11 INSIDE 19", "PUT 24 INSIDE 21", "PUT 2 INSIDE 22", "PUT 10 INSIDE 14", "SET 20 LOOSE", "PUT 14 INSIDE 19", "PUT 8 INSIDE 15", "PUT 12 INSIDE 23", "SWAP 7 WITH 22", "PUT 6 INSIDE 13", "PUT 1 INSIDE 7", "PUT 5 INSIDE 15", "PUT 7 INSIDE 15", "SWAP 19 WITH 23", "PUT 13 INSIDE 19", "SET 21 LOOSE", "PUT 15 INSIDE 18", "PUT 22 INSIDE 21", "SWAP 20 WITH 23", "PUT 23 INSIDE 24", "PUT 17 INSIDE 20", "SET 21 LOOSE", "PUT 20 INSIDE 24", "PUT 19 INSIDE 21", "PUT 24 INSIDE 21", "SET 21 LOOSE", "PUT 18 INSIDE 21", "PUT 19 INSIDE 21", "PUT 21 INSIDE 24", "PUT 22 INSIDE 24" };
    assertEquals(1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case23() {
    int n = 46;
    String[] actions = { "PUT 2 INSIDE 4", "SET 37 LOOSE", "PUT 7 INSIDE 43", "PUT 1 INSIDE 17", "PUT 16 INSIDE 41", "PUT 15 INSIDE 40", "PUT 8 INSIDE 18", "SET 29 LOOSE", "PUT 3 INSIDE 30", "PUT 10 INSIDE 43", "PUT 13 INSIDE 18", "PUT 17 INSIDE 22", "PUT 12 INSIDE 23", "PUT 11 INSIDE 37", "PUT 9 INSIDE 30", "PUT 5 INSIDE 25", "PUT 6 INSIDE 23", "PUT 4 INSIDE 39", "PUT 14 INSIDE 27" };
    assertEquals(29, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case24() {
    int n = 19;
    String[] actions = { "PUT 3 INSIDE 8", "SWAP 17 WITH 12", "PUT 1 INSIDE 2", "PUT 2 INSIDE 9", "PUT 6 INSIDE 14", "PUT 8 INSIDE 11", "PUT 9 INSIDE 15", "SET 10 LOOSE", "SWAP 19 WITH 16", "PUT 4 INSIDE 5", "PUT 7 INSIDE 13", "PUT 5 INSIDE 19", "PUT 10 INSIDE 18" };
    assertEquals(9, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case25() {
    int n = 30;
    String[] actions = { "PUT 2 INSIDE 21", "PUT 1 INSIDE 16", "PUT 3 INSIDE 14" };
    assertEquals(27, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case26() {
    int n = 5;
    String[] actions = { "PUT 2 INSIDE 3", "PUT 5 INSIDE 3", "PUT 4 INSIDE 3", "PUT 1 INSIDE 3", "SET 3 LOOSE", "PUT 5 INSIDE 3", "SET 4 LOOSE", "PUT 1 INSIDE 2", "PUT 4 INSIDE 3", "PUT 3 INSIDE 2", "SET 2 LOOSE", "PUT 1 INSIDE 3", "PUT 2 INSIDE 3", "SET 3 LOOSE", "PUT 2 INSIDE 3", "SET 1 LOOSE", "PUT 1 INSIDE 3", "PUT 3 INSIDE 4", "SWAP 4 WITH 5", "PUT 5 INSIDE 4", "SET 4 LOOSE", "SET 4 LOOSE", "SWAP 5 WITH 4", "PUT 3 INSIDE 4", "PUT 5 INSIDE 4", "SET 4 LOOSE", "PUT 4 INSIDE 5", "PUT 3 INSIDE 5", "SET 5 LOOSE", "PUT 3 INSIDE 5", "PUT 5 INSIDE 4", "SET 4 LOOSE", "SWAP 4 WITH 5", "PUT 4 INSIDE 5", "SET 5 LOOSE", "PUT 4 INSIDE 5", "SET 5 LOOSE", "SET 5 LOOSE", "SET 4 LOOSE", "PUT 3 INSIDE 4", "PUT 4 INSIDE 5", "SET 5 LOOSE", "PUT 4 INSIDE 5", "SET 5 LOOSE", "SET 4 LOOSE", "PUT 3 INSIDE 5", "PUT 4 INSIDE 5", "SET 5 LOOSE", "SET 4 LOOSE", "PUT 3 INSIDE 4" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case27() {
    int n = 46;
    String[] actions = { "PUT 6 INSIDE 43", "PUT 2 INSIDE 46", "PUT 4 INSIDE 32", "PUT 3 INSIDE 27", "PUT 5 INSIDE 36", "PUT 1 INSIDE 15" };
    assertEquals(40, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case28() {
    int n = 43;
    String[] actions = { "PUT 13 INSIDE 31", "PUT 18 INSIDE 34", "PUT 2 INSIDE 27", "PUT 16 INSIDE 29", "PUT 20 INSIDE 23", "PUT 1 INSIDE 12", "PUT 5 INSIDE 24", "PUT 10 INSIDE 23", "PUT 12 INSIDE 40", "PUT 9 INSIDE 22", "SET 27 LOOSE", "SET 35 LOOSE", "PUT 17 INSIDE 37", "SWAP 37 WITH 11", "PUT 4 INSIDE 7", "PUT 3 INSIDE 11", "SWAP 32 WITH 38", "SET 15 LOOSE", "PUT 14 INSIDE 21", "PUT 6 INSIDE 26", "PUT 19 INSIDE 21", "PUT 2 INSIDE 7", "PUT 8 INSIDE 36", "PUT 7 INSIDE 26", "PUT 15 INSIDE 30", "SWAP 33 WITH 41", "PUT 11 INSIDE 31" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case29() {
    int n = 28;
    String[] actions = { "PUT 7 INSIDE 28", "PUT 1 INSIDE 2", "PUT 11 INSIDE 10", "SET 10 LOOSE", "SWAP 9 WITH 22", "SWAP 25 WITH 4", "PUT 2 INSIDE 20", "PUT 11 INSIDE 22", "PUT 4 INSIDE 27", "PUT 9 INSIDE 18", "PUT 10 INSIDE 20", "PUT 8 INSIDE 26", "PUT 5 INSIDE 27", "PUT 6 INSIDE 24", "PUT 3 INSIDE 17" };
    assertEquals(17, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case30() {
    int n = 19;
    String[] actions = { "PUT 7 INSIDE 10", "PUT 1 INSIDE 8", "PUT 8 INSIDE 12", "PUT 2 INSIDE 5", "PUT 4 INSIDE 5", "PUT 6 INSIDE 13", "SET 17 LOOSE", "SWAP 11 WITH 5", "PUT 5 INSIDE 18", "PUT 3 INSIDE 15" };
    assertEquals(11, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case31() {
    int n = 36;
    String[] actions = { "PUT 16 INSIDE 27", "SET 28 LOOSE", "PUT 1 INSIDE 4", "PUT 28 INSIDE 35", "SWAP 26 WITH 22", "SET 24 LOOSE", "PUT 2 INSIDE 4", "PUT 5 INSIDE 12", "PUT 21 INSIDE 31", "PUT 7 INSIDE 12", "PUT 30 INSIDE 36", "PUT 4 INSIDE 13", "PUT 11 INSIDE 23", "SET 18 LOOSE", "PUT 3 INSIDE 10", "PUT 10 INSIDE 14", "PUT 19 INSIDE 27", "PUT 15 INSIDE 27", "PUT 29 INSIDE 36", "PUT 25 INSIDE 36", "PUT 12 INSIDE 26", "PUT 6 INSIDE 18", "PUT 31 INSIDE 36", "PUT 8 INSIDE 13", "PUT 9 INSIDE 17", "PUT 22 INSIDE 23", "PUT 13 INSIDE 23", "PUT 17 INSIDE 26", "PUT 26 INSIDE 32", "PUT 18 INSIDE 24", "PUT 27 INSIDE 35", "PUT 20 INSIDE 23", "SWAP 32 WITH 34", "PUT 23 INSIDE 32", "PUT 14 INSIDE 24", "SWAP 35 WITH 36", "PUT 24 INSIDE 34", "SET 36 LOOSE" };
    assertEquals(7, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case32() {
    int n = 31;
    String[] actions = { "PUT 1 INSIDE 9" };
    assertEquals(30, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case33() {
    int n = 25;
    String[] actions = { "PUT 20 INSIDE 8", "PUT 18 INSIDE 11", "PUT 19 INSIDE 21", "SWAP 21 WITH 8", "PUT 24 INSIDE 6", "PUT 2 INSIDE 22", "PUT 1 INSIDE 5", "PUT 5 INSIDE 6", "PUT 16 INSIDE 17", "SET 22 LOOSE", "SWAP 12 WITH 7", "SET 6 LOOSE", "PUT 25 INSIDE 22", "PUT 5 INSIDE 12", "PUT 2 INSIDE 4", "SWAP 13 WITH 3", "PUT 4 INSIDE 10", "PUT 24 INSIDE 22", "PUT 13 INSIDE 14", "SET 15 LOOSE", "SET 17 LOOSE", "SET 12 LOOSE", "SET 7 LOOSE", "SET 23 LOOSE", "PUT 5 INSIDE 10", "PUT 12 INSIDE 14", "PUT 3 INSIDE 10", "PUT 9 INSIDE 17", "SET 11 LOOSE", "PUT 8 INSIDE 18", "PUT 23 INSIDE 22", "PUT 11 INSIDE 18", "PUT 17 INSIDE 21", "PUT 6 INSIDE 18", "PUT 10 INSIDE 18", "PUT 7 INSIDE 15", "PUT 15 INSIDE 21", "PUT 16 INSIDE 21", "PUT 18 INSIDE 21", "PUT 14 INSIDE 21", "PUT 21 INSIDE 22", "SET 22 LOOSE", "PUT 21 INSIDE 25", "SWAP 22 WITH 23" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case34() {
    int n = 30;
    String[] actions = { "PUT 13 INSIDE 16", "PUT 9 INSIDE 18", "SWAP 28 WITH 3", "SWAP 16 WITH 5", "PUT 12 INSIDE 21", "SET 1 LOOSE", "PUT 2 INSIDE 17", "PUT 5 INSIDE 18", "PUT 10 INSIDE 20", "SWAP 21 WITH 29", "PUT 1 INSIDE 7", "PUT 23 INSIDE 28", "SET 17 LOOSE", "PUT 3 INSIDE 8", "PUT 4 INSIDE 7", "PUT 15 INSIDE 20", "PUT 7 INSIDE 22", "SET 30 LOOSE", "PUT 16 INSIDE 30", "PUT 25 INSIDE 29", "PUT 8 INSIDE 21", "PUT 20 INSIDE 27", "PUT 17 INSIDE 24", "SWAP 22 WITH 14", "PUT 21 INSIDE 28", "PUT 6 INSIDE 22", "PUT 2 INSIDE 14", "PUT 22 INSIDE 27", "PUT 18 INSIDE 26", "PUT 14 INSIDE 19", "PUT 26 INSIDE 29", "PUT 28 INSIDE 30", "PUT 11 INSIDE 19", "PUT 19 INSIDE 27", "SWAP 30 WITH 24", "SET 30 LOOSE", "PUT 17 INSIDE 28", "PUT 28 INSIDE 29", "PUT 16 INSIDE 24", "PUT 24 INSIDE 29", "SET 30 LOOSE", "PUT 27 INSIDE 30" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case35() {
    int n = 40;
    String[] actions = { "PUT 3 INSIDE 39", "PUT 9 INSIDE 17", "PUT 4 INSIDE 21", "PUT 2 INSIDE 19", "PUT 5 INSIDE 23", "PUT 7 INSIDE 20", "SWAP 22 WITH 1", "PUT 6 INSIDE 23", "SWAP 20 WITH 18", "PUT 1 INSIDE 8", "PUT 8 INSIDE 26", "SET 31 LOOSE" };
    assertEquals(31, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case36() {
    int n = 36;
    String[] actions = { "PUT 10 INSIDE 11", "PUT 6 INSIDE 18", "PUT 21 INSIDE 30", "PUT 3 INSIDE 7", "PUT 1 INSIDE 2", "PUT 35 INSIDE 36", "PUT 20 INSIDE 31", "PUT 30 INSIDE 34", "PUT 9 INSIDE 8", "PUT 24 INSIDE 32", "PUT 2 INSIDE 7", "SWAP 22 WITH 19", "PUT 22 INSIDE 32", "PUT 15 INSIDE 25", "PUT 11 INSIDE 26", "PUT 17 INSIDE 31", "PUT 7 INSIDE 8", "SWAP 13 WITH 8", "PUT 34 INSIDE 36", "SET 29 LOOSE", "PUT 4 INSIDE 5", "SWAP 18 WITH 33", "PUT 32 INSIDE 28", "SET 28 LOOSE", "PUT 18 INSIDE 23", "PUT 25 INSIDE 27", "PUT 8 INSIDE 19", "PUT 32 INSIDE 36", "PUT 16 INSIDE 23", "PUT 14 INSIDE 26", "PUT 12 INSIDE 23", "PUT 5 INSIDE 13", "PUT 19 INSIDE 28", "PUT 26 INSIDE 33", "SET 31 LOOSE", "PUT 29 INSIDE 31", "PUT 28 INSIDE 33", "PUT 33 INSIDE 36", "PUT 20 INSIDE 23", "SET 27 LOOSE", "PUT 17 INSIDE 27", "PUT 13 INSIDE 23", "PUT 27 INSIDE 31", "PUT 23 INSIDE 36", "PUT 25 INSIDE 31", "SET 36 LOOSE", "PUT 23 INSIDE 32" };
    assertEquals(6, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case37() {
    int n = 30;
    String[] actions = { "PUT 4 INSIDE 5", "SET 9 LOOSE", "PUT 21 INSIDE 25", "PUT 19 INSIDE 27", "PUT 1 INSIDE 9", "PUT 6 INSIDE 20", "PUT 8 INSIDE 18", "PUT 20 INSIDE 30", "SET 16 LOOSE", "PUT 2 INSIDE 11", "PUT 11 INSIDE 16", "PUT 16 INSIDE 24", "PUT 5 INSIDE 18", "PUT 13 INSIDE 28", "SET 7 LOOSE", "PUT 10 INSIDE 12", "PUT 12 INSIDE 30", "SET 3 LOOSE", "PUT 7 INSIDE 18", "PUT 18 INSIDE 30", "PUT 14 INSIDE 23", "PUT 3 INSIDE 9", "PUT 15 INSIDE 26", "PUT 9 INSIDE 17", "PUT 17 INSIDE 28" };
    assertEquals(9, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case38() {
    int n = 39;
    String[] actions = { "PUT 32 INSIDE 30", "PUT 25 INSIDE 37", "PUT 28 INSIDE 34", "SWAP 18 WITH 10", "PUT 27 INSIDE 37", "PUT 24 INSIDE 31", "PUT 39 INSIDE 34", "PUT 7 INSIDE 19", "PUT 1 INSIDE 14", "PUT 14 INSIDE 21", "PUT 17 INSIDE 21", "PUT 4 INSIDE 16", "SWAP 35 WITH 8", "PUT 9 INSIDE 23", "PUT 6 INSIDE 29", "SET 34 LOOSE", "PUT 5 INSIDE 28", "PUT 18 INSIDE 21", "PUT 15 INSIDE 28", "PUT 10 INSIDE 12", "PUT 16 INSIDE 23", "PUT 26 INSIDE 39", "PUT 20 INSIDE 39", "SET 35 LOOSE", "SWAP 30 WITH 11", "SWAP 19 WITH 13", "PUT 23 INSIDE 33", "SET 22 LOOSE", "PUT 21 INSIDE 37", "PUT 8 INSIDE 29", "PUT 2 INSIDE 11", "SET 30 LOOSE", "PUT 22 INSIDE 31", "PUT 3 INSIDE 11", "PUT 13 INSIDE 19", "PUT 19 INSIDE 36", "PUT 11 INSIDE 29", "PUT 29 INSIDE 33", "SWAP 30 WITH 12", "PUT 30 INSIDE 35", "PUT 12 INSIDE 28", "PUT 28 INSIDE 31" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case39() {
    int n = 26;
    String[] actions = { "PUT 12 INSIDE 20", "PUT 5 INSIDE 10", "PUT 13 INSIDE 9", "PUT 7 INSIDE 15", "SET 22 LOOSE", "PUT 11 INSIDE 9", "PUT 14 INSIDE 22", "PUT 10 INSIDE 16", "PUT 26 INSIDE 25", "PUT 8 INSIDE 17", "SWAP 15 WITH 9", "PUT 1 INSIDE 4", "PUT 2 INSIDE 4", "PUT 17 INSIDE 23", "PUT 4 INSIDE 6", "PUT 16 INSIDE 22", "PUT 3 INSIDE 6", "SET 20 LOOSE", "PUT 19 INSIDE 18", "PUT 23 INSIDE 24", "PUT 9 INSIDE 20", "PUT 6 INSIDE 12", "SET 18 LOOSE", "PUT 20 INSIDE 21", "PUT 21 INSIDE 24", "PUT 12 INSIDE 15", "PUT 19 INSIDE 22", "PUT 15 INSIDE 22", "PUT 18 INSIDE 22", "PUT 24 INSIDE 25", "PUT 22 INSIDE 25", "SET 25 LOOSE", "PUT 22 INSIDE 25", "SWAP 26 WITH 25" };
    assertEquals(3, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case40() {
    int n = 44;
    String[] actions = { "PUT 4 INSIDE 35", "PUT 9 INSIDE 42", "PUT 6 INSIDE 24", "SET 38 LOOSE", "SWAP 26 WITH 25", "PUT 8 INSIDE 32", "PUT 3 INSIDE 37", "PUT 10 INSIDE 39", "PUT 7 INSIDE 26", "PUT 12 INSIDE 18", "PUT 11 INSIDE 15", "PUT 5 INSIDE 37", "PUT 1 INSIDE 28", "SWAP 18 WITH 21", "PUT 2 INSIDE 27" };
    assertEquals(32, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case41() {
    int n = 42;
    String[] actions = { "PUT 19 INSIDE 37", "PUT 14 INSIDE 40", "PUT 5 INSIDE 13", "SET 32 LOOSE", "PUT 4 INSIDE 10", "PUT 18 INSIDE 34", "PUT 8 INSIDE 30", "PUT 10 INSIDE 34", "SWAP 33 WITH 32", "PUT 1 INSIDE 2", "PUT 12 INSIDE 35", "PUT 9 INSIDE 38", "PUT 2 INSIDE 7", "SWAP 38 WITH 41", "PUT 3 INSIDE 11", "PUT 6 INSIDE 27", "PUT 16 INSIDE 27", "PUT 17 INSIDE 33", "PUT 13 INSIDE 38", "PUT 7 INSIDE 40", "PUT 11 INSIDE 23", "PUT 15 INSIDE 40", "SET 36 LOOSE" };
    assertEquals(23, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case42() {
    int n = 37;
    String[] actions = { "PUT 1 INSIDE 13", "SET 24 LOOSE", "SET 30 LOOSE", "SET 31 LOOSE" };
    assertEquals(36, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case43() {
    int n = 1;
    String[] actions = { "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE", "SET 1 LOOSE" };
    assertEquals(1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case44() {
    int n = 32;
    String[] actions = { "SET 2 LOOSE", "PUT 20 INSIDE 28", "PUT 2 INSIDE 8", "PUT 32 INSIDE 13", "PUT 1 INSIDE 4", "SWAP 16 WITH 18", "SWAP 4 WITH 16", "PUT 21 INSIDE 26", "PUT 8 INSIDE 18", "SWAP 11 WITH 14", "SWAP 19 WITH 3", "SET 30 LOOSE", "PUT 3 INSIDE 9", "SWAP 19 WITH 14", "PUT 4 INSIDE 13", "PUT 12 INSIDE 24", "PUT 5 INSIDE 15", "PUT 25 INSIDE 23", "PUT 16 INSIDE 24", "PUT 7 INSIDE 15", "SET 13 LOOSE", "SWAP 15 WITH 29", "PUT 4 INSIDE 9", "PUT 10 INSIDE 15", "PUT 6 INSIDE 13", "PUT 19 INSIDE 30", "PUT 9 INSIDE 11", "PUT 17 INSIDE 24", "PUT 11 INSIDE 30", "SET 26 LOOSE", "PUT 18 INSIDE 29", "SET 23 LOOSE", "PUT 13 INSIDE 32", "PUT 15 INSIDE 26", "PUT 14 INSIDE 32" };
    assertEquals(12, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case45() {
    int n = 44;
    String[] actions = { "PUT 8 INSIDE 21", "PUT 2 INSIDE 7", "PUT 6 INSIDE 14", "SET 23 LOOSE", "PUT 1 INSIDE 10", "PUT 16 INSIDE 44", "SWAP 14 WITH 17", "PUT 38 INSIDE 13", "PUT 5 INSIDE 25", "PUT 18 INSIDE 32", "PUT 21 INSIDE 30", "SET 3 LOOSE", "PUT 3 INSIDE 9", "PUT 17 INSIDE 39", "SET 42 LOOSE", "PUT 4 INSIDE 20", "PUT 10 INSIDE 19", "SET 13 LOOSE", "PUT 11 INSIDE 31", "PUT 22 INSIDE 41", "PUT 15 INSIDE 28", "PUT 19 INSIDE 42", "SWAP 43 WITH 26", "PUT 9 INSIDE 13", "PUT 12 INSIDE 30", "PUT 27 INSIDE 44", "SWAP 36 WITH 42", "PUT 24 INSIDE 44", "PUT 7 INSIDE 25", "PUT 23 INSIDE 37", "PUT 42 INSIDE 35", "PUT 25 INSIDE 32", "PUT 26 INSIDE 37", "PUT 13 INSIDE 36", "SET 35 LOOSE", "PUT 20 INSIDE 29", "PUT 14 INSIDE 44" };
    assertEquals(17, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case46() {
    int n = 50;
    String[] actions = { "PUT 7 INSIDE 17", "SET 16 LOOSE", "PUT 4 INSIDE 21", "PUT 8 INSIDE 34", "SET 33 LOOSE", "SET 35 LOOSE", "PUT 2 INSIDE 45", "PUT 6 INSIDE 11", "PUT 5 INSIDE 34", "PUT 3 INSIDE 11", "PUT 1 INSIDE 46", "PUT 9 INSIDE 19", "PUT 10 INSIDE 41" };
    assertEquals(40, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case47() {
    int n = 10;
    String[] actions = { "PUT 2 INSIDE 6", "PUT 1 INSIDE 9", "PUT 3 INSIDE 7", "SWAP 5 WITH 4", "SWAP 5 WITH 4", "PUT 4 INSIDE 10", "SWAP 6 WITH 5", "SET 10 LOOSE", "PUT 4 INSIDE 7" };
    assertEquals(6, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case48() {
    int n = 46;
    String[] actions = { "SET 14 LOOSE", "PUT 5 INSIDE 18", "SWAP 3 WITH 11", "PUT 1 INSIDE 19", "PUT 16 INSIDE 10", "PUT 8 INSIDE 26", "PUT 6 INSIDE 15", "PUT 4 INSIDE 13", "PUT 19 INSIDE 32", "PUT 2 INSIDE 11", "PUT 7 INSIDE 12", "SWAP 35 WITH 39", "PUT 18 INSIDE 32", "PUT 44 INSIDE 27", "PUT 13 INSIDE 41", "PUT 17 INSIDE 25", "PUT 14 INSIDE 42", "PUT 3 INSIDE 11", "PUT 11 INSIDE 22", "SWAP 36 WITH 10", "PUT 9 INSIDE 25", "SET 27 LOOSE", "PUT 15 INSIDE 42", "SET 23 LOOSE", "PUT 10 INSIDE 23", "SWAP 34 WITH 22", "PUT 12 INSIDE 39" };
    assertEquals(27, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case49() {
    int n = 2;
    String[] actions = { "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "SWAP 1 WITH 2", "SET 1 LOOSE", "SET 2 LOOSE", "SET 1 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "SWAP 2 WITH 1", "PUT 2 INSIDE 1", "SET 1 LOOSE", "SET 2 LOOSE", "SWAP 1 WITH 2", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "SET 1 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 1 INSIDE 2" };
    assertEquals(1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case50() {
    int n = 10;
    String[] actions = { "PUT 1 INSIDE 5", "PUT 3 INSIDE 8", "SWAP 2 WITH 6", "PUT 5 INSIDE 8", "PUT 4 INSIDE 10", "SWAP 6 WITH 9", "PUT 2 INSIDE 7", "SWAP 7 WITH 9", "PUT 8 INSIDE 7", "PUT 9 INSIDE 7", "SWAP 10 WITH 7", "PUT 7 INSIDE 6", "SET 6 LOOSE", "PUT 7 INSIDE 10", "PUT 10 INSIDE 6", "SET 6 LOOSE", "PUT 10 INSIDE 6", "SET 6 LOOSE", "PUT 6 INSIDE 10", "SET 10 LOOSE", "PUT 4 INSIDE 7", "PUT 2 INSIDE 9", "SWAP 10 WITH 8", "PUT 6 INSIDE 10" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case51() {
    int n = 50;
    String[] actions = { "PUT 8 INSIDE 26", "PUT 1 INSIDE 7", "PUT 6 INSIDE 34", "PUT 28 INSIDE 44", "PUT 13 INSIDE 24", "PUT 2 INSIDE 14", "PUT 12 INSIDE 26", "PUT 25 INSIDE 38", "PUT 29 INSIDE 43", "PUT 16 INSIDE 35", "PUT 4 INSIDE 24", "PUT 11 INSIDE 21", "PUT 3 INSIDE 15", "PUT 31 INSIDE 48", "SWAP 32 WITH 5", "PUT 10 INSIDE 17", "SWAP 41 WITH 49", "PUT 33 INSIDE 37", "PUT 20 INSIDE 44", "PUT 22 INSIDE 39", "SWAP 35 WITH 41", "PUT 14 INSIDE 26", "PUT 5 INSIDE 26", "SWAP 40 WITH 39", "PUT 19 INSIDE 42", "PUT 15 INSIDE 24", "PUT 34 INSIDE 43", "PUT 7 INSIDE 18", "PUT 21 INSIDE 48", "SET 30 LOOSE", "PUT 17 INSIDE 48", "PUT 18 INSIDE 45", "PUT 9 INSIDE 27", "PUT 43 INSIDE 50", "PUT 27 INSIDE 48", "PUT 30 INSIDE 44", "SWAP 23 WITH 41", "PUT 37 INSIDE 50", "PUT 32 INSIDE 49", "PUT 26 INSIDE 42", "PUT 23 INSIDE 47", "SET 50 LOOSE", "PUT 24 INSIDE 48" };
    assertEquals(16, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case52() {
    int n = 30;
    String[] actions = { "PUT 8 INSIDE 20", "SWAP 15 WITH 7", "SWAP 19 WITH 5", "SWAP 1 WITH 7", "PUT 3 INSIDE 7", "PUT 13 INSIDE 20", "PUT 2 INSIDE 6", "PUT 1 INSIDE 4", "PUT 5 INSIDE 14", "PUT 6 INSIDE 15", "PUT 4 INSIDE 10", "PUT 10 INSIDE 24", "PUT 14 INSIDE 25", "PUT 16 INSIDE 23", "PUT 7 INSIDE 15", "PUT 15 INSIDE 25", "PUT 9 INSIDE 28", "PUT 17 INSIDE 25", "PUT 11 INSIDE 29", "PUT 3 INSIDE 30" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case53() {
    int n = 30;
    String[] actions = { "PUT 5 INSIDE 26", "PUT 8 INSIDE 23", "PUT 2 INSIDE 28", "SET 25 LOOSE", "PUT 7 INSIDE 11", "PUT 1 INSIDE 3", "PUT 3 INSIDE 29", "SET 10 LOOSE", "PUT 4 INSIDE 18", "SWAP 21 WITH 28", "PUT 9 INSIDE 13", "PUT 6 INSIDE 16" };
    assertEquals(21, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case54() {
    int n = 40;
    String[] actions = { "PUT 1 INSIDE 5", "PUT 21 INSIDE 22", "PUT 11 INSIDE 26", "PUT 18 INSIDE 29", "PUT 17 INSIDE 30", "PUT 9 INSIDE 31", "PUT 15 INSIDE 31", "PUT 3 INSIDE 4", "PUT 2 INSIDE 4", "PUT 5 INSIDE 7", "PUT 25 INSIDE 35", "PUT 10 INSIDE 27", "PUT 6 INSIDE 19", "PUT 20 INSIDE 24", "PUT 13 INSIDE 28", "PUT 4 INSIDE 7", "PUT 12 INSIDE 33", "PUT 14 INSIDE 22", "PUT 22 INSIDE 40", "PUT 7 INSIDE 16", "PUT 28 INSIDE 40", "PUT 27 INSIDE 35", "PUT 8 INSIDE 24", "PUT 19 INSIDE 24", "SWAP 24 WITH 33", "PUT 26 INSIDE 38", "PUT 23 INSIDE 32", "PUT 31 INSIDE 37", "PUT 30 INSIDE 32", "PUT 29 INSIDE 35", "PUT 16 INSIDE 24", "PUT 24 INSIDE 34" };
    assertEquals(9, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case55() {
    int n = 12;
    String[] actions = { "PUT 3 INSIDE 7", "PUT 1 INSIDE 4", "PUT 6 INSIDE 12", "PUT 11 INSIDE 5", "PUT 8 INSIDE 10", "PUT 2 INSIDE 4", "PUT 4 INSIDE 7", "PUT 7 INSIDE 10", "SET 5 LOOSE", "PUT 10 INSIDE 11", "PUT 5 INSIDE 11", "SET 9 LOOSE", "SET 11 LOOSE", "PUT 5 INSIDE 10", "PUT 11 INSIDE 9", "PUT 10 INSIDE 9", "PUT 9 INSIDE 12", "SET 12 LOOSE", "PUT 6 INSIDE 12", "SET 9 LOOSE", "PUT 10 INSIDE 9", "PUT 12 INSIDE 9", "PUT 9 INSIDE 11", "SET 11 LOOSE", "PUT 9 INSIDE 11", "SET 11 LOOSE", "PUT 11 INSIDE 9", "SET 9 LOOSE", "SWAP 12 WITH 9", "SWAP 10 WITH 9", "PUT 9 INSIDE 12" };
    assertEquals(3, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case56() {
    int n = 42;
    String[] actions = { "PUT 13 INSIDE 23", "PUT 3 INSIDE 14", "PUT 2 INSIDE 10", "SWAP 30 WITH 16", "SWAP 35 WITH 28", "PUT 7 INSIDE 34", "PUT 9 INSIDE 35", "SWAP 22 WITH 18", "PUT 5 INSIDE 41", "SET 19 LOOSE", "PUT 1 INSIDE 8", "PUT 10 INSIDE 19", "PUT 15 INSIDE 30", "PUT 12 INSIDE 20", "PUT 14 INSIDE 39", "PUT 11 INSIDE 25", "PUT 4 INSIDE 30", "PUT 6 INSIDE 39", "PUT 8 INSIDE 32" };
    assertEquals(27, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case57() {
    int n = 21;
    String[] actions = { "SWAP 11 WITH 2", "PUT 1 INSIDE 5", "SET 11 LOOSE" };
    assertEquals(20, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case58() {
    int n = 23;
    String[] actions = { "SET 4 LOOSE", "PUT 1 INSIDE 6", "PUT 4 INSIDE 5", "PUT 14 INSIDE 21", "PUT 17 INSIDE 2", "PUT 13 INSIDE 21", "PUT 7 INSIDE 12", "SWAP 23 WITH 10", "SWAP 20 WITH 2", "PUT 3 INSIDE 9", "SET 8 LOOSE", "PUT 10 INSIDE 18", "PUT 2 INSIDE 8", "PUT 5 INSIDE 11", "PUT 9 INSIDE 11", "PUT 12 INSIDE 16", "PUT 21 INSIDE 20", "PUT 8 INSIDE 15", "PUT 15 INSIDE 18", "PUT 18 INSIDE 23", "PUT 22 INSIDE 23", "SET 19 LOOSE", "PUT 6 INSIDE 11", "PUT 16 INSIDE 23", "PUT 11 INSIDE 23", "PUT 19 INSIDE 23", "SET 20 LOOSE", "PUT 23 INSIDE 17", "PUT 21 INSIDE 20", "PUT 20 INSIDE 17", "SET 17 LOOSE", "PUT 17 INSIDE 20", "SWAP 20 WITH 23", "PUT 20 INSIDE 23", "SET 23 LOOSE", "PUT 20 INSIDE 23", "SET 23 LOOSE", "PUT 20 INSIDE 23", "SET 23 LOOSE", "SET 20 LOOSE", "SWAP 21 WITH 19", "PUT 11 INSIDE 16" };
    assertEquals(8, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case59() {
    int n = 43;
    String[] actions = { "PUT 1 INSIDE 7", "PUT 5 INSIDE 13", "PUT 2 INSIDE 13", "SET 10 LOOSE", "PUT 7 INSIDE 10", "PUT 6 INSIDE 14", "PUT 11 INSIDE 42", "PUT 4 INSIDE 15", "PUT 9 INSIDE 42", "PUT 8 INSIDE 13", "PUT 12 INSIDE 38", "PUT 13 INSIDE 19", "SWAP 33 WITH 19", "PUT 3 INSIDE 10", "PUT 15 INSIDE 42", "PUT 18 INSIDE 27", "PUT 17 INSIDE 31", "PUT 10 INSIDE 32", "PUT 14 INSIDE 33", "PUT 16 INSIDE 26" };
    assertEquals(25, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case60() {
    int n = 8;
    String[] actions = { "PUT 1 INSIDE 2" };
    assertEquals(7, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case61() {
    int n = 50;
    String[] actions = { "PUT 1 INSIDE 8", "PUT 3 INSIDE 31", "PUT 2 INSIDE 50" };
    assertEquals(47, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case62() {
    int n = 2;
    String[] actions = { "SET 2 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "SWAP 1 WITH 2", "PUT 1 INSIDE 2", "SET 2 LOOSE", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "SET 1 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE", "SET 1 LOOSE", "PUT 2 INSIDE 1", "SET 1 LOOSE", "SET 1 LOOSE", "PUT 1 INSIDE 2", "SET 2 LOOSE" };
    assertEquals(2, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case63() {
    int n = 15;
    String[] actions = { "PUT 3 INSIDE 12", "PUT 6 INSIDE 12", "PUT 2 INSIDE 13", "PUT 1 INSIDE 4", "PUT 4 INSIDE 12", "SWAP 9 WITH 14", "PUT 5 INSIDE 12", "PUT 7 INSIDE 13" };
    assertEquals(8, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case64() {
    int n = 50;
    String[] actions = { "SWAP 35 WITH 31", "PUT 18 INSIDE 26", "SWAP 44 WITH 31", "PUT 21 INSIDE 45", "SWAP 19 WITH 8", "PUT 6 INSIDE 16", "PUT 19 INSIDE 27", "PUT 3 INSIDE 8", "PUT 11 INSIDE 22", "SET 23 LOOSE", "PUT 14 INSIDE 35", "PUT 13 INSIDE 26", "SET 23 LOOSE", "PUT 2 INSIDE 7", "PUT 7 INSIDE 23", "PUT 10 INSIDE 22", "PUT 8 INSIDE 22", "PUT 9 INSIDE 23", "PUT 22 INSIDE 45", "PUT 15 INSIDE 36", "PUT 1 INSIDE 4", "SWAP 35 WITH 47", "PUT 5 INSIDE 17", "PUT 23 INSIDE 39", "SET 25 LOOSE", "PUT 17 INSIDE 28", "PUT 16 INSIDE 27", "PUT 20 INSIDE 38", "PUT 4 INSIDE 12", "PUT 12 INSIDE 50" };
    assertEquals(27, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case65() {
    int n = 28;
    String[] actions = { "PUT 3 INSIDE 7", "PUT 21 INSIDE 28", "SET 10 LOOSE", "PUT 27 INSIDE 14", "PUT 25 INSIDE 16", "PUT 11 INSIDE 23", "PUT 26 INSIDE 14", "PUT 6 INSIDE 22", "PUT 1 INSIDE 10", "PUT 4 INSIDE 23", "SET 2 LOOSE", "PUT 5 INSIDE 17", "PUT 2 INSIDE 7", "SWAP 8 WITH 19", "PUT 23 INSIDE 16", "PUT 7 INSIDE 12", "PUT 19 INSIDE 14", "PUT 18 INSIDE 15", "PUT 10 INSIDE 12", "PUT 8 INSIDE 20", "SWAP 22 WITH 13", "SWAP 15 WITH 13", "SWAP 13 WITH 24", "PUT 9 INSIDE 17", "PUT 22 INSIDE 24", "PUT 13 INSIDE 28", "PUT 12 INSIDE 15", "PUT 15 INSIDE 14", "PUT 17 INSIDE 24", "PUT 20 INSIDE 28", "PUT 14 INSIDE 16", "PUT 24 INSIDE 16", "PUT 28 INSIDE 16", "SET 16 LOOSE", "PUT 16 INSIDE 28", "PUT 23 INSIDE 24", "SET 14 LOOSE", "SWAP 25 WITH 15", "PUT 19 INSIDE 25", "PUT 14 INSIDE 25", "PUT 15 INSIDE 24" };
    assertEquals(5, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case66() {
    int n = 23;
    String[] actions = { "PUT 3 INSIDE 5", "PUT 1 INSIDE 4", "PUT 11 INSIDE 17", "PUT 15 INSIDE 7", "SWAP 23 WITH 7", "PUT 5 INSIDE 10", "PUT 2 INSIDE 7", "SET 12 LOOSE", "PUT 8 INSIDE 20", "PUT 4 INSIDE 6", "PUT 16 INSIDE 22", "PUT 20 INSIDE 22", "PUT 6 INSIDE 10", "PUT 19 INSIDE 23", "PUT 12 INSIDE 21", "PUT 7 INSIDE 10", "PUT 17 INSIDE 22", "PUT 21 INSIDE 22", "PUT 9 INSIDE 14", "PUT 10 INSIDE 14", "PUT 13 INSIDE 18", "PUT 14 INSIDE 22", "PUT 18 INSIDE 22" };
    assertEquals(2, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case67() {
    int n = 4;
    String[] actions = { "SET 4 LOOSE", "PUT 2 INSIDE 1", "PUT 3 INSIDE 4", "PUT 1 INSIDE 4", "SET 4 LOOSE", "PUT 4 INSIDE 3", "PUT 1 INSIDE 3", "SET 3 LOOSE", "PUT 3 INSIDE 1", "SET 1 LOOSE", "PUT 1 INSIDE 3", "PUT 3 INSIDE 4", "PUT 4 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 4", "SET 4 LOOSE", "SWAP 2 WITH 3", "PUT 2 INSIDE 3", "PUT 4 INSIDE 3", "SET 3 LOOSE", "PUT 2 INSIDE 4", "PUT 3 INSIDE 4", "SET 4 LOOSE", "PUT 2 INSIDE 4", "SET 3 LOOSE", "PUT 4 INSIDE 3", "SET 3 LOOSE", "PUT 3 INSIDE 4", "SET 4 LOOSE", "SWAP 2 WITH 4", "PUT 2 INSIDE 3" };
    assertEquals(2, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case68() {
    int n = 40;
    String[] actions = { "SET 9 LOOSE", "PUT 1 INSIDE 8", "PUT 5 INSIDE 11", "PUT 7 INSIDE 32", "PUT 6 INSIDE 22", "SET 15 LOOSE", "PUT 8 INSIDE 12", "PUT 4 INSIDE 19", "PUT 3 INSIDE 27", "SET 10 LOOSE", "PUT 9 INSIDE 34", "SET 8 LOOSE", "PUT 2 INSIDE 38", "SWAP 17 WITH 26" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case69() {
    int n = 5;
    String[] actions = { "PUT 2 INSIDE 5", "SWAP 1 WITH 4", "PUT 4 INSIDE 1", "PUT 1 INSIDE 5", "PUT 5 INSIDE 3", "SET 3 LOOSE", "PUT 3 INSIDE 5", "SET 5 LOOSE", "PUT 2 INSIDE 3", "PUT 1 INSIDE 3", "SET 3 LOOSE", "PUT 3 INSIDE 5", "SWAP 2 WITH 1", "PUT 1 INSIDE 5", "PUT 5 INSIDE 2", "SET 2 LOOSE", "PUT 4 INSIDE 2", "PUT 5 INSIDE 2", "SET 2 LOOSE", "SWAP 4 WITH 5", "PUT 2 INSIDE 5", "SWAP 4 WITH 5", "SWAP 4 WITH 5", "PUT 5 INSIDE 4", "SET 4 LOOSE", "PUT 1 INSIDE 4", "SWAP 3 WITH 5", "PUT 3 INSIDE 4", "PUT 2 INSIDE 4" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case70() {
    int n = 11;
    String[] actions = { "PUT 4 INSIDE 9", "PUT 1 INSIDE 5", "PUT 5 INSIDE 8", "PUT 6 INSIDE 8", "PUT 2 INSIDE 9", "PUT 3 INSIDE 9", "PUT 7 INSIDE 8", "SET 11 LOOSE" };
    assertEquals(4, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case71() {
    int n = 38;
    String[] actions = { "PUT 1 INSIDE 28", "SET 4 LOOSE", "SWAP 7 WITH 9", "PUT 4 INSIDE 6", "PUT 2 INSIDE 18", "PUT 3 INSIDE 13" };
    assertEquals(34, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case72() {
    int n = 34;
    String[] actions = { "PUT 3 INSIDE 7", "PUT 4 INSIDE 7", "PUT 11 INSIDE 22", "PUT 14 INSIDE 27", "PUT 19 INSIDE 34", "PUT 1 INSIDE 6", "PUT 2 INSIDE 8", "PUT 6 INSIDE 10", "PUT 10 INSIDE 20", "PUT 5 INSIDE 9", "PUT 18 INSIDE 29", "PUT 7 INSIDE 15", "PUT 20 INSIDE 29", "SET 17 LOOSE", "PUT 9 INSIDE 21", "SET 24 LOOSE", "PUT 13 INSIDE 26", "PUT 12 INSIDE 31", "PUT 15 INSIDE 32", "PUT 8 INSIDE 16", "PUT 21 INSIDE 25", "SWAP 33 WITH 23", "PUT 16 INSIDE 32", "PUT 17 INSIDE 23" };
    assertEquals(13, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case73() {
    int n = 32;
    String[] actions = { "PUT 2 INSIDE 5", "PUT 1 INSIDE 11", "PUT 6 INSIDE 16", "SWAP 23 WITH 3", "PUT 4 INSIDE 8", "PUT 5 INSIDE 32", "PUT 3 INSIDE 13", "PUT 13 INSIDE 32", "PUT 12 INSIDE 15", "PUT 7 INSIDE 26", "PUT 8 INSIDE 16", "PUT 11 INSIDE 29", "PUT 9 INSIDE 21", "SET 25 LOOSE", "PUT 10 INSIDE 24" };
    assertEquals(19, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case74() {
    int n = 16;
    String[] actions = { "PUT 3 INSIDE 8", "SET 8 LOOSE", "PUT 1 INSIDE 7", "PUT 13 INSIDE 8", "PUT 4 INSIDE 10", "PUT 3 INSIDE 12", "PUT 2 INSIDE 9", "PUT 7 INSIDE 9", "PUT 6 INSIDE 5", "SWAP 9 WITH 14", "PUT 16 INSIDE 15", "SWAP 12 WITH 5", "PUT 12 INSIDE 14", "PUT 15 INSIDE 8", "PUT 11 INSIDE 14", "PUT 5 INSIDE 10", "PUT 10 INSIDE 14", "PUT 14 INSIDE 8", "PUT 9 INSIDE 8", "SET 8 LOOSE", "SET 8 LOOSE", "PUT 9 INSIDE 14", "PUT 8 INSIDE 14", "PUT 14 INSIDE 13", "SET 15 LOOSE", "SET 13 LOOSE" };
    assertEquals(4, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case75() {
    int n = 33;
    String[] actions = { "PUT 14 INSIDE 28", "PUT 7 INSIDE 10", "PUT 9 INSIDE 11", "SET 24 LOOSE", "PUT 2 INSIDE 8", "PUT 1 INSIDE 8", "PUT 8 INSIDE 19", "PUT 17 INSIDE 29", "PUT 5 INSIDE 20", "PUT 6 INSIDE 18", "PUT 3 INSIDE 16", "SET 30 LOOSE", "PUT 11 INSIDE 28", "SWAP 32 WITH 30", "PUT 10 INSIDE 27", "PUT 18 INSIDE 26", "PUT 13 INSIDE 25", "PUT 12 INSIDE 25", "PUT 16 INSIDE 33", "PUT 15 INSIDE 28", "PUT 4 INSIDE 20", "PUT 20 INSIDE 23", "PUT 19 INSIDE 26" };
    assertEquals(13, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case76() {
    int n = 7;
    String[] actions = { "SWAP 3 WITH 5", "PUT 1 INSIDE 3", "SWAP 3 WITH 6", "PUT 5 INSIDE 6", "SWAP 7 WITH 2", "SWAP 7 WITH 4", "SET 3 LOOSE", "PUT 3 INSIDE 1", "PUT 2 INSIDE 4", "PUT 1 INSIDE 7", "PUT 6 INSIDE 7", "SET 7 LOOSE", "PUT 7 INSIDE 1", "SWAP 6 WITH 1", "PUT 1 INSIDE 4", "PUT 4 INSIDE 6", "SET 6 LOOSE", "PUT 6 INSIDE 7", "SET 3 LOOSE", "SWAP 4 WITH 3", "PUT 3 INSIDE 4", "PUT 4 INSIDE 5", "PUT 5 INSIDE 7", "SET 7 LOOSE", "PUT 5 INSIDE 7", "PUT 6 INSIDE 7" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case77() {
    int n = 13;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 2 INSIDE 6", "SET 11 LOOSE", "PUT 3 INSIDE 4", "PUT 12 INSIDE 13", "SET 8 LOOSE", "SWAP 6 WITH 4", "SET 13 LOOSE", "PUT 4 INSIDE 9", "SWAP 13 WITH 12", "SWAP 10 WITH 5", "PUT 6 INSIDE 13", "PUT 8 INSIDE 13", "PUT 9 INSIDE 13", "PUT 12 INSIDE 11", "SWAP 10 WITH 5", "PUT 13 INSIDE 11", "PUT 5 INSIDE 10", "PUT 11 INSIDE 7", "SET 7 LOOSE", "PUT 10 INSIDE 11", "PUT 11 INSIDE 7", "SET 7 LOOSE", "SWAP 11 WITH 7", "PUT 7 INSIDE 11", "SET 11 LOOSE", "PUT 10 INSIDE 13", "PUT 7 INSIDE 11" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case78() {
    int n = 20;
    String[] actions = { "PUT 4 INSIDE 8", "PUT 14 INSIDE 16", "PUT 3 INSIDE 8", "PUT 19 INSIDE 17", "PUT 7 INSIDE 12", "PUT 1 INSIDE 2", "PUT 16 INSIDE 17", "PUT 10 INSIDE 13", "SWAP 2 WITH 15", "PUT 6 INSIDE 11", "PUT 2 INSIDE 5", "PUT 20 INSIDE 12", "PUT 8 INSIDE 9", "PUT 5 INSIDE 9", "PUT 9 INSIDE 13", "PUT 13 INSIDE 15", "SET 12 LOOSE", "PUT 7 INSIDE 11", "PUT 12 INSIDE 17", "PUT 18 INSIDE 20", "SET 17 LOOSE", "PUT 11 INSIDE 12", "PUT 16 INSIDE 20", "PUT 12 INSIDE 15", "PUT 19 INSIDE 17", "SWAP 20 WITH 17", "PUT 15 INSIDE 17", "PUT 17 INSIDE 20" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case79() {
    int n = 22;
    String[] actions = { "PUT 1 INSIDE 2", "SET 7 LOOSE", "PUT 3 INSIDE 7", "PUT 8 INSIDE 10", "PUT 5 INSIDE 10", "PUT 4 INSIDE 6", "PUT 11 INSIDE 10", "PUT 14 INSIDE 22", "PUT 17 INSIDE 16", "PUT 7 INSIDE 12", "SWAP 10 WITH 22", "SWAP 12 WITH 20", "SET 21 LOOSE", "SET 10 LOOSE", "PUT 12 INSIDE 22", "PUT 2 INSIDE 5", "PUT 6 INSIDE 10", "PUT 10 INSIDE 14", "PUT 5 INSIDE 11", "PUT 11 INSIDE 19", "PUT 21 INSIDE 16", "PUT 8 INSIDE 22", "PUT 9 INSIDE 20", "PUT 13 INSIDE 14", "PUT 14 INSIDE 16", "SET 16 LOOSE" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case80() {
    int n = 3;
    String[] actions = { "PUT 3 INSIDE 2", "PUT 1 INSIDE 2", "SET 2 LOOSE", "PUT 2 INSIDE 1", "SET 3 LOOSE", "PUT 3 INSIDE 1", "SET 1 LOOSE", "PUT 2 INSIDE 1", "PUT 1 INSIDE 3", "SET 3 LOOSE", "SWAP 1 WITH 3", "SET 1 LOOSE", "SET 1 LOOSE", "PUT 1 INSIDE 2", "PUT 3 INSIDE 2", "SET 2 LOOSE", "PUT 1 INSIDE 2", "PUT 2 INSIDE 3", "SET 3 LOOSE" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case81() {
    int n = 40;
    String[] actions = { "PUT 8 INSIDE 39", "PUT 14 INSIDE 27", "SET 26 LOOSE", "PUT 4 INSIDE 13", "PUT 5 INSIDE 13", "SWAP 22 WITH 11", "PUT 16 INSIDE 21", "SET 10 LOOSE", "PUT 18 INSIDE 21", "PUT 3 INSIDE 19", "PUT 12 INSIDE 34", "PUT 1 INSIDE 10", "PUT 13 INSIDE 23", "PUT 2 INSIDE 9", "PUT 10 INSIDE 23", "SWAP 28 WITH 40", "PUT 7 INSIDE 26", "PUT 6 INSIDE 19", "PUT 9 INSIDE 27", "PUT 15 INSIDE 38", "SET 22 LOOSE", "PUT 20 INSIDE 39", "PUT 19 INSIDE 22", "SET 28 LOOSE", "PUT 11 INSIDE 26", "PUT 17 INSIDE 24", "SWAP 29 WITH 40" };
    assertEquals(20, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case82() {
    int n = 21;
    String[] actions = { "PUT 20 INSIDE 5", "PUT 2 INSIDE 15", "PUT 4 INSIDE 8", "PUT 13 INSIDE 21", "SET 5 LOOSE", "PUT 10 INSIDE 16", "PUT 8 INSIDE 17", "PUT 1 INSIDE 6", "PUT 12 INSIDE 21", "PUT 14 INSIDE 21", "PUT 7 INSIDE 9", "PUT 21 INSIDE 9", "PUT 17 INSIDE 19", "SET 6 LOOSE", "PUT 20 INSIDE 6", "SWAP 3 WITH 15", "PUT 5 INSIDE 11", "PUT 1 INSIDE 3", "PUT 9 INSIDE 6", "PUT 19 INSIDE 18", "PUT 16 INSIDE 6", "PUT 3 INSIDE 11", "PUT 11 INSIDE 6", "PUT 15 INSIDE 6", "SET 6 LOOSE", "SWAP 18 WITH 9", "SET 18 LOOSE", "PUT 6 INSIDE 11", "PUT 15 INSIDE 18", "PUT 9 INSIDE 18", "PUT 16 INSIDE 19", "PUT 11 INSIDE 20", "SET 20 LOOSE", "PUT 7 INSIDE 11", "PUT 11 INSIDE 18", "SET 19 LOOSE" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case83() {
    int n = 49;
    String[] actions = { "PUT 3 INSIDE 12", "PUT 1 INSIDE 5", "SWAP 35 WITH 14", "PUT 2 INSIDE 23", "PUT 6 INSIDE 14", "PUT 7 INSIDE 25", "PUT 20 INSIDE 49", "PUT 11 INSIDE 43", "SWAP 22 WITH 24", "PUT 4 INSIDE 9", "PUT 13 INSIDE 43", "PUT 15 INSIDE 49", "PUT 24 INSIDE 39", "SWAP 30 WITH 42", "PUT 23 INSIDE 26", "PUT 12 INSIDE 28", "PUT 5 INSIDE 22", "PUT 17 INSIDE 28", "SET 38 LOOSE", "PUT 8 INSIDE 10", "PUT 14 INSIDE 45", "PUT 22 INSIDE 30", "PUT 18 INSIDE 36", "PUT 9 INSIDE 40", "PUT 25 INSIDE 37", "PUT 10 INSIDE 37", "PUT 19 INSIDE 28", "PUT 16 INSIDE 43", "PUT 22 INSIDE 40" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case84() {
    int n = 26;
    String[] actions = { "PUT 3 INSIDE 20", "PUT 1 INSIDE 9", "PUT 9 INSIDE 26", "PUT 2 INSIDE 6", "SWAP 7 WITH 21", "PUT 6 INSIDE 20", "PUT 10 INSIDE 26", "PUT 4 INSIDE 18", "SET 15 LOOSE", "PUT 5 INSIDE 17", "PUT 7 INSIDE 24", "PUT 8 INSIDE 20" };
    assertEquals(16, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case85() {
    int n = 12;
    String[] actions = { "PUT 1 INSIDE 5", "PUT 4 INSIDE 10", "PUT 12 INSIDE 6", "PUT 7 INSIDE 10", "PUT 8 INSIDE 11", "SET 9 LOOSE", "PUT 2 INSIDE 5", "SWAP 5 WITH 3", "PUT 3 INSIDE 10", "PUT 5 INSIDE 9", "PUT 11 INSIDE 6", "SET 10 LOOSE", "PUT 3 INSIDE 9", "PUT 9 INSIDE 7", "PUT 7 INSIDE 4", "SET 4 LOOSE", "PUT 4 INSIDE 10", "PUT 6 INSIDE 7", "SWAP 10 WITH 7", "PUT 7 INSIDE 10", "SET 10 LOOSE", "SET 7 LOOSE", "PUT 4 INSIDE 7", "SET 6 LOOSE", "PUT 7 INSIDE 10", "PUT 6 INSIDE 9", "PUT 9 INSIDE 11", "PUT 10 INSIDE 12", "PUT 11 INSIDE 12" };
    assertEquals(1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case86() {
    int n = 41;
    String[] actions = { "SET 13 LOOSE", "PUT 12 INSIDE 22", "SET 19 LOOSE", "PUT 4 INSIDE 19", "PUT 17 INSIDE 15", "SET 39 LOOSE", "PUT 3 INSIDE 20", "SWAP 39 WITH 6", "PUT 19 INSIDE 25", "PUT 7 INSIDE 28", "PUT 5 INSIDE 13", "PUT 9 INSIDE 31", "SWAP 27 WITH 15", "PUT 20 INSIDE 25", "PUT 16 INSIDE 36", "SWAP 25 WITH 26", "PUT 2 INSIDE 18", "SWAP 6 WITH 37", "PUT 21 INSIDE 25", "PUT 13 INSIDE 31", "PUT 6 INSIDE 15", "PUT 1 INSIDE 11", "PUT 14 INSIDE 33", "PUT 15 INSIDE 33", "PUT 8 INSIDE 27", "PUT 18 INSIDE 29", "PUT 41 INSIDE 24", "PUT 11 INSIDE 10" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case87() {
    int n = 50;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 2 INSIDE 3", "PUT 3 INSIDE 4", "PUT 4 INSIDE 5", "PUT 5 INSIDE 6", "PUT 6 INSIDE 7", "PUT 7 INSIDE 8", "PUT 8 INSIDE 9", "PUT 9 INSIDE 10", "PUT 10 INSIDE 11", "PUT 11 INSIDE 12", "PUT 12 INSIDE 13", "PUT 13 INSIDE 14", "PUT 14 INSIDE 15", "PUT 15 INSIDE 16", "PUT 16 INSIDE 17", "PUT 17 INSIDE 18", "PUT 18 INSIDE 19", "PUT 19 INSIDE 20", "PUT 20 INSIDE 21", "PUT 21 INSIDE 22", "PUT 22 INSIDE 23", "PUT 23 INSIDE 24", "PUT 24 INSIDE 25", "PUT 25 INSIDE 26", "PUT 26 INSIDE 27", "PUT 27 INSIDE 28", "PUT 28 INSIDE 29", "PUT 29 INSIDE 30", "PUT 30 INSIDE 31", "PUT 31 INSIDE 32", "PUT 32 INSIDE 33", "PUT 33 INSIDE 34", "PUT 34 INSIDE 35", "PUT 35 INSIDE 36", "PUT 36 INSIDE 37", "PUT 37 INSIDE 38", "PUT 38 INSIDE 39", "PUT 39 INSIDE 40", "PUT 40 INSIDE 41", "PUT 41 INSIDE 42", "PUT 42 INSIDE 43", "PUT 43 INSIDE 44", "PUT 44 INSIDE 45", "PUT 45 INSIDE 46", "PUT 46 INSIDE 47", "PUT 47 INSIDE 48", "PUT 48 INSIDE 49", "PUT 49 INSIDE 50" };
    assertEquals(1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case88() {
    int n = 13;
    String[] actions = {  };
    assertEquals(13, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case89() {
    int n = 1;
    String[] actions = { "SET 1 LOOSE" };
    assertEquals(1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case90() {
    int n = 1;
    String[] actions = {  };
    assertEquals(1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case91() {
    int n = 4;
    String[] actions = { "PUT 3 INSIDE 2", "SWAP 4 WITH 2", "PUT 2 INSIDE 4", "SET 1 LOOSE" };
    assertEquals(2, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case92() {
    int n = 4;
    String[] actions = { "PUT 3 INSIDE 2", "PUT 2 INSIDE 1", "SWAP 1 WITH 4", "SET 4 LOOSE" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case93() {
    int n = 3;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 3 INSIDE 1" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case94() {
    int n = 15;
    String[] actions = { "PUT 10 INSIDE 15", "SET 1 LOOSE" };
    assertEquals(14, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case95() {
    int n = 6;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 3 INSIDE 2", "PUT 4 INSIDE 5", "PUT 6 INSIDE 5", "SWAP 2 WITH 5", "SET 2 LOOSE" };
    assertEquals(4, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case96() {
    int n = 3;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 2 INSIDE 3", "SET 3 LOOSE" };
    assertEquals(2, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case97() {
    int n = 3;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 2 INSIDE 3", "SET 2 LOOSE" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case98() {
    int n = 3;
    String[] actions = { "PUT 1 INSIDE 2", "SWAP 3 WITH 1" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case99() {
    int n = 2;
    String[] actions = { "PUT 1 INSIDE 2", "SWAP 1 WITH 2" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case100() {
    int n = 3;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 1 INSIDE 3" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case101() {
    int n = 50;
    String[] actions = { "PUT 20 INSIDE 30", "PUT 2 INSIDE 30" };
    assertEquals(48, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case102() {
    int n = 5;
    String[] actions = { "PUT 1 INSIDE 5", "PUT 2 INSIDE 5", "PUT 3 INSIDE 5", "PUT 4 INSIDE 5", "SET 5 LOOSE" };
    assertEquals(5, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case103() {
    int n = 4;
    String[] actions = { "PUT 1 INSIDE 4", "PUT 2 INSIDE 4", "PUT 3 INSIDE 4", "SET 4 LOOSE" };
    assertEquals(4, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case104() {
    int n = 2;
    String[] actions = { "PUT 2 INSIDE 1" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case105() {
    int n = 3;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 2 INSIDE 3", "PUT 1 INSIDE 3" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

  @Test
  public void case106() {
    int n = 5;
    String[] actions = { "PUT 1 INSIDE 2", "PUT 3 INSIDE 2" };
    assertEquals(-1, bagsquiz.checkIfProper(n, actions));
  }

}
