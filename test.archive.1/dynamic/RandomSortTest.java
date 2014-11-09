package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RandomSortTest {
  double DELTA = 1.0e-09;
  RandomSort randomsort = new RandomSort();

  @Test
  public void case1() {
    int[] permutation = { 1, 3, 2 };
    assertEquals(1.0, randomsort.getExpected(permutation), DELTA * 1.0);
  }

  @Test
  public void case2() {
    int[] permutation = { 4, 3, 2, 1 };
    assertEquals(4.066666666666666, randomsort.getExpected(permutation), DELTA * 4.066666666666666);
  }

  @Test
  public void case3() {
    int[] permutation = { 1 };
    assertEquals(0.0, randomsort.getExpected(permutation), DELTA);
  }

  @Test
  public void case4() {
    int[] permutation = { 2, 5, 1, 6, 3, 4 };
    assertEquals(5.666666666666666, randomsort.getExpected(permutation), DELTA * 5.666666666666666);
  }

  @Test
  public void case5() {
    int[] permutation = { 1, 2 };
    assertEquals(0.0, randomsort.getExpected(permutation), DELTA);
  }

  @Test
  public void case6() {
    int[] permutation = { 2, 1 };
    assertEquals(1.0, randomsort.getExpected(permutation), DELTA * 1.0);
  }

  @Test
  public void case7() {
    int[] permutation = { 1, 2, 3 };
    assertEquals(0.0, randomsort.getExpected(permutation), DELTA);
  }

  @Test
  public void case8() {
    int[] permutation = { 2, 1, 3 };
    assertEquals(1.0, randomsort.getExpected(permutation), DELTA * 1.0);
  }

  @Test
  public void case9() {
    int[] permutation = { 2, 3, 1 };
    assertEquals(2.0, randomsort.getExpected(permutation), DELTA * 2.0);
  }

  @Test
  public void case10() {
    int[] permutation = { 3, 1, 2 };
    assertEquals(2.0, randomsort.getExpected(permutation), DELTA * 2.0);
  }

  @Test
  public void case11() {
    int[] permutation = { 3, 2, 1 };
    assertEquals(2.333333333333333, randomsort.getExpected(permutation), DELTA * 2.333333333333333);
  }

  @Test
  public void case12() {
    int[] permutation = { 1, 5, 2, 3, 6, 4 };
    assertEquals(4.0, randomsort.getExpected(permutation), DELTA * 4.0);
  }

  @Test
  public void case13() {
    int[] permutation = { 1, 5, 3, 7, 8, 6, 2, 4 };
    assertEquals(8.685714285714287, randomsort.getExpected(permutation), DELTA * 8.685714285714287);
  }

  @Test
  public void case14() {
    int[] permutation = { 6, 3, 4, 1, 5, 8, 7, 2 };
    assertEquals(9.355555555555558, randomsort.getExpected(permutation), DELTA * 9.355555555555558);
  }

  @Test
  public void case15() {
    int[] permutation = { 3, 1, 4, 2, 6, 5 };
    assertEquals(4.0, randomsort.getExpected(permutation), DELTA * 4.0);
  }

  @Test
  public void case16() {
    int[] permutation = { 5, 1, 4, 2, 3 };
    assertEquals(4.866666666666665, randomsort.getExpected(permutation), DELTA * 4.866666666666665);
  }

  @Test
  public void case17() {
    int[] permutation = { 7, 2, 5, 4, 1, 3, 8, 6 };
    assertEquals(9.22063492063492, randomsort.getExpected(permutation), DELTA * 9.22063492063492);
  }

  @Test
  public void case18() {
    int[] permutation = { 2, 1, 6, 5, 4, 3 };
    assertEquals(5.0666666666666655, randomsort.getExpected(permutation), DELTA * 5.0666666666666655);
  }

  @Test
  public void case19() {
    int[] permutation = { 5, 3, 4, 2, 1 };
    assertEquals(5.8317460317460315, randomsort.getExpected(permutation), DELTA * 5.8317460317460315);
  }

  @Test
  public void case20() {
    int[] permutation = { 4, 1, 8, 3, 6, 5, 2, 7 };
    assertEquals(8.933333333333334, randomsort.getExpected(permutation), DELTA * 8.933333333333334);
  }

  @Test
  public void case21() {
    int[] permutation = { 7, 8, 1, 6, 4, 2, 3, 5 };
    assertEquals(11.61303167731739, randomsort.getExpected(permutation), DELTA * 11.61303167731739);
  }

  @Test
  public void case22() {
    int[] permutation = { 6, 1, 4, 2, 3, 5 };
    assertEquals(5.866666666666666, randomsort.getExpected(permutation), DELTA * 5.866666666666666);
  }

  @Test
  public void case23() {
    int[] permutation = { 5, 1, 6, 2, 4, 3 };
    assertEquals(6.488888888888889, randomsort.getExpected(permutation), DELTA * 6.488888888888889);
  }

  @Test
  public void case24() {
    int[] permutation = { 3, 6, 2, 5, 1, 4 };
    assertEquals(6.7333333333333325, randomsort.getExpected(permutation), DELTA * 6.7333333333333325);
  }

  @Test
  public void case25() {
    int[] permutation = { 3, 4, 2, 5, 6, 7, 1 };
    assertEquals(6.866666666666666, randomsort.getExpected(permutation), DELTA * 6.866666666666666);
  }

  @Test
  public void case26() {
    int[] permutation = { 4, 1, 7, 2, 6, 8, 3, 5 };
    assertEquals(9.155555555555555, randomsort.getExpected(permutation), DELTA * 9.155555555555555);
  }

  @Test
  public void case27() {
    int[] permutation = { 3, 6, 2, 1, 7, 8, 5, 4 };
    assertEquals(9.298412698412697, randomsort.getExpected(permutation), DELTA * 9.298412698412697);
  }

  @Test
  public void case28() {
    int[] permutation = { 4, 3, 1, 5, 6, 2, 7 };
    assertEquals(5.866666666666666, randomsort.getExpected(permutation), DELTA * 5.866666666666666);
  }

  @Test
  public void case29() {
    int[] permutation = { 7, 5, 3, 4, 1, 2, 8, 6 };
    assertEquals(9.904761904761905, randomsort.getExpected(permutation), DELTA * 9.904761904761905);
  }

  @Test
  public void case30() {
    int[] permutation = { 3, 1, 4, 5, 2 };
    assertEquals(4.0, randomsort.getExpected(permutation), DELTA * 4.0);
  }

  @Test
  public void case31() {
    int[] permutation = { 5, 2, 1, 4, 3 };
    assertEquals(4.666666666666666, randomsort.getExpected(permutation), DELTA * 4.666666666666666);
  }

  @Test
  public void case32() {
    int[] permutation = { 4, 2, 1, 3, 6, 5 };
    assertEquals(4.333333333333333, randomsort.getExpected(permutation), DELTA * 4.333333333333333);
  }

  @Test
  public void case33() {
    int[] permutation = { 4, 2, 1, 3, 5 };
    assertEquals(3.333333333333333, randomsort.getExpected(permutation), DELTA * 3.333333333333333);
  }

  @Test
  public void case34() {
    int[] permutation = { 3, 8, 5, 7, 1, 4, 6, 2 };
    assertEquals(11.212698412698412, randomsort.getExpected(permutation), DELTA * 11.212698412698412);
  }

  @Test
  public void case35() {
    int[] permutation = { 5, 6, 4, 1, 2, 3 };
    assertEquals(7.712987012987013, randomsort.getExpected(permutation), DELTA * 7.712987012987013);
  }

  @Test
  public void case36() {
    int[] permutation = { 2, 1, 4, 5, 3 };
    assertEquals(3.0, randomsort.getExpected(permutation), DELTA * 3.0);
  }

  @Test
  public void case37() {
    int[] permutation = { 4, 1, 2, 6, 3, 5 };
    assertEquals(5.0, randomsort.getExpected(permutation), DELTA * 5.0);
  }

  @Test
  public void case38() {
    int[] permutation = { 6, 2, 4, 5, 7, 1, 3 };
    assertEquals(8.63015873015873, randomsort.getExpected(permutation), DELTA * 8.63015873015873);
  }

  @Test
  public void case39() {
    int[] permutation = { 5, 4, 3, 2, 1 };
    assertEquals(6.03015873015873, randomsort.getExpected(permutation), DELTA * 6.03015873015873);
  }

  @Test
  public void case40() {
    int[] permutation = { 3, 1, 5, 2, 4 };
    assertEquals(4.0, randomsort.getExpected(permutation), DELTA * 4.0);
  }

  @Test
  public void case41() {
    int[] permutation = { 3, 7, 2, 6, 5, 1, 4 };
    assertEquals(8.753968253968253, randomsort.getExpected(permutation), DELTA * 8.753968253968253);
  }

  @Test
  public void case42() {
    int[] permutation = { 8, 5, 4, 1, 7, 3, 2, 6 };
    assertEquals(11.308225108225109, randomsort.getExpected(permutation), DELTA * 11.308225108225109);
  }

  @Test
  public void case43() {
    int[] permutation = { 4, 2, 1, 3, 5 };
    assertEquals(3.333333333333333, randomsort.getExpected(permutation), DELTA * 3.333333333333333);
  }

  @Test
  public void case44() {
    int[] permutation = { 3, 5, 2, 1, 4 };
    assertEquals(4.866666666666665, randomsort.getExpected(permutation), DELTA * 4.866666666666665);
  }

  @Test
  public void case45() {
    int[] permutation = { 2, 1, 7, 4, 5, 6, 3 };
    assertEquals(5.999999999999998, randomsort.getExpected(permutation), DELTA * 5.999999999999998);
  }

  @Test
  public void case46() {
    int[] permutation = { 6, 7, 5, 4, 2, 3, 1 };
    assertEquals(10.44287775716347, randomsort.getExpected(permutation), DELTA * 10.44287775716347);
  }

  @Test
  public void case47() {
    int[] permutation = { 6, 7, 4, 2, 1, 5, 3 };
    assertEquals(9.657431457431459, randomsort.getExpected(permutation), DELTA * 9.657431457431459);
  }

  @Test
  public void case48() {
    int[] permutation = { 2, 4, 3, 1, 5 };
    assertEquals(3.333333333333333, randomsort.getExpected(permutation), DELTA * 3.333333333333333);
  }

  @Test
  public void case49() {
    int[] permutation = { 4, 2, 3, 1, 5 };
    assertEquals(3.6666666666666665, randomsort.getExpected(permutation), DELTA * 3.6666666666666665);
  }

  @Test
  public void case50() {
    int[] permutation = { 4, 5, 2, 1, 6, 3, 7 };
    assertEquals(6.488888888888889, randomsort.getExpected(permutation), DELTA * 6.488888888888889);
  }

  @Test
  public void case51() {
    int[] permutation = { 7, 4, 8, 3, 1, 5, 6, 2 };
    assertEquals(11.465367965367967, randomsort.getExpected(permutation), DELTA * 11.465367965367967);
  }

  @Test
  public void case52() {
    int[] permutation = { 6, 1, 7, 3, 2, 5, 4 };
    assertEquals(8.296825396825398, randomsort.getExpected(permutation), DELTA * 8.296825396825398);
  }

  @Test
  public void case53() {
    int[] permutation = { 3, 5, 1, 4, 2, 6 };
    assertEquals(5.0, randomsort.getExpected(permutation), DELTA * 5.0);
  }

  @Test
  public void case54() {
    int[] permutation = { 2, 7, 5, 3, 1, 6, 4 };
    assertEquals(7.965079365079364, randomsort.getExpected(permutation), DELTA * 7.965079365079364);
  }

  @Test
  public void case55() {
    int[] permutation = { 4, 1, 5, 2, 3, 6 };
    assertEquals(4.666666666666666, randomsort.getExpected(permutation), DELTA * 4.666666666666666);
  }

  @Test
  public void case56() {
    int[] permutation = { 5, 3, 4, 2, 1 };
    assertEquals(5.8317460317460315, randomsort.getExpected(permutation), DELTA * 5.8317460317460315);
  }

  @Test
  public void case57() {
    int[] permutation = { 4, 2, 5, 6, 3, 1 };
    assertEquals(6.765079365079365, randomsort.getExpected(permutation), DELTA * 6.765079365079365);
  }

  @Test
  public void case58() {
    int[] permutation = { 1, 6, 5, 4, 3, 2 };
    assertEquals(6.03015873015873, randomsort.getExpected(permutation), DELTA * 6.03015873015873);
  }

  @Test
  public void case59() {
    int[] permutation = { 3, 1, 4, 2, 5 };
    assertEquals(3.0, randomsort.getExpected(permutation), DELTA * 3.0);
  }

  @Test
  public void case60() {
    int[] permutation = { 6, 2, 3, 5, 1, 8, 7, 4 };
    assertEquals(8.866666666666664, randomsort.getExpected(permutation), DELTA * 8.866666666666664);
  }

  @Test
  public void case61() {
    int[] permutation = { 4, 3, 6, 1, 7, 2, 5 };
    assertEquals(8.155555555555555, randomsort.getExpected(permutation), DELTA * 8.155555555555555);
  }

  @Test
  public void case62() {
    int[] permutation = { 2, 7, 8, 3, 5, 1, 4, 6 };
    assertEquals(10.153968253968257, randomsort.getExpected(permutation), DELTA * 10.153968253968257);
  }

  @Test
  public void case63() {
    int[] permutation = { 8, 6, 4, 2, 7, 3, 5, 1 };
    assertEquals(12.041991341991341, randomsort.getExpected(permutation), DELTA * 12.041991341991341);
  }

  @Test
  public void case64() {
    int[] permutation = { 3, 7, 1, 2, 6, 4, 5 };
    assertEquals(7.533333333333333, randomsort.getExpected(permutation), DELTA * 7.533333333333333);
  }

  @Test
  public void case65() {
    int[] permutation = { 6, 7, 5, 1, 3, 4, 2 };
    assertEquals(9.987538651824366, randomsort.getExpected(permutation), DELTA * 9.987538651824366);
  }

  @Test
  public void case66() {
    int[] permutation = { 2, 3, 4, 1, 5 };
    assertEquals(3.0, randomsort.getExpected(permutation), DELTA * 3.0);
  }

  @Test
  public void case67() {
    int[] permutation = { 7, 3, 5, 6, 1, 2, 4 };
    assertEquals(9.493650793650792, randomsort.getExpected(permutation), DELTA * 9.493650793650792);
  }

  @Test
  public void case68() {
    int[] permutation = { 4, 1, 2, 5, 3 };
    assertEquals(4.0, randomsort.getExpected(permutation), DELTA * 4.0);
  }

  @Test
  public void case69() {
    int[] permutation = { 2, 7, 3, 5, 4, 1, 6 };
    assertEquals(7.4, randomsort.getExpected(permutation), DELTA * 7.4);
  }

  @Test
  public void case70() {
    int[] permutation = { 4, 2, 5, 1, 3 };
    assertEquals(5.0, randomsort.getExpected(permutation), DELTA * 5.0);
  }

  @Test
  public void case71() {
    int[] permutation = { 5, 7, 4, 2, 6, 1, 3 };
    assertEquals(9.663780663780663, randomsort.getExpected(permutation), DELTA * 9.663780663780663);
  }

  @Test
  public void case72() {
    int[] permutation = { 5, 2, 4, 1, 3 };
    assertEquals(5.199999999999998, randomsort.getExpected(permutation), DELTA * 5.199999999999998);
  }

  @Test
  public void case73() {
    int[] permutation = { 3, 6, 1, 2, 4, 5 };
    assertEquals(5.666666666666665, randomsort.getExpected(permutation), DELTA * 5.666666666666665);
  }

  @Test
  public void case74() {
    int[] permutation = { 1, 3, 4, 2, 6, 5 };
    assertEquals(3.0, randomsort.getExpected(permutation), DELTA * 3.0);
  }

  @Test
  public void case75() {
    int[] permutation = { 3, 2, 4, 5, 1 };
    assertEquals(4.333333333333333, randomsort.getExpected(permutation), DELTA * 4.333333333333333);
  }

  @Test
  public void case76() {
    int[] permutation = { 8, 6, 5, 1, 3, 4, 2, 7 };
    assertEquals(11.078447742733456, randomsort.getExpected(permutation), DELTA * 11.078447742733456);
  }

  @Test
  public void case77() {
    int[] permutation = { 1, 3, 5, 2, 4 };
    assertEquals(3.0, randomsort.getExpected(permutation), DELTA * 3.0);
  }

  @Test
  public void case78() {
    int[] permutation = { 5, 4, 2, 3, 1, 7, 8, 6 };
    assertEquals(7.831746031746032, randomsort.getExpected(permutation), DELTA * 7.831746031746032);
  }

  @Test
  public void case79() {
    int[] permutation = { 6, 7, 4, 8, 2, 1, 5, 3 };
    assertEquals(12.087157287157288, randomsort.getExpected(permutation), DELTA * 12.087157287157288);
  }

  @Test
  public void case80() {
    int[] permutation = { 5, 6, 8, 4, 3, 7, 2, 1 };
    assertEquals(12.095798910084625, randomsort.getExpected(permutation), DELTA * 12.095798910084625);
  }

  @Test
  public void case81() {
    int[] permutation = { 2, 3, 5, 1, 4 };
    assertEquals(4.0, randomsort.getExpected(permutation), DELTA * 4.0);
  }

  @Test
  public void case82() {
    int[] permutation = { 5, 7, 3, 4, 6, 1, 8, 2 };
    assertEquals(10.595238095238095, randomsort.getExpected(permutation), DELTA * 10.595238095238095);
  }

  @Test
  public void case83() {
    int[] permutation = { 2, 5, 4, 1, 6, 3 };
    assertEquals(5.866666666666666, randomsort.getExpected(permutation), DELTA * 5.866666666666666);
  }

  @Test
  public void case84() {
    int[] permutation = { 2, 3, 8, 5, 6, 4, 1, 7 };
    assertEquals(8.831746031746032, randomsort.getExpected(permutation), DELTA * 8.831746031746032);
  }

  @Test
  public void case85() {
    int[] permutation = { 3, 2, 6, 5, 4, 1 };
    assertEquals(6.3999999999999995, randomsort.getExpected(permutation), DELTA * 6.3999999999999995);
  }

  @Test
  public void case86() {
    int[] permutation = { 1, 3, 8, 4, 7, 6, 2, 5 };
    assertEquals(8.220634920634918, randomsort.getExpected(permutation), DELTA * 8.220634920634918);
  }

  @Test
  public void case87() {
    int[] permutation = { 5, 4, 2, 3, 1 };
    assertEquals(5.8317460317460315, randomsort.getExpected(permutation), DELTA * 5.8317460317460315);
  }

  @Test
  public void case88() {
    int[] permutation = { 5, 4, 7, 3, 6, 1, 2 };
    assertEquals(9.657431457431455, randomsort.getExpected(permutation), DELTA * 9.657431457431455);
  }

  @Test
  public void case89() {
    int[] permutation = { 1, 2, 5, 3, 4 };
    assertEquals(2.0, randomsort.getExpected(permutation), DELTA * 2.0);
  }

  @Test
  public void case90() {
    int[] permutation = { 2, 7, 1, 5, 8, 6, 3, 4 };
    assertEquals(9.552380952380954, randomsort.getExpected(permutation), DELTA * 9.552380952380954);
  }

  @Test
  public void case91() {
    int[] permutation = { 6, 3, 5, 4, 2, 1, 7 };
    assertEquals(7.806349206349205, randomsort.getExpected(permutation), DELTA * 7.806349206349205);
  }

  @Test
  public void case92() {
    int[] permutation = { 2, 7, 3, 1, 6, 8, 5, 4 };
    assertEquals(8.965079365079365, randomsort.getExpected(permutation), DELTA * 8.965079365079365);
  }

  @Test
  public void case93() {
    int[] permutation = { 1, 3, 6, 5, 2, 4 };
    assertEquals(4.866666666666665, randomsort.getExpected(permutation), DELTA * 4.866666666666665);
  }

  @Test
  public void case94() {
    int[] permutation = { 3, 7, 2, 4, 5, 1, 6 };
    assertEquals(7.533333333333333, randomsort.getExpected(permutation), DELTA * 7.533333333333333);
  }

  @Test
  public void case95() {
    int[] permutation = { 3, 1, 2, 6, 5, 4 };
    assertEquals(4.333333333333333, randomsort.getExpected(permutation), DELTA * 4.333333333333333);
  }

  @Test
  public void case96() {
    int[] permutation = { 1, 5, 7, 4, 3, 2, 6 };
    assertEquals(6.887301587301588, randomsort.getExpected(permutation), DELTA * 6.887301587301588);
  }

  @Test
  public void case97() {
    int[] permutation = { 1, 4, 2, 6, 8, 7, 3, 5 };
    assertEquals(7.48888888888889, randomsort.getExpected(permutation), DELTA * 7.48888888888889);
  }

  @Test
  public void case98() {
    int[] permutation = { 3, 2, 7, 6, 1, 4, 5 };
    assertEquals(7.765079365079366, randomsort.getExpected(permutation), DELTA * 7.765079365079366);
  }

  @Test
  public void case99() {
    int[] permutation = { 5, 2, 1, 4, 3 };
    assertEquals(4.666666666666666, randomsort.getExpected(permutation), DELTA * 4.666666666666666);
  }

  @Test
  public void case100() {
    int[] permutation = { 3, 1, 2, 5, 4 };
    assertEquals(3.0, randomsort.getExpected(permutation), DELTA * 3.0);
  }

  @Test
  public void case101() {
    int[] permutation = { 1, 2, 4, 5, 3 };
    assertEquals(2.0, randomsort.getExpected(permutation), DELTA * 2.0);
  }

  @Test
  public void case102() {
    int[] permutation = { 2, 6, 3, 7, 8, 4, 1, 5 };
    assertEquals(9.876190476190477, randomsort.getExpected(permutation), DELTA * 9.876190476190477);
  }

  @Test
  public void case103() {
    int[] permutation = { 4, 6, 3, 2, 1, 5 };
    assertEquals(6.887301587301588, randomsort.getExpected(permutation), DELTA * 6.887301587301588);
  }

  @Test
  public void case104() {
    int[] permutation = { 7, 4, 1, 2, 6, 3, 5 };
    assertEquals(8.298412698412697, randomsort.getExpected(permutation), DELTA * 8.298412698412697);
  }

  @Test
  public void case105() {
    int[] permutation = { 4, 2, 5, 1, 3 };
    assertEquals(5.0, randomsort.getExpected(permutation), DELTA * 5.0);
  }

  @Test
  public void case106() {
    int[] permutation = { 5, 3, 2, 7, 1, 4, 6 };
    assertEquals(7.733333333333332, randomsort.getExpected(permutation), DELTA * 7.733333333333332);
  }

  @Test
  public void case107() {
    int[] permutation = { 4, 8, 5, 3, 2, 1, 6, 7 };
    assertEquals(9.966955266955267, randomsort.getExpected(permutation), DELTA * 9.966955266955267);
  }

  @Test
  public void case108() {
    int[] permutation = { 4, 1, 2, 3, 5, 6 };
    assertEquals(3.0, randomsort.getExpected(permutation), DELTA * 3.0);
  }

  @Test
  public void case109() {
    int[] permutation = { 7, 6, 2, 4, 8, 1, 3, 5 };
    assertEquals(11.341702741702743, randomsort.getExpected(permutation), DELTA * 11.341702741702743);
  }

  @Test
  public void case110() {
    int[] permutation = { 3, 4, 1, 2, 5 };
    assertEquals(3.666666666666666, randomsort.getExpected(permutation), DELTA * 3.666666666666666);
  }

  @Test
  public void case111() {
    int[] permutation = { 4, 5, 7, 1, 6, 2, 3 };
    assertEquals(9.207936507936507, randomsort.getExpected(permutation), DELTA * 9.207936507936507);
  }

  @Test
  public void case112() {
    int[] permutation = { 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(13.221053196152711, randomsort.getExpected(permutation), DELTA * 13.221053196152711);
  }

  @Test
  public void case113() {
    int[] permutation = { 8, 7, 6, 5, 1, 4, 3, 2 };
    assertEquals(12.895467847303319, randomsort.getExpected(permutation), DELTA * 12.895467847303319);
  }

  @Test
  public void case114() {
    int[] permutation = { 4, 1, 2, 3 };
    assertEquals(3.0, randomsort.getExpected(permutation), DELTA * 3.0);
  }

  @Test
  public void case115() {
    int[] permutation = { 1, 4, 3, 2 };
    assertEquals(2.333333333333333, randomsort.getExpected(permutation), DELTA * 2.333333333333333);
  }

  @Test
  public void case116() {
    int[] permutation = { 2, 1, 4, 3, 6, 5, 8, 7 };
    assertEquals(4.0, randomsort.getExpected(permutation), DELTA * 4.0);
  }

  @Test
  public void case117() {
    int[] permutation = { 4, 3, 2, 1, 8, 7, 6, 5 };
    assertEquals(8.133333333333333, randomsort.getExpected(permutation), DELTA * 8.133333333333333);
  }

  @Test
  public void case118() {
    int[] permutation = { 5, 4, 3, 2, 1, 8, 7, 6 };
    assertEquals(8.363492063492064, randomsort.getExpected(permutation), DELTA * 8.363492063492064);
  }

  @Test
  public void case119() {
    int[] permutation = { 2, 1, 8, 7, 6, 5, 4, 3 };
    assertEquals(9.24819624819625, randomsort.getExpected(permutation), DELTA * 9.24819624819625);
  }

  @Test
  public void case120() {
    int[] permutation = { 1, 7, 6, 5, 4, 3, 2, 8 };
    assertEquals(8.248196248196248, randomsort.getExpected(permutation), DELTA * 8.248196248196248);
  }

  @Test
  public void case121() {
    int[] permutation = { 7, 6, 5, 4, 3, 2, 1, 8 };
    assertEquals(10.641022469593898, randomsort.getExpected(permutation), DELTA * 10.641022469593898);
  }

  @Test
  public void case122() {
    int[] permutation = { 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals(0.0, randomsort.getExpected(permutation), DELTA);
  }

  @Test
  public void case123() {
    int[] permutation = { 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(13.221053196152711, randomsort.getExpected(permutation), DELTA * 13.221053196152711);
  }

  @Test
  public void case124() {
    int[] permutation = { 2, 5, 1, 6, 3, 4 };
    assertEquals(5.666666666666666, randomsort.getExpected(permutation), DELTA * 5.666666666666666);
  }

  @Test
  public void case125() {
    int[] permutation = { 4, 3, 2, 1 };
    assertEquals(4.066666666666666, randomsort.getExpected(permutation), DELTA * 4.066666666666666);
  }

  @Test
  public void case126() {
    int[] permutation = { 2, 8, 6, 5, 1, 7, 3, 4 };
    assertEquals(10.632034632034634, randomsort.getExpected(permutation), DELTA * 10.632034632034634);
  }

  @Test
  public void case127() {
    int[] permutation = { 8, 7, 6, 5, 4, 3, 1, 2 };
    assertEquals(13.144130119229633, randomsort.getExpected(permutation), DELTA * 13.144130119229633);
  }

  @Test
  public void case128() {
    int[] permutation = { 5, 2, 4, 7, 3, 6, 1 };
    assertEquals(8.298412698412697, randomsort.getExpected(permutation), DELTA * 8.298412698412697);
  }

  @Test
  public void case129() {
    int[] permutation = { 2, 5, 1, 6, 3, 8, 4, 7 };
    assertEquals(7.666666666666666, randomsort.getExpected(permutation), DELTA * 7.666666666666666);
  }

  @Test
  public void case130() {
    int[] permutation = { 8, 6, 7, 5, 4, 3, 2, 1 };
    assertEquals(13.133236873042268, randomsort.getExpected(permutation), DELTA * 13.133236873042268);
  }

  @Test
  public void case131() {
    int[] permutation = { 4, 2, 8, 6, 3, 5, 1, 7 };
    assertEquals(9.730158730158731, randomsort.getExpected(permutation), DELTA * 9.730158730158731);
  }

  @Test
  public void case132() {
    int[] permutation = { 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(10.641022469593898, randomsort.getExpected(permutation), DELTA * 10.641022469593898);
  }

  @Test
  public void case133() {
    int[] permutation = { 7, 8, 1, 4, 5, 6, 3, 2 };
    assertEquals(11.519288119288117, randomsort.getExpected(permutation), DELTA * 11.519288119288117);
  }

  @Test
  public void case134() {
    int[] permutation = { 1, 8, 2, 5, 7, 3, 4, 6 };
    assertEquals(8.253968253968253, randomsort.getExpected(permutation), DELTA * 8.253968253968253);
  }

  @Test
  public void case135() {
    int[] permutation = { 2, 7, 1, 8, 4, 6, 3, 5 };
    assertEquals(9.552380952380954, randomsort.getExpected(permutation), DELTA * 9.552380952380954);
  }

  @Test
  public void case136() {
    int[] permutation = { 8, 4, 6, 1, 2, 3, 7, 5 };
    assertEquals(10.595238095238095, randomsort.getExpected(permutation), DELTA * 10.595238095238095);
  }

  @Test
  public void case137() {
    int[] permutation = { 2, 4, 3, 6, 8, 1, 7, 5 };
    assertEquals(8.333333333333332, randomsort.getExpected(permutation), DELTA * 8.333333333333332);
  }

}
