package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PseudoRandomKingdomTest {
  double DELTA = 1.0e-09;
  PseudoRandomKingdom pseudorandomkingdom = new PseudoRandomKingdom();

  @Test
  public void case1() {
    String[] g = { "1", "0 2 3", "1", "1" };
    int cost = 2;
    int savings = 0;
    assertEquals(0.037037037037037035, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.037037037037037035);
  }

  @Test
  public void case2() {
    String[] g = { "1", "0 2 3", "1", "1" };
    int cost = 2;
    int savings = 1;
    assertEquals(0.14814814814814814, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.14814814814814814);
  }

  @Test
  public void case3() {
    String[] g = { "1", "0 2 3", "1", "1" };
    int cost = 2;
    int savings = 2;
    assertEquals(0.4074074074074074, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.4074074074074074);
  }

  @Test
  public void case4() {
    String[] g = { "1", "0 2 3", "1", "1" };
    int cost = 2;
    int savings = 3;
    assertEquals(0.7407407407407407, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.7407407407407407);
  }

  @Test
  public void case5() {
    String[] g = { "1", "0 2 3", "1", "1" };
    int cost = 2;
    int savings = 4;
    assertEquals(1.0, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.0);
  }

  @Test
  public void case6() {
    String[] g = { "31", "45", "27", "27", "8 42 11 48 49 10", "13 45 30 25 9", "37", "46 37 29 20 28", "39 31 23 4 26", "5 12", "4", "4 47", "9", "5 19 15 34 39", "25 17 16", "13", "14", "14", "49", "21 13", "7", "19", "39", "44 8", "36", "37 5 14", "8", "38 39 35 2 3", "43 7", "7", "5", "0 8", "38", "38", "13", "27", "49 24", "6 25 7", "33 27 32", "22 8 27 13", "49", "49", "4", "28", "23", "1 5", "7", "11", "4", "41 4 36 40 18" };
    int cost = 10;
    int savings = 500;
    assertEquals(1.000000000000002, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.000000000000002);
  }

  @Test
  public void case7() {
    String[] g = { "1 2", "0", "0 3", "2" };
    int cost = 1;
    int savings = 2;
    assertEquals(0.875, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.875);
  }

  @Test
  public void case8() {
    String[] g = { "1 2 3 4 5 6", "0", "0", "0", "0", "0", "0" };
    int cost = 10;
    int savings = 19;
    assertEquals(0.903158288086044, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.903158288086044);
  }

  @Test
  public void case9() {
    String[] g = { "1 2 3 4 5 6", "0", "0", "0", "0", "0", "0" };
    int cost = 10;
    int savings = 0;
    assertEquals(5.644739300537775e-07, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 5.644739300537775e-07);
  }

  @Test
  public void case10() {
    String[] g = { "1", "0" };
    int cost = 10;
    int savings = 500;
    assertEquals(1.0000000000000002, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.0000000000000002);
  }

  @Test
  public void case11() {
    String[] g = { "31", "45", "27", "27", "8 42 11 48 49 10", "13 45 30 25 9", "37", "46 37 29 20 28", "39 31 23 4 26", "5 12", "4", "4 47", "9", "5 19 15 34 39", "25 17 16", "13", "14", "14", "49", "21 13", "7", "19", "39", "44 8", "36", "37 5 14", "8", "38 39 35 2 3", "43 7", "7", "5", "0 8", "38", "38", "13", "27", "49 24", "6 25 7", "33 27 32", "22 8 27 13", "49", "49", "4", "28", "23", "1 5", "7", "11", "4", "41 4 36 40 18" };
    int cost = 6;
    int savings = 32;
    assertEquals(0.15511905535370404, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.15511905535370404);
  }

  @Test
  public void case12() {
    String[] g = { "9 6", "6 4", "8", "5", "7 1", "8 3", "1 0 8", "4", "2 5 6", "0" };
    int cost = 9;
    int savings = 26;
    assertEquals(0.350862063, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.350862063);
  }

  @Test
  public void case13() {
    String[] g = { "1 2", "0", "0" };
    int cost = 1;
    int savings = 1;
    assertEquals(0.75, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.75);
  }

  @Test
  public void case14() {
    String[] g = { "3", "3 4", "3", "0 2 1", "1" };
    int cost = 8;
    int savings = 23;
    assertEquals(0.9974089315653102, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9974089315653102);
  }

  @Test
  public void case15() {
    String[] g = { "4", "3", "3", "4 1 2", "3 0" };
    int cost = 8;
    int savings = 13;
    assertEquals(0.4758420972412741, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.4758420972412741);
  }

  @Test
  public void case16() {
    String[] g = { "3 1", "0", "3", "2 0" };
    int cost = 4;
    int savings = 1;
    assertEquals(0.03200000000000001, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.03200000000000001);
  }

  @Test
  public void case17() {
    String[] g = { "5", "2 7", "1 5", "5", "6", "3 6 0 2", "4 5", "1" };
    int cost = 9;
    int savings = 4;
    assertEquals(7.940000000000005e-05, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 7.940000000000005e-05);
  }

  @Test
  public void case18() {
    String[] g = { "2", "2 3", "1 0", "1 4", "3" };
    int cost = 3;
    int savings = 0;
    assertEquals(0.00390625, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.00390625);
  }

  @Test
  public void case19() {
    String[] g = { "2", "2", "3 0 1", "2" };
    int cost = 4;
    int savings = 7;
    assertEquals(0.8960000000000001, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.8960000000000001);
  }

  @Test
  public void case20() {
    String[] g = { "6 12 14", "15 14 9", "10 3", "2 4", "3", "7", "0", "5 15", "13", "1", "2 14", "15", "0", "15 8", "0 1 10", "11 13 7 1" };
    int cost = 10;
    int savings = 37;
    assertEquals(0.23691359392150005, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.23691359392150005);
  }

  @Test
  public void case21() {
    String[] g = { "4 5", "4", "4", "10 6", "2 11 1 0", "0", "3", "16", "12 14 18", "18", "3 16", "18 13 4", "8", "11", "15 8", "14", "10 7 18 17", "16", "16 8 11 9" };
    int cost = 4;
    int savings = 13;
    assertEquals(0.1065974431109612, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.1065974431109612);
  }

  @Test
  public void case22() {
    String[] g = { "5 10 7", "9 5", "24", "16 10 21 13 8 26", "11 10", "0 1", "11", "0", "3 22", "1", "24 0 3 4", "6 4", "13 20 17", "12 19 3", "19 25", "26", "3", "12", "21", "14 13", "12", "3 18", "8", "26", "10 2", "14", "23 3 15" };
    int cost = 6;
    int savings = 34;
    assertEquals(0.855529389925186, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.855529389925186);
  }

  @Test
  public void case23() {
    String[] g = { "15", "21", "21 26 9 23 19", "8", "13 25", "25", "12 17 16", "18", "3 9", "8 20 2", "24", "15", "6", "4", "26", "0 11 22", "6", "6 25 22", "25 7", "2", "9", "1 2 25", "17 15 24", "2", "22 10", "18 21 27 5 17 4", "2 14", "25" };
    int cost = 10;
    int savings = 2;
    assertEquals(3.8064395201910164e-23, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 3.8064395201910164e-23);
  }

  @Test
  public void case24() {
    String[] g = { "5", "22", "25", "12 23 14 20", "20", "24 7 0", "13", "10 20 18 25 5", "25", "22 12", "7", "24", "3 15 9", "23 6", "3", "12", "18", "25 19", "7 16", "17", "7 3 4", "23", "9 1", "3 21 13", "5 11", "7 8 17 2" };
    int cost = 10;
    int savings = 46;
    assertEquals(0.32054420172093584, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.32054420172093584);
  }

  @Test
  public void case25() {
    String[] g = { "3 2", "9 6 3", "0", "8 1 11 5 10 0 17", "5", "3 7 4", "1", "5 12", "13 3", "15 1 18", "3", "14 3", "7", "8 19", "11", "9 16", "15", "3", "9", "13" };
    int cost = 10;
    int savings = 107;
    assertEquals(1.0000000000000027, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.0000000000000027);
  }

  @Test
  public void case26() {
    String[] g = { "32", "15", "27 17", "12", "6", "27", "4 32", "25 19", "13 26 33", "12", "14", "24 23 28", "20 3 27 9", "8", "15 10 25", "1 14", "30", "2", "27", "7", "12", "26", "26", "11", "25 11", "7 24 27 14", "8 22 29 31 32 21", "25 2 18 12 5 32", "11 34", "26", "32 16", "26", "0 27 26 30 6", "8", "28" };
    int cost = 9;
    int savings = 61;
    assertEquals(0.9889074735534966, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9889074735534966);
  }

  @Test
  public void case27() {
    String[] g = { "9", "26", "17", "15", "12 10", "28", "18 24", "28", "18", "14 16 21 10 0 28", "27 9 20 4", "17", "4", "26", "9 24 25", "3 29", "9", "2 19 11", "6 8", "17 21", "10", "22 23 19 9", "21", "26 21", "6 14", "14", "13 23 1 29", "10", "7 9 5", "26 15" };
    int cost = 6;
    int savings = 14;
    assertEquals(1.2748846754737186e-05, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.2748846754737186e-05);
  }

  @Test
  public void case28() {
    String[] g = { "28", "43", "40 19", "15", "13 7 16", "37 34 13 42", "21 35 28", "8 4 25", "12 7", "38 27 22 31", "36", "30", "8", "19 4 5 27", "18 27", "3 24 34", "30 33 4", "33", "14", "13 2 43", "33", "6 34", "9", "27", "15", "7", "43", "14 13 23 9", "6 0", "34", "11 16", "39 9", "43", "17 20 16", "36 5 21 29 15", "6", "34 10 41", "5", "9", "31", "2", "36", "5", "19 1 32 26" };
    int cost = 9;
    int savings = 56;
    assertEquals(0.7158453139321116, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.7158453139321116);
  }

  @Test
  public void case29() {
    String[] g = { "9 37", "8", "19 41", "27", "42", "13", "23 42", "41 8 45 36 38 14", "16 31 7 1", "0 34", "41 46 27", "47 22", "23", "5 35 30 44", "7 25", "34", "8", "23", "28", "2", "41", "41", "11", "6 12 17 36", "45", "14", "38", "10 3", "18 32", "34", "13", "8", "28 47", "45", "9 29 45 35 15", "43 13 34", "7 23 39", "0", "7 26", "36", "47", "20 10 21 2 7", "6 4", "35", "13", "24 7 34 33 47", "10", "32 40 45 11" };
    int cost = 8;
    int savings = 61;
    assertEquals(0.9873800149619777, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9873800149619777);
  }

  @Test
  public void case30() {
    String[] g = { "28", "42 34 28", "37 3 45 15 14", "2", "25", "29 28", "23", "24 31 33", "43 25", "33", "38", "12", "22 13 11", "12", "2", "2 19", "37", "45", "33 36", "15", "40 34", "25", "25 12", "6 34", "7", "4 21 22 28 26 8", "35 25", "39 45 30", "5 25 0 1 46 31", "5", "44 27", "45 28 7", "43", "9 7 18", "1 20 23", "26", "18", "16 2", "45 10", "27", "20", "45", "1", "32 8", "30", "17 31 27 2 41 38", "28" };
    int cost = 6;
    int savings = 18;
    assertEquals(1.761374850327121e-05, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.761374850327121e-05);
  }

  @Test
  public void case31() {
    String[] g = { "31 15 9 6 26", "16 21", "25 38 14 5 15", "41 18", "37 9 16", "2", "0", "29 18 34", "19 27 11 42", "17 4 28 0", "11 26", "8 18 10 13", "24 17", "11", "2", "2 0", "4 1", "12 9", "11 32 7 3", "39 8 40 23 20", "19", "1", "29", "19", "12", "2", "33 10 0", "8 36", "9", "22 7", "41", "0", "18", "26 35", "7", "33", "27", "4", "2", "19", "19", "30 3", "8" };
    int cost = 1;
    int savings = 6;
    assertEquals(0.29870491065230453, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.29870491065230453);
  }

  @Test
  public void case32() {
    String[] g = { "38 4 11", "9 18 10", "35 38", "47 5", "30 0", "26 3", "28 41 19", "18", "20 11", "1 24", "1", "14 41 0 40 8", "15 17 21", "40", "11", "12", "43", "12", "26 1 7", "6 39", "27 8", "41 12", "34", "26", "9", "31", "31 18 38 5 23 43", "20 32", "6 29", "28", "4", "26 25", "27", "44 41 37 46", "22 44", "2", "46", "33 42", "0 26 2", "19", "13 11", "21 33 11 45 6", "37", "16 26", "34 33", "41", "36 33", "3" };
    int cost = 6;
    int savings = 54;
    assertEquals(0.995232469949987, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.995232469949987);
  }

  @Test
  public void case33() {
    String[] g = { "32 36 20 4 23", "40", "12", "19 37 13 39", "0", "20 19 34 31", "29 9", "13", "15 40", "6", "34", "25", "2 19 22", "3 7 35", "27 28 34", "8", "24", "24 34", "27", "29 3 12 5 30", "5 0", "27", "12", "0", "26 16 17", "34 33 11", "24", "21 14 18", "14", "6 19", "19", "5", "0", "25", "5 14 10 38 25 40 17", "13", "0", "3", "34", "3", "34 1 8" };
    int cost = 8;
    int savings = 16;
    assertEquals(1.018864612564512e-08, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.018864612564512e-08);
  }

  @Test
  public void case34() {
    String[] g = { "21", "6", "43", "37 4 45 14", "42 13 3 38", "19 6", "39 1 5", "21 19", "37", "15", "39", "19", "17 39", "4", "3", "26 9 31 30 29", "35 36", "22 12", "32 39", "5 11 7 33", "31", "44 7 0", "17", "37", "31", "36", "15", "32", "36", "15", "15", "24 42 40 20 39 15", "18 27", "19", "43", "16", "25 28 39 16", "8 23 3", "4", "12 6 36 31 41 18 10", "31", "39", "31 43 4", "34 2 42", "21", "3" };
    int cost = 7;
    int savings = 29;
    assertEquals(0.0062769867361561205, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.0062769867361561205);
  }

  @Test
  public void case35() {
    String[] g = { "32", "2 4", "1", "31 23", "38 5 1", "4", "32", "19 20", "32 9 22 10 25", "8", "8", "22", "25", "27", "20", "29 22", "25", "39 26 22", "34", "27 7 30", "37 7 14", "23 25", "17 15 27 11 8 28", "21 24 3", "23", "38 21 16 8 12", "17", "13 22 35 19 33", "36 22", "15", "34 19", "3", "6 0 8", "27", "30 18", "27", "28", "20", "4 25", "17" };
    int cost = 2;
    int savings = 14;
    assertEquals(0.7291072192845174, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.7291072192845174);
  }

  @Test
  public void case36() {
    String[] g = { "31", "45", "27", "27", "8 42 11 48 49 10", "13 45 30 25 9", "37", "46 37 29 20 28", "39 31 23 4 26", "5 12", "4", "4 47", "9", "5 19 15 34 39", "25 17 16", "13", "14", "14", "49", "21 13", "7", "19", "39", "44 8", "36", "37 5 14", "8", "38 39 35 2 3", "43 7", "7", "5", "0 8", "38", "38", "13", "27", "49 24", "6 25 7", "33 27 32", "22 8 27 13", "49", "49", "4", "28", "23", "1 5", "7", "11", "4", "41 4 36 40 18" };
    int cost = 9;
    int savings = 100;
    assertEquals(0.9999999496120053, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999999496120053);
  }

  @Test
  public void case37() {
    String[] g = { "35 26", "46", "4 6 32", "17 5", "22 38 28 2 26 40", "3", "36 2", "43", "18 35", "31", "22", "42", "35", "17", "48", "41 25", "40", "3 41 13 22", "8", "40", "31", "34 44", "33 31 10 4 17", "45", "27", "15", "4 0 27", "26 24 47", "4", "33", "31", "46 20 30 22 9", "49 2", "22 29", "21 38", "8 0 12", "6", "38", "37 45 34 4", "41", "42 4 19 16", "48 39 15 17", "11 40", "45 7", "21", "38 23 43", "1 31", "27", "14 41", "32" };
    int cost = 4;
    int savings = 16;
    assertEquals(0.007523768395934399, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.007523768395934399);
  }

  @Test
  public void case38() {
    String[] g = { "4 44", "12 31", "22 40", "40 10 28", "30 36 0", "47 38 7", "21", "40 31 34 5", "28 20 26", "23", "3 17 32", "40", "18 1", "29", "43 29", "27", "38 39", "10", "12", "43", "8", "22 6", "21 2", "9 42 40 24", "23", "26", "8 25", "41 15", "8 41 3", "37 13 14", "4", "49 1 7 43", "10 33", "32", "7", "36", "45 40 35 4", "29", "5 16", "16", "7 3 36 2 23 11", "27 28", "23", "14 46 19 48 31", "0", "36", "43", "5", "43", "31" };
    int cost = 4;
    int savings = 11;
    assertEquals(2.407320619007641e-07, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 2.407320619007641e-07);
  }

  @Test
  public void case39() {
    String[] g = { "43 21", "30", "33", "20", "5 7 37", "4", "14", "4", "12", "35 34", "45 13", "12", "30 8 11", "31 37 10 14 39", "18 13 6", "30", "34", "37", "14", "22", "32 3", "0", "24 19 37", "28", "22", "41", "36 37 48", "29", "23 37", "27 34", "37 1 12 15", "13", "36 20", "37 2", "9 44 46 16 38 29 47", "9", "26 32", "22 44 30 17 28 4 33 13 26", "34", "40 13", "39 41 42", "49 40 25", "40", "45 0", "37 34", "43 10", "34", "34", "26", "41" };
    int cost = 5;
    int savings = 16;
    assertEquals(5.9170376231294536e-05, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 5.9170376231294536e-05);
  }

  @Test
  public void case40() {
    String[] g = { "31", "48", "41", "11", "11", "23 31", "15", "20", "38 28", "35", "42 27", "3 4 26", "15", "33 44 48 29", "43 48 47", "42 6 12", "24", "48 34 25 22", "26 19", "18", "26 7 34", "33", "17 39", "5", "29 16", "17", "20 18 11 30", "10 46", "8 40", "13 24", "26", "5 45 0 37 47", "42", "21 13", "42 20 17", "40 9", "48", "31", "8", "22", "35 48 41 28", "40 49 2", "10 34 15 32", "14", "13", "31", "27", "31 14", "40 1 17 14 36 13", "41" };
    int cost = 10;
    int savings = 76;
    assertEquals(0.9340459691369849, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9340459691369849);
  }

  @Test
  public void case41() {
    String[] g = { "29", "3", "7 12", "1 48 31", "34 12 19", "15 44", "12 43", "13 47 2 14", "18 19", "11 24", "32", "9", "32 6 48 2 4", "36 7", "7", "5 37 34", "18", "41 48 26 49", "8 16", "22 4 8", "21 25", "20", "19 39", "43", "9 28", "48 35 20", "30 17", "42 38", "33 24", "33 0", "26", "3", "10 12", "36 29 28", "15 4", "25 40", "42 33 13", "15", "27", "22", "35", "17", "27 36", "6 23 45", "5", "43", "49", "7", "12 3 17 25", "46 17" };
    int cost = 6;
    int savings = 26;
    assertEquals(0.00019696260153906738, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.00019696260153906738);
  }

  @Test
  public void case42() {
    String[] g = { "46", "43", "42", "16 23 44 43", "5", "42 4 23 40 21 27", "45 41", "40", "19 15 26", "18 46 45", "14 42", "42", "29", "24", "10 17 36 47", "8", "34 3 28", "14", "32 9", "42 31 8", "31", "5", "28", "48 3 5", "40 13", "26", "25 8", "5 49", "22 16 37", "12 44", "47", "19 20", "18", "47", "16", "37", "14", "35 28", "44", "40", "24 39 5 7", "6", "19 2 10 11 5", "3 1", "38 29 45 3", "44 9 6", "9 0", "14 33 30", "23", "27" };
    int cost = 10;
    int savings = 500;
    assertEquals(1.0000000000000009, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.0000000000000009);
  }

  @Test
  public void case43() {
    String[] g = { "12 30 14 33 36", "23", "13", "41", "35", "33", "28", "20", "43 17 19", "20 28 23 41", "16 42 40", "16", "45 0", "24 2 41 31", "42 0 39 23 38", "38", "11 18 10", "8", "16", "8", "9 7 34", "37", "32", "1 9 14", "13", "29 35", "37", "33", "9 6", "42 25", "0", "13", "41 22", "44 5 0 27", "20", "4 25", "0 49", "26 42 21", "15 14", "14", "10", "32 13 3 9", "37 29 14 10 43", "42 48 8", "33", "12 46", "45", "48", "47 43", "36" };
    int cost = 10;
    int savings = 400;
    assertEquals(1.0000000000000002, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.0000000000000002);
  }

  @Test
  public void case44() {
    String[] g = { "20", "36 2", "29 1", "8", "7 46 45 26", "8", "44", "4", "22 9 11 5 12 41 3", "15 8 39", "12", "8", "10 29 21 8", "30 24", "32", "9", "29", "38 47 35 28", "37 44", "46", "0 48", "12 33", "23 48 43 8 25", "22", "13", "22", "48 4", "44", "17 41", "16 12 2", "32 13 43", "36", "30 14 49 44", "21 42", "37", "17", "31 1", "34 18", "17", "9", "45", "28 8", "33", "22 30", "6 32 18 27", "4 40", "4 19", "17", "26 22 20", "32" };
    int cost = 10;
    int savings = 200;
    assertEquals(0.9999999999999994, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999999999999994);
  }

  @Test
  public void case45() {
    String[] g = { "1 10 47", "0 38", "27", "11", "36", "25 22 42", "47", "32", "34", "33", "0", "23 3 30", "37", "31 20", "47 15", "14", "48", "43 42", "27 39", "23", "35 13", "29 28 41", "31 5 40", "19 11 31", "32", "27 5 34", "27", "25 2 18 26", "21 47", "33 21", "11", "36 23 13 22 47", "47 7 24", "9 29", "45 8 25", "20", "31 4", "48 12", "1", "18", "22", "21", "46 48 5 17", "17", "46", "34", "42 44", "28 32 14 31 6 49 0", "37 42 16", "47" };
    int cost = 10;
    int savings = 100;
    assertEquals(0.9999113348743527, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999113348743527);
  }

  @Test
  public void case46() {
    String[] g = { "36", "16 47 14", "10 22", "12", "33", "38 47", "7", "36 6", "9 19", "8 41 12 13 39 47", "2 43 32 12 48", "22", "9 10 3 15 21", "9", "35 1", "37 49 46 12", "20 1 18", "26 38", "16 42", "8", "16", "12 25 24", "2 45 11", "44", "21 36", "21", "17", "44 34", "41 30", "41", "28", "33", "10", "47 4 31", "27", "14", "7 0 40 24", "15", "5 17", "9", "36", "9 28 29", "18", "10 44", "43 27 23", "22", "15", "33 9 1 5", "10", "15" };
    int cost = 10;
    int savings = 50;
    assertEquals(0.03818091803605722, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.03818091803605722);
  }

  @Test
  public void case47() {
    String[] g = { "11", "24 22 32", "24", "49", "43 9 44", "10", "17 13", "15", "14", "4", "5 25", "48 38 20 0", "16 47", "43 6 33 35 39", "16 8", "24 47 7", "14 12 37", "6 49", "27", "31", "43 23 11", "43", "46 1", "20", "2 1 15", "27 45 31 41 10 47", "44", "18 25", "43 29", "28", "47 34", "19 25", "1", "13", "30", "13", "39", "16", "11", "13 36", "43", "25", "44", "13 40 21 28 45 4 20", "42 4 26", "25 43", "22", "12 25 30 15", "11", "3 17" };
    int cost = 10;
    int savings = 5;
    assertEquals(2.4503965688237956e-34, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 2.4503965688237956e-34);
  }

  @Test
  public void case48() {
    String[] g = { "1 3", "0 4", "3", "2 5 0", "1", "3" };
    int cost = 5;
    int savings = 14;
    assertEquals(0.854166666666667, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.854166666666667);
  }

  @Test
  public void case49() {
    String[] g = { "1", "0" };
    int cost = 10;
    int savings = 0;
    assertEquals(0.09090909090909091, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.09090909090909091);
  }

  @Test
  public void case50() {
    String[] g = { "3 6 4", "9", "7", "0", "0", "9", "7 0", "6 8 2", "9 7", "1 5 8" };
    int cost = 10;
    int savings = 36;
    assertEquals(0.6459904271048571, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.6459904271048571);
  }

  @Test
  public void case51() {
    String[] g = { "2 7", "11", "0 12", "7 8", "11", "9", "8 13", "0 3", "6 3", "5 10", "11 9", "10 4 13 1", "2", "6 11" };
    int cost = 10;
    int savings = 72;
    assertEquals(0.9521183569014126, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9521183569014126);
  }

  @Test
  public void case52() {
    String[] g = { "9 5", "8", "4", "6", "7 2 5", "4 0", "7 3", "4 6", "1 12", "10 0", "9 12", "12", "11 8 10" };
    int cost = 10;
    int savings = 97;
    assertEquals(0.9999999974554145, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999999974554145);
  }

  @Test
  public void case53() {
    String[] g = { "12 10", "3 13", "13", "1 11", "9", "9", "9", "12", "11", "6 5 4 12", "0 13", "8 3", "9 7 0", "10 1 2" };
    int cost = 10;
    int savings = 55;
    assertEquals(0.7961934301173123, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.7961934301173123);
  }

  @Test
  public void case54() {
    String[] g = { "15 17", "7 8", "12 7", "17", "14 16", "11 9", "15 10", "1 2", "1 11", "5 13", "6 14", "5 8", "2 16", "9", "10 4", "6 0", "4 12", "3 0" };
    int cost = 10;
    int savings = 140;
    assertEquals(0.9999966908432488, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999966908432488);
  }

  @Test
  public void case55() {
    String[] g = { "20 9", "8", "11", "18 4", "11 3", "18 9", "20 19 12 17", "15", "15 1 16 14", "0 5", "11", "4 2 10", "16 6", "15", "8", "13 8 7", "12 8", "6", "3 5", "6", "0 6" };
    int cost = 10;
    int savings = 113;
    assertEquals(0.9998514914954278, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9998514914954278);
  }

  @Test
  public void case56() {
    String[] g = { "27 23 6 18", "27", "24 20", "10 7 18", "24 22 21 19", "13", "0", "3", "12 25", "25 26 15", "3 15", "17 13", "13 8", "12 5 11", "17", "16 10 9", "15", "11 14", "0 3", "4", "27 2", "28 4", "4", "0", "4 2", "8 9", "9", "1 0 20", "21" };
    int cost = 10;
    int savings = 25;
    assertEquals(1.599560968206486e-09, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.599560968206486e-09);
  }

  @Test
  public void case57() {
    String[] g = { "15", "12", "27", "19", "19", "14", "16 11 25", "8 10", "22 7", "19 15", "17 7", "6 12 21", "27 11 1", "22", "24 27 5", "9 0 20", "26 6", "10 23", "19", "9 4 18 3", "15 22", "11", "13 8 20", "26 17", "14", "6", "16 23", "12 14 2" };
    int cost = 10;
    int savings = 147;
    assertEquals(0.9999901276462249, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999901276462249);
  }

  @Test
  public void case58() {
    String[] g = { "30 3 12", "5 8", "27", "0 15", "18 26 24", "25 9 1", "27", "15 21", "1 19", "5", "11 13", "10 27", "0", "28 10", "20 25", "7 3", "28", "24 21", "4", "8", "23 14", "17 7", "29 28", "20 29", "17 4", "14 5", "4", "11 6 2 30", "16 13 22", "23 22", "0 27" };
    int cost = 10;
    int savings = 150;
    assertEquals(0.9689601460813891, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9689601460813891);
  }

  @Test
  public void case59() {
    String[] g = { "26 7 20", "17 32", "6 31", "15 6", "13 10", "23 25 29", "3 2", "21 0 16", "12 28", "28 19", "4 17", "32 30", "24 8", "18 14 4", "13 19", "3 22", "7", "10 1", "13", "14 9", "27 0", "24 7", "15 27", "5", "12 21", "5", "0", "22 20", "8 9", "31 5", "11", "2 29", "1 11" };
    int cost = 10;
    int savings = 180;
    assertEquals(0.9903072202215846, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9903072202215846);
  }

  @Test
  public void case60() {
    String[] g = { "7 13", "26 14", "13 23", "6 16", "28 21", "8 27", "21 3", "0 25", "5 29", "15 10", "9 22", "19 23", "18 32 16", "0 2", "30 1", "27 9", "12 3", "22 24", "12", "11", "26 31", "6 4", "10 17", "2 11", "17 30", "7 28", "1 20", "5 15", "25 4", "8 32", "24 14", "33 20", "29 12", "31" };
    int cost = 10;
    int savings = 200;
    assertEquals(0.9884631784052113, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9884631784052113);
  }

  @Test
  public void case61() {
    String[] g = { "12 1", "6 0", "27 21 34", "15 23 25", "9 19 8", "14", "1 26", "29 23", "17 4", "4", "34 20", "24 18 28", "0 31 15", "14 26", "13 5", "33 12 3", "34", "8", "30 11", "24 4", "10 30", "2", "34", "7 3", "19 11", "3", "13 6", "2 29", "11", "27 7 32", "20 18", "12", "29", "15", "10 22 16 2" };
    int cost = 10;
    int savings = 210;
    assertEquals(0.9999999964834922, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999999964834922);
  }

  @Test
  public void case62() {
    String[] g = { "39", "25 21 19", "20 38 18 17", "33", "28 6", "23 9 14", "4 27 25 15", "28", "26 10", "12 5", "8 35", "29 41", "39 9", "35 22", "41 5 36", "6", "40", "2", "2", "1", "2 34 40", "33 1", "13 40", "5", "29", "37 6 1", "8 39", "6", "7 31 4", "24 11", "42", "28", "42", "3 42 21", "20", "13 10", "14", "25", "2 42", "0 26 12", "20 16 22", "14 11", "38 32 33 30 43", "42" };
    int cost = 10;
    int savings = 211;
    assertEquals(0.9999990635157994, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999990635157994);
  }

  @Test
  public void case63() {
    String[] g = { "32 22", "19", "24 7 36", "9", "13 19", "13", "12", "2", "19", "29 38 3", "11 16", "35 10", "37 16 6", "30 4 5", "33 37", "17 20", "10 12", "26 15", "29 35", "1 8 4", "15 25", "38 34", "0 26", "33", "2 32", "20 27", "17 22", "33 25", "34 30", "9 18", "28 13", "35", "24 0", "27 23 14", "28 21", "11 18 31", "2", "12 14", "21 9" };
    int cost = 10;
    int savings = 217;
    assertEquals(0.9997062788058657, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9997062788058657);
  }

  @Test
  public void case64() {
    String[] g = { "15 38", "9 30 28 29", "13 23", "16 5", "44", "26 3 38", "41", "8 39 42", "7", "22 25 1", "40", "35", "43 24", "24 2", "20", "18 0", "3 34", "41 31", "32 15", "28 21", "14 34 33", "19 33", "9", "35 2", "12 13", "27 9 39", "5", "25", "1 19", "1", "1", "35 17", "18 37", "20 21", "20 16", "23 11 31", "40", "32 44", "0 5", "25 7", "10 42 43 36", "17 6 45", "7 40", "12 40", "37 4", "41" };
    int cost = 10;
    int savings = 250;
    assertEquals(0.9999947023976061, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999947023976061);
  }

  @Test
  public void case65() {
    String[] g = { "30 43", "37 6", "24 43", "26 41", "27 22", "7", "45 1", "30 5 10", "34 16", "36 11", "7 38", "9 14 23 28", "33", "17 33", "32 11", "35", "8 21 20", "42 13", "40", "40 42", "16", "44 16", "38 4", "11", "2 31", "26", "25 3 44", "4 35", "11", "37 40", "7 0", "24 39", "14 33", "12 32 13", "45 8", "15 27", "9", "29 1", "10 22", "31 41", "29 19 18", "3 39", "17 19", "0 2", "21 26", "34 6" };
    int cost = 10;
    int savings = 280;
    assertEquals(0.9999990498907723, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999990498907723);
  }

  @Test
  public void case66() {
    String[] g = { "34 24", "27 24", "46 20", "21 17", "37 36", "19 45", "48 14", "16 18", "48 15", "44 37", "17", "31", "36", "25", "40 6", "8 35", "7 38", "3 10 31", "41 7", "5 43 41", "23 2", "28 3", "35", "47 20", "0 1", "32 13 36", "34", "1 30", "32 21", "32", "40 27", "17 34 11", "25 28 29", "45", "31 0 26", "15 22 45", "25 4 12", "4 9", "42 16", "42", "30 14", "18 19", "39 38", "19", "46 9", "33 5 35", "44 2", "23", "6 8" };
    int cost = 10;
    int savings = 280;
    assertEquals(0.9999952487079226, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999952487079226);
  }

  @Test
  public void case67() {
    String[] g = { "24 9 45", "21 17 3", "44 25 41", "28 1", "21 11", "24", "20 47", "13", "9", "0 8", "34 47", "30 4", "27 48 31", "7 14", "49 13", "32 46", "26 19 38", "1", "32 20", "16 28", "18 6", "1 4", "23 40", "22 26", "0 44 5", "35 2", "23 16", "12", "19 3", "40 39", "35 11", "12 42", "43 18 15", "46", "10 48", "25 30", "46 39", "49 42", "16", "36 29", "29 22", "2", "31 37", "32", "24 2", "0", "15 33 36", "6 10", "34 12", "14 37" };
    int cost = 10;
    int savings = 299;
    assertEquals(0.9999991370893375, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999991370893375);
  }

  @Test
  public void case68() {
    String[] g = { "1 6", "0 7", "5", "8 4", "9 3", "2 9", "0", "8 1", "7 3", "5 4" };
    int cost = 3;
    int savings = 5;
    assertEquals(0.007293701171875, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.007293701171875);
  }

  @Test
  public void case69() {
    String[] g = { "18 1", "4 0", "7 8", "5 17", "1 14", "3 12", "10 19", "2 9", "2 16", "14 7", "6 13", "18 12", "5 11", "15 10", "9 4", "13 16", "15 8", "3", "11 0", "6" };
    int cost = 10;
    int savings = 133;
    assertEquals(0.9976930627444783, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9976930627444783);
  }

  @Test
  public void case70() {
    String[] g = { "14 26", "8 2", "27 1", "18 24", "25 29", "25 15", "10 29", "17 11", "1 21", "26 13", "6 24", "7 22", "19 28", "21 9", "0 28", "5 23", "22", "27 7", "3 20", "12 23", "18", "13 8", "11 16", "15 19", "3 10", "5 4", "0 9", "17 2", "14 12", "4 6" };
    int cost = 10;
    int savings = 178;
    assertEquals(0.975612288786343, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.975612288786343);
  }

  @Test
  public void case71() {
    String[] g = { "29 39", "5 11", "34 37", "27 35", "30 32", "13 1", "38 21", "14 33", "22", "23 18", "29", "23 1", "24 21", "28 5", "24 7", "36 31", "38 27", "22 19", "25 9", "17 34", "32 26", "6 12", "17 8", "11 9", "14 12", "18 33", "20 39", "16 3", "13 31", "0 10", "35 4", "28 15", "20 4", "25 7", "19 2", "30 3", "15 37", "36 2", "16 6", "0 26" };
    int cost = 10;
    int savings = 280;
    assertEquals(0.9999952487079227, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999952487079227);
  }

  @Test
  public void case72() {
    String[] g = { "46 27", "10 15", "11 26", "29 17", "44 38", "22 10", "16 25", "8 25", "7 17", "24 35", "1 5", "28 2", "28 21", "49 44", "30 49", "42 1", "6 31", "8 3", "33 47", "32 34", "43 27", "46 12", "37 5", "36 48", "9 39", "6 7", "2 38", "20 0", "12 11", "39 3", "14 41", "32 16", "19 31", "18", "19 42", "9", "23 47", "45 22", "4 26", "29 24", "48 41", "40 30", "15 34", "45 20", "13 4", "43 37", "0 21", "18 36", "23 40", "13 14" };
    int cost = 10;
    int savings = 350;
    assertEquals(0.9999994525618178, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999994525618178);
  }

  @Test
  public void case73() {
    String[] g = { "31", "11", "5", "11", "11", "2 20 15 28 10 26 42 34 25 44 41 31 43", "11", "11", "11", "11", "5", "48 1 6 35 30 33 4 21 15 14 8 24 7 17 40 36 9 3 13", "15", "11", "11", "37 49 11 12 32 45 16 5", "15", "11", "31", "31", "5", "11", "31", "31", "11", "5", "5", "31", "5", "31", "11", "5 47 23 22 29 27 18 39 0 19 46 38", "15", "11", "5", "11", "11", "15", "31", "31", "11", "5", "5", "5", "5", "15", "31", "31", "11", "15" };
    int cost = 10;
    int savings = 40;
    assertEquals(0.8615890488707026, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.8615890488707026);
  }

  @Test
  public void case74() {
    String[] g = { "22", "9", "17 36 28 10 44 29 4 5 16 42 9", "9", "2", "2", "41", "22", "22", "32 22 1 3 45 2 30 12 24 14", "2", "41", "9", "42", "9", "41", "2", "2", "42", "42", "42", "41", "8 9 27 41 26 38 40 7 0 35", "41", "9", "42", "22", "22", "2", "2", "9", "42", "9", "42", "42", "22", "2", "42", "22", "41", "22", "48 11 43 46 6 21 15 23 22 39", "13 19 37 47 49 33 34 18 25 31 2 20", "41", "2", "9", "41", "42", "41", "42" };
    int cost = 10;
    int savings = 50;
    assertEquals(0.9657157500797149, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9657157500797149);
  }

  @Test
  public void case75() {
    String[] g = { "22", "9", "17 36 28 10 44 29 4 5 16 42 9", "9", "2", "2", "41", "22", "22", "32 22 1 3 45 2 30 12 24 14", "2", "41", "9", "42", "9", "41", "2", "2", "42", "42", "42", "41", "8 9 27 41 26 38 40 7 0 35", "41", "9", "42", "22", "22", "2", "2", "9", "42", "9", "42", "42", "22", "2", "42", "22", "41", "22", "48 11 43 46 6 21 15 23 22 39", "13 19 37 47 49 33 34 18 25 31 2 20", "41", "2", "9", "41", "42", "41", "42" };
    int cost = 10;
    int savings = 500;
    assertEquals(1.0000000000000002, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.0000000000000002);
  }

  @Test
  public void case76() {
    String[] g = { "46 27", "10 15", "11 26", "29 17", "44 38", "22 10", "16 25", "8 25", "7 17", "24 35", "1 5", "28 2", "28 21", "49 44", "30 49", "42 1", "6 31", "8 3", "33 47", "32 34", "43 27", "46 12", "37 5", "36 48", "9 39", "6 7", "2 38", "20 0", "12 11", "39 3", "14 41", "32 16", "19 31", "18", "19 42", "9", "23 47", "45 22", "4 26", "29 24", "48 41", "40 30", "15 34", "45 20", "13 4", "43 37", "0 21", "18 36", "23 40", "13 14" };
    int cost = 10;
    int savings = 500;
    assertEquals(1.0000000000000009, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 1.0000000000000009);
  }

  @Test
  public void case77() {
    String[] g = { "46 27", "10 15", "11 26", "29 17", "44 38", "22 10", "16 25", "8 25", "7 17", "24 35", "1 5", "28 2", "28 21", "49 44", "30 49", "42 1", "6 31", "8 3", "33 47", "32 34", "43 27", "46 12", "37 5", "36 48", "9 39", "6 7", "2 38", "20 0", "12 11", "39 3", "14 41", "32 16", "19 31", "18", "19 42", "9", "23 47", "45 22", "4 26", "29 24", "48 41", "40 30", "15 34", "45 20", "13 4", "43 37", "0 21", "18 36", "23 40", "13 14" };
    int cost = 10;
    int savings = 360;
    assertEquals(0.999999959677162, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.999999959677162);
  }

  @Test
  public void case78() {
    String[] g = { "46 27", "10 15", "11 26", "29 17", "44 38", "22 10", "16 25", "8 25", "7 17", "24 35", "1 5", "28 2", "28 21", "49 44", "30 49", "42 1", "6 31", "8 3", "33 47", "32 34", "43 27", "46 12", "37 5", "36 48", "9 39", "6 7", "2 38", "20 0", "12 11", "39 3", "14 41", "32 16", "19 31", "18", "19 42", "9", "23 47", "45 22", "4 26", "29 24", "48 41", "40 30", "15 34", "45 20", "13 4", "43 37", "0 21", "18 36", "23 40", "13 14" };
    int cost = 10;
    int savings = 370;
    assertEquals(0.9999999977864531, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999999977864531);
  }

  @Test
  public void case79() {
    String[] g = { "46 27", "10 15", "11 26", "29 17", "44 38", "22 10", "16 25", "8 25", "7 17", "24 35", "1 5", "28 2", "28 21", "49 44", "30 49", "42 1", "6 31", "8 3", "33 47", "32 34", "43 27", "46 12", "37 5", "36 48", "9 39", "6 7", "2 38", "20 0", "12 11", "39 3", "14 41", "32 16", "19 31", "18", "19 42", "9", "23 47", "45 22", "4 26", "29 24", "48 41", "40 30", "15 34", "45 20", "13 4", "43 37", "0 21", "18 36", "23 40", "13 14" };
    int cost = 10;
    int savings = 372;
    assertEquals(0.9999999988068797, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.9999999988068797);
  }

  @Test
  public void case80() {
    String[] g = { "9 6", "6 4", "8", "5", "7 1", "8 3", "1 0 8", "4", "2 5 6", "0" };
    int cost = 9;
    int savings = 26;
    assertEquals(0.350862063, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.350862063);
  }

  @Test
  public void case81() {
    String[] g = { "1", "0 2", "1 3", "2 4", "3 5", "4 6", "5 7", "6 8", "7 9", "8 10", "9 11", "10 12", "11 13", "12 14", "13 15", "14 16", "15 17", "16 18", "17 19", "18 20 21", "19", "19 22", "21 23", "22 24", "23 25", "24 26", "25 27", "26 28", "27 29", "28 30", "29 31", "30 32", "31 33", "32 34", "33 35", "34 36", "35 37", "36 38", "37 39", "38 40", "39 41", "40" };
    int cost = 10;
    int savings = 200;
    assertEquals(0.5099354669569749, pseudorandomkingdom.probabilityOfHappiness(g, cost, savings), DELTA * 0.5099354669569749);
  }

}
