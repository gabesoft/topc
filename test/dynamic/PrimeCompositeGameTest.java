package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PrimeCompositeGameTest {
  PrimeCompositeGame primecompositegame = new PrimeCompositeGame();

  @Test
  public void case1() {
    int N = 3;
    int K = 2;
    assertEquals(1, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case2() {
    int N = 58;
    int K = 1;
    assertEquals(0, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case3() {
    int N = 30;
    int K = 3;
    assertEquals(-2, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case4() {
    int N = 6;
    int K = 3;
    assertEquals(1, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case5() {
    int N = 526;
    int K = 58;
    assertEquals(19, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case6() {
    int N = 2;
    int K = 1;
    assertEquals(0, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case7() {
    int N = 2;
    int K = 2;
    assertEquals(0, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case8() {
    int N = 3;
    int K = 1;
    assertEquals(1, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case9() {
    int N = 3;
    int K = 2;
    assertEquals(1, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case10() {
    int N = 3;
    int K = 3;
    assertEquals(1, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case11() {
    int N = 8;
    int K = 2;
    assertEquals(5, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case12() {
    int N = 14;
    int K = 2;
    assertEquals(-4, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case13() {
    int N = 24;
    int K = 3;
    assertEquals(13, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case14() {
    int N = 90;
    int K = 5;
    assertEquals(35, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case15() {
    int N = 114;
    int K = 3;
    assertEquals(-8, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case16() {
    int N = 117;
    int K = 7;
    assertEquals(37, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case17() {
    int N = 474747;
    int K = 1;
    assertEquals(0, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case18() {
    int N = 474747;
    int K = 5;
    assertEquals(0, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case19() {
    int N = 474747;
    int K = 474747;
    assertEquals(1, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case20() {
    int N = 474747;
    int K = 213;
    assertEquals(4625, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case21() {
    int N = 31416;
    int K = 58;
    assertEquals(1227, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case22() {
    int N = 89654;
    int K = 58;
    assertEquals(-1416, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case23() {
    int N = 265562;
    int K = 77;
    assertEquals(-2526, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case24() {
    int N = 155971;
    int K = 77;
    assertEquals(4431, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case25() {
    int N = 403433;
    int K = 319728;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case26() {
    int N = 464843;
    int K = 169867;
    assertEquals(5, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case27() {
    int N = 239679;
    int K = 35554;
    assertEquals(13, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case28() {
    int N = 304124;
    int K = 288946;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case29() {
    int N = 430212;
    int K = 290442;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case30() {
    int N = 455587;
    int K = 284499;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case31() {
    int N = 202679;
    int K = 158631;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case32() {
    int N = 102314;
    int K = 58652;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case33() {
    int N = 344099;
    int K = 236800;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case34() {
    int N = 391145;
    int K = 5240;
    assertEquals(149, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case35() {
    int N = 274888;
    int K = 190935;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case36() {
    int N = 284564;
    int K = 174745;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case37() {
    int N = 421780;
    int K = 109226;
    assertEquals(7, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case38() {
    int N = 213614;
    int K = 149869;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case39() {
    int N = 172682;
    int K = 124409;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case40() {
    int N = 283867;
    int K = 246625;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case41() {
    int N = 298788;
    int K = 22160;
    assertEquals(27, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case42() {
    int N = 205938;
    int K = 175422;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case43() {
    int N = 175893;
    int K = 39043;
    assertEquals(9, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case44() {
    int N = 50674;
    int K = 28052;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case45() {
    int N = 473319;
    int K = 74785;
    assertEquals(13, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case46() {
    int N = 415420;
    int K = 36371;
    assertEquals(23, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case47() {
    int N = 156227;
    int K = 10982;
    assertEquals(29, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case48() {
    int N = 316638;
    int K = 23938;
    assertEquals(27, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case49() {
    int N = 447248;
    int K = 41244;
    assertEquals(21, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case50() {
    int N = 31416;
    int K = 58;
    assertEquals(1227, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case51() {
    int N = 39897;
    int K = 123;
    assertEquals(683, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case52() {
    int N = 474160;
    int K = 1000;
    assertEquals(959, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case53() {
    int N = 370297;
    int K = 97;
    assertEquals(8317, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case54() {
    int N = 474747;
    int K = 9997;
    assertEquals(95, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case55() {
    int N = 442119;
    int K = 111;
    assertEquals(8569, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case56() {
    int N = 370297;
    int K = 97;
    assertEquals(8317, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case57() {
    int N = 370318;
    int K = 100;
    assertEquals(8135, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case58() {
    int N = 22190;
    int K = 18;
    assertEquals(-50, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case59() {
    int N = 461718;
    int K = 71;
    assertEquals(-1394, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case60() {
    int N = 468;
    int K = 9;
    assertEquals(-24, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case61() {
    int N = 58832;
    int K = 42;
    assertEquals(-422, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case62() {
    int N = 1;
    int K = 1;
    assertEquals(0, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case63() {
    int N = 132;
    int K = 11;
    assertEquals(-2, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case64() {
    int N = 548;
    int K = 15;
    assertEquals(-2, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case65() {
    int N = 474716;
    int K = 79;
    assertEquals(-290, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case66() {
    int N = 375100;
    int K = 93;
    assertEquals(-92, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case67() {
    int N = 474617;
    int K = 89;
    assertEquals(-1576, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case68() {
    int N = 395367;
    int K = 91;
    assertEquals(-488, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case69() {
    int N = 395368;
    int K = 91;
    assertEquals(-488, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case70() {
    int N = 463079;
    int K = 95;
    assertEquals(-1260, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case71() {
    int N = 463080;
    int K = 95;
    assertEquals(-1260, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case72() {
    int N = 396882;
    int K = 98;
    assertEquals(-2, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case73() {
    int N = 412717;
    int K = 103;
    assertEquals(-748, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case74() {
    int N = 370424;
    int K = 106;
    assertEquals(-2, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case75() {
    int N = 370483;
    int K = 109;
    assertEquals(-2, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case76() {
    int N = 372241;
    int K = 110;
    assertEquals(-32, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case77() {
    int N = 474747;
    int K = 1000;
    assertEquals(959, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case78() {
    int N = 474747;
    int K = 10000;
    assertEquals(95, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case79() {
    int N = 474747;
    int K = 999;
    assertEquals(959, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case80() {
    int N = 400000;
    int K = 20000;
    assertEquals(41, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case81() {
    int N = 434213;
    int K = 414518;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case82() {
    int N = 444444;
    int K = 444444;
    assertEquals(1, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case83() {
    int N = 471647;
    int K = 3000;
    assertEquals(315, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case84() {
    int N = 474747;
    int K = 100;
    assertEquals(-1902, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case85() {
    int N = 470000;
    int K = 20000;
    assertEquals(47, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case86() {
    int N = 474746;
    int K = 474746;
    assertEquals(1, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case87() {
    int N = 474747;
    int K = 100000;
    assertEquals(9, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case88() {
    int N = 474747;
    int K = 500;
    assertEquals(1935, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case89() {
    int N = 474747;
    int K = 99999;
    assertEquals(9, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case90() {
    int N = 474000;
    int K = 101;
    assertEquals(-1872, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case91() {
    int N = 474747;
    int K = 5000;
    assertEquals(191, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case92() {
    int N = 470000;
    int K = 150000;
    assertEquals(7, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case93() {
    int N = 474747;
    int K = 4747;
    assertEquals(201, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case94() {
    int N = 474747;
    int K = 15000;
    assertEquals(63, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case95() {
    int N = 474747;
    int K = 474000;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case96() {
    int N = 474373;
    int K = 20;
    assertEquals(-8, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case97() {
    int N = 474700;
    int K = 29;
    assertEquals(-4, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case98() {
    int N = 474747;
    int K = 110;
    assertEquals(-1746, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case99() {
    int N = 222222;
    int K = 4242;
    assertEquals(105, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case100() {
    int N = 474743;
    int K = 200000;
    assertEquals(5, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case101() {
    int N = 80606;
    int K = 43;
    assertEquals(-34, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case102() {
    int N = 4;
    int K = 1;
    assertEquals(1, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case103() {
    int N = 474747;
    int K = 9;
    assertEquals(0, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case104() {
    int N = 6;
    int K = 1;
    assertEquals(3, primecompositegame.theOutcome(N, K));
  }

  @Test
  public void case105() {
    int N = 49;
    int K = 3;
    assertEquals(-6, primecompositegame.theOutcome(N, K));
  }

}
