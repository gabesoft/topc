package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class DivisibilityCriteriaTest {
  DivisibilityCriteria divisibilitycriteria = new DivisibilityCriteria();

  @Test
  public void case1() {
    int N = 6;
    int P = 7;
    assertArrayEquals(new int[] { 5, 4, 6, 2, 3, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case2() {
    int N = 7;
    int P = 11;
    assertArrayEquals(new int[] { 1, 10, 1, 10, 1, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case3() {
    int N = 5;
    int P = 13;
    assertArrayEquals(new int[] { 3, 12, 9, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case4() {
    int N = 2;
    int P = 2;
    assertArrayEquals(new int[] { 0, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case5() {
    int N = 16;
    int P = 97;
    assertArrayEquals(new int[] { 45, 53, 15, 50, 5, 49, 34, 81, 76, 27, 90, 9, 30, 3, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case6() {
    int N = 18;
    int P = 5;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case7() {
    int N = 18;
    int P = 17;
    assertArrayEquals(new int[] { 10, 1, 12, 8, 11, 13, 3, 2, 7, 16, 5, 9, 6, 4, 14, 15, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case8() {
    int N = 8;
    int P = 3;
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case9() {
    int N = 2;
    int P = 19;
    assertArrayEquals(new int[] { 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case10() {
    int N = 18;
    int P = 2;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case11() {
    int N = 18;
    int P = 31;
    assertArrayEquals(new int[] { 7, 10, 1, 28, 9, 4, 19, 5, 16, 14, 20, 2, 25, 18, 8, 7, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case12() {
    int N = 18;
    int P = 59;
    assertArrayEquals(new int[] { 8, 48, 52, 17, 43, 22, 14, 25, 32, 15, 31, 9, 54, 29, 56, 41, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case13() {
    int N = 18;
    int P = 71;
    assertArrayEquals(new int[] { 8, 15, 37, 25, 38, 18, 16, 30, 3, 50, 5, 36, 32, 60, 6, 29, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case14() {
    int N = 18;
    int P = 83;
    assertArrayEquals(new int[] { 61, 31, 28, 36, 70, 7, 9, 59, 64, 23, 77, 16, 68, 40, 4, 17, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case15() {
    int N = 1;
    int P = 83;
    assertArrayEquals(new int[] { 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case16() {
    int N = 1;
    int P = 89;
    assertArrayEquals(new int[] { 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case17() {
    int N = 15;
    int P = 41;
    assertArrayEquals(new int[] { 37, 16, 18, 10, 1, 37, 16, 18, 10, 1, 37, 16, 18, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case18() {
    int N = 12;
    int P = 23;
    assertArrayEquals(new int[] { 22, 16, 20, 2, 14, 6, 19, 18, 11, 8, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case19() {
    int N = 15;
    int P = 29;
    assertArrayEquals(new int[] { 28, 26, 20, 2, 6, 18, 25, 17, 22, 8, 24, 14, 13, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case20() {
    int N = 10;
    int P = 13;
    assertArrayEquals(new int[] { 12, 9, 10, 1, 4, 3, 12, 9, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case21() {
    int N = 2;
    int P = 5;
    assertArrayEquals(new int[] { 0, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case22() {
    int N = 1;
    int P = 5;
    assertArrayEquals(new int[] { 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case23() {
    int N = 18;
    int P = 47;
    assertArrayEquals(new int[] { 5, 24, 40, 4, 38, 32, 22, 21, 35, 27, 45, 28, 31, 36, 13, 6, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case24() {
    int N = 18;
    int P = 53;
    assertArrayEquals(new int[] { 36, 46, 47, 10, 1, 16, 44, 15, 28, 24, 13, 49, 42, 36, 46, 47, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case25() {
    int N = 17;
    int P = 67;
    assertArrayEquals(new int[] { 39, 24, 56, 19, 22, 29, 23, 9, 21, 49, 25, 36, 17, 62, 33, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case26() {
    int N = 2;
    int P = 79;
    assertArrayEquals(new int[] { 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case27() {
    int N = 18;
    int P = 2;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case28() {
    int N = 18;
    int P = 3;
    assertArrayEquals(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case29() {
    int N = 18;
    int P = 5;
    assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case30() {
    int N = 18;
    int P = 7;
    assertArrayEquals(new int[] { 5, 4, 6, 2, 3, 1, 5, 4, 6, 2, 3, 1, 5, 4, 6, 2, 3, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case31() {
    int N = 18;
    int P = 11;
    assertArrayEquals(new int[] { 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case32() {
    int N = 18;
    int P = 13;
    assertArrayEquals(new int[] { 4, 3, 12, 9, 10, 1, 4, 3, 12, 9, 10, 1, 4, 3, 12, 9, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case33() {
    int N = 18;
    int P = 17;
    assertArrayEquals(new int[] { 10, 1, 12, 8, 11, 13, 3, 2, 7, 16, 5, 9, 6, 4, 14, 15, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case34() {
    int N = 18;
    int P = 19;
    assertArrayEquals(new int[] { 2, 4, 8, 16, 13, 7, 14, 9, 18, 17, 15, 11, 3, 6, 12, 5, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case35() {
    int N = 18;
    int P = 23;
    assertArrayEquals(new int[] { 17, 4, 5, 12, 15, 13, 22, 16, 20, 2, 14, 6, 19, 18, 11, 8, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case36() {
    int N = 18;
    int P = 29;
    assertArrayEquals(new int[] { 15, 16, 19, 28, 26, 20, 2, 6, 18, 25, 17, 22, 8, 24, 14, 13, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case37() {
    int N = 18;
    int P = 31;
    assertArrayEquals(new int[] { 7, 10, 1, 28, 9, 4, 19, 5, 16, 14, 20, 2, 25, 18, 8, 7, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case38() {
    int N = 18;
    int P = 37;
    assertArrayEquals(new int[] { 26, 10, 1, 26, 10, 1, 26, 10, 1, 26, 10, 1, 26, 10, 1, 26, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case39() {
    int N = 18;
    int P = 41;
    assertArrayEquals(new int[] { 18, 10, 1, 37, 16, 18, 10, 1, 37, 16, 18, 10, 1, 37, 16, 18, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case40() {
    int N = 18;
    int P = 43;
    assertArrayEquals(new int[] { 9, 31, 16, 36, 38, 21, 15, 23, 41, 17, 6, 35, 25, 24, 11, 14, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case41() {
    int N = 18;
    int P = 47;
    assertArrayEquals(new int[] { 5, 24, 40, 4, 38, 32, 22, 21, 35, 27, 45, 28, 31, 36, 13, 6, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case42() {
    int N = 18;
    int P = 53;
    assertArrayEquals(new int[] { 36, 46, 47, 10, 1, 16, 44, 15, 28, 24, 13, 49, 42, 36, 46, 47, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case43() {
    int N = 18;
    int P = 59;
    assertArrayEquals(new int[] { 8, 48, 52, 17, 43, 22, 14, 25, 32, 15, 31, 9, 54, 29, 56, 41, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case44() {
    int N = 18;
    int P = 61;
    assertArrayEquals(new int[] { 59, 12, 50, 5, 31, 58, 18, 14, 38, 16, 26, 27, 21, 57, 24, 39, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case45() {
    int N = 18;
    int P = 67;
    assertArrayEquals(new int[] { 55, 39, 24, 56, 19, 22, 29, 23, 9, 21, 49, 25, 36, 17, 62, 33, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case46() {
    int N = 18;
    int P = 71;
    assertArrayEquals(new int[] { 8, 15, 37, 25, 38, 18, 16, 30, 3, 50, 5, 36, 32, 60, 6, 29, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case47() {
    int N = 18;
    int P = 73;
    assertArrayEquals(new int[] { 10, 1, 22, 46, 63, 72, 51, 27, 10, 1, 22, 46, 63, 72, 51, 27, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case48() {
    int N = 18;
    int P = 79;
    assertArrayEquals(new int[] { 46, 52, 21, 10, 1, 8, 64, 38, 67, 62, 22, 18, 65, 46, 52, 21, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case49() {
    int N = 18;
    int P = 83;
    assertArrayEquals(new int[] { 61, 31, 28, 36, 70, 7, 9, 59, 64, 23, 77, 16, 68, 40, 4, 17, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case50() {
    int N = 18;
    int P = 89;
    assertArrayEquals(new int[] { 47, 67, 69, 87, 71, 16, 55, 50, 5, 45, 49, 85, 53, 32, 21, 11, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case51() {
    int N = 18;
    int P = 97;
    assertArrayEquals(new int[] { 38, 62, 45, 53, 15, 50, 5, 49, 34, 81, 76, 27, 90, 9, 30, 3, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case52() {
    int N = 18;
    int P = 97;
    assertArrayEquals(new int[] { 38, 62, 45, 53, 15, 50, 5, 49, 34, 81, 76, 27, 90, 9, 30, 3, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case53() {
    int N = 6;
    int P = 7;
    assertArrayEquals(new int[] { 5, 4, 6, 2, 3, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case54() {
    int N = 16;
    int P = 97;
    assertArrayEquals(new int[] { 45, 53, 15, 50, 5, 49, 34, 81, 76, 27, 90, 9, 30, 3, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case55() {
    int N = 18;
    int P = 7;
    assertArrayEquals(new int[] { 5, 4, 6, 2, 3, 1, 5, 4, 6, 2, 3, 1, 5, 4, 6, 2, 3, 1 }, divisibilitycriteria.multipliers(N, P));
  }

  @Test
  public void case56() {
    int N = 18;
    int P = 11;
    assertArrayEquals(new int[] { 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1 }, divisibilitycriteria.multipliers(N, P));
  }

}
