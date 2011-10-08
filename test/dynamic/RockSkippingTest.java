package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RockSkippingTest {
  double DELTA = 1.0e-09;
  RockSkipping rockskipping = new RockSkipping();

  @Test
  public void case1() {
    String pads = ".";
    int maxDist = 100;
    assertEquals(100.0, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case2() {
    String pads = "...X";
    int maxDist = 2;
    assertEquals(50.0, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case3() {
    String pads = "........................X";
    int maxDist = 50;
    assertEquals(11.60725450562586, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case4() {
    String pads = ".XXX";
    int maxDist = 2;
    assertEquals(0.0, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case5() {
    String pads = ".XXXXXXXX............";
    int maxDist = 100;
    assertEquals(2.2238319526041714e-22, rockskipping.probability(pads, maxDist), 1.0e-33);
  }

  @Test
  public void case6() {
    String pads = ".................................................X";
    int maxDist = 100;
    assertEquals(12.468806209710456, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case7() {
    String pads = ".XXXX.XXXXXXXX.XXXXXXX.XXXXXX.XXXXX.XXXX.XXX.XX.X.";
    int maxDist = 100;
    assertEquals(1.7767779346052529e-71, rockskipping.probability(pads, maxDist), 1.0e-81);
  }

  @Test
  public void case8() {
    String pads = ".............................................X";
    int maxDist = 9;
    assertEquals(99.99972442680777, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case9() {
    String pads = ".X...X...";
    int maxDist = 39;
    assertEquals(0.0025670769630560513, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case10() {
    String pads = "...XX.....X.X.X.XX...X.X......XX........X..";
    int maxDist = 81;
    assertEquals(9.054637332419204e-11, rockskipping.probability(pads, maxDist), 1.0e-21);
  }

  @Test
  public void case11() {
    String pads = "..XX..XX.X...X....X.XX.....X.XX...X...X";
    int maxDist = 22;
    assertEquals(0.0013518497737741674, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case12() {
    String pads = "...........X.....X.....XX..";
    int maxDist = 47;
    assertEquals(0.033741068149067195, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case13() {
    String pads = "..X..XXX";
    int maxDist = 40;
    assertEquals(5.256969370279521e-12, rockskipping.probability(pads, maxDist), 1.0e-22);
  }

  @Test
  public void case14() {
    String pads = "...X......XXXX...XX.X..X...XX...";
    int maxDist = 48;
    assertEquals(5.408479511004734e-08, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case15() {
    String pads = "..X...........X..XX.X";
    int maxDist = 82;
    assertEquals(8.775600468363586e-09, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case16() {
    String pads = "..X..";
    int maxDist = 99;
    assertEquals(1.1978720146654002e-08, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case17() {
    String pads = "....X...X....X..X..X.X.XXX..XX....X....X....X...";
    int maxDist = 79;
    assertEquals(3.9264889512253644e-11, rockskipping.probability(pads, maxDist), 1.0e-21);
  }

  @Test
  public void case18() {
    String pads = ".X..";
    int maxDist = 54;
    assertEquals(5.9815133740789975e-06, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case19() {
    String pads = ".X.X..X.X..X..X.XX.XX.XXXX...";
    int maxDist = 22;
    assertEquals(4.5031054188698496e-06, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case20() {
    String pads = ".XXXX..X..X.....XX.X.X..X....X";
    int maxDist = 60;
    assertEquals(7.611025001457206e-13, rockskipping.probability(pads, maxDist), 1.0e-23);
  }

  @Test
  public void case21() {
    String pads = ".X.X.X..X....X";
    int maxDist = 11;
    assertEquals(0.25908890492223824, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case22() {
    String pads = ".X..XXX.....X.....X..X..X......X..X..";
    int maxDist = 88;
    assertEquals(2.7926146794701252e-11, rockskipping.probability(pads, maxDist), 1.0e-21);
  }

  @Test
  public void case23() {
    String pads = ".XX..X....X..X.........X.X....X";
    int maxDist = 97;
    assertEquals(9.401950020419752e-12, rockskipping.probability(pads, maxDist), 1.0e-22);
  }

  @Test
  public void case24() {
    String pads = "..X";
    int maxDist = 66;
    assertEquals(6.224378501046996e-11, rockskipping.probability(pads, maxDist), 1.0e-21);
  }

  @Test
  public void case25() {
    String pads = "...X.....";
    int maxDist = 89;
    assertEquals(0.001923820483383841, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case26() {
    String pads = ".X.............";
    int maxDist = 41;
    assertEquals(4.8816736249265915, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case27() {
    String pads = "....";
    int maxDist = 58;
    assertEquals(100.0, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case28() {
    String pads = ".....X...";
    int maxDist = 38;
    assertEquals(0.8330836879326521, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case29() {
    String pads = "..X.........X..X...X.X.....X..X....X..X.XX.";
    int maxDist = 41;
    assertEquals(0.00022363089847869097, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case30() {
    String pads = "..XX....XXX.X..XX.XX..X.X....XXX........X....X.";
    int maxDist = 34;
    assertEquals(5.443438735931444e-06, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case31() {
    String pads = ".";
    int maxDist = 30;
    assertEquals(99.99999999999993, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case32() {
    String pads = ".X...X........X.X.....XX.XXXX...XX.X..X";
    int maxDist = 72;
    assertEquals(2.680172485163696e-13, rockskipping.probability(pads, maxDist), 1.0e-23);
  }

  @Test
  public void case33() {
    String pads = "..XX...X.X....XX..X..X..X....X..X...X....";
    int maxDist = 88;
    assertEquals(1.7483914206046326e-12, rockskipping.probability(pads, maxDist), 1.0e-22);
  }

  @Test
  public void case34() {
    String pads = "..X.X....X....X..X.X.X.";
    int maxDist = 17;
    assertEquals(0.07710324832143937, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case35() {
    String pads = ".XX..X...X.....X.X..XX....X....";
    int maxDist = 100;
    assertEquals(3.6009254891763555e-14, rockskipping.probability(pads, maxDist), 1.0e-24);
  }

  @Test
  public void case36() {
    String pads = ".X.XX..X..X.X...XXX....XXX...X...X.............";
    int maxDist = 25;
    assertEquals(0.005761660905876298, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case37() {
    String pads = ".X.X..X.XX.X";
    int maxDist = 20;
    assertEquals(4.693924387262402e-06, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case38() {
    String pads = ".XX.X.X....X.....X..XXX...XX...X....X...X...";
    int maxDist = 31;
    assertEquals(0.00021462438610287305, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case39() {
    String pads = "..XX.X....XXXX.....X.....X..........X....";
    int maxDist = 27;
    assertEquals(0.026176262517962977, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case40() {
    String pads = ".....X...";
    int maxDist = 21;
    assertEquals(6.496903497690426, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case41() {
    String pads = ".X...XX..X..";
    int maxDist = 26;
    assertEquals(0.0007091343055286317, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case42() {
    String pads = "..X.X.X.X......XX.XX.X...........X..X.X..";
    int maxDist = 22;
    assertEquals(0.016389625615091247, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case43() {
    String pads = ".XX...X.X..X..XX.X......XX............X..";
    int maxDist = 23;
    assertEquals(0.03424952174008819, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case44() {
    String pads = "..X..X.XX..X.XXXX.XX...X...X.X......X........X.";
    int maxDist = 57;
    assertEquals(8.974053011613222e-10, rockskipping.probability(pads, maxDist), 1.0e-21);
  }

  @Test
  public void case45() {
    String pads = ".X....XX...........";
    int maxDist = 62;
    assertEquals(0.0013684006627930753, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case46() {
    String pads = ".X.X.XX.X.X..X...X..XX.";
    int maxDist = 65;
    assertEquals(7.431232978113156e-16, rockskipping.probability(pads, maxDist), 1.0e-26);
  }

  @Test
  public void case47() {
    String pads = "..XX.....X";
    int maxDist = 51;
    assertEquals(3.653775630395992e-07, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case48() {
    String pads = "..X........X...X........XX...X....X.XXX..";
    int maxDist = 62;
    assertEquals(1.187051793350153e-06, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case49() {
    String pads = "....";
    int maxDist = 14;
    assertEquals(99.99999999999999, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case50() {
    String pads = ".";
    int maxDist = 100;
    assertEquals(100.0, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case51() {
    String pads = ".................................................X";
    int maxDist = 100;
    assertEquals(12.468806209710456, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case52() {
    String pads = "..................................................";
    int maxDist = 100;
    assertEquals(100.0, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case53() {
    String pads = "........X.......X";
    int maxDist = 100;
    assertEquals(0.0002460259452965898, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case54() {
    String pads = "..............................X..................";
    int maxDist = 100;
    assertEquals(11.952145910259919, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case55() {
    String pads = "......X..X....";
    int maxDist = 100;
    assertEquals(1.244803813333236e-05, rockskipping.probability(pads, maxDist), DELTA);
  }

  @Test
  public void case56() {
    String pads = ".X.X.XXX......X..X..X";
    int maxDist = 10;
    assertEquals(0.2698688271604938, rockskipping.probability(pads, maxDist), DELTA);
  }

}
