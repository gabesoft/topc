package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class JumpFurtherTest {
  JumpFurther jumpfurther = new JumpFurther();

  @Test
  public void case1() {
    int N = 2;
    int badStep = 2;
    assertEquals(3, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case2() {
    int N = 2;
    int badStep = 1;
    assertEquals(2, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case3() {
    int N = 3;
    int badStep = 3;
    assertEquals(5, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case4() {
    int N = 1313;
    int badStep = 5858;
    assertEquals(862641, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case5() {
    int N = 1;
    int badStep = 757065;
    assertEquals(1, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case6() {
    int N = 2000;
    int badStep = 4000000;
    assertEquals(2001000, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case7() {
    int N = 2000;
    int badStep = 1;
    assertEquals(2000999, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case8() {
    int N = 1;
    int badStep = 1;
    assertEquals(0, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case9() {
    int N = 2000;
    int badStep = 2001000;
    assertEquals(2000999, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case10() {
    int N = 1;
    int badStep = 1;
    assertEquals(0, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case11() {
    int N = 2;
    int badStep = 2;
    assertEquals(3, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case12() {
    int N = 3;
    int badStep = 2;
    assertEquals(6, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case13() {
    int N = 4;
    int badStep = 3;
    assertEquals(9, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case14() {
    int N = 5;
    int badStep = 1;
    assertEquals(14, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case15() {
    int N = 13;
    int badStep = 4;
    assertEquals(91, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case16() {
    int N = 22;
    int badStep = 12;
    assertEquals(253, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case17() {
    int N = 31;
    int badStep = 2;
    assertEquals(496, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case18() {
    int N = 40;
    int badStep = 10;
    assertEquals(819, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case19() {
    int N = 49;
    int badStep = 15;
    assertEquals(1224, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case20() {
    int N = 2000;
    int badStep = 1888;
    assertEquals(2001000, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case21() {
    int N = 1993;
    int badStep = 219;
    assertEquals(1987021, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case22() {
    int N = 1986;
    int badStep = 257;
    assertEquals(1973091, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case23() {
    int N = 1979;
    int badStep = 65;
    assertEquals(1959210, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case24() {
    int N = 1972;
    int badStep = 717;
    assertEquals(1945378, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case25() {
    int N = 1965;
    int badStep = 1376;
    assertEquals(1931595, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case26() {
    int N = 17;
    int badStep = 55;
    assertEquals(152, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case27() {
    int N = 25;
    int badStep = 1;
    assertEquals(324, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case28() {
    int N = 33;
    int badStep = 28;
    assertEquals(560, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case29() {
    int N = 41;
    int badStep = 105;
    assertEquals(860, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case30() {
    int N = 49;
    int badStep = 45;
    assertEquals(1224, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case31() {
    int N = 2000;
    int badStep = 199396;
    assertEquals(2000999, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case32() {
    int N = 1987;
    int badStep = 7875;
    assertEquals(1975077, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case33() {
    int N = 1974;
    int badStep = 355746;
    assertEquals(1949324, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case34() {
    int N = 1961;
    int badStep = 305371;
    assertEquals(1923740, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case35() {
    int N = 1948;
    int badStep = 65341;
    assertEquals(1898325, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case36() {
    int N = 1935;
    int badStep = 41616;
    assertEquals(1873079, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case37() {
    int N = 1499;
    int badStep = 1122751;
    assertEquals(1124249, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case38() {
    int N = 1599;
    int badStep = 1268028;
    assertEquals(1279199, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case39() {
    int N = 1699;
    int badStep = 1430586;
    assertEquals(1444149, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case40() {
    int N = 1799;
    int badStep = 1601155;
    assertEquals(1619099, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case41() {
    int N = 1899;
    int badStep = 1794565;
    assertEquals(1804049, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case42() {
    int N = 1999;
    int badStep = 1983036;
    assertEquals(1998999, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case43() {
    int N = 2000;
    int badStep = 287332;
    assertEquals(2001000, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case44() {
    int N = 1699;
    int badStep = 1827096;
    assertEquals(1444150, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case45() {
    int N = 1398;
    int badStep = 2120892;
    assertEquals(977901, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case46() {
    int N = 1097;
    int badStep = 3205588;
    assertEquals(602253, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case47() {
    int N = 796;
    int badStep = 3444833;
    assertEquals(317206, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case48() {
    int N = 495;
    int badStep = 2230356;
    assertEquals(122760, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case49() {
    int N = 2;
    int badStep = 3;
    assertEquals(2, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case50() {
    int N = 20;
    int badStep = 21;
    assertEquals(209, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case51() {
    int N = 5;
    int badStep = 10;
    assertEquals(14, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case52() {
    int N = 3;
    int badStep = 6;
    assertEquals(5, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case53() {
    int N = 2000;
    int badStep = 400000;
    assertEquals(2001000, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case54() {
    int N = 4;
    int badStep = 6;
    assertEquals(9, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case55() {
    int N = 5;
    int badStep = 15;
    assertEquals(14, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case56() {
    int N = 7;
    int badStep = 15;
    assertEquals(27, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case57() {
    int N = 1989;
    int badStep = 3999999;
    assertEquals(1979055, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case58() {
    int N = 1;
    int badStep = 100;
    assertEquals(1, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case59() {
    int N = 10;
    int badStep = 55;
    assertEquals(54, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case60() {
    int N = 3;
    int badStep = 10;
    assertEquals(6, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case61() {
    int N = 14;
    int badStep = 55;
    assertEquals(104, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case62() {
    int N = 5;
    int badStep = 6;
    assertEquals(14, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case63() {
    int N = 15;
    int badStep = 15;
    assertEquals(119, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case64() {
    int N = 5;
    int badStep = 3;
    assertEquals(14, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case65() {
    int N = 2000;
    int badStep = 3545;
    assertEquals(2001000, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case66() {
    int N = 4;
    int badStep = 10;
    assertEquals(9, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case67() {
    int N = 100;
    int badStep = 7;
    assertEquals(5050, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case68() {
    int N = 10;
    int badStep = 15;
    assertEquals(54, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case69() {
    int N = 5;
    int badStep = 7;
    assertEquals(15, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case70() {
    int N = 1;
    int badStep = 6;
    assertEquals(1, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case71() {
    int N = 5;
    int badStep = 21;
    assertEquals(15, jumpfurther.furthest(N, badStep));
  }

  @Test
  public void case72() {
    int N = 1999;
    int badStep = 1999000;
    assertEquals(1998999, jumpfurther.furthest(N, badStep));
  }

}
