package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class KidsGameTest {
  KidsGame kidsgame = new KidsGame();

  @Test
  public void case1() {
    int n = 10;
    int m = 3;
    int k = 6;
    assertEquals(2, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case2() {
    int n = 10;
    int m = 3;
    int k = 4;
    assertEquals(10, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case3() {
    int n = 1000;
    int m = 3000;
    int k = 7;
    assertEquals(530, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case4() {
    int n = 500000;
    int m = 250000;
    int k = 93986;
    assertEquals(358332, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case5() {
    int n = 5;
    int m = 2;
    int k = 3;
    assertEquals(5, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case6() {
    int n = 1;
    int m = 10;
    int k = 1;
    assertEquals(1, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case7() {
    int n = 99;
    int m = 100;
    int k = 99;
    assertEquals(94, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case8() {
    int n = 19999;
    int m = 7;
    int k = 5;
    assertEquals(18019, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case9() {
    int n = 99999;
    int m = 11111;
    int k = 3;
    assertEquals(69557, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case10() {
    int n = 500000;
    int m = 499999;
    int k = 322414;
    assertEquals(95635, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case11() {
    int n = 11;
    int m = 3;
    int k = 7;
    assertEquals(11, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case12() {
    int n = 11;
    int m = 7;
    int k = 4;
    assertEquals(10, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case13() {
    int n = 11;
    int m = 11;
    int k = 4;
    assertEquals(10, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case14() {
    int n = 11;
    int m = 15;
    int k = 10;
    assertEquals(11, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case15() {
    int n = 11;
    int m = 19;
    int k = 4;
    assertEquals(10, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case16() {
    int n = 11;
    int m = 23;
    int k = 3;
    assertEquals(9, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case17() {
    int n = 11;
    int m = 27;
    int k = 6;
    assertEquals(8, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case18() {
    int n = 11;
    int m = 31;
    int k = 11;
    assertEquals(11, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case19() {
    int n = 11;
    int m = 35;
    int k = 10;
    assertEquals(10, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case20() {
    int n = 11;
    int m = 39;
    int k = 10;
    assertEquals(10, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case21() {
    int n = 13;
    int m = 3;
    int k = 10;
    assertEquals(9, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case22() {
    int n = 13;
    int m = 7;
    int k = 3;
    assertEquals(9, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case23() {
    int n = 13;
    int m = 11;
    int k = 6;
    assertEquals(9, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case24() {
    int n = 13;
    int m = 15;
    int k = 12;
    assertEquals(9, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case25() {
    int n = 13;
    int m = 19;
    int k = 2;
    assertEquals(11, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case26() {
    int n = 13;
    int m = 23;
    int k = 11;
    assertEquals(9, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case27() {
    int n = 13;
    int m = 27;
    int k = 7;
    assertEquals(11, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case28() {
    int n = 13;
    int m = 31;
    int k = 8;
    assertEquals(12, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case29() {
    int n = 13;
    int m = 35;
    int k = 8;
    assertEquals(13, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case30() {
    int n = 13;
    int m = 39;
    int k = 10;
    assertEquals(11, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case31() {
    int n = 15;
    int m = 3;
    int k = 10;
    assertEquals(10, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case32() {
    int n = 15;
    int m = 7;
    int k = 4;
    assertEquals(14, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case33() {
    int n = 15;
    int m = 11;
    int k = 14;
    assertEquals(11, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case34() {
    int n = 15;
    int m = 15;
    int k = 7;
    assertEquals(12, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case35() {
    int n = 15;
    int m = 19;
    int k = 11;
    assertEquals(13, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case36() {
    int n = 15;
    int m = 23;
    int k = 14;
    assertEquals(11, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case37() {
    int n = 15;
    int m = 27;
    int k = 8;
    assertEquals(14, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case38() {
    int n = 15;
    int m = 31;
    int k = 11;
    assertEquals(11, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case39() {
    int n = 15;
    int m = 35;
    int k = 10;
    assertEquals(10, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case40() {
    int n = 15;
    int m = 39;
    int k = 3;
    assertEquals(12, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case41() {
    int n = 17;
    int m = 3;
    int k = 16;
    assertEquals(12, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case42() {
    int n = 17;
    int m = 7;
    int k = 15;
    assertEquals(15, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case43() {
    int n = 17;
    int m = 11;
    int k = 14;
    assertEquals(16, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case44() {
    int n = 17;
    int m = 15;
    int k = 11;
    assertEquals(12, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case45() {
    int n = 17;
    int m = 19;
    int k = 1;
    assertEquals(16, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case46() {
    int n = 17;
    int m = 23;
    int k = 11;
    assertEquals(13, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case47() {
    int n = 17;
    int m = 27;
    int k = 11;
    assertEquals(14, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case48() {
    int n = 17;
    int m = 31;
    int k = 3;
    assertEquals(15, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case49() {
    int n = 17;
    int m = 35;
    int k = 17;
    assertEquals(15, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case50() {
    int n = 17;
    int m = 39;
    int k = 15;
    assertEquals(14, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case51() {
    int n = 19;
    int m = 3;
    int k = 4;
    assertEquals(14, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case52() {
    int n = 19;
    int m = 7;
    int k = 5;
    assertEquals(14, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case53() {
    int n = 19;
    int m = 11;
    int k = 7;
    assertEquals(13, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case54() {
    int n = 19;
    int m = 15;
    int k = 18;
    assertEquals(13, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case55() {
    int n = 19;
    int m = 19;
    int k = 18;
    assertEquals(15, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case56() {
    int n = 19;
    int m = 23;
    int k = 8;
    assertEquals(14, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case57() {
    int n = 19;
    int m = 27;
    int k = 12;
    assertEquals(18, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case58() {
    int n = 19;
    int m = 31;
    int k = 18;
    assertEquals(19, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case59() {
    int n = 19;
    int m = 35;
    int k = 2;
    assertEquals(18, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case60() {
    int n = 19;
    int m = 39;
    int k = 5;
    assertEquals(18, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case61() {
    int n = 2;
    int m = 2;
    int k = 1;
    assertEquals(2, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case62() {
    int n = 61355;
    int m = 81783;
    int k = 5665;
    assertEquals(45940, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case63() {
    int n = 98295;
    int m = 63339;
    int k = 57647;
    assertEquals(94551, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case64() {
    int n = 82168;
    int m = 86940;
    int k = 1719;
    assertEquals(80093, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case65() {
    int n = 51756;
    int m = 64056;
    int k = 2884;
    assertEquals(36994, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case66() {
    int n = 69280;
    int m = 57661;
    int k = 7361;
    assertEquals(57491, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case67() {
    int n = 54705;
    int m = 85616;
    int k = 23037;
    assertEquals(43481, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case68() {
    int n = 75842;
    int m = 58856;
    int k = 64098;
    assertEquals(63630, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case69() {
    int n = 91767;
    int m = 63707;
    int k = 83980;
    assertEquals(84314, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case70() {
    int n = 500000;
    int m = 500000;
    int k = 2;
    assertEquals(362658, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case71() {
    int n = 500000;
    int m = 500000;
    int k = 74191;
    assertEquals(475701, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case72() {
    int n = 500000;
    int m = 500000;
    int k = 74192;
    assertEquals(127809, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case73() {
    int n = 255643;
    int m = 469280;
    int k = 11269;
    assertEquals(234355, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case74() {
    int n = 454705;
    int m = 485616;
    int k = 147385;
    assertEquals(436576, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case75() {
    int n = 446084;
    int m = 400647;
    int k = 370348;
    assertEquals(436625, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case76() {
    int n = 453454;
    int m = 337230;
    int k = 416029;
    assertEquals(419376, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case77() {
    int n = 334846;
    int m = 291126;
    int k = 145218;
    assertEquals(302662, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case78() {
    int n = 381406;
    int m = 338883;
    int k = 138442;
    assertEquals(362447, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case79() {
    int n = 377030;
    int m = 317786;
    int k = 47086;
    assertEquals(367718, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case80() {
    int n = 291764;
    int m = 493885;
    int k = 102162;
    assertEquals(284447, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case81() {
    int n = 310315;
    int m = 290668;
    int k = 224;
    assertEquals(304687, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case82() {
    int n = 500000;
    int m = 1;
    int k = 500000;
    assertEquals(500000, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case83() {
    int n = 500000;
    int m = 500000;
    int k = 50000;
    assertEquals(75608, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case84() {
    int n = 500000;
    int m = 250000;
    int k = 99999;
    assertEquals(266841, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case85() {
    int n = 500000;
    int m = 499999;
    int k = 1;
    assertEquals(476477, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case86() {
    int n = 500000;
    int m = 500000;
    int k = 250000;
    assertEquals(290278, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case87() {
    int n = 500000;
    int m = 400000;
    int k = 177;
    assertEquals(116239, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case88() {
    int n = 500000;
    int m = 500000;
    int k = 500000;
    assertEquals(1, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case89() {
    int n = 99999;
    int m = 11111;
    int k = 3;
    assertEquals(69557, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case90() {
    int n = 500000;
    int m = 11111;
    int k = 3;
    assertEquals(328693, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case91() {
    int n = 500000;
    int m = 500000;
    int k = 300000;
    assertEquals(138262, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case92() {
    int n = 500000;
    int m = 11111;
    int k = 7;
    assertEquals(492900, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case93() {
    int n = 500000;
    int m = 500000;
    int k = 4564;
    assertEquals(460688, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case94() {
    int n = 500000;
    int m = 2;
    int k = 499999;
    assertEquals(375000, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case95() {
    int n = 500000;
    int m = 100000;
    int k = 43;
    assertEquals(441344, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case96() {
    int n = 500000;
    int m = 500000;
    int k = 14555;
    assertEquals(124402, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case97() {
    int n = 500000;
    int m = 500000;
    int k = 499999;
    assertEquals(120281, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case98() {
    int n = 500000;
    int m = 1;
    int k = 500000;
    assertEquals(500000, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case99() {
    int n = 500000;
    int m = 25000;
    int k = 499999;
    assertEquals(88716, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case100() {
    int n = 500000;
    int m = 493222;
    int k = 52;
    assertEquals(361568, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case101() {
    int n = 500000;
    int m = 500000;
    int k = 74176;
    assertEquals(500000, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case102() {
    int n = 500000;
    int m = 8;
    int k = 3;
    assertEquals(243546, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case103() {
    int n = 99999;
    int m = 11117;
    int k = 3;
    assertEquals(44163, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case104() {
    int n = 500000;
    int m = 8;
    int k = 4;
    assertEquals(117188, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case105() {
    int n = 5;
    int m = 2;
    int k = 1;
    assertEquals(3, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case106() {
    int n = 499999;
    int m = 475895;
    int k = 135867;
    assertEquals(7626, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case107() {
    int n = 499999;
    int m = 1;
    int k = 499998;
    assertEquals(499998, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case108() {
    int n = 500000;
    int m = 499999;
    int k = 499997;
    assertEquals(378356, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case109() {
    int n = 499999;
    int m = 11111;
    int k = 3;
    assertEquals(398470, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case110() {
    int n = 500000;
    int m = 232991;
    int k = 66086;
    assertEquals(90000, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case111() {
    int n = 500000;
    int m = 500000;
    int k = 2;
    assertEquals(362658, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case112() {
    int n = 500000;
    int m = 499999;
    int k = 223118;
    assertEquals(500000, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case113() {
    int n = 50000;
    int m = 200;
    int k = 200;
    assertEquals(1, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case114() {
    int n = 500000;
    int m = 499999;
    int k = 3;
    assertEquals(378845, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case115() {
    int n = 5;
    int m = 6;
    int k = 2;
    assertEquals(3, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case116() {
    int n = 1;
    int m = 1;
    int k = 1;
    assertEquals(1, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case117() {
    int n = 444444;
    int m = 11111;
    int k = 3;
    assertEquals(375626, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case118() {
    int n = 500000;
    int m = 499876;
    int k = 500;
    assertEquals(494639, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case119() {
    int n = 500000;
    int m = 499000;
    int k = 3;
    assertEquals(331423, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case120() {
    int n = 500000;
    int m = 500000;
    int k = 400000;
    assertEquals(274559, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case121() {
    int n = 500000;
    int m = 11;
    int k = 499999;
    assertEquals(401078, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case122() {
    int n = 500000;
    int m = 500000;
    int k = 13504;
    assertEquals(499655, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case123() {
    int n = 500000;
    int m = 400000;
    int k = 250000;
    assertEquals(38304, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case124() {
    int n = 500000;
    int m = 500000;
    int k = 299797;
    assertEquals(496085, kidsgame.kthKid(n, m, k));
  }

  @Test
  public void case125() {
    int n = 500000;
    int m = 250000;
    int k = 333333;
    assertEquals(368574, kidsgame.kthKid(n, m, k));
  }

}
