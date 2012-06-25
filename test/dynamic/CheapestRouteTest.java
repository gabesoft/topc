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

  //@Test
  //public void case2() {
    //int[] cellPrice = { 0, -1, 0, 0 };
    //int[] enterCell = { 0 };
    //int[] exitCell = { 2 };
    //int teleportPrice = 1000;
    //assertArrayEquals(new int[] { 1000, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case3() {
    //int[] cellPrice = { 1, 2, 3 };
    //int[] enterCell = {  };
    //int[] exitCell = {  };
    //int teleportPrice = 100;
    //assertArrayEquals(new int[] { 5, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case4() {
    //int[] cellPrice = { 1, 0, -1 };
    //int[] enterCell = { 0 };
    //int[] exitCell = { 2 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case5() {
    //int[] cellPrice = { 1, 1, 100, 1 };
    //int[] enterCell = { 1 };
    //int[] exitCell = { 2 };
    //int teleportPrice = 99;
    //assertArrayEquals(new int[] { 101, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case6() {
    //int[] cellPrice = { 1, 1, 100, 1 };
    //int[] enterCell = { 0 };
    //int[] exitCell = { 2 };
    //int teleportPrice = 101;
    //assertArrayEquals(new int[] { 102, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case7() {
    //int[] cellPrice = { 0, 0, -1, 0, 0 };
    //int[] enterCell = { 0, 1, 3, 4 };
    //int[] exitCell = { 2, 2, 2, 2 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case8() {
    //int[] cellPrice = { 1, 2, 3, 4, 5, 6 };
    //int[] enterCell = { 0 };
    //int[] exitCell = { 5 };
    //int teleportPrice = 14;
    //assertArrayEquals(new int[] { 14, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case9() {
    //int[] cellPrice = { 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1 };
    //int[] enterCell = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46 };
    //int[] exitCell = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48 };
    //int teleportPrice = 1000;
    //assertArrayEquals(new int[] { 24276, 24 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case10() {
    //int[] cellPrice = { 1, -1, -1, -1, 1, 1000, 0 };
    //int[] enterCell = { 0, 4 };
    //int[] exitCell = { 4, 5 };
    //int teleportPrice = 999;
    //assertArrayEquals(new int[] { 1999, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case11() {
    //int[] cellPrice = { 1, -1, -1, -1, 1, 1000, 0 };
    //int[] enterCell = { 0, 4 };
    //int[] exitCell = { 4, 5 };
    //int teleportPrice = 1000;
    //assertArrayEquals(new int[] { 2000, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case12() {
    //int[] cellPrice = { 31, 60, 24 };
    //int[] enterCell = { 1, 0, 0, 2, 2, 2, 2, 1, 2, 0, 2, 2, 0, 1, 1, 2, 2, 0, 2, 1, 1, 0, 0, 1, 2, 0, 2, 0, 1, 2, 2, 1, 0, 2, 1, 0 };
    //int[] exitCell = { 2, 0, 0, 0, 0, 1, 1, 0, 2, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 2, 0, 0, 0, 1, 2, 1, 1, 2, 2, 0, 2, 2, 0, 0, 2, 1 };
    //int teleportPrice = 256;
    //assertArrayEquals(new int[] { 84, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case13() {
    //int[] cellPrice = { 5, 52, -1 };
    //int[] enterCell = { 1, 2, 1, 1, 1, 0, 2, 2, 0, 0, 1, 1, 1, 0, 2, 1, 2, 2, 2, 2, 0, 0, 1, 0, 0 };
    //int[] exitCell = { 2, 2, 0, 1, 2, 1, 2, 1, 2, 0, 0, 1, 1, 2, 1, 1, 0, 2, 2, 0, 2, 0, 1, 2, 2 };
    //int teleportPrice = 42;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case14() {
    //int[] cellPrice = { 97, 39, -1, 46 };
    //int[] enterCell = { 1, 1, 0, 2, 2, 1, 2, 1, 1, 3, 2, 1, 1, 3, 3, 0, 3, 0, 0, 2, 1, 0, 2, 2, 1, 2, 2, 0, 1, 2, 3, 1, 3, 0, 2, 3, 0, 2, 3, 3, 1, 3, 3, 0, 2, 0, 2, 2, 3, 0 };
    //int[] exitCell = { 3, 3, 3, 2, 2, 0, 2, 3, 1, 3, 2, 1, 2, 0, 2, 0, 0, 2, 3, 2, 0, 0, 2, 0, 3, 3, 2, 3, 1, 1, 2, 0, 3, 2, 2, 0, 3, 2, 2, 3, 0, 3, 2, 3, 2, 1, 0, 3, 3, 3 };
    //int teleportPrice = 135;
    //assertArrayEquals(new int[] { 135, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case15() {
    //int[] cellPrice = { 74, -1, 77, -1 };
    //int[] enterCell = { 3, 1, 1, 0, 3, 3, 1, 3, 3, 3, 0, 0, 0, 0, 2, 3, 0, 3, 3, 2, 3 };
    //int[] exitCell = { 3, 1, 3, 1, 3, 0, 1, 2, 2, 2, 2, 0, 3, 1, 0, 0, 3, 2, 3, 3, 3 };
    //int teleportPrice = 25;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case16() {
    //int[] cellPrice = { 97, 91, 4, -1, -1 };
    //int[] enterCell = { 2, 4, 4, 1, 2, 1, 0, 3, 3, 1, 2, 4, 3, 2, 1, 0, 4, 3, 1, 3, 0 };
    //int[] exitCell = { 4, 3, 0, 4, 3, 0, 1, 1, 2, 1, 0, 1, 4, 2, 0, 2, 1, 4, 4, 1, 2 };
    //int teleportPrice = 144;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case17() {
    //int[] cellPrice = { 83, 32, 67, -1, 37 };
    //int[] enterCell = { 2, 3, 4, 3, 1, 4, 0, 2, 4, 2, 3, 0, 0, 3, 0, 2, 2, 3, 0, 4, 3, 4, 1 };
    //int[] exitCell = { 0, 4, 4, 3, 1, 3, 1, 4, 4, 3, 2, 0, 4, 0, 0, 0, 0, 2, 2, 0, 0, 4, 3 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 0, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case18() {
    //int[] cellPrice = { 64, 44, -1, 100, -1, 98 };
    //int[] enterCell = { 5, 5, 2, 2, 2, 4, 2, 2, 2, 0, 0, 3, 0, 1, 3, 3, 5, 4, 2, 1, 4, 2, 5 };
    //int[] exitCell = { 4, 1, 4, 1, 5, 3, 5, 3, 5, 4, 4, 2, 2, 5, 2, 4, 2, 2, 5, 0, 0, 0, 3 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 44, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case19() {
    //int[] cellPrice = { 4, 77, 56, 61, 10, 52 };
    //int[] enterCell = { 0, 3, 4, 4, 2, 1, 1, 1, 0, 0, 4, 4, 3, 0, 2, 2, 3, 3, 5, 2, 2, 1, 5, 5, 4, 5, 1, 2, 2, 0, 1, 4, 5 };
    //int[] exitCell = { 0, 5, 4, 2, 0, 4, 2, 3, 1, 0, 5, 3, 0, 4, 4, 0, 3, 3, 0, 4, 2, 3, 3, 1, 1, 1, 2, 3, 1, 0, 1, 2, 0 };
    //int teleportPrice = 108;
    //assertArrayEquals(new int[] { 160, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case20() {
    //int[] cellPrice = { 78, 17, 16, 91, 22, 94, 19 };
    //int[] enterCell = { 4, 1, 3, 0, 3, 3, 2, 2, 0, 2, 3, 5, 6, 0, 0, 3, 5, 3, 0, 2, 5, 5, 1, 3, 4 };
    //int[] exitCell = { 1, 4, 6, 4, 1, 4, 4, 6, 1, 5, 1, 6, 5, 2, 0, 0, 1, 1, 2, 2, 2, 6, 2, 1, 5 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 1, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case21() {
    //int[] cellPrice = { 18, -1, 15, 22, 78, 27, 58 };
    //int[] enterCell = { 5, 1, 5, 6, 0, 2, 6, 6, 0, 4, 4, 1, 1, 5, 0, 2, 2, 5, 5, 5, 1, 2, 5, 3, 2, 6, 6, 0, 0, 0, 4, 6, 2, 0, 5, 4, 3, 2, 1, 0, 5, 4, 2, 4, 0, 6, 1, 0, 0, 0 };
    //int[] exitCell = { 1, 5, 5, 4, 5, 4, 2, 0, 4, 5, 1, 6, 5, 4, 3, 2, 4, 0, 6, 5, 4, 6, 1, 4, 5, 3, 1, 2, 6, 1, 6, 5, 4, 5, 3, 2, 6, 3, 3, 6, 3, 4, 2, 0, 6, 3, 1, 5, 1, 2 };
    //int teleportPrice = 160;
    //assertArrayEquals(new int[] { 160, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case22() {
    //int[] cellPrice = { 32, 12, 88, 4, 27, 98, 69, 6 };
    //int[] enterCell = { 0, 6, 3, 3, 6, 4, 0, 0, 2, 2, 4, 5, 6, 0, 5, 3, 3, 3, 2, 4, 4, 3, 0, 5, 3, 3, 2, 1, 3, 0, 1, 1, 7, 5, 5, 3, 1, 6, 2, 1, 5, 4, 7, 4, 6 };
    //int[] exitCell = { 1, 3, 0, 1, 4, 0, 1, 1, 7, 4, 6, 3, 7, 6, 6, 3, 4, 6, 0, 6, 2, 0, 7, 2, 6, 3, 6, 2, 5, 5, 0, 7, 2, 1, 3, 4, 6, 3, 6, 0, 5, 3, 0, 1, 6 };
    //int teleportPrice = 24;
    //assertArrayEquals(new int[] { 24, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case23() {
    //int[] cellPrice = { 62, 67, 89, 22, 37, -1, -1, -1 };
    //int[] enterCell = { 1, 7, 2, 0, 5, 4, 1, 4, 2, 1, 5, 5, 3, 7 };
    //int[] exitCell = { 0, 3, 2, 6, 7, 6, 5, 0, 1, 4, 1, 6, 0, 0 };
    //int teleportPrice = 105;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case24() {
    //int[] cellPrice = { 26, -1, -1, 88, 28, -1, -1, 30, 62 };
    //int[] enterCell = { 7, 7, 7 };
    //int[] exitCell = { 4, 6, 0 };
    //int teleportPrice = 48;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case25() {
    //int[] cellPrice = { 97, 63, 95, 16, 20, -1, 24, 50, -1 };
    //int[] enterCell = { 3, 2, 0, 0, 6, 3, 3, 3, 4, 4, 3, 3, 6, 0, 1, 4, 1, 5, 2, 3, 0, 0, 1, 2, 4, 3, 7, 0, 7, 0, 1, 8, 2, 0, 2, 5, 3, 2, 2, 6, 7, 2, 8 };
    //int[] exitCell = { 1, 4, 0, 5, 8, 0, 5, 0, 6, 6, 3, 5, 6, 0, 7, 2, 0, 3, 4, 8, 6, 1, 6, 5, 4, 8, 4, 4, 8, 7, 3, 5, 1, 0, 6, 5, 6, 6, 1, 3, 2, 1, 0 };
    //int teleportPrice = 400;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case26() {
    //int[] cellPrice = { 58, 60, -1, 9, 46, 1, 69, 37, 99, 22 };
    //int[] enterCell = { 5, 3, 1, 7, 3, 5, 6, 9, 4, 1, 6, 4, 1, 7, 8, 8, 0, 5, 8, 2, 2, 3, 1, 1, 6, 1, 3, 3, 4, 1, 8, 2, 7, 1, 5, 7, 1, 1, 2, 4, 0, 2, 6, 1, 0 };
    //int[] exitCell = { 6, 9, 8, 5, 5, 2, 7, 5, 7, 6, 4, 5, 7, 5, 1, 6, 3, 2, 0, 6, 9, 1, 9, 6, 8, 5, 6, 9, 8, 3, 0, 1, 1, 0, 6, 8, 2, 3, 0, 4, 7, 6, 7, 1, 1 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 1, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case27() {
    //int[] cellPrice = { 75, -1, 6, -1, 8, -1, 100, 25, 11, -1 };
    //int[] enterCell = { 2, 0, 7, 6, 4, 5, 4, 1, 8, 6, 0, 7, 2, 8, 6, 5, 2, 4, 5, 1 };
    //int[] exitCell = { 0, 0, 3, 2, 4, 8, 2, 1, 2, 4, 4, 1, 7, 9, 6, 1, 9, 6, 8, 7 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case28() {
    //int[] cellPrice = { 34, 19, 11, 60, 91, 40, 17, 50, -1, 83, 14 };
    //int[] enterCell = { 5, 0, 7, 7, 2, 10, 8, 2, 7, 1, 6, 9, 5, 10, 5, 2, 7, 2, 5, 10, 0, 2, 4, 0, 5, 5 };
    //int[] exitCell = { 2, 2, 4, 6, 7, 1, 8, 6, 0, 4, 6, 0, 7, 10, 3, 0, 2, 5, 6, 1, 2, 9, 1, 4, 10, 5 };
    //int teleportPrice = 320;
    //assertArrayEquals(new int[] { 364, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case29() {
    //int[] cellPrice = { 16, 42, 49, -1, 10, 29, 90, 68, 40, -1, 49 };
    //int[] enterCell = { 2, 10, 1, 0, 8, 1, 0, 0, 1 };
    //int[] exitCell = { 3, 1, 2, 4, 2, 2, 8, 2, 6 };
    //int teleportPrice = 20;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case30() {
    //int[] cellPrice = { 0, 32, 64, 84, 93, 22, 24, -1, 73, 31, 57, 4 };
    //int[] enterCell = { 5, 8, 0, 2, 9, 7, 0, 1, 3, 4, 5, 9, 2, 6, 9, 7, 1, 0, 4, 8, 5, 11, 0, 2, 2, 11, 4, 4, 7, 7, 8, 0 };
    //int[] exitCell = { 3, 0, 7, 8, 11, 9, 0, 7, 8, 4, 3, 10, 4, 6, 7, 10, 11, 3, 8, 0, 2, 0, 3, 2, 1, 2, 7, 11, 1, 8, 3, 11 };
    //int teleportPrice = 240;
    //assertArrayEquals(new int[] { 240, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case31() {
    //int[] cellPrice = { 17, 29, 82, 59, 98, 58, 24, 60, 69, 24, 23, 68 };
    //int[] enterCell = { 5, 2, 8, 2, 5, 2, 3, 0, 10, 7 };
    //int[] exitCell = { 2, 7, 1, 1, 11, 5, 2, 1, 8, 10 };
    //int teleportPrice = 18;
    //assertArrayEquals(new int[] { 139, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case32() {
    //int[] cellPrice = { 48, 15, 82, 1, 40, 77, 97, 5, 66, 86, 62, 60, 15 };
    //int[] enterCell = { 2, 10, 12, 9, 3, 5, 10, 3, 6, 11, 5, 12, 12, 7, 6, 4, 12, 4, 2, 10 };
    //int[] exitCell = { 11, 5, 9, 7, 1, 1, 0, 3, 4, 10, 3, 1, 1, 3, 8, 1, 12, 10, 0, 11 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 112, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case33() {
    //int[] cellPrice = { 13, 64, -1, 72, -1, 39, 18, -1, 11, -1, 42, 23, 90 };
    //int[] enterCell = { 1, 2, 10, 7, 3 };
    //int[] exitCell = { 12, 5, 6, 2, 9 };
    //int teleportPrice = 240;
    //assertArrayEquals(new int[] { 304, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case34() {
    //int[] cellPrice = { 85, 76, 26, 41, 38, -1, 38, 14, 95, 51, 84, -1, 67, 4 };
    //int[] enterCell = { 8, 11, 0, 0, 13, 10, 9, 2, 1, 7, 10, 11, 6, 8, 0, 3, 6, 3, 6, 12, 13 };
    //int[] exitCell = { 4, 12, 11, 6, 0, 2, 2, 13, 11, 0, 0, 6, 10, 13, 3, 3, 5, 9, 9, 5, 4 };
    //int teleportPrice = 42;
    //assertArrayEquals(new int[] { 111, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case35() {
    //int[] cellPrice = { 77, 72, 69, 49, 38, 1, 66, 94, -1, 45, 70, 35, 91, 4 };
    //int[] enterCell = { 0, 12, 3, 4, 2, 10, 6, 9, 2, 12, 13, 4, 12, 10, 13, 3, 4, 4, 12, 3, 1, 6, 4, 9, 1, 3, 8, 0, 1, 12, 3, 0, 13, 12, 5 };
    //int[] exitCell = { 13, 5, 5, 13, 6, 2, 7, 4, 1, 5, 10, 3, 9, 3, 11, 11, 10, 4, 13, 0, 4, 8, 4, 3, 5, 8, 5, 7, 3, 2, 10, 4, 5, 1, 2 };
    //int teleportPrice = 72;
    //assertArrayEquals(new int[] { 72, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case36() {
    //int[] cellPrice = { 97, 70, -1, 14, 36, 21, 29, 34, 74, 80, 93, 97, 74, 81, 75 };
    //int[] enterCell = { 10, 6, 8, 8, 8, 5, 11, 6, 5, 0, 10, 5, 8, 4 };
    //int[] exitCell = { 5, 4, 11, 10, 0, 1, 3, 12, 1, 8, 4, 8, 0, 3 };
    //int teleportPrice = 60;
    //assertArrayEquals(new int[] { 340, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case37() {
    //int[] cellPrice = { 7, 77, 12, 91, 85, 67, 68, 77, 33, 61, 65, 89, 27, 0, 61 };
    //int[] enterCell = { 6, 13, 12, 12, 8, 0, 0, 12, 11, 4, 12, 11, 5, 14, 7, 7, 4, 0, 3, 13, 1, 3, 13, 7, 2, 5, 6, 4, 6, 2, 4, 10, 2, 12, 0, 14, 6, 11, 8, 2, 0, 4, 10, 13, 2, 5, 14, 12, 8 };
    //int[] exitCell = { 5, 8, 2, 14, 10, 9, 0, 5, 3, 0, 2, 4, 7, 9, 4, 6, 1, 10, 11, 12, 12, 14, 11, 8, 10, 8, 1, 6, 14, 14, 13, 8, 5, 0, 0, 12, 9, 13, 1, 12, 6, 9, 6, 13, 6, 14, 13, 5, 3 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 1, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case38() {
    //int[] cellPrice = { 58, 53, 20, 23, 64, 83, 97, 33, 3, 56, 24, 28, 50, -1, 0, 83 };
    //int[] enterCell = { 12, 4, 9, 0, 4, 12, 13, 13, 3, 5, 15, 14, 10, 12, 10, 0, 9, 13, 5, 1, 5, 15 };
    //int[] exitCell = { 2, 8, 9, 14, 5, 7, 10, 8, 9, 3, 15, 13, 0, 4, 1, 0, 10, 8, 0, 3, 8, 12 };
    //int teleportPrice = 84;
    //assertArrayEquals(new int[] { 167, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case39() {
    //int[] cellPrice = { 93, -1, -1, 23, 25, 95, 43, -1, 30, 22, 4, -1, 21, -1, 79, 97 };
    //int[] enterCell = { 15, 5, 2, 12, 13, 1, 14 };
    //int[] exitCell = { 9, 6, 2, 0, 2, 7, 7 };
    //int teleportPrice = 300;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case40() {
    //int[] cellPrice = { 30, 95, 4, 57, 65, 62, 22, 51, 43, 100, 2, 43, 71, 8, 99, 37, 53 };
    //int[] enterCell = { 6, 0, 13, 1, 12, 0, 16, 6, 2, 9, 5, 7, 4, 1, 4, 14, 4, 14, 1, 0, 6, 6, 9, 8, 14, 4, 3, 6, 2, 2, 9, 3, 6, 2, 16, 8, 9 };
    //int[] exitCell = { 8, 3, 14, 2, 14, 12, 10, 8, 0, 15, 13, 1, 9, 8, 6, 3, 14, 16, 14, 11, 1, 3, 11, 16, 2, 2, 14, 1, 8, 5, 16, 2, 5, 7, 14, 2, 16 };
    //int teleportPrice = 360;
    //assertArrayEquals(new int[] { 545, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case41() {
    //int[] cellPrice = { 45, 20, 41, 78, 25, -1, 37, 16, 52, 93, 25, 23, 67, 65, 13, 13, 11 };
    //int[] enterCell = { 14, 13, 9, 3, 3, 12, 9, 1, 2, 11, 15 };
    //int[] exitCell = { 6, 11, 10, 2, 6, 1, 13, 3, 2, 4, 0 };
    //int teleportPrice = 32;
    //assertArrayEquals(new int[] { 317, 10 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case42() {
    //int[] cellPrice = { 35, -1, 14, 80, 96, -1, -1, 37, 44, 43, 85, 37, 98, 13, 95, 89, 1, 72 };
    //int[] enterCell = { 4, 10, 10, 0, 6, 9, 13, 10, 14, 3, 16, 2, 8, 11, 0 };
    //int[] exitCell = { 9, 13, 4, 13, 12, 1, 11, 10, 17, 14, 6, 9, 11, 16, 2 };
    //int teleportPrice = 24;
    //assertArrayEquals(new int[] { 144, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case43() {
    //int[] cellPrice = { 84, 43, -1, 90, 47, -1, -1, 98, 32, 16, 45, 91, 73, 40, -1, 91, 40, 58 };
    //int[] enterCell = { 15, 5, 6, 9 };
    //int[] exitCell = { 5, 6, 2, 6 };
    //int teleportPrice = 180;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case44() {
    //int[] cellPrice = { 20, 53, 20, 49, -1, 0, 80, 27, 47, 16, 66, -1, -1, -1, 6, -1, -1, 36, -1 };
    //int[] enterCell = { 15, 12, 1 };
    //int[] exitCell = { 13, 2, 14 };
    //int teleportPrice = 180;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case45() {
    //int[] cellPrice = { 28, 85, 91, 89, 77, 4, 46, 47, -1, 30, 50, 6, 40, -1, 13, 59, 1, 24, 61 };
    //int[] enterCell = { 6, 11, 14, 5, 10, 3, 4, 15, 7, 0, 6, 5, 10, 15, 7, 17, 0, 12, 11, 3, 18, 3, 6, 0, 11, 3, 7, 2, 18, 18, 2 };
    //int[] exitCell = { 18, 7, 5, 2, 0, 8, 0, 17, 7, 3, 5, 4, 0, 17, 16, 6, 11, 7, 7, 0, 3, 1, 5, 0, 17, 16, 14, 18, 17, 2, 5 };
    //int teleportPrice = 140;
    //assertArrayEquals(new int[] { 316, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case46() {
    //int[] cellPrice = { 5, 98, 87, 25, 67, 48, 26, 75, 33, 25, 71, 67, -1, 33, 21, 33, 57, 69, 84, -1 };
    //int[] enterCell = { 6, 2, 5, 0, 9, 6, 7, 7, 11, 14, 15, 6, 16, 12, 18, 15, 17, 11, 0, 11, 3, 15, 7, 0, 3, 9, 11, 19, 7 };
    //int[] exitCell = { 13, 10, 16, 6, 3, 9, 8, 4, 2, 1, 2, 0, 5, 19, 9, 3, 16, 16, 0, 18, 19, 10, 15, 6, 10, 11, 1, 17, 5 };
    //int teleportPrice = 60;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case47() {
    //int[] cellPrice = { 63, 54, 44, 94, 17, 4, 65, 14, 27, 77, 44, 51, -1, 74, 33, 91, 4, 44, 6, 58 };
    //int[] enterCell = { 16, 18, 19, 1, 1, 1, 8, 16, 8, 17, 3, 1, 3, 7, 15, 15, 12, 8, 15, 0, 13 };
    //int[] exitCell = { 1, 0, 5, 14, 9, 2, 0, 0, 7, 1, 4, 3, 17, 14, 12, 10, 14, 10, 15, 17, 7 };
    //int teleportPrice = 60;
    //assertArrayEquals(new int[] { 124, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case48() {
    //int[] cellPrice = { 48, 33, 40, 62, 36, 37, 38, 25, 73, 37, 8, 32, 82, 35, 15, 14, 65, 3, 24, 14, 91 };
    //int[] enterCell = { 3, 18, 13, 15, 19, 14, 3, 4, 16, 6, 19, 14, 0, 10, 20, 19, 4, 14, 13, 2, 20, 10, 14, 7, 14, 18, 1, 20, 18, 18, 8 };
    //int[] exitCell = { 9, 17, 3, 14, 14, 3, 9, 2, 4, 3, 9, 19, 3, 9, 15, 5, 14, 1, 6, 20, 4, 0, 8, 2, 11, 9, 20, 8, 0, 20, 12 };
    //int teleportPrice = 189;
    //assertArrayEquals(new int[] { 222, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case49() {
    //int[] cellPrice = { 100, 29, 20, -1, 52, 98, 2, 75, -1, -1, 88, -1, 62, 14, 19, 37, -1, -1, 61, -1, 0 };
    //int[] enterCell = { 14, 17, 11, 11, 7 };
    //int[] exitCell = { 2, 13, 5, 15, 17 };
    //int teleportPrice = 36;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case50() {
    //int[] cellPrice = { 26, 68, 80, 80, 88, 95, 72, 5, 54, 52, 21, 91, 89, 28, 39, 62, 92, 36, 65, 63, 40, 75 };
    //int[] enterCell = { 7, 2, 20, 2, 5, 15, 18, 11, 0, 13, 15, 8, 5, 3, 6, 14 };
    //int[] exitCell = { 5, 19, 14, 15, 7, 17, 15, 4, 8, 12, 4, 14, 12, 21, 10, 12 };
    //int teleportPrice = 45;
    //assertArrayEquals(new int[] { 273, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case51() {
    //int[] cellPrice = { 32, 25, 14, 23, 91, 95, 27, 56, 29, 66, 92, 20, 76, 68, 18, 7, 31, 78, 20, 51, 88, 11 };
    //int[] enterCell = { 15, 1, 2, 19, 1, 2, 12, 11, 3, 7, 15, 19, 5, 9, 3, 7, 6, 17, 10, 9, 9, 6, 16, 9, 3, 20, 4, 13, 18, 9, 12, 14, 21, 10, 21, 6, 7, 4, 19, 19, 2, 21, 14, 16, 0, 3, 12, 4, 14 };
    //int[] exitCell = { 15, 9, 12, 4, 17, 21, 17, 8, 7, 21, 12, 6, 9, 18, 20, 4, 20, 20, 20, 7, 1, 10, 9, 20, 12, 16, 21, 11, 10, 21, 10, 9, 2, 10, 14, 4, 20, 14, 8, 1, 2, 8, 21, 6, 8, 16, 14, 3, 11 };
    //int teleportPrice = 540;
    //assertArrayEquals(new int[] { 579, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case52() {
    //int[] cellPrice = { 53, 94, 94, 28, 94, 7, 70, 72, 33, 91, 82, 44, 42, 36, 43, 32, 14, 16, 39, 71, 96, 26, 96 };
    //int[] enterCell = { 4, 6, 21, 15, 12, 10, 17, 3, 13, 20, 13, 22, 20, 10, 3, 22 };
    //int[] exitCell = { 10, 13, 18, 12, 12, 15, 19, 13, 12, 9, 0, 11, 10, 2, 19, 22 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 434, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case53() {
    //int[] cellPrice = { 85, 28, 82, -1, 0, 6, 72, 7, 61, 17, 5, 44, 1, 8, 55, 22, 76, 60, 44, 98, -1, 92, 36 };
    //int[] enterCell = { 22, 17, 19, 19, 14, 14, 13, 15, 20, 16, 6, 3, 18, 0, 5, 16, 20, 20, 4, 2, 7, 19, 5, 15, 16, 11, 22, 6, 9, 7, 18, 9, 16, 2, 4, 4, 22, 17, 4, 2 };
    //int[] exitCell = { 15, 5, 22, 10, 16, 19, 14, 10, 2, 19, 0, 8, 12, 10, 4, 19, 2, 14, 3, 15, 20, 14, 8, 2, 11, 3, 10, 3, 10, 18, 7, 17, 3, 8, 12, 17, 5, 22, 11, 22 };
    //int teleportPrice = 180;
    //assertArrayEquals(new int[] { 290, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case54() {
    //int[] cellPrice = { 5, -1, 98, -1, -1, 88, -1, -1, -1, 61, 100, -1, -1, 36, -1, 68, 58, -1, 72, -1, 73, 79, -1, 71 };
    //int[] enterCell = { 19, 22 };
    //int[] exitCell = { 10, 3 };
    //int teleportPrice = 600;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case55() {
    //int[] cellPrice = { 34, 10, 9, 69, 22, -1, 63, 39, 19, 37, 14, 28, 97, 7, 61, 13, 39, 73, 71, 86, 17, 18, 67, 13 };
    //int[] enterCell = { 15, 16, 4, 6, 1, 14, 17, 13, 23, 18, 3, 1, 14 };
    //int[] exitCell = { 4, 4, 7, 7, 11, 16, 22, 3, 16, 4, 6, 0, 19 };
    //int teleportPrice = 216;
    //assertArrayEquals(new int[] { 723, 10 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case56() {
    //int[] cellPrice = { 35, 70, -1, 42, 26, 11, 59, 21, 73, 43, 21, 32, 35, 49, 96, 51, -1, 72, 26, 25, 9, 57, 20, 93, 23 };
    //int[] enterCell = { 2, 11, 11, 2, 20, 8, 11, 13, 10, 1, 18, 23, 19, 15, 24, 18, 21, 4, 4, 1, 0, 24, 12, 19, 14, 17, 2, 14, 7, 18, 10, 16, 9, 11, 16, 7, 1, 10 };
    //int[] exitCell = { 2, 24, 4, 2, 24, 15, 9, 19, 7, 4, 9, 15, 3, 9, 13, 6, 2, 8, 9, 20, 14, 5, 20, 20, 19, 13, 3, 23, 11, 2, 7, 23, 21, 7, 4, 23, 22, 3 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 6, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case57() {
    //int[] cellPrice = { 50, 4, 8, 6, 43, 99, 45, 68, 35, 98, 45, 19, 64, 18, 71, 4, 43, -1, 32, -1, 97, 76, 45, 70, 53 };
    //int[] enterCell = { 11, 7, 14, 6, 12, 11, 17, 4, 14, 3 };
    //int[] exitCell = { 13, 20, 1, 23, 17, 6, 9, 19, 7, 23 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 71, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case58() {
    //int[] cellPrice = { 3, 92, -1, 62, 93, -1, 30, 77, 97, 71, 46, -1, 82, -1, 17, 98, 40, 0, 37, 34, 94, 2, 98, 36, 82, 46 };
    //int[] enterCell = { 15, 4, 16, 6, 15, 21, 11, 14, 14, 12, 9, 23 };
    //int[] exitCell = { 5, 14, 22, 21, 6, 19, 8, 2, 9, 1, 23, 2 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case59() {
    //int[] cellPrice = { 66, 7, 70, 57, 53, 9, 75, 70, 38, 82, 52, 72, 28, 49, 57, 22, 60, -1, 57, 99, 23, 96, 92, 22, 3, 94 };
    //int[] enterCell = { 20, 25, 13, 1, 21, 11, 10, 23, 7, 11, 20, 2, 22, 14, 9, 16, 1, 14, 15, 19, 22, 14, 20, 9, 18 };
    //int[] exitCell = { 4, 25, 8, 3, 4, 2, 21, 9, 0, 10, 17, 11, 18, 20, 0, 1, 25, 9, 5, 14, 9, 8, 20, 25, 3 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 7, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case60() {
    //int[] cellPrice = { 9, 21, 41, 10, 53, 42, 92, 14, 96, 99, 49, 32, 54, 69, 66, 29, 80, 36, 49, 10, 9, 80, 70, 1, 43, 99, 20 };
    //int[] enterCell = { 14, 21, 21, 17, 16, 17, 17, 6, 6, 7, 22, 4, 3, 2, 23, 5, 10, 9, 18, 24, 21, 24, 14, 7, 12, 21, 5, 20, 19, 3, 18, 9, 6, 17, 0, 16, 15, 10, 0, 25, 14, 14, 4, 22, 23, 6 };
    //int[] exitCell = { 13, 2, 24, 15, 8, 20, 0, 5, 7, 16, 5, 25, 20, 14, 23, 23, 17, 26, 4, 8, 14, 21, 10, 23, 5, 9, 6, 23, 13, 15, 4, 12, 5, 16, 10, 24, 8, 8, 19, 20, 5, 11, 19, 8, 2, 25 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 21, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case61() {
    //int[] cellPrice = { 92, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    //int[] enterCell = { 10 };
    //int[] exitCell = { 17 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case62() {
    //int[] cellPrice = { 78, 18, 79, 48, 92, 60, -1, 44, -1, 62, 41, 59, 97, 8, 0, 17, 91, 5, -1, 73, 2, 65, 15, 64, 0, 75, 91, 42 };
    //int[] enterCell = { 13, 14, 15, 3, 15, 25, 16, 2, 23, 26, 24, 7, 26, 16, 5, 24, 19, 3, 26, 11, 24, 5, 8, 19, 26, 14, 27, 13, 5, 16 };
    //int[] exitCell = { 21, 6, 2, 26, 7, 9, 25, 24, 3, 3, 9, 20, 14, 2, 10, 16, 10, 23, 14, 0, 11, 27, 23, 21, 26, 0, 20, 19, 2, 23 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 149, 8 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case63() {
    //int[] cellPrice = { 49, 23, 75, 43, 67, 31, 40, 59, 86, 54, 37, 75, -1, 66, 29, 96, 21, 16, 18, 64, 41, 95, -1, 42, 11, 30, -1, 52 };
    //int[] enterCell = { 3, 18, 25, 22, 11, 6, 6, 26, 9, 15, 16, 24, 4, 22, 24, 2, 18, 20, 4, 21, 22, 0, 12, 6, 19, 26, 15, 19, 22, 19, 18, 26, 8, 24, 21, 10, 10, 24, 27, 16 };
    //int[] exitCell = { 22, 2, 21, 7, 10, 18, 10, 14, 26, 23, 9, 14, 1, 21, 26, 16, 4, 8, 10, 0, 17, 0, 5, 12, 2, 10, 21, 18, 12, 7, 17, 11, 9, 4, 11, 20, 16, 22, 18, 7 };
    //int teleportPrice = 80;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case64() {
    //int[] cellPrice = { 62, 0, 14, 60, -1, 24, 53, 18, 38, 31, 12, -1, -1, 12, 16, 8, 90, 11, 35, 51, 3, 19, 42, 83, 29, 46, 32, -1, 69 };
    //int[] enterCell = { 11, 20, 14, 21, 16, 3, 11, 13, 24, 6 };
    //int[] exitCell = { 10, 18, 26, 1, 22, 8, 4, 19, 9, 24 };
    //int teleportPrice = 128;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case65() {
    //int[] cellPrice = { 51, 99, 26, 71, 67, 83, 5, 26, 34, 31, 1, 75, 93, 47, -1, 86, 71, 69, 86, 7, 37, -1, 45, -1, 50, 57, 78, 18, 66 };
    //int[] enterCell = { 18, 19, 20, 13, 23, 12 };
    //int[] exitCell = { 8, 10, 3, 3, 13, 13 };
    //int teleportPrice = 225;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case66() {
    //int[] cellPrice = { 93, 100, 96, 13, 2, 37, 69, 27, 33, 52, 40, 58, 91, 14, -1, 67, 1, 82, 78, 21, -1, 69, 97, 92, 65, 17, -1, 96, 27, 29 };
    //int[] enterCell = { 13, 17, 14, 27, 3, 20, 2, 9, 4, 25, 16, 16, 21, 14, 3, 16, 22, 9, 26, 1, 5, 8, 8, 3, 28, 21 };
    //int[] exitCell = { 4, 22, 14, 26, 8, 11, 9, 8, 0, 17, 7, 10, 22, 9, 23, 0, 12, 10, 18, 11, 4, 8, 20, 29, 13, 22 };
    //int teleportPrice = 630;
    //assertArrayEquals(new int[] { 839, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case67() {
    //int[] cellPrice = { 77, 97, -1, 71, 92, 90, 58, 6, -1, 64, 91, -1, 52, -1, 59, 91, 98, 30, 57, 37, 9, -1, 69, 22, 70, -1, 4, 37, 3, 77 };
    //int[] enterCell = { 20, 13, 8, 27, 7, 25 };
    //int[] exitCell = { 16, 3, 25, 9, 22, 8 };
    //int teleportPrice = 280;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case68() {
    //int[] cellPrice = { 57, 64, 21, 0, -1, 17, 63, 31, 79, 96, 26, 50, 19, 45, 98, 58, 25, 46, 72, 30, 49, 4, -1, 78, 27, 100, 85, 65, 85, 54, 72 };
    //int[] enterCell = { 7, 23, 20, 27, 17, 19, 19, 18, 25, 8, 11, 2, 21, 26, 2, 14, 26, 13, 24, 7, 11, 5 };
    //int[] exitCell = { 15, 27, 2, 0, 14, 5, 10, 22, 7, 10, 1, 3, 2, 9, 24, 6, 8, 27, 14, 28, 28, 16 };
    //int teleportPrice = 280;
    //assertArrayEquals(new int[] { 826, 9 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case69() {
    //int[] cellPrice = { 45, -1, 60, 35, 57, 77, 24, 76, 93, -1, 64, 30, 89, -1, -1, 25, 7, 80, -1, 0, 21, 16, 87, -1, 43, 14, 91, 18, 93, 25, 64 };
    //int[] enterCell = { 26, 8, 9, 29, 20, 24, 23, 7, 10, 25, 3, 4, 11, 1, 26, 26, 3, 29, 30 };
    //int[] exitCell = { 18, 8, 5, 14, 15, 16, 30, 13, 19, 4, 12, 15, 0, 21, 10, 21, 28, 24, 12 };
    //int teleportPrice = 112;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case70() {
    //int[] cellPrice = { 93, 27, 42, -1, 12, 80, 86, 49, -1, -1, -1, 48, 44, 100, 99, 81, 70, 71, -1, 56, -1, 33, 89, -1, 83, 40, -1, 30, -1, 84, 43, 82 };
    //int[] enterCell = { 29, 18, 4, 9, 26, 27 };
    //int[] exitCell = { 10, 23, 21, 26, 28, 23 };
    //int teleportPrice = 75;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case71() {
    //int[] cellPrice = { 74, 81, 77, 7, 3, 0, 89, -1, 97, 39, 37, 97, 10, 41, 75, 22, 42, 92, 15, 66, 54, 47, 86, 4, 18, 96, 13, 13, 12, -1, 3, 25 };
    //int[] enterCell = { 1, 24, 5, 20, 15, 21, 15, 9, 22, 19, 0, 30, 9, 5, 9, 8, 25, 10, 29, 2, 6, 17, 0, 16, 20, 27, 29, 3, 1, 3, 23, 29, 22, 28, 3, 21 };
    //int[] exitCell = { 29, 27, 20, 29, 18, 21, 23, 2, 28, 9, 0, 20, 30, 1, 4, 7, 9, 21, 9, 24, 21, 16, 27, 20, 16, 23, 0, 22, 21, 8, 14, 15, 0, 31, 27, 11 };
    //int teleportPrice = 512;
    //assertArrayEquals(new int[] { 1037, 3 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case72() {
    //int[] cellPrice = { 52, 91, 48, 9, 52, 31, 74, 16, 32, 68, 20, 64, 70, 3, 25, 47, 81, 95, 26, 20, 98, 35, 17, 75, 63, 93, 57, 94, 93, 47, 75, 65, 98 };
    //int[] enterCell = { 4, 4, 25, 25, 17, 7, 25, 0, 10, 1, 14, 22, 2, 20, 6, 26, 30, 7, 7, 19, 21, 6, 0, 1, 14, 5, 1, 25, 18, 12, 15, 17, 27, 9, 32, 1, 24, 18, 15, 7, 2, 2 };
    //int[] exitCell = { 19, 6, 0, 24, 29, 14, 26, 32, 1, 29, 11, 18, 30, 14, 10, 26, 30, 2, 7, 12, 23, 27, 12, 3, 18, 9, 2, 12, 0, 24, 9, 20, 31, 11, 5, 1, 31, 1, 7, 31, 17, 28 };
    //int teleportPrice = 36;
    //assertArrayEquals(new int[] { 36, 1 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case73() {
    //int[] cellPrice = { 9, 71, 84, 23, 96, 11, 9, 65, 36, 47, 4, 36, -1, 9, 34, 65, 17, 32, -1, 74, 55, 99, 62, 27, 75, 43, 85, 47, 33, 74, 57, 13, 12 };
    //int[] enterCell = { 27, 6, 13, 32, 18, 1, 23, 3, 4, 30, 21 };
    //int[] exitCell = { 9, 2, 24, 25, 29, 13, 24, 25, 31, 16, 24 };
    //int teleportPrice = 42;
    //assertArrayEquals(new int[] { 328, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case74() {
    //int[] cellPrice = { 80, 33, 38, 83, 88, 31, -1, 33, 24, 20, 7, 35, 89, -1, 47, 87, -1, -1, 25, 24, 48, 50, 77, 58, 39, 48, 22, 10, 7, 65, 93, 55, 41, 40 };
    //int[] enterCell = { 32, 1, 8, 3, 1, 15, 11, 28, 22, 2, 12, 4, 27, 27, 6, 5, 20, 25, 28, 24, 5, 8, 10, 6, 28, 16, 16 };
    //int[] exitCell = { 4, 23, 15, 23, 7, 1, 9, 14, 26, 12, 16, 19, 29, 17, 28, 10, 8, 15, 25, 24, 31, 18, 10, 30, 18, 26, 16 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 352, 10 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case75() {
    //int[] cellPrice = { 15, 81, -1, 10, 13, 31, 93, 37, 26, 99, 7, 32, 87, 65, -1, 97, 98, 33, 1, -1, -1, 52, 10, 50, 65, 41, 76, -1, 91, 21, 84, 76, 82, 91 };
    //int[] enterCell = { 31, 33, 12, 10, 23, 11 };
    //int[] exitCell = { 10, 2, 31, 2, 21, 33 };
    //int teleportPrice = 16;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case76() {
    //int[] cellPrice = { 60, 89, 71, 75, 26, 87, 55, 65, 6, 34, 75, 66, 96, 0, 21, 74, 20, 7, 47, 23, 45, 18, -1, 56, 86, 50, 96, 31, 82, 21, 47, 99, 67, 66, 9 };
    //int[] enterCell = { 31, 26, 34, 30, 23, 1, 8, 15, 2, 13, 5, 1, 13, 23, 20, 8, 28, 20, 19, 26, 5, 15, 0, 14, 34, 30, 17, 29, 31, 24, 33, 26, 30, 14, 10, 0, 14, 7, 30, 19, 0, 23, 22, 11, 33, 34, 34, 20, 24 };
    //int[] exitCell = { 33, 24, 5, 2, 21, 20, 21, 19, 4, 3, 7, 13, 22, 11, 28, 26, 22, 34, 19, 31, 7, 6, 28, 7, 11, 8, 34, 29, 26, 18, 20, 19, 1, 3, 20, 10, 6, 25, 16, 33, 9, 33, 20, 32, 5, 24, 20, 28, 34 };
    //int teleportPrice = 224;
    //assertArrayEquals(new int[] { 533, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case77() {
    //int[] cellPrice = { 45, 75, 9, 79, 32, 44, 66, -1, 8, 37, 20, 94, 36, 81, 0, 56, 33, 29, 93, 94, 61, 62, -1, 83, 18, 21, 59, 11, 38, 48, 8, 66, -1, 85, 17 };
    //int[] enterCell = { 27, 11, 31, 6, 30, 10, 30, 17, 19, 1, 12, 31, 14, 16, 9, 5, 33, 11, 5, 7, 12, 34, 26, 6, 16, 4, 10, 24, 23, 1, 27, 9, 1, 1, 2, 30, 28 };
    //int[] exitCell = { 27, 17, 11, 13, 8, 26, 29, 2, 12, 9, 27, 20, 17, 25, 16, 27, 11, 33, 34, 8, 34, 15, 23, 14, 8, 26, 13, 19, 7, 9, 6, 14, 14, 10, 4, 1, 7 };
    //int teleportPrice = 36;
    //assertArrayEquals(new int[] { 201, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case78() {
    //int[] cellPrice = { 54, 62, 86, 95, 94, 30, 51, 92, 51, 71, 76, 92, 24, 12, -1, 99, -1, 70, 65, -1, 86, 31, 82, 75, 54, 86, 0, 36, 12, 77, 50, 46, 86, 53, 50, 37 };
    //int[] enterCell = { 8, 11, 19, 6, 4, 7, 14, 33, 6 };
    //int[] exitCell = { 18, 3, 26, 23, 17, 32, 10, 24, 0 };
    //int teleportPrice = 144;
    //assertArrayEquals(new int[] { 794, 11 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case79() {
    //int[] cellPrice = { 15, 58, 93, 98, 20, 86, 56, 2, 13, 41, 8, 62, 16, 37, 42, 8, 72, 30, 26, 55, 16, 89, 91, 46, 79, 100, 46, 3, 88, 36, 78, 1, 99, 24, 47, 59 };
    //int[] enterCell = { 6, 9, 12, 5, 35, 13, 1, 10, 10, 15, 32, 10, 30, 25, 33, 19, 17, 12, 8, 35, 5, 25, 23, 27, 31, 23, 32, 13, 18, 20, 16, 3, 29, 5, 23, 17, 17, 10 };
    //int[] exitCell = { 26, 20, 17, 18, 24, 28, 22, 24, 34, 23, 25, 34, 9, 35, 30, 17, 14, 34, 11, 26, 24, 12, 26, 3, 27, 1, 12, 29, 24, 35, 6, 12, 20, 22, 32, 3, 6, 30 };
    //int teleportPrice = 84;
    //assertArrayEquals(new int[] { 332, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case80() {
    //int[] cellPrice = { 35, 14, 86, 41, 73, -1, 49, 52, 17, 12, 46, -1, 8, 34, -1, -1, 69, -1, 57, -1, 59, 35, 87, -1, 10, 77, -1, 8, 18, -1, 89, 33, -1, 86, 19, 23, 17 };
    //int[] enterCell = { 19, 19, 15, 26 };
    //int[] exitCell = { 26, 28, 4, 22 };
    //int teleportPrice = 180;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case81() {
    //int[] cellPrice = { 8, 38, 20, 16, 87, 82, 96, 27, 81, 53, 13, 95, 84, 95, -1, 39, 4, 28, 0, 58, 71, 47, 57, 93, 21, 77, 84, 15, 98, 85, 52, 36, 82, 92, 1, 86, 87 };
    //int[] enterCell = { 19, 12, 5, 33, 23, 5, 19, 19, 15, 30, 0, 6, 13, 22, 32, 20, 9, 25, 14, 0, 10, 2, 35, 19, 33, 17, 5, 27, 32, 6, 17, 31 };
    //int[] exitCell = { 32, 18, 10, 3, 7, 26, 11, 19, 35, 21, 18, 13, 36, 32, 27, 27, 2, 32, 36, 13, 22, 11, 4, 15, 28, 36, 16, 32, 23, 4, 6, 16 };
    //int teleportPrice = 140;
    //assertArrayEquals(new int[] { 281, 2 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case82() {
    //int[] cellPrice = { 9, 63, 63, 95, 34, 58, 73, 28, 29, -1, 0, 6, 97, 81, -1, 80, 30, 92, -1, 71, 100, 69, 62, 72, 31, 73, -1, 35, 26, 40, 17, 21, 5, 82, 80, 50, 8, 66 };
    //int[] enterCell = { 29, 10, 11, 4, 26, 25, 8, 25, 10, 19, 29, 1, 22, 35, 33, 23, 25, 36, 15, 0, 29, 25, 37, 14, 28, 4, 32, 5, 7, 19, 32, 30, 35 };
    //int[] exitCell = { 2, 8, 34, 15, 26, 15, 13, 2, 10, 27, 26, 35, 34, 31, 2, 32, 27, 29, 23, 34, 15, 7, 30, 1, 23, 35, 17, 19, 30, 4, 24, 9, 26 };
    //int teleportPrice = 112;
    //assertArrayEquals(new int[] { 236, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case83() {
    //int[] cellPrice = { 55, 63, 47, -1, 58, 91, 30, -1, 77, 30, 87, 71, 63, -1, -1, -1, -1, -1, -1, 99, -1, 63, 29, 42, -1, 68, 78, -1, -1, 22, -1, 77, 6, -1, -1, -1, -1, -1 };
    //int[] enterCell = { 27, 30 };
    //int[] exitCell = { 36, 9 };
    //int teleportPrice = 450;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case84() {
    //int[] cellPrice = { 38, 84, 71, 65, 9, 77, 6, 97, 47, 30, 96, 46, 52, 81, 43, 19, 38, 41, 11, 92, 39, 31, 16, 6, 43, 34, 22, 92, 75, 69, 39, 15, 43, 90, 10, 38, 63, 89, 73 };
    //int[] enterCell = { 7, 35, 22, 12, 13, 6, 25, 2, 1, 11, 11, 2, 32, 35, 26, 4, 38, 15, 1, 25, 9, 18, 15, 34, 27, 30, 33, 38, 7, 8, 38, 3, 10, 5, 23, 29, 6, 1, 2, 25, 25, 32, 0, 34, 29, 2, 38, 4, 1, 38 };
    //int[] exitCell = { 7, 37, 13, 22, 18, 29, 30, 9, 19, 24, 31, 15, 16, 9, 26, 10, 27, 20, 32, 16, 11, 13, 23, 11, 31, 35, 27, 28, 25, 16, 21, 6, 20, 24, 10, 32, 37, 21, 25, 18, 13, 38, 27, 16, 37, 14, 35, 36, 9, 10 };
    //int teleportPrice = 400;
    //assertArrayEquals(new int[] { 785, 8 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case85() {
    //int[] cellPrice = { 37, 77, 10, 31, 9, 3, 39, 84, 31, 35, 14, 47, 57, 26, 13, 14, 99, 40, 31, 1, 40, 26, 27, -1, 19, 30, -1, 42, 81, 43, 79, 2, 60, 92, 14, 40, 78, 94, 96 };
    //int[] enterCell = { 6, 22, 35, 2, 30, 8, 36, 8, 21, 7, 22, 27, 36, 9, 5, 4, 29, 11, 0, 20, 7, 9, 22, 14, 17, 32, 37, 17, 7, 3, 33, 37, 32, 36, 15, 9, 20, 15 };
    //int[] exitCell = { 14, 15, 28, 3, 16, 18, 7, 13, 28, 34, 9, 11, 31, 31, 32, 30, 9, 0, 11, 21, 3, 15, 13, 12, 15, 7, 27, 36, 2, 32, 2, 8, 31, 16, 29, 11, 15, 26 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 313, 9 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case86() {
    //int[] cellPrice = { 96, 9, 26, 46, 24, 67, 51, 2, 1, 96, 19, 24, 21, 24, 79, 5, 37, -1, 68, 63, 8, 16, 61, 19, 93, 53, 53, 81, 52, 81, 87, 32, 52, 64, 87, -1, 43, 61, 41, 39 };
    //int[] enterCell = { 9, 29, 25, 38, 22, 35, 6, 37, 19, 7, 30, 39, 34, 38, 39, 26, 29, 9, 20, 0, 9, 21, 24, 13, 8, 12, 4, 14, 28, 10, 2, 4, 33 };
    //int[] exitCell = { 11, 27, 26, 34, 35, 39, 35, 15, 6, 3, 16, 14, 33, 24, 9, 15, 32, 9, 9, 12, 26, 4, 31, 32, 34, 37, 2, 31, 39, 0, 4, 23, 6 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] { 81, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case87() {
    //int[] cellPrice = { 50, 52, 92, 35, 23, 47, 30, -1, 3, 82, 45, 75, 18, 39, 40, 96, 76, 52, 87, -1, 62, 55, 88, 4, 85, 80, 6, 81, 25, -1, 76, 81, 15, 62, 15, 52, 50, 83, 39, 26 };
    //int[] enterCell = { 6, 31, 12, 29, 13, 17, 5, 11, 35, 23, 28, 23, 0, 23, 12, 34, 39, 3, 2, 28, 21, 20, 33, 36, 0, 39, 15, 16, 10, 37, 7 };
    //int[] exitCell = { 5, 14, 7, 17, 25, 34, 18, 15, 7, 13, 15, 9, 28, 35, 38, 11, 16, 14, 36, 21, 22, 24, 34, 3, 7, 15, 9, 39, 3, 24, 2 };
    //int teleportPrice = 21;
    //assertArrayEquals(new int[] { 142, 4 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case88() {
    //int[] cellPrice = { 0, 60, 87, 93, -1, 14, 25, 64, 45, 97, 27, 60, 20, 6, 78, 85, 83, 17, -1, 21, 48, 18, 37, 87, 15, 88, 25, 76, 52, -1, 87, 15, 23, 75, 83, 35, 44, 87, 23, 13, 51 };
    //int[] enterCell = { 29, 1, 30, 22, 20, 32, 8, 23, 3, 5, 27, 29, 29, 2, 27, 16, 28, 39 };
    //int[] exitCell = { 36, 31, 30, 10, 22, 8, 13, 29, 36, 1, 34, 8, 7, 36, 2, 13, 7, 29 };
    //int teleportPrice = 126;
    //assertArrayEquals(new int[] { 447, 7 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case89() {
    //int[] cellPrice = { 64, 82, 18, 87, 78, 94, 5, 31, 5, 74, 37, 61, 13, 0, 61, 65, -1, -1, 48, 13, 89, 36, 19, 42, 17, 38, 57, 80, 73, 38, 74, 83, 40, 41, 23, 63, 88, 56, 60, 98, -1 };
    //int[] enterCell = { 4, 10, 35, 37, 20, 21, 20, 18, 25, 36, 38, 23, 2, 34, 37, 16, 25, 15, 36 };
    //int[] exitCell = { 40, 26, 39, 1, 13, 0, 13, 32, 16, 27, 33, 25, 22, 6, 38, 18, 27, 33, 2 };
    //int teleportPrice = 252;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case90() {
    //int[] cellPrice = { 99, 38, -1, -1, 65, 49, 20, -1, 98, 61, 21, 84, 15, -1, -1, 54, -1, -1, 17, 64, 49, -1, -1, -1, 25, 58, 93, 50, -1, 60, 31, 37, -1, 87, 71, -1, 66, 27, 4, 56, -1, 91 };
    //int[] enterCell = { 26, 39, 32 };
    //int[] exitCell = { 21, 32, 39 };
    //int teleportPrice = 0;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case91() {
    //int[] cellPrice = { 76, 4, 53, -1, -1, 63, 12, 70, 13, 84, -1, 96, 0, 94, 20, -1, 74, 24, 85, 25, 45, 18, 75, 10, 44, -1, 49, 87, 56, 45, 11, 52, -1, 13, 80, 52, 85, 50, 52, 47, 20, 43 };
    //int[] enterCell = { 2, 33, 38, 16, 8, 23 };
    //int[] exitCell = { 24, 6, 24, 15, 10, 9 };
    //int teleportPrice = 35;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case92() {
    //int[] cellPrice = { 80, 77, 63, 23, 43, 29, 66, 0, 81, 16, 15, 87, 50, 14, 96, -1, 22, 47, 60, 13, 27, 21, 46, 90, 39, 90, 23, 65, 26, 7, 27, -1, 30, 17, 48, -1, 14, 61, 92, 87, 80, 63, 82 };
    //int[] enterCell = { 19, 41, 17, 14, 42, 12, 28, 39, 21, 22, 12, 20, 40, 19, 14, 33, 13, 38 };
    //int[] exitCell = { 40, 36, 35, 13, 22, 1, 12, 42, 31, 37, 14, 40, 35, 17, 37, 18, 27, 41 };
    //int teleportPrice = 70;
    //assertArrayEquals(new int[] { 937, 17 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case93() {
    //int[] cellPrice = { 98, 5, 72, 67, 14, 84, 73, 15, 89, -1, 14, 10, 2, 59, 23, 13, 70, 77, -1, 84, 57, 52, 60, 40, 64, 65, 56, 38, 31, 74, 15, 47, 77, 19, 44, 69, -1, 79, 67, 97, 41, 36, 91 };
    //int[] enterCell = { 12, 9, 39, 29, 4, 3, 37, 34, 40, 13, 41, 10, 18, 8, 3, 16, 2, 7, 4, 9, 28, 30, 37 };
    //int[] exitCell = { 26, 21, 31, 1, 30, 2, 13, 42, 7, 19, 24, 27, 21, 24, 24, 2, 7, 8, 30, 39, 17, 25, 11 };
    //int teleportPrice = 150;
    //assertArrayEquals(new int[] { 646, 10 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case94() {
    //int[] cellPrice = { 52, -1, 54, 58, 4, 20, 76, 85, 42, 26, 57, 26, 62, 30, 19, 41, 0, 27, 46, 10, 57, 81, 7, 27, -1, 31, 89, 64, 48, 91, 75, 26, 81, 78, 61, 36, 37, 8, 53, 99, 17, 58, 26, 79 };
    //int[] enterCell = { 29, 15, 19, 9, 37, 21, 10, 29, 18, 41, 14, 1, 28, 42, 20, 1, 22, 41, 1, 1, 12, 40, 38, 37, 33, 43, 41, 10, 7, 38, 19, 14, 28, 24, 19, 24, 26, 8, 21, 12, 25, 39, 18, 3, 6 };
    //int[] exitCell = { 37, 15, 30, 31, 27, 32, 31, 10, 32, 8, 25, 16, 10, 41, 41, 11, 27, 13, 8, 2, 17, 2, 15, 11, 43, 26, 41, 9, 13, 20, 16, 11, 14, 1, 15, 0, 39, 14, 30, 41, 15, 41, 30, 16, 25 };
    //int teleportPrice = 180;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case95() {
    //int[] cellPrice = { 81, 27, 92, 50, 87, 65, 16, 79, 15, 86, 22, 73, 52, 72, 16, 23, 52, -1, 83, 6, 37, 11, 34, -1, 52, 70, 82, 25, 21, -1, 66, 99, 19, 10, 30, 85, 22, 13, 55, -1, -1, 97, 61, 62 };
    //int[] enterCell = { 34, 15, 4, 24, 21, 5, 33, 37, 33, 17, 5, 30, 10, 8, 12, 33, 22, 36, 31, 13, 12, 21, 14, 12, 42, 34, 15, 34, 36, 14, 27, 5, 42 };
    //int[] exitCell = { 19, 13, 18, 20, 5, 28, 33, 8, 28, 32, 29, 24, 6, 32, 22, 20, 2, 38, 26, 26, 32, 19, 29, 28, 24, 21, 12, 2, 12, 42, 13, 29, 24 };
    //int teleportPrice = 90;
    //assertArrayEquals(new int[] { 697, 11 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case96() {
    //int[] cellPrice = { 16, 95, 38, -1, 39, 35, 72, 75, 63, 36, 24, 25, 72, 43, 47, 8, 74, 46, 55, 21, 8, 14, 58, 36, 49, 0, 70, 95, 10, 39, 15, 24, 83, 59, 14, 54, 4, 29, 37, 17, 69, 96, 5, 93, 55 };
    //int[] enterCell = { 18, 29, 16, 21, 35, 5, 22, 44, 14, 2, 33, 0, 23, 3, 26, 40, 0, 1, 4, 1, 5, 23, 8, 22, 43, 3, 30, 16, 15, 36, 37 };
    //int[] exitCell = { 33, 13, 15, 12, 4, 42, 37, 40, 15, 3, 2, 25, 10, 37, 26, 11, 20, 6, 14, 30, 20, 4, 23, 20, 26, 39, 18, 29, 40, 32, 9 };
    //int teleportPrice = 96;
    //assertArrayEquals(new int[] { 471, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case97() {
    //int[] cellPrice = { 78, 42, 83, 17, 11, -1, 26, 48, 27, 21, 69, 17, 21, 85, 29, 34, 41, 75, 36, 73, 59, 19, 7, 10, 23, 95, 84, 83, 53, 63, 69, 88, 71, 82, 29, 89, 10, 95, 94, 48, 72, 96, 85, 31, 17 };
    //int[] enterCell = { 20, 43, 29, 3, 16, 27, 36, 12, 15, 23, 1, 25, 21, 30, 0, 35, 17, 14, 35, 7, 26, 37, 30, 16, 19, 7, 38, 38, 22, 24, 27, 27 };
    //int[] exitCell = { 29, 26, 19, 12, 34, 38, 36, 15, 7, 14, 13, 39, 25, 23, 28, 20, 3, 19, 27, 5, 31, 13, 27, 41, 2, 13, 11, 2, 32, 40, 36, 41 };
    //int teleportPrice = 21;
    //assertArrayEquals(new int[] { 259, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case98() {
    //int[] cellPrice = { 26, 61, 88, 9, 17, 4, 27, 12, -1, 58, 68, 48, 15, 55, 33, 9, 3, 16, 28, 41, 85, 42, 2, 81, 80, 33, 69, 36, 23, 4, 37, 75, 14, 15, 51, 67, 11, 38, 45, 62, 19, 54, 24, 5, 63, 0 };
    //int[] enterCell = { 14, 29, 3, 33, 4, 2, 38, 31, 0, 10, 25, 45, 19, 19, 44, 26, 29, 13, 17, 39, 21, 19, 29 };
    //int[] exitCell = { 33, 13, 2, 39, 7, 27, 43, 38, 40, 31, 9, 15, 18, 1, 37, 9, 17, 30, 8, 40, 37, 27, 21 };
    //int teleportPrice = 360;
    //assertArrayEquals(new int[] { 506, 6 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case99() {
    //int[] cellPrice = { 71, 18, 71, 64, 53, 45, 27, 44, 39, -1, 92, 65, 35, 14, 81, -1, 58, 8, 93, 59, 18, 73, -1, 91, 44, 25, 9, 57, -1, 58, 6, 11, 24, 1, 39, -1, 67, 97, 63, 67, -1, 7, 82, -1, 9, -1 };
    //int[] enterCell = { 14, 45, 44, 31, 11, 12, 27 };
    //int[] exitCell = { 25, 10, 14, 29, 42, 40, 31 };
    //int teleportPrice = 36;
    //assertArrayEquals(new int[] {  }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}

  //@Test
  //public void case100() {
    //int[] cellPrice = { 52, 66, 5, 85, 84, 65, 92, 18, -1, 15, 77, 92, 86, 76, 35, 32, 3, 13, -1, 36, 49, 36, 72, 31, 59, 69, 79, 27, 55, 69, 33, -1, 56, 80, 13, 53, 40, 20, 10, 18, 81, 51, 69, -1, 77, 96, 29 };
    //int[] enterCell = { 6, 18, 27, 3, 37, 7, 9, 33, 36, 4, 27, 14, 14, 37, 5, 34, 25, 29, 17, 23, 20, 31, 45, 22, 32, 34, 39, 46, 9, 37, 41, 14, 20, 39, 9 };
    //int[] exitCell = { 31, 35, 27, 30, 36, 8, 46, 18, 30, 46, 38, 9, 29, 25, 41, 5, 30, 13, 28, 46, 22, 21, 43, 24, 27, 23, 0, 41, 13, 10, 39, 2, 15, 31, 13 };
    //int teleportPrice = 384;
    //assertArrayEquals(new int[] { 624, 5 }, cheapestroute.routePrice(cellPrice, enterCell, exitCell, teleportPrice));
  //}
}
