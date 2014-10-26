package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SortishDiv2Test {
  SortishDiv2 sortishdiv2 = new SortishDiv2();

  @Test
  public void case1() {
    int sortedness = 5;
    int[] seq = { 4, 0, 0, 2, 0 };
    assertEquals(2, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case2() {
    int sortedness = 2405;
    int[] seq = { 4, 62, 10, 33, 86, 58, 9, 49, 68, 84, 30, 88, 90, 67, 59, 0, 19, 25, 12, 72, 44, 85, 51, 5, 13, 98, 94, 91, 24, 47, 27, 95, 100, 77, 15, 92, 0, 70, 55, 31, 28, 81, 75, 39, 34, 74, 2, 89, 45, 63, 36, 64, 43, 93, 29, 50, 7, 54, 0, 82, 71, 66, 97, 53, 23, 38, 69, 52, 48, 21, 26, 17, 20, 57, 37, 61, 11, 73, 60, 78, 18, 79, 0, 80, 16, 83, 56, 35, 0, 32, 6, 96, 1, 99, 46, 76, 22, 87, 3, 41 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case3() {
    int sortedness = 4;
    int[] seq = { 0, 0, 0, 0 };
    assertEquals(5, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case4() {
    int sortedness = 2;
    int[] seq = { 1, 3, 2 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case5() {
    int sortedness = 2;
    int[] seq = { 1, 2, 0, 5, 0, 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case6() {
    int sortedness = 0;
    int[] seq = { 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case7() {
    int sortedness = 1;
    int[] seq = { 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case8() {
    int sortedness = 987000123;
    int[] seq = { 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case9() {
    int sortedness = 0;
    int[] seq = { 1 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case10() {
    int sortedness = 1;
    int[] seq = { 1 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case11() {
    int sortedness = 0;
    int[] seq = { 0, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case12() {
    int sortedness = 1;
    int[] seq = { 0, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case13() {
    int sortedness = 2;
    int[] seq = { 0, 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case14() {
    int sortedness = 0;
    int[] seq = { 1, 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case15() {
    int sortedness = 1;
    int[] seq = { 1, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case16() {
    int sortedness = 2;
    int[] seq = { 1, 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case17() {
    int sortedness = 0;
    int[] seq = { 1, 2 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case18() {
    int sortedness = 1;
    int[] seq = { 1, 2 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case19() {
    int sortedness = 2;
    int[] seq = { 1, 2 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case20() {
    int sortedness = 0;
    int[] seq = { 0, 2 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case21() {
    int sortedness = 1;
    int[] seq = { 0, 2 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case22() {
    int sortedness = 2;
    int[] seq = { 0, 2 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case23() {
    int sortedness = 0;
    int[] seq = { 0, 1 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case24() {
    int sortedness = 1;
    int[] seq = { 0, 1 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case25() {
    int sortedness = 2;
    int[] seq = { 0, 1 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case26() {
    int sortedness = 0;
    int[] seq = { 2, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case27() {
    int sortedness = 1;
    int[] seq = { 2, 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case28() {
    int sortedness = 2;
    int[] seq = { 2, 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case29() {
    int sortedness = 7;
    int[] seq = { 0, 0, 0, 0, 0 };
    assertEquals(15, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case30() {
    int sortedness = 6;
    int[] seq = { 3, 0, 0, 0, 0, 4 };
    assertEquals(3, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case31() {
    int sortedness = 1;
    int[] seq = { 0, 0, 0 };
    assertEquals(2, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case32() {
    int sortedness = 7;
    int[] seq = { 0, 0, 0, 0, 3 };
    assertEquals(3, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case33() {
    int sortedness = 5;
    int[] seq = { 3, 5, 0, 2, 4 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case34() {
    int sortedness = 3;
    int[] seq = { 1, 4, 0, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case35() {
    int sortedness = 9;
    int[] seq = { 2, 4, 0, 1, 3, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case36() {
    int sortedness = 3;
    int[] seq = { 1, 4, 3, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case37() {
    int sortedness = 2;
    int[] seq = { 0, 0, 0, 0 };
    assertEquals(5, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case38() {
    int sortedness = 9;
    int[] seq = { 4, 1, 0, 6, 0, 0, 3 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case39() {
    int sortedness = 8;
    int[] seq = { 7, 1, 4, 0, 5, 2, 3 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case40() {
    int sortedness = 11;
    int[] seq = { 5, 4, 6, 0, 0, 0, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case41() {
    int sortedness = 1;
    int[] seq = { 3, 0, 2 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case42() {
    int sortedness = 3;
    int[] seq = { 0, 2, 1, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case43() {
    int sortedness = 9;
    int[] seq = { 0, 0, 3, 0, 0 };
    assertEquals(2, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case44() {
    int sortedness = 7;
    int[] seq = { 0, 3, 0, 6, 2, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case45() {
    int sortedness = 92;
    int[] seq = { 1, 18, 0, 15, 0, 12, 8, 10, 5, 3, 14, 0, 13, 16, 0, 19, 17, 2, 11 };
    assertEquals(3, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case46() {
    int sortedness = 14;
    int[] seq = { 7, 1, 0, 0, 8, 0, 0, 6 };
    assertEquals(3, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case47() {
    int sortedness = 23;
    int[] seq = { 9, 4, 0, 0, 0, 10, 6, 8, 1, 7 };
    assertEquals(2, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case48() {
    int sortedness = 31;
    int[] seq = { 3, 6, 0, 4, 0, 0, 1, 5, 10, 9 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case49() {
    int sortedness = 11;
    int[] seq = { 7, 4, 9, 6, 8, 0, 0, 0, 0 };
    assertEquals(5, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case50() {
    int sortedness = 26;
    int[] seq = { 3, 7, 1, 9, 2, 6, 10, 0, 4, 0 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case51() {
    int sortedness = 130;
    int[] seq = { 0, 5, 13, 4, 16, 6, 14, 0, 10, 0, 8, 3, 12, 2, 19, 22, 20, 15, 17, 18, 11, 7 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case52() {
    int sortedness = 33;
    int[] seq = { 5, 10, 3, 0, 11, 4, 2, 1, 7, 12, 8, 6 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case53() {
    int sortedness = 56;
    int[] seq = { 16, 11, 17, 0, 3, 6, 8, 7, 13, 10, 0, 2, 0, 5, 14, 1, 0, 4 };
    assertEquals(3, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case54() {
    int sortedness = 109;
    int[] seq = { 6, 17, 11, 2, 0, 4, 1, 7, 18, 0, 10, 5, 9, 19, 0, 14, 0, 16, 12 };
    assertEquals(3, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case55() {
    int sortedness = 29;
    int[] seq = { 7, 2, 12, 6, 8, 0, 0, 5, 0, 0, 1, 3 };
    assertEquals(4, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case56() {
    int sortedness = 928;
    int[] seq = { 61, 44, 47, 31, 33, 23, 30, 54, 34, 17, 58, 18, 26, 43, 50, 35, 6, 52, 48, 22, 55, 19, 53, 9, 12, 57, 56, 8, 29, 32, 36, 60, 37, 7, 62, 59, 16, 24, 27, 13, 25, 21, 49, 42, 45, 46, 0, 10, 20, 2, 11, 38, 4, 51, 65, 28, 39, 5, 3, 40, 0, 63, 41, 15, 64 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case57() {
    int sortedness = 2011;
    int[] seq = { 13, 0, 76, 74, 0, 68, 35, 61, 32, 19, 41, 22, 64, 0, 33, 40, 0, 67, 47, 51, 54, 38, 31, 56, 5, 27, 70, 2, 63, 73, 44, 69, 26, 11, 80, 37, 14, 23, 77, 3, 9, 12, 42, 86, 43, 60, 85, 84, 71, 6, 45, 25, 17, 88, 24, 16, 18, 34, 36, 57, 82, 89, 20, 52, 50, 66, 10, 29, 48, 79, 46, 58, 65, 83, 90, 21, 4, 49, 75, 30, 1, 39, 7, 72, 59, 62, 15, 28, 55, 78 };
    assertEquals(2, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case58() {
    int sortedness = 957;
    int[] seq = { 26, 62, 66, 64, 12, 51, 23, 68, 11, 8, 61, 58, 60, 43, 20, 29, 14, 52, 21, 45, 49, 31, 54, 24, 65, 6, 46, 44, 35, 41, 38, 39, 17, 10, 63, 67, 34, 22, 25, 50, 18, 2, 9, 0, 5, 30, 27, 7, 4, 42, 57, 15, 53, 55, 16, 56, 59, 28, 37, 47, 32, 40, 3, 33, 48, 13, 1, 36 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case59() {
    int sortedness = 1912;
    int[] seq = { 9, 75, 19, 58, 74, 18, 86, 52, 47, 54, 69, 60, 31, 35, 73, 39, 91, 23, 78, 76, 20, 56, 48, 55, 41, 5, 84, 64, 80, 83, 89, 92, 93, 59, 1, 21, 32, 17, 66, 81, 62, 72, 45, 6, 33, 14, 15, 53, 36, 29, 67, 79, 42, 63, 49, 3, 68, 40, 57, 22, 94, 13, 0, 71, 46, 87, 7, 25, 34, 85, 50, 8, 11, 82, 16, 90, 51, 28, 43, 12, 26, 88, 37, 77, 70, 65, 38, 30, 2, 27, 44, 10, 4, 24 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case60() {
    int sortedness = 1056;
    int[] seq = { 18, 22, 0, 36, 23, 62, 0, 52, 56, 19, 57, 1, 58, 0, 7, 44, 60, 39, 8, 24, 59, 64, 46, 13, 31, 55, 35, 47, 2, 38, 29, 53, 32, 45, 33, 0, 37, 20, 11, 6, 50, 21, 48, 49, 17, 28, 25, 4, 40, 16, 43, 42, 41, 54, 30, 51, 65, 26, 63, 34, 61, 12, 27, 3, 14, 5 };
    assertEquals(2, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case61() {
    int sortedness = 1115;
    int[] seq = { 3, 35, 9, 58, 20, 47, 5, 34, 36, 19, 23, 59, 7, 21, 46, 27, 8, 55, 62, 6, 56, 44, 1, 16, 12, 26, 57, 63, 61, 40, 39, 41, 24, 13, 11, 49, 15, 10, 2, 0, 45, 42, 29, 53, 0, 52, 50, 14, 64, 0, 18, 43, 28, 0, 32, 4, 48, 60, 51, 17, 54, 37, 33, 38 };
    assertEquals(3, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case62() {
    int sortedness = 228;
    int[] seq = { 32, 17, 13, 12, 15, 29, 26, 18, 19, 27, 31, 23, 2, 1, 3, 14, 6, 22, 0, 5, 10, 9, 30, 8, 11, 28, 4, 7, 16, 25, 24, 21 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case63() {
    int sortedness = 1712;
    int[] seq = { 27, 57, 40, 80, 20, 12, 11, 21, 54, 70, 0, 5, 74, 8, 6, 4, 46, 19, 53, 45, 22, 48, 32, 31, 66, 51, 65, 47, 15, 58, 73, 50, 67, 62, 72, 76, 9, 2, 49, 25, 24, 18, 61, 35, 38, 30, 37, 29, 68, 23, 28, 81, 44, 13, 79, 60, 10, 26, 55, 16, 1, 64, 78, 42, 43, 41, 36, 17, 7, 59, 71, 3, 77, 33, 63, 14, 75, 69, 39, 34, 56 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case64() {
    int sortedness = 1063;
    int[] seq = { 50, 53, 62, 36, 13, 7, 28, 57, 38, 33, 27, 30, 5, 29, 0, 45, 34, 63, 17, 61, 8, 55, 9, 56, 2, 54, 68, 69, 66, 31, 26, 64, 39, 67, 51, 0, 3, 19, 35, 44, 43, 15, 65, 25, 23, 0, 37, 32, 52, 6, 1, 16, 58, 49, 48, 47, 4, 22, 11, 42, 59, 20, 18, 14, 10, 0, 21, 41, 40 };
    assertEquals(2, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case65() {
    int sortedness = 967;
    int[] seq = { 47, 7, 3, 46, 14, 38, 17, 4, 27, 30, 43, 21, 40, 0, 52, 44, 35, 13, 6, 58, 31, 48, 39, 5, 25, 42, 59, 0, 29, 10, 0, 50, 45, 2, 0, 23, 57, 34, 1, 32, 55, 18, 15, 12, 60, 20, 53, 8, 41, 19, 22, 49, 51, 36, 54, 9, 0, 33, 26, 56 };
    assertEquals(3, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case66() {
    int sortedness = 2475;
    int[] seq = { 47, 36, 12, 91, 23, 89, 35, 81, 38, 18, 11, 72, 86, 99, 22, 15, 54, 55, 28, 31, 14, 83, 62, 41, 90, 5, 96, 97, 4, 19, 10, 69, 98, 6, 71, 20, 66, 58, 65, 24, 42, 37, 21, 17, 46, 61, 84, 78, 33, 50, 77, 32, 30, 74, 59, 60, 9, 95, 39, 44, 68, 27, 92, 73, 67, 25, 53, 16, 76, 75, 79, 43, 87, 80, 7, 29, 34, 26, 82, 93, 2, 88, 48, 56, 94, 8, 63, 85, 51, 45, 1, 13, 64, 57, 70, 49, 52, 40, 3 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case67() {
    int sortedness = 2476;
    int[] seq = { 38, 43, 36, 18, 88, 86, 90, 37, 58, 83, 99, 48, 15, 44, 64, 22, 25, 45, 66, 67, 68, 81, 30, 82, 59, 23, 91, 0, 5, 56, 69, 96, 21, 31, 89, 0, 40, 34, 16, 7, 41, 60, 10, 71, 35, 33, 57, 42, 3, 4, 50, 61, 77, 9, 74, 6, 85, 70, 29, 62, 14, 2, 24, 17, 95, 39, 49, 63, 93, 72, 54, 12, 51, 76, 94, 92, 52, 98, 80, 55, 75, 20, 27, 100, 87, 79, 46, 32, 97, 28, 8, 47, 84, 1, 26, 65, 53, 11, 19, 73 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case68() {
    int sortedness = 406;
    int[] seq = { 40, 7, 37, 11, 8, 4, 12, 0, 0, 18, 6, 28, 26, 33, 14, 0, 27, 35, 19, 24, 36, 2, 30, 34, 3, 5, 10, 23, 13, 41, 21, 22, 39, 15, 1, 16, 17, 31, 9, 29, 20 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case69() {
    int sortedness = 803;
    int[] seq = { 0, 28, 44, 10, 53, 50, 26, 0, 9, 4, 37, 6, 30, 22, 40, 19, 12, 31, 34, 0, 54, 57, 14, 36, 2, 42, 56, 51, 24, 18, 20, 32, 15, 1, 41, 47, 17, 7, 21, 23, 25, 33, 3, 0, 48, 35, 38, 27, 45, 29, 55, 43, 8, 5, 16, 46, 39 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case70() {
    int sortedness = 340;
    int[] seq = { 27, 29, 22, 31, 38, 13, 34, 25, 10, 2, 32, 17, 5, 15, 6, 12, 0, 1, 0, 0, 36, 33, 26, 37, 4, 16, 24, 0, 20, 39, 18, 23, 7, 35, 0, 8, 30, 19, 3 };
    assertEquals(3, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case71() {
    int sortedness = 2207;
    int[] seq = { 45, 86, 2, 38, 35, 65, 3, 74, 89, 70, 83, 61, 8, 21, 41, 51, 33, 58, 31, 9, 7, 69, 79, 17, 15, 91, 76, 77, 4, 36, 18, 22, 60, 72, 1, 12, 54, 47, 11, 25, 44, 57, 28, 52, 71, 34, 32, 81, 30, 92, 64, 10, 53, 5, 85, 68, 37, 90, 24, 93, 46, 40, 16, 62, 84, 29, 27, 59, 88, 75, 78, 82, 13, 63, 48, 67, 73, 49, 80, 6, 50, 87, 55, 14, 43, 56, 42, 39, 66, 23, 26, 20, 19 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case72() {
    int sortedness = 344;
    int[] seq = { 6, 37, 29, 31, 40, 32, 3, 0, 50, 39, 45, 57, 42, 0, 21, 18, 54, 55, 52, 47, 19, 5, 51, 35, 23, 8, 26, 4, 38, 16, 43, 13, 53, 28, 11, 34, 17, 0, 22, 10, 30, 9, 15, 46, 2, 27, 36, 0, 20, 12, 25, 41, 7, 48, 14, 56, 44 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case73() {
    int sortedness = 1473;
    int[] seq = { 8, 0, 39, 40, 56, 7, 24, 5, 35, 18, 30, 2, 6, 15, 37, 45, 26, 57, 22, 38, 4, 0, 17, 16, 59, 13, 31, 34, 33, 23, 42, 14, 43, 55, 47, 1, 44, 49, 0, 11, 12, 28, 36, 29, 3, 25, 32, 46, 19, 21, 48, 27, 51, 52, 53, 60, 54, 0, 50, 9 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case74() {
    int sortedness = 1089;
    int[] seq = { 58, 82, 26, 30, 66, 41, 45, 59, 88, 52, 25, 91, 80, 77, 73, 5, 6, 12, 39, 72, 0, 29, 21, 9, 15, 20, 38, 0, 42, 18, 17, 0, 22, 33, 85, 53, 7, 32, 84, 46, 4, 60, 2, 43, 90, 14, 36, 24, 31, 57, 50, 23, 65, 89, 81, 93, 51, 69, 86, 44, 8, 62, 55, 76, 92, 0, 28, 83, 49, 1, 27, 13, 64, 11, 48, 63, 67, 16, 3, 0, 10, 37, 71, 47, 35, 79, 34, 68, 54, 78, 75, 19, 56 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case75() {
    int sortedness = 1230;
    int[] seq = { 63, 41, 74, 22, 19, 42, 23, 70, 7, 11, 0, 52, 34, 76, 12, 48, 26, 16, 28, 33, 49, 54, 36, 2, 29, 3, 44, 13, 18, 14, 20, 35, 32, 60, 4, 71, 0, 10, 27, 56, 1, 72, 6, 53, 0, 5, 55, 75, 40, 31, 8, 9, 62, 51, 65, 46, 59, 58, 68, 73, 66, 38, 47, 30, 21, 67, 69, 39, 61, 25, 50, 24, 43, 57, 45, 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case76() {
    int sortedness = 833;
    int[] seq = { 22, 27, 3, 25, 43, 37, 5, 40, 16, 35, 39, 34, 2, 9, 33, 7, 11, 30, 4, 21, 15, 46, 31, 45, 6, 13, 20, 44, 14, 10, 47, 17, 36, 8, 26, 24, 38, 32, 23, 1, 19, 29, 41, 28, 42, 12, 18 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case77() {
    int sortedness = 707;
    int[] seq = { 48, 57, 44, 19, 27, 0, 22, 20, 0, 32, 41, 11, 51, 34, 16, 45, 40, 29, 43, 58, 47, 21, 46, 0, 50, 49, 4, 60, 35, 59, 25, 61, 24, 15, 12, 30, 13, 62, 56, 54, 17, 37, 2, 18, 9, 3, 6, 38, 55, 28, 14, 39, 0, 5, 8, 33, 1, 10, 31, 52, 23, 26 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case78() {
    int sortedness = 3687;
    int[] seq = { 73, 7, 61, 26, 4, 0, 57, 77, 44, 38, 22, 54, 87, 43, 37, 70, 10, 46, 14, 84, 25, 42, 50, 59, 72, 9, 1, 76, 31, 71, 36, 29, 86, 62, 39, 80, 15, 5, 67, 30, 8, 85, 79, 40, 0, 3, 34, 47, 60, 53, 81, 75, 82, 13, 6, 45, 11, 23, 65, 12, 18, 41, 69, 21, 63, 17, 78, 56, 33, 49, 0, 27, 58, 66, 52, 32, 0, 51, 24, 16, 48, 74, 20, 83, 35, 28, 68 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case79() {
    int sortedness = 1063;
    int[] seq = { 12, 14, 1, 17, 29, 28, 45, 25, 27, 46, 4, 26, 22, 0, 0, 5, 20, 35, 9, 36, 30, 23, 31, 47, 38, 0, 24, 6, 19, 0, 42, 33, 40, 44, 15, 8, 13, 18, 41, 48, 10, 37, 0, 34, 21, 11, 2, 43 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case80() {
    int sortedness = 102;
    int[] seq = { 15, 34, 0, 5, 16, 10, 19, 21, 3, 12, 4, 7, 14, 23, 1, 2, 24, 30, 18, 8, 27, 13, 20, 0, 22, 9, 28, 25, 32, 26, 6, 33, 31, 29 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case81() {
    int sortedness = 1441;
    int[] seq = { 51, 24, 42, 49, 43, 31, 55, 8, 26, 9, 50, 54, 30, 2, 45, 4, 1, 32, 40, 36, 46, 0, 61, 67, 12, 44, 66, 19, 3, 65, 23, 17, 63, 58, 27, 53, 41, 5, 29, 70, 18, 35, 48, 11, 21, 6, 33, 14, 34, 10, 16, 56, 0, 69, 62, 25, 59, 64, 13, 7, 38, 20, 57, 15, 60, 22, 52, 47, 39, 37 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case82() {
    int sortedness = 432;
    int[] seq = { 0, 7, 3, 2, 15, 13, 26, 31, 10, 24, 0, 12, 23, 27, 6, 25, 0, 19, 0, 4, 32, 0, 22, 28, 30, 16, 9, 1, 33, 8, 20, 21, 14, 5, 29 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case83() {
    int sortedness = 1404;
    int[] seq = { 58, 26, 50, 2, 8, 54, 23, 18, 49, 28, 55, 9, 35, 14, 29, 59, 30, 3, 27, 32, 0, 16, 1, 10, 60, 34, 52, 31, 21, 25, 36, 12, 37, 5, 38, 20, 51, 53, 40, 33, 56, 47, 43, 4, 22, 15, 24, 19, 45, 17, 11, 48, 46, 39, 41, 7, 42, 44, 6, 0 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case84() {
    int sortedness = 295;
    int[] seq = { 31, 16, 28, 5, 22, 2, 27, 37, 23, 30, 11, 10, 19, 14, 35, 13, 17, 24, 18, 1, 32, 4, 21, 26, 25, 12, 3, 38, 15, 0, 6, 20, 33, 9, 34, 29, 0, 7 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case85() {
    int sortedness = 464;
    int[] seq = { 29, 34, 2, 17, 16, 11, 43, 47, 13, 1, 30, 12, 27, 32, 28, 42, 9, 51, 36, 45, 49, 14, 18, 33, 39, 31, 37, 15, 8, 44, 5, 41, 4, 23, 0, 22, 35, 10, 26, 21, 38, 46, 50, 3, 7, 19, 0, 48, 24, 6, 25 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case86() {
    int sortedness = 858;
    int[] seq = { 52, 67, 26, 8, 1, 60, 51, 50, 56, 46, 22, 0, 73, 45, 70, 72, 6, 36, 66, 2, 63, 32, 0, 43, 48, 16, 40, 3, 31, 9, 29, 69, 47, 39, 7, 0, 11, 30, 34, 27, 41, 54, 68, 0, 35, 21, 25, 28, 59, 37, 5, 10, 19, 49, 15, 23, 33, 61, 65, 53, 71, 18, 0, 38, 13, 64, 42, 62, 44, 58, 12, 20, 55 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case87() {
    int sortedness = 324642071;
    int[] seq = { 15, 21, 11, 0, 22, 14, 33, 20, 0, 27, 36, 10, 13, 24, 38, 3, 1, 23, 39, 31, 35, 32, 29, 30, 6, 4, 8, 26, 18, 19, 12, 17, 5, 16, 7, 9, 28, 34, 37 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case88() {
    int sortedness = 811148265;
    int[] seq = { 18, 44, 34, 80, 74, 53, 68, 12, 26, 23, 31, 60, 45, 28, 32, 70, 11, 7, 75, 17, 72, 77, 40, 15, 78, 35, 27, 48, 8, 57, 69, 16, 38, 9, 76, 10, 86, 20, 89, 43, 49, 59, 84, 85, 39, 0, 63, 54, 47, 81, 24, 0, 1, 52, 79, 14, 4, 50, 65, 30, 5, 62, 2, 46, 6, 73, 66, 0, 42, 36, 58, 37, 21, 29, 33, 83, 51, 3, 41, 25, 67, 87, 88, 13, 22, 19, 71, 61, 64 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case89() {
    int sortedness = 489717553;
    int[] seq = { 91, 85, 7, 22, 44, 87, 34, 13, 47, 9, 100, 31, 50, 10, 74, 25, 14, 80, 93, 48, 3, 30, 78, 6, 82, 28, 20, 40, 67, 23, 49, 36, 37, 24, 0, 83, 52, 29, 17, 98, 19, 46, 0, 33, 16, 35, 60, 42, 71, 75, 8, 2, 5, 66, 79, 39, 56, 21, 72, 95, 1, 54, 15, 99, 69, 38, 4, 59, 26, 70, 65, 55, 43, 41, 76, 89, 63, 58, 61, 27, 18, 90, 53, 94, 0, 64, 68, 45, 57, 32, 11, 81, 96, 51, 62, 88, 73, 92, 97, 84 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case90() {
    int sortedness = 64961987;
    int[] seq = { 27, 8, 35, 2, 12, 16, 15, 4, 13, 0, 34, 3, 31, 24, 19, 23, 0, 30, 20, 1, 29, 7, 11, 28, 33, 21, 32, 5, 17, 14, 25, 10, 26, 6, 9 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case91() {
    int sortedness = 708433041;
    int[] seq = { 52, 49, 60, 17, 36, 6, 54, 44, 13, 46, 43, 4, 29, 0, 32, 8, 34, 35, 55, 64, 0, 57, 37, 61, 0, 68, 27, 3, 20, 10, 15, 50, 66, 12, 18, 7, 11, 42, 9, 39, 0, 5, 51, 31, 25, 63, 59, 14, 40, 2, 0, 19, 21, 69, 22, 30, 65, 41, 48, 62, 26, 28, 1, 24, 33, 56, 53, 23, 38 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case92() {
    int sortedness = 2;
    int[] seq = { 1, 3, 2 };
    assertEquals(1, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case93() {
    int sortedness = 4;
    int[] seq = { 0, 0, 0, 0 };
    assertEquals(5, sortishdiv2.ways(sortedness, seq));
  }

  @Test
  public void case94() {
    int sortedness = 0;
    int[] seq = { 1, 2 };
    assertEquals(0, sortishdiv2.ways(sortedness, seq));
  }

}
