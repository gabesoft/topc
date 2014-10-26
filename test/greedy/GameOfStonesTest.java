package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class GameOfStonesTest {
  GameOfStones gameofstones = new GameOfStones();

  @Test
  public void case1() {
    int[] stones = { 7, 15, 9, 5 };
    assertEquals(3, gameofstones.count(stones));
  }

  @Test
  public void case2() {
    int[] stones = { 17 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case3() {
    int[] stones = { 10, 15, 20, 12, 1, 20 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case4() {
    int[] stones = { 10, 16 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case5() {
    int[] stones = { 92, 100, 90, 100, 58, 100, 96, 100, 82, 82, 94, 90, 82, 94, 56, 92, 28, 96, 98, 96, 98, 88, 100, 88, 68, 100, 82, 100, 92, 84, 72, 96, 88, 74, 62, 94, 48, 94, 94, 94, 60, 88, 94, 96, 70, 100, 70, 42, 74, 84, 100, 100, 90, 56, 88, 96, 92, 54, 82, 92, 86, 96, 72, 82, 98, 92, 44, 96, 86, 92, 96, 100, 94, 98, 72, 100, 70, 100, 90, 78, 64, 74, 86, 60, 96, 96, 84, 70, 100, 78, 94, 48, 58, 78, 80, 80, 74, 82, 90, 96 };
    assertEquals(313, gameofstones.count(stones));
  }

  @Test
  public void case6() {
    int[] stones = { 17, 1, 27, 29, 13, 1, 27, 3, 19, 3, 25, 1, 11, 9, 7, 17, 31, 25, 5, 11, 31, 9, 15, 3, 3, 3, 11, 11, 1, 41, 5, 95, 7, 3, 41, 31, 7, 13, 15, 5, 17, 3, 9, 3, 11, 27, 1, 23, 15, 5, 43, 11, 17, 7, 1, 3, 13, 69, 3, 43, 21, 1, 25, 1, 3, 11, 5, 43, 13, 7, 15, 1, 1, 55, 37, 9, 5, 7, 21, 3, 23, 15, 1, 9, 3, 35, 13, 17, 7, 17, 27, 5, 9, 19, 13, 1, 1, 1, 29 };
    assertEquals(277, gameofstones.count(stones));
  }

  @Test
  public void case7() {
    int[] stones = { 94, 48, 46, 2, 30, 6, 20, 6, 4, 50, 46, 40, 34, 4, 20, 32, 12, 58, 16, 40, 44, 40, 54, 50, 12, 6, 8, 8, 48, 10, 68, 62, 10, 6, 38, 68, 6, 2, 62, 70, 24, 6, 16, 26, 16, 22, 96, 14, 20, 100, 48, 10, 2, 60, 42, 4, 4, 4, 62, 22, 14, 14, 10, 20, 2, 56, 16, 24, 2, 72, 4, 96, 56, 44, 74, 50, 24, 70, 70, 2, 54, 20, 14, 46, 40, 52, 40, 16, 84, 8, 26, 10, 22, 42, 6, 38, 2, 18 };
    assertEquals(538, gameofstones.count(stones));
  }

  @Test
  public void case8() {
    int[] stones = { 93, 99, 99, 99, 97, 97, 97, 97, 97, 99, 95, 97, 99, 97, 99, 99, 99, 99, 77, 97, 91, 99, 99, 95, 97, 93, 97, 93, 99, 97, 99, 99, 99, 97, 97, 99, 99, 97, 93, 95, 99, 95, 99, 93, 99, 89, 99, 97, 99, 95, 97, 91, 99, 95, 99, 99, 91, 93, 97, 97, 99, 99, 99, 99, 99, 99, 99, 99, 99, 93, 99, 99, 99, 99, 99, 99, 97, 93, 97, 99, 99, 99, 99, 99, 99, 97, 99, 99, 99, 91, 97, 97, 97, 99, 97, 91, 99 };
    assertEquals(51, gameofstones.count(stones));
  }

  @Test
  public void case9() {
    int[] stones = { 1, 29, 11, 35, 57, 15, 85, 19, 5, 47, 53, 5, 63, 19, 13, 63, 27, 43, 53, 75, 67, 93, 33, 31, 47, 3, 63, 17, 11, 53, 35, 23, 17, 45, 31, 19, 63, 75, 5, 3, 49, 19, 11, 89, 21, 69, 71, 5, 45, 81, 31, 13, 11, 19, 7, 99, 33, 63, 19, 57, 73, 29, 35, 9, 47, 1, 17, 7, 13, 31, 5, 85, 95, 23, 45, 65, 63, 41, 81, 33, 45, 1, 15, 45, 19, 87, 51, 7, 13, 39, 1, 59, 29, 35, 1, 43 };
    assertEquals(539, gameofstones.count(stones));
  }

  @Test
  public void case10() {
    int[] stones = { 95, 95, 87, 99, 97, 97, 95, 93, 95, 99, 99, 99, 91, 99, 99, 97, 87, 95, 99, 99, 97, 99, 97, 95, 95, 85, 95, 93, 97, 93, 97, 97, 97, 97, 95, 89, 99, 95, 91, 93, 93, 93, 97, 99, 99, 95, 91, 91, 97, 99, 91, 97, 99, 91, 93, 93, 83, 99, 97, 97, 91, 99, 99, 99, 93, 97, 97, 93, 83, 91, 91, 97, 99, 97, 95, 95, 97, 97, 95, 95, 97, 89, 85, 91, 89, 95, 99, 99, 99, 99, 93, 87, 99, 99, 99 };
    assertEquals(74, gameofstones.count(stones));
  }

  @Test
  public void case11() {
    int[] stones = { 31, 21, 73, 3, 1, 65, 5, 23, 13, 3, 5, 45, 23, 23, 17, 27, 23, 3, 47, 1, 1, 5, 5, 5, 15, 69, 3, 23, 31, 53, 1, 9, 17, 9, 15, 17, 35, 45, 43, 13, 5, 27, 1, 21, 93, 11, 7, 65, 43, 7, 35, 25, 1, 35, 15, 17, 13, 67, 23, 29, 3, 9, 41, 33, 7, 15, 13, 3, 63, 15, 55, 33, 9, 3, 7, 21, 33, 11, 1, 9, 7, 7, 9, 7, 1, 17, 15, 7, 25, 9, 1, 41, 25, 13 };
    assertEquals(357, gameofstones.count(stones));
  }

  @Test
  public void case12() {
    int[] stones = { 3, 27, 29, 3, 7, 31, 23, 5, 7, 29, 9, 33, 1, 19, 1, 23, 21, 13, 33, 15, 19, 1, 13, 31, 7, 59, 35, 9, 11, 3, 3, 25, 1, 27, 21, 23, 7, 17, 31, 9, 25, 15, 5, 43, 21, 13, 15, 9, 27, 13, 3, 1, 11, 1, 1, 15, 53, 1, 19, 49, 23, 7, 9, 81, 31, 15, 5, 89, 41, 71, 19, 21, 17, 29, 7, 17, 5, 3, 9, 7, 43, 21, 11, 45, 1, 7, 5, 33, 17, 5, 3, 39, 7 };
    assertEquals(301, gameofstones.count(stones));
  }

  @Test
  public void case13() {
    int[] stones = { 2, 76, 20, 6, 20, 10, 18, 34, 44, 2, 14, 30, 4, 84, 16, 4, 20, 10, 60, 10, 40, 4, 4, 54, 10, 40, 40, 4, 30, 8, 10, 4, 4, 12, 28, 20, 20, 40, 4, 10, 12, 10, 6, 6, 12, 2, 18, 28, 4, 32, 2, 18, 8, 54, 56, 10, 18, 12, 20, 18, 50, 24, 30, 58, 42, 62, 28, 16, 6, 12, 22, 8, 34, 8, 14, 6, 78, 4, 8, 28, 6, 4, 20, 4, 52, 2, 28, 26, 38, 64, 10, 16 };
    assertEquals(354, gameofstones.count(stones));
  }

  @Test
  public void case14() {
    int[] stones = { 52, 10, 68, 54, 64, 52, 34, 82, 72, 80, 54, 74, 6, 34, 76, 92, 84, 90, 64, 14, 16, 68, 88, 82, 98, 92, 58, 2, 20, 42, 60, 64, 88, 8, 48, 80, 78, 72, 70, 96, 42, 56, 74, 84, 12, 4, 28, 38, 6, 26, 10, 50, 16, 58, 52, 42, 12, 50, 76, 44, 92, 28, 54, 22, 58, 76, 36, 42, 72, 80, 28, 8, 20, 88, 54, 90, 22, 82, 50, 56, 26, 88, 54, 4, 88, 100, 32, 32, 28, 20, 36 };
    assertEquals(542, gameofstones.count(stones));
  }

  @Test
  public void case15() {
    int[] stones = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case16() {
    int[] stones = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case17() {
    int[] stones = { 90, 78, 100, 78, 74 };
    assertEquals(11, gameofstones.count(stones));
  }

  @Test
  public void case18() {
    int[] stones = { 3, 5, 21, 31 };
    assertEquals(11, gameofstones.count(stones));
  }

  @Test
  public void case19() {
    int[] stones = { 44, 6, 46 };
    assertEquals(13, gameofstones.count(stones));
  }

  @Test
  public void case20() {
    int[] stones = { 99, 95 };
    assertEquals(1, gameofstones.count(stones));
  }

  @Test
  public void case21() {
    int[] stones = { 37 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case22() {
    int[] stones = { 6, 28, 50, 70, 80, 4, 46, 34, 28, 60, 30, 20, 14, 18, 58, 10, 4, 28, 40, 28, 36, 50, 10, 18, 6, 96, 66, 6, 4, 28, 4, 14, 6, 34, 20, 24, 2, 6, 46, 6, 22, 30, 50, 90, 10, 4, 40, 4, 18, 2, 34, 20, 32, 22, 12, 98, 2, 6, 36, 6, 16, 34, 10, 20, 10, 50, 76, 10, 4, 22, 60 };
    assertEquals(335, gameofstones.count(stones));
  }

  @Test
  public void case23() {
    int[] stones = { 55, 13, 23, 29, 33, 13, 57, 5, 7, 27, 43, 83, 25, 13, 7, 47, 15, 3, 13, 17, 17, 21, 3, 37, 3, 11, 17, 27, 5, 35, 11, 7, 37, 7, 9, 11, 97, 37, 19, 9, 15, 21, 1, 55, 63, 47 };
    assertEquals(192, gameofstones.count(stones));
  }

  @Test
  public void case24() {
    int[] stones = { 100, 98, 84, 100, 100, 100, 98, 100, 92, 100, 100, 94, 100, 100, 100, 92, 100, 100, 98, 100, 88, 100, 100, 100, 100, 100, 98, 100, 98, 98, 94, 100, 98, 100, 100, 100, 98, 96 };
    assertEquals(23, gameofstones.count(stones));
  }

  @Test
  public void case25() {
    int[] stones = { 5, 59, 5, 51, 5, 7, 9, 13, 5, 31, 55, 9, 99, 47, 1, 15, 19, 5, 11, 37, 11, 9, 15, 25, 5, 5, 39, 41, 87, 11, 79, 45, 21, 11, 7, 47, 21, 43, 9, 21, 3, 69, 45, 31, 45, 17, 3, 9, 5, 15, 59, 41, 19, 81, 19, 11 };
    assertEquals(282, gameofstones.count(stones));
  }

  @Test
  public void case26() {
    int[] stones = { 4, 2, 4, 8, 12, 2, 2, 6, 18, 2, 4, 8, 12, 4, 2, 4, 2, 6, 6, 2, 6, 26, 12, 4, 10, 10, 12, 2, 4, 6, 2, 4, 4, 4, 10, 8, 6, 8, 4, 2, 4, 2, 6, 2, 6, 2, 2, 6, 8, 2, 18, 2, 4, 2, 10, 10, 2, 2, 4, 2, 12, 2, 2, 4, 4, 8, 8, 18, 16, 6, 4, 2, 6, 4, 4, 6, 12, 2, 4 };
    assertEquals(68, gameofstones.count(stones));
  }

  @Test
  public void case27() {
    int[] stones = { 6, 28, 50, 70, 82, 4, 48, 36, 28, 60, 30, 19, 13, 18, 58, 10, 4, 32, 39, 28, 36, 50, 10, 18, 6, 96, 67, 6, 4, 28, 4, 14, 5, 34, 20, 26, 2, 6, 46, 4, 22, 29, 50, 90, 9, 4, 39, 4, 18, 1, 34, 18, 32, 18, 12, 96, 2, 6, 38, 8, 16, 36, 10, 20, 10, 50, 76, 10, 3, 22, 60 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case28() {
    int[] stones = { 70, 41, 30, 20, 99, 70, 100, 44, 40, 72, 63, 92, 98, 94, 54, 92, 24, 69, 90, 58, 14, 96, 90, 98, 84, 98, 72, 96, 92, 87, 48, 74, 72, 66, 22, 14, 100, 48, 36, 54, 36, 89, 74, 100, 64, 50, 90, 82, 97, 91, 88, 98, 86, 92, 47, 90, 34, 82, 88, 94, 98, 84, 92, 50, 68, 80, 70, 85, 88 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case29() {
    int[] stones = { 11, 15, 50, 19, 17, 36, 93, 28, 9, 12, 77, 89, 33, 31, 11, 51, 47, 54, 15, 33, 1, 53, 80, 53, 41, 89, 44, 31, 71, 30, 47 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case30() {
    int[] stones = { 6, 84, 98, 74, 98, 48, 41, 28, 72, 12, 76, 28, 92, 56, 76, 44, 34, 10, 54, 98, 54, 26, 100, 7, 7, 12, 54, 84, 24, 52, 42, 74, 57, 20, 16, 41, 4, 40, 90, 82, 93, 70, 85, 52, 19, 51, 98, 80, 6, 72, 32, 52, 26, 84, 19, 16, 32, 38, 100, 84, 16, 10, 38, 90, 66, 46, 94 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case31() {
    int[] stones = { 86, 50, 90, 30, 76, 51, 69, 98, 61, 85, 97, 81, 59, 71, 49, 89, 17, 63, 53, 21, 53, 24, 13, 42, 97, 77, 95, 11 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case32() {
    int[] stones = { 93, 99, 99, 89, 100, 93, 83, 97, 99, 89, 89, 89, 99, 99, 95, 97, 89, 73, 83, 85, 83, 88, 89, 99, 97, 99, 97, 95, 87, 99, 95, 99, 95, 81, 87, 67, 83, 89, 95, 96, 85, 93, 98, 100, 87, 88, 81, 95, 73, 95, 87, 83, 95, 83, 85, 99, 83, 95, 97, 97, 93 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case33() {
    int[] stones = { 99, 86, 92, 95, 82, 68, 100, 100, 68, 100, 74, 88, 92, 94, 92, 91, 99, 88, 89, 98, 90, 100, 90, 96, 96, 88, 91, 96, 90, 100, 84, 90, 68, 93, 83 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case34() {
    int[] stones = { 95, 75, 41, 46, 34, 56, 73, 98, 38, 51, 83, 92, 4, 60, 34, 41, 72, 97, 50 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case35() {
    int[] stones = { 67, 49, 9, 52, 15, 73, 65, 67, 60, 9, 1, 99, 25, 25, 3, 73, 71, 11, 21, 7, 61, 65, 93, 33, 25, 27, 71, 5, 99, 12, 90, 31, 83, 89, 18, 17, 17, 77, 46, 69, 67, 79, 7, 65, 65, 100, 49, 55, 47, 97, 25, 81, 88, 37, 69, 25, 10, 87, 19, 39, 7, 1, 62, 21, 11, 25, 87, 69, 73, 19, 21 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case36() {
    int[] stones = { 2, 2, 10, 3, 4, 2, 10, 6, 3, 6, 2, 2, 8, 2, 2, 2, 4, 2, 1, 2, 1, 8, 2, 2, 4, 2, 2, 8, 3, 4, 5, 4, 7, 2, 4, 4, 2, 2, 2, 2, 4, 2, 8, 1, 2, 2, 6, 4, 2, 2, 10, 2, 2, 6, 12, 9, 10, 3 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case37() {
    int[] stones = { 28, 9, 58, 75, 52, 91, 53, 24, 11, 98, 73, 46, 27, 42, 83, 22, 70, 39, 68, 51, 78, 80, 81, 58, 61, 66, 6, 87, 16, 54, 57, 43, 14, 66, 70, 17, 56, 22, 92, 66, 19, 64, 63, 97, 58, 46, 71, 27, 36, 90, 29, 13, 70, 9, 70, 30, 74, 28, 68, 89, 33, 76, 84, 46, 41, 53, 14, 49, 74, 6, 14 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case38() {
    int[] stones = { 21, 77, 41, 78, 74, 63, 56, 9, 53, 84, 74, 22, 92, 95, 3, 17, 22, 22, 58, 54, 97, 93, 51, 37, 45, 65, 85, 70, 70, 51, 66, 42, 79, 59, 72, 4, 21, 27, 64, 73, 63, 37, 46, 6, 32 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case39() {
    int[] stones = { 75, 5, 21, 32, 59, 17, 24, 61, 6, 20, 25, 42, 41, 46, 44, 7, 88, 74, 17, 11, 77, 37, 37, 41, 62, 51, 29, 59, 9, 12, 59, 83, 17, 31, 14, 27, 100, 89, 87, 57, 60, 12, 98, 100, 9, 94, 6, 48, 67, 22, 58, 96, 11, 47, 88, 24, 97, 16, 82, 57, 28, 92, 39, 96, 23, 4, 22, 74, 92, 8, 30, 51, 19, 79, 3, 80, 72, 60, 27, 91, 82, 37, 86, 44, 83, 73, 67, 31, 40, 100, 88, 19, 92, 26, 14, 66, 30, 35, 91, 73 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case40() {
    int[] stones = { 20, 76, 13, 98, 30, 44, 22, 89, 71, 64, 22, 7, 49, 65, 41, 73, 83, 71, 64, 83, 58, 83, 26, 36, 48, 43, 17, 83, 33, 41, 77, 4, 16, 89, 53, 45, 33, 26, 86, 55, 89, 7, 13 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case41() {
    int[] stones = { 72, 53, 61, 6, 23, 25, 40, 33, 59, 65, 68, 6, 59, 36, 40, 43, 76, 16, 46, 44, 57, 51, 40, 41, 76, 25, 95, 65, 32, 59, 53, 55, 11, 66, 60, 85, 90 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case42() {
    int[] stones = { 56, 18, 16, 50, 4, 82, 6, 48, 22, 96, 46, 92, 54, 84, 66, 44, 40, 78, 36, 2, 56, 60, 62, 16, 22, 32, 12, 74, 32, 8, 14, 86, 28, 32, 40, 34, 12, 44, 84, 32, 38, 28, 26, 94, 16, 92, 42, 54, 72, 80, 58, 26, 40, 18, 40, 60, 48, 56, 36, 78, 66, 52, 68, 92, 82, 6, 28, 98, 48, 12, 28 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case43() {
    int[] stones = { 41, 53, 81, 55, 47, 25, 11, 17, 5, 67, 47, 43, 83, 89, 5, 33, 43, 43, 15, 7, 93, 85, 1, 73, 89, 29, 69, 39, 39, 1, 31, 83, 57, 17, 43, 7, 41, 53, 27, 45, 25, 73, 91, 11, 63 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case44() {
    int[] stones = { 50, 10, 42, 64, 18, 34, 48, 22, 12, 40, 50, 84, 82, 92, 88, 14, 76, 48, 34, 22, 54, 74, 74, 82, 24, 2, 58, 18, 18, 24, 18, 66, 34, 62, 28, 54, 100, 78, 74, 14, 20, 24, 96, 100, 18, 88, 12, 96, 34, 44, 16, 92, 22, 94, 76, 48, 94, 32, 64, 14, 56, 84, 78, 92, 46, 8, 44, 48, 84, 16, 60, 2, 38, 58, 6, 60, 44, 20, 54, 82, 64, 74, 72, 88, 66, 46, 34, 62, 80, 100, 76, 38, 84, 52, 28, 32, 60, 70, 82, 46 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case45() {
    int[] stones = { 39, 51, 25, 95, 59, 87, 43, 77, 41, 27, 43, 13, 97, 29, 81, 45, 65, 41, 27, 65, 15, 65, 51, 71, 95, 85, 33, 65, 65, 81, 53, 7, 31, 77, 5, 89, 65, 51, 71, 9, 77, 13, 25 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case46() {
    int[] stones = { 44, 6, 22, 12, 46, 50, 80, 66, 18, 30, 36, 12, 18, 72, 80, 86, 52, 32, 92, 88, 14, 2, 80, 82, 52, 50, 90, 30, 64, 18, 6, 10, 22, 32, 20, 70, 80 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case47() {
    int[] stones = { 33, 99, 31, 71, 13, 49, 41, 93, 33, 97, 23, 29, 83, 35, 29, 61, 19, 83, 15, 11, 11, 77, 27, 17, 89, 47, 47, 7, 17, 29, 5, 53, 31, 37, 29, 43, 89, 73, 35, 25, 69, 63, 57, 51, 1, 89, 17, 21, 73, 35, 31, 83, 15, 59, 3, 3, 9, 53, 9, 29, 85, 19, 87, 19, 59, 15, 63, 47, 87, 1, 75, 57, 67, 33, 11, 69, 21, 31, 93, 93, 69, 23, 81, 83, 85, 87, 85, 99, 45, 99, 27, 29, 17, 17, 53, 75, 31, 15, 25, 23 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case48() {
    int[] stones = { 100, 84, 88, 32, 98, 60, 58, 34, 52, 50, 2, 78, 34, 86, 68, 22, 74, 66, 66, 76, 96, 98, 96, 14, 50, 70, 48, 68, 98, 70, 92, 98, 52, 78, 32, 50, 36, 92, 82, 90, 42, 86, 66, 78, 74, 32, 98, 48, 100, 66, 26, 100, 68, 22, 12, 16, 94, 58, 88, 92 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case49() {
    int[] stones = { 77, 91, 85, 57, 25, 33, 95, 17, 17, 83, 61, 7, 51, 37, 79, 83 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case50() {
    int[] stones = { 30, 86, 8, 56, 84, 74, 76, 98, 94, 68, 56, 80, 62, 90, 60, 56, 74, 16, 82, 12 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case51() {
    int[] stones = { 97, 31, 91, 61, 37, 41, 1, 21, 27, 39, 49, 17, 51, 3, 99, 23, 81, 97, 15, 53, 55, 97, 17, 47, 55, 73, 19, 73, 53, 33, 81, 53, 65, 75, 17, 5, 21, 17, 25, 47, 61, 75, 67, 11, 81, 71, 37, 67, 67, 53, 23, 25, 53, 39, 75 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case52() {
    int[] stones = { 30, 98, 78, 22, 34, 76, 96, 48, 24, 32, 16, 40, 24, 68 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case53() {
    int[] stones = { 54, 4 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case54() {
    int[] stones = { 80, 46, 10, 90, 8, 64, 52, 54, 70, 66, 28, 36, 14, 34, 46, 12, 62, 74, 96, 58, 82, 96, 86, 78, 56, 80, 34, 22, 86, 50, 78, 68, 100, 88, 58, 6, 50, 12, 62, 18, 80, 94, 56, 92, 26, 4, 6, 86, 80, 4, 42, 62, 98, 30 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case55() {
    int[] stones = { 20, 94, 2, 98, 12, 36, 30, 84 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case56() {
    int[] stones = { 38, 30, 100, 72, 82, 56, 92, 74, 18, 16, 84, 60, 86, 76, 98, 90, 80, 76, 50, 88, 62, 84, 50, 22, 14, 34, 94, 60, 54, 24, 12, 90, 54, 12, 60, 38, 66, 56, 10, 86, 70, 92, 50, 58, 66, 50, 46, 48, 24, 98 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case57() {
    int[] stones = { 37, 59 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case58() {
    int[] stones = { 85, 23, 99, 7, 75, 71, 73, 9, 3, 79, 75, 27, 29, 85, 97, 79, 11, 1, 25, 11, 19, 33, 25, 61, 81, 29, 69, 93, 63, 47, 39, 51, 73, 41, 57, 53, 15, 35, 65, 21, 13, 39, 49, 45, 23, 45, 23, 37 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case59() {
    int[] stones = { 75, 1, 21, 33, 99, 71, 65, 21, 99, 7, 43, 53, 5, 39, 13, 65, 41, 97, 63, 41, 91, 85, 3, 89, 49, 57, 75, 87, 59, 99, 55, 35, 5, 75, 71, 3, 49, 35, 25, 47, 45, 71, 99, 53, 13, 11, 19, 55, 11, 85, 99, 3, 71, 1, 91, 23, 61, 69, 9, 21, 69, 67, 59, 73, 47, 29 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case60() {
    int[] stones = { 69, 63, 85, 39, 57, 67, 55, 71, 55, 3, 95, 49, 97, 45, 57, 89, 61, 25, 3, 73, 7, 37, 47, 3, 35, 13 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case61() {
    int[] stones = { 11, 5, 89, 49, 61, 87, 73, 61, 77, 47 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case62() {
    int[] stones = { 2, 8, 4 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case63() {
    int[] stones = { 1 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case64() {
    int[] stones = { 2 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case65() {
    int[] stones = { 3 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case66() {
    int[] stones = { 1, 1 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case67() {
    int[] stones = { 1, 2 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case68() {
    int[] stones = { 1, 3 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case69() {
    int[] stones = { 2, 2 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case70() {
    int[] stones = { 2, 2, 1 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case71() {
    int[] stones = { 1 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case72() {
    int[] stones = { 1, 1 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case73() {
    int[] stones = { 1, 4, 1 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case74() {
    int[] stones = { 5, 5, 5 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case75() {
    int[] stones = { 1, 3, 5 };
    assertEquals(1, gameofstones.count(stones));
  }

  @Test
  public void case76() {
    int[] stones = { 3, 5 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case77() {
    int[] stones = { 2 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case78() {
    int[] stones = { 1, 4, 4 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case79() {
    int[] stones = { 3, 3, 6 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case80() {
    int[] stones = { 1, 1, 1 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case81() {
    int[] stones = { 1, 5 };
    assertEquals(1, gameofstones.count(stones));
  }

  @Test
  public void case82() {
    int[] stones = { 4, 7, 7 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case83() {
    int[] stones = { 7, 3, 5 };
    assertEquals(1, gameofstones.count(stones));
  }

  @Test
  public void case84() {
    int[] stones = { 12, 12, 6 };
    assertEquals(2, gameofstones.count(stones));
  }

  @Test
  public void case85() {
    int[] stones = { 10, 15, 20, 12, 1, 20 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case86() {
    int[] stones = { 3, 3, 3 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case87() {
    int[] stones = { 2, 2, 6, 6 };
    assertEquals(2, gameofstones.count(stones));
  }

  @Test
  public void case88() {
    int[] stones = { 7, 15, 9, 5 };
    assertEquals(3, gameofstones.count(stones));
  }

  @Test
  public void case89() {
    int[] stones = { 2, 10, 10, 10 };
    assertEquals(3, gameofstones.count(stones));
  }

  @Test
  public void case90() {
    int[] stones = { 2, 2, 5 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case91() {
    int[] stones = { 2, 98 };
    assertEquals(24, gameofstones.count(stones));
  }

  @Test
  public void case92() {
    int[] stones = { 9, 9, 9 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case93() {
    int[] stones = { 8, 2, 2 };
    assertEquals(2, gameofstones.count(stones));
  }

  @Test
  public void case94() {
    int[] stones = { 8, 1, 3 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case95() {
    int[] stones = { 2, 4, 8, 10 };
    assertEquals(3, gameofstones.count(stones));
  }

  @Test
  public void case96() {
    int[] stones = { 1, 1, 4 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case97() {
    int[] stones = { 1, 2 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case98() {
    int[] stones = { 1, 17 };
    assertEquals(4, gameofstones.count(stones));
  }

  @Test
  public void case99() {
    int[] stones = { 2, 4, 6, 6, 6 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case100() {
    int[] stones = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    assertEquals(1200, gameofstones.count(stones));
  }

  @Test
  public void case101() {
    int[] stones = { 7, 14, 10, 5 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case102() {
    int[] stones = { 11, 15 };
    assertEquals(1, gameofstones.count(stones));
  }

  @Test
  public void case103() {
    int[] stones = { 4, 4, 1, 3 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case104() {
    int[] stones = { 2, 2, 2, 6, 6, 6 };
    assertEquals(3, gameofstones.count(stones));
  }

  @Test
  public void case105() {
    int[] stones = { 2, 4, 8, 11, 15 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case106() {
    int[] stones = { 10, 1 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case107() {
    int[] stones = { 2, 4, 6 };
    assertEquals(1, gameofstones.count(stones));
  }

  @Test
  public void case108() {
    int[] stones = { 2, 2 };
    assertEquals(0, gameofstones.count(stones));
  }

  @Test
  public void case109() {
    int[] stones = { 4, 2 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case110() {
    int[] stones = { 1, 3, 8, 8 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case111() {
    int[] stones = { 7, 5, 3 };
    assertEquals(1, gameofstones.count(stones));
  }

  @Test
  public void case112() {
    int[] stones = { 4, 8, 8, 10, 17, 13, 10, 10, 10, 10 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case113() {
    int[] stones = { 2, 2, 2, 2, 2, 2, 16 };
    assertEquals(6, gameofstones.count(stones));
  }

  @Test
  public void case114() {
    int[] stones = { 1, 1, 1, 9 };
    assertEquals(3, gameofstones.count(stones));
  }

  @Test
  public void case115() {
    int[] stones = { 2, 1, 4, 1 };
    assertEquals(-1, gameofstones.count(stones));
  }

  @Test
  public void case116() {
    int[] stones = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98 };
    assertEquals(1200, gameofstones.count(stones));
  }

}
