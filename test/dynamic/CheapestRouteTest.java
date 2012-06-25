package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CheapestRouteTest {
  CheapestRoute cheapestroute = new CheapestRoute();

  @Test
  public void case1() {
    int[] cellPrice = { 100 };
    int[] enterCell = { 0 };
    int[] exitCell = { 0 };
    int teleportPrice = 1000;
    assertArrayEquals(new int[] { 0, 0 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case2() {
    int[] cellPrice = { 0, -1, 0, 0 };
    int[] enterCell = { 0 };
    int[] exitCell = { 2 };
    int teleportPrice = 1000;
    assertArrayEquals(new int[] { 1000, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case3() {
    int[] cellPrice = { 1, 2, 3 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 100;
    assertArrayEquals(new int[] { 5, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case4() {
    int[] cellPrice = { 1, 0, -1 };
    int[] enterCell = { 0 };
    int[] exitCell = { 2 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case5() {
    int[] cellPrice = { 1, 1, 100, 1 };
    int[] enterCell = { 1 };
    int[] exitCell = { 2 };
    int teleportPrice = 99;
    assertArrayEquals(new int[] { 101, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case6() {
    int[] cellPrice = { 1, 1, 100, 1 };
    int[] enterCell = { 0 };
    int[] exitCell = { 2 };
    int teleportPrice = 101;
    assertArrayEquals(new int[] { 102, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case7() {
    int[] cellPrice = { 0, 0, -1, 0, 0 };
    int[] enterCell = { 0, 1, 3, 4 };
    int[] exitCell = { 2, 2, 2, 2 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case8() {
    int[] cellPrice = { 1, 2, 3, 4, 5, 6 };
    int[] enterCell = { 0 };
    int[] exitCell = { 5 };
    int teleportPrice = 14;
    assertArrayEquals(new int[] { 14, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case9() {
    int[] cellPrice = { 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1 };
    int[] enterCell = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46 };
    int[] exitCell = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48 };
    int teleportPrice = 1000;
    assertArrayEquals(new int[] { 24276, 24 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case10() {
    int[] cellPrice = { 1, -1, -1, -1, 1, 1000, 0 };
    int[] enterCell = { 0, 4 };
    int[] exitCell = { 4, 5 };
    int teleportPrice = 999;
    assertArrayEquals(new int[] { 1999, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case11() {
    int[] cellPrice = { 1, -1, -1, -1, 1, 1000, 0 };
    int[] enterCell = { 0, 4 };
    int[] exitCell = { 4, 5 };
    int teleportPrice = 1000;
    assertArrayEquals(new int[] { 2000, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case12() {
    int[] cellPrice = { 31, 60, 24 };
    int[] enterCell = { 1, 0, 0, 2, 2, 2, 2, 1, 2, 0, 2, 2, 0, 1, 1, 2, 2, 0, 2, 1, 1, 0, 0, 1, 2, 0, 2, 0, 1, 2, 2, 1, 0, 2, 1, 0 };
    int[] exitCell = { 2, 0, 0, 0, 0, 1, 1, 0, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 2, 0, 0, 0, 1, 2, 1, 1, 2, 2, 0, 2, 2, 0, 0, 2, 1 };
    int teleportPrice = 256;
    assertArrayEquals(new int[] { 84, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case13() {
    int[] cellPrice = { 5, 52, -1 };
    int[] enterCell = { 1, 2, 1, 1, 1, 0, 2, 2, 0, 0, 1, 1, 1, 0, 2, 1, 2, 2, 2, 2, 0, 0, 1, 0, 0 };
    int[] exitCell = { 2, 2, 0, 1, 2, 1, 2, 1, 2, 0, 0, 1, 1, 2, 1, 1, 0, 2, 2, 0, 2, 0, 1, 2, 2 };
    int teleportPrice = 42;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case14() {
    int[] cellPrice = { 97, 39, -1, 46 };
    int[] enterCell = { 1, 1, 0, 2, 2, 1, 2, 1, 1, 3, 2, 1, 1, 3, 3, 0, 3, 0, 0, 2, 1, 0, 2, 2, 1, 2, 2, 0, 1, 2, 3, 1, 3, 0, 2, 3, 0, 2, 3, 3, 1, 3, 3, 0, 2, 0, 2, 2, 3, 0 };
    int[] exitCell = { 3, 3, 3, 2, 2, 0, 2, 3, 1, 3, 2, 1, 2, 0, 2, 0, 0, 2, 3, 2, 0, 0, 2, 0, 3, 3, 2, 3, 1, 1, 2, 0, 3, 2, 2, 0, 3, 2, 2, 3, 0, 3, 2, 3, 2, 1, 0, 3, 3, 3 };
    int teleportPrice = 135;
    assertArrayEquals(new int[] { 135, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case15() {
    int[] cellPrice = { 74, -1, 77, -1 };
    int[] enterCell = { 3, 1, 1, 0, 3, 3, 1, 3, 3, 3, 0, 0, 0, 0, 2, 3, 0, 3, 3, 2, 3 };
    int[] exitCell = { 3, 1, 3, 1, 3, 0, 1, 2, 2, 2, 2, 0, 3, 1, 0, 0, 3, 2, 3, 3, 3 };
    int teleportPrice = 25;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case16() {
    int[] cellPrice = { 97, 91, 4, -1, -1 };
    int[] enterCell = { 2, 4, 4, 1, 2, 1, 0, 3, 3, 1, 2, 4, 3, 2, 1, 0, 4, 3, 1, 3, 0 };
    int[] exitCell = { 4, 3, 0, 4, 3, 0, 1, 1, 2, 1, 0, 1, 4, 2, 0, 2, 1, 4, 4, 1, 2 };
    int teleportPrice = 144;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case17() {
    int[] cellPrice = { 83, 32, 67, -1, 37 };
    int[] enterCell = { 2, 3, 4, 3, 1, 4, 0, 2, 4, 2, 3, 0, 0, 3, 0, 2, 2, 3, 0, 4, 3, 4, 1 };
    int[] exitCell = { 0, 4, 4, 3, 1, 3, 1, 4, 4, 3, 2, 0, 4, 0, 0, 0, 0, 2, 2, 0, 0, 4, 3 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 0, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case18() {
    int[] cellPrice = { 64, 44, -1, 100, -1, 98 };
    int[] enterCell = { 5, 5, 2, 2, 2, 4, 2, 2, 2, 0, 0, 3, 0, 1, 3, 3, 5, 4, 2, 1, 4, 2, 5 };
    int[] exitCell = { 4, 1, 4, 1, 5, 3, 5, 3, 5, 4, 4, 2, 2, 5, 2, 4, 2, 2, 5, 0, 0, 0, 3 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 44, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case19() {
    int[] cellPrice = { 4, 77, 56, 61, 10, 52 };
    int[] enterCell = { 0, 3, 4, 4, 2, 1, 1, 1, 0, 0, 4, 4, 3, 0, 2, 2, 3, 3, 5, 2, 2, 1, 5, 5, 4, 5, 1, 2, 2, 0, 1, 4, 5 };
    int[] exitCell = { 0, 5, 4, 2, 0, 4, 2, 3, 1, 0, 5, 3, 0, 4, 4, 0, 3, 3, 0, 4, 2, 3, 3, 1, 1, 1, 2, 3, 1, 0, 1, 2, 0 };
    int teleportPrice = 108;
    assertArrayEquals(new int[] { 160, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case20() {
    int[] cellPrice = { 78, 17, 16, 91, 22, 94, 19 };
    int[] enterCell = { 4, 1, 3, 0, 3, 3, 2, 2, 0, 2, 3, 5, 6, 0, 0, 3, 5, 3, 0, 2, 5, 5, 1, 3, 4 };
    int[] exitCell = { 1, 4, 6, 4, 1, 4, 4, 6, 1, 5, 1, 6, 5, 2, 0, 0, 1, 1, 2, 2, 2, 6, 2, 1, 5 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 1, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case21() {
    int[] cellPrice = { 18, -1, 15, 22, 78, 27, 58 };
    int[] enterCell = { 5, 1, 5, 6, 0, 2, 6, 6, 0, 4, 4, 1, 1, 5, 0, 2, 2, 5, 5, 5, 1, 2, 5, 3, 2, 6, 6, 0, 0, 0, 4, 6, 2, 0, 5, 4, 3, 2, 1, 0, 5, 4, 2, 4, 0, 6, 1, 0, 0, 0 };
    int[] exitCell = { 1, 5, 5, 4, 5, 4, 2, 0, 4, 5, 1, 6, 5, 4, 3, 2, 4, 0, 6, 5, 4, 6, 1, 4, 5, 3, 1, 2, 6, 1, 6, 5, 4, 5, 3, 2, 6, 3, 3, 6, 3, 4, 2, 0, 6, 3, 1, 5, 1, 2 };
    int teleportPrice = 160;
    assertArrayEquals(new int[] { 160, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case22() {
    int[] cellPrice = { 32, 12, 88, 4, 27, 98, 69, 6 };
    int[] enterCell = { 0, 6, 3, 3, 6, 4, 0, 0, 2, 2, 4, 5, 6, 0, 5, 3, 3, 3, 2, 4, 4, 3, 0, 5, 3, 3, 2, 1, 3, 0, 1, 1, 7, 5, 5, 3, 1, 6, 2, 1, 5, 4, 7, 4, 6 };
    int[] exitCell = { 1, 3, 0, 1, 4, 0, 1, 1, 7, 4, 6, 3, 7, 6, 6, 3, 4, 6, 0, 6, 2, 0, 7, 2, 6, 3, 6, 2, 5, 5, 0, 7, 2, 1, 3, 4, 6, 3, 6, 0, 5, 3, 0, 1, 6 };
    int teleportPrice = 24;
    assertArrayEquals(new int[] { 24, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case23() {
    int[] cellPrice = { 62, 67, 89, 22, 37, -1, -1, -1 };
    int[] enterCell = { 1, 7, 2, 0, 5, 4, 1, 4, 2, 1, 5, 5, 3, 7 };
    int[] exitCell = { 0, 3, 2, 6, 7, 6, 5, 0, 1, 4, 1, 6, 0, 0 };
    int teleportPrice = 105;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case24() {
    int[] cellPrice = { 26, -1, -1, 88, 28, -1, -1, 30, 62 };
    int[] enterCell = { 7, 7, 7 };
    int[] exitCell = { 4, 6, 0 };
    int teleportPrice = 48;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case25() {
    int[] cellPrice = { 97, 63, 95, 16, 20, -1, 24, 50, -1 };
    int[] enterCell = { 3, 2, 0, 0, 6, 3, 3, 3, 4, 4, 3, 3, 6, 0, 1, 4, 1, 5, 2, 3, 0, 0, 1, 2, 4, 3, 7, 0, 7, 0, 1, 8, 2, 0, 2, 5, 3, 2, 2, 6, 7, 2, 8 };
    int[] exitCell = { 1, 4, 0, 5, 8, 0, 5, 0, 6, 6, 3, 5, 6, 0, 7, 2, 0, 3, 4, 8, 6, 1, 6, 5, 4, 8, 4, 4, 8, 7, 3, 5, 1, 0, 6, 5, 6, 6, 1, 3, 2, 1, 0 };
    int teleportPrice = 400;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case26() {
    int[] cellPrice = { 58, 60, -1, 9, 46, 1, 69, 37, 99, 22 };
    int[] enterCell = { 5, 3, 1, 7, 3, 5, 6, 9, 4, 1, 6, 4, 1, 7, 8, 8, 0, 5, 8, 2, 2, 3, 1, 1, 6, 1, 3, 3, 4, 1, 8, 2, 7, 1, 5, 7, 1, 1, 2, 4, 0, 2, 6, 1, 0 };
    int[] exitCell = { 6, 9, 8, 5, 5, 2, 7, 5, 7, 6, 4, 5, 7, 5, 1, 6, 3, 2, 0, 6, 9, 1, 9, 6, 8, 5, 6, 9, 8, 3, 0, 1, 1, 0, 6, 8, 2, 3, 0, 4, 7, 6, 7, 1, 1 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 1, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case27() {
    int[] cellPrice = { 75, -1, 6, -1, 8, -1, 100, 25, 11, -1 };
    int[] enterCell = { 2, 0, 7, 6, 4, 5, 4, 1, 8, 6, 0, 7, 2, 8, 6, 5, 2, 4, 5, 1 };
    int[] exitCell = { 0, 0, 3, 2, 4, 8, 2, 1, 2, 4, 4, 1, 7, 9, 6, 1, 9, 6, 8, 7 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case28() {
    int[] cellPrice = { 34, 19, 11, 60, 91, 40, 17, 50, -1, 83, 14 };
    int[] enterCell = { 5, 0, 7, 7, 2, 10, 8, 2, 7, 1, 6, 9, 5, 10, 5, 2, 7, 2, 5, 10, 0, 2, 4, 0, 5, 5 };
    int[] exitCell = { 2, 2, 4, 6, 7, 1, 8, 6, 0, 4, 6, 0, 7, 10, 3, 0, 2, 5, 6, 1, 2, 9, 1, 4, 10, 5 };
    int teleportPrice = 320;
    assertArrayEquals(new int[] { 364, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case29() {
    int[] cellPrice = { 16, 42, 49, -1, 10, 29, 90, 68, 40, -1, 49 };
    int[] enterCell = { 2, 10, 1, 0, 8, 1, 0, 0, 1 };
    int[] exitCell = { 3, 1, 2, 4, 2, 2, 8, 2, 6 };
    int teleportPrice = 20;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case30() {
    int[] cellPrice = { 0, 32, 64, 84, 93, 22, 24, -1, 73, 31, 57, 4 };
    int[] enterCell = { 5, 8, 0, 2, 9, 7, 0, 1, 3, 4, 5, 9, 2, 6, 9, 7, 1, 0, 4, 8, 5, 11, 0, 2, 2, 11, 4, 4, 7, 7, 8, 0 };
    int[] exitCell = { 3, 0, 7, 8, 11, 9, 0, 7, 8, 4, 3, 10, 4, 6, 7, 10, 11, 3, 8, 0, 2, 0, 3, 2, 1, 2, 7, 11, 1, 8, 3, 11 };
    int teleportPrice = 240;
    assertArrayEquals(new int[] { 240, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case31() {
    int[] cellPrice = { 17, 29, 82, 59, 98, 58, 24, 60, 69, 24, 23, 68 };
    int[] enterCell = { 5, 2, 8, 2, 5, 2, 3, 0, 10, 7 };
    int[] exitCell = { 2, 7, 1, 1, 11, 5, 2, 1, 8, 10 };
    int teleportPrice = 18;
    assertArrayEquals(new int[] { 139, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case32() {
    int[] cellPrice = { 48, 15, 82, 1, 40, 77, 97, 5, 66, 86, 62, 60, 15 };
    int[] enterCell = { 2, 10, 12, 9, 3, 5, 10, 3, 6, 11, 5, 12, 12, 7, 6, 4, 12, 4, 2, 10 };
    int[] exitCell = { 11, 5, 9, 7, 1, 1, 0, 3, 4, 10, 3, 1, 1, 3, 8, 1, 12, 10, 0, 11 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 112, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case33() {
    int[] cellPrice = { 13, 64, -1, 72, -1, 39, 18, -1, 11, -1, 42, 23, 90 };
    int[] enterCell = { 1, 2, 10, 7, 3 };
    int[] exitCell = { 12, 5, 6, 2, 9 };
    int teleportPrice = 240;
    assertArrayEquals(new int[] { 304, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case34() {
    int[] cellPrice = { 85, 76, 26, 41, 38, -1, 38, 14, 95, 51, 84, -1, 67, 4 };
    int[] enterCell = { 8, 11, 0, 0, 13, 10, 9, 2, 1, 7, 10, 11, 6, 8, 0, 3, 6, 3, 6, 12, 13 };
    int[] exitCell = { 4, 12, 11, 6, 0, 2, 2, 13, 11, 0, 0, 6, 10, 13, 3, 3, 5, 9, 9, 5, 4 };
    int teleportPrice = 42;
    assertArrayEquals(new int[] { 111, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case35() {
    int[] cellPrice = { 77, 72, 69, 49, 38, 1, 66, 94, -1, 45, 70, 35, 91, 4 };
    int[] enterCell = { 0, 12, 3, 4, 2, 10, 6, 9, 2, 12, 13, 4, 12, 10, 13, 3, 4, 4, 12, 3, 1, 6, 4, 9, 1, 3, 8, 0, 1, 12, 3, 0, 13, 12, 5 };
    int[] exitCell = { 13, 5, 5, 13, 6, 2, 7, 4, 1, 5, 10, 3, 9, 3, 11, 11, 10, 4, 13, 0, 4, 8, 4, 3, 5, 8, 5, 7, 3, 2, 10, 4, 5, 1, 2 };
    int teleportPrice = 72;
    assertArrayEquals(new int[] { 72, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case36() {
    int[] cellPrice = { 97, 70, -1, 14, 36, 21, 29, 34, 74, 80, 93, 97, 74, 81, 75 };
    int[] enterCell = { 10, 6, 8, 8, 8, 5, 11, 6, 5, 0, 10, 5, 8, 4 };
    int[] exitCell = { 5, 4, 11, 10, 0, 1, 3, 12, 1, 8, 4, 8, 0, 3 };
    int teleportPrice = 60;
    assertArrayEquals(new int[] { 340, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case37() {
    int[] cellPrice = { 7, 77, 12, 91, 85, 67, 68, 77, 33, 61, 65, 89, 27, 0, 61 };
    int[] enterCell = { 6, 13, 12, 12, 8, 0, 0, 12, 11, 4, 12, 11, 5, 14, 7, 7, 4, 0, 3, 13, 1, 3, 13, 7, 2, 5, 6, 4, 6, 2, 4, 10, 2, 12, 0, 14, 6, 11, 8, 2, 0, 4, 10, 13, 2, 5, 14, 12, 8 };
    int[] exitCell = { 5, 8, 2, 14, 10, 9, 0, 5, 3, 0, 2, 4, 7, 9, 4, 6, 1, 10, 11, 12, 12, 14, 11, 8, 10, 8, 1, 6, 14, 14, 13, 8, 5, 0, 0, 12, 9, 13, 1, 12, 6, 9, 6, 13, 6, 14, 13, 5, 3 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 1, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case38() {
    int[] cellPrice = { 58, 53, 20, 23, 64, 83, 97, 33, 3, 56, 24, 28, 50, -1, 0, 83 };
    int[] enterCell = { 12, 4, 9, 0, 4, 12, 13, 13, 3, 5, 15, 14, 10, 12, 10, 0, 9, 13, 5, 1, 5, 15 };
    int[] exitCell = { 2, 8, 9, 14, 5, 7, 10, 8, 9, 3, 15, 13, 0, 4, 1, 0, 10, 8, 0, 3, 8, 12 };
    int teleportPrice = 84;
    assertArrayEquals(new int[] { 167, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case39() {
    int[] cellPrice = { 93, -1, -1, 23, 25, 95, 43, -1, 30, 22, 4, -1, 21, -1, 79, 97 };
    int[] enterCell = { 15, 5, 2, 12, 13, 1, 14 };
    int[] exitCell = { 9, 6, 2, 0, 2, 7, 7 };
    int teleportPrice = 300;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case40() {
    int[] cellPrice = { 30, 95, 4, 57, 65, 62, 22, 51, 43, 100, 2, 43, 71, 8, 99, 37, 53 };
    int[] enterCell = { 6, 0, 13, 1, 12, 0, 16, 6, 2, 9, 5, 7, 4, 1, 4, 14, 4, 14, 1, 0, 6, 6, 9, 8, 14, 4, 3, 6, 2, 2, 9, 3, 6, 2, 16, 8, 9 };
    int[] exitCell = { 8, 3, 14, 2, 14, 12, 10, 8, 0, 15, 13, 1, 9, 8, 6, 3, 14, 16, 14, 11, 1, 3, 11, 16, 2, 2, 14, 1, 8, 5, 16, 2, 5, 7, 14, 2, 16 };
    int teleportPrice = 360;
    assertArrayEquals(new int[] { 545, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case41() {
    int[] cellPrice = { 45, 20, 41, 78, 25, -1, 37, 16, 52, 93, 25, 23, 67, 65, 13, 13, 11 };
    int[] enterCell = { 14, 13, 9, 3, 3, 12, 9, 1, 2, 11, 15 };
    int[] exitCell = { 6, 11, 10, 2, 6, 1, 13, 3, 2, 4, 0 };
    int teleportPrice = 32;
    assertArrayEquals(new int[] { 317, 10 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case42() {
    int[] cellPrice = { 35, -1, 14, 80, 96, -1, -1, 37, 44, 43, 85, 37, 98, 13, 95, 89, 1, 72 };
    int[] enterCell = { 4, 10, 10, 0, 6, 9, 13, 10, 14, 3, 16, 2, 8, 11, 0 };
    int[] exitCell = { 9, 13, 4, 13, 12, 1, 11, 10, 17, 14, 6, 9, 11, 16, 2 };
    int teleportPrice = 24;
    assertArrayEquals(new int[] { 144, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case43() {
    int[] cellPrice = { 84, 43, -1, 90, 47, -1, -1, 98, 32, 16, 45, 91, 73, 40, -1, 91, 40, 58 };
    int[] enterCell = { 15, 5, 6, 9 };
    int[] exitCell = { 5, 6, 2, 6 };
    int teleportPrice = 180;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case44() {
    int[] cellPrice = { 20, 53, 20, 49, -1, 0, 80, 27, 47, 16, 66, -1, -1, -1, 6, -1, -1, 36, -1 };
    int[] enterCell = { 15, 12, 1 };
    int[] exitCell = { 13, 2, 14 };
    int teleportPrice = 180;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case45() {
    int[] cellPrice = { 28, 85, 91, 89, 77, 4, 46, 47, -1, 30, 50, 6, 40, -1, 13, 59, 1, 24, 61 };
    int[] enterCell = { 6, 11, 14, 5, 10, 3, 4, 15, 7, 0, 6, 5, 10, 15, 7, 17, 0, 12, 11, 3, 18, 3, 6, 0, 11, 3, 7, 2, 18, 18, 2 };
    int[] exitCell = { 18, 7, 5, 2, 0, 8, 0, 17, 7, 3, 5, 4, 0, 17, 16, 6, 11, 7, 7, 0, 3, 1, 5, 0, 17, 16, 14, 18, 17, 2, 5 };
    int teleportPrice = 140;
    assertArrayEquals(new int[] { 316, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case46() {
    int[] cellPrice = { 5, 98, 87, 25, 67, 48, 26, 75, 33, 25, 71, 67, -1, 33, 21, 33, 57, 69, 84, -1 };
    int[] enterCell = { 6, 2, 5, 0, 9, 6, 7, 7, 11, 14, 15, 6, 16, 12, 18, 15, 17, 11, 0, 11, 3, 15, 7, 0, 3, 9, 11, 19, 7 };
    int[] exitCell = { 13, 10, 16, 6, 3, 9, 8, 4, 2, 1, 2, 0, 5, 19, 9, 3, 16, 16, 0, 18, 19, 10, 15, 6, 10, 11, 1, 17, 5 };
    int teleportPrice = 60;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case47() {
    int[] cellPrice = { 63, 54, 44, 94, 17, 4, 65, 14, 27, 77, 44, 51, -1, 74, 33, 91, 4, 44, 6, 58 };
    int[] enterCell = { 16, 18, 19, 1, 1, 1, 8, 16, 8, 17, 3, 1, 3, 7, 15, 15, 12, 8, 15, 0, 13 };
    int[] exitCell = { 1, 0, 5, 14, 9, 2, 0, 0, 7, 1, 4, 3, 17, 14, 12, 10, 14, 10, 15, 17, 7 };
    int teleportPrice = 60;
    assertArrayEquals(new int[] { 124, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case48() {
    int[] cellPrice = { 48, 33, 40, 62, 36, 37, 38, 25, 73, 37, 8, 32, 82, 35, 15, 14, 65, 3, 24, 14, 91 };
    int[] enterCell = { 3, 18, 13, 15, 19, 14, 3, 4, 16, 6, 19, 14, 0, 10, 20, 19, 4, 14, 13, 2, 20, 10, 14, 7, 14, 18, 1, 20, 18, 18, 8 };
    int[] exitCell = { 9, 17, 3, 14, 14, 3, 9, 2, 4, 3, 9, 19, 3, 9, 15, 5, 14, 1, 6, 20, 4, 0, 8, 2, 11, 9, 20, 8, 0, 20, 12 };
    int teleportPrice = 189;
    assertArrayEquals(new int[] { 222, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case49() {
    int[] cellPrice = { 100, 29, 20, -1, 52, 98, 2, 75, -1, -1, 88, -1, 62, 14, 19, 37, -1, -1, 61, -1, 0 };
    int[] enterCell = { 14, 17, 11, 11, 7 };
    int[] exitCell = { 2, 13, 5, 15, 17 };
    int teleportPrice = 36;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case50() {
    int[] cellPrice = { 26, 68, 80, 80, 88, 95, 72, 5, 54, 52, 21, 91, 89, 28, 39, 62, 92, 36, 65, 63, 40, 75 };
    int[] enterCell = { 7, 2, 20, 2, 5, 15, 18, 11, 0, 13, 15, 8, 5, 3, 6, 14 };
    int[] exitCell = { 5, 19, 14, 15, 7, 17, 15, 4, 8, 12, 4, 14, 12, 21, 10, 12 };
    int teleportPrice = 45;
    assertArrayEquals(new int[] { 273, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case51() {
    int[] cellPrice = { 32, 25, 14, 23, 91, 95, 27, 56, 29, 66, 92, 20, 76, 68, 18, 7, 31, 78, 20, 51, 88, 11 };
    int[] enterCell = { 15, 1, 2, 19, 1, 2, 12, 11, 3, 7, 15, 19, 5, 9, 3, 7, 6, 17, 10, 9, 9, 6, 16, 9, 3, 20, 4, 13, 18, 9, 12, 14, 21, 10, 21, 6, 7, 4, 19, 19, 2, 21, 14, 16, 0, 3, 12, 4, 14 };
    int[] exitCell = { 15, 9, 12, 4, 17, 21, 17, 8, 7, 21, 12, 6, 9, 18, 20, 4, 20, 20, 20, 7, 1, 10, 9, 20, 12, 16, 21, 11, 10, 21, 10, 9, 2, 10, 14, 4, 20, 14, 8, 1, 2, 8, 21, 6, 8, 16, 14, 3, 11 };
    int teleportPrice = 540;
    assertArrayEquals(new int[] { 579, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case52() {
    int[] cellPrice = { 53, 94, 94, 28, 94, 7, 70, 72, 33, 91, 82, 44, 42, 36, 43, 32, 14, 16, 39, 71, 96, 26, 96 };
    int[] enterCell = { 4, 6, 21, 15, 12, 10, 17, 3, 13, 20, 13, 22, 20, 10, 3, 22 };
    int[] exitCell = { 10, 13, 18, 12, 12, 15, 19, 13, 12, 9, 0, 11, 10, 2, 19, 22 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 434, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case53() {
    int[] cellPrice = { 85, 28, 82, -1, 0, 6, 72, 7, 61, 17, 5, 44, 1, 8, 55, 22, 76, 60, 44, 98, -1, 92, 36 };
    int[] enterCell = { 22, 17, 19, 19, 14, 14, 13, 15, 20, 16, 6, 3, 18, 0, 5, 16, 20, 20, 4, 2, 7, 19, 5, 15, 16, 11, 22, 6, 9, 7, 18, 9, 16, 2, 4, 4, 22, 17, 4, 2 };
    int[] exitCell = { 15, 5, 22, 10, 16, 19, 14, 10, 2, 19, 0, 8, 12, 10, 4, 19, 2, 14, 3, 15, 20, 14, 8, 2, 11, 3, 10, 3, 10, 18, 7, 17, 3, 8, 12, 17, 5, 22, 11, 22 };
    int teleportPrice = 180;
    assertArrayEquals(new int[] { 290, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case54() {
    int[] cellPrice = { 5, -1, 98, -1, -1, 88, -1, -1, -1, 61, 100, -1, -1, 36, -1, 68, 58, -1, 72, -1, 73, 79, -1, 71 };
    int[] enterCell = { 19, 22 };
    int[] exitCell = { 10, 3 };
    int teleportPrice = 600;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case55() {
    int[] cellPrice = { 34, 10, 9, 69, 22, -1, 63, 39, 19, 37, 14, 28, 97, 7, 61, 13, 39, 73, 71, 86, 17, 18, 67, 13 };
    int[] enterCell = { 15, 16, 4, 6, 1, 14, 17, 13, 23, 18, 3, 1, 14 };
    int[] exitCell = { 4, 4, 7, 7, 11, 16, 22, 3, 16, 4, 6, 0, 19 };
    int teleportPrice = 216;
    assertArrayEquals(new int[] { 723, 10 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case56() {
    int[] cellPrice = { 35, 70, -1, 42, 26, 11, 59, 21, 73, 43, 21, 32, 35, 49, 96, 51, -1, 72, 26, 25, 9, 57, 20, 93, 23 };
    int[] enterCell = { 2, 11, 11, 2, 20, 8, 11, 13, 10, 1, 18, 23, 19, 15, 24, 18, 21, 4, 4, 1, 0, 24, 12, 19, 14, 17, 2, 14, 7, 18, 10, 16, 9, 11, 16, 7, 1, 10 };
    int[] exitCell = { 2, 24, 4, 2, 24, 15, 9, 19, 7, 4, 9, 15, 3, 9, 13, 6, 2, 8, 9, 20, 14, 5, 20, 20, 19, 13, 3, 23, 11, 2, 7, 23, 21, 7, 4, 23, 22, 3 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 6, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case57() {
    int[] cellPrice = { 50, 4, 8, 6, 43, 99, 45, 68, 35, 98, 45, 19, 64, 18, 71, 4, 43, -1, 32, -1, 97, 76, 45, 70, 53 };
    int[] enterCell = { 11, 7, 14, 6, 12, 11, 17, 4, 14, 3 };
    int[] exitCell = { 13, 20, 1, 23, 17, 6, 9, 19, 7, 23 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 71, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case58() {
    int[] cellPrice = { 3, 92, -1, 62, 93, -1, 30, 77, 97, 71, 46, -1, 82, -1, 17, 98, 40, 0, 37, 34, 94, 2, 98, 36, 82, 46 };
    int[] enterCell = { 15, 4, 16, 6, 15, 21, 11, 14, 14, 12, 9, 23 };
    int[] exitCell = { 5, 14, 22, 21, 6, 19, 8, 2, 9, 1, 23, 2 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case59() {
    int[] cellPrice = { 66, 7, 70, 57, 53, 9, 75, 70, 38, 82, 52, 72, 28, 49, 57, 22, 60, -1, 57, 99, 23, 96, 92, 22, 3, 94 };
    int[] enterCell = { 20, 25, 13, 1, 21, 11, 10, 23, 7, 11, 20, 2, 22, 14, 9, 16, 1, 14, 15, 19, 22, 14, 20, 9, 18 };
    int[] exitCell = { 4, 25, 8, 3, 4, 2, 21, 9, 0, 10, 17, 11, 18, 20, 0, 1, 25, 9, 5, 14, 9, 8, 20, 25, 3 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 7, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case60() {
    int[] cellPrice = { 9, 21, 41, 10, 53, 42, 92, 14, 96, 99, 49, 32, 54, 69, 66, 29, 80, 36, 49, 10, 9, 80, 70, 1, 43, 99, 20 };
    int[] enterCell = { 14, 21, 21, 17, 16, 17, 17, 6, 6, 7, 22, 4, 3, 2, 23, 5, 10, 9, 18, 24, 21, 24, 14, 7, 12, 21, 5, 20, 19, 3, 18, 9, 6, 17, 0, 16, 15, 10, 0, 25, 14, 14, 4, 22, 23, 6 };
    int[] exitCell = { 13, 2, 24, 15, 8, 20, 0, 5, 7, 16, 5, 25, 20, 14, 23, 23, 17, 26, 4, 8, 14, 21, 10, 23, 5, 9, 6, 23, 13, 15, 4, 12, 5, 16, 10, 24, 8, 8, 19, 20, 5, 11, 19, 8, 2, 25 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 21, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case61() {
    int[] cellPrice = { 92, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    int[] enterCell = { 10 };
    int[] exitCell = { 17 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case62() {
    int[] cellPrice = { 78, 18, 79, 48, 92, 60, -1, 44, -1, 62, 41, 59, 97, 8, 0, 17, 91, 5, -1, 73, 2, 65, 15, 64, 0, 75, 91, 42 };
    int[] enterCell = { 13, 14, 15, 3, 15, 25, 16, 2, 23, 26, 24, 7, 26, 16, 5, 24, 19, 3, 26, 11, 24, 5, 8, 19, 26, 14, 27, 13, 5, 16 };
    int[] exitCell = { 21, 6, 2, 26, 7, 9, 25, 24, 3, 3, 9, 20, 14, 2, 10, 16, 10, 23, 14, 0, 11, 27, 23, 21, 26, 0, 20, 19, 2, 23 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 149, 8 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case63() {
    int[] cellPrice = { 49, 23, 75, 43, 67, 31, 40, 59, 86, 54, 37, 75, -1, 66, 29, 96, 21, 16, 18, 64, 41, 95, -1, 42, 11, 30, -1, 52 };
    int[] enterCell = { 3, 18, 25, 22, 11, 6, 6, 26, 9, 15, 16, 24, 4, 22, 24, 2, 18, 20, 4, 21, 22, 0, 12, 6, 19, 26, 15, 19, 22, 19, 18, 26, 8, 24, 21, 10, 10, 24, 27, 16 };
    int[] exitCell = { 22, 2, 21, 7, 10, 18, 10, 14, 26, 23, 9, 14, 1, 21, 26, 16, 4, 8, 10, 0, 17, 0, 5, 12, 2, 10, 21, 18, 12, 7, 17, 11, 9, 4, 11, 20, 16, 22, 18, 7 };
    int teleportPrice = 80;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case64() {
    int[] cellPrice = { 62, 0, 14, 60, -1, 24, 53, 18, 38, 31, 12, -1, -1, 12, 16, 8, 90, 11, 35, 51, 3, 19, 42, 83, 29, 46, 32, -1, 69 };
    int[] enterCell = { 11, 20, 14, 21, 16, 3, 11, 13, 24, 6 };
    int[] exitCell = { 10, 18, 26, 1, 22, 8, 4, 19, 9, 24 };
    int teleportPrice = 128;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case65() {
    int[] cellPrice = { 51, 99, 26, 71, 67, 83, 5, 26, 34, 31, 1, 75, 93, 47, -1, 86, 71, 69, 86, 7, 37, -1, 45, -1, 50, 57, 78, 18, 66 };
    int[] enterCell = { 18, 19, 20, 13, 23, 12 };
    int[] exitCell = { 8, 10, 3, 3, 13, 13 };
    int teleportPrice = 225;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case66() {
    int[] cellPrice = { 93, 100, 96, 13, 2, 37, 69, 27, 33, 52, 40, 58, 91, 14, -1, 67, 1, 82, 78, 21, -1, 69, 97, 92, 65, 17, -1, 96, 27, 29 };
    int[] enterCell = { 13, 17, 14, 27, 3, 20, 2, 9, 4, 25, 16, 16, 21, 14, 3, 16, 22, 9, 26, 1, 5, 8, 8, 3, 28, 21 };
    int[] exitCell = { 4, 22, 14, 26, 8, 11, 9, 8, 0, 17, 7, 10, 22, 9, 23, 0, 12, 10, 18, 11, 4, 8, 20, 29, 13, 22 };
    int teleportPrice = 630;
    assertArrayEquals(new int[] { 839, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case67() {
    int[] cellPrice = { 77, 97, -1, 71, 92, 90, 58, 6, -1, 64, 91, -1, 52, -1, 59, 91, 98, 30, 57, 37, 9, -1, 69, 22, 70, -1, 4, 37, 3, 77 };
    int[] enterCell = { 20, 13, 8, 27, 7, 25 };
    int[] exitCell = { 16, 3, 25, 9, 22, 8 };
    int teleportPrice = 280;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case68() {
    int[] cellPrice = { 57, 64, 21, 0, -1, 17, 63, 31, 79, 96, 26, 50, 19, 45, 98, 58, 25, 46, 72, 30, 49, 4, -1, 78, 27, 100, 85, 65, 85, 54, 72 };
    int[] enterCell = { 7, 23, 20, 27, 17, 19, 19, 18, 25, 8, 11, 2, 21, 26, 2, 14, 26, 13, 24, 7, 11, 5 };
    int[] exitCell = { 15, 27, 2, 0, 14, 5, 10, 22, 7, 10, 1, 3, 2, 9, 24, 6, 8, 27, 14, 28, 28, 16 };
    int teleportPrice = 280;
    assertArrayEquals(new int[] { 826, 9 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case69() {
    int[] cellPrice = { 45, -1, 60, 35, 57, 77, 24, 76, 93, -1, 64, 30, 89, -1, -1, 25, 7, 80, -1, 0, 21, 16, 87, -1, 43, 14, 91, 18, 93, 25, 64 };
    int[] enterCell = { 26, 8, 9, 29, 20, 24, 23, 7, 10, 25, 3, 4, 11, 1, 26, 26, 3, 29, 30 };
    int[] exitCell = { 18, 8, 5, 14, 15, 16, 30, 13, 19, 4, 12, 15, 0, 21, 10, 21, 28, 24, 12 };
    int teleportPrice = 112;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case70() {
    int[] cellPrice = { 93, 27, 42, -1, 12, 80, 86, 49, -1, -1, -1, 48, 44, 100, 99, 81, 70, 71, -1, 56, -1, 33, 89, -1, 83, 40, -1, 30, -1, 84, 43, 82 };
    int[] enterCell = { 29, 18, 4, 9, 26, 27 };
    int[] exitCell = { 10, 23, 21, 26, 28, 23 };
    int teleportPrice = 75;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case71() {
    int[] cellPrice = { 74, 81, 77, 7, 3, 0, 89, -1, 97, 39, 37, 97, 10, 41, 75, 22, 42, 92, 15, 66, 54, 47, 86, 4, 18, 96, 13, 13, 12, -1, 3, 25 };
    int[] enterCell = { 1, 24, 5, 20, 15, 21, 15, 9, 22, 19, 0, 30, 9, 5, 9, 8, 25, 10, 29, 2, 6, 17, 0, 16, 20, 27, 29, 3, 1, 3, 23, 29, 22, 28, 3, 21 };
    int[] exitCell = { 29, 27, 20, 29, 18, 21, 23, 2, 28, 9, 0, 20, 30, 1, 4, 7, 9, 21, 9, 24, 21, 16, 27, 20, 16, 23, 0, 22, 21, 8, 14, 15, 0, 31, 27, 11 };
    int teleportPrice = 512;
    assertArrayEquals(new int[] { 1037, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case72() {
    int[] cellPrice = { 52, 91, 48, 9, 52, 31, 74, 16, 32, 68, 20, 64, 70, 3, 25, 47, 81, 95, 26, 20, 98, 35, 17, 75, 63, 93, 57, 94, 93, 47, 75, 65, 98 };
    int[] enterCell = { 4, 4, 25, 25, 17, 7, 25, 0, 10, 1, 14, 22, 2, 20, 6, 26, 30, 7, 7, 19, 21, 6, 0, 1, 14, 5, 1, 25, 18, 12, 15, 17, 27, 9, 32, 1, 24, 18, 15, 7, 2, 2 };
    int[] exitCell = { 19, 6, 0, 24, 29, 14, 26, 32, 1, 29, 11, 18, 30, 14, 10, 26, 30, 2, 7, 12, 23, 27, 12, 3, 18, 9, 2, 12, 0, 24, 9, 20, 31, 11, 5, 1, 31, 1, 7, 31, 17, 28 };
    int teleportPrice = 36;
    assertArrayEquals(new int[] { 36, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case73() {
    int[] cellPrice = { 9, 71, 84, 23, 96, 11, 9, 65, 36, 47, 4, 36, -1, 9, 34, 65, 17, 32, -1, 74, 55, 99, 62, 27, 75, 43, 85, 47, 33, 74, 57, 13, 12 };
    int[] enterCell = { 27, 6, 13, 32, 18, 1, 23, 3, 4, 30, 21 };
    int[] exitCell = { 9, 2, 24, 25, 29, 13, 24, 25, 31, 16, 24 };
    int teleportPrice = 42;
    assertArrayEquals(new int[] { 328, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case74() {
    int[] cellPrice = { 80, 33, 38, 83, 88, 31, -1, 33, 24, 20, 7, 35, 89, -1, 47, 87, -1, -1, 25, 24, 48, 50, 77, 58, 39, 48, 22, 10, 7, 65, 93, 55, 41, 40 };
    int[] enterCell = { 32, 1, 8, 3, 1, 15, 11, 28, 22, 2, 12, 4, 27, 27, 6, 5, 20, 25, 28, 24, 5, 8, 10, 6, 28, 16, 16 };
    int[] exitCell = { 4, 23, 15, 23, 7, 1, 9, 14, 26, 12, 16, 19, 29, 17, 28, 10, 8, 15, 25, 24, 31, 18, 10, 30, 18, 26, 16 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 352, 10 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case75() {
    int[] cellPrice = { 15, 81, -1, 10, 13, 31, 93, 37, 26, 99, 7, 32, 87, 65, -1, 97, 98, 33, 1, -1, -1, 52, 10, 50, 65, 41, 76, -1, 91, 21, 84, 76, 82, 91 };
    int[] enterCell = { 31, 33, 12, 10, 23, 11 };
    int[] exitCell = { 10, 2, 31, 2, 21, 33 };
    int teleportPrice = 16;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case76() {
    int[] cellPrice = { 60, 89, 71, 75, 26, 87, 55, 65, 6, 34, 75, 66, 96, 0, 21, 74, 20, 7, 47, 23, 45, 18, -1, 56, 86, 50, 96, 31, 82, 21, 47, 99, 67, 66, 9 };
    int[] enterCell = { 31, 26, 34, 30, 23, 1, 8, 15, 2, 13, 5, 1, 13, 23, 20, 8, 28, 20, 19, 26, 5, 15, 0, 14, 34, 30, 17, 29, 31, 24, 33, 26, 30, 14, 10, 0, 14, 7, 30, 19, 0, 23, 22, 11, 33, 34, 34, 20, 24 };
    int[] exitCell = { 33, 24, 5, 2, 21, 20, 21, 19, 4, 3, 7, 13, 22, 11, 28, 26, 22, 34, 19, 31, 7, 6, 28, 7, 11, 8, 34, 29, 26, 18, 20, 19, 1, 3, 20, 10, 6, 25, 16, 33, 9, 33, 20, 32, 5, 24, 20, 28, 34 };
    int teleportPrice = 224;
    assertArrayEquals(new int[] { 533, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case77() {
    int[] cellPrice = { 45, 75, 9, 79, 32, 44, 66, -1, 8, 37, 20, 94, 36, 81, 0, 56, 33, 29, 93, 94, 61, 62, -1, 83, 18, 21, 59, 11, 38, 48, 8, 66, -1, 85, 17 };
    int[] enterCell = { 27, 11, 31, 6, 30, 10, 30, 17, 19, 1, 12, 31, 14, 16, 9, 5, 33, 11, 5, 7, 12, 34, 26, 6, 16, 4, 10, 24, 23, 1, 27, 9, 1, 1, 2, 30, 28 };
    int[] exitCell = { 27, 17, 11, 13, 8, 26, 29, 2, 12, 9, 27, 20, 17, 25, 16, 27, 11, 33, 34, 8, 34, 15, 23, 14, 8, 26, 13, 19, 7, 9, 6, 14, 14, 10, 4, 1, 7 };
    int teleportPrice = 36;
    assertArrayEquals(new int[] { 201, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case78() {
    int[] cellPrice = { 54, 62, 86, 95, 94, 30, 51, 92, 51, 71, 76, 92, 24, 12, -1, 99, -1, 70, 65, -1, 86, 31, 82, 75, 54, 86, 0, 36, 12, 77, 50, 46, 86, 53, 50, 37 };
    int[] enterCell = { 8, 11, 19, 6, 4, 7, 14, 33, 6 };
    int[] exitCell = { 18, 3, 26, 23, 17, 32, 10, 24, 0 };
    int teleportPrice = 144;
    assertArrayEquals(new int[] { 794, 11 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case79() {
    int[] cellPrice = { 15, 58, 93, 98, 20, 86, 56, 2, 13, 41, 8, 62, 16, 37, 42, 8, 72, 30, 26, 55, 16, 89, 91, 46, 79, 100, 46, 3, 88, 36, 78, 1, 99, 24, 47, 59 };
    int[] enterCell = { 6, 9, 12, 5, 35, 13, 1, 10, 10, 15, 32, 10, 30, 25, 33, 19, 17, 12, 8, 35, 5, 25, 23, 27, 31, 23, 32, 13, 18, 20, 16, 3, 29, 5, 23, 17, 17, 10 };
    int[] exitCell = { 26, 20, 17, 18, 24, 28, 22, 24, 34, 23, 25, 34, 9, 35, 30, 17, 14, 34, 11, 26, 24, 12, 26, 3, 27, 1, 12, 29, 24, 35, 6, 12, 20, 22, 32, 3, 6, 30 };
    int teleportPrice = 84;
    assertArrayEquals(new int[] { 332, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case80() {
    int[] cellPrice = { 35, 14, 86, 41, 73, -1, 49, 52, 17, 12, 46, -1, 8, 34, -1, -1, 69, -1, 57, -1, 59, 35, 87, -1, 10, 77, -1, 8, 18, -1, 89, 33, -1, 86, 19, 23, 17 };
    int[] enterCell = { 19, 19, 15, 26 };
    int[] exitCell = { 26, 28, 4, 22 };
    int teleportPrice = 180;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case81() {
    int[] cellPrice = { 8, 38, 20, 16, 87, 82, 96, 27, 81, 53, 13, 95, 84, 95, -1, 39, 4, 28, 0, 58, 71, 47, 57, 93, 21, 77, 84, 15, 98, 85, 52, 36, 82, 92, 1, 86, 87 };
    int[] enterCell = { 19, 12, 5, 33, 23, 5, 19, 19, 15, 30, 0, 6, 13, 22, 32, 20, 9, 25, 14, 0, 10, 2, 35, 19, 33, 17, 5, 27, 32, 6, 17, 31 };
    int[] exitCell = { 32, 18, 10, 3, 7, 26, 11, 19, 35, 21, 18, 13, 36, 32, 27, 27, 2, 32, 36, 13, 22, 11, 4, 15, 28, 36, 16, 32, 23, 4, 6, 16 };
    int teleportPrice = 140;
    assertArrayEquals(new int[] { 281, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case82() {
    int[] cellPrice = { 9, 63, 63, 95, 34, 58, 73, 28, 29, -1, 0, 6, 97, 81, -1, 80, 30, 92, -1, 71, 100, 69, 62, 72, 31, 73, -1, 35, 26, 40, 17, 21, 5, 82, 80, 50, 8, 66 };
    int[] enterCell = { 29, 10, 11, 4, 26, 25, 8, 25, 10, 19, 29, 1, 22, 35, 33, 23, 25, 36, 15, 0, 29, 25, 37, 14, 28, 4, 32, 5, 7, 19, 32, 30, 35 };
    int[] exitCell = { 2, 8, 34, 15, 26, 15, 13, 2, 10, 27, 26, 35, 34, 31, 2, 32, 27, 29, 23, 34, 15, 7, 30, 1, 23, 35, 17, 19, 30, 4, 24, 9, 26 };
    int teleportPrice = 112;
    assertArrayEquals(new int[] { 236, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case83() {
    int[] cellPrice = { 55, 63, 47, -1, 58, 91, 30, -1, 77, 30, 87, 71, 63, -1, -1, -1, -1, -1, -1, 99, -1, 63, 29, 42, -1, 68, 78, -1, -1, 22, -1, 77, 6, -1, -1, -1, -1, -1 };
    int[] enterCell = { 27, 30 };
    int[] exitCell = { 36, 9 };
    int teleportPrice = 450;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case84() {
    int[] cellPrice = { 38, 84, 71, 65, 9, 77, 6, 97, 47, 30, 96, 46, 52, 81, 43, 19, 38, 41, 11, 92, 39, 31, 16, 6, 43, 34, 22, 92, 75, 69, 39, 15, 43, 90, 10, 38, 63, 89, 73 };
    int[] enterCell = { 7, 35, 22, 12, 13, 6, 25, 2, 1, 11, 11, 2, 32, 35, 26, 4, 38, 15, 1, 25, 9, 18, 15, 34, 27, 30, 33, 38, 7, 8, 38, 3, 10, 5, 23, 29, 6, 1, 2, 25, 25, 32, 0, 34, 29, 2, 38, 4, 1, 38 };
    int[] exitCell = { 7, 37, 13, 22, 18, 29, 30, 9, 19, 24, 31, 15, 16, 9, 26, 10, 27, 20, 32, 16, 11, 13, 23, 11, 31, 35, 27, 28, 25, 16, 21, 6, 20, 24, 10, 32, 37, 21, 25, 18, 13, 38, 27, 16, 37, 14, 35, 36, 9, 10 };
    int teleportPrice = 400;
    assertArrayEquals(new int[] { 785, 8 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case85() {
    int[] cellPrice = { 37, 77, 10, 31, 9, 3, 39, 84, 31, 35, 14, 47, 57, 26, 13, 14, 99, 40, 31, 1, 40, 26, 27, -1, 19, 30, -1, 42, 81, 43, 79, 2, 60, 92, 14, 40, 78, 94, 96 };
    int[] enterCell = { 6, 22, 35, 2, 30, 8, 36, 8, 21, 7, 22, 27, 36, 9, 5, 4, 29, 11, 0, 20, 7, 9, 22, 14, 17, 32, 37, 17, 7, 3, 33, 37, 32, 36, 15, 9, 20, 15 };
    int[] exitCell = { 14, 15, 28, 3, 16, 18, 7, 13, 28, 34, 9, 11, 31, 31, 32, 30, 9, 0, 11, 21, 3, 15, 13, 12, 15, 7, 27, 36, 2, 32, 2, 8, 31, 16, 29, 11, 15, 26 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 313, 9 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case86() {
    int[] cellPrice = { 96, 9, 26, 46, 24, 67, 51, 2, 1, 96, 19, 24, 21, 24, 79, 5, 37, -1, 68, 63, 8, 16, 61, 19, 93, 53, 53, 81, 52, 81, 87, 32, 52, 64, 87, -1, 43, 61, 41, 39 };
    int[] enterCell = { 9, 29, 25, 38, 22, 35, 6, 37, 19, 7, 30, 39, 34, 38, 39, 26, 29, 9, 20, 0, 9, 21, 24, 13, 8, 12, 4, 14, 28, 10, 2, 4, 33 };
    int[] exitCell = { 11, 27, 26, 34, 35, 39, 35, 15, 6, 3, 16, 14, 33, 24, 9, 15, 32, 9, 9, 12, 26, 4, 31, 32, 34, 37, 2, 31, 39, 0, 4, 23, 6 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 81, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case87() {
    int[] cellPrice = { 50, 52, 92, 35, 23, 47, 30, -1, 3, 82, 45, 75, 18, 39, 40, 96, 76, 52, 87, -1, 62, 55, 88, 4, 85, 80, 6, 81, 25, -1, 76, 81, 15, 62, 15, 52, 50, 83, 39, 26 };
    int[] enterCell = { 6, 31, 12, 29, 13, 17, 5, 11, 35, 23, 28, 23, 0, 23, 12, 34, 39, 3, 2, 28, 21, 20, 33, 36, 0, 39, 15, 16, 10, 37, 7 };
    int[] exitCell = { 5, 14, 7, 17, 25, 34, 18, 15, 7, 13, 15, 9, 28, 35, 38, 11, 16, 14, 36, 21, 22, 24, 34, 3, 7, 15, 9, 39, 3, 24, 2 };
    int teleportPrice = 21;
    assertArrayEquals(new int[] { 142, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case88() {
    int[] cellPrice = { 0, 60, 87, 93, -1, 14, 25, 64, 45, 97, 27, 60, 20, 6, 78, 85, 83, 17, -1, 21, 48, 18, 37, 87, 15, 88, 25, 76, 52, -1, 87, 15, 23, 75, 83, 35, 44, 87, 23, 13, 51 };
    int[] enterCell = { 29, 1, 30, 22, 20, 32, 8, 23, 3, 5, 27, 29, 29, 2, 27, 16, 28, 39 };
    int[] exitCell = { 36, 31, 30, 10, 22, 8, 13, 29, 36, 1, 34, 8, 7, 36, 2, 13, 7, 29 };
    int teleportPrice = 126;
    assertArrayEquals(new int[] { 447, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case89() {
    int[] cellPrice = { 64, 82, 18, 87, 78, 94, 5, 31, 5, 74, 37, 61, 13, 0, 61, 65, -1, -1, 48, 13, 89, 36, 19, 42, 17, 38, 57, 80, 73, 38, 74, 83, 40, 41, 23, 63, 88, 56, 60, 98, -1 };
    int[] enterCell = { 4, 10, 35, 37, 20, 21, 20, 18, 25, 36, 38, 23, 2, 34, 37, 16, 25, 15, 36 };
    int[] exitCell = { 40, 26, 39, 1, 13, 0, 13, 32, 16, 27, 33, 25, 22, 6, 38, 18, 27, 33, 2 };
    int teleportPrice = 252;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case90() {
    int[] cellPrice = { 99, 38, -1, -1, 65, 49, 20, -1, 98, 61, 21, 84, 15, -1, -1, 54, -1, -1, 17, 64, 49, -1, -1, -1, 25, 58, 93, 50, -1, 60, 31, 37, -1, 87, 71, -1, 66, 27, 4, 56, -1, 91 };
    int[] enterCell = { 26, 39, 32 };
    int[] exitCell = { 21, 32, 39 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case91() {
    int[] cellPrice = { 76, 4, 53, -1, -1, 63, 12, 70, 13, 84, -1, 96, 0, 94, 20, -1, 74, 24, 85, 25, 45, 18, 75, 10, 44, -1, 49, 87, 56, 45, 11, 52, -1, 13, 80, 52, 85, 50, 52, 47, 20, 43 };
    int[] enterCell = { 2, 33, 38, 16, 8, 23 };
    int[] exitCell = { 24, 6, 24, 15, 10, 9 };
    int teleportPrice = 35;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case92() {
    int[] cellPrice = { 80, 77, 63, 23, 43, 29, 66, 0, 81, 16, 15, 87, 50, 14, 96, -1, 22, 47, 60, 13, 27, 21, 46, 90, 39, 90, 23, 65, 26, 7, 27, -1, 30, 17, 48, -1, 14, 61, 92, 87, 80, 63, 82 };
    int[] enterCell = { 19, 41, 17, 14, 42, 12, 28, 39, 21, 22, 12, 20, 40, 19, 14, 33, 13, 38 };
    int[] exitCell = { 40, 36, 35, 13, 22, 1, 12, 42, 31, 37, 14, 40, 35, 17, 37, 18, 27, 41 };
    int teleportPrice = 70;
    assertArrayEquals(new int[] { 937, 17 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case93() {
    int[] cellPrice = { 98, 5, 72, 67, 14, 84, 73, 15, 89, -1, 14, 10, 2, 59, 23, 13, 70, 77, -1, 84, 57, 52, 60, 40, 64, 65, 56, 38, 31, 74, 15, 47, 77, 19, 44, 69, -1, 79, 67, 97, 41, 36, 91 };
    int[] enterCell = { 12, 9, 39, 29, 4, 3, 37, 34, 40, 13, 41, 10, 18, 8, 3, 16, 2, 7, 4, 9, 28, 30, 37 };
    int[] exitCell = { 26, 21, 31, 1, 30, 2, 13, 42, 7, 19, 24, 27, 21, 24, 24, 2, 7, 8, 30, 39, 17, 25, 11 };
    int teleportPrice = 150;
    assertArrayEquals(new int[] { 646, 10 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case94() {
    int[] cellPrice = { 52, -1, 54, 58, 4, 20, 76, 85, 42, 26, 57, 26, 62, 30, 19, 41, 0, 27, 46, 10, 57, 81, 7, 27, -1, 31, 89, 64, 48, 91, 75, 26, 81, 78, 61, 36, 37, 8, 53, 99, 17, 58, 26, 79 };
    int[] enterCell = { 29, 15, 19, 9, 37, 21, 10, 29, 18, 41, 14, 1, 28, 42, 20, 1, 22, 41, 1, 1, 12, 40, 38, 37, 33, 43, 41, 10, 7, 38, 19, 14, 28, 24, 19, 24, 26, 8, 21, 12, 25, 39, 18, 3, 6 };
    int[] exitCell = { 37, 15, 30, 31, 27, 32, 31, 10, 32, 8, 25, 16, 10, 41, 41, 11, 27, 13, 8, 2, 17, 2, 15, 11, 43, 26, 41, 9, 13, 20, 16, 11, 14, 1, 15, 0, 39, 14, 30, 41, 15, 41, 30, 16, 25 };
    int teleportPrice = 180;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case95() {
    int[] cellPrice = { 81, 27, 92, 50, 87, 65, 16, 79, 15, 86, 22, 73, 52, 72, 16, 23, 52, -1, 83, 6, 37, 11, 34, -1, 52, 70, 82, 25, 21, -1, 66, 99, 19, 10, 30, 85, 22, 13, 55, -1, -1, 97, 61, 62 };
    int[] enterCell = { 34, 15, 4, 24, 21, 5, 33, 37, 33, 17, 5, 30, 10, 8, 12, 33, 22, 36, 31, 13, 12, 21, 14, 12, 42, 34, 15, 34, 36, 14, 27, 5, 42 };
    int[] exitCell = { 19, 13, 18, 20, 5, 28, 33, 8, 28, 32, 29, 24, 6, 32, 22, 20, 2, 38, 26, 26, 32, 19, 29, 28, 24, 21, 12, 2, 12, 42, 13, 29, 24 };
    int teleportPrice = 90;
    assertArrayEquals(new int[] { 697, 11 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case96() {
    int[] cellPrice = { 16, 95, 38, -1, 39, 35, 72, 75, 63, 36, 24, 25, 72, 43, 47, 8, 74, 46, 55, 21, 8, 14, 58, 36, 49, 0, 70, 95, 10, 39, 15, 24, 83, 59, 14, 54, 4, 29, 37, 17, 69, 96, 5, 93, 55 };
    int[] enterCell = { 18, 29, 16, 21, 35, 5, 22, 44, 14, 2, 33, 0, 23, 3, 26, 40, 0, 1, 4, 1, 5, 23, 8, 22, 43, 3, 30, 16, 15, 36, 37 };
    int[] exitCell = { 33, 13, 15, 12, 4, 42, 37, 40, 15, 3, 2, 25, 10, 37, 26, 11, 20, 6, 14, 30, 20, 4, 23, 20, 26, 39, 18, 29, 40, 32, 9 };
    int teleportPrice = 96;
    assertArrayEquals(new int[] { 471, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case97() {
    int[] cellPrice = { 78, 42, 83, 17, 11, -1, 26, 48, 27, 21, 69, 17, 21, 85, 29, 34, 41, 75, 36, 73, 59, 19, 7, 10, 23, 95, 84, 83, 53, 63, 69, 88, 71, 82, 29, 89, 10, 95, 94, 48, 72, 96, 85, 31, 17 };
    int[] enterCell = { 20, 43, 29, 3, 16, 27, 36, 12, 15, 23, 1, 25, 21, 30, 0, 35, 17, 14, 35, 7, 26, 37, 30, 16, 19, 7, 38, 38, 22, 24, 27, 27 };
    int[] exitCell = { 29, 26, 19, 12, 34, 38, 36, 15, 7, 14, 13, 39, 25, 23, 28, 20, 3, 19, 27, 5, 31, 13, 27, 41, 2, 13, 11, 2, 32, 40, 36, 41 };
    int teleportPrice = 21;
    assertArrayEquals(new int[] { 259, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case98() {
    int[] cellPrice = { 26, 61, 88, 9, 17, 4, 27, 12, -1, 58, 68, 48, 15, 55, 33, 9, 3, 16, 28, 41, 85, 42, 2, 81, 80, 33, 69, 36, 23, 4, 37, 75, 14, 15, 51, 67, 11, 38, 45, 62, 19, 54, 24, 5, 63, 0 };
    int[] enterCell = { 14, 29, 3, 33, 4, 2, 38, 31, 0, 10, 25, 45, 19, 19, 44, 26, 29, 13, 17, 39, 21, 19, 29 };
    int[] exitCell = { 33, 13, 2, 39, 7, 27, 43, 38, 40, 31, 9, 15, 18, 1, 37, 9, 17, 30, 8, 40, 37, 27, 21 };
    int teleportPrice = 360;
    assertArrayEquals(new int[] { 506, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case99() {
    int[] cellPrice = { 71, 18, 71, 64, 53, 45, 27, 44, 39, -1, 92, 65, 35, 14, 81, -1, 58, 8, 93, 59, 18, 73, -1, 91, 44, 25, 9, 57, -1, 58, 6, 11, 24, 1, 39, -1, 67, 97, 63, 67, -1, 7, 82, -1, 9, -1 };
    int[] enterCell = { 14, 45, 44, 31, 11, 12, 27 };
    int[] exitCell = { 25, 10, 14, 29, 42, 40, 31 };
    int teleportPrice = 36;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case100() {
    int[] cellPrice = { 52, 66, 5, 85, 84, 65, 92, 18, -1, 15, 77, 92, 86, 76, 35, 32, 3, 13, -1, 36, 49, 36, 72, 31, 59, 69, 79, 27, 55, 69, 33, -1, 56, 80, 13, 53, 40, 20, 10, 18, 81, 51, 69, -1, 77, 96, 29 };
    int[] enterCell = { 6, 18, 27, 3, 37, 7, 9, 33, 36, 4, 27, 14, 14, 37, 5, 34, 25, 29, 17, 23, 20, 31, 45, 22, 32, 34, 39, 46, 9, 37, 41, 14, 20, 39, 9 };
    int[] exitCell = { 31, 35, 27, 30, 36, 8, 46, 18, 30, 46, 38, 9, 29, 25, 41, 5, 30, 13, 28, 46, 22, 21, 43, 24, 27, 23, 0, 41, 13, 10, 39, 2, 15, 31, 13 };
    int teleportPrice = 384;
    assertArrayEquals(new int[] { 624, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case101() {
    int[] cellPrice = { 63, 37, 83, 48, 23, 87, 15, 6, 23, 4, 20, 94, 33, 3, 5, -1, 67, 67, 2, 9, 87, 92, 37, 50, 28, -1, 82, 58, 60, 66, 19, 63, 16, 14, 76, 57, 64, 63, 99, -1, 92, 86, 41, 31, 98, 23, 42 };
    int[] enterCell = { 19, 45, 1, 46, 20, 5, 38, 40, 14, 14, 33, 21, 6, 22, 45, 44, 15, 41 };
    int[] exitCell = { 12, 3, 22, 40, 43, 7, 21, 26, 44, 14, 44, 46, 11, 37, 4, 8, 38, 41 };
    int teleportPrice = 504;
    assertArrayEquals(new int[] { 1050, 17 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case102() {
    int[] cellPrice = { 14, 62, 27, 20, -1, -1, 47, -1, 54, 41, 98, 32, 52, 70, 56, 38, 85, 35, 29, 16, 67, 21, 48, -1, 30, 3, 91, 46, 48, 51, 98, 96, 20, 7, 0, 9, 97, 8, 15, 81, 37, 13, 33, 7, 16, 0, 92, 69 };
    int[] enterCell = { 24, 32, 46, 21, 0, 13, 14, 37, 16, 44, 29, 10, 0, 10, 28, 24, 40, 44, 4, 47, 37, 12, 47, 3, 31, 36, 26, 28, 25, 40, 24, 30, 40, 41, 42, 11, 23 };
    int[] exitCell = { 6, 46, 39, 42, 38, 6, 29, 34, 4, 27, 1, 1, 26, 17, 5, 30, 34, 28, 16, 43, 8, 35, 11, 21, 19, 21, 46, 12, 38, 41, 11, 20, 18, 42, 8, 42, 47 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 70, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case103() {
    int[] cellPrice = { 69, 95, 3, 38, 90, 29, 99, 67, 49, 79, 8, 50, 37, 97, 86, 78, 53, 94, 32, 58, 96, 51, 50, 96, 41, 89, 72, 44, 99, -1, 94, 97, 91, 85, 75, 76, 50, 35, 43, 35, 85, 33, 79, -1, 63, 14, 40, 11 };
    int[] enterCell = { 46, 2, 27, 36, 3, 39, 20, 15, 42, 0, 26, 39, 30, 35, 45, 47, 35, 45, 19, 36, 17, 40, 13, 35, 5, 16, 43, 8, 4, 2, 1, 9, 18, 7, 28, 20, 19, 0, 16, 23, 47, 18, 20, 47, 27, 4, 33, 2, 37 };
    int[] exitCell = { 22, 38, 32, 16, 20, 31, 7, 33, 43, 39, 23, 41, 44, 44, 39, 37, 31, 2, 5, 34, 25, 11, 3, 5, 17, 37, 32, 42, 15, 36, 20, 42, 38, 18, 16, 35, 37, 36, 5, 19, 8, 31, 21, 20, 20, 43, 7, 15, 34 };
    int teleportPrice = 210;
    assertArrayEquals(new int[] { 562, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case104() {
    int[] cellPrice = { 56, 53, 24, 7, 87, 52, 45, 48, 68, 47, 84, 76, 61, 32, 25, 87, 11, 41, 23, 58, 2, 33, 43, 56, 39, 23, 20, 15, 83, 84, 49, 31, 74, 38, 95, 6, 23, 3, 46, 21, -1, 100, 38, 7, -1, 66, 7, 11, 41 };
    int[] enterCell = { 15, 40, 3, 46, 20, 19, 16, 28, 47, 44, 3, 2, 38, 9, 4, 2, 5, 7, 32, 10, 40, 24, 23, 1, 37, 6, 15, 43 };
    int[] exitCell = { 39, 37, 10, 7, 34, 25, 17, 26, 38, 6, 23, 30, 37, 41, 23, 19, 35, 21, 30, 25, 35, 39, 13, 29, 38, 29, 0, 35 };
    int teleportPrice = 800;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case105() {
    int[] cellPrice = { 10, 87, 74, 2, 40, 22, 36, 21, 49, 32, 55, 84, 73, 13, -1, -1, 84, 14, 31, -1, -1, 38, 13, 72, 83, 18, -1, 81, 62, 66, 88, 93, 62, 96, 3, 7, 45, 27, 57, 82, 63, -1, 29, 90, 55, 43, 78, 16, 44 };
    int[] enterCell = { 44, 23, 42, 19, 5, 21, 47, 28, 0, 13, 31, 17 };
    int[] exitCell = { 10, 14, 37, 39, 32, 11, 7, 17, 48, 34, 1, 19 };
    int teleportPrice = 30;
    assertArrayEquals(new int[] { 30, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case106() {
    int[] cellPrice = { 24, 69, 97, 25, 22, 7, 15, 48, 80, 65, 50, 70, 42, 47, 45, 95, 14, 35, 50, 81, 38, 30, 55, 94, 87, 4, 25, 76, 66, 58, 91, 54, 92, 74, 17, 85, 100, 50, 66, 39, 94, 66, 46, 67, 63, 73, 98, 4, 87, 79 };
    int[] enterCell = { 28, 33, 36, 45, 7, 35, 38, 25, 23, 3, 40, 16, 41, 47, 39, 8, 29, 19, 47, 9, 28, 21, 6, 27, 32, 29, 38, 32, 23, 42 };
    int[] exitCell = { 24, 40, 17, 9, 26, 45, 4, 1, 43, 16, 36, 20, 47, 25, 43, 29, 13, 43, 5, 18, 29, 25, 16, 46, 42, 27, 16, 20, 15, 13 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 498, 13 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case107() {
    int[] cellPrice = { 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    int[] enterCell = { 45 };
    int[] exitCell = { 24 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case108() {
    int[] cellPrice = { 25, 44, 3, 60, 99, 83, 82, 29, 30, 52, 32, 33, 20, 26, 75, 11 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 450;
    assertArrayEquals(new int[] { 679, 15 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case109() {
    int[] cellPrice = { 92, 73, 100, 20, 79, 35, 19, 91, 76, 59, 48, 32, 12, 46, 44, 80, 69, 18 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 901, 17 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case110() {
    int[] cellPrice = { 38, 36, 25, 4, 9, 0, 74, 7, 21, 70, 44, 26, 48, 29, 38, 21, 75, 95, 76, 23, 52, 65, 92, 40, 78, 2, 12, 16, 75, 25, 55, 48 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 150;
    assertArrayEquals(new int[] { 1281, 31 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case111() {
    int[] cellPrice = { 11, 75, 39, 13, 40, 73, 88, 30, 15, 92, 37, 19, 4 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 525, 12 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case112() {
    int[] cellPrice = { 26, 9, 10, 76, 8, 60, 79, 92, 83, 74, 86, 31, 26, 97, 87, 10, 96, 33, 5, 6, 1, 60, 2, 19, 54, 88, 50, 95, 43, 61, 72, 8, 60, 59, 44, 11, 91 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 288;
    assertArrayEquals(new int[] { 1786, 36 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case113() {
    int[] cellPrice = { 57, 22, 88, 41, 87, 27, 74, 75, 42, 61, 42, 74, 63, 73, 38, 57, 4, 78, 44, 89, 38, 48, 6, 77, 80, 52, 14, 89, 54, 5 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 441;
    assertArrayEquals(new int[] { 1542, 29 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case114() {
    int[] cellPrice = { 69, 80, 61, 89, 60, 49, 72, 4, 97, 20, 84, 97, 2, 8, 49, 74, 78, 51, 18, 59, 69, 95, 27, 18, 53, 58, 27, 81, 19, 59, 99, 74, 71, 3, 6, 77, 18, 89, 71, 51, 21, 18 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 240;
    assertArrayEquals(new int[] { 2156, 41 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case115() {
    int[] cellPrice = { 42, 100, 23, 49, 3, 29, 86, 40, 47, 45, 29, 67, 45, 29, 13, 53, 43, 12, 62, 30, 6, 81, 80, 49, 38, 66, 6, 61, 8, 72, 77, 30 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 350;
    assertArrayEquals(new int[] { 1379, 31 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case116() {
    int[] cellPrice = { 46, 42, 97, 48, 88, 0, 84, 74, 3, 73, 47, 38, 20, 38, 56, 37, 11, 0, 78 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 120;
    assertArrayEquals(new int[] { 834, 18 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case117() {
    int[] cellPrice = { 97, 20, 95, 81, 55, 47, 85, 6, 55, 51, 31, 19, 4, 58, 40, 57, 22, 36, 73, 60, 80, 63, 19, 62, 61, 54, 66, 71, 62, 21 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 300;
    assertArrayEquals(new int[] { 1454, 29 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case118() {
    int[] cellPrice = { 85, 29, 14, 1, 47, 23, 36, 65, 61, 6, 5, 10, 67, 61, 87, 92, 32, 70, 52, 86, 71, 76, 51, 78, 14, 65, 34, 2, 5 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 30;
    assertArrayEquals(new int[] { 1240, 28 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case119() {
    int[] cellPrice = { 2, 99, 93, 34, 80, 50, 56, 2, 61, 69, 92, 20, 66, 13 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 27;
    assertArrayEquals(new int[] { 735, 13 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case120() {
    int[] cellPrice = { 25, 67, 79, 3, 34, 26, 44, 77, 12, 21 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 10;
    assertArrayEquals(new int[] { 363, 9 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case121() {
    int[] cellPrice = { 98, 66, 41, 19, 14, 52, 74, 17, 19, 47, 16, 100, 55, 51, 55, 0, 36, 94, 34, 6, 38, 74, 16, 10, 55, 99, 63, 95, 1, 77, 64 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 24;
    assertArrayEquals(new int[] { 1388, 30 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case122() {
    int[] cellPrice = { 49, 52, 53, 39, 14, 100, 77, 94, 38, 37 };
    int[] enterCell = {  };
    int[] exitCell = {  };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 504, 9 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case123() {
    int[] cellPrice = { 68, 63, 70 };
    int[] enterCell = { 0, 1, 2, 1, 0, 2, 0, 1, 1, 2, 1, 1, 2, 0, 2, 2, 0, 2, 0, 2, 0, 2, 0, 1, 2, 1, 0, 1, 1, 2, 2, 2, 2, 0, 0, 0, 0, 1, 1, 1, 2, 0, 1, 2, 2, 2, 1, 0, 0, 0 };
    int[] exitCell = { 0, 2, 0, 0, 2, 2, 2, 1, 1, 1, 1, 1, 0, 1, 2, 0, 0, 0, 0, 2, 0, 1, 0, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 0, 2, 1, 2, 1, 1, 2, 2, 0, 1, 0, 2, 2, 1, 1, 0 };
    int teleportPrice = 480;
    assertArrayEquals(new int[] { 133, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case124() {
    int[] cellPrice = { 15, 56, 70, 37, 60, 20, 81, 62, 70, 61, 74, 0, 69, 35, 90, 43, -1, -1, 75, 50, 43, 42, 81, 23, 86, 9, 65, 42, -1, 93, 1 };
    int[] enterCell = { 12, 17, 28, 11, 9, 3, 11, 19, 29, 25, 25, 9, 13, 16, 26, 2, 11, 21, 16, 7, 23, 17, 19, 18, 10, 2, 1, 22, 21, 12, 13, 9, 6, 17, 20, 12, 10, 2, 4, 28, 22, 28, 16, 28, 7, 9, 0, 27, 21, 20 };
    int[] exitCell = { 25, 19, 10, 1, 13, 19, 0, 12, 9, 4, 22, 17, 12, 29, 16, 20, 6, 0, 29, 7, 5, 19, 14, 24, 28, 18, 2, 27, 9, 1, 5, 14, 26, 3, 0, 25, 16, 28, 6, 13, 14, 18, 0, 13, 28, 8, 5, 3, 19, 6 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case125() {
    int[] cellPrice = { 100, 59, 21, 87, 69, 37, 2, 41, 21, 62, 2, 15, 41, 61, 18, -1, 31, 11, 36, 53, 86, 4, -1, 75, 25, 68, 53, 58, 97, 49, 34, 96, 27, 69, 71, 83, 17, 72, 48 };
    int[] enterCell = { 4, 21, 24, 21, 0, 15, 12, 11, 15, 12, 3, 16, 33, 34, 33, 21, 18, 3, 2, 18, 8, 37, 23, 1, 4, 20, 24, 9, 10, 19, 21, 0, 26, 20, 15, 33, 21, 27, 0, 18, 33, 21, 17, 26, 17, 21, 24, 26, 21, 38 };
    int[] exitCell = { 36, 3, 35, 21, 16, 37, 29, 14, 3, 19, 18, 37, 7, 30, 29, 28, 7, 18, 8, 37, 10, 17, 28, 24, 4, 29, 21, 10, 27, 16, 25, 3, 13, 2, 7, 0, 4, 1, 14, 13, 25, 27, 1, 17, 4, 3, 19, 13, 37, 26 };
    int teleportPrice = 378;
    assertArrayEquals(new int[] { 734, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case126() {
    int[] cellPrice = { 20, 69, 60, 68, 50, 22, 79, 55, 45, 38, 74, 1, 75, 81, -1, 15, 3, 7, 16, 1, 74, -1, 87, 52, 45, -1, 12, 30, 52, 97, 94, 39 };
    int[] enterCell = { 20, 9, 29, 19, 12, 3, 9, 6, 14, 14, 25, 4, 17, 17, 11, 31, 12, 25, 5, 21, 22, 17, 26, 3, 12, 19, 9, 22, 19, 30, 6, 2, 31, 9, 30, 23, 19, 22, 21, 16, 10, 11, 18, 14, 21, 29, 29, 5, 5, 13 };
    int[] exitCell = { 7, 20, 12, 24, 11, 27, 31, 9, 20, 8, 31, 18, 0, 19, 25, 28, 3, 11, 10, 27, 15, 16, 6, 5, 18, 2, 27, 4, 0, 25, 18, 9, 18, 23, 22, 4, 15, 28, 24, 17, 11, 24, 17, 21, 14, 6, 9, 10, 22, 23 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 130, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case127() {
    int[] cellPrice = { 12, 45, 41, 29, 59, 15, 40, 91, 13, 76, 70, 99, 40, 8, 10, 97, 1, 9, 42, 68, -1, 71, 40, 17, 22, 53, 23, 23, 59, 84, 0 };
    int[] enterCell = { 16, 25, 21, 1, 30, 30, 28, 5, 21, 17, 20, 6, 22, 23, 0, 13, 9, 10, 23, 10, 17, 21, 27, 27, 27, 15, 18, 24, 28, 9, 12, 9, 5, 6, 15, 29, 24, 8, 8, 21, 6, 12, 18, 22, 3, 18, 4, 27, 25, 30 };
    int[] exitCell = { 6, 23, 6, 9, 30, 11, 5, 4, 5, 11, 8, 22, 13, 29, 4, 18, 9, 24, 5, 20, 23, 28, 12, 12, 2, 10, 3, 22, 26, 10, 29, 12, 17, 3, 20, 24, 27, 28, 7, 1, 2, 9, 22, 19, 20, 20, 13, 10, 8, 3 };
    int teleportPrice = 70;
    assertArrayEquals(new int[] { 253, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case128() {
    int[] cellPrice = { 36, 98, 77, 56, 60, -1, 86, 12 };
    int[] enterCell = { 6, 1, 3, 2, 4, 4, 7, 0, 4, 0, 4, 0, 7, 7, 7, 1, 7, 2, 3, 0, 6, 7, 5, 6, 4, 4, 3, 7, 0, 5, 7, 4, 1, 1, 7, 3, 5, 4, 7, 4, 1, 1, 0, 0, 2, 6, 2, 6, 4, 5 };
    int[] exitCell = { 0, 6, 1, 7, 3, 1, 4, 4, 2, 0, 6, 1, 0, 4, 1, 1, 7, 6, 4, 7, 4, 1, 6, 2, 2, 5, 6, 2, 4, 4, 2, 3, 5, 2, 6, 7, 2, 1, 0, 1, 3, 2, 2, 7, 5, 3, 7, 7, 3, 5 };
    int teleportPrice = 24;
    assertArrayEquals(new int[] { 24, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case129() {
    int[] cellPrice = { 64, 55, 73, 4, 97, 43, 87, 48, 68, 3, 32, 68, 53, 35, 66, 27, -1, 12, 57, 5, 36, 65, 44, 36 };
    int[] enterCell = { 12, 11, 23, 3, 18, 7, 0, 16, 11, 13, 15, 1, 4, 10, 21, 4, 7, 20, 10, 0, 1, 7, 0, 13, 5, 16, 3, 23, 1, 16, 4, 23, 16, 11, 18, 19, 16, 1, 18, 15, 12, 21, 8, 11, 20, 4, 23, 6, 3, 1 };
    int[] exitCell = { 21, 20, 18, 15, 19, 5, 4, 13, 19, 14, 18, 17, 10, 3, 15, 6, 17, 13, 14, 16, 22, 8, 19, 2, 0, 9, 7, 6, 4, 6, 16, 21, 1, 6, 16, 15, 19, 19, 5, 21, 6, 21, 1, 4, 8, 9, 11, 13, 20, 17 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 50, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case130() {
    int[] cellPrice = { 13, 8, 60, 3, 61, 25, 89, 75, 52, 94, 86, -1, 91, -1, 31, 58, 27 };
    int[] enterCell = { 15, 16, 14, 4, 16, 16, 14, 1, 5, 11, 4, 6, 15, 4, 5, 4, 16, 14, 1, 4, 12, 6, 14, 8, 1, 7, 7, 11, 15, 10, 4, 16, 11, 9, 11, 11, 15, 7, 3, 9, 13, 3, 0, 2, 14, 12, 8, 4, 4, 0 };
    int[] exitCell = { 13, 16, 6, 13, 6, 6, 1, 13, 1, 12, 9, 12, 2, 15, 14, 15, 10, 9, 15, 13, 11, 12, 4, 10, 0, 6, 3, 7, 3, 3, 10, 6, 0, 15, 2, 12, 7, 5, 2, 14, 8, 10, 7, 7, 16, 5, 3, 8, 1, 14 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 1, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case131() {
    int[] cellPrice = { 94, 17, 96, 84, 82, 96, 97, 18, 93, 12, 39, 79, 24, 56, 59, 62, 78, 90, 96, 46, -1, 3, -1, 98, 79, 18, 22, 94, 61, 52, 10, 8, 23, 7, 28, 42, 29, 80, 100, 81, 76, 1, 25, 51, 84, 27, 93, 51, 22 };
    int[] enterCell = { 41, 17, 6, 1, 17, 9, 32, 14, 20, 34, 48, 34, 10, 42, 39, 40, 18, 6, 28, 20, 29, 48, 36, 4, 7, 11, 40, 27, 7, 14, 0, 16, 23, 48, 26, 22, 6, 46, 9, 9, 6, 3, 34, 20, 30, 41, 12, 0, 26, 39 };
    int[] exitCell = { 47, 23, 16, 41, 42, 7, 9, 39, 6, 10, 21, 38, 18, 11, 0, 20, 14, 35, 29, 29, 2, 47, 30, 6, 37, 46, 46, 8, 0, 15, 3, 39, 22, 47, 3, 29, 36, 7, 2, 41, 0, 4, 32, 35, 40, 22, 35, 36, 46, 40 };
    int teleportPrice = 126;
    assertArrayEquals(new int[] { 292, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case132() {
    int[] cellPrice = { 62, 27, 92, 24, 17, 62, 65, 51, 100, 21, 27, 91, 25, -1, 84, 16, 78, 55, 33, 97, 9, 13, 88, 38 };
    int[] enterCell = { 6, 22, 18, 9, 5, 14, 1, 23, 17, 4, 1, 18, 8, 5, 19, 5, 17, 7, 1, 7, 4, 7, 11, 10, 1, 15, 12, 7, 3, 10, 16, 14, 22, 18, 8, 13, 23, 20, 18, 14, 19, 18, 19, 14, 3, 10, 14, 3, 14, 12 };
    int[] exitCell = { 2, 22, 15, 18, 6, 1, 16, 11, 16, 11, 16, 9, 23, 17, 17, 12, 21, 23, 13, 13, 1, 16, 10, 0, 20, 19, 3, 20, 19, 6, 2, 4, 4, 23, 19, 19, 12, 16, 10, 4, 16, 11, 7, 8, 19, 15, 16, 12, 15, 9 };
    int teleportPrice = 80;
    assertArrayEquals(new int[] { 246, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case133() {
    int[] cellPrice = { 95, 99, 4, 13, 76, -1, 18, 65, 66, 10, 57, 24, 88, 73, 3, 27, 62 };
    int[] enterCell = { 14, 0, 14, 8, 10, 1, 0, 14, 16, 8, 11, 13, 14, 4, 12, 11, 10, 15, 7, 16, 6, 15, 14, 0, 7, 15, 2, 13, 11, 3, 16, 7, 6, 16, 5, 12, 0, 10, 5, 14, 11, 3, 7, 1, 16, 14, 14, 0, 2, 1 };
    int[] exitCell = { 0, 8, 16, 5, 3, 13, 15, 15, 5, 7, 1, 0, 13, 1, 8, 9, 11, 6, 4, 15, 9, 4, 1, 16, 1, 14, 9, 3, 14, 4, 15, 9, 15, 12, 0, 14, 9, 14, 9, 0, 4, 11, 7, 3, 10, 14, 14, 13, 0, 11 };
    int teleportPrice = 60;
    assertArrayEquals(new int[] { 60, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case134() {
    int[] cellPrice = { 14, 5, 56, 78, 90, 82, 74, 61, 57, 4, 44, 33, 17, 6, 5, 99, 85, 71, 10, 49, 20, 5, 28 };
    int[] enterCell = { 16, 15, 14, 12, 18, 6, 22, 9, 2, 15, 2, 8, 0, 2, 17, 6, 13, 14, 21, 14, 10, 10, 8, 12, 13, 2, 0, 6, 13, 10, 4, 5, 4, 19, 22, 16, 2, 10, 15, 19, 18, 16, 20, 20, 19, 0, 18, 17, 3, 14 };
    int[] exitCell = { 21, 1, 6, 6, 17, 5, 18, 8, 4, 21, 16, 14, 3, 11, 12, 10, 14, 14, 19, 20, 22, 12, 0, 17, 1, 0, 3, 22, 14, 4, 4, 14, 15, 1, 2, 12, 12, 0, 5, 3, 19, 11, 19, 16, 9, 9, 5, 10, 18, 13 };
    int teleportPrice = 20;
    assertArrayEquals(new int[] { 85, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case135() {
    int[] cellPrice = { 28, 64, 83, 26, 32, 68, 23, 14, 55, 41, 74, 50, 78 };
    int[] enterCell = { 11, 6, 1, 5, 12, 2, 4, 6, 4, 0, 6, 5, 11, 5, 7, 3, 2, 2, 5, 10, 12, 10, 2, 8, 5, 0, 11, 11, 2, 5, 8, 8, 9, 1, 9, 7, 5, 2, 6, 2, 8, 3, 7, 1, 9, 2, 0, 7, 10, 8 };
    int[] exitCell = { 10, 5, 10, 9, 9, 10, 3, 1, 1, 8, 2, 10, 1, 8, 7, 5, 11, 10, 0, 12, 3, 12, 6, 10, 6, 12, 3, 7, 2, 10, 5, 2, 0, 4, 4, 5, 8, 1, 9, 8, 1, 7, 4, 2, 4, 0, 8, 11, 7, 10 };
    int teleportPrice = 108;
    assertArrayEquals(new int[] { 108, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case136() {
    int[] cellPrice = { 10, 0, 31, 90, 9, 25, 84, 7, 93, 9, 79, 93, 22, 1, 19, 4, 27, -1, 94, 51, 23, 97, 83, 89, 86, 34, 73, 97, 7, 2, 72, 66, 39, 40, 42, 26, 2 };
    int[] enterCell = { 2, 34, 26, 9, 32, 11, 13, 11, 9, 21, 12, 28, 23, 24, 31, 18, 19, 15, 17, 22, 30, 17, 29, 13, 31, 6, 11, 16, 29, 36, 3, 21, 17, 17, 29, 28, 16, 25, 19, 7, 21, 24, 4, 23, 18, 0, 36, 9, 12, 1 };
    int[] exitCell = { 27, 20, 13, 15, 30, 10, 26, 15, 5, 16, 8, 14, 8, 3, 3, 32, 11, 36, 23, 5, 1, 4, 3, 28, 34, 5, 34, 32, 26, 32, 20, 6, 23, 17, 13, 28, 14, 20, 10, 9, 25, 0, 22, 26, 0, 4, 26, 18, 4, 18 };
    int teleportPrice = 90;
    assertArrayEquals(new int[] { 291, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case137() {
    int[] cellPrice = { 30, 3, 60, 87, 62, 87, -1, 75, 17, 3, 19, 37, 26, 98, 6, 46, -1, 96, 67, 44, 46, 40, 10, 37, 15, 90, 69, 84, 56, 41, 55, 55, 21 };
    int[] enterCell = { 13, 27, 6, 13, 6, 16, 32, 26, 8, 21, 28, 26, 6, 2, 31, 8, 18, 3, 17, 11, 28, 4, 31, 18, 32, 25, 2, 30, 8, 27, 20, 1, 3, 12, 29, 9, 29, 4, 9, 15, 17, 20, 27, 22, 30, 23, 3, 8, 5, 29 };
    int[] exitCell = { 14, 21, 27, 32, 17, 22, 4, 13, 7, 29, 27, 29, 2, 15, 17, 7, 32, 6, 18, 13, 24, 11, 18, 18, 16, 25, 1, 16, 10, 23, 17, 3, 1, 13, 12, 27, 27, 14, 8, 15, 6, 26, 2, 5, 1, 1, 9, 31, 29, 9 };
    int teleportPrice = 24;
    assertArrayEquals(new int[] { 116, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case138() {
    int[] cellPrice = { 34, 58, 12, 94, 61, 47, 4, 29, 34, 33, 83, 80, 67, 18, 22, 94, 9, 54, 26, 34, 38, 70, 88, 43, 2, 55, 45, 85, 43, 18, 100, 4, 47, 58, 60, -1, 56, 79, 97, 61, 83, 29 };
    int[] enterCell = { 29, 10, 26, 37, 32, 33, 27, 9, 18, 41, 8, 33, 18, 22, 29, 8, 8, 6, 25, 6, 23, 33, 41, 13, 2, 28, 17, 5, 0, 6, 14, 21, 13, 39, 29, 31, 29, 0, 19, 41, 34, 26, 21, 8, 24, 37, 22, 31, 33, 23 };
    int[] exitCell = { 3, 29, 3, 17, 8, 1, 3, 26, 36, 26, 2, 35, 35, 30, 23, 4, 29, 25, 19, 39, 17, 1, 2, 21, 30, 31, 12, 30, 37, 9, 16, 11, 8, 38, 17, 30, 19, 13, 1, 5, 2, 37, 17, 14, 31, 37, 14, 36, 7, 27 };
    int teleportPrice = 90;
    assertArrayEquals(new int[] { 360, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case139() {
    int[] cellPrice = { 8, -1, 3, 20, -1, -1 };
    int[] enterCell = { 4, 1, 3, 0, 2, 5, 0, 0, 5, 4, 0, 3, 5, 5, 1, 1, 3, 3, 5, 5, 2, 3, 0, 2, 4, 1, 3, 2, 4, 0, 0, 3, 1, 1, 4, 0, 1, 0, 5, 0, 1, 3, 2, 5, 2, 2, 2, 4, 5, 0 };
    int[] exitCell = { 1, 1, 0, 1, 1, 0, 4, 5, 0, 2, 4, 5, 3, 5, 3, 5, 1, 4, 0, 5, 4, 3, 0, 0, 0, 5, 0, 2, 4, 1, 1, 0, 5, 2, 2, 1, 0, 4, 5, 4, 2, 2, 4, 1, 4, 3, 4, 0, 5, 2 };
    int teleportPrice = 216;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case140() {
    int[] cellPrice = { 62, 29, 38, 25, 22, -1, 61, 76, 53, 62, 84, 31, 44, 70, 15, 54, 18, 58, 43, -1, 64, 37, 0, 30, -1, 73, 20, 57, 86, 60, 77, 48, -1 };
    int[] enterCell = { 13, 14, 9, 26, 0, 0, 31, 6, 29, 14, 14, 1, 17, 21, 0, 30, 20, 24, 24, 4, 12, 24, 21, 2, 17, 30, 4, 13, 27, 19, 5, 17, 29, 18, 4, 6, 12, 11, 0, 25, 11, 30, 2, 29, 16, 25, 6, 1, 11, 2 };
    int[] exitCell = { 6, 0, 7, 23, 20, 16, 20, 29, 0, 21, 5, 24, 32, 20, 3, 19, 20, 27, 11, 3, 7, 24, 11, 27, 18, 32, 12, 18, 22, 19, 23, 16, 5, 24, 18, 19, 27, 4, 11, 5, 19, 23, 15, 17, 25, 8, 7, 28, 21, 11 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case141() {
    int[] cellPrice = { 43, 67, 0, 79, 39, 34, 79, 23, 82, 79, 2, 86, 83, 80, 10, 31, 75, 33, 48, 72, -1, 51 };
    int[] enterCell = { 13, 5, 12, 9, 3, 12, 16, 4, 2, 14, 20, 18, 6, 14, 18, 1, 11, 17, 6, 2, 20, 5, 16, 8, 18, 9, 11, 4, 20, 2, 12, 20, 4, 6, 9, 1, 18, 4, 14, 12, 4, 12, 21, 10, 4, 12, 15, 11, 20, 14 };
    int[] exitCell = { 13, 12, 5, 0, 17, 18, 11, 7, 12, 6, 20, 2, 0, 14, 11, 16, 1, 6, 4, 12, 13, 16, 3, 4, 11, 5, 19, 12, 11, 6, 4, 15, 3, 3, 18, 5, 18, 20, 1, 7, 16, 6, 10, 2, 5, 13, 19, 21, 2, 6 };
    int teleportPrice = 160;
    assertArrayEquals(new int[] { 474, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case142() {
    int[] cellPrice = { 19, 91, 60, 58, -1, 14, 18, -1, 36, 26 };
    int[] enterCell = { 7, 2, 7, 3, 4, 6, 5, 8, 7, 6, 6, 7, 1, 7, 9, 6, 0, 9, 6, 8, 8, 1, 2, 8, 1, 3, 4, 8, 8, 6, 8, 2, 5, 6, 2, 6, 7, 5, 3, 0, 0, 0, 0, 1, 7, 2, 5, 2, 7, 8 };
    int[] exitCell = { 4, 3, 6, 1, 0, 6, 4, 9, 5, 4, 8, 3, 3, 2, 3, 8, 7, 1, 7, 6, 4, 9, 5, 8, 5, 9, 8, 6, 3, 0, 7, 2, 5, 8, 6, 6, 1, 2, 9, 9, 8, 6, 9, 1, 4, 1, 6, 5, 6, 3 };
    int teleportPrice = 36;
    assertArrayEquals(new int[] { 36, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case143() {
    int[] cellPrice = { 26, 49, -1, 65, 91, 61, 38, 98, 25, 38, 42, 20, 6, 52, 85, 86, 50, 19, 42, 42, 80, 54, 87, 98, 10, 33, 27, 2, 75, -1, 29, 44, 58, 7, 12, 9, 89, 29, 51, 8, 48, 47, 57, 43, 17, 68 };
    int[] enterCell = { 2, 14, 25, 24, 19, 29, 20, 4, 4, 43, 32, 27, 40, 37, 26, 29, 31, 7, 38, 30, 45, 13, 38, 27, 43, 40, 14, 43, 4, 30, 21, 26, 37, 2 };
    int[] exitCell = { 32, 31, 37, 38, 8, 35, 41, 7, 30, 35, 12, 4, 30, 43, 43, 8, 41, 0, 27, 8, 14, 33, 37, 33, 40, 2, 1, 44, 19, 37, 42, 30, 38, 5 };
    int teleportPrice = 60;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case144() {
    int[] cellPrice = { 58, 37, 58 };
    int[] enterCell = { 0, 2, 1, 0, 2, 0, 2, 0, 0, 2, 2, 0, 0, 0, 1, 1, 1, 1, 0, 0, 2 };
    int[] exitCell = { 2, 2, 2, 1, 2, 1, 1, 0, 1, 2, 0, 0, 1, 2, 2, 1, 0, 2, 1, 0, 1 };
    int teleportPrice = 144;
    assertArrayEquals(new int[] { 95, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case145() {
    int[] cellPrice = { 86, 18, 42, 80, 85, 46, 48, 48, -1, 83, 80, 64, 13, 63, 17, 33, 25, 83, 98, 17, 53, 36, 71 };
    int[] enterCell = { 14, 20, 0, 13, 2, 8, 15, 21, 8, 16, 8, 10, 12, 19, 10, 9, 17, 20, 19, 16, 5, 4, 5, 1, 22, 12, 8, 17, 6, 1, 13 };
    int[] exitCell = { 10, 9, 5, 2, 19, 8, 8, 3, 14, 2, 6, 14, 18, 1, 11, 22, 5, 6, 2, 0, 14, 14, 6, 15, 9, 8, 3, 17, 6, 17, 13 };
    int teleportPrice = 54;
    assertArrayEquals(new int[] { 274, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case146() {
    int[] cellPrice = { 77, 69, 91, 47, 87, 30, 40, 87, 99, 52, 84, 8, 75, 37, 3, 79, 47, 31, 49, 63 };
    int[] enterCell = { 9, 11, 15, 4, 17, 12, 10, 7, 1, 9, 15, 16, 19, 4, 10, 16, 19, 9, 2, 16, 16, 14, 0, 14, 12, 6, 4, 3, 7, 8, 2, 19, 0 };
    int[] exitCell = { 1, 13, 18, 3, 9, 10, 0, 10, 6, 17, 3, 15, 7, 0, 0, 6, 12, 0, 11, 7, 17, 15, 19, 6, 16, 10, 10, 13, 3, 0, 16, 13, 14 };
    int teleportPrice = 30;
    assertArrayEquals(new int[] { 30, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case147() {
    int[] cellPrice = { 81, 78, 77, 76, 84, 99, 15, 72, 97, 18, 37, 2, 97, 16, 0, 57, 6, 25, 96, 95, 56, 37, 75, 6, 91, 2, 91, 63, 1, 100, 17, 78, 79, 82, 7, 11, 16, 95, 24, 11, 63 };
    int[] enterCell = { 28, 14, 0, 12, 40, 28, 19, 10, 34, 37, 32, 25, 21, 19, 0, 38, 12, 18, 20, 37, 1, 25, 3, 35, 10, 4, 13, 20, 14, 34, 2, 8, 12, 32, 40, 23, 3, 8, 34, 9, 39, 12 };
    int[] exitCell = { 18, 0, 38, 8, 23, 24, 8, 11, 35, 10, 15, 17, 11, 13, 27, 31, 37, 36, 35, 2, 9, 33, 35, 38, 36, 38, 38, 39, 2, 8, 33, 34, 28, 22, 39, 26, 15, 29, 28, 30, 28, 14 };
    int teleportPrice = 180;
    assertArrayEquals(new int[] { 254, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case148() {
    int[] cellPrice = { 56, 64, -1, 20, 39, 56, -1, 79, -1, 38, 85, -1, -1, 27, 93, 52, 19, 51, 61, 55, 30, 90, -1, -1, 1, 95, 35 };
    int[] enterCell = { 9, 5, 26, 8, 7, 4, 6, 20, 19, 3, 24, 5, 5, 17, 1, 15, 2, 26, 18, 10, 7, 22, 12, 12, 24, 17, 7, 16, 6, 8, 17, 20, 14, 21, 14, 3, 15, 25, 10, 13, 14, 13, 24, 21, 8, 18, 7, 21, 15, 4 };
    int[] exitCell = { 0, 21, 9, 12, 1, 6, 2, 0, 17, 1, 0, 1, 22, 4, 8, 19, 23, 8, 12, 2, 21, 8, 3, 16, 5, 10, 10, 6, 22, 20, 22, 18, 20, 8, 9, 5, 23, 22, 11, 22, 21, 21, 14, 12, 8, 12, 2, 1, 0, 23 };
    int teleportPrice = 150;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case149() {
    int[] cellPrice = { 25, 59, -1, 61, 26, 12, 52, 6, 28, 73, 98, -1, 100, 83, 11, 26, 63, 43, 70, 91, 16, 40, 14, 30, 37, 94, 6, 3, 15, 43, 67, 72, 100, 24, 7, -1 };
    int[] enterCell = { 12, 8, 8, 21, 16, 22, 21, 2, 13, 25, 13, 25, 8, 7, 5, 14, 0, 8, 0, 31, 22, 14, 2, 0, 6, 12, 8, 4, 25, 23, 25, 21, 9, 20, 3, 34, 19, 32, 6 };
    int[] exitCell = { 0, 35, 4, 0, 11, 9, 5, 26, 11, 6, 34, 9, 31, 33, 3, 33, 4, 19, 18, 22, 24, 25, 32, 16, 17, 20, 15, 0, 9, 17, 21, 7, 24, 10, 7, 31, 4, 20, 7 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case150() {
    int[] cellPrice = { 39, -1, 71, 44, 73, 70, 17, -1, 74, 100, 58, 20, 56, 76, -1, 39, 38, 76, 42, 55, 31, 74, 18, 95, 11, 94, 64, 63, 46, 66, 7, -1, 51, -1, 20, 95, 88, -1, 59, -1, 53, 48, 7, 12, 55, 63, -1, 26, -1, 100 };
    int[] enterCell = { 12, 15, 16, 46, 27, 26, 41, 14, 23, 30 };
    int[] exitCell = { 20, 33, 42, 15, 2, 49, 7, 27, 29, 38 };
    int teleportPrice = 100;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case151() {
    int[] cellPrice = { 71, 63, 52, -1, 37, 17 };
    int[] enterCell = { 3, 3, 3, 3, 5, 4, 5, 4, 4, 3, 5, 0, 5, 5, 2, 2, 2, 3, 0, 5, 4, 0, 5, 0, 0, 1, 4, 4, 0, 2, 4, 1, 0, 4, 3 };
    int[] exitCell = { 5, 3, 1, 5, 1, 0, 5, 3, 5, 3, 2, 1, 5, 1, 5, 0, 5, 0, 3, 4, 2, 5, 2, 5, 4, 2, 2, 5, 4, 1, 5, 5, 5, 2, 2 };
    int teleportPrice = 324;
    assertArrayEquals(new int[] { 324, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case152() {
    int[] cellPrice = { 60, 45, 85, 49, 52, 28, 39, -1, 59, 6, 1, 98, 7, 83, 51, 84, -1, 62, 52, 62, 71, 0, -1, 57, 14, 63, 44, 42, -1, 98, 95, 47, 33, 66, 1, 74, 25, 81 };
    int[] enterCell = { 20, 27, 33, 17, 16, 14, 17, 15, 28, 22, 29, 10, 11, 16, 31, 24, 3, 15, 29, 31, 5, 35, 26, 8, 16, 36, 35, 14, 28, 7, 12, 31, 33, 4, 35, 30, 34, 21, 21, 9, 37, 32, 4, 8, 11, 19, 21, 33, 19 };
    int[] exitCell = { 15, 21, 37, 18, 15, 35, 3, 9, 9, 9, 28, 22, 33, 30, 22, 1, 2, 7, 7, 15, 3, 21, 25, 16, 19, 25, 15, 1, 13, 18, 7, 13, 32, 18, 31, 31, 26, 0, 15, 4, 12, 22, 35, 14, 1, 16, 7, 28, 36 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 299, 8 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case153() {
    int[] cellPrice = { 7, 42, -1, 99, 36, 77, 94, 21, 24, 77, 27, 89, 83, 31, 29, 21, 45, 35, 62, 63, 46, 24, 59, 27, 99, 69, 99, 35, 92, 7, 64, 20, 80, 23, 53, 2, -1, 87, 96, 15, 4, 7, 52, 1 };
    int[] enterCell = { 21, 4, 27, 28, 6, 39, 43, 39, 4, 2, 30, 0, 36, 27, 2, 16, 16, 30, 41, 29, 5, 17, 23, 15 };
    int[] exitCell = { 43, 21, 18, 30, 3, 3, 0, 19, 3, 19, 34, 30, 8, 32, 22, 23, 5, 19, 42, 39, 3, 0, 11, 21 };
    int teleportPrice = 270;
    assertArrayEquals(new int[] { 612, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case154() {
    int[] cellPrice = { 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    int[] enterCell = { 0 };
    int[] exitCell = { 8 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case155() {
    int[] cellPrice = { 33, -1, 70, 29, 52, 24, 85, 2, 79, 100, 4, 76, 44, 16, 38, 8, 87, 52, 30, 63, 26, 37 };
    int[] enterCell = { 17, 21, 14, 1, 3, 11, 14, 6, 2, 15, 2, 10, 11, 12, 5, 18, 10, 15, 4, 13, 18, 17, 15, 20, 9, 9, 10, 18, 10, 15, 15, 0, 3, 21, 20, 19, 2, 1, 7, 2, 9, 7, 15, 11 };
    int[] exitCell = { 17, 1, 5, 12, 16, 13, 21, 15, 5, 15, 5, 20, 15, 17, 3, 5, 15, 9, 2, 19, 16, 20, 2, 18, 5, 17, 2, 9, 0, 13, 17, 2, 14, 14, 7, 16, 5, 0, 20, 17, 0, 1, 21, 7 };
    int teleportPrice = 18;
    assertArrayEquals(new int[] { 86, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case156() {
    int[] cellPrice = { 66, 89, -1, 28, 92, 59 };
    int[] enterCell = { 4, 3, 5, 0, 5, 1, 0, 0 };
    int[] exitCell = { 1, 2, 5, 4, 5, 3, 3, 1 };
    int teleportPrice = 54;
    assertArrayEquals(new int[] { 113, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case157() {
    int[] cellPrice = { 75, 74, 100, 36, 71, 23, -1, 55, 73, 95, 67, 97, 78, 10, 57, 84, 32, 83, 98, 37, -1, 79, 12, 48, 97, -1, 64, 18, -1, 25, -1, 19, 35, 7, 14, 19, 20, 65, 70, 2, 59, 11, 72, 61, 98 };
    int[] enterCell = { 1, 33, 1, 1, 33, 34, 11, 14, 26, 0, 13, 20, 15, 25, 1, 13, 29, 30, 26, 22, 34, 21, 6, 27 };
    int[] exitCell = { 7, 2, 27, 39, 41, 37, 40, 15, 6, 42, 35, 1, 21, 9, 35, 35, 5, 38, 11, 13, 44, 32, 16, 1 };
    int teleportPrice = 96;
    assertArrayEquals(new int[] { 255, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case158() {
    int[] cellPrice = { 85, 21, 68, 2, 38, 36, 89, 33, 4, 68, -1, 12, 91, 89, 93, 10, 0, 71, 28, 19, 50, 74, 64, 48, 23, 4, 32, 40, 93, 45, 59, 36, 47, 39, 64, 57, 46, 72, 55 };
    int[] enterCell = { 37, 35, 16, 29, 37, 31, 1, 4, 16, 9, 5, 18, 10, 30, 6, 8, 26, 1, 28, 6, 34, 14, 6, 16, 23, 24, 2, 5, 34, 31, 12, 20, 27, 21, 34, 8 };
    int[] exitCell = { 8, 30, 8, 5, 34, 6, 8, 17, 38, 30, 35, 6, 3, 32, 1, 22, 38, 26, 38, 0, 7, 27, 5, 26, 14, 32, 1, 2, 32, 26, 14, 7, 25, 6, 7, 2 };
    int teleportPrice = 400;
    assertArrayEquals(new int[] { 738, 9 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case159() {
    int[] cellPrice = { 5, 61, 61, 36, 32, 21, 5, 73, 67, 82, 82, 98, 4, 54, 80, 79, 86, 62, 39, 97, 68, -1, 49, 5, -1, 62, 77, 33, -1, 24 };
    int[] enterCell = { 10, 11, 5, 26, 12, 0, 4, 28, 10, 18, 6, 8, 29, 13, 20, 1, 1, 13, 9, 0, 6 };
    int[] exitCell = { 29, 4, 25, 20, 16, 21, 20, 18, 0, 11, 29, 26, 11, 1, 12, 3, 10, 22, 5, 26, 11 };
    int teleportPrice = 300;
    assertArrayEquals(new int[] { 516, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case160() {
    int[] cellPrice = { 96, 9, 95, 65, 65, 37, 84, 70, 88, 61, 81, -1, 23 };
    int[] enterCell = { 0, 0, 1, 7, 3, 10, 6, 3, 2, 6, 12, 3, 6, 3, 5, 12, 1, 11, 0, 5, 9, 11, 5, 10, 6, 2, 5, 4, 1, 3, 2, 1, 1, 3, 6, 5, 3, 0, 6, 10, 9, 4, 6 };
    int[] exitCell = { 12, 10, 2, 6, 1, 3, 9, 12, 11, 10, 7, 10, 4, 12, 10, 5, 5, 0, 7, 3, 3, 7, 11, 6, 4, 2, 10, 8, 10, 0, 10, 10, 12, 10, 1, 12, 12, 4, 6, 4, 10, 1, 3 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 0, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case161() {
    int[] cellPrice = { 12, 67, 56, 64, 93, 99, 55, 15, 1, 56, 63, 91, 78, 61, 63, 29, 31, 75, -1, 91, 4, -1, -1, 83, 81, 43, 63, 38, 15, 96, 99, 81, 73, -1, 73, 38, -1, 8, 94, -1, 0, 38, 50, 18 };
    int[] enterCell = { 26, 43, 41, 27, 7, 18, 26, 21, 39, 40, 17, 18, 3 };
    int[] exitCell = { 26, 23, 38, 13, 8, 16, 35, 15, 38, 33, 35, 16, 29 };
    int teleportPrice = 64;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case162() {
    int[] cellPrice = { 45, 90, 39, 56, 49, -1, 80, 23, 49, 20 };
    int[] enterCell = { 1, 8, 5, 8, 8, 3, 3, 9, 2, 7, 1, 7, 0, 3, 8, 3, 0, 4, 0, 4, 8, 8, 8, 3, 4, 1, 8, 4, 0, 8 };
    int[] exitCell = { 9, 7, 9, 7, 2, 0, 6, 3, 3, 2, 1, 7, 0, 7, 1, 0, 8, 2, 7, 2, 6, 0, 3, 4, 5, 5, 4, 1, 7, 7 };
    int teleportPrice = 500;
    assertArrayEquals(new int[] { 520, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case163() {
    int[] cellPrice = { 19, 22, -1, 96, 37, 7, 29, 48, 4, 61 };
    int[] enterCell = { 6, 4, 8, 2, 1, 3, 2, 2, 7, 2, 6, 4, 9 };
    int[] exitCell = { 3, 7, 1, 2, 0, 8, 5, 2, 7, 0, 7, 1, 4 };
    int teleportPrice = 144;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case164() {
    int[] cellPrice = { 1, 40, 61, 4, 95, 91, 4, 43, 83, 83, 23, 35, 67, 93, 43, 70, 87, 61, 31, 29, 54, 23, 22, 82, 54, 11, 39, 1, 33, 21, 71, 81, 30, 19, 31, 68, 55, 53, 22, 79 };
    int[] enterCell = { 17, 14, 38, 28, 22, 39, 27, 21, 33, 4, 7, 39, 35, 0, 12, 18 };
    int[] exitCell = { 8, 39, 1, 33, 29, 38, 24, 1, 31, 16, 14, 24, 37, 19, 3, 9 };
    int teleportPrice = 90;
    assertArrayEquals(new int[] { 473, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case165() {
    int[] cellPrice = { 34, 48, 13, 37, 84, 30, 86, 67, 68, 83, 44, 62, 88, 0, 65, 71, 77, 87, 10, 55, 28, 97, -1, 72, 98, 89, 5, 17, 91, 86, 85, 77, 75, 36, 11, 90, 85, 35, 70, 93, 74, 97, -1, 43, 63, 78, 57, 73, 82, 79 };
    int[] enterCell = { 34, 33, 16, 17, 19, 1, 3, 1, 14, 5, 23, 31, 2, 27, 14, 8, 18, 27, 8, 44, 28, 40, 22, 36, 21 };
    int[] exitCell = { 7, 13, 40, 32, 38, 37, 40, 30, 34, 3, 42, 6, 11, 39, 20, 35, 1, 35, 45, 37, 40, 20, 23, 34, 25 };
    int teleportPrice = 18;
    assertArrayEquals(new int[] { 570, 11 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case166() {
    int[] cellPrice = { 54, 79, -1, 7, 46, 93, 48, 99, 71, -1, 43, 57 };
    int[] enterCell = { 8, 0, 9, 7, 6, 3, 1, 2, 5, 8, 0, 1, 10, 8, 0, 4, 6, 8, 8, 2, 9, 0, 10, 0, 1, 0, 7, 6, 6, 9, 1, 0, 9 };
    int[] exitCell = { 8, 2, 10, 11, 5, 2, 7, 7, 5, 11, 3, 2, 3, 3, 4, 2, 0, 5, 9, 1, 9, 8, 8, 4, 10, 0, 2, 11, 0, 2, 4, 2, 3 };
    int teleportPrice = 540;
    assertArrayEquals(new int[] { 676, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case167() {
    int[] cellPrice = { 11, -1, 80, 59, 15, 36, 55 };
    int[] enterCell = { 5, 2, 4, 2, 0, 3 };
    int[] exitCell = { 0, 1, 3, 4, 3, 2 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 94, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case168() {
    int[] cellPrice = { 66, 33, 8, 56, -1, 61, 57, 15, -1, 45, 86, 73, 19, 64, 44, 7, 78, 61, 46, 43, 87, 25, 56, -1, 73, 62, 32, 32, 87, 30, 99, 66, 74, 91, 63, 62, 2, 38, 52 };
    int[] enterCell = { 13, 30, 21, 18, 32, 20, 3, 28, 33, 5, 30, 38, 21, 27, 35 };
    int[] exitCell = { 0, 24, 34, 23, 26, 10, 6, 6, 20, 4, 1, 11, 6, 5, 7 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case169() {
    int[] cellPrice = { 82, 76, 83, 70, 82, -1, 9, -1, 27, -1, -1, -1, 98, -1, 5, -1, 21, -1, 12, -1, -1, -1, 88, 78, 52, -1, 85, -1, 61, -1 };
    int[] enterCell = { 22, 29, 20 };
    int[] exitCell = { 14, 23, 21 };
    int teleportPrice = 60;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case170() {
    int[] cellPrice = { 9, 37, -1, 81, 74, 70, -1, 38, -1 };
    int[] enterCell = { 0, 1, 2, 0, 4, 6, 2, 3, 2 };
    int[] exitCell = { 2, 4, 1, 1, 2, 1, 3, 7, 6 };
    int teleportPrice = 432;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case171() {
    int[] cellPrice = { 36 };
    int[] enterCell = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] exitCell = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int teleportPrice = 360;
    assertArrayEquals(new int[] { 0, 0 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case172() {
    int[] cellPrice = { 79, 78, 92, -1, -1 };
    int[] enterCell = { 3, 2, 1, 1, 4, 1, 2 };
    int[] exitCell = { 4, 3, 2, 4, 1, 1, 2 };
    int teleportPrice = 189;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case173() {
    int[] cellPrice = { 80, 1, 51, 83, 38, 15, 93, 36, 93, 63, 71, 89, 8, 85, -1, 12, 12, 6, 7, 6, 15, 16, 8, 6, 0, 44, 8, 91, -1, 67, 14, 40, 83, 65, 0, 25, 91, 92, 36, 15, 21 };
    int[] enterCell = { 14, 33, 39, 1, 18, 6, 20, 14, 39, 13, 26, 32, 23, 27, 9, 6, 37, 5, 15, 26, 15, 23, 25, 34, 37, 29, 33, 8, 32, 10, 39, 2, 34, 22, 25, 18, 39, 40, 26, 31, 25 };
    int[] exitCell = { 21, 30, 35, 1, 40, 3, 25, 30, 9, 21, 26, 10, 32, 10, 13, 20, 24, 22, 9, 39, 28, 40, 34, 39, 5, 31, 40, 8, 19, 20, 6, 12, 5, 11, 33, 39, 11, 18, 17, 30, 27 };
    int teleportPrice = 50;
    assertArrayEquals(new int[] { 295, 8 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case174() {
    int[] cellPrice = { 88, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    int[] enterCell = { 15 };
    int[] exitCell = { 17 };
    int teleportPrice = 486;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case175() {
    int[] cellPrice = { 18, -1, 99, 22, 1, -1, 7, 75, -1 };
    int[] enterCell = { 8, 7, 8, 3, 7, 8, 3, 2, 8, 7, 5, 5, 2, 8, 2, 5, 6, 5, 7, 3, 3, 2, 4, 8, 1, 1, 6, 4, 2, 7, 0, 0, 1, 6, 2, 2, 7, 8, 3, 3, 6, 7, 1 };
    int[] exitCell = { 1, 4, 3, 3, 0, 6, 8, 0, 3, 0, 3, 6, 6, 6, 2, 7, 6, 4, 3, 5, 8, 5, 6, 2, 1, 8, 0, 0, 8, 2, 8, 8, 1, 4, 0, 5, 2, 5, 7, 3, 1, 1, 2 };
    int teleportPrice = 6;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case176() {
    int[] cellPrice = { 3, 26, 77, -1 };
    int[] enterCell = { 1, 2, 0, 0, 1, 2, 3, 1, 2, 2, 3, 0, 0, 0, 0, 3, 0, 2, 0, 1, 2, 1, 3, 3, 0, 3, 3, 1, 2, 0, 3, 0, 3 };
    int[] exitCell = { 0, 3, 3, 3, 2, 0, 3, 1, 3, 1, 3, 3, 2, 1, 0, 3, 2, 3, 0, 0, 0, 2, 1, 2, 3, 3, 1, 2, 2, 3, 3, 2, 1 };
    int teleportPrice = 112;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case177() {
    int[] cellPrice = { 82, 68, 81, 58, 48, 81, 12, 84, 47, 65, 8, 21, 37, 35, 100, 52 };
    int[] enterCell = { 7, 6, 4, 7, 9, 6, 15, 0, 10, 7, 5, 1, 8, 13, 0, 5, 14, 9, 4, 2, 8, 5, 0, 14, 8, 13, 1, 15, 8, 1, 8, 3, 1, 8, 13 };
    int[] exitCell = { 1, 12, 7, 4, 0, 6, 3, 15, 7, 9, 3, 4, 5, 9, 9, 0, 2, 12, 3, 12, 5, 14, 13, 0, 7, 3, 9, 5, 7, 14, 2, 15, 0, 2, 12 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 0, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case178() {
    int[] cellPrice = { 77, 62, 75, -1, 34, 86, 1, 70, 9, 81, 87, 57, -1 };
    int[] enterCell = { 5, 0, 0, 12, 10, 11, 8, 5, 0, 10, 8, 5, 9, 0, 12 };
    int[] exitCell = { 10, 11, 9, 7, 9, 11, 5, 0, 10, 6, 4, 11, 5, 4, 6 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case179() {
    int[] cellPrice = { 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    int[] enterCell = { 29 };
    int[] exitCell = { 8 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case180() {
    int[] cellPrice = { 65, 59, 99 };
    int[] enterCell = { 1, 1, 0, 0, 1, 0, 2, 1, 1, 1, 0, 0, 1, 2, 0, 0, 2, 1, 0, 0, 1, 0, 1, 0, 0, 2, 0, 1, 1, 2, 1, 2, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 2, 2 };
    int[] exitCell = { 1, 2, 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 0, 0, 0, 1, 2, 0, 1, 1, 2, 1, 0, 0, 1, 0, 2, 0, 0, 2, 0, 1, 2, 0, 0, 2, 1, 2, 0, 1, 1, 1, 2, 1, 1 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 0, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case181() {
    int[] cellPrice = { 62, 43, 58, 1, 17, -1, 25, 57, 33, 86, 70, 96, 59, 5, 32, 34, 80, 83, 8, 9, 33, 48, 6, 48, 77, 25, 54, 23, -1, 6, 60, 21, 13, 47, 93, 18, -1, 64, 99, 64, 31, 27, 49, 35, 34, 94 };
    int[] enterCell = { 38, 40, 14, 37, 6, 2, 6, 43, 11, 31, 40, 22, 18, 30, 10, 2, 35 };
    int[] exitCell = { 27, 24, 36, 35, 41, 12, 30, 7, 29, 18, 40, 8, 14, 0, 27, 40, 29 };
    int teleportPrice = 90;
    assertArrayEquals(new int[] { 430, 8 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case182() {
    int[] cellPrice = { 3, 23, 16, 68, 38, 69, 77, -1, 12, 18, 32 };
    int[] enterCell = { 9, 6, 9, 1, 7, 4, 5, 7, 7, 10, 7, 1, 2, 5, 5, 7, 4, 3, 10, 6, 6, 6, 4, 9, 2, 3, 8, 3, 8, 3, 3, 9, 3, 0, 9, 5, 3, 8, 4, 1, 4, 8, 4, 7, 6, 1, 10 };
    int[] exitCell = { 7, 1, 6, 4, 1, 1, 7, 0, 7, 5, 0, 4, 10, 4, 2, 10, 2, 10, 10, 8, 5, 7, 10, 8, 8, 0, 3, 3, 8, 2, 4, 4, 6, 10, 8, 8, 4, 5, 2, 4, 6, 7, 0, 3, 3, 8, 7 };
    int teleportPrice = 378;
    assertArrayEquals(new int[] { 378, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case183() {
    int[] cellPrice = { 16, 59, 81, 49, 44, 82, 39, 81, 44, 56, -1, 69, 29, 60, 36, 21, -1, 13, 72, 56, 76, 41, 5, 63, 41, 38, 24, 87, -1, 17, 29, 73, 81, 69, 72, 98, -1, 46, 29, 3, 82, -1, 12, 72, 89, 72 };
    int[] enterCell = { 30, 42, 18, 34, 0, 2, 19, 29, 15, 10, 0, 34, 19 };
    int[] exitCell = { 22, 24, 12, 19, 38, 45, 26, 20, 41, 27, 14, 24, 45 };
    int teleportPrice = 45;
    assertArrayEquals(new int[] { 185, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case184() {
    int[] cellPrice = { 81, -1, 32, 25, -1, 19, -1, 35, 94, 43, 70, 44, 8, 91, 89, 73, 39, 19, 37, 98, 46, 90, -1, 74, 99, 74, 40, 44, 88, -1, -1, -1 };
    int[] enterCell = { 21, 18, 29, 10, 10, 3 };
    int[] exitCell = { 24, 7, 0, 23, 29, 24 };
    int teleportPrice = 144;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case185() {
    int[] cellPrice = { 1, 47, 22, 49, -1, 98, 29, 58, 34, 61, 94, 73, 39, 21, 14, 82, 83, 65, 44, 18, 3, 9, 60, 4, 5, 24, 53, 74, 61, 51, -1, 30, 6, 69, 37, 5, 66, 84, 27, 49, 65, 70 };
    int[] enterCell = { 10, 27, 21, 8, 22, 38, 17, 23, 14, 31 };
    int[] exitCell = { 6, 0, 39, 26, 41, 10, 3, 16, 16, 34 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case186() {
    int[] cellPrice = { 76, 60, 74, 16, 57, 99, 63, 49, 11, 79, 20, 33, 88, 45, 97, 33, 53, 14, 16, 60, 65, 39, 16, 28 };
    int[] enterCell = { 16, 7, 21, 20, 9, 19, 3, 2, 17, 1, 6, 23, 21, 11, 11, 16, 14, 16, 11, 7, 3, 11, 17, 8, 6 };
    int[] exitCell = { 10, 20, 17, 19, 1, 14, 8, 4, 0, 19, 17, 8, 11, 22, 0, 21, 0, 9, 12, 3, 14, 12, 21, 19, 4 };
    int teleportPrice = 54;
    assertArrayEquals(new int[] { 243, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case187() {
    int[] cellPrice = { 24, 47, 54, 17, -1, 17, 74, 74, -1, 14, 32, 72, 57, 73, 56, 13, 50, 47, 54, 86, 57 };
    int[] enterCell = { 15, 2, 17, 15, 1, 10, 19, 10, 10, 9, 19, 6, 8, 17, 6, 15, 2, 16, 9, 16, 14, 19, 11, 18, 14, 18, 16, 8, 14 };
    int[] exitCell = { 10, 9, 0, 9, 5, 9, 18, 14, 11, 20, 13, 12, 19, 14, 14, 1, 0, 14, 0, 2, 3, 4, 6, 20, 19, 5, 11, 6, 9 };
    int teleportPrice = 48;
    assertArrayEquals(new int[] { 198, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case188() {
    int[] cellPrice = { 71, 88, 73, 28, 10, 93, 13, 6, -1, 46, 30, 9, 51, 38, 27, 26, 30, 62, 5, -1, 58, 7, 75, 22 };
    int[] enterCell = { 5, 16, 19, 19, 2, 15, 20, 6, 5, 10, 3, 23, 18, 19, 0, 6, 9, 10, 12, 16, 2, 10, 14, 12, 22, 19, 4, 1, 16, 9, 5 };
    int[] exitCell = { 19, 4, 6, 13, 22, 15, 4, 8, 18, 16, 6, 10, 8, 12, 7, 7, 11, 8, 2, 14, 10, 3, 19, 19, 21, 1, 22, 5, 14, 8, 0 };
    int teleportPrice = 120;
    assertArrayEquals(new int[] { 303, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case189() {
    int[] cellPrice = { 88, 86, 59, 74, 3, 60 };
    int[] enterCell = { 3, 5, 1, 5, 0, 5, 1, 2, 5, 1, 2, 3, 1, 0, 4 };
    int[] exitCell = { 4, 1, 3, 4, 1, 3, 5, 0, 2, 0, 2, 2, 2, 5, 0 };
    int teleportPrice = 140;
    assertArrayEquals(new int[] { 140, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case190() {
    int[] cellPrice = { 92, -1, 17, 50, 23, -1, 95, 22, 11, 34, 41, 13, 17, 6, 88, 82, 43, 85, 89, 95, 32, 59 };
    int[] enterCell = { 14, 14, 13, 13, 8, 1, 20, 14, 11, 0, 19, 3, 17, 10, 11, 12, 13, 3, 0, 8, 14, 3, 13, 21, 3, 1, 12, 6, 11, 17, 16, 10, 7, 2, 7, 7, 3, 4, 14, 5, 15, 11, 17, 12, 11 };
    int[] exitCell = { 9, 17, 15, 16, 8, 0, 0, 11, 6, 15, 13, 17, 19, 0, 3, 4, 0, 7, 11, 5, 17, 20, 17, 17, 10, 13, 18, 18, 8, 6, 3, 2, 21, 4, 12, 3, 18, 19, 21, 11, 15, 2, 16, 16, 17 };
    int teleportPrice = 360;
    assertArrayEquals(new int[] { 763, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case191() {
    int[] cellPrice = { 68, 77, 2, 32, 11, 85, 37, 65, 73, 57, 24, 39, 11, 0, 52, 65, 13, 38 };
    int[] enterCell = { 1, 5, 13, 16, 15, 8, 6, 1, 5, 15, 12, 6, 12, 14, 17, 5, 0, 11, 11, 5, 7, 17, 0, 10, 11, 14, 11, 16, 13, 5, 10, 9, 5, 1, 4, 15, 8, 13 };
    int[] exitCell = { 10, 2, 8, 8, 2, 9, 9, 9, 0, 16, 14, 13, 2, 9, 3, 6, 8, 5, 17, 16, 8, 2, 2, 14, 15, 6, 16, 2, 6, 11, 5, 0, 7, 0, 12, 14, 16, 15 };
    int teleportPrice = 210;
    assertArrayEquals(new int[] { 455, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case192() {
    int[] cellPrice = { 99, 16, 22, 90, -1, 90, 30, 29, 6, 96, 99, 30, 81, -1, 76, 42, 11, 66, 33, 49, 83, 77 };
    int[] enterCell = { 20, 7, 5, 10, 5, 19, 12, 8, 6, 15, 6, 2, 8, 12, 16, 17, 1, 2, 7, 2, 15, 10, 16, 0, 12, 10, 0 };
    int[] exitCell = { 8, 4, 15, 5, 10, 19, 8, 6, 15, 13, 17, 6, 11, 16, 3, 11, 2, 8, 17, 7, 7, 15, 12, 7, 13, 5, 5 };
    int teleportPrice = 36;
    assertArrayEquals(new int[] { 315, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case193() {
    int[] cellPrice = { 1, 2, 3, 4 };
    int[] enterCell = { 1 };
    int[] exitCell = { 1 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 9, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case194() {
    int[] cellPrice = { 0, 0, 0, 0, 0 };
    int[] enterCell = { 0 };
    int[] exitCell = { 4 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 0, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case195() {
    int[] cellPrice = { 3, 6, 0, 5, 1, 2 };
    int[] enterCell = { 1, 2, 3, 2, 1, 3, 0, 2 };
    int[] exitCell = { 1, 1, 0, 5, 4, 0, 0, 1 };
    int teleportPrice = 8;
    assertArrayEquals(new int[] { 14, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case196() {
    int[] cellPrice = { 4, 2, 1, 0, 5, 6, 0, 3, 0 };
    int[] enterCell = { 4, 4, 3, 7, 5, 4, 2, 5, 8, 4 };
    int[] exitCell = { 7, 3, 5, 0, 5, 4, 5, 0, 8, 3 };
    int teleportPrice = 8;
    assertArrayEquals(new int[] { 14, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case197() {
    int[] cellPrice = { 6, 0, 6, 0, 0, 0, 5, 5 };
    int[] enterCell = { 3, 6, 0, 4, 1, 6, 3, 4, 5, 7 };
    int[] exitCell = { 5, 2, 6, 7, 2, 1, 6, 7, 0, 1 };
    int teleportPrice = 1;
    assertArrayEquals(new int[] { 3, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case198() {
    int[] cellPrice = { 3, 2, 4, -1, 6, 3, -1, -1, 7 };
    int[] enterCell = { 7, 4, 2, 3, 2, 0, 2, 0 };
    int[] exitCell = { 1, 8, 6, 3, 0, 5, 4, 1 };
    int teleportPrice = 10;
    assertArrayEquals(new int[] { 27, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case199() {
    int[] cellPrice = { 0, 3, 3, 1, 0, -1, 3, 2, 1 };
    int[] enterCell = { 5, 4, 0, 4, 3, 2, 2, 7, 6 };
    int[] exitCell = { 3, 5, 1, 8, 2, 5, 7, 1, 4 };
    int teleportPrice = 7;
    assertArrayEquals(new int[] { 14, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case200() {
    int[] cellPrice = { 4, 2, 6, 6, 1, 1, 6 };
    int[] enterCell = { 0, 2, 2, 4, 6, 5, 2 };
    int[] exitCell = { 3, 4, 4, 4, 1, 5, 6 };
    int teleportPrice = 2;
    assertArrayEquals(new int[] { 10, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case201() {
    int[] cellPrice = { 0, 0, 0, 0, 0, 0 };
    int[] enterCell = { 5, 4, 1, 0, 2, 2 };
    int[] exitCell = { 4, 1, 4, 3, 1, 4 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 0, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case202() {
    int[] cellPrice = { 10, -1, 10, 10, -1, 10 };
    int[] enterCell = { 0, 2 };
    int[] exitCell = { 3, 5 };
    int teleportPrice = 7;
    assertArrayEquals(new int[] { 25, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case203() {
    int[] cellPrice = { 1, 0, -1 };
    int[] enterCell = { 0 };
    int[] exitCell = { 2 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case204() {
    int[] cellPrice = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 234, 54, 234, 2, 123, 124, 3, 451, 32, 14, 987, 122, 321, 312 };
    int[] enterCell = { 1, 9, 2, 7, 3, 4, 6, 3, 5, 11, 17 };
    int[] exitCell = { 8, 5, 3, 5, 3, 6, 3, 6, 7, 12, 14 };
    int teleportPrice = 797;
    assertArrayEquals(new int[] { 3057, 22 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case205() {
    int[] cellPrice = { 0, 100, 5, 2, 1, 100, 1 };
    int[] enterCell = { 0, 2 };
    int[] exitCell = { 4, 6 };
    int teleportPrice = 0;
    assertArrayEquals(new int[] { 8, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case206() {
    int[] cellPrice = { 1, 0, -1 };
    int[] enterCell = { 0 };
    int[] exitCell = { 2 };
    int teleportPrice = 5;
    assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case207() {
    int[] cellPrice = { 1, 1, 1 };
    int[] enterCell = { 0, 0 };
    int[] exitCell = { 2, 1 };
    int teleportPrice = 1;
    assertArrayEquals(new int[] { 1, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case208() {
    int[] cellPrice = { 1, 1, -1, 5, 6, 7, 8, 2, 3 };
    int[] enterCell = { 0, 3, 1, 6 };
    int[] exitCell = { 3, 1, 6, 8 };
    int teleportPrice = 1;
    assertArrayEquals(new int[] { 4, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case209() {
    int[] cellPrice = { 0, 1, 2, 3, 4, -1, 7, 8, -1, 9, 10, -1, 34, 50, 54, 34, 44, -1, 1, 2, 3, 4, -1, 5, 6, 7, 8, 9, 10, -1, 9, 10, -1, 4, -1, 5 };
    int[] enterCell = { 0, 0, 0, 0, 7, 7, 7, 6, 6, 4, 10, 10, 12, 16, 16, 31, 31, 26, 28, 28, 33 };
    int[] exitCell = { 5, 6, 7, 8, 3, 2, 1, 3, 4, 9, 11, 12, 7, 31, 30, 26, 7, 0, 0, 33, 35 };
    int teleportPrice = 55;
    assertArrayEquals(new int[] { 566, 17 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case210() {
    int[] cellPrice = { 1000, 1000, 1000, 1000 };
    int[] enterCell = { 0, 1, 2 };
    int[] exitCell = { 2, 3, 1 };
    int teleportPrice = 1;
    assertArrayEquals(new int[] { 6, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case211() {
    int[] cellPrice = { 500, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400 };
    int[] enterCell = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 47 };
    int[] exitCell = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 43, 44, 45, 46, 47, 48, 49, 1 };
    int teleportPrice = 399;
    assertArrayEquals(new int[] { 19599, 49 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case212() {
    int[] cellPrice = { 4, 2, 1, 0, 5, 6, 0, 3, 0, 5, 3, 5, 2, 3, 1, 34, 32, 12, 4, 2, 12, 3, 4, 3, 12, 31, 2, 12, 32, 21, 32, 1, 3, 22, 32, 4, 34, 2, 12, 32, 12, 32, 2, 12, 21, 21, 2, 23, 1, 23 };
    int[] enterCell = { 4, 4, 3, 7, 5, 4, 2, 5, 8, 4, 23, 12, 23, 12, 3, 4, 12, 23, 15, 21, 19, 14, 21, 25 };
    int[] exitCell = { 7, 3, 5, 0, 5, 4, 5, 0, 8, 3, 12, 23, 12, 34, 32, 11, 23, 12, 23, 36, 18, 34, 28, 21 };
    int teleportPrice = 21;
    assertArrayEquals(new int[] { 277, 29 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

  @Test
  public void case213() {
    int[] cellPrice = { 321, 324, 435, 432, 32, 31, 232, 3, 3, 3, 3, 2, 43, 43, 3, 5, 7, 4, 4, 545, 4, 53, 25, 253, 35, 53, 5, 35, 35, 35, 35, 55, 352, 235, 522, 353, 235, 325, 325, 432, 434, 434, 235, 123, 653, 234, 234, 323, 352, 451 };
    int[] enterCell = { 12, 12, 12, 12, 12, 21, 1, 1, 21, 43, 43, 23, 23, 32, 32, 32, 32, 32, 32, 15, 14, 32, 12, 3, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10, 32, 32, 32, 32, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11 };
    int[] exitCell = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 11, 17, 43, 32, 23, 18, 42, 24, 24, 24, 24, 24, 24, 24, 24, 33, 11, 11, 32, 0, 0, 0, 0 };
    int teleportPrice = 1000;
    assertArrayEquals(new int[] { 4501, 12 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  }

}
