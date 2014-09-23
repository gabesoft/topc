package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class BlackAndWhiteSolitaireTest {
  BlackAndWhiteSolitaire blackandwhitesolitaire = new BlackAndWhiteSolitaire();

  @Test
  public void case1() {
    String cardFront = "BBBW";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case2() {
    String cardFront = "WBWBW";
    assertEquals(0, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case3() {
    String cardFront = "WWWWWWWWW";
    assertEquals(4, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case4() {
    String cardFront = "BBWBWWBWBWWBBBWBWBWBBWBBW";
    assertEquals(10, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case5() {
    String cardFront = "BBW";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case6() {
    String cardFront = "BWWW";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case7() {
    String cardFront = "WBWWB";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case8() {
    String cardFront = "BWBWBW";
    assertEquals(0, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case9() {
    String cardFront = "WBBWBWB";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case10() {
    String cardFront = "WBWWWWBB";
    assertEquals(3, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case11() {
    String cardFront = "WBWBWBBWB";
    assertEquals(3, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case12() {
    String cardFront = "BBWWWWWWBW";
    assertEquals(4, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case13() {
    String cardFront = "WBWBWWBWBBW";
    assertEquals(4, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case14() {
    String cardFront = "WWBBBWWBBWWW";
    assertEquals(5, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case15() {
    String cardFront = "WWBWWWWWWBWWW";
    assertEquals(6, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case16() {
    String cardFront = "BWWWBWBBBWBBBB";
    assertEquals(4, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case17() {
    String cardFront = "WBBWWWBWBBWWBWB";
    assertEquals(5, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case18() {
    String cardFront = "WBBBBBWBWBBBWWWB";
    assertEquals(4, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case19() {
    String cardFront = "WBWBWBBBWWBBBWWWB";
    assertEquals(7, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case20() {
    String cardFront = "BWBBBBBWBBBBBWBWWB";
    assertEquals(6, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case21() {
    String cardFront = "WBBBWWWWWWWBWBWWBWW";
    assertEquals(7, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case22() {
    String cardFront = "WWBWWWWBWWBWWWWBBBBW";
    assertEquals(9, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case23() {
    String cardFront = "WWWWBBWBWBWWBWWWWBBWB";
    assertEquals(10, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case24() {
    String cardFront = "WBBWWBWBWWBBBBBBWBBBBW";
    assertEquals(9, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case25() {
    String cardFront = "BWWBBWWWWBWWWWBWWWBBBWB";
    assertEquals(9, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case26() {
    String cardFront = "WBWWBWWBBBBWBWWBBBWWWWBB";
    assertEquals(12, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case27() {
    String cardFront = "WBBWWWBBBBWBBWWWBWBBWWWBW";
    assertEquals(12, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case28() {
    String cardFront = "WWBBBWBWBBBBWBWBWBWBWBBBBB";
    assertEquals(10, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case29() {
    String cardFront = "BBWBWBWBBWBWBBWBBBWBWBBWWBB";
    assertEquals(10, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case30() {
    String cardFront = "BBWWWWWBWBBBBWBWWBBBBBBWBWWB";
    assertEquals(14, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case31() {
    String cardFront = "WBBWWWBBBBBWWBWBWWWWBWWWBBWBW";
    assertEquals(13, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case32() {
    String cardFront = "BWWBWBWBBWBWBWWWBWWBBBWBBBWWWB";
    assertEquals(14, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case33() {
    String cardFront = "WWBBBBBWBWWBWWWWWBBWWBWBWWWBBBW";
    assertEquals(13, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case34() {
    String cardFront = "WBBBBWWWBWBWBBWWBBWWBWBBBBWBWBWB";
    assertEquals(16, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case35() {
    String cardFront = "BWBBBBBWBBWBWWBWWWWBWWWBBWBWWBWWB";
    assertEquals(15, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case36() {
    String cardFront = "WBWBBBBBBWWWWWBWWWBBWWWWWBWBWBBWWW";
    assertEquals(15, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case37() {
    String cardFront = "WWBWWBWBWBBBBWBBWWBBBWBWBWBBWWBBBWW";
    assertEquals(15, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case38() {
    String cardFront = "WWWWBBWBWWWWWBWBBBBBBWBWBBWWWWBBWWBB";
    assertEquals(17, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case39() {
    String cardFront = "WBBWBBBBWBWWWWWBBWBWBWBBBBWWWBBWWWWBB";
    assertEquals(18, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case40() {
    String cardFront = "BWWBWBBWBWWWWWBWWBWWWWBWWWWBBBWBWBBBBB";
    assertEquals(18, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case41() {
    String cardFront = "BWBBWWBBWWWBWWWBBWBWWWWWWWBWWWWWBBWWBBB";
    assertEquals(17, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case42() {
    String cardFront = "BWBBWBBBBBBWBBBBWBBWWWWWBBBBBWBBBWWBBWBW";
    assertEquals(16, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case43() {
    String cardFront = "WBWWWBBBBBBBBWWBBWBWWWWBWBWWBBWWBBBWWWBBW";
    assertEquals(19, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case44() {
    String cardFront = "BWBBWWWBBWWBBWBBBWWWWBWBBBBBBWWWWWWBWWBBWB";
    assertEquals(20, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case45() {
    String cardFront = "WWBBBWWWBWBBBWWWBBBBWBWBWWBWBWWBBWWBBWBWBWB";
    assertEquals(16, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case46() {
    String cardFront = "BBBWBWBBWBWWWBWBBBBWBBWWBBWBBWWBWBBBWWBBBWBW";
    assertEquals(22, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case47() {
    String cardFront = "BWBWBWBBBBBWWWWWBBWWWBBWBBWWWWWBWBBBWWWBWWBWW";
    assertEquals(21, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case48() {
    String cardFront = "WWBBBBWWWWBWBWWBWWWBWBWBWBBWWBBBWWBWWWWBBBWWBW";
    assertEquals(21, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case49() {
    String cardFront = "BBBWWWBBBWWWBBBWWBWBBWWBBBBWWBWBBBWBWWWWBWBBBWB";
    assertEquals(22, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case50() {
    String cardFront = "WWWWBWWWWBWWWBBWWBWBWWBWBWWBBWWBWBBWWWBBWWWBBBWB";
    assertEquals(21, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case51() {
    String cardFront = "BWWWWWBBBWWBBWWBBBBWWWBBBBBBWBWBWBBWBBWBWWBWBWWBW";
    assertEquals(24, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case52() {
    String cardFront = "WWBBWBBBBBWWBBWWWWBBBBBBBWWWWWWWWBWBBWWWWBBBBWBWBB";
    assertEquals(25, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case53() {
    String cardFront = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW";
    assertEquals(25, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case54() {
    String cardFront = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
    assertEquals(25, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case55() {
    String cardFront = "BWWWBWWBWBBWWBWBBBWWBWBWBWWBWBBBBBWBWBBBBWWWWBWBWB";
    assertEquals(21, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case56() {
    String cardFront = "BBBWBBWBBBBWBBWWWBBBWBWBWWBBWBWBWBWWWWWWWWWWBWBWB";
    assertEquals(22, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case57() {
    String cardFront = "BBBBWBWWWWWBWBBWWBWBBWBBBWBBBBBWWBBBBBWWWBBWWBWBB";
    assertEquals(21, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case58() {
    String cardFront = "WBBWBWBWWWWWWBWWBBWBWWWBWBWWWBWWBWWWBWWWWBWWBBBBBB";
    assertEquals(23, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case59() {
    String cardFront = "BBWWWWWBBBWWBBWWBWBBWBWBBWBWBWWBWWBWBBBWWBBBBWBBW";
    assertEquals(23, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case60() {
    String cardFront = "BBB";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case61() {
    String cardFront = "BWW";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case62() {
    String cardFront = "WWBWBW";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case63() {
    String cardFront = "BWBWBBBBWBWWWWWBWBWBWBWBWBWBWBWBWBWBBBWWWBWBWW";
    assertEquals(11, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case64() {
    String cardFront = "BWBWBWWWWWBBBBWBBBWBBWBWBBWWW";
    assertEquals(12, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case65() {
    String cardFront = "BBWBWB";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case66() {
    String cardFront = "BWWBWBWBWBBW";
    assertEquals(4, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case67() {
    String cardFront = "WBWBWW";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case68() {
    String cardFront = "WBW";
    assertEquals(0, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case69() {
    String cardFront = "BBWBWBWBWBWB";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case70() {
    String cardFront = "BBBBW";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case71() {
    String cardFront = "BBWWBWBWBWBW";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case72() {
    String cardFront = "BWWWW";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case73() {
    String cardFront = "BBWBWBWBWBWBWBWBWBB";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case74() {
    String cardFront = "BBWB";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case75() {
    String cardFront = "BWWBWWBWBWWBBBWBWBWBBWBBW";
    assertEquals(11, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case76() {
    String cardFront = "BBWBWWBWBWBWBWBWBWBWBWWWWWWBBBBBWBWBWBWBWBWWBBBWB";
    assertEquals(22, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case77() {
    String cardFront = "BBWBB";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case78() {
    String cardFront = "WWB";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case79() {
    String cardFront = "WBWBWBB";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case80() {
    String cardFront = "WWBWBWBWBWW";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case81() {
    String cardFront = "BBWWBW";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case82() {
    String cardFront = "WWBW";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case83() {
    String cardFront = "BWBWW";
    assertEquals(1, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case84() {
    String cardFront = "BWB";
    assertEquals(0, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case85() {
    String cardFront = "BBWWW";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case86() {
    String cardFront = "BWWBBB";
    assertEquals(3, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case87() {
    String cardFront = "BWWBW";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case88() {
    String cardFront = "BBBBWBWBWBWBWBWBW";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case89() {
    String cardFront = "BBWBWBWBWBB";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case90() {
    String cardFront = "BBBBWBWBWBWB";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case91() {
    String cardFront = "WWBWBWBWBWBB";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case92() {
    String cardFront = "BBWW";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

  @Test
  public void case93() {
    String cardFront = "BWWBWBWB";
    assertEquals(2, blackandwhitesolitaire.minimumTurns(cardFront));
  }

}
