package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class TheNumberGameDiv2Test {
  TheNumberGameDiv2 thenumbergamediv2 = new TheNumberGameDiv2();

  @Test
  public void case1() {
    int A = 25;
    int B = 5;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case2() {
    int A = 334;
    int B = 12;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case3() {
    int A = 5162;
    int B = 16;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case4() {
    int A = 9798147;
    int B = 79817;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case5() {
    int A = 218181918;
    int B = 9181;
    assertEquals(6, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case6() {
    int A = 999999999;
    int B = 9;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case7() {
    int A = 123456789;
    int B = 9;
    assertEquals(9, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case8() {
    int A = 123456789;
    int B = 23;
    assertEquals(9, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case9() {
    int A = 123456789;
    int B = 12;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case10() {
    int A = 123456789;
    int B = 78;
    assertEquals(9, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case11() {
    int A = 123456789;
    int B = 87;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case12() {
    int A = 882878;
    int B = 28615366;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case13() {
    int A = 1;
    int B = 2;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case14() {
    int A = 123456789;
    int B = 13;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case15() {
    int A = 134134134;
    int B = 413;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case16() {
    int A = 134134134;
    int B = 134;
    assertEquals(6, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case17() {
    int A = 134134134;
    int B = 431;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case18() {
    int A = 134534135;
    int B = 53;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case19() {
    int A = 761252168;
    int B = 216;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case20() {
    int A = 761252168;
    int B = 612;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case21() {
    int A = 84;
    int B = 48;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case22() {
    int A = 123456789;
    int B = 987654321;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case23() {
    int A = 123412345;
    int B = 12345;
    assertEquals(6, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case24() {
    int A = 776412345;
    int B = 51251562;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case25() {
    int A = 484782191;
    int B = 47819;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case26() {
    int A = 484782191;
    int B = 478219;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case27() {
    int A = 95282784;
    int B = 5282784;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case28() {
    int A = 686192526;
    int B = 6192526;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case29() {
    int A = 686192526;
    int B = 8619252;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case30() {
    int A = 68619252;
    int B = 2;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case31() {
    int A = 93;
    int B = 391;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case32() {
    int A = 393;
    int B = 933;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case33() {
    int A = 821894;
    int B = 21848;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case34() {
    int A = 999999999;
    int B = 9999;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case35() {
    int A = 999999999;
    int B = 888888;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case36() {
    int A = 912865215;
    int B = 68219;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case37() {
    int A = 257125126;
    int B = 12512;
    assertEquals(6, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case38() {
    int A = 4823;
    int B = 32;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case39() {
    int A = 817345219;
    int B = 73418;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case40() {
    int A = 172433512;
    int B = 335;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case41() {
    int A = 257181752;
    int B = 25718;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case42() {
    int A = 257181752;
    int B = 81752;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case43() {
    int A = 212131213;
    int B = 213;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case44() {
    int A = 27878738;
    int B = 78;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case45() {
    int A = 131;
    int B = 13;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case46() {
    int A = 13131;
    int B = 31;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case47() {
    int A = 2;
    int B = 1;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case48() {
    int A = 994;
    int B = 4994;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case49() {
    int A = 99944;
    int B = 4994;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case50() {
    int A = 499994;
    int B = 49994;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case51() {
    int A = 9999999;
    int B = 2345;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case52() {
    int A = 131649612;
    int B = 16;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case53() {
    int A = 123432;
    int B = 23;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case54() {
    int A = 999919999;
    int B = 91;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case55() {
    int A = 417838715;
    int B = 178;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case56() {
    int A = 218181918;
    int B = 819;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case57() {
    int A = 15162;
    int B = 51;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case58() {
    int A = 23;
    int B = 32;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case59() {
    int A = 51312;
    int B = 31;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case60() {
    int A = 12345678;
    int B = 123;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case61() {
    int A = 456;
    int B = 7;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case62() {
    int A = 153;
    int B = 1;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case63() {
    int A = 777721277;
    int B = 212;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case64() {
    int A = 111;
    int B = 1;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case65() {
    int A = 21212;
    int B = 12;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case66() {
    int A = 12345;
    int B = 54321;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case67() {
    int A = 1234;
    int B = 123;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case68() {
    int A = 33433;
    int B = 34;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case69() {
    int A = 23117;
    int B = 11;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case70() {
    int A = 999989999;
    int B = 89;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case71() {
    int A = 213176;
    int B = 131;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case72() {
    int A = 12345432;
    int B = 234;
    assertEquals(6, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case73() {
    int A = 123432;
    int B = 432;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case74() {
    int A = 123;
    int B = 321;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case75() {
    int A = 56;
    int B = 65;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case76() {
    int A = 1234;
    int B = 4321;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case77() {
    int A = 12552;
    int B = 25;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case78() {
    int A = 18;
    int B = 81;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case79() {
    int A = 21613;
    int B = 161;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case80() {
    int A = 431613;
    int B = 16;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case81() {
    int A = 2587;
    int B = 25;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case82() {
    int A = 2134;
    int B = 213;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case83() {
    int A = 123451;
    int B = 1;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case84() {
    int A = 432189;
    int B = 1234;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case85() {
    int A = 43212345;
    int B = 234;
    assertEquals(6, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case86() {
    int A = 333;
    int B = 3;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case87() {
    int A = 1234123;
    int B = 321;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case88() {
    int A = 123;
    int B = 12;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case89() {
    int A = 111123321;
    int B = 123;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case90() {
    int A = 3213312;
    int B = 12;
    assertEquals(6, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case91() {
    int A = 12;
    int B = 21;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case92() {
    int A = 234656234;
    int B = 656;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case93() {
    int A = 25555555;
    int B = 55;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case94() {
    int A = 12321;
    int B = 321;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case95() {
    int A = 253;
    int B = 25;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case96() {
    int A = 483278188;
    int B = 4;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case97() {
    int A = 125162354;
    int B = 2;
    assertEquals(9, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case98() {
    int A = 12345;
    int B = 345;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case99() {
    int A = 31;
    int B = 3;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case100() {
    int A = 211;
    int B = 1;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case101() {
    int A = 989989;
    int B = 989;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case102() {
    int A = 2552;
    int B = 55;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case103() {
    int A = 4554;
    int B = 55;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case104() {
    int A = 129;
    int B = 921;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case105() {
    int A = 161;
    int B = 16;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case106() {
    int A = 161;
    int B = 61;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case107() {
    int A = 423482417;
    int B = 24;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case108() {
    int A = 252;
    int B = 5;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case109() {
    int A = 52;
    int B = 5;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case110() {
    int A = 214748364;
    int B = 21;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case111() {
    int A = 11125777;
    int B = 25;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case112() {
    int A = 227;
    int B = 22;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case113() {
    int A = 1;
    int B = 12;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case114() {
    int A = 123;
    int B = 32;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case115() {
    int A = 7314;
    int B = 73;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case116() {
    int A = 222222;
    int B = 222;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case117() {
    int A = 21881;
    int B = 18;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case118() {
    int A = 12345;
    int B = 21;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case119() {
    int A = 111121213;
    int B = 121;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case120() {
    int A = 664254311;
    int B = 8;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case121() {
    int A = 5;
    int B = 25;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case122() {
    int A = 512215;
    int B = 21;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case123() {
    int A = 16161;
    int B = 616;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case124() {
    int A = 23161;
    int B = 16;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case125() {
    int A = 1323155;
    int B = 231;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case126() {
    int A = 1234567;
    int B = 123;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case127() {
    int A = 121;
    int B = 2;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case128() {
    int A = 777777777;
    int B = 77;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case129() {
    int A = 2134431;
    int B = 134;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case130() {
    int A = 171717;
    int B = 17;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case131() {
    int A = 21615;
    int B = 216;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case132() {
    int A = 19268;
    int B = 291;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case133() {
    int A = 888888888;
    int B = 8;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case134() {
    int A = 2553;
    int B = 55;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case135() {
    int A = 12345;
    int B = 123;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case136() {
    int A = 1252;
    int B = 25;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case137() {
    int A = 312;
    int B = 12;
    assertEquals(3, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case138() {
    int A = 331213;
    int B = 121;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case139() {
    int A = 333;
    int B = 33;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case140() {
    int A = 523;
    int B = 5;
    assertEquals(2, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case141() {
    int A = 221;
    int B = 22;
    assertEquals(1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case142() {
    int A = 1234567;
    int B = 345;
    assertEquals(6, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case143() {
    int A = 164561234;
    int B = 16;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case144() {
    int A = 129999999;
    int B = 21;
    assertEquals(8, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case145() {
    int A = 2161523;
    int B = 216;
    assertEquals(4, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case146() {
    int A = 123;
    int B = 4321;
    assertEquals(-1, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case147() {
    int A = 3213212;
    int B = 3212;
    assertEquals(5, thenumbergamediv2.minimumMoves(A, B));
  }

  @Test
  public void case148() {
    int A = 123123512;
    int B = 12;
    assertEquals(7, thenumbergamediv2.minimumMoves(A, B));
  }

}
