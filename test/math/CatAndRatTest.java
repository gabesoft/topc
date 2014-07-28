package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class CatAndRatTest {
  double DELTA = 1.0e-09;
  CatAndRat catandrat = new CatAndRat();

  @Test
  public void case1() {
    int R = 10;
    int T = 1;
    int Vrat = 1;
    int Vcat = 1;
    assertEquals(-1.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * -1.0);
  }

  @Test
  public void case2() {
    int R = 10;
    int T = 1;
    int Vrat = 1;
    int Vcat = 2;
    assertEquals(1.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 1.0);
  }

  @Test
  public void case3() {
    int R = 10;
    int T = 1;
    int Vrat = 2;
    int Vcat = 1;
    assertEquals(-1.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * -1.0);
  }

  @Test
  public void case4() {
    int R = 1000;
    int T = 1000;
    int Vrat = 1;
    int Vcat = 1000;
    assertEquals(1.001001001001001, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 1.001001001001001);
  }

  @Test
  public void case5() {
    int R = 1;
    int T = 1000;
    int Vrat = 1;
    int Vcat = 2;
    assertEquals(3.141592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3.141592653589793);
  }

  @Test
  public void case6() {
    int R = 1000;
    int T = 1000;
    int Vrat = 999;
    int Vcat = 1000;
    assertEquals(3141.592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3141.592653589793);
  }

  @Test
  public void case7() {
    int R = 1000;
    int T = 1000;
    int Vrat = 1;
    int Vcat = 1000;
    assertEquals(1.001001001001001, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 1.001001001001001);
  }

  @Test
  public void case8() {
    int R = 1;
    int T = 1000;
    int Vrat = 1;
    int Vcat = 1000;
    assertEquals(0.0031447373909807737, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 0.0031447373909807737);
  }

  @Test
  public void case9() {
    int R = 1;
    int T = 1;
    int Vrat = 1;
    int Vcat = 1000;
    assertEquals(0.001001001001001001, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 0.001001001001001001);
  }

  @Test
  public void case10() {
    int R = 1000;
    int T = 1;
    int Vrat = 1;
    int Vcat = 1000;
    assertEquals(0.001001001001001001, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 0.001001001001001001);
  }

  @Test
  public void case11() {
    int R = 1;
    int T = 1;
    int Vrat = 1000;
    int Vcat = 999;
    assertEquals(-1.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * -1.0);
  }

  @Test
  public void case12() {
    int R = 1;
    int T = 1;
    int Vrat = 1000;
    int Vcat = 1000;
    assertEquals(-1.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * -1.0);
  }

  @Test
  public void case13() {
    int R = 1000;
    int T = 1000;
    int Vrat = 3;
    int Vcat = 4;
    assertEquals(3000.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3000.0);
  }

  @Test
  public void case14() {
    int R = 1000;
    int T = 1000;
    int Vrat = 4;
    int Vcat = 5;
    assertEquals(3141.592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3141.592653589793);
  }

  @Test
  public void case15() {
    int R = 1000;
    int T = 1000;
    int Vrat = 1000;
    int Vcat = 1000;
    assertEquals(-1.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * -1.0);
  }

  @Test
  public void case16() {
    int R = 1000;
    int T = 1000;
    int Vrat = 1000;
    int Vcat = 1;
    assertEquals(-1.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * -1.0);
  }

  @Test
  public void case17() {
    int R = 109;
    int T = 24;
    int Vrat = 345;
    int Vcat = 435;
    assertEquals(3.804817769347638, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3.804817769347638);
  }

  @Test
  public void case18() {
    int R = 234;
    int T = 54;
    int Vrat = 23;
    int Vcat = 45;
    assertEquals(33.415121860909615, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 33.415121860909615);
  }

  @Test
  public void case19() {
    int R = 100;
    int T = 1;
    int Vrat = 314;
    int Vcat = 315;
    assertEquals(314.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 314.0);
  }

  @Test
  public void case20() {
    int R = 100;
    int T = 1;
    int Vrat = 315;
    int Vcat = 316;
    assertEquals(314.1592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 314.1592653589793);
  }

  @Test
  public void case21() {
    int R = 1;
    int T = 1;
    int Vrat = 1;
    int Vcat = 1;
    assertEquals(-1.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * -1.0);
  }

  @Test
  public void case22() {
    int R = 10;
    int T = 50;
    int Vrat = 1;
    int Vcat = 2;
    assertEquals(31.41592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 31.41592653589793);
  }

  @Test
  public void case23() {
    int R = 2;
    int T = 2;
    int Vrat = 4;
    int Vcat = 5;
    assertEquals(6.283185307179586, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 6.283185307179586);
  }

  @Test
  public void case24() {
    int R = 1;
    int T = 1000;
    int Vrat = 34;
    int Vcat = 989;
    assertEquals(0.00328962581527727, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 0.00328962581527727);
  }

  @Test
  public void case25() {
    int R = 122;
    int T = 598;
    int Vrat = 2;
    int Vcat = 100;
    assertEquals(3.9109622830403548, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3.9109622830403548);
  }

  @Test
  public void case26() {
    int R = 3;
    int T = 3;
    int Vrat = 4;
    int Vcat = 5;
    assertEquals(9.42477796076938, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 9.42477796076938);
  }

  @Test
  public void case27() {
    int R = 1;
    int T = 1;
    int Vrat = 998;
    int Vcat = 1000;
    assertEquals(1.5707963267948966, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 1.5707963267948966);
  }

  @Test
  public void case28() {
    int R = 10;
    int T = 7;
    int Vrat = 10;
    int Vcat = 20;
    assertEquals(3.141592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3.141592653589793);
  }

  @Test
  public void case29() {
    int R = 3;
    int T = 3;
    int Vrat = 3;
    int Vcat = 4;
    assertEquals(9.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 9.0);
  }

  @Test
  public void case30() {
    int R = 1;
    int T = 5;
    int Vrat = 1;
    int Vcat = 2;
    assertEquals(3.141592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3.141592653589793);
  }

  @Test
  public void case31() {
    int R = 1000;
    int T = 1;
    int Vrat = 1;
    int Vcat = 2;
    assertEquals(1.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 1.0);
  }

  @Test
  public void case32() {
    int R = 1;
    int T = 2;
    int Vrat = 1;
    int Vcat = 1000;
    assertEquals(0.002002002002002002, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 0.002002002002002002);
  }

  @Test
  public void case33() {
    int R = 1;
    int T = 1000;
    int Vrat = 5;
    int Vcat = 7;
    assertEquals(1.5707963267948966, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 1.5707963267948966);
  }

  @Test
  public void case34() {
    int R = 6;
    int T = 6;
    int Vrat = 5;
    int Vcat = 6;
    assertEquals(18.84955592153876, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 18.84955592153876);
  }

  @Test
  public void case35() {
    int R = 1;
    int T = 1000;
    int Vrat = 2;
    int Vcat = 3;
    assertEquals(3.141592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3.141592653589793);
  }

  @Test
  public void case36() {
    int R = 10;
    int T = 1;
    int Vrat = 40;
    int Vcat = 50;
    assertEquals(3.141592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 3.141592653589793);
  }

  @Test
  public void case37() {
    int R = 10;
    int T = 100;
    int Vrat = 3;
    int Vcat = 5;
    assertEquals(15.707963267948966, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 15.707963267948966);
  }

  @Test
  public void case38() {
    int R = 100;
    int T = 314;
    int Vrat = 1;
    int Vcat = 2;
    assertEquals(314.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 314.0);
  }

  @Test
  public void case39() {
    int R = 10;
    int T = 16;
    int Vrat = 2;
    int Vcat = 3;
    assertEquals(31.41592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 31.41592653589793);
  }

  @Test
  public void case40() {
    int R = 3;
    int T = 17;
    int Vrat = 1;
    int Vcat = 2;
    assertEquals(9.42477796076938, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 9.42477796076938);
  }

  @Test
  public void case41() {
    int R = 10;
    int T = 35;
    int Vrat = 1;
    int Vcat = 2;
    assertEquals(31.41592653589793, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 31.41592653589793);
  }

  @Test
  public void case42() {
    int R = 100;
    int T = 23;
    int Vrat = 2;
    int Vcat = 3;
    assertEquals(46.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 46.0);
  }

  @Test
  public void case43() {
    int R = 50;
    int T = 10;
    int Vrat = 6;
    int Vcat = 10;
    assertEquals(15.0, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 15.0);
  }

  @Test
  public void case44() {
    int R = 10;
    int T = 17;
    int Vrat = 2;
    int Vcat = 100;
    assertEquals(0.320570678937734, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 0.320570678937734);
  }

  @Test
  public void case45() {
    int R = 5;
    int T = 10;
    int Vrat = 3;
    int Vcat = 4;
    assertEquals(15.707963267948966, catandrat.getTime(R, T, Vrat, Vcat), DELTA * 15.707963267948966);
  }

}
