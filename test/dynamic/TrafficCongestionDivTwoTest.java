package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TrafficCongestionDivTwoTest {
  TrafficCongestionDivTwo trafficcongestiondivtwo = new TrafficCongestionDivTwo();

  @Test
  public void case1() {
    int treeHeight = 0;
    assertEquals(1L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case2() {
    int treeHeight = 1;
    assertEquals(1L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case3() {
    int treeHeight = 2;
    assertEquals(3L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case4() {
    int treeHeight = 3;
    assertEquals(5L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case5() {
    int treeHeight = 4;
    assertEquals(11L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case6() {
    int treeHeight = 5;
    assertEquals(21L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case7() {
    int treeHeight = 6;
    assertEquals(43L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case8() {
    int treeHeight = 7;
    assertEquals(85L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case9() {
    int treeHeight = 8;
    assertEquals(171L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case10() {
    int treeHeight = 9;
    assertEquals(341L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case11() {
    int treeHeight = 10;
    assertEquals(683L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case12() {
    int treeHeight = 11;
    assertEquals(1365L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case13() {
    int treeHeight = 12;
    assertEquals(2731L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case14() {
    int treeHeight = 13;
    assertEquals(5461L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case15() {
    int treeHeight = 14;
    assertEquals(10923L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case16() {
    int treeHeight = 15;
    assertEquals(21845L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case17() {
    int treeHeight = 16;
    assertEquals(43691L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case18() {
    int treeHeight = 17;
    assertEquals(87381L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case19() {
    int treeHeight = 18;
    assertEquals(174763L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case20() {
    int treeHeight = 19;
    assertEquals(349525L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case21() {
    int treeHeight = 20;
    assertEquals(699051L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case22() {
    int treeHeight = 21;
    assertEquals(1398101L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case23() {
    int treeHeight = 22;
    assertEquals(2796203L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case24() {
    int treeHeight = 23;
    assertEquals(5592405L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case25() {
    int treeHeight = 24;
    assertEquals(11184811L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case26() {
    int treeHeight = 25;
    assertEquals(22369621L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case27() {
    int treeHeight = 26;
    assertEquals(44739243L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case28() {
    int treeHeight = 27;
    assertEquals(89478485L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case29() {
    int treeHeight = 28;
    assertEquals(178956971L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case30() {
    int treeHeight = 29;
    assertEquals(357913941L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case31() {
    int treeHeight = 30;
    assertEquals(715827883L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case32() {
    int treeHeight = 31;
    assertEquals(1431655765L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case33() {
    int treeHeight = 32;
    assertEquals(2863311531L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case34() {
    int treeHeight = 33;
    assertEquals(5726623061L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case35() {
    int treeHeight = 34;
    assertEquals(11453246123L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case36() {
    int treeHeight = 35;
    assertEquals(22906492245L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case37() {
    int treeHeight = 36;
    assertEquals(45812984491L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case38() {
    int treeHeight = 37;
    assertEquals(91625968981L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case39() {
    int treeHeight = 38;
    assertEquals(183251937963L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case40() {
    int treeHeight = 39;
    assertEquals(366503875925L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case41() {
    int treeHeight = 40;
    assertEquals(733007751851L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case42() {
    int treeHeight = 41;
    assertEquals(1466015503701L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case43() {
    int treeHeight = 42;
    assertEquals(2932031007403L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case44() {
    int treeHeight = 43;
    assertEquals(5864062014805L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case45() {
    int treeHeight = 44;
    assertEquals(11728124029611L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case46() {
    int treeHeight = 45;
    assertEquals(23456248059221L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case47() {
    int treeHeight = 46;
    assertEquals(46912496118443L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case48() {
    int treeHeight = 47;
    assertEquals(93824992236885L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case49() {
    int treeHeight = 48;
    assertEquals(187649984473771L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case50() {
    int treeHeight = 49;
    assertEquals(375299968947541L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case51() {
    int treeHeight = 50;
    assertEquals(750599937895083L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case52() {
    int treeHeight = 51;
    assertEquals(1501199875790165L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case53() {
    int treeHeight = 52;
    assertEquals(3002399751580331L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case54() {
    int treeHeight = 53;
    assertEquals(6004799503160661L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case55() {
    int treeHeight = 54;
    assertEquals(12009599006321323L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case56() {
    int treeHeight = 55;
    assertEquals(24019198012642645L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case57() {
    int treeHeight = 56;
    assertEquals(48038396025285291L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case58() {
    int treeHeight = 57;
    assertEquals(96076792050570581L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case59() {
    int treeHeight = 58;
    assertEquals(192153584101141163L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case60() {
    int treeHeight = 59;
    assertEquals(384307168202282325L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

  @Test
  public void case61() {
    int treeHeight = 60;
    assertEquals(768614336404564651L, trafficcongestiondivtwo.theMinCars(treeHeight));
  }

}
