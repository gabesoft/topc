package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class ChessKnightTest {
  double DELTA = 1.0e-10;
  ChessKnight chessknight = new ChessKnight();

  //@Test
  public void case1() {
    int x = 1;
    int y = 1;
    int n = 2;
    assertEquals(0.1875, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case2() {
    int x = 4;
    int y = 4;
    int n = 1;
    assertEquals(1.0, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case3() {
    int x = 2;
    int y = 3;
    int n = 10;
    assertEquals(0.0522148497402668, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case4() {
    int x = 4;
    int y = 3;
    int n = 50;
    assertEquals(8.356427906809618e-07, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case5() {
    int x = 3;
    int y = 7;
    int n = 1;
    assertEquals(0.75, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case6() {
    int x = 7;
    int y = 1;
    int n = 1;
    assertEquals(0.375, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case7() {
    int x = 8;
    int y = 6;
    int n = 2;
    assertEquals(0.359375, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case8() {
    int x = 5;
    int y = 8;
    int n = 3;
    assertEquals(0.28515625, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case9() {
    int x = 7;
    int y = 1;
    int n = 4;
    assertEquals(0.1533203125, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case10() {
    int x = 1;
    int y = 3;
    int n = 5;
    assertEquals(0.149078369140625, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case11() {
    int x = 2;
    int y = 1;
    int n = 6;
    assertEquals(0.0858612060546875, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case12() {
    int x = 7;
    int y = 8;
    int n = 7;
    assertEquals(0.06415367126464844, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case13() {
    int x = 6;
    int y = 1;
    int n = 8;
    assertEquals(0.06335264444351196, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case14() {
    int x = 3;
    int y = 6;
    int n = 9;
    assertEquals(0.09343411028385162, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case15() {
    int x = 7;
    int y = 4;
    int n = 52;
    assertEquals(3.5339651608739314e-07, chessknight.probability(x, y, n), DELTA);
  }

  @Test
  public void case16() {
    int x = 2;
    int y = 5;
    int n = 3;
    assertEquals(0.427734375, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case17() {
    int x = 5;
    int y = 5;
    int n = 66;
    assertEquals(9.547484435328105e-09, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case18() {
    int x = 1;
    int y = 7;
    int n = 54;
    assertEquals(9.378667247847374e-08, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case19() {
    int x = 5;
    int y = 7;
    int n = 14;
    assertEquals(0.018477533382110778, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case20() {
    int x = 7;
    int y = 5;
    int n = 33;
    assertEquals(8.080721375391003e-05, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case21() {
    int x = 2;
    int y = 6;
    int n = 70;
    assertEquals(1.8532254252166035e-09, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case22() {
    int x = 5;
    int y = 5;
    int n = 73;
    assertEquals(1.2903706640250646e-09, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case23() {
    int x = 2;
    int y = 2;
    int n = 98;
    assertEquals(4.612696185229347e-13, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case24() {
    int x = 4;
    int y = 1;
    int n = 96;
    assertEquals(8.328005824672252e-13, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case25() {
    int x = 6;
    int y = 8;
    int n = 67;
    assertEquals(2.990288315644292e-09, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case26() {
    int x = 7;
    int y = 7;
    int n = 60;
    assertEquals(2.41174056768814e-08, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case27() {
    int x = 3;
    int y = 1;
    int n = 96;
    assertEquals(7.496307086926672e-13, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case28() {
    int x = 5;
    int y = 8;
    int n = 85;
    assertEquals(1.9336890083843252e-11, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case29() {
    int x = 7;
    int y = 7;
    int n = 71;
    assertEquals(1.0386876797777846e-09, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case30() {
    int x = 5;
    int y = 6;
    int n = 95;
    assertEquals(2.160083078770607e-12, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case31() {
    int x = 5;
    int y = 8;
    int n = 6;
    assertEquals(0.12531280517578125, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case32() {
    int x = 1;
    int y = 1;
    int n = 49;
    assertEquals(2.497810432608752e-07, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case33() {
    int x = 3;
    int y = 7;
    int n = 69;
    assertEquals(2.4665846951278043e-09, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case34() {
    int x = 4;
    int y = 7;
    int n = 68;
    assertEquals(3.6439947494962803e-09, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case35() {
    int x = 6;
    int y = 3;
    int n = 55;
    assertEquals(1.8124424012141143e-07, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case36() {
    int x = 6;
    int y = 6;
    int n = 98;
    assertEquals(8.299454779384809e-13, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case37() {
    int x = 8;
    int y = 8;
    int n = 79;
    assertEquals(4.704635679653266e-11, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case38() {
    int x = 6;
    int y = 7;
    int n = 36;
    assertEquals(3.0876840705236086e-05, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case39() {
    int x = 7;
    int y = 4;
    int n = 60;
    assertEquals(3.588558274729162e-08, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case40() {
    int x = 7;
    int y = 5;
    int n = 31;
    assertEquals(0.00014314813598781563, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case41() {
    int x = 8;
    int y = 5;
    int n = 21;
    assertEquals(0.001710503378879963, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case42() {
    int x = 3;
    int y = 8;
    int n = 94;
    assertEquals(1.3279537030090928e-12, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case43() {
    int x = 6;
    int y = 3;
    int n = 5;
    assertEquals(0.29595947265625, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case44() {
    int x = 5;
    int y = 2;
    int n = 34;
    assertEquals(6.071309186626193e-05, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case45() {
    int x = 1;
    int y = 7;
    int n = 93;
    assertEquals(1.347713587933077e-12, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case46() {
    int x = 8;
    int y = 7;
    int n = 75;
    assertEquals(2.3153555602356625e-10, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case47() {
    int x = 2;
    int y = 6;
    int n = 22;
    assertEquals(0.0016903688946730915, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case48() {
    int x = 1;
    int y = 2;
    int n = 15;
    assertEquals(0.006526388888801193, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case49() {
    int x = 7;
    int y = 6;
    int n = 25;
    assertEquals(0.0007169329319809209, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case50() {
    int x = 7;
    int y = 3;
    int n = 71;
    assertEquals(1.392388626854472e-09, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case51() {
    int x = 7;
    int y = 4;
    int n = 9;
    assertEquals(0.07716024667024612, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case52() {
    int x = 7;
    int y = 5;
    int n = 65;
    assertEquals(8.591739291195658e-09, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case53() {
    int x = 2;
    int y = 5;
    int n = 48;
    assertEquals(1.1090047187773974e-06, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case54() {
    int x = 1;
    int y = 8;
    int n = 70;
    assertEquals(6.166461737819511e-10, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case55() {
    int x = 2;
    int y = 2;
    int n = 50;
    assertEquals(4.20734780021499e-07, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case56() {
    int x = 2;
    int y = 3;
    int n = 100;
    assertEquals(3.4905573073465814e-13, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case57() {
    int x = 4;
    int y = 2;
    int n = 1;
    assertEquals(0.75, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case58() {
    int x = 4;
    int y = 3;
    int n = 50;
    assertEquals(8.356427906809618e-07, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case59() {
    int x = 4;
    int y = 4;
    int n = 100;
    assertEquals(5.730392258771815e-13, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case60() {
    int x = 1;
    int y = 1;
    int n = 100;
    assertEquals(1.161455470367467e-13, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case61() {
    int x = 3;
    int y = 4;
    int n = 100;
    assertEquals(5.171678774401681e-13, chessknight.probability(x, y, n), DELTA);
  }

  //@Test
  public void case62() {
    int x = 4;
    int y = 3;
    int n = 100;
    assertEquals(5.171678774401681e-13, chessknight.probability(x, y, n), DELTA);
  }

}
