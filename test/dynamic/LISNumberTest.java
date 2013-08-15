package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class LISNumberTest {
  LISNumber lisnumber = new LISNumber();

  @Test
  public void case1() {
    int[] cardsnum = { 1, 1, 1 };
    int K = 2;
    assertEquals(4, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case2() {
    int[] cardsnum = { 2 };
    int K = 1;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case3() {
    int[] cardsnum = { 36, 36, 36, 36, 36 };
    int K = 36;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case4() {
    int[] cardsnum = { 3, 2, 11, 5, 7 };
    int K = 20;
    assertEquals(474640725, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case5() {
    int[] cardsnum = { 31, 4, 15, 9, 26, 5, 35, 8, 9, 7, 9, 32, 3, 8, 4, 6, 26 };
    int K = 58;
    assertEquals(12133719, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case6() {
    int[] cardsnum = { 27, 18, 28, 18, 28, 4, 5, 9, 4, 5, 23, 5, 36, 28, 7, 4, 7, 13, 5, 26, 6, 24, 9, 7, 7, 5, 7, 24, 7, 9, 36, 9, 9, 9, 5, 9 };
    int K = 116;
    assertEquals(516440918, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case7() {
    int[] cardsnum = { 1 };
    int K = 1;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case8() {
    int[] cardsnum = { 1 };
    int K = 2;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case9() {
    int[] cardsnum = { 36 };
    int K = 35;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case10() {
    int[] cardsnum = { 36 };
    int K = 36;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case11() {
    int[] cardsnum = { 36, 36 };
    int K = 36;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case12() {
    int[] cardsnum = { 36, 36 };
    int K = 50;
    assertEquals(844733697, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case13() {
    int[] cardsnum = { 36, 36 };
    int K = 72;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case14() {
    int[] cardsnum = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int K = 1;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case15() {
    int[] cardsnum = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int K = 2;
    assertEquals(719476223, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case16() {
    int[] cardsnum = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int K = 35;
    assertEquals(719476223, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case17() {
    int[] cardsnum = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int K = 36;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case18() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 35;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case19() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 36;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case20() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 37;
    assertEquals(325376233, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case21() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 40;
    assertEquals(434819765, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case22() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 100;
    assertEquals(913960027, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case23() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 199;
    assertEquals(895595539, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case24() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 301;
    assertEquals(75862305, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case25() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 450;
    assertEquals(408337909, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case26() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 603;
    assertEquals(837964853, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case27() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 701;
    assertEquals(879369484, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case28() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 890;
    assertEquals(760740831, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case29() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 1020;
    assertEquals(919208475, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case30() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 1111;
    assertEquals(455044173, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case31() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 1294;
    assertEquals(738987967, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case32() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 1295;
    assertEquals(325376233, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case33() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36 };
    int K = 1296;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case34() {
    int[] cardsnum = { 1, 9, 9, 2, 5, 7, 3, 1, 19 };
    int K = 53;
    assertEquals(423002411, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case35() {
    int[] cardsnum = { 2, 30, 9, 2, 2, 1, 4, 2, 5 };
    int K = 29;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case36() {
    int[] cardsnum = { 9, 6, 4, 4, 9, 4, 2 };
    int K = 37;
    assertEquals(262461, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case37() {
    int[] cardsnum = { 8, 1, 1, 15, 5, 9 };
    int K = 8;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case38() {
    int[] cardsnum = { 6, 7, 8, 2 };
    int K = 7;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case39() {
    int[] cardsnum = { 5, 1, 2, 8, 3, 35 };
    int K = 52;
    assertEquals(110722005, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case40() {
    int[] cardsnum = { 23, 6, 35, 6, 9 };
    int K = 11;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case41() {
    int[] cardsnum = { 5, 8, 14, 5, 8, 9 };
    int K = 1;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case42() {
    int[] cardsnum = { 1, 4, 7, 8, 7, 8, 7 };
    int K = 25;
    assertEquals(504608108, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case43() {
    int[] cardsnum = { 2, 8, 5, 9, 6, 5, 7, 4, 6 };
    int K = 1;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case44() {
    int[] cardsnum = { 8, 9, 8, 8, 9, 8, 4, 3, 4, 1 };
    int K = 36;
    assertEquals(954169340, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case45() {
    int[] cardsnum = { 8, 34, 9, 3, 8, 13, 7, 8 };
    int K = 22;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case46() {
    int[] cardsnum = { 28, 34, 28, 29, 32, 33, 30, 34, 31, 26, 26, 31, 34, 25, 35, 25, 32, 26, 35, 26, 36, 31, 28, 36, 30, 34, 27, 29, 31, 25, 35, 30, 25, 32 };
    int K = 1010;
    assertEquals(730067133, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case47() {
    int[] cardsnum = { 26, 36, 25, 30, 30, 36, 32, 29, 29, 27, 33, 30, 35, 32, 33, 29, 32, 27, 35, 28, 36, 35, 28, 33, 31, 35, 29, 30, 26, 34, 29, 25, 25, 35, 28, 36 };
    int K = 1023;
    assertEquals(875688565, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case48() {
    int[] cardsnum = { 31, 26, 31, 35, 35, 35, 34, 31, 29, 31, 28, 28, 27, 34, 31, 29, 36, 33, 34, 26, 28, 35, 25, 32, 34, 33, 28, 33, 25, 28, 32, 36, 30, 27 };
    int K = 995;
    assertEquals(517344082, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case49() {
    int[] cardsnum = { 35, 25, 26, 31, 36, 29, 28, 27, 30, 36, 27, 30, 32, 32, 29, 33, 35, 33, 35, 36, 25, 28, 34, 25, 32, 34, 27, 31, 36, 34, 35, 25, 29, 25, 33, 33 };
    int K = 1089;
    assertEquals(730809050, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case50() {
    int[] cardsnum = { 26, 27, 36, 36, 35, 29, 26, 30, 35, 30, 28, 27, 31, 34, 27, 25, 33, 35, 28, 33, 36, 29, 31, 25, 33, 29, 30, 26, 30, 30, 36, 31, 34, 26, 32, 32 };
    int K = 1002;
    assertEquals(153211567, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case51() {
    int[] cardsnum = { 30, 25, 34, 26, 26, 33, 31, 36, 29, 34, 33, 27, 27, 25, 25, 26, 34, 26, 25, 31, 32, 25, 31, 26, 33, 33, 27, 30, 32, 29, 30, 32 };
    int K = 911;
    assertEquals(927585368, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case52() {
    int[] cardsnum = { 29, 28, 30, 32, 35, 35, 30, 27, 32, 26, 33, 29, 28, 29, 28, 34, 28, 30, 29, 33, 29, 36, 34, 26, 36, 25, 32, 30, 28, 28, 27, 35, 28 };
    int K = 951;
    assertEquals(47891725, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case53() {
    int[] cardsnum = { 25, 36, 34, 28, 33, 33, 36, 29, 25, 32, 34, 32, 29, 36, 31, 25, 27, 32, 35, 36, 36, 29, 34, 30, 35, 31, 31, 26, 32, 32, 32, 25, 35, 29 };
    int K = 979;
    assertEquals(896969667, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case54() {
    int[] cardsnum = { 34, 32, 32, 30, 32, 34, 33, 31, 36, 34, 36, 28, 35, 27, 27, 33, 34, 30, 33, 26, 33, 33, 32, 25, 36, 28, 27, 34, 32, 31, 29, 27, 34 };
    int K = 1004;
    assertEquals(291266673, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case55() {
    int[] cardsnum = { 35, 36, 26, 31, 29, 33, 32, 30, 29, 32, 36, 33, 33, 29, 27, 36, 33, 33, 26, 30, 34, 30, 32, 25, 33, 31, 33, 31, 34, 36, 27, 33, 32, 29 };
    int K = 1044;
    assertEquals(830962532, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case56() {
    int[] cardsnum = { 29, 31, 27, 31, 28, 26, 33, 32, 33, 32, 35, 32, 25, 25, 28, 31, 35, 36, 25, 33, 28, 35, 25, 29, 34, 30, 25, 33, 29, 31, 25, 28, 32, 26, 32, 32 };
    int K = 1053;
    assertEquals(939635636, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case57() {
    int[] cardsnum = { 31, 28, 35, 35, 31, 26, 26, 26, 30, 27, 27, 27, 26, 29, 33, 27, 32, 31, 29, 29, 32, 29, 28, 34, 27, 26, 25, 26, 27, 29, 35, 31, 32, 31, 25 };
    int K = 1011;
    assertEquals(677167627, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case58() {
    int[] cardsnum = { 28, 25, 23, 19, 1, 33, 17, 18, 29, 30, 8, 35, 36, 27, 20, 9, 3, 11, 31, 8, 10, 31, 17, 28, 4, 33, 11, 4, 29, 28, 19, 1, 19, 21, 16, 29 };
    int K = 374;
    assertEquals(527963479, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case59() {
    int[] cardsnum = { 27, 3, 30, 23, 4, 10, 5, 17, 20, 24, 9, 18 };
    int K = 133;
    assertEquals(374088099, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case60() {
    int[] cardsnum = { 13, 10, 11, 7, 6, 32, 30, 5, 6, 16, 36, 25, 18, 30, 20, 17, 32, 4, 22 };
    int K = 4;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case61() {
    int[] cardsnum = { 10, 18, 22, 12, 31, 4, 11, 29, 27, 11, 23, 31, 11, 23, 5, 3, 15, 32, 10, 8, 14, 18, 14, 20, 7 };
    int K = 209;
    assertEquals(584411839, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case62() {
    int[] cardsnum = { 15, 17, 29, 32, 13, 14, 30, 31, 11, 36, 1, 33, 25, 27, 7, 29, 22, 7, 29, 29, 6, 13, 12, 24, 27, 30, 13, 33, 5, 21 };
    int K = 32;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case63() {
    int[] cardsnum = { 5, 34, 17, 23, 26, 22, 1, 23, 22, 10, 29, 4, 31, 8, 5, 23 };
    int K = 273;
    assertEquals(456032695, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case64() {
    int[] cardsnum = { 20, 15, 36, 17, 20, 17, 2 };
    int K = 95;
    assertEquals(842901551, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case65() {
    int[] cardsnum = { 18, 29, 22, 23, 11 };
    int K = 92;
    assertEquals(264914462, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case66() {
    int[] cardsnum = { 8, 14, 11, 10, 17, 11, 4, 3, 22, 29, 9, 1, 7, 11, 32, 12, 12, 1 };
    int K = 193;
    assertEquals(946863399, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case67() {
    int[] cardsnum = { 16, 32, 11, 1, 16, 29, 29, 6, 19 };
    int K = 125;
    assertEquals(305146898, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case68() {
    int[] cardsnum = { 22, 27, 22, 22, 32, 22, 10, 29, 21, 19, 17, 29, 34, 14, 22, 20, 19, 35, 22, 16, 2, 8, 23, 23, 21, 10, 28, 10, 35 };
    int K = 526;
    assertEquals(145381527, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case69() {
    int[] cardsnum = { 9, 29, 36, 8, 7, 26, 31 };
    int K = 36;
    assertEquals(373708720, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case70() {
    int[] cardsnum = { 5, 35, 19, 16, 4, 5, 23, 36, 10, 3, 18, 28, 7, 21, 27, 32, 14, 11, 36, 3 };
    int K = 149;
    assertEquals(883854400, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case71() {
    int[] cardsnum = { 22, 19, 21, 2, 7 };
    int K = 39;
    assertEquals(740639180, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case72() {
    int[] cardsnum = { 10 };
    int K = 8;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case73() {
    int[] cardsnum = { 3, 11, 23, 12, 7, 19, 3, 14, 29, 7 };
    int K = 25;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case74() {
    int[] cardsnum = { 29, 7, 33, 21, 28, 21, 21, 26, 27, 29, 3, 17, 18, 36, 23, 23, 2, 10 };
    int K = 340;
    assertEquals(690039, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case75() {
    int[] cardsnum = { 14, 12, 2, 9, 28, 33, 17, 13, 22, 18, 29, 10, 10 };
    int K = 199;
    assertEquals(333645981, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case76() {
    int[] cardsnum = { 20, 20, 22, 33, 20, 11, 5, 23, 23, 3, 3, 6, 12, 2, 15, 23, 5, 6, 25, 22, 1, 9, 5, 26, 11 };
    int K = 32;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case77() {
    int[] cardsnum = { 33, 6, 29, 12, 17, 12, 9, 31, 28, 21, 26, 28, 24, 11, 11, 2, 33, 27, 32, 14, 13, 1, 2, 4, 11, 17, 15, 35, 20, 12, 2, 31 };
    int K = 345;
    assertEquals(11369158, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case78() {
    int[] cardsnum = { 29, 11, 8, 31, 10, 14, 10, 20, 20, 30, 7, 24, 6, 14, 9, 1, 19, 17, 29, 16, 30, 6, 23, 10, 32, 33, 1, 10, 19, 2, 1, 20 };
    int K = 34;
    assertEquals(52653381, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case79() {
    int[] cardsnum = { 24, 31, 24, 6, 11, 1, 26, 32, 3, 11, 25, 15, 32, 24, 11, 27, 5, 29, 18, 14, 32, 23, 13, 5, 15, 10, 30, 19, 11, 23, 15 };
    int K = 27;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case80() {
    int[] cardsnum = { 11, 8, 33, 9, 13, 22, 28, 29, 25, 4 };
    int K = 31;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case81() {
    int[] cardsnum = { 21, 32, 30, 7, 11, 20, 2, 33, 20, 22, 20, 5 };
    int K = 66;
    assertEquals(771570564, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case82() {
    int[] cardsnum = { 6, 29, 31 };
    int K = 59;
    assertEquals(147629880, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case83() {
    int[] cardsnum = { 27, 18, 28, 18, 28, 4, 5, 9, 4, 5, 23, 5, 36, 28, 7, 4, 7, 13, 5, 26, 6, 24, 9, 7, 7, 5, 7, 24, 7, 9, 36, 9, 9, 9, 5, 9 };
    int K = 116;
    assertEquals(516440918, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case84() {
    int[] cardsnum = { 35, 23, 11, 28, 19, 8, 7, 30, 1, 35, 26, 2, 25, 7, 19, 14, 35, 36, 13, 18, 34, 8, 27, 34, 17, 24, 23, 35, 16, 18, 11, 33, 14, 28, 17, 13 };
    int K = 1288;
    assertEquals(0, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case85() {
    int[] cardsnum = { 30, 32, 31, 31, 34, 36, 30, 32, 32, 33, 30, 32, 32, 33, 35, 34, 32, 30, 34, 31, 35, 31, 35, 30, 35, 36, 34, 36, 36, 31, 32, 32, 31, 36, 31, 30 };
    int K = 1150;
    assertEquals(990031799, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case86() {
    int[] cardsnum = { 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1, 36, 1 };
    int K = 300;
    assertEquals(487356020, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case87() {
    int[] cardsnum = { 2, 2 };
    int K = 4;
    assertEquals(1, lisnumber.count(cardsnum, K));
  }

  @Test
  public void case88() {
    int[] cardsnum = { 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 35, 36, 36, 35, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 35, 36, 36 };
    int K = 36;
    assertEquals(46656, lisnumber.count(cardsnum, K));
  }

}
