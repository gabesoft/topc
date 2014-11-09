package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheMoviesLevelThreeDivTwoTest {
  TheMoviesLevelThreeDivTwo themovieslevelthreedivtwo = new TheMoviesLevelThreeDivTwo();

  @Test
  public void case1() {
    int[] timeJ = { 4, 4 };
    int[] timeB = { 4, 4 };
    assertEquals(2, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case2() {
    int[] timeJ = { 1, 4 };
    int[] timeB = { 4, 2 };
    assertEquals(1, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case3() {
    int[] timeJ = { 10, 10, 10, 10 };
    int[] timeB = { 1, 1, 1, 10 };
    assertEquals(3, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case4() {
    int[] timeJ = { 1, 2, 3, 4, 5, 6, 7 };
    int[] timeB = { 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(98, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case5() {
    int[] timeJ = { 7, 7 };
    int[] timeB = { 9, 9 };
    assertEquals(0, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case6() {
    int[] timeJ = { 1, 9, 1, 6, 7, 2 };
    int[] timeB = { 4, 4, 9, 3, 1, 3 };
    assertEquals(38, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case7() {
    int[] timeJ = { 3, 5 };
    int[] timeB = { 1, 1 };
    assertEquals(0, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case8() {
    int[] timeJ = { 7 };
    int[] timeB = { 7 };
    assertEquals(0, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case9() {
    int[] timeJ = { 20 };
    int[] timeB = { 20 };
    assertEquals(0, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case10() {
    int[] timeJ = { 1 };
    int[] timeB = { 17 };
    assertEquals(0, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case11() {
    int[] timeJ = { 1, 7, 5, 17, 13, 6, 12, 3 };
    int[] timeB = { 17, 5, 9, 11, 5, 8, 11, 19 };
    assertEquals(193, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case12() {
    int[] timeJ = { 10, 4, 9 };
    int[] timeB = { 5, 17, 10 };
    assertEquals(3, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case13() {
    int[] timeJ = { 15, 17, 17, 5, 1, 9, 5, 9, 13, 11 };
    int[] timeB = { 12, 1, 13, 1, 14, 9, 19, 11, 13, 11 };
    assertEquals(903, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case14() {
    int[] timeJ = { 17, 13, 1, 17, 16, 17, 5, 9, 6, 8, 20, 5, 20, 3, 1, 11, 11, 13, 11 };
    int[] timeB = { 13, 1, 5, 6, 1, 1, 1, 5, 9, 5, 6, 1, 20, 9, 18, 13, 11, 15, 2 };
    assertEquals(375315, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case15() {
    int[] timeJ = { 5 };
    int[] timeB = { 15 };
    assertEquals(0, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case16() {
    int[] timeJ = { 19, 5, 1, 17, 16, 3, 3, 1, 2, 1, 17, 13, 19 };
    int[] timeB = { 5, 17, 9, 19, 20, 11, 14, 19, 3, 5, 9, 16, 1 };
    assertEquals(6457, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case17() {
    int[] timeJ = { 8 };
    int[] timeB = { 9 };
    assertEquals(0, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case18() {
    int[] timeJ = { 15, 5, 16, 11, 7, 14, 10, 6, 5, 13 };
    int[] timeB = { 18, 4, 7, 9, 10, 15, 5, 11, 17, 1 };
    assertEquals(954, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case19() {
    int[] timeJ = { 20, 6, 3, 5, 11, 2, 17, 17, 9, 3, 16, 11, 7, 9, 5, 17, 8 };
    int[] timeB = { 16, 17, 17, 9, 7, 11, 17, 7, 3, 6, 11, 15, 11, 8, 19, 17, 17 };
    assertEquals(126914, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case20() {
    int[] timeJ = { 13, 1, 1, 5 };
    int[] timeB = { 5, 1, 6, 1 };
    assertEquals(4, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case21() {
    int[] timeJ = { 9, 9, 12, 3, 11, 17, 1, 4, 1, 7, 13, 1, 7, 5, 5, 11, 6, 12, 1, 3 };
    int[] timeB = { 15, 14, 5, 19, 14, 11, 9, 4, 13, 5, 5, 7, 13, 8, 9, 11, 8, 11, 17, 1 };
    assertEquals(957134, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case22() {
    int[] timeJ = { 11, 19, 9, 10, 15, 14, 1, 19, 16, 17, 5, 13, 1, 1, 13, 11, 5, 17, 11, 3 };
    int[] timeB = { 17, 7, 13, 12, 1, 2, 1, 17, 2, 6, 1, 11, 6, 3, 11, 5, 3, 11, 18, 11 };
    assertEquals(928013, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case23() {
    int[] timeJ = { 3, 17, 20, 15, 17, 1, 1, 3, 9, 19, 2, 13, 16, 1, 9, 19, 1, 1, 5, 19 };
    int[] timeB = { 14, 19, 13, 13, 9, 9, 5, 11, 10, 3, 3, 16, 20, 5, 1, 5, 19, 8, 17, 1 };
    assertEquals(1042654, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case24() {
    int[] timeJ = { 7, 9, 17, 11, 1, 11, 3, 13, 11, 16, 16, 17, 3, 8, 15, 17, 17, 19, 1, 17 };
    int[] timeB = { 20, 8, 9, 5, 11, 10, 18, 2, 3, 17, 17, 17, 5, 18, 3, 7, 6, 16, 1, 11 };
    assertEquals(1045575, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case25() {
    int[] timeJ = { 1, 17, 1, 17, 16, 13, 3, 19, 13, 6, 16, 2, 5, 13, 16, 11, 1, 1, 15, 13 };
    int[] timeB = { 1, 7, 1, 13, 1, 9, 1, 16, 17, 16, 19, 17, 13, 11, 5, 11, 1, 12, 5, 15 };
    assertEquals(1030691, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case26() {
    int[] timeJ = { 17, 1, 11, 5, 1, 17, 1, 1, 16, 17, 2, 11, 4, 1, 1, 16, 1, 5, 10, 1 };
    int[] timeB = { 3, 9, 1, 8, 3, 5, 13, 15, 9, 15, 12, 20, 2, 1, 18, 13, 13, 1, 20, 5 };
    assertEquals(980138, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case27() {
    int[] timeJ = { 5, 14, 5, 11, 5, 13, 1, 9, 9, 3, 11, 6, 5, 1, 5, 1, 20, 1, 8, 17 };
    int[] timeB = { 16, 6, 1, 14, 8, 17, 20, 1, 1, 19, 3, 1, 8, 5, 8, 1, 1, 13, 1, 1 };
    assertEquals(1032747, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case28() {
    int[] timeJ = { 5, 16, 1, 9, 1, 4, 9, 5, 13, 17, 3, 8, 11, 1, 19, 20, 17, 6, 19, 16 };
    int[] timeB = { 14, 13, 16, 13, 2, 10, 4, 11, 1, 1, 19, 9, 17, 5, 4, 1, 9, 1, 11, 18 };
    assertEquals(1034054, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case29() {
    int[] timeJ = { 1, 11, 9, 9, 9, 13, 5, 2, 3, 16, 3, 1, 11, 13, 1, 17, 16, 13, 18, 17 };
    int[] timeB = { 9, 16, 13, 10, 16, 17, 1, 13, 1, 16, 3, 5, 6, 9, 13, 17, 1, 17, 3, 18 };
    assertEquals(1025268, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case30() {
    int[] timeJ = { 6, 20, 19, 5, 1, 9, 1, 1, 1, 9, 15, 4, 1, 14, 13, 16, 16, 11, 11, 13 };
    int[] timeB = { 11, 16, 7, 13, 6, 11, 1, 15, 9, 17, 17, 12, 11, 3, 10, 5, 11, 1, 13, 18 };
    assertEquals(1031307, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case31() {
    int[] timeJ = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    int[] timeB = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(1048574, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case32() {
    int[] timeJ = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] timeB = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(1048574, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case33() {
    int[] timeJ = { 13, 9, 12, 8, 10, 7, 16, 14, 17, 6, 5, 19, 11, 20, 2, 18, 3, 4, 1, 15 };
    int[] timeB = { 13, 9, 12, 8, 10, 7, 16, 14, 17, 6, 5, 19, 11, 20, 2, 18, 3, 4, 1, 15 };
    assertEquals(1047962, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case34() {
    int[] timeJ = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    int[] timeB = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case35() {
    int[] timeJ = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] timeB = { 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19 };
    assertEquals(20, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case36() {
    int[] timeJ = { 19, 12, 15, 17, 17, 15, 17, 19, 19, 13, 18, 10, 15, 18, 11, 14, 12, 18, 13, 18 };
    int[] timeB = { 12, 19, 17, 15, 15, 17, 19, 17, 13, 19, 10, 18, 18, 15, 14, 11, 18, 12, 18, 13 };
    assertEquals(1048537, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case37() {
    int[] timeJ = { 14, 18, 20, 10, 16, 15, 14, 20, 12, 14, 17, 11, 20, 18, 10, 10, 12, 14, 14, 12 };
    int[] timeB = { 18, 14, 10, 20, 15, 16, 20, 14, 14, 12, 11, 17, 18, 20, 10, 10, 14, 12, 12, 14 };
    assertEquals(1048536, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case38() {
    int[] timeJ = { 16, 12, 16, 10, 16, 18, 11, 13, 11, 13, 19, 20, 14, 14, 11, 20, 16, 16, 14, 20 };
    int[] timeB = { 12, 16, 10, 16, 18, 16, 13, 11, 13, 11, 20, 19, 14, 14, 20, 11, 16, 16, 20, 14 };
    assertEquals(1048539, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case39() {
    int[] timeJ = { 13, 16, 11, 12, 19, 12, 13, 13, 12, 18, 10, 15, 10, 20, 14, 20, 18, 18, 19, 10 };
    int[] timeB = { 16, 13, 12, 11, 12, 19, 13, 13, 18, 12, 15, 10, 20, 10, 20, 14, 18, 18, 10, 19 };
    assertEquals(1048535, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case40() {
    int[] timeJ = { 19, 16, 15, 19, 17, 13, 17, 12, 19, 12, 18, 10, 15, 10, 11, 14, 12, 11, 13, 13 };
    int[] timeB = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(20, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case41() {
    int[] timeJ = { 14, 12, 20, 19, 16, 10, 14, 18, 12, 11, 17, 12, 20, 14, 10, 14, 12, 13, 14, 18 };
    int[] timeB = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(18, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case42() {
    int[] timeJ = { 16, 17, 16, 10, 16, 11, 11, 19, 11, 19, 19, 16, 14, 19, 11, 12, 16, 15, 14, 17 };
    int[] timeB = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(20, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case43() {
    int[] timeJ = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    int[] timeB = { 3, 1, 8, 11, 6, 10, 10, 3, 4, 7, 1, 10, 9, 1, 5, 10, 9, 5, 9, 9 };
    assertEquals(60459, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case44() {
    int[] timeJ = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    int[] timeB = { 9, 1, 1, 8, 6, 6, 11, 1, 5, 8, 2, 3, 9, 1, 1, 2, 5, 8, 3, 1 };
    assertEquals(6195, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case45() {
    int[] timeJ = { 1, 1, 2, 4, 1, 3, 1, 3, 1, 3, 3, 4, 1, 4, 3, 1, 1, 3, 1, 1 };
    int[] timeB = { 1, 1, 4, 3, 1, 1, 3, 3, 2, 2, 1, 1, 3, 4, 1, 1, 1, 3, 3, 4 };
    assertEquals(1046707, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case46() {
    int[] timeJ = { 1, 1, 3, 1, 4, 1, 3, 1, 2, 1, 2, 1, 1, 2, 4, 2, 1 };
    int[] timeB = { 1, 1, 3, 2, 3, 3, 2, 3, 1, 1, 3, 1, 1, 4, 4, 3, 1 };
    assertEquals(127884, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case47() {
    int[] timeJ = { 1, 3, 1, 4, 1, 1, 1, 4, 1, 1, 4, 3, 2, 1, 1, 3, 4 };
    int[] timeB = { 1, 3, 1, 1, 1, 1, 3, 1, 2, 1, 3, 1, 1, 3, 1, 4, 2 };
    assertEquals(127799, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case48() {
    int[] timeJ = { 4, 4 };
    int[] timeB = { 4, 4 };
    assertEquals(2, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case49() {
    int[] timeJ = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] timeB = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(1048574, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case50() {
    int[] timeJ = { 1, 2, 3, 4, 5, 6, 7 };
    int[] timeB = { 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(98, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case51() {
    int[] timeJ = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    int[] timeB = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    assertEquals(1048574, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case52() {
    int[] timeJ = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int[] timeB = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(944024, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case53() {
    int[] timeJ = { 10, 12, 3, 4, 5, 6, 7, 19, 17, 5, 4, 5, 3, 5, 3, 5, 3, 4, 5, 19 };
    int[] timeB = { 18, 17, 3, 3, 4, 5, 6, 17, 14, 15, 15, 18, 13, 14, 16, 19, 18, 17, 16, 2 };
    assertEquals(604907, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case54() {
    int[] timeJ = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int[] timeB = { 7, 6, 5, 4, 3, 2, 1, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    assertEquals(1047962, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case55() {
    int[] timeJ = { 1, 2, 3, 4, 5, 6, 7 };
    int[] timeB = { 7, 6, 5, 10, 3, 2, 1 };
    assertEquals(78, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case56() {
    int[] timeJ = { 1, 2, 3, 4, 5, 6, 7, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    int[] timeB = { 7, 6, 5, 4, 3, 2, 1, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(1048458, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case57() {
    int[] timeJ = { 11, 14, 12, 18, 13, 20, 20, 11, 13, 19, 13, 19, 15, 19, 12, 19, 16, 14, 11, 20 };
    int[] timeB = { 17, 12, 20, 19, 16, 16, 13, 17, 15, 16, 11, 19, 12, 13, 18, 18, 18, 17, 14, 17 };
    assertEquals(1048451, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

  @Test
  public void case58() {
    int[] timeJ = { 5, 12, 10, 19, 2, 18, 8, 7, 7, 9, 5, 10, 14, 2, 11, 13, 17, 6, 15, 5 };
    int[] timeB = { 17, 18, 9, 3, 7, 4, 2, 4, 7, 19, 7, 13, 7, 15, 9, 11, 13, 17, 17, 19 };
    assertEquals(1046299, themovieslevelthreedivtwo.find(timeJ, timeB));
  }

}
