package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MegaFactorialDiv2Test {
  MegaFactorialDiv2 megafactorialdiv2 = new MegaFactorialDiv2();

  @Test
  public void case1() {
    int N = 3;
    int K = 1;
    assertEquals(4, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case2() {
    int N = 3;
    int K = 2;
    assertEquals(6, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case3() {
    int N = 4;
    int K = 2;
    assertEquals(18, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case4() {
    int N = 6;
    int K = 3;
    assertEquals(1392, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case5() {
    int N = 100;
    int K = 2;
    assertEquals(321266186, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case6() {
    int N = 1000;
    int K = 100;
    assertEquals(563680238, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case7() {
    int N = 1000;
    int K = 99;
    assertEquals(120360682, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case8() {
    int N = 999;
    int K = 100;
    assertEquals(229950717, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case9() {
    int N = 1000;
    int K = 1;
    assertEquals(791569763, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case10() {
    int N = 123;
    int K = 5;
    assertEquals(711693974, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case11() {
    int N = 16;
    int K = 8;
    assertEquals(665824235, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case12() {
    int N = 1;
    int K = 100;
    assertEquals(1, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case13() {
    int N = 2;
    int K = 100;
    assertEquals(2, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case14() {
    int N = 6;
    int K = 100;
    assertEquals(504967422, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case15() {
    int N = 77;
    int K = 11;
    assertEquals(61095262, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case16() {
    int N = 776;
    int K = 100;
    assertEquals(507387576, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case17() {
    int N = 34;
    int K = 69;
    assertEquals(867486552, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case18() {
    int N = 333;
    int K = 92;
    assertEquals(904299389, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case19() {
    int N = 600;
    int K = 50;
    assertEquals(606324195, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case20() {
    int N = 716;
    int K = 2;
    assertEquals(357035145, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case21() {
    int N = 26;
    int K = 96;
    assertEquals(901034209, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case22() {
    int N = 12;
    int K = 51;
    assertEquals(958733909, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case23() {
    int N = 559;
    int K = 83;
    assertEquals(541310848, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case24() {
    int N = 874;
    int K = 10;
    assertEquals(510549782, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case25() {
    int N = 991;
    int K = 60;
    assertEquals(204007016, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case26() {
    int N = 300;
    int K = 5;
    assertEquals(253539462, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case27() {
    int N = 256;
    int K = 2;
    assertEquals(872280411, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case28() {
    int N = 256;
    int K = 88;
    assertEquals(812667610, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case29() {
    int N = 121;
    int K = 37;
    assertEquals(760361028, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case30() {
    int N = 137;
    int K = 42;
    assertEquals(530106839, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case31() {
    int N = 991;
    int K = 64;
    assertEquals(370517844, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case32() {
    int N = 803;
    int K = 36;
    assertEquals(32916280, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case33() {
    int N = 601;
    int K = 92;
    assertEquals(993771158, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case34() {
    int N = 601;
    int K = 93;
    assertEquals(497645458, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case35() {
    int N = 99;
    int K = 86;
    assertEquals(897269756, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case36() {
    int N = 25;
    int K = 65;
    assertEquals(543318752, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case37() {
    int N = 625;
    int K = 84;
    assertEquals(183947240, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case38() {
    int N = 237;
    int K = 85;
    assertEquals(653821265, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case39() {
    int N = 2;
    int K = 2;
    assertEquals(2, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case40() {
    int N = 1;
    int K = 5;
    assertEquals(1, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case41() {
    int N = 1;
    int K = 1;
    assertEquals(1, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case42() {
    int N = 997;
    int K = 3;
    assertEquals(583304361, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case43() {
    int N = 983;
    int K = 43;
    assertEquals(860959367, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case44() {
    int N = 100;
    int K = 100;
    assertEquals(799296769, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case45() {
    int N = 1000;
    int K = 95;
    assertEquals(206248228, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case46() {
    int N = 999;
    int K = 99;
    assertEquals(435472594, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case47() {
    int N = 555;
    int K = 79;
    assertEquals(217580815, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case48() {
    int N = 999;
    int K = 3;
    assertEquals(831168277, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case49() {
    int N = 1000;
    int K = 10;
    assertEquals(999691632, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case50() {
    int N = 10;
    int K = 5;
    assertEquals(954492407, megafactorialdiv2.countDivisors(N, K));
  }

  @Test
  public void case51() {
    int N = 10;
    int K = 1;
    assertEquals(270, megafactorialdiv2.countDivisors(N, K));
  }

}
