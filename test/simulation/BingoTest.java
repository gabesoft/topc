package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class BingoTest {
  Bingo bingo = new Bingo();

  @Test
  public void case1() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B12", "B3", "I16", "N40", "B2", "O70", "B1", "B9", "O71", "B4", "B7", "B11", "O68", "BINGO" };
    assertEquals("B12,B3,B1,B9,B4", bingo.winner(card, calls));
  }

  @Test
  public void case2() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B12", "B3", "I16", "N40", "B2", "O70", "B1", "B9", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case3() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "G48", "I23", "B9", "B1", "B4", "B3", "B7", "B12", "G49", "BINGO" };
    assertEquals("O63,G48,I23,B12", bingo.winner(card, calls));
  }

  @Test
  public void case4() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case5() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B12", "B3", "N40", "B2", "O70", "B1", "B9", "O71", "N34", "B7", "B11", "O66", "G52", "I16", "BINGO" };
    assertEquals("B3,O66,G52,I16", bingo.winner(card, calls));
  }

  @Test
  public void case6() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case7() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 72", "  2 22 33 55 66", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B12", "B9", "B1", "B4", "B15", "B3", "I16", "G55", "O72", "BINGO" };
    assertEquals("B3,I16,G55,O72", bingo.winner(card, calls));
  }

  @Test
  public void case8() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 72", "  2 22 33 55 66", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B2", "B12", "B9", "B1", "B4", "B15", "B3", "I16", "G55", "O72", "BINGO" };
    assertEquals("B2,B9,B1,B4,B3", bingo.winner(card, calls));
  }

  @Test
  public void case9() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 72", "  2 22 33 55 66", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "I23", "N34", "G52", "O66", "O71", "O75", "O61", "O63", "B12", "B9", "B1", "B4", "B15", "B3", "I16", "G55", "O72", "O70", "BINGO" };
    assertEquals("I23,N34,G52,B9,O72", bingo.winner(card, calls));
  }

  @Test
  public void case10() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 72", "  2 22 33 55 66", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "I19", "I18", "G52", "I23", "N34", "O66", "O71", "O75", "O61", "O63", "B12", "B9", "B1", "B4", "B15", "B3", "I16", "G55", "O72", "O70", "BINGO" };
    assertEquals("G52,I23,N34,B9,O72", bingo.winner(card, calls));
  }

  @Test
  public void case11() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 72", "  2 22 33 55 66", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "I19", "I18", "O71", "G52", "I23", "N34", "O66", "O75", "O61", "O63", "B12", "B9", "B1", "B4", "B15", "B3", "I16", "G55", "O72", "O70", "BINGO" };
    assertEquals("O71,O66,O61,O63,O72", bingo.winner(card, calls));
  }

  @Test
  public void case12() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 62", "  2 22 33 50 66", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O61", "G59", "N33", "N34", "N35", "N41", "G48", "I16", "B4", "N40", "BINGO" };
    assertEquals("O61,G48,I16,B4,N40", bingo.winner(card, calls));
  }

  @Test
  public void case13() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 62", "  2 22 33 50 66", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "G59", "N33", "N34", "N35", "N41", "G48", "O61", "I16", "B4", "N40", "BINGO" };
    assertEquals("N33,N34,N41,N40", bingo.winner(card, calls));
  }

  @Test
  public void case14() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 62", "  2 22 33 50 66", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "G59", "N33", "N34", "N35", "N41", "G48", "O61", "I16", "B4", "I17", "I19", "I20", "I21", "I25", "I26", "I27", "I28", "I29", "I30", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case15() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 62", "  2 22 33 50 66", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "G59", "N33", "N34", "N35", "I22", "B9", "O63", "N41", "G48", "O61", "I16", "B4", "I17", "I19", "I20", "I21", "I25", "I26", "I27", "I28", "I29", "I30", "BINGO" };
    assertEquals("I22,B9,O63,G48", bingo.winner(card, calls));
  }

  @Test
  public void case16() {
    String[] card = { "  B  I  N  G  O", "  1 23 34 52 62", "  2 22 33 50 66", "  3 24  F 59 71", "  4 16 40 48 61", "  9 18 41 49 63" };
    String[] calls = { "G59", "N33", "N34", "N35", "I22", "B9", "O63", "N41", "G48", "O61", "I16", "B4", "I17", "I19", "I20", "I21", "I25", "I26", "I27", "I28", "I29", "I30", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case17() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "I22", "I23", "N33", "G55", "G48", "O66", "O63", "B12", "BINGO" };
    assertEquals("I22,N33,G55,O66,B12", bingo.winner(card, calls));
  }

  @Test
  public void case18() {
    String[] card = { "  B  I  N  G  O", "  9 23 34 52 72", "  2 22 33 55 66", "  1 24  F 54 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "G48", "B9", "I22", "I20", "BINGO" };
    assertEquals("O63,G48,B9,I22", bingo.winner(card, calls));
  }

  @Test
  public void case19() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 75", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 43 49 72" };
    String[] calls = { "I19", "I18", "G52", "I23", "N34", "O66", "O71", "O75", "O61", "O63", "B12", "B11", "B1", "B4", "B15", "B3", "I16", "G55", "O72", "O70", "BINGO" };
    assertEquals("G52,O66,B3,I16", bingo.winner(card, calls));
  }

  @Test
  public void case20() {
    String[] card = { "  B  I  N  G  O", "  1 23 31 51 63", "  2 22 33 50 65", "  3 21  F 49 67", "  4 16 34 48 70", "  5 18 35 47 73" };
    String[] calls = { "I22", "I18", "G52", "I23", "N34", "O66", "O67", "I21", "B8", "B2", "O75", "O61", "O63", "B12", "B11", "B1", "B4", "B15", "B3", "I16", "G55", "O72", "I19", "O70", "BINGO" };
    assertEquals("I22,I18,I23,I21,I16", bingo.winner(card, calls));
  }

  @Test
  public void case21() {
    String[] card = { "  B  I  N  G  O", "  5 18 44 48 64", " 12 19 45 56 61", " 14 27  F 57 68", "  6 23 37 54 65", " 15 25 31 59 63" };
    String[] calls = { "O70", "B3", "B9", "I23", "N43", "B13", "B7", "G52", "O71", "G56", "N37", "O64", "G59", "B6", "B12", "N45", "B11", "N32", "G49", "I25", "N36", "N40", "I18", "O66", "I16", "G55", "G60", "B4", "G47", "N38", "I24", "B2", "B10", "O73", "N39", "N44", "G54", "O62", "I21", "I17", "N33", "O63", "I22", "O65", "B14", "N35", "G51", "I29", "B15", "BINGO" };
    assertEquals("I23,N37,B6,G54,O65", bingo.winner(card, calls));
  }

  @Test
  public void case22() {
    String[] card = { "  B  I  N  G  O", " 15 28 37 50 70", "  8 27 36 54 75", "  9 23  F 49 62", "  5 22 44 46 74", " 12 25 33 55 73" };
    String[] calls = { "N36", "N40", "N41", "B6", "N43", "B15", "B13", "G53", "O70", "I29", "N35", "I23", "O66", "N37", "B1", "G58", "I27", "I18", "B4", "O71", "O63", "N44", "O62", "N34", "G50", "B11", "O64", "O67", "G54", "I26", "G49", "G59", "I22", "N31", "I30", "G47", "B12", "B14", "I21", "I19", "N38", "G55", "BINGO" };
    assertEquals("O70,G54,I22,B12", bingo.winner(card, calls));
  }

  @Test
  public void case23() {
    String[] card = { "  B  I  N  G  O", "  7 24 44 59 65", "  9 26 40 46 68", "  2 29  F 56 62", " 11 23 33 60 72", "  3 16 42 54 69" };
    String[] calls = { "G56", "G52", "B8", "I16", "I23", "G54", "I24", "G55", "O75", "G51", "N44", "I27", "N32", "G46", "O74", "O71", "O70", "G47", "B10", "B7", "B11", "O67", "N43", "I21", "I19", "I22", "B5", "B14", "N35", "I26", "G60", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case24() {
    String[] card = { "  B  I  N  G  O", " 11 25 39 54 64", "  2 27 31 52 75", "  9 16  F 58 65", " 12 29 38 47 61", "  4 18 36 46 71" };
    String[] calls = { "G60", "G57", "I29", "B1", "N35", "O63", "I20", "O61", "G53", "N33", "I26", "B12", "O66", "B7", "N41", "I16", "I22", "O72", "I23", "N45", "O73", "I19", "N32", "B6", "B15", "N34", "B3", "N44", "N39", "B10", "G58", "I24", "O64", "B5", "I25", "N42", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case25() {
    String[] card = { "  B  I  N  G  O", "  7 25 43 46 62", "  4 27 45 54 68", " 10 20  F 50 61", " 14 22 37 55 72", "  6 28 31 57 67" };
    String[] calls = { "G48", "I22", "O64", "O74", "G59", "N41", "I21", "B2", "I17", "B11", "O66", "N43", "G55", "B14", "I23", "I27", "I16", "I18", "I26", "B6", "I20", "N39", "O75", "B4", "G47", "N33", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case26() {
    String[] card = { "  B  I  N  G  O", "  6 17 42 55 71", "  2 25 39 58 74", " 14 22  F 50 73", " 11 21 38 47 75", " 10 24 35 49 68" };
    String[] calls = { "N40", "N36", "G60", "I27", "O68", "N45", "I28", "I22", "N32", "N39", "G55", "O69", "G57", "O73", "G59", "G50", "O72", "O64", "G54", "O65", "N35", "I17", "G51", "I20", "B11", "O63", "G48", "B9", "O61", "N42", "N33", "I30", "G47", "B3", "B13", "B2", "O71", "B6", "BINGO" };
    assertEquals("G55,I17,N42,O71,B6", bingo.winner(card, calls));
  }

  @Test
  public void case27() {
    String[] card = { "  B  I  N  G  O", " 10 23 42 54 73", " 12 19 34 56 70", "  4 25  F 51 67", " 11 24 32 57 71", "  5 21 38 53 64" };
    String[] calls = { "I24", "N34", "B2", "B8", "I20", "B10", "O73", "B1", "I18", "N40", "G49", "N43", "I16", "O72", "B3", "G55", "O65", "I23", "I17", "I29", "I27", "N42", "I22", "N37", "G51", "O70", "B14", "G52", "O68", "I26", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case28() {
    String[] card = { "  B  I  N  G  O", " 12 17 41 52 73", "  2 22 33 58 70", "  8 21  F 50 68", "  5 24 43 59 74", " 13 18 31 49 69" };
    String[] calls = { "N34", "G52", "B13", "I30", "I19", "G46", "O66", "N36", "O65", "N42", "I28", "N31", "G53", "G48", "G58", "O75", "N38", "I21", "I24", "I29", "I23", "N44", "O72", "B3", "I25", "B7", "B2", "O69", "I16", "N35", "N37", "I18", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case29() {
    String[] card = { "  B  I  N  G  O", "  3 23 40 57 71", " 10 17 43 50 66", "  9 20  F 58 64", "  8 16 36 46 68", " 13 30 33 60 61" };
    String[] calls = { "B15", "N33", "I22", "B5", "I21", "N39", "B14", "I28", "I26", "B4", "B7", "I29", "O72", "O74", "I19", "B8", "O62", "O71", "G49", "O75", "G51", "B13", "O63", "I27", "B6", "N45", "I24", "N38", "G52", "B11", "G57", "B9", "O65", "O70", "B10", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case30() {
    String[] card = { "  B  I  N  G  O", "  3 27 45 59 68", " 15 19 38 58 72", " 13 29  F 56 61", " 11 25 43 55 67", " 14 23 37 51 71" };
    String[] calls = { "B1", "G55", "I20", "I21", "B11", "G49", "N37", "G59", "I18", "O69", "G51", "B7", "I24", "O74", "B15", "N41", "I22", "B8", "I28", "O64", "N32", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case31() {
    String[] card = { "  B  I  N  G  O", " 10 26 41 58 75", "  1 17 43 51 72", "  9 22  F 50 73", "  5 20 44 53 74", " 14 28 34 48 66" };
    String[] calls = { "G56", "I16", "I30", "B3", "B15", "I17", "N42", "O69", "N31", "G58", "O64", "G59", "G60", "N34", "G52", "B7", "I22", "N44", "G48", "G47", "I19", "B10", "N39", "G51", "O62", "O66", "G54", "B6", "B11", "N32", "I28", "G55", "B12", "O73", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case32() {
    String[] card = { "  B  I  N  G  O", " 10 26 44 51 70", "  8 27 38 52 65", " 12 25  F 50 61", " 15 28 40 47 72", "  5 19 37 49 66" };
    String[] calls = { "I28", "N45", "N36", "G57", "I29", "B8", "O67", "N42", "O68", "B11", "B5", "O64", "O73", "I27", "I17", "B7", "B10", "N38", "I24", "O69", "G60", "I25", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case33() {
    String[] card = { "  B  I  N  G  O", "  3 23 44 55 74", " 15 22 39 47 70", "  8 19  F 60 64", "  4 20 32 49 72", "  2 27 34 59 68" };
    String[] calls = { "I26", "N33", "G60", "I21", "B8", "N36", "I17", "N31", "N41", "O63", "O72", "I22", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case34() {
    String[] card = { "  B  I  N  G  O", "  4 30 44 49 75", "  8 27 35 46 68", " 14 18  F 60 67", " 11 25 36 56 65", "  6 24 31 59 70" };
    String[] calls = { "N45", "G48", "G51", "I16", "N36", "I30", "O75", "N44", "N41", "N34", "G52", "N40", "B11", "B5", "I29", "G60", "B2", "B6", "B14", "I27", "G47", "O71", "O73", "I23", "O68", "O63", "O74", "N37", "N38", "G53", "G54", "I28", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case35() {
    String[] card = { "  B  I  N  G  O", "  2 16 37 49 61", " 10 21 39 50 75", "  1 30  F 55 67", " 11 27 44 53 69", "  3 28 41 47 74" };
    String[] calls = { "G57", "B13", "I20", "I27", "O72", "G46", "O65", "B2", "O70", "B14", "I26", "O73", "O66", "G52", "G50", "B11", "O74", "O63", "I30", "B1", "N43", "G48", "G51", "B6", "G47", "G56", "N34", "B4", "O67", "I28", "N39", "G53", "B5", "G49", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case36() {
    String[] card = { "  B  I  N  G  O", "  1 26 33 46 74", "  5 23 42 54 75", "  4 19  F 50 66", "  2 21 45 57 72", "  8 16 36 60 69" };
    String[] calls = { "O64", "G57", "I21", "N41", "O66", "B9", "B1", "O67", "O72", "G55", "N32", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case37() {
    String[] card = { "  B  I  N  G  O", "  5 27 39 46 70", "  2 23 33 60 64", "  6 26  F 57 72", "  8 18 43 58 65", " 13 29 35 47 62" };
    String[] calls = { "B8", "B2", "I24", "O74", "G55", "I27", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case38() {
    String[] card = { "  B  I  N  G  O", "  1 24 31 59 72", " 14 29 37 57 74", "  2 17  F 60 70", "  6 18 39 47 65", " 11 16 36 51 62" };
    String[] calls = { "I17", "G51", "B4", "B5", "N41", "O66", "I20", "I26", "B12", "B2", "O68", "N37", "N33", "I18", "N45", "G59", "G57", "N40", "O67", "I29", "G60", "I27", "O69", "B15", "B3", "G49", "O75", "I21", "G50", "I24", "G53", "B11", "N32", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case39() {
    String[] card = { "  B  I  N  G  O", "  1 20 39 59 66", "  6 21 42 46 62", "  3 28  F 55 67", " 12 25 33 56 68", "  7 26 37 58 70" };
    String[] calls = { "N38", "N41", "G56", "I28", "O71", "B7", "G49", "N44", "I23", "I26", "N33", "O69", "B10", "B6", "I22", "G47", "N35", "I27", "I25", "O75", "N31", "B9", "B2", "G59", "B12", "I30", "O72", "I18", "B13", "N32", "G48", "O70", "O66", "O67", "N43", "G46", "O64", "I17", "N42", "N37", "O61", "BINGO" };
    assertEquals("B7,I25,O66,G46", bingo.winner(card, calls));
  }

  @Test
  public void case40() {
    String[] card = { "  B  I  N  G  O", "  3 25 37 50 67", "  9 24 34 53 65", " 15 29  F 52 71", " 10 23 40 60 66", "  5 28 33 58 75" };
    String[] calls = { "N40", "I23", "B5", "I26", "G47", "N36", "G59", "I17", "I28", "B4", "N41", "O68", "O61", "N43", "G56", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case41() {
    String[] card = { "  B  I  N  G  O", "  3 24 35 52 74", "  5 26 45 46 62", " 12 18  F 54 70", " 15 20 41 47 64", "  8 19 31 60 71" };
    String[] calls = { "N41", "B12", "O66", "B1", "G56", "G47", "O72", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case42() {
    String[] card = { "  B  I  N  G  O", " 15 25 42 52 73", "  8 30 43 59 72", " 10 28  F 56 68", "  6 19 38 57 64", " 14 18 39 51 75" };
    String[] calls = { "I25", "I30", "I29", "N43", "G51", "B8", "O65", "B10", "B2", "O69", "I16", "B7", "O72", "B15", "O74", "I24", "N42", "B3", "B12", "N33", "G55", "G56", "B6", "B9", "N31", "I21", "I17", "O63", "B13", "I19", "N44", "N41", "G50", "I18", "B4", "G60", "N37", "O62", "O68", "B14", "I23", "N34", "N35", "BINGO" };
    assertEquals("B8,B10,B15,B6,B14", bingo.winner(card, calls));
  }

  @Test
  public void case43() {
    String[] card = { "  B  I  N  G  O", "  6 23 31 55 63", " 12 16 34 52 73", "  1 22  F 57 72", "  4 27 33 53 71", " 10 21 42 47 69" };
    String[] calls = { "I21", "O66", "B13", "O75", "O61", "B3", "I29", "B1", "I19", "I24", "O63", "O72", "G51", "O70", "B5", "G60", "O67", "N44", "B10", "N36", "I17", "G52", "G58", "N37", "N39", "I25", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case44() {
    String[] card = { "  B  I  N  G  O", "  7 30 32 46 68", " 11 25 39 50 72", "  3 17  F 60 69", "  5 23 45 55 63", "  9 22 35 48 61" };
    String[] calls = { "O67", "I29", "I16", "N44", "G50", "N40", "N32", "I24", "G46", "O63", "B6", "B12", "G52", "G51", "G47", "I30", "I18", "N34", "G48", "B10", "O72", "O66", "B3", "N33", "O64", "O71", "I25", "N38", "B14", "N37", "B1", "N35", "B15", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case45() {
    String[] card = { "  B  I  N  G  O", "  3 18 42 56 73", " 12 25 39 59 68", "  1 28  F 50 65", "  2 20 31 47 69", "  5 23 45 53 63" };
    String[] calls = { "O62", "N44", "G55", "O68", "I22", "N39", "B10", "N41", "I29", "I17", "I27", "O66", "I19", "G46", "I23", "G54", "I25", "N38", "O65", "N32", "N45", "G59", "N42", "B1", "O64", "N36", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case46() {
    String[] card = { "  B  I  N  G  O", "  5 24 32 48 75", "  1 20 45 59 66", " 13 27  F 49 62", " 15 18 35 55 72", "  9 16 37 56 73" };
    String[] calls = { "I22", "I21", "G60", "G48", "O71", "G55", "I23", "I16", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case47() {
    String[] card = { "  B  I  N  G  O", "  4 27 37 56 73", "  3 20 34 58 67", "  6 23  F 60 72", " 12 19 43 54 68", " 10 30 45 57 62" };
    String[] calls = { "N36", "O75", "B11", "G55", "I18", "N32", "G47", "I24", "N37", "I30", "N34", "G57", "G52", "N31", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case48() {
    String[] card = { "  B  I  N  G  O", "  9 25 44 60 73", " 14 23 40 54 64", " 11 19  F 52 71", " 13 18 35 59 65", "  7 30 45 56 72" };
    String[] calls = { "N44", "G59", "N32", "G48", "B4", "G52", "G58", "B5", "N39", "B11", "O68", "I30", "G51", "B12", "O74", "I24", "N35", "G47", "N45", "N36", "O72", "N41", "I28", "B14", "I20", "I27", "G49", "O75", "G57", "B8", "B13", "I18", "B2", "N40", "N34", "B1", "B15", "I25", "O61", "I22", "O73", "BINGO" };
    assertEquals("N44,N35,N45,N40", bingo.winner(card, calls));
  }

  @Test
  public void case49() {
    String[] card = { "  B  I  N  G  O", "  9 21 37 57 64", "  7 20 35 60 73", " 12 28  F 59 75", "  3 22 39 48 74", " 11 18 45 56 70" };
    String[] calls = { "N33", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case50() {
    String[] card = { "  B  I  N  G  O", " 11 30 44 53 75", " 12 21 40 52 69", " 10 28  F 51 66", "  3 17 32 56 67", "  2 16 38 58 74" };
    String[] calls = { "N42", "B9", "B10", "O74", "O75", "G58", "I28", "G48", "N38", "O62", "I30", "I27", "N37", "I29", "B13", "N43", "O64", "B8", "G56", "N41", "I23", "G60", "O67", "N33", "N31", "N39", "N35", "G55", "I19", "G50", "G53", "O72", "I22", "I21", "G46", "O69", "O65", "I16", "G57", "O61", "I24", "O71", "B4", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case51() {
    String[] card = { "  B  I  N  G  O", "  3 30 36 49 75", "  5 24 34 54 66", "  2 17  F 59 73", "  4 25 39 53 69", " 10 20 44 55 61" };
    String[] calls = { "B12", "G46", "G48", "B9", "O75", "G57", "B14", "G59", "N39", "O70", "N43", "I29", "I21", "I23", "G60", "B4", "B3", "G52", "B8", "N34", "O72", "B7", "N31", "N41", "I20", "O62", "G55", "I28", "I22", "N37", "I18", "N42", "G58", "I24", "N35", "G56", "G53", "N40", "O68", "I27", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case52() {
    String[] card = { "  B  I  N  G  O", " 15 26 34 53 67", "  7 30 40 50 64", "  3 25  F 55 65", " 10 18 38 47 72", " 12 20 37 59 68" };
    String[] calls = { "N36", "O67", "I19", "B14", "N42", "O66", "O71", "N38", "G60", "I22", "G53", "O63", "G49", "N33", "O75", "I30", "I28", "I24", "N34", "G54", "N41", "B3", "B6", "O74", "B9", "G48", "G50", "B2", "N43", "O69", "O70", "G55", "O64", "I23", "G47", "N32", "B13", "I26", "B10", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case53() {
    String[] card = { "  B  I  N  G  O", " 13 17 33 58 67", "  2 21 32 47 74", " 11 22  F 59 72", " 12 28 36 54 73", "  5 23 44 56 64" };
    String[] calls = { "N43", "G55", "B8", "G54", "O70", "N33", "B12", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case54() {
    String[] card = { "  B  I  N  G  O", "  8 19 34 58 61", "  6 25 35 54 64", "  2 18  F 47 75", "  1 29 32 52 63", "  7 30 36 59 74" };
    String[] calls = { "B9", "G60", "G47", "O69", "N42", "B10", "G58", "N39", "B1", "I28", "B2", "G56", "O67", "G52", "N33", "I16", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case55() {
    String[] card = { "  B  I  N  G  O", "  1 24 33 54 70", " 12 29 45 55 75", "  7 22  F 51 66", " 15 23 34 59 68", "  2 16 32 49 63" };
    String[] calls = { "O68", "I30", "I27", "G48", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case56() {
    String[] card = { "  B  I  N  G  O", " 14 20 40 49 74", " 13 22 36 57 69", "  8 19  F 54 61", "  4 23 33 47 62", " 10 27 43 52 66" };
    String[] calls = { "B13", "O61", "I22", "I17", "B9", "O73", "B5", "O70", "B1", "B4", "O67", "O64", "N45", "G57", "N44", "O75", "G60", "N38", "N31", "I21", "B15", "I27", "B10", "N33", "O62", "O71", "O63", "N39", "O66", "I18", "B6", "O72", "G51", "G49", "I23", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case57() {
    String[] card = { "  B  I  N  G  O", " 10 27 34 60 63", "  6 20 43 55 70", "  2 28  F 59 69", "  5 23 31 58 62", " 15 18 39 48 64" };
    String[] calls = { "B3", "O65", "N45", "I26", "I23", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case58() {
    String[] card = { "  B  I  N  G  O", "  5 25 39 57 63", " 10 23 37 48 64", "  2 20  F 53 71", "  3 27 43 55 65", "  9 30 41 60 73" };
    String[] calls = { "O63", "B9", "N38", "O62", "B3", "N41", "N44", "G60", "B4", "I21", "B15", "O70", "I23", "I27", "I26", "O69", "N34", "B5", "G52", "B2", "G48", "I25", "N35", "B13", "I20", "I29", "N33", "O74", "N45", "G49", "I18", "I24", "O66", "G47", "O68", "N32", "I16", "B10", "O75", "O64", "B1", "O71", "G46", "G53", "O67", "N40", "BINGO" };
    assertEquals("O63,B9,I27,G48", bingo.winner(card, calls));
  }

  @Test
  public void case59() {
    String[] card = { "  B  I  N  G  O", "  5 29 41 59 72", "  6 21 44 56 62", " 15 17  F 50 65", " 13 16 37 46 70", "  1 20 40 60 61" };
    String[] calls = { "G51", "I25", "B15", "B12", "B11", "G58", "N38", "B9", "I24", "O68", "G47", "O63", "B14", "B6", "I27", "O74", "G55", "N36", "N43", "I23", "G57", "I17", "O72", "I21", "B4", "N32", "O73", "I28", "N44", "G59", "I20", "G60", "O65", "B3", "N34", "I18", "O66", "O69", "O67", "N33", "B2", "O62", "I26", "N40", "G50", "I16", "O70", "BINGO" };
    assertEquals("B15,I17,O65,G50", bingo.winner(card, calls));
  }

  @Test
  public void case60() {
    String[] card = { "  B  I  N  G  O", " 10 20 38 56 68", " 11 26 37 51 72", " 14 29  F 59 67", "  1 16 44 50 65", " 12 24 35 49 66" };
    String[] calls = { "N40", "G52", "B2", "B11", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case61() {
    String[] card = { "  B  I  N  G  O", "  2 25 41 49 75", " 10 16 43 57 74", "  9 19  F 53 72", " 12 23 40 47 64", " 13 21 35 52 68" };
    String[] calls = { "I27", "B12", "O63", "B15", "G46", "O70", "N38", "B11", "N32", "O62", "B3", "G53", "O66", "I19", "B8", "I18", "N45", "O74", "G59", "I21", "G58", "G50", "I26", "N36", "O64", "B1", "N37", "I30", "N33", "G56", "G57", "G51", "N35", "N40", "I22", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case62() {
    String[] card = { "  B  I  N  G  O", "  8 22 42 57 61", "  7 19 38 56 70", "  1 24  F 55 72", "  6 18 37 54 64", " 15 27 39 52 66" };
    String[] calls = { "B9", "O64", "I30", "I28", "B3", "O75", "O62", "B4", "O67", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case63() {
    String[] card = { "  B  I  N  G  O", "  2 29 45 56 70", "  4 28 36 51 71", " 14 19  F 49 61", "  7 17 32 58 73", "  6 21 38 59 64" };
    String[] calls = { "B13", "B9", "G48", "G56", "I24", "N44", "N43", "O61", "I22", "O66", "I17", "O71", "B12", "N38", "B6", "G53", "O72", "I30", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case64() {
    String[] card = { "  B  I  N  G  O", " 10 29 41 50 63", " 15 23 43 49 67", " 11 21  F 46 72", "  9 18 40 56 66", "  6 17 34 54 69" };
    String[] calls = { "B9", "G53", "O74", "B14", "I24", "B5", "B12", "N33", "G49", "G46", "I17", "G57", "O63", "O75", "B1", "O62", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case65() {
    String[] card = { "  B  I  N  G  O", " 14 26 33 52 63", " 12 30 41 60 66", " 10 18  F 53 71", "  2 20 31 54 74", "  4 22 45 58 72" };
    String[] calls = { "O73", "N31", "B3", "B15", "G47", "N39", "O70", "O71", "O67", "N32", "N38", "I22", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case66() {
    String[] card = { "  B  I  N  G  O", "  7 16 39 53 62", " 13 25 42 57 66", "  1 18  F 47 69", "  3 26 32 46 74", "  4 28 33 60 67" };
    String[] calls = { "G60", "B7", "N32", "G47", "G57", "O63", "B2", "O69", "I19", "I17", "I16", "I25", "B1", "G48", "N42", "I21", "N36", "I28", "I27", "G49", "O71", "G59", "O61", "I20", "I22", "B4", "N33", "G54", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case67() {
    String[] card = { "  B  I  N  G  O", "  8 17 31 58 66", "  7 25 43 48 74", " 11 23  F 59 67", "  9 26 44 54 61", " 10 29 33 53 64" };
    String[] calls = { "G53", "O66", "B15", "I23", "G46", "O68", "I29", "N35", "B5", "B7", "O75", "I28", "O73", "N40", "N41", "O71", "N43", "N34", "I26", "G49", "B9", "G57", "B2", "N44", "N32", "G60", "B10", "O72", "I17", "G50", "B14", "N42", "N33", "I24", "O64", "I27", "G58", "G55", "B11", "BINGO" };
    assertEquals("G53,I29,B10,N33,O64", bingo.winner(card, calls));
  }

  @Test
  public void case68() {
    String[] card = { "  B  I  N  G  O", "  6 21 34 46 73", "  3 27 39 60 64", " 11 25  F 50 75", " 12 23 43 54 67", "  9 22 37 47 66" };
    String[] calls = { "G59", "I28", "G51", "O65", "I24", "O72", "G49", "I30", "B4", "O67", "B6", "G52", "N37", "G56", "O62", "N38", "O70", "G48", "N35", "I29", "N31", "G53", "N34", "G57", "N39", "I16", "O75", "I19", "B7", "I18", "B14", "I21", "O74", "B5", "G46", "N44", "G60", "I26", "B9", "O63", "G47", "N32", "B3", "B1", "N41", "G50", "O61", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case69() {
    String[] card = { "  B  I  N  G  O", " 12 22 40 53 66", "  8 18 44 52 65", "  4 24  F 46 69", "  1 26 33 54 68", "  6 21 34 49 63" };
    String[] calls = { "O62", "B15", "G56", "I17", "N32", "N40", "B9", "G57", "O63", "G53", "G46", "I24", "B8", "G51", "O67", "I25", "I20", "G48", "N44", "B4", "B6", "N36", "O71", "B5", "O72", "O74", "B12", "O68", "G58", "O73", "I23", "G50", "B1", "BINGO" };
    assertEquals("B8,B4,B6,B12,B1", bingo.winner(card, calls));
  }

  @Test
  public void case70() {
    String[] card = { "  B  I  N  G  O", "  3 19 35 47 74", " 14 30 36 54 72", " 13 25  F 58 62", "  6 20 40 60 61", " 10 28 44 56 64" };
    String[] calls = { "G57", "G54", "N37", "O74", "B11", "B5", "I20", "I26", "I19", "N31", "I22", "B9", "I24", "N42", "B13", "N41", "B7", "G56", "I23", "N40", "G49", "G51", "I30", "O71", "G60", "B10", "N45", "G46", "O61", "I16", "O65", "G59", "O75", "O69", "B15", "O73", "N39", "G55", "G58", "O64", "N44", "B4", "N33", "BINGO" };
    assertEquals("G54,O74,I20,B10", bingo.winner(card, calls));
  }

  @Test
  public void case71() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B12", "B9", "I23", "N34", "G52", "O72", "I22", "N33", "G55", "O66", "BINGO" };
    assertEquals("B9,I23,N34,G52,O72", bingo.winner(card, calls));
  }

  @Test
  public void case72() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "G48", "I23", "B9", "B1", "B4", "B3", "B7", "B12", "G49", "BINGO" };
    assertEquals("O63,G48,I23,B12", bingo.winner(card, calls));
  }

  @Test
  public void case73() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B12", "B3", "I16", "N40", "B2", "O70", "B1", "B9", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case74() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B1", "I24", "G59", "O71", "BINGO" };
    assertEquals("B1,I24,G59,O71", bingo.winner(card, calls));
  }

  @Test
  public void case75() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O66", "B3", "B4", "B1", "B9", "O63", "G48", "I23", "G55", "N33", "I22", "B12", "BINGO" };
    assertEquals("O66,G55,N33,I22,B12", bingo.winner(card, calls));
  }

  @Test
  public void case76() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "G48", "I23", "B9", "B1", "B4", "B3", "B7", "G49", "I24", "I16", "I18", "I22", "B12", "BINGO" };
    assertEquals("I23,I24,I16,I18,I22", bingo.winner(card, calls));
  }

  @Test
  public void case77() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", " 15 30  F 60 62", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B15", "I30", "G60", "O62", "B2", "O70", "B1", "B9", "O71", "B4", "B7", "B11", "O68", "BINGO" };
    assertEquals("B15,I30,G60,O62", bingo.winner(card, calls));
  }

  @Test
  public void case78() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "G55", "B1", "I24", "O71", "G52", "G48", "G49", "G59", "BINGO" };
    assertEquals("G55,G52,G48,G49,G59", bingo.winner(card, calls));
  }

  @Test
  public void case79() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B3", "I16", "G52", "O66", "BINGO" };
    assertEquals("B3,I16,G52,O66", bingo.winner(card, calls));
  }

  @Test
  public void case80() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B9", "O63", "G48", "I23", "B1", "B4", "B3", "B7", "B12", "G49", "BINGO" };
    assertEquals("B9,B1,B4,B3,B12", bingo.winner(card, calls));
  }

  @Test
  public void case81() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "I16", "G52", "O66", "G49", "N41", "I18", "B12", "B9", "B1", "B4", "B3", "BINGO" };
    assertEquals("O63,G49,N41,I18,B3", bingo.winner(card, calls));
  }

  @Test
  public void case82() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "I22", "G48", "I24", "I16", "I18", "B12", "O63", "I23", "BINGO" };
    assertEquals("I22,I24,I16,I18,I23", bingo.winner(card, calls));
  }

  @Test
  public void case83() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B1", "O63", "G48", "I23", "B9", "B4", "B3", "B7", "B12", "G49", "BINGO" };
    assertEquals("B1,B9,B4,B3,B12", bingo.winner(card, calls));
  }

  @Test
  public void case84() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "G55", "G52", "G59", "G48", "G49", "BINGO" };
    assertEquals("G55,G52,G59,G48,G49", bingo.winner(card, calls));
  }

  @Test
  public void case85() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "G48", "B9", "B1", "B4", "B3", "B7", "B12", "G49", "I23", "BINGO" };
    assertEquals("B9,B1,B4,B3,B12", bingo.winner(card, calls));
  }

  @Test
  public void case86() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", " 11 23 34 52 72", " 10 24  F 59 71", "  9 16 40 48 61", "  1 18 41 49 63" };
    String[] calls = { "N34", "G52", "N33", "G55", "B12", "I16", "B1", "O72", "O71", "O63", "I23", "O66", "B11", "BINGO" };
    assertEquals("G52,I16,B1,O66", bingo.winner(card, calls));
  }

  @Test
  public void case87() {
    String[] card = { "  B  I  N  G  O", "  1 16 31 46 61", "  2 17 32 47 62", "  3 18  F 48 63", "  4 19 34 49 64", "  5 20 35 50 65" };
    String[] calls = { "B1", "I17", "G49", "O65", "BINGO" };
    assertEquals("B1,I17,G49,O65", bingo.winner(card, calls));
  }

  @Test
  public void case88() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B12", "I23", "G48", "O63", "B2", "O70", "B1", "B9", "O71", "B4", "B7", "B11", "O68", "BINGO" };
    assertEquals("B12,I23,G48,O63", bingo.winner(card, calls));
  }

  @Test
  public void case89() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "G48", "G55", "N33", "O72", "N34", "I23", "B9", "O71", "G59", "O61", "O66", "I16", "O63", "G49", "B3", "G52", "BINGO" };
    assertEquals("O72,O71,O61,O66,O63", bingo.winner(card, calls));
  }

  @Test
  public void case90() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O66", "G52", "B12", "B4", "I16", "N40", "B2", "O70", "B1", "B9", "O71", "B3", "B7", "B11", "O68", "BINGO" };
    assertEquals("O66,G52,I16,B3", bingo.winner(card, calls));
  }

  @Test
  public void case91() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", " 11 23 34 52 72", " 10 24  F 59 71", "  9 16 40 48 61", "  1 18 41 49 63" };
    String[] calls = { "N34", "G52", "N33", "G55", "I22", "B12", "I16", "B1", "O72", "O71", "O61", "O63", "I23", "O66", "B11", "BINGO" };
    assertEquals("G52,I16,B1,O66", bingo.winner(card, calls));
  }

  @Test
  public void case92() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B6", "I19", "N42", "G51", "O68", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case93() {
    String[] card = { "  B  I  N  G  O", "  1 16 31 46 61", "  2 17 32 47 62", "  3 18  F 48 63", "  4 19 34 49 64", "  5 20 35 50 65" };
    String[] calls = { "B5", "I20", "N35", "G50", "O65", "BINGO" };
    assertEquals("B5,I20,N35,G50,O65", bingo.winner(card, calls));
  }

  @Test
  public void case94() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "G48", "I23", "B9", "B1", "B4", "B3", "B7", "B12", "G49", "BINGO" };
    assertEquals("O63,G48,I23,B12", bingo.winner(card, calls));
  }

  @Test
  public void case95() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B12", "B3", "I16", "N40", "B2", "O70", "B1", "B9", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case96() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B1", "I24", "G59", "O71", "BINGO" };
    assertEquals("B1,I24,G59,O71", bingo.winner(card, calls));
  }

  @Test
  public void case97() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O66", "B3", "B4", "B1", "B9", "O63", "G48", "I23", "G55", "N33", "I22", "B12", "BINGO" };
    assertEquals("O66,G55,N33,I22,B12", bingo.winner(card, calls));
  }

  @Test
  public void case98() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "G48", "I23", "B9", "B1", "B4", "B3", "B7", "G49", "I24", "I16", "I18", "I22", "B12", "BINGO" };
    assertEquals("I23,I24,I16,I18,I22", bingo.winner(card, calls));
  }

  @Test
  public void case99() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", " 15 30  F 60 62", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B15", "I30", "G60", "O62", "B2", "O70", "B1", "B9", "O71", "B4", "B7", "B11", "O68", "BINGO" };
    assertEquals("B15,I30,G60,O62", bingo.winner(card, calls));
  }

  @Test
  public void case100() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "G55", "B1", "I24", "O71", "G52", "G48", "G49", "G59", "BINGO" };
    assertEquals("G55,G52,G48,G49,G59", bingo.winner(card, calls));
  }

  @Test
  public void case101() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B3", "I16", "G52", "O66", "BINGO" };
    assertEquals("B3,I16,G52,O66", bingo.winner(card, calls));
  }

  @Test
  public void case102() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B9", "O63", "G48", "I23", "B1", "B4", "B3", "B7", "B12", "G49", "BINGO" };
    assertEquals("B9,B1,B4,B3,B12", bingo.winner(card, calls));
  }

  @Test
  public void case103() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "I16", "G52", "O66", "G49", "N41", "I18", "B12", "B9", "B1", "B4", "B3", "BINGO" };
    assertEquals("O63,G49,N41,I18,B3", bingo.winner(card, calls));
  }

  @Test
  public void case104() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "I22", "G48", "I24", "I16", "I18", "B12", "O63", "I23", "BINGO" };
    assertEquals("I22,I24,I16,I18,I23", bingo.winner(card, calls));
  }

  @Test
  public void case105() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B1", "O63", "G48", "I23", "B9", "B4", "B3", "B7", "B12", "G49", "BINGO" };
    assertEquals("B1,B9,B4,B3,B12", bingo.winner(card, calls));
  }

  @Test
  public void case106() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "G55", "G52", "G59", "G48", "G49", "BINGO" };
    assertEquals("G55,G52,G59,G48,G49", bingo.winner(card, calls));
  }

  @Test
  public void case107() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O63", "G48", "B9", "B1", "B4", "B3", "B7", "B12", "G49", "I23", "BINGO" };
    assertEquals("B9,B1,B4,B3,B12", bingo.winner(card, calls));
  }

  @Test
  public void case108() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", " 11 23 34 52 72", " 10 24  F 59 71", "  9 16 40 48 61", "  1 18 41 49 63" };
    String[] calls = { "N34", "G52", "N33", "G55", "B12", "I16", "B1", "O72", "O71", "O63", "I23", "O66", "B11", "BINGO" };
    assertEquals("G52,I16,B1,O66", bingo.winner(card, calls));
  }

  @Test
  public void case109() {
    String[] card = { "  B  I  N  G  O", "  1 16 31 46 61", "  2 17 32 47 62", "  3 18  F 48 63", "  4 19 34 49 64", "  5 20 35 50 65" };
    String[] calls = { "B1", "I17", "G49", "O65", "BINGO" };
    assertEquals("B1,I17,G49,O65", bingo.winner(card, calls));
  }

  @Test
  public void case110() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B12", "I23", "G48", "O63", "B2", "O70", "B1", "B9", "O71", "B4", "B7", "B11", "O68", "BINGO" };
    assertEquals("B12,I23,G48,O63", bingo.winner(card, calls));
  }

  @Test
  public void case111() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "G48", "G55", "N33", "O72", "N34", "I23", "B9", "O71", "G59", "O61", "O66", "I16", "O63", "G49", "B3", "G52", "BINGO" };
    assertEquals("O72,O71,O61,O66,O63", bingo.winner(card, calls));
  }

  @Test
  public void case112() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "O66", "G52", "B12", "B4", "I16", "N40", "B2", "O70", "B1", "B9", "O71", "B3", "B7", "B11", "O68", "BINGO" };
    assertEquals("O66,G52,I16,B3", bingo.winner(card, calls));
  }

  @Test
  public void case113() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", " 11 23 34 52 72", " 10 24  F 59 71", "  9 16 40 48 61", "  1 18 41 49 63" };
    String[] calls = { "N34", "G52", "N33", "G55", "I22", "B12", "I16", "B1", "O72", "O71", "O61", "O63", "I23", "O66", "B11", "BINGO" };
    assertEquals("G52,I16,B1,O66", bingo.winner(card, calls));
  }

  @Test
  public void case114() {
    String[] card = { "  B  I  N  G  O", " 12 22 33 55 66", "  9 23 34 52 72", "  1 24  F 59 71", "  4 16 40 48 61", "  3 18 41 49 63" };
    String[] calls = { "B6", "I19", "N42", "G51", "O68", "BINGO" };
    assertEquals("YOU LOSE", bingo.winner(card, calls));
  }

  @Test
  public void case115() {
    String[] card = { "  B  I  N  G  O", "  1 16 31 46 61", "  2 17 32 47 62", "  3 18  F 48 63", "  4 19 34 49 64", "  5 20 35 50 65" };
    String[] calls = { "B5", "I20", "N35", "G50", "O65", "BINGO" };
    assertEquals("B5,I20,N35,G50,O65", bingo.winner(card, calls));
  }

}
