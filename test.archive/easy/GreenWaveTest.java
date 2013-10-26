package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class GreenWaveTest {
  GreenWave greenwave = new GreenWave();

  @Test
  public void case1() {
    int L = 10;
    int[] speeds = { 1 };
    int[] lights = { 0 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case2() {
    int L = 50;
    int[] speeds = { 1 };
    int[] lights = { 4, 5, 6, 7, 8 };
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case3() {
    int L = 300;
    int[] speeds = { 2, 1 };
    int[] lights = { 16 };
    assertArrayEquals(new int[] { 4 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case4() {
    int L = 300;
    int[] speeds = { 1, 2 };
    int[] lights = { 16 };
    assertArrayEquals(new int[] { 3 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case5() {
    int L = 60;
    int[] speeds = { 12, 15, 20 };
    int[] lights = { 58 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case6() {
    int L = 340;
    int[] speeds = { 16, 15, 29, 7, 9, 15, 2 };
    int[] lights = { 125, 156, 274, 309, 211 };
    assertArrayEquals(new int[] { 5, 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case7() {
    int L = 500;
    int[] speeds = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] lights = { 0, 1, 2, 3, 4 };
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case8() {
    int L = 95;
    int[] speeds = { 18, 28, 24, 26 };
    int[] lights = { 62, 81, 19 };
    assertArrayEquals(new int[] { 2, 3, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case9() {
    int L = 483;
    int[] speeds = { 24, 16, 17, 25, 15, 13, 9, 7, 21, 22 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case10() {
    int L = 264;
    int[] speeds = { 15 };
    int[] lights = { 129, 108, 261, 127 };
    assertArrayEquals(new int[] { 5, 4, 4, 5 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case11() {
    int L = 247;
    int[] speeds = { 14, 12, 19, 4, 6 };
    int[] lights = { 214, 125, 228, 42 };
    assertArrayEquals(new int[] { 3, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case12() {
    int L = 212;
    int[] speeds = { 24, 4, 8, 29, 13, 2 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case13() {
    int L = 233;
    int[] speeds = {  };
    int[] lights = { 51, 94, 83, 220, 150 };
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case14() {
    int L = 378;
    int[] speeds = { 6, 15 };
    int[] lights = { 259, 322, 92 };
    assertArrayEquals(new int[] { 1, 1, 2 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case15() {
    int L = 186;
    int[] speeds = { 29, 19, 1, 14, 20, 28, 26, 28 };
    int[] lights = { 164, 105, 53, 97, 103 };
    assertArrayEquals(new int[] { 4, 5, 2, 1, 3 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case16() {
    int L = 381;
    int[] speeds = {  };
    int[] lights = { 302 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case17() {
    int L = 214;
    int[] speeds = { 3, 22 };
    int[] lights = { 92, 61, 78, 125, 140 };
    assertArrayEquals(new int[] { 1, 1, 3, 1, 3 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case18() {
    int L = 464;
    int[] speeds = { 12, 26, 16 };
    int[] lights = { 72, 429, 236, 416 };
    assertArrayEquals(new int[] { 3, 3, 1, 2 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case19() {
    int L = 110;
    int[] speeds = { 11, 26 };
    int[] lights = { 95, 15, 90, 82 };
    assertArrayEquals(new int[] { 5, 1, 5, 4 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case20() {
    int L = 310;
    int[] speeds = { 2, 7, 10, 15, 20 };
    int[] lights = { 154, 63 };
    assertArrayEquals(new int[] { 4, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case21() {
    int L = 144;
    int[] speeds = { 19, 10, 3, 29 };
    int[] lights = { 42, 63, 46, 110 };
    assertArrayEquals(new int[] { 3, 1, 4, 5 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case22() {
    int L = 489;
    int[] speeds = {  };
    int[] lights = { 355, 446, 187, 395, 168 };
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case23() {
    int L = 142;
    int[] speeds = { 25, 30 };
    int[] lights = { 13, 74, 88 };
    assertArrayEquals(new int[] { 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case24() {
    int L = 347;
    int[] speeds = { 9, 30, 1, 28, 7, 19, 24 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case25() {
    int L = 488;
    int[] speeds = { 20, 30, 2 };
    int[] lights = { 254, 86, 222, 354 };
    assertArrayEquals(new int[] { 1, 2, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case26() {
    int L = 410;
    int[] speeds = { 29, 19, 13 };
    int[] lights = { 383, 148, 251, 339, 99 };
    assertArrayEquals(new int[] { 1, 1, 1, 5, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case27() {
    int L = 183;
    int[] speeds = { 6, 13, 4, 27, 11, 16, 13, 18 };
    int[] lights = { 95 };
    assertArrayEquals(new int[] { 2 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case28() {
    int L = 166;
    int[] speeds = { 26, 16, 3, 18, 28, 8, 24 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case29() {
    int L = 415;
    int[] speeds = { 11, 17 };
    int[] lights = { 340, 199, 177 };
    assertArrayEquals(new int[] { 1, 5, 3 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case30() {
    int L = 93;
    int[] speeds = { 12, 17, 2, 9, 10, 17, 18, 25, 1, 2 };
    int[] lights = { 1, 11, 37, 4, 66 };
    assertArrayEquals(new int[] { 1, 1, 1, 3, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case31() {
    int L = 119;
    int[] speeds = { 28, 28, 15 };
    int[] lights = { 79 };
    assertArrayEquals(new int[] { 4 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case32() {
    int L = 298;
    int[] speeds = { 25, 17, 23, 11, 15, 28, 27, 5, 4, 24 };
    int[] lights = { 131, 239, 41, 20, 57 };
    assertArrayEquals(new int[] { 1, 4, 5, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case33() {
    int L = 99;
    int[] speeds = { 9, 27, 3, 8, 28, 18 };
    int[] lights = { 8, 83, 38, 97 };
    assertArrayEquals(new int[] { 1, 1, 1, 2 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case34() {
    int L = 314;
    int[] speeds = {  };
    int[] lights = { 157, 279, 145, 115, 176 };
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case35() {
    int L = 397;
    int[] speeds = { 25, 7, 12, 13, 25, 29 };
    int[] lights = { 211 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case36() {
    int L = 174;
    int[] speeds = {  };
    int[] lights = { 89, 0, 40, 86 };
    assertArrayEquals(new int[] { 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case37() {
    int L = 356;
    int[] speeds = { 3, 27 };
    int[] lights = { 256 };
    assertArrayEquals(new int[] { 2 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case38() {
    int L = 266;
    int[] speeds = { 9, 13, 6, 23, 3, 1 };
    int[] lights = { 224, 144, 206, 264, 151 };
    assertArrayEquals(new int[] { 1, 1, 1, 1, 4 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case39() {
    int L = 133;
    int[] speeds = { 11 };
    int[] lights = { 58, 121, 26 };
    assertArrayEquals(new int[] { 2, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case40() {
    int L = 79;
    int[] speeds = { 6, 24, 1, 11, 11, 19, 1, 29, 27, 27 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case41() {
    int L = 494;
    int[] speeds = { 11, 7, 11, 6 };
    int[] lights = { 438, 251 };
    assertArrayEquals(new int[] { 3, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case42() {
    int L = 279;
    int[] speeds = { 23, 15 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case43() {
    int L = 77;
    int[] speeds = { 29, 3, 1, 28 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case44() {
    int L = 491;
    int[] speeds = { 20, 12, 1, 3 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case45() {
    int L = 423;
    int[] speeds = { 2, 18 };
    int[] lights = { 37, 244, 284, 419 };
    assertArrayEquals(new int[] { 5, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case46() {
    int L = 421;
    int[] speeds = { 11, 11, 2, 5, 10, 23, 29, 9, 16 };
    int[] lights = { 368, 174, 270, 145 };
    assertArrayEquals(new int[] { 4, 1, 5, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case47() {
    int L = 486;
    int[] speeds = {  };
    int[] lights = { 289, 409, 40, 413, 161 };
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case48() {
    int L = 77;
    int[] speeds = { 11, 26 };
    int[] lights = { 31, 65, 36, 69, 57 };
    assertArrayEquals(new int[] { 1, 3, 1, 3, 2 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case49() {
    int L = 23;
    int[] speeds = { 18 };
    int[] lights = { 2, 6, 11, 19 };
    assertArrayEquals(new int[] { 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case50() {
    int L = 414;
    int[] speeds = { 19, 6, 20, 19, 13, 10, 26 };
    int[] lights = { 408 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case51() {
    int L = 69;
    int[] speeds = { 14, 16, 6, 20, 20 };
    int[] lights = { 23, 31 };
    assertArrayEquals(new int[] { 3, 4 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case52() {
    int L = 297;
    int[] speeds = { 7 };
    int[] lights = { 283, 107 };
    assertArrayEquals(new int[] { 1, 2 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case53() {
    int L = 164;
    int[] speeds = { 2 };
    int[] lights = { 76, 148, 150, 149 };
    assertArrayEquals(new int[] { 5, 1, 2, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case54() {
    int L = 321;
    int[] speeds = { 12 };
    int[] lights = { 264, 229, 109 };
    assertArrayEquals(new int[] { 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case55() {
    int L = 245;
    int[] speeds = { 23, 19, 17, 26, 27, 5, 27, 7, 28, 11 };
    int[] lights = { 76, 11, 84 };
    assertArrayEquals(new int[] { 1, 4, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case56() {
    int L = 335;
    int[] speeds = { 2, 18, 11, 6, 22, 27, 30, 9, 30 };
    int[] lights = { 124 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case57() {
    int L = 17;
    int[] speeds = { 26, 15, 1, 20 };
    int[] lights = { 9, 1, 10, 7, 15 };
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case58() {
    int L = 314;
    int[] speeds = { 8, 1, 5, 3, 20, 7, 3, 1 };
    int[] lights = { 53 };
    assertArrayEquals(new int[] { 2 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case59() {
    int L = 120;
    int[] speeds = { 9, 6, 6, 16, 16, 22, 5, 30, 18 };
    int[] lights = { 31, 43, 16 };
    assertArrayEquals(new int[] { 1, 2, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case60() {
    int L = 69;
    int[] speeds = { 11, 12, 3, 13 };
    int[] lights = { 64, 7, 56, 38, 5 };
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case61() {
    int L = 467;
    int[] speeds = { 15, 9, 19, 23 };
    int[] lights = { 309, 111, 90 };
    assertArrayEquals(new int[] { 2, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case62() {
    int L = 122;
    int[] speeds = { 22, 20, 5, 16, 18, 8, 13, 24 };
    int[] lights = { 115 };
    assertArrayEquals(new int[] { 3 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case63() {
    int L = 106;
    int[] speeds = { 15 };
    int[] lights = { 40, 15, 96, 45 };
    assertArrayEquals(new int[] { 1, 1, 3, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case64() {
    int L = 107;
    int[] speeds = { 1, 9, 29 };
    int[] lights = { 4, 16, 28 };
    assertArrayEquals(new int[] { 1, 3, 5 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case65() {
    int L = 20;
    int[] speeds = { 10, 7, 29, 28, 18, 30, 23, 5, 28, 20 };
    int[] lights = { 18 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case66() {
    int L = 243;
    int[] speeds = { 23, 5, 24, 5, 5, 18, 8 };
    int[] lights = { 175, 66, 81 };
    assertArrayEquals(new int[] { 1, 4, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case67() {
    int L = 163;
    int[] speeds = { 3, 8, 6 };
    int[] lights = { 96, 105, 67 };
    assertArrayEquals(new int[] { 1, 2, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case68() {
    int L = 241;
    int[] speeds = { 14, 1, 16, 25, 23 };
    int[] lights = { 88 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case69() {
    int L = 414;
    int[] speeds = {  };
    int[] lights = { 113, 50 };
    assertArrayEquals(new int[] { 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case70() {
    int L = 424;
    int[] speeds = { 27, 15, 30 };
    int[] lights = { 317, 349, 170, 124 };
    assertArrayEquals(new int[] { 1, 2, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case71() {
    int L = 489;
    int[] speeds = { 20, 2, 25, 13, 20, 2, 29, 7, 14 };
    int[] lights = { 126, 92, 198, 279, 289 };
    assertArrayEquals(new int[] { 1, 4, 4, 4, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case72() {
    int L = 175;
    int[] speeds = { 13, 16, 26, 25, 13, 21, 22, 20, 24, 17 };
    int[] lights = { 20, 10, 155 };
    assertArrayEquals(new int[] { 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case73() {
    int L = 393;
    int[] speeds = { 5 };
    int[] lights = { 193, 133, 388 };
    assertArrayEquals(new int[] { 5, 3, 4 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case74() {
    int L = 191;
    int[] speeds = { 8, 6 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case75() {
    int L = 434;
    int[] speeds = { 8, 4, 2, 14, 24, 23, 22, 7 };
    int[] lights = { 168 };
    assertArrayEquals(new int[] { 3 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case76() {
    int L = 434;
    int[] speeds = { 22, 8, 30, 9, 6, 15, 18, 26, 1, 14 };
    int[] lights = { 237, 343 };
    assertArrayEquals(new int[] { 2, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case77() {
    int L = 98;
    int[] speeds = { 22, 29, 23, 20 };
    int[] lights = { 61, 78, 76 };
    assertArrayEquals(new int[] { 3, 3, 3 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case78() {
    int L = 234;
    int[] speeds = { 14, 20, 28, 11, 22, 10, 14 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case79() {
    int L = 329;
    int[] speeds = { 9, 24, 4, 27, 19, 15 };
    int[] lights = { 301, 233, 176, 154, 321 };
    assertArrayEquals(new int[] { 4, 1, 3, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case80() {
    int L = 132;
    int[] speeds = { 2, 8, 21, 9, 4, 1, 26, 24, 12 };
    int[] lights = { 90, 32, 107, 60 };
    assertArrayEquals(new int[] { 2, 4, 1, 2 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case81() {
    int L = 26;
    int[] speeds = { 19 };
    int[] lights = { 14, 22, 10, 16, 12 };
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case82() {
    int L = 397;
    int[] speeds = { 28, 12, 1, 27, 21, 8, 17, 1, 7, 19 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case83() {
    int L = 17;
    int[] speeds = { 20, 3, 24, 27 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case84() {
    int L = 210;
    int[] speeds = { 20, 16, 3, 22 };
    int[] lights = { 24, 134, 94, 23 };
    assertArrayEquals(new int[] { 1, 4, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case85() {
    int L = 440;
    int[] speeds = { 29, 21, 11, 9, 19, 22, 8, 23 };
    int[] lights = { 280, 189, 251 };
    assertArrayEquals(new int[] { 1, 1, 4 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case86() {
    int L = 27;
    int[] speeds = { 10 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case87() {
    int L = 475;
    int[] speeds = { 19, 17, 16, 24 };
    int[] lights = { 208, 162, 443 };
    assertArrayEquals(new int[] { 2, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case88() {
    int L = 392;
    int[] speeds = { 7, 5 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case89() {
    int L = 176;
    int[] speeds = { 10, 21, 12, 19, 12, 25, 1 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case90() {
    int L = 301;
    int[] speeds = { 25, 19, 30, 30, 20, 22, 15 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case91() {
    int L = 162;
    int[] speeds = { 3, 21, 18 };
    int[] lights = { 40, 99 };
    assertArrayEquals(new int[] { 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case92() {
    int L = 299;
    int[] speeds = { 12, 10, 29, 24, 22, 26, 10 };
    int[] lights = { 286 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case93() {
    int L = 9;
    int[] speeds = { 15, 23, 4 };
    int[] lights = { 2, 4, 1, 3 };
    assertArrayEquals(new int[] { 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case94() {
    int L = 306;
    int[] speeds = { 23, 7, 20, 7, 27, 8, 29 };
    int[] lights = { 178 };
    assertArrayEquals(new int[] { 5 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case95() {
    int L = 440;
    int[] speeds = { 25, 18, 30, 19, 23, 18, 18, 18, 2 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case96() {
    int L = 231;
    int[] speeds = { 28, 1, 3, 10, 4, 6, 22, 3, 11 };
    int[] lights = { 148, 71 };
    assertArrayEquals(new int[] { 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case97() {
    int L = 482;
    int[] speeds = { 1, 14, 22, 18, 9 };
    int[] lights = { 182, 417, 174, 114 };
    assertArrayEquals(new int[] { 1, 4, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case98() {
    int L = 14;
    int[] speeds = { 18, 26, 16, 4, 1, 13, 15, 2 };
    int[] lights = { 12 };
    assertArrayEquals(new int[] { 5 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case99() {
    int L = 144;
    int[] speeds = { 16, 20 };
    int[] lights = { 55, 53, 45 };
    assertArrayEquals(new int[] { 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case100() {
    int L = 47;
    int[] speeds = { 8, 1, 6, 2, 15, 26, 22, 14, 4, 15 };
    int[] lights = { 16 };
    assertArrayEquals(new int[] { 4 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case101() {
    int L = 26;
    int[] speeds = { 1, 16, 27, 7, 28, 9 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case102() {
    int L = 493;
    int[] speeds = { 29, 5, 1, 4 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case103() {
    int L = 276;
    int[] speeds = { 11, 26, 15, 13, 23, 11, 3, 29, 13 };
    int[] lights = { 261, 191, 4, 223 };
    assertArrayEquals(new int[] { 1, 1, 4, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case104() {
    int L = 43;
    int[] speeds = { 26, 3, 4, 13, 20, 8, 21, 29 };
    int[] lights = { 0 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case105() {
    int L = 359;
    int[] speeds = { 28, 6, 10, 17, 18 };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case106() {
    int L = 439;
    int[] speeds = { 28, 15, 2 };
    int[] lights = { 324 };
    assertArrayEquals(new int[] { 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case107() {
    int L = 500;
    int[] speeds = {  };
    int[] lights = {  };
    assertArrayEquals(new int[] {  }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case108() {
    int L = 340;
    int[] speeds = { 16, 15, 29, 7, 9, 15, 2 };
    int[] lights = { 125, 156, 274, 309, 211 };
    assertArrayEquals(new int[] { 5, 1, 1, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

  @Test
  public void case109() {
    int L = 100;
    int[] speeds = { 1, 20, 30, 1, 25, 15 };
    int[] lights = { 0, 57, 5, 94, 23 };
    assertArrayEquals(new int[] { 1, 4, 2, 1, 1 }, greenwave.getFirstRed(L, speeds, lights));
  }

}
