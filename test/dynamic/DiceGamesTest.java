package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class DiceGamesTest {
  DiceGames dicegames = new DiceGames();

  @Test
  public void case1() {
    int[] sides = { 4 };
    assertEquals(4L, dicegames.countFormations(sides));
  }

  @Test
  public void case2() {
    int[] sides = { 2, 2 };
    assertEquals(3L, dicegames.countFormations(sides));
  }

  @Test
  public void case3() {
    int[] sides = { 4, 4 };
    assertEquals(10L, dicegames.countFormations(sides));
  }

  @Test
  public void case4() {
    int[] sides = { 3, 4 };
    assertEquals(9L, dicegames.countFormations(sides));
  }

  @Test
  public void case5() {
    int[] sides = { 4, 5, 6 };
    assertEquals(48L, dicegames.countFormations(sides));
  }

  @Test
  public void case6() {
    int[] sides = { 6, 5, 4 };
    assertEquals(48L, dicegames.countFormations(sides));
  }

  @Test
  public void case7() {
    int[] sides = { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
    assertEquals(916312070471295267L, dicegames.countFormations(sides));
  }

  @Test
  public void case8() {
    int[] sides = { 32, 31, 30, 1, 2, 3, 4, 5, 29, 28, 27, 26, 25, 24, 6, 7, 8, 9, 10, 23, 22, 21, 20, 19, 18, 11, 12, 13, 14, 17, 16, 15 };
    assertEquals(55534064877048198L, dicegames.countFormations(sides));
  }

  @Test
  public void case9() {
    int[] sides = { 31, 4, 15, 9, 26, 5, 3, 5, 8, 9, 7, 9, 32, 3, 8, 4, 6, 24, 6, 3, 7, 5, 10, 5, 8, 20, 9, 7, 4, 9, 4, 4 };
    assertEquals(5340998296357L, dicegames.countFormations(sides));
  }

  @Test
  public void case10() {
    int[] sides = { 27, 18, 28, 18, 28, 4, 5, 9 };
    assertEquals(6505450L, dicegames.countFormations(sides));
  }

  @Test
  public void case11() {
    int[] sides = { 21, 26, 27, 6, 25, 25, 26, 4, 3, 29, 31, 14, 2, 21, 26, 3, 11, 24, 31, 5, 5, 11, 31, 9, 9, 16, 20, 13, 4, 20, 17, 15 };
    assertEquals(40751200482175153L, dicegames.countFormations(sides));
  }

  @Test
  public void case12() {
    int[] sides = { 10, 25, 18, 28, 28, 11, 4, 9, 18, 9, 7, 9, 27, 31, 1, 9, 24, 32, 7, 3, 4, 14, 13, 25, 29, 22, 31, 18, 24, 17, 5, 22 };
    assertEquals(56241707454859975L, dicegames.countFormations(sides));
  }

  @Test
  public void case13() {
    int[] sides = { 11, 23, 21, 3, 31, 5, 1, 15, 20, 22, 23, 25, 31, 27, 13, 28, 2, 17, 16, 13, 14, 8, 14, 21, 3, 10, 11, 9, 6, 21, 30, 23 };
    assertEquals(25058975389115621L, dicegames.countFormations(sides));
  }

  @Test
  public void case14() {
    int[] sides = { 2, 20, 17, 7, 24, 8, 30, 18, 19, 10, 12, 28, 13, 25, 6, 26, 11, 32, 2, 10, 16, 25, 15, 15, 18, 13, 11, 24, 17, 12, 11, 5 };
    assertEquals(23880236226918650L, dicegames.countFormations(sides));
  }

  @Test
  public void case15() {
    int[] sides = { 16, 24, 11, 26, 2, 32, 4, 3, 20, 1, 30, 30, 10, 19, 11, 23, 27, 28, 16, 15, 23, 25, 15, 21, 3, 22, 30, 8, 21, 32, 10, 16 };
    assertEquals(83960541529664380L, dicegames.countFormations(sides));
  }

  @Test
  public void case16() {
    int[] sides = { 2, 11, 15, 18, 5, 30, 7, 8, 20, 21, 32, 16, 27, 9, 31, 8, 32, 7, 20, 13, 29, 7, 20, 25, 24, 9, 32, 7, 31, 15, 14, 6 };
    assertEquals(118352445101142250L, dicegames.countFormations(sides));
  }

  @Test
  public void case17() {
    int[] sides = { 2, 7, 12, 10, 24, 31, 2, 4, 3, 28, 29, 11, 13, 10, 13, 13, 13, 18, 21, 12, 24, 1, 3, 16, 29, 12, 29, 27, 4, 25, 7, 7 };
    assertEquals(4290229977279313L, dicegames.countFormations(sides));
  }

  @Test
  public void case18() {
    int[] sides = { 20, 28, 14, 9, 16, 32, 17, 16, 6, 27, 31, 1, 19, 13, 25, 25, 11, 18, 1, 11, 19, 29, 17, 15, 2, 21, 11, 25, 27, 32, 26, 21 };
    assertEquals(68984484038903530L, dicegames.countFormations(sides));
  }

  @Test
  public void case19() {
    int[] sides = { 13, 8, 23, 16, 23, 26, 9, 29, 28, 2, 18, 9, 11, 29, 13, 28, 24, 17, 4, 23, 19, 9, 4, 10, 9, 1, 29, 16, 11, 30, 13, 3 };
    assertEquals(14596617661458100L, dicegames.countFormations(sides));
  }

  @Test
  public void case20() {
    int[] sides = { 26, 19, 8, 31, 17, 14, 32, 20, 30, 6, 24, 30, 18, 17, 21, 3, 5, 4, 14, 5, 22, 9, 19, 28, 28, 26, 28, 11, 17, 7, 14, 26 };
    assertEquals(174124851683269891L, dicegames.countFormations(sides));
  }

  @Test
  public void case21() {
    int[] sides = { 24, 14, 1, 22, 14, 17, 14, 2, 24, 19, 24, 23, 1, 16, 2, 23, 22, 31, 11, 4, 22, 26, 3, 27, 27, 12, 22, 5, 27, 32, 32, 29 };
    assertEquals(32709129622677603L, dicegames.countFormations(sides));
  }

  @Test
  public void case22() {
    int[] sides = { 32, 30, 24, 11, 19, 14, 29, 10, 18, 20, 29, 16, 30, 26, 8, 14, 22, 14, 31, 1, 24, 25, 9, 30, 21, 13, 4, 31, 31, 1, 15, 12 };
    assertEquals(116476145183960405L, dicegames.countFormations(sides));
  }

  @Test
  public void case23() {
    int[] sides = { 17, 19, 15, 19, 19, 28, 18, 4, 3, 6, 5, 18, 2, 14, 14, 19, 2, 13, 23, 16, 30, 13, 16, 5, 20, 29, 3, 10, 26, 19, 18, 27 };
    assertEquals(5971454593209424L, dicegames.countFormations(sides));
  }

  @Test
  public void case24() {
    int[] sides = { 10, 22, 14, 21, 15, 5, 3, 28, 28, 2, 30, 26, 26, 9, 19, 5, 30, 4, 8, 4, 8, 30, 10, 28, 19, 6, 16, 20, 22, 3, 19, 9 };
    assertEquals(15815400588156614L, dicegames.countFormations(sides));
  }

  @Test
  public void case25() {
    int[] sides = { 6, 11, 16, 32, 6, 9, 28, 15, 5, 18, 1, 11, 11, 18, 7, 11, 16, 21, 28, 6, 24, 16, 4, 31, 29, 19, 28, 17, 28, 15, 28, 13 };
    assertEquals(44123209168172692L, dicegames.countFormations(sides));
  }

  @Test
  public void case26() {
    int[] sides = { 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(55534064877048198L, dicegames.countFormations(sides));
  }

  @Test
  public void case27() {
    int[] sides = { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
    assertEquals(916312070471295267L, dicegames.countFormations(sides));
  }

  @Test
  public void case28() {
    int[] sides = { 32, 31, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
    assertEquals(916312070471295266L, dicegames.countFormations(sides));
  }

  @Test
  public void case29() {
    int[] sides = { 6, 5, 4 };
    assertEquals(48L, dicegames.countFormations(sides));
  }

  @Test
  public void case30() {
    int[] sides = { 23, 12, 32, 22, 32, 23, 1, 1, 2, 30, 30, 31, 31, 29, 29, 29, 29, 29, 29, 29, 30, 24, 25, 27, 27, 27, 23, 23, 1, 2 };
    assertEquals(10379574199019698L, dicegames.countFormations(sides));
  }

  @Test
  public void case31() {
    int[] sides = { 10, 1, 10 };
    assertEquals(55L, dicegames.countFormations(sides));
  }

  @Test
  public void case32() {
    int[] sides = { 4, 3 };
    assertEquals(9L, dicegames.countFormations(sides));
  }

  @Test
  public void case33() {
    int[] sides = { 5, 5, 4, 3, 2, 1, 1, 1, 1, 1 };
    assertEquals(90L, dicegames.countFormations(sides));
  }

  @Test
  public void case34() {
    int[] sides = { 4 };
    assertEquals(4L, dicegames.countFormations(sides));
  }

  @Test
  public void case35() {
    int[] sides = { 10, 1 };
    assertEquals(10L, dicegames.countFormations(sides));
  }

  @Test
  public void case36() {
    int[] sides = { 5, 1 };
    assertEquals(5L, dicegames.countFormations(sides));
  }

  @Test
  public void case37() {
    int[] sides = { 10, 9, 8, 7, 6, 5, 4, 3, 2 };
    assertEquals(16796L, dicegames.countFormations(sides));
  }

  @Test
  public void case38() {
    int[] sides = { 31, 14, 19, 8, 1, 32, 12, 31, 32, 1, 1, 1, 5, 11, 9, 10, 20, 22, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 9, 1 };
    assertEquals(78763054287067L, dicegames.countFormations(sides));
  }

  @Test
  public void case39() {
    int[] sides = { 32, 32 };
    assertEquals(528L, dicegames.countFormations(sides));
  }

  @Test
  public void case40() {
    int[] sides = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 };
    assertEquals(14544636039226909L, dicegames.countFormations(sides));
  }

  @Test
  public void case41() {
    int[] sides = { 29, 31, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
    assertEquals(916312070471294677L, dicegames.countFormations(sides));
  }

  @Test
  public void case42() {
    int[] sides = { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 14, 14, 15, 15, 16, 16, 16, 17, 25 };
    assertEquals(85343292199085256L, dicegames.countFormations(sides));
  }

  @Test
  public void case43() {
    int[] sides = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 };
    assertEquals(55534064877048198L, dicegames.countFormations(sides));
  }

  @Test
  public void case44() {
    int[] sides = { 4, 2 };
    assertEquals(7L, dicegames.countFormations(sides));
  }

}
