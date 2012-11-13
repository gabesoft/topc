package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class TheProductTest {
  TheProduct theproduct = new TheProduct();

  @Test
  public void case1() {
    int[] numbers = { 7, 4, 7 };
    int k = 2;
    int maxDist = 1;
    assertEquals(28L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case2() {
    int[] numbers = { 7, 4, 7 };
    int k = 2;
    int maxDist = 50;
    assertEquals(49L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case3() {
    int[] numbers = { -3, -5, -8, -9, -1, -2 };
    int k = 3;
    int maxDist = 3;
    assertEquals(-10L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case4() {
    int[] numbers = { 3, 0, -2, 10, 0, 0, 3, -8, 0, 2 };
    int k = 2;
    int maxDist = 2;
    assertEquals(0L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case5() {
    int[] numbers = { 27, 42, 1, 31, -23, 19, 25, -32, 46, -3, -46, 5, -26, 45, 8, -48, -15, -20, 43, 15, 39, -50, 29, 25, -14, -1, -43, 21, 38, 32, -23, 9, 49, 9, -7, 49, 20, -19, 47, -33, 1, 18, 23, -46, 5, -28, 5, 47 };
    int k = 1;
    int maxDist = 7;
    assertEquals(49L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case6() {
    int[] numbers = { 12, -1, -26, 21, -24, 31, 13, 6, -9, -34, -44, 40, 10 };
    int k = 1;
    int maxDist = 13;
    assertEquals(40L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case7() {
    int[] numbers = { 12, -14, -12, 37, -25, -8, -16, -10, 36, 24, 0, -33, 9, -28, 48, 13, 44, -8, -44, 28, -37, 49, 50, -34, 45, 41, -8, -42, 3, -7, 11 };
    int k = 8;
    int maxDist = 10;
    assertEquals(17642427264000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case8() {
    int[] numbers = { -33, -12, 45, -43, 10, 13, 48, -36, 38, -38, -50, -5, -10, -30, 19, 17, -21, -16, 27, 17, -49, -17, -44, 39, -12, 33, 1, -34, 28, -23, -13, 20, 11, -1, 37, 36 };
    int k = 1;
    int maxDist = 15;
    assertEquals(48L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case9() {
    int[] numbers = { 1, 27, 48, -9, -49, -35, 11, 37, 7, 7, -50, -38, -34, -2, -50, 46, -41, 24, 6 };
    int k = 10;
    int maxDist = 16;
    assertEquals(14734525125600000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case10() {
    int[] numbers = { 7, -15, 31, 49, -44, 35, 44, -47, -23, 15, -11, 10, -21, 10, -13, 0, -20, -36, 22, -13, -39, -39, -31, -13, -27, -43, -6, 40, 5, -47, 35, -8, 24, -31, -24, -1 };
    int k = 3;
    int maxDist = 31;
    assertEquals(108241L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case11() {
    int[] numbers = { -14, -37, 26, -11, 4, 50, 9, -16, -50, -25, 15, 13, 19, 45, 5, -35, 30, 38, -15, 29, 34, 17, -20, -36, 7, -32, 26, 8, -22, 29, 18, -42, -29, 24, 35 };
    int k = 1;
    int maxDist = 11;
    assertEquals(50L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case12() {
    int[] numbers = { -41, -23, 30, -41, 22, 5, -50, 33, 18, 12, -45, 43, -35, -45, -31, 28, 50, 33, 25, 32, 43, -10, -50, -23, 16, -3, 9 };
    int k = 3;
    int maxDist = 6;
    assertEquals(112500L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case13() {
    int[] numbers = { 29 };
    int k = 1;
    int maxDist = 13;
    assertEquals(29L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case14() {
    int[] numbers = { -11, 16, -6, -10, -42, -30, -28, 36, -48, -39, 39, 33, -11, -35, 49, -9, 3, -47, -47, 41, -10, 32, 38, -27, 35, -46, 31, 27, 29, 8, 11, 49, 29, 48, 24, -12, 46, -21, -37, -24, 33, -41, 49, -36, 11 };
    int k = 1;
    int maxDist = 1;
    assertEquals(49L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case15() {
    int[] numbers = { 40, 48, -43, 32, -49, 4, -13, -38, -8, -40, -37, -14, -4, -37, 9, 26, -34, -39, -4, 30, -14 };
    int k = 1;
    int maxDist = 31;
    assertEquals(48L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case16() {
    int[] numbers = { -2, -33, -1, -23, -48, -9, -29, -44 };
    int k = 1;
    int maxDist = 7;
    assertEquals(-1L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case17() {
    int[] numbers = { -43, -50, -23, -38, -33, -50, -41 };
    int k = 5;
    int maxDist = 7;
    assertEquals(-50848446L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case18() {
    int[] numbers = { -33, -7, -26, -41, -50, -40, -12 };
    int k = 3;
    int maxDist = 2;
    assertEquals(-6006L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case19() {
    int[] numbers = { -4 };
    int k = 1;
    int maxDist = 1;
    assertEquals(-4L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case20() {
    int[] numbers = { -5 };
    int k = 1;
    int maxDist = 1;
    assertEquals(-5L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case21() {
    int[] numbers = { -44, -3, -12, -14, -6, -45, -17, -50, -8, -2, -32, -17, -5, -28, -42, -44, -14, -14, -29, -41, -16, -17, -18, -15, -17 };
    int k = 8;
    int maxDist = 7;
    assertEquals(6960957696000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case22() {
    int[] numbers = { 48, 17, 49, 27, 2, 41, 21, 6, 0, 1, 21, 7, 0, 27, 12, 17, 0, 9, 6, 9, 42, 17, 43, 24, 9, 0, 10, 38, 30, 18, 17, 46, 6, 15, 8, 45, 27, 48, 3, 6, 47, 38, 36, 44, 5, 33, 0, 42 };
    int k = 1;
    int maxDist = 7;
    assertEquals(49L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case23() {
    int[] numbers = { 45, 22, 8, 6, 36, 36, 21, 9, 34, 33, 32, 35, 33, 49, 3, 9, 35, 15, 19, 17, 6, 23, 17, 36, 15, 15, 2, 33, 3, 48, 22, 5, 11, 0, 30, 30, 33, 20, 0, 6, 23, 5, 33 };
    int k = 1;
    int maxDist = 2;
    assertEquals(49L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case24() {
    int[] numbers = { 34, 24, 16, 14, 9, 35, 39, 47, 0, 39, 48, 17, 12, 21, 12, 1, 1, 46, 36, 25, 49, 17, 40, 9, 45, 33, 3, 9, 50, 28, 0, 33, 42, 6, 32, 21, 47, 1, 40, 21, 0, 36, 6, 10, 17, 19, 48, 20 };
    int k = 3;
    int maxDist = 1;
    assertEquals(64155L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case25() {
    int[] numbers = { 48, 41, 17, 23, 24, 15, 27, 13, 34, 16, 18, 8, 18, 5, 2, 24, 45, 32, 19, 47, 36, 24, 13, 42, 43, 0, 31, 21, 46, 24, 44, 25, 6, 21, 18, 39, 0, 35, 22, 5, 27, 8, 20, 15, 0, 18, 20 };
    int k = 2;
    int maxDist = 7;
    assertEquals(2115L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case26() {
    int[] numbers = { 5, 4, 27, 26, 50, 33, 22, 41, 15, 30, 24, 15, 20, 40, 11, 7, 0, 20, 32, 23, 13, 19, 19, 0, 17, 44, 8, 41, 0, 17, 39, 41, 39, 39, 17, 17, 39, 33, 12, 28, 21, 30, 39, 38, 20, 17, 39, 14, 14, 22 };
    int k = 3;
    int maxDist = 1;
    assertEquals(62361L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case27() {
    int[] numbers = { 27, 42, 1, 31, -23, 19, 25, -32, 46, -3, -46, 5, -26, 45, 8, -48, -15, -20, 43, 15, 39, -50, 29, 25, -14, -1, -43, 21, 38, 32, -23, 9, 49, 9, -7, 49, 20, -19, 47, -33, 1, 18, 23, -46, 5, -28, 5, 47, 0, -15 };
    int k = 3;
    int maxDist = 1;
    assertEquals(29469L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case28() {
    int[] numbers = { -26, 21, -24, 31, 13, 6, -9, -34, -44, 40, 10, 40, -42, -32, 12, -14, -12, 37, -25, -8, -16, -10, 36, 24, 0, -33, 9, -28, 48, 13, 44, -8, -44, 28, -37, 49, 50, -34, 45, 41, -8, -42, 3, -7, 11 };
    int k = 1;
    int maxDist = 2;
    assertEquals(50L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case29() {
    int[] numbers = { -33, -12, 45, -43, 10, 13, 48, -36, 38, -38, -50, -5, -10, -30, 19, 17, -21, -16, 27, 17, -49, -17, -44, 39, -12, 33, 1, -34, 28, -23, -13, 20, 11, -1, 37, 36, -31, 4, -8, 1, 27, 48, -9, -49 };
    int k = 2;
    int maxDist = 1;
    assertEquals(1900L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case30() {
    int[] numbers = { 7, 7, -50, -38, -34, -2, -50, 46, -41, 24, 6, -38, -49, 24, 7, -15, 31, 49, -44, 35, 44, -47, -23, 15, -11, 10, -21, 10, -13, 0, -20, -36, 22, -13, -39, -39, -31, -13, -27, -43, -6, 40, 5, -47, 35, -8, 24, -31, -24, -1 };
    int k = 6;
    int maxDist = 1;
    assertEquals(4837589680L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case31() {
    int[] numbers = { -14, -37, 26, -11, 4, 50, 9, -16, -50, -25, 15, 13, 19, 45, 5, -35, 30, 38, -15, 29, 34, 17, -20, -36, 7, -32, 26, 8, -22, 29, 18, -42, -29, 24, 35, 42, 18, -19, -41, -23, 30, -41, 22, 5, -50, 33, 18, 12, -45, 43 };
    int k = 1;
    int maxDist = 1;
    assertEquals(50L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case32() {
    int[] numbers = { 28, 50, 33, 25, 32, 43, -10, -50, -23, 16, -3, 9, -31, -49, -13, 29, 10, 36, -37, -11, 16, -6, -10, -42, -30, -28, 36, -48, -39, 39, 33, -11, -35, 49, -9, 3, -47, -47, 41, -10, 32, 38, -27, 35, -46, 31, 27 };
    int k = 6;
    int maxDist = 1;
    assertEquals(2207761920L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case33() {
    int[] numbers = { 49, 29, 48, 24, -12, 46, -21, -37, -24, 33, -41, 49, -36, 11, 3, -41, 15, 40, 48, -43, 32, -49, 4, -13, -38, -8, -40, -37, -14, -4, -37, 9, 26, -34, -39, -4, 30, -14, 0, 6, -7, -7, 32, -31 };
    int k = 4;
    int maxDist = 1;
    assertEquals(3236352L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case34() {
    int[] numbers = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int k = 10;
    int maxDist = 50;
    assertEquals(97656250000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case35() {
    int[] numbers = { -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50 };
    int k = 10;
    int maxDist = 50;
    assertEquals(97656250000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case36() {
    int[] numbers = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int k = 10;
    int maxDist = 50;
    assertEquals(0L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case37() {
    int[] numbers = { -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50 };
    int k = 9;
    int maxDist = 50;
    assertEquals(-1953125000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case38() {
    int[] numbers = { -26, -32, -25, -13, -49, -10, -28, -36, -44, -6, -14, -40, -28, -2, -22, -17, -10, -17, -24, -28, -49, -46, -32, -16, -17, -7, -38, -40, -20, -22, -20, -28, -20, -40, -50, -44, -36, -33, -14, -10, -34, -2, -34, -2, -44, -24, -11, -5, -38, -30 };
    int k = 9;
    int maxDist = 2;
    assertEquals(-731808000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case39() {
    int[] numbers = { -22, -20, -29, -36, -10, -4, -15, -30, -38, -50, -16, -20, -13, -41, -41, -1, -45, -28, -2, -38, -20, -16, -50, -40, -10, -12, -16, -5, -50, -24, -20, -34, -48, -38, -46, -3, -16, -50, -41, -46, -16, -3, -30, -18, -6, -15, -50, -36, -6, -8 };
    int k = 9;
    int maxDist = 1;
    assertEquals(-12597120000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case40() {
    int[] numbers = { -1, -49, -8, -50, -6, -20, -12, -28, -37, -16, -4, -48, -20, -22, -30, -34, -32, -40, -12, -18, -25, -2, -46, -12, -28, -21, -18, -12, -50, -50, -43, -32, -11, -35, -30, -30, -12, -31, -26, -24, -31, -46, -44, -25, -34, -8, -50, -46, -3, -16 };
    int k = 9;
    int maxDist = 1;
    assertEquals(-29240064000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case41() {
    int[] numbers = { -15, -48, -20, -34, -30, -36, -14, -32, -35, -45, -4, -10, -22, -32, -28, -36, -38, -31, -50, -32, -4, -12, -28, -10, -45, -32, -22, -26, -15, -22, -50, -22, -14, -34, -2, -40, -11, -14, -40, -16, -30, -40, -49, -2, -25, -18, -44, -9, -4, -35 };
    int k = 9;
    int maxDist = 5;
    assertEquals(-19353600L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case42() {
    int[] numbers = { -50, -30, -38, -50, -45, -40, -18, -50, -40, -20, -25, -6, -34, -14, -46, -16, -48, -12, -50, -40, -30, -50, -48, -6, -24, -48, -45, -2, -25, -38, -40, -26, -42, -43, -25, -10, -18, -20, -19, -33, -40, -40, -6, -10, -2, -50, -26, -45, -50, -38 };
    int k = 9;
    int maxDist = 3;
    assertEquals(-2275257600L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case43() {
    int[] numbers = { 27, 42, 1, 31, -23, 19, 25, -32, 46, -3, -46, 5, -26, 45, 8, -48, -15, -20, 43, 15, 39, -50, 29, 25, -14, -1, -43, 21, 38, 32, -23, 9, 49, 9, -7, 49, 20, -19, 47, -33, 1, 18, 23, -46, 5, -28, 5, 47 };
    int k = 9;
    int maxDist = 1;
    assertEquals(13130910000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case44() {
    int[] numbers = { 12, -1, -26, 21, -24, 31, 13, 6, -9, -34, -44, 40, 10 };
    int k = 9;
    int maxDist = 1;
    assertEquals(656327992320L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case45() {
    int[] numbers = { 12, -14, -12, 37, -25, -8, -16, -10, 36, 24, 0, -33, 9, -28, 48, 13, 44, -8, -44, 28, -37, 49, 50, -34, 45, 41, -8, -42, 3, -7, 11 };
    int k = 10;
    int maxDist = 1;
    assertEquals(2466019277568000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case46() {
    int[] numbers = { -33, -12, 45, -43, 10, 13, 48, -36, 38, -38, -50, -5, -10, -30, 19, 17, -21, -16, 27, 17, -49, -17, -44, 39, -12, 33, 1, -34, 28, -23, -13, 20, 11, -1, 37, 36 };
    int k = 9;
    int maxDist = 1;
    assertEquals(31383780480000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case47() {
    int[] numbers = { 1, 27, 48, -9, -49, -35, 11, 37, 7, 7, -50, -38, -34, -2, -50, 46, -41, 24, 6 };
    int k = 10;
    int maxDist = 1;
    assertEquals(22088794280000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case48() {
    int[] numbers = { 7, 4, 7 };
    int k = 2;
    int maxDist = 1;
    assertEquals(28L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case49() {
    int[] numbers = { 3, 0, -2, 10, 0, 0, 3, -8, 0, 2 };
    int k = 3;
    int maxDist = 6;
    assertEquals(160L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case50() {
    int[] numbers = { -41, -5, -10, -31, -44, -16, -3, -33, -34, -35, -44, -44, -25, -48, -16, -32, -37, -8, -33, -30, -6, -18, -26, -37, -40, -30, -50, -32, -5, -41, -32, -12, -33, -22, -14, -34, -1, -41, -45, -8, -39, -27, -23, -45, -10, -50, -34 };
    int k = 6;
    int maxDist = 3;
    assertEquals(5504557500L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case51() {
    int[] numbers = { 7, 4, 7, 3, 2, 4, 5, 4, 7, 2, 3, 2, -3 };
    int k = 2;
    int maxDist = 50;
    assertEquals(49L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case52() {
    int[] numbers = { -1, -1, -1, -1 };
    int k = 4;
    int maxDist = 4;
    assertEquals(1L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case53() {
    int[] numbers = { -50, -40, -30, -20, -10, -5, 0, 4, 6, 9, 13, 17, 19, 27, 29, 31, 45, 50, 12, 13, -50, -40, -30, -20, -10, -5, 0, 4, 6, 9, 13, 17, 19, 27, 29, 31, 45, 50, 12, 13, -50, -40, -30, -20, -10, -5, 0, 4, 6, 9 };
    int k = 10;
    int maxDist = 50;
    assertEquals(40500000000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case54() {
    int[] numbers = { -3, -5, -8, -9, -1, -2 };
    int k = 3;
    int maxDist = 3;
    assertEquals(-10L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case55() {
    int[] numbers = { 3, 0, -2, 10, 0, 0, 3, -8, 0, 2 };
    int k = 2;
    int maxDist = 2;
    assertEquals(0L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case56() {
    int[] numbers = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int k = 10;
    int maxDist = 5;
    assertEquals(97656250000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case57() {
    int[] numbers = { -18, -18, 4, -38, 2, 6, -42, -20, -6, 44, -6, -11, 15, -31, 1, 41, -49, -45, 39, -16, -25, 8, -30, 1, -12, 15, -20, -43, -30, -40, 1, -32, -7, 21, 47, 11, -24, -45, 7, 20, 15, -50, 25, -21, 36 };
    int k = 10;
    int maxDist = 3;
    assertEquals(3143059200000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case58() {
    int[] numbers = { -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50 };
    int k = 10;
    int maxDist = 50;
    assertEquals(97656250000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case59() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int k = 10;
    int maxDist = 50;
    assertEquals(29820834418636800L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case60() {
    int[] numbers = { 5 };
    int k = 1;
    int maxDist = 10;
    assertEquals(5L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case61() {
    int[] numbers = { -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50 };
    int k = 9;
    int maxDist = 50;
    assertEquals(-1953125000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case62() {
    int[] numbers = { 3, 0, -2, 10, 0, 0, 3, -8, 0, 2, 3, 0, -2, 10, 0, 0, 3, -8, 0, 2, 3, 0, -2, 10, 0, 0, 3, -8, 0, 2, 3, 0, -2, 10, 0, 0, 3, -8, 0, 2, 3, 0, -2, 10, 0, 0, 3, -8, 0, 2 };
    int k = 10;
    int maxDist = 50;
    assertEquals(1228800000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case63() {
    int[] numbers = { 2, 2, 2, 3, 4, 50, 33, 4, 5, 9, 8, 7 };
    int k = 3;
    int maxDist = 2;
    assertEquals(8250L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case64() {
    int[] numbers = { -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50 };
    int k = 9;
    int maxDist = 12;
    assertEquals(-1953125000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case65() {
    int[] numbers = { -50, 50, 50, -50, 50, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 50, 50, 50, 50, 20, 20, 20, 20, 20, 20, 30, 30, 30, 1, 2, 3, 4, 5, 6, 7, 8, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 40, 41, 42, 43 };
    int k = 10;
    int maxDist = 2;
    assertEquals(1350000000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case66() {
    int[] numbers = { 34, -10, 16, 25, -32, -14, -42, 37, 12, -30, -5, -31, 31, -9, 26, 17, -20, -46, 46, 37, -1, -8, -21, -26, 32, 28, -42, -1, 28, 38, 26, 39, -20, 12, -30, -2, 45, -43, -38, 43, 35, 36, -5, -50, 27, 3, 32, 21, 33, -31 };
    int k = 10;
    int maxDist = 30;
    assertEquals(23013457812072000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case67() {
    int[] numbers = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int k = 10;
    int maxDist = 50;
    assertEquals(1L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case68() {
    int[] numbers = { -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50 };
    int k = 9;
    int maxDist = 5;
    assertEquals(-1953125000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case69() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, 26, 4, 3, 12, 3 };
    int k = 10;
    int maxDist = 50;
    assertEquals(23936552640000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case70() {
    int[] numbers = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int k = 10;
    int maxDist = 10;
    assertEquals(97656250000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case71() {
    int[] numbers = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 5, 50 };
    int k = 10;
    int maxDist = 10;
    assertEquals(97656250000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case72() {
    int[] numbers = { 10, 2, 3, 10 };
    int k = 2;
    int maxDist = 3;
    assertEquals(100L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case73() {
    int[] numbers = { 1, 2, 3, 4 };
    int k = 4;
    int maxDist = 2;
    assertEquals(24L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case74() {
    int[] numbers = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int k = 10;
    int maxDist = 50;
    assertEquals(97656250000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case75() {
    int[] numbers = { -50, -50, -50, -50, -50, -50, -50, -50, -50 };
    int k = 9;
    int maxDist = 10;
    assertEquals(-1953125000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case76() {
    int[] numbers = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int k = 10;
    int maxDist = 50;
    assertEquals(97656250000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case77() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, -1, -2, -3, -4, -5, -6, -7, -8, -8, -9, -10, 11, 12, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 50, 49, 38, 47 };
    int k = 10;
    int maxDist = 50;
    assertEquals(10278906811992000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case78() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int k = 10;
    int maxDist = 50;
    assertEquals(37276043023296000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case79() {
    int[] numbers = { -5, -10, -5, -10 };
    int k = 2;
    int maxDist = 2;
    assertEquals(100L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case80() {
    int[] numbers = { 3, 0, -2, 10, 0, 0, 3, -8, 0, 2, 9, -50, -49, -48, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, -49, 50 };
    int k = 10;
    int maxDist = 50;
    assertEquals(81420679895522450L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case81() {
    int[] numbers = { -50, -50, -50, -50, -50, -50, -50, -50, -50, -50 };
    int k = 9;
    int maxDist = 1;
    assertEquals(-1953125000000000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case82() {
    int[] numbers = { -3, -5, -9, -1, -2, 49 };
    int k = 5;
    int maxDist = 3;
    assertEquals(13230L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case83() {
    int[] numbers = { 50, 49, 48, 47, 46, 45, 44, 43, 42, -41, 50, 49, 48, 47, 46, 45, 44, 43, 42, -41, 50, 49, 48, 47, 46, 45, 44, 43, 42, -41, 50, 49, 48, 47, 46, 45, 44, 43, 42, -41, 50, 49, 48, 47, 46, 45, 44, 43, 42, -41 };
    int k = 10;
    int maxDist = 50;
    assertEquals(88273515312500000L, theproduct.maxProduct(numbers, k, maxDist));
  }

  @Test
  public void case84() {
    int[] numbers = { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -43, -23, -24, -12, -15 };
    int k = 9;
    int maxDist = 3;
    assertEquals(-362880L, theproduct.maxProduct(numbers, k, maxDist));
  }

}
