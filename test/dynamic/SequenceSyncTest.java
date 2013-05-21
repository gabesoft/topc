package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SequenceSyncTest {
  SequenceSync sequencesync = new SequenceSync();

  @Test
  public void case1() {
    String[] transitions = { "1 1 1 1", "1 1 1 2", "0 2 2 2" };
    assertEquals(2, sequencesync.getLength(transitions));
  }

  @Test
  public void case2() {
    String[] transitions = { "1 1 1 1", "2 2 2 2", "3 3 3 3", "0 0 0 0" };
    assertEquals(-1, sequencesync.getLength(transitions));
  }

  @Test
  public void case3() {
    String[] transitions = { "0 0 0 0" };
    assertEquals(0, sequencesync.getLength(transitions));
  }

  @Test
  public void case4() {
    String[] transitions = { "1 1 1 0", "2 2 2 1", "3 3 3 2", "4 4 4 3", "5 5 5 5", "6 6 6 6", "7 7 7 0", "0 0 0 8", "8 8 8 8", "9 9 9 8" };
    assertEquals(15, sequencesync.getLength(transitions));
  }

  @Test
  public void case5() {
    String[] transitions = { "0 0 0 0", "1 1 1 1", "2 2 2 2", "3 3 3 3", "4 4 4 4", "5 5 5 5", "6 6 6 6", "7 7 7 7", "8 8 8 8", "9 9 9 9", "10 10 10 10", "11 11 11 11", "12 12 12 12", "13 13 13 13", "14 14 14 14", "15 15 15 15", "16 16 16 16", "17 17 17 17", "18 18 18 18", "19 19 19 19" };
    assertEquals(-1, sequencesync.getLength(transitions));
  }

  @Test
  public void case6() {
    String[] transitions = { "1 0 0 0", "2 1 1 1", "3 2 2 2", "4 3 3 3", "5 4 4 4", "6 5 5 5", "7 6 6 6", "8 7 7 7", "9 8 8 8", "10 9 9 9", "11 10 10 10", "12 11 11 11", "13 12 12 12", "14 13 13 13", "15 14 14 14", "16 15 15 15", "17 16 16 16", "18 17 17 17", "0 0 0 19", "19 19 19 19" };
    assertEquals(37, sequencesync.getLength(transitions));
  }

  @Test
  public void case7() {
    String[] transitions = { "0 0 0 0", "1 1 1 1", "2 2 2 2", "3 3 3 3", "4 4 4 4", "5 5 5 5", "6 6 6 6", "7 7 7 7", "8 8 8 8", "9 9 9 9", "10 10 10 10", "11 11 11 11", "12 12 12 12", "13 13 13 13", "14 14 14 14", "15 15 15 15", "16 16 16 16", "17 17 17 17", "19 19 19 19", "18 18 18 18" };
    assertEquals(-1, sequencesync.getLength(transitions));
  }

  @Test
  public void case8() {
    String[] transitions = { "1 0 0 0", "2 1 1 1", "3 2 2 2", "0 0 3 3" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case9() {
    String[] transitions = { "1 0 0 0", "2 1 1 1", "3 2 2 2", "4 3 3 3", "5 4 4 4", "6 5 5 5", "7 6 6 6", "8 7 7 7", "9 8 8 8", "10 9 9 9", "11 10 10 10", "12 11 11 11", "13 12 12 12", "14 13 13 13", "15 14 14 14", "16 15 15 15", "17 16 16 16", "18 17 17 17", "19 18 18 18", "0 0 19 19" };
    assertEquals(361, sequencesync.getLength(transitions));
  }

  @Test
  public void case10() {
    String[] transitions = { "1 0 1 0", "2 1 2 1", "3 2 3 2", "4 3 4 3", "5 4 5 4", "6 5 6 5", "7 6 7 6", "8 7 8 7", "9 8 9 8", "10 9 10 9", "11 10 11 10", "12 11 12 11", "13 12 13 12", "14 13 14 13", "15 14 15 14", "16 15 16 15", "17 16 17 16", "18 17 18 17", "19 18 19 18", "0 0 0 19" };
    assertEquals(361, sequencesync.getLength(transitions));
  }

  @Test
  public void case11() {
    String[] transitions = { "10 0 1 0", "2 1 2 1", "3 2 3 2", "4 3 4 3", "5 4 5 4", "6 5 6 5", "7 6 7 6", "8 7 8 7", "9 8 9 8", "10 9 10 9", "11 10 11 10", "12 11 12 11", "13 12 13 12", "14 13 14 13", "15 14 15 14", "16 15 16 15", "17 16 17 16", "18 17 18 17", "19 18 19 18", "0 0 0 19" };
    assertEquals(71, sequencesync.getLength(transitions));
  }

  @Test
  public void case12() {
    String[] transitions = { "1 0 0 0", "2 1 1 1", "3 2 2 2", "4 3 3 3", "5 4 4 4", "6 5 5 5", "7 6 6 6", "8 7 7 7", "9 8 8 8", "10 9 9 9", "11 10 10 10", "12 11 11 11", "13 12 12 12", "14 13 13 13", "15 14 14 14", "16 15 15 15", "17 16 16 16", "18 17 17 17", "19 18 18 18", "0 19 19 19" };
    assertEquals(-1, sequencesync.getLength(transitions));
  }

  @Test
  public void case13() {
    String[] transitions = { "1 0 0 0", "2 1 1 1", "3 2 2 2", "4 3 3 3", "5 4 4 4", "6 5 5 5", "7 6 6 6", "8 7 7 7", "9 8 8 8", "10 9 9 9", "11 10 10 10", "12 11 11 11", "13 12 12 12", "14 13 13 13", "15 14 14 14", "16 15 15 15", "17 16 16 16", "18 17 17 17", "19 18 18 18", "18 19 19 19" };
    assertEquals(-1, sequencesync.getLength(transitions));
  }

  @Test
  public void case14() {
    String[] transitions = { "1 0 0 0", "2 1 1 1", "3 2 2 2", "4 3 3 3", "5 4 4 4", "6 5 5 5", "7 6 6 6", "8 7 7 7", "9 8 8 8", "10 9 9 9", "0 0 19 19", "11 11 10 11", "12 12 11 12", "13 13 12 13", "14 14 13 14", "15 15 14 15", "16 16 15 16", "17 17 16 17", "18 18 17 18", "19 19 18 19" };
    assertEquals(38, sequencesync.getLength(transitions));
  }

  @Test
  public void case15() {
    String[] transitions = { "1 0 0 0", "2 1 1 1", "3 2 2 2", "4 3 3 3", "5 4 4 4", "6 5 5 5", "7 6 6 6", "8 7 7 7", "9 8 8 8", "10 9 9 9", "0 0 10 10", "11 11 19 19", "12 12 11 12", "13 13 12 13", "14 14 13 14", "15 15 14 15", "16 16 15 16", "17 17 16 17", "18 18 17 18", "19 19 18 19" };
    assertEquals(-1, sequencesync.getLength(transitions));
  }

  @Test
  public void case16() {
    String[] transitions = { "1 0 0 0", "2 1 1 1", "3 2 2 2", "4 3 3 3", "5 4 4 4", "6 5 5 5", "7 6 6 6", "8 7 7 7", "9 8 8 8", "10 9 9 9", "0 0 10 10", "11 0 19 19", "12 12 11 12", "13 13 12 13", "14 14 13 14", "15 15 14 15", "16 16 15 16", "17 17 16 17", "18 18 17 18", "19 19 18 19" };
    assertEquals(108, sequencesync.getLength(transitions));
  }

  @Test
  public void case17() {
    String[] transitions = { "7 8 0 0", "8 14 1 1", "13 2 2 2", "5 5 3 3", "14 11 4 4", "18 16 5 5", "12 13 6 6", "9 1 7 7", "2 8 8 8", "18 3 9 9", "4 17 10 10", "8 17 11 11", "7 3 12 12", "15 7 13 13", "1 12 14 14", "3 19 15 15", "18 1 16 16", "1 8 17 17", "14 18 18 18", "9 9 19 19" };
    assertEquals(22, sequencesync.getLength(transitions));
  }

  @Test
  public void case18() {
    String[] transitions = { "17 11 0 0", "16 0 1 1", "6 2 2 2", "14 12 3 3", "15 4 4 4", "4 12 5 5", "14 17 6 6", "19 13 7 7", "9 17 8 8", "5 3 9 9", "8 16 10 10", "0 8 11 11", "13 1 12 12", "7 3 13 13", "2 6 14 14", "1 16 15 15", "8 14 16 16", "18 9 17 17", "0 1 18 18", "14 8 19 19" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case19() {
    String[] transitions = { "18 17 0 0", "17 6 1 1", "19 0 2 2", "15 6 3 3", "7 0 4 4", "4 10 5 5", "7 3 6 6", "18 12 7 7", "6 14 8 8", "10 9 9 9", "3 4 10 10", "0 7 11 11", "8 9 12 12", "3 9 13 13", "9 8 14 14", "8 18 15 15", "8 3 16 16", "14 5 17 17", "17 17 18 18", "14 0 19 19" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case20() {
    String[] transitions = { "10 4 0 0", "5 7 1 1", "6 6 2 2", "13 14 3 3", "12 9 4 4", "19 15 5 5", "19 16 6 6", "9 19 7 7", "1 0 8 8", "11 18 9 9", "13 6 10 10", "19 14 11 11", "17 8 12 12", "15 3 13 13", "8 17 14 14", "12 4 15 15", "14 12 16 16", "7 3 17 17", "2 12 18 18", "18 1 19 19" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case21() {
    String[] transitions = { "7 0 0 0", "1 2 1 1", "15 3 2 2", "7 15 3 3", "0 7 4 4", "7 11 5 5", "11 1 6 6", "2 1 7 7", "13 16 8 8", "17 17 9 9", "11 11 10 10", "0 9 11 11", "12 10 12 12", "9 17 13 13", "8 4 14 14", "10 7 15 15", "10 17 16 16", "3 19 17 17", "9 13 18 18", "10 15 19 19" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case22() {
    String[] transitions = { "8 11 0 0", "2 19 1 1", "8 4 2 2", "10 5 3 3", "18 6 4 4", "7 7 5 5", "2 15 6 6", "15 9 7 7", "6 5 8 8", "8 0 9 9", "11 15 10 10", "11 12 11 11", "5 18 12 12", "8 13 13 13", "10 13 14 14", "5 8 15 15", "8 6 16 16", "2 19 17 17", "18 6 18 18", "10 6 19 19" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case23() {
    String[] transitions = { "4 1 0 0", "17 2 1 1", "6 0 2 2", "17 6 3 3", "8 8 4 4", "2 13 5 5", "16 17 6 6", "6 8 7 7", "14 6 8 8", "3 1 9 9", "3 10 10 10", "18 16 11 11", "8 15 12 12", "0 11 13 13", "19 4 14 14", "11 14 15 15", "15 5 16 16", "1 7 17 17", "16 10 18 18", "13 15 19 19" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case24() {
    String[] transitions = { "13 9 0 0", "11 3 1 1", "9 3 2 2", "5 13 3 3", "14 6 4 4", "8 19 5 5", "9 13 6 6", "7 7 7 7", "10 3 8 8", "3 10 9 9", "5 9 10 10", "17 7 11 11", "18 1 12 12", "2 15 13 13", "1 0 14 14", "17 13 15 15", "12 2 16 16", "4 12 17 17", "16 1 18 18", "19 5 19 19" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case25() {
    String[] transitions = { "15 10 0 0", "17 2 1 1", "13 19 2 2", "19 0 3 3", "10 16 4 4", "13 15 5 5", "14 19 6 6", "3 4 7 7", "4 14 8 8", "12 11 9 9", "5 0 10 10", "11 11 11 11", "2 17 12 12", "8 16 13 13", "15 14 14 14", "7 13 15 15", "18 13 16 16", "17 9 17 17", "16 5 18 18", "1 18 19 19" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case26() {
    String[] transitions = { "15 11 0 0", "2 12 1 1", "1 14 2 2", "18 5 3 3", "13 7 4 4", "4 17 5 5", "3 0 6 6", "14 8 7 7", "1 7 8 8", "11 9 9 9", "15 6 10 10", "9 16 11 11", "9 14 12 12", "10 11 13 13", "7 1 14 14", "4 2 15 15", "3 3 16 16", "14 14 17 17", "4 1 18 18", "17 11 19 19" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case27() {
    String[] transitions = { "18 6 0 0", "9 5 1 1", "19 0 2 2", "18 0 3 3", "12 10 4 4", "8 14 5 5", "6 1 6 6", "17 19 7 7", "4 18 8 8", "11 8 9 9", "5 10 10 10", "17 3 11 11", "12 19 12 12", "18 6 13 13", "18 2 14 14", "11 13 15 15", "1 6 16 16", "9 5 17 17", "14 8 18 18", "16 11 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case28() {
    String[] transitions = { "17 15 0 0", "6 14 1 1", "1 10 2 2", "10 2 3 3", "11 19 4 4", "8 14 5 5", "0 18 6 6", "13 7 7 7", "1 6 8 8", "18 3 9 9", "4 1 10 10", "3 0 11 11", "12 18 12 12", "2 2 13 13", "11 5 14 14", "15 11 15 15", "11 9 16 16", "18 5 17 17", "14 6 18 18", "2 15 19 19" };
    assertEquals(18, sequencesync.getLength(transitions));
  }

  @Test
  public void case29() {
    String[] transitions = { "19 7 0 0", "18 12 1 1", "14 12 2 2", "13 1 3 3", "1 11 4 4", "11 1 5 5", "10 18 6 6", "15 1 7 7", "17 15 8 8", "15 13 9 9", "9 7 10 10", "2 19 11 11", "0 9 12 12", "7 11 13 13", "3 18 14 14", "5 16 15 15", "10 6 16 16", "2 15 17 17", "16 8 18 18", "19 11 19 19" };
    assertEquals(17, sequencesync.getLength(transitions));
  }

  @Test
  public void case30() {
    String[] transitions = { "1 4 0 0", "5 1 1 1", "10 11 2 2", "17 9 3 3", "9 16 4 4", "14 5 5 5", "12 18 6 6", "15 10 7 7", "14 11 8 8", "4 0 9 9", "0 14 10 10", "0 18 11 11", "2 2 12 12", "17 3 13 13", "3 14 14 14", "11 2 15 15", "2 9 16 16", "11 4 17 17", "14 18 18 18", "2 12 19 19" };
    assertEquals(27, sequencesync.getLength(transitions));
  }

  @Test
  public void case31() {
    String[] transitions = { "0 11 0 0", "12 17 1 1", "12 15 2 2", "14 1 3 3", "5 0 4 4", "13 19 5 5", "11 5 6 6", "17 19 7 7", "15 8 8 8", "2 16 9 9", "9 12 10 10", "14 18 11 11", "13 7 12 12", "6 11 13 13", "17 17 14 14", "16 0 15 15", "3 12 16 16", "12 10 17 17", "8 15 18 18", "10 11 19 19" };
    assertEquals(17, sequencesync.getLength(transitions));
  }

  @Test
  public void case32() {
    String[] transitions = { "4 18 0 0", "18 7 1 1", "17 13 2 2", "6 12 3 3", "14 18 4 4", "19 11 5 5", "0 15 6 6", "10 19 7 7", "11 6 8 8", "3 8 9 9", "12 4 10 10", "1 2 11 11", "5 14 12 12", "4 9 13 13", "6 15 14 14", "5 5 15 15", "13 14 16 16", "7 13 17 17", "7 5 18 18", "11 14 19 19" };
    assertEquals(20, sequencesync.getLength(transitions));
  }

  @Test
  public void case33() {
    String[] transitions = { "7 2 0 0", "4 13 1 1", "12 15 2 2", "15 1 3 3", "13 7 4 4", "10 15 5 5", "3 16 6 6", "18 3 7 7", "12 16 8 8", "14 4 9 9", "5 3 10 10", "14 9 11 11", "0 4 12 12", "3 2 13 13", "6 10 14 14", "19 8 15 15", "2 11 16 16", "3 13 17 17", "5 5 18 18", "8 14 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case34() {
    String[] transitions = { "6 9 0 0", "2 7 1 1", "12 13 2 2", "7 12 3 3", "9 2 4 4", "15 8 5 5", "6 10 6 6", "2 9 7 7", "3 11 8 8", "14 6 9 9", "10 8 10 10", "6 5 11 11", "13 14 12 12", "18 4 13 13", "16 17 14 14", "2 14 15 15", "0 17 16 16", "7 4 17 17", "1 2 18 18", "13 3 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case35() {
    String[] transitions = { "17 6 0 0", "4 15 1 1", "1 3 2 2", "12 16 3 3", "7 1 4 4", "10 8 5 5", "0 12 6 6", "3 1 7 7", "6 19 8 8", "14 7 9 9", "11 6 10 10", "16 0 11 11", "9 0 12 12", "3 12 13 13", "13 11 14 14", "2 4 15 15", "6 5 16 16", "3 11 17 17", "15 10 18 18", "5 3 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case36() {
    String[] transitions = { "7 7 0 0", "0 19 1 1", "10 3 2 2", "4 18 3 3", "2 1 4 4", "11 7 5 5", "14 16 6 6", "6 14 7 7", "16 12 8 8", "9 2 9 9", "4 0 10 10", "17 9 11 11", "1 16 12 12", "17 11 13 13", "18 6 14 14", "6 6 15 15", "15 2 16 16", "1 4 17 17", "8 8 18 18", "7 13 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case37() {
    String[] transitions = { "16 16 0 0", "16 3 1 1", "0 0 2 2", "13 19 3 3", "14 6 4 4", "0 13 5 5", "11 17 6 6", "11 9 7 7", "6 4 8 8", "10 2 9 9", "8 10 10 10", "5 5 11 11", "8 5 12 12", "7 18 13 13", "19 17 14 14", "9 12 15 15", "15 1 16 16", "19 7 17 17", "14 3 18 18", "16 6 19 19" };
    assertEquals(17, sequencesync.getLength(transitions));
  }

  @Test
  public void case38() {
    String[] transitions = { "18 14 0 0", "9 9 1 1", "14 3 2 2", "3 12 3 3", "16 18 4 4", "15 1 5 5", "16 10 6 6", "7 13 7 7", "14 15 8 8", "18 5 9 9", "7 2 10 10", "5 7 11 11", "17 5 12 12", "18 6 13 13", "13 5 14 14", "2 7 15 15", "17 1 16 16", "16 18 17 17", "6 11 18 18", "5 4 19 19" };
    assertEquals(17, sequencesync.getLength(transitions));
  }

  @Test
  public void case39() {
    String[] transitions = { "1 9 0 0", "18 18 1 1", "2 17 2 2", "9 17 3 3", "9 19 4 4", "2 14 5 5", "15 18 6 6", "5 1 7 7", "16 2 8 8", "6 12 9 9", "17 16 10 10", "6 2 11 11", "8 17 12 12", "6 12 13 13", "10 10 14 14", "1 8 15 15", "10 6 16 16", "12 10 17 17", "6 13 18 18", "2 14 19 19" };
    assertEquals(18, sequencesync.getLength(transitions));
  }

  @Test
  public void case40() {
    String[] transitions = { "2 0 0 0", "11 12 1 1", "12 7 2 2", "12 10 3 3", "5 13 4 4", "11 12 5 5", "12 6 6 6", "0 6 7 7", "11 9 8 8", "10 19 9 9", "7 13 10 10", "0 8 11 11", "8 15 12 12", "18 5 13 13", "6 10 14 14", "7 1 15 15", "2 5 16 16", "4 0 17 17", "8 9 18 18", "16 11 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case41() {
    String[] transitions = { "4 3 0 0", "9 10 1 1", "11 15 2 2", "4 9 3 3", "1 14 4 4", "10 11 5 5", "12 12 6 6", "0 17 7 7", "13 11 8 8", "4 5 9 9", "10 13 10 10", "4 18 11 11", "4 4 12 12", "12 10 13 13", "8 4 14 14", "7 15 15 15", "9 3 16 16", "5 14 17 17", "15 11 18 18", "12 6 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case42() {
    String[] transitions = { "6 18 0 0", "4 15 1 1", "0 10 2 2", "19 6 3 3", "16 8 4 4", "14 0 5 5", "12 0 6 6", "18 2 7 7", "17 14 8 8", "14 19 9 9", "6 8 10 10", "2 3 11 11", "7 13 12 12", "15 8 13 13", "9 8 14 14", "2 17 15 15", "0 18 16 16", "3 12 17 17", "13 7 18 18", "1 6 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case43() {
    String[] transitions = { "0 7 0 0", "12 3 1 1", "14 8 2 2", "2 18 3 3", "6 17 4 4", "0 5 5 5", "15 5 6 6", "6 2 7 7", "9 4 8 8", "1 12 9 9", "8 7 10 10", "17 5 11 11", "8 1 12 12", "16 10 13 13", "5 9 14 14", "15 2 15 15", "3 4 16 16", "18 4 17 17", "12 10 18 18", "12 17 19 19" };
    assertEquals(18, sequencesync.getLength(transitions));
  }

  @Test
  public void case44() {
    String[] transitions = { "3 14 0 0", "7 17 1 1", "6 12 2 2", "12 6 3 3", "0 3 4 4", "14 9 5 5", "9 17 6 6", "4 2 7 7", "4 4 8 8", "17 13 9 9", "6 1 10 10", "11 2 11 11", "4 14 12 12", "14 4 13 13", "1 19 14 14", "5 18 15 15", "18 19 16 16", "15 10 17 17", "4 9 18 18", "5 7 19 19" };
    assertEquals(18, sequencesync.getLength(transitions));
  }

  @Test
  public void case45() {
    String[] transitions = { "5 6 0 0", "5 16 1 1", "19 11 2 2", "8 13 3 3", "17 8 4 4", "17 1 5 5", "12 18 6 6", "11 2 7 7", "2 14 8 8", "11 5 9 9", "8 15 10 10", "10 16 11 11", "2 15 12 12", "11 19 13 13", "14 18 14 14", "6 8 15 15", "7 1 16 16", "9 17 17 17", "0 10 18 18", "16 19 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case46() {
    String[] transitions = { "12 15 0 0", "13 11 1 1", "10 11 2 2", "2 1 3 3", "17 7 4 4", "5 6 5 5", "2 15 6 6", "5 1 7 7", "13 5 8 8", "4 16 9 9", "19 14 10 10", "11 18 11 11", "15 12 12 12", "3 5 13 13", "12 7 14 14", "18 3 15 15", "16 15 16 16", "0 4 17 17", "14 16 18 18", "16 7 19 19" };
    assertEquals(18, sequencesync.getLength(transitions));
  }

  @Test
  public void case47() {
    String[] transitions = { "15 4 0 0", "10 6 1 1", "7 8 2 2", "2 8 3 3", "10 15 4 4", "6 10 5 5", "14 10 6 6", "9 5 7 7", "13 11 8 8", "10 17 9 9", "6 8 10 10", "2 13 11 11", "5 9 12 12", "4 18 13 13", "15 4 14 14", "9 14 15 15", "6 15 16 16", "12 5 17 17", "8 13 18 18", "7 3 19 19" };
    assertEquals(17, sequencesync.getLength(transitions));
  }

  @Test
  public void case48() {
    String[] transitions = { "14 0 0 0", "11 12 1 1", "11 12 2 2", "7 13 3 3", "0 9 4 4", "1 10 5 5", "3 16 6 6", "6 9 7 7", "7 4 8 8", "18 14 9 9", "13 16 10 10", "12 16 11 11", "16 3 12 12", "2 1 13 13", "19 8 14 14", "1 18 15 15", "9 11 16 16", "5 6 17 17", "6 17 18 18", "0 18 19 19" };
    assertEquals(17, sequencesync.getLength(transitions));
  }

  @Test
  public void case49() {
    String[] transitions = { "4 19 0 0", "16 4 1 1", "2 4 2 2", "15 6 3 3", "13 10 4 4", "12 2 5 5", "19 15 6 6", "15 16 7 7", "19 15 8 8", "14 14 9 9", "15 5 10 10", "17 11 11 11", "19 4 12 12", "11 19 13 13", "4 12 14 14", "14 9 15 15", "7 11 16 16", "8 1 17 17", "11 15 18 18", "9 2 19 19" };
    assertEquals(17, sequencesync.getLength(transitions));
  }

  @Test
  public void case50() {
    String[] transitions = { "13 4 0 0", "2 19 1 1", "9 10 2 2", "11 9 3 3", "14 2 4 4", "6 14 5 5", "6 8 6 6", "19 5 7 7", "4 15 8 8", "2 8 9 9", "14 10 10 10", "12 10 11 11", "12 12 12 12", "18 6 13 13", "8 16 14 14", "9 8 15 15", "3 0 16 16", "5 6 17 17", "3 8 18 18", "15 1 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case51() {
    String[] transitions = { "9 18 0 0", "3 3 1 1", "6 5 2 2", "19 17 3 3", "2 8 4 4", "14 13 5 5", "13 3 6 6", "8 11 7 7", "0 2 8 8", "11 19 9 9", "11 17 10 10", "13 7 11 11", "1 2 12 12", "7 8 13 13", "19 6 14 14", "5 13 15 15", "13 5 16 16", "2 7 17 17", "15 17 18 18", "8 0 19 19" };
    assertEquals(19, sequencesync.getLength(transitions));
  }

  @Test
  public void case52() {
    String[] transitions = { "11 9 0 0", "16 10 1 1", "2 11 2 2", "0 6 3 3", "9 7 4 4", "7 14 5 5", "3 10 6 6", "16 13 7 7", "19 13 8 8", "12 17 9 9", "8 11 10 10", "6 3 11 11", "8 15 12 12", "2 13 13 13", "6 15 14 14", "2 1 15 15", "5 15 16 16", "11 0 17 17", "4 1 18 18", "19 7 19 19" };
    assertEquals(19, sequencesync.getLength(transitions));
  }

  @Test
  public void case53() {
    String[] transitions = { "16 0 0 0", "7 8 1 1", "1 18 2 2", "17 16 3 3", "18 11 4 4", "13 18 5 5", "18 1 6 6", "11 1 7 7", "9 5 8 8", "10 10 9 9", "1 7 10 10", "3 6 11 11", "17 17 12 12", "4 12 13 13", "10 12 14 14", "0 0 15 15", "15 18 16 16", "19 10 17 17", "0 13 18 18", "7 11 19 19" };
    assertEquals(17, sequencesync.getLength(transitions));
  }

  @Test
  public void case54() {
    String[] transitions = { "15 18 0 0", "4 12 1 1", "4 5 2 2", "12 6 3 3", "1 17 4 4", "6 0 5 5", "2 11 6 6", "9 15 7 7", "17 1 8 8", "4 19 9 9", "16 14 10 10", "11 15 11 11", "11 14 12 12", "13 3 13 13", "18 1 14 14", "1 11 15 15", "16 11 16 16", "14 13 17 17", "0 19 18 18", "8 18 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case55() {
    String[] transitions = { "2 6 0 0", "7 8 1 1", "17 13 2 2", "19 7 3 3", "10 0 4 4", "1 7 5 5", "12 9 6 6", "13 1 7 7", "3 5 8 8", "6 6 9 9", "11 17 10 10", "15 5 11 11", "10 11 12 12", "8 16 13 13", "9 15 14 14", "6 15 15 15", "7 2 16 16", "8 3 17 17", "19 12 18 18", "5 8 19 19" };
    assertEquals(16, sequencesync.getLength(transitions));
  }

  @Test
  public void case56() {
    String[] transitions = { "6 18 0 0", "18 0 1 1", "1 12 2 2", "15 4 3 3", "10 7 4 4", "9 19 5 5", "8 6 6 6", "3 15 7 7", "11 7 8 8", "0 17 9 9", "5 11 10 10", "12 1 11 11", "18 2 12 12", "16 18 13 13", "5 15 14 14", "19 8 15 15", "4 19 16 16", "9 0 17 17", "6 10 18 18", "7 13 19 19" };
    assertEquals(18, sequencesync.getLength(transitions));
  }

  @Test
  public void case57() {
    String[] transitions = { "10 17 8 3", "13 11 18 14", "15 0 18 13", "11 3 3 2", "17 8 0 10", "2 6 5 9", "17 15 6 19", "3 10 6 14", "8 14 5 9", "13 15 10 5", "0 4 17 10", "19 6 15 15", "19 9 16 1", "0 18 4 10", "7 2 19 6", "3 0 14 15", "16 4 1 7", "17 19 2 8", "8 9 7 8", "9 16 11 18" };
    assertEquals(11, sequencesync.getLength(transitions));
  }

  @Test
  public void case58() {
    String[] transitions = { "6 13 11 7", "0 8 8 9", "19 5 4 17", "5 3 16 13", "12 15 6 7", "14 6 19 6", "7 0 19 0", "1 19 0 6", "8 17 14 6", "18 11 15 18", "9 12 13 16", "8 5 7 4", "10 8 3 2", "7 7 15 16", "17 11 18 15", "4 18 1 12", "0 16 17 11", "19 14 18 18", "3 15 3 18", "16 12 6 19" };
    assertEquals(11, sequencesync.getLength(transitions));
  }

  @Test
  public void case59() {
    String[] transitions = { "10 14 7 7", "19 6 2 14", "2 17 19 8", "19 0 5 17", "12 18 9 5", "4 3 18 10", "7 8 1 19", "9 7 0 4", "12 19 16 10", "8 6 7 0", "15 13 6 17", "13 3 15 14", "15 1 19 7", "17 13 1 14", "1 0 19 18", "4 9 4 1", "6 5 17 4", "6 19 4 3", "0 14 6 16", "3 16 15 13" };
    assertEquals(11, sequencesync.getLength(transitions));
  }

  @Test
  public void case60() {
    String[] transitions = { "10 15 1 5", "14 8 8 2", "11 7 15 9", "17 18 2 10", "4 18 3 10", "1 8 16 3", "17 4 3 0", "7 8 4 2", "13 1 13 3", "19 8 19 17", "13 13 6 5", "15 6 6 4", "11 2 10 11", "1 3 5 13", "8 0 15 14", "3 12 4 7", "6 19 6 8", "18 11 3 8", "4 15 15 9", "12 6 11 16" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case61() {
    String[] transitions = { "12 9 12 8", "13 19 5 14", "3 0 17 3", "6 6 4 14", "14 16 3 1", "18 15 15 8", "9 12 9 2", "14 15 14 5", "0 18 9 6", "18 17 13 13", "14 0 5 15", "16 1 8 12", "16 11 19 7", "4 13 1 17", "11 3 11 9", "14 2 12 6", "6 13 16 11", "5 17 10 15", "12 2 1 7", "19 19 3 3" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case62() {
    String[] transitions = { "19 8 3 2", "11 0 14 0", "2 10 14 17", "18 0 18 16", "18 9 12 3", "2 18 2 8", "12 4 3 14", "15 6 8 0", "8 7 0 13", "10 5 15 2", "14 4 13 18", "19 15 5 4", "14 19 4 8", "18 2 19 19", "17 13 13 8", "7 6 12 12", "7 11 16 11", "6 13 14 3", "3 4 18 10", "7 5 8 0" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case63() {
    String[] transitions = { "10 1 14 10", "1 16 3 12", "10 13 18 5", "3 3 6 6", "5 6 13 18", "11 6 11 3", "8 11 12 1", "4 19 13 14", "10 10 9 16", "17 16 6 8", "6 19 0 5", "16 2 7 12", "4 14 6 17", "19 7 8 5", "6 4 11 0", "16 0 11 16", "19 13 17 7", "14 19 7 4", "12 3 17 6", "11 8 5 9" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case64() {
    String[] transitions = { "10 13 4 12", "17 13 17 17", "6 19 14 14", "12 1 16 12", "16 1 12 13", "9 6 19 8", "15 5 6 10", "16 6 4 10", "1 12 16 5", "9 12 19 12", "11 16 6 10", "15 19 17 8", "2 18 1 0", "2 18 5 14", "14 3 5 15", "4 19 5 9", "17 0 4 14", "6 15 8 1", "7 5 6 16", "18 1 1 2" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case65() {
    String[] transitions = { "13 15 17 4", "7 14 10 0", "6 19 9 8", "13 3 10 19", "4 5 16 16", "7 4 12 4", "18 19 12 19", "15 11 9 3", "14 11 6 2", "19 5 5 6", "10 3 1 1", "5 17 8 17", "4 7 7 16", "8 5 8 13", "16 0 3 14", "14 1 11 6", "17 8 19 4", "19 1 2 5", "8 6 18 8", "12 1 2 17" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case66() {
    String[] transitions = { "10 18 18 2", "1 10 14 0", "6 11 4 15", "17 16 17 19", "12 3 8 17", "0 14 5 0", "16 13 7 5", "19 2 15 14", "16 11 4 10", "7 16 4 4", "2 7 9 9", "15 17 12 13", "1 8 11 10", "4 9 5 14", "4 4 4 8", "17 11 5 12", "14 8 10 9", "9 5 0 13", "17 4 6 16", "10 19 6 3" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case67() {
    String[] transitions = { "16 4 9 10", "2 14 0 4", "10 9 17 2", "13 19 2 19", "3 0 3 8", "6 11 7 14", "7 4 18 17", "7 2 13 16", "5 14 16 6", "11 4 11 5", "17 5 9 3", "4 1 1 1", "5 18 5 12", "11 13 14 4", "3 5 19 18", "11 7 15 10", "19 12 14 4", "3 7 2 7", "4 8 11 19", "14 11 11 3" };
    assertEquals(10, sequencesync.getLength(transitions));
  }

  @Test
  public void case68() {
    String[] transitions = { "2 3 8 6", "10 6 7 13", "19 14 5 15", "14 11 0 14", "6 15 3 1", "0 16 19 4", "19 13 10 17", "10 18 17 14", "7 5 16 16", "15 8 19 12", "9 19 15 10", "11 10 11 9", "4 1 18 7", "2 18 17 19", "16 0 0 1", "17 1 4 12", "3 4 1 15", "8 7 5 9", "5 14 19 16", "7 18 14 13" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case69() {
    String[] transitions = { "5 9 17 13", "18 7 11 3", "2 11 0 18", "1 16 18 16", "0 18 6 17", "17 19 3 15", "19 14 14 6", "8 4 4 17", "10 6 16 2", "16 1 2 9", "0 0 7 7", "9 13 1 4", "15 11 12 17", "8 12 15 0", "19 0 5 0", "14 6 13 5", "7 7 2 5", "1 17 15 6", "15 5 9 9", "0 6 3 15" };
    assertEquals(9, sequencesync.getLength(transitions));
  }

  @Test
  public void case70() {
    String[] transitions = { "1 1 1 0", "2 2 2 1", "3 3 3 2", "4 4 4 3", "5 5 5 5", "6 6 6 6", "7 7 7 0", "0 0 0 8", "9 9 9 8", "10 10 10 10", "11 11 11 11", "12 12 12 12", "13 13 13 13", "14 14 14 14", "14 14 14 14", "14 14 14 14", "14 14 14 14", "14 14 14 14", "14 14 14 14", "9 9 9 8" };
    assertEquals(21, sequencesync.getLength(transitions));
  }

  @Test
  public void case71() {
    String[] transitions = { "0 0 0 0", "19 19 1 0", "19 19 1 2", "19 19 2 3", "19 19 3 4", "19 4 5 5", "19 5 6 6", "19 6 7 7", "19 7 8 8", "19 8 9 9", "19 9 10 10", "10 11 11 11", "11 12 12 12", "12 13 13 13", "13 14 14 14", "14 15 15 15", "15 16 16 16", "16 17 17 17", "17 18 18 18", "18 19 19 19" };
    assertEquals(102, sequencesync.getLength(transitions));
  }

  @Test
  public void case72() {
    String[] transitions = { "1 1 1 0", "2 2 2 1", "3 3 3 2", "4 4 4 3", "5 5 5 5", "6 6 6 6", "7 7 7 0", "0 0 0 8", "8 8 8 8", "9 9 9 8", "1 5 2 6", "10 15 18 12", "11 11 11 13", "14 14 14 19", "12 19 1 0", "19 18 17 16", "13 15 4 5", "6 8 9 11", "13 15 17 19", "11 7 6 2" };
    assertEquals(15, sequencesync.getLength(transitions));
  }

  @Test
  public void case73() {
    String[] transitions = { "0 1 2 3", "1 2 3 4", "2 3 4 5", "3 4 5 6", "4 5 6 7", "5 6 7 8", "6 7 8 9", "7 8 9 0", "0 2 1 3", "1 3 2 4", "2 4 3 5", "3 5 4 6", "4 6 5 7", "5 7 6 8", "6 8 7 9", "7 9 8 0" };
    assertEquals(11, sequencesync.getLength(transitions));
  }

  @Test
  public void case74() {
    String[] transitions = { "1 1 1 0", "2 2 2 2", "3 3 3 3", "4 4 4 4", "5 5 5 5", "6 6 6 6", "7 7 7 7", "8 8 8 8", "9 9 9 9", "10 10 10 10", "11 11 11 11", "12 12 12 12", "13 13 13 13", "14 14 14 14", "15 15 15 15", "16 16 16 16", "17 17 17 18", "18 18 18 17", "19 19 19 19", "0 0 0 0" };
    assertEquals(35, sequencesync.getLength(transitions));
  }

  @Test
  public void case75() {
    String[] transitions = { "0 0 0 1", "1 1 2 1", "2 2 2 3", "4 3 3 3", "4 5 4 4", "5 5 5 6", "6 7 6 6", "7 7 7 8", "9 8 8 8", "9 10 9 9", "10 10 10 11", "11 11 11 12", "12 13 12 12", "13 13 14 13", "15 14 14 14", "15 15 16 15", "17 16 16 16", "17 18 17 17", "18 19 18 18", "19 19 19 19" };
    assertEquals(19, sequencesync.getLength(transitions));
  }

  @Test
  public void case76() {
    String[] transitions = { "1 1 1 0", "2 2 2 1", "3 3 3 2", "4 4 4 3", "5 5 5 5", "2 6 1 4", "1 7 3 0", "3 0 6 8", "6 8 2 1", "3 9 7 8", "4 1 3 9", "1 2 2 1", "3 2 3 2", "4 4 3 3", "5 5 5 4", "5 6 6 6", "7 6 7 0", "0 0 7 8", "1 3 4 8", "9 2 6 8" };
    assertEquals(10, sequencesync.getLength(transitions));
  }

  @Test
  public void case77() {
    String[] transitions = { "1 1 1 0", "2 2 2 1", "3 3 3 2", "4 4 4 3", "5 5 5 4", "6 6 6 5", "7 7 7 6", "8 8 8 7", "9 9 9 8", "10 10 10 9", "11 11 11 10", "12 12 12 11", "13 13 13 12", "14 14 14 13", "15 15 15 14", "16 16 16 15", "17 17 17 16", "18 18 18 17", "19 19 19 18", "0 0 0 0" };
    assertEquals(361, sequencesync.getLength(transitions));
  }

  @Test
  public void case78() {
    String[] transitions = { "0 0 0 0", "1 1 1 1", "2 2 2 2", "3 3 3 3", "4 4 4 4", "5 5 5 5", "6 6 6 6", "7 7 7 7", "8 8 8 9", "9 9 9 10", "10 10 10 11", "11 12 13 10", "12 12 12 12", "10 9 8 7", "14 14 14 14", "15 16 14 15", "17 18 12 15", "16 18 12 10", "18 18 18 18" };
    assertEquals(-1, sequencesync.getLength(transitions));
  }

  @Test
  public void case79() {
    String[] transitions = { "0 0 0 0" };
    assertEquals(0, sequencesync.getLength(transitions));
  }

  @Test
  public void case80() {
    String[] transitions = { "0 1 2 0", "1 3 5 7", "2 4 6 8", "1 3 5 7", "2 4 6 8", "1 3 5 7", "2 4 6 8", "1 3 5 7", "2 4 6 0", "2 4 6 8", "1 3 5 7" };
    assertEquals(4, sequencesync.getLength(transitions));
  }

}
