package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class HittingPerfectTargetTest {
  double DELTA = 1.0e-09;
  HittingPerfectTarget hittingperfecttarget = new HittingPerfectTarget();

  @Test
  public void case1() {
    int[] x1 = { -100, -100, 100, 100 };
    int[] y1 = { -100, 100, -100, 100 };
    int[] x2 = { -100, -100, 100, 100 };
    int[] y2 = { -100, 100, -100, 100 };
    assertEquals(1.0, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 1.0);
  }

  @Test
  public void case2() {
    int[] x1 = { -99, -98, 0 };
    int[] y1 = { -99, 99, 0 };
    int[] x2 = { 99, 98, 0 };
    int[] y2 = { -99, 99, 0 };
    assertEquals(2.475186257765897e-05, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 2.475186257765897e-05);
  }

  @Test
  public void case3() {
    int[] x1 = { 0, 0, 1, 1 };
    int[] y1 = { 0, 1, 0, 1 };
    int[] x2 = { -54, -99, -100, -100 };
    int[] y2 = { -54, 99, 100, -100 };
    assertEquals(0.0, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA);
  }

  @Test
  public void case4() {
    int[] x1 = { -1, 1, -30, 30, 0 };
    int[] y1 = { -1, -1, 30, 30, 50 };
    int[] x2 = { -2, 2, -60, 60, 0 };
    int[] y2 = { -2, -2, 60, 60, 100 };
    assertEquals(0.03895943169723522, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.03895943169723522);
  }

  @Test
  public void case5() {
    int[] x1 = { -1, 1, -30, 30, 0 };
    int[] y1 = { -1, -1, 30, 30, 50 };
    int[] x2 = { -2, 2, -60, 60, 0 };
    int[] y2 = { -2, -2, 40, 40, 41 };
    assertEquals(0.03551892279894062, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.03551892279894062);
  }

  @Test
  public void case6() {
    int[] x1 = { -64, -77, 83, 91 };
    int[] y1 = { 51, -54, -94, -54 };
    int[] x2 = { 4, 92, 17, -91 };
    int[] y2 = { -83, -43, 85, -35 };
    assertEquals(0.22479641593029875, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.22479641593029875);
  }

  @Test
  public void case7() {
    int[] x1 = { -68, -81, 100 };
    int[] y1 = { -6, 63, 81 };
    int[] x2 = { -21, 33, 66 };
    int[] y2 = { 94, -59, 43 };
    assertEquals(0.034454592708101285, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.034454592708101285);
  }

  @Test
  public void case8() {
    int[] x1 = { -74, -94, 43,  92,  16,  51, -99, 97 };
    int[] y1 = { -76,  75, 91, -66, -97, -92, -67, 84 };
    int[] x2 = { 96, 44, -86, -91, 81, 62, -72, -92 };
    int[] y2 = { 8, 100, -32, 93, -27, -59, -88, 72 };
    assertEquals(0.6302566768149304, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.6302566768149304);
  }

  @Test
  public void case9() {
    int[] x1 = { -69, -90, -18, -55, 72, 52, -56, -94, -73, 97, 90 };
    int[] y1 = { -94, -24, 80, 62, -79, -92, -99, 8, 43, 46, 75 };
    int[] x2 = { 95, -77, 56, -95, 14, -32, -88, -98, 54, 18, 98 };
    int[] y2 = { -90, 64, 31, -14, -98, 72, -90, 21, -99, 67, -36 };
    assertEquals(0.5832776416425336, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5832776416425336);
  }

  @Test
  public void case10() {
    int[] x1 = { 53, 98, -98, 98, -50, 93, -63, -91, 92, -3, 13, 35, -40, -73 };
    int[] y1 = { -84, -45, -66, -6, -99, 77, 72, 40, -77, 97, 100, 95, -99, 67 };
    int[] x2 = { 53, 98, -98, 98, -50, 93, -63, -91, 92, -3, 13, 35, -40, -73 };
    int[] y2 = { -84, -45, -66, -6, -99, 77, 72, 40, -77, 97, 100, 95, -99, 67 };
    assertEquals(0.8052028415138239, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.8052028415138239);
  }

  @Test
  public void case11() {
    int[] x1 = { -86, -34, 45, -41, -96, 91, 9, 76, 48, -99, 96 };
    int[] y1 = { 81, -95, -95, -92, -62, 47, -100, 74, 89, 39, -84 };
    int[] x2 = { -86, 74, 98, -62, 51, -5, 96, 2, -93, -48, 100 };
    int[] y2 = { -50, 87, -23, 91, -55, 95, 79, -77, 56, -64, 25 };
    assertEquals(0.632014059057944, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.632014059057944);
  }

  @Test
  public void case12() {
    int[] x1 = { 81, -14, -84, -24, 98, 86, 40, -62, -89, -92, 89 };
    int[] y1 = { -99, -100, 44, 85, -86, 83, 98, -94, -30, -84, 71 };
    int[] x2 = { 90, 96, -41, -88, -58, 41, 52, 62, -28, -97, 93 };
    int[] y2 = { 32, -83, 100, -1, -88, -99, 92, 83, -94, 97, 15 };
    assertEquals(0.7186950818049058, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.7186950818049058);
  }

  @Test
  public void case13() {
    int[] x1 = { 95, -84, 36 };
    int[] y1 = { 61, -67, -67 };
    int[] x2 = { 99, 56, -10 };
    int[] y2 = { 67, 24, 10 };
    assertEquals(0.00598995074379347, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.00598995074379347);
  }

  @Test
  public void case14() {
    int[] x1 = { 0, 100, 0 };
    int[] y1 = { 0, 0, 100 };
    int[] x2 = { 0, -100, 0 };
    int[] y2 = { 0, 0, 100 };
    assertEquals(0.002499938120343556, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.002499938120343556);
  }

  @Test
  public void case15() {
    int[] x1 = { 0, -96, 72, -26 };
    int[] y1 = { 81, -96, 72, -69 };
    int[] x2 = { -21, 69, -44, -73 };
    int[] y2 = { -48, 77, 88, 14 };
    assertEquals(0.16430286379050024, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.16430286379050024);
  }

  @Test
  public void case16() {
    int[] x1 = { -71, 100, -58, 70, 2 };
    int[] y1 = { -94, -39, 93, 82, -86 };
    int[] x2 = { 45, -78, 45, -85, 96 };
    int[] y2 = { -91, -42, 58, 9, -38 };
    assertEquals(0.3607088933442242, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.3607088933442242);
  }

  @Test
  public void case17() {
    int[] x1 = { 91, 80, -34, 27, -99, 48, -95, -100, -29 };
    int[] y1 = { 45, -58, 100, -83, 25, 97, -12, 82, -100 };
    int[] x2 = { 91, -100, -79, -60, 59, 93, -41, 93, -83 };
    int[] y2 = { -46, 59, -1, -48, -98, 84, -92, 55, 100 };
    assertEquals(0.6809237395113983, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.6809237395113983);
  }

  @Test
  public void case18() {
    int[] x1 = { -31, -92, -84, -91, 99, 64, -36, -66, -99, 90, 95, 98, 62 };
    int[] y1 = { -98, -79, -93, 72, -17, -97, 100, 97, -45, 42, -93, -61, 71 };
    int[] x2 = { 57, 87, -21, -78, -100, -99, -73, -85, 63, 90, 29, -46, 90 };
    int[] y2 = { -94, -72, 93, 63, 19, -51, -94, -93, 90, 4, -95, 83, 80 };
    assertEquals(0.7613425410262122, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.7613425410262122);
  }

  @Test
  public void case19() {
    int[] x1 = { -100, -100, -99 };
    int[] y1 = { -100, 0, 100 };
    int[] x2 = { 100, 100, 99 };
    int[] y2 = { 100, 0, -100 };
    assertEquals(0.0, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA);
  }

  @Test
  public void case20() {
    int[] x1 = { -100, -100, -99, -1 };
    int[] y1 = { -100, 0, 100, 0 };
    int[] x2 = { 100, 100, 99, 1 };
    int[] y2 = { 100, 0, -100, 0 };
    assertEquals(0.0, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA);
  }

  @Test
  public void case21() {
    int[] x1 = { -51, -55, 72, -78, -97, 85, -94, -23, 95, 96, 30, -99 };
    int[] y1 = { -94, 98, 47, 97, -40, 20, -66, -100, -71, -23, 75, 78 };
    int[] x2 = { -58, -97, -64, -72, 57, 78, -76, 90, 89, 11, 49, -12 };
    int[] y2 = { -62, 84, 98, -11, -95, 43, 95, -76, -50, 97, 89, -94 };
    assertEquals(0.6379297542140046, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.6379297542140046);
  }

  @Test
  public void case22() {
    int[] x1 = { -87, 41, -75, 88, 96, -66 };
    int[] y1 = { 42, -63, -44, -58, 82, -67 };
    int[] x2 = { 77, 81, -10, -94, 85, -95 };
    int[] y2 = { -86, 55, 42, 17, -45, -62 };
    assertEquals(0.4194945669661642, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.4194945669661642);
  }

  @Test
  public void case23() {
    int[] x1 = { -92, -31, -11, 97, 98, 60, -88 };
    int[] y1 = { -85, 25, 61, 48, 75, -81, -98 };
    int[] x2 = { -94, -70, 52, -96, -11, 85, 95 };
    int[] y2 = { -63, 98, -91, 53, -96, 98, -57 };
    assertEquals(0.47501299472785324, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.47501299472785324);
  }

  @Test
  public void case24() {
    int[] x1 = { 72, -21, -40, 26, 85, -97, 5, 98, 99, -90, 74, 100, -16, 47, -98 };
    int[] y1 = { 82, -94, 99, 98, -70, 64, -98, -59, 28, 74, -79, 4, 100, -89, -36 };
    int[] x2 = { 72, -21, -40, 26, 85, -97, 5, 98, 99, -90, 74, 100, -16, 47, -98 };
    int[] y2 = { 82, -94, 99, 98, -70, 64, -98, -59, 28, 74, -79, 4, 100, -89, -36 };
    assertEquals(0.8032969480953441, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.8032969480953441);
  }

  @Test
  public void case25() {
    int[] x1 = { -96, -99, -24, -34, 2, -11, 99, 75, -87, 96 };
    int[] y1 = { -96, -77, -90, 99, 100, 100, -77, -81, 42, 82 };
    int[] x2 = { 85, 95, -92, 74, -27, 67, 3, -88, -66, -56 };
    int[] y2 = { 98, -57, -46, -68, 94, -70, -83, 59, 84, -94 };
    assertEquals(0.7268631964555333, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.7268631964555333);
  }

  @Test
  public void case26() {
    int[] x1 = { 89, -91, 2, 96, -63, 84 };
    int[] y1 = { 52, -71, 66, 2, 65, -96 };
    int[] x2 = { 50, 54, -96, -27, 4, -83 };
    int[] y2 = { -61, -90, 58, -75, 53, 98 };
    assertEquals(0.3034825870646766, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.3034825870646766);
  }

  @Test
  public void case27() {
    int[] x1 = { -96, -99, -24, -34, 2, -11, 99, 75, -87, 96, 73, -66 };
    int[] y1 = { -96, -77, -90, 99, 100, 100, -77, -81, 42, 82, 99, 89 };
    int[] x2 = { -69, -92, 35, 47, -25, -95 };
    int[] y2 = { -66, 57, -77, 88, -76, -24 };
    assertEquals(0.459790599242593, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.459790599242593);
  }

  @Test
  public void case28() {
    int[] x1 = { 99, -25, -93, -16, -44, -92, 98, -88, 73, -91, 51, 91 };
    int[] y1 = { -93, 95, 29, 96, -98, -85, 75, -98, 93, 74, 98, -94 };
    int[] x2 = { -40, -79, 95, 82, -18, 95 };
    int[] y2 = { -49, -19, 87, -80, 74, -5 };
    assertEquals(0.5076607014677854, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5076607014677854);
  }

  @Test
  public void case29() {
    int[] x1 = { -98, 92, 91, 80, -34, 27, 48, -100, -29 };
    int[] y1 = { -84, 66, 45, -58, 100, -83, 97, 82, -100 };
    int[] x2 = { -71, 100, -58, 70, 2 };
    int[] y2 = { -94, -39, 93, 82, -86 };
    assertEquals(0.5934754090245291, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5934754090245291);
  }

  @Test
  public void case30() {
    int[] x1 = { 96, -96, -74, 4, 97, 93, 21, -91, -34 };
    int[] y1 = { -38, -43, -71, -98, -3, 98, -98, 91, -90 };
    int[] x2 = { 28, -72, 64, -93, -97, -74 };
    int[] y2 = { -33, -71, 82, -53, -4, 72 };
    assertEquals(0.4223162793000173, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.4223162793000173);
  }

  @Test
  public void case31() {
    int[] x1 = { 63, -78, -98, 80, 85, -30, -99, 28, -86, -19, 45 };
    int[] y1 = { 63, -95, 77, -5, -92, -98, -82, -96, 81, 85, -95 };
    int[] x2 = { 91, 9, -97, 76, -20, 48 };
    int[] y2 = { 47, -100, 42, 74, -77, 89 };
    assertEquals(0.4243459320313854, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.4243459320313854);
  }

  @Test
  public void case32() {
    int[] x1 = { -45, -84, 43, -28, -98, 20, 100, -100, 100, -55, 67 };
    int[] y1 = { 96, -68, -83, -83, 15, -88, 95, -35, 89, -76, -40 };
    int[] x2 = { -89, 86, -33, 82, -77 };
    int[] y2 = { 94, -93, 97, 62, -54 };
    assertEquals(0.5646394891215564, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5646394891215564);
  }

  @Test
  public void case33() {
    int[] x1 = { -94, -73, -92, 5, 91, 95, 7, 56, 51, -64 };
    int[] y1 = { 47, -90, 32, 98, 74, -48, -93, -89, 89, 100 };
    int[] x2 = { 25, 40, 100, -81, 54, -76 };
    int[] y2 = { 74, -100, -73, -94, 68, 39 };
    assertEquals(0.5660008415633276, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5660008415633276);
  }

  @Test
  public void case34() {
    int[] x1 = { 96, -93, 14, -100, -38, 69, -100, 97, -78, -88 };
    int[] y1 = { 66, -89, -99, 80, 95, 91, 33, -83, 96, 93 };
    int[] x2 = { -84, 71, 26, -73, 43, 62, -28 };
    int[] y2 = { -21, 44, 82, -62, 93, -96, -75 };
    assertEquals(0.450137372837306, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.450137372837306);
  }

  @Test
  public void case35() {
    int[] x1 = { -70, 83, -86, 67, -98, -31, 84, 44, 100, -97 };
    int[] y1 = { -100, 73, 85, -79, -23, 93, -56, 93, 41, 77 };
    int[] x2 = { 14, 80, -94, 93, 80 };
    int[] y2 = { 98, -71, 17, 45, 76 };
    assertEquals(0.43434568451275957, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.43434568451275957);
  }

  @Test
  public void case36() {
    int[] x1 = { 12, -97, 88, 71, -68, 79, -28, 93, -88, 84, -77 };
    int[] y1 = { -100, 36, -80, 89, 77, -93, 100, 7, -28, -89, -81 };
    int[] x2 = { -52, -55, -36, 56, 73, 20, 68 };
    int[] y2 = { -63, -49, 52, 28, -43, -84, -48 };
    assertEquals(0.30818544095443184, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.30818544095443184);
  }

  @Test
  public void case37() {
    int[] x1 = { -100, 95, -3, -76, -100, 62, 57, 100, 84, -79, 43, 92 };
    int[] y1 = { -29, -33, 91, -76, -17, 95, 96, 32, -45, 73, -88, 62 };
    int[] x2 = { -22, -80, -99, 92, 81, -94 };
    int[] y2 = { -78, -58, 52, -56, 62, 16 };
    assertEquals(0.5319917823816243, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5319917823816243);
  }

  @Test
  public void case38() {
    int[] x1 = { 93, -97, 96, 15, 34, -86, -99, -100, 85, 7, 98 };
    int[] y1 = { 15, 98, -87, -97, 92, -94, -27, 3, 53, 98, -22 };
    int[] x2 = { -87, 48, 31, -87, 7, -86 };
    int[] y2 = { -57, -58, -92, 57, 78, -82 };
    assertEquals(0.4541224227123091, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.4541224227123091);
  }

  @Test
  public void case39() {
    int[] x1 = { 97, -99, 65, -98, 80, 7, -87, 100, -21, -66 };
    int[] y1 = { -99, -24, 87, -71, 85, -96, 68, 81, 94, -79 };
    int[] x2 = { 73, -15, -72, -76, -76, 61, -66, 75 };
    int[] y2 = { -70, -98, 11, -74, -38, -95, -94, 84 };
    assertEquals(0.5018935174871909, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5018935174871909);
  }

  @Test
  public void case40() {
    int[] x1 = { 43, 92, 16, 51, -99, 97, -93, -78, -38 };
    int[] y1 = { 91, -66, -97, -92, -67, 84, 95, -81, -99 };
    int[] x2 = { -80, 83, -70, -90, 55 };
    int[] y2 = { 89, -76, -12, 65, 53 };
    assertEquals(0.40184648894829333, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.40184648894829333);
  }

  @Test
  public void case41() {
    int[] x1 = { -98, 66, -95, -99, 97, 77, -25, -70 };
    int[] y1 = { -75, 96, 48, 6, 54, -51, -93, 98 };
    int[] x2 = { 52, -71, 66, 16 };
    int[] y2 = { -91, 84, 96, -63 };
    assertEquals(0.3403628623053885, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.3403628623053885);
  }

  @Test
  public void case42() {
    int[] x1 = { -96, 98, -57, -12, 10, 94, -83, 84, -94 };
    int[] y1 = { -82, 95, 91, -92, -87, -44, -88, -60, 85 };
    int[] x2 = { -90, -49, -75, 53, 10, 98 };
    int[] y2 = { 4, -96, 4, -84, -4, -45 };
    assertEquals(0.27838419841093043, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.27838419841093043);
  }

  @Test
  public void case43() {
    int[] x1 = { -41, -99, 96, 54, -77, 100, -99, 95, -93 };
    int[] y1 = { 98, -4, 93, -91, 93, -16, 17, -75, -89 };
    int[] x2 = { -74, -39, 48, -64, 86, -41, 17 };
    int[] y2 = { 44, -32, -48, 5, 28, 68, 93 };
    assertEquals(0.36306032028910173, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.36306032028910173);
  }

  @Test
  public void case44() {
    int[] x1 = { 26, -30, 76, 82, 95, -77, 92, -95, 14, -88, -98 };
    int[] y1 = { 97, 98, 88, 43, -90, 64, -59, -14, -98, -90, 21 };
    int[] x2 = { 54, 18, -75, 98, -57 };
    int[] y2 = { -99, 67, -54, -36, 7 };
    assertEquals(0.4037028786416178, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.4037028786416178);
  }

  @Test
  public void case45() {
    int[] x1 = { 91, -81, -85, -12, -97, 91, -90, 85, 80, -69 };
    int[] y1 = { -47, -96, -86, 93, 8, -25, 88, -91, 84, 91 };
    int[] x2 = { 6, -4, 90, 16, -9, 42, -13 };
    int[] y2 = { 94, -40, 7, 98, -32, -98, 52 };
    assertEquals(0.2877899061904408, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.2877899061904408);
  }

  @Test
  public void case46() {
    int[] x1 = { 13, -90, -55, -35, 58, 100, 93, -88, -100 };
    int[] y1 = { -100, 26, 75, 88, 96, -86, 81, -92, -23 };
    int[] x2 = { -85, 52, 90, -99 };
    int[] y2 = { 95, 81, -65, -77 };
    assertEquals(0.5995643672186332, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5995643672186332);
  }

  @Test
  public void case47() {
    int[] x1 = { 53, 91, -39, 92, -36, -96, -94, -68 };
    int[] y1 = { 100, -77, -100, 79, 98, 64, -39, -90 };
    int[] x2 = { -67, 73, -99, 71, 54, 22, 43 };
    int[] y2 = { 32, -56, -18, -94, 90, -73, 97 };
    assertEquals(0.4518204994925868, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.4518204994925868);
  }

  @Test
  public void case48() {
    int[] x1 = { 90, 91, -27, -54, 41, -85, 57, 87, -21, -78, -100 };
    int[] y1 = { 75, -53, -94, 89, 96, -84, -94, -72, 93, 63, 19 };
    int[] x2 = { 17, -39, -99, 26, -73, -85, -4, -19, 48 };
    int[] y2 = { -4, -7, -51, -58, -94, -93, -81, -90, -3 };
    assertEquals(0.21098487661196505, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.21098487661196505);
  }

  @Test
  public void case49() {
    int[] x1 = { 90, -36, -95, 89, 83, -58, -29, 53, 1, 59, -87, -56 };
    int[] y1 = { 55, -89, 67, -40, -81, 90, 95, 91, 94, -95, -33, -80 };
    int[] x2 = { 66, -77, -60, -77, -13, -69, -20 };
    int[] y2 = { -54, -69, -94, -70, 58, -11, -86 };
    assertEquals(0.2881364322665281, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.2881364322665281);
  }

  @Test
  public void case50() {
    int[] x1 = { 72, -14, -98, -70, 82, -51, 85, -73, -93 };
    int[] y1 = { 83, -85, -51, -71, -91, -77, 12, 96, 14 };
    int[] x2 = { -66, 100, 79, 100, -74, 73 };
    int[] y2 = { 44, -75, 86, -26, 74, -93 };
    assertEquals(0.3984554837751541, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.3984554837751541);
  }

  @Test
  public void case51() {
    int[] x1 = { 96, 2, -50, 57, -32, -99, -39, 99, 56, -100, -96 };
    int[] y1 = { 6, -94, -79, -100, -85, -17, 98, -81, 98, -42, 48 };
    int[] x2 = { 95, 98, -8, 73, 74, -80 };
    int[] y2 = { 47, 69, -84, 67, -28, 14 };
    assertEquals(0.3457587683473181, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.3457587683473181);
  }

  @Test
  public void case52() {
    int[] x1 = { 97, -100, 85, 91, 76, 95, 13, 81, -94, 25 };
    int[] y1 = { -50, -94, 42, -69, 52, 10, 97, -92, 98, -96 };
    int[] x2 = { 39, -74, -48, 98, -96, 86 };
    int[] y2 = { 51, 54, 74, -63, -71, 25 };
    assertEquals(0.5308284448404742, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5308284448404742);
  }

  @Test
  public void case53() {
    int[] x1 = { 77, -27, -95, -40, 47, -88, 10, -91, 97, 61, -95 };
    int[] y1 = { 92, -85, -92, 94, -74, 61, 98, -94, 1, -69, -51 };
    int[] x2 = { -65, 58, -96, 19, 71, -79, 74 };
    int[] y2 = { 96, -30, 8, 20, -75, -49, -57 };
    assertEquals(0.37073339768817604, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.37073339768817604);
  }

  @Test
  public void case54() {
    int[] x1 = { -94, 72, -100, 66, 88, -65, -9, 100, -44 };
    int[] y1 = { -49, -88, -6, -94, -51, 75, 99, 100, -97 };
    int[] x2 = { 61, 43, 12, -44, -86, -78 };
    int[] y2 = { -15, -73, 81, 94, -59, 45 };
    assertEquals(0.445781045023638, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.445781045023638);
  }

  @Test
  public void case55() {
    int[] x1 = { 55, -98, 87, -79, -61, 69, 95, -96, -24, 50, 83, -39 };
    int[] y1 = { -30, -84, 76, -87, 88, 87, 30, 63, -82, 98, -11, 95 };
    int[] x2 = { -37, 95, -82, -96, -74, 92 };
    int[] y2 = { 57, -72, -81, -71, -5, 95 };
    assertEquals(0.5015717432736814, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5015717432736814);
  }

  @Test
  public void case56() {
    int[] x1 = { -89, 86, 77, 72, 93, -77, 47, -100, 86, -57, -63 };
    int[] y1 = { -30, 56, 93, -91, -37, 86, 98, 77, -69, -78, 88 };
    int[] x2 = { 89, 95, 49, 6, -77, 83 };
    int[] y2 = { -92, -63, 52, 81, -92, 9 };
    assertEquals(0.4250142323209822, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.4250142323209822);
  }

  @Test
  public void case57() {
    int[] x1 = { 27, 98, -46, 94, 75, 84, -94, -92 };
    int[] y1 = { 93, 67, -96, -77, -96, 91, -75, 97 };
    int[] x2 = { 39, 47, -34, -68, -89, -89, 64 };
    int[] y2 = { -93, 20, -75, -56, -23, -38, -82 };
    assertEquals(0.26788940867800304, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.26788940867800304);
  }

  @Test
  public void case58() {
    int[] x1 = { 54, 98, -100, 77, 36, -89, -95, -100, -94, 97, 83 };
    int[] y1 = { -83, 64, -59, -68, 91, -82, -72, -28, 61, 5, 80 };
    int[] x2 = { 49, -93, -72, 1, -95, 85, 93 };
    int[] y2 = { -89, -49, -73, 96, -23, -54, 96 };
    assertEquals(0.6084255340214351, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.6084255340214351);
  }

  @Test
  public void case59() {
    int[] x1 = { 99, 92, -69, 96, 59, -91, -79, -85, -94, 76 };
    int[] y1 = { -38, -85, -91, 74, 98, -9, -74, 95, 8, 98 };
    int[] x2 = { 41, -59, 68, -61, -13, -55, 100 };
    int[] y2 = { -65, -69, -19, 18, 88, 93, 51 };
    assertEquals(0.4789980446028564, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.4789980446028564);
  }

  @Test
  public void case60() {
    int[] x1 = { -55, -92, -99, 97, -91, -81, 82, 99 };
    int[] y1 = { -96, 42, -62, 21, -75, 83, -99, 88 };
    int[] x2 = { 79, -37, 44, -33, -67 };
    int[] y2 = { 48, -72, -86, 68, -14 };
    assertEquals(0.3904358802999926, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.3904358802999926);
  }

  @Test
  public void case61() {
    int[] x1 = { -99, 79, -87, -100, 98, 38 };
    int[] y1 = { 100, -88, -97, 12, 95, -100 };
    int[] x2 = { 90, -32, 4, 92, 53 };
    int[] y2 = { -90, -71, 38, -11, 88 };
    assertEquals(0.32830870523006855, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.32830870523006855);
  }

  @Test
  public void case62() {
    int[] x1 = { 61, -98, -79, -19, 77, -97, 100, -89, 97, -74, -7 };
    int[] y1 = { -74, 50, 72, -91, 99, -32, -21, -66, 80, -99, 98 };
    int[] x2 = { 45, 6, -17, 99, -82, -15 };
    int[] y2 = { -26, -43, 80, 55, 62, -30 };
    assertEquals(0.3147446845375114, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.3147446845375114);
  }

  @Test
  public void case63() {
    int[] x1 = { 99, -94, 84, 98, 97, -28, 81, -78, -100, 66, 16 };
    int[] y1 = { 2, -87, -92, 72, -56, -97, 85, -94, 95, 96, -99 };
    int[] x2 = { -61, -99, -65, 4, -27, 74, 79 };
    int[] y2 = { 97, 36, -25, 87, -66, 34, -62 };
    assertEquals(0.5196901066805277, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5196901066805277);
  }

  @Test
  public void case64() {
    int[] x1 = { -80, 84, 98, -95, -85, 43, 46, -68, 97, 84, 95, -94 };
    int[] y1 = { -97, -64, -34, -33, 78, -76, 90, 89, -52, 87, 32, -67 };
    int[] x2 = { 54, -71, 10, 35, -71, 89, -25 };
    int[] y2 = { 47, 75, -98, 85, -79, -57, 83 };
    assertEquals(0.5545159773272939, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5545159773272939);
  }

  @Test
  public void case65() {
    int[] x1 = { -99, 4, -12, -52, 98, -99, 51, -85, 8, 98, 75 };
    int[] y1 = { 0, 98, -96, 92, 11, -91, 72, 60, 97, 37, -100 };
    int[] x2 = { -78, -81, -83, 55, 76, 60, 71 };
    int[] y2 = { 29, 0, -90, 52, -73, -100, 2 };
    assertEquals(0.5089477983218237, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5089477983218237);
  }

  @Test
  public void case66() {
    int[] x1 = { 78, 60, 6, -86, 52, -45, 100, -94, -99, 91, -62 };
    int[] y1 = { -82, -97, 81, -57, 54, -82, -28, 61, -7, 2, 79 };
    int[] x2 = { 41, -63, -41, 88, 42, -67, 17 };
    int[] y2 = { -91, 36, 97, -83, 8, 47, -93 };
    assertEquals(0.31231900200490087, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.31231900200490087);
  }

  @Test
  public void case67() {
    int[] x1 = { 100, -78, 78, -35, 57, 81, -93, 9, 61, 97 };
    int[] y1 = { -75, 58, 41, 78, 59, -93, -92, 84, -99, -43 };
    int[] x2 = { -77, 44, 4, -44, 23, 32 };
    int[] y2 = { 82, -29, -79, -86, 85, 60 };
    assertEquals(0.36192173461052946, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.36192173461052946);
  }

  @Test
  public void case68() {
    int[] x1 = { 62, -98, -82, 89, 99, 98, 48, -64, 96 };
    int[] y1 = { -94, -89, 49, -58, 37, -16, 100, 87, 68 };
    int[] x2 = { -40, 61, -76, 58, 71, -70 };
    int[] y2 = { 68, 84, -22, -54, 14, -52 };
    assertEquals(0.402960322764288, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.402960322764288);
  }

  @Test
  public void case69() {
    int[] x1 = { -81, -92, 4, 100, -97, -100, -94, 98, 87, -59, -98, -72, -53 };
    int[] y1 = { -64, 86, -96, 43, 18, 66, -12, -81, 85, -97, 79, 98, 99 };
    int[] x2 = { 74, -79, 26, 1, -96, 76, 100, -89 };
    int[] y2 = { 74, 56, -95, 100, 27, -96, 47, -4 };
    assertEquals(0.6279795054577857, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.6279795054577857);
  }

  @Test
  public void case70() {
    int[] x1 = { -98, -32, -96, -43, -92, 100, 71, 90, 80 };
    int[] y1 = { -36, 99, 44, 92, -86, -51, -87, 58, 97 };
    int[] x2 = { 79, 58, -43, 76, -95 };
    int[] y2 = { -82, 98, -6, 36, -74 };
    assertEquals(0.4274646667161704, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.4274646667161704);
  }

  @Test
  public void case71() {
    int[] x1 = { -28, 93, -88, 76, 97, -57, 81, -87 };
    int[] y1 = { 100, -10, -91, 94, 67, -100, -98, 28 };
    int[] x2 = { -51, -66, 0, -65, 2, -51 };
    int[] y2 = { -76, 45, -100, -38, 47, 83 };
    assertEquals(0.23927625553822926, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.23927625553822926);
  }

  @Test
  public void case72() {
    int[] x1 = { 97, -35, -70, -98, -91, 96, 56, 90, -100 };
    int[] y1 = { -79, 95, -87, -50, 70, 83, -96, 100, 52 };
    int[] x2 = { 84, -73, -81, 8, 97, 52 };
    int[] y2 = { -71, -66, 4, -95, -38, 81 };
    assertEquals(0.5048142372713547, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5048142372713547);
  }

  @Test
  public void case73() {
    int[] x1 = { 85, -99, -100, 99, -98, -78, 89, 39, 21, -13, 53, -71 };
    int[] y1 = { 62, 44, 34, 26, -87, 92, -17, -74, 98, -92, 92, 96 };
    int[] x2 = { 78, 74, -69, -16, -66, 71 };
    int[] y2 = { -32, 97, 12, 88, 67, -70 };
    assertEquals(0.3992227915150615, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.3992227915150615);
  }

  @Test
  public void case74() {
    int[] x1 = { 91, -42, 97, -97, 12, 69, -76, -98, 53, -76 };
    int[] y1 = { -75, 98, -36, -30, 99, -82, -96, 72, 90, 88 };
    int[] x2 = { 65, -80, -23, 51, 74, -11, -100 };
    int[] y2 = { 84, 37, -30, -62, 20, 100, 8 };
    assertEquals(0.42370238360436624, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.42370238360436624);
  }

  @Test
  public void case75() {
    int[] x1 = { 57, 85, -74, -92, -47, 3, -91, -90, -81, -72, 71 };
    int[] y1 = { -98, 95, -92, 45, -100, 99, 4, -35, 85, 99, -97 };
    int[] x2 = { -71, 35, -73, -83, 92, 56 };
    int[] y2 = { 78, 59, 73, 39, -38, -100 };
    assertEquals(0.36825821143041015, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.36825821143041015);
  }

  @Test
  public void case76() {
    int[] x1 = { -51, 99, 28, 100, -84, -85, 0, 84, -59, 96, 72 };
    int[] y1 = { -97, -81, -96, -47, -68, -12, -98, 88, 84, 83, 89 };
    int[] x2 = { 38, 94, -97, -96, -88, 81, 26 };
    int[] y2 = { -58, 50, 15, -74, 83, -30, 68 };
    assertEquals(0.5188485433528873, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.5188485433528873);
  }

  @Test
  public void case77() {
    int[] x1 = { 100, 100, 99, -100, -100 };
    int[] y1 = { 99, -100, 100, -100, 100 };
    int[] x2 = { -100, -100, -99, 100, 100 };
    int[] y2 = { -99, 100, -100, 100, -100 };
    assertEquals(0.9999504962748447, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.9999504962748447);
  }

  @Test
  public void case78() {
    int[] x1 = { 0, 1, 2, 3, 4, 5, 6, 7,  7,  6,  5,  4,  3,  2,  1 };
    int[] y1 = { 0, 3, 5, 6, 6, 5, 3, 0, -1, -4, -6, -7, -7, -6, -4 };
    int[] x2 = { 0, 1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 3, 2, 1 };
    int[] y2 = { 0, 3, 5, 6, 6, 5, 3, 0, -1, -4, -6, -7, -7, -6, -4 };
    assertEquals(0.0017573822430137869, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 0.0017573822430137869);
  }

  @Test
  public void case79() {
    int[] x1 = { 0, 0, 1, 1 };
    int[] y1 = { 0, 1, 0, 1 };
    int[] x2 = { -54, -99, -100, -100 };
    int[] y2 = { -54, 99, 100, -100 };
    assertEquals(0.0, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA);
  }

  @Test
  public void case80() {
    int[] x1 = { -99, -98, 0 };
    int[] y1 = { -99, 99, 0 };
    int[] x2 = { 99, 98, 0 };
    int[] y2 = { -99, 99, 0 };
    assertEquals(2.475186257765897e-05, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 2.475186257765897e-05);
  }

  @Test
  public void case81() {
    int[] x1 = { -100, -100, 100, 100 };
    int[] y1 = { -100, 100, -100, 100 };
    int[] x2 = { -100, -100, 100, 100 };
    int[] y2 = { -100, 100, -100, 100 };
    assertEquals(1.0, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 1.0);
  }

  @Test
  public void case82() {
    int[] x1 = { -100, 0, -100 };
    int[] y1 = { 100, 0, -100 };
    int[] x2 = { 100, 0, 100 };
    int[] y2 = { 100, 0, -100 };
    assertEquals(2.475186257765897e-05, hittingperfecttarget.getProbability(x1, y1, x2, y2), DELTA * 2.475186257765897e-05);
  }

}
