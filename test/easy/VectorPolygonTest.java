package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class VectorPolygonTest {
  double DELTA = 1.0e-09;
  VectorPolygon vectorpolygon = new VectorPolygon();

  @Test
  public void case1() {
    int[] dx = { 2, 3, -5 };
    int[] dy = { 2, -4, 2 };
    assertEquals(7.0, vectorpolygon.maxArea(dx, dy), DELTA * 7.0);
  }

  @Test
  public void case2() {
    int[] dx = { 2, -3, -5 };
    int[] dy = { 2, 4, 2 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case3() {
    int[] dx = { 0, 0, 1, -1 };
    int[] dy = { 1, -1, 0, 0 };
    assertEquals(1.0, vectorpolygon.maxArea(dx, dy), DELTA * 1.0);
  }

  @Test
  public void case4() {
    int[] dx = { 25, 50, 75, 100, -25, -50, -75, -100 };
    int[] dy = { 100, 75, 50, 25, -100, -75, -50, -25 };
    assertEquals(31250.0, vectorpolygon.maxArea(dx, dy), DELTA * 31250.0);
  }

  @Test
  public void case5() {
    int[] dx = { 100 };
    int[] dy = { -100 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case6() {
    int[] dx = { 1, -1, 0 };
    int[] dy = { 0, 1, -1 };
    assertEquals(0.5, vectorpolygon.maxArea(dx, dy), DELTA * 0.5);
  }

  @Test
  public void case7() {
    int[] dx = { 1, -1 };
    int[] dy = { -1, 1 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case8() {
    int[] dx = { 1, 1, -1, -1 };
    int[] dy = { 0, 0, 1, -1 };
    assertEquals(1.0, vectorpolygon.maxArea(dx, dy), DELTA * 1.0);
  }

  @Test
  public void case9() {
    int[] dx = { 0, 1, -1, 2, -2 };
    int[] dy = { 2, -1, -1, -1, -1 };
    assertEquals(2.0, vectorpolygon.maxArea(dx, dy), DELTA * 2.0);
  }

  @Test
  public void case10() {
    int[] dx = { 0, 1, -1, 2, -2 };
    int[] dy = { 2, -1, -1, 1, 1 };
    assertEquals(3.0, vectorpolygon.maxArea(dx, dy), DELTA * 3.0);
  }

  @Test
  public void case11() {
    int[] dx = { 100, 100, -100, -100 };
    int[] dy = { 100, -100, 100, -100 };
    assertEquals(20000.0, vectorpolygon.maxArea(dx, dy), DELTA * 20000.0);
  }

  @Test
  public void case12() {
    int[] dx = { 0, 100, 100, 100, 0, -100, -100, -100 };
    int[] dy = { 100, 100, 0, -100, -100, -100, 0, 100 };
    assertEquals(70000.0, vectorpolygon.maxArea(dx, dy), DELTA * 70000.0);
  }

  @Test
  public void case13() {
    int[] dx = { 0, 70, 100, 70, 0, -70, -100, -70 };
    int[] dy = { 100, 70, 0, -70, -100, -70, 0, 70 };
    assertEquals(47800.0, vectorpolygon.maxArea(dx, dy), DELTA * 47800.0);
  }

  @Test
  public void case14() {
    int[] dx = { 10, 10, 10, 10, 10, 10, 10, -70 };
    int[] dy = { 0, 1, 2, 3, 4, 5, 6, -21 };
    assertEquals(280.0, vectorpolygon.maxArea(dx, dy), DELTA * 280.0);
  }

  @Test
  public void case15() {
    int[] dx = { 99, -49, -50 };
    int[] dy = { 100, -50, -50 };
    assertEquals(25.0, vectorpolygon.maxArea(dx, dy), DELTA * 25.0);
  }

  @Test
  public void case16() {
    int[] dx = { 100, 100, -100, -100, 0, 0, 0, 0 };
    int[] dy = { 0, 0, 0, 0, 100, 100, -100, -100 };
    assertEquals(40000.0, vectorpolygon.maxArea(dx, dy), DELTA * 40000.0);
  }

  @Test
  public void case17() {
    int[] dx = { 10, -10, 0, 0, -5, -5 };
    int[] dy = { 0, 0, -10, 10, 21, -21 };
    assertEquals(205.0, vectorpolygon.maxArea(dx, dy), DELTA * 205.0);
  }

  @Test
  public void case18() {
    int[] dx = { 16, 58, -74 };
    int[] dy = { 94, 6, -100 };
    assertEquals(2678.0, vectorpolygon.maxArea(dx, dy), DELTA * 2678.0);
  }

  @Test
  public void case19() {
    int[] dx = { 7, -7 };
    int[] dy = { -5, 5 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case20() {
    int[] dx = { 20, 6, 23, -49 };
    int[] dy = { -78, 57, 86, -65 };
    assertEquals(2958.5, vectorpolygon.maxArea(dx, dy), DELTA * 2958.5);
  }

  @Test
  public void case21() {
    int[] dx = { 60, -1, -16, -43 };
    int[] dy = { -12, 9, -66, 69 };
    assertEquals(2235.0, vectorpolygon.maxArea(dx, dy), DELTA * 2235.0);
  }

  @Test
  public void case22() {
    int[] dx = { 14, -14 };
    int[] dy = { 84, -84 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case23() {
    int[] dx = { 62, -62 };
    int[] dy = { 96, -96 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case24() {
    int[] dx = { -51, -63, 30, -29, 35, 78 };
    int[] dy = { 97, -49, 66, -65, -63, 14 };
    assertEquals(15872.0, vectorpolygon.maxArea(dx, dy), DELTA * 15872.0);
  }

  @Test
  public void case25() {
    int[] dx = { 81, -96, 12, 32, 68, -97 };
    int[] dy = { -90, 49, -52, -26, 22, 97 };
    assertEquals(11995.5, vectorpolygon.maxArea(dx, dy), DELTA * 11995.5);
  }

  @Test
  public void case26() {
    int[] dx = { 95, 20, -14, -4, -97 };
    int[] dy = { -95, 30, 47, -37, 55 };
    assertEquals(6527.0, vectorpolygon.maxArea(dx, dy), DELTA * 6527.0);
  }

  @Test
  public void case27() {
    int[] dx = { 53, 58, -74, -37 };
    int[] dy = { -90, 99, -47, 38 };
    assertEquals(7509.0, vectorpolygon.maxArea(dx, dy), DELTA * 7509.0);
  }

  @Test
  public void case28() {
    int[] dx = { 62, -62, -63, 63, -88, 24, -24, 88 };
    int[] dy = { -12, 12, 85, -85, -94, -100, 100, 94 };
    assertEquals(46028.0, vectorpolygon.maxArea(dx, dy), DELTA * 46028.0);
  }

  @Test
  public void case29() {
    int[] dx = { 6, 39, 87, -87, 58, -6, -58, -39 };
    int[] dy = { -51, 87, 9, -9, -78, 51, 78, -87 };
    assertEquals(32106.0, vectorpolygon.maxArea(dx, dy), DELTA * 32106.0);
  }

  @Test
  public void case30() {
    int[] dx = { -32, 89, -16, -89, 32, 37, 16, -37 };
    int[] dy = { 43, -99, 71, 99, -43, -25, -71, 25 };
    assertEquals(11434.0, vectorpolygon.maxArea(dx, dy), DELTA * 11434.0);
  }

  @Test
  public void case31() {
    int[] dx = { 62, -62, 48, 36, -48, -4, -36, 4 };
    int[] dy = { -48, 48, 34, -36, -34, 70, 36, -70 };
    assertEquals(17888.0, vectorpolygon.maxArea(dx, dy), DELTA * 17888.0);
  }

  @Test
  public void case32() {
    int[] dx = { -43, -50, 50, -8, -21, 8, 43, 21 };
    int[] dy = { 5, -42, 42, 60, 77, -60, -5, -77 };
    assertEquals(16514.0, vectorpolygon.maxArea(dx, dy), DELTA * 16514.0);
  }

  @Test
  public void case33() {
    int[] dx = { -70, -60, 70, 60, -67, 67, -17, 17 };
    int[] dy = { 88, 26, -88, -26, -36, 36, -62, 62 };
    assertEquals(29318.0, vectorpolygon.maxArea(dx, dy), DELTA * 29318.0);
  }

  @Test
  public void case34() {
    int[] dx = { -81, 80, -80, 81, -71, -28, 71, 28 };
    int[] dy = { -71, -64, 64, 71, 28, 68, -28, -68 };
    assertEquals(35665.0, vectorpolygon.maxArea(dx, dy), DELTA * 35665.0);
  }

  @Test
  public void case35() {
    int[] dx = { -27, 21, 27, -22, -21, 22, -71, 71 };
    int[] dy = { -76, 12, 76, -27, -12, 27, -21, 21 };
    assertEquals(9213.0, vectorpolygon.maxArea(dx, dy), DELTA * 9213.0);
  }

  @Test
  public void case36() {
    int[] dx = { -95, 22, 49, -20, 95, 20, -49, -22 };
    int[] dy = { 3, -17, -5, -91, -3, 91, 5, 17 };
    assertEquals(18206.0, vectorpolygon.maxArea(dx, dy), DELTA * 18206.0);
  }

  @Test
  public void case37() {
    int[] dx = { 74, -28, 28, -31, -62, -74, 31, 62 };
    int[] dy = { 27, -88, 88, 24, 36, -27, -24, -36 };
    assertEquals(22943.0, vectorpolygon.maxArea(dx, dy), DELTA * 22943.0);
  }

  @Test
  public void case38() {
    int[] dx = { 53, -5, 43, -48, -53, -43, 48, 5 };
    int[] dy = { -89, 35, -19, 54, 89, 19, -54, -35 };
    assertEquals(9870.0, vectorpolygon.maxArea(dx, dy), DELTA * 9870.0);
  }

  @Test
  public void case39() {
    int[] dx = { 48, 98, 25, 73, -98, -73, -25, -48 };
    int[] dy = { -64, -8, 28, -36, 8, 36, -28, 64 };
    assertEquals(20608.0, vectorpolygon.maxArea(dx, dy), DELTA * 20608.0);
  }

  @Test
  public void case40() {
    int[] dx = { -22, 38, 82, -38, -82, -60, 60, 22 };
    int[] dy = { 75, 85, -65, -85, 65, -10, 10, -75 };
    assertEquals(33040.0, vectorpolygon.maxArea(dx, dy), DELTA * 33040.0);
  }

  @Test
  public void case41() {
    int[] dx = { 5, 1, -5, -7, 6, 7, -1, -6 };
    int[] dy = { 51, -43, -51, 35, 8, -35, 43, -8 };
    assertEquals(1862.0, vectorpolygon.maxArea(dx, dy), DELTA * 1862.0);
  }

  @Test
  public void case42() {
    int[] dx = { 65, 61, 63, -61, -65, -2, 2, -63 };
    int[] dy = { 7, -47, -20, 47, -7, -27, 27, 20 };
    assertEquals(12187.0, vectorpolygon.maxArea(dx, dy), DELTA * 12187.0);
  }

  @Test
  public void case43() {
    int[] dx = { 73, -7, -40, 40, 33, 7, -33, -73 };
    int[] dy = { 71, 53, -9, 9, 62, -53, -62, -71 };
    assertEquals(15281.0, vectorpolygon.maxArea(dx, dy), DELTA * 15281.0);
  }

  @Test
  public void case44() {
    int[] dx = { 30, 80, -50, 50, -80, 20, -30, -20 };
    int[] dy = { -7, -19, 12, -12, 19, -5, 7, 5 };
    assertEquals(70.0, vectorpolygon.maxArea(dx, dy), DELTA * 70.0);
  }

  @Test
  public void case45() {
    int[] dx = { -80, 6, 37, -43, -37, -6, 43, 80 };
    int[] dy = { 8, -16, 4, 12, -4, 16, -12, -8 };
    assertEquals(4312.0, vectorpolygon.maxArea(dx, dy), DELTA * 4312.0);
  }

  @Test
  public void case46() {
    int[] dx = { -79, 96, -96, -17, -62, 17, 62, 79 };
    int[] dy = { -21, 14, -14, 7, -28, -7, 28, 21 };
    assertEquals(6370.0, vectorpolygon.maxArea(dx, dy), DELTA * 6370.0);
  }

  @Test
  public void case47() {
    int[] dx = { 56, -81, -25, 81, -31, 25, -56, 31 };
    int[] dy = { -41, 44, 3, -44, 38, -3, 41, -38 };
    assertEquals(5999.0, vectorpolygon.maxArea(dx, dy), DELTA * 5999.0);
  }

  @Test
  public void case48() {
    int[] dx = { 7, -7, -24, -35, 24, 35, 5, -5 };
    int[] dy = { -93, 93, 15, -34, -15, 34, 1, -1 };
    assertEquals(7667.0, vectorpolygon.maxArea(dx, dy), DELTA * 7667.0);
  }

  @Test
  public void case49() {
    int[] dx = { -80, 80, 4, -28, -4, -57, 57, 28 };
    int[] dy = { 48, -48, -72, -93, 72, -24, 24, 93 };
    assertEquals(30225.0, vectorpolygon.maxArea(dx, dy), DELTA * 30225.0);
  }

  @Test
  public void case50() {
    int[] dx = { -63, -49, -84, 84, 49, 26, -26, 63 };
    int[] dy = { 77, -13, 72, -72, 13, 86, -86, -77 };
    assertEquals(31536.0, vectorpolygon.maxArea(dx, dy), DELTA * 31536.0);
  }

  @Test
  public void case51() {
    int[] dx = { 19, 81, -1, 1, -19, -81, 25, -25 };
    int[] dy = { -24, -78, -47, 47, 24, 78, 81, -81 };
    assertEquals(17008.0, vectorpolygon.maxArea(dx, dy), DELTA * 17008.0);
  }

  @Test
  public void case52() {
    int[] dx = { 54, -91, -48, 48, 91, 16, -16, -54 };
    int[] dy = { 80, -99, -85, 85, 99, -31, 31, -80 };
    assertEquals(15874.0, vectorpolygon.maxArea(dx, dy), DELTA * 15874.0);
  }

  @Test
  public void case53() {
    int[] dx = { 62, -59, 46, -62, 59, -46, -49, 49 };
    int[] dy = { 60, -90, 44, -60, 90, -44, -85, 85 };
    assertEquals(8305.0, vectorpolygon.maxArea(dx, dy), DELTA * 8305.0);
  }

  @Test
  public void case54() {
    int[] dx = { -36, -33, -26, 26, 61, 36, -61, 33 };
    int[] dy = { -35, 25, 19, -19, -80, 35, 80, -25 };
    assertEquals(10723.0, vectorpolygon.maxArea(dx, dy), DELTA * 10723.0);
  }

  @Test
  public void case55() {
    int[] dx = { -98, -2, 89, -52, -89, 98, 52, 2 };
    int[] dy = { -42, -28, 79, -82, -79, 42, 82, 28 };
    assertEquals(19332.0, vectorpolygon.maxArea(dx, dy), DELTA * 19332.0);
  }

  @Test
  public void case56() {
    int[] dx = { 11, 79, -11, -29, 95, -95, -79, 29 };
    int[] dy = { 36, -91, -36, -10, -23, 23, 91, 10 };
    assertEquals(20326.0, vectorpolygon.maxArea(dx, dy), DELTA * 20326.0);
  }

  @Test
  public void case57() {
    int[] dx = { -61, 27, -83, -97, 83, -27, 61, 97 };
    int[] dy = { -100, -96, -64, -67, 64, 96, 100, 67 };
    assertEquals(40029.0, vectorpolygon.maxArea(dx, dy), DELTA * 40029.0);
  }

  @Test
  public void case58() {
    int[] dx = { -42, -42, -67 };
    int[] dy = { -93, -59, -73 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case59() {
    int[] dx = { -1, -56, 20, -72, 100, -1, -85 };
    int[] dy = { -94, -52, -48, -64, -35, -28, 95 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case60() {
    int[] dx = { -63, -65, 79, 25 };
    int[] dy = { -45, -88, 90, 96 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case61() {
    int[] dx = { 50, 13, 83, 49 };
    int[] dy = { -12, -34, -14, 14 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case62() {
    int[] dx = { 23, 53, -21, 38, 62, 65, -31, 60 };
    int[] dy = { 22, 84, 40, 7, -68, -9, -77, 43 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case63() {
    int[] dx = { 47, 33 };
    int[] dy = { 8, -14 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case64() {
    int[] dx = { 0, 39, -23 };
    int[] dy = { -82, -79, -2 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case65() {
    int[] dx = { -76, -90, -70, 57, -83, -44, -21 };
    int[] dy = { 73, 98, -63, -24, -34, -74, -73 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case66() {
    int[] dx = { 91, -98, -8 };
    int[] dy = { -14, 21, -41 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case67() {
    int[] dx = { -68, -52, 71, -24, -37, 7 };
    int[] dy = { 18, 39, -26, -59, -2, -20 };
    assertEquals(0.0, vectorpolygon.maxArea(dx, dy), DELTA);
  }

  @Test
  public void case68() {
    int[] dx = { 0, 1, 1, -2 };
    int[] dy = { 2, -1, -1, 0 };
    assertEquals(2.0, vectorpolygon.maxArea(dx, dy), DELTA * 2.0);
  }

  @Test
  public void case69() {
    int[] dx = { 1, 0, 0, 0, 0, 0, 0, -1 };
    int[] dy = { 0, 1, 1, 1, -1, -1, -1, 0 };
    assertEquals(3.0, vectorpolygon.maxArea(dx, dy), DELTA * 3.0);
  }

  @Test
  public void case70() {
    int[] dx = { 0, 1, 1, 1, -1, -1, -1, 0 };
    int[] dy = { 1, 0, 0, 0, 0, 0, 0, -1 };
    assertEquals(3.0, vectorpolygon.maxArea(dx, dy), DELTA * 3.0);
  }

  @Test
  public void case71() {
    int[] dx = { 2, 3, -5 };
    int[] dy = { 2, -4, 2 };
    assertEquals(7.0, vectorpolygon.maxArea(dx, dy), DELTA * 7.0);
  }

  @Test
  public void case72() {
    int[] dx = { 25, 50, 75, 100, -25, -50, -75, -100 };
    int[] dy = { 100, 75, 50, 25, -100, -75, -50, -25 };
    assertEquals(31250.0, vectorpolygon.maxArea(dx, dy), DELTA * 31250.0);
  }

  @Test
  public void case73() {
    int[] dx = { 0, 30, 0, -30, 10, -6, 3, -7 };
    int[] dy = { 10, 0, -10, 0, 0, -5, -5, 0 };
    assertEquals(407.5, vectorpolygon.maxArea(dx, dy), DELTA * 407.5);
  }

  @Test
  public void case74() {
    int[] dx = { 1, -1, 2, -1, 1, -2 };
    int[] dy = { 1, 1, 0, -1, -1, 0 };
    assertEquals(6.0, vectorpolygon.maxArea(dx, dy), DELTA * 6.0);
  }

  @Test
  public void case75() {
    int[] dx = { 0, 1, 1, -2 };
    int[] dy = { 2, -1, -1, 0 };
    assertEquals(2.0, vectorpolygon.maxArea(dx, dy), DELTA * 2.0);
  }

  @Test
  public void case76() {
    int[] dx = { 0, 2, -2, -1, 1 };
    int[] dy = { 2, 0, 0, -1, -1 };
    assertEquals(5.0, vectorpolygon.maxArea(dx, dy), DELTA * 5.0);
  }

  @Test
  public void case77() {
    int[] dx = { 1, 1, -2, 0, 50 };
    int[] dy = { 1, 1, 0, -2, 50 };
    assertEquals(2.0, vectorpolygon.maxArea(dx, dy), DELTA * 2.0);
  }

  @Test
  public void case78() {
    int[] dx = { 0, 0, 1, -1, 1 };
    int[] dy = { 1, -1, 0, 0, 1 };
    assertEquals(1.0, vectorpolygon.maxArea(dx, dy), DELTA * 1.0);
  }

  @Test
  public void case79() {
    int[] dx = { 1, -1, 5, -5, 2 };
    int[] dy = { 5, -5, 1, -1, 2 };
    assertEquals(24.0, vectorpolygon.maxArea(dx, dy), DELTA * 24.0);
  }

  @Test
  public void case80() {
    int[] dx = { 20, 20, 0, -20, -20, -60, 40, 20 };
    int[] dy = { 40, 20, 20, 20, 0, -20, -20, -40 };
    assertEquals(5000.0, vectorpolygon.maxArea(dx, dy), DELTA * 5000.0);
  }

  @Test
  public void case81() {
    int[] dx = { 1, 2, 2, -1, 2, -2, -1, 1 };
    int[] dy = { 1, -1, 2, 1, -1, 1, -2, -1 };
    assertEquals(4.5, vectorpolygon.maxArea(dx, dy), DELTA * 4.5);
  }

  @Test
  public void case82() {
    int[] dx = { 1, -1, 1, -1, 0 };
    int[] dy = { 1, -1, -1, 0, 1 };
    assertEquals(2.5, vectorpolygon.maxArea(dx, dy), DELTA * 2.5);
  }

}
