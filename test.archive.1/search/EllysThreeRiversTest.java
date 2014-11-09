package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class EllysThreeRiversTest {
  double DELTA = 1.0e-09;
  EllysThreeRivers ellysthreerivers = new EllysThreeRivers();

  @Test
  public void case1() {
    int length = 10;
    int walk = 8;
    int[] width = { 5, 2, 3 };
    int[] swim = { 5, 2, 7 };
    assertEquals(3.2063518370413364, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 3.2063518370413364);
  }

  @Test
  public void case2() {
    int length = 1000;
    int walk = 100;
    int[] width = { 91, 911, 85 };
    int[] swim = { 28, 97, 19 };
    assertEquals(21.549321613601297, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 21.549321613601297);
  }

  @Test
  public void case3() {
    int length = 666;
    int walk = 4;
    int[] width = { 777, 888, 999 };
    int[] swim = { 11, 12, 13 };
    assertEquals(228.26633673141083, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 228.26633673141083);
  }

  @Test
  public void case4() {
    int length = 6;
    int walk = 100;
    int[] width = { 2, 3, 4 };
    int[] swim = { 77, 88, 99 };
    assertEquals(0.12049782476139667, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 0.12049782476139667);
  }

  @Test
  public void case5() {
    int length = 873;
    int walk = 54;
    int[] width = { 444, 588, 263 };
    int[] swim = { 67, 97, 26 };
    assertEquals(26.365540023205206, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 26.365540023205206);
  }

  @Test
  public void case6() {
    int length = 10;
    int walk = 3;
    int[] width = { 5, 2, 3 };
    int[] swim = { 5, 2, 7 };
    assertEquals(3.206358804145409, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 3.206358804145409);
  }

  @Test
  public void case7() {
    int length = 42;
    int walk = 99;
    int[] width = { 1, 1, 1 };
    int[] swim = { 1, 1, 1 };
    assertEquals(3.4240893747308077, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 3.4240893747308077);
  }

  @Test
  public void case8() {
    int length = 1000;
    int walk = 100;
    int[] width = { 1, 1, 1 };
    int[] swim = { 1, 1, 1 };
    assertEquals(12.999849996249809, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 12.999849996249809);
  }

  @Test
  public void case9() {
    int length = 1;
    int walk = 1;
    int[] width = { 1, 1, 1 };
    int[] swim = { 100, 1, 1 };
    assertEquals(2.014092488547563, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 2.014092488547563);
  }

  @Test
  public void case10() {
    int length = 1000;
    int walk = 1;
    int[] width = { 1000, 1000, 1000 };
    int[] swim = { 100, 1, 1 };
    assertEquals(2014.092488547563, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 2014.092488547563);
  }

  @Test
  public void case11() {
    int length = 1;
    int walk = 1;
    int[] width = { 1, 1, 1 };
    int[] swim = { 1, 100, 1 };
    assertEquals(2.014092488547563, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 2.014092488547563);
  }

  @Test
  public void case12() {
    int length = 1000;
    int walk = 1;
    int[] width = { 1000, 1000, 1000 };
    int[] swim = { 1, 100, 1 };
    assertEquals(2014.0924885475633, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 2014.0924885475633);
  }

  @Test
  public void case13() {
    int length = 1;
    int walk = 1;
    int[] width = { 1, 1, 1 };
    int[] swim = { 1, 1, 100 };
    assertEquals(2.014092488547563, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 2.014092488547563);
  }

  @Test
  public void case14() {
    int length = 1000;
    int walk = 1;
    int[] width = { 1000, 1000, 1000 };
    int[] swim = { 1, 1, 100 };
    assertEquals(2014.0924885475633, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 2014.0924885475633);
  }

  @Test
  public void case15() {
    int length = 1;
    int walk = 1;
    int[] width = { 1, 1, 1 };
    int[] swim = { 100, 100, 1 };
    assertEquals(1.02235071540691, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 1.02235071540691);
  }

  @Test
  public void case16() {
    int length = 1000;
    int walk = 1;
    int[] width = { 1000, 1000, 1000 };
    int[] swim = { 100, 100, 1 };
    assertEquals(1022.3507154069101, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 1022.3507154069101);
  }

  @Test
  public void case17() {
    int length = 1;
    int walk = 1;
    int[] width = { 1, 1, 1 };
    int[] swim = { 100, 1, 100 };
    assertEquals(1.02235071540691, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 1.02235071540691);
  }

  @Test
  public void case18() {
    int length = 1000;
    int walk = 1;
    int[] width = { 1000, 1000, 1000 };
    int[] swim = { 100, 1, 100 };
    assertEquals(1022.3507154069101, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 1022.3507154069101);
  }

  @Test
  public void case19() {
    int length = 1;
    int walk = 1;
    int[] width = { 1, 1, 1 };
    int[] swim = { 1, 100, 100 };
    assertEquals(1.0223507154069102, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 1.0223507154069102);
  }

  @Test
  public void case20() {
    int length = 1000;
    int walk = 1;
    int[] width = { 1000, 1000, 1000 };
    int[] swim = { 1, 100, 100 };
    assertEquals(1022.3507154069101, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 1022.3507154069101);
  }

  @Test
  public void case21() {
    int length = 1;
    int walk = 1;
    int[] width = { 1, 1, 1 };
    int[] swim = { 100, 100, 100 };
    assertEquals(0.03162277660168379, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 0.03162277660168379);
  }

  @Test
  public void case22() {
    int length = 1000;
    int walk = 1;
    int[] width = { 1000, 1000, 1000 };
    int[] swim = { 100, 100, 100 };
    assertEquals(31.62277660168379, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 31.62277660168379);
  }

  @Test
  public void case23() {
    int length = 1000;
    int walk = 2;
    int[] width = { 1, 1, 1 };
    int[] swim = { 1, 1, 1 };
    assertEquals(502.59807621135326, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 502.59807621135326);
  }

  @Test
  public void case24() {
    int length = 1;
    int walk = 100;
    int[] width = { 1, 1, 1 };
    int[] swim = { 100, 100, 100 };
    assertEquals(0.03162277660168379, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 0.03162277660168379);
  }

  @Test
  public void case25() {
    int length = 1000;
    int walk = 1;
    int[] width = { 1000, 1000, 1000 };
    int[] swim = { 1, 1, 1 };
    assertEquals(3162.277660168379, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 3162.277660168379);
  }

  @Test
  public void case26() {
    int length = 989;
    int walk = 1;
    int[] width = { 999, 2, 998 };
    int[] swim = { 24, 1, 98 };
    assertEquals(57.39415929575806, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 57.39415929575806);
  }

  @Test
  public void case27() {
    int length = 969;
    int walk = 1;
    int[] width = { 713, 999, 68 };
    int[] swim = { 99, 97, 99 };
    assertEquals(20.7079155100707, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 20.7079155100707);
  }

  @Test
  public void case28() {
    int length = 997;
    int walk = 1;
    int[] width = { 2, 1, 1000 };
    int[] swim = { 98, 1, 99 };
    assertEquals(15.278151634263711, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 15.278151634263711);
  }

  @Test
  public void case29() {
    int length = 709;
    int walk = 81;
    int[] width = { 319, 795, 697 };
    int[] swim = { 95, 73, 44 };
    assertEquals(32.106959944330384, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 32.106959944330384);
  }

  @Test
  public void case30() {
    int length = 812;
    int walk = 55;
    int[] width = { 477, 837, 590 };
    int[] swim = { 26, 93, 88 };
    assertEquals(36.24002021182467, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 36.24002021182467);
  }

  @Test
  public void case31() {
    int length = 692;
    int walk = 70;
    int[] width = { 383, 153, 862 };
    int[] swim = { 12, 83, 75 };
    assertEquals(47.9315091426996, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 47.9315091426996);
  }

  @Test
  public void case32() {
    int length = 770;
    int walk = 71;
    int[] width = { 57, 153, 325 };
    int[] swim = { 97, 68, 79 };
    assertEquals(12.015184548144735, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 12.015184548144735);
  }

  @Test
  public void case33() {
    int length = 424;
    int walk = 60;
    int[] width = { 163, 275, 979 };
    int[] swim = { 31, 86, 4 };
    assertEquals(255.48147597689908, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 255.48147597689908);
  }

  @Test
  public void case34() {
    int length = 115;
    int walk = 2;
    int[] width = { 787, 933, 48 };
    int[] swim = { 50, 46, 5 };
    assertEquals(45.70266338154858, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 45.70266338154858);
  }

  @Test
  public void case35() {
    int length = 655;
    int walk = 69;
    int[] width = { 90, 240, 992 };
    int[] swim = { 1, 7, 44 };
    assertEquals(151.16660851530833, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 151.16660851530833);
  }

  @Test
  public void case36() {
    int length = 430;
    int walk = 83;
    int[] width = { 992, 88, 120 };
    int[] swim = { 39, 47, 37 };
    assertEquals(32.44783787996134, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 32.44783787996134);
  }

  @Test
  public void case37() {
    int length = 2;
    int walk = 12;
    int[] width = { 478, 728, 533 };
    int[] swim = { 23, 13, 85 };
    assertEquals(83.05322734314836, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 83.05322734314836);
  }

  @Test
  public void case38() {
    int length = 351;
    int walk = 8;
    int[] width = { 812, 974, 778 };
    int[] swim = { 89, 40, 2 };
    assertEquals(423.0124734394166, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 423.0124734394166);
  }

  @Test
  public void case39() {
    int length = 283;
    int walk = 41;
    int[] width = { 73, 994, 807 };
    int[] swim = { 50, 41, 32 };
    assertEquals(51.48946675617956, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 51.48946675617956);
  }

  @Test
  public void case40() {
    int length = 6;
    int walk = 92;
    int[] width = { 677, 10, 503 };
    int[] swim = { 8, 29, 7 };
    assertEquals(156.82892122287066, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 156.82892122287066);
  }

  @Test
  public void case41() {
    int length = 982;
    int walk = 15;
    int[] width = { 729, 128, 907 };
    int[] swim = { 48, 98, 80 };
    assertEquals(31.522247049508906, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 31.522247049508906);
  }

  @Test
  public void case42() {
    int length = 848;
    int walk = 55;
    int[] width = { 215, 244, 956 };
    int[] swim = { 34, 27, 1 };
    assertEquals(984.1038328477277, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 984.1038328477277);
  }

  @Test
  public void case43() {
    int length = 29;
    int walk = 2;
    int[] width = { 726, 104, 658 };
    int[] swim = { 11, 78, 85 };
    assertEquals(75.08034631941547, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 75.08034631941547);
  }

  @Test
  public void case44() {
    int length = 838;
    int walk = 95;
    int[] width = { 466, 941, 356 };
    int[] swim = { 85, 39, 46 };
    assertEquals(40.84960192326622, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 40.84960192326622);
  }

  @Test
  public void case45() {
    int length = 174;
    int walk = 89;
    int[] width = { 762, 702, 126 };
    int[] swim = { 2, 28, 41 };
    assertEquals(409.71354053673, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 409.71354053673);
  }

  @Test
  public void case46() {
    int length = 644;
    int walk = 9;
    int[] width = { 48, 560, 124 };
    int[] swim = { 51, 15, 6 };
    assertEquals(68.88188261221158, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 68.88188261221158);
  }

  @Test
  public void case47() {
    int length = 214;
    int walk = 41;
    int[] width = { 961, 279, 306 };
    int[] swim = { 25, 15, 39 };
    assertEquals(65.45313672794364, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 65.45313672794364);
  }

  @Test
  public void case48() {
    int length = 211;
    int walk = 95;
    int[] width = { 970, 10, 87 };
    int[] swim = { 52, 33, 55 };
    assertEquals(20.93552939515498, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 20.93552939515498);
  }

  @Test
  public void case49() {
    int length = 67;
    int walk = 38;
    int[] width = { 899, 552, 559 };
    int[] swim = { 98, 87, 29 };
    assertEquals(34.808887106462585, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 34.808887106462585);
  }

  @Test
  public void case50() {
    int length = 330;
    int walk = 26;
    int[] width = { 796, 972, 98 };
    int[] swim = { 37, 98, 53 };
    assertEquals(33.69514341197416, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 33.69514341197416);
  }

  @Test
  public void case51() {
    int length = 973;
    int walk = 1;
    int[] width = { 855, 279, 205 };
    int[] swim = { 41, 74, 32 };
    assertEquals(37.517105353602425, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 37.517105353602425);
  }

  @Test
  public void case52() {
    int length = 593;
    int walk = 43;
    int[] width = { 311, 735, 145 };
    int[] swim = { 94, 57, 24 };
    assertEquals(24.424179011925297, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 24.424179011925297);
  }

  @Test
  public void case53() {
    int length = 310;
    int walk = 31;
    int[] width = { 113, 937, 888 };
    int[] swim = { 23, 2, 21 };
    assertEquals(517.7394187366211, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 517.7394187366211);
  }

  @Test
  public void case54() {
    int length = 87;
    int walk = 18;
    int[] width = { 839, 328, 747 };
    int[] swim = { 64, 7, 14 };
    assertEquals(113.3805319183649, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 113.3805319183649);
  }

  @Test
  public void case55() {
    int length = 628;
    int walk = 73;
    int[] width = { 46, 765, 389 };
    int[] swim = { 35, 25, 94 };
    assertEquals(38.99598774222261, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 38.99598774222261);
  }

  @Test
  public void case56() {
    int length = 407;
    int walk = 68;
    int[] width = { 692, 662, 114 };
    int[] swim = { 29, 65, 32 };
    assertEquals(38.81645919705065, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 38.81645919705065);
  }

  @Test
  public void case57() {
    int length = 67;
    int walk = 48;
    int[] width = { 781, 456, 187 };
    int[] swim = { 28, 69, 77 };
    assertEquals(36.96323250634985, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 36.96323250634985);
  }

  @Test
  public void case58() {
    int length = 989;
    int walk = 33;
    int[] width = { 614, 233, 894 };
    int[] swim = { 1, 17, 43 };
    assertEquals(658.0423724301088, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 658.0423724301088);
  }

  @Test
  public void case59() {
    int length = 294;
    int walk = 4;
    int[] width = { 602, 858, 310 };
    int[] swim = { 79, 25, 9 };
    assertEquals(76.97596638669066, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 76.97596638669066);
  }

  @Test
  public void case60() {
    int length = 557;
    int walk = 12;
    int[] width = { 116, 836, 932 };
    int[] swim = { 59, 17, 22 };
    assertEquals(97.07663104364889, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 97.07663104364889);
  }

  @Test
  public void case61() {
    int length = 761;
    int walk = 39;
    int[] width = { 327, 471, 664 };
    int[] swim = { 56, 52, 50 };
    assertEquals(31.75724168700356, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 31.75724168700356);
  }

  @Test
  public void case62() {
    int length = 999;
    int walk = 46;
    int[] width = { 181, 517, 10 };
    int[] swim = { 67, 10, 42 };
    assertEquals(66.48183264749993, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 66.48183264749993);
  }

  @Test
  public void case63() {
    int length = 136;
    int walk = 75;
    int[] width = { 754, 73, 59 };
    int[] swim = { 43, 16, 30 };
    assertEquals(24.323918002565193, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 24.323918002565193);
  }

  @Test
  public void case64() {
    int length = 45;
    int walk = 28;
    int[] width = { 786, 523, 677 };
    int[] swim = { 29, 51, 82 };
    assertEquals(45.62409045159258, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 45.62409045159258);
  }

  @Test
  public void case65() {
    int length = 843;
    int walk = 20;
    int[] width = { 510, 821, 324 };
    int[] swim = { 86, 38, 9 };
    assertEquals(67.55406014205694, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 67.55406014205694);
  }

  @Test
  public void case66() {
    int length = 854;
    int walk = 85;
    int[] width = { 266, 872, 549 };
    int[] swim = { 14, 24, 61 };
    assertEquals(69.9108380055342, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 69.9108380055342);
  }

  @Test
  public void case67() {
    int length = 557;
    int walk = 87;
    int[] width = { 780, 532, 345 };
    int[] swim = { 80, 48, 20 };
    assertEquals(39.654756741789996, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 39.654756741789996);
  }

  @Test
  public void case68() {
    int length = 447;
    int walk = 98;
    int[] width = { 831, 776, 673 };
    int[] swim = { 81, 6, 40 };
    assertEquals(157.4034961575639, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 157.4034961575639);
  }

  @Test
  public void case69() {
    int length = 321;
    int walk = 44;
    int[] width = { 849, 181, 829 };
    int[] swim = { 35, 47, 70 };
    assertEquals(40.48115784296614, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 40.48115784296614);
  }

  @Test
  public void case70() {
    int length = 319;
    int walk = 60;
    int[] width = { 256, 570, 606 };
    int[] swim = { 60, 84, 40 };
    assertEquals(26.774690457728852, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 26.774690457728852);
  }

  @Test
  public void case71() {
    int length = 552;
    int walk = 81;
    int[] width = { 949, 215, 233 };
    int[] swim = { 88, 46, 11 };
    assertEquals(38.14455919341227, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 38.14455919341227);
  }

  @Test
  public void case72() {
    int length = 947;
    int walk = 8;
    int[] width = { 199, 838, 813 };
    int[] swim = { 96, 80, 87 };
    assertEquals(24.583049189630813, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 24.583049189630813);
  }

  @Test
  public void case73() {
    int length = 88;
    int walk = 19;
    int[] width = { 761, 540, 47 };
    int[] swim = { 75, 22, 82 };
    assertEquals(35.318378376304636, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 35.318378376304636);
  }

  @Test
  public void case74() {
    int length = 114;
    int walk = 9;
    int[] width = { 349, 94, 877 };
    int[] swim = { 43, 58, 50 };
    assertEquals(27.37782062653215, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 27.37782062653215);
  }

  @Test
  public void case75() {
    int length = 638;
    int walk = 99;
    int[] width = { 122, 12, 619 };
    int[] swim = { 35, 8, 72 };
    assertEquals(17.11633956822566, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 17.11633956822566);
  }

  @Test
  public void case76() {
    int length = 491;
    int walk = 67;
    int[] width = { 43, 665, 453 };
    int[] swim = { 29, 51, 43 };
    assertEquals(27.169025630459775, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 27.169025630459775);
  }

  @Test
  public void case77() {
    int length = 126;
    int walk = 53;
    int[] width = { 685, 558, 34 };
    int[] swim = { 7, 56, 61 };
    assertEquals(108.58549824021065, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 108.58549824021065);
  }

  @Test
  public void case78() {
    int length = 53;
    int walk = 6;
    int[] width = { 908, 460, 302 };
    int[] swim = { 96, 86, 68 };
    assertEquals(19.257881810598185, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 19.257881810598185);
  }

  @Test
  public void case79() {
    int length = 537;
    int walk = 74;
    int[] width = { 250, 518, 310 };
    int[] swim = { 31, 43, 31 };
    assertEquals(33.53098194495919, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 33.53098194495919);
  }

  @Test
  public void case80() {
    int length = 102;
    int walk = 89;
    int[] width = { 921, 907, 271 };
    int[] swim = { 28, 96, 20 };
    assertEquals(55.93469727895131, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 55.93469727895131);
  }

  @Test
  public void case81() {
    int length = 199;
    int walk = 96;
    int[] width = { 805, 106, 577 };
    int[] swim = { 20, 59, 17 };
    assertEquals(76.59765877394904, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 76.59765877394904);
  }

  @Test
  public void case82() {
    int length = 167;
    int walk = 92;
    int[] width = { 356, 304, 874 };
    int[] swim = { 9, 42, 36 };
    assertEquals(71.36418177355154, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 71.36418177355154);
  }

  @Test
  public void case83() {
    int length = 966;
    int walk = 99;
    int[] width = { 809, 62, 553 };
    int[] swim = { 77, 26, 41 };
    assertEquals(31.128434370498113, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 31.128434370498113);
  }

  @Test
  public void case84() {
    int length = 303;
    int walk = 64;
    int[] width = { 40, 346, 406 };
    int[] swim = { 27, 19, 21 };
    assertEquals(41.730025470435145, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 41.730025470435145);
  }

  @Test
  public void case85() {
    int length = 83;
    int walk = 60;
    int[] width = { 527, 914, 581 };
    int[] swim = { 51, 60, 29 };
    assertEquals(45.63607787572167, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 45.63607787572167);
  }

  @Test
  public void case86() {
    int length = 734;
    int walk = 9;
    int[] width = { 263, 697, 373 };
    int[] swim = { 37, 89, 31 };
    assertEquals(29.877137586542624, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 29.877137586542624);
  }

  @Test
  public void case87() {
    int length = 664;
    int walk = 92;
    int[] width = { 711, 649, 758 };
    int[] swim = { 23, 93, 66 };
    assertEquals(51.0493659167597, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 51.0493659167597);
  }

  @Test
  public void case88() {
    int length = 251;
    int walk = 80;
    int[] width = { 293, 416, 1000 };
    int[] swim = { 13, 8, 21 };
    assertEquals(123.26913569830492, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 123.26913569830492);
  }

  @Test
  public void case89() {
    int length = 494;
    int walk = 46;
    int[] width = { 661, 308, 488 };
    int[] swim = { 7, 90, 18 };
    assertEquals(127.45692621793788, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 127.45692621793788);
  }

  @Test
  public void case90() {
    int length = 593;
    int walk = 51;
    int[] width = { 716, 732, 169 };
    int[] swim = { 51, 38, 32 };
    assertEquals(41.018447555490496, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 41.018447555490496);
  }

  @Test
  public void case91() {
    int length = 995;
    int walk = 45;
    int[] width = { 934, 711, 369 };
    int[] swim = { 21, 34, 4 };
    assertEquals(167.64403179133967, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 167.64403179133967);
  }

  @Test
  public void case92() {
    int length = 911;
    int walk = 85;
    int[] width = { 256, 875, 457 };
    int[] swim = { 26, 66, 37 };
    assertEquals(40.08971926083948, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 40.08971926083948);
  }

  @Test
  public void case93() {
    int length = 702;
    int walk = 46;
    int[] width = { 84, 60, 666 };
    int[] swim = { 63, 29, 5 };
    assertEquals(145.84958532668242, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 145.84958532668242);
  }

  @Test
  public void case94() {
    int length = 150;
    int walk = 66;
    int[] width = { 125, 94, 866 };
    int[] swim = { 50, 71, 23 };
    assertEquals(41.81541544551314, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 41.81541544551314);
  }

  @Test
  public void case95() {
    int length = 161;
    int walk = 20;
    int[] width = { 944, 85, 829 };
    int[] swim = { 83, 44, 13 };
    assertEquals(77.21348467778316, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 77.21348467778316);
  }

  @Test
  public void case96() {
    int length = 728;
    int walk = 35;
    int[] width = { 335, 603, 829 };
    int[] swim = { 40, 62, 76 };
    assertEquals(31.235343404112808, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 31.235343404112808);
  }

  @Test
  public void case97() {
    int length = 632;
    int walk = 21;
    int[] width = { 831, 943, 327 };
    int[] swim = { 4, 12, 59 };
    assertEquals(296.8753293921628, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 296.8753293921628);
  }

  @Test
  public void case98() {
    int length = 677;
    int walk = 5;
    int[] width = { 793, 437, 511 };
    int[] swim = { 91, 14, 11 };
    assertEquals(88.84845402789122, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 88.84845402789122);
  }

  @Test
  public void case99() {
    int length = 425;
    int walk = 32;
    int[] width = { 183, 541, 440 };
    int[] swim = { 66, 51, 42 };
    assertEquals(25.35718130871519, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 25.35718130871519);
  }

  @Test
  public void case100() {
    int length = 840;
    int walk = 36;
    int[] width = { 474, 806, 762 };
    int[] swim = { 5, 36, 34 };
    assertEquals(145.40920036869377, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 145.40920036869377);
  }

  @Test
  public void case101() {
    int length = 6;
    int walk = 100;
    int[] width = { 2, 3, 4 };
    int[] swim = { 77, 88, 99 };
    assertEquals(0.12049782476139667, ellysthreerivers.getMin(length, walk, width, swim), DELTA * 0.12049782476139667);
  }

}
