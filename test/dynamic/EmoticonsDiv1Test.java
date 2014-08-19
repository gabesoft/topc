package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class EmoticonsDiv1Test {
  EmoticonsDiv1 emoticonsdiv1 = new EmoticonsDiv1();

  @Test
  public void case1() {
    int smiles = 2;
    assertEquals(2, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case2() {
    int smiles = 4;
    assertEquals(4, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case3() {
    int smiles = 6;
    assertEquals(5, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case4() {
    int smiles = 18;
    assertEquals(8, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case5() {
    int smiles = 3;
    assertEquals(3, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case6() {
    int smiles = 5;
    assertEquals(5, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case7() {
    int smiles = 7;
    assertEquals(7, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case8() {
    int smiles = 8;
    assertEquals(6, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case9() {
    int smiles = 9;
    assertEquals(6, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case10() {
    int smiles = 10;
    assertEquals(7, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case11() {
    int smiles = 20;
    assertEquals(9, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case12() {
    int smiles = 30;
    assertEquals(10, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case13() {
    int smiles = 32;
    assertEquals(10, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case14() {
    int smiles = 35;
    assertEquals(11, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case15() {
    int smiles = 41;
    assertEquals(13, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case16() {
    int smiles = 47;
    assertEquals(12, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case17() {
    int smiles = 53;
    assertEquals(12, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case18() {
    int smiles = 55;
    assertEquals(13, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case19() {
    int smiles = 65;
    assertEquals(14, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case20() {
    int smiles = 67;
    assertEquals(14, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case21() {
    int smiles = 70;
    assertEquals(13, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case22() {
    int smiles = 81;
    assertEquals(12, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case23() {
    int smiles = 99;
    assertEquals(14, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case24() {
    int smiles = 100;
    assertEquals(14, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case25() {
    int smiles = 255;
    assertEquals(17, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case26() {
    int smiles = 321;
    assertEquals(17, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case27() {
    int smiles = 345;
    assertEquals(18, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case28() {
    int smiles = 768;
    assertEquals(19, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case29() {
    int smiles = 564;
    assertEquals(19, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case30() {
    int smiles = 890;
    assertEquals(21, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case31() {
    int smiles = 990;
    assertEquals(21, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case32() {
    int smiles = 991;
    assertEquals(22, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case33() {
    int smiles = 992;
    assertEquals(21, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case34() {
    int smiles = 993;
    assertEquals(23, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case35() {
    int smiles = 994;
    assertEquals(22, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case36() {
    int smiles = 995;
    assertEquals(22, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case37() {
    int smiles = 996;
    assertEquals(22, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case38() {
    int smiles = 997;
    assertEquals(23, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case39() {
    int smiles = 998;
    assertEquals(22, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case40() {
    int smiles = 999;
    assertEquals(22, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case41() {
    int smiles = 1000;
    assertEquals(21, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case42() {
    int smiles = 977;
    assertEquals(24, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case43() {
    int smiles = 901;
    assertEquals(24, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case44() {
    int smiles = 11;
    assertEquals(8, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case45() {
    int smiles = 961;
    assertEquals(22, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case46() {
    int smiles = 508;
    assertEquals(19, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case47() {
    int smiles = 959;
    assertEquals(21, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case48() {
    int smiles = 968;
    assertEquals(20, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case49() {
    int smiles = 22;
    assertEquals(10, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case50() {
    int smiles = 512;
    assertEquals(18, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case51() {
    int smiles = 123;
    assertEquals(16, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case52() {
    int smiles = 513;
    assertEquals(19, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case53() {
    int smiles = 817;
    assertEquals(23, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case54() {
    int smiles = 729;
    assertEquals(18, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case55() {
    int smiles = 111;
    assertEquals(16, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case56() {
    int smiles = 833;
    assertEquals(22, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case57() {
    int smiles = 847;
    assertEquals(21, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case58() {
    int smiles = 33;
    assertEquals(11, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case59() {
    int smiles = 509;
    assertEquals(20, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case60() {
    int smiles = 34;
    assertEquals(11, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case61() {
    int smiles = 506;
    assertEquals(20, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case62() {
    int smiles = 124;
    assertEquals(15, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case63() {
    int smiles = 501;
    assertEquals(20, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case64() {
    int smiles = 510;
    assertEquals(19, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case65() {
    int smiles = 26;
    assertEquals(10, emoticonsdiv1.printSmiles(smiles));
  }

  @Test
  public void case66() {
    int smiles = 127;
    assertEquals(15, emoticonsdiv1.printSmiles(smiles));
  }

}
