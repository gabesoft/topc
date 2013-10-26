package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TravelOnMarsTest {
  TravelOnMars travelonmars = new TravelOnMars();

  @Test
  public void case1() {
    int[] range = { 2, 1, 1, 1, 1, 1 };
    int startCity = 1;
    int endCity = 4;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case2() {
    int[] range = { 2, 1, 1, 2, 1, 2, 1, 1 };
    int startCity = 2;
    int endCity = 6;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case3() {
    int[] range = { 3, 2, 1, 1, 3, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3 };
    int startCity = 6;
    int endCity = 13;
    assertEquals(4, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case4() {
    int[] range = { 2, 4, 2, 3, 4, 1, 4, 2, 5, 4, 3, 3, 5, 4, 5, 2, 2, 4, 4, 3, 3, 4, 2, 3, 5, 4, 2, 4, 1, 3, 2, 3, 4, 1, 1, 4, 4, 3, 5, 3, 2, 1, 4, 1, 4 };
    int startCity = 24;
    int endCity = 8;
    assertEquals(5, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case5() {
    int[] range = { 1, 1, 2, 3, 3, 4, 3, 3, 4, 4, 5, 5, 2, 2, 3, 1, 3, 2, 3, 1, 5, 2, 2, 2, 2, 4, 1, 3, 4, 3, 5, 1, 5, 5, 4, 5, 3, 5, 5, 3, 2, 2, 2, 4, 1, 3, 3 };
    int startCity = 0;
    int endCity = 22;
    assertEquals(8, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case6() {
    int[] range = { 2, 2, 1, 4, 5, 1, 5, 1, 5, 2, 3, 1, 4, 5, 5, 4, 4, 4, 1, 2, 4, 4, 2, 3, 4, 2, 1, 3, 2, 3, 5, 3, 3, 3, 2, 3, 2, 1, 3, 2, 5 };
    int startCity = 3;
    int endCity = 23;
    assertEquals(6, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case7() {
    int[] range = { 3, 5, 5, 2, 3, 5, 2, 2, 2, 4, 5, 5, 1, 5, 4, 5, 2, 1, 3, 1, 5, 5, 2, 3, 1, 5, 2, 2, 4, 4, 5, 1, 4, 2, 1, 3, 5, 1, 4, 4, 2, 1, 5 };
    int startCity = 4;
    int endCity = 23;
    assertEquals(5, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case8() {
    int[] range = { 1, 2, 2, 4, 2, 4, 3, 5, 2, 1, 4, 1, 1, 2, 1, 2, 4, 2, 2, 1, 3, 3, 4, 4, 4, 4, 2, 5, 4, 3, 2, 2, 4, 2, 5, 4, 2, 1, 1, 4, 5, 5, 3, 3, 3, 4, 4, 5 };
    int startCity = 2;
    int endCity = 28;
    assertEquals(7, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case9() {
    int[] range = { 3, 2, 4, 1, 4, 3, 2, 2, 5, 5, 3, 1, 4, 3, 3, 3, 2, 3, 2, 2, 5, 3, 5, 5, 3, 5, 3, 1, 4, 5, 2, 3, 5, 4, 1, 1, 2, 5, 4, 4, 3, 3, 3, 2, 5, 4, 4, 2, 5 };
    int startCity = 48;
    int endCity = 25;
    assertEquals(6, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case10() {
    int[] range = { 1, 3, 4, 5, 2, 2, 2, 2, 2, 2, 4, 1, 5, 4, 2, 2, 2, 2, 4, 1, 5, 5, 4, 1, 3, 1, 2, 5, 3, 2, 2, 3, 5, 5, 4, 1, 5, 2, 2, 5, 1, 2, 2, 5, 3 };
    int startCity = 20;
    int endCity = 44;
    assertEquals(6, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case11() {
    int[] range = { 1, 5, 4, 2, 1, 5, 3, 4, 3, 2, 2, 2, 1, 4, 2, 2, 4, 5, 5, 5, 5, 5, 1, 5, 3, 3, 4, 2, 4, 1, 3, 3, 1, 3, 2, 4, 4, 5, 5, 3, 4 };
    int startCity = 20;
    int endCity = 39;
    assertEquals(6, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case12() {
    int[] range = { 4, 3, 5, 3, 5, 3, 2, 4, 4, 5, 2, 2, 4, 1, 3, 1, 2, 1, 2, 3, 4, 1, 4, 4, 3, 2, 1, 1, 2, 3, 1, 5, 1, 3, 2, 5, 2, 1, 2, 1, 2, 5, 5, 3, 5, 5, 5 };
    int startCity = 0;
    int endCity = 16;
    assertEquals(4, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case13() {
    int[] range = { 3, 5, 2, 4, 2, 1, 2, 3, 4, 2, 4, 1, 1, 1, 3, 5, 2, 1, 1, 1, 4, 3, 5, 3, 3, 2, 3, 4, 1, 2, 5, 1, 5, 3, 5, 1, 5, 2, 2, 4, 2, 4, 2, 1, 4, 3 };
    int startCity = 6;
    int endCity = 29;
    assertEquals(8, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case14() {
    int[] range = { 5, 3, 1, 3, 1, 4, 5, 2, 1, 2, 2, 5, 5, 4, 5, 3, 5, 3, 2, 5, 4, 2, 4, 1, 5, 4, 1, 4, 1, 1, 1, 4, 4, 5, 2, 3, 2, 5, 3, 3, 5, 5, 4, 4, 1, 5, 4 };
    int startCity = 43;
    int endCity = 25;
    assertEquals(6, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case15() {
    int[] range = { 2, 1, 3, 4, 4, 4, 4, 4, 5, 4, 3, 1, 4, 1, 4, 5, 1, 4, 5, 4, 3, 1, 3, 4, 4, 4, 1, 3, 3, 4, 3, 5, 1, 4, 1, 1, 3, 3, 5, 2, 1, 4, 1, 5, 1, 2, 2, 2 };
    int startCity = 6;
    int endCity = 22;
    assertEquals(5, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case16() {
    int[] range = { 3, 4, 1, 1, 1, 5, 1, 2, 5, 5, 5, 2, 5, 2, 3, 1, 3, 3, 1, 3, 2, 3, 5, 2, 4, 5, 5, 2, 1, 2, 3, 4, 4, 2, 1, 2, 4, 5, 4, 5, 4, 5, 5, 1, 5, 4, 1, 2, 5 };
    int startCity = 21;
    int endCity = 42;
    assertEquals(6, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case17() {
    int[] range = { 4, 2, 1, 4, 1, 4, 2, 4, 2, 1, 1, 2, 5, 2, 1, 4, 5, 5, 3, 4, 4, 4, 2, 5, 4, 1, 4, 1, 5, 3, 5, 1, 4, 3, 3, 1, 1, 3, 3, 5, 1, 5, 1, 3, 2, 5, 2, 2 };
    int startCity = 47;
    int endCity = 29;
    assertEquals(6, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case18() {
    int[] range = { 4, 2, 4, 5, 5, 2, 3, 5, 4, 4, 5, 5, 1, 1, 2, 3, 1, 3, 2, 5, 1, 3, 4, 2, 3, 4, 1, 1, 4, 2, 2, 5, 2, 1, 2, 3, 3, 4, 4, 1, 1 };
    int startCity = 13;
    int endCity = 31;
    assertEquals(8, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case19() {
    int[] range = { 9, 7, 12, 11, 3, 4, 9, 7, 15, 2, 9, 6, 3, 1, 14, 11, 2, 10, 7, 6, 9, 8, 12, 1, 8, 10, 3, 3, 12, 7, 9, 10, 5, 14, 13, 10, 3, 12, 7, 2, 15, 2, 12, 9, 5 };
    int startCity = 19;
    int endCity = 31;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case20() {
    int[] range = { 13, 13, 4, 1, 6, 7, 2, 5, 3, 14, 7, 11, 3, 7, 12, 10, 15, 5, 5, 9, 3, 8, 12, 4, 12, 15, 1, 1, 1, 10, 9, 6, 4, 3, 7, 14, 1, 9, 3, 7, 3 };
    int startCity = 25;
    int endCity = 2;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case21() {
    int[] range = { 13, 5, 1, 12, 4, 15, 8, 2, 11, 8, 6, 4, 12, 14, 2, 5, 7, 12, 11, 5, 9, 10, 10, 13, 4, 13, 10, 4, 14, 14, 10, 3, 13, 8, 6, 10, 9, 11, 15, 8, 4, 3, 11, 11, 7, 13 };
    int startCity = 44;
    int endCity = 30;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case22() {
    int[] range = { 11, 5, 11, 12, 12, 2, 5, 10, 14, 7, 6, 2, 11, 4, 12, 3, 10, 4, 3, 5, 3, 6, 3, 3, 12, 8, 2, 3, 1, 7, 11, 12, 12, 15, 12, 8, 1, 10, 8, 4, 15, 6, 1, 7, 14, 1, 3, 3, 2 };
    int startCity = 22;
    int endCity = 37;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case23() {
    int[] range = { 14, 1, 6, 13, 15, 12, 13, 13, 13, 3, 7, 7, 2, 15, 5, 12, 11, 10, 13, 6, 6, 13, 5, 6, 14, 10, 10, 7, 5, 10, 9, 1, 10, 6, 5, 11, 1, 4, 10, 4, 14, 10, 2, 12, 13, 12, 2, 15, 11, 4 };
    int startCity = 49;
    int endCity = 19;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case24() {
    int[] range = { 15, 3, 4, 14, 13, 5, 7, 5, 1, 6, 12, 8, 5, 1, 9, 10, 10, 3, 9, 11, 11, 7, 1, 10, 6, 9, 2, 2, 3, 5, 1, 13, 3, 13, 3, 1, 7, 14, 11, 7, 15, 9 };
    int startCity = 22;
    int endCity = 33;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case25() {
    int[] range = { 15, 1, 8, 11, 8, 1, 12, 1, 5, 13, 11, 12, 4, 2, 10, 6, 2, 13, 3, 5, 9, 14, 13, 13, 6, 3, 14, 1, 15, 2, 5, 13, 5, 1, 13, 14, 1, 15, 8, 15, 9, 7, 8, 5, 11, 12, 13 };
    int startCity = 13;
    int endCity = 39;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case26() {
    int[] range = { 3, 10, 10, 14, 4, 6, 12, 3, 8, 1, 3, 3, 10, 11, 7, 9, 8, 13, 2, 8, 15, 7, 3, 4, 14, 5, 9, 11, 13, 3, 14, 11, 9, 14, 15, 15, 1, 6, 14, 1, 11, 6, 12, 6, 10, 4, 6, 13, 12 };
    int startCity = 10;
    int endCity = 46;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case27() {
    int[] range = { 4, 1, 2, 14, 10, 3, 12, 6, 1, 13, 9, 7, 8, 4, 1, 13, 4, 10, 7, 10, 4, 9, 4, 14, 4, 6, 15, 5, 12, 10, 13, 4, 3, 14, 4, 2, 7, 14, 9, 5, 7, 2, 7, 4, 14, 10, 6, 2 };
    int startCity = 33;
    int endCity = 0;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case28() {
    int[] range = { 15, 10, 14, 15, 11, 11, 6, 5, 1, 11, 1, 1, 15, 13, 2, 6, 6, 3, 7, 7, 13, 13, 6, 1, 12, 15, 1, 13, 5, 9, 11, 7, 14, 9, 11, 11, 2, 9, 11, 5, 8 };
    int startCity = 28;
    int endCity = 10;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case29() {
    int[] range = { 3, 6, 12, 6, 6, 14, 4, 7, 14, 12, 12, 4, 4, 11, 11, 9, 10, 13, 6, 8, 7, 8, 12, 14, 1, 2, 15, 9, 15, 11, 14, 13, 12, 3, 5, 9, 7, 14, 2, 10, 7, 14, 14, 12, 13 };
    int startCity = 1;
    int endCity = 16;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case30() {
    int[] range = { 8, 12, 8, 1, 8, 2, 15, 1, 7, 9, 12, 9, 5, 8, 10, 13, 9, 7, 7, 3, 11, 11, 15, 9, 8, 5, 4, 7, 3, 4, 15, 9, 9, 10, 9, 8, 15, 7, 14, 3, 7, 13, 10, 14, 7, 3, 3, 3, 6 };
    int startCity = 10;
    int endCity = 40;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case31() {
    int[] range = { 9, 15, 5, 1, 3, 8, 4, 13, 1, 10, 5, 14, 13, 10, 2, 7, 3, 1, 12, 12, 10, 5, 3, 13, 8, 14, 6, 3, 3, 7, 10, 6, 4, 2, 8, 6, 7, 4, 9, 2, 14, 5, 13, 7, 8, 2, 4, 2, 1, 3 };
    int startCity = 11;
    int endCity = 46;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case32() {
    int[] range = { 3, 1, 2, 3, 14, 2, 4, 9, 5, 9, 12, 1, 15, 8, 12, 9, 1, 11, 3, 9, 11, 12, 14, 13, 3, 12, 3, 15, 2, 6, 9, 10, 9, 11, 11, 10, 4, 15, 13, 5, 12, 9, 12, 5, 10, 5, 1 };
    int startCity = 46;
    int endCity = 21;
    assertEquals(4, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case33() {
    int[] range = { 11, 15, 9, 13, 7, 15, 11, 8, 6, 6, 11, 8, 12, 12, 13, 15, 12, 4, 10, 10, 5, 7, 8, 6, 6, 6, 3, 1, 8, 8, 11, 2, 9, 3, 13, 2, 7, 11, 7, 2, 13, 9 };
    int startCity = 38;
    int endCity = 28;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case34() {
    int[] range = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int startCity = 27;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case35() {
    int[] range = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int startCity = 4;
    int endCity = 35;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case36() {
    int[] range = { 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 2, 1, 1, 1 };
    int startCity = 36;
    int endCity = 10;
    assertEquals(16, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case37() {
    int[] range = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2 };
    int startCity = 44;
    int endCity = 20;
    assertEquals(15, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case38() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 48;
    int endCity = 23;
    assertEquals(25, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case39() {
    int[] range = { 2, 1, 1, 1, 1, 1 };
    int startCity = 4;
    int endCity = 1;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case40() {
    int[] range = { 50, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 5;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case41() {
    int[] range = { 1, 50, 1 };
    int startCity = 1;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case42() {
    int[] range = { 50, 50 };
    int startCity = 0;
    int endCity = 1;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case43() {
    int[] range = { 20, 1, 1, 1, 1, 1, 1, 3, 1, 1, 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 7, 1, 1 };
    int startCity = 7;
    int endCity = 34;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case44() {
    int[] range = { 50, 50, 50, 50, 50, 50 };
    int startCity = 1;
    int endCity = 4;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case45() {
    int[] range = { 1, 1, 1, 1, 5, 1, 1, 1, 1, 1 };
    int startCity = 3;
    int endCity = 0;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case46() {
    int[] range = { 50, 50, 50, 50, 50 };
    int startCity = 1;
    int endCity = 4;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case47() {
    int[] range = { 50, 50, 50, 50, 50, 50, 50 };
    int startCity = 0;
    int endCity = 4;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case48() {
    int[] range = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int startCity = 0;
    int endCity = 1;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case49() {
    int[] range = { 50, 50, 50, 50, 50 };
    int startCity = 1;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case50() {
    int[] range = { 50, 50, 50 };
    int startCity = 1;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case51() {
    int[] range = { 50, 1, 1 };
    int startCity = 0;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case52() {
    int[] range = { 50, 50, 50, 50 };
    int startCity = 0;
    int endCity = 1;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case53() {
    int[] range = { 50, 50, 50 };
    int startCity = 0;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case54() {
    int[] range = { 1, 1, 1 };
    int startCity = 2;
    int endCity = 0;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case55() {
    int[] range = { 3, 2, 1, 1, 3, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3 };
    int startCity = 0;
    int endCity = 8;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case56() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 12;
    int endCity = 17;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case57() {
    int[] range = { 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 16;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case58() {
    int[] range = { 50, 1 };
    int startCity = 0;
    int endCity = 1;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case59() {
    int[] range = { 50, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 3;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case60() {
    int[] range = { 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1 };
    int startCity = 5;
    int endCity = 8;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case61() {
    int[] range = { 50, 50, 50, 50 };
    int startCity = 0;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case62() {
    int[] range = { 50, 50, 50, 50, 50, 50, 50 };
    int startCity = 1;
    int endCity = 3;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case63() {
    int[] range = { 1, 14, 1, 1, 3, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3 };
    int startCity = 0;
    int endCity = 13;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case64() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1 };
    int startCity = 9;
    int endCity = 5;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case65() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6 };
    int startCity = 10;
    int endCity = 6;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case66() {
    int[] range = { 1, 1, 1, 1, 1, 1, 50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 12;
    assertEquals(7, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case67() {
    int[] range = { 50, 1, 1, 1 };
    int startCity = 0;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case68() {
    int[] range = { 4, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 1;
    int endCity = 4;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case69() {
    int[] range = { 50, 1, 50, 1, 50 };
    int startCity = 1;
    int endCity = 3;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case70() {
    int[] range = { 50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 3;
    int endCity = 10;
    assertEquals(4, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case71() {
    int[] range = { 2, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 6;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case72() {
    int[] range = { 3, 2, 1, 1, 3, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3 };
    int startCity = 0;
    int endCity = 1;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case73() {
    int[] range = { 46, 49, 49, 47, 48, 45 };
    int startCity = 1;
    int endCity = 4;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case74() {
    int[] range = { 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 30, 1, 1, 1 };
    int startCity = 0;
    int endCity = 30;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case75() {
    int[] range = { 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 1;
    int endCity = 15;
    assertEquals(7, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case76() {
    int[] range = { 10, 1, 1, 1, 1, 1, 1, 1, 50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 1;
    int endCity = 25;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case77() {
    int[] range = { 50, 50 };
    int startCity = 1;
    int endCity = 0;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case78() {
    int[] range = { 1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 26;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case79() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 14;
    assertEquals(14, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case80() {
    int[] range = { 1, 50, 1, 1, 1 };
    int startCity = 0;
    int endCity = 2;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case81() {
    int[] range = { 3, 2, 1, 1, 3, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3 };
    int startCity = 0;
    int endCity = 13;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case82() {
    int[] range = { 12, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case83() {
    int[] range = { 3, 3, 2, 2, 3, 2, 1, 1, 2, 3 };
    int startCity = 0;
    int endCity = 4;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case84() {
    int[] range = { 1, 1, 1, 3, 2, 3, 1, 1, 1 };
    int startCity = 4;
    int endCity = 8;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case85() {
    int[] range = { 1, 1, 1, 1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 5;
    int endCity = 13;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case86() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 4, 1, 1, 1, 1, 1, 20, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 20;
    int endCity = 40;
    assertEquals(4, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case87() {
    int[] range = { 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 1;
    int endCity = 4;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case88() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6 };
    int startCity = 0;
    int endCity = 3;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case89() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5 };
    int startCity = 0;
    int endCity = 3;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case90() {
    int[] range = { 1, 7, 1, 1, 1, 1, 50, 50, 50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 50, 50, 1, 1, 1 };
    int startCity = 0;
    int endCity = 10;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case91() {
    int[] range = { 4, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 1;
    int endCity = 4;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case92() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 48;
    int endCity = 49;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case93() {
    int[] range = { 50, 50, 50, 50, 50, 50, 50 };
    int startCity = 0;
    int endCity = 3;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case94() {
    int[] range = { 50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 4;
    int endCity = 9;
    assertEquals(5, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case95() {
    int[] range = { 11, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 3;
    int endCity = 11;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case96() {
    int[] range = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int startCity = 0;
    int endCity = 14;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case97() {
    int[] range = { 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 4;
    int endCity = 0;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case98() {
    int[] range = { 50, 50, 50, 50, 50 };
    int startCity = 0;
    int endCity = 3;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case99() {
    int[] range = { 50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case100() {
    int[] range = { 50, 50, 50, 50, 50, 50, 50 };
    int startCity = 0;
    int endCity = 6;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case101() {
    int[] range = { 1, 1, 1, 1, 1 };
    int startCity = 4;
    int endCity = 0;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case102() {
    int[] range = { 50, 50, 50 };
    int startCity = 0;
    int endCity = 1;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case103() {
    int[] range = { 1, 1, 2, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 2;
    int endCity = 8;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case104() {
    int[] range = { 50, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 6;
    int endCity = 5;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case105() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1 };
    int startCity = 9;
    int endCity = 14;
    assertEquals(3, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case106() {
    int[] range = { 14, 18, 23, 50, 24, 28, 14, 34, 39, 20, 26, 20, 12, 39, 13, 40, 5, 2, 24, 18, 15, 32, 15, 39, 46, 49, 3, 2, 41, 19, 49, 6, 38, 21, 5, 12, 49, 20, 45, 39, 39, 20, 10, 3, 10, 22, 42, 17, 23, 15 };
    int startCity = 33;
    int endCity = 37;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case107() {
    int[] range = { 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 4;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case108() {
    int[] range = { 50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 5;
    int endCity = 17;
    assertEquals(6, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case109() {
    int[] range = { 45, 29, 24, 10, 41, 16, 43, 43, 38, 4, 28, 30, 41, 13, 4, 20, 10, 8, 11, 34, 50, 29 };
    int startCity = 16;
    int endCity = 11;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case110() {
    int[] range = { 50, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 2;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case111() {
    int[] range = { 1, 1, 1, 10, 1, 10, 11, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1, 10, 1, 1, 1, 1, 1 };
    int startCity = 39;
    int endCity = 17;
    assertEquals(4, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case112() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 4 };
    int startCity = 0;
    int endCity = 3;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case113() {
    int[] range = { 49, 1, 49, 1, 49, 1, 1 };
    int startCity = 0;
    int endCity = 4;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case114() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 14;
    int endCity = 15;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case115() {
    int[] range = { 1, 1, 1, 1, 2, 1 };
    int startCity = 4;
    int endCity = 0;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case116() {
    int[] range = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    int startCity = 0;
    int endCity = 25;
    assertEquals(13, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case117() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6 };
    int startCity = 0;
    int endCity = 3;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case118() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 15;
    int endCity = 12;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case119() {
    int[] range = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 11;
    int endCity = 14;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case120() {
    int[] range = { 2, 7, 3, 6, 3, 2, 5 };
    int startCity = 1;
    int endCity = 5;
    assertEquals(1, travelonmars.minTimes(range, startCity, endCity));
  }

  @Test
  public void case121() {
    int[] range = { 2, 10, 1, 1, 1, 1, 1, 1, 1, 1 };
    int startCity = 0;
    int endCity = 5;
    assertEquals(2, travelonmars.minTimes(range, startCity, endCity));
  }

}
