package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class FavouriteDigitsTest {
  FavouriteDigits favouritedigits = new FavouriteDigits();

  @Test
  public void case1() {
    long N = 47L;
    int digit1 = 1;
    int count1 = 0;
    int digit2 = 2;
    int count2 = 0;
    assertEquals(47L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case2() {
    long N = 47L;
    int digit1 = 5;
    int count1 = 0;
    int digit2 = 9;
    int count2 = 1;
    assertEquals(49L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case3() {
    long N = 47L;
    int digit1 = 5;
    int count1 = 0;
    int digit2 = 3;
    int count2 = 1;
    assertEquals(53L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case4() {
    long N = 47L;
    int digit1 = 2;
    int count1 = 1;
    int digit2 = 0;
    int count2 = 2;
    assertEquals(200L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case5() {
    long N = 47L;
    int digit1 = 5;
    int count1 = 1;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(50L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case6() {
    long N = 123456789012345L;
    int digit1 = 1;
    int count1 = 2;
    int digit2 = 2;
    int count2 = 4;
    assertEquals(123456789012422L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case7() {
    long N = 729999999999947L;
    int digit1 = 0;
    int count1 = 0;
    int digit2 = 3;
    int count2 = 2;
    assertEquals(730000000000003L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case8() {
    long N = 47L;
    int digit1 = 4;
    int count1 = 8;
    int digit2 = 7;
    int count2 = 7;
    assertEquals(444444447777777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case9() {
    long N = 777L;
    int digit1 = 4;
    int count1 = 15;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(444444444444444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case10() {
    long N = 777L;
    int digit1 = 7;
    int count1 = 14;
    int digit2 = 0;
    int count2 = 1;
    assertEquals(707777777777777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case11() {
    long N = 777L;
    int digit1 = 7;
    int count1 = 14;
    int digit2 = 8;
    int count2 = 1;
    assertEquals(777777777777778L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case12() {
    long N = 777L;
    int digit1 = 7;
    int count1 = 8;
    int digit2 = 4;
    int count2 = 7;
    assertEquals(444444477777777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case13() {
    long N = 701234568901234L;
    int digit1 = 6;
    int count1 = 14;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(766666666666666L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case14() {
    long N = 701234568901234L;
    int digit1 = 6;
    int count1 = 15;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(1666666666666666L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case15() {
    long N = 474747470000001L;
    int digit1 = 4;
    int count1 = 3;
    int digit2 = 7;
    int count2 = 2;
    assertEquals(474747470000001L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case16() {
    long N = 434744725433512L;
    int digit1 = 4;
    int count1 = 8;
    int digit2 = 7;
    int count2 = 5;
    assertEquals(434744727444477L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case17() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 1;
    int digit2 = 1;
    int count2 = 0;
    assertEquals(10L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case18() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 15;
    int digit2 = 1;
    int count2 = 0;
    assertEquals(1000000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case19() {
    long N = 497L;
    int digit1 = 0;
    int count1 = 2;
    int digit2 = 5;
    int count2 = 1;
    assertEquals(500L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case20() {
    long N = 547L;
    int digit1 = 0;
    int count1 = 2;
    int digit2 = 5;
    int count2 = 1;
    assertEquals(1005L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case21() {
    long N = 3L;
    int digit1 = 3;
    int count1 = 1;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(3L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case22() {
    long N = 3L;
    int digit1 = 4;
    int count1 = 1;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(4L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case23() {
    long N = 3L;
    int digit1 = 2;
    int count1 = 1;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(12L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case24() {
    long N = 701234568901234L;
    int digit1 = 6;
    int count1 = 14;
    int digit2 = 5;
    int count2 = 1;
    assertEquals(1566666666666666L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case25() {
    long N = 701234568901234L;
    int digit1 = 6;
    int count1 = 14;
    int digit2 = 1;
    int count2 = 1;
    assertEquals(1066666666666666L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case26() {
    long N = 92L;
    int digit1 = 1;
    int count1 = 1;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(100L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case27() {
    long N = 992L;
    int digit1 = 1;
    int count1 = 2;
    int digit2 = 2;
    int count2 = 1;
    assertEquals(1012L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case28() {
    long N = 654923L;
    int digit1 = 2;
    int count1 = 10;
    int digit2 = 0;
    int count2 = 2;
    assertEquals(200222222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case29() {
    long N = 227739003L;
    int digit1 = 6;
    int count1 = 11;
    int digit2 = 9;
    int count2 = 1;
    assertEquals(666666666669L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case30() {
    long N = 996483325718L;
    int digit1 = 4;
    int count1 = 0;
    int digit2 = 0;
    int count2 = 1;
    assertEquals(996483325720L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case31() {
    long N = 5065495L;
    int digit1 = 6;
    int count1 = 0;
    int digit2 = 0;
    int count2 = 6;
    assertEquals(6000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case32() {
    long N = 699L;
    int digit1 = 5;
    int count1 = 6;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(555555L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case33() {
    long N = 731957744920478L;
    int digit1 = 9;
    int count1 = 4;
    int digit2 = 3;
    int count2 = 1;
    assertEquals(731957744920499L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case34() {
    long N = 3306L;
    int digit1 = 1;
    int count1 = 1;
    int digit2 = 8;
    int count2 = 11;
    assertEquals(188888888888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case35() {
    long N = 3718248575L;
    int digit1 = 1;
    int count1 = 1;
    int digit2 = 8;
    int count2 = 4;
    assertEquals(3718248588L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case36() {
    long N = 516838036L;
    int digit1 = 3;
    int count1 = 2;
    int digit2 = 7;
    int count2 = 0;
    assertEquals(516838036L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case37() {
    long N = 7L;
    int digit1 = 4;
    int count1 = 1;
    int digit2 = 2;
    int count2 = 3;
    assertEquals(2224L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case38() {
    long N = 848607L;
    int digit1 = 3;
    int count1 = 1;
    int digit2 = 0;
    int count2 = 2;
    assertEquals(849003L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case39() {
    long N = 254546402115955L;
    int digit1 = 4;
    int count1 = 10;
    int digit2 = 6;
    int count2 = 1;
    assertEquals(254546404444444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case40() {
    long N = 61L;
    int digit1 = 4;
    int count1 = 0;
    int digit2 = 2;
    int count2 = 1;
    assertEquals(62L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case41() {
    long N = 3591862108116L;
    int digit1 = 3;
    int count1 = 0;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(3591862108116L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case42() {
    long N = 2005034L;
    int digit1 = 1;
    int count1 = 7;
    int digit2 = 7;
    int count2 = 1;
    assertEquals(11111117L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case43() {
    long N = 91636980094L;
    int digit1 = 0;
    int count1 = 3;
    int digit2 = 6;
    int count2 = 1;
    assertEquals(91636980100L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case44() {
    long N = 30778434502L;
    int digit1 = 3;
    int count1 = 4;
    int digit2 = 2;
    int count2 = 4;
    assertEquals(30782222333L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case45() {
    long N = 430634311752445L;
    int digit1 = 1;
    int count1 = 8;
    int digit2 = 8;
    int count2 = 0;
    assertEquals(430634411111111L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case46() {
    long N = 2331035333284L;
    int digit1 = 7;
    int count1 = 1;
    int digit2 = 5;
    int count2 = 3;
    assertEquals(2331035333557L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case47() {
    long N = 72874L;
    int digit1 = 3;
    int count1 = 7;
    int digit2 = 0;
    int count2 = 1;
    assertEquals(30333333L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case48() {
    long N = 26L;
    int digit1 = 0;
    int count1 = 3;
    int digit2 = 2;
    int count2 = 7;
    assertEquals(2000222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case49() {
    long N = 315675L;
    int digit1 = 0;
    int count1 = 1;
    int digit2 = 3;
    int count2 = 0;
    assertEquals(315680L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case50() {
    long N = 89826L;
    int digit1 = 0;
    int count1 = 11;
    int digit2 = 9;
    int count2 = 1;
    assertEquals(900000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case51() {
    long N = 599683752901925L;
    int digit1 = 0;
    int count1 = 0;
    int digit2 = 7;
    int count2 = 6;
    assertEquals(599683752977777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case52() {
    long N = 799L;
    int digit1 = 8;
    int count1 = 0;
    int digit2 = 7;
    int count2 = 1;
    assertEquals(799L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case53() {
    long N = 6455L;
    int digit1 = 1;
    int count1 = 3;
    int digit2 = 5;
    int count2 = 3;
    assertEquals(111555L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case54() {
    long N = 5L;
    int digit1 = 3;
    int count1 = 13;
    int digit2 = 9;
    int count2 = 0;
    assertEquals(3333333333333L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case55() {
    long N = 2515618178L;
    int digit1 = 2;
    int count1 = 7;
    int digit2 = 9;
    int count2 = 5;
    assertEquals(222222299999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case56() {
    long N = 417144712673L;
    int digit1 = 2;
    int count1 = 1;
    int digit2 = 5;
    int count2 = 7;
    assertEquals(417152555555L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case57() {
    long N = 3115256799L;
    int digit1 = 2;
    int count1 = 12;
    int digit2 = 1;
    int count2 = 0;
    assertEquals(222222222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case58() {
    long N = 981487L;
    int digit1 = 5;
    int count1 = 6;
    int digit2 = 2;
    int count2 = 1;
    assertEquals(2555555L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case59() {
    long N = 4562177184794L;
    int digit1 = 9;
    int count1 = 6;
    int digit2 = 6;
    int count2 = 6;
    assertEquals(4666666999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case60() {
    long N = 862L;
    int digit1 = 4;
    int count1 = 6;
    int digit2 = 0;
    int count2 = 7;
    assertEquals(4000000044444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case61() {
    long N = 47590889088L;
    int digit1 = 9;
    int count1 = 5;
    int digit2 = 7;
    int count2 = 5;
    assertEquals(47777799999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case62() {
    long N = 4557L;
    int digit1 = 0;
    int count1 = 1;
    int digit2 = 1;
    int count2 = 2;
    assertEquals(5011L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case63() {
    long N = 331056261798635L;
    int digit1 = 0;
    int count1 = 5;
    int digit2 = 4;
    int count2 = 3;
    assertEquals(331056264000044L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case64() {
    long N = 6L;
    int digit1 = 7;
    int count1 = 9;
    int digit2 = 3;
    int count2 = 2;
    assertEquals(33777777777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case65() {
    long N = 58238L;
    int digit1 = 0;
    int count1 = 2;
    int digit2 = 8;
    int count2 = 9;
    assertEquals(80088888888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case66() {
    long N = 107585L;
    int digit1 = 5;
    int count1 = 0;
    int digit2 = 7;
    int count2 = 10;
    assertEquals(7777777777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case67() {
    long N = 464581114983L;
    int digit1 = 0;
    int count1 = 5;
    int digit2 = 3;
    int count2 = 1;
    assertEquals(464581300000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case68() {
    long N = 55387L;
    int digit1 = 1;
    int count1 = 6;
    int digit2 = 4;
    int count2 = 6;
    assertEquals(111111444444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case69() {
    long N = 384103915492L;
    int digit1 = 5;
    int count1 = 5;
    int digit2 = 1;
    int count2 = 4;
    assertEquals(384111155555L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case70() {
    long N = 30813298248472L;
    int digit1 = 6;
    int count1 = 3;
    int digit2 = 5;
    int count2 = 2;
    assertEquals(30813298255666L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case71() {
    long N = 15L;
    int digit1 = 6;
    int count1 = 0;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(15L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case72() {
    long N = 539530074332695L;
    int digit1 = 9;
    int count1 = 3;
    int digit2 = 5;
    int count2 = 8;
    assertEquals(539530095555559L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case73() {
    long N = 2035614449522L;
    int digit1 = 0;
    int count1 = 3;
    int digit2 = 7;
    int count2 = 0;
    assertEquals(2035614449600L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case74() {
    long N = 7214L;
    int digit1 = 6;
    int count1 = 0;
    int digit2 = 0;
    int count2 = 13;
    assertEquals(10000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case75() {
    long N = 61L;
    int digit1 = 9;
    int count1 = 12;
    int digit2 = 6;
    int count2 = 3;
    assertEquals(666999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case76() {
    long N = 199297L;
    int digit1 = 7;
    int count1 = 2;
    int digit2 = 3;
    int count2 = 1;
    assertEquals(199377L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case77() {
    long N = 92L;
    int digit1 = 1;
    int count1 = 0;
    int digit2 = 2;
    int count2 = 2;
    assertEquals(122L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case78() {
    long N = 1788875131L;
    int digit1 = 1;
    int count1 = 0;
    int digit2 = 8;
    int count2 = 3;
    assertEquals(1788875131L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case79() {
    long N = 958L;
    int digit1 = 7;
    int count1 = 6;
    int digit2 = 9;
    int count2 = 2;
    assertEquals(77777799L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case80() {
    long N = 28453608033L;
    int digit1 = 3;
    int count1 = 1;
    int digit2 = 2;
    int count2 = 0;
    assertEquals(28453608033L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case81() {
    long N = 119243210122753L;
    int digit1 = 5;
    int count1 = 0;
    int digit2 = 4;
    int count2 = 3;
    assertEquals(119243210122844L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case82() {
    long N = 31L;
    int digit1 = 1;
    int count1 = 0;
    int digit2 = 5;
    int count2 = 1;
    assertEquals(35L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case83() {
    long N = 79L;
    int digit1 = 6;
    int count1 = 5;
    int digit2 = 4;
    int count2 = 3;
    assertEquals(44466666L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case84() {
    long N = 733L;
    int digit1 = 4;
    int count1 = 3;
    int digit2 = 0;
    int count2 = 7;
    assertEquals(4000000044L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case85() {
    long N = 4L;
    int digit1 = 9;
    int count1 = 0;
    int digit2 = 0;
    int count2 = 2;
    assertEquals(100L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case86() {
    long N = 5566267949L;
    int digit1 = 1;
    int count1 = 3;
    int digit2 = 4;
    int count2 = 0;
    assertEquals(5566268111L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case87() {
    long N = 864404636234L;
    int digit1 = 2;
    int count1 = 13;
    int digit2 = 9;
    int count2 = 0;
    assertEquals(2222222222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case88() {
    long N = 6245226L;
    int digit1 = 4;
    int count1 = 0;
    int digit2 = 8;
    int count2 = 0;
    assertEquals(6245226L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case89() {
    long N = 3L;
    int digit1 = 5;
    int count1 = 0;
    int digit2 = 1;
    int count2 = 0;
    assertEquals(3L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case90() {
    long N = 853763137L;
    int digit1 = 9;
    int count1 = 10;
    int digit2 = 6;
    int count2 = 3;
    assertEquals(6669999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case91() {
    long N = 124565313525384L;
    int digit1 = 3;
    int count1 = 2;
    int digit2 = 0;
    int count2 = 9;
    assertEquals(124600000000033L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case92() {
    long N = 4134954849229L;
    int digit1 = 2;
    int count1 = 6;
    int digit2 = 3;
    int count2 = 0;
    assertEquals(4134955222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case93() {
    long N = 1962407043L;
    int digit1 = 8;
    int count1 = 11;
    int digit2 = 0;
    int count2 = 1;
    assertEquals(808888888888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case94() {
    long N = 620681L;
    int digit1 = 9;
    int count1 = 0;
    int digit2 = 4;
    int count2 = 3;
    assertEquals(621444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case95() {
    long N = 282L;
    int digit1 = 9;
    int count1 = 3;
    int digit2 = 0;
    int count2 = 3;
    assertEquals(900099L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case96() {
    long N = 3008402L;
    int digit1 = 8;
    int count1 = 2;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(3008408L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case97() {
    long N = 86354037283377L;
    int digit1 = 3;
    int count1 = 5;
    int digit2 = 7;
    int count2 = 3;
    assertEquals(86354037303377L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case98() {
    long N = 929302L;
    int digit1 = 0;
    int count1 = 10;
    int digit2 = 1;
    int count2 = 2;
    assertEquals(100000000001L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case99() {
    long N = 9567586730587L;
    int digit1 = 7;
    int count1 = 3;
    int digit2 = 2;
    int count2 = 7;
    assertEquals(9567722222227L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case100() {
    long N = 39888232658L;
    int digit1 = 7;
    int count1 = 0;
    int digit2 = 5;
    int count2 = 0;
    assertEquals(39888232658L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case101() {
    long N = 6809956L;
    int digit1 = 0;
    int count1 = 4;
    int digit2 = 2;
    int count2 = 3;
    assertEquals(10000222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case102() {
    long N = 8184038L;
    int digit1 = 4;
    int count1 = 12;
    int digit2 = 2;
    int count2 = 0;
    assertEquals(444444444444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case103() {
    long N = 3143275326265L;
    int digit1 = 8;
    int count1 = 2;
    int digit2 = 0;
    int count2 = 12;
    assertEquals(80000000000008L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case104() {
    long N = 50561460L;
    int digit1 = 2;
    int count1 = 8;
    int digit2 = 4;
    int count2 = 3;
    assertEquals(22222222444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case105() {
    long N = 5616661715L;
    int digit1 = 8;
    int count1 = 0;
    int digit2 = 5;
    int count2 = 1;
    assertEquals(5616661715L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case106() {
    long N = 438336226630705L;
    int digit1 = 0;
    int count1 = 1;
    int digit2 = 9;
    int count2 = 4;
    assertEquals(438336226690999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case107() {
    long N = 6118L;
    int digit1 = 0;
    int count1 = 2;
    int digit2 = 6;
    int count2 = 2;
    assertEquals(6600L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case108() {
    long N = 802998516595L;
    int digit1 = 6;
    int count1 = 12;
    int digit2 = 0;
    int count2 = 1;
    assertEquals(6066666666666L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case109() {
    long N = 8324053L;
    int digit1 = 4;
    int count1 = 3;
    int digit2 = 3;
    int count2 = 11;
    assertEquals(33333333333444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case110() {
    long N = 69619706734L;
    int digit1 = 4;
    int count1 = 15;
    int digit2 = 1;
    int count2 = 0;
    assertEquals(444444444444444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case111() {
    long N = 3253L;
    int digit1 = 8;
    int count1 = 6;
    int digit2 = 7;
    int count2 = 0;
    assertEquals(888888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case112() {
    long N = 23L;
    int digit1 = 9;
    int count1 = 5;
    int digit2 = 4;
    int count2 = 0;
    assertEquals(99999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case113() {
    long N = 657L;
    int digit1 = 4;
    int count1 = 6;
    int digit2 = 2;
    int count2 = 2;
    assertEquals(22444444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case114() {
    long N = 6333L;
    int digit1 = 4;
    int count1 = 0;
    int digit2 = 6;
    int count2 = 11;
    assertEquals(66666666666L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case115() {
    long N = 45143111L;
    int digit1 = 0;
    int count1 = 2;
    int digit2 = 2;
    int count2 = 6;
    assertEquals(100222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case116() {
    long N = 3271L;
    int digit1 = 0;
    int count1 = 0;
    int digit2 = 8;
    int count2 = 6;
    assertEquals(888888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case117() {
    long N = 96239010815L;
    int digit1 = 0;
    int count1 = 6;
    int digit2 = 3;
    int count2 = 8;
    assertEquals(30000003333333L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case118() {
    long N = 58147471674488L;
    int digit1 = 1;
    int count1 = 7;
    int digit2 = 8;
    int count2 = 5;
    assertEquals(58148111111888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case119() {
    long N = 19644574824L;
    int digit1 = 3;
    int count1 = 1;
    int digit2 = 7;
    int count2 = 1;
    assertEquals(19644574830L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case120() {
    long N = 5L;
    int digit1 = 4;
    int count1 = 0;
    int digit2 = 9;
    int count2 = 4;
    assertEquals(9999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case121() {
    long N = 603960L;
    int digit1 = 2;
    int count1 = 2;
    int digit2 = 0;
    int count2 = 10;
    assertEquals(200000000002L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case122() {
    long N = 46451113560115L;
    int digit1 = 0;
    int count1 = 5;
    int digit2 = 8;
    int count2 = 5;
    assertEquals(46458000008888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case123() {
    long N = 991L;
    int digit1 = 7;
    int count1 = 13;
    int digit2 = 0;
    int count2 = 2;
    assertEquals(700777777777777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case124() {
    long N = 7665L;
    int digit1 = 1;
    int count1 = 10;
    int digit2 = 7;
    int count2 = 2;
    assertEquals(111111111177L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case125() {
    long N = 58221L;
    int digit1 = 9;
    int count1 = 10;
    int digit2 = 2;
    int count2 = 2;
    assertEquals(229999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case126() {
    long N = 555041L;
    int digit1 = 5;
    int count1 = 0;
    int digit2 = 4;
    int count2 = 0;
    assertEquals(555041L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case127() {
    long N = 372786714L;
    int digit1 = 5;
    int count1 = 2;
    int digit2 = 4;
    int count2 = 7;
    assertEquals(444444455L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case128() {
    long N = 999999999999999L;
    int digit1 = 0;
    int count1 = 14;
    int digit2 = 9;
    int count2 = 1;
    assertEquals(1000000000000009L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case129() {
    long N = 999999999999999L;
    int digit1 = 1;
    int count1 = 1;
    int digit2 = 9;
    int count2 = 14;
    assertEquals(1099999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case130() {
    long N = 999999999999999L;
    int digit1 = 8;
    int count1 = 5;
    int digit2 = 9;
    int count2 = 10;
    assertEquals(1888889999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case131() {
    long N = 999999999999999L;
    int digit1 = 9;
    int count1 = 10;
    int digit2 = 5;
    int count2 = 5;
    assertEquals(1555559999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case132() {
    long N = 452129873217234L;
    int digit1 = 8;
    int count1 = 9;
    int digit2 = 2;
    int count2 = 6;
    assertEquals(822222288888888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case133() {
    long N = 974094882455171L;
    int digit1 = 0;
    int count1 = 14;
    int digit2 = 9;
    int count2 = 1;
    assertEquals(1000000000000009L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case134() {
    long N = 123456789012345L;
    int digit1 = 9;
    int count1 = 8;
    int digit2 = 2;
    int count2 = 4;
    assertEquals(123492229999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case135() {
    long N = 1L;
    int digit1 = 9;
    int count1 = 14;
    int digit2 = 8;
    int count2 = 1;
    assertEquals(899999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case136() {
    long N = 23L;
    int digit1 = 9;
    int count1 = 8;
    int digit2 = 8;
    int count2 = 7;
    assertEquals(888888899999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case137() {
    long N = 999999999999L;
    int digit1 = 4;
    int count1 = 7;
    int digit2 = 7;
    int count2 = 7;
    assertEquals(44444447777777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case138() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 0;
    int digit2 = 9;
    int count2 = 15;
    assertEquals(999999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case139() {
    long N = 1L;
    int digit1 = 7;
    int count1 = 7;
    int digit2 = 0;
    int count2 = 8;
    assertEquals(700000000777777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case140() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 1;
    int digit2 = 9;
    int count2 = 12;
    assertEquals(9099999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case141() {
    long N = 1L;
    int digit1 = 1;
    int count1 = 15;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(111111111111111L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case142() {
    long N = 1L;
    int digit1 = 9;
    int count1 = 9;
    int digit2 = 8;
    int count2 = 6;
    assertEquals(888888999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case143() {
    long N = 35535327435555L;
    int digit1 = 5;
    int count1 = 7;
    int digit2 = 3;
    int count2 = 7;
    assertEquals(35535333335555L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case144() {
    long N = 1L;
    int digit1 = 9;
    int count1 = 14;
    int digit2 = 2;
    int count2 = 1;
    assertEquals(299999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case145() {
    long N = 1L;
    int digit1 = 1;
    int count1 = 7;
    int digit2 = 2;
    int count2 = 8;
    assertEquals(111111122222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case146() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 14;
    int digit2 = 1;
    int count2 = 1;
    assertEquals(100000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case147() {
    long N = 100000000000001L;
    int digit1 = 0;
    int count1 = 14;
    int digit2 = 9;
    int count2 = 1;
    assertEquals(900000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case148() {
    long N = 1L;
    int digit1 = 9;
    int count1 = 7;
    int digit2 = 0;
    int count2 = 1;
    assertEquals(90999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case149() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 15;
    int digit2 = 2;
    int count2 = 0;
    assertEquals(1000000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case150() {
    long N = 1L;
    int digit1 = 9;
    int count1 = 15;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(999999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case151() {
    long N = 1L;
    int digit1 = 9;
    int count1 = 7;
    int digit2 = 8;
    int count2 = 8;
    assertEquals(888888889999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case152() {
    long N = 100L;
    int digit1 = 2;
    int count1 = 0;
    int digit2 = 0;
    int count2 = 3;
    assertEquals(1000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case153() {
    long N = 999999999999999L;
    int digit1 = 9;
    int count1 = 14;
    int digit2 = 8;
    int count2 = 1;
    assertEquals(1899999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case154() {
    long N = 100000000000000L;
    int digit1 = 9;
    int count1 = 7;
    int digit2 = 8;
    int count2 = 6;
    assertEquals(108888889999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case155() {
    long N = 1L;
    int digit1 = 8;
    int count1 = 7;
    int digit2 = 9;
    int count2 = 8;
    assertEquals(888888899999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case156() {
    long N = 100000000000000L;
    int digit1 = 9;
    int count1 = 14;
    int digit2 = 0;
    int count2 = 1;
    assertEquals(909999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case157() {
    long N = 3426234634563L;
    int digit1 = 3;
    int count1 = 8;
    int digit2 = 9;
    int count2 = 3;
    assertEquals(3429333333399L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case158() {
    long N = 1L;
    int digit1 = 1;
    int count1 = 10;
    int digit2 = 2;
    int count2 = 4;
    assertEquals(11111111112222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case159() {
    long N = 1L;
    int digit1 = 1;
    int count1 = 6;
    int digit2 = 2;
    int count2 = 6;
    assertEquals(111111222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case160() {
    long N = 123456789L;
    int digit1 = 1;
    int count1 = 3;
    int digit2 = 2;
    int count2 = 10;
    assertEquals(1112222222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case161() {
    long N = 5L;
    int digit1 = 2;
    int count1 = 3;
    int digit2 = 0;
    int count2 = 5;
    assertEquals(20000022L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case162() {
    long N = 1L;
    int digit1 = 1;
    int count1 = 0;
    int digit2 = 9;
    int count2 = 14;
    assertEquals(99999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case163() {
    long N = 12345678901234L;
    int digit1 = 9;
    int count1 = 7;
    int digit2 = 8;
    int count2 = 6;
    assertEquals(18888889999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case164() {
    long N = 10L;
    int digit1 = 9;
    int count1 = 10;
    int digit2 = 8;
    int count2 = 3;
    assertEquals(8889999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case165() {
    long N = 999L;
    int digit1 = 0;
    int count1 = 15;
    int digit2 = 1;
    int count2 = 0;
    assertEquals(1000000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case166() {
    long N = 55L;
    int digit1 = 7;
    int count1 = 1;
    int digit2 = 6;
    int count2 = 1;
    assertEquals(67L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case167() {
    long N = 999999999999999L;
    int digit1 = 8;
    int count1 = 14;
    int digit2 = 9;
    int count2 = 1;
    assertEquals(1888888888888889L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case168() {
    long N = 100000000000000L;
    int digit1 = 0;
    int count1 = 15;
    int digit2 = 1;
    int count2 = 0;
    assertEquals(1000000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case169() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 5;
    int digit2 = 2;
    int count2 = 4;
    assertEquals(200000222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case170() {
    long N = 2L;
    int digit1 = 9;
    int count1 = 15;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(999999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case171() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 2;
    int digit2 = 5;
    int count2 = 0;
    assertEquals(100L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case172() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 15;
    int digit2 = 3;
    int count2 = 0;
    assertEquals(1000000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case173() {
    long N = 999999999999999L;
    int digit1 = 2;
    int count1 = 6;
    int digit2 = 1;
    int count2 = 5;
    assertEquals(1000001111222222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case174() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 2;
    int digit2 = 3;
    int count2 = 0;
    assertEquals(100L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case175() {
    long N = 999L;
    int digit1 = 0;
    int count1 = 2;
    int digit2 = 1;
    int count2 = 0;
    assertEquals(1000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case176() {
    long N = 1118L;
    int digit1 = 1;
    int count1 = 3;
    int digit2 = 7;
    int count2 = 1;
    assertEquals(1171L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case177() {
    long N = 74L;
    int digit1 = 3;
    int count1 = 2;
    int digit2 = 0;
    int count2 = 2;
    assertEquals(3003L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case178() {
    long N = 1580247635L;
    int digit1 = 1;
    int count1 = 4;
    int digit2 = 0;
    int count2 = 6;
    assertEquals(10000000111L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case179() {
    long N = 7777777777L;
    int digit1 = 5;
    int count1 = 5;
    int digit2 = 0;
    int count2 = 5;
    assertEquals(10000055555L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case180() {
    long N = 2L;
    int digit1 = 0;
    int count1 = 10;
    int digit2 = 2;
    int count2 = 5;
    assertEquals(200000000002222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case181() {
    long N = 999999999999999L;
    int digit1 = 1;
    int count1 = 7;
    int digit2 = 9;
    int count2 = 8;
    assertEquals(1011111199999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case182() {
    long N = 50L;
    int digit1 = 0;
    int count1 = 15;
    int digit2 = 9;
    int count2 = 0;
    assertEquals(1000000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case183() {
    long N = 975L;
    int digit1 = 4;
    int count1 = 1;
    int digit2 = 7;
    int count2 = 1;
    assertEquals(1047L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case184() {
    long N = 281L;
    int digit1 = 3;
    int count1 = 4;
    int digit2 = 0;
    int count2 = 3;
    assertEquals(3000333L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case185() {
    long N = 888888888888888L;
    int digit1 = 0;
    int count1 = 7;
    int digit2 = 9;
    int count2 = 8;
    assertEquals(900000009999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case186() {
    long N = 275L;
    int digit1 = 9;
    int count1 = 7;
    int digit2 = 0;
    int count2 = 5;
    assertEquals(900000999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case187() {
    long N = 1L;
    int digit1 = 1;
    int count1 = 0;
    int digit2 = 0;
    int count2 = 0;
    assertEquals(1L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case188() {
    long N = 999999999999999L;
    int digit1 = 1;
    int count1 = 1;
    int digit2 = 0;
    int count2 = 14;
    assertEquals(1000000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case189() {
    long N = 20000000000000L;
    int digit1 = 1;
    int count1 = 7;
    int digit2 = 9;
    int count2 = 7;
    assertEquals(91111111999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case190() {
    long N = 50L;
    int digit1 = 0;
    int count1 = 5;
    int digit2 = 9;
    int count2 = 5;
    assertEquals(9000009999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case191() {
    long N = 1L;
    int digit1 = 2;
    int count1 = 0;
    int digit2 = 0;
    int count2 = 2;
    assertEquals(100L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case192() {
    long N = 987987987987987L;
    int digit1 = 0;
    int count1 = 0;
    int digit2 = 8;
    int count2 = 15;
    assertEquals(1888888888888888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case193() {
    long N = 1L;
    int digit1 = 8;
    int count1 = 1;
    int digit2 = 9;
    int count2 = 14;
    assertEquals(899999999999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case194() {
    long N = 275L;
    int digit1 = 9;
    int count1 = 3;
    int digit2 = 0;
    int count2 = 3;
    assertEquals(900099L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case195() {
    long N = 123423L;
    int digit1 = 3;
    int count1 = 2;
    int digit2 = 2;
    int count2 = 3;
    assertEquals(132223L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case196() {
    long N = 9L;
    int digit1 = 1;
    int count1 = 1;
    int digit2 = 2;
    int count2 = 4;
    assertEquals(12222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case197() {
    long N = 999999999999999L;
    int digit1 = 4;
    int count1 = 5;
    int digit2 = 7;
    int count2 = 5;
    assertEquals(1000004444477777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case198() {
    long N = 1L;
    int digit1 = 6;
    int count1 = 10;
    int digit2 = 8;
    int count2 = 5;
    assertEquals(666666666688888L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case199() {
    long N = 555770L;
    int digit1 = 5;
    int count1 = 1;
    int digit2 = 7;
    int count2 = 4;
    assertEquals(557777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case200() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 5;
    int digit2 = 2;
    int count2 = 5;
    assertEquals(2000002222L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case201() {
    long N = 1L;
    int digit1 = 0;
    int count1 = 8;
    int digit2 = 9;
    int count2 = 7;
    assertEquals(900000000999999L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case202() {
    long N = 99999L;
    int digit1 = 5;
    int count1 = 2;
    int digit2 = 6;
    int count2 = 2;
    assertEquals(105566L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case203() {
    long N = 65L;
    int digit1 = 4;
    int count1 = 8;
    int digit2 = 0;
    int count2 = 7;
    assertEquals(400000004444444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case204() {
    long N = 12L;
    int digit1 = 4;
    int count1 = 5;
    int digit2 = 0;
    int count2 = 8;
    assertEquals(4000000004444L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case205() {
    long N = 98L;
    int digit1 = 1;
    int count1 = 2;
    int digit2 = 3;
    int count2 = 0;
    assertEquals(101L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case206() {
    long N = 27L;
    int digit1 = 0;
    int count1 = 2;
    int digit2 = 9;
    int count2 = 0;
    assertEquals(100L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case207() {
    long N = 1L;
    int digit1 = 6;
    int count1 = 5;
    int digit2 = 7;
    int count2 = 4;
    assertEquals(666667777L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

  @Test
  public void case208() {
    long N = 999999999999999L;
    int digit1 = 1;
    int count1 = 1;
    int digit2 = 0;
    int count2 = 1;
    assertEquals(1000000000000000L, favouritedigits.findNext(N, digit1, count1, digit2, count2));
  }

}
