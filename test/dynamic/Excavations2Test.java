package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class Excavations2Test {
  Excavations2 excavations2 = new Excavations2();

  @Test
  public void case1() {
    int[] kind = { 1, 2, 2, 1 };
    int[] found = { 1 };
    int K = 2;
    assertEquals(1L, excavations2.count(kind, found, K));
  }

  @Test
  public void case2() {
    int[] kind = { 1, 2, 2, 1 };
    int[] found = { 1, 2 };
    int K = 2;
    assertEquals(4L, excavations2.count(kind, found, K));
  }

  @Test
  public void case3() {
    int[] kind = { 1, 2, 1, 1, 2, 3, 4, 3, 2, 2 };
    int[] found = { 4, 2 };
    int K = 3;
    assertEquals(6L, excavations2.count(kind, found, K));
  }

  @Test
  public void case4() {
    int[] kind = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int[] found = { 50 };
    int K = 21;
    assertEquals(5567902560L, excavations2.count(kind, found, K));
  }

  @Test
  public void case5() {
    int[] kind = { 44 };
    int[] found = { 44 };
    int K = 1;
    assertEquals(1L, excavations2.count(kind, found, K));
  }

  @Test
  public void case6() {
    int[] kind = { 44, 29 };
    int[] found = { 29 };
    int K = 1;
    assertEquals(1L, excavations2.count(kind, found, K));
  }

  @Test
  public void case7() {
    int[] kind = { 9, 14, 2, 7, 6 };
    int[] found = { 2 };
    int K = 1;
    assertEquals(1L, excavations2.count(kind, found, K));
  }

  @Test
  public void case8() {
    int[] kind = { 13, 6, 1, 13, 2, 6 };
    int[] found = { 2, 6, 1, 13 };
    int K = 5;
    assertEquals(4L, excavations2.count(kind, found, K));
  }

  @Test
  public void case9() {
    int[] kind = { 14, 11, 13, 8, 7, 3, 4 };
    int[] found = { 3, 11, 7, 4, 14, 13 };
    int K = 6;
    assertEquals(1L, excavations2.count(kind, found, K));
  }

  @Test
  public void case10() {
    int[] kind = { 9, 6, 11, 1, 12, 14, 11, 5, 15, 6 };
    int[] found = { 11, 15 };
    int K = 2;
    assertEquals(2L, excavations2.count(kind, found, K));
  }

  @Test
  public void case11() {
    int[] kind = { 9, 1, 11, 13, 3, 13, 15, 7, 9, 7, 10, 2, 5 };
    int[] found = { 9, 10, 1 };
    int K = 3;
    assertEquals(2L, excavations2.count(kind, found, K));
  }

  @Test
  public void case12() {
    int[] kind = { 11, 7, 8, 4, 7, 2, 14, 7, 14, 1 };
    int[] found = { 7, 11, 14, 1, 8 };
    int K = 6;
    assertEquals(9L, excavations2.count(kind, found, K));
  }

  @Test
  public void case13() {
    int[] kind = { 5, 5, 14, 12, 7, 5, 7, 9, 4, 11, 14, 8, 4, 10, 1 };
    int[] found = { 1, 5, 7, 10, 11, 14, 8, 4 };
    int K = 9;
    assertEquals(60L, excavations2.count(kind, found, K));
  }

  @Test
  public void case14() {
    int[] kind = { 5, 13, 5, 7, 10, 9, 10, 13, 9, 8, 11, 10, 6, 4, 5, 15, 14 };
    int[] found = { 10, 13, 4, 9, 5, 15 };
    int K = 6;
    assertEquals(36L, excavations2.count(kind, found, K));
  }

  @Test
  public void case15() {
    int[] kind = { 8, 5, 15, 13, 14, 2, 4, 9, 5, 3, 1, 15, 14, 15, 4, 10 };
    int[] found = { 5, 3, 4, 2, 15, 1, 13 };
    int K = 9;
    assertEquals(19L, excavations2.count(kind, found, K));
  }

  @Test
  public void case16() {
    int[] kind = { 7, 2, 3, 3, 5, 2, 12, 2, 14, 7, 5, 11, 6, 1, 15, 8, 12, 12, 6, 9, 8, 8 };
    int[] found = { 1, 9, 12, 5 };
    int K = 4;
    assertEquals(6L, excavations2.count(kind, found, K));
  }

  @Test
  public void case17() {
    int[] kind = { 10, 15, 6, 13, 10, 1, 15, 5, 1, 2, 8, 14, 13, 12, 7, 3, 11, 10, 10, 11 };
    int[] found = { 2, 5, 11, 14, 10, 3, 6, 7, 1, 15 };
    int K = 12;
    assertEquals(128L, excavations2.count(kind, found, K));
  }

  @Test
  public void case18() {
    int[] kind = { 11, 5, 11, 6, 11, 9, 4, 15, 4, 5, 8, 7, 1, 7, 1, 10, 6, 4, 4, 4, 4, 3 };
    int[] found = { 1, 3, 4, 8, 11, 5, 6, 10, 7 };
    int K = 14;
    assertEquals(7063L, excavations2.count(kind, found, K));
  }

  @Test
  public void case19() {
    int[] kind = { 6, 6, 11, 5, 13, 2, 10, 9, 3, 5, 3, 5, 11, 11, 7, 5, 2, 14, 3, 13, 2, 4, 8, 9, 15, 14 };
    int[] found = { 11, 5, 14, 9, 13, 3, 2, 8 };
    int K = 14;
    assertEquals(18653L, excavations2.count(kind, found, K));
  }

  @Test
  public void case20() {
    int[] kind = { 12, 12, 9, 11, 2, 14, 5, 8, 7, 10, 11, 11, 1, 13, 7, 8, 6, 8, 4, 12, 15, 11, 14, 10, 11, 15, 8, 1, 8 };
    int[] found = { 4, 7, 9, 14, 8, 10, 15, 13, 5, 12, 11, 6, 2 };
    int K = 18;
    assertEquals(112975L, excavations2.count(kind, found, K));
  }

  @Test
  public void case21() {
    int[] kind = { 5, 3, 1, 6, 14, 6, 11, 12, 7, 5, 13, 10, 9, 10, 4, 3, 8, 10, 7, 12, 6, 2, 10, 6, 10 };
    int[] found = { 6, 3, 5, 10, 8, 2, 9 };
    int K = 8;
    assertEquals(360L, excavations2.count(kind, found, K));
  }

  @Test
  public void case22() {
    int[] kind = { 3, 9, 4, 6, 2, 10, 11, 11, 6, 14, 12, 1, 9, 5, 9, 5, 13, 3, 14, 14, 1, 14, 6, 3, 8, 9, 1, 13, 5, 10, 5, 5, 8 };
    int[] found = { 11, 8, 2, 14, 9, 1, 12, 10, 6 };
    int K = 15;
    assertEquals(48328L, excavations2.count(kind, found, K));
  }

  @Test
  public void case23() {
    int[] kind = { 3, 10, 4, 2, 8, 7, 12, 5, 12, 5, 11, 2, 1, 11, 11, 11, 8, 13, 10, 6, 2, 15, 4, 12, 2, 2, 13, 10, 2, 3, 1, 12 };
    int[] found = { 4, 7, 5, 13, 8, 11, 12, 2, 10, 1 };
    int K = 17;
    assertEquals(4354304L, excavations2.count(kind, found, K));
  }

  @Test
  public void case24() {
    int[] kind = { 9, 12, 6, 11, 7, 13, 14, 6, 4, 1, 4, 15, 2, 8, 9, 12, 3, 3, 9, 10, 10, 2, 6, 6, 14, 10, 2, 5, 2, 14, 3, 4, 14 };
    int[] found = { 3 };
    int K = 1;
    assertEquals(3L, excavations2.count(kind, found, K));
  }

  @Test
  public void case25() {
    int[] kind = { 10, 4, 2, 8, 6, 8, 2, 3, 9, 3, 4, 3, 3, 1, 14, 15, 4, 15, 9, 3, 4, 7, 15, 8, 14, 14, 12, 2, 2, 14, 6, 5, 9, 1, 15, 14 };
    int[] found = { 2, 10, 12, 9, 8, 15, 3, 4, 5, 7, 1, 14, 6 };
    int K = 35;
    assertEquals(32L, excavations2.count(kind, found, K));
  }

  @Test
  public void case26() {
    int[] kind = { 5, 3, 15, 7, 10, 9, 12, 11, 10, 15, 13, 13, 10, 7, 6, 7, 4, 4, 14, 15, 7, 11, 14, 11, 14, 10, 10, 5, 1, 13, 15, 13, 14, 14, 11, 11, 10, 10 };
    int[] found = { 15, 7, 10 };
    int K = 3;
    assertEquals(112L, excavations2.count(kind, found, K));
  }

  @Test
  public void case27() {
    int[] kind = { 2, 6, 12, 4, 8, 13, 12, 14, 11, 2, 15, 15, 12, 4, 13, 6, 15, 1, 6, 2, 8, 13, 11, 2, 6, 9, 13, 7, 5, 7, 14, 2, 14, 14, 12, 15 };
    int[] found = { 8, 2, 11, 9, 1, 4, 15, 14, 5, 13, 6, 12, 7 };
    int K = 31;
    assertEquals(219384L, excavations2.count(kind, found, K));
  }

  @Test
  public void case28() {
    int[] kind = { 1, 10, 13, 7, 9, 3, 7, 12, 14, 6, 15, 1, 14, 5, 14, 2, 6, 2, 8, 3, 6, 11, 10, 12, 4, 13, 14, 2, 14, 5, 8, 7, 14, 8, 8, 4, 10, 3, 3, 7, 6, 6, 3, 2 };
    int[] found = { 8, 7, 4, 2, 10, 11, 5, 6, 14, 3 };
    int K = 16;
    assertEquals(638253560L, excavations2.count(kind, found, K));
  }

  @Test
  public void case29() {
    int[] kind = { 14, 11, 6, 9, 8, 2, 13, 13, 15, 11, 13, 9, 10, 2, 9, 6, 12, 7, 5, 11, 8, 14, 4, 6, 5, 5, 5, 2, 9, 10, 1, 12, 15, 7, 7, 4, 13, 5, 8, 7, 13 };
    int[] found = { 9, 6, 12, 8, 7 };
    int K = 7;
    assertEquals(4152L, excavations2.count(kind, found, K));
  }

  @Test
  public void case30() {
    int[] kind = { 8, 3, 15, 10, 4, 3, 8, 4, 3, 12, 5, 14, 3, 1, 3, 13, 15, 11, 9, 7, 10, 10, 5, 12, 9, 9, 15, 5, 7, 12, 13, 5, 5, 11, 4, 11, 9, 5, 6, 5, 9, 7, 5 };
    int[] found = { 12, 10, 15, 8, 6, 13, 9, 14, 1, 7, 3, 5, 11, 4 };
    int K = 42;
    assertEquals(40L, excavations2.count(kind, found, K));
  }

  @Test
  public void case31() {
    int[] kind = { 7, 9, 3, 10, 7, 9, 4, 11, 7, 10, 10, 6, 12, 11, 9, 4, 12, 14, 10, 12, 13, 7, 4, 1, 14, 1, 2, 1, 2, 14, 2, 3, 14, 8, 6, 6, 9, 3, 12, 7, 2, 8, 1, 11, 13, 2, 10 };
    int[] found = { 2, 9, 11, 14, 3, 1, 12, 8, 10, 4 };
    int K = 14;
    assertEquals(438150240L, excavations2.count(kind, found, K));
  }

  @Test
  public void case32() {
    int[] kind = { 6, 14, 5, 13, 12, 13, 8, 13, 6, 4, 1, 7, 10, 12, 6, 10, 7, 12, 3, 9, 12, 15, 2, 1, 2, 10, 4, 15, 9, 13, 3, 2, 7, 10, 6, 7, 1, 15, 2, 3, 3, 6, 5, 13, 10 };
    int[] found = { 10, 12, 13, 15, 4, 1, 8, 6, 2, 7, 14 };
    int K = 22;
    assertEquals(2014252800L, excavations2.count(kind, found, K));
  }

  @Test
  public void case33() {
    int[] kind = { 4, 9, 5, 7, 4, 6, 10, 15, 11, 12, 2, 15, 15, 10, 10, 15, 5, 1, 12, 12, 5, 6, 13, 12, 11, 14, 12, 1, 9, 9, 1, 5, 8, 1, 4, 1, 7, 13, 2, 8, 6, 14, 9, 6, 4, 2, 11, 3 };
    int[] found = { 1, 15, 5, 4, 10, 9, 6, 13, 12, 2, 11 };
    int K = 20;
    assertEquals(78978662576L, excavations2.count(kind, found, K));
  }

  @Test
  public void case34() {
    int[] kind = { 37, 4, 1, 23, 29, 35, 43, 27, 47, 2, 38, 22, 50, 44, 29, 27, 7, 34, 32, 47, 42, 49, 13, 11, 40, 47, 31, 1, 27, 38, 29, 2, 8, 36, 40, 26, 50, 17, 27, 5, 33, 43, 39, 39, 43, 32, 38, 21, 36 };
    int[] found = { 27, 43, 35, 36, 8, 38, 39, 2, 26, 4, 17, 1, 40, 5, 47, 50, 32, 42, 13, 44 };
    int K = 25;
    assertEquals(2208384L, excavations2.count(kind, found, K));
  }

  @Test
  public void case35() {
    int[] kind = { 1, 13, 46, 4, 23, 16, 9, 2, 30, 45, 10, 50, 40, 30, 42, 46, 50, 34, 16, 10, 49, 45, 24, 23, 32, 47, 28, 1, 38, 30, 9, 30, 44, 34, 9, 15, 46, 44, 10, 39, 12, 42, 42, 22, 13, 24, 10, 49, 38 };
    int[] found = { 15, 39, 49, 46, 9, 23, 34, 45, 30, 16, 38, 44, 13, 24, 1, 12, 47, 22, 42, 10, 28, 2, 50, 4 };
    int K = 36;
    assertEquals(579702968L, excavations2.count(kind, found, K));
  }

  @Test
  public void case36() {
    int[] kind = { 18, 37, 30, 4, 11, 24, 40, 1, 34, 2, 43, 25, 24, 47, 26, 45, 12, 16, 36, 23, 22, 41, 14, 42, 22, 30, 32, 46, 33, 14, 15, 11, 26, 24, 10, 39, 40, 33, 13, 35, 38, 46, 12, 28, 37, 18, 24, 21, 42, 22 };
    int[] found = { 38, 45, 26, 42 };
    int K = 4;
    assertEquals(4L, excavations2.count(kind, found, K));
  }

  @Test
  public void case37() {
    int[] kind = { 24, 37, 29, 44, 37, 31, 48, 47, 39, 11, 40, 33, 15, 26, 20, 25, 9, 26, 41, 3, 17, 8, 22, 21, 25, 28, 14, 11, 13, 31, 26, 8, 17, 48, 2, 36, 18, 46, 39, 40, 15, 29, 6, 41, 11, 46, 37, 42, 26, 7 };
    int[] found = { 15, 26, 22, 31, 48, 11, 6 };
    int K = 7;
    assertEquals(96L, excavations2.count(kind, found, K));
  }

  @Test
  public void case38() {
    int[] kind = { 46, 38, 20, 49, 17, 42, 39, 40, 42, 25, 2, 35, 50, 29, 10, 46, 36, 26, 42, 32, 6, 47, 27, 7, 3, 29, 26, 3, 47, 26, 35, 9, 20, 44, 50, 38, 12, 22, 37, 12, 14, 6, 21, 49, 11, 12, 13, 23, 9, 16 };
    int[] found = { 42, 14, 7, 6, 2, 12, 20, 26, 23, 16, 29 };
    int K = 12;
    assertEquals(972L, excavations2.count(kind, found, K));
  }

  @Test
  public void case39() {
    int[] kind = { 40, 48, 13, 26, 30, 42, 12, 38, 35, 18, 31, 37, 11, 10, 30, 29, 29, 49, 4, 13, 37, 42, 48, 12, 6, 23, 24, 3, 1, 28, 48, 6, 49, 37, 44, 10, 17, 47, 48, 47, 18, 24, 31, 1, 18, 9, 20, 1, 31, 47 };
    int[] found = { 26, 44, 30, 48, 10, 49, 35, 29, 11, 6, 38, 1, 13, 18, 3, 37, 42, 47, 17 };
    int K = 25;
    assertEquals(14899776L, excavations2.count(kind, found, K));
  }

  @Test
  public void case40() {
    int[] kind = { 44, 49, 10, 26, 26, 42, 16, 15, 3, 12, 17, 22, 10, 41, 25, 29, 35, 14, 35, 42, 22, 22, 49, 20, 40, 41, 25, 35, 38, 23, 42, 38, 7, 47, 5, 30, 50, 19, 16, 48, 39, 50, 49, 19, 16, 19, 42, 42, 49, 46 };
    int[] found = { 42, 47, 15, 22, 49, 7, 46, 40, 3, 35, 10, 41, 14, 19, 20, 50, 26, 5, 48 };
    int K = 26;
    assertEquals(2232923L, excavations2.count(kind, found, K));
  }

  @Test
  public void case41() {
    int[] kind = { 27, 38, 15, 42, 33, 48, 28, 41, 48, 40, 18, 20, 28, 49, 33, 8, 46, 47, 25, 9, 32, 5, 40, 16, 12, 37, 9, 26, 10, 12, 41, 50, 9, 16, 26, 28, 37, 18, 31, 6, 40, 15, 16, 35, 21, 27, 11, 46, 7, 23 };
    int[] found = { 9, 33, 37, 12, 10, 47, 16, 40, 41, 15, 48, 35, 21, 23, 5, 6, 25, 46, 11, 18, 28, 8, 7, 50, 49, 38, 26, 31, 27 };
    int K = 41;
    assertEquals(635502L, excavations2.count(kind, found, K));
  }

  @Test
  public void case42() {
    int[] kind = { 1, 14, 19, 32, 12, 4, 24, 35, 8, 44, 13, 2, 14, 31, 29, 40, 32, 2, 34, 40, 50, 32, 12, 17, 27, 12, 37, 40, 20, 22, 6, 35, 1, 36, 37, 7, 14, 18, 30, 11, 14, 10, 9, 7, 1, 40, 11, 45, 41, 6 };
    int[] found = { 6, 12, 44, 31, 10, 45, 30, 1, 29, 9, 7, 37, 50, 8, 20, 32, 2, 4, 35, 11, 19, 24, 13, 34, 41, 40, 18, 36, 27, 17, 14, 22 };
    int K = 50;
    assertEquals(1L, excavations2.count(kind, found, K));
  }

  @Test
  public void case43() {
    int[] kind = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] found = { 1 };
    int K = 25;
    assertEquals(126410606437752L, excavations2.count(kind, found, K));
  }

  @Test
  public void case44() {
    int[] kind = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] found = { 1 };
    int K = 31;
    assertEquals(30405943383200L, excavations2.count(kind, found, K));
  }

  @Test
  public void case45() {
    int[] kind = { 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1 };
    int[] found = { 1, 2 };
    int K = 23;
    assertEquals(108043253365000L, excavations2.count(kind, found, K));
  }

  @Test
  public void case46() {
    int[] kind = { 2, 1, 1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 1, 1 };
    int[] found = { 1, 2 };
    int K = 43;
    assertEquals(99884400L, excavations2.count(kind, found, K));
  }

  @Test
  public void case47() {
    int[] kind = { 3, 2, 2, 1, 1, 2, 3, 2, 3, 3, 2, 2, 3, 2, 1, 3, 3, 3, 3, 1, 2, 2, 2, 3, 1, 1, 2, 2, 2, 1, 3, 3, 3, 3, 3, 2, 3, 2, 2, 2, 2, 3, 1, 1, 1, 3, 2, 3, 1, 1 };
    int[] found = { 2, 1, 3 };
    int K = 27;
    assertEquals(108042049980382L, excavations2.count(kind, found, K));
  }

  @Test
  public void case48() {
    int[] kind = { 2, 3, 3, 3, 2, 5, 1, 4, 1, 3, 4, 4, 1, 1, 5, 4, 2, 2, 3, 4, 4, 4, 2, 5, 4, 2, 4, 3, 5, 3, 3, 3, 5, 2, 2, 1, 1, 2, 4, 3, 3, 4, 2, 2, 3, 4, 3, 5, 4, 4 };
    int[] found = { 4, 5, 2, 3, 1 };
    int K = 28;
    assertEquals(87915028151056L, excavations2.count(kind, found, K));
  }

  @Test
  public void case49() {
    int[] kind = { 35, 18, 6, 11, 33, 49, 47, 20, 45, 41, 29, 50, 10, 12, 40, 36, 44, 26, 30, 2, 46, 16, 14, 4, 17, 19, 24, 22, 39, 25, 48, 28, 38, 32, 37, 43, 15, 13, 1, 5, 31, 34, 3, 21, 42, 7, 27, 9, 8, 23 };
    int[] found = { 47, 7, 27, 1, 45, 12, 4, 35, 31, 36, 24 };
    int K = 11;
    assertEquals(1L, excavations2.count(kind, found, K));
  }

  @Test
  public void case50() {
    int[] kind = { 50, 50, 50, 49, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int[] found = { 50 };
    int K = 21;
    assertEquals(2319959400L, excavations2.count(kind, found, K));
  }

  @Test
  public void case51() {
    int[] kind = { 1, 2, 2, 1 };
    int[] found = { 1, 2 };
    int K = 2;
    assertEquals(4L, excavations2.count(kind, found, K));
  }

  @Test
  public void case52() {
    int[] kind = { 1, 2, 2, 1 };
    int[] found = { 1 };
    int K = 2;
    assertEquals(1L, excavations2.count(kind, found, K));
  }

  @Test
  public void case53() {
    int[] kind = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int[] found = { 50 };
    int K = 21;
    assertEquals(5567902560L, excavations2.count(kind, found, K));
  }

  @Test
  public void case54() {
    int[] kind = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17 };
    int[] found = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
    int K = 40;
    assertEquals(8924377176L, excavations2.count(kind, found, K));
  }

  @Test
  public void case55() {
    int[] kind = { 1, 2, 1, 1, 2, 3, 4, 3, 2, 2 };
    int[] found = { 4, 2 };
    int K = 3;
    assertEquals(6L, excavations2.count(kind, found, K));
  }

  @Test
  public void case56() {
    int[] kind = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    int[] found = { 1, 2, 3 };
    int K = 29;
    assertEquals(11541847881600L, excavations2.count(kind, found, K));
  }

  @Test
  public void case57() {
    int[] kind = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] found = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int K = 30;
    assertEquals(43718643756250L, excavations2.count(kind, found, K));
  }

}
