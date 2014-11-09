package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class EmoticonsDiv2Test {
  EmoticonsDiv2 emoticonsdiv2 = new EmoticonsDiv2();

  @Test
  public void case1() {
    int smiles = 2;
    assertEquals(2, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case2() {
    int smiles = 6;
    assertEquals(5, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case3() {
    int smiles = 11;
    assertEquals(11, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case4() {
    int smiles = 16;
    assertEquals(8, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case5() {
    int smiles = 1000;
    assertEquals(21, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case6() {
    int smiles = 3;
    assertEquals(3, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case7() {
    int smiles = 4;
    assertEquals(4, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case8() {
    int smiles = 5;
    assertEquals(5, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case9() {
    int smiles = 7;
    assertEquals(7, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case10() {
    int smiles = 8;
    assertEquals(6, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case11() {
    int smiles = 9;
    assertEquals(6, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case12() {
    int smiles = 11;
    assertEquals(11, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case13() {
    int smiles = 12;
    assertEquals(7, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case14() {
    int smiles = 13;
    assertEquals(13, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case15() {
    int smiles = 99;
    assertEquals(17, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case16() {
    int smiles = 14;
    assertEquals(9, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case17() {
    int smiles = 15;
    assertEquals(8, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case18() {
    int smiles = 17;
    assertEquals(17, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case19() {
    int smiles = 21;
    assertEquals(10, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case20() {
    int smiles = 24;
    assertEquals(9, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case21() {
    int smiles = 29;
    assertEquals(29, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case22() {
    int smiles = 31;
    assertEquals(31, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case23() {
    int smiles = 32;
    assertEquals(10, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case24() {
    int smiles = 33;
    assertEquals(14, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case25() {
    int smiles = 87;
    assertEquals(32, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case26() {
    int smiles = 93;
    assertEquals(34, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case27() {
    int smiles = 101;
    assertEquals(101, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case28() {
    int smiles = 123;
    assertEquals(44, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case29() {
    int smiles = 321;
    assertEquals(110, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case30() {
    int smiles = 254;
    assertEquals(129, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case31() {
    int smiles = 255;
    assertEquals(25, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case32() {
    int smiles = 256;
    assertEquals(16, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case33() {
    int smiles = 257;
    assertEquals(257, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case34() {
    int smiles = 300;
    assertEquals(17, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case35() {
    int smiles = 343;
    assertEquals(21, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case36() {
    int smiles = 400;
    assertEquals(18, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case37() {
    int smiles = 500;
    assertEquals(19, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case38() {
    int smiles = 601;
    assertEquals(601, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case39() {
    int smiles = 699;
    assertEquals(236, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case40() {
    int smiles = 765;
    assertEquals(28, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case41() {
    int smiles = 897;
    assertEquals(39, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case42() {
    int smiles = 893;
    assertEquals(66, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case43() {
    int smiles = 901;
    assertEquals(70, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case44() {
    int smiles = 989;
    assertEquals(66, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case45() {
    int smiles = 990;
    assertEquals(24, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case46() {
    int smiles = 991;
    assertEquals(991, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case47() {
    int smiles = 992;
    assertEquals(41, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case48() {
    int smiles = 993;
    assertEquals(334, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case49() {
    int smiles = 994;
    assertEquals(80, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case50() {
    int smiles = 995;
    assertEquals(204, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case51() {
    int smiles = 996;
    assertEquals(90, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case52() {
    int smiles = 997;
    assertEquals(997, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case53() {
    int smiles = 998;
    assertEquals(501, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case54() {
    int smiles = 999;
    assertEquals(46, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case55() {
    int smiles = 971;
    assertEquals(971, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case56() {
    int smiles = 125;
    assertEquals(15, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case57() {
    int smiles = 955;
    assertEquals(196, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case58() {
    int smiles = 53;
    assertEquals(53, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case59() {
    int smiles = 49;
    assertEquals(14, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case60() {
    int smiles = 333;
    assertEquals(43, emoticonsdiv2.printSmiles(smiles));
  }

  @Test
  public void case61() {
    int smiles = 37;
    assertEquals(37, emoticonsdiv2.printSmiles(smiles));
  }

}
