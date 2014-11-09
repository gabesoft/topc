package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SpaceWarDiv2Test {
  SpaceWarDiv2 spacewardiv2 = new SpaceWarDiv2();

  @Test
  public void case1() {
    int[] magicalGirlStrength = { 2, 3, 5 };
    int[] enemyStrength = { 1, 3, 4 };
    int[] enemyCount = { 2, 9, 4 };
    assertEquals(7, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case2() {
    int[] magicalGirlStrength = { 2, 3, 5 };
    int[] enemyStrength = { 1, 1, 2 };
    int[] enemyCount = { 2, 9, 4 };
    assertEquals(5, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case3() {
    int[] magicalGirlStrength = { 14, 6, 22 };
    int[] enemyStrength = { 8, 33 };
    int[] enemyCount = { 9, 1 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case4() {
    int[] magicalGirlStrength = { 17, 10, 29, 48, 92, 60, 80, 100, 15, 69, 36, 43, 70, 14, 88, 12, 14, 29, 9, 40 };
    int[] enemyStrength = { 93, 59, 27, 68, 48, 82, 15, 95, 61, 49, 68, 15, 16, 26, 64, 82, 7, 8, 92, 15 };
    int[] enemyCount = { 56, 26, 12, 52, 5, 19, 93, 36, 69, 61, 68, 66, 55, 28, 49, 55, 63, 57, 33, 45 };
    assertEquals(92, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case5() {
    int[] magicalGirlStrength = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100 };
    int[] enemyStrength = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    int[] enemyCount = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    assertEquals(5000, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case6() {
    int[] magicalGirlStrength = { 2 };
    int[] enemyStrength = { 7 };
    int[] enemyCount = { 20 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case7() {
    int[] magicalGirlStrength = { 1, 2, 6 };
    int[] enemyStrength = { 2, 2, 8 };
    int[] enemyCount = { 20, 20, 20 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case8() {
    int[] magicalGirlStrength = { 6, 3, 9, 6, 9 };
    int[] enemyStrength = { 7, 4, 2, 10, 1 };
    int[] enemyCount = { 20, 20, 20, 20, 20 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case9() {
    int[] magicalGirlStrength = { 1, 8, 5, 2, 10, 8, 2 };
    int[] enemyStrength = { 1, 7, 1, 1, 5, 3, 1 };
    int[] enemyCount = { 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(20, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case10() {
    int[] magicalGirlStrength = { 10, 2, 9, 10, 10, 4, 6, 5, 7 };
    int[] enemyStrength = { 4, 6, 9, 3, 7, 10, 6, 9, 10 };
    int[] enemyCount = { 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(24, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case11() {
    int[] magicalGirlStrength = { 4 };
    int[] enemyStrength = { 9, 5, 7, 8, 7, 4, 4, 7, 7, 8, 10, 4, 7, 5, 5 };
    int[] enemyCount = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case12() {
    int[] magicalGirlStrength = { 5, 9, 6 };
    int[] enemyStrength = { 9, 6, 7, 8, 8, 5, 8, 10, 9, 5, 3, 7, 10, 10, 7, 5 };
    int[] enemyCount = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case13() {
    int[] magicalGirlStrength = { 9, 7, 7, 4, 10 };
    int[] enemyStrength = { 8, 1, 10, 5, 10, 8, 5, 4, 7, 3, 7, 8, 2, 3, 7, 3, 3 };
    int[] enemyCount = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(68, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case14() {
    int[] magicalGirlStrength = { 6, 8, 2, 3, 5, 2, 2 };
    int[] enemyStrength = { 5, 8, 1, 4, 7, 7, 9, 4, 8, 8, 6, 10, 10, 9, 3, 6, 2, 8 };
    int[] enemyCount = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case15() {
    int[] magicalGirlStrength = { 4, 1, 7, 3, 1, 8, 8, 8, 6 };
    int[] enemyStrength = { 7, 2, 1, 10, 8, 10, 5, 1, 2, 4, 1, 1, 8, 5, 4, 2, 8, 6, 3 };
    int[] enemyCount = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case16() {
    int[] magicalGirlStrength = { 5, 3, 1, 8, 8, 2, 6, 1, 2, 6, 4, 9, 3, 1, 4 };
    int[] enemyStrength = { 1 };
    int[] enemyCount = { 20 };
    assertEquals(2, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case17() {
    int[] magicalGirlStrength = { 5, 1, 7, 8, 4, 10, 5, 5, 1, 6, 7, 7, 3, 10, 5, 8 };
    int[] enemyStrength = { 4, 10, 8 };
    int[] enemyCount = { 20, 20, 20 };
    assertEquals(10, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case18() {
    int[] magicalGirlStrength = { 10, 2, 2, 2, 2, 7, 2, 10, 1, 3, 10, 5, 9, 5, 10, 2, 5 };
    int[] enemyStrength = { 7, 6, 5, 1, 6 };
    int[] enemyCount = { 20, 20, 20, 20, 20 };
    assertEquals(10, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case19() {
    int[] magicalGirlStrength = { 7, 2, 1, 10, 9, 7, 5, 6, 1, 7, 1, 8, 4, 10, 4, 5, 10, 6 };
    int[] enemyStrength = { 9, 8, 3, 7, 2, 3, 10 };
    int[] enemyCount = { 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(12, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case20() {
    int[] magicalGirlStrength = { 8, 5, 7, 10, 3, 1, 2, 7, 5, 7, 9, 1, 7, 8, 6, 9, 2, 9, 4 };
    int[] enemyStrength = { 8, 8, 5, 7, 8, 5, 10, 5, 1 };
    int[] enemyCount = { 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(20, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case21() {
    int[] magicalGirlStrength = { 52, 49, 55, 19, 59 };
    int[] enemyStrength = { 100, 40, 92, 50, 37 };
    int[] enemyCount = { 5, 83, 21, 43, 91 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case22() {
    int[] magicalGirlStrength = { 33, 82, 35, 43, 98 };
    int[] enemyStrength = { 28, 79, 6, 99, 57 };
    int[] enemyCount = { 27, 96, 42, 37, 65 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case23() {
    int[] magicalGirlStrength = { 79, 21, 51, 60, 81 };
    int[] enemyStrength = { 82, 82, 18, 73, 45 };
    int[] enemyCount = { 24, 1, 72, 59, 5 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case24() {
    int[] magicalGirlStrength = { 1, 94, 83, 58, 61 };
    int[] enemyStrength = { 76, 72, 22, 89, 82 };
    int[] enemyCount = { 5, 11, 25, 53, 19 };
    assertEquals(53, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case25() {
    int[] magicalGirlStrength = { 2, 32, 71, 30, 93 };
    int[] enemyStrength = { 28, 5, 67, 36, 61 };
    int[] enemyCount = { 7, 92, 5, 66, 43 };
    assertEquals(57, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case26() {
    int[] magicalGirlStrength = { 3, 3, 5, 1, 4, 3, 1, 3, 4, 5, 2, 1, 4, 2, 2, 3, 2, 1, 1, 4 };
    int[] enemyStrength = { 5, 5, 2, 4, 1, 5, 1, 3, 2, 4, 5, 2, 4, 2, 2, 2, 3, 1, 1, 4 };
    int[] enemyCount = { 4, 10, 3, 3, 8, 8, 7, 9, 7, 8, 2, 8, 1, 4, 10, 6, 2, 5, 5, 7 };
    assertEquals(12, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case27() {
    int[] magicalGirlStrength = { 4, 1, 3, 5, 1, 5, 4, 3, 3, 1, 3, 5, 3, 2, 2, 1, 1, 1, 1, 4 };
    int[] enemyStrength = { 4, 2, 5, 2, 1, 1, 2, 3, 4, 3, 2, 3, 3, 3, 5, 3, 2, 3, 1, 4 };
    int[] enemyCount = { 6, 1, 10, 10, 7, 2, 4, 7, 8, 4, 8, 2, 3, 8, 6, 9, 6, 8, 2, 6 };
    assertEquals(9, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case28() {
    int[] magicalGirlStrength = { 3, 4, 1, 1, 1, 3, 5, 3, 3, 5, 2, 2, 2, 2, 5, 2, 5, 2, 2, 1 };
    int[] enemyStrength = { 2, 3, 2, 3, 3, 5, 3, 1, 5, 4, 5, 2, 3, 2, 4, 3, 4, 5, 1, 4 };
    int[] enemyCount = { 2, 9, 10, 10, 10, 10, 10, 10, 10, 5, 9, 9, 1, 9, 10, 6, 7, 9, 10, 2 };
    assertEquals(13, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case29() {
    int[] magicalGirlStrength = { 1, 3, 5, 1, 1, 1, 1, 5, 3, 3, 2, 1, 1, 3, 2, 5, 5, 3, 2, 1 };
    int[] enemyStrength = { 3, 1, 5, 4, 4, 4, 1, 4, 3, 4, 2, 2, 5, 5, 5, 5, 2, 3, 1, 4 };
    int[] enemyCount = { 3, 2, 7, 8, 9, 10, 2, 5, 5, 7, 4, 10, 2, 7, 5, 4, 5, 9, 3, 7 };
    assertEquals(18, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case30() {
    int[] magicalGirlStrength = { 1, 5, 4, 3, 2, 2, 2, 5, 4, 3, 1, 5, 4, 1, 4, 2, 5, 4, 3, 2 };
    int[] enemyStrength = { 4, 5, 2, 2, 1, 5, 4, 2, 2, 3, 3, 3, 5, 1, 4, 4, 2, 2, 2, 1 };
    int[] enemyCount = { 7, 2, 2, 9, 7, 2, 9, 10, 4, 4, 5, 5, 10, 1, 9, 10, 2, 4, 10, 5 };
    assertEquals(7, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case31() {
    int[] magicalGirlStrength = { 5, 6, 10, 7, 7, 10, 3, 1, 8, 5, 3, 3, 10, 3, 7, 5, 2, 8, 9, 9, 4, 5, 7, 9, 2, 4, 2, 9, 6, 9, 1, 4, 6, 10, 5, 9, 8, 9, 1, 10, 4, 9, 10, 3, 1, 8, 9, 10, 5, 7 };
    int[] enemyStrength = { 9, 5, 6, 1, 7, 2, 1, 9, 2, 3, 7, 8, 5, 5, 1, 1, 7, 7, 2, 10, 8, 4, 2, 7, 10, 1, 10, 6, 10, 6, 10, 4, 10, 3, 6, 8, 3, 5, 1, 1, 1, 9, 10, 5, 4, 2, 2, 7, 1, 3 };
    int[] enemyCount = { 1, 10, 3, 9, 2, 2, 4, 6, 4, 2, 8, 7, 2, 1, 1, 8, 6, 3, 4, 3, 1, 1, 7, 2, 7, 8, 6, 6, 1, 7, 5, 2, 5, 7, 3, 8, 8, 4, 9, 9, 1, 10, 3, 1, 10, 5, 8, 10, 10, 3 };
    assertEquals(6, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case32() {
    int[] magicalGirlStrength = { 6, 8, 5, 7, 4, 8, 5, 10, 8, 9, 10, 8, 1, 8, 1, 9, 6, 6, 9, 4, 10, 2, 8, 1, 7, 4, 5, 10, 8, 3, 4, 6, 9, 7, 1, 3, 8, 9, 3, 8, 5, 8, 10, 4, 6, 6, 6, 3, 4, 7 };
    int[] enemyStrength = { 4, 1, 4, 10, 6, 9, 1, 2, 8, 3, 5, 4, 5, 7, 6, 6, 10, 10, 3, 8, 2, 8, 6, 3, 3, 4, 2, 2, 9, 9, 9, 10, 5, 5, 6, 1, 5, 1, 6, 6, 2, 4, 2, 7, 4, 9, 1, 9, 3, 5 };
    int[] enemyCount = { 2, 3, 6, 5, 8, 3, 8, 3, 6, 3, 4, 1, 4, 3, 5, 6, 5, 8, 6, 6, 2, 10, 4, 6, 1, 3, 1, 3, 5, 6, 9, 3, 8, 5, 6, 3, 4, 4, 3, 3, 1, 10, 4, 10, 6, 7, 7, 5, 7, 6 };
    assertEquals(6, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case33() {
    int[] magicalGirlStrength = { 2, 8, 4, 7, 3, 5, 4, 10, 2, 3, 10, 5, 2, 7, 3, 8, 9, 10, 5, 5, 5, 6, 9, 1, 9, 7, 7, 2, 5, 1, 1, 5, 9, 8, 4, 8, 6, 2, 5, 6, 4, 4, 6, 3, 9, 2, 10, 4, 7, 10 };
    int[] enemyStrength = { 10, 2, 8, 4, 3, 4, 8, 5, 1, 6, 8, 8, 3, 7, 6, 7, 4, 2, 10, 9, 5, 9, 3, 4, 4, 9, 8, 8, 9, 2, 1, 7, 9, 2, 2, 9, 8, 1, 10, 9, 8, 1, 1, 8, 9, 4, 6, 9, 3, 7 };
    int[] enemyCount = { 4, 8, 3, 1, 9, 7, 6, 7, 3, 7, 8, 1, 7, 10, 8, 10, 3, 4, 8, 5, 3, 1, 8, 1, 8, 10, 9, 8, 1, 7, 1, 1, 5, 7, 8, 10, 7, 1, 8, 4, 7, 8, 6, 6, 1, 5, 6, 5, 2, 4 };
    assertEquals(9, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case34() {
    int[] magicalGirlStrength = { 8, 8, 6, 1, 10, 4, 1, 1, 3, 2, 1, 6, 8, 5, 4, 2, 9, 5, 2, 8, 2, 6, 2, 5, 9, 7, 1, 10, 8, 10, 9, 10, 7, 10, 7, 6, 2, 8, 2, 4, 4, 1, 2, 9, 5, 6, 5, 10, 4, 10 };
    int[] enemyStrength = { 9, 2, 5, 3, 9, 2, 9, 4, 5, 3, 5, 1, 1, 7, 1, 10, 7, 10, 8, 9, 1, 9, 9, 2, 6, 5, 7, 6, 6, 6, 4, 4, 1, 10, 1, 6, 8, 3, 5, 3, 10, 3, 2, 5, 7, 5, 6, 5, 1, 3 };
    int[] enemyCount = { 7, 6, 2, 7, 4, 10, 10, 6, 2, 6, 7, 2, 5, 6, 3, 7, 5, 10, 7, 1, 6, 2, 10, 2, 3, 1, 10, 6, 9, 4, 4, 5, 2, 8, 4, 9, 1, 5, 1, 1, 5, 2, 1, 9, 7, 7, 8, 2, 6, 5 };
    assertEquals(6, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case35() {
    int[] magicalGirlStrength = { 10, 5, 2, 7, 3, 7, 1, 3, 1, 5, 2, 2, 7, 5, 6, 10, 7, 6, 6, 8, 10, 4, 9, 8, 5, 8, 1, 7, 4, 1, 5, 9, 2, 9, 7, 2, 5, 5, 10, 8, 8, 5, 5, 6, 10, 2, 2, 3, 2, 1 };
    int[] enemyStrength = { 7, 8, 10, 6, 9, 7, 9, 10, 4, 6, 6, 4, 3, 2, 4, 4, 10, 8, 4, 8, 7, 8, 4, 7, 6, 1, 9, 2, 8, 5, 5, 5, 4, 10, 2, 10, 3, 5, 6, 7, 4, 5, 9, 10, 3, 5, 6, 8, 8, 3 };
    int[] enemyCount = { 5, 1, 7, 7, 4, 2, 8, 9, 10, 1, 4, 1, 2, 4, 3, 1, 4, 9, 10, 2, 1, 4, 3, 3, 6, 9, 7, 8, 9, 3, 4, 4, 2, 6, 5, 6, 8, 1, 4, 4, 3, 2, 2, 2, 3, 5, 4, 2, 10, 5 };
    assertEquals(8, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case36() {
    int[] magicalGirlStrength = { 40, 41, 77, 77, 31, 18, 44, 26, 12, 89, 47, 100, 14, 47, 10, 88, 17, 88, 54, 29 };
    int[] enemyStrength = { 36, 53, 31, 65, 47, 54, 84, 56, 88, 43, 15, 71, 100, 54, 34, 1, 21, 73, 8, 87 };
    int[] enemyCount = { 73, 70, 18, 88, 100, 27, 51, 19, 41, 68, 33, 7, 56, 79, 70, 54, 38, 3, 48, 38 };
    assertEquals(69, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case37() {
    int[] magicalGirlStrength = { 50, 27, 89, 78, 56, 60, 51, 94, 69, 28, 3, 51, 7, 97, 26, 45, 86, 11, 31, 86 };
    int[] enemyStrength = { 83, 7, 12, 17, 77, 38, 60, 51, 82, 12, 5, 64, 87, 3, 4, 100, 76, 74, 46, 89 };
    int[] enemyCount = { 22, 58, 47, 32, 73, 54, 59, 2, 30, 99, 42, 4, 87, 26, 97, 59, 12, 59, 23, 94 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case38() {
    int[] magicalGirlStrength = { 79, 43, 76, 39, 27, 35, 48, 46, 32, 56, 16, 67, 79, 88, 78, 91, 17, 39, 78, 61 };
    int[] enemyStrength = { 20, 95, 41, 41, 96, 69, 87, 46, 71, 41, 62, 76, 68, 91, 7, 94, 29, 26, 46, 39 };
    int[] enemyCount = { 100, 98, 38, 98, 38, 83, 80, 8, 49, 66, 69, 58, 70, 79, 33, 98, 39, 12, 92, 19 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case39() {
    int[] magicalGirlStrength = { 20, 22, 24, 42, 72, 69, 78, 60, 75, 63, 10, 46, 63, 96, 71, 37, 53, 4, 98, 22 };
    int[] enemyStrength = { 66, 66, 46, 12, 14, 87, 8, 81, 14, 75, 99, 27, 91, 3, 18, 11, 68, 58, 59, 76 };
    int[] enemyCount = { 53, 72, 56, 84, 60, 72, 57, 49, 27, 91, 67, 34, 95, 8, 49, 62, 65, 79, 37, 42 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case40() {
    int[] magicalGirlStrength = { 91, 40, 22, 63, 22, 17, 3, 27, 51, 19, 16, 14, 100, 54, 46, 90, 53, 77, 72, 34 };
    int[] enemyStrength = { 65, 27, 4, 86, 47, 80, 74, 80, 20, 70, 34, 44, 96, 96, 8, 76, 62, 68, 91, 14 };
    int[] enemyCount = { 32, 20, 19, 9, 34, 11, 40, 83, 60, 98, 87, 82, 21, 56, 95, 24, 40, 82, 39, 93 };
    assertEquals(99, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case41() {
    int[] magicalGirlStrength = { 33, 98, 73, 100, 90, 52, 52, 76, 30, 75, 16, 15, 8, 7, 60, 51, 98, 29, 39, 75 };
    int[] enemyStrength = { 36, 4, 80, 15, 20, 21, 12, 36, 23, 47, 83, 93, 13, 84, 86, 60, 51, 66, 78, 62 };
    int[] enemyCount = { 14, 87, 20, 62, 87, 60, 67, 81, 90, 86, 66, 4, 89, 36, 93, 7, 93, 19, 58, 78 };
    assertEquals(70, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case42() {
    int[] magicalGirlStrength = { 84, 64, 6, 88, 32, 33, 48, 72, 24, 70, 79, 83, 66, 81, 80, 91, 22, 64, 24, 42 };
    int[] enemyStrength = { 18, 38, 69, 56, 49, 11, 33, 66, 60, 95, 65, 72, 91, 70, 89, 73, 99, 4, 46, 92 };
    int[] enemyCount = { 41, 54, 56, 76, 60, 41, 76, 87, 2, 59, 52, 85, 17, 92, 75, 18, 78, 87, 76, 43 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case43() {
    int[] magicalGirlStrength = { 55, 64, 6, 51, 45, 6, 91, 28, 16, 39, 19, 44, 38, 9, 73, 82, 24, 83, 11, 9 };
    int[] enemyStrength = { 9, 85, 58, 72, 18, 87, 17, 70, 12, 55, 47, 75, 85, 89, 40, 27, 75, 62, 5, 58 };
    int[] enemyCount = { 21, 91, 42, 44, 90, 89, 48, 57, 75, 21, 57, 36, 67, 36, 6, 66, 28, 46, 42, 55 };
    assertEquals(283, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case44() {
    int[] magicalGirlStrength = { 98, 66, 48, 32, 16, 44, 14, 25, 33, 14, 66, 83, 57, 58, 46, 25, 91, 56, 27, 22 };
    int[] enemyStrength = { 1, 23, 18, 38, 71, 5, 17, 69, 34, 22, 64, 39, 78, 5, 39, 85, 84, 24, 51, 25 };
    int[] enemyCount = { 44, 85, 24, 96, 12, 67, 2, 77, 27, 77, 51, 33, 82, 14, 12, 68, 45, 15, 93, 37 };
    assertEquals(95, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case45() {
    int[] magicalGirlStrength = { 9, 44, 20, 87, 12, 93, 100, 51, 44, 42, 86, 46, 69, 100, 62, 22, 9, 12, 9, 16 };
    int[] enemyStrength = { 99, 22, 86, 99, 2, 25, 58, 16, 70, 3, 79, 12, 46, 66, 62, 57, 84, 17, 44, 2 };
    int[] enemyCount = { 23, 34, 7, 89, 20, 98, 63, 96, 74, 2, 92, 98, 92, 34, 99, 95, 47, 43, 50, 14 };
    assertEquals(89, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case46() {
    int[] magicalGirlStrength = { 21, 50, 37, 19, 24, 43, 7, 6, 33, 39, 44, 20, 41, 44, 43, 12, 37, 9, 29, 25, 18, 32, 22, 47, 28, 37, 17, 30, 3, 10, 17, 23, 3, 47, 46, 10, 18, 22, 35, 20, 33, 15, 11, 4, 49, 30, 22, 14, 36, 49 };
    int[] enemyStrength = { 35, 19, 22, 5, 28, 1, 5, 41, 12, 42, 5, 40, 47, 47, 30, 11, 34, 4, 1, 17, 21, 13, 16, 33, 28, 4, 44, 21, 8, 31, 35, 10, 11, 4, 44, 18, 44, 48, 22, 21, 11, 50, 33, 36, 49, 50, 10, 18, 18, 30 };
    int[] enemyCount = { 18, 1, 46, 38, 34, 25, 32, 26, 35, 34, 7, 16, 41, 35, 11, 35, 12, 7, 31, 30, 13, 3, 50, 10, 28, 45, 4, 32, 33, 23, 20, 34, 37, 5, 25, 4, 33, 50, 36, 31, 31, 24, 44, 16, 9, 22, 2, 12, 21, 19 };
    assertEquals(46, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case47() {
    int[] magicalGirlStrength = { 1, 21, 21, 43, 23, 26, 14, 6, 40, 42, 24, 21, 13, 37, 19, 26, 30, 36, 6, 48, 5, 24, 43, 24, 48, 8, 45, 21, 17, 1, 25, 37, 30, 13, 35, 19, 47, 13, 28, 16, 44, 49, 40, 17, 27, 8, 40, 44, 39, 46 };
    int[] enemyStrength = { 32, 37, 1, 49, 37, 12, 11, 5, 28, 7, 11, 38, 42, 19, 28, 20, 42, 22, 35, 38, 16, 37, 39, 36, 17, 24, 47, 44, 18, 41, 6, 18, 18, 2, 14, 21, 46, 23, 47, 40, 38, 46, 25, 43, 9, 30, 28, 8, 50, 1 };
    int[] enemyCount = { 26, 35, 6, 29, 32, 3, 1, 23, 30, 6, 38, 49, 36, 30, 5, 38, 15, 28, 12, 33, 48, 48, 1, 27, 40, 23, 7, 34, 18, 37, 38, 13, 34, 24, 2, 49, 37, 1, 17, 11, 42, 4, 18, 31, 41, 6, 38, 45, 48, 48 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case48() {
    int[] magicalGirlStrength = { 49, 14, 40, 36, 19, 3, 1, 5, 26, 16, 34, 1, 17, 22, 5, 11, 20, 30, 9, 31, 31, 36, 40, 15, 33, 30, 19, 6, 23, 10, 21, 49, 44, 5, 3, 5, 30, 4, 16, 4, 5, 5, 25, 40, 21, 6, 41, 47, 22, 2 };
    int[] enemyStrength = { 38, 2, 10, 24, 39, 44, 46, 20, 16, 22, 11, 33, 25, 2, 48, 40, 45, 26, 17, 7, 27, 32, 9, 1, 22, 3, 39, 27, 47, 34, 3, 44, 34, 46, 34, 46, 19, 6, 37, 33, 31, 21, 3, 20, 11, 5, 50, 35, 11, 48 };
    int[] enemyCount = { 18, 22, 8, 5, 35, 1, 40, 25, 29, 15, 27, 24, 9, 12, 5, 42, 6, 5, 48, 8, 14, 20, 27, 7, 45, 37, 42, 17, 31, 19, 8, 3, 42, 18, 49, 7, 43, 8, 7, 33, 2, 26, 30, 32, 50, 28, 9, 42, 45, 35 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case49() {
    int[] magicalGirlStrength = { 43, 20, 46, 5, 5, 26, 11, 33, 18, 16, 6, 18, 25, 28, 43, 6, 2, 32, 16, 33, 49, 29, 24, 49, 14, 36, 13, 47, 18, 24, 12, 24, 6, 20, 2, 14, 14, 7, 35, 17, 7, 24, 47, 27, 5, 2, 37, 50, 38, 26 };
    int[] enemyStrength = { 7, 42, 13, 3, 47, 23, 12, 29, 40, 18, 37, 41, 42, 47, 9, 50, 9, 48, 3, 2, 17, 9, 28, 32, 1, 11, 17, 38, 38, 20, 32, 24, 22, 26, 17, 12, 8, 11, 13, 10, 21, 4, 30, 11, 34, 37, 40, 14, 46, 24 };
    int[] enemyCount = { 33, 9, 45, 14, 27, 39, 40, 21, 12, 42, 42, 48, 42, 31, 18, 39, 14, 10, 15, 9, 47, 17, 44, 18, 31, 43, 48, 1, 15, 36, 46, 10, 4, 26, 29, 41, 33, 36, 28, 31, 27, 13, 48, 43, 47, 22, 41, 11, 11, 14 };
    assertEquals(39, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case50() {
    int[] magicalGirlStrength = { 34, 28, 37, 12, 16, 1, 3, 11, 22, 23, 10, 20, 47, 48, 29, 37, 37, 14, 38, 20, 12, 35, 24, 37, 14, 36, 9, 37, 20, 18, 27, 35, 39, 4, 33, 11, 16, 14, 6, 31, 21, 47, 45, 39, 31, 42, 22, 37, 9, 12 };
    int[] enemyStrength = { 6, 45, 7, 38, 19, 42, 26, 49, 48, 39, 5, 41, 11, 47, 36, 32, 22, 37, 42, 37, 9, 45, 12, 5, 3, 49, 34, 19, 42, 3, 26, 32, 19, 43, 2, 38, 6, 32, 5, 21, 48, 14, 13, 39, 20, 37, 37, 21, 24, 37 };
    int[] enemyCount = { 3, 17, 2, 42, 39, 15, 9, 32, 9, 27, 20, 14, 13, 5, 41, 12, 43, 37, 16, 45, 30, 17, 7, 12, 26, 32, 18, 6, 14, 34, 2, 3, 47, 50, 30, 1, 26, 9, 33, 30, 16, 27, 42, 44, 50, 45, 34, 34, 3, 28 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case51() {
    int[] magicalGirlStrength = { 42, 9, 34, 37, 42, 35, 28, 12, 17, 16, 50, 11, 26, 32, 22, 43, 40, 40, 45, 4, 25, 49, 44, 24, 10, 6, 45, 23, 5, 36, 50, 5, 35, 35, 13, 45, 11, 21, 9, 41, 32, 26, 2, 45, 21, 25, 22, 23, 20, 49 };
    int[] enemyStrength = { 50, 14, 32, 30, 16, 31, 44, 12, 35, 36, 5, 15, 19, 48, 28, 14, 37, 34, 44, 8, 38, 2, 12, 43, 16, 39, 9, 23, 32, 24, 40, 27, 27, 38, 46, 48, 50, 46, 19, 3, 9, 9, 31, 10, 15, 29, 22, 46, 39, 1 };
    int[] enemyCount = { 41, 10, 4, 46, 36, 39, 6, 23, 13, 11, 1, 27, 44, 46, 37, 22, 25, 35, 29, 12, 29, 16, 15, 2, 26, 11, 28, 16, 50, 9, 12, 25, 20, 4, 24, 1, 44, 17, 10, 49, 8, 8, 9, 39, 42, 13, 11, 2, 23, 10 };
    assertEquals(44, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case52() {
    int[] magicalGirlStrength = { 37, 22, 19, 44, 49, 19, 1, 44, 18, 29, 4, 39, 38, 37, 43, 6, 40, 18, 14, 43, 4, 30, 49, 40, 43, 8, 20, 4, 24, 7, 37, 50, 39, 41, 10, 44, 37, 4, 35, 13, 20, 42, 29, 40, 41, 1, 36, 19, 48, 48 };
    int[] enemyStrength = { 41, 3, 3, 14, 2, 19, 31, 17, 8, 30, 30, 22, 46, 6, 36, 13, 34, 27, 16, 30, 15, 2, 41, 40, 25, 39, 33, 28, 33, 34, 6, 23, 1, 42, 45, 4, 21, 20, 17, 17, 11, 34, 43, 36, 17, 42, 36, 3, 45, 17 };
    int[] enemyCount = { 36, 37, 28, 38, 5, 21, 25, 2, 41, 49, 35, 23, 25, 34, 37, 45, 3, 11, 8, 7, 1, 49, 17, 7, 11, 19, 28, 15, 48, 6, 24, 16, 28, 50, 26, 18, 40, 39, 45, 26, 22, 2, 38, 18, 16, 33, 25, 42, 13, 27 };
    assertEquals(26, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case53() {
    int[] magicalGirlStrength = { 28, 31, 8, 13, 12, 35, 24, 24, 12, 24, 4, 1, 28, 50, 6, 38, 18, 33, 20, 26, 9, 43, 48, 5, 38, 18, 15, 2, 42, 27, 27, 40, 50, 49, 34, 30, 3, 1, 50, 19, 32, 15, 49, 38, 44, 30, 25, 49, 36, 44 };
    int[] enemyStrength = { 49, 33, 15, 23, 45, 31, 4, 30, 14, 31, 24, 32, 23, 20, 40, 12, 28, 3, 20, 14, 28, 24, 47, 49, 19, 18, 43, 7, 3, 15, 34, 1, 37, 25, 50, 42, 32, 13, 2, 10, 31, 16, 17, 23, 43, 27, 13, 21, 5, 29 };
    int[] enemyCount = { 28, 3, 36, 35, 39, 23, 1, 35, 42, 45, 6, 21, 23, 5, 12, 49, 13, 13, 27, 21, 39, 49, 49, 35, 37, 14, 31, 11, 15, 12, 9, 29, 19, 13, 38, 17, 30, 23, 33, 4, 1, 48, 3, 34, 19, 24, 48, 12, 15, 20 };
    assertEquals(27, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case54() {
    int[] magicalGirlStrength = { 15, 39, 3, 15, 3, 14, 7, 10, 38, 23, 40, 22, 37, 42, 17, 27, 17, 21, 39, 27, 7, 31, 39, 5, 36, 16, 4, 6, 24, 44, 50, 15, 39, 41, 42, 43, 45, 41, 14, 19, 15, 25, 29, 40, 7, 23, 18, 11, 45, 17 };
    int[] enemyStrength = { 4, 28, 25, 8, 12, 45, 9, 2, 45, 12, 30, 50, 29, 23, 50, 12, 47, 14, 17, 44, 15, 41, 20, 49, 36, 22, 2, 5, 19, 25, 34, 37, 13, 50, 7, 32, 7, 45, 27, 9, 48, 28, 39, 1, 40, 37, 30, 21, 46, 16 };
    int[] enemyCount = { 4, 11, 26, 21, 48, 41, 24, 12, 43, 3, 8, 30, 37, 18, 46, 1, 28, 21, 5, 10, 24, 23, 8, 25, 10, 26, 36, 12, 42, 40, 28, 33, 3, 48, 22, 50, 28, 20, 8, 7, 3, 39, 38, 43, 27, 35, 29, 48, 13, 16 };
    assertEquals(193, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case55() {
    int[] magicalGirlStrength = { 36, 49, 7, 27, 33, 8, 2, 10, 43, 17, 24, 11, 28, 22, 27, 21, 47, 19, 11, 18, 29, 8, 24, 10, 14, 3, 12, 31, 33, 22, 42, 32, 11, 48, 39, 8, 34, 28, 8, 24, 18, 6, 29, 32, 40, 47, 47, 50, 15, 46 };
    int[] enemyStrength = { 26, 11, 5, 8, 9, 46, 15, 49, 22, 15, 8, 44, 12, 23, 42, 30, 38, 38, 9, 11, 19, 6, 25, 7, 29, 18, 20, 26, 4, 37, 28, 44, 1, 31, 35, 10, 15, 1, 43, 50, 13, 16, 19, 36, 33, 18, 43, 9, 22, 47 };
    int[] enemyCount = { 4, 24, 6, 8, 49, 33, 44, 25, 39, 44, 35, 15, 27, 13, 5, 12, 38, 11, 1, 35, 12, 15, 10, 12, 36, 27, 28, 29, 42, 39, 4, 40, 24, 1, 21, 3, 6, 49, 9, 39, 48, 28, 8, 36, 10, 37, 37, 13, 24, 30 };
    assertEquals(39, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case56() {
    int[] magicalGirlStrength = { 26, 98, 23, 91, 21, 2, 20, 7, 19, 45, 44, 50, 22, 39, 71, 28, 7, 77, 15, 17, 3, 1, 64, 87, 37, 67, 19, 86, 8, 87, 39, 6, 55, 70, 61, 53, 83, 52, 37, 97, 7, 7, 83, 17, 21, 99, 60, 75, 45, 62 };
    int[] enemyStrength = { 79, 42, 19, 60, 67, 98, 44, 73, 31, 79, 83, 35, 16, 15, 21, 38, 40, 48, 66, 61, 21, 5, 33, 12, 74, 63, 80, 18, 95, 43, 96, 46, 25, 43, 64, 5, 63, 33, 71, 25, 78, 62, 39, 38, 69, 15, 14, 39, 29, 1 };
    int[] enemyCount = { 32, 10, 23, 2, 50, 50, 12, 45, 92, 58, 55, 32, 51, 72, 90, 75, 2, 22, 65, 73, 33, 53, 73, 70, 29, 89, 44, 19, 19, 27, 23, 20, 84, 9, 26, 48, 98, 53, 6, 71, 41, 23, 84, 80, 24, 95, 3, 15, 60, 99 };
    assertEquals(54, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case57() {
    int[] magicalGirlStrength = { 38, 88, 10, 54, 52, 39, 8, 47, 32, 80, 88, 75, 68, 83, 29, 56, 88, 94, 40, 28, 41, 43, 14, 47, 79, 43, 2, 50, 39, 11, 46, 96, 59, 45, 93, 68, 59, 56, 37, 87, 68, 13, 81, 16, 85, 18, 15, 2, 26, 19 };
    int[] enemyStrength = { 29, 31, 52, 84, 26, 99, 76, 63, 47, 64, 65, 75, 36, 86, 74, 58, 16, 3, 68, 95, 78, 7, 48, 23, 14, 1, 76, 18, 12, 12, 98, 62, 86, 58, 69, 1, 90, 3, 98, 57, 24, 84, 3, 33, 47, 83, 46, 36, 34, 14 };
    int[] enemyCount = { 7, 20, 79, 2, 8, 35, 95, 18, 70, 51, 48, 95, 31, 60, 17, 64, 11, 97, 90, 6, 2, 54, 33, 76, 45, 16, 14, 12, 94, 60, 69, 40, 82, 43, 93, 75, 22, 1, 71, 41, 50, 44, 49, 46, 89, 96, 11, 26, 89, 5 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case58() {
    int[] magicalGirlStrength = { 36, 75, 88, 37, 88, 57, 45, 65, 75, 32, 52, 25, 22, 78, 7, 6, 42, 79, 34, 57, 24, 23, 50, 100, 12, 6, 68, 87, 51, 75, 86, 83, 38, 25, 43, 45, 22, 47, 48, 7, 44, 83, 33, 94, 90, 93, 11, 66, 79, 29 };
    int[] enemyStrength = { 75, 26, 99, 31, 20, 45, 10, 28, 22, 30, 83, 83, 91, 26, 75, 91, 34, 10, 60, 58, 24, 21, 84, 27, 70, 45, 15, 45, 77, 84, 19, 90, 43, 57, 41, 13, 98, 6, 64, 29, 84, 86, 23, 20, 11, 27, 75, 95, 8, 55 };
    int[] enemyCount = { 6, 21, 76, 72, 51, 57, 10, 23, 100, 65, 41, 61, 83, 37, 74, 68, 66, 27, 51, 73, 39, 9, 27, 82, 43, 81, 100, 27, 92, 62, 29, 45, 56, 28, 77, 67, 80, 12, 97, 2, 89, 34, 11, 14, 1, 47, 66, 2, 68, 41 };
    assertEquals(158, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case59() {
    int[] magicalGirlStrength = { 18, 78, 40, 50, 36, 17, 82, 30, 92, 3, 44, 67, 54, 79, 61, 36, 60, 75, 92, 24, 1, 66, 61, 43, 98, 1, 66, 22, 16, 17, 82, 97, 73, 71, 35, 5, 8, 39, 32, 17, 63, 90, 85, 89, 59, 59, 53, 72, 77, 49 };
    int[] enemyStrength = { 54, 45, 62, 73, 44, 14, 35, 71, 79, 43, 81, 100, 70, 35, 25, 18, 14, 9, 36, 85, 30, 91, 77, 21, 86, 53, 65, 48, 99, 60, 67, 53, 69, 38, 26, 91, 76, 19, 76, 81, 32, 16, 81, 94, 55, 20, 17, 53, 67, 61 };
    int[] enemyCount = { 49, 1, 92, 36, 6, 8, 17, 84, 42, 13, 31, 48, 14, 20, 59, 67, 99, 16, 32, 26, 80, 96, 65, 36, 28, 74, 17, 64, 17, 71, 3, 48, 66, 22, 21, 53, 80, 23, 94, 71, 89, 25, 10, 10, 52, 59, 17, 34, 96, 26 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case60() {
    int[] magicalGirlStrength = { 43, 1, 43, 3, 48, 5, 97, 68, 69, 9, 6, 68, 43, 74, 26, 23, 24, 1, 72, 65, 1, 54, 3, 62, 83, 77, 63, 42, 64, 81, 19, 25, 42, 34, 21, 23, 58, 80, 42, 78, 20, 93, 54, 66, 53, 95, 95, 42, 35, 52 };
    int[] enemyStrength = { 5, 41, 8, 42, 58, 76, 74, 54, 92, 82, 73, 69, 95, 85, 82, 99, 28, 31, 96, 81, 48, 76, 65, 80, 65, 6, 60, 68, 84, 82, 76, 20, 90, 68, 30, 41, 79, 2, 67, 93, 19, 35, 13, 82, 56, 59, 23, 88, 85, 46 };
    int[] enemyCount = { 93, 56, 10, 68, 19, 12, 26, 81, 9, 9, 35, 36, 18, 87, 75, 28, 37, 9, 25, 100, 94, 38, 45, 1, 22, 29, 39, 72, 24, 6, 52, 28, 53, 70, 76, 83, 65, 26, 7, 98, 45, 65, 2, 71, 22, 55, 93, 65, 64, 1 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case61() {
    int[] magicalGirlStrength = { 85, 34, 32, 96, 100, 70, 70, 34, 13, 35, 57, 16, 48, 69, 26, 5, 33, 32, 75, 64, 18, 87, 34, 33, 63, 7, 68, 94, 51, 37, 50, 32, 91, 2, 56, 43, 82, 6, 94, 43, 17, 18, 17, 81, 31, 70, 99, 4, 96, 89 };
    int[] enemyStrength = { 68, 27, 22, 50, 12, 4, 16, 92, 82, 93, 32, 81, 100, 40, 43, 7, 41, 25, 59, 77, 22, 84, 8, 86, 73, 32, 90, 3, 39, 83, 90, 90, 52, 57, 39, 54, 44, 32, 33, 72, 39, 57, 93, 40, 62, 68, 76, 58, 32, 76 };
    int[] enemyCount = { 36, 85, 88, 99, 82, 51, 71, 62, 8, 47, 95, 19, 28, 21, 42, 89, 51, 82, 69, 55, 41, 58, 31, 39, 15, 52, 44, 98, 18, 23, 100, 31, 1, 20, 12, 9, 98, 34, 48, 10, 35, 8, 66, 71, 56, 40, 38, 38, 55, 76 };
    assertEquals(58, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case62() {
    int[] magicalGirlStrength = { 4, 11, 92, 16, 46, 80, 13, 91, 28, 82, 62, 23, 3, 1, 77, 70, 8, 6, 86, 4, 3, 64, 25, 43, 82, 89, 17, 72, 54, 4, 15, 77, 45, 71, 16, 37, 78, 16, 25, 17, 64, 59, 24, 64, 66, 1, 62, 42, 94, 63 };
    int[] enemyStrength = { 21, 16, 22, 58, 10, 39, 54, 32, 26, 50, 11, 46, 95, 50, 34, 34, 98, 40, 68, 28, 2, 37, 100, 34, 91, 21, 61, 80, 12, 47, 82, 56, 47, 8, 18, 68, 11, 60, 84, 95, 6, 34, 65, 76, 39, 85, 2, 56, 65, 79 };
    int[] enemyCount = { 20, 61, 86, 76, 28, 6, 15, 36, 86, 44, 12, 36, 62, 38, 9, 48, 40, 59, 71, 5, 34, 97, 6, 20, 17, 18, 12, 11, 69, 85, 97, 86, 87, 10, 1, 26, 27, 90, 28, 39, 11, 58, 62, 84, 23, 11, 40, 6, 12, 37 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case63() {
    int[] magicalGirlStrength = { 44, 96, 45, 29, 86, 66, 67, 98, 8, 26, 7, 95, 96, 3, 46, 58, 17, 31, 33, 57, 54, 99, 97, 73, 96, 40, 92, 76, 54, 41, 98, 33, 72, 37, 31, 99, 16, 76, 31, 56, 48, 67, 40, 17, 77, 7, 16, 91, 41, 26 };
    int[] enemyStrength = { 46, 23, 11, 28, 68, 28, 15, 36, 21, 80, 81, 83, 66, 25, 2, 51, 53, 7, 81, 56, 94, 7, 85, 26, 11, 29, 89, 75, 4, 47, 4, 15, 14, 83, 82, 50, 13, 92, 7, 76, 8, 29, 58, 18, 36, 31, 97, 85, 66, 53 };
    int[] enemyCount = { 60, 34, 57, 31, 85, 91, 40, 36, 25, 98, 48, 79, 91, 67, 47, 89, 51, 44, 96, 9, 8, 16, 31, 69, 81, 62, 15, 2, 53, 3, 59, 5, 52, 100, 65, 70, 29, 15, 86, 23, 38, 35, 3, 14, 92, 2, 80, 96, 74, 100 };
    assertEquals(61, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case64() {
    int[] magicalGirlStrength = { 29, 73, 50, 40, 44, 23, 81, 45, 73, 1, 97, 81, 51, 70, 91, 79, 67, 29, 78, 89, 10, 63, 22, 95, 42, 33, 74, 2, 47, 50, 65, 43, 69, 44, 64, 12, 4, 96, 97, 56, 13, 59, 64, 1, 24, 20, 39, 32, 76, 28 };
    int[] enemyStrength = { 27, 14, 11, 31, 85, 37, 83, 67, 91, 47, 43, 34, 75, 95, 32, 1, 15, 82, 70, 94, 28, 18, 19, 30, 50, 46, 87, 86, 31, 83, 87, 93, 2, 80, 5, 30, 61, 36, 53, 44, 41, 38, 16, 90, 34, 6, 52, 83, 19, 94 };
    int[] enemyCount = { 34, 29, 22, 39, 96, 5, 41, 34, 93, 25, 56, 41, 64, 51, 88, 37, 52, 23, 62, 56, 32, 23, 52, 70, 71, 9, 32, 67, 72, 26, 73, 53, 96, 30, 52, 52, 79, 86, 99, 98, 14, 9, 93, 88, 51, 72, 88, 66, 99, 98 };
    assertEquals(144, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case65() {
    int[] magicalGirlStrength = { 86, 80, 66, 99, 87, 3, 88, 29, 40, 88, 17, 41, 63, 92, 10, 36, 60, 1, 55, 80, 68, 40, 74, 83, 76, 6, 40, 10, 24, 80, 13, 81, 6, 18, 83, 23, 29, 36, 14, 3, 39, 62, 55, 19, 3, 21, 15, 25, 86, 39 };
    int[] enemyStrength = { 24, 54, 25, 19, 13, 36, 61, 100, 76, 52, 70, 6, 38, 40, 21, 75, 17, 89, 89, 94, 53, 95, 93, 86, 83, 33, 76, 28, 20, 95, 33, 58, 83, 85, 61, 52, 14, 43, 17, 20, 32, 95, 11, 36, 12, 88, 21, 87, 43, 42 };
    int[] enemyCount = { 5, 94, 44, 64, 28, 64, 79, 47, 46, 84, 19, 95, 10, 54, 15, 1, 10, 24, 74, 37, 26, 81, 23, 69, 60, 59, 82, 45, 40, 16, 39, 75, 60, 19, 60, 39, 24, 64, 77, 100, 99, 25, 6, 3, 34, 93, 47, 39, 12, 22 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case66() {
    int[] magicalGirlStrength = { 39, 48, 92, 66, 31, 70, 45, 61, 19, 8, 2, 24, 16, 42, 60, 13, 56, 70, 19, 68, 80, 64, 4, 81, 90, 99, 78, 84, 19, 96, 57, 52, 84, 71, 32, 96, 5, 89, 91, 86, 1, 52, 67, 37, 95, 64, 95, 42, 80, 47 };
    int[] enemyStrength = { 70, 26, 84, 20, 70, 54, 48, 63, 64, 99, 20, 54, 30, 51, 2, 65, 49, 27, 9, 58, 39, 48, 25, 90, 1, 10, 81, 59, 61, 98, 77, 12, 86, 48, 37, 27, 100, 29, 10, 28, 28, 64, 15, 23, 83, 57, 88, 64, 14, 7 };
    int[] enemyCount = { 88, 18, 11, 25, 56, 3, 95, 31, 70, 91, 86, 8, 26, 56, 93, 30, 84, 77, 60, 42, 64, 78, 89, 47, 88, 27, 2, 95, 3, 100, 82, 19, 32, 77, 84, 7, 96, 79, 35, 48, 45, 91, 83, 57, 26, 28, 41, 78, 26, 16 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case67() {
    int[] magicalGirlStrength = { 14, 88, 21, 1, 17, 23, 54, 66, 80, 16, 50, 3, 37, 18, 25, 67, 93, 82, 4, 35, 27, 99, 37, 90, 40, 65, 66, 55, 78, 59, 34, 18, 81, 38, 76, 85, 56, 66, 72, 32, 39, 11, 96, 66, 48, 73, 45, 68, 5, 78 };
    int[] enemyStrength = { 99, 55, 19, 86, 87, 47, 45, 93, 72, 18, 5, 33, 90, 41, 24, 33, 60, 92, 4, 53, 84, 83, 86, 9, 50, 29, 51, 83, 29, 14, 30, 36, 45, 67, 24, 12, 46, 78, 4, 50, 62, 16, 28, 25, 91, 73, 74, 47, 86, 4 };
    int[] enemyCount = { 5, 54, 4, 26, 66, 6, 15, 29, 15, 27, 31, 5, 39, 96, 64, 54, 37, 90, 66, 22, 89, 90, 64, 50, 55, 29, 48, 97, 94, 100, 20, 82, 20, 74, 38, 42, 32, 81, 85, 30, 89, 12, 72, 21, 70, 31, 27, 100, 20, 15 };
    assertEquals(115, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case68() {
    int[] magicalGirlStrength = { 43, 94, 40, 43, 49, 35, 85, 19, 33, 25, 24, 55, 55, 28, 53, 45, 39, 54, 78, 80, 57, 66, 100, 65, 28, 36, 59, 49, 95, 99, 57, 67, 4, 83, 21, 8, 65, 46, 73, 39, 32, 69, 71, 10, 73, 69, 93, 65, 65, 11 };
    int[] enemyStrength = { 74, 56, 68, 56, 53, 77, 46, 47, 93, 81, 34, 14, 50, 79, 48, 59, 87, 99, 100, 53, 21, 20, 78, 73, 83, 90, 46, 29, 44, 7, 22, 56, 24, 11, 29, 100, 58, 32, 96, 37, 9, 3, 31, 74, 51, 85, 12, 38, 22, 17 };
    int[] enemyCount = { 90, 77, 11, 57, 32, 87, 82, 83, 15, 32, 5, 33, 97, 20, 70, 73, 56, 21, 86, 93, 46, 12, 5, 16, 9, 65, 22, 69, 92, 94, 44, 87, 89, 19, 2, 96, 77, 26, 96, 85, 7, 24, 52, 14, 87, 6, 98, 5, 78, 33 };
    assertEquals(182, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case69() {
    int[] magicalGirlStrength = { 17, 35, 56, 11, 14, 51, 69, 13, 85, 3, 26, 88, 79, 5, 10, 13, 59, 3, 22, 39, 96, 81, 89, 50, 80, 98, 42, 89, 5, 10, 74, 35, 13, 12, 8, 84, 43, 96, 87, 37, 16, 61, 78, 66, 26, 49, 1, 66, 65, 52 };
    int[] enemyStrength = { 100, 7, 65, 88, 13, 15, 40, 8, 55, 15, 85, 55, 30, 53, 68, 46, 42, 54, 12, 96, 39, 93, 15, 1, 44, 41, 75, 27, 58, 59, 49, 9, 64, 90, 52, 93, 92, 20, 64, 21, 84, 26, 15, 31, 57, 94, 20, 90, 33, 25 };
    int[] enemyCount = { 38, 76, 78, 47, 62, 99, 3, 24, 28, 39, 89, 59, 86, 42, 94, 73, 38, 27, 75, 2, 49, 52, 73, 31, 100, 14, 22, 94, 44, 20, 77, 75, 91, 83, 95, 31, 60, 30, 27, 81, 57, 85, 46, 35, 78, 62, 90, 52, 41, 80 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case70() {
    int[] magicalGirlStrength = { 35, 74, 71, 64, 9, 24, 87, 35, 22, 29, 74, 11, 31, 42, 29, 84, 65, 12, 89, 12, 78, 33, 56, 60, 2, 63, 41, 24, 87, 12, 66, 92, 22, 74, 75, 90, 6, 63, 54, 15, 49, 46, 96, 54, 62, 98, 70, 26, 55, 40 };
    int[] enemyStrength = { 81, 8, 12, 95, 41, 58, 1, 59, 42, 31, 68, 15, 5, 24, 92, 48, 68, 57, 63, 91, 63, 35, 42, 26, 25, 43, 23, 47, 69, 94, 15, 56, 32, 54, 7, 59, 42, 60, 93, 5, 78, 84, 88, 4, 47, 13, 85, 24, 39, 14 };
    int[] enemyCount = { 97, 97, 38, 73, 76, 3, 25, 95, 81, 46, 79, 90, 89, 44, 7, 50, 69, 39, 28, 99, 13, 2, 50, 85, 65, 7, 77, 77, 37, 3, 78, 45, 38, 56, 59, 83, 94, 54, 81, 61, 94, 68, 74, 31, 55, 4, 97, 88, 53, 47 };
    assertEquals(88, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case71() {
    int[] magicalGirlStrength = { 25, 6, 5, 97, 74, 62, 89, 41, 37, 37, 35, 68, 24, 18, 68, 1, 82, 36, 35, 60, 86, 100, 59, 9, 35, 30, 4, 11, 85, 55, 55, 87, 59, 88, 78, 77, 48, 29, 27, 2, 91, 56, 63, 31, 73, 15, 84, 68, 35, 37 };
    int[] enemyStrength = { 9, 48, 99, 44, 61, 73, 15, 90, 21, 68, 27, 3, 42, 51, 15, 63, 4, 21, 4, 27, 79, 81, 49, 18, 16, 11, 27, 7, 47, 37, 80, 78, 92, 33, 51, 86, 98, 13, 63, 91, 22, 50, 14, 44, 81, 71, 3, 18, 73, 66 };
    int[] enemyCount = { 29, 58, 9, 77, 84, 87, 12, 13, 1, 41, 20, 63, 46, 47, 29, 33, 24, 68, 10, 27, 7, 36, 17, 27, 3, 96, 98, 17, 94, 58, 33, 76, 30, 30, 83, 67, 7, 56, 91, 98, 97, 75, 96, 35, 48, 90, 9, 77, 91, 74 };
    assertEquals(60, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case72() {
    int[] magicalGirlStrength = { 45, 38, 12, 14, 39, 93, 66, 60, 46, 27, 10, 3, 82, 18, 61, 78, 68, 73, 6, 58, 79, 86, 25, 17, 56, 3, 38, 17, 8, 58, 37, 11, 32, 34, 29, 92, 81, 52, 82, 91, 27, 92, 91, 11, 86, 66, 54, 56, 16, 73 };
    int[] enemyStrength = { 38, 87, 62, 94, 64, 39, 4, 75, 87, 1, 89, 57, 48, 58, 82, 26, 55, 3, 98, 94, 26, 81, 50, 56, 75, 36, 25, 39, 60, 25, 91, 55, 77, 34, 35, 89, 55, 32, 61, 21, 90, 26, 53, 4, 65, 86, 36, 84, 44, 57 };
    int[] enemyCount = { 64, 56, 61, 95, 14, 11, 59, 2, 32, 15, 39, 6, 48, 49, 15, 6, 26, 94, 60, 79, 33, 77, 44, 43, 95, 33, 25, 74, 10, 21, 2, 69, 67, 15, 28, 67, 11, 53, 28, 27, 24, 88, 20, 81, 70, 11, 5, 2, 10, 18 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case73() {
    int[] magicalGirlStrength = { 3, 56, 95, 42, 2, 60, 90, 54, 28, 2, 55, 68, 52, 27, 80, 75, 43, 91, 9, 67, 35, 62, 7, 80, 74, 56, 22, 4, 59, 42, 22, 92, 15, 44, 29, 39, 29, 76, 57, 25, 62, 75, 94, 88, 40, 88, 11, 60, 64, 77 };
    int[] enemyStrength = { 92, 3, 18, 69, 53, 6, 97, 54, 59, 23, 17, 49, 50, 85, 53, 73, 30, 88, 57, 56, 82, 49, 27, 62, 28, 3, 86, 89, 26, 83, 44, 40, 52, 53, 19, 87, 81, 27, 79, 94, 28, 10, 89, 31, 71, 40, 35, 44, 97, 22 };
    int[] enemyCount = { 47, 44, 75, 17, 82, 99, 79, 24, 24, 57, 31, 64, 84, 23, 52, 16, 53, 95, 84, 61, 46, 72, 73, 46, 32, 20, 77, 28, 77, 91, 49, 9, 59, 98, 7, 46, 20, 70, 28, 27, 76, 74, 89, 90, 76, 28, 8, 85, 51, 47 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case74() {
    int[] magicalGirlStrength = { 44, 86, 94, 100, 98, 36, 8, 68, 52, 38, 21, 38, 74, 80, 8, 9, 41, 33, 98, 26, 77, 19, 18, 44, 92, 34, 46, 5, 7, 66, 37, 85, 52, 7, 82, 10, 14, 71, 86, 87, 58, 13, 37, 22, 98, 28, 61, 89, 72, 37 };
    int[] enemyStrength = { 64, 35, 2, 74, 16, 98, 43, 36, 19, 80, 25, 22, 7, 12, 27, 49, 43, 29, 86, 97, 22, 58, 54, 69, 48, 57, 78, 93, 51, 66, 82, 66, 67, 58, 38, 73, 97, 13, 59, 95, 64, 12, 13, 17, 69, 45, 13, 87, 77, 6 };
    int[] enemyCount = { 73, 52, 67, 93, 33, 46, 20, 3, 26, 80, 2, 41, 92, 49, 70, 74, 88, 70, 72, 3, 50, 88, 29, 6, 95, 40, 59, 30, 42, 39, 79, 24, 12, 92, 82, 62, 94, 65, 2, 31, 39, 37, 7, 91, 51, 57, 72, 84, 45, 2 };
    assertEquals(65, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case75() {
    int[] magicalGirlStrength = { 85, 16, 68, 94, 73, 45, 77, 24, 49, 18, 22, 100, 61, 67, 74, 97, 98, 44, 72, 10, 86, 86, 97, 68, 62, 28, 65, 1, 58, 30, 24, 67, 59, 73, 65, 24, 62, 23, 4, 48, 14, 76, 71, 26, 92, 47, 64, 50, 42, 36 };
    int[] enemyStrength = { 67, 44, 62, 44, 82, 78, 63, 29, 26, 16, 55, 21, 20, 19, 61, 91, 60, 94, 35, 86, 82, 100, 42, 81, 1, 48, 57, 51, 70, 36, 98, 40, 29, 51, 49, 36, 37, 82, 1, 43, 92, 32, 2, 7, 29, 56, 11, 8, 94, 28 };
    int[] enemyCount = { 5, 93, 35, 29, 97, 85, 15, 41, 19, 20, 25, 73, 34, 90, 77, 10, 70, 38, 28, 47, 61, 23, 51, 62, 10, 75, 66, 68, 6, 97, 11, 8, 3, 61, 42, 35, 79, 68, 47, 97, 83, 24, 41, 67, 20, 31, 18, 89, 39, 31 };
    assertEquals(70, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case76() {
    int[] magicalGirlStrength = { 14, 6, 22 };
    int[] enemyStrength = { 8, 33 };
    int[] enemyCount = { 9, 1 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case77() {
    int[] magicalGirlStrength = { 17, 10, 29, 48, 92, 60, 80, 100, 15, 69, 36, 43, 70, 14, 88, 12, 14, 29, 9, 40 };
    int[] enemyStrength = { 93, 100, 27, 68, 48, 82, 15, 95, 61, 49, 68, 15, 16, 26, 64, 82, 7, 8, 92, 15 };
    int[] enemyCount = { 56, 26, 12, 52, 5, 19, 93, 36, 69, 61, 68, 66, 55, 28, 49, 55, 63, 57, 33, 45 };
    assertEquals(118, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case78() {
    int[] magicalGirlStrength = { 17, 10, 29, 48, 92, 60, 80, 100, 15, 69, 36, 43, 70, 14, 88, 12, 14, 29, 9, 40 };
    int[] enemyStrength = { 93, 59, 27, 68, 48, 82, 15, 95, 61, 49, 68, 15, 65, 26, 64, 82, 7, 8, 92, 15 };
    int[] enemyCount = { 56, 26, 21, 52, 5, 19, 93, 36, 69, 61, 68, 66, 55, 28, 49, 55, 63, 57, 33, 45 };
    assertEquals(92, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case79() {
    int[] magicalGirlStrength = { 2, 3, 5 };
    int[] enemyStrength = { 1, 3, 4 };
    int[] enemyCount = { 2, 9, 4 };
    assertEquals(7, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case80() {
    int[] magicalGirlStrength = { 1, 2 };
    int[] enemyStrength = { 2 };
    int[] enemyCount = { 5 };
    assertEquals(5, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case81() {
    int[] magicalGirlStrength = { 1, 1 };
    int[] enemyStrength = { 1, 1, 1 };
    int[] enemyCount = { 50, 50, 50 };
    assertEquals(75, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case82() {
    int[] magicalGirlStrength = { 2, 3, 4, 5, 10 };
    int[] enemyStrength = { 1, 2, 3, 7, 9 };
    int[] enemyCount = { 1, 1, 5, 15, 99 };
    assertEquals(114, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case83() {
    int[] magicalGirlStrength = { 1, 2 };
    int[] enemyStrength = { 1, 1, 3 };
    int[] enemyCount = { 1, 1, 1 };
    assertEquals(-1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case84() {
    int[] magicalGirlStrength = { 14, 6, 22, 50 };
    int[] enemyStrength = { 8, 33, 6, 35, 20 };
    int[] enemyCount = { 9, 1, 3, 4, 30 };
    assertEquals(18, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case85() {
    int[] magicalGirlStrength = { 17, 10, 29, 48, 92, 60, 80, 100, 15, 69, 36, 43, 70, 14, 88, 12, 14, 29, 9, 40 };
    int[] enemyStrength = { 93, 59, 27, 68, 48, 82, 15, 95, 61, 49, 68, 15, 16, 26, 64, 82, 7, 8, 92, 15 };
    int[] enemyCount = { 56, 26, 12, 52, 5, 19, 93, 36, 69, 61, 68, 66, 55, 28, 49, 55, 63, 57, 33, 45 };
    assertEquals(92, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case86() {
    int[] magicalGirlStrength = { 1 };
    int[] enemyStrength = { 1 };
    int[] enemyCount = { 1 };
    assertEquals(1, spacewardiv2.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

}
