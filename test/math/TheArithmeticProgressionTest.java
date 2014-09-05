package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TheArithmeticProgressionTest {
  double DELTA = 1.0e-09;
  TheArithmeticProgression thearithmeticprogression = new TheArithmeticProgression();

  @Test
  public void case1() {
    int a = 0;
    int b = 1;
    int c = 2;
    assertEquals(0.0, thearithmeticprogression.minimumChange(a, b, c), DELTA);
  }

  @Test
  public void case2() {
    int a = 0;
    int b = 2;
    int c = 1;
    assertEquals(1.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.5);
  }

  @Test
  public void case3() {
    int a = 3;
    int b = 2;
    int c = 1;
    assertEquals(0.0, thearithmeticprogression.minimumChange(a, b, c), DELTA);
  }

  @Test
  public void case4() {
    int a = 4;
    int b = 4;
    int c = 8;
    assertEquals(2.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 2.0);
  }

  @Test
  public void case5() {
    int a = 1000;
    int b = 0;
    int c = 0;
    assertEquals(500.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 500.0);
  }

  @Test
  public void case6() {
    int a = 1000;
    int b = 1000;
    int c = 1000;
    assertEquals(0.0, thearithmeticprogression.minimumChange(a, b, c), DELTA);
  }

  @Test
  public void case7() {
    int a = 0;
    int b = 0;
    int c = 0;
    assertEquals(0.0, thearithmeticprogression.minimumChange(a, b, c), DELTA);
  }

  @Test
  public void case8() {
    int a = 0;
    int b = 1000;
    int c = 0;
    assertEquals(1000.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1000.0);
  }

  @Test
  public void case9() {
    int a = 1000;
    int b = 0;
    int c = 1000;
    assertEquals(1000.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1000.0);
  }

  @Test
  public void case10() {
    int a = 1000;
    int b = 0;
    int c = 0;
    assertEquals(500.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 500.0);
  }

  @Test
  public void case11() {
    int a = 6;
    int b = 7;
    int c = 8;
    assertEquals(0.0, thearithmeticprogression.minimumChange(a, b, c), DELTA);
  }

  @Test
  public void case12() {
    int a = 125;
    int b = 882;
    int c = 114;
    assertEquals(762.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 762.5);
  }

  @Test
  public void case13() {
    int a = 662;
    int b = 663;
    int c = 5;
    assertEquals(329.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 329.5);
  }

  @Test
  public void case14() {
    int a = 999;
    int b = 122;
    int c = 679;
    assertEquals(717.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 717.0);
  }

  @Test
  public void case15() {
    int a = 722;
    int b = 1000;
    int c = 900;
    assertEquals(189.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 189.0);
  }

  @Test
  public void case16() {
    int a = 722;
    int b = 900;
    int c = 1000;
    assertEquals(39.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 39.0);
  }

  @Test
  public void case17() {
    int a = 60;
    int b = 90;
    int c = 121;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case18() {
    int a = 500;
    int b = 301;
    int c = 901;
    assertEquals(399.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 399.5);
  }

  @Test
  public void case19() {
    int a = 814;
    int b = 502;
    int c = 699;
    assertEquals(254.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 254.5);
  }

  @Test
  public void case20() {
    int a = 10;
    int b = 1;
    int c = 2;
    assertEquals(5.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 5.0);
  }

  @Test
  public void case21() {
    int a = 1;
    int b = 3;
    int c = 1;
    assertEquals(2.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 2.0);
  }

  @Test
  public void case22() {
    int a = 1;
    int b = 2;
    int c = 5;
    assertEquals(1.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.0);
  }

  @Test
  public void case23() {
    int a = 1;
    int b = 5;
    int c = 10;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case24() {
    int a = 0;
    int b = 1;
    int c = 0;
    assertEquals(1.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.0);
  }

  @Test
  public void case25() {
    int a = 3;
    int b = 5;
    int c = 6;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case26() {
    int a = 1;
    int b = 2;
    int c = 1;
    assertEquals(1.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.0);
  }

  @Test
  public void case27() {
    int a = 2;
    int b = 4;
    int c = 7;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case28() {
    int a = 3;
    int b = 1;
    int c = 0;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case29() {
    int a = 3;
    int b = 5;
    int c = 3;
    assertEquals(2.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 2.0);
  }

  @Test
  public void case30() {
    int a = 1;
    int b = 2;
    int c = 100;
    assertEquals(48.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 48.5);
  }

  @Test
  public void case31() {
    int a = 50;
    int b = 100;
    int c = 250;
    assertEquals(50.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 50.0);
  }

  @Test
  public void case32() {
    int a = 1;
    int b = 4;
    int c = 10;
    assertEquals(1.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.5);
  }

  @Test
  public void case33() {
    int a = 2;
    int b = 2;
    int c = 3;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case34() {
    int a = 0;
    int b = 0;
    int c = 2;
    assertEquals(1.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.0);
  }

  @Test
  public void case35() {
    int a = 8;
    int b = 1;
    int c = 6;
    assertEquals(6.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 6.0);
  }

  @Test
  public void case36() {
    int a = 17;
    int b = 10;
    int c = 14;
    assertEquals(5.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 5.5);
  }

  @Test
  public void case37() {
    int a = 100;
    int b = 1;
    int c = 2;
    assertEquals(50.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 50.0);
  }

  @Test
  public void case38() {
    int a = 0;
    int b = 0;
    int c = 1000;
    assertEquals(500.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 500.0);
  }

  @Test
  public void case39() {
    int a = 4;
    int b = 2;
    int c = 1;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case40() {
    int a = 1;
    int b = 0;
    int c = 1;
    assertEquals(1.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.0);
  }

  @Test
  public void case41() {
    int a = 1;
    int b = 2;
    int c = 2;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case42() {
    int a = 10;
    int b = 1;
    int c = 10;
    assertEquals(9.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 9.0);
  }

  @Test
  public void case43() {
    int a = 1;
    int b = 1;
    int c = 3;
    assertEquals(1.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.0);
  }

  @Test
  public void case44() {
    int a = 2;
    int b = 5;
    int c = 2;
    assertEquals(3.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 3.0);
  }

  @Test
  public void case45() {
    int a = 5;
    int b = 6;
    int c = 8;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case46() {
    int a = 1;
    int b = 5;
    int c = 6;
    assertEquals(1.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.5);
  }

  @Test
  public void case47() {
    int a = 1;
    int b = 2;
    int c = 4;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case48() {
    int a = 1;
    int b = 5;
    int c = 8;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case49() {
    int a = 0;
    int b = 2;
    int c = 0;
    assertEquals(2.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 2.0);
  }

  @Test
  public void case50() {
    int a = 500;
    int b = 1;
    int c = 2;
    assertEquals(250.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 250.0);
  }

  @Test
  public void case51() {
    int a = 9;
    int b = 10;
    int c = 4;
    assertEquals(3.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 3.5);
  }

  @Test
  public void case52() {
    int a = 2;
    int b = 1;
    int c = 3;
    assertEquals(1.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.5);
  }

  @Test
  public void case53() {
    int a = 4;
    int b = 10;
    int c = 30;
    assertEquals(7.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 7.0);
  }

  @Test
  public void case54() {
    int a = 0;
    int b = 5;
    int c = 100;
    assertEquals(45.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 45.0);
  }

  @Test
  public void case55() {
    int a = 1;
    int b = 0;
    int c = 2;
    assertEquals(1.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.5);
  }

  @Test
  public void case56() {
    int a = 5;
    int b = 4;
    int c = 2;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case57() {
    int a = 3;
    int b = 2;
    int c = 2;
    assertEquals(0.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 0.5);
  }

  @Test
  public void case58() {
    int a = 2;
    int b = 5;
    int c = 5;
    assertEquals(1.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.5);
  }

  @Test
  public void case59() {
    int a = 2;
    int b = 0;
    int c = 1;
    assertEquals(1.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 1.5);
  }

  @Test
  public void case60() {
    int a = 0;
    int b = 10;
    int c = 100;
    assertEquals(40.0, thearithmeticprogression.minimumChange(a, b, c), DELTA * 40.0);
  }

  @Test
  public void case61() {
    int a = 1;
    int b = 2;
    int c = 8;
    assertEquals(2.5, thearithmeticprogression.minimumChange(a, b, c), DELTA * 2.5);
  }

}
