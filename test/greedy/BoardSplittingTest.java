package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class BoardSplittingTest {
  BoardSplitting boardsplitting = new BoardSplitting();

  @Test
  public void case1() {
    int desiredLength = 5;
    int desiredCount = 4;
    int actualLength = 4;
    assertEquals(3, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case2() {
    int desiredLength = 6;
    int desiredCount = 100;
    int actualLength = 3;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case3() {
    int desiredLength = 500;
    int desiredCount = 5;
    int actualLength = 1000;
    assertEquals(3, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case4() {
    int desiredLength = 314;
    int desiredCount = 159;
    int actualLength = 26;
    assertEquals(147, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case5() {
    int desiredLength = 1;
    int desiredCount = 1;
    int actualLength = 1;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case6() {
    int desiredLength = 1;
    int desiredCount = 1;
    int actualLength = 1000;
    assertEquals(1, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case7() {
    int desiredLength = 1;
    int desiredCount = 1000;
    int actualLength = 1;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case8() {
    int desiredLength = 1;
    int desiredCount = 1000;
    int actualLength = 1000;
    assertEquals(999, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case9() {
    int desiredLength = 1000;
    int desiredCount = 1;
    int actualLength = 1;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case10() {
    int desiredLength = 1000;
    int desiredCount = 1;
    int actualLength = 1000;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case11() {
    int desiredLength = 1000;
    int desiredCount = 1000;
    int actualLength = 1;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case12() {
    int desiredLength = 1000;
    int desiredCount = 1000;
    int actualLength = 1000;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case13() {
    int desiredLength = 778;
    int desiredCount = 887;
    int actualLength = 384;
    assertEquals(883, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case14() {
    int desiredLength = 336;
    int desiredCount = 794;
    int actualLength = 916;
    assertEquals(791, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case15() {
    int desiredLength = 650;
    int desiredCount = 493;
    int actualLength = 387;
    assertEquals(492, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case16() {
    int desiredLength = 28;
    int desiredCount = 363;
    int actualLength = 422;
    assertEquals(362, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case17() {
    int desiredLength = 764;
    int desiredCount = 60;
    int actualLength = 691;
    assertEquals(60, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case18() {
    int desiredLength = 427;
    int desiredCount = 541;
    int actualLength = 927;
    assertEquals(541, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case19() {
    int desiredLength = 212;
    int desiredCount = 737;
    int actualLength = 173;
    assertEquals(733, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case20() {
    int desiredLength = 430;
    int desiredCount = 568;
    int actualLength = 369;
    assertEquals(567, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case21() {
    int desiredLength = 863;
    int desiredCount = 531;
    int actualLength = 783;
    assertEquals(531, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case22() {
    int desiredLength = 136;
    int desiredCount = 68;
    int actualLength = 124;
    assertEquals(66, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case23() {
    int desiredLength = 23;
    int desiredCount = 803;
    int actualLength = 930;
    assertEquals(803, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case24() {
    int desiredLength = 168;
    int desiredCount = 70;
    int actualLength = 59;
    assertEquals(69, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case25() {
    int desiredLength = 12;
    int desiredCount = 457;
    int actualLength = 394;
    assertEquals(455, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case26() {
    int desiredLength = 374;
    int desiredCount = 230;
    int actualLength = 43;
    assertEquals(225, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case27() {
    int desiredLength = 785;
    int desiredCount = 920;
    int actualLength = 422;
    assertEquals(918, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case28() {
    int desiredLength = 325;
    int desiredCount = 199;
    int actualLength = 538;
    assertEquals(199, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case29() {
    int desiredLength = 414;
    int desiredCount = 371;
    int actualLength = 316;
    assertEquals(369, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case30() {
    int desiredLength = 981;
    int desiredCount = 92;
    int actualLength = 527;
    assertEquals(92, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case31() {
    int desiredLength = 863;
    int desiredCount = 874;
    int actualLength = 957;
    assertEquals(874, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case32() {
    int desiredLength = 282;
    int desiredCount = 997;
    int actualLength = 171;
    assertEquals(980, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case33() {
    int desiredLength = 926;
    int desiredCount = 926;
    int actualLength = 85;
    assertEquals(916, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case34() {
    int desiredLength = 337;
    int desiredCount = 337;
    int actualLength = 506;
    assertEquals(337, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case35() {
    int desiredLength = 730;
    int desiredCount = 730;
    int actualLength = 314;
    assertEquals(726, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case36() {
    int desiredLength = 125;
    int desiredCount = 125;
    int actualLength = 896;
    assertEquals(125, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case37() {
    int desiredLength = 546;
    int desiredCount = 546;
    int actualLength = 815;
    assertEquals(546, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case38() {
    int desiredLength = 435;
    int desiredCount = 435;
    int actualLength = 365;
    assertEquals(430, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case39() {
    int desiredLength = 751;
    int desiredCount = 751;
    int actualLength = 88;
    assertEquals(743, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case40() {
    int desiredLength = 277;
    int desiredCount = 277;
    int actualLength = 179;
    assertEquals(276, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case41() {
    int desiredLength = 789;
    int desiredCount = 404;
    int actualLength = 404;
    assertEquals(403, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case42() {
    int desiredLength = 652;
    int desiredCount = 400;
    int actualLength = 400;
    assertEquals(396, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case43() {
    int desiredLength = 933;
    int desiredCount = 677;
    int actualLength = 677;
    assertEquals(676, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case44() {
    int desiredLength = 369;
    int desiredCount = 13;
    int actualLength = 13;
    assertEquals(12, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case45() {
    int desiredLength = 227;
    int desiredCount = 95;
    int actualLength = 95;
    assertEquals(94, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case46() {
    int desiredLength = 540;
    int desiredCount = 571;
    int actualLength = 571;
    assertEquals(570, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case47() {
    int desiredLength = 435;
    int desiredCount = 468;
    int actualLength = 468;
    assertEquals(465, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case48() {
    int desiredLength = 602;
    int desiredCount = 903;
    int actualLength = 903;
    assertEquals(602, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case49() {
    int desiredLength = 318;
    int desiredCount = 493;
    int actualLength = 318;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case50() {
    int desiredLength = 757;
    int desiredCount = 302;
    int actualLength = 757;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case51() {
    int desiredLength = 287;
    int desiredCount = 442;
    int actualLength = 287;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case52() {
    int desiredLength = 690;
    int desiredCount = 445;
    int actualLength = 690;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case53() {
    int desiredLength = 441;
    int desiredCount = 730;
    int actualLength = 441;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case54() {
    int desiredLength = 118;
    int desiredCount = 98;
    int actualLength = 118;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case55() {
    int desiredLength = 482;
    int desiredCount = 676;
    int actualLength = 482;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case56() {
    int desiredLength = 928;
    int desiredCount = 568;
    int actualLength = 928;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case57() {
    int desiredLength = 498;
    int desiredCount = 498;
    int actualLength = 498;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case58() {
    int desiredLength = 354;
    int desiredCount = 354;
    int actualLength = 354;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case59() {
    int desiredLength = 587;
    int desiredCount = 587;
    int actualLength = 587;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case60() {
    int desiredLength = 966;
    int desiredCount = 966;
    int actualLength = 966;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case61() {
    int desiredLength = 307;
    int desiredCount = 307;
    int actualLength = 307;
    assertEquals(0, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case62() {
    int desiredLength = 3;
    int desiredCount = 4;
    int actualLength = 2;
    assertEquals(2, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case63() {
    int desiredLength = 2;
    int desiredCount = 3;
    int actualLength = 3;
    assertEquals(2, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case64() {
    int desiredLength = 978;
    int desiredCount = 999;
    int actualLength = 121;
    assertEquals(991, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case65() {
    int desiredLength = 2;
    int desiredCount = 10;
    int actualLength = 5;
    assertEquals(8, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case66() {
    int desiredLength = 7;
    int desiredCount = 9;
    int actualLength = 9;
    assertEquals(8, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case67() {
    int desiredLength = 5;
    int desiredCount = 7;
    int actualLength = 7;
    assertEquals(6, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case68() {
    int desiredLength = 2;
    int desiredCount = 7;
    int actualLength = 5;
    assertEquals(6, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case69() {
    int desiredLength = 3;
    int desiredCount = 8;
    int actualLength = 8;
    assertEquals(7, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case70() {
    int desiredLength = 3;
    int desiredCount = 5;
    int actualLength = 8;
    assertEquals(5, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case71() {
    int desiredLength = 12;
    int desiredCount = 6;
    int actualLength = 5;
    assertEquals(5, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case72() {
    int desiredLength = 3;
    int desiredCount = 10;
    int actualLength = 10;
    assertEquals(9, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case73() {
    int desiredLength = 314;
    int desiredCount = 154;
    int actualLength = 27;
    assertEquals(149, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case74() {
    int desiredLength = 6;
    int desiredCount = 3;
    int actualLength = 4;
    assertEquals(2, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case75() {
    int desiredLength = 3;
    int desiredCount = 1000;
    int actualLength = 1000;
    assertEquals(999, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case76() {
    int desiredLength = 3;
    int desiredCount = 60;
    int actualLength = 40;
    assertEquals(59, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case77() {
    int desiredLength = 4;
    int desiredCount = 13;
    int actualLength = 26;
    assertEquals(12, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case78() {
    int desiredLength = 31;
    int desiredCount = 511;
    int actualLength = 17;
    assertEquals(481, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case79() {
    int desiredLength = 315;
    int desiredCount = 159;
    int actualLength = 26;
    assertEquals(153, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case80() {
    int desiredLength = 7;
    int desiredCount = 3;
    int actualLength = 15;
    assertEquals(3, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case81() {
    int desiredLength = 24;
    int desiredCount = 159;
    int actualLength = 29;
    assertEquals(154, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case82() {
    int desiredLength = 20;
    int desiredCount = 3;
    int actualLength = 12;
    assertEquals(2, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case83() {
    int desiredLength = 48;
    int desiredCount = 1000;
    int actualLength = 500;
    assertEquals(992, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case84() {
    int desiredLength = 3;
    int desiredCount = 100;
    int actualLength = 4;
    assertEquals(75, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case85() {
    int desiredLength = 999;
    int desiredCount = 782;
    int actualLength = 567;
    assertEquals(745, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case86() {
    int desiredLength = 4;
    int desiredCount = 5;
    int actualLength = 5;
    assertEquals(4, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case87() {
    int desiredLength = 10;
    int desiredCount = 1;
    int actualLength = 3;
    assertEquals(1, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case88() {
    int desiredLength = 400;
    int desiredCount = 5;
    int actualLength = 1000;
    assertEquals(4, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case89() {
    int desiredLength = 10;
    int desiredCount = 6;
    int actualLength = 6;
    assertEquals(4, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case90() {
    int desiredLength = 4;
    int desiredCount = 3;
    int actualLength = 6;
    assertEquals(2, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case91() {
    int desiredLength = 153;
    int desiredCount = 586;
    int actualLength = 77;
    assertEquals(579, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case92() {
    int desiredLength = 4;
    int desiredCount = 6;
    int actualLength = 6;
    assertEquals(4, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case93() {
    int desiredLength = 998;
    int desiredCount = 999;
    int actualLength = 1000;
    assertEquals(998, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case94() {
    int desiredLength = 4;
    int desiredCount = 10;
    int actualLength = 5;
    assertEquals(8, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

  @Test
  public void case95() {
    int desiredLength = 987;
    int desiredCount = 453;
    int actualLength = 566;
    assertEquals(453, boardsplitting.minimumCuts(desiredLength, desiredCount, actualLength));
  }

}
