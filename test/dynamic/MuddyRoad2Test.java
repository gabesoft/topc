package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MuddyRoad2Test {
  MuddyRoad2 muddyroad2 = new MuddyRoad2();

  @Test
  public void case1() {
    int N = 5;
    int muddyCount = 1;
    assertEquals(2, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case2() {
    int N = 5;
    int muddyCount = 2;
    assertEquals(2, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case3() {
    int N = 10;
    int muddyCount = 4;
    assertEquals(65, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case4() {
    int N = 314;
    int muddyCount = 78;
    assertEquals(498142902, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case5() {
    int N = 555;
    int muddyCount = 222;
    assertEquals(541606281, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case6() {
    int N = 2;
    int muddyCount = 0;
    assertEquals(0, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case7() {
    int N = 3;
    int muddyCount = 0;
    assertEquals(1, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case8() {
    int N = 3;
    int muddyCount = 1;
    assertEquals(0, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case9() {
    int N = 4;
    int muddyCount = 0;
    assertEquals(0, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case10() {
    int N = 4;
    int muddyCount = 1;
    assertEquals(0, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case11() {
    int N = 4;
    int muddyCount = 2;
    assertEquals(1, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case12() {
    int N = 5;
    int muddyCount = 0;
    assertEquals(0, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case13() {
    int N = 5;
    int muddyCount = 3;
    assertEquals(1, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case14() {
    int N = 555;
    int muddyCount = 0;
    assertEquals(1, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case15() {
    int N = 555;
    int muddyCount = 1;
    assertEquals(368, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case16() {
    int N = 555;
    int muddyCount = 2;
    assertEquals(101568, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case17() {
    int N = 555;
    int muddyCount = 553;
    assertEquals(1, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case18() {
    int N = 555;
    int muddyCount = 552;
    assertEquals(553, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case19() {
    int N = 555;
    int muddyCount = 551;
    assertEquals(152628, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case20() {
    int N = 551;
    int muddyCount = 44;
    assertEquals(370263114, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case21() {
    int N = 550;
    int muddyCount = 32;
    assertEquals(191831629, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case22() {
    int N = 552;
    int muddyCount = 408;
    assertEquals(367514370, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case23() {
    int N = 550;
    int muddyCount = 155;
    assertEquals(206394093, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case24() {
    int N = 552;
    int muddyCount = 490;
    assertEquals(79384035, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case25() {
    int N = 550;
    int muddyCount = 100;
    assertEquals(214249245, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case26() {
    int N = 553;
    int muddyCount = 449;
    assertEquals(189651465, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case27() {
    int N = 552;
    int muddyCount = 28;
    assertEquals(388963015, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case28() {
    int N = 555;
    int muddyCount = 79;
    assertEquals(275324190, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case29() {
    int N = 555;
    int muddyCount = 497;
    assertEquals(121006185, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case30() {
    int N = 551;
    int muddyCount = 300;
    assertEquals(433110435, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case31() {
    int N = 553;
    int muddyCount = 481;
    assertEquals(148498515, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case32() {
    int N = 552;
    int muddyCount = 404;
    assertEquals(469165365, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case33() {
    int N = 554;
    int muddyCount = 145;
    assertEquals(260141345, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case34() {
    int N = 553;
    int muddyCount = 155;
    assertEquals(438163677, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case35() {
    int N = 555;
    int muddyCount = 130;
    assertEquals(263039908, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case36() {
    int N = 555;
    int muddyCount = 248;
    assertEquals(257269323, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case37() {
    int N = 551;
    int muddyCount = 133;
    assertEquals(97420847, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case38() {
    int N = 552;
    int muddyCount = 504;
    assertEquals(258794445, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case39() {
    int N = 555;
    int muddyCount = 179;
    assertEquals(398531700, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case40() {
    int N = 185;
    int muddyCount = 45;
    assertEquals(76442085, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case41() {
    int N = 263;
    int muddyCount = 85;
    assertEquals(496249136, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case42() {
    int N = 11;
    int muddyCount = 0;
    assertEquals(0, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case43() {
    int N = 431;
    int muddyCount = 426;
    assertEquals(13067054, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case44() {
    int N = 313;
    int muddyCount = 18;
    assertEquals(449909475, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case45() {
    int N = 389;
    int muddyCount = 179;
    assertEquals(96532467, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case46() {
    int N = 190;
    int muddyCount = 104;
    assertEquals(182989420, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case47() {
    int N = 420;
    int muddyCount = 103;
    assertEquals(476477145, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case48() {
    int N = 210;
    int muddyCount = 73;
    assertEquals(376235647, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case49() {
    int N = 427;
    int muddyCount = 273;
    assertEquals(228160755, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case50() {
    int N = 202;
    int muddyCount = 137;
    assertEquals(267944565, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case51() {
    int N = 165;
    int muddyCount = 59;
    assertEquals(40455450, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case52() {
    int N = 190;
    int muddyCount = 65;
    assertEquals(202196919, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case53() {
    int N = 26;
    int muddyCount = 15;
    assertEquals(1307504, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case54() {
    int N = 536;
    int muddyCount = 374;
    assertEquals(216998280, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case55() {
    int N = 89;
    int muddyCount = 19;
    assertEquals(236601030, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case56() {
    int N = 438;
    int muddyCount = 311;
    assertEquals(488030553, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case57() {
    int N = 123;
    int muddyCount = 96;
    assertEquals(472504689, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case58() {
    int N = 500;
    int muddyCount = 4;
    assertEquals(522246270, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case59() {
    int N = 468;
    int muddyCount = 2;
    assertEquals(72075, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case60() {
    int N = 551;
    int muddyCount = 537;
    assertEquals(33869106, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case61() {
    int N = 254;
    int muddyCount = 216;
    assertEquals(55183095, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case62() {
    int N = 58;
    int muddyCount = 6;
    assertEquals(30867648, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case63() {
    int N = 293;
    int muddyCount = 207;
    assertEquals(201267795, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case64() {
    int N = 481;
    int muddyCount = 8;
    assertEquals(553652025, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case65() {
    int N = 16;
    int muddyCount = 3;
    assertEquals(304, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case66() {
    int N = 307;
    int muddyCount = 32;
    assertEquals(205435426, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case67() {
    int N = 165;
    int muddyCount = 124;
    assertEquals(168511185, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case68() {
    int N = 451;
    int muddyCount = 17;
    assertEquals(534049564, muddyroad2.theCount(N, muddyCount));
  }

  @Test
  public void case69() {
    int N = 360;
    int muddyCount = 203;
    assertEquals(222879393, muddyroad2.theCount(N, muddyCount));
  }

}
