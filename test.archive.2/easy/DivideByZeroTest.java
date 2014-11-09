package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class DivideByZeroTest {
  DivideByZero dividebyzero = new DivideByZero();

  @Test
  public void case1() {
    int[] numbers = { 9, 2 };
    assertEquals(3, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case2() {
    int[] numbers = { 8, 2 };
    assertEquals(3, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case3() {
    int[] numbers = { 50 };
    assertEquals(1, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case4() {
    int[] numbers = { 1, 5, 8, 30, 15, 4 };
    assertEquals(11, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case5() {
    int[] numbers = { 1, 2, 4, 8, 16, 32, 64 };
    assertEquals(7, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case6() {
    int[] numbers = { 6, 2, 18 };
    assertEquals(7, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case7() {
    int[] numbers = { 95, 17, 7, 86, 31, 11, 74, 45, 79, 36 };
    assertEquals(35, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case8() {
    int[] numbers = { 34, 73, 62, 13, 88, 44, 25, 46, 48, 1 };
    assertEquals(33, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case9() {
    int[] numbers = { 3, 39, 18, 20, 78, 21, 72, 49, 33, 94 };
    assertEquals(32, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case10() {
    int[] numbers = { 35, 64, 32, 79, 33, 95, 30, 40, 8, 77 };
    assertEquals(35, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case11() {
    int[] numbers = { 1, 3, 34, 79, 64, 82, 18, 23, 95, 50 };
    assertEquals(35, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case12() {
    int[] numbers = { 69, 80, 81, 17, 45, 24, 92, 85, 66, 15, 58, 18, 56, 5, 72, 77, 39, 91, 35, 16 };
    assertEquals(51, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case13() {
    int[] numbers = { 31, 37, 77, 40, 26, 7, 41, 73, 97, 54, 2, 61, 88, 24, 17, 84, 89, 30, 72, 12 };
    assertEquals(48, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case14() {
    int[] numbers = { 81, 37, 67, 46, 79, 73, 9, 82, 95, 29, 90, 4, 16, 84, 39, 41, 21, 47, 92, 24 };
    assertEquals(48, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case15() {
    int[] numbers = { 93, 37, 77, 96, 7, 59, 8, 90, 45, 91, 44, 58, 40, 74, 47, 35, 88, 99, 92, 66 };
    assertEquals(51, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case16() {
    int[] numbers = { 44, 23, 66, 98, 26, 60, 61, 96, 53, 86, 27, 59, 4, 83, 89, 41, 19, 88, 6, 65 };
    assertEquals(47, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case17() {
    int[] numbers = { 74, 57, 82, 75, 21, 30, 22, 89, 27, 4, 98, 7, 20, 85, 56, 10, 70, 29, 84, 2 };
    assertEquals(46, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case18() {
    int[] numbers = { 98, 71, 91, 59, 7, 20, 21, 10, 49, 90, 14, 28, 48, 58, 86, 44, 38, 37, 5, 40 };
    assertEquals(44, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case19() {
    int[] numbers = { 30, 38, 62, 4, 51, 89, 49, 3, 14, 39, 99, 9, 72, 86, 69, 70, 67, 36, 54, 40 };
    assertEquals(50, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case20() {
    int[] numbers = { 17, 86, 83, 18, 97, 29, 41, 34, 8, 6, 59, 16, 27, 74, 91, 28, 89, 56, 1, 30 };
    assertEquals(43, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case21() {
    int[] numbers = { 27, 43, 46, 1, 77, 42, 22, 84, 83, 61, 99, 44, 36, 69, 92, 70, 10, 9, 20, 80 };
    assertEquals(50, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case22() {
    int[] numbers = { 23, 77, 7, 36, 54 };
    assertEquals(23, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case23() {
    int[] numbers = { 85, 65, 45, 69, 52 };
    assertEquals(6, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case24() {
    int[] numbers = { 2, 22, 23, 28, 6 };
    assertEquals(13, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case25() {
    int[] numbers = { 44, 90, 38, 1, 56 };
    assertEquals(24, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case26() {
    int[] numbers = { 1, 74, 12, 35, 76 };
    assertEquals(24, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case27() {
    int[] numbers = { 14, 4, 88, 22, 20 };
    assertEquals(19, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case28() {
    int[] numbers = { 35, 26, 93, 23, 19 };
    assertEquals(22, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case29() {
    int[] numbers = { 10, 70, 94, 18, 15 };
    assertEquals(22, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case30() {
    int[] numbers = { 41, 34, 3, 24, 78 };
    assertEquals(23, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case31() {
    int[] numbers = { 36, 16, 75, 14, 58 };
    assertEquals(23, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case32() {
    int[] numbers = { 61, 86, 4, 80, 37, 21, 45, 51, 36, 72, 28, 35, 15, 30, 88, 9, 3, 41, 97, 19, 98, 2, 46, 34, 85, 16, 64, 57, 58, 83, 91, 93, 74, 62, 71, 76, 40, 39, 53, 1, 68, 81, 77, 24, 87, 14, 42, 5, 13, 38 };
    assertEquals(71, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case33() {
    int[] numbers = { 81, 25, 86, 29, 51, 9, 67, 63, 99, 71, 75, 15, 39, 22, 95, 96, 47, 62, 45, 37, 12, 26, 42, 18, 33, 92, 41, 85, 84, 50, 54, 27, 60, 69, 100, 44, 16, 43, 74, 94, 2, 48, 65, 91, 68, 24, 97, 82, 93, 32 };
    assertEquals(74, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case34() {
    int[] numbers = { 3, 26, 35, 51, 61, 42, 96, 17, 21, 12, 9, 73, 75, 13, 44, 37, 100, 50, 15, 89, 88, 65, 1, 41, 76, 43, 20, 48, 8, 47, 74, 4, 49, 86, 27, 23, 98, 16, 83, 39, 72, 6, 28, 93, 5, 34, 56, 87, 71, 11 };
    assertEquals(67, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case35() {
    int[] numbers = { 87, 79, 26, 43, 37, 51, 23, 58, 67, 99, 44, 9, 38, 64, 50, 63, 1, 41, 15, 24, 28, 49, 69, 12, 97, 53, 42, 75, 11, 22, 93, 35, 34, 39, 33, 10, 89, 30, 3, 74, 45, 85, 73, 20, 83, 92, 7, 95, 47, 57 };
    assertEquals(70, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case36() {
    int[] numbers = { 99, 65, 75, 1, 57, 73, 15, 30, 87, 70, 51, 61, 66, 4, 78, 35, 44, 27, 18, 89, 60, 10, 74, 26, 90, 85, 14, 48, 22, 11, 88, 62, 93, 13, 53, 72, 9, 96, 46, 55, 54, 2, 82, 77, 94, 84, 38, 29, 43, 52 };
    assertEquals(76, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case37() {
    int[] numbers = { 1, 47, 74, 5, 3, 72, 62, 82, 59, 46, 56, 26, 96, 69, 80, 94, 6, 11, 8, 60, 19, 20, 88, 65, 31, 15, 25, 53, 68, 87, 84, 70, 42, 40, 57, 95, 35, 83, 86, 30, 63, 71, 16, 29, 91, 22, 76, 27, 52, 38 };
    assertEquals(73, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case38() {
    int[] numbers = { 33, 53, 76, 20, 59, 74, 80, 58, 85, 89, 98, 41, 32, 93, 13, 72, 24, 56, 86, 70, 25, 38, 21, 42, 28, 45, 100, 27, 63, 26, 82, 16, 34, 96, 36, 4, 40, 46, 19, 44, 31, 84, 43, 54, 94, 66, 14, 12, 67, 92 };
    assertEquals(73, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case39() {
    int[] numbers = { 46, 58, 96, 93, 24, 21, 78, 51, 18, 10, 54, 5, 90, 69, 55, 7, 68, 76, 63, 79, 25, 85, 50, 3, 47, 71, 6, 87, 1, 82, 59, 42, 41, 29, 70, 77, 61, 100, 56, 67, 97, 19, 53, 26, 44, 95, 49, 84, 65, 11 };
    assertEquals(76, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case40() {
    int[] numbers = { 32, 41, 39, 33, 26, 43, 36, 7, 65, 83, 97, 58, 72, 17, 80, 14, 91, 23, 50, 84, 47, 29, 92, 19, 25, 77, 5, 3, 42, 44, 27, 94, 86, 16, 49, 45, 68, 6, 55, 56, 67, 62, 9, 63, 93, 59, 74, 64, 11, 54 };
    assertEquals(72, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case41() {
    int[] numbers = { 12, 95, 55, 5, 7, 2, 54, 77, 97, 69, 58, 6, 19, 61, 31, 40, 45, 25, 72, 82, 64, 38, 36, 89, 32, 20, 14, 39, 44, 17, 8, 37, 29, 93, 1, 62, 51, 99, 92, 52, 23, 9, 10, 18, 15, 50, 75, 80, 70, 94 };
    assertEquals(69, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case42() {
    int[] numbers = { 94, 57, 33, 34, 85, 78, 74, 39, 45, 62, 14, 65, 41, 59, 42, 46, 32, 68, 97, 5, 55, 15, 28, 13, 73, 89, 4, 72, 93, 50, 82, 40, 19, 69, 35, 56, 10, 9, 95, 37, 1, 24, 38, 36, 2, 87, 20, 84, 77, 22, 91, 71, 48, 8, 23, 75, 49, 12, 70, 92, 31, 18, 88, 6, 96, 64, 26, 44, 3, 60, 47, 63, 66, 25, 43, 53, 81, 99, 86, 52, 90, 30, 67, 61, 76, 80, 27, 54, 29, 7, 98, 17, 11, 100, 51, 79, 21, 16, 58, 83 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case43() {
    int[] numbers = { 73, 14, 70, 96, 22, 69, 5, 17, 77, 1, 76, 19, 93, 78, 62, 82, 39, 32, 40, 86, 80, 83, 11, 43, 24, 63, 61, 49, 21, 68, 57, 56, 42, 31, 38, 25, 72, 66, 2, 6, 81, 23, 13, 67, 88, 52, 28, 37, 59, 29, 12, 95, 79, 7, 10, 35, 4, 98, 34, 54, 92, 26, 46, 51, 99, 53, 85, 36, 100, 60, 15, 9, 48, 97, 33, 84, 50, 30, 74, 47, 90, 18, 89, 64, 65, 75, 94, 8, 87, 27, 20, 58, 91, 3, 55, 16, 45, 44, 71, 41 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case44() {
    int[] numbers = { 64, 86, 15, 73, 29, 22, 24, 58, 65, 37, 11, 98, 2, 50, 71, 3, 56, 52, 74, 57, 93, 34, 18, 67, 1, 87, 12, 100, 53, 89, 4, 51, 92, 61, 76, 78, 14, 95, 9, 33, 38, 68, 91, 70, 62, 77, 82, 79, 96, 42, 7, 97, 10, 25, 16, 35, 8, 20, 55, 27, 99, 32, 36, 19, 21, 48, 84, 63, 31, 49, 5, 43, 83, 44, 88, 59, 26, 13, 81, 80, 72, 69, 23, 90, 47, 40, 54, 6, 39, 85, 75, 60, 45, 30, 66, 41, 17, 28, 94, 46 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case45() {
    int[] numbers = { 51, 8, 73, 59, 57, 27, 95, 58, 74, 23, 67, 78, 85, 2, 98, 3, 44, 66, 55, 94, 10, 30, 31, 56, 45, 68, 20, 33, 46, 14, 72, 48, 25, 81, 41, 1, 11, 100, 37, 21, 99, 53, 64, 24, 71, 42, 18, 84, 91, 19, 6, 83, 86, 65, 50, 26, 87, 15, 38, 92, 76, 79, 22, 90, 4, 80, 34, 47, 75, 96, 9, 89, 61, 7, 16, 43, 88, 54, 60, 63, 29, 70, 5, 13, 32, 49, 97, 35, 17, 36, 69, 62, 77, 52, 82, 28, 93, 12, 40, 39 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case46() {
    int[] numbers = { 45, 1, 56, 10, 15, 4, 71, 54, 94, 65, 43, 63, 3, 79, 67, 28, 34, 38, 44, 98, 68, 24, 29, 6, 82, 72, 47, 78, 2, 21, 30, 81, 9, 31, 53, 12, 18, 55, 11, 17, 70, 13, 20, 69, 76, 74, 51, 41, 87, 32, 16, 77, 52, 39, 100, 99, 57, 27, 61, 19, 85, 96, 42, 36, 80, 5, 50, 66, 62, 83, 95, 35, 14, 33, 60, 92, 48, 64, 37, 23, 59, 86, 46, 25, 8, 58, 89, 75, 91, 84, 90, 22, 93, 26, 73, 40, 97, 88, 49, 7 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case47() {
    int[] numbers = { 55, 81, 39, 38, 27, 91, 80, 1, 19, 30, 28, 99, 61, 6, 92, 33, 52, 11, 79, 46, 23, 14, 42, 8, 34, 50, 5, 40, 16, 20, 70, 21, 9, 63, 49, 29, 37, 32, 62, 24, 98, 51, 25, 72, 45, 17, 26, 3, 73, 54, 58, 41, 84, 7, 82, 67, 85, 60, 36, 86, 96, 97, 75, 87, 88, 47, 77, 65, 59, 18, 44, 35, 31, 68, 93, 66, 74, 22, 83, 53, 2, 76, 56, 57, 94, 78, 69, 90, 15, 100, 64, 10, 89, 43, 71, 13, 95, 12, 48, 4 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case48() {
    int[] numbers = { 69, 44, 27, 29, 15, 45, 6, 74, 67, 3, 33, 87, 59, 30, 66, 84, 78, 95, 71, 10, 46, 60, 39, 1, 58, 23, 77, 47, 96, 8, 65, 61, 49, 97, 92, 93, 43, 81, 35, 16, 40, 38, 50, 14, 80, 83, 62, 9, 24, 91, 36, 79, 20, 5, 32, 2, 21, 57, 19, 12, 72, 13, 51, 85, 63, 73, 100, 7, 31, 17, 76, 52, 28, 94, 53, 56, 68, 99, 82, 54, 88, 70, 55, 42, 18, 25, 11, 64, 41, 98, 37, 26, 34, 22, 48, 75, 86, 90, 4, 89 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case49() {
    int[] numbers = { 45, 95, 22, 31, 55, 61, 79, 67, 76, 44, 4, 6, 64, 32, 91, 40, 49, 90, 58, 41, 82, 94, 52, 24, 59, 53, 87, 46, 63, 1, 12, 66, 93, 42, 89, 75, 97, 81, 72, 56, 29, 39, 92, 43, 78, 3, 2, 13, 27, 88, 15, 74, 85, 51, 80, 23, 50, 17, 26, 19, 48, 25, 37, 69, 100, 70, 36, 20, 9, 54, 11, 86, 35, 83, 18, 57, 62, 10, 16, 98, 38, 7, 77, 96, 28, 60, 47, 33, 65, 21, 99, 68, 34, 71, 84, 73, 5, 14, 30, 8 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case50() {
    int[] numbers = { 48, 10, 16, 9, 88, 40, 92, 81, 24, 64, 43, 76, 4, 26, 97, 50, 75, 85, 18, 19, 87, 69, 41, 96, 14, 3, 25, 29, 94, 100, 58, 32, 72, 22, 42, 60, 83, 65, 11, 28, 68, 63, 7, 71, 80, 47, 59, 2, 8, 67, 27, 61, 57, 31, 15, 36, 56, 17, 74, 90, 66, 20, 79, 39, 77, 30, 62, 13, 86, 73, 6, 34, 23, 54, 5, 93, 99, 84, 95, 89, 78, 21, 35, 49, 53, 98, 1, 91, 55, 12, 82, 45, 37, 44, 38, 70, 33, 51, 46, 52 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case51() {
    int[] numbers = { 52, 75, 39, 27, 85, 20, 56, 51, 21, 28, 29, 33, 9, 68, 48, 49, 8, 19, 2, 89, 73, 3, 64, 60, 69, 23, 41, 40, 34, 62, 99, 43, 95, 18, 90, 36, 79, 25, 32, 31, 5, 97, 71, 91, 72, 24, 67, 57, 35, 15, 7, 84, 13, 98, 87, 16, 58, 63, 82, 66, 55, 61, 93, 81, 53, 12, 17, 1, 78, 10, 4, 86, 14, 6, 80, 26, 30, 70, 42, 100, 96, 74, 92, 45, 50, 44, 46, 65, 38, 77, 83, 76, 47, 37, 94, 54, 22, 11, 88, 59 };
    assertEquals(100, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case52() {
    int[] numbers = { 33, 60, 51, 54, 35, 94, 91, 80, 70, 84, 7, 36, 25, 68, 5 };
    assertEquals(45, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case53() {
    int[] numbers = { 26, 7, 20, 10, 93, 54, 21, 49, 52, 2, 4, 34, 33, 12, 63 };
    assertEquals(32, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case54() {
    int[] numbers = { 51, 17, 95, 23, 35, 100, 18, 22, 61, 89, 46, 10, 1, 6, 64 };
    assertEquals(40, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case55() {
    int[] numbers = { 18, 100, 50, 66, 8, 27, 77, 13, 96, 26, 97, 70, 63, 2, 10 };
    assertEquals(41, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case56() {
    int[] numbers = { 57, 93, 81, 27, 77, 44, 69, 89, 36, 30, 51, 85, 16, 71, 68 };
    assertEquals(47, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case57() {
    int[] numbers = { 69, 34, 13, 95, 32, 11, 86, 31, 10, 56, 61, 22, 73, 78, 39 };
    assertEquals(41, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case58() {
    int[] numbers = { 68, 65, 38, 16, 76, 44, 35, 70, 82, 97, 48, 22, 84, 52, 29 };
    assertEquals(44, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case59() {
    int[] numbers = { 28, 46, 43, 95, 84, 48, 4, 12, 100, 22, 80, 88, 7, 29, 53 };
    assertEquals(43, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case60() {
    int[] numbers = { 93, 80, 62, 11, 25, 97, 7, 60, 58, 15, 84, 56, 70, 63, 100 };
    assertEquals(48, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case61() {
    int[] numbers = { 98, 40, 81, 90, 51, 48, 95, 52, 53, 29, 2, 11, 31, 56, 92 };
    assertEquals(46, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case62() {
    int[] numbers = { 78, 12, 96, 38, 24, 42, 26, 19, 65, 72 };
    assertEquals(31, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case63() {
    int[] numbers = { 5, 57, 1, 21, 63, 72, 28, 3, 37, 6 };
    assertEquals(25, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case64() {
    int[] numbers = { 33, 1, 89, 52, 81, 37, 88, 34, 23, 7 };
    assertEquals(32, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case65() {
    int[] numbers = { 58, 43, 27, 36, 80, 87, 69, 92, 26, 85 };
    assertEquals(39, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case66() {
    int[] numbers = { 11, 1, 33, 71, 32, 25, 45, 3, 95, 18 };
    assertEquals(30, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case67() {
    int[] numbers = { 89, 85, 54, 99, 25, 92, 10, 23, 80, 84 };
    assertEquals(43, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case68() {
    int[] numbers = { 82, 12, 72, 59, 55, 34, 13, 26, 58, 11 };
    assertEquals(31, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case69() {
    int[] numbers = { 5, 10, 75, 35, 50, 100, 54, 47, 42, 15 };
    assertEquals(32, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case70() {
    int[] numbers = { 60, 47, 3, 58, 13, 90, 84, 70, 98, 8 };
    assertEquals(39, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case71() {
    int[] numbers = { 2, 32, 16, 42, 14, 88, 24, 38, 96, 100 };
    assertEquals(33, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case72() {
    int[] numbers = { 40, 46, 93, 68, 69, 8 };
    assertEquals(25, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case73() {
    int[] numbers = { 6, 76, 20, 26, 33, 55 };
    assertEquals(25, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case74() {
    int[] numbers = { 83, 40, 16, 93, 49, 66 };
    assertEquals(30, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case75() {
    int[] numbers = { 79, 33, 15, 86, 38, 1 };
    assertEquals(27, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case76() {
    int[] numbers = { 66, 78, 29, 11, 15, 12 };
    assertEquals(23, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case77() {
    int[] numbers = { 86, 57, 36, 30, 16, 38 };
    assertEquals(26, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case78() {
    int[] numbers = { 29, 67, 56, 34, 72, 44 };
    assertEquals(28, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case79() {
    int[] numbers = { 26, 33, 53, 9, 39, 92 };
    assertEquals(25, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case80() {
    int[] numbers = { 50, 95, 42, 38, 100, 41 };
    assertEquals(30, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case81() {
    int[] numbers = { 14, 62, 48, 25, 96, 61 };
    assertEquals(26, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case82() {
    int[] numbers = { 11, 62, 35, 53, 26, 33, 80, 88, 86, 2, 100, 60, 68, 20, 5, 16, 32, 15, 92, 38 };
    assertEquals(48, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case83() {
    int[] numbers = { 81, 14, 17, 10, 40, 7, 72, 98, 26, 16, 68, 41, 42, 62, 49, 46, 33, 54, 77, 55 };
    assertEquals(46, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case84() {
    int[] numbers = { 61, 65, 12, 69, 97, 48, 78, 49, 47, 7, 70, 21, 99, 5, 51, 34, 76, 2, 82, 25 };
    assertEquals(46, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case85() {
    int[] numbers = { 20, 73, 100, 71, 65, 54, 62, 29, 7, 6, 74, 45, 12, 46, 98, 31, 43, 99, 56, 92 };
    assertEquals(51, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case86() {
    int[] numbers = { 96, 13, 27, 72, 43, 93, 76, 5, 57, 21, 84, 15, 64, 24, 51, 98, 73, 9, 37, 46 };
    assertEquals(45, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case87() {
    int[] numbers = { 36, 23, 94, 89, 50, 44, 19, 34, 72, 76, 95, 67, 21, 53, 96, 81, 65, 7, 93, 75 };
    assertEquals(53, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case88() {
    int[] numbers = { 12, 64, 31, 66, 61, 49, 97, 50, 6, 77, 81, 52, 51, 57, 68, 59, 22, 98, 34, 78 };
    assertEquals(51, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case89() {
    int[] numbers = { 16, 72, 49, 70, 82, 69, 41, 88, 20, 42, 50, 63, 1, 58, 32, 22, 29, 12, 48, 81 };
    assertEquals(47, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case90() {
    int[] numbers = { 35, 88, 43, 21, 79, 10, 22, 25, 29, 84, 24, 93, 19, 42, 33, 81, 41, 9, 60, 53 };
    assertEquals(47, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case91() {
    int[] numbers = { 20, 38, 25, 77, 18, 51, 86, 10, 6, 63, 42, 30, 71, 74, 24, 40, 45, 3, 68, 4 };
    assertEquals(42, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case92() {
    int[] numbers = { 86, 37, 6, 28, 8, 7, 40, 73, 53, 96, 67, 13, 93, 68, 89, 35, 65, 29, 56, 1, 20, 10, 38, 46, 12, 78, 60, 30, 5, 71, 14, 63, 2, 32, 88, 98, 100, 9, 54, 44, 23, 79, 81, 85, 43 };
    assertEquals(68, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case93() {
    int[] numbers = { 57, 16 };
    assertEquals(15, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case94() {
    int[] numbers = { 14, 88, 21, 18, 93, 86, 11, 66, 73, 69, 67, 33, 3, 27, 62 };
    assertEquals(41, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case95() {
    int[] numbers = { 46, 26, 76, 57, 24, 2, 62, 36, 75, 97, 10, 52, 63, 87, 61, 80 };
    assertEquals(47, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case96() {
    int[] numbers = { 80, 15, 19, 6, 30, 26, 65, 72, 87, 14, 13, 1, 52, 40, 11, 16, 9, 97, 7, 98, 93, 53, 29, 27, 32, 96, 73, 20, 56, 79, 70, 54, 74, 10, 55, 64, 35, 45, 63 };
    assertEquals(60, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case97() {
    int[] numbers = { 23, 90, 58, 19, 1, 27, 10, 69, 51, 47, 99, 30, 3, 83, 56, 45, 88, 21, 15, 2, 71, 37, 9, 39, 33, 91, 80, 96, 81, 14, 4, 65 };
    assertEquals(57, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case98() {
    int[] numbers = { 89, 43, 66, 71, 68, 27, 25, 84, 7, 79, 83, 82, 96, 51, 33, 54, 1, 95, 65, 16, 21, 37, 38, 15, 26 };
    assertEquals(56, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case99() {
    int[] numbers = { 67, 26, 85 };
    assertEquals(24, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case100() {
    int[] numbers = { 47, 41, 90, 73, 79, 55, 66, 27, 84, 63, 32, 70, 97, 36, 62, 3, 46, 13, 99, 28, 78, 86, 95, 89, 48, 61, 94, 7, 80, 6 };
    assertEquals(63, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case101() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 21, 23, 27, 29, 31, 33, 37, 39, 41, 43, 47, 49, 53, 59, 61, 67, 71, 73, 79, 83, 87, 89, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
    assertEquals(65, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case102() {
    int[] numbers = { 97, 2, 81, 23, 36, 9, 43 };
    assertEquals(29, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case103() {
    int[] numbers = { 6, 2, 18 };
    assertEquals(7, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case104() {
    int[] numbers = { 10, 4 };
    assertEquals(5, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case105() {
    int[] numbers = { 2, 100 };
    assertEquals(17, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case106() {
    int[] numbers = { 11, 27, 33 };
    assertEquals(13, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case107() {
    int[] numbers = { 100, 99, 88, 3, 10 };
    assertEquals(28, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case108() {
    int[] numbers = { 16, 7 };
    assertEquals(8, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case109() {
    int[] numbers = { 97, 2 };
    assertEquals(16, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case110() {
    int[] numbers = { 98, 2, 5, 7 };
    assertEquals(18, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case111() {
    int[] numbers = { 1, 2, 4, 8, 16, 32, 64 };
    assertEquals(7, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case112() {
    int[] numbers = { 3, 5, 7 };
    assertEquals(5, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case113() {
    int[] numbers = { 2, 6 };
    assertEquals(4, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case114() {
    int[] numbers = { 9, 2, 1 };
    assertEquals(4, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case115() {
    int[] numbers = { 100 };
    assertEquals(1, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case116() {
    int[] numbers = { 95, 30 };
    assertEquals(7, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case117() {
    int[] numbers = { 1, 3, 9, 27, 81, 100, 43, 21, 89, 2 };
    assertEquals(30, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case118() {
    int[] numbers = { 1, 2, 100 };
    assertEquals(17, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case119() {
    int[] numbers = { 96, 2 };
    assertEquals(16, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case120() {
    int[] numbers = { 18, 6 };
    assertEquals(7, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case121() {
    int[] numbers = { 9, 2 };
    assertEquals(3, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case122() {
    int[] numbers = { 3, 50 };
    assertEquals(12, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case123() {
    int[] numbers = { 30, 5, 2 };
    assertEquals(10, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case124() {
    int[] numbers = { 20, 3 };
    assertEquals(8, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case125() {
    int[] numbers = { 36, 18 };
    assertEquals(5, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case126() {
    int[] numbers = { 98, 2, 7, 5 };
    assertEquals(18, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case127() {
    int[] numbers = { 4 };
    assertEquals(1, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case128() {
    int[] numbers = { 24, 5 };
    assertEquals(5, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case129() {
    int[] numbers = { 1, 2, 5, 100 };
    assertEquals(17, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case130() {
    int[] numbers = { 25, 2 };
    assertEquals(8, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case131() {
    int[] numbers = { 1, 25, 50, 100 };
    assertEquals(17, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case132() {
    int[] numbers = { 3, 5, 60 };
    assertEquals(14, dividebyzero.CountNumbers(numbers));
  }

  @Test
  public void case133() {
    int[] numbers = { 1, 2, 3, 4 };
    assertEquals(4, dividebyzero.CountNumbers(numbers));
  }

}
