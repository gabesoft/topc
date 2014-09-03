package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class FoxAndSightseeingTest {
  FoxAndSightseeing foxandsightseeing = new FoxAndSightseeing();

  @Test
  public void case1() {
    int[] position = { 1, 4, -1, 3 };
    assertEquals(4, foxandsightseeing.getMin(position));
  }

  @Test
  public void case2() {
    int[] position = { -2, 4, 3 };
    assertEquals(5, foxandsightseeing.getMin(position));
  }

  @Test
  public void case3() {
    int[] position = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertEquals(9, foxandsightseeing.getMin(position));
  }

  @Test
  public void case4() {
    int[] position = { 100, -100, 99, -99 };
    assertEquals(199, foxandsightseeing.getMin(position));
  }

  @Test
  public void case5() {
    int[] position = { 74, 84, 92, 23, 5, -70, -47, -59, 24, -86, -39, 99, 85, -42, 54, 100, 47, -3, 42, 38 };
    assertEquals(836, foxandsightseeing.getMin(position));
  }

  @Test
  public void case6() {
    int[] position = { 2, -3, 5, 7, -11, -13, 17, -19, 23, 29, -31, -37, -41, 43, -47, -53, -59, 61, -67, 71 };
    assertEquals(535, foxandsightseeing.getMin(position));
  }

  @Test
  public void case7() {
    int[] position = { -39, 27, -54, 25 };
    assertEquals(68, foxandsightseeing.getMin(position));
  }

  @Test
  public void case8() {
    int[] position = { -28, 91, -62, 77, -47, -20, -51, 7, 23 };
    assertEquals(389, foxandsightseeing.getMin(position));
  }

  @Test
  public void case9() {
    int[] position = { 55, -33, 35, -80, 83, 87, -56, 16, 73, 20, -35, 45, 11, -12 };
    assertEquals(725, foxandsightseeing.getMin(position));
  }

  @Test
  public void case10() {
    int[] position = { 6, -9, -98, 29, -25, -33, -12, 42, 15, -46, 23, -1, 50, -61, 11, 77, 1, 34, 51 };
    assertEquals(797, foxandsightseeing.getMin(position));
  }

  @Test
  public void case11() {
    int[] position = { -73, -43, -83, -92, -71, -95, -62, -48, -4, -94, 82, -22, -63, 41, -78, -2, 59, -17, -74, 8, 51, -27, 79, -15 };
    assertEquals(1314, foxandsightseeing.getMin(position));
  }

  @Test
  public void case12() {
    int[] position = { 33, 16, 43, 88, 15, -14, 71, -74, 59, -24, 0, -7, 81, 76, 80, -90, -49, 9, -43, 86, 60, 4, -66, -19, 41, 91, -15, -61, 53 };
    assertEquals(1524, foxandsightseeing.getMin(position));
  }

  @Test
  public void case13() {
    int[] position = { -68, -7, -12, 43, -64, -65, 96, -98, 84, 50, 66, -52, 0, 80, 24, -83, 70, -82, -51, 62, -45, -70, -21, -97, 6, 14, -72, 86, -9, -40, -28, 34, -71, -86 };
    assertEquals(2246, foxandsightseeing.getMin(position));
  }

  @Test
  public void case14() {
    int[] position = { -14, 81, 97, 98, 54, 43, -57, -84, 69, -93, 36, -88, 78, -39, -9, -61, 17, -48, 46, 92, -71, -46, 58, -95, -23, -52, 87, 4, 66, -87, -18, -36, 59, 35, 96, 38, 67, -69, -54 };
    assertEquals(2692, foxandsightseeing.getMin(position));
  }

  @Test
  public void case15() {
    int[] position = { -98, -79, -44, -69, -26, -37, -43, -94, 91, 80, 27, 29, 56, 63, 46, 66, 95, -73, -49, 74, 100, -92, -75, -29, -53, -16, -60, 44, 90, 57, 94, -85, -78, -9, 89, 20, 83, 22, 28, 32, -8, -57, -45, -22 };
    assertEquals(2004, foxandsightseeing.getMin(position));
  }

  @Test
  public void case16() {
    int[] position = { -94, -67, 62, 97, 57, 44, -21, 47, -20, -91, 83, -72, -75, -55, 3, 32, 52, -53, 84, -85, 10, 45, 89, 1, 53, -96, 61, -16, -35, 51, -51, 25, -24, 39, -19, 43, -15, -65, 13, 65, 33, -4, -76, 7, -73, -100, 60, 16, -82 };
    assertEquals(3158, foxandsightseeing.getMin(position));
  }

  @Test
  public void case17() {
    int[] position = { -40, -13, 4 };
    assertEquals(44, foxandsightseeing.getMin(position));
  }

  @Test
  public void case18() {
    int[] position = { -99, -96, -79, -44, -37, -26, 9, 79 };
    assertEquals(178, foxandsightseeing.getMin(position));
  }

  @Test
  public void case19() {
    int[] position = { -96, -93, -62, -29, -21, 2, 28, 30, 31, 63, 86, 98, 100 };
    assertEquals(196, foxandsightseeing.getMin(position));
  }

  @Test
  public void case20() {
    int[] position = { -91, -66, -50, -36, -29, -17, -10, -8, 19, 20, 29, 49, 57, 66, 90, 91, 94, 95 };
    assertEquals(186, foxandsightseeing.getMin(position));
  }

  @Test
  public void case21() {
    int[] position = { -88, -86, -59, -57, -31, -27, -24, -23, -20, -13, -7, 0, 13, 17, 19, 26, 36, 44, 45, 82, 87, 97, 98 };
    assertEquals(186, foxandsightseeing.getMin(position));
  }

  @Test
  public void case22() {
    int[] position = { -96, -93, -54, -50, -49, -47, -40, -29, -19, -11, -1, 8, 11, 20, 24, 27, 29, 30, 34, 40, 51, 57, 61, 63, 67, 71, 74, 83 };
    assertEquals(179, foxandsightseeing.getMin(position));
  }

  @Test
  public void case23() {
    int[] position = { -87, -79, -75, -72, -70, -68, -65, -60, -52, -41, -40, -38, -32, -29, -23, -14, -5, -3, -1, 12, 19, 25, 27, 31, 37, 59, 60, 63, 69, 76, 86, 95, 100 };
    assertEquals(187, foxandsightseeing.getMin(position));
  }

  @Test
  public void case24() {
    int[] position = { -99, -96, -94, -87, -81, -80, -77, -73, -57, -54, -52, -49, -40, -31, -28, -27, -22, -9, -7, -1, 2, 9, 10, 15, 17, 19, 20, 30, 46, 49, 51, 69, 71, 76, 78, 84, 85, 97 };
    assertEquals(196, foxandsightseeing.getMin(position));
  }

  @Test
  public void case25() {
    int[] position = { -98, -83, -81, -79, -76, -75, -73, -71, -68, -58, -54, -51, -40, -37, -21, -10, -7, 5, 9, 10, 12, 17, 23, 24, 25, 26, 27, 43, 44, 45, 47, 51, 52, 57, 66, 68, 69, 70, 83, 85, 86, 91, 92 };
    assertEquals(190, foxandsightseeing.getMin(position));
  }

  @Test
  public void case26() {
    int[] position = { -95, -94, -93, -89, -85, -81, -80, -75, -74, -69, -66, -57, -53, -51, -49, -47, -32, -19, -18, -16, -15, -8, -7, -6, -5, 0, 2, 13, 16, 18, 22, 26, 32, 36, 40, 42, 50, 62, 68, 72, 74, 80, 82, 86, 92, 96, 98, 100 };
    assertEquals(195, foxandsightseeing.getMin(position));
  }

  @Test
  public void case27() {
    int[] position = { -93, -1, -52, 46, -66 };
    assertEquals(157, foxandsightseeing.getMin(position));
  }

  @Test
  public void case28() {
    int[] position = { 18, -83, -30, -98, 43, -8, 74, -84, -72, -89 };
    assertEquals(519, foxandsightseeing.getMin(position));
  }

  @Test
  public void case29() {
    int[] position = { 55, 63, -19, 4, -74, -22, -99, 62, -62, 14, -26, 82, 26, 57, -97 };
    assertEquals(822, foxandsightseeing.getMin(position));
  }

  @Test
  public void case30() {
    int[] position = { -58, 37, 22, 55, -31, 83, -46, 46, -41, 81, -36, 48, 23, 41, -33, -8, -70, 70, -1, 33 };
    assertEquals(1189, foxandsightseeing.getMin(position));
  }

  @Test
  public void case31() {
    int[] position = { -42, -96, -50, -62, -60, -91, -16, -29, 99, -70, -46, -73, 70, -3, 83, -54, 79, -18, 56, -22, 12, 8, 94, 11, 27 };
    assertEquals(1359, foxandsightseeing.getMin(position));
  }

  @Test
  public void case32() {
    int[] position = { 40, 65, -63, 36, -95, 35, -42, 28, -44, 59, 53, 75, -49, 61, 54, 82, -34, 51, 3, 19, -50, -48, -64, -13, -41, 62, -80, -18, -53, 100 };
    assertEquals(1798, foxandsightseeing.getMin(position));
  }

  @Test
  public void case33() {
    int[] position = { -47, -60, -18, -30, 9, -81, 59, 56, 99, -29, 51, 48, 97, 80, 83, 43, 78, 44, 85, 10, 75, -66, 20, -43, 64, -78, -46, -68, -59, -85, -1, -22, -8, -95, 100 };
    assertEquals(1767, foxandsightseeing.getMin(position));
  }

  @Test
  public void case34() {
    int[] position = { 13, 38, 27, 64, -32, -10, -44, 10, -51, 51, 26, 59, -61, 31, -65, 52, 25, 43, -34, 74, 15, 71, -25, -6, -55, 54, -82, 57, 29, 87, -8, 99, 40, 63, -93, -87, -90, 22, -75, 2 };
    assertEquals(2367, foxandsightseeing.getMin(position));
  }

  @Test
  public void case35() {
    int[] position = { -78, -11, -40, 61, 27, 62, 26, 68, -76, 79, -81, 88, -82, -50, -64, -49, -68, -65, -94, 14, -29, 28, -47, 86, -35, 71, 48, 89, -46, 18, -53, -33, -71, -27, -43, -20, -45, -6, -93, 19, -100, -75, -96, -89, -90 };
    assertEquals(2470, foxandsightseeing.getMin(position));
  }

  @Test
  public void case36() {
    int[] position = { 70, -98, -95, -97, 31, -27, 20, -30, 77, 67, 74, -79, -49, -55, 25, -4, 2, -67, -14, -37, 6, -36, 95, -12, 17, -80, -3, -66, 82, 3, 28, 15, 91, -19, 59, -26, -7, -60, -22, -76, -45, -78, 84, -52, 78, -20, 52, 32, 51, -53 };
    assertEquals(2929, foxandsightseeing.getMin(position));
  }

  @Test
  public void case37() {
    int[] position = { 4, -9, -26 };
    assertEquals(30, foxandsightseeing.getMin(position));
  }

  @Test
  public void case38() {
    int[] position = { -12, 62, 73, -77 };
    assertEquals(213, foxandsightseeing.getMin(position));
  }

  @Test
  public void case39() {
    int[] position = { 89, -70, -73, -53, 94 };
    assertEquals(323, foxandsightseeing.getMin(position));
  }

  @Test
  public void case40() {
    int[] position = { -11, -2, 4 };
    assertEquals(15, foxandsightseeing.getMin(position));
  }

  @Test
  public void case41() {
    int[] position = { -55, 14, 87, 94 };
    assertEquals(149, foxandsightseeing.getMin(position));
  }

  @Test
  public void case42() {
    int[] position = { -65, 3, 55, 81, 83 };
    assertEquals(148, foxandsightseeing.getMin(position));
  }

  @Test
  public void case43() {
    int[] position = { -27, -12, -95, -4, -31, 66, -67, 6, -89, 91, -79, -44, -85, -30, -69, -8, -70, 87, -3, -1, -49, -14, -97, -75, -90, 78, 12, 33, -84, 29, 1, 62, -68, 23, -64, 100, -21, 25, -59, 36, -92, 31, -35, 55, -15, 54, -54, -16, -65, 41 };
    assertEquals(3608, foxandsightseeing.getMin(position));
  }

  @Test
  public void case44() {
    int[] position = { -29, 23, -75, -8, -43, 50, -25, 3, -57, -35, -44, 5, -85, 70, 46, 77, -45, 94, 14, 64, -61, -16, -70, 18, 6, 30, -59, 60, -77, 8, -52, 31, 11, 86, -78, 54, 51, 87, -95, 9, -46, 82, 76, 97, 28, 98, -96, -41, -56, -1 };
    assertEquals(3320, foxandsightseeing.getMin(position));
  }

  @Test
  public void case45() {
    int[] position = { -38, 21, 12, 87, -99, 17, -24, 56, 11, 16, -76, 81, 63, 88, 10, 59, 31, 89, 6, 58, -7, 19, -39, 40, -57, -36, -47, 72, -44, 53, -77, 92, -56, 91, 5, 73, 49, 94, -71, -17, -48, 43, -12, -10, -64, -42, -51, 55, 13, 90 };
    assertEquals(3174, foxandsightseeing.getMin(position));
  }

  @Test
  public void case46() {
    int[] position = { 100, -100, 99, -99, 98, -98, 97, -97, 96, -96, 95, -95, 94, -94, 93, -93, 92, -92, 91, -91, 90, -90, 89, -89, 88, -88, 87, -87, 86, -86, 85, -85, 84, -84, 83, -83, 82, -82, 81, -81, 80, -80, 79, -79, 78, -78, 77, -77, 76, -76 };
    assertEquals(8226, foxandsightseeing.getMin(position));
  }

  @Test
  public void case47() {
    int[] position = { 100, -100, 99, -99, 98, -98, 97, -97, 96, -96, 95, -95, 94, -94, 93, -93, 92, -92, 91, -91, 90, -90, 89, -89, 88, -88, 87, -87, 86, -86, 85, -85, 84, -84, 83, -83, 82, -82, 81, -81, 80, -80, 79, -79, 78, -78, 77, -77, 76 };
    assertEquals(8074, foxandsightseeing.getMin(position));
  }

  @Test
  public void case48() {
    int[] position = { 1, 4, -1, 3 };
    assertEquals(4, foxandsightseeing.getMin(position));
  }

  @Test
  public void case49() {
    int[] position = { -100, 99, -98, 97, -96, 95, -94, 93, -92, 91, -90, 89, -88, 87, -86, 85, -84, 83, -82, 81, -80, 79, -78, 77, -76, 75, -74, 73, -72, 71, -70, 69, -68, 67, -66, 65, -64, 63, -62, 61, -60, 59, -58, 57, -56, 55, -54, 53, -52, 51 };
    assertEquals(7005, foxandsightseeing.getMin(position));
  }

  @Test
  public void case50() {
    int[] position = { -2, 4, 3 };
    assertEquals(5, foxandsightseeing.getMin(position));
  }

  @Test
  public void case51() {
    int[] position = { 0, 20, 10, -1, 11, 31 };
    assertEquals(51, foxandsightseeing.getMin(position));
  }

  @Test
  public void case52() {
    int[] position = { 100, -100, 99, -99, 98, -98, 97, -97, 96, -96, 95, -95, 94, -94, 93, -93, 92, -92, 91, -91, 90, -90, 89, -89, 88, -88, 87, -87, 86, -86, 85, -85, 84, -84, 83, -83, 82, -82, 81, -81, 80, -80, 79, -79, 78, -78, 77, -77, 76 };
    assertEquals(8074, foxandsightseeing.getMin(position));
  }

  @Test
  public void case53() {
    int[] position = { 100, -100, 99, -99, 98, -98, 97, -97, 96, -96, 95, -95, -94, 94, -93, 93, -92, 92, -91, 91, -90, 90, -89, 89 };
    assertEquals(3761, foxandsightseeing.getMin(position));
  }

  @Test
  public void case54() {
    int[] position = { 1, 2, 3, 10 };
    assertEquals(9, foxandsightseeing.getMin(position));
  }

  @Test
  public void case55() {
    int[] position = { 74, 84, 92, 23, 5, -70, -47, -59, 24, -86, -39, 99, 85, -42, 54, 100, 47, -3, 42, 38 };
    assertEquals(836, foxandsightseeing.getMin(position));
  }

  @Test
  public void case56() {
    int[] position = { -100, 100, -99, 99, -98, 98, -97, 97, -96, 96, -95, 95, -94, 94, -93, 93, -92, 92, -91, 91, -90, 90, -89, 89, -88, 88, -87, 87, -86, 86, -85, 85, -84, 84, -83, 83, -82, 82, -81, 81, -80, 80, -79, 79, -78, 78, -77, 77, -76, 76 };
    assertEquals(8226, foxandsightseeing.getMin(position));
  }

  @Test
  public void case57() {
    int[] position = { 10, 15, 20 };
    assertEquals(10, foxandsightseeing.getMin(position));
  }

  @Test
  public void case58() {
    int[] position = { -5, -6, 0, 5, 3, 4 };
    assertEquals(11, foxandsightseeing.getMin(position));
  }

  @Test
  public void case59() {
    int[] position = { 0, -3, 4, 6 };
    assertEquals(6, foxandsightseeing.getMin(position));
  }

  @Test
  public void case60() {
    int[] position = { 1, 2, 10, 30, 50, 80 };
    assertEquals(79, foxandsightseeing.getMin(position));
  }

  @Test
  public void case61() {
    int[] position = { 0, 1, 2, 3, 50, 51, 52, 53 };
    assertEquals(53, foxandsightseeing.getMin(position));
  }

  @Test
  public void case62() {
    int[] position = { 0, 1, 2 };
    assertEquals(2, foxandsightseeing.getMin(position));
  }

  @Test
  public void case63() {
    int[] position = { 1, 5, 4, 2, 3 };
    assertEquals(6, foxandsightseeing.getMin(position));
  }

  @Test
  public void case64() {
    int[] position = { 1, 4, 6, 5 };
    assertEquals(4, foxandsightseeing.getMin(position));
  }

  @Test
  public void case65() {
    int[] position = { 1, 20, 50 };
    assertEquals(49, foxandsightseeing.getMin(position));
  }

  @Test
  public void case66() {
    int[] position = { 1, 2, 3, 4, 5, 100 };
    assertEquals(99, foxandsightseeing.getMin(position));
  }

  @Test
  public void case67() {
    int[] position = { 3, 2, 11, 13 };
    assertEquals(10, foxandsightseeing.getMin(position));
  }

  @Test
  public void case68() {
    int[] position = { 10, 20, 30, 31, 38, 32, 33 };
    assertEquals(23, foxandsightseeing.getMin(position));
  }

}
