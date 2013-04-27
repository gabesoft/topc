package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TriAreaTest {
  double DELTA = 1.0e-09;
  TriArea triarea = new TriArea();

  @Test
  public void case1() {
    int[] xCenter = { 1 };
    int[] yCenter = { 3 };
    int[] height = { 7 };
    assertEquals(49.0, triarea.area(xCenter, yCenter, height), DELTA * 49.0);
  }

  @Test
  public void case2() {
    int[] xCenter = { 1, 1, 1 };
    int[] yCenter = { 3, 3, 3 };
    int[] height = { 7, 7, 8 };
    assertEquals(64.0, triarea.area(xCenter, yCenter, height), DELTA * 64.0);
  }

  @Test
  public void case3() {
    int[] xCenter = { 1, 2 };
    int[] yCenter = { 3, 3 };
    int[] height = { 7, 7 };
    assertEquals(55.75, triarea.area(xCenter, yCenter, height), DELTA * 55.75);
  }

  @Test
  public void case4() {
    int[] xCenter = { -100, -100, 100, 100 };
    int[] yCenter = { 100, -100, -100, 100 };
    int[] height = { 100, 100, 100, 100 };
    assertEquals(40000.0, triarea.area(xCenter, yCenter, height), DELTA * 40000.0);
  }

  @Test
  public void case5() {
    int[] xCenter = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
    int[] yCenter = { -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5 };
    int[] height = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    assertEquals(229.75, triarea.area(xCenter, yCenter, height), DELTA * 229.75);
  }

  @Test
  public void case6() {
    int[] xCenter = { -100, -100, 100, 100 };
    int[] yCenter = { -100, -100, -100, 100 };
    int[] height = { 100, 100, 100, 1 };
    assertEquals(20001.0, triarea.area(xCenter, yCenter, height), DELTA * 20001.0);
  }

  @Test
  public void case7() {
    int[] xCenter = { -7 };
    int[] yCenter = { -8 };
    int[] height = { 3 };
    assertEquals(9.0, triarea.area(xCenter, yCenter, height), DELTA * 9.0);
  }

  @Test
  public void case8() {
    int[] xCenter = { -100, -100, 100, 0 };
    int[] yCenter = { -100, -100, -100, -100 };
    int[] height = { 100, 100, 100, 1 };
    assertEquals(20000.5, triarea.area(xCenter, yCenter, height), DELTA * 20000.5);
  }

  @Test
  public void case9() {
    int[] xCenter = { -100, -100, 100, 0 };
    int[] yCenter = { -100, -100, -100, -99 };
    int[] height = { 100, 100, 100, 1 };
    assertEquals(20001.0, triarea.area(xCenter, yCenter, height), DELTA * 20001.0);
  }

  @Test
  public void case10() {
    int[] xCenter = { -100, -100, 100, 1 };
    int[] yCenter = { -100, -100, -100, -99 };
    int[] height = { 100, 100, 100, 1 };
    assertEquals(20000.75, triarea.area(xCenter, yCenter, height), DELTA * 20000.75);
  }

  @Test
  public void case11() {
    int[] xCenter = { 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, -11, -12, -13, -14 };
    int[] yCenter = { 3, 3, 3, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -4, -4, -4, -4 };
    int[] height = { 7, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 13, 13, 13, 13 };
    assertEquals(473.5, triarea.area(xCenter, yCenter, height), DELTA * 473.5);
  }

  @Test
  public void case12() {
    int[] xCenter = { 3, 3, 3, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -5, -4, -4, -4, -4 };
    int[] yCenter = { 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, -11, -12, -13, -14 };
    int[] height = { 7, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 13, 13, 13, 13 };
    assertEquals(641.0, triarea.area(xCenter, yCenter, height), DELTA * 641.0);
  }

  @Test
  public void case13() {
    int[] xCenter = { -87, -30, 88, 55, 62, 15, -72, -91, -46, 23, -5, 44, 41, -81, -92, 39, 85, 51, 60, 0, -74, -97 };
    int[] yCenter = { 16, -36, 73, 71, 33, 89, 39, 21, 17, -21, 55, -19, 56, 44, 42, -88, 30, 94, -83, 28, -9, 59 };
    int[] height = { 90, 100, 44, 84, 28, 24, 55, 62, 57, 41, 62, 89, 12, 42, 77, 12, 10, 21, 45, 75, 23, 33 };
    assertEquals(35769.5, triarea.area(xCenter, yCenter, height), DELTA * 35769.5);
  }

  @Test
  public void case14() {
    int[] xCenter = { 55, -92, -86, -86, 22, -1, 47, -7, -83, 59, -84, -55, -62, -87, 96, 61, 65, 18, -32, 7, -28, 56, 3, -77, -24 };
    int[] yCenter = { -52, 4, -1, 19, -20, 9, -63, 5, 56, -6, 36, 68, 6, 23, -94, 51, -18, -16, 66, 25, -1, -71, 18, -91, -47 };
    int[] height = { 2, 61, 86, 26, 1, 4, 57, 55, 11, 58, 32, 37, 53, 63, 46, 51, 29, 80, 92, 95, 32, 77, 97, 40, 31 };
    assertEquals(37197.75, triarea.area(xCenter, yCenter, height), DELTA * 37197.75);
  }

  @Test
  public void case15() {
    int[] xCenter = { 41, 27, -33, -87, -61, -40, 44, 77, 8, 20, 27, 27, -45, 3, 44, 58, 16, 25, 44, 15 };
    int[] yCenter = { 34, 40, 18, 35, 4, -36, -43, 1, -77, -59, -75, -20, 1, -91, 18, 50, -13, 73, 21, -80 };
    int[] height = { 60, 98, 22, 55, 79, 88, 32, 58, 94, 34, 67, 30, 40, 13, 6, 18, 49, 59, 74, 29 };
    assertEquals(34120.25, triarea.area(xCenter, yCenter, height), DELTA * 34120.25);
  }

  @Test
  public void case16() {
    int[] xCenter = { 40, -23, -20, -55, -81, 72, 66, 13, -46, -35, 31, 65, 38, 84, 15, 55, 6, 27, 80, 87, 20 };
    int[] yCenter = { -77, 48, 37, 74, -49, -58, 72, -11, -13, -54, -2, 0, 72, -65, 42, -79, -28, -42, -2, -52, 62 };
    int[] height = { 5, 16, 62, 80, 49, 82, 59, 72, 71, 2, 86, 88, 75, 3, 90, 53, 93, 66, 76, 19, 17 };
    assertEquals(40134.75, triarea.area(xCenter, yCenter, height), DELTA * 40134.75);
  }

  @Test
  public void case17() {
    int[] xCenter = { 19, -18, 80, 83, 98, 90, 4, -66, 15, -86, -91, -2, 14, -81, 29, 52, 46, 44, 5, -45 };
    int[] yCenter = { -42, -19, 78, -23, -43, 3, 23, 99, -15, 85, 74, 70, 31, 51, -95, -37, -60, 92, -86, 33 };
    int[] height = { 82, 4, 87, 80, 99, 16, 3, 8, 84, 33, 9, 86, 68, 19, 43, 62, 39, 98, 48, 79 };
    assertEquals(43529.0, triarea.area(xCenter, yCenter, height), DELTA * 43529.0);
  }

  @Test
  public void case18() {
    int[] xCenter = { -23, 99, -17, 87, 85, -31, -44, -46, 10, -16, -12, 49, 76, 9, -70, 43, 89, -6, 47, 8, -65, 100, -73, -16, 25 };
    int[] yCenter = { 45, 100, -36, -95, 85, -72, -95, -3, -37, -20, -44, -77, 95, -60, 71, 8, 63, -9, 41, -1, 31, 97, 88, -34, -59 };
    int[] height = { 90, 8, 52, 55, 21, 52, 31, 8, 85, 49, 36, 35, 2, 89, 66, 74, 51, 86, 58, 87, 9, 86, 4, 99, 29 };
    assertEquals(44233.0, triarea.area(xCenter, yCenter, height), DELTA * 44233.0);
  }

  @Test
  public void case19() {
    int[] xCenter = { 94, -11, 56, -80, 19, -14, -18, 62, 35, -33, -14, -78, -29, -41, -68, 80, 88, 74, -52, 10, -57, -29 };
    int[] yCenter = { 54, -2, -1, -26, -62, 22, 22, 89, -17, 39, 75, 99, -56, 74, -41, -55, 71, 89, 85, 3, 8, 13 };
    int[] height = { 84, 33, 90, 25, 43, 54, 65, 49, 12, 42, 26, 22, 58, 41, 34, 49, 19, 25, 46, 50, 6, 25 };
    assertEquals(30946.5, triarea.area(xCenter, yCenter, height), DELTA * 30946.5);
  }

  @Test
  public void case20() {
    int[] xCenter = { -80, 54, -4, -95, 58, -20, -97, 27, 99, 53, -47, -79, 9, 63, 24, 25, 65, 41, -36, -85, 97, 86, -71 };
    int[] yCenter = { 31, -14, -68, -10, 23, 70, -15, -88, 8, 44, 93, 73, 2, -29, 57, 11, -5, 96, -72, 46, -69, 50, 52 };
    int[] height = { 58, 84, 91, 63, 99, 88, 73, 23, 70, 27, 45, 79, 10, 27, 1, 97, 69, 34, 6, 62, 69, 66, 93 };
    assertEquals(50039.75, triarea.area(xCenter, yCenter, height), DELTA * 50039.75);
  }

  @Test
  public void case21() {
    int[] xCenter = { -79, 46, -64, -8, 48, -6, -64, 52, 83, -59, -74, 95, 98, 87, 83, 87, 31, -18, 64, 47, 69 };
    int[] yCenter = { 17, -6, -73, 91, 40, -63, -54, -47, -96, 38, -74, -92, -81, -35, -65, 9, -84, 16, -27, 82, 22 };
    int[] height = { 56, 35, 69, 66, 89, 17, 8, 26, 96, 88, 80, 34, 7, 53, 78, 24, 32, 25, 28, 45, 32 };
    assertEquals(40705.5, triarea.area(xCenter, yCenter, height), DELTA * 40705.5);
  }

  @Test
  public void case22() {
    int[] xCenter = { -82, -68, -43, 11, -42, -10, -42, -23, 83, -15, -38, 27, 29, -12, 76, 9, 63, 55, 55, -43 };
    int[] yCenter = { -79, -27, -18, -7, -54, 99, -12, 14, -84, -20, 100, 84, -45, 16, 95, 6, 68, 5, -61, 57 };
    int[] height = { 1, 62, 66, 56, 26, 66, 13, 61, 70, 53, 73, 66, 38, 85, 19, 14, 99, 70, 28, 49 };
    assertEquals(39623.25, triarea.area(xCenter, yCenter, height), DELTA * 39623.25);
  }

  @Test
  public void case23() {
    int[] xCenter = { -6, -50, 85, 96, 75, -15, 46, -93, 43, 69, 53, -30, -72, 36, 44, -81, -56, -83, -33, 97 };
    int[] yCenter = { 19, 56, -28, 39, 7, -95, -25, 92, -62, -62, 87, -4, -75, 62, 12, 94, 28, 60, 10, -4 };
    int[] height = { 29, 18, 5, 94, 34, 95, 74, 28, 50, 30, 86, 52, 11, 28, 50, 40, 44, 41, 69, 29 };
    assertEquals(41110.25, triarea.area(xCenter, yCenter, height), DELTA * 41110.25);
  }

  @Test
  public void case24() {
    int[] xCenter = { 77, 93, -65, -42, 70, -83, -44, -29, -48, -81, 20, -8, -45, 10, -21, 48, -100, 67, 26, -22, -63, -42, -89 };
    int[] yCenter = { -62, 79, 85, 24, -72, -74, -24, 42, 14, 24, 42, -63, -60, -74, 86, -22, 1, -68, -70, 55, -68, -83, 65 };
    int[] height = { 38, 53, 66, 22, 82, 93, 82, 76, 7, 20, 69, 27, 26, 61, 93, 92, 78, 47, 55, 74, 87, 70, 44 };
    assertEquals(51423.0, triarea.area(xCenter, yCenter, height), DELTA * 51423.0);
  }

  @Test
  public void case25() {
    int[] xCenter = { -93, 9, 82, -46, -84, -32, 21, 56, 57, -74, 28, -99, -87, 12, -37, -98, -15, -13, 6, 7, -32, 46, -83 };
    int[] yCenter = { -17, 18, 72, -24, 80, -40, -77, 6, -8, -33, 75, 93, 35, 17, 42, -39, 41, -25, -45, 26, -91, 97, -18 };
    int[] height = { 55, 99, 98, 52, 81, 1, 53, 2, 12, 41, 80, 82, 74, 42, 15, 82, 60, 8, 90, 6, 100, 58, 8 };
    assertEquals(53820.75, triarea.area(xCenter, yCenter, height), DELTA * 53820.75);
  }

  @Test
  public void case26() {
    int[] xCenter = { -48, -79, 41, 47, -23, 69, 30, 75, -77, -4, -100, 23, 52, -63, 69, -30, 48, 93, -71, -23, 40, 84, 9, 74, -97 };
    int[] yCenter = { -84, -91, 89, 13, -93, -40, -4, -67, 46, -55, 45, 93, 79, -31, 82, 4, 54, -23, 96, 72, -69, 41, 24, 76, -41 };
    int[] height = { 14, 80, 39, 80, 28, 73, 99, 9, 28, 80, 58, 42, 95, 74, 9, 31, 9, 21, 70, 34, 88, 20, 12, 4, 66 };
    assertEquals(49910.0, triarea.area(xCenter, yCenter, height), DELTA * 49910.0);
  }

  @Test
  public void case27() {
    int[] xCenter = { -96, -33, 21, 16, -14, -98, -7, 80, -53, 44, -93, 79, -77, -68, -42, -14, 65, 23, 56, 83, -28, 64, 40, 98 };
    int[] yCenter = { -18, -42, -65, 54, -100, -52, 87, -48, 38, -55, 79, -89, 8, -18, -33, -90, 71, 88, 3, 85, 18, -93, 11, -16 };
    int[] height = { 69, 28, 95, 41, 8, 13, 45, 32, 79, 64, 34, 84, 26, 36, 89, 8, 94, 36, 69, 57, 59, 79, 80, 90 };
    assertEquals(50509.25, triarea.area(xCenter, yCenter, height), DELTA * 50509.25);
  }

  @Test
  public void case28() {
    int[] xCenter = { -52, 70, 34, -34, 13, -77, -49, -28, 85, -78, -48, 55, -47, 5, 13, -7, 71, 77, -21, 93, 25, 25 };
    int[] yCenter = { 36, 75, -6, -88, 13, -8, 52, 62, -9, -88, -21, -98, -18, -64, -92, -22, -52, 74, -30, -10, 93, -82 };
    int[] height = { 5, 10, 47, 30, 72, 90, 10, 21, 15, 11, 4, 70, 58, 28, 31, 47, 58, 56, 92, 36, 1, 95 };
    assertEquals(33919.0, triarea.area(xCenter, yCenter, height), DELTA * 33919.0);
  }

  @Test
  public void case29() {
    int[] xCenter = { 93, -97, -34, -21, 77, 89, -67, 89, 82, -65, -16, 8, 54, 4, -92, 2, 22, 41, 90, 44, 80, -60, 6, -12, 26 };
    int[] yCenter = { 39, -51, 85, -32, 42, -12, -76, 69, 32, -30, -11, -92, 23, -74, 9, -78, -10, -81, 2, -66, -78, 70, -43, -8, -80 };
    int[] height = { 42, 14, 98, 99, 29, 37, 32, 4, 63, 40, 34, 90, 98, 29, 39, 5, 4, 65, 59, 5, 76, 61, 63, 25, 64 };
    assertEquals(45682.25, triarea.area(xCenter, yCenter, height), DELTA * 45682.25);
  }

  @Test
  public void case30() {
    int[] xCenter = { -73, 30, 80, -29, 0, 7, -21, -69, 38, 98, 11, -43, -77, 73, -72, 10, 66, 25, 32, 65, -1, -53, -29, 53, -41 };
    int[] yCenter = { 22, 98, 43, -65, -8, -100, 22, 14, -49, -15, 30, 63, 15, -66, 86, 13, 81, 58, -78, -15, 35, 83, -77, 53, 1 };
    int[] height = { 7, 40, 4, 70, 37, 73, 43, 21, 24, 88, 65, 12, 75, 27, 90, 70, 38, 50, 52, 91, 74, 39, 23, 35, 11 };
    assertEquals(43804.25, triarea.area(xCenter, yCenter, height), DELTA * 43804.25);
  }

  @Test
  public void case31() {
    int[] xCenter = { 59, 66, 84, 98, -15, -30, 87, 37, 36, -52, -94, -38, -57, -6, -8, -94, -6, 6, -19, -48, -18 };
    int[] yCenter = { 43, -77, -3, -69, 5, 44, 69, -20, 74, -51, 50, -58, -65, -28, -10, 47, 96, -22, -29, -43, -94 };
    int[] height = { 45, 23, 84, 61, 54, 43, 28, 93, 80, 4, 90, 55, 20, 82, 57, 98, 77, 22, 63, 7, 89 };
    assertEquals(47927.5, triarea.area(xCenter, yCenter, height), DELTA * 47927.5);
  }

  @Test
  public void case32() {
    int[] xCenter = { 91, 10, -1, -2, 3, 31, -92, -32, -14, 27, -6, 46, 82, 81, 13, 27, 42, 12, 13, 8, -2 };
    int[] yCenter = { -81, -83, -24, 92, 52, 59, 69, 86, -50, -40, -61, 42, 56, 33, 52, -6, -63, -41, -95, 57, 87 };
    int[] height = { 19, 38, 8, 44, 74, 4, 83, 69, 83, 71, 67, 68, 67, 83, 86, 29, 55, 98, 24, 25, 94 };
    assertEquals(39309.75, triarea.area(xCenter, yCenter, height), DELTA * 39309.75);
  }

  @Test
  public void case33() {
    int[] xCenter = { -11, 22, -35, 36, -84, 55, -48, 96, -53, 73, -37, -73, -100, -83, 47, -75, -84, 94, -40, -98, -80, 5 };
    int[] yCenter = { 96, -34, -94, 22, -12, 78, -79, -84, 51, 97, 2, 58, 99, -14, 39, -73, 10, -86, -73, -52, 41, -29 };
    int[] height = { 93, 6, 8, 30, 14, 53, 77, 55, 59, 15, 86, 38, 23, 35, 11, 20, 45, 75, 13, 31, 24, 82 };
    assertEquals(38693.5, triarea.area(xCenter, yCenter, height), DELTA * 38693.5);
  }

  @Test
  public void case34() {
    int[] xCenter = { 64, 3, -11, -23, -48, -75, 79, 40, -63, 15, 37, 88, 13, -41, 22, 91, 44, -93, 24, 85, 77, 58, 87 };
    int[] yCenter = { -80, 4, -22, 87, 98, -84, 35, 86, -94, -15, 10, -33, 27, 74, -69, 25, 46, -47, -22, -83, 16, 13, 61 };
    int[] height = { 44, 1, 73, 60, 90, 30, 46, 64, 88, 97, 90, 82, 53, 14, 12, 17, 6, 3, 61, 60, 95, 40, 82 };
    assertEquals(47035.75, triarea.area(xCenter, yCenter, height), DELTA * 47035.75);
  }

  @Test
  public void case35() {
    int[] xCenter = { -63, -53, 95, -53, 76, 33, 12, 4, 87, -33, -39, 19, -4, 25, -88, -76, -94, 68, 52, 59 };
    int[] yCenter = { 66, 68, 83, 56, 1, 93, -60, 43, 53, 20, -20, -87, -43, 61, -34, 36, -75, 42, 34, 75 };
    int[] height = { 23, 43, 19, 77, 4, 73, 59, 94, 76, 21, 62, 8, 41, 18, 43, 89, 13, 63, 83, 3 };
    assertEquals(32839.25, triarea.area(xCenter, yCenter, height), DELTA * 32839.25);
  }

  @Test
  public void case36() {
    int[] xCenter = { 94, 80, 30, 38, -92, -70, -77, -31, 71, -51, 3, 63, 42, 50, 19, 43, -58, -15, -16, 59, -80, -90, 60, -28 };
    int[] yCenter = { 24, -4, 85, -46, -2, 38, -27, 80, 97, -100, 37, 100, 50, 81, 59, 19, 66, 63, 15, -58, 97, 49, -23, 71 };
    int[] height = { 69, 9, 44, 35, 36, 75, 78, 41, 95, 79, 38, 12, 77, 47, 6, 90, 37, 6, 84, 79, 82, 32, 97, 79 };
    assertEquals(56611.25, triarea.area(xCenter, yCenter, height), DELTA * 56611.25);
  }

  @Test
  public void case37() {
    int[] xCenter = { -64, -11, 24, 85, 40, -39, -5, -34, -100, 15, 0, 79, -4, -27, 13, -60, -44, 33, 6, 58 };
    int[] yCenter = { -35, -68, 45, 58, 31, -60, 82, 96, 78, -83, -18, -60, -35, 79, -2, 75, -30, 80, 50, -35 };
    int[] height = { 49, 62, 22, 13, 14, 100, 32, 67, 93, 11, 97, 97, 95, 74, 4, 7, 10, 89, 28, 34 };
    assertEquals(42036.0, triarea.area(xCenter, yCenter, height), DELTA * 42036.0);
  }

  @Test
  public void case38() {
    int[] xCenter = { -15, -29, -97, -1, -97, -44, -45, -67, 4, -33, -72, -32, 94, -99, 45, -1, -96, 100, 86, -47, -83, -95, 4, -91, -47 };
    int[] yCenter = { 55, 14, 47, -13, 52, -26, 27, -13, -96, 2, -85, -47, -20, 31, -35, -27, -26, -73, -95, 31, -61, -16, 15, 75, -86 };
    int[] height = { 33, 43, 37, 46, 59, 57, 93, 99, 99, 23, 33, 77, 85, 90, 52, 64, 77, 94, 41, 82, 82, 44, 4, 81, 14 };
    assertEquals(52155.5, triarea.area(xCenter, yCenter, height), DELTA * 52155.5);
  }

  @Test
  public void case39() {
    int[] xCenter = { 29, 18, -77, 37, 40, 22, 81, 56, -95, 78, -33, -28, 100, -28, -70, 25, 46, -48, -94, -68, -33, -98, -19, 27 };
    int[] yCenter = { -92, 66, 100, 76, 26, -59, 31, -66, -29, -72, -55, 32, 85, -89, 81, -60, -5, 8, 30, 50, 6, 34, -7, 46 };
    int[] height = { 61, 42, 83, 56, 1, 5, 43, 60, 34, 41, 28, 42, 62, 46, 52, 38, 55, 88, 27, 73, 21, 22, 41, 4 };
    assertEquals(40500.5, triarea.area(xCenter, yCenter, height), DELTA * 40500.5);
  }

  @Test
  public void case40() {
    int[] xCenter = { 19, -76, 23, 78, 35, -37, 8, 13, 10, -5, -72, 56, -23, -70, -6, -84, -3, -62, 84, 67, -22, 32, 90, -52 };
    int[] yCenter = { -61, 14, -45, 35, -91, -58, 96, 60, -98, 23, 96, 58, 80, 53, 2, -88, 4, 81, -22, 25, 43, -79, -86, 67 };
    int[] height = { 65, 100, 68, 20, 57, 84, 74, 69, 67, 44, 72, 38, 70, 39, 92, 90, 100, 88, 94, 21, 40, 50, 7, 97 };
    assertEquals(55017.0, triarea.area(xCenter, yCenter, height), DELTA * 55017.0);
  }

  @Test
  public void case41() {
    int[] xCenter = { 65, 49, -41, 69, 40, 44, 38, -59, -55, 17, 73, -69, 78, 35, 78, -26, -34, -12, -73, 41 };
    int[] yCenter = { -65, -93, 22, -69, -90, -13, 4, -42, -99, -7, -98, 11, 33, 50, -100, -89, 72, -54, 67, 69 };
    int[] height = { 53, 91, 46, 46, 50, 76, 86, 4, 98, 59, 1, 44, 14, 72, 10, 68, 68, 7, 16, 88 };
    assertEquals(41461.25, triarea.area(xCenter, yCenter, height), DELTA * 41461.25);
  }

  @Test
  public void case42() {
    int[] xCenter = { -82, -86, -42, 0, 60, -36, -72, 69, 65, -5, -100, 87, -20, -79, -29, 13, -10, 78, 74, 56, -23, 27, -85 };
    int[] yCenter = { 8, -65, -11, -22, 25, -88, 95, -88, -37, -72, 82, 48, -60, -82, -22, 22, -100, -94, 35, -87, 84, -91, -91 };
    int[] height = { 26, 8, 97, 39, 79, 49, 14, 36, 72, 82, 69, 41, 98, 66, 92, 66, 98, 55, 56, 69, 47, 95, 52 };
    assertEquals(45021.5, triarea.area(xCenter, yCenter, height), DELTA * 45021.5);
  }

  @Test
  public void case43() {
    int[] xCenter = { 3, 6, 10, 12 };
    int[] yCenter = { 4, 11, -1, -7 };
    int[] height = { 2, 4, 6, 8 };
    assertEquals(116.0, triarea.area(xCenter, yCenter, height), DELTA * 116.0);
  }

  @Test
  public void case44() {
    int[] xCenter = { 3, 6, 10, 12 };
    int[] yCenter = { 4, 11, -1, -7 };
    int[] height = { 2, 4, 6, 8 };
    assertEquals(116.0, triarea.area(xCenter, yCenter, height), DELTA * 116.0);
  }

  @Test
  public void case45() {
    int[] xCenter = { 2, 4, 3, -2, -2, -1, -10 };
    int[] yCenter = { 2, 2, 1, 2, 2, 2, 1 };
    int[] height = { 2, 2, 2, 2, 1, 3, 1 };
    assertEquals(19.0, triarea.area(xCenter, yCenter, height), DELTA * 19.0);
  }

  @Test
  public void case46() {
    int[] xCenter = { 0, 0, 0, 0 };
    int[] yCenter = { 1, 3, 2, 5 };
    int[] height = { 32, 43, 43, 86 };
    assertEquals(7712.0, triarea.area(xCenter, yCenter, height), DELTA * 7712.0);
  }

  @Test
  public void case47() {
    int[] xCenter = { -100, 100, 100, 2, 3, 4, 5 };
    int[] yCenter = { 10, 11, 12, 10, 10, 10, 10 };
    int[] height = { 1, 99, 99, 99, 99, 99, 99 };
    assertEquals(17445.0, triarea.area(xCenter, yCenter, height), DELTA * 17445.0);
  }

  @Test
  public void case48() {
    int[] xCenter = { 3, 6, 10, 12, 4, 2, 5, 89, -38, -45, -99 };
    int[] yCenter = { 4, 11, -1, -7, 87, 56, 33, 45, -67, -10, -89 };
    int[] height = { 2, 4, 6, 8, 50, 45, 78, 89, 90, 98, 97 };
    assertEquals(35905.5, triarea.area(xCenter, yCenter, height), DELTA * 35905.5);
  }

  @Test
  public void case49() {
    int[] xCenter = { 3, 6, 10, 12, 4, 2, 5, 89, -38, -45, -99, 67, 89, 34, -98, -99, -56, -34 };
    int[] yCenter = { 4, 11, -1, -7, 87, 56, 33, 45, -67, -10, -89, -56, -43, -2, 67, 45, 3, 4 };
    int[] height = { 2, 4, 6, 8, 50, 45, 78, 89, 90, 98, 97, 5, 5, 80, 95, 93, 82, 45 };
    assertEquals(49179.5, triarea.area(xCenter, yCenter, height), DELTA * 49179.5);
  }

  @Test
  public void case50() {
    int[] xCenter = { 5, 10, 7 };
    int[] yCenter = { 3, 3, 2 };
    int[] height = { 5, 5, 2 };
    assertEquals(46.75, triarea.area(xCenter, yCenter, height), DELTA * 46.75);
  }

  @Test
  public void case51() {
    int[] xCenter = { 3 };
    int[] yCenter = { 3 };
    int[] height = { 1 };
    assertEquals(1.0, triarea.area(xCenter, yCenter, height), DELTA * 1.0);
  }

}
