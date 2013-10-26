package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class GrasslandFencerTest {
  double DELTA = 1.0e-09;
  GrasslandFencer grasslandfencer = new GrasslandFencer();

  @Test
  public void case1() {
    int[] fences = { 3, 4, 5, 6, 7, 8, 9 };
    assertEquals(36.754383146489694, grasslandfencer.maximalFencedArea(fences), DELTA * 36.754383146489694);
  }

  @Test
  public void case2() {
    int[] fences = { 1, 2, 4, 8 };
    assertEquals(0.0, grasslandfencer.maximalFencedArea(fences), DELTA);
  }

  @Test
  public void case3() {
    int[] fences = { 7, 4, 4, 4 };
    assertEquals(6.928203230275509, grasslandfencer.maximalFencedArea(fences), DELTA * 6.928203230275509);
  }

  @Test
  public void case4() {
    int[] fences = { 46, 40, 84, 27 };
    assertEquals(537.3680652029855, grasslandfencer.maximalFencedArea(fences), DELTA * 537.3680652029855);
  }

  @Test
  public void case5() {
    int[] fences = { 31, 44, 83, 44 };
    assertEquals(638.2820203483724, grasslandfencer.maximalFencedArea(fences), DELTA * 638.2820203483724);
  }

  @Test
  public void case6() {
    int[] fences = { 34, 46, 79, 18 };
    assertEquals(261.4478915577634, grasslandfencer.maximalFencedArea(fences), DELTA * 261.4478915577634);
  }

  @Test
  public void case7() {
    int[] fences = { 36, 26, 19, 63, 28 };
    assertEquals(361.68356335338217, grasslandfencer.maximalFencedArea(fences), DELTA * 361.68356335338217);
  }

  @Test
  public void case8() {
    int[] fences = { 78, 30, 41, 38, 18 };
    assertEquals(545.3686253351947, grasslandfencer.maximalFencedArea(fences), DELTA * 545.3686253351947);
  }

  @Test
  public void case9() {
    int[] fences = { 95, 59, 37, 33, 11 };
    assertEquals(554.3484351019672, grasslandfencer.maximalFencedArea(fences), DELTA * 554.3484351019672);
  }

  @Test
  public void case10() {
    int[] fences = { 51, 10, 97, 14, 47, 39 };
    assertEquals(871.9559550229587, grasslandfencer.maximalFencedArea(fences), DELTA * 871.9559550229587);
  }

  @Test
  public void case11() {
    int[] fences = { 29, 19, 62, 21, 36, 2 };
    assertEquals(304.47988439304163, grasslandfencer.maximalFencedArea(fences), DELTA * 304.47988439304163);
  }

  @Test
  public void case12() {
    int[] fences = { 49, 5, 23, 39, 88, 42 };
    assertEquals(788.6190461813612, grasslandfencer.maximalFencedArea(fences), DELTA * 788.6190461813612);
  }

  @Test
  public void case13() {
    int[] fences = { 83, 10, 10, 22, 18, 80, 10 };
    assertEquals(923.3003824046832, grasslandfencer.maximalFencedArea(fences), DELTA * 923.3003824046832);
  }

  @Test
  public void case14() {
    int[] fences = { 21, 16, 46, 66, 63, 17, 37 };
    assertEquals(1516.5175802961414, grasslandfencer.maximalFencedArea(fences), DELTA * 1516.5175802961414);
  }

  @Test
  public void case15() {
    int[] fences = { 35, 75, 30, 95, 79, 62, 26 };
    assertEquals(3256.099913851602, grasslandfencer.maximalFencedArea(fences), DELTA * 3256.099913851602);
  }

  @Test
  public void case16() {
    int[] fences = { 31, 80, 23, 71, 77, 26, 53, 6 };
    assertEquals(2775.998799405252, grasslandfencer.maximalFencedArea(fences), DELTA * 2775.998799405252);
  }

  @Test
  public void case17() {
    int[] fences = { 36, 79, 19, 9, 56, 18, 98, 19 };
    assertEquals(2361.8707096987278, grasslandfencer.maximalFencedArea(fences), DELTA * 2361.8707096987278);
  }

  @Test
  public void case18() {
    int[] fences = { 59, 59, 24, 3, 29, 50, 79, 23 };
    assertEquals(1999.133833435806, grasslandfencer.maximalFencedArea(fences), DELTA * 1999.133833435806);
  }

  @Test
  public void case19() {
    int[] fences = { 35, 96, 1, 40, 93, 92, 48, 47, 89 };
    assertEquals(4656.6253411395655, grasslandfencer.maximalFencedArea(fences), DELTA * 4656.6253411395655);
  }

  @Test
  public void case20() {
    int[] fences = { 12, 18, 86, 1, 31, 14, 15, 61, 36 };
    assertEquals(1025.1328565808249, grasslandfencer.maximalFencedArea(fences), DELTA * 1025.1328565808249);
  }

  @Test
  public void case21() {
    int[] fences = { 89, 26, 100, 29, 28, 55, 69, 2, 8 };
    assertEquals(3325.864736348445, grasslandfencer.maximalFencedArea(fences), DELTA * 3325.864736348445);
  }

  @Test
  public void case22() {
    int[] fences = { 25, 11, 7, 7, 66, 63, 59, 66, 28, 34 };
    assertEquals(2194.9852819506395, grasslandfencer.maximalFencedArea(fences), DELTA * 2194.9852819506395);
  }

  @Test
  public void case23() {
    int[] fences = { 69, 31, 39, 10, 13, 93, 97, 93, 26, 21 };
    assertEquals(4299.274537154505, grasslandfencer.maximalFencedArea(fences), DELTA * 4299.274537154505);
  }

  @Test
  public void case24() {
    int[] fences = { 32, 63, 84, 70, 60, 76, 31, 21, 91, 74 };
    assertEquals(5329.139041375465, grasslandfencer.maximalFencedArea(fences), DELTA * 5329.139041375465);
  }

  @Test
  public void case25() {
    int[] fences = { 33, 85, 79, 81, 86, 32, 82, 66, 27, 67, 34 };
    assertEquals(5979.244334419546, grasslandfencer.maximalFencedArea(fences), DELTA * 5979.244334419546);
  }

  @Test
  public void case26() {
    int[] fences = { 26, 30, 52, 17, 83, 27, 92, 70, 92, 60, 89 };
    assertEquals(5971.743274521125, grasslandfencer.maximalFencedArea(fences), DELTA * 5971.743274521125);
  }

  @Test
  public void case27() {
    int[] fences = { 99, 12, 60, 27, 2, 28, 42, 55, 95, 15, 14 };
    assertEquals(3415.878271852212, grasslandfencer.maximalFencedArea(fences), DELTA * 3415.878271852212);
  }

  @Test
  public void case28() {
    int[] fences = { 13, 20, 75, 15, 100, 33, 55, 18, 21, 1, 82, 23 };
    assertEquals(3387.8236744757405, grasslandfencer.maximalFencedArea(fences), DELTA * 3387.8236744757405);
  }

  @Test
  public void case29() {
    int[] fences = { 18, 57, 22, 100, 42, 38, 44, 42, 40, 36, 19, 36 };
    assertEquals(1983.5036288151425, grasslandfencer.maximalFencedArea(fences), DELTA * 1983.5036288151425);
  }

  @Test
  public void case30() {
    int[] fences = { 52, 90, 29, 58, 5, 12, 11, 85, 91, 96, 18, 71 };
    assertEquals(5784.539696567363, grasslandfencer.maximalFencedArea(fences), DELTA * 5784.539696567363);
  }

  @Test
  public void case31() {
    int[] fences = { 35, 41, 64, 71, 47, 19, 37, 15, 76, 17, 45, 90, 87 };
    assertEquals(5340.800167856549, grasslandfencer.maximalFencedArea(fences), DELTA * 5340.800167856549);
  }

  @Test
  public void case32() {
    int[] fences = { 70, 98, 53, 28, 69, 12, 4, 74, 99, 27, 1, 25, 70 };
    assertEquals(5784.5545450188965, grasslandfencer.maximalFencedArea(fences), DELTA * 5784.5545450188965);
  }

  @Test
  public void case33() {
    int[] fences = { 78, 49, 6, 85, 60, 72, 100, 38, 7, 14, 54, 77, 8 };
    assertEquals(6170.687321219386, grasslandfencer.maximalFencedArea(fences), DELTA * 6170.687321219386);
  }

  @Test
  public void case34() {
    int[] fences = { 90, 69, 84, 1, 97, 14, 79, 92, 13, 94, 18, 3, 24, 41 };
    assertEquals(7026.020050110176, grasslandfencer.maximalFencedArea(fences), DELTA * 7026.020050110176);
  }

  @Test
  public void case35() {
    int[] fences = { 8, 29, 73, 97, 74, 7, 27, 8, 70, 51, 46, 15, 94, 51 };
    assertEquals(5641.464086930983, grasslandfencer.maximalFencedArea(fences), DELTA * 5641.464086930983);
  }

  @Test
  public void case36() {
    int[] fences = { 34, 41, 91, 47, 4, 5, 14, 18, 18, 7, 84, 5, 74, 60 };
    assertEquals(4010.0029482647806, grasslandfencer.maximalFencedArea(fences), DELTA * 4010.0029482647806);
  }

  @Test
  public void case37() {
    int[] fences = { 72, 49, 63, 12, 66, 6, 58, 19, 18, 73, 61, 52, 53, 81, 31 };
    assertEquals(5591.935769507378, grasslandfencer.maximalFencedArea(fences), DELTA * 5591.935769507378);
  }

  @Test
  public void case38() {
    int[] fences = { 19, 95, 13, 83, 100, 75, 40, 14, 89, 69, 10, 23, 81, 30, 13 };
    assertEquals(7021.362282513253, grasslandfencer.maximalFencedArea(fences), DELTA * 7021.362282513253);
  }

  @Test
  public void case39() {
    int[] fences = { 52, 17, 37, 19, 58, 96, 45, 49, 2, 35, 19, 9, 80, 58, 65 };
    assertEquals(4863.0840473486005, grasslandfencer.maximalFencedArea(fences), DELTA * 4863.0840473486005);
  }

  @Test
  public void case40() {
    int[] fences = { 21, 72, 15, 55, 16, 44, 54, 63, 69, 35, 75, 69, 76, 70, 50, 81 };
    assertEquals(7512.322360676162, grasslandfencer.maximalFencedArea(fences), DELTA * 7512.322360676162);
  }

  @Test
  public void case41() {
    int[] fences = { 32, 17, 99, 92, 84, 42, 1, 68, 17, 91, 4, 35, 10, 69, 43, 18 };
    assertEquals(6888.94807319841, grasslandfencer.maximalFencedArea(fences), DELTA * 6888.94807319841);
  }

  @Test
  public void case42() {
    int[] fences = { 60, 69, 84, 9, 42, 51, 61, 10, 18, 64, 37, 88, 7, 58, 89, 44 };
    assertEquals(7171.136238054464, grasslandfencer.maximalFencedArea(fences), DELTA * 7171.136238054464);
  }

  @Test
  public void case43() {
    int[] fences = { 98, 99, 100, 97, 46, 47 };
    assertEquals(4450.281542411054, grasslandfencer.maximalFencedArea(fences), DELTA * 4450.281542411054);
  }

  @Test
  public void case44() {
    int[] fences = { 1, 2, 3, 5, 8, 13, 14, 14, 14 };
    assertEquals(86.1617850785388, grasslandfencer.maximalFencedArea(fences), DELTA * 86.1617850785388);
  }

  @Test
  public void case45() {
    int[] fences = { 21, 72, 15, 55, 16, 44, 54, 63, 69, 35, 75, 69, 76, 70, 50, 81 };
    assertEquals(7512.322360676162, grasslandfencer.maximalFencedArea(fences), DELTA * 7512.322360676162);
  }

  @Test
  public void case46() {
    int[] fences = { 1, 11, 11, 11, 11, 10 };
    assertEquals(54.48411009962254, grasslandfencer.maximalFencedArea(fences), DELTA * 54.48411009962254);
  }

  @Test
  public void case47() {
    int[] fences = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(2.1650635094610964, grasslandfencer.maximalFencedArea(fences), DELTA * 2.1650635094610964);
  }

  @Test
  public void case48() {
    int[] fences = { 27, 50, 78, 82, 82, 82 };
    assertEquals(3005.1672676600683, grasslandfencer.maximalFencedArea(fences), DELTA * 3005.1672676600683);
  }

  @Test
  public void case49() {
    int[] fences = { 7, 19, 26, 26, 27, 29 };
    assertEquals(339.00335608860416, grasslandfencer.maximalFencedArea(fences), DELTA * 339.00335608860416);
  }

  @Test
  public void case50() {
    int[] fences = { 10, 10, 20, 20, 21, 21 };
    assertEquals(198.80497392704112, grasslandfencer.maximalFencedArea(fences), DELTA * 198.80497392704112);
  }

  @Test
  public void case51() {
    int[] fences = { 4, 90, 97, 5, 97, 98, 95 };
    assertEquals(4111.888641079868, grasslandfencer.maximalFencedArea(fences), DELTA * 4111.888641079868);
  }

  @Test
  public void case52() {
    int[] fences = { 21, 72, 11, 55, 16, 44, 54, 99, 69, 35, 71, 69, 76, 70, 50, 81 };
    assertEquals(8070.4353454215725, grasslandfencer.maximalFencedArea(fences), DELTA * 8070.4353454215725);
  }

  @Test
  public void case53() {
    int[] fences = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85 };
    assertEquals(18760.274805567216, grasslandfencer.maximalFencedArea(fences), DELTA * 18760.274805567216);
  }

  @Test
  public void case54() {
    int[] fences = { 3, 9, 6, 18, 13, 24, 1, 30, 25, 94, 7, 34, 56, 12, 24, 15 };
    assertEquals(815.9852508137787, grasslandfencer.maximalFencedArea(fences), DELTA * 815.9852508137787);
  }

  @Test
  public void case55() {
    int[] fences = { 100, 100, 90, 90, 45, 45 };
    assertEquals(4153.005036881826, grasslandfencer.maximalFencedArea(fences), DELTA * 4153.005036881826);
  }

  @Test
  public void case56() {
    int[] fences = { 7, 4, 4, 4 };
    assertEquals(6.928203230275509, grasslandfencer.maximalFencedArea(fences), DELTA * 6.928203230275509);
  }

  @Test
  public void case57() {
    int[] fences = { 1, 2, 3, 3, 3, 3 };
    assertEquals(4.3074470705210945, grasslandfencer.maximalFencedArea(fences), DELTA * 4.3074470705210945);
  }

  @Test
  public void case58() {
    int[] fences = { 21, 72, 15, 55, 16, 44, 54, 63, 69, 35, 75, 69, 76, 70, 80, 81 };
    assertEquals(8106.584104885184, grasslandfencer.maximalFencedArea(fences), DELTA * 8106.584104885184);
  }

  @Test
  public void case59() {
    int[] fences = { 99, 99, 89, 89, 44, 44 };
    assertEquals(4020.778320035727, grasslandfencer.maximalFencedArea(fences), DELTA * 4020.778320035727);
  }

  @Test
  public void case60() {
    int[] fences = { 23, 78, 32, 41, 75, 89, 78, 63, 74, 66, 4, 56, 7, 8, 9, 4 };
    assertEquals(6209.683602402974, grasslandfencer.maximalFencedArea(fences), DELTA * 6209.683602402974);
  }

  @Test
  public void case61() {
    int[] fences = { 11, 11, 10, 10, 7, 3 };
    assertEquals(51.32943377553876, grasslandfencer.maximalFencedArea(fences), DELTA * 51.32943377553876);
  }

  @Test
  public void case62() {
    int[] fences = { 21, 72, 100, 55, 16, 44, 54, 55, 55, 35, 75, 69, 76, 100, 1, 81 };
    assertEquals(8770.257887112295, grasslandfencer.maximalFencedArea(fences), DELTA * 8770.257887112295);
  }

  @Test
  public void case63() {
    int[] fences = { 10, 1, 1, 1 };
    assertEquals(0.4330127018922193, grasslandfencer.maximalFencedArea(fences), DELTA * 0.4330127018922193);
  }

  @Test
  public void case64() {
    int[] fences = { 99, 100, 98, 98, 98, 100, 97, 90, 90, 70, 71, 72, 68, 1, 2, 3 };
    assertEquals(14318.600013502903, grasslandfencer.maximalFencedArea(fences), DELTA * 14318.600013502903);
  }

  @Test
  public void case65() {
    int[] fences = { 3, 4, 5, 6, 7, 8, 9, 6, 6, 6, 6, 6, 6, 6, 6, 5 };
    assertEquals(82.76333892426885, grasslandfencer.maximalFencedArea(fences), DELTA * 82.76333892426885);
  }

}
