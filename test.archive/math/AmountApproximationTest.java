package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class AmountApproximationTest {
  AmountApproximation amountapproximation = new AmountApproximation();

  @Test
  public void case1() {
    int D = 17;
    int p1 = 7;
    int p2 = 9;
    assertEquals(18, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case2() {
    int D = 17;
    int p1 = 7;
    int p2 = 13;
    assertEquals(20, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case3() {
    int D = 21;
    int p1 = 7;
    int p2 = 13;
    assertEquals(21, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case4() {
    int D = 37;
    int p1 = 9;
    int p2 = 17;
    assertEquals(43, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case5() {
    int D = 287341;
    int p1 = 2345;
    int p2 = 7253;
    assertEquals(287398, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case6() {
    int D = 1000000000;
    int p1 = 1;
    int p2 = 1;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case7() {
    int D = 1000000000;
    int p1 = 1000000000;
    int p2 = 1;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case8() {
    int D = 1000000000;
    int p1 = 1;
    int p2 = 1000000000;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case9() {
    int D = 1000000000;
    int p1 = 1000000000;
    int p2 = 1000000000;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case10() {
    int D = 1000000000;
    int p1 = 999999999;
    int p2 = 999999999;
    assertEquals(1999999998, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case11() {
    int D = 1;
    int p1 = 1000000000;
    int p2 = 999999999;
    assertEquals(999999999, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case12() {
    int D = 3;
    int p1 = 1000000000;
    int p2 = 1000000000;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case13() {
    int D = 3;
    int p1 = 999999997;
    int p2 = 1000000000;
    assertEquals(999999997, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case14() {
    int D = 999999913;
    int p1 = 1;
    int p2 = 992999913;
    assertEquals(999999913, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case15() {
    int D = 999999913;
    int p1 = 3;
    int p2 = 992999913;
    assertEquals(999999915, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case16() {
    int D = 999999913;
    int p1 = 992999913;
    int p2 = 1;
    assertEquals(999999913, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case17() {
    int D = 999999913;
    int p1 = 992999913;
    int p2 = 3;
    assertEquals(999999915, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case18() {
    int D = 536343;
    int p1 = 288;
    int p2 = 1;
    assertEquals(536343, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case19() {
    int D = 26964;
    int p1 = 111209082;
    int p2 = 1291960;
    assertEquals(1291960, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case20() {
    int D = 810;
    int p1 = 1;
    int p2 = 20533140;
    assertEquals(810, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case21() {
    int D = 2920;
    int p1 = 123773;
    int p2 = 48048593;
    assertEquals(123773, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case22() {
    int D = 2167;
    int p1 = 302350;
    int p2 = 63751;
    assertEquals(63751, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case23() {
    int D = 951546;
    int p1 = 104795;
    int p2 = 6423;
    assertEquals(951947, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case24() {
    int D = 53635841;
    int p1 = 185343;
    int p2 = 157;
    assertEquals(53635841, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case25() {
    int D = 701317;
    int p1 = 592510;
    int p2 = 17742;
    assertEquals(709680, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case26() {
    int D = 1;
    int p1 = 1;
    int p2 = 1754;
    assertEquals(1, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case27() {
    int D = 208029086;
    int p1 = 1197;
    int p2 = 3;
    assertEquals(208029087, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case28() {
    int D = 3827059;
    int p1 = 3849166;
    int p2 = 30735;
    assertEquals(3841875, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case29() {
    int D = 386;
    int p1 = 810183478;
    int p2 = 42401940;
    assertEquals(42401940, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case30() {
    int D = 2699;
    int p1 = 4960290;
    int p2 = 28;
    assertEquals(2716, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case31() {
    int D = 1;
    int p1 = 318551;
    int p2 = 10;
    assertEquals(10, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case32() {
    int D = 15206;
    int p1 = 1072763;
    int p2 = 552914;
    assertEquals(552914, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case33() {
    int D = 875938;
    int p1 = 1806952;
    int p2 = 817;
    assertEquals(876641, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case34() {
    int D = 414989;
    int p1 = 3290136;
    int p2 = 885;
    assertEquals(415065, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case35() {
    int D = 313;
    int p1 = 2013799;
    int p2 = 38505;
    assertEquals(38505, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case36() {
    int D = 444393;
    int p1 = 79690;
    int p2 = 1010;
    assertEquals(444400, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case37() {
    int D = 566501015;
    int p1 = 300551970;
    int p2 = 2122343;
    assertEquals(566665581, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case38() {
    int D = 6;
    int p1 = 53;
    int p2 = 3559949;
    assertEquals(53, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case39() {
    int D = 53079295;
    int p1 = 635;
    int p2 = 252;
    assertEquals(53079295, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case40() {
    int D = 8;
    int p1 = 2;
    int p2 = 14;
    assertEquals(8, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case41() {
    int D = 164;
    int p1 = 37;
    int p2 = 1097119;
    assertEquals(185, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case42() {
    int D = 2658007;
    int p1 = 267491;
    int p2 = 3047;
    assertEquals(2658096, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case43() {
    int D = 31550;
    int p1 = 4;
    int p2 = 12659;
    assertEquals(31550, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case44() {
    int D = 28220;
    int p1 = 41272155;
    int p2 = 470945368;
    assertEquals(41272155, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case45() {
    int D = 842418187;
    int p1 = 37;
    int p2 = 438923;
    assertEquals(842418187, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case46() {
    int D = 9;
    int p1 = 137;
    int p2 = 519185;
    assertEquals(137, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case47() {
    int D = 900;
    int p1 = 17159;
    int p2 = 90;
    assertEquals(900, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case48() {
    int D = 29;
    int p1 = 15;
    int p2 = 16;
    assertEquals(30, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case49() {
    int D = 3913;
    int p1 = 3581;
    int p2 = 3;
    assertEquals(3914, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case50() {
    int D = 3897537;
    int p1 = 1625;
    int p2 = 257;
    assertEquals(3897537, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case51() {
    int D = 189290897;
    int p1 = 146170;
    int p2 = 176519597;
    assertEquals(189382557, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case52() {
    int D = 17432;
    int p1 = 1005;
    int p2 = 5235;
    assertEquals(17505, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case53() {
    int D = 8779251;
    int p1 = 22617;
    int p2 = 2570;
    assertEquals(8779255, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case54() {
    int D = 495230;
    int p1 = 14921;
    int p2 = 27708;
    assertEquals(496627, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case55() {
    int D = 223;
    int p1 = 85;
    int p2 = 3;
    assertEquals(223, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case56() {
    int D = 93;
    int p1 = 93;
    int p2 = 3;
    assertEquals(93, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case57() {
    int D = 1281;
    int p1 = 155;
    int p2 = 853;
    assertEquals(1318, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case58() {
    int D = 64169488;
    int p1 = 11055;
    int p2 = 791792;
    assertEquals(64169570, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case59() {
    int D = 136;
    int p1 = 57;
    int p2 = 4;
    assertEquals(136, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case60() {
    int D = 120;
    int p1 = 6;
    int p2 = 92;
    assertEquals(120, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case61() {
    int D = 17451;
    int p1 = 57;
    int p2 = 3;
    assertEquals(17451, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case62() {
    int D = 2260;
    int p1 = 1395;
    int p2 = 1907;
    assertEquals(2790, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case63() {
    int D = 1023;
    int p1 = 45;
    int p2 = 1;
    assertEquals(1023, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case64() {
    int D = 131827436;
    int p1 = 6;
    int p2 = 8;
    assertEquals(131827436, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case65() {
    int D = 31242;
    int p1 = 2;
    int p2 = 9605;
    assertEquals(31242, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case66() {
    int D = 152;
    int p1 = 14;
    int p2 = 2;
    assertEquals(152, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case67() {
    int D = 1;
    int p1 = 1;
    int p2 = 1;
    assertEquals(1, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case68() {
    int D = 17262688;
    int p1 = 3305956;
    int p2 = 4;
    assertEquals(17262688, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case69() {
    int D = 122;
    int p1 = 11;
    int p2 = 115;
    assertEquals(126, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case70() {
    int D = 137699588;
    int p1 = 1902247;
    int p2 = 3;
    assertEquals(137699588, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case71() {
    int D = 4819808;
    int p1 = 69684;
    int p2 = 3203483;
    assertEquals(4875899, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case72() {
    int D = 35;
    int p1 = 24;
    int p2 = 27;
    assertEquals(48, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case73() {
    int D = 1;
    int p1 = 1;
    int p2 = 1;
    assertEquals(1, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case74() {
    int D = 6079;
    int p1 = 2;
    int p2 = 4591;
    assertEquals(6079, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case75() {
    int D = 7;
    int p1 = 5;
    int p2 = 3;
    assertEquals(8, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case76() {
    int D = 7486775;
    int p1 = 4;
    int p2 = 42;
    assertEquals(7486776, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case77() {
    int D = 9;
    int p1 = 1;
    int p2 = 6;
    assertEquals(9, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case78() {
    int D = 1928;
    int p1 = 1131;
    int p2 = 1765;
    assertEquals(2262, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case79() {
    int D = 376402824;
    int p1 = 243997730;
    int p2 = 39372804;
    assertEquals(393728040, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case80() {
    int D = 109681;
    int p1 = 87002;
    int p2 = 16877;
    assertEquals(118139, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case81() {
    int D = 1359;
    int p1 = 796;
    int p2 = 1206;
    assertEquals(1592, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case82() {
    int D = 1153;
    int p1 = 866;
    int p2 = 923;
    assertEquals(1732, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case83() {
    int D = 2296;
    int p1 = 2009;
    int p2 = 709;
    assertEquals(2718, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case84() {
    int D = 102608;
    int p1 = 14107;
    int p2 = 13578;
    assertEquals(108624, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case85() {
    int D = 30;
    int p1 = 5;
    int p2 = 6;
    assertEquals(30, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case86() {
    int D = 3154;
    int p1 = 1615;
    int p2 = 3127;
    assertEquals(3230, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case87() {
    int D = 53917296;
    int p1 = 1660012;
    int p2 = 28216367;
    assertEquals(54776559, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case88() {
    int D = 1;
    int p1 = 1;
    int p2 = 1;
    assertEquals(1, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case89() {
    int D = 1;
    int p1 = 2;
    int p2 = 2;
    assertEquals(2, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case90() {
    int D = 1;
    int p1 = 2;
    int p2 = 1;
    assertEquals(1, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case91() {
    int D = 1;
    int p1 = 1;
    int p2 = 2;
    assertEquals(1, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case92() {
    int D = 1000000000;
    int p1 = 2;
    int p2 = 3;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case93() {
    int D = 1000000000;
    int p1 = 2;
    int p2 = 4;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case94() {
    int D = 999999999;
    int p1 = 2;
    int p2 = 4;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case95() {
    int D = 999999999;
    int p1 = 2;
    int p2 = 3;
    assertEquals(999999999, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case96() {
    int D = 999999999;
    int p1 = 2;
    int p2 = 2;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case97() {
    int D = 1000000000;
    int p1 = 2;
    int p2 = 2;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case98() {
    int D = 999999998;
    int p1 = 2;
    int p2 = 4;
    assertEquals(999999998, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case99() {
    int D = 999999999;
    int p1 = 4;
    int p2 = 6;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case100() {
    int D = 287341;
    int p1 = 2345;
    int p2 = 7253;
    assertEquals(287398, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case101() {
    int D = 999999991;
    int p1 = 2;
    int p2 = 2;
    assertEquals(999999992, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case102() {
    int D = 21;
    int p1 = 7;
    int p2 = 13;
    assertEquals(21, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case103() {
    int D = 666000000;
    int p1 = 800000000;
    int p2 = 7;
    assertEquals(666000006, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case104() {
    int D = 999999937;
    int p1 = 3;
    int p2 = 5;
    assertEquals(999999937, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case105() {
    int D = 1000000000;
    int p1 = 3;
    int p2 = 7;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case106() {
    int D = 999900007;
    int p1 = 3;
    int p2 = 17;
    assertEquals(999900007, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case107() {
    int D = 1000000000;
    int p1 = 1;
    int p2 = 1;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case108() {
    int D = 1000000000;
    int p1 = 3;
    int p2 = 5;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case109() {
    int D = 1000000000;
    int p1 = 1;
    int p2 = 2;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case110() {
    int D = 1000000000;
    int p1 = 3;
    int p2 = 9;
    assertEquals(1000000002, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case111() {
    int D = 287341;
    int p1 = 332345;
    int p2 = 237253;
    assertEquals(332345, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case112() {
    int D = 999999999;
    int p1 = 2;
    int p2 = 4;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case113() {
    int D = 999999999;
    int p1 = 2;
    int p2 = 2;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case114() {
    int D = 999999999;
    int p1 = 6;
    int p2 = 7;
    assertEquals(999999999, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case115() {
    int D = 1000000000;
    int p1 = 3;
    int p2 = 3;
    assertEquals(1000000002, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case116() {
    int D = 1000000000;
    int p1 = 4;
    int p2 = 3;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case117() {
    int D = 990000012;
    int p1 = 883212354;
    int p2 = 999999943;
    assertEquals(999999943, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case118() {
    int D = 100000000;
    int p1 = 5;
    int p2 = 3;
    assertEquals(100000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case119() {
    int D = 1000000000;
    int p1 = 6;
    int p2 = 9;
    assertEquals(1000000002, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case120() {
    int D = 100;
    int p1 = 1;
    int p2 = 101;
    assertEquals(100, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case121() {
    int D = 1000000000;
    int p1 = 7;
    int p2 = 11;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case122() {
    int D = 999999997;
    int p1 = 3;
    int p2 = 5;
    assertEquals(999999997, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case123() {
    int D = 1000000000;
    int p1 = 10;
    int p2 = 30;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case124() {
    int D = 1000000000;
    int p1 = 7;
    int p2 = 13;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case125() {
    int D = 1000000000;
    int p1 = 11;
    int p2 = 7;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case126() {
    int D = 1000000000;
    int p1 = 399;
    int p2 = 799;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case127() {
    int D = 999999997;
    int p1 = 37;
    int p2 = 29;
    assertEquals(999999997, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case128() {
    int D = 100000007;
    int p1 = 2;
    int p2 = 3;
    assertEquals(100000007, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case129() {
    int D = 999999937;
    int p1 = 99991;
    int p2 = 899981;
    assertEquals(1000009991, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case130() {
    int D = 11;
    int p1 = 5;
    int p2 = 3;
    assertEquals(11, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case131() {
    int D = 8;
    int p1 = 3;
    int p2 = 7;
    assertEquals(9, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case132() {
    int D = 33;
    int p1 = 2;
    int p2 = 17;
    assertEquals(33, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case133() {
    int D = 999999937;
    int p1 = 2;
    int p2 = 5;
    assertEquals(999999937, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case134() {
    int D = 999999999;
    int p1 = 4;
    int p2 = 2;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case135() {
    int D = 999999995;
    int p1 = 2;
    int p2 = 3;
    assertEquals(999999995, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case136() {
    int D = 1000000000;
    int p1 = 7;
    int p2 = 7;
    assertEquals(1000000001, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case137() {
    int D = 1000000000;
    int p1 = 999999999;
    int p2 = 1000000000;
    assertEquals(1000000000, amountapproximation.approximate(D, p1, p2));
  }

  @Test
  public void case138() {
    int D = 36;
    int p1 = 7;
    int p2 = 5;
    assertEquals(36, amountapproximation.approximate(D, p1, p2));
  }

}
