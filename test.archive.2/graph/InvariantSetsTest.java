package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class InvariantSetsTest {
  InvariantSets invariantsets = new InvariantSets();

  @Test
  public void case1() {
    int[] f = { 1, 0, 0, 0 };
    assertEquals(5L, invariantsets.countSets(f));
  }

  @Test
  public void case2() {
    int[] f = { 1, 2, 0 };
    assertEquals(2L, invariantsets.countSets(f));
  }

  @Test
  public void case3() {
    int[] f = { 0, 0, 1, 2 };
    assertEquals(5L, invariantsets.countSets(f));
  }

  @Test
  public void case4() {
    int[] f = { 0, 1, 2, 3, 4, 5 };
    assertEquals(64L, invariantsets.countSets(f));
  }

  @Test
  public void case5() {
    int[] f = { 12, 10, 0, 4, 0, 6, 3, 8, 9, 14, 1, 5, 6, 12, 5 };
    assertEquals(90L, invariantsets.countSets(f));
  }

  @Test
  public void case6() {
    int[] f = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19, 21, 22, 23, 24, 25, 26, 27, 28, 28 };
    assertEquals(210L, invariantsets.countSets(f));
  }

  @Test
  public void case7() {
    int[] f = { 10, 2, 2, 7, 4, 1, 13, 6, 9, 10, 6, 8, 8, 1, 4 };
    assertEquals(252L, invariantsets.countSets(f));
  }

  @Test
  public void case8() {
    int[] f = { 1, 9, 6, 8, 13, 7, 12, 4, 5, 13, 0, 9, 5, 2, 7 };
    assertEquals(55L, invariantsets.countSets(f));
  }

  @Test
  public void case9() {
    int[] f = { 14, 0, 11, 11, 10, 11, 9, 11, 0, 6, 12, 14, 7, 7, 4 };
    assertEquals(162L, invariantsets.countSets(f));
  }

  @Test
  public void case10() {
    int[] f = { 0, 7, 5, 13, 9, 3, 8, 9, 1, 5, 0, 4, 0, 10, 10 };
    assertEquals(143L, invariantsets.countSets(f));
  }

  @Test
  public void case11() {
    int[] f = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 27, 26, 25, 28, 29, 30, 31, 32, 35, 34, 37, 36, 33, 38, 39, 40, 41, 48, 43, 44, 45, 46, 47, 42, 49 };
    assertEquals(70368744177664L, invariantsets.countSets(f));
  }

  @Test
  public void case12() {
    int[] f = { 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23 };
    assertEquals(667786811L, invariantsets.countSets(f));
  }

  @Test
  public void case13() {
    int[] f = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 27, 26, 25, 28, 30, 31, 32, 29, 35, 34, 37, 36, 33, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 38 };
    assertEquals(512L, invariantsets.countSets(f));
  }

  @Test
  public void case14() {
    int[] f = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 27, 26, 25, 28, 29, 30, 31, 32, 35, 34, 37, 36, 33, 4, 5, 4, 20, 25, 15, 2 };
    assertEquals(652298158080L, invariantsets.countSets(f));
  }

  @Test
  public void case15() {
    int[] f = { 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 30, 28, 23, 23, 30, 30, 30, 23, 5 };
    assertEquals(5306L, invariantsets.countSets(f));
  }

  @Test
  public void case16() {
    int[] f = { 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 10, 10, 3, 10, 10, 10, 12, 10, 10, 10, 20, 20, 10, 20, 20, 20, 20, 20, 20, 20, 40, 30, 30, 30, 30, 41, 30, 30, 30, 30, 40, 40, 40, 40, 40, 0, 40, 40, 40, 40 };
    assertEquals(13336537860225L, invariantsets.countSets(f));
  }

  @Test
  public void case17() {
    int[] f = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 0, 30, 28, 23, 23, 30, 30, 30, 23, 5 };
    assertEquals(513L, invariantsets.countSets(f));
  }

  @Test
  public void case18() {
    int[] f = { 19, 5, 13, 9, 19, 21, 4, 28, 20, 28, 1, 34, 15, 5, 19, 46, 29, 17, 26, 36, 29, 12, 2, 23, 30, 13, 3, 13, 15, 30, 36, 29, 46, 3, 0, 39, 27, 46, 31, 11, 46, 15, 1, 4, 21, 14, 14, 32, 22, 6 };
    assertEquals(427714564L, invariantsets.countSets(f));
  }

  @Test
  public void case19() {
    int[] f = { 25, 26, 0, 45, 47, 5, 18, 25, 10, 27, 42, 35, 29, 40, 27, 33, 6, 46, 35, 38, 19, 7, 46, 27, 44, 16, 12, 38, 20, 7, 39, 5, 38, 37, 32, 21, 49, 25, 1, 12, 4, 3, 18, 38, 34, 6, 12, 29, 10, 35 };
    assertEquals(141165507L, invariantsets.countSets(f));
  }

  @Test
  public void case20() {
    int[] f = { 33, 6, 43, 11, 26, 31, 11, 21, 12, 39, 9, 24, 33, 15, 7, 8, 23, 44, 21, 33, 17, 30, 24, 41, 11, 11, 6, 4, 5, 7, 32, 41, 0, 47, 24, 45, 28, 37, 42, 46, 33, 32, 14, 45, 6, 39, 11, 31, 27, 20 };
    assertEquals(180219938L, invariantsets.countSets(f));
  }

  @Test
  public void case21() {
    int[] f = { 1, 41, 40, 3, 39, 49, 20, 41, 18, 16, 7, 22, 15, 38, 42, 26, 17, 12, 5, 19, 46, 30, 46, 48, 24, 30, 24, 1, 23, 20, 24, 10, 34, 42, 41, 9, 23, 43, 47, 9, 10, 9, 34, 18, 42, 19, 17, 49, 5, 39 };
    assertEquals(253505406L, invariantsets.countSets(f));
  }

  @Test
  public void case22() {
    int[] f = { 29, 26, 44, 5, 11, 44, 34, 30, 8, 43, 25, 25, 14, 12, 39, 17, 6, 29, 40, 25, 19, 29, 32, 23, 2, 21, 40, 17, 31, 37, 27, 2, 18, 37, 47, 36, 0, 10, 49, 28, 0, 29, 0, 44, 9, 21, 26, 14, 39, 32 };
    assertEquals(137008792L, invariantsets.countSets(f));
  }

  @Test
  public void case23() {
    int[] f = { 29, 36, 4, 17, 11, 47, 9, 29, 21, 8, 6, 2, 14, 17, 8, 42, 20, 28, 33, 5, 12, 48, 36, 23, 42, 21, 9, 45, 11, 26, 22, 4, 20, 15, 47, 8, 41, 26, 3, 25, 45, 37, 31, 4, 18, 35, 17, 27, 5, 15 };
    assertEquals(26202066L, invariantsets.countSets(f));
  }

  @Test
  public void case24() {
    int[] f = { 14, 11, 26, 13, 26, 45, 6, 11, 41, 36, 18, 20, 41, 21, 48, 9, 42, 46, 13, 22, 28, 30, 24, 3, 40, 44, 34, 27, 27, 3, 35, 27, 49, 26, 32, 2, 34, 35, 48, 45, 31, 5, 45, 44, 10, 40, 24, 12, 17, 5 };
    assertEquals(20665094L, invariantsets.countSets(f));
  }

  @Test
  public void case25() {
    int[] f = { 38, 6, 14, 36, 10, 2, 37, 6, 31, 0, 20, 48, 46, 23, 2, 21, 46, 11, 3, 15, 1, 2, 38, 14, 49, 41, 47, 29, 31, 28, 49, 14, 20, 26, 37, 35, 34, 26, 37, 30, 34, 48, 46, 26, 21, 38, 43, 18, 41, 45 };
    assertEquals(176801226L, invariantsets.countSets(f));
  }

  @Test
  public void case26() {
    int[] f = { 26, 1, 38, 18, 8, 44, 7, 14, 31, 34, 46, 26, 28, 7, 1, 11, 41, 41, 28, 28, 42, 40, 10, 17, 34, 41, 12, 37, 22, 27, 49, 1, 13, 37, 40, 12, 14, 31, 25, 11, 6, 26, 19, 33, 45, 20, 18, 32, 17, 35 };
    assertEquals(70705170L, invariantsets.countSets(f));
  }

  @Test
  public void case27() {
    int[] f = { 37, 23, 35, 47, 14, 45, 28, 28, 30, 10, 37, 42, 40, 43, 39, 10, 28, 28, 29, 45, 44, 42, 20, 29, 37, 5, 42, 40, 43, 24, 21, 41, 9, 20, 13, 2, 29, 26, 7, 46, 12, 29, 3, 30, 9, 43, 44, 41, 14, 24 };
    assertEquals(178488582L, invariantsets.countSets(f));
  }

  @Test
  public void case28() {
    int[] f = { 12, 10, 0, 4, 0, 6, 3, 8, 9, 14, 1, 5, 6, 12, 5 };
    assertEquals(90L, invariantsets.countSets(f));
  }

  @Test
  public void case29() {
    int[] f = { 46, 47, 15, 10, 33, 18, 0, 41, 41, 6, 43, 8, 15, 21, 48, 36, 23, 7, 25, 23, 28, 46, 34, 20, 19, 20, 12, 20, 18, 21, 38, 16, 20, 5, 29, 3, 23, 29, 47, 16, 35, 42, 26, 3, 13, 24, 39, 39, 34, 16 };
    assertEquals(37166148L, invariantsets.countSets(f));
  }

  @Test
  public void case30() {
    int[] f = { 1, 1, 1, 1, 0, 6, 2, 1, 3, 2, 2, 2, 5, 6, 5, 3, 2, 4, 5, 4, 2, 2, 3, 4, 5, 5, 6, 7, 3, 4, 4, 5, 2, 3, 4, 5, 3, 2 };
    assertEquals(1703383111L, invariantsets.countSets(f));
  }

  @Test
  public void case31() {
    int[] f = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals(562949953421313L, invariantsets.countSets(f));
  }

  @Test
  public void case32() {
    int[] f = { 1, 0, 0, 0 };
    assertEquals(5L, invariantsets.countSets(f));
  }

  @Test
  public void case33() {
    int[] f = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    assertEquals(1125899906842624L, invariantsets.countSets(f));
  }

  @Test
  public void case34() {
    int[] f = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(562949953421313L, invariantsets.countSets(f));
  }

  @Test
  public void case35() {
    int[] f = { 41, 17, 34, 0, 19, 24, 28, 8, 12, 14, 5, 45, 31, 27, 11, 41, 45, 42, 27, 36, 41, 4, 2, 3, 42, 32, 21, 16, 18, 45, 47, 26, 21, 38, 19, 12, 17, 49, 35, 44, 3, 11, 22, 33, 23, 14, 41, 11, 3, 18 };
    assertEquals(17188169L, invariantsets.countSets(f));
  }

  @Test
  public void case36() {
    int[] f = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals(17592186044417L, invariantsets.countSets(f));
  }

}
