package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class NestedRandomnessTest {
  double DELTA = 1.0e-10;
  NestedRandomness nestedrandomness = new NestedRandomness();

  @Test
  public void case1() {
    int N = 5;
    int nestings = 2;
    int target = 1;
    assertEquals(0.21666666666666667, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case2() {
    int N = 10;
    int nestings = 4;
    int target = 0;
    assertEquals(0.19942680776014104, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case3() {
    int N = 1000;
    int nestings = 10;
    int target = 990;
    assertEquals(1.0461776397050886e-30, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case4() {
    int N = 1000;
    int nestings = 7;
    int target = 0;
    assertEquals(0.165676656915066, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case5() {
    int N = 1;
    int nestings = 1;
    int target = 0;
    assertEquals(1.0, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case6() {
    int N = 50;
    int nestings = 4;
    int target = 0;
    assertEquals(0.23479574692949326, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case7() {
    int N = 10;
    int nestings = 10;
    int target = 0;
    assertEquals(2.7557319223985894e-07, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case8() {
    int N = 1000;
    int nestings = 10;
    int target = 1;
    assertEquals(0.03398906538272463, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case9() {
    int N = 752;
    int nestings = 6;
    int target = 0;
    assertEquals(0.1606392598541192, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case10() {
    int N = 886;
    int nestings = 2;
    int target = 170;
    assertEquals(0.001859385756588236, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case11() {
    int N = 864;
    int nestings = 8;
    int target = 2;
    assertEquals(0.04212393830217547, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case12() {
    int N = 798;
    int nestings = 2;
    int target = 355;
    assertEquals(0.0010124765930278965, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case13() {
    int N = 830;
    int nestings = 6;
    int target = 6;
    assertEquals(0.025216352825259428, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case14() {
    int N = 651;
    int nestings = 6;
    int target = 7;
    assertEquals(0.021204722771317422, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case15() {
    int N = 727;
    int nestings = 2;
    int target = 559;
    assertEquals(0.00035927771815528114, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case16() {
    int N = 101;
    int nestings = 5;
    int target = 0;
    assertEquals(0.21102403501960595, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case17() {
    int N = 822;
    int nestings = 2;
    int target = 45;
    assertEquals(0.003519950789012786, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case18() {
    int N = 101;
    int nestings = 6;
    int target = 0;
    assertEquals(0.1770581054773769, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case19() {
    int N = 843;
    int nestings = 8;
    int target = 2;
    assertEquals(0.04183288821011043, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case20() {
    int N = 910;
    int nestings = 5;
    int target = 1;
    assertEquals(0.06962979389097596, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case21() {
    int N = 412;
    int nestings = 6;
    int target = 3;
    assertEquals(0.04392173956932056, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case22() {
    int N = 92;
    int nestings = 5;
    int target = 0;
    assertEquals(0.2125206500658938, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case23() {
    int N = 590;
    int nestings = 5;
    int target = 107;
    assertEquals(0.0005830311972571039, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case24() {
    int N = 466;
    int nestings = 2;
    int target = 76;
    assertEquals(0.003875138258831273, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case25() {
    int N = 222;
    int nestings = 2;
    int target = 58;
    assertEquals(0.005997227522082085, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case26() {
    int N = 461;
    int nestings = 5;
    int target = 20;
    assertEquals(0.008233315372095562, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case27() {
    int N = 696;
    int nestings = 3;
    int target = 33;
    assertEquals(0.006588342463832896, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case28() {
    int N = 102;
    int nestings = 2;
    int target = 2;
    assertEquals(0.03624782850724145, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case29() {
    int N = 785;
    int nestings = 5;
    int target = 8;
    assertEquals(0.021499005838689945, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case30() {
    int N = 987;
    int nestings = 4;
    int target = 155;
    assertEquals(0.0010598056951279617, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case31() {
    int N = 891;
    int nestings = 5;
    int target = 12;
    assertEquals(0.015088303689213713, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case32() {
    int N = 643;
    int nestings = 1;
    int target = 203;
    assertEquals(0.0015552099533437014, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case33() {
    int N = 605;
    int nestings = 1;
    int target = 501;
    assertEquals(0.001652892561983471, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case34() {
    int N = 581;
    int nestings = 6;
    int target = 0;
    assertEquals(0.1694783864302501, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case35() {
    int N = 486;
    int nestings = 7;
    int target = 14;
    assertEquals(0.0049344330846180515, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case36() {
    int N = 959;
    int nestings = 3;
    int target = 46;
    assertEquals(0.004763085306245051, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case37() {
    int N = 916;
    int nestings = 1;
    int target = 506;
    assertEquals(0.001091703056768559, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case38() {
    int N = 57;
    int nestings = 3;
    int target = 9;
    assertEquals(0.02710388150689797, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case39() {
    int N = 837;
    int nestings = 5;
    int target = 16;
    assertEquals(0.011553253411289367, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case40() {
    int N = 606;
    int nestings = 7;
    int target = 5;
    assertEquals(0.0219060047961402, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case41() {
    int N = 659;
    int nestings = 1;
    int target = 410;
    assertEquals(0.0015174506828528073, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case42() {
    int N = 759;
    int nestings = 2;
    int target = 72;
    assertEquals(0.0030932126252227452, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case43() {
    int N = 240;
    int nestings = 4;
    int target = 3;
    assertEquals(0.04987453610310109, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case44() {
    int N = 57;
    int nestings = 1;
    int target = 19;
    assertEquals(0.017543859649122806, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case45() {
    int N = 284;
    int nestings = 3;
    int target = 15;
    assertEquals(0.014762373236258163, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case46() {
    int N = 917;
    int nestings = 3;
    int target = 31;
    assertEquals(0.006177665025348897, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case47() {
    int N = 376;
    int nestings = 6;
    int target = 1;
    assertEquals(0.09147638310634992, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case48() {
    int N = 528;
    int nestings = 6;
    int target = 1;
    assertEquals(0.08993321318420815, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case49() {
    int N = 201;
    int nestings = 4;
    int target = 10;
    assertEquals(0.02061285910905523, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case50() {
    int N = 586;
    int nestings = 3;
    int target = 146;
    assertEquals(0.0016333814602099218, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case51() {
    int N = 86;
    int nestings = 4;
    int target = 2;
    assertEquals(0.07738026823537242, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case52() {
    int N = 516;
    int nestings = 7;
    int target = 0;
    assertEquals(0.17027991841332316, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case53() {
    int N = 74;
    int nestings = 5;
    int target = 0;
    assertEquals(0.21417148361882282, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case54() {
    int N = 192;
    int nestings = 2;
    int target = 5;
    assertEquals(0.018483183731115113, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case55() {
    int N = 631;
    int nestings = 3;
    int target = 212;
    assertEquals(0.0009347776807777669, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case56() {
    int N = 476;
    int nestings = 5;
    int target = 13;
    assertEquals(0.01361167995370354, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case57() {
    int N = 804;
    int nestings = 8;
    int target = 2;
    assertEquals(0.04126063836425293, nestedrandomness.probability(N, nestings, target), DELTA);
  }

  @Test
  public void case58() {
    int N = 222;
    int nestings = 5;
    int target = 0;
    assertEquals(0.18471389957699386, nestedrandomness.probability(N, nestings, target), DELTA);
  }

}
