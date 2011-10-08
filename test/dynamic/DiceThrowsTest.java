package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class DiceThrowsTest {
  double DELTA = 1.0e-10;
  DiceThrows dicethrows = new DiceThrows();

  @Test
  public void case1() {
    int numDiceA = 1;
    int[] sidesA = { 1, 2, 3, 4, 5, 6 };
    int numDiceB = 1;
    int[] sidesB = { 1, 2, 3, 4, 5, 6 };
    assertEquals(0.41666666666666663, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case2() {
    int numDiceA = 200;
    int[] sidesA = { 1, 3, 8, 18, 45, 100 };
    int numDiceB = 200;
    int[] sidesB = { 1, 4, 10, 21, 53, 100 };
    assertEquals(0.25240407058279035, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case3() {
    int numDiceA = 2;
    int[] sidesA = { 1, 1, 1, 2, 2, 2 };
    int numDiceB = 3;
    int[] sidesB = { 1, 1, 1, 1, 1, 1 };
    assertEquals(0.25, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case4() {
    int numDiceA = 200;
    int[] sidesA = { 6, 5, 4, 3, 2, 1 };
    int numDiceB = 200;
    int[] sidesB = { 3, 4, 6, 5, 1, 2 };
    assertEquals(0.49416239842107595, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case5() {
    int numDiceA = 100;
    int[] sidesA = { 1, 1, 1, 1, 1, 2 };
    int numDiceB = 199;
    int[] sidesB = { 1, 1, 1, 1, 1, 1 };
    assertEquals(1.5306467074865068e-78, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), 1.0e-85);
  }

  @Test
  public void case6() {
    int numDiceA = 1;
    int[] sidesA = { 1, 2, 1, 2, 1, 2 };
    int numDiceB = 1;
    int[] sidesB = { 2, 1, 2, 1, 2, 1 };
    assertEquals(0.25, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case7() {
    int numDiceA = 200;
    int[] sidesA = { 1, 3, 8, 18, 45, 100 };
    int numDiceB = 80;
    int[] sidesB = { 1, 4, 10, 21, 53, 100 };
    assertEquals(0.9999999976160046, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case8() {
    int numDiceA = 100;
    int[] sidesA = { 1, 3, 5, 10, 15, 20 };
    int numDiceB = 100;
    int[] sidesB = { 9, 9, 9, 9, 9, 9 };
    assertEquals(0.4943375131579816, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case9() {
    int numDiceA = 100;
    int[] sidesA = { 7, 8, 9, 9, 10, 11 };
    int numDiceB = 100;
    int[] sidesB = { 1, 3, 5, 10, 15, 20 };
    assertEquals(0.49968090996086173, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case10() {
    int numDiceA = 10;
    int[] sidesA = { 1, 2, 3, 4, 5, 6 };
    int numDiceB = 1;
    int[] sidesB = { 59, 70, 80, 90, 95, 100 };
    assertEquals(2.7563619479867007e-09, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), 1.0e-20);
  }

  @Test
  public void case11() {
    int numDiceA = 1;
    int[] sidesA = { 60, 70, 80, 90, 95, 100 };
    int numDiceB = 10;
    int[] sidesB = { 1, 2, 3, 4, 5, 6 };
    assertEquals(0.9999999972436379, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case12() {
    int numDiceA = 91;
    int[] sidesA = { 69, 98, 52, 53, 48, 89 };
    int numDiceB = 133;
    int[] sidesB = { 51, 9, 99, 12, 44, 43 };
    assertEquals(0.8922893426623625, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case13() {
    int numDiceA = 131;
    int[] sidesA = { 3, 72, 90, 25, 91, 34 };
    int numDiceB = 175;
    int[] sidesB = { 18, 45, 63, 27, 51, 36 };
    assertEquals(0.38895365380512525, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case14() {
    int numDiceA = 137;
    int[] sidesA = { 60, 28, 29, 5, 14, 19 };
    int numDiceB = 92;
    int[] sidesB = { 45, 100, 16, 32, 51, 11 };
    assertEquals(0.142456572809483, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case15() {
    int numDiceA = 155;
    int[] sidesA = { 99, 39, 55, 85, 21, 52 };
    int numDiceB = 153;
    int[] sidesB = { 95, 67, 66, 5, 84, 41 };
    assertEquals(0.4480478450853752, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case16() {
    int numDiceA = 196;
    int[] sidesA = { 71, 41, 29, 76, 96, 12 };
    int numDiceB = 189;
    int[] sidesB = { 77, 9, 47, 95, 72, 44 };
    assertEquals(0.34670932289383705, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case17() {
    int numDiceA = 74;
    int[] sidesA = { 82, 57, 69, 2, 77, 75 };
    int numDiceB = 107;
    int[] sidesB = { 68, 83, 6, 31, 42, 3 };
    assertEquals(0.7895416899310314, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case18() {
    int numDiceA = 195;
    int[] sidesA = { 94, 40, 1, 8, 81, 11 };
    int numDiceB = 142;
    int[] sidesB = { 24, 39, 74, 17, 76, 88 };
    assertEquals(0.5714253512162418, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case19() {
    int numDiceA = 101;
    int[] sidesA = { 17, 82, 37, 97, 59, 23 };
    int numDiceB = 114;
    int[] sidesB = { 73, 79, 80, 31, 6, 34 };
    assertEquals(0.14213780140021903, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case20() {
    int numDiceA = 167;
    int[] sidesA = { 14, 49, 45, 79, 55, 90 };
    int numDiceB = 184;
    int[] sidesB = { 42, 71, 60, 47, 32, 23 };
    assertEquals(0.9815760232124386, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case21() {
    int numDiceA = 103;
    int[] sidesA = { 57, 88, 39, 21, 19, 91 };
    int numDiceB = 128;
    int[] sidesB = { 29, 54, 88, 32, 82, 5 };
    assertEquals(0.04037445470659537, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case22() {
    int numDiceA = 61;
    int[] sidesA = { 87, 87, 75, 41, 42, 58 };
    int numDiceB = 62;
    int[] sidesB = { 89, 78, 47, 63, 87, 23 };
    assertEquals(0.4404035701658416, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case23() {
    int numDiceA = 63;
    int[] sidesA = { 75, 27, 98, 92, 65, 48 };
    int numDiceB = 126;
    int[] sidesB = { 72, 56, 1, 62, 16, 31 };
    assertEquals(0.01593491572116412, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case24() {
    int numDiceA = 118;
    int[] sidesA = { 65, 52, 4, 73, 90, 65 };
    int numDiceB = 184;
    int[] sidesB = { 50, 3, 16, 67, 37, 82 };
    assertEquals(0.020732525118590778, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case25() {
    int numDiceA = 33;
    int[] sidesA = { 14, 32, 91, 97, 48, 28 };
    int numDiceB = 39;
    int[] sidesB = { 80, 50, 11, 38, 96, 13 };
    assertEquals(0.2665639976189537, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case26() {
    int numDiceA = 59;
    int[] sidesA = { 75, 21, 78, 64, 9, 82 };
    int numDiceB = 73;
    int[] sidesB = { 80, 97, 40, 20, 51, 18 };
    assertEquals(0.07091673648667753, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case27() {
    int numDiceA = 82;
    int[] sidesA = { 39, 74, 28, 24, 75, 22 };
    int numDiceB = 57;
    int[] sidesB = { 33, 64, 79, 40, 39, 92 };
    assertEquals(0.8592708622541287, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case28() {
    int numDiceA = 54;
    int[] sidesA = { 63, 87, 6, 9, 62, 100 };
    int numDiceB = 75;
    int[] sidesB = { 54, 12, 13, 95, 8, 42 };
    assertEquals(0.6503180290720642, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case29() {
    int numDiceA = 98;
    int[] sidesA = { 36, 69, 78, 48, 95, 89 };
    int numDiceB = 168;
    int[] sidesB = { 6, 28, 29, 29, 60, 84 };
    assertEquals(0.669735268455362, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case30() {
    int numDiceA = 176;
    int[] sidesA = { 56, 86, 13, 17, 99, 58 };
    int numDiceB = 111;
    int[] sidesB = { 89, 78, 63, 99, 95, 63 };
    assertEquals(0.9226976824449573, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case31() {
    int numDiceA = 165;
    int[] sidesA = { 48, 99, 56, 89, 37, 29 };
    int numDiceB = 191;
    int[] sidesB = { 61, 16, 58, 97, 10, 84 };
    assertEquals(0.16818711679580858, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case32() {
    int numDiceA = 13;
    int[] sidesA = { 46, 83, 42, 21, 31, 47 };
    int numDiceB = 10;
    int[] sidesB = { 51, 17, 22, 85, 43, 73 };
    assertEquals(0.8280454034647005, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case33() {
    int numDiceA = 78;
    int[] sidesA = { 42, 15, 86, 71, 17, 2 };
    int numDiceB = 43;
    int[] sidesB = { 97, 40, 99, 68, 5, 23 };
    assertEquals(0.9656249263567392, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case34() {
    int numDiceA = 137;
    int[] sidesA = { 36, 61, 48, 31, 96, 85 };
    int numDiceB = 100;
    int[] sidesB = { 94, 75, 88, 30, 88, 69 };
    assertEquals(0.9840863679633509, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case35() {
    int numDiceA = 127;
    int[] sidesA = { 21, 22, 54, 64, 72, 94 };
    int numDiceB = 185;
    int[] sidesB = { 13, 5, 100, 53, 23, 45 };
    assertEquals(0.19630313135275743, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case36() {
    int numDiceA = 90;
    int[] sidesA = { 80, 64, 32, 57, 49, 49 };
    int numDiceB = 104;
    int[] sidesB = { 6, 58, 29, 81, 80, 13 };
    assertEquals(0.8394366633008992, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case37() {
    int numDiceA = 85;
    int[] sidesA = { 89, 74, 28, 86, 16, 50 };
    int numDiceB = 106;
    int[] sidesB = { 77, 49, 44, 97, 7, 30 };
    assertEquals(0.09950087419073816, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case38() {
    int numDiceA = 152;
    int[] sidesA = { 13, 19, 17, 94, 78, 7 };
    int numDiceB = 107;
    int[] sidesB = { 18, 80, 64, 94, 27, 86 };
    assertEquals(0.062226672739695225, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case39() {
    int numDiceA = 90;
    int[] sidesA = { 67, 38, 36, 17, 71, 37 };
    int numDiceB = 76;
    int[] sidesB = { 70, 16, 99, 74, 23, 48 };
    assertEquals(0.2703034500524742, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case40() {
    int numDiceA = 100;
    int[] sidesA = { 67, 41, 86, 88, 55, 59 };
    int numDiceB = 164;
    int[] sidesB = { 26, 51, 24, 26, 12, 91 };
    assertEquals(0.7983177346915058, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case41() {
    int numDiceA = 121;
    int[] sidesA = { 36, 70, 38, 61, 50, 13 };
    int numDiceB = 121;
    int[] sidesB = { 28, 79, 35, 69, 30, 27 };
    assertEquals(0.501752060427102, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case42() {
    int numDiceA = 145;
    int[] sidesA = { 33, 43, 42, 39, 36, 42 };
    int numDiceB = 119;
    int[] sidesB = { 21, 92, 68, 83, 29, 5 };
    assertEquals(0.2609327938893526, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case43() {
    int numDiceA = 74;
    int[] sidesA = { 1, 45, 38, 46, 69, 97 };
    int numDiceB = 61;
    int[] sidesB = { 3, 58, 77, 89, 10, 67 };
    assertEquals(0.9411406781077755, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case44() {
    int numDiceA = 94;
    int[] sidesA = { 94, 78, 54, 73, 60, 58 };
    int numDiceB = 160;
    int[] sidesB = { 53, 58, 61, 21, 9, 62 };
    assertEquals(0.04536527419664167, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case45() {
    int numDiceA = 81;
    int[] sidesA = { 27, 7, 87, 38, 65, 77 };
    int numDiceB = 70;
    int[] sidesB = { 45, 62, 64, 94, 38, 5 };
    assertEquals(0.9146438656313055, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case46() {
    int numDiceA = 196;
    int[] sidesA = { 96, 29, 12, 89, 46, 7 };
    int numDiceB = 193;
    int[] sidesB = { 7, 69, 30, 49, 76, 65 };
    assertEquals(0.24534383811241348, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case47() {
    int numDiceA = 18;
    int[] sidesA = { 24, 31, 16, 65, 61, 56 };
    int numDiceB = 18;
    int[] sidesB = { 70, 16, 76, 24, 17, 68 };
    assertEquals(0.34812559599367604, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case48() {
    int numDiceA = 164;
    int[] sidesA = { 84, 85, 53, 34, 44, 25 };
    int numDiceB = 199;
    int[] sidesB = { 48, 2, 51, 11, 80, 84 };
    assertEquals(0.30362425458716547, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case49() {
    int numDiceA = 185;
    int[] sidesA = { 68, 65, 99, 14, 20, 53 };
    int numDiceB = 178;
    int[] sidesB = { 91, 73, 30, 27, 33, 95 };
    assertEquals(0.17486496878427826, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case50() {
    int numDiceA = 155;
    int[] sidesA = { 13, 90, 42, 27, 59, 99 };
    int numDiceB = 119;
    int[] sidesB = { 93, 79, 30, 91, 70, 62 };
    assertEquals(0.5819575480418528, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case51() {
    int numDiceA = 89;
    int[] sidesA = { 13, 1, 36, 61, 19, 70 };
    int numDiceB = 103;
    int[] sidesB = { 16, 58, 7, 45, 50, 18 };
    assertEquals(0.11854621851619367, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case52() {
    int numDiceA = 94;
    int[] sidesA = { 32, 87, 68, 95, 49, 81 };
    int numDiceB = 134;
    int[] sidesB = { 55, 82, 5, 99, 53, 12 };
    assertEquals(0.19815474682507994, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case53() {
    int numDiceA = 193;
    int[] sidesA = { 20, 89, 23, 47, 41, 9 };
    int numDiceB = 162;
    int[] sidesB = { 50, 52, 6, 75, 50, 58 };
    assertEquals(0.13750119664901542, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case54() {
    int numDiceA = 3;
    int[] sidesA = { 26, 49, 6, 95, 52, 26 };
    int numDiceB = 5;
    int[] sidesB = { 57, 60, 79, 47, 81, 15 };
    assertEquals(0.017172377495808563, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case55() {
    int numDiceA = 130;
    int[] sidesA = { 75, 23, 77, 69, 99, 26 };
    int numDiceB = 133;
    int[] sidesB = { 77, 83, 12, 98, 28, 75 };
    assertEquals(0.2831248206864896, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case56() {
    int numDiceA = 75;
    int[] sidesA = { 81, 99, 82, 85, 40, 99 };
    int numDiceB = 138;
    int[] sidesB = { 60, 59, 8, 23, 20, 86 };
    assertEquals(0.6959432865451713, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case57() {
    int numDiceA = 73;
    int[] sidesA = { 70, 12, 17, 51, 52, 81 };
    int numDiceB = 79;
    int[] sidesB = { 37, 32, 97, 21, 28, 47 };
    assertEquals(0.4954853514613028, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case58() {
    int numDiceA = 149;
    int[] sidesA = { 86, 71, 100, 88, 84, 68 };
    int numDiceB = 182;
    int[] sidesB = { 100, 71, 91, 48, 42, 33 };
    assertEquals(0.9658509062350724, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case59() {
    int numDiceA = 59;
    int[] sidesA = { 74, 66, 82, 32, 57, 72 };
    int numDiceB = 84;
    int[] sidesB = { 3, 25, 26, 89, 48, 41 };
    assertEquals(0.9689650546244156, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case60() {
    int numDiceA = 46;
    int[] sidesA = { 83, 1, 66, 11, 11, 59 };
    int numDiceB = 22;
    int[] sidesB = { 97, 73, 66, 41, 61, 32 };
    assertEquals(0.9594884367769796, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case61() {
    int numDiceA = 53;
    int[] sidesA = { 31, 40, 59, 94, 84, 31 };
    int numDiceB = 57;
    int[] sidesB = { 25, 95, 28, 51, 17, 40 };
    assertEquals(0.9814866796160062, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case62() {
    int numDiceA = 200;
    int[] sidesA = { 100, 50, 25, 12, 6, 3 };
    int numDiceB = 200;
    int[] sidesB = { 99, 49, 24, 11, 5, 2 };
    assertEquals(0.6155775286164739, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case63() {
    int numDiceA = 200;
    int[] sidesA = { 1, 3, 8, 18, 45, 100 };
    int numDiceB = 200;
    int[] sidesB = { 1, 4, 10, 21, 53, 100 };
    assertEquals(0.25240407058279035, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case64() {
    int numDiceA = 200;
    int[] sidesA = { 100, 100, 100, 100, 100, 100 };
    int numDiceB = 200;
    int[] sidesB = { 100, 100, 100, 100, 100, 100 };
    assertEquals(0.0, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case65() {
    int numDiceA = 200;
    int[] sidesA = { 99, 100, 100, 100, 100, 100 };
    int numDiceB = 200;
    int[] sidesB = { 100, 100, 100, 100, 100, 98 };
    assertEquals(0.9980545763195985, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case66() {
    int numDiceA = 200;
    int[] sidesA = { 99, 99, 99, 100, 100, 100 };
    int numDiceB = 200;
    int[] sidesB = { 99, 99, 99, 100, 100, 100 };
    assertEquals(0.4800653490181033, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

  @Test
  public void case67() {
    int numDiceA = 200;
    int[] sidesA = { 1, 4, 8, 100, 50, 60 };
    int numDiceB = 200;
    int[] sidesB = { 20, 57, 34, 78, 100, 78 };
    assertEquals(1.1748499430056009e-13, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), 1.0e-20);
  }

  @Test
  public void case68() {
    int numDiceA = 18;
    int[] sidesA = { 6, 6, 6, 6, 6, 6 };
    int numDiceB = 10;
    int[] sidesB = { 1, 2, 3, 4, 5, 6 };
    assertEquals(0.9999999999999999, dicethrows.winProbability(numDiceA, sidesA, numDiceB, sidesB), DELTA);
  }

}
