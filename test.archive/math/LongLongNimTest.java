package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class LongLongNimTest {
  LongLongNim longlongnim = new LongLongNim();

  @Test
  public void case1() {
    int maxN = 20;
    int[] moves = { 1, 2, 3 };
    assertEquals(5, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case2() {
    int maxN = 999;
    int[] moves = { 1 };
    assertEquals(499, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case3() {
    int maxN = 1000000000;
    int[] moves = { 1, 2 };
    assertEquals(333333333, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case4() {
    int maxN = 6543;
    int[] moves = { 2, 4, 7, 11, 20 };
    assertEquals(1637, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case5() {
    int maxN = 1;
    int[] moves = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
    assertEquals(1, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case6() {
    int maxN = 1;
    int[] moves = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
    assertEquals(0, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case7() {
    int maxN = 1;
    int[] moves = { 1 };
    assertEquals(0, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case8() {
    int maxN = 1000000000;
    int[] moves = { 2, 19 };
    assertEquals(476190477, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case9() {
    int maxN = 1000000000;
    int[] moves = { 2, 6, 7, 11, 12, 16, 18 };
    assertEquals(203821657, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case10() {
    int maxN = 999999999;
    int[] moves = { 2, 6, 7, 11, 12, 16, 17 };
    assertEquals(304347826, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case11() {
    int maxN = 1000000000;
    int[] moves = { 22 };
    assertEquals(500000005, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case12() {
    int maxN = 999999999;
    int[] moves = { 5, 17, 22 };
    assertEquals(270270270, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case13() {
    int maxN = 20;
    int[] moves = { 21, 22 };
    assertEquals(20, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case14() {
    int maxN = 65;
    int[] moves = { 1, 4, 7, 11, 20 };
    assertEquals(16, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case15() {
    int maxN = 64;
    int[] moves = { 1, 4, 7, 11, 20 };
    assertEquals(16, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case16() {
    int maxN = 1000000000;
    int[] moves = { 2, 3, 7, 8, 12, 13, 17, 18, 22 };
    assertEquals(400000000, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case17() {
    int maxN = 999999999;
    int[] moves = { 2, 3, 7, 8, 12, 13, 17, 18 };
    assertEquals(399999999, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case18() {
    int maxN = 999987678;
    int[] moves = { 2, 6, 7, 11, 12, 16, 17, 21, 22 };
    assertEquals(285710765, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case19() {
    int maxN = 123456789;
    int[] moves = { 2, 6, 7, 11, 12, 16, 18 };
    assertEquals(25163168, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case20() {
    int maxN = 987654321;
    int[] moves = { 3, 7, 8, 12, 13, 17, 19 };
    assertEquals(301783264, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case21() {
    int maxN = 567567865;
    int[] moves = { 2, 6, 7, 11, 12, 16, 17, 20, 22 };
    assertEquals(162162246, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case22() {
    int maxN = 1000000000;
    int[] moves = { 15, 17, 19, 21, 22 };
    assertEquals(405405406, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case23() {
    int maxN = 999999997;
    int[] moves = { 4, 20, 21, 22 };
    assertEquals(380952381, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case24() {
    int maxN = 302981977;
    int[] moves = { 1, 3, 4, 5, 6, 10, 11, 12, 13, 14, 15, 18, 20, 21 };
    assertEquals(37872747, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case25() {
    int maxN = 785921192;
    int[] moves = { 1, 4, 5, 8, 10, 13, 20, 21, 22 };
    assertEquals(157184238, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case26() {
    int maxN = 541431219;
    int[] moves = { 4, 6, 10, 11, 13, 15, 18, 20 };
    assertEquals(90238539, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case27() {
    int maxN = 66830053;
    int[] moves = { 2, 8, 9, 12, 19, 20 };
    assertEquals(19094301, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case28() {
    int maxN = 708147906;
    int[] moves = { 1, 3, 5, 8, 18, 20 };
    assertEquals(202327974, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case29() {
    int maxN = 486174754;
    int[] moves = { 3, 4, 5, 6, 10, 17 };
    assertEquals(105690164, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case30() {
    int maxN = 548216988;
    int[] moves = { 3, 5, 10, 11, 15, 17 };
    assertEquals(137054246, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case31() {
    int maxN = 258630462;
    int[] moves = { 1, 2, 4, 8, 11, 17, 19, 21 };
    assertEquals(47642454, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case32() {
    int maxN = 933193086;
    int[] moves = { 1, 4, 5, 6, 9, 11, 12, 15, 18, 19, 22 };
    assertEquals(186638616, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case33() {
    int maxN = 609505906;
    int[] moves = { 3, 5, 6, 7, 9, 10, 11, 13, 17, 19, 20, 21 };
    assertEquals(90297171, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case34() {
    int maxN = 999999991;
    int[] moves = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
    assertEquals(43478260, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case35() {
    int maxN = 741302990;
    int[] moves = { 19, 22 };
    assertEquals(343530658, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case36() {
    int maxN = 391207276;
    int[] moves = { 17, 18, 19, 20, 21 };
    assertEquals(175013788, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case37() {
    int maxN = 721172640;
    int[] moves = { 18, 19, 20, 22 };
    assertEquals(324527688, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case38() {
    int maxN = 954337139;
    int[] moves = { 18, 20, 21, 22 };
    assertEquals(429451721, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case39() {
    int maxN = 293872405;
    int[] moves = { 17, 19, 21, 22 };
    assertEquals(128098229, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case40() {
    int maxN = 162493626;
    int[] moves = { 2, 3, 4, 5 };
    assertEquals(46426751, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case41() {
    int maxN = 660103999;
    int[] moves = { 3, 5 };
    assertEquals(247538999, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case42() {
    int maxN = 449723762;
    int[] moves = { 2, 4, 5 };
    assertEquals(128492503, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case43() {
    int maxN = 874999758;
    int[] moves = { 2, 3, 5 };
    assertEquals(249999931, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case44() {
    int maxN = 505767449;
    int[] moves = { 2, 3, 4 };
    assertEquals(168589149, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case45() {
    int maxN = 19;
    int[] moves = { 3, 4, 6, 20, 22 };
    assertEquals(7, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case46() {
    int maxN = 22;
    int[] moves = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
    assertEquals(0, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case47() {
    int maxN = 22;
    int[] moves = { 22 };
    assertEquals(21, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case48() {
    int maxN = 21;
    int[] moves = { 22 };
    assertEquals(21, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case49() {
    int maxN = 545718776;
    int[] moves = { 13, 22 };
    assertEquals(202695546, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case50() {
    int maxN = 353285238;
    int[] moves = { 9, 14, 21 };
    assertEquals(105985574, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case51() {
    int maxN = 643572703;
    int[] moves = { 8 };
    assertEquals(321786351, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case52() {
    int maxN = 372777587;
    int[] moves = { 4, 10, 12, 20, 21, 22 };
    assertEquals(93194399, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case53() {
    int maxN = 377513176;
    int[] moves = { 1, 5, 8, 12, 14, 20 };
    assertEquals(107860907, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case54() {
    int maxN = 48873580;
    int[] moves = { 9, 11, 19, 21 };
    assertEquals(14662079, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case55() {
    int maxN = 126967094;
    int[] moves = { 1, 2, 3, 4, 8, 9, 12, 13, 14, 15, 17, 20, 21, 22 };
    assertEquals(14937306, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case56() {
    int maxN = 212690885;
    int[] moves = { 3, 5, 7, 8, 10, 11, 13, 14, 15, 17, 18, 19, 21, 22 };
    assertEquals(25522907, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case57() {
    int maxN = 862343671;
    int[] moves = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18, 19, 20, 22 };
    assertEquals(71861972, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case58() {
    int maxN = 478763709;
    int[] moves = { 2, 3, 4, 6, 8, 9, 14, 15, 19, 20, 21 };
    assertEquals(83263253, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case59() {
    int maxN = 102654020;
    int[] moves = { 1, 2, 3, 4, 6, 9, 11, 12, 15, 18, 19, 21 };
    assertEquals(11406002, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case60() {
    int maxN = 724924749;
    int[] moves = { 1, 3, 4, 5, 7, 8, 10, 11, 12, 13, 14, 15, 17, 18, 19 };
    assertEquals(65902249, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case61() {
    int maxN = 945170309;
    int[] moves = { 4, 11, 12, 13, 15, 17, 21, 22 };
    assertEquals(203262432, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case62() {
    int maxN = 971154114;
    int[] moves = { 20 };
    assertEquals(485577059, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case63() {
    int maxN = 596655160;
    int[] moves = { 2, 3, 6, 7, 9, 11, 12, 14, 16, 17, 19 };
    assertEquals(74581895, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case64() {
    int maxN = 228157164;
    int[] moves = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
    assertEquals(9919876, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case65() {
    int maxN = 935018348;
    int[] moves = { 3, 4, 7, 9, 11, 12, 13, 14, 17, 19, 20, 21 };
    assertEquals(116877293, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case66() {
    int maxN = 906046245;
    int[] moves = { 5, 7, 8, 9, 12, 16, 17, 19, 21 };
    assertEquals(174239664, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case67() {
    int maxN = 5865438;
    int[] moves = { 6, 7, 8, 11, 13, 16, 17, 19, 20 };
    assertEquals(1353563, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case68() {
    int maxN = 138759937;
    int[] moves = { 5, 6, 9, 16, 19, 22 };
    assertEquals(36515773, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case69() {
    int maxN = 50243106;
    int[] moves = { 8, 16, 17 };
    assertEquals(16077798, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case70() {
    int maxN = 214571048;
    int[] moves = { 7, 8, 10, 13, 14, 19, 20, 21 };
    assertEquals(53642763, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case71() {
    int maxN = 483159105;
    int[] moves = { 2, 3, 4, 9, 12, 15, 17 };
    assertEquals(90592333, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case72() {
    int maxN = 687303295;
    int[] moves = { 3, 7, 8, 9, 10, 12, 14, 21 };
    assertEquals(137460659, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case73() {
    int maxN = 888223341;
    int[] moves = { 9 };
    assertEquals(444111672, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case74() {
    int maxN = 328234641;
    int[] moves = { 3, 4, 7, 8, 13, 18 };
    assertEquals(89518538, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case75() {
    int maxN = 943932181;
    int[] moves = { 8, 10 };
    assertEquals(419525415, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case76() {
    int maxN = 38069871;
    int[] moves = { 2 };
    assertEquals(19034935, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case77() {
    int maxN = 830624996;
    int[] moves = { 19 };
    assertEquals(415312506, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case78() {
    int maxN = 899714635;
    int[] moves = { 1, 5, 10 };
    assertEquals(299904879, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case79() {
    int maxN = 31740164;
    int[] moves = { 1, 12, 21 };
    assertEquals(14427346, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case80() {
    int maxN = 132755278;
    int[] moves = { 2, 6, 7, 19 };
    assertEquals(51059723, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case81() {
    int maxN = 823006836;
    int[] moves = { 6, 7, 18 };
    assertEquals(362123008, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case82() {
    int maxN = 190468360;
    int[] moves = { 4, 9, 12 };
    assertEquals(81629296, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case83() {
    int maxN = 245658853;
    int[] moves = { 6, 16 };
    assertEquals(111663115, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case84() {
    int maxN = 677867035;
    int[] moves = { 8, 15 };
    assertEquals(235779839, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case85() {
    int maxN = 999999908;
    int[] moves = { 4, 9, 11, 18, 20, 21 };
    assertEquals(217777760, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case86() {
    int maxN = 1000000000;
    int[] moves = { 2, 5, 7, 11, 21 };
    assertEquals(230769231, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case87() {
    int maxN = 998457158;
    int[] moves = { 2, 3, 4, 12, 13, 14, 17, 21 };
    assertEquals(199691433, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case88() {
    int maxN = 999999999;
    int[] moves = { 3, 8 };
    assertEquals(454545454, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case89() {
    int maxN = 1000000000;
    int[] moves = { 2, 7, 10, 12, 15, 20, 22 };
    assertEquals(174418604, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case90() {
    int maxN = 543671;
    int[] moves = { 4, 11, 13, 21 };
    assertEquals(203876, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case91() {
    int maxN = 1000000000;
    int[] moves = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
    assertEquals(43478260, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case92() {
    int maxN = 15;
    int[] moves = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
    assertEquals(0, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case93() {
    int maxN = 724867124;
    int[] moves = { 1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 15, 16, 17, 18, 19, 20, 21, 22 };
    assertEquals(51776223, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case94() {
    int maxN = 100000;
    int[] moves = { 3, 6, 10 };
    assertEquals(30769, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case95() {
    int maxN = 1000000000;
    int[] moves = { 2, 4, 7, 11, 20, 22 };
    assertEquals(333333330, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case96() {
    int maxN = 9699690;
    int[] moves = { 2, 3, 5, 7, 11, 13, 17, 19, 21, 22 };
    assertEquals(1616615, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case97() {
    int maxN = 1000000000;
    int[] moves = { 1, 4 };
    assertEquals(400000000, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case98() {
    int maxN = 1000000000;
    int[] moves = { 9, 11, 16 };
    assertEquals(360000000, longlongnim.numberOfWins(maxN, moves));
  }

  @Test
  public void case99() {
    int maxN = 200000000;
    int[] moves = { 17, 18, 19, 20, 21, 22 };
    assertEquals(87179490, longlongnim.numberOfWins(maxN, moves));
  }

}
