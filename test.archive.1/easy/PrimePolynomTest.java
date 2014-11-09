package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PrimePolynomTest {
  PrimePolynom primepolynom = new PrimePolynom();

  @Test
  public void case1() {
    int A = 1;
    int B = -1;
    int C = 41;
    assertEquals(41, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case2() {
    int A = 1;
    int B = 1;
    int C = 41;
    assertEquals(40, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case3() {
    int A = 1;
    int B = 1;
    int C = -13;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case4() {
    int A = 1;
    int B = -15;
    int C = 97;
    assertEquals(48, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case5() {
    int A = 1;
    int B = -3;
    int C = 43;
    assertEquals(42, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case6() {
    int A = 1;
    int B = 3;
    int C = 43;
    assertEquals(39, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case7() {
    int A = 1;
    int B = -5;
    int C = 47;
    assertEquals(43, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case8() {
    int A = 1;
    int B = 5;
    int C = 47;
    assertEquals(38, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case9() {
    int A = 1;
    int B = -7;
    int C = 53;
    assertEquals(44, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case10() {
    int A = 1;
    int B = 7;
    int C = 53;
    assertEquals(37, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case11() {
    int A = 1;
    int B = -9;
    int C = 61;
    assertEquals(45, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case12() {
    int A = 1;
    int B = 9;
    int C = 61;
    assertEquals(36, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case13() {
    int A = 1;
    int B = -11;
    int C = 71;
    assertEquals(46, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case14() {
    int A = 1;
    int B = 11;
    int C = 71;
    assertEquals(35, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case15() {
    int A = 1;
    int B = -13;
    int C = 83;
    assertEquals(47, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case16() {
    int A = 2;
    int B = -24;
    int C = 101;
    assertEquals(35, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case17() {
    int A = 1;
    int B = -17;
    int C = 113;
    assertEquals(49, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case18() {
    int A = 2;
    int B = -28;
    int C = 127;
    assertEquals(36, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case19() {
    int A = 1;
    int B = -19;
    int C = 131;
    assertEquals(50, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case20() {
    int A = 1;
    int B = -21;
    int C = 151;
    assertEquals(51, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case21() {
    int A = 2;
    int B = -32;
    int C = 157;
    assertEquals(37, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case22() {
    int A = 1;
    int B = -23;
    int C = 173;
    assertEquals(52, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case23() {
    int A = 2;
    int B = -36;
    int C = 191;
    assertEquals(38, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case24() {
    int A = 1;
    int B = -25;
    int C = 197;
    assertEquals(53, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case25() {
    int A = 6;
    int B = -66;
    int C = 211;
    assertEquals(35, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case26() {
    int A = 1;
    int B = -27;
    int C = 223;
    assertEquals(54, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case27() {
    int A = 2;
    int B = -40;
    int C = 229;
    assertEquals(39, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case28() {
    int A = 1;
    int B = -29;
    int C = 251;
    assertEquals(55, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case29() {
    int A = 2;
    int B = -44;
    int C = 271;
    assertEquals(40, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case30() {
    int A = 1;
    int B = -31;
    int C = 281;
    assertEquals(56, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case31() {
    int A = 6;
    int B = -78;
    int C = 283;
    assertEquals(36, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case32() {
    int A = 979;
    int B = 1617;
    int C = 61;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case33() {
    int A = 528;
    int B = -1452;
    int C = 5471;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case34() {
    int A = 7138;
    int B = -6688;
    int C = 3461;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case35() {
    int A = 3092;
    int B = -2046;
    int C = 6491;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case36() {
    int A = 1047;
    int B = 6501;
    int C = 6101;
    assertEquals(12, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case37() {
    int A = 9761;
    int B = -7483;
    int C = 2659;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case38() {
    int A = 5611;
    int B = 6477;
    int C = 193;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case39() {
    int A = 7856;
    int B = -7654;
    int C = 6451;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case40() {
    int A = 3533;
    int B = -2921;
    int C = 7069;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case41() {
    int A = 2298;
    int B = -5130;
    int C = 7121;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case42() {
    int A = 9820;
    int B = 680;
    int C = 8039;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case43() {
    int A = 2646;
    int B = 1428;
    int C = 1123;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case44() {
    int A = 525;
    int B = -3465;
    int C = 6883;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case45() {
    int A = 1115;
    int B = 4665;
    int C = 5897;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case46() {
    int A = 464;
    int B = -3304;
    int C = 6703;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case47() {
    int A = 2147;
    int B = -2059;
    int C = 2293;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case48() {
    int A = 164;
    int B = 654;
    int C = 7499;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case49() {
    int A = 2321;
    int B = -449;
    int C = 7867;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case50() {
    int A = 3851;
    int B = -2631;
    int C = 5351;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case51() {
    int A = 214;
    int B = 4484;
    int C = 353;
    assertEquals(14, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case52() {
    int A = 397;
    int B = 8169;
    int C = 6151;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case53() {
    int A = 1764;
    int B = -1974;
    int C = 2423;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case54() {
    int A = 5753;
    int B = 5765;
    int C = 6469;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case55() {
    int A = 157;
    int B = 537;
    int C = 8467;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case56() {
    int A = 3437;
    int B = -7161;
    int C = 7253;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case57() {
    int A = 730;
    int B = 1250;
    int C = 2897;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case58() {
    int A = 8664;
    int B = -4260;
    int C = 113;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case59() {
    int A = 744;
    int B = -1566;
    int C = 4703;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case60() {
    int A = 7818;
    int B = 852;
    int C = 4111;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case61() {
    int A = 2313;
    int B = -7443;
    int C = 7213;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case62() {
    int A = 6429;
    int B = 1461;
    int C = 1453;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case63() {
    int A = 1211;
    int B = -6605;
    int C = 8923;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case64() {
    int A = 3561;
    int B = -1155;
    int C = 3533;
    assertEquals(12, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case65() {
    int A = 914;
    int B = -1532;
    int C = 1471;
    assertEquals(12, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case66() {
    int A = 8143;
    int B = -9673;
    int C = 5231;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case67() {
    int A = 5795;
    int B = -6005;
    int C = 409;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case68() {
    int A = 857;
    int B = -751;
    int C = 8761;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case69() {
    int A = 148;
    int B = 1644;
    int C = 3877;
    assertEquals(16, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case70() {
    int A = 7880;
    int B = -8200;
    int C = 1627;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case71() {
    int A = 31;
    int B = 3935;
    int C = 8273;
    assertEquals(11, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case72() {
    int A = 10000;
    int B = 10000;
    int C = 10000;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case73() {
    int A = 10000;
    int B = -10000;
    int C = -10000;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case74() {
    int A = 10000;
    int B = 10000;
    int C = 9973;
    assertEquals(1, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case75() {
    int A = 10000;
    int B = -10000;
    int C = 9973;
    assertEquals(2, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case76() {
    int A = 1;
    int B = 0;
    int C = 0;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case77() {
    int A = 1;
    int B = -1;
    int C = 0;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case78() {
    int A = 1;
    int B = -1;
    int C = 1;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case79() {
    int A = 1;
    int B = -1;
    int C = 2;
    assertEquals(2, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case80() {
    int A = 1;
    int B = -1;
    int C = 3;
    assertEquals(3, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case81() {
    int A = 9921;
    int B = 2667;
    int C = 6029;
    assertEquals(20, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case82() {
    int A = 9684;
    int B = -2190;
    int C = 9437;
    assertEquals(24, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case83() {
    int A = 1;
    int B = -79;
    int C = 1601;
    assertEquals(80, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case84() {
    int A = 1;
    int B = -59;
    int C = 911;
    assertEquals(70, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case85() {
    int A = 1;
    int B = -61;
    int C = 971;
    assertEquals(71, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case86() {
    int A = 1;
    int B = -63;
    int C = 1033;
    assertEquals(72, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case87() {
    int A = 1;
    int B = -65;
    int C = 1097;
    assertEquals(73, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case88() {
    int A = 1;
    int B = -67;
    int C = 1163;
    assertEquals(74, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case89() {
    int A = 1;
    int B = -69;
    int C = 1231;
    assertEquals(75, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case90() {
    int A = 1;
    int B = -71;
    int C = 1301;
    assertEquals(76, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case91() {
    int A = 1;
    int B = -73;
    int C = 1373;
    assertEquals(77, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case92() {
    int A = 1;
    int B = -75;
    int C = 1447;
    assertEquals(78, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case93() {
    int A = 1;
    int B = -77;
    int C = 1523;
    assertEquals(79, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case94() {
    int A = 2;
    int B = -88;
    int C = 997;
    assertEquals(51, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case95() {
    int A = 6;
    int B = -162;
    int C = 1123;
    assertEquals(43, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case96() {
    int A = 9;
    int B = -471;
    int C = 6203;
    assertEquals(40, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case97() {
    int A = 6;
    int B = -342;
    int C = 4903;
    assertEquals(58, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case98() {
    int A = 4;
    int B = -158;
    int C = 1601;
    assertEquals(40, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case99() {
    int A = 2;
    int B = -112;
    int C = 1597;
    assertEquals(57, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case100() {
    int A = 1;
    int B = -1;
    int C = 41;
    assertEquals(41, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case101() {
    int A = 1;
    int B = 1;
    int C = -13;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case102() {
    int A = 1;
    int B = -1;
    int C = 0;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case103() {
    int A = 1;
    int B = 1;
    int C = 11;
    assertEquals(10, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case104() {
    int A = 1;
    int B = 1;
    int C = 2;
    assertEquals(1, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case105() {
    int A = 12;
    int B = 12;
    int C = -4;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case106() {
    int A = 10;
    int B = -9;
    int C = 0;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case107() {
    int A = 1;
    int B = 1;
    int C = 3;
    assertEquals(2, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case108() {
    int A = 1;
    int B = 1;
    int C = 1;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case109() {
    int A = 1;
    int B = -1;
    int C = 1;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case110() {
    int A = 1;
    int B = 1;
    int C = 4;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case111() {
    int A = 1;
    int B = -79;
    int C = 1601;
    assertEquals(80, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case112() {
    int A = 100;
    int B = 0;
    int C = 0;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case113() {
    int A = 2;
    int B = -2;
    int C = 1;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case114() {
    int A = 1;
    int B = 1;
    int C = 0;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case115() {
    int A = 1;
    int B = 0;
    int C = 1;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case116() {
    int A = 1;
    int B = -3;
    int C = 2;
    assertEquals(1, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case117() {
    int A = 1;
    int B = 0;
    int C = 4;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case118() {
    int A = 1;
    int B = 1;
    int C = 9;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case119() {
    int A = 1;
    int B = 1;
    int C = 12;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case120() {
    int A = 2;
    int B = 0;
    int C = 4;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case121() {
    int A = 9934;
    int B = 3456;
    int C = 234;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case122() {
    int A = 10000;
    int B = 9973;
    int C = 5673;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case123() {
    int A = 10000;
    int B = 10000;
    int C = 10000;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case124() {
    int A = 1;
    int B = -1;
    int C = 2;
    assertEquals(2, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case125() {
    int A = 10000;
    int B = 9971;
    int C = 5379;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case126() {
    int A = 3;
    int B = 0;
    int C = 4;
    assertEquals(0, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case127() {
    int A = 1007;
    int B = 0;
    int C = 2;
    assertEquals(2, primepolynom.reveal(A, B, C));
  }

  @Test
  public void case128() {
    int A = 1;
    int B = -2;
    int C = 2;
    assertEquals(1, primepolynom.reveal(A, B, C));
  }

}
