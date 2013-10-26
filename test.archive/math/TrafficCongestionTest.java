package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TrafficCongestionTest {
  TrafficCongestion trafficcongestion = new TrafficCongestion();

  @Test
  public void case1() {
    int treeHeight = 1;
    assertEquals(1, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case2() {
    int treeHeight = 2;
    assertEquals(3, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case3() {
    int treeHeight = 3;
    assertEquals(5, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case4() {
    int treeHeight = 0;
    assertEquals(1, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case5() {
    int treeHeight = 4;
    assertEquals(11, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case6() {
    int treeHeight = 5;
    assertEquals(21, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case7() {
    int treeHeight = 6;
    assertEquals(43, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case8() {
    int treeHeight = 7;
    assertEquals(85, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case9() {
    int treeHeight = 8;
    assertEquals(171, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case10() {
    int treeHeight = 9;
    assertEquals(341, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case11() {
    int treeHeight = 10;
    assertEquals(683, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case12() {
    int treeHeight = 11;
    assertEquals(1365, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case13() {
    int treeHeight = 12;
    assertEquals(2731, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case14() {
    int treeHeight = 13;
    assertEquals(5461, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case15() {
    int treeHeight = 14;
    assertEquals(10923, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case16() {
    int treeHeight = 15;
    assertEquals(21845, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case17() {
    int treeHeight = 16;
    assertEquals(43691, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case18() {
    int treeHeight = 17;
    assertEquals(87381, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case19() {
    int treeHeight = 18;
    assertEquals(174763, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case20() {
    int treeHeight = 19;
    assertEquals(349525, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case21() {
    int treeHeight = 20;
    assertEquals(699051, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case22() {
    int treeHeight = 25;
    assertEquals(22369621, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case23() {
    int treeHeight = 30;
    assertEquals(715827883, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case24() {
    int treeHeight = 35;
    assertEquals(906492091, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case25() {
    int treeHeight = 40;
    assertEquals(7746720, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case26() {
    int treeHeight = 45;
    assertEquals(247895029, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case27() {
    int treeHeight = 50;
    assertEquals(932640890, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case28() {
    int treeHeight = 55;
    assertEquals(844508266, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case29() {
    int treeHeight = 60;
    assertEquals(24264334, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case30() {
    int treeHeight = 70;
    assertEquals(846677507, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case31() {
    int treeHeight = 80;
    assertEquals(997760765, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case32() {
    int treeHeight = 90;
    assertEquals(707015872, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case33() {
    int treeHeight = 100;
    assertEquals(984247526, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case34() {
    int treeHeight = 200;
    assertEquals(999630053, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case35() {
    int treeHeight = 300;
    assertEquals(548033842, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case36() {
    int treeHeight = 500;
    assertEquals(260322005, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case37() {
    int treeHeight = 700;
    assertEquals(120478547, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case38() {
    int treeHeight = 1000;
    assertEquals(458948807, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case39() {
    int treeHeight = 3000;
    assertEquals(443800320, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case40() {
    int treeHeight = 5000;
    assertEquals(573461717, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case41() {
    int treeHeight = 10000;
    assertEquals(270407868, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case42() {
    int treeHeight = 30000;
    assertEquals(777260071, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case43() {
    int treeHeight = 50000;
    assertEquals(12110301, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case44() {
    int treeHeight = 100000;
    assertEquals(71815678, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case45() {
    int treeHeight = 500000;
    assertEquals(311754146, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case46() {
    int treeHeight = 1000000;
    assertEquals(490028042, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case47() {
    int treeHeight = 999999;
    assertEquals(745014024, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case48() {
    int treeHeight = 679379;
    assertEquals(19761069, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case49() {
    int treeHeight = 191807;
    assertEquals(565569761, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case50() {
    int treeHeight = 590524;
    assertEquals(789815123, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case51() {
    int treeHeight = 730706;
    assertEquals(862680469, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case52() {
    int treeHeight = 606763;
    assertEquals(438659788, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case53() {
    int treeHeight = 531434;
    assertEquals(322697396, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case54() {
    int treeHeight = 206743;
    assertEquals(548124278, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case55() {
    int treeHeight = 260716;
    assertEquals(134950712, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case56() {
    int treeHeight = 80188;
    assertEquals(302907143, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case57() {
    int treeHeight = 309019;
    assertEquals(305102876, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case58() {
    int treeHeight = 850657;
    assertEquals(419343001, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case59() {
    int treeHeight = 10464;
    assertEquals(874709788, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case60() {
    int treeHeight = 577394;
    assertEquals(187290663, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case61() {
    int treeHeight = 756092;
    assertEquals(954114375, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case62() {
    int treeHeight = 460375;
    assertEquals(30653388, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case63() {
    int treeHeight = 25693;
    assertEquals(520134322, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case64() {
    int treeHeight = 855602;
    assertEquals(263216797, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case65() {
    int treeHeight = 454356;
    assertEquals(756144638, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case66() {
    int treeHeight = 53077;
    assertEquals(235894722, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case67() {
    int treeHeight = 110324;
    assertEquals(46881352, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case68() {
    int treeHeight = 388295;
    assertEquals(520690119, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case69() {
    int treeHeight = 347315;
    assertEquals(909029981, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case70() {
    int treeHeight = 514547;
    assertEquals(893500017, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case71() {
    int treeHeight = 101646;
    assertEquals(704924855, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case72() {
    int treeHeight = 372640;
    assertEquals(298024908, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case73() {
    int treeHeight = 627719;
    assertEquals(484506965, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case74() {
    int treeHeight = 257690;
    assertEquals(257076174, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case75() {
    int treeHeight = 79948;
    assertEquals(7888535, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case76() {
    int treeHeight = 30915;
    assertEquals(32206084, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case77() {
    int treeHeight = 265009;
    assertEquals(378700405, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case78() {
    int treeHeight = 585858;
    assertEquals(548973404, trafficcongestion.theMinCars(treeHeight));
  }

  @Test
  public void case79() {
    int treeHeight = 747474;
    assertEquals(822915066, trafficcongestion.theMinCars(treeHeight));
  }

}
