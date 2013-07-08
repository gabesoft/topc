package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class TournamentRankerTest {
  TournamentRanker tournamentranker = new TournamentRanker();

  @Test
  public void case1() {
    String[] names = { "RODDICK", "SCHUETTLER", "FERREIRA", "AGASSI" };
    String[] lostTo = { "SCHUETTLER", "AGASSI", "AGASSI", "" };
    assertArrayEquals(new String[] { "AGASSI", "SCHUETTLER", "FERREIRA", "RODDICK" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case2() {
    String[] names = { "DUKE", "SETON HALL", "ILLINOIS", "CINCINNATI", "NORTH CAROLINA", "TEXAS", "XAVIER", "MISSISSIPPI STATE" };
    String[] lostTo = { "", "DUKE", "DUKE", "ILLINOIS", "TEXAS", "XAVIER", "DUKE", "XAVIER" };
    assertArrayEquals(new String[] { "DUKE", "XAVIER", "ILLINOIS", "TEXAS", "SETON HALL", "MISSISSIPPI STATE", "CINCINNATI", "NORTH CAROLINA" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case3() {
    String[] names = { "JAVA", "VISUAL BASIC" };
    String[] lostTo = { "VISUAL BASIC", "" };
    assertArrayEquals(new String[] { "VISUAL BASIC", "JAVA" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case4() {
    String[] names = { "A", "B" };
    String[] lostTo = { "B", "" };
    assertArrayEquals(new String[] { "B", "A" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case5() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "L", "T", "L", "FA", "A", "AA", "M", "M", "G", "L", "H", "S", "P", "H", "J", "S", "BA", "P", "", "P", "N", "P", "CA", "S", "M", "R", "S", "CA", "S", "Z", "R", "J" };
    assertArrayEquals(new String[] { "S", "P", "L", "M", "CA", "R", "J", "H", "AA", "T", "A", "G", "BA", "Z", "FA", "N", "X", "V", "C", "Y", "W", "EA", "O", "K", "F", "B", "E", "I", "Q", "DA", "D", "U" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case6() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "N", "D", "B", "", "B", "D", "A", "M", "N", "E", "A", "D", "N", "D", "K", "L" };
    assertArrayEquals(new String[] { "D", "N", "B", "A", "L", "M", "E", "K", "F", "I", "C", "G", "P", "H", "J", "O" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case7() {
    String[] names = { "A", "B" };
    String[] lostTo = { "", "A" };
    assertArrayEquals(new String[] { "A", "B" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case8() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "H", "A", "F", "H", "B", "H", "A", "" };
    assertArrayEquals(new String[] { "H", "A", "F", "B", "D", "G", "C", "E" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case9() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "H", "F", "E", "", "D", "D", "D", "E" };
    assertArrayEquals(new String[] { "D", "E", "F", "H", "G", "C", "B", "A" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case10() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "M", "L", "J", "H", "L", "L", "F", "F", "E", "", "M", "J", "J", "J", "C", "A" };
    assertArrayEquals(new String[] { "J", "L", "M", "F", "C", "E", "A", "H", "N", "B", "K", "G", "O", "I", "P", "D" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case11() {
    String[] names = { "A", "B", "C", "D" };
    String[] lostTo = { "D", "C", "D", "" };
    assertArrayEquals(new String[] { "D", "C", "A", "B" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case12() {
    String[] names = { "A", "B", "C", "D" };
    String[] lostTo = { "D", "", "B", "B" };
    assertArrayEquals(new String[] { "B", "D", "C", "A" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case13() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "K", "", "J", "P", "D", "M", "H", "B", "N", "B", "J", "B", "N", "B", "P", "J" };
    assertArrayEquals(new String[] { "B", "J", "N", "P", "H", "K", "M", "D", "L", "C", "I", "O", "G", "A", "F", "E" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case14() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "AA", "X", "", "R", "J", "V", "Y", "C", "N", "C", "N", "S", "N", "C", "V", "O", "FA", "C", "C", "S", "I", "I", "DA", "S", "I", "J", "DA", "T", "Z", "N", "K", "X" };
    assertArrayEquals(new String[] { "C", "N", "S", "I", "J", "DA", "X", "V", "R", "K", "T", "Y", "Z", "AA", "FA", "O", "H", "M", "L", "U", "E", "W", "B", "F", "D", "EA", "BA", "G", "CA", "A", "Q", "P" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case15() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "G", "A", "E", "E", "", "G", "E", "D" };
    assertArrayEquals(new String[] { "E", "G", "D", "A", "C", "F", "H", "B" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case16() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "P", "F", "B", "N", "D", "", "H", "P", "B", "N", "F", "F", "C", "F", "L", "N" };
    assertArrayEquals(new String[] { "F", "N", "B", "P", "L", "D", "C", "H", "K", "J", "I", "A", "O", "E", "M", "G" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case17() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "", "D", "A", "E", "A", "A", "E", "F" };
    assertArrayEquals(new String[] { "A", "E", "F", "D", "C", "G", "H", "B" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case18() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "K", "M", "M", "B", "D", "G", "M", "N", "B", "D", "M", "E", "", "B", "F", "G" };
    assertArrayEquals(new String[] { "M", "B", "G", "D", "K", "N", "F", "E", "C", "I", "P", "J", "A", "H", "O", "L" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case19() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "Q", "F", "D", "A", "CA", "U", "V", "EA", "U", "Y", "CA", "M", "Q", "E", "T", "R", "U", "EA", "W", "Y", "Y", "T", "Y", "O", "", "T", "Q", "A", "U", "FA", "Y", "V" };
    assertArrayEquals(new String[] { "Y", "U", "T", "Q", "EA", "CA", "V", "A", "W", "F", "O", "M", "R", "E", "FA", "D", "J", "I", "Z", "AA", "H", "K", "G", "BA", "S", "B", "X", "L", "P", "N", "DA", "C" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case20() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "", "G", "F", "E", "A", "A", "E", "A" };
    assertArrayEquals(new String[] { "A", "E", "F", "G", "H", "D", "C", "B" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case21() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "D", "", "B", "B", "G", "H", "H", "B" };
    assertArrayEquals(new String[] { "B", "H", "D", "G", "C", "F", "A", "E" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case22() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "G", "CA", "E", "FA", "BA", "H", "B", "BA", "P", "G", "AA", "BA", "A", "V", "T", "CA", "B", "B", "K", "H", "CA", "BA", "R", "CA", "U", "I", "H", "CA", "", "P", "AA", "E" };
    assertArrayEquals(new String[] { "CA", "BA", "B", "H", "P", "E", "G", "AA", "U", "V", "R", "T", "I", "FA", "A", "K", "X", "L", "Q", "F", "DA", "C", "J", "EA", "Y", "N", "W", "O", "Z", "D", "M", "S" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case23() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "C", "D", "", "C", "D", "E", "C", "A" };
    assertArrayEquals(new String[] { "C", "D", "A", "E", "G", "B", "H", "F" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case24() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "H", "CA", "F", "O", "N", "O", "H", "", "B", "G", "F", "X", "G", "G", "H", "O", "C", "J", "H", "CA", "L", "E", "X", "N", "N", "DA", "DA", "AA", "H", "G", "D", "S" };
    assertArrayEquals(new String[] { "H", "G", "O", "N", "CA", "DA", "F", "X", "S", "J", "D", "E", "B", "AA", "C", "L", "A", "M", "P", "Y", "T", "Z", "K", "W", "FA", "R", "EA", "V", "I", "BA", "Q", "U" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case25() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "B", "E", "M", "I", "", "L", "K", "B", "M", "A", "M", "E", "E", "E", "D", "I" };
    assertArrayEquals(new String[] { "E", "M", "B", "I", "L", "K", "A", "D", "N", "C", "H", "P", "F", "G", "J", "O" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case26() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "D", "A", "B", "", "J", "D", "M", "L", "O", "D", "D", "A", "B", "A", "J", "F" };
    assertArrayEquals(new String[] { "D", "A", "J", "B", "F", "L", "O", "M", "K", "N", "E", "C", "P", "H", "I", "G" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case27() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "D", "A", "P", "", "AA", "D", "V", "I", "D", "N", "T", "Z", "S", "D", "AA", "A", "AA", "DA", "B", "N", "N", "D", "Q", "E", "G", "J", "N", "V", "B", "Q", "A", "J" };
    assertArrayEquals(new String[] { "D", "N", "A", "AA", "V", "J", "B", "Q", "I", "T", "P", "E", "G", "Z", "S", "DA", "F", "U", "EA", "O", "BA", "FA", "CA", "W", "H", "K", "C", "X", "Y", "L", "M", "R" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case28() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "C", "I", "O", "V", "J", "P", "Q", "Q", "V", "S", "CA", "J", "CA", "M", "P", "X", "X", "X", "", "G", "P", "S", "U", "S", "AA", "S", "X", "Z", "J", "S", "E", "O" };
    assertArrayEquals(new String[] { "S", "X", "J", "P", "V", "Q", "CA", "O", "Z", "AA", "E", "U", "I", "G", "M", "C", "DA", "R", "L", "F", "D", "H", "K", "FA", "BA", "Y", "EA", "W", "B", "T", "N", "A" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case29() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "H", "F", "D", "F", "F", "", "B", "D" };
    assertArrayEquals(new String[] { "F", "D", "B", "H", "E", "C", "G", "A" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case30() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "R", "F", "X", "A", "CA", "O", "T", "R", "Q", "D", "A", "W", "R", "M", "M", "D", "A", "", "R", "Z", "H", "J", "M", "N", "O", "O", "M", "N", "R", "H", "DA", "Z" };
    assertArrayEquals(new String[] { "R", "M", "A", "O", "H", "N", "D", "Z", "CA", "W", "Q", "F", "DA", "X", "J", "T", "S", "AA", "K", "Y", "U", "BA", "P", "FA", "E", "L", "I", "B", "EA", "C", "V", "G" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case31() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "R", "P", "BA", "B", "FA", "I", "O", "T", "R", "I", "BA", "T", "L", "C", "P", "T", "V", "L", "FA", "", "EA", "R", "L", "P", "O", "F", "M", "L", "G", "S", "T", "T" };
    assertArrayEquals(new String[] { "T", "L", "P", "R", "FA", "BA", "O", "I", "EA", "M", "B", "V", "S", "C", "G", "F", "H", "W", "X", "A", "E", "K", "Y", "J", "U", "AA", "D", "Q", "DA", "N", "CA", "Z" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case32() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "P", "X", "S", "V", "J", "X", "J", "L", "Y", "C", "S", "P", "B", "X", "G", "B", "C", "S", "X", "K", "FA", "C", "S", "", "B", "K", "F", "T", "F", "CA", "R", "X" };
    assertArrayEquals(new String[] { "X", "S", "B", "C", "F", "K", "P", "J", "FA", "R", "Y", "V", "CA", "T", "L", "G", "N", "W", "M", "Q", "AA", "Z", "A", "E", "U", "EA", "I", "D", "DA", "BA", "H", "O" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case33() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "L", "N", "N", "M", "J", "E", "C", "O", "L", "", "A", "M", "J", "J", "M", "J" };
    assertArrayEquals(new String[] { "J", "M", "N", "L", "E", "O", "C", "A", "P", "D", "B", "I", "F", "H", "G", "K" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case34() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "N", "DA", "DA", "AA", "Y", "P", "D", "I", "Y", "C", "D", "AA", "J", "AA", "P", "", "FA", "U", "P", "B", "CA", "F", "K", "CA", "CA", "C", "P", "DA", "AA", "P", "S", "S" };
    assertArrayEquals(new String[] { "P", "AA", "DA", "CA", "S", "D", "C", "Y", "F", "N", "B", "U", "FA", "K", "J", "I", "O", "L", "BA", "X", "EA", "G", "Z", "E", "V", "A", "T", "R", "Q", "W", "M", "H" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case35() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "F", "H", "F", "F", "C", "", "D", "C" };
    assertArrayEquals(new String[] { "F", "C", "D", "H", "A", "E", "G", "B" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case36() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "P", "M", "K", "B", "D", "M", "I", "K", "K", "F", "", "B", "K", "M", "H", "H" };
    assertArrayEquals(new String[] { "K", "M", "H", "B", "I", "F", "P", "D", "C", "N", "O", "L", "G", "J", "A", "E" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case37() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "I", "H", "I", "C", "O", "", "L", "I", "F", "P", "B", "O", "H", "F", "F", "F" };
    assertArrayEquals(new String[] { "F", "I", "O", "H", "P", "C", "L", "B", "N", "A", "E", "M", "J", "D", "G", "K" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case38() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "L", "N", "K", "L", "A", "J", "H", "L", "A", "K", "", "K", "P", "P", "E", "K" };
    assertArrayEquals(new String[] { "K", "L", "P", "A", "J", "H", "N", "E", "C", "D", "M", "I", "F", "G", "B", "O" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case39() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
    String[] lostTo = { "", "A", "O", "N", "N", "G", "K", "E", "A", "B", "A", "M", "A", "M", "M", "K" };
    assertArrayEquals(new String[] { "A", "M", "K", "N", "B", "O", "G", "E", "I", "L", "P", "D", "J", "C", "F", "H" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case40() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "G", "A", "F", "G", "H", "G", "", "A" };
    assertArrayEquals(new String[] { "G", "A", "F", "H", "D", "B", "C", "E" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case41() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "B", "W", "K", "T", "B", "O", "W", "W", "W", "AA", "I", "O", "A", "Y", "Y", "L", "K", "G", "C", "Z", "FA", "FA", "", "BA", "W", "K", "I", "Y", "I", "U", "Z", "I" };
    assertArrayEquals(new String[] { "W", "I", "Y", "K", "B", "FA", "O", "Z", "G", "AA", "BA", "C", "A", "U", "L", "T", "H", "CA", "N", "Q", "E", "V", "F", "EA", "R", "J", "X", "S", "M", "DA", "P", "D" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case42() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "Y", "BA", "D", "Y", "A", "Y", "L", "B", "BA", "AA", "B", "", "Z", "J", "BA", "Z", "P", "H", "J", "AA", "L", "D", "N", "G", "BA", "L", "L", "L", "AA", "I", "T", "C" };
    assertArrayEquals(new String[] { "L", "BA", "AA", "Y", "Z", "B", "J", "D", "G", "I", "T", "A", "P", "H", "N", "C", "U", "O", "CA", "F", "M", "K", "S", "V", "X", "DA", "EA", "E", "Q", "R", "W", "FA" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case43() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "B", "", "EA", "C", "B", "Z", "R", "FA", "T", "EA", "E", "R", "S", "U", "Z", "M", "E", "Z", "Z", "X", "AA", "K", "AA", "E", "G", "B", "B", "F", "S", "X", "S", "B" };
    assertArrayEquals(new String[] { "B", "Z", "E", "S", "AA", "R", "X", "EA", "FA", "F", "K", "M", "U", "G", "T", "C", "A", "O", "Q", "CA", "W", "L", "DA", "J", "H", "BA", "V", "P", "N", "Y", "I", "D" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case44() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "B", "", "G", "B", "A", "B", "F", "F" };
    assertArrayEquals(new String[] { "B", "F", "A", "G", "D", "H", "E", "C" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case45() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "T", "N", "FA", "L", "BA", "D", "S", "Z", "U", "Z", "L", "", "N", "U", "J", "C", "E", "U", "T", "D", "L", "BA", "F", "B", "K", "L", "D", "FA", "I", "FA", "L", "D" };
    assertArrayEquals(new String[] { "L", "D", "U", "FA", "Z", "T", "N", "BA", "K", "F", "I", "C", "J", "S", "B", "E", "EA", "AA", "R", "DA", "H", "A", "M", "V", "Y", "W", "CA", "P", "O", "G", "X", "Q" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case46() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H" };
    String[] lostTo = { "", "E", "D", "A", "A", "E", "F", "A" };
    assertArrayEquals(new String[] { "A", "E", "D", "F", "H", "B", "C", "G" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case47() {
    String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "BA", "CA", "DA", "EA", "FA" };
    String[] lostTo = { "O", "M", "U", "CA", "B", "R", "R", "", "CA", "BA", "N", "X", "CA", "EA", "H", "M", "D", "H", "FA", "P", "BA", "R", "EA", "P", "H", "V", "M", "CA", "H", "F", "H", "V" };
    assertArrayEquals(new String[] { "H", "CA", "R", "M", "EA", "BA", "V", "P", "O", "D", "F", "B", "N", "U", "FA", "X", "Y", "I", "G", "AA", "W", "J", "Z", "T", "A", "Q", "DA", "E", "K", "C", "S", "L" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case48() {
    String[] names = { "AZEDURV CYZI  VOVKTTPAAEYBGYFBBDXGMRZGUYBICWZHPJLI", "BAIQQKU V WMODOQYQHNMQXMEUNVTWXRKHBRAWZUZJXBHETKPR", "BWGDBUVR VWCZVKBATQX IYWARAPACJWBXFBJMGXBLHQTYWNMQ", "CZRVZRORQCOZMMOWHZQLIGTW NPKXIAIOVFJSMOY SRW RWPSY", "DB NEBTQRIJDFYYEROEVTTXQWOCQUCQJQTKQWTABPNNBV ARQV", "DGPY KBQVSBSYPER IBYPXZYSYMNEPRAUFCDQJSUHSBR GFQXC", "EFEIXTCLQYKVTMNOZTLMUWMWSWQHHGFCRB SEEBZISPVMIXOVI", "EV ASCADISAFGVJZZKMZPEHILGEBVOVNFYBUMROM SIIMTETVC", "FAILQJHRKILZXOWWJTQKGVPELIH BZQXANMOFUB JWPJAKKWUJ", "FHKEFQXEWNDMQEUODNTUZISQOQLSFIPIGMQBXXGMYZAJUBNQYI", "H OYEBEK GYRQZIUAXLDIJEXNCOELMLLOGIYDIHCEXNBVIRYPT", "HDQYGYRUQVQJFGWBMOMSIDETI OGIWESUGBXQDJVYHUJWBEFTO", "HIPEZLPKJSCQF XAMZQNSJZHE  KWJWV JHZIAKAZMZLRGKOYG", "ITLAMJAZMXQXFIGVBNAJTRNCIIHTUGESLKLUHYZJHXDBGXJPGC", "JZAWCHGAGIKZY PKMNOEN TJHBS CWKJ  YXYQGJMLEMBIVPCI", "KAN QNWXMBESYCKARZ IMYVGLQWPEJVQUWPFYKLXPNHLGSUONS", "KFFUTKF IPKFMDHEPTOAPIJZKFFZBJILDVMVWUGJMERUQHHOXT", "KSWFZKIKKENXSUNHBVPWRKATOJSFLRCSATFMNBDTUNYUTQKUNH", "LCHEC GL NZCDVPUCLDSAGQMSOLZXOBGMSGXNVARBVWOCDPJOZ", "LPPAZCQYETAHMEOR QCJIAG APRNMZQZBNRBMAHSFGQOWWPDZV", "PZGIDEOVF NECG EUINXOZSOCEQHOA RTSUYMPPLXNF RVORBX", "QZWMTDLHZZGKELWGLTKI  A ZUHGPAFYFTUKXVG SLHAALWGJB", "RANDIOWNESJBDBQOEVOCBSFX YACUFBYVNJIRXHROOJIKOEKEL", "RJGJTFFXZCBBS PJGTTZYVSBJZOVLZQRERHTTCPLGPKPA PQBC", "ROQCHKZYTCGX GLEBRUNTQTSTWSFNDZWMJENPTCJVOXSADLKNP", "SLYKSWKBKULIDIXDLTGHSNMXSNLNSNPEEXRGTPKOIXVSUMWA U", "SXDDTBMQKLMHBBZIFUXMEEPR TDWCCRTHXEWWFXUQMAAQAKRML", "TOVJGRDHERWQWUIVKZELSCDNQDH DWEJMZOCIZUTYYCANZSKOG", "UNFDVZUENYWQ CPMJWZMZALGEOLLTSGDTAWUJVNI TVHSBCOR ", "WPNWFWWPZH QPERCEOZSPAHVFMG YMJUABD LNSFTQBBMOZAZG", "WQXBVCOMZWZWFXDPAUQTZVPJQRLDESWYIFXBARAAPHYUMOLYZY", "YIG TOTBIZVZZFVQBYBWTTSUTDOZFG RZMOOTXNHEOSMGWULIG" };
    String[] lostTo = { "SXDDTBMQKLMHBBZIFUXMEEPR TDWCCRTHXEWWFXUQMAAQAKRML", "ROQCHKZYTCGX GLEBRUNTQTSTWSFNDZWMJENPTCJVOXSADLKNP", "RJGJTFFXZCBBS PJGTTZYVSBJZOVLZQRERHTTCPLGPKPA PQBC", "FHKEFQXEWNDMQEUODNTUZISQOQLSFIPIGMQBXXGMYZAJUBNQYI", "", "LCHEC GL NZCDVPUCLDSAGQMSOLZXOBGMSGXNVARBVWOCDPJOZ", "TOVJGRDHERWQWUIVKZELSCDNQDH DWEJMZOCIZUTYYCANZSKOG", "KAN QNWXMBESYCKARZ IMYVGLQWPEJVQUWPFYKLXPNHLGSUONS", "TOVJGRDHERWQWUIVKZELSCDNQDH DWEJMZOCIZUTYYCANZSKOG", "ROQCHKZYTCGX GLEBRUNTQTSTWSFNDZWMJENPTCJVOXSADLKNP", "WPNWFWWPZH QPERCEOZSPAHVFMG YMJUABD LNSFTQBBMOZAZG", "DGPY KBQVSBSYPER IBYPXZYSYMNEPRAUFCDQJSUHSBR GFQXC", "JZAWCHGAGIKZY PKMNOEN TJHBS CWKJ  YXYQGJMLEMBIVPCI", "H OYEBEK GYRQZIUAXLDIJEXNCOELMLLOGIYDIHCEXNBVIRYPT", "H OYEBEK GYRQZIUAXLDIJEXNCOELMLLOGIYDIHCEXNBVIRYPT", "WPNWFWWPZH QPERCEOZSPAHVFMG YMJUABD LNSFTQBBMOZAZG", "LCHEC GL NZCDVPUCLDSAGQMSOLZXOBGMSGXNVARBVWOCDPJOZ", "WPNWFWWPZH QPERCEOZSPAHVFMG YMJUABD LNSFTQBBMOZAZG", "DB NEBTQRIJDFYYEROEVTTXQWOCQUCQJQTKQWTABPNNBV ARQV", "DB NEBTQRIJDFYYEROEVTTXQWOCQUCQJQTKQWTABPNNBV ARQV", "WPNWFWWPZH QPERCEOZSPAHVFMG YMJUABD LNSFTQBBMOZAZG", "DB NEBTQRIJDFYYEROEVTTXQWOCQUCQJQTKQWTABPNNBV ARQV", "FAILQJHRKILZXOWWJTQKGVPELIH BZQXANMOFUB JWPJAKKWUJ", "KAN QNWXMBESYCKARZ IMYVGLQWPEJVQUWPFYKLXPNHLGSUONS", "TOVJGRDHERWQWUIVKZELSCDNQDH DWEJMZOCIZUTYYCANZSKOG", "LPPAZCQYETAHMEOR QCJIAG APRNMZQZBNRBMAHSFGQOWWPDZV", "YIG TOTBIZVZZFVQBYBWTTSUTDOZFG RZMOOTXNHEOSMGWULIG", "DB NEBTQRIJDFYYEROEVTTXQWOCQUCQJQTKQWTABPNNBV ARQV", "PZGIDEOVF NECG EUINXOZSOCEQHOA RTSUYMPPLXNF RVORBX", "DB NEBTQRIJDFYYEROEVTTXQWOCQUCQJQTKQWTABPNNBV ARQV", "YIG TOTBIZVZZFVQBYBWTTSUTDOZFG RZMOOTXNHEOSMGWULIG", "H OYEBEK GYRQZIUAXLDIJEXNCOELMLLOGIYDIHCEXNBVIRYPT" };
    assertArrayEquals(new String[] { "DB NEBTQRIJDFYYEROEVTTXQWOCQUCQJQTKQWTABPNNBV ARQV", "WPNWFWWPZH QPERCEOZSPAHVFMG YMJUABD LNSFTQBBMOZAZG", "TOVJGRDHERWQWUIVKZELSCDNQDH DWEJMZOCIZUTYYCANZSKOG", "H OYEBEK GYRQZIUAXLDIJEXNCOELMLLOGIYDIHCEXNBVIRYPT", "LCHEC GL NZCDVPUCLDSAGQMSOLZXOBGMSGXNVARBVWOCDPJOZ", "KAN QNWXMBESYCKARZ IMYVGLQWPEJVQUWPFYKLXPNHLGSUONS", "ROQCHKZYTCGX GLEBRUNTQTSTWSFNDZWMJENPTCJVOXSADLKNP", "YIG TOTBIZVZZFVQBYBWTTSUTDOZFG RZMOOTXNHEOSMGWULIG", "LPPAZCQYETAHMEOR QCJIAG APRNMZQZBNRBMAHSFGQOWWPDZV", "PZGIDEOVF NECG EUINXOZSOCEQHOA RTSUYMPPLXNF RVORBX", "FAILQJHRKILZXOWWJTQKGVPELIH BZQXANMOFUB JWPJAKKWUJ", "JZAWCHGAGIKZY PKMNOEN TJHBS CWKJ  YXYQGJMLEMBIVPCI", "DGPY KBQVSBSYPER IBYPXZYSYMNEPRAUFCDQJSUHSBR GFQXC", "RJGJTFFXZCBBS PJGTTZYVSBJZOVLZQRERHTTCPLGPKPA PQBC", "FHKEFQXEWNDMQEUODNTUZISQOQLSFIPIGMQBXXGMYZAJUBNQYI", "SXDDTBMQKLMHBBZIFUXMEEPR TDWCCRTHXEWWFXUQMAAQAKRML", "QZWMTDLHZZGKELWGLTKI  A ZUHGPAFYFTUKXVG SLHAALWGJB", "KSWFZKIKKENXSUNHBVPWRKATOJSFLRCSATFMNBDTUNYUTQKUNH", "EFEIXTCLQYKVTMNOZTLMUWMWSWQHHGFCRB SEEBZISPVMIXOVI", "ITLAMJAZMXQXFIGVBNAJTRNCIIHTUGESLKLUHYZJHXDBGXJPGC", "KFFUTKF IPKFMDHEPTOAPIJZKFFZBJILDVMVWUGJMERUQHHOXT", "EV ASCADISAFGVJZZKMZPEHILGEBVOVNFYBUMROM SIIMTETVC", "BAIQQKU V WMODOQYQHNMQXMEUNVTWXRKHBRAWZUZJXBHETKPR", "WQXBVCOMZWZWFXDPAUQTZVPJQRLDESWYIFXBARAAPHYUMOLYZY", "SLYKSWKBKULIDIXDLTGHSNMXSNLNSNPEEXRGTPKOIXVSUMWA U", "UNFDVZUENYWQ CPMJWZMZALGEOLLTSGDTAWUJVNI TVHSBCOR ", "RANDIOWNESJBDBQOEVOCBSFX YACUFBYVNJIRXHROOJIKOEKEL", "HIPEZLPKJSCQF XAMZQNSJZHE  KWJWV JHZIAKAZMZLRGKOYG", "HDQYGYRUQVQJFGWBMOMSIDETI OGIWESUGBXQDJVYHUJWBEFTO", "BWGDBUVR VWCZVKBATQX IYWARAPACJWBXFBJMGXBLHQTYWNMQ", "CZRVZRORQCOZMMOWHZQLIGTW NPKXIAIOVFJSMOY SRW RWPSY", "AZEDURV CYZI  VOVKTTPAAEYBGYFBBDXGMRZGUYBICWZHPJLI" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case49() {
    String[] names = { "JFWVWRAXWGBOYLQYVXFFSOFSWETXXQPZZ QKTRUWWFGQZYCAGW", "KYNYXPNFWJRLATEURKBPLLNQEJVBXE D WVGB VFCMHRTUQ AN", "NFMZHVDLKMAFTGRSPXFJXXXJQWPDSNIMICCBKGEUFRNOZDLCUL", "OXQQOQIHTNOJUPNWTGQAERJ IVKKDZEVFHEFQSTGB DRZIJLRB", "PMJQNQCPPSYZ RINF MQWENAMORMZIWSAVFHWGCBBQGYXET KC", "S EMGHYZLPEHDTSENGUFZUOJCUALCFMAFKVDGTPMFSXJFECWIO", "TSBYVRRBAZRGCAPEPPEXNEKSYWCWF MSKJMTMPUELWNOBPAROL", "UOJOIZMZEMPR RCKW BFMYF KKNVKGLCJHFG CEOLEIWAVEQPQ" };
    String[] lostTo = { "NFMZHVDLKMAFTGRSPXFJXXXJQWPDSNIMICCBKGEUFRNOZDLCUL", "PMJQNQCPPSYZ RINF MQWENAMORMZIWSAVFHWGCBBQGYXET KC", "", "UOJOIZMZEMPR RCKW BFMYF KKNVKGLCJHFG CEOLEIWAVEQPQ", "NFMZHVDLKMAFTGRSPXFJXXXJQWPDSNIMICCBKGEUFRNOZDLCUL", "PMJQNQCPPSYZ RINF MQWENAMORMZIWSAVFHWGCBBQGYXET KC", "S EMGHYZLPEHDTSENGUFZUOJCUALCFMAFKVDGTPMFSXJFECWIO", "NFMZHVDLKMAFTGRSPXFJXXXJQWPDSNIMICCBKGEUFRNOZDLCUL" };
    assertArrayEquals(new String[] { "NFMZHVDLKMAFTGRSPXFJXXXJQWPDSNIMICCBKGEUFRNOZDLCUL", "PMJQNQCPPSYZ RINF MQWENAMORMZIWSAVFHWGCBBQGYXET KC", "UOJOIZMZEMPR RCKW BFMYF KKNVKGLCJHFG CEOLEIWAVEQPQ", "S EMGHYZLPEHDTSENGUFZUOJCUALCFMAFKVDGTPMFSXJFECWIO", "JFWVWRAXWGBOYLQYVXFFSOFSWETXXQPZZ QKTRUWWFGQZYCAGW", "KYNYXPNFWJRLATEURKBPLLNQEJVBXE D WVGB VFCMHRTUQ AN", "OXQQOQIHTNOJUPNWTGQAERJ IVKKDZEVFHEFQSTGB DRZIJLRB", "TSBYVRRBAZRGCAPEPPEXNEKSYWCWF MSKJMTMPUELWNOBPAROL" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case50() {
    String[] names = { "BRKZBGL JKTJXSUN IPIYS RFXJBZHRCJONZZCLTWNISTMKCMK", "C  VMNZUHLKQPPNUJMPAUINQJXMLWTRHBEMYWGXGHHIJGGXYWW", "CRMAMVOGTCXPWJCXFMFOOFFNVIRHUEWTULGNROFDVORNEERNJZ", "G OFSPKBXZDBKZDQLBQTLVJJDYPNMLIKVIKPBKBLQJOZCUVTWR", "HQWUQCFBLGKDONDZKZPAXVKYLSBLPKQZJW YBOSMPFAQFCGXGO", "IKQCFWKARIVSMAJ UXTAVVHQQSINUGR AEATV DYGLWHJLKHWZ", "LPIFQYK EXGBFBYWDXEIAJNHOLZLABEIEYMCKUNVAYSRLYHPJS", "M DEUGF DOVHAPTAZZCYJLMNFCINVNVDTNXE  HZLIFZLLUQKO", "NSTHWOLGQUGMCUXNQKXXHHSVKOQYCEVTAUC TDTCECPBKFCBRE", "QAFEDVMMZCVMDINDJCNNUXZOMRUDTKPVC PWRGLBMFDMMEHUU ", "SWVSWKLWNYSLJXDA LGVHXKJUKOLADOHE QFXDVTOHQ XVKSAK", "TYXSXFBKVOGCHYQKWYUNLWCKYVXOHKWWUIJEQOZEFJLXCMRQYL", "XSMCQLRACQUTXYXESCSY VEDZQEYHTPFPWIMJPLEDYFSHCWHRR", "XUGEYDAPPRIPVYEJYMFMT JCYVFUJMQICWLAHEMMJUOEQXHS W", "YDKRLTGWCLTYQYRCUNBCPYN S UUFVXSKF KOTYCRBRIINZYVU", "YSZPIZWWYKIORDEJRMZQJWLSRHQWLNMUASSDXVQJCYXBNCKCFC" };
    String[] lostTo = { "SWVSWKLWNYSLJXDA LGVHXKJUKOLADOHE QFXDVTOHQ XVKSAK", "CRMAMVOGTCXPWJCXFMFOOFFNVIRHUEWTULGNROFDVORNEERNJZ", "SWVSWKLWNYSLJXDA LGVHXKJUKOLADOHE QFXDVTOHQ XVKSAK", "YSZPIZWWYKIORDEJRMZQJWLSRHQWLNMUASSDXVQJCYXBNCKCFC", "XUGEYDAPPRIPVYEJYMFMT JCYVFUJMQICWLAHEMMJUOEQXHS W", "YSZPIZWWYKIORDEJRMZQJWLSRHQWLNMUASSDXVQJCYXBNCKCFC", "IKQCFWKARIVSMAJ UXTAVVHQQSINUGR AEATV DYGLWHJLKHWZ", "YDKRLTGWCLTYQYRCUNBCPYN S UUFVXSKF KOTYCRBRIINZYVU", "TYXSXFBKVOGCHYQKWYUNLWCKYVXOHKWWUIJEQOZEFJLXCMRQYL", "BRKZBGL JKTJXSUN IPIYS RFXJBZHRCJONZZCLTWNISTMKCMK", "", "SWVSWKLWNYSLJXDA LGVHXKJUKOLADOHE QFXDVTOHQ XVKSAK", "SWVSWKLWNYSLJXDA LGVHXKJUKOLADOHE QFXDVTOHQ XVKSAK", "CRMAMVOGTCXPWJCXFMFOOFFNVIRHUEWTULGNROFDVORNEERNJZ", "TYXSXFBKVOGCHYQKWYUNLWCKYVXOHKWWUIJEQOZEFJLXCMRQYL", "CRMAMVOGTCXPWJCXFMFOOFFNVIRHUEWTULGNROFDVORNEERNJZ" };
    assertArrayEquals(new String[] { "SWVSWKLWNYSLJXDA LGVHXKJUKOLADOHE QFXDVTOHQ XVKSAK", "CRMAMVOGTCXPWJCXFMFOOFFNVIRHUEWTULGNROFDVORNEERNJZ", "TYXSXFBKVOGCHYQKWYUNLWCKYVXOHKWWUIJEQOZEFJLXCMRQYL", "YSZPIZWWYKIORDEJRMZQJWLSRHQWLNMUASSDXVQJCYXBNCKCFC", "BRKZBGL JKTJXSUN IPIYS RFXJBZHRCJONZZCLTWNISTMKCMK", "XUGEYDAPPRIPVYEJYMFMT JCYVFUJMQICWLAHEMMJUOEQXHS W", "YDKRLTGWCLTYQYRCUNBCPYN S UUFVXSKF KOTYCRBRIINZYVU", "IKQCFWKARIVSMAJ UXTAVVHQQSINUGR AEATV DYGLWHJLKHWZ", "XSMCQLRACQUTXYXESCSY VEDZQEYHTPFPWIMJPLEDYFSHCWHRR", "C  VMNZUHLKQPPNUJMPAUINQJXMLWTRHBEMYWGXGHHIJGGXYWW", "NSTHWOLGQUGMCUXNQKXXHHSVKOQYCEVTAUC TDTCECPBKFCBRE", "G OFSPKBXZDBKZDQLBQTLVJJDYPNMLIKVIKPBKBLQJOZCUVTWR", "QAFEDVMMZCVMDINDJCNNUXZOMRUDTKPVC PWRGLBMFDMMEHUU ", "HQWUQCFBLGKDONDZKZPAXVKYLSBLPKQZJW YBOSMPFAQFCGXGO", "M DEUGF DOVHAPTAZZCYJLMNFCINVNVDTNXE  HZLIFZLLUQKO", "LPIFQYK EXGBFBYWDXEIAJNHOLZLABEIEYMCKUNVAYSRLYHPJS" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case51() {
    String[] names = { "DUKE", "SETON HALL", "ILLINOIS", "CINCINNATI", "NORTH CAROLINA", "TEXAS", "XAVIER", "MISSISSIPPI STATE" };
    String[] lostTo = { "", "DUKE", "DUKE", "ILLINOIS", "TEXAS", "XAVIER", "DUKE", "XAVIER" };
    assertArrayEquals(new String[] { "DUKE", "XAVIER", "ILLINOIS", "TEXAS", "SETON HALL", "MISSISSIPPI STATE", "CINCINNATI", "NORTH CAROLINA" }, tournamentranker.rankTeams(names, lostTo));
  }

  @Test
  public void case52() {
    String[] names = { "RODDICK", "SCHUETTLER", "FERREIRA", "AGASSI" };
    String[] lostTo = { "SCHUETTLER", "AGASSI", "AGASSI", "" };
    assertArrayEquals(new String[] { "AGASSI", "SCHUETTLER", "FERREIRA", "RODDICK" }, tournamentranker.rankTeams(names, lostTo));
  }

}
