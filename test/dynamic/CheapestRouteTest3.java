package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CheapestRouteTest3 {
  CheapestRoute cheapestroute = new CheapestRoute();

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
