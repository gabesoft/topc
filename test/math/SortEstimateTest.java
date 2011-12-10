package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SortEstimateTest {
  double DELTA = 1.0e-09;
  SortEstimate sortestimate = new SortEstimate();

  @Test
  public void case1() {
    int c = 1;
    int time = 8;
    assertEquals(4.0, sortestimate.howMany(c, time), DELTA * 4.0);
  }

  @Test
  public void case2() {
    int c = 1;
    int time = 1073741824;
    assertEquals(42378687.01779632, sortestimate.howMany(c, time), DELTA * 42378687.01779632);
  }

  @Test
  public void case3() {
    int c = 1;
    int time = 20971520;
    assertEquals(1048576.0, sortestimate.howMany(c, time), DELTA * 1048576.0);
  }

  @Test
  public void case4() {
    int c = 1;
    int time = 1744830463;
    assertEquals(67108863.963560425, sortestimate.howMany(c, time), DELTA * 67108863.963560425);
  }

  @Test
  public void case5() {
    int c = 2;
    int time = 16;
    assertEquals(4.0, sortestimate.howMany(c, time), DELTA * 4.0);
  }

  @Test
  public void case6() {
    int c = 37;
    int time = 12392342;
    assertEquals(23104.999312341137, sortestimate.howMany(c, time), DELTA * 23104.999312341137);
  }

  @Test
  public void case7() {
    int c = 1;
    int time = 2000000000;
    assertEquals(76374950.90348122, sortestimate.howMany(c, time), DELTA * 76374950.90348122);
  }

  @Test
  public void case8() {
    int c = 15;
    int time = 183518033;
    assertEquals(634711.5366691528, sortestimate.howMany(c, time), DELTA * 634711.5366691528);
  }

  @Test
  public void case9() {
    int c = 94;
    int time = 528002855;
    assertEquals(308072.16281298193, sortestimate.howMany(c, time), DELTA * 308072.16281298193);
  }

  @Test
  public void case10() {
    int c = 22;
    int time = 1891962415;
    assertEquals(3926030.802208677, sortestimate.howMany(c, time), DELTA * 3926030.802208677);
  }

  @Test
  public void case11() {
    int c = 19;
    int time = 21449736;
    assertEquals(70129.92471231497, sortestimate.howMany(c, time), DELTA * 70129.92471231497);
  }

  @Test
  public void case12() {
    int c = 41;
    int time = 251000508;
    assertEquals(333658.1565933969, sortestimate.howMany(c, time), DELTA * 333658.1565933969);
  }

  @Test
  public void case13() {
    int c = 41;
    int time = 682091086;
    assertEquals(844976.7106648742, sortestimate.howMany(c, time), DELTA * 844976.7106648742);
  }

  @Test
  public void case14() {
    int c = 15;
    int time = 324891869;
    assertEquals(1080626.000222133, sortestimate.howMany(c, time), DELTA * 1080626.000222133);
  }

  @Test
  public void case15() {
    int c = 100;
    int time = 269939035;
    assertEquals(156438.87972686428, sortestimate.howMany(c, time), DELTA * 156438.87972686428);
  }

  @Test
  public void case16() {
    int c = 65;
    int time = 150597632;
    assertEquals(135872.67212630875, sortestimate.howMany(c, time), DELTA * 135872.67212630875);
  }

  @Test
  public void case17() {
    int c = 82;
    int time = 1668460444;
    assertEquals(1019427.0794480281, sortestimate.howMany(c, time), DELTA * 1019427.0794480281);
  }

  @Test
  public void case18() {
    int c = 94;
    int time = 698125302;
    assertEquals(399152.58894443273, sortestimate.howMany(c, time), DELTA * 399152.58894443273);
  }

  @Test
  public void case19() {
    int c = 73;
    int time = 537393400;
    assertEquals(395894.080674982, sortestimate.howMany(c, time), DELTA * 395894.080674982);
  }

  @Test
  public void case20() {
    int c = 61;
    int time = 952343733;
    assertEquals(796412.1957200351, sortestimate.howMany(c, time), DELTA * 796412.1957200351);
  }

  @Test
  public void case21() {
    int c = 62;
    int time = 1668728800;
    assertEquals(1323517.520513234, sortestimate.howMany(c, time), DELTA * 1323517.520513234);
  }

  @Test
  public void case22() {
    int c = 67;
    int time = 1422724322;
    assertEquals(1060844.4313069163, sortestimate.howMany(c, time), DELTA * 1060844.4313069163);
  }

  @Test
  public void case23() {
    int c = 50;
    int time = 1302510048;
    assertEquals(1283769.883887477, sortestimate.howMany(c, time), DELTA * 1283769.883887477);
  }

  @Test
  public void case24() {
    int c = 72;
    int time = 1240983207;
    assertEquals(873315.4015855292, sortestimate.howMany(c, time), DELTA * 873315.4015855292);
  }

  @Test
  public void case25() {
    int c = 61;
    int time = 1668868721;
    assertEquals(1343872.2486778102, sortestimate.howMany(c, time), DELTA * 1343872.2486778102);
  }

  @Test
  public void case26() {
    int c = 70;
    int time = 672611577;
    assertEquals(507012.8623876511, sortestimate.howMany(c, time), DELTA * 507012.8623876511);
  }

  @Test
  public void case27() {
    int c = 41;
    int time = 844981191;
    assertEquals(1031674.1952518377, sortestimate.howMany(c, time), DELTA * 1031674.1952518377);
  }

  @Test
  public void case28() {
    int c = 69;
    int time = 346799919;
    assertEquals(277924.8297328659, sortestimate.howMany(c, time), DELTA * 277924.8297328659);
  }

  @Test
  public void case29() {
    int c = 96;
    int time = 1650394599;
    assertEquals(871225.0564874781, sortestimate.howMany(c, time), DELTA * 871225.0564874781);
  }

  @Test
  public void case30() {
    int c = 41;
    int time = 800275356;
    assertEquals(980681.0457517206, sortestimate.howMany(c, time), DELTA * 980681.0457517206);
  }

  @Test
  public void case31() {
    int c = 47;
    int time = 1751439252;
    assertEquals(1793764.4273233637, sortestimate.howMany(c, time), DELTA * 1793764.4273233637);
  }

  @Test
  public void case32() {
    int c = 72;
    int time = 1034087829;
    assertEquals(736868.1134626163, sortestimate.howMany(c, time), DELTA * 736868.1134626163);
  }

  @Test
  public void case33() {
    int c = 65;
    int time = 1405206580;
    assertEquals(1078722.5591509202, sortestimate.howMany(c, time), DELTA * 1078722.5591509202);
  }

  @Test
  public void case34() {
    int c = 97;
    int time = 698397013;
    assertEquals(387824.0070168886, sortestimate.howMany(c, time), DELTA * 387824.0070168886);
  }

  @Test
  public void case35() {
    int c = 45;
    int time = 1345840599;
    assertEquals(1460472.8429022175, sortestimate.howMany(c, time), DELTA * 1460472.8429022175);
  }

  @Test
  public void case36() {
    int c = 92;
    int time = 1248825953;
    assertEquals(699151.35947252, sortestimate.howMany(c, time), DELTA * 699151.35947252);
  }

  @Test
  public void case37() {
    int c = 22;
    int time = 1200654528;
    assertEquals(2563460.5078692725, sortestimate.howMany(c, time), DELTA * 2563460.5078692725);
  }

  @Test
  public void case38() {
    int c = 1;
    int time = 1999999999;
    assertEquals(76374950.86728776, sortestimate.howMany(c, time), DELTA * 76374950.86728776);
  }

  @Test
  public void case39() {
    int c = 1;
    int time = 2000000000;
    assertEquals(76374950.90348122, sortestimate.howMany(c, time), DELTA * 76374950.90348122);
  }

  @Test
  public void case40() {
    int c = 2;
    int time = 1999999997;
    assertEquals(39620077.67021034, sortestimate.howMany(c, time), DELTA * 39620077.67021034);
  }

  @Test
  public void case41() {
    int c = 1;
    int time = 1;
    assertEquals(1.5596104694623691, sortestimate.howMany(c, time), DELTA * 1.5596104694623691);
  }

  @Test
  public void case42() {
    int c = 43;
    int time = 2000000000;
    assertEquals(2207091.972283502, sortestimate.howMany(c, time), DELTA * 2207091.972283502);
  }

  @Test
  public void case43() {
    int c = 100;
    int time = 1;
    assertEquals(1.0069076686081029, sortestimate.howMany(c, time), DELTA * 1.0069076686081029);
  }

  @Test
  public void case44() {
    int c = 1;
    int time = 3;
    assertEquals(2.3884234844993384, sortestimate.howMany(c, time), DELTA * 2.3884234844993384);
  }

  @Test
  public void case45() {
    int c = 100;
    int time = 2523526;
    assertEquals(2264.2982128022004, sortestimate.howMany(c, time), DELTA * 2264.2982128022004);
  }

  @Test
  public void case46() {
    int c = 5;
    int time = 100;
    assertEquals(7.081840920218569, sortestimate.howMany(c, time), DELTA * 7.081840920218569);
  }

  @Test
  public void case47() {
    int c = 1;
    int time = 2;
    assertEquals(2.0, sortestimate.howMany(c, time), DELTA * 2.0);
  }

  @Test
  public void case48() {
    int c = 2;
    int time = 2000000000;
    assertEquals(39620077.72642713, sortestimate.howMany(c, time), DELTA * 39620077.72642713);
  }

}
