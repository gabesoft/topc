package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TeamsSelectionTest {
  TeamsSelection teamsselection = new TeamsSelection();

  @Test
  public void case1() {
    int[] preference1 = { 1, 2, 3, 4 };
    int[] preference2 = { 1, 2, 3, 4 };
    assertEquals("1212", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case2() {
    int[] preference1 = { 3, 2, 1 };
    int[] preference2 = { 1, 3, 2 };
    assertEquals("211", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case3() {
    int[] preference1 = { 6, 1, 5, 2, 3, 4 };
    int[] preference2 = { 1, 6, 3, 4, 5, 2 };
    assertEquals("212211", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case4() {
    int[] preference1 = { 8, 7, 1, 2, 4, 5, 6, 3, 9 };
    int[] preference2 = { 7, 2, 4, 8, 1, 5, 9, 6, 3 };
    assertEquals("121121212", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case5() {
    int[] preference1 = { 1, 2 };
    int[] preference2 = { 1, 2 };
    assertEquals("12", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case6() {
    int[] preference1 = { 3, 1, 4, 2, 5 };
    int[] preference2 = { 4, 2, 1, 5, 3 };
    assertEquals("12121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case7() {
    int[] preference1 = { 12, 10, 13, 4, 5, 1, 11, 2, 8, 3, 6, 7, 9 };
    int[] preference2 = { 2, 10, 13, 12, 9, 7, 8, 11, 6, 5, 1, 4, 3 };
    assertEquals("1211122221112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case8() {
    int[] preference1 = { 5, 8, 2, 4, 1, 7, 6, 9, 12, 10, 3, 11 };
    int[] preference2 = { 3, 5, 8, 11, 1, 10, 6, 9, 7, 4, 12, 2 };
    assertEquals("212112111222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case9() {
    int[] preference1 = { 2, 1, 5, 4, 12, 7, 10, 3, 9, 6, 13, 8, 11, 14 };
    int[] preference2 = { 13, 7, 4, 14, 10, 8, 9, 3, 12, 1, 6, 5, 2, 11 };
    assertEquals("11121122212122", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case10() {
    int[] preference1 = { 6, 7, 11, 14, 12, 3, 5, 13, 9, 10, 1, 8, 2, 4 };
    int[] preference2 = { 12, 10, 5, 6, 9, 4, 7, 11, 3, 2, 13, 14, 1, 8 };
    assertEquals("12122112221211", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case11() {
    int[] preference1 = { 5, 6, 1, 2, 3, 7, 8, 9, 10, 4 };
    int[] preference2 = { 9, 8, 2, 10, 6, 7, 4, 5, 1, 3 };
    assertEquals("1212111222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case12() {
    int[] preference1 = { 1, 8, 12, 15, 13, 14, 10, 3, 7, 11, 9, 16, 6, 5, 2, 4 };
    int[] preference2 = { 15, 16, 4, 7, 12, 6, 14, 2, 13, 5, 10, 1, 11, 9, 3, 8 };
    assertEquals("1212222121111122", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case13() {
    int[] preference1 = { 17, 12, 11, 8, 5, 19, 10, 14, 13, 16, 7, 15, 2, 6, 3, 4, 1, 9, 18 };
    int[] preference2 = { 12, 9, 6, 10, 5, 14, 13, 8, 16, 18, 17, 7, 4, 11, 1, 3, 15, 19, 2 };
    assertEquals("2112121122121212121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case14() {
    int[] preference1 = { 3, 7, 2, 1, 12, 8, 6, 4, 9, 11, 10, 13, 5 };
    int[] preference2 = { 13, 7, 3, 8, 2, 9, 6, 12, 1, 5, 10, 4, 11 };
    assertEquals("1111221222112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case15() {
    int[] preference1 = { 11, 4, 1, 3, 15, 6, 17, 2, 16, 14, 7, 10, 8, 13, 5, 9, 12 };
    int[] preference2 = { 2, 17, 16, 11, 8, 9, 14, 5, 1, 13, 4, 6, 10, 15, 3, 12, 7 };
    assertEquals("12112112211122122", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case16() {
    int[] preference1 = { 1, 6, 4, 11, 12, 10, 7, 3, 2, 8, 9, 5 };
    int[] preference2 = { 11, 6, 3, 12, 2, 4, 5, 10, 1, 9, 7, 8 };
    assertEquals("122121112122", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case17() {
    int[] preference1 = { 15, 13, 6, 25, 17, 10, 2, 21, 26, 1, 9, 11, 8, 4, 27, 23, 28, 14, 16, 20, 22, 12, 18, 19, 30, 24, 29, 7, 3, 5 };
    int[] preference2 = { 26, 6, 30, 19, 12, 28, 18, 16, 9, 23, 10, 29, 27, 11, 21, 1, 4, 25, 5, 2, 20, 17, 14, 24, 13, 7, 3, 22, 15, 8 };
    assertEquals("112122111112111212221122122222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case18() {
    int[] preference1 = { 17, 16, 26, 4, 3, 28, 12, 19, 15, 23, 8, 7, 18, 10, 5, 29, 25, 9, 11, 1, 2, 20, 24, 30, 22, 6, 21, 27, 13, 14, 31 };
    int[] preference2 = { 14, 5, 28, 16, 23, 15, 10, 17, 1, 22, 4, 27, 31, 9, 6, 25, 30, 2, 29, 26, 8, 13, 19, 12, 11, 7, 21, 24, 3, 20, 18 };
    assertEquals("2111221122112221111122211122122", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case19() {
    int[] preference1 = { 17, 9, 14, 1, 27, 21, 18, 30, 31, 16, 15, 32, 26, 6, 7, 4, 24, 5, 29, 19, 12, 2, 11, 20, 10, 3, 25, 23, 13, 22, 28, 8 };
    int[] preference2 = { 3, 24, 7, 18, 22, 29, 8, 28, 31, 25, 16, 4, 17, 12, 26, 15, 10, 21, 14, 30, 1, 19, 6, 20, 9, 27, 32, 2, 11, 5, 13, 23 };
    assertEquals("11221122122221111222121221122111", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case20() {
    int[] preference1 = { 3, 34, 11, 18, 30, 38, 13, 25, 36, 24, 21, 9, 32, 1, 23, 4, 19, 10, 26, 33, 15, 20, 8, 31, 27, 5, 14, 39, 29, 16, 22, 7, 17, 12, 35, 2, 28, 6, 37 };
    int[] preference2 = { 9, 6, 18, 27, 29, 17, 22, 36, 32, 8, 31, 15, 12, 16, 30, 28, 35, 1, 38, 7, 23, 3, 24, 4, 34, 14, 21, 5, 37, 2, 10, 13, 39, 25, 11, 19, 26, 20, 33 };
    assertEquals("111122222112122222111211112221221121211", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case21() {
    int[] preference1 = { 6, 13, 23, 24, 10, 3, 5, 14, 9, 4, 11, 27, 21, 26, 18, 15, 19, 8, 7, 16, 25, 28, 12, 22, 1, 30, 17, 2, 20, 29 };
    int[] preference2 = { 16, 20, 4, 25, 23, 11, 7, 22, 6, 5, 10, 3, 15, 26, 24, 8, 13, 1, 21, 2, 14, 19, 28, 17, 29, 9, 30, 12, 18, 27 };
    assertEquals("221211221121112221121211221221", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case22() {
    int[] preference1 = { 26, 28, 10, 12, 14, 9, 21, 27, 17, 11, 25, 19, 30, 38, 4, 32, 29, 39, 13, 8, 22, 5, 15, 37, 35, 23, 2, 33, 3, 34, 7, 16, 24, 36, 6, 1, 20, 18, 31 };
    int[] preference2 = { 1, 32, 38, 33, 39, 17, 18, 3, 4, 37, 30, 20, 14, 23, 22, 2, 29, 19, 6, 11, 36, 8, 13, 31, 10, 27, 34, 26, 15, 21, 9, 25, 35, 7, 12, 24, 16, 5, 28 };
    assertEquals("222212111111111122121222111112222112222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case23() {
    int[] preference1 = { 1, 26, 19, 5, 11, 23, 34, 20, 22, 21, 2, 6, 12, 7, 17, 9, 4, 3, 16, 30, 32, 28, 13, 31, 14, 27, 24, 10, 29, 8, 25, 33, 18, 15 };
    int[] preference2 = { 12, 29, 10, 11, 25, 34, 2, 30, 6, 18, 21, 26, 22, 5, 33, 1, 27, 32, 15, 19, 7, 28, 9, 4, 20, 31, 17, 8, 3, 13, 24, 23, 16, 14 };
    assertEquals("1211121212221121121111122122222221", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case24() {
    int[] preference1 = { 21, 7, 27, 23, 19, 14, 26, 16, 10, 8, 28, 3, 15, 29, 13, 24, 5, 31, 1, 30, 18, 4, 22, 9, 11, 25, 12, 2, 6, 20, 17 };
    int[] preference2 = { 30, 26, 7, 12, 3, 29, 1, 17, 11, 31, 28, 2, 10, 6, 18, 9, 16, 25, 14, 5, 24, 23, 15, 8, 21, 4, 19, 27, 20, 22, 13 };
    assertEquals("2221121121221111221211112211222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case25() {
    int[] preference1 = { 11, 6, 2, 16, 4, 5, 35, 34, 23, 33, 12, 8, 3, 28, 13, 19, 27, 31, 26, 17, 18, 25, 7, 14, 1, 32, 22, 10, 29, 21, 15, 9, 24, 20, 30 };
    int[] preference2 = { 13, 22, 6, 33, 32, 31, 23, 29, 10, 30, 35, 14, 20, 12, 3, 7, 27, 26, 25, 4, 9, 2, 15, 21, 28, 34, 5, 11, 17, 1, 16, 8, 24, 18, 19 };
    assertEquals("11111121221122211112222121212222211", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case26() {
    int[] preference1 = { 3, 2, 12, 4, 11, 26, 19, 20, 22, 6, 16, 31, 8, 18, 23, 30, 27, 28, 14, 25, 5, 7, 15, 32, 24, 29, 13, 10, 17, 9, 1, 21 };
    int[] preference2 = { 23, 9, 29, 7, 25, 21, 31, 10, 27, 12, 30, 1, 13, 6, 20, 18, 4, 32, 5, 3, 26, 16, 2, 14, 11, 22, 28, 19, 15, 24, 17, 8 };
    assertEquals("21112121221121212111212121212222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case27() {
    int[] preference1 = { 31, 19, 17, 8, 40, 7, 9, 24, 23, 28, 14, 10, 37, 2, 39, 4, 42, 27, 13, 15, 32, 18, 25, 22, 21, 6, 16, 29, 11, 34, 33, 26, 30, 36, 20, 5, 38, 3, 41, 12, 35, 1 };
    int[] preference2 = { 12, 41, 18, 11, 24, 19, 27, 15, 6, 39, 30, 38, 4, 9, 40, 2, 32, 21, 42, 17, 37, 28, 29, 3, 35, 13, 36, 34, 1, 33, 26, 8, 25, 31, 14, 10, 16, 22, 20, 5, 7, 23 };
    assertEquals("212222111122112112112112122122121122122121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case28() {
    int[] preference1 = { 6, 12, 32, 28, 40, 14, 30, 13, 9, 3, 10, 7, 8, 37, 22, 38, 24, 15, 17, 21, 27, 11, 2, 35, 29, 33, 18, 43, 31, 19, 34, 5, 23, 36, 1, 42, 26, 25, 16, 39, 4, 20, 41 };
    int[] preference2 = { 33, 41, 32, 6, 11, 14, 23, 26, 30, 22, 10, 16, 39, 31, 5, 27, 13, 42, 4, 18, 9, 35, 38, 15, 7, 21, 19, 2, 25, 3, 34, 24, 37, 8, 40, 17, 20, 29, 1, 12, 43, 28, 36 };
    assertEquals("1112211112211212122212212221112122211121221", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case29() {
    int[] preference1 = { 14, 8, 7, 10, 2, 41, 26, 29, 35, 39, 11, 32, 4, 3, 40, 16, 23, 12, 24, 28, 42, 22, 33, 5, 1, 18, 30, 36, 37, 38, 21, 17, 27, 31, 34, 6, 20, 19, 25, 15, 9, 13 };
    int[] preference2 = { 31, 32, 3, 11, 20, 5, 9, 21, 16, 13, 15, 19, 42, 25, 6, 2, 36, 14, 35, 29, 8, 27, 22, 38, 34, 39, 28, 17, 33, 1, 41, 23, 40, 12, 7, 24, 37, 30, 26, 10, 4, 18 };
    assertEquals("112122112121212221222111212111221212221112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case30() {
    int[] preference1 = { 40, 36, 35, 27, 31, 22, 6, 37, 29, 30, 2, 33, 10, 9, 15, 23, 12, 11, 42, 20, 19, 7, 1, 25, 4, 13, 3, 41, 16, 38, 17, 21, 32, 14, 28, 5, 8, 26, 24, 39, 18, 34 };
    int[] preference2 = { 16, 31, 8, 28, 29, 14, 23, 13, 20, 35, 12, 22, 34, 11, 19, 18, 41, 39, 5, 38, 24, 36, 33, 9, 15, 27, 26, 37, 42, 40, 32, 10, 30, 6, 4, 21, 7, 1, 3, 2, 17, 25 };
    assertEquals("111121121122221212221122121221221211122121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case31() {
    int[] preference1 = { 36, 13, 30, 42, 48, 24, 39, 26, 27, 7, 1, 49, 22, 47, 28, 4, 37, 15, 29, 12, 25, 3, 45, 6, 19, 41, 11, 46, 14, 40, 5, 20, 31, 35, 43, 32, 17, 8, 9, 34, 16, 2, 10, 38, 18, 33, 44, 21, 23 };
    int[] preference2 = { 40, 7, 6, 39, 4, 36, 8, 28, 45, 38, 13, 10, 31, 34, 43, 22, 42, 27, 33, 26, 1, 16, 18, 49, 37, 19, 15, 47, 2, 11, 44, 17, 20, 25, 12, 46, 32, 48, 3, 14, 21, 24, 29, 41, 5, 35, 30, 9, 23 };
    assertEquals("1212122212211112222221111112112222111222112221111", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case32() {
    int[] preference1 = { 9, 1, 11, 37, 4, 33, 29, 8, 46, 23, 38, 21, 44, 48, 30, 50, 36, 15, 12, 27, 47, 28, 19, 16, 13, 32, 49, 35, 45, 25, 20, 2, 24, 26, 5, 14, 40, 7, 22, 3, 34, 42, 41, 31, 43, 10, 6, 39, 18, 17 };
    int[] preference2 = { 40, 36, 47, 44, 29, 15, 23, 8, 6, 45, 22, 39, 4, 2, 13, 46, 42, 16, 41, 1, 33, 49, 20, 48, 30, 43, 25, 27, 19, 5, 11, 35, 9, 28, 3, 17, 32, 18, 50, 21, 26, 12, 14, 37, 7, 34, 31, 10, 24, 38 };
    assertEquals("12212211121121222212122111112111121211222222212121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case33() {
    int[] preference1 = { 23, 13, 14, 24, 6, 7, 38, 36, 3, 26, 28, 22, 11, 12, 35, 44, 19, 33, 30, 27, 4, 25, 9, 34, 40, 15, 31, 42, 20, 1, 43, 5, 8, 45, 39, 17, 10, 37, 32, 2, 21, 41, 18, 16, 29 };
    int[] preference2 = { 30, 25, 45, 36, 38, 24, 13, 9, 29, 26, 40, 10, 42, 16, 8, 5, 27, 19, 11, 39, 33, 23, 18, 28, 20, 43, 7, 12, 1, 31, 4, 6, 3, 22, 21, 32, 37, 2, 17, 15, 41, 14, 35, 34, 44 };
    assertEquals("221121122211111212122111212122121112122212212", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case34() {
    int[] preference1 = { 19, 7, 38, 37, 32, 34, 4, 26, 11, 39, 8, 25, 10, 15, 14, 33, 29, 2, 16, 12, 23, 13, 31, 27, 28, 18, 30, 17, 5, 22, 24, 3, 35, 21, 9, 36, 20, 1, 6, 40 };
    int[] preference2 = { 4, 19, 28, 37, 11, 34, 20, 29, 8, 6, 22, 2, 18, 30, 26, 7, 24, 17, 39, 3, 10, 38, 23, 14, 40, 12, 31, 5, 15, 27, 32, 13, 36, 35, 33, 9, 25, 16, 1, 21 };
    assertEquals("2222221221211111221212121112221111122112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case35() {
    int[] preference1 = { 30, 19, 28, 22, 24, 31, 35, 21, 37, 1, 20, 18, 34, 39, 17, 12, 5, 9, 23, 16, 4, 14, 13, 36, 6, 2, 25, 32, 33, 11, 27, 7, 8, 15, 38, 10, 3, 26, 40, 29 };
    int[] preference2 = { 13, 7, 32, 9, 27, 23, 19, 40, 16, 35, 36, 20, 31, 28, 29, 33, 38, 11, 15, 12, 21, 30, 6, 37, 24, 1, 4, 3, 8, 5, 34, 10, 2, 14, 22, 25, 39, 17, 18, 26 };
    assertEquals("1121122222212122111211211221211221121212", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case36() {
    int[] preference1 = { 4, 42, 47, 39, 19, 2, 17, 22, 23, 13, 1, 24, 27, 7, 34, 5, 45, 6, 18, 37, 31, 20, 25, 40, 36, 33, 32, 29, 9, 14, 44, 26, 12, 48, 43, 46, 11, 30, 10, 28, 16, 41, 38, 35, 21, 8, 15, 3 };
    int[] preference2 = { 1, 4, 26, 11, 21, 5, 15, 7, 48, 37, 14, 31, 18, 28, 30, 41, 8, 27, 2, 3, 13, 29, 10, 40, 43, 39, 34, 45, 44, 24, 16, 17, 9, 35, 47, 38, 23, 42, 25, 36, 12, 6, 32, 22, 19, 46, 33, 20 };
    assertEquals("212121221221122212112111121222211121221121221112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case37() {
    int[] preference1 = { 8, 11, 1, 6, 4, 9, 12, 7, 17, 18, 5, 2, 14, 16, 13, 10, 20, 3, 15, 19 };
    int[] preference2 = { 11, 8, 1, 6, 4, 7, 9, 12, 18, 17, 5, 2, 10, 14, 13, 16, 20, 19, 15, 3 };
    assertEquals("12111221122221211221", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case38() {
    int[] preference1 = { 15, 18, 14, 1, 17, 3, 4, 16, 13, 2, 7, 5, 9, 10, 8, 6, 11, 12 };
    int[] preference2 = { 14, 18, 15, 4, 1, 17, 13, 3, 16, 2, 7, 5, 9, 6, 10, 8, 12, 11 };
    assertEquals("121222121112221121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case39() {
    int[] preference1 = { 6, 18, 15, 12, 4, 14, 5, 8, 13, 11, 19, 2, 10, 3, 17, 7, 16, 9, 1 };
    int[] preference2 = { 6, 4, 18, 13, 14, 5, 8, 15, 12, 11, 2, 19, 3, 10, 17, 16, 1, 7, 9 };
    assertEquals("2222211111212212111", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case40() {
    int[] preference1 = { 8, 1, 4, 2, 11, 10, 5, 7, 12, 9, 6, 3 };
    int[] preference2 = { 1, 8, 2, 4, 7, 11, 10, 12, 5, 6, 9, 3 };
    assertEquals("222112211112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case41() {
    int[] preference1 = { 19, 11, 15, 16, 21, 3, 7, 4, 18, 12, 13, 5, 2, 10, 14, 1, 6, 8, 17, 20, 9 };
    int[] preference2 = { 19, 11, 15, 16, 21, 3, 7, 4, 13, 12, 10, 8, 18, 2, 20, 5, 6, 17, 9, 14, 1 };
    assertEquals("112212121221211221121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case42() {
    int[] preference1 = { 1, 3, 5, 4, 6, 7, 10, 8, 2, 9 };
    int[] preference2 = { 1, 5, 3, 4, 6, 7, 10, 8, 2, 9 };
    assertEquals("1112212221", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case43() {
    int[] preference1 = { 3, 1, 11, 4, 5, 12, 9, 6, 7, 2, 10, 8, 14, 13 };
    int[] preference2 = { 1, 3, 9, 11, 5, 12, 4, 6, 7, 2, 10, 8, 13, 14 };
    assertEquals("22112212211121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case44() {
    int[] preference1 = { 5, 1, 14, 9, 7, 12, 6, 3, 10, 4, 11, 13, 8, 2, 15 };
    int[] preference2 = { 1, 5, 14, 9, 7, 6, 12, 3, 4, 11, 2, 15, 10, 13, 8 };
    assertEquals("222212112111112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case45() {
    int[] preference1 = { 20, 18, 4, 2, 6, 16, 9, 17, 28, 14, 1, 22, 12, 13, 25, 7, 10, 21, 19, 26, 15, 27, 24, 8, 23, 3, 5, 11 };
    int[] preference2 = { 6, 2, 20, 18, 4, 17, 16, 14, 28, 9, 12, 1, 22, 10, 25, 21, 26, 13, 7, 15, 19, 24, 8, 27, 23, 3, 5, 11 };
    assertEquals("1221121212221211211121122212", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case46() {
    int[] preference1 = { 14, 20, 19, 7, 4, 10, 2, 3, 5, 18, 15, 12, 11, 1, 8, 13, 17, 16, 21, 6, 9, 22 };
    int[] preference2 = { 20, 4, 19, 14, 7, 2, 18, 10, 5, 11, 3, 15, 12, 1, 17, 13, 8, 21, 16, 6, 9, 22 };
    assertEquals("2212221111211111221222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case47() {
    int[] preference1 = { 12, 23, 13, 6, 33, 9, 28, 1, 26, 19, 27, 8, 10, 37, 22, 2, 4, 35, 21, 29, 30, 20, 14, 32, 17, 11, 18, 39, 24, 31, 38, 15, 40, 3, 25, 7, 36, 5, 16, 34 };
    int[] preference2 = { 23, 13, 12, 33, 6, 28, 1, 26, 9, 37, 22, 19, 27, 8, 10, 4, 35, 2, 30, 14, 11, 29, 32, 21, 24, 20, 3, 17, 38, 39, 18, 31, 16, 15, 34, 7, 5, 40, 25, 36 };
    assertEquals("2122212211211212111112221112122122212211", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case48() {
    int[] preference1 = { 33, 9, 17, 22, 19, 15, 24, 25, 27, 28, 11, 29, 23, 20, 31, 2, 16, 4, 6, 12, 34, 8, 5, 21, 30, 32, 26, 18, 7, 14, 1, 10, 3, 13 };
    int[] preference2 = { 22, 19, 9, 33, 28, 17, 15, 24, 23, 11, 29, 20, 25, 31, 27, 2, 6, 34, 4, 12, 16, 8, 5, 30, 21, 18, 32, 26, 1, 7, 13, 10, 14, 3 };
    assertEquals("2221121211212111122212221212121112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case49() {
    int[] preference1 = { 20, 39, 16, 37, 15, 9, 17, 35, 38, 25, 23, 46, 30, 40, 18, 2, 33, 31, 36, 4, 26, 14, 42, 22, 1, 32, 3, 29, 28, 7, 10, 21, 13, 41, 27, 44, 6, 12, 34, 5, 8, 43, 11, 45, 24, 19 };
    int[] preference2 = { 20, 16, 17, 39, 15, 9, 37, 23, 2, 40, 18, 46, 30, 33, 35, 26, 38, 25, 14, 36, 32, 31, 1, 29, 28, 4, 42, 7, 10, 3, 21, 44, 22, 13, 8, 12, 27, 34, 19, 41, 45, 24, 6, 11, 43, 5 };
    assertEquals("2211112211121222222121221212221212111112111221", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case50() {
    int[] preference1 = { 14, 13, 28, 37, 29, 17, 40, 10, 24, 18, 41, 36, 23, 22, 4, 8, 33, 6, 15, 26, 20, 16, 3, 2, 34, 27, 32, 1, 21, 7, 19, 39, 5, 12, 9, 35, 31, 38, 11, 25, 30 };
    int[] preference2 = { 37, 40, 14, 28, 13, 24, 17, 10, 29, 41, 36, 18, 22, 23, 6, 20, 33, 4, 8, 15, 16, 27, 3, 21, 2, 26, 39, 32, 34, 1, 19, 7, 5, 30, 11, 12, 9, 35, 25, 31, 38 };
    assertEquals("21111211112111222122221221211211112221222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case51() {
    int[] preference1 = { 1, 25, 19, 27, 16, 22, 10, 24, 12, 29, 21, 26, 11, 36, 9, 31, 3, 2, 14, 32, 30, 7, 34, 35, 4, 17, 15, 33, 13, 23, 28, 5, 20, 8, 6, 18 };
    int[] preference2 = { 25, 1, 10, 12, 21, 29, 27, 19, 16, 22, 24, 26, 9, 36, 31, 14, 11, 30, 2, 3, 35, 32, 17, 4, 7, 34, 15, 28, 13, 33, 18, 23, 20, 8, 5, 6 };
    assertEquals("111212112212221122122111221222211121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case52() {
    int[] preference1 = { 1, 29, 8, 24, 23, 26, 21, 35, 15, 33, 12, 30, 13, 3, 14, 11, 5, 16, 27, 4, 10, 7, 22, 20, 28, 34, 31, 2, 9, 6, 36, 19, 25, 18, 17, 32 };
    int[] preference2 = { 1, 35, 24, 23, 29, 26, 15, 21, 12, 8, 33, 30, 13, 14, 3, 10, 27, 20, 34, 31, 5, 28, 22, 4, 11, 16, 9, 2, 7, 6, 25, 19, 32, 36, 17, 18 };
    assertEquals("111112112212122121121122212212221221", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case53() {
    int[] preference1 = { 42, 7, 1, 39, 4, 29, 13, 19, 36, 24, 14, 35, 11, 6, 8, 25, 32, 20, 5, 21, 15, 26, 17, 38, 33, 31, 30, 37, 40, 9, 23, 18, 16, 12, 27, 22, 3, 28, 34, 2, 41, 10 };
    int[] preference2 = { 1, 42, 13, 7, 19, 29, 39, 4, 36, 14, 35, 8, 24, 6, 20, 11, 25, 21, 26, 37, 38, 32, 30, 5, 33, 23, 40, 16, 31, 15, 18, 9, 12, 17, 27, 22, 34, 41, 3, 28, 2, 10 };
    assertEquals("211111121212221211222221121122111221221221", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case54() {
    int[] preference1 = { 20, 6, 32, 17, 12, 10, 29, 30, 33, 23, 16, 11, 27, 18, 34, 28, 5, 9, 36, 26, 35, 24, 14, 22, 25, 1, 8, 7, 13, 21, 19, 15, 4, 3, 31, 2 };
    int[] preference2 = { 6, 32, 20, 17, 30, 29, 27, 23, 12, 11, 10, 34, 16, 33, 36, 18, 35, 9, 13, 26, 22, 5, 1, 28, 24, 25, 14, 15, 8, 7, 4, 2, 19, 21, 31, 3 };
    assertEquals("221212212121212121111211112122211222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case55() {
    int[] preference1 = { 10, 45, 48, 18, 29, 34, 14, 3, 38, 40, 4, 13, 24, 7, 8, 16, 35, 47, 32, 6, 27, 37, 19, 25, 20, 31, 49, 2, 11, 30, 5, 44, 43, 23, 26, 9, 1, 46, 28, 12, 42, 41, 15, 22, 36, 17, 39, 33, 21 };
    int[] preference2 = { 48, 45, 14, 10, 4, 38, 18, 3, 34, 29, 24, 40, 7, 13, 8, 35, 6, 16, 37, 32, 47, 2, 20, 25, 27, 11, 5, 19, 43, 12, 26, 9, 49, 1, 28, 44, 30, 31, 23, 42, 46, 17, 41, 36, 22, 39, 21, 15, 33 };
    assertEquals("2222222111221211211222122212111111222211112111121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case56() {
    int[] preference1 = { 27, 1, 20, 21, 18, 16, 2, 10, 25, 9, 31, 5, 14, 26, 7, 12, 4, 8, 23, 17, 13, 24, 15, 28, 30, 22, 11, 3, 19, 6, 29 };
    int[] preference2 = { 20, 21, 10, 27, 1, 18, 31, 9, 25, 2, 16, 12, 14, 26, 5, 23, 8, 7, 4, 17, 13, 15, 24, 28, 30, 22, 11, 29, 19, 3, 6 };
    assertEquals("1111111222121221212222211112212", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case57() {
    int[] preference1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int[] preference2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals("12121212121212121212121212121212121212121212121212", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case58() {
    int[] preference1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int[] preference2 = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals("11111111111111111111111112222222222222222222222222", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case59() {
    int[] preference1 = { 8, 7, 1, 2, 4, 5, 6, 3, 9 };
    int[] preference2 = { 7, 2, 4, 8, 1, 5, 9, 6, 3 };
    assertEquals("121121212", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case60() {
    int[] preference1 = { 3, 1, 2, 5, 4 };
    int[] preference2 = { 1, 2, 5, 3, 4 };
    assertEquals("21112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case61() {
    int[] preference1 = { 1, 2, 3, 4 };
    int[] preference2 = { 1, 2, 3, 4 };
    assertEquals("1212", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case62() {
    int[] preference1 = { 3, 2, 1 };
    int[] preference2 = { 1, 3, 2 };
    assertEquals("211", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case63() {
    int[] preference1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 34, 33, 36, 35, 38, 37, 40, 39 };
    int[] preference2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    assertEquals("1212121212121212121212121212121221212121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case64() {
    int[] preference1 = { 3, 1, 2 };
    int[] preference2 = { 3, 2, 1 };
    assertEquals("121", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case65() {
    int[] preference1 = { 1, 3, 2 };
    int[] preference2 = { 3, 2, 1 };
    assertEquals("112", teamsselection.simulate(preference1, preference2));
  }

  @Test
  public void case66() {
    int[] preference1 = { 6, 1, 5, 2, 3, 4 };
    int[] preference2 = { 1, 6, 3, 4, 5, 2 };
    assertEquals("212211", teamsselection.simulate(preference1, preference2));
  }

}
