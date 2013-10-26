package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TheCardLineDivTwoTest {
  TheCardLineDivTwo thecardlinedivtwo = new TheCardLineDivTwo();

  @Test
  public void case1() {
    String[] cards = { "KH", "QD", "KC" };
    assertEquals(2, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case2() {
    String[] cards = { "JS", "JC", "JD", "JH" };
    assertEquals(24, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case3() {
    String[] cards = { "2S", "3C", "4C", "5S", "6C", "7S", "8S", "9H" };
    assertEquals(0, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case4() {
    String[] cards = { "KD", "KC", "AD", "7C", "AH", "9C", "4H", "4S", "AS" };
    assertEquals(2416, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case5() {
    String[] cards = { "8S" };
    assertEquals(1, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case6() {
    String[] cards = { "2S", "TS", "QS", "TD", "7S" };
    assertEquals(12, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case7() {
    String[] cards = { "2D", "4S", "2S", "2H", "TC" };
    assertEquals(8, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case8() {
    String[] cards = { "7S", "9S", "JS", "JD", "TS", "2H", "6D", "2D" };
    assertEquals(72, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case9() {
    String[] cards = { "KS", "TS", "QC" };
    assertEquals(6, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case10() {
    String[] cards = { "6S", "5D", "5H", "7S", "TD", "KC", "3C", "3S", "8D", "5S" };
    assertEquals(2880, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case11() {
    String[] cards = { "3S", "KC", "AS", "7C", "TC", "9C", "4H", "4S", "2S" };
    assertEquals(10080, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case12() {
    String[] cards = { "KH", "JS", "KS", "2S", "3S", "TS", "2D", "8S", "2H", "4S", "TC" };
    assertEquals(89280, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case13() {
    String[] cards = { "6C", "9S", "QD" };
    assertEquals(0, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case14() {
    String[] cards = { "QD", "3S", "9S", "4C", "6H", "5S", "5C", "KD", "AD", "6S", "7S", "JS", "9D", "9C", "2H", "8S" };
    assertEquals(319334400, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case15() {
    String[] cards = { "5S", "7S", "3H", "TS", "2C", "2S", "6H", "KS", "AS", "4D", "8S" };
    assertEquals(0, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case16() {
    String[] cards = { "9H", "QS", "JH", "2S", "2D", "8H", "QH", "TS", "KS" };
    assertEquals(744, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case17() {
    String[] cards = { "AS", "8S", "3S", "5H", "2S", "9S", "QS", "4S", "QH", "8C", "TS", "8H", "9H", "2D", "6S", "8D" };
    assertEquals(191757869, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case18() {
    String[] cards = { "4S", "AD", "JS", "7S", "6S" };
    assertEquals(0, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case19() {
    String[] cards = { "TD", "AS", "8C", "2H", "9S", "QD", "6D", "AC", "QC", "4S", "QS", "2S", "3S", "2C", "JH", "6C" };
    assertEquals(296946989, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case20() {
    String[] cards = { "2S", "TC", "8D", "9D", "8S", "AH", "3S", "6S", "TS" };
    assertEquals(480, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case21() {
    String[] cards = { "TS", "9D", "AD", "2S", "6D", "2H", "KH", "JS", "TH", "8D", "7S", "JD", "6S", "7C", "2D", "5S" };
    assertEquals(508654080, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case22() {
    String[] cards = { "5S", "AS", "9S", "4D", "3H", "2S", "2D", "3D", "2H", "7C", "JD", "9C", "5D", "TS", "8S", "6C" };
    assertEquals(210470400, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case23() {
    String[] cards = { "TS", "6S", "AD", "KD", "4D", "9C", "TC", "3H", "2H", "9D", "5C", "5S", "4C", "2D", "7S", "8S" };
    assertEquals(133056000, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case24() {
    String[] cards = { "7S", "QC", "KD", "JH", "6S", "8S", "4D", "4S", "TD", "KH", "5S", "3S", "3C", "TS", "QH", "8C" };
    assertEquals(354170880, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case25() {
    String[] cards = { "JD", "6D", "JS", "QH", "QS", "KS", "TC", "3S", "9S", "3H", "4S", "7D", "JH", "7S", "AS", "2C" };
    assertEquals(785998080, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case26() {
    String[] cards = { "TS", "5S", "TC", "7C", "6S", "2C", "9S", "JS", "QS", "KC", "7S", "2S", "8S", "AS", "AC", "4S" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case27() {
    String[] cards = { "KC", "3S", "KS", "9S", "9C", "5C", "6S", "2S", "7C", "2C", "AS", "JS", "6C", "5S", "8S", "7S" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case28() {
    String[] cards = { "QS", "9S", "AS", "6S", "8S", "4C", "KS", "3S", "2S", "TS" };
    assertEquals(3628800, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case29() {
    String[] cards = { "5S", "AS", "6S", "8S", "QS", "KS", "7S", "JS", "9S", "2S", "4S", "AC" };
    assertEquals(479001600, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case30() {
    String[] cards = { "JC", "5S", "8S", "AC", "QS", "JS", "4S", "9S", "6S", "AS", "KS", "8C", "2S", "QC", "9C" };
    assertEquals(266971431, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case31() {
    String[] cards = { "9D", "8D", "QD", "7H", "9H", "4H", "3D", "TD", "KD", "JD", "AH", "4D", "7D", "5D", "KH", "6D" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case32() {
    String[] cards = { "7D", "8D", "JD", "3D", "TD", "KH", "4D", "AD", "7H", "6H", "2H", "KD", "9D", "3H", "6D", "5H" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case33() {
    String[] cards = { "9D", "5D", "TD", "AD", "7D", "AH", "8D", "3D", "6D", "7H", "QD", "3H", "2D", "KD" };
    assertEquals(758538830, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case34() {
    String[] cards = { "9C", "8C", "QC", "7D", "9D", "4D", "3C", "TC", "KC", "JC", "AD", "4C", "7C", "5C", "KD", "6C" };
    assertEquals(1178634240, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case35() {
    String[] cards = { "4C", "TC", "6D", "2D", "TD", "8C", "6C", "7D", "9C", "5C", "5D", "2C", "3D", "3C", "KC", "JC" };
    assertEquals(846115200, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case36() {
    String[] cards = { "3D", "JC", "9D", "8C", "QC", "TD", "2C", "QD", "3C", "4D", "KC", "9C", "KD", "7C", "JD", "TC" };
    assertEquals(791510400, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case37() {
    String[] cards = { "6C", "7C", "2C", "3C", "4C", "KD", "JC", "AD", "9C", "8C", "AC", "4D", "QC", "KC", "2D", "5C" };
    assertEquals(1066766938, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case38() {
    String[] cards = { "QD", "QH", "9H", "JD", "9S", "9D", "QS", "TH", "9C", "JS", "JC", "TS" };
    assertEquals(1298336, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case39() {
    String[] cards = { "JD", "TD", "9H", "9D", "9S", "QC", "9C", "JS", "TH", "JC" };
    assertEquals(17056, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case40() {
    String[] cards = { "JD", "QS", "TS", "QD", "JH", "9S", "9D" };
    assertEquals(68, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case41() {
    String[] cards = { "9C", "QS", "9S", "JH", "JS", "9D", "TS", "QD", "TH", "JD", "QC", "TD", "9H", "TC", "QH" };
    assertEquals(938204160, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case42() {
    String[] cards = { "9H", "QS", "9S", "TS", "9C" };
    assertEquals(36, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case43() {
    String[] cards = { "4D", "4S", "5H", "5S", "3H", "2D", "3D", "6C", "5C", "6S", "5D", "4H", "6D", "4C", "6H", "3S" };
    assertEquals(270010849, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case44() {
    String[] cards = { "4D", "5S", "6D", "9S", "8C", "9C", "TS", "9D", "6S", "6H", "8S", "7C", "TD", "4S", "4H", "5D" };
    assertEquals(102691373, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case45() {
    String[] cards = { "7H", "8D", "8S", "TS", "9H", "4S", "4D", "4C", "6C", "4H", "9C", "7D", "5D", "9S", "TD", "6S" };
    assertEquals(1055794176, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case46() {
    String[] cards = { "QH", "JS", "9D", "AD", "QC", "6C", "KS", "KC", "9S", "9C", "8S", "AS", "8H", "9H", "QS", "7S" };
    assertEquals(531831687, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case47() {
    String[] cards = { "TD", "QS", "6H", "7H", "KD", "9H", "TS", "QH", "9D", "8D", "6D", "AS", "8S", "9S", "TC", "JS" };
    assertEquals(695197440, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case48() {
    String[] cards = { "2S", "2C", "3S", "3C", "4S", "4C", "5S", "5C", "6S", "6C", "7S", "7C", "8S", "8C", "9S", "9C" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case49() {
    String[] cards = { "KD", "KC", "AD", "7C", "AH", "9C", "4H", "4S", "AS" };
    assertEquals(2416, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case50() {
    String[] cards = { "JD", "QD", "KD", "AD", "JS", "QS", "KS", "AS", "JH", "QH", "KH", "AH", "JC", "QC", "KC", "AC" };
    assertEquals(759168059, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case51() {
    String[] cards = { "2H", "3H", "4H", "5H", "6H", "7H", "9H", "8H", "TH", "JH", "AH", "KH", "QH" };
    assertEquals(54181345, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case52() {
    String[] cards = { "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "TH", "JH", "QH", "KH", "AH", "2D", "3D", "4D" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case53() {
    String[] cards = { "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "KS", "AC", "AD", "AH", "3D", "3H" };
    assertEquals(536739840, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case54() {
    String[] cards = { "AD", "AH", "AC", "AS", "2D", "2H", "2C", "2S", "3H", "3S", "3D", "3C", "4H", "4D", "4S", "4C" };
    assertEquals(759168059, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case55() {
    String[] cards = { "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "8H", "9H", "2H", "3H", "4H", "5H", "6H" };
    assertEquals(266971431, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case56() {
    String[] cards = { "AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "TH", "JH", "QH", "KH", "AD", "2D", "3D" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case57() {
    String[] cards = { "KD", "KC", "AD", "7C", "AH", "9C", "4H", "4S", "AS", "9H", "9S", "4C", "4D", "9D", "3D" };
    assertEquals(392089344, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case58() {
    String[] cards = { "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD", "AH", "2H", "3H" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case59() {
    String[] cards = { "2S", "2C", "2H", "2D", "3S", "3C", "3H", "3D", "4S", "4C", "4H", "4D", "5S", "5D", "5H", "5C" };
    assertEquals(759168059, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case60() {
    String[] cards = { "KD", "KC", "AD", "7C", "AH", "9C", "4H", "4S", "AS", "2C", "3C", "4C", "5D", "2D", "5S", "7S" };
    assertEquals(334628909, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case61() {
    String[] cards = { "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS", "AS" };
    assertEquals(54181345, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case62() {
    String[] cards = { "KD", "KC", "AD", "7C", "AH", "9C", "4H", "4S", "AS", "2S", "9S", "9D", "7H", "KS", "3H" };
    assertEquals(180149952, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case63() {
    String[] cards = { "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case64() {
    String[] cards = { "QS", "8C", "AC", "6C", "AS", "7S", "4H", "AH", "QC", "6D", "KS", "4S", "7D", "6H", "QD", "8D" };
    assertEquals(652092461, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case65() {
    String[] cards = { "TH", "6C", "QH", "6D", "JH", "7D", "6S", "6H", "KH", "4H", "9H", "4S", "7H", "8H", "7S", "4D" };
    assertEquals(345121730, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case66() {
    String[] cards = { "KD", "KC", "AD", "7C", "AH", "9C", "4H", "4S", "AS", "8C", "2D", "3C", "5S", "6D", "9S" };
    assertEquals(58492800, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case67() {
    String[] cards = { "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C" };
    assertEquals(131231789, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case68() {
    String[] cards = { "2S", "3S", "4S", "6S", "5S", "7S", "8S", "9S", "TS", "JS", "QS", "KS", "AS", "AC", "AD", "AH" };
    assertEquals(225355885, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case69() {
    String[] cards = { "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS", "AS", "2C", "3C", "4C" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case70() {
    String[] cards = { "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case71() {
    String[] cards = { "2S", "3D", "4H", "5S", "6C", "7D", "8H", "9H", "9S", "3H", "4D", "6D", "6S", "7S", "6H", "5H" };
    assertEquals(191757869, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case72() {
    String[] cards = { "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case73() {
    String[] cards = { "JS", "JC", "JD", "JH", "AH", "KH", "QH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "TH" };
    assertEquals(225355885, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case74() {
    String[] cards = { "2C", "3C", "4C", "5C", "6C", "7C", "8C", "2D", "3D", "4D", "5D", "7D", "8D", "9D", "TD", "JD" };
    assertEquals(791510400, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case75() {
    String[] cards = { "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "2H", "3H", "4H", "5H", "6H", "7H", "8H" };
    assertEquals(266971431, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case76() {
    String[] cards = { "2S", "2C", "2D", "2H", "3S", "3C", "3D", "3H", "4S", "4D", "4C", "4H", "5S", "5C", "5D", "7H" };
    assertEquals(529518260, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case77() {
    String[] cards = { "2S", "2C", "2H", "2D", "3S", "3C", "3H", "3D", "4S", "4C", "4H", "4D", "5S", "5C", "5H", "5D" };
    assertEquals(759168059, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case78() {
    String[] cards = { "KD", "KC", "AD", "7C", "AH", "9C", "4H", "4S", "AS", "2C", "2D", "3D", "4D", "5D", "7D", "8D" };
    assertEquals(334628909, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case79() {
    String[] cards = { "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "AC", "KC", "QC", "JC", "QH", "QD", "QS", "KS" };
    assertEquals(225355885, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case80() {
    String[] cards = { "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD", "AD", "2H", "3H", "4H" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case81() {
    String[] cards = { "KD", "KC", "7C", "AH", "9C", "4H", "4S", "AS", "4C", "QD", "QC", "QH", "AD", "JH", "JS" };
    assertEquals(180149952, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case82() {
    String[] cards = { "KD", "QC", "AD", "AH", "4H", "8D", "9C", "3D", "9S", "5S", "8S", "KC", "2S", "4D", "8H", "9H" };
    assertEquals(472780800, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case83() {
    String[] cards = { "2C", "2S", "2H", "2D", "3C", "3S", "3H", "3D", "4C", "4S", "4H", "4D", "5C", "5S", "5H", "5D" };
    assertEquals(759168059, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case84() {
    String[] cards = { "7S", "7D", "7C", "9S", "9D", "9H" };
    assertEquals(80, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case85() {
    String[] cards = { "2S", "2C", "2H", "2D", "AS", "AC", "AH", "AD", "KS", "KC", "KH", "KD", "9S", "9C", "9H", "9D" };
    assertEquals(759168059, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case86() {
    String[] cards = { "2S", "3C", "4C", "5S", "6C", "7S", "8S", "9H", "TS", "TD", "TC", "TH", "QS", "QH", "QD" };
    assertEquals(195390720, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case87() {
    String[] cards = { "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD", "AD", "2C", "3C", "4C" };
    assertEquals(938056763, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case88() {
    String[] cards = { "KD", "KC", "AD", "7C", "AH", "9C", "4H", "4S", "AS", "KH", "KS", "2H", "2S", "2D", "2C", "3H" };
    assertEquals(1178061101, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case89() {
    String[] cards = { "JS", "2S", "3S", "4S", "7S", "8S", "5S", "9S", "TS", "2C", "3C", "4C", "5C", "6C", "7C", "8C" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case90() {
    String[] cards = { "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS", "AS", "3C", "5C", "4C" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case91() {
    String[] cards = { "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "KS", "QS", "AS", "2C", "3C", "4C" };
    assertEquals(567839223, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case92() {
    String[] cards = { "KH", "QD", "KC", "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS" };
    assertEquals(670122577, thecardlinedivtwo.count(cards));
  }

  @Test
  public void case93() {
    String[] cards = { "KS", "KC", "KD", "KH", "QS", "QD", "QC", "QH", "9S", "9C", "8H", "8S", "8C", "8D", "AS", "AD" };
    assertEquals(1143663495, thecardlinedivtwo.count(cards));
  }

}
