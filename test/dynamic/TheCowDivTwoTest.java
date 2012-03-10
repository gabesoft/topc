package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TheCowDivTwoTest {
  TheCowDivTwo thecowdivtwo = new TheCowDivTwo();

  @Test
  public void case1() {
    int N = 7;
    int K = 4;
    assertEquals(5, thecowdivtwo.find(N, K));
  }

  @Test
  public void case2() {
    int N = 1;
    int K = 1;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case3() {
    int N = 58;
    int K = 4;
    assertEquals(7322, thecowdivtwo.find(N, K));
  }

  @Test
  public void case4() {
    int N = 502;
    int K = 7;
    assertEquals(704466492, thecowdivtwo.find(N, K));
  }

  @Test
  public void case5() {
    int N = 1000;
    int K = 47;
    assertEquals(219736903, thecowdivtwo.find(N, K));
  }

  @Test
  public void case6() {
    int N = 2;
    int K = 1;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case7() {
    int N = 2;
    int K = 2;
    assertEquals(0, thecowdivtwo.find(N, K));
  }

  @Test
  public void case8() {
    int N = 3;
    int K = 1;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case9() {
    int N = 3;
    int K = 2;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case10() {
    int N = 3;
    int K = 3;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case11() {
    int N = 4;
    int K = 1;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case12() {
    int N = 4;
    int K = 2;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case13() {
    int N = 4;
    int K = 3;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case14() {
    int N = 4;
    int K = 4;
    assertEquals(0, thecowdivtwo.find(N, K));
  }

  @Test
  public void case15() {
    int N = 5;
    int K = 1;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case16() {
    int N = 5;
    int K = 2;
    assertEquals(2, thecowdivtwo.find(N, K));
  }

  @Test
  public void case17() {
    int N = 5;
    int K = 3;
    assertEquals(2, thecowdivtwo.find(N, K));
  }

  @Test
  public void case18() {
    int N = 5;
    int K = 4;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case19() {
    int N = 5;
    int K = 5;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case20() {
    int N = 47;
    int K = 47;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case21() {
    int N = 1000;
    int K = 1;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

  @Test
  public void case22() {
    int N = 1000;
    int K = 2;
    assertEquals(499, thecowdivtwo.find(N, K));
  }

  @Test
  public void case23() {
    int N = 1000;
    int K = 3;
    assertEquals(166167, thecowdivtwo.find(N, K));
  }

  @Test
  public void case24() {
    int N = 1000;
    int K = 4;
    assertEquals(41417249, thecowdivtwo.find(N, K));
  }

  @Test
  public void case25() {
    int N = 1000;
    int K = 5;
    assertEquals(250291195, thecowdivtwo.find(N, K));
  }

  @Test
  public void case26() {
    int N = 1000;
    int K = 46;
    assertEquals(78998436, thecowdivtwo.find(N, K));
  }

  @Test
  public void case27() {
    int N = 1000;
    int K = 45;
    assertEquals(581148813, thecowdivtwo.find(N, K));
  }

  @Test
  public void case28() {
    int N = 1000;
    int K = 44;
    assertEquals(862248962, thecowdivtwo.find(N, K));
  }

  @Test
  public void case29() {
    int N = 1000;
    int K = 43;
    assertEquals(347713553, thecowdivtwo.find(N, K));
  }

  @Test
  public void case30() {
    int N = 1000;
    int K = 42;
    assertEquals(814019761, thecowdivtwo.find(N, K));
  }

  @Test
  public void case31() {
    int N = 1000;
    int K = 41;
    assertEquals(346385493, thecowdivtwo.find(N, K));
  }

  @Test
  public void case32() {
    int N = 1000;
    int K = 40;
    assertEquals(580623585, thecowdivtwo.find(N, K));
  }

  @Test
  public void case33() {
    int N = 173;
    int K = 21;
    assertEquals(456891727, thecowdivtwo.find(N, K));
  }

  @Test
  public void case34() {
    int N = 248;
    int K = 47;
    assertEquals(742986228, thecowdivtwo.find(N, K));
  }

  @Test
  public void case35() {
    int N = 879;
    int K = 2;
    assertEquals(439, thecowdivtwo.find(N, K));
  }

  @Test
  public void case36() {
    int N = 290;
    int K = 44;
    assertEquals(888231391, thecowdivtwo.find(N, K));
  }

  @Test
  public void case37() {
    int N = 320;
    int K = 16;
    assertEquals(184923077, thecowdivtwo.find(N, K));
  }

  @Test
  public void case38() {
    int N = 283;
    int K = 20;
    assertEquals(769892195, thecowdivtwo.find(N, K));
  }

  @Test
  public void case39() {
    int N = 433;
    int K = 16;
    assertEquals(737181366, thecowdivtwo.find(N, K));
  }

  @Test
  public void case40() {
    int N = 899;
    int K = 8;
    assertEquals(405731964, thecowdivtwo.find(N, K));
  }

  @Test
  public void case41() {
    int N = 127;
    int K = 46;
    assertEquals(553680656, thecowdivtwo.find(N, K));
  }

  @Test
  public void case42() {
    int N = 111;
    int K = 15;
    assertEquals(94153483, thecowdivtwo.find(N, K));
  }

  @Test
  public void case43() {
    int N = 423;
    int K = 36;
    assertEquals(317290246, thecowdivtwo.find(N, K));
  }

  @Test
  public void case44() {
    int N = 7;
    int K = 7;
    assertEquals(1, thecowdivtwo.find(N, K));
  }

}
