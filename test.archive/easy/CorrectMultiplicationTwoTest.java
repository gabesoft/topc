package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CorrectMultiplicationTwoTest {
  CorrectMultiplicationTwo correctmultiplicationtwo = new CorrectMultiplicationTwo();

  @Test
  public void case1() {
    int a = 19;
    int b = 28;
    int c = 522;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case2() {
    int a = 10;
    int b = 30;
    int c = 500;
    assertEquals(11, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case3() {
    int a = 111;
    int b = 111;
    int c = 12321;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case4() {
    int a = 1000;
    int b = 100;
    int c = 10;
    assertEquals(1089, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case5() {
    int a = 399;
    int b = 522;
    int c = 199999;
    assertEquals(24, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case6() {
    int a = 1;
    int b = 1;
    int c = 1;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case7() {
    int a = 1;
    int b = 1;
    int c = 2;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case8() {
    int a = 1;
    int b = 1;
    int c = 3;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case9() {
    int a = 1;
    int b = 2;
    int c = 1;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case10() {
    int a = 1;
    int b = 2;
    int c = 2;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case11() {
    int a = 1;
    int b = 2;
    int c = 3;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case12() {
    int a = 1;
    int b = 3;
    int c = 1;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case13() {
    int a = 1;
    int b = 3;
    int c = 2;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case14() {
    int a = 1;
    int b = 3;
    int c = 3;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case15() {
    int a = 2;
    int b = 1;
    int c = 1;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case16() {
    int a = 2;
    int b = 1;
    int c = 2;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case17() {
    int a = 2;
    int b = 1;
    int c = 3;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case18() {
    int a = 2;
    int b = 2;
    int c = 1;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case19() {
    int a = 2;
    int b = 2;
    int c = 2;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case20() {
    int a = 2;
    int b = 2;
    int c = 3;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case21() {
    int a = 2;
    int b = 3;
    int c = 1;
    assertEquals(3, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case22() {
    int a = 2;
    int b = 3;
    int c = 2;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case23() {
    int a = 2;
    int b = 3;
    int c = 3;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case24() {
    int a = 3;
    int b = 1;
    int c = 1;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case25() {
    int a = 3;
    int b = 1;
    int c = 2;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case26() {
    int a = 3;
    int b = 1;
    int c = 3;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case27() {
    int a = 3;
    int b = 2;
    int c = 1;
    assertEquals(3, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case28() {
    int a = 3;
    int b = 2;
    int c = 2;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case29() {
    int a = 3;
    int b = 2;
    int c = 3;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case30() {
    int a = 3;
    int b = 3;
    int c = 1;
    assertEquals(4, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case31() {
    int a = 3;
    int b = 3;
    int c = 2;
    assertEquals(3, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case32() {
    int a = 3;
    int b = 3;
    int c = 3;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case33() {
    int a = 1;
    int b = 1;
    int c = 1;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case34() {
    int a = 1;
    int b = 1;
    int c = 1000000;
    assertEquals(1998, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case35() {
    int a = 1;
    int b = 1000000;
    int c = 1;
    assertEquals(999999, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case36() {
    int a = 1;
    int b = 1000000;
    int c = 1000000;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case37() {
    int a = 1000000;
    int b = 1;
    int c = 1;
    assertEquals(999999, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case38() {
    int a = 1000000;
    int b = 1;
    int c = 1000000;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case39() {
    int a = 1000000;
    int b = 1000000;
    int c = 1;
    assertEquals(1999998, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case40() {
    int a = 1000000;
    int b = 1000000;
    int c = 1000000;
    assertEquals(999999, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case41() {
    int a = 4;
    int b = 249999;
    int c = 999994;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case42() {
    int a = 249999;
    int b = 4;
    int c = 999994;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case43() {
    int a = 4;
    int b = 249999;
    int c = 999995;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case44() {
    int a = 249999;
    int b = 4;
    int c = 999995;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case45() {
    int a = 4;
    int b = 249999;
    int c = 999996;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case46() {
    int a = 249999;
    int b = 4;
    int c = 999996;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case47() {
    int a = 4;
    int b = 249999;
    int c = 999997;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case48() {
    int a = 249999;
    int b = 4;
    int c = 999997;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case49() {
    int a = 4;
    int b = 249999;
    int c = 999998;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case50() {
    int a = 249999;
    int b = 4;
    int c = 999998;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case51() {
    int a = 1;
    int b = 117315;
    int c = 117436;
    assertEquals(121, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case52() {
    int a = 316;
    int b = 1;
    int c = 148030;
    assertEquals(454, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case53() {
    int a = 350;
    int b = 666;
    int c = 239626;
    assertEquals(15, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case54() {
    int a = 1;
    int b = 104;
    int c = 613;
    assertEquals(8, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case55() {
    int a = 1;
    int b = 117;
    int c = 44109;
    assertEquals(311, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case56() {
    int a = 1;
    int b = 53;
    int c = 54;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case57() {
    int a = 5;
    int b = 1020;
    int c = 554040;
    assertEquals(541, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case58() {
    int a = 1830;
    int b = 383;
    int c = 4874;
    assertEquals(586, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case59() {
    int a = 1;
    int b = 6383;
    int c = 6292;
    assertEquals(91, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case60() {
    int a = 2449;
    int b = 1;
    int c = 16599;
    assertEquals(86, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case61() {
    int a = 27327;
    int b = 1;
    int c = 27327;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case62() {
    int a = 1966;
    int b = 31;
    int c = 70786;
    assertEquals(15, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case63() {
    int a = 1153;
    int b = 1;
    int c = 1023;
    assertEquals(130, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case64() {
    int a = 1;
    int b = 107217;
    int c = 107217;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case65() {
    int a = 2;
    int b = 6;
    int c = 17;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case66() {
    int a = 55;
    int b = 66;
    int c = 3400;
    assertEquals(6, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case67() {
    int a = 8;
    int b = 408;
    int c = 3248;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case68() {
    int a = 1;
    int b = 26699;
    int c = 26701;
    assertEquals(2, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case69() {
    int a = 1657;
    int b = 1;
    int c = 150770;
    assertEquals(107, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case70() {
    int a = 776;
    int b = 1;
    int c = 4;
    assertEquals(772, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case71() {
    int a = 615147;
    int b = 1;
    int c = 615144;
    assertEquals(3, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case72() {
    int a = 1972;
    int b = 371;
    int c = 544118;
    assertEquals(148, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case73() {
    int a = 617;
    int b = 1256;
    int c = 2512;
    assertEquals(615, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case74() {
    int a = 3934;
    int b = 14;
    int c = 54958;
    assertEquals(14, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case75() {
    int a = 866;
    int b = 3606;
    int c = 104589;
    assertEquals(852, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case76() {
    int a = 9369;
    int b = 67;
    int c = 533634;
    assertEquals(17, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case77() {
    int a = 557;
    int b = 735;
    int c = 2938;
    assertEquals(555, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case78() {
    int a = 6532;
    int b = 71;
    int c = 1;
    assertEquals(6601, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case79() {
    int a = 23;
    int b = 732;
    int c = 22;
    assertEquals(732, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case80() {
    int a = 815585;
    int b = 3185;
    int c = 366;
    assertEquals(818403, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case81() {
    int a = 8370;
    int b = 6942;
    int c = 6862;
    assertEquals(8449, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case82() {
    int a = 134901;
    int b = 132173;
    int c = 130336;
    assertEquals(136737, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case83() {
    int a = 16326;
    int b = 218202;
    int c = 1;
    assertEquals(234526, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case84() {
    int a = 102079;
    int b = 7;
    int c = 23;
    assertEquals(102062, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case85() {
    int a = 1231;
    int b = 63;
    int c = 367;
    assertEquals(926, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case86() {
    int a = 6620;
    int b = 20716;
    int c = 6863;
    assertEquals(20472, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case87() {
    int a = 35739;
    int b = 18886;
    int c = 130337;
    assertEquals(22038, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case88() {
    int a = 9999;
    int b = 9999;
    int c = 9999;
    assertEquals(9998, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case89() {
    int a = 999999;
    int b = 988989;
    int c = 989796;
    assertEquals(999191, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case90() {
    int a = 715406;
    int b = 610901;
    int c = 755977;
    assertEquals(651471, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case91() {
    int a = 999999;
    int b = 777777;
    int c = 888888;
    assertEquals(888887, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case92() {
    int a = 1000000;
    int b = 999999;
    int c = 28;
    assertEquals(1999970, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case93() {
    int a = 10;
    int b = 10;
    int c = 1000000;
    assertEquals(1980, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case94() {
    int a = 499999;
    int b = 500001;
    int c = 1000000;
    assertEquals(499998, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case95() {
    int a = 1000000;
    int b = 1000000;
    int c = 573;
    assertEquals(1999426, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case96() {
    int a = 999961;
    int b = 999979;
    int c = 999983;
    assertEquals(999964, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case97() {
    int a = 999999;
    int b = 999999;
    int c = 999999;
    assertEquals(999998, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case98() {
    int a = 999999;
    int b = 123456;
    int c = 999999;
    assertEquals(123455, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case99() {
    int a = 1000000;
    int b = 1000000;
    int c = 3;
    assertEquals(1999996, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case100() {
    int a = 100000;
    int b = 1;
    int c = 100000;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case101() {
    int a = 999;
    int b = 9;
    int c = 99999;
    assertEquals(93, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case102() {
    int a = 500;
    int b = 1000000;
    int c = 1000000;
    assertEquals(499, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case103() {
    int a = 99;
    int b = 9;
    int c = 99999;
    assertEquals(532, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case104() {
    int a = 1000000;
    int b = 1000000;
    int c = 10;
    assertEquals(1999989, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case105() {
    int a = 1;
    int b = 10000;
    int c = 10001;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case106() {
    int a = 1000;
    int b = 1000;
    int c = 1000000;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case107() {
    int a = 101;
    int b = 9901;
    int c = 1000000;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case108() {
    int a = 933343;
    int b = 832456;
    int c = 933343;
    assertEquals(832455, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case109() {
    int a = 909091;
    int b = 907197;
    int c = 13681;
    assertEquals(1802606, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case110() {
    int a = 999999;
    int b = 1;
    int c = 999999;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case111() {
    int a = 1;
    int b = 100000;
    int c = 99000;
    assertEquals(1000, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case112() {
    int a = 2;
    int b = 100000;
    int c = 199999;
    assertEquals(1, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case113() {
    int a = 2000;
    int b = 100;
    int c = 200000;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case114() {
    int a = 99999;
    int b = 9;
    int c = 9;
    assertEquals(99998, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case115() {
    int a = 50000;
    int b = 50000;
    int c = 115733;
    assertEquals(57865, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case116() {
    int a = 4;
    int b = 5;
    int c = 999983;
    assertEquals(1992, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case117() {
    int a = 1100;
    int b = 10;
    int c = 11000;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case118() {
    int a = 999999;
    int b = 999998;
    int c = 1000000;
    assertEquals(999998, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case119() {
    int a = 2200;
    int b = 10;
    int c = 22000;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case120() {
    int a = 1;
    int b = 600000;
    int c = 600000;
    assertEquals(0, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case121() {
    int a = 1;
    int b = 10;
    int c = 1;
    assertEquals(9, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case122() {
    int a = 999997;
    int b = 999998;
    int c = 1;
    assertEquals(1999993, correctmultiplicationtwo.getMinimum(a, b, c));
  }

  @Test
  public void case123() {
    int a = 10000;
    int b = 10000;
    int c = 1;
    assertEquals(19998, correctmultiplicationtwo.getMinimum(a, b, c));
  }

}
