package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CheapestRouteTest2 {
  CheapestRoute cheapestroute = new CheapestRoute();

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
}
